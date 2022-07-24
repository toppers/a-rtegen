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

package jp.ac.nagoya_u.is.nces.a_rte.validation;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.validation.internal.ValidationResourceLocator;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.QueryDelegate;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLQueryDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;

import com.google.common.io.Resources;

/**
 * RTEジェネレータの実行時に必要となるEMFモデル検証環境の初期設定を実施する。
 */
public class ModelValidationEnvironment { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)

	/**
	 * EMFモデル検証環境を初期化する。
	 */
	public static void initializeEnvironment() {
		initializeOclEnvironment();
		registerPackages();
	}
	
	private static void initializeOclEnvironment() {
		org.eclipse.ocl.ecore.OCL.initialize(null);

		String delegationUri = OCLConstants.OCL_DELEGATE_URI_SLASH + "Pivot";
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(delegationUri, new OCLInvocationDelegateFactory(delegationUri));
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(delegationUri, new OCLSettingDelegateFactory(delegationUri));
		EValidator.ValidationDelegate.Registry.INSTANCE.put(delegationUri, new OCLValidationDelegateFactory(delegationUri));
		QueryDelegate.Factory.Registry.INSTANCE.put(delegationUri, new OCLQueryDelegateFactory(delegationUri));
	}

	private static void registerPackages() {
		EObjectValidator validator = createValidator();
		EValidator.Registry.INSTANCE.put(M2Package.eINSTANCE, validator);
		EValidator.Registry.INSTANCE.put(EcucPackage.eINSTANCE, validator);
	}

	private static EObjectValidator createValidator() {
		return new EObjectValidator() {
			private final ValidationResourceLocator resourceLocator = new ValidationResourceLocator(Resources.getResource(ModelValidator.class, ModelValidator.EMF_VALIDATION_MESSAGES_PROPERTIES));

			@Override
			protected ResourceLocator getEcoreResourceLocator() {
				return this.resourceLocator;
			}
		};
	}
}
