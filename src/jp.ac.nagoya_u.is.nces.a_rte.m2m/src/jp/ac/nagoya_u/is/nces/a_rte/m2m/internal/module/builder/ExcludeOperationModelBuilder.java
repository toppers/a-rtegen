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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SYSTEM_CYCLE;

import com.google.common.base.Optional;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSystemCycle;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NoneExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UserDefinedExcludeOperation;

public class ExcludeOperationModelBuilder {

	private final ModuleModelBuildContext context;

	public ExcludeOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public ExcludeOperation createExcludeOperation(ExclusiveArea sourceExclusiveArea) {
		RteExclusiveAreaImplMechanismEnum sourceRteExclusiveAreaImplMechanismEnum;
		String osResourceId = "", osSpinlockId = "";

		if (sourceExclusiveArea.getSwcConfig().isEmpty() == false) {
			RteExclusiveAreaImplementation sourceRteExclusiveAreaImplementation = sourceExclusiveArea.getSwcConfig().get(0);
			sourceRteExclusiveAreaImplMechanismEnum = sourceRteExclusiveAreaImplementation.getRteExclusiveAreaImplMechanism();
			if (sourceRteExclusiveAreaImplementation.getRteExclusiveAreaOsResource() != null) {
				osResourceId = sourceRteExclusiveAreaImplementation.getRteExclusiveAreaOsResource().getShortName();
			}
			if (sourceRteExclusiveAreaImplementation.getRteExclusiveAreaOsSpinlock() != null) {
				osSpinlockId = sourceRteExclusiveAreaImplementation.getRteExclusiveAreaOsSpinlock().getShortName();
			}
		} else {
			RteBswExclusiveAreaImpl sourceRteBswExclusiveAreaImpl = sourceExclusiveArea.getBswConfig().get(0);
			sourceRteExclusiveAreaImplMechanismEnum = sourceExclusiveArea.getBswConfig().get(0).getRteExclusiveAreaImplMechanism();
			if (sourceRteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsResource() != null) {
				osResourceId = sourceRteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsResource().getShortName();
			}	
			if (sourceRteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsSpinlock() != null) {
				osSpinlockId = sourceRteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsSpinlock().getShortName();
			}
		}
		
		switch (sourceRteExclusiveAreaImplMechanismEnum) {
		case OS_INTERRUPT_BLOCKING: {
			return createOsInterruptBlockExcludeOperation();
		}
		case OS_RESOURCE: {
			return createOsResourceExcludeOperation(osResourceId);
		}
		case OS_SPINLOCK: {
			return createOsSpinlockExcludeOperation(osSpinlockId);
		}
		case ALL_INTERRUPT_BLOCKING: {
			return createAllInterruptBlockExcludeOperation();
		}
		case NONE: {
			return createNoneExcludeOperation();
		}
		case COOPERATIVE_RUNNABLE_PLACEMENT:
		default: { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			assert false;
			return null;
		}
		}
	}

	public ExcludeOperation createExcludeOperationForRteInternalLock(boolean isInterCoreLock) {
		if (isInterCoreLock) {
			return createOsSpinlockExcludeOperation(Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		} else {
			Optional<OsSystemCycle> sourceSystemCycle = this.context.query.tryFindSingleByKind(OS_SYSTEM_CYCLE);
			if (sourceSystemCycle.isPresent()) {
				return createUserDefinedExcludeOperation();
			} else {
				return createOsInterruptBlockExcludeOperation();
			}
		}
	}

	private AllInterruptBlockExcludeOperation createAllInterruptBlockExcludeOperation() {
		return ModuleFactory.eINSTANCE.createAllInterruptBlockExcludeOperation();
	}

	private OsInterruptBlockExcludeOperation createOsInterruptBlockExcludeOperation() {
		return ModuleFactory.eINSTANCE.createOsInterruptBlockExcludeOperation();
	}

	private OsResourceExcludeOperation createOsResourceExcludeOperation(String osResourceId) {
		OsResourceExcludeOperation destExcludeOperation = ModuleFactory.eINSTANCE.createOsResourceExcludeOperation();
		destExcludeOperation.setOsResourceId(osResourceId);
		return destExcludeOperation;
	}

	private OsSpinlockExcludeOperation createOsSpinlockExcludeOperation(String osSpinlockId) {
		OsSpinlockExcludeOperation destExcludeOperation = ModuleFactory.eINSTANCE.createOsSpinlockExcludeOperation();
		destExcludeOperation.setOsSpinlockId(osSpinlockId);
		return destExcludeOperation;
	}

	private UserDefinedExcludeOperation createUserDefinedExcludeOperation() {
		return ModuleFactory.eINSTANCE.createUserDefinedExcludeOperation();
	}

	private NoneExcludeOperation createNoneExcludeOperation() {
		return ModuleFactory.eINSTANCE.createNoneExcludeOperation();
	}
}
