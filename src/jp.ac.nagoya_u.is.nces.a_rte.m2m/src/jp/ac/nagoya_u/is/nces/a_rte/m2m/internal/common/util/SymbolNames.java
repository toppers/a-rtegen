/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2017 by Eiwa System Management, Inc., JAPAN
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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsActivateTaskApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;

import com.google.common.base.Optional;

/**
 * 生成するRTEソースコード中で使用する識別子を提供します．
 */
public class SymbolNames { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，staticメソッド群のクラスであるため問題ない)

	// シンボルの接頭辞
	private static final String TRUSTED_FUNCTION_NAME_PREFIX = "TRUSTED_";
	private static final String IOC_SYMBOL_NAME_PREFIX = "Ioc";

	private static final String RTE_SYMBOL_NAME_PREFIX = "Rte_";
	private static final String RTE_CONSTANT_NAME_PREFIX = "RTE_";
	private static final String RTE_GUARD_NAME_PREFIX = "RTE_"; // ガードマクロ名の接頭辞

	private static final String SCHM_SYMBOL_NAME_PREFIX = "SchM_";
	private static final String SCHM_CONSTANT_NAME_PREFIX = "SCHM_";

	// メモリマッピングのシンボル名
	public static final String RTE_MEMORY_MAPPING_PREFIX = "RTE";

	// マクロのシンボル名
	public static final String OS_TRUSTED_MACRO = "TOPPERS_TRUSTED";
	public static final String OS_NON_TRUSTED_MACRO = "TOPPERS_NON_TRUSTED";

	// 型のシンボル名
	public static final String VOID_TYPE_NAME = "void";
	public static final String BOOLEAN_TYPE_NAME = "boolean";
	public static final String UINT8_TYPE_NAME = "uint8";
	public static final String UINT16_TYPE_NAME = "uint16";
	public static final String UINT32_TYPE_NAME = "uint32";
	public static final String STD_RETURN_TYPE_NAME = "Std_ReturnType";
	public static final String OS_STATUS_TYPE_NAME = "StatusType";
	public static final String OS_APPLICATION_TYPE_NAME = "ApplicationType";
	public static final String OS_TASK_TYPE_NAME = "TaskType";
	public static final String OS_RESOURCE_TYPE_NAME = "ResourceType";
	public static final String OS_SPINLOCK_ID_TYPE_NAME = "SpinlockIdType";
	public static final String OS_EVENT_MASK_TYPE_NAME = "EventMaskType";
	public static final String OS_TRUSTED_FUNCTION_INDEX_TYPE_NAME = "TrustedFunctionIndexType";
	public static final String OS_TRUSTED_FUNCTION_PARAMETER_REF_TYPE_NAME = "TrustedFunctionParameterRefType";
	public static final String COM_SIGNAL_ID_TYPE_NAME = "Com_SignalIdType";
	public static final String RTE_NONQUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE_NAME = "Rte_NonqueuedSendTrustedFunctionParamType";
	public static final String RTE_QUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE_NAME = "Rte_QueuedSendTrustedFunctionParamType";
	public static final String COM_META_DATA_TYPE_MEMBER_OFFSET_TYPE_NAME = "Rte_BufferTypeOffset";
	public static final String COM_META_DATA_TYPE_NAME = "Rte_ComMetaComplexDataType";
	public static final String COM_SEND_SIGNAL_TF_PARAM_TYPE_NAME = "Rte_ComSendTrustedFunctionParamType";
	public static final String COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE_NAME = "Rte_ComSendGroupTrustedFunctionParamType";
	public static final String COM_PROXY_FUNCTION_TABLE_INDEX_TYPE_NAME = "Rte_SrWriteProxyFunctionTableIndex";

	// 定数のシンボル名
	public static final String RTE_E_OK_CONSTANT_NAME = "RTE_E_OK";
	public static final String RTE_E_INVALID_CONSTANT_NAME = "RTE_E_INVALID";
	public static final String RTE_E_MAX_AGE_EXCEEDED_CONSTANT_NAME = "RTE_E_MAX_AGE_EXCEEDED";
	public static final String RTE_E_TRANSMIT_ACK_CONSTANT_NAME = "RTE_E_TRANSMIT_ACK";
	public static final String COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT_NAME = "RTE_SR_WRITE_PROXY_FUNCTION_TABLE_SIZE";
	public static final String BOOLEAN_FALSE_NAME = "FALSE";

	// グローバル変数のシンボル名
	// 現在なし。

	// 関数のシンボル名
	private static final String CALL_BSW_FUNCTION_NAME_PREFIX = "Rte_Call_Bsw_";
	private static final String OS_TASK_MACRO_NAME = "TASK";
	public static final String OS_ACTIVATE_TASK_API_NAME = "Rte_Call_Bsw_ActivateTask";
	public static final String OS_SET_EVENT_API_NAME = "Rte_Call_Bsw_SetEvent";
	public static final String CALL_BSW_COM_SEND_SIGNAL_API_NAME = "Rte_Call_Bsw_Com_SendSignal";
	public static final String CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME = "Rte_Call_Bsw_Com_ReceiveSignal";
	public static final String COM_RECEIVE_SHADOW_SIGNAL_API_NAME = "Rte_Call_Bsw_Com_ReceiveShadowSignal";
	public static final String COM_UPDATE_SHADOW_SIGNAL_API_NAME = "Rte_Call_Bsw_Com_UpdateShadowSignal";
	public static final String CALL_BSW_COM_RECEIVE_SIGNAL_GROUP_API_NAME = "Rte_Call_Bsw_Com_ReceiveSignalGroup";
	public static final String CALL_BSW_COM_SEND_SIGNAL_GROUP_API_NAME = "Rte_Call_Bsw_Com_SendSignalGroup";
	public static final String COM_SEND_SIGNAL_PERIODIC_ENTITY_NAME = "Rte_ComSendSignalProxyPeriodic";
	public static final String COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME = "Rte_ComSendSignalProxyImmediate";
	public static final String COM_PROXY_FUNCTION_TABLE_NAME = "Rte_SrWriteProxy_FunctionTable";

	private static final String COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX = "Rte_ComReceiveSignalGroup";
	private static final String COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL = "Rte_ComReceiveSignalGroupWithReceiveShadowSignal";
	private static final String COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL = "Rte_ComReceiveSignalGroupWithoutReceiveShadowSignal";
	private static final String COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX = "Rte_ComSendSignalGroup";
	private static final String COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL = "Rte_ComSendSignalGroupWithUpdateShadowSignal";
	private static final String COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL = "Rte_ComSendSignalGroupWithoutUpdateShadowSignal";

	public static final String RTE_START_API_NAME = RTE_SYMBOL_NAME_PREFIX + "Start";
	public static final String RTE_STOP_API_NAME = RTE_SYMBOL_NAME_PREFIX + "Stop";
	public static final String SCHM_INIT_API_NAME = SCHM_SYMBOL_NAME_PREFIX + "Init";
	public static final String SCHM_DEINIT_API_NAME = SCHM_SYMBOL_NAME_PREFIX + "Deinit";

	// 引数のシンボル名
	public static final String OS_TRUSTED_FUNCTION_INDEX_PARAM_NAME = "tfn_idx";
	public static final String OS_TRUSTED_FUNCTION_PARAMS_PARAM_NAME = "tfn_prm";
	public static final String SR_DATA_PARAM_NAME = "data";
	public static final String SR_DATA_REFERENCE_PARAM_NAME = "p_data";
	public static final String COM_META_COMPLEX_DATA_PARAM_NAME = "p_meta";
	public static final String IRV_DATA_PARAM_NAME = "data";
	public static final String IRV_DATA_REFERENCE_PARAM_NAME = "p_data";

	// ローカル変数のシンボル名
	public static final String RETURN_VALUE_LOCAL_VAR_NAME = "ercd";
	public static final String TEMP_RETURN_VALUE_LOCAL_VAR_NAME = "tmp_ercd";
	public static final String TEMP_RETURN_VALUE_LOCAL_VAR_NAME_FOR_TRUSTED = "tmp_tf_ercd";
	public static final String SR_DATA_VAR_NAME = "data";
	public static final String SR_INVALID_VALUE_VAR_NAME = "inv_val";
	public static final String SR_FILTER_RESULT_VAR_NAME = "flt_res";
	public static final String RTE_NONQUEUED_TRUSTED_FUNCTION_PARAM_VAR_NAME = "tfn_nq_prm";
	public static final String RTE_QUEUED_TRUSTED_FUNCTION_PARAM_VAR_NAME = "tfn_q_prm";
	public static final String COM_TRUSTED_FUNCTION_PARAM_VAR_NAME = "tfn_c_prm";
	public static final String COM_GROUP_TRUSTED_FUNCTION_PARAM_VAR_NAME = "tfn_g_prm";
	public static final String COM_PROXY_SIGNAL_ID_VAR_NAME = "sig_id";
	public static final String COM_PROXY_DATA_VAR_NAME = "proxy_data";
	public static final String COM_PROXY_FUNCTION_TABLE_INDEX_VAR_NAME = "inx";
	public static final String MODE_VAR_NAME = "mode";
	public static final String ENTITY_EVENT_VAR_NAME = "evt";

	public static String createTaskBodyName(OsTask osTask) {
		return OS_TASK_MACRO_NAME + "(" + osTask.getShortName() + ")";
	}

	public static String createUpperLimitConstantName(Optional<String> literalPrefix, ApplicationDataType applicationDataType) {
		return literalPrefix.or("") + applicationDataType.getShortName() + "_UpperLimit";
	}

	public static String createLowerLimitConstantName(Optional<String> literalPrefix, ApplicationDataType applicationDataType) {
		return literalPrefix.or("") + applicationDataType.getShortName() + "_LowerLimit";
	}

	public static String createEnumConstantName(Optional<String> literalPrefix, String enumLiteral) {
		return literalPrefix.or("") + enumLiteral;
	}

	public static String createSrApiInitValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "InitValue" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createSrImplInitValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createCsApplicationErrorConstantName(ApplicationError applicationError) {
		return RTE_CONSTANT_NAME_PREFIX + "E_" + applicationError.getParent().getShortName() + "_" + applicationError.getShortName();
	}

	public static String createSrRteBufferVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "Buffer" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferValueVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferValue" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferInitValueVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferInitValue" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferStatusVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferStatus" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferInitValueConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "BUFFER_INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferQueueMaxLengthConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "BUFFER_QUEUE_MAX_LENGTH" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferQueueTypeName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferQueueType" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferQueuedVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferQueue" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrInvalidValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "INVALID_VALUE" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSrFilterOldValueVariableName(VariableDataInstanceInComposition dataInstanceComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "FilterOldValue" + Identifiers.getImplExtension(dataInstanceComposition.getPrototype());
	}

	public static String createSrFilterOccurrenceVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "FilterOccurrence" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrFilterOccurrenceInitValueConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_OCCURRENCE_INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createSrFilterMaskConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MASK" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSrFilterXConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_X" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSrFilterMinConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MIN" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSrFilterMaxConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MAX" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createSrFilterPeriodConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_PERIOD" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createSrFilterOffsetConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_OFFSET" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createCsPortArgValueConstantName(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) {
		PortPrototype port = sourcePortDefinedArgumentValue.getParent().getPort();
		return RTE_CONSTANT_NAME_PREFIX + "PORT_ARG_VALUE" + Identifiers.getImplExtension(port) + "_" + index;
	}

	public static String createWriteApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Write" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createWriteApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Write" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createInvalidateApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Invalidate" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createInvalidateApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Invalidate" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSendApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Send" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createSendApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Send" + Identifiers.getImplExtension(dataInstanceInSwc);
	}
	
	public static String createFeedbackApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Feedback" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createFeedbackApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Feedback" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createReadApiName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Read" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createReadApiImplName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Read" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createReceiveApiName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Receive" + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String createReceiveApiImplName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Receive" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createComMetaVariableName(ComSignalGroup comSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferComMetaComplexData" + "_" + comSignalGroup.getShortName();
	}

	public static String createComMetaComGroupSignalVariableName(ComSignalGroup comSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferTypeComSignal" + "_" + comSignalGroup.getShortName();
	}

	public static String createComMetaTypeMemberOffsetVariableName(ComSignalGroup comSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferTypeOffset" + "_" + comSignalGroup.getShortName();
	}

	public static String createComReceiveBufferVariableName(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferComValueComplexData" + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComReceiveSignalGroupWrapperFunctionAliasName(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX;
		}
		return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createComSendSignalGroupWrapperFunctionAliasName(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX;
		}
		return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_ALIAS_NAME_PREFIX + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createComReceiveSignalGroupWrapperFunctionName_withShadowSignal(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL;
		}
		return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createComReceiveSignalGroupWrapperFunctionName_withoutShadowSignal(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL;
		}
		return COM_RECEIVE_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createComSendSignalGroupWithUpdateShadowSignalName(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL;
		}
		return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITH_SHADOW_SIGNAL + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createComSendSignalGroupWithoutUpdateShadowSignalName(Optional<EcucPartition> sourcePartition) {
		if (!sourcePartition.isPresent()) {
			return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL;
		}
		return COM_SEND_SIGNAL_GROUP_WRAPPER_FUNCTION_NAME_PREFIX_WITHOUT_SHADOW_SIGNAL + Identifiers.getExtension(sourcePartition.get());
	}

	public static String createIocReceiveComProxyPeriodicApiName(VariableDataInstanceInSwc dataInstanceInSwc, EcucContainer comSignalOrComSignalGroup) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + IOC_SYMBOL_NAME_PREFIX + "Receive_Rte_ComProxyPeriodic" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createIocReceiveComProxyImmediateApiName(VariableDataInstanceInSwc dataInstanceInSwc, EcucContainer comSignalOrComSignalGroup) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + IOC_SYMBOL_NAME_PREFIX + "Receive_Rte_ComProxyImmediate" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createCallApiName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Call" + Identifiers.getApiExtension(operationInstanceInSwc);
	}

	public static String createCallApiImplName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Call" + Identifiers.getImplExtension(operationInstanceInSwc);
	}

	public static String createRteEnterApiName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Enter" + Identifiers.getApiExtension(sourceExclusiveArea);
	}

	public static String createRteEnterApiImplName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Enter" + Identifiers.getImplExtension(sourceExclusiveArea);
	}

	public static String createRteExitApiName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Exit" + Identifiers.getApiExtension(sourceExclusiveArea);
	}

	public static String createRteExitApiImplName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Exit" + Identifiers.getImplExtension(sourceExclusiveArea);
	}

	public static String createRteCoreStartApiImplName(Core core) {
		return RTE_SYMBOL_NAME_PREFIX + "Start_" + core.getCoreId();
	}

	public static String createRestartPartitionApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "RestartPartition" + Identifiers.getExtension(sourcePartition);
	}

	public static String createPartitionRestartingApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "PartitionRestarting" + Identifiers.getExtension(sourcePartition);
	}

	public static String createPartitionTerminatedApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "PartitionTerminated" + Identifiers.getExtension(sourcePartition);
	}

	public static String createComRxCallbackName(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbk_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComRxTOutCallback(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkRxTOut_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComInvCallbackName(ComSignal comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkInv_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComTAckCallback(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkTAck_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComTErrCallback(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkTErr_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComTxTOutCallback(EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkTxTOut_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createIocInitValueConstantName(OsIocCommunication osIocCommunication) {
		return RTE_CONSTANT_NAME_PREFIX + "IOC_INIT_VALUE_" + osIocCommunication.getShortName();
	}

	public static String createIocWriteApiName(OsIocSenderProperties osIocSenderProperties) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + "IocWrite_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocSendApiName(OsIocSenderProperties osIocSenderProperties) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + "IocSend_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocReadApiName(OsIocCommunication osIocCommunication) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + "IocRead_" + osIocCommunication.getShortName();
	}

	public static String createIocReceiveApiName(OsIocCommunication osIocCommunication) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + "IocReceive_" + osIocCommunication.getShortName();
	}

	public static String createIocEmptyQueueApiName(OsIocCommunication osIocCommunication) {
		return CALL_BSW_FUNCTION_NAME_PREFIX + "IocEmptyQueue_" + osIocCommunication.getShortName();
	}

	private static String getSenderIdSuffix(OsIocSenderProperties osIocSenderProperties) {
		return osIocSenderProperties.getOsIocSenderId() == null ? "" : "_" + String.valueOf(osIocSenderProperties.getOsIocSenderId());
	}

	public static String createCsPortArgValueParamName(PortDefinedArgumentValue portDefinedArgumentValue, int index) {
		return "port_arg_val_" + index;
	}

	public static String createBswSchedulableEntityName(BswModuleDescription sourceBswModuleDescription, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity sourceBswModuleEntity) {
		if(sourceBswModuleEntity.getImplementedEntry().getShortName().startsWith(Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription))){
			return sourceBswModuleEntity.getImplementedEntry().getShortName();
		}
		return Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription) + "_" + sourceBswModuleEntity.getImplementedEntry().getShortName();
	}

	public static String createEntityCycleCounterName(OsTask osTask, Optional<OsEvent> osEvent) {
		return RTE_SYMBOL_NAME_PREFIX + "EntityCycleCounter" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityStartOffsetCounterName(OsTask osTask, Optional<OsEvent> osEvent) {
		return RTE_SYMBOL_NAME_PREFIX + "EntityStartOffsetCounter" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityMaxCycleConstantName(OsTask osTask, Optional<OsEvent> osEvent) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_MAX_CYCLE" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityMaxStartOffsetConstantName(OsTask osTask, Optional<OsEvent> osEvent) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_MAX_START_OFFSET" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityCyclePeriodConstantName(OsTask osTask, Optional<OsEvent> osEvent, ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_CYCLE_PERIOD" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createEntityCycleOffsetConstantName(OsTask osTask, Optional<OsEvent> osEvent, ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_CYCLE_OFFSET" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createEntityStartOffsetConstantName(OsTask osTask, Optional<OsEvent> osEvent, ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_START_OFFSET" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createSrRteBufferWriteTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createSrRteBufferWriteTrustedFunctionName(pDataInstanceInComposition, rDataInstanceInComposition);
	}

	public static String createSrRteBufferSendTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createSrRteBufferSendTrustedFunctionName(pDataInstanceInComposition, rDataInstanceInComposition);
	}

	public static String createSrRteBufferInvalidateTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createSrRteBufferInvalidateTrustedFunctionName(pDataInstanceInComposition, rDataInstanceInComposition);
	}

	public static String createVariableMemorySectionName(SwAddrMethod swAddrMethod, Optional<String> alignment) {
		switch (swAddrMethod.getMemoryAllocationKeywordPolicy()) {
		case ADDR_METHOD_SHORT_NAME_AND_ALIGNMENT:
			return swAddrMethod.getShortName() + "_" + alignment.or(Identifiers.ALIGNMENT_TYPE_UNSPECIFIED);
		case ADDR_METHOD_SHORT_NAME:
		default:
			return swAddrMethod.getShortName();
		}
	}

	public static String createVariableMemorySectionName(Optional<EcucPartition> sourcePartition) {
		return sourcePartition.isPresent() ? Identifiers.SECTION_TYPE_VAR + "_" + sourcePartition.get().getShortName() + "_" + ConfigValues.DEFAULT_SECTION_INITIALIZATION_POLICY
				: Identifiers.SECTION_TYPE_VAR + "_" + ConfigValues.DEFAULT_SECTION_INITIALIZATION_POLICY;
	}
	
	public static String createTAckStatusVariableName(VariableDataInstanceInSwc variableDataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "TAckStatus" + Identifiers.getImplExtension(variableDataInstanceInSwc);
	}
	
	public static String createActivationFlagName(OsActivateTaskApi activatteTaskApi) {
		return "actflg_" + activatteTaskApi.getOsTaskId();
	}
	
	public static String createActivationFlagName(OsSetEventApi setEventApi) {
		return "actflg_" + setEventApi.getOsTaskId() + "_" + setEventApi.getOsEventId();
	}

	public static String createFunctionMemorySectionName(Optional<EcucPartition> sourcePartition) {
		return sourcePartition.isPresent() ? Identifiers.SECTION_TYPE_CODE + "_" + sourcePartition.get().getShortName() : Identifiers.SECTION_TYPE_CODE;
	}

	public static String createFunctionMemorySectionName(SwAddrMethod swAddrMethod) {
		return swAddrMethod.getShortName();
	}

	public static String createSwcFunctionMemorySectionName() {
		return Identifiers.SECTION_TYPE_CODE;
	}

	public static String createSchmEnterApiName(ExclusiveArea sourceExclusiveArea, BswModuleDescription sourceBswModuleDescription) {
		return SCHM_SYMBOL_NAME_PREFIX + "Enter_" + Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription) + Identifiers.getApiExtension(sourceExclusiveArea);
	}

	public static String createSchmExitApiName(ExclusiveArea sourceExclusiveArea, BswModuleDescription sourceBswModuleDescription) {
		return SCHM_SYMBOL_NAME_PREFIX + "Exit_" + Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription) + Identifiers.getApiExtension(sourceExclusiveArea);
	}

	public static String createSchmSwitchApiName(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype, BswModuleDescription sourceBswModuleDescription) {
		return SCHM_SYMBOL_NAME_PREFIX + "Switch_" + Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createSchmModeApiName(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype, BswModuleDescription sourceBswModuleDescription) {
		return SCHM_SYMBOL_NAME_PREFIX + "Mode_" + Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createSchmCoreStartApiImplName(Core core) {
		return SCHM_SYMBOL_NAME_PREFIX + "Init_" + core.getCoreId();
	}

	public static String createModeMaxLengthConstantName(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		return SCHM_CONSTANT_NAME_PREFIX + "MODE_QUEUE_MAX_LENGTH" + "_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createModeQueueTypeName(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		return RTE_SYMBOL_NAME_PREFIX + "ModeQueueType_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createSchmModeQueueVariableName(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		return SCHM_SYMBOL_NAME_PREFIX + "Mode_request_queue_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createSchmCurrentModeName(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		return SCHM_SYMBOL_NAME_PREFIX + "CurrentMode_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createSchmNextModeName(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		return SCHM_SYMBOL_NAME_PREFIX + "NextMode_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroupPrototype.getShortName();
	}

	public static String createModeTypeName(ModeDeclarationGroup modeDeclarationGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "ModeType_" + modeDeclarationGroup.getShortName();
	}

	public static String createModeTypeGuardName(ModeDeclarationGroup sourceModeDeclarationGroup) {
		return RTE_GUARD_NAME_PREFIX + "MODETYPE_" + sourceModeDeclarationGroup.getShortName();
	}

	public static String createExternalModeConstantName(ModeDeclarationGroup group, ModeDeclaration modeDeclaration) {
		return RTE_CONSTANT_NAME_PREFIX + "MODE_" + group.getShortName() + "_" + modeDeclaration.getShortName();
	}

	public static String createModeConstantName(BswModuleDescription bswModuleDescription, ModeDeclarationGroup group, ModeDeclaration modeDeclaration) {
		return RTE_CONSTANT_NAME_PREFIX + "MODE_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + group.getShortName() + "_" + modeDeclaration.getShortName();
	}

	public static String createModeConstantName(BswModuleDescription sourceBswModuleDescription, ModeInBswModuleDescriptionInstanceRef iref) {
		return createModeConstantName(sourceBswModuleDescription, iref.getContextModeDeclarationGroup().getType(), iref.getTargetMode());
	}

	public static String createModeInitModeConstantName(BswModuleDescription bswModuleDescription, ModeDeclarationGroup modeDeclarationGroup) {
		return RTE_CONSTANT_NAME_PREFIX + "INITMODE_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroup.getShortName();
	}

	public static String createExternalModeTransitionConstantName(ModeDeclarationGroup modeDeclarationGroup) {
		return RTE_CONSTANT_NAME_PREFIX + "TRANSITION_" + modeDeclarationGroup.getShortName();
	}

	public static String createModeTransitionConstantName(BswModuleDescription bswModuleDescription, ModeDeclarationGroup modeDeclarationGroup) {
		return RTE_CONSTANT_NAME_PREFIX + "TRANSITION_" + Identifiers.getBswSchedulerNamePrefix(bswModuleDescription) + "_" + modeDeclarationGroup.getShortName();
	}

	public static String createCsTfArgcConstantName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "CALL_ARGC" + Identifiers.getImplExtension(operationInstanceInSwc);
	}

	public static String createCsTfOpidConstantName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "CALL_OPID" + Identifiers.getImplExtension(operationInstanceInSwc);
	}

	public static String createCsTrustedFunctionParamTypeName(AtomicSwComponentType sourceSwComponentType) {
		return RTE_SYMBOL_NAME_PREFIX + "Cs" + sourceSwComponentType.getShortName() + "ArgsTrustedFunctionParamType";
	}

	public static String createCsCallTfName(AtomicSwComponentType swComponentType) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createCsCallTfName(swComponentType);
	}

	public static String createRteIrvBufferInitValueConstantName(AtomicSwComponentType swComponentType, VariableDataPrototype variable) {
		return RTE_CONSTANT_NAME_PREFIX + "IRV_BUFFER_INIT_VALUE_" + swComponentType.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvBufferVariableName(AtomicSwComponentType swComponentType, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvBuffer_" + swComponentType.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvBufferValueVariableName(AtomicSwComponentType swComponentType, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvBufferValue_" + swComponentType.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvBufferInitValueVariableName(AtomicSwComponentType swComponentType, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvBufferInitValue_" + swComponentType.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvWriteApiName(RunnableEntity re, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvWrite_" + re.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvWriteApiImplName(AtomicSwComponentType swComponentType, RunnableEntity re, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvWrite_" + swComponentType.getShortName() + "_" + re.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvReadApiName(RunnableEntity re, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvRead_" + re.getShortName() + "_" + variable.getShortName();
	}

	public static String createRteIrvReadApiImplName(AtomicSwComponentType swComponentType, RunnableEntity re, VariableDataPrototype variable) {
		return RTE_SYMBOL_NAME_PREFIX + "IrvRead_" + swComponentType.getShortName() + "_" + re.getShortName() + "_" + variable.getShortName();
	}

	public static String createIocWriteApiMappingName(OsIocSenderProperties osIocSenderProperties) {
		return IOC_SYMBOL_NAME_PREFIX + "Write_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocSendApiMappingName(OsIocSenderProperties osIocSenderProperties) {
		return IOC_SYMBOL_NAME_PREFIX + "Send_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocReadApiMappingName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "Read_" + osIocCommunication.getShortName();
	}

	public static String createIocReceiveApiMappingName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "Receive_" + osIocCommunication.getShortName();
	}

	public static String createIocEmptyQueueApiMappingName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "EmptyQueue_" + osIocCommunication.getShortName();
	}

	public static String createComSignalSymbolicName(Optional<? extends EcucContainer> comSignalOrComSignalGroup) {
		if (!comSignalOrComSignalGroup.isPresent()) {
			// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return "ComConf_ComSignal";
		}
		return "ComConf_ComSignal_" + comSignalOrComSignalGroup.get().getShortName();
	}

	public static String createComSignalGroupSymbolicName(ComSignalGroup comSignalGroup) {
		return "ComConf_ComSignalGroup_" + comSignalGroup.getShortName();
	}

	public static String createComGroupSignalSymbolicName(ComGroupSignal comGroupSignal) {
		// NOTE A-COMSTACKではComSignalとComGroupSignalを同じシグナルの命名規則で生成しているための対応
		return "ComConf_ComSignal_" + comGroupSignal.getShortName();
	}

	public static String createComSendSignalTrustedFunctionName(EcucReferrable comSignalOrComSignalGroup) {
		// NOTE 本来は信頼関数名からシンボル名を生成する設計だが、以前の実装との互換性を保つため、信頼関数名と異なるシンボル名を使用する。
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.RTE_ID_PREFIX + "ComSendSignal" + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComSendSignalGroupTrustedFunctionName(EcucReferrable comSignalOrComSignalGroup) {
		// NOTE 本来は信頼関数名からシンボル名を生成する設計だが、以前の実装との互換性を保つため、信頼関数名と異なるシンボル名を使用する。
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.RTE_ID_PREFIX + "ComSendSignalGroup" + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComProxyFunctionName(PVariableDataInstanceInSwc dataInstanceInSwc, EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "SrWriteProxy" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createPeriodicComProxyBufferVariableName(PVariableDataInstanceInSwc dataInstanceInSwc, EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferComProxyPeriodic" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createImmediateComProxyBufferVariableName(PVariableDataInstanceInSwc dataInstanceInSwc, EcucContainer comSignalOrComSignalGroup) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferComProxyImmediate" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createComProxyFunctionTableVariableName() {
		return "(*" + COM_PROXY_FUNCTION_TABLE_NAME + "[" + COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT_NAME + "])()";
	}

	public static String createComProxyFunctionTableIndexConstantName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable comSignalOrComSignalGroup) {
		return RTE_CONSTANT_NAME_PREFIX + "SR_WRITE_PROXY_FUNCTION_TABLE_INDEX" + Identifiers.getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createGlobalSetName(ComSignalGroup comSignalGroup) {
		return "Global_Variable_Set" + comSignalGroup.getShortName();
	}
}
