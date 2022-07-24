/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.validation.internal;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.regex.Pattern;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.stringtemplate.v4.ST;

import com.google.common.io.Resources;

public class OclModelValidator implements IModelValidator {
	private static final Charset DEFAULT_ENCODING = Charset.forName("UTF-8");

	private static final Pattern IMPORT_STATEMENT_PATTERN = Pattern.compile("^\\s*import\\s*.+$", Pattern.MULTILINE);

	private final OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
	private final Properties messageProperties;

	public OclModelValidator(Iterable<URL> ruleFiles, Iterable<URL> messageFiles) throws ModelException {
		// 検証ルールの読み込み
		this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

		try {
			for (URL ruleFile : ruleFiles) {
				String oclText = filterImportStatements(Resources.toString(ruleFile, DEFAULT_ENCODING));
				OCLInput oclInput = new OCLInput(oclText);
				this.ocl.parse(oclInput);
			}
		} catch (ParserException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		} catch (IOException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		}

		// 検証エラーメッセージの読み込み
		this.messageProperties = new Properties();
		try {
			for (URL messageFile : messageFiles) {
				this.messageProperties.load(Resources.newInputStreamSupplier(messageFile).getInput());
			}
		} catch (IOException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		}
	}

	private String filterImportStatements(String input) {
		return IMPORT_STATEMENT_PATTERN.matcher(input).replaceAll("");
	}

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.internal.IModelValidator#validate(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.common.util.DiagnosticChain)
	 */
	@Override
	public boolean validate(Resource eResource, DiagnosticChain diagnostics) {
		boolean isValid = true;
		ModelQuery query = new ModelQuery(eResource);
		for (Constraint constraint : this.ocl.getConstraints()) {
			if (!isInvariant(constraint)) {
				continue;
			}

			for (EObject eObject : query.findByKind((EClass) constraint.getSpecification().getContextVariable().getType())) {
				if (!this.ocl.check(eObject, constraint)) {
					isValid = false;
					diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, null, -1, createErrorMessage(eObject, constraint), new Object[0]));
				}
			}
		}
		return isValid;
	}

	private static boolean isInvariant(Constraint constraint) {
		return UMLReflection.INVARIANT.equals(constraint.getStereotype());
	}

	private String createErrorMessage(EObject eContextObject, Constraint constraint) {
		String message = this.messageProperties.getProperty(constraint.getName(), constraint.getName());

		ST template = new ST(message);
		template.add("self", eContextObject);
		template.add("selfId", ModelLabels.getLabel(eContextObject));
		template.add("selfType", eContextObject.eClass());
		return "[" + constraint.getName() + "] " + template.render();
	}
}
