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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;

public class IrvOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private final ModuleRules moduleRules;
	private final ExcludeOperationModelBuilder excludeOperationBuilder;

	public IrvOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.moduleRules = new ModuleRules(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public IrvReadOperation createIrvReadOperation(IrvReadApi targetApi, VariableDataPrototype sourceDataPrototype, Parameter dataParam) throws ModelException {
		RteBufferVariableSet irvBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceDataPrototype);

		IrvReadOperation destOperation = ModuleFactory.eINSTANCE.createIrvReadOperation();
		destOperation.setAccessVariable(irvBuffer);
		if (dataParam != null) {
			destOperation.setReadValueVariable(dataParam);
			if (this.moduleRules.needsExclusionForIrvOperation(dataParam.getType())) {
				destOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(false));
			}
		}
		if (targetApi.getIsInline()) {
			addInlineGlovalVariable(targetApi, irvBuffer.getValueVariable());
		}
		return destOperation;
	}

	public IrvWriteOperation createIrvWriteOperation(IrvWriteApi targetApi, VariableDataPrototype sourceDataPrototype, Parameter dataParam) throws ModelException {
		RteBufferVariableSet irvBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceDataPrototype);

		IrvWriteOperation destOperation = ModuleFactory.eINSTANCE.createIrvWriteOperation();
		destOperation.setAccessVariable(irvBuffer);
		destOperation.setWriteValueVariable(dataParam);
		if (this.moduleRules.needsExclusionForIrvOperation(dataParam.getType())) {
			destOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(false));
		}
		if (targetApi.getIsInline()) {
			addInlineGlovalVariable(targetApi, irvBuffer.getValueVariable());
		}
		return destOperation;
	}

	private void addInlineGlovalVariable(RteApi targetApi, GlobalVariable glovalVariable) {
		if (!targetApi.getInlineGlobalVariable().contains(glovalVariable)) { // COVERAGE (コードレビューで問題ないことを確認)
			targetApi.getInlineGlobalVariable().add(glovalVariable);
		}
	}
}
