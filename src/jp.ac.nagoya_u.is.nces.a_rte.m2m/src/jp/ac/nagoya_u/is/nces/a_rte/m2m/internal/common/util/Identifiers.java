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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util;

import com.google.common.base.Optional;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;

/**
 * AUTOSARコンフィグレーションの識別子を提供．
 * NOTE C言語のシンボル名とは異なることに注意。
 */
public class Identifiers { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)

	// RTEで予約されている識別子のための接頭辞
	public static final String RTE_ID_PREFIX = "Rte_";

	// ソフトウェアアドレッシング方式の種別／初期化ポリシー／アラインメントの定数名
	public static final String SECTION_TYPE_VAR = "VAR";
	public static final String SECTION_TYPE_CODE = "CODE";
	public static final String SECTION_INITIALIZATION_POLICY_INIT = "INIT";
	public static final String ALIGNMENT_TYPE_UNSPECIFIED = "UNSPECIFIED";

	// RTE実装用の組込AUTOSARリファレンス
	private static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE = M2ModelUtils.ID_PREFIX + "/Rte_InternalDataTypes/";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT8 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint8";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT16 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint16";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT32 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint32";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_COM_SIGNAL_ID_TYPE = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "Com_SignalIdType";

	// デフォルトのショートネーム
	public static final String DEFAULT_OS_IOC_NAME = "osIoc";
	public static final String DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX = "osIocSenderProperties";
	public static final String DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME = "osIocReceiverProperties";
	public static final String DEFAULT_OS_IOC_DATA_PROPERTIES_NAME = "osIocDataProperties";
	public static final String DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME = DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX;

	public static final String COM_PROXY_SIGNAL_ID_DATA_NAME = "comSignalId";
	public static final String COM_PROXY_DATA_DATA_NAME = "comData";
	public static final String COM_PROXY_FUNCTION_INDEX_NAME = "funcIndex";

	public static final String COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME = RTE_ID_PREFIX + "ComSendSignalProxyImmediateTask";
	public static final String COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME = RTE_ID_PREFIX + "ComSendSignalProxyImmediateEvent";

	public static final String RTE_INTERNAL_SPINLOCK_NAME = RTE_ID_PREFIX + "InternalSpinlock";

	public static String createSrInterPartitionOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_ID_PREFIX + "Sr" + getImplExtension(dataInstanceInSwc);
	}

	public static String createPeriodicComProxyRequestOsIocCommunicationName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyPeriodic_" + proxyInteraction.getRequesterPartition().getShortName();
	}

	public static String createImmediateComProxyRequestOsIocCommunicationName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyImmediate_" + proxyInteraction.getRequesterPartition().getShortName();
	}

	public static String createPeriodicComProxyValueOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComProxyPeriodic" + getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createImmediateComProxyValueOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComProxyImmediate" + getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createOsIocSenderPropertiesName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createOsIocSenderPropertiesName(ComSignal comSignal) {
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった関係上,当メソッドは使用されない.
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + "_" + comSignal.getShortName();
	}

	public static String createOsIocSenderPropertiesName(ComSignalGroup comSignalGroup) {
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった関係上,当メソッドは使用されない.
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + "_" + comSignalGroup.getShortName();
	}

	public static String createSrRteBufferWriteTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrWriteTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferSendTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrSendTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}
	
	public static String createSrRteBufferInvalidateTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrInvalidateTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String createComSendSignalTrustedFunctionName(EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComSendSignalTf" + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComSendSignalGroupTrustedFunctionName(EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComSendSignalGroupTf" + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createCsCallTfName(AtomicSwComponentType sourceSwComponentType) {
		return RTE_ID_PREFIX + "CsCallTf_" + sourceSwComponentType.getShortName();
	}

	public static String getApiExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getShortName() + "_" + dataInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String getApiExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getShortName() + "_" + operationInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getApiExtension(operationInstanceInSwc);
	}

	public static String getApiExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getShortName();
	}

	public static String getImplExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getParent().getParent().getShortName() + getApiExtension(exclusiveArea);
	}

	public static String getImplExtension(OsTask osTask, Optional<OsEvent> osEvent) {
		return "_" + osTask.getShortName() + getOsEventPostfix(osEvent);
	}

	public static String getImplExtension(OsTask osTask, Optional<OsEvent> osEvent, ExecutableEntity executableEntity) {
		String implExtension = "";
		if (executableEntity instanceof RunnableEntity) {
			// NOTE シンボル名の重複を避けるため，ランナブルのショートネームではなく，シンボル名を使用する．
			implExtension = getImplExtension(osTask, osEvent) + "_" + ((RunnableEntity) executableEntity).getSymbol();
		} else if (executableEntity instanceof BswSchedulableEntity) { // COVERAGE 常にtrue(RunnableEntity, BswSchedulableEntityのみ対象)
			// NOTE ModuleEntryのショートネームを使用する．
			BswSchedulableEntity bswSchedulableEntity = (BswSchedulableEntity) executableEntity;
			implExtension = getImplExtension(osTask, osEvent)
							+ "_" + bswSchedulableEntity.getParent().getParent().getShortName()
							+ "_" + bswSchedulableEntity.getImplementedEntry().getShortName();
		}
		return implExtension;
	}

	private static String getOsEventPostfix(Optional<OsEvent> osEvent) {
		return !osEvent.isPresent() ? "" : "_" + osEvent.get().getShortName();
	}

	public static String getExtension(EcucPartition sourcePartition) {
		return "_" + sourcePartition.getShortName();
	}

	public static String getImplExtension(PortPrototype port) {
		return "_" + port.getParent().getShortName() + "_" + port.getShortName();
	}

	public static String getBswSchedulerNamePrefix(BswModuleDescription sourceBswModuleDescription) {
		// 現実装は単純にBswModuleDescriptionのショートネームを<bsnp>とする.
		// BswSchedulerNamePrefixクラスを使用した<bsnp>生成に対応する場合は、本関数を修正すること.
		return sourceBswModuleDescription.getShortName();
	}
}
