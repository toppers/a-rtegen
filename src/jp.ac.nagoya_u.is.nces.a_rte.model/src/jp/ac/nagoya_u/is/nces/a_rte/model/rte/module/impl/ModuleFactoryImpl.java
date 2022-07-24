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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleFactoryImpl extends EFactoryImpl implements ModuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleFactory init() {
		try {
			ModuleFactory theModuleFactory = (ModuleFactory)EPackage.Registry.INSTANCE.getEFactory(ModulePackage.eNS_URI);
			if (theModuleFactory != null) {
				return theModuleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY: return (EObject)createBswSchedulableEntity();
			case ModulePackage.RUNNABLE_ENTITY: return (EObject)createRunnableEntity();
			case ModulePackage.WRITE_API: return (EObject)createWriteApi();
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION: return (EObject)createRteBufferNonqueuedSendOperation();
			case ModulePackage.RTE_BUFFER_NONQUEUED_READ_OPERATION: return (EObject)createRteBufferNonqueuedReadOperation();
			case ModulePackage.READ_API: return (EObject)createReadApi();
			case ModulePackage.IRV_READ_OPERATION: return (EObject)createIrvReadOperation();
			case ModulePackage.IRV_READ_API: return (EObject)createIrvReadApi();
			case ModulePackage.IRV_WRITE_OPERATION: return (EObject)createIrvWriteOperation();
			case ModulePackage.IRV_WRITE_API: return (EObject)createIrvWriteApi();
			case ModulePackage.RTE_BUFFER_VARIABLE_SET: return (EObject)createRteBufferVariableSet();
			case ModulePackage.GLOBAL_VARIABLE_SET: return (EObject)createGlobalVariableSet();
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_VARIABLE: return (EObject)createComProxyFunctionTableVariable();
			case ModulePackage.RTE_SOURCE: return (EObject)createRteSource();
			case ModulePackage.RTE_MODULE: return (EObject)createRteModule();
			case ModulePackage.GLOBAL_VARIABLE: return (EObject)createGlobalVariable();
			case ModulePackage.PARAMETER: return (EObject)createParameter();
			case ModulePackage.LOCAL_VARIABLE: return (EObject)createLocalVariable();
			case ModulePackage.RTE_APPLICATION_HEADER: return (EObject)createRteApplicationHeader();
			case ModulePackage.RTE: return (EObject)createRte();
			case ModulePackage.CORE: return (EObject)createCore();
			case ModulePackage.PARTITION: return (EObject)createPartition();
			case ModulePackage.SWC: return (EObject)createSwc();
			case ModulePackage.RTE_HEADER: return (EObject)createRteHeader();
			case ModulePackage.RTE_BSW_API_HEADER: return (EObject)createRteBswApiHeader();
			case ModulePackage.RTE_LIFECYCLE_HEADER: return (EObject)createRteLifecycleHeader();
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER: return (EObject)createRteApplicationTypeHeader();
			case ModulePackage.RTE_VFB_TRACE_HEADER: return (EObject)createRteVfbTraceHeader();
			case ModulePackage.RTE_CONFIGURATION_HEADER: return (EObject)createRteConfigurationHeader();
			case ModulePackage.RTE_CALLBACK_HEADER: return (EObject)createRteCallbackHeader();
			case ModulePackage.RTE_TYPE_HEADER: return (EObject)createRteTypeHeader();
			case ModulePackage.INVALIDATE_API: return (EObject)createInvalidateApi();
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION: return (EObject)createIocNonqueuedSendOperation();
			case ModulePackage.DIRECT_COM_SEND_OPERATION: return (EObject)createDirectComSendOperation();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION: return (EObject)createTrustedFunctionRteOperation();
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION: return (EObject)createTrustedFunctionRteBufferWriteSendOperation();
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION: return (EObject)createTrustedFunctionRteBufferSendSendOperation();
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION: return (EObject)createTrustedFunctionRteBufferInvalidateSendOperation();
			case ModulePackage.RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION: return (EObject)createRteBufferInvalidateTrustedFunction();
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION: return (EObject)createTrustedFunctionComSendOperation();
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION: return (EObject)createImmediateProxyComSendOperation();
			case ModulePackage.PERIODIC_PROXY_COM_SEND_OPERATION: return (EObject)createPeriodicProxyComSendOperation();
			case ModulePackage.IOC_NONQUEUED_READ_OPERATION: return (EObject)createIocNonqueuedReadOperation();
			case ModulePackage.COM_READ_OPERATION: return (EObject)createComReadOperation();
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION: return (EObject)createIocNonqueuedCommunication();
			case ModulePackage.IOC_WRITE_API: return (EObject)createIocWriteApi();
			case ModulePackage.IOC_READ_API: return (EObject)createIocReadApi();
			case ModulePackage.COM_SEND_SIGNAL_API: return (EObject)createComSendSignalApi();
			case ModulePackage.COM_RECEIVE_SIGNAL_API: return (EObject)createComReceiveSignalApi();
			case ModulePackage.COM_RX_CALLBACK: return (EObject)createComRxCallback();
			case ModulePackage.COM_RX_TOUT_CALLBACK: return (EObject)createComRxTOutCallback();
			case ModulePackage.COM_INV_CALLBACK: return (EObject)createComInvCallback();
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY: return (EObject)createComSendSignalProxyEntity();
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_ENTITY: return (EObject)createComSendSignalImmediateEntity();
			case ModulePackage.COM_SEND_SIGNAL_PERIODIC_ENTITY: return (EObject)createComSendSignalPeriodicEntity();
			case ModulePackage.TACK_NOTIFY_OPERATION: return (EObject)createTAckNotifyOperation();
			case ModulePackage.COM_TX_TOUT_CALLBACK: return (EObject)createComTxTOutCallback();
			case ModulePackage.COM_TACK_CALLBACK: return (EObject)createComTAckCallback();
			case ModulePackage.COM_TERR_CALLBACK: return (EObject)createComTErrCallback();
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION: return (EObject)createMaskedNewDiffersMaskedOldFilterOperation();
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION: return (EObject)createMaskedNewDiffersXFilterOperation();
			case ModulePackage.NEW_IS_WITHIN_FILTER_OPERATION: return (EObject)createNewIsWithinFilterOperation();
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION: return (EObject)createNewIsOutsideFilterOperation();
			case ModulePackage.MASKED_NEW_EQUALS_XFILTER_OPERATION: return (EObject)createMaskedNewEqualsXFilterOperation();
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION: return (EObject)createOneEveryNFilterOperation();
			case ModulePackage.RTE_CORE_START_API_IMPL: return (EObject)createRteCoreStartApiImpl();
			case ModulePackage.RTE_STOP_API: return (EObject)createRteStopApi();
			case ModulePackage.RESTART_PARTITION_API: return (EObject)createRestartPartitionApi();
			case ModulePackage.PARTITION_RESTARTING_API: return (EObject)createPartitionRestartingApi();
			case ModulePackage.PARTITION_TERMINATED_API: return (EObject)createPartitionTerminatedApi();
			case ModulePackage.SEND_API: return (EObject)createSendApi();
			case ModulePackage.RECEIVE_API: return (EObject)createReceiveApi();
			case ModulePackage.RTE_BUFFER_QUEUED_SEND_OPERATION: return (EObject)createRteBufferQueuedSendOperation();
			case ModulePackage.RTE_BUFFER_QUEUED_VARIABLE: return (EObject)createRteBufferQueuedVariable();
			case ModulePackage.RTE_BUFFER_QUEUED_READ_OPERATION: return (EObject)createRteBufferQueuedReadOperation();
			case ModulePackage.IOC_QUEUED_COMMUNICATION: return (EObject)createIocQueuedCommunication();
			case ModulePackage.IOC_RECEIVE_API: return (EObject)createIocReceiveApi();
			case ModulePackage.IOC_SEND_API: return (EObject)createIocSendApi();
			case ModulePackage.IOC_SEND_OPERATION: return (EObject)createIocSendOperation();
			case ModulePackage.IOC_QUEUED_SEND_OPERATION: return (EObject)createIocQueuedSendOperation();
			case ModulePackage.IOC_QUEUED_READ_OPERATION: return (EObject)createIocQueuedReadOperation();
			case ModulePackage.CALL_API: return (EObject)createCallApi();
			case ModulePackage.TF_CALL_API: return (EObject)createTfCallApi();
			case ModulePackage.DISABLED_IN_MODE: return (EObject)createDisabledInMode();
			case ModulePackage.ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION: return (EObject)createAllInterruptBlockExcludeOperation();
			case ModulePackage.OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION: return (EObject)createOsInterruptBlockExcludeOperation();
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION: return (EObject)createOsSpinlockExcludeOperation();
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION: return (EObject)createOsResourceExcludeOperation();
			case ModulePackage.NONE_EXCLUDE_OPERATION: return (EObject)createNoneExcludeOperation();
			case ModulePackage.CONSTANT: return (EObject)createConstant();
			case ModulePackage.CONSTANT_MEMBER: return (EObject)createConstantMember();
			case ModulePackage.RTE_ENTER_API: return (EObject)createRteEnterApi();
			case ModulePackage.RTE_EXIT_API: return (EObject)createRteExitApi();
			case ModulePackage.OS_BACKGROUND_TASK_ACTIVATION_EXECUTABLE_TASK_BODY: return (EObject)createOsBackgroundTaskActivationExecutableTaskBody();
			case ModulePackage.OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY: return (EObject)createOsTaskActivationExecutableTaskBody();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY: return (EObject)createOsEventSetExecutableTaskBody();
			case ModulePackage.OS_TASK_ACTIVATION_OPERATION: return (EObject)createOsTaskActivationOperation();
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION: return (EObject)createOsEventSetActivationOperation();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION: return (EObject)createTimingTriggeringExecutableStartOperation();
			case ModulePackage.PLAIN_EXECUTABLE_START_OPERATION: return (EObject)createPlainExecutableStartOperation();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION: return (EObject)createModeSwitchTriggeringExecutableStartOperation();
			case ModulePackage.CYCLE_COUNTUP_OPERATION: return (EObject)createCycleCountupOperation();
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION: return (EObject)createStartOffsetCountupOperation();
			case ModulePackage.IOC_EMPTY_QUEUE_API: return (EObject)createIocEmptyQueueApi();
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION: return (EObject)createComSendSignalTrustedFunction();
			case ModulePackage.OS_SET_EVENT_API: return (EObject)createOsSetEventApi();
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY: return (EObject)createComSendSignalImmediateTaskBody();
			case ModulePackage.COM_SEND_PROXY_OPERATION: return (EObject)createComSendProxyOperation();
			case ModulePackage.IOC_RECEIVE_GROUP_API: return (EObject)createIocReceiveGroupApi();
			case ModulePackage.MODULE_ROOT: return (EObject)createModuleRoot();
			case ModulePackage.INTER_PARTITION_TIMEOUT_OPERATION: return (EObject)createInterPartitionTimeoutOperation();
			case ModulePackage.VARIABLE_INITIALIZE_OPERATION: return (EObject)createVariableInitializeOperation();
			case ModulePackage.IOC_INITIALIZE_OPERATION: return (EObject)createIocInitializeOperation();
			case ModulePackage.OS_SUSPEND_ALL_INTERRUPTS_API: return (EObject)createOsSuspendAllInterruptsApi();
			case ModulePackage.OS_GET_SPINLOCK_API: return (EObject)createOsGetSpinlockApi();
			case ModulePackage.MULTICORE_RTE_START_API: return (EObject)createMulticoreRteStartApi();
			case ModulePackage.RTE_BUFFER_WRITE_TRUSTED_FUNCTION: return (EObject)createRteBufferWriteTrustedFunction();
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION: return (EObject)createRteBufferSendTrustedFunction();
			case ModulePackage.CS_TRUSTED_FUNCTION: return (EObject)createCsTrustedFunction();
			case ModulePackage.CS_TF_CALLED_RUNNABLE: return (EObject)createCsTfCalledRunnable();
			case ModulePackage.SERVER_RUNNABLE_START_OPERATION: return (EObject)createServerRunnableStartOperation();
			case ModulePackage.IOC_SEND_GROUP_API: return (EObject)createIocSendGroupApi();
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION: return (EObject)createIocQueuedGroupCommunication();
			case ModulePackage.SINGLECORE_RTE_START_API: return (EObject)createSinglecoreRteStartApi();
			case ModulePackage.RTE_INTERNAL_HEADER: return (EObject)createRteInternalHeader();
			case ModulePackage.MODE_TYPE: return (EObject)createModeType();
			case ModulePackage.MODE_DECLARATION_GROUP: return (EObject)createModeDeclarationGroup();
			case ModulePackage.MODE_QUEUE_TYPE: return (EObject)createModeQueueType();
			case ModulePackage.MODE_QUEUED_VARIABLE: return (EObject)createModeQueuedVariable();
			case ModulePackage.MODE_MACHINE_INSTANCE: return (EObject)createModeMachineInstance();
			case ModulePackage.FUNCTION_MACRO: return (EObject)createFunctionMacro();
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP: return (EObject)createComProxyFunctionTableFileContentsGroup();
			case ModulePackage.PRIMITIVE_TYPE: return (EObject)createPrimitiveType();
			case ModulePackage.REDEFINITION_PRIMITIVE_TYPE: return (EObject)createRedefinitionPrimitiveType();
			case ModulePackage.ARRAY_TYPE: return (EObject)createArrayType();
			case ModulePackage.REDEFINITION_ARRAY_TYPE: return (EObject)createRedefinitionArrayType();
			case ModulePackage.UNION_TYPE: return (EObject)createUnionType();
			case ModulePackage.REDEFINITION_UNION_TYPE: return (EObject)createRedefinitionUnionType();
			case ModulePackage.STRUCT_TYPE: return (EObject)createStructType();
			case ModulePackage.REDEFINITION_STRUCT_TYPE: return (EObject)createRedefinitionStructType();
			case ModulePackage.BLACKBOX_TYPE: return (EObject)createBlackboxType();
			case ModulePackage.UNION_MEMBER: return (EObject)createUnionMember();
			case ModulePackage.STRUCT_MEMBER: return (EObject)createStructMember();
			case ModulePackage.VARIABLE_MEMBER: return (EObject)createVariableMember();
			case ModulePackage.RTE_UTILITY_HEADER: return (EObject)createRteUtilityHeader();
			case ModulePackage.BLACKBOX_HEADER: return (EObject)createBlackboxHeader();
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE: return (EObject)createRteBufferQueueType();
			case ModulePackage.RTE_NONQUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE: return (EObject)createRteNonqueuedSendTrustedFunctionParamType();
			case ModulePackage.RTE_QUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE: return (EObject)createRteQueuedSendTrustedFunctionParamType();
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE: return (EObject)createComSendTrustedFunctionParamType();
			case ModulePackage.CS_TRUSTED_FUNCTION_PARAM_TYPE: return (EObject)createCsTrustedFunctionParamType();
			case ModulePackage.NEVER_READ_OPERATION: return (EObject)createNeverReadOperation();
			case ModulePackage.SWC_MEMORY_MAPPING: return (EObject)createSwcMemoryMapping();
			case ModulePackage.BSW_MEMORY_MAPPING: return (EObject)createBswMemoryMapping();
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP: return (EObject)createGlobalVariableFileContentsGroup();
			case ModulePackage.RTE_API_FILE_CONTENTS_GROUP: return (EObject)createRteApiFileContentsGroup();
			case ModulePackage.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP: return (EObject)createRteLifecycleApiFileContentsGroup();
			case ModulePackage.TASK_BODY_FILE_CONTENTS_GROUP: return (EObject)createTaskBodyFileContentsGroup();
			case ModulePackage.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP: return (EObject)createBswSchedulableEntityFileContentsGroup();
			case ModulePackage.COM_CALLBACK_FILE_CONTENTS_GROUP: return (EObject)createComCallbackFileContentsGroup();
			case ModulePackage.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP: return (EObject)createTrustedFunctionFileContentsGroup();
			case ModulePackage.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP: return (EObject)createExecutableEntityFileContentsGroup();
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER: return (EObject)createBswMemoryMappingHeader();
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER: return (EObject)createSwcMemoryMappingHeader();
			case ModulePackage.GENERATION_INFO: return (EObject)createGenerationInfo();
			case ModulePackage.MACRO: return (EObject)createMacro();
			case ModulePackage.COM_PROXY_FUNCTION: return (EObject)createComProxyFunction();
			case ModulePackage.COM_SEND_SIGNAL_API_WRAPPER: return (EObject)createComSendSignalApiWrapper();
			case ModulePackage.COM_RECEIVE_SIGNAL_API_WRAPPER: return (EObject)createComReceiveSignalApiWrapper();
			case ModulePackage.SCHM_ENTER_API: return (EObject)createSchmEnterApi();
			case ModulePackage.SCHM_EXIT_API: return (EObject)createSchmExitApi();
			case ModulePackage.SCHM_MODE_API: return (EObject)createSchmModeApi();
			case ModulePackage.SCHM_SWITCH_API: return (EObject)createSchmSwitchApi();
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE: return (EObject)createOsTaskEventsTriggeredByMode();
			case ModulePackage.OS_TASK_EVENT: return (EObject)createOsTaskEvent();
			case ModulePackage.MODULE_INTERLINK_HEADER: return (EObject)createModuleInterlinkHeader();
			case ModulePackage.SCHM_API_FILE_CONTENTS_GROUP: return (EObject)createSchmApiFileContentsGroup();
			case ModulePackage.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP: return (EObject)createComSignalApiWrapperFileContentsGroup();
			case ModulePackage.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP: return (EObject)createComProxyFunctionFileContentsGroup();
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER: return (EObject)createModuleInterlinkTypeHeader();
			case ModulePackage.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP: return (EObject)createSchmLifecycleApiFileContentsGroup();
			case ModulePackage.PARTED_BSWM: return (EObject)createPartedBswm();
			case ModulePackage.BSWM: return (EObject)createBswm();
			case ModulePackage.SCHM_DEINIT_API: return (EObject)createSchmDeinitApi();
			case ModulePackage.SCHM_INIT_API: return (EObject)createSchmInitApi();
			case ModulePackage.SINGLECORE_SCHM_INIT_API: return (EObject)createSinglecoreSchmInitApi();
			case ModulePackage.MULTICORE_SCHM_INIT_API: return (EObject)createMulticoreSchmInitApi();
			case ModulePackage.SCHM_CORE_INIT_API_IMPL: return (EObject)createSchmCoreInitApiImpl();
			case ModulePackage.POINTER_TYPE: return (EObject)createPointerType();
			case ModulePackage.REDEFINITION_POINTER_TYPE: return (EObject)createRedefinitionPointerType();
			case ModulePackage.ACTIVATION_OPERATION: return (EObject)createActivationOperation();
			case ModulePackage.OS_ACTIVATE_TASK_API: return (EObject)createOsActivateTaskApi();
			case ModulePackage.FEEDBACK_API: return (EObject)createFeedbackApi();
			case ModulePackage.TACK_STATUS: return (EObject)createTAckStatus();
			case ModulePackage.USER_DEFINED_EXCLUDE_OPERATION: return (EObject)createUserDefinedExcludeOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModulePackage.PARAMETER_PASS_TYPE_ENUM:
				return createParameterPassTypeEnumFromString(eDataType, initialValue);
			case ModulePackage.PARAMETER_DIRECTION_ENUM:
				return createParameterDirectionEnumFromString(eDataType, initialValue);
			case ModulePackage.SIGNEDNESS_ENUM:
				return createSignednessEnumFromString(eDataType, initialValue);
			case ModulePackage.CONSTANT_VALUE_TYPE_ENUM:
				return createConstantValueTypeEnumFromString(eDataType, initialValue);
			case ModulePackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case ModulePackage.VERBATIM_STRING:
				return createVerbatimStringFromString(eDataType, initialValue);
			case ModulePackage.CIDENTIFIER:
				return createCIdentifierFromString(eDataType, initialValue);
			case ModulePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case ModulePackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModulePackage.PARAMETER_PASS_TYPE_ENUM:
				return convertParameterPassTypeEnumToString(eDataType, instanceValue);
			case ModulePackage.PARAMETER_DIRECTION_ENUM:
				return convertParameterDirectionEnumToString(eDataType, instanceValue);
			case ModulePackage.SIGNEDNESS_ENUM:
				return convertSignednessEnumToString(eDataType, instanceValue);
			case ModulePackage.CONSTANT_VALUE_TYPE_ENUM:
				return convertConstantValueTypeEnumToString(eDataType, instanceValue);
			case ModulePackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case ModulePackage.VERBATIM_STRING:
				return convertVerbatimStringToString(eDataType, instanceValue);
			case ModulePackage.CIDENTIFIER:
				return convertCIdentifierToString(eDataType, instanceValue);
			case ModulePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case ModulePackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteApi createWriteApi() {
		WriteApiImpl writeApi = new WriteApiImpl();
		return writeApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation() {
		RteBufferNonqueuedSendOperationImpl rteBufferNonqueuedSendOperation = new RteBufferNonqueuedSendOperationImpl();
		return rteBufferNonqueuedSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation() {
		RteBufferNonqueuedReadOperationImpl rteBufferNonqueuedReadOperation = new RteBufferNonqueuedReadOperationImpl();
		return rteBufferNonqueuedReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadApi createReadApi() {
		ReadApiImpl readApi = new ReadApiImpl();
		return readApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrvReadOperation createIrvReadOperation() {
		IrvReadOperationImpl irvReadOperation = new IrvReadOperationImpl();
		return irvReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrvReadApi createIrvReadApi() {
		IrvReadApiImpl irvReadApi = new IrvReadApiImpl();
		return irvReadApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrvWriteOperation createIrvWriteOperation() {
		IrvWriteOperationImpl irvWriteOperation = new IrvWriteOperationImpl();
		return irvWriteOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrvWriteApi createIrvWriteApi() {
		IrvWriteApiImpl irvWriteApi = new IrvWriteApiImpl();
		return irvWriteApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSet createRteBufferVariableSet() {
		RteBufferVariableSetImpl rteBufferVariableSet = new RteBufferVariableSetImpl();
		return rteBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariableSet createGlobalVariableSet() {
		GlobalVariableSetImpl globalVariableSet = new GlobalVariableSetImpl();
		return globalVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComProxyFunctionTableVariable createComProxyFunctionTableVariable() {
		ComProxyFunctionTableVariableImpl comProxyFunctionTableVariable = new ComProxyFunctionTableVariableImpl();
		return comProxyFunctionTableVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSource createRteSource() {
		RteSourceImpl rteSource = new RteSourceImpl();
		return rteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteModule createRteModule() {
		RteModuleImpl rteModule = new RteModuleImpl();
		return rteModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeType() {
		ModeTypeImpl modeType = new ModeTypeImpl();
		return modeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinitionPrimitiveType createRedefinitionPrimitiveType() {
		RedefinitionPrimitiveTypeImpl redefinitionPrimitiveType = new RedefinitionPrimitiveTypeImpl();
		return redefinitionPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinitionArrayType createRedefinitionArrayType() {
		RedefinitionArrayTypeImpl redefinitionArrayType = new RedefinitionArrayTypeImpl();
		return redefinitionArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinitionUnionType createRedefinitionUnionType() {
		RedefinitionUnionTypeImpl redefinitionUnionType = new RedefinitionUnionTypeImpl();
		return redefinitionUnionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinitionStructType createRedefinitionStructType() {
		RedefinitionStructTypeImpl redefinitionStructType = new RedefinitionStructTypeImpl();
		return redefinitionStructType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlackboxType createBlackboxType() {
		BlackboxTypeImpl blackboxType = new BlackboxTypeImpl();
		return blackboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionMember createUnionMember() {
		UnionMemberImpl unionMember = new UnionMemberImpl();
		return unionMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructMember createStructMember() {
		StructMemberImpl structMember = new StructMemberImpl();
		return structMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMember createVariableMember() {
		VariableMemberImpl variableMember = new VariableMemberImpl();
		return variableMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUtilityHeader createRteUtilityHeader() {
		RteUtilityHeaderImpl rteUtilityHeader = new RteUtilityHeaderImpl();
		return rteUtilityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlackboxHeader createBlackboxHeader() {
		BlackboxHeaderImpl blackboxHeader = new BlackboxHeaderImpl();
		return blackboxHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferQueueType createRteBufferQueueType() {
		RteBufferQueueTypeImpl rteBufferQueueType = new RteBufferQueueTypeImpl();
		return rteBufferQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteNonqueuedSendTrustedFunctionParamType createRteNonqueuedSendTrustedFunctionParamType() {
		RteNonqueuedSendTrustedFunctionParamTypeImpl rteNonqueuedSendTrustedFunctionParamType = new RteNonqueuedSendTrustedFunctionParamTypeImpl();
		return rteNonqueuedSendTrustedFunctionParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteQueuedSendTrustedFunctionParamType createRteQueuedSendTrustedFunctionParamType() {
		RteQueuedSendTrustedFunctionParamTypeImpl rteQueuedSendTrustedFunctionParamType = new RteQueuedSendTrustedFunctionParamTypeImpl();
		return rteQueuedSendTrustedFunctionParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueueType createModeQueueType() {
		ModeQueueTypeImpl modeQueueType = new ModeQueueTypeImpl();
		return modeQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendTrustedFunctionParamType createComSendTrustedFunctionParamType() {
		ComSendTrustedFunctionParamTypeImpl comSendTrustedFunctionParamType = new ComSendTrustedFunctionParamTypeImpl();
		return comSendTrustedFunctionParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsTrustedFunctionParamType createCsTrustedFunctionParamType() {
		CsTrustedFunctionParamTypeImpl csTrustedFunctionParamType = new CsTrustedFunctionParamTypeImpl();
		return csTrustedFunctionParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeverReadOperation createNeverReadOperation() {
		NeverReadOperationImpl neverReadOperation = new NeverReadOperationImpl();
		return neverReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction() {
		RteBufferInvalidateTrustedFunctionImpl rteBufferInvalidateTrustedFunction = new RteBufferInvalidateTrustedFunctionImpl();
		return rteBufferInvalidateTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation() {
		TrustedFunctionRteBufferInvalidateSendOperationImpl trustedFunctionRteBufferInvalidateSendOperation = new TrustedFunctionRteBufferInvalidateSendOperationImpl();
		return trustedFunctionRteBufferInvalidateSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMemoryMapping createSwcMemoryMapping() {
		SwcMemoryMappingImpl swcMemoryMapping = new SwcMemoryMappingImpl();
		return swcMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswMemoryMapping createBswMemoryMapping() {
		BswMemoryMappingImpl bswMemoryMapping = new BswMemoryMappingImpl();
		return bswMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariableFileContentsGroup createGlobalVariableFileContentsGroup() {
		GlobalVariableFileContentsGroupImpl globalVariableFileContentsGroup = new GlobalVariableFileContentsGroupImpl();
		return globalVariableFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteApiFileContentsGroup createRteApiFileContentsGroup() {
		RteApiFileContentsGroupImpl rteApiFileContentsGroup = new RteApiFileContentsGroupImpl();
		return rteApiFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteLifecycleApiFileContentsGroup createRteLifecycleApiFileContentsGroup() {
		RteLifecycleApiFileContentsGroupImpl rteLifecycleApiFileContentsGroup = new RteLifecycleApiFileContentsGroupImpl();
		return rteLifecycleApiFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskBodyFileContentsGroup createTaskBodyFileContentsGroup() {
		TaskBodyFileContentsGroupImpl taskBodyFileContentsGroup = new TaskBodyFileContentsGroupImpl();
		return taskBodyFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityFileContentsGroup createBswSchedulableEntityFileContentsGroup() {
		BswSchedulableEntityFileContentsGroupImpl bswSchedulableEntityFileContentsGroup = new BswSchedulableEntityFileContentsGroupImpl();
		return bswSchedulableEntityFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComCallbackFileContentsGroup createComCallbackFileContentsGroup() {
		ComCallbackFileContentsGroupImpl comCallbackFileContentsGroup = new ComCallbackFileContentsGroupImpl();
		return comCallbackFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionFileContentsGroup createTrustedFunctionFileContentsGroup() {
		TrustedFunctionFileContentsGroupImpl trustedFunctionFileContentsGroup = new TrustedFunctionFileContentsGroupImpl();
		return trustedFunctionFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntityFileContentsGroup createExecutableEntityFileContentsGroup() {
		ExecutableEntityFileContentsGroupImpl executableEntityFileContentsGroup = new ExecutableEntityFileContentsGroupImpl();
		return executableEntityFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswMemoryMappingHeader createBswMemoryMappingHeader() {
		BswMemoryMappingHeaderImpl bswMemoryMappingHeader = new BswMemoryMappingHeaderImpl();
		return bswMemoryMappingHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMemoryMappingHeader createSwcMemoryMappingHeader() {
		SwcMemoryMappingHeaderImpl swcMemoryMappingHeader = new SwcMemoryMappingHeaderImpl();
		return swcMemoryMappingHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationInfo createGenerationInfo() {
		GenerationInfoImpl generationInfo = new GenerationInfoImpl();
		return generationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro createMacro() {
		MacroImpl macro = new MacroImpl();
		return macro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComProxyFunction createComProxyFunction() {
		ComProxyFunctionImpl comProxyFunction = new ComProxyFunctionImpl();
		return comProxyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalApiWrapper createComSendSignalApiWrapper() {
		ComSendSignalApiWrapperImpl comSendSignalApiWrapper = new ComSendSignalApiWrapperImpl();
		return comSendSignalApiWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComReceiveSignalApiWrapper createComReceiveSignalApiWrapper() {
		ComReceiveSignalApiWrapperImpl comReceiveSignalApiWrapper = new ComReceiveSignalApiWrapperImpl();
		return comReceiveSignalApiWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmEnterApi createSchmEnterApi() {
		SchmEnterApiImpl schmEnterApi = new SchmEnterApiImpl();
		return schmEnterApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmExitApi createSchmExitApi() {
		SchmExitApiImpl schmExitApi = new SchmExitApiImpl();
		return schmExitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmSwitchApi createSchmSwitchApi() {
		SchmSwitchApiImpl schmSwitchApi = new SchmSwitchApiImpl();
		return schmSwitchApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskEventsTriggeredByMode createOsTaskEventsTriggeredByMode() {
		OsTaskEventsTriggeredByModeImpl osTaskEventsTriggeredByMode = new OsTaskEventsTriggeredByModeImpl();
		return osTaskEventsTriggeredByMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskEvent createOsTaskEvent() {
		OsTaskEventImpl osTaskEvent = new OsTaskEventImpl();
		return osTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueuedVariable createModeQueuedVariable() {
		ModeQueuedVariableImpl modeQueuedVariable = new ModeQueuedVariableImpl();
		return modeQueuedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmModeApi createSchmModeApi() {
		SchmModeApiImpl schmModeApi = new SchmModeApiImpl();
		return schmModeApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleInterlinkHeader createModuleInterlinkHeader() {
		ModuleInterlinkHeaderImpl moduleInterlinkHeader = new ModuleInterlinkHeaderImpl();
		return moduleInterlinkHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmApiFileContentsGroup createSchmApiFileContentsGroup() {
		SchmApiFileContentsGroupImpl schmApiFileContentsGroup = new SchmApiFileContentsGroupImpl();
		return schmApiFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalApiWrapperFileContentsGroup createComSignalApiWrapperFileContentsGroup() {
		ComSignalApiWrapperFileContentsGroupImpl comSignalApiWrapperFileContentsGroup = new ComSignalApiWrapperFileContentsGroupImpl();
		return comSignalApiWrapperFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComProxyFunctionFileContentsGroup createComProxyFunctionFileContentsGroup() {
		ComProxyFunctionFileContentsGroupImpl comProxyFunctionFileContentsGroup = new ComProxyFunctionFileContentsGroupImpl();
		return comProxyFunctionFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleInterlinkTypeHeader createModuleInterlinkTypeHeader() {
		ModuleInterlinkTypeHeaderImpl moduleInterlinkTypeHeader = new ModuleInterlinkTypeHeaderImpl();
		return moduleInterlinkTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmLifecycleApiFileContentsGroup createSchmLifecycleApiFileContentsGroup() {
		SchmLifecycleApiFileContentsGroupImpl schmLifecycleApiFileContentsGroup = new SchmLifecycleApiFileContentsGroupImpl();
		return schmLifecycleApiFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartedBswm createPartedBswm() {
		PartedBswmImpl partedBswm = new PartedBswmImpl();
		return partedBswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bswm createBswm() {
		BswmImpl bswm = new BswmImpl();
		return bswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmDeinitApi createSchmDeinitApi() {
		SchmDeinitApiImpl schmDeinitApi = new SchmDeinitApiImpl();
		return schmDeinitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmInitApi createSchmInitApi() {
		SchmInitApiImpl schmInitApi = new SchmInitApiImpl();
		return schmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglecoreSchmInitApi createSinglecoreSchmInitApi() {
		SinglecoreSchmInitApiImpl singlecoreSchmInitApi = new SinglecoreSchmInitApiImpl();
		return singlecoreSchmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticoreSchmInitApi createMulticoreSchmInitApi() {
		MulticoreSchmInitApiImpl multicoreSchmInitApi = new MulticoreSchmInitApiImpl();
		return multicoreSchmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl createSchmCoreInitApiImpl() {
		SchmCoreInitApiImplImpl schmCoreInitApiImpl = new SchmCoreInitApiImplImpl();
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinitionPointerType createRedefinitionPointerType() {
		RedefinitionPointerTypeImpl redefinitionPointerType = new RedefinitionPointerTypeImpl();
		return redefinitionPointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationOperation createActivationOperation() {
		ActivationOperationImpl activationOperation = new ActivationOperationImpl();
		return activationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsActivateTaskApi createOsActivateTaskApi() {
		OsActivateTaskApiImpl osActivateTaskApi = new OsActivateTaskApiImpl();
		return osActivateTaskApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackApi createFeedbackApi() {
		FeedbackApiImpl feedbackApi = new FeedbackApiImpl();
		return feedbackApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus createTAckStatus() {
		TAckStatusImpl tAckStatus = new TAckStatusImpl();
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedExcludeOperation createUserDefinedExcludeOperation() {
		UserDefinedExcludeOperationImpl userDefinedExcludeOperation = new UserDefinedExcludeOperationImpl();
		return userDefinedExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteApplicationHeader createRteApplicationHeader() {
		RteApplicationHeaderImpl rteApplicationHeader = new RteApplicationHeaderImpl();
		return rteApplicationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swc createSwc() {
		SwcImpl swc = new SwcImpl();
		return swc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteHeader createRteHeader() {
		RteHeaderImpl rteHeader = new RteHeaderImpl();
		return rteHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswApiHeader createRteBswApiHeader() {
		RteBswApiHeaderImpl rteBswApiHeader = new RteBswApiHeaderImpl();
		return rteBswApiHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteLifecycleHeader createRteLifecycleHeader() {
		RteLifecycleHeaderImpl rteLifecycleHeader = new RteLifecycleHeaderImpl();
		return rteLifecycleHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteApplicationTypeHeader createRteApplicationTypeHeader() {
		RteApplicationTypeHeaderImpl rteApplicationTypeHeader = new RteApplicationTypeHeaderImpl();
		return rteApplicationTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteVfbTraceHeader createRteVfbTraceHeader() {
		RteVfbTraceHeaderImpl rteVfbTraceHeader = new RteVfbTraceHeaderImpl();
		return rteVfbTraceHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteConfigurationHeader createRteConfigurationHeader() {
		RteConfigurationHeaderImpl rteConfigurationHeader = new RteConfigurationHeaderImpl();
		return rteConfigurationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCallbackHeader createRteCallbackHeader() {
		RteCallbackHeaderImpl rteCallbackHeader = new RteCallbackHeaderImpl();
		return rteCallbackHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTypeHeader createRteTypeHeader() {
		RteTypeHeaderImpl rteTypeHeader = new RteTypeHeaderImpl();
		return rteTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidateApi createInvalidateApi() {
		InvalidateApiImpl invalidateApi = new InvalidateApiImpl();
		return invalidateApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocNonqueuedSendOperation createIocNonqueuedSendOperation() {
		IocNonqueuedSendOperationImpl iocNonqueuedSendOperation = new IocNonqueuedSendOperationImpl();
		return iocNonqueuedSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectComSendOperation createDirectComSendOperation() {
		DirectComSendOperationImpl directComSendOperation = new DirectComSendOperationImpl();
		return directComSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteOperation createTrustedFunctionRteOperation() {
		TrustedFunctionRteOperationImpl trustedFunctionRteOperation = new TrustedFunctionRteOperationImpl();
		return trustedFunctionRteOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteBufferSendSendOperation createTrustedFunctionRteBufferSendSendOperation() {
		TrustedFunctionRteBufferSendSendOperationImpl trustedFunctionRteBufferSendSendOperation = new TrustedFunctionRteBufferSendSendOperationImpl();
		return trustedFunctionRteBufferSendSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionComSendOperation createTrustedFunctionComSendOperation() {
		TrustedFunctionComSendOperationImpl trustedFunctionComSendOperation = new TrustedFunctionComSendOperationImpl();
		return trustedFunctionComSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateProxyComSendOperation createImmediateProxyComSendOperation() {
		ImmediateProxyComSendOperationImpl immediateProxyComSendOperation = new ImmediateProxyComSendOperationImpl();
		return immediateProxyComSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicProxyComSendOperation createPeriodicProxyComSendOperation() {
		PeriodicProxyComSendOperationImpl periodicProxyComSendOperation = new PeriodicProxyComSendOperationImpl();
		return periodicProxyComSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocNonqueuedReadOperation createIocNonqueuedReadOperation() {
		IocNonqueuedReadOperationImpl iocNonqueuedReadOperation = new IocNonqueuedReadOperationImpl();
		return iocNonqueuedReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComReadOperation createComReadOperation() {
		ComReadOperationImpl comReadOperation = new ComReadOperationImpl();
		return comReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocNonqueuedCommunication createIocNonqueuedCommunication() {
		IocNonqueuedCommunicationImpl iocNonqueuedCommunication = new IocNonqueuedCommunicationImpl();
		return iocNonqueuedCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocWriteApi createIocWriteApi() {
		IocWriteApiImpl iocWriteApi = new IocWriteApiImpl();
		return iocWriteApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReadApi createIocReadApi() {
		IocReadApiImpl iocReadApi = new IocReadApiImpl();
		return iocReadApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalApi createComSendSignalApi() {
		ComSendSignalApiImpl comSendSignalApi = new ComSendSignalApiImpl();
		return comSendSignalApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComReceiveSignalApi createComReceiveSignalApi() {
		ComReceiveSignalApiImpl comReceiveSignalApi = new ComReceiveSignalApiImpl();
		return comReceiveSignalApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComRxCallback createComRxCallback() {
		ComRxCallbackImpl comRxCallback = new ComRxCallbackImpl();
		return comRxCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComRxTOutCallback createComRxTOutCallback() {
		ComRxTOutCallbackImpl comRxTOutCallback = new ComRxTOutCallbackImpl();
		return comRxTOutCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComInvCallback createComInvCallback() {
		ComInvCallbackImpl comInvCallback = new ComInvCallbackImpl();
		return comInvCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalProxyEntity createComSendSignalProxyEntity() {
		ComSendSignalProxyEntityImpl comSendSignalProxyEntity = new ComSendSignalProxyEntityImpl();
		return comSendSignalProxyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity createComSendSignalImmediateEntity() {
		ComSendSignalImmediateEntityImpl comSendSignalImmediateEntity = new ComSendSignalImmediateEntityImpl();
		return comSendSignalImmediateEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity() {
		ComSendSignalPeriodicEntityImpl comSendSignalPeriodicEntity = new ComSendSignalPeriodicEntityImpl();
		return comSendSignalPeriodicEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckNotifyOperation createTAckNotifyOperation() {
		TAckNotifyOperationImpl tAckNotifyOperation = new TAckNotifyOperationImpl();
		return tAckNotifyOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTxTOutCallback createComTxTOutCallback() {
		ComTxTOutCallbackImpl comTxTOutCallback = new ComTxTOutCallbackImpl();
		return comTxTOutCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTAckCallback createComTAckCallback() {
		ComTAckCallbackImpl comTAckCallback = new ComTAckCallbackImpl();
		return comTAckCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTErrCallback createComTErrCallback() {
		ComTErrCallbackImpl comTErrCallback = new ComTErrCallbackImpl();
		return comTErrCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskedNewDiffersMaskedOldFilterOperation createMaskedNewDiffersMaskedOldFilterOperation() {
		MaskedNewDiffersMaskedOldFilterOperationImpl maskedNewDiffersMaskedOldFilterOperation = new MaskedNewDiffersMaskedOldFilterOperationImpl();
		return maskedNewDiffersMaskedOldFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskedNewDiffersXFilterOperation createMaskedNewDiffersXFilterOperation() {
		MaskedNewDiffersXFilterOperationImpl maskedNewDiffersXFilterOperation = new MaskedNewDiffersXFilterOperationImpl();
		return maskedNewDiffersXFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewIsWithinFilterOperation createNewIsWithinFilterOperation() {
		NewIsWithinFilterOperationImpl newIsWithinFilterOperation = new NewIsWithinFilterOperationImpl();
		return newIsWithinFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewIsOutsideFilterOperation createNewIsOutsideFilterOperation() {
		NewIsOutsideFilterOperationImpl newIsOutsideFilterOperation = new NewIsOutsideFilterOperationImpl();
		return newIsOutsideFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskedNewEqualsXFilterOperation createMaskedNewEqualsXFilterOperation() {
		MaskedNewEqualsXFilterOperationImpl maskedNewEqualsXFilterOperation = new MaskedNewEqualsXFilterOperationImpl();
		return maskedNewEqualsXFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneEveryNFilterOperation createOneEveryNFilterOperation() {
		OneEveryNFilterOperationImpl oneEveryNFilterOperation = new OneEveryNFilterOperationImpl();
		return oneEveryNFilterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl createRteCoreStartApiImpl() {
		RteCoreStartApiImplImpl rteCoreStartApiImpl = new RteCoreStartApiImplImpl();
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteStopApi createRteStopApi() {
		RteStopApiImpl rteStopApi = new RteStopApiImpl();
		return rteStopApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartPartitionApi createRestartPartitionApi() {
		RestartPartitionApiImpl restartPartitionApi = new RestartPartitionApiImpl();
		return restartPartitionApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionRestartingApi createPartitionRestartingApi() {
		PartitionRestartingApiImpl partitionRestartingApi = new PartitionRestartingApiImpl();
		return partitionRestartingApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTerminatedApi createPartitionTerminatedApi() {
		PartitionTerminatedApiImpl partitionTerminatedApi = new PartitionTerminatedApiImpl();
		return partitionTerminatedApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendApi createSendApi() {
		SendApiImpl sendApi = new SendApiImpl();
		return sendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveApi createReceiveApi() {
		ReceiveApiImpl receiveApi = new ReceiveApiImpl();
		return receiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperation() {
		RteBufferQueuedSendOperationImpl rteBufferQueuedSendOperation = new RteBufferQueuedSendOperationImpl();
		return rteBufferQueuedSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferQueuedVariable createRteBufferQueuedVariable() {
		RteBufferQueuedVariableImpl rteBufferQueuedVariable = new RteBufferQueuedVariableImpl();
		return rteBufferQueuedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferQueuedReadOperation createRteBufferQueuedReadOperation() {
		RteBufferQueuedReadOperationImpl rteBufferQueuedReadOperation = new RteBufferQueuedReadOperationImpl();
		return rteBufferQueuedReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocQueuedCommunication createIocQueuedCommunication() {
		IocQueuedCommunicationImpl iocQueuedCommunication = new IocQueuedCommunicationImpl();
		return iocQueuedCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveApi createIocReceiveApi() {
		IocReceiveApiImpl iocReceiveApi = new IocReceiveApiImpl();
		return iocReceiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi createIocSendApi() {
		IocSendApiImpl iocSendApi = new IocSendApiImpl();
		return iocSendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendOperation createIocSendOperation() {
		IocSendOperationImpl iocSendOperation = new IocSendOperationImpl();
		return iocSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocQueuedSendOperation createIocQueuedSendOperation() {
		IocQueuedSendOperationImpl iocQueuedSendOperation = new IocQueuedSendOperationImpl();
		return iocQueuedSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocQueuedReadOperation createIocQueuedReadOperation() {
		IocQueuedReadOperationImpl iocQueuedReadOperation = new IocQueuedReadOperationImpl();
		return iocQueuedReadOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallApi createCallApi() {
		CallApiImpl callApi = new CallApiImpl();
		return callApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfCallApi createTfCallApi() {
		TfCallApiImpl tfCallApi = new TfCallApiImpl();
		return tfCallApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledInMode createDisabledInMode() {
		DisabledInModeImpl disabledInMode = new DisabledInModeImpl();
		return disabledInMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity createBswSchedulableEntity() {
		BswSchedulableEntityImpl bswSchedulableEntity = new BswSchedulableEntityImpl();
		return bswSchedulableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntity createRunnableEntity() {
		RunnableEntityImpl runnableEntity = new RunnableEntityImpl();
		return runnableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllInterruptBlockExcludeOperation createAllInterruptBlockExcludeOperation() {
		AllInterruptBlockExcludeOperationImpl allInterruptBlockExcludeOperation = new AllInterruptBlockExcludeOperationImpl();
		return allInterruptBlockExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsInterruptBlockExcludeOperation createOsInterruptBlockExcludeOperation() {
		OsInterruptBlockExcludeOperationImpl osInterruptBlockExcludeOperation = new OsInterruptBlockExcludeOperationImpl();
		return osInterruptBlockExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlockExcludeOperation createOsSpinlockExcludeOperation() {
		OsSpinlockExcludeOperationImpl osSpinlockExcludeOperation = new OsSpinlockExcludeOperationImpl();
		return osSpinlockExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResourceExcludeOperation createOsResourceExcludeOperation() {
		OsResourceExcludeOperationImpl osResourceExcludeOperation = new OsResourceExcludeOperationImpl();
		return osResourceExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoneExcludeOperation createNoneExcludeOperation() {
		NoneExcludeOperationImpl noneExcludeOperation = new NoneExcludeOperationImpl();
		return noneExcludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantMember createConstantMember() {
		ConstantMemberImpl constantMember = new ConstantMemberImpl();
		return constantMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEnterApi createRteEnterApi() {
		RteEnterApiImpl rteEnterApi = new RteEnterApiImpl();
		return rteEnterApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExitApi createRteExitApi() {
		RteExitApiImpl rteExitApi = new RteExitApiImpl();
		return rteExitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsBackgroundTaskActivationExecutableTaskBody createOsBackgroundTaskActivationExecutableTaskBody() {
		OsBackgroundTaskActivationExecutableTaskBodyImpl osBackgroundTaskActivationExecutableTaskBody = new OsBackgroundTaskActivationExecutableTaskBodyImpl();
		return osBackgroundTaskActivationExecutableTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody() {
		OsTaskActivationExecutableTaskBodyImpl osTaskActivationExecutableTaskBody = new OsTaskActivationExecutableTaskBodyImpl();
		return osTaskActivationExecutableTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody() {
		OsEventSetExecutableTaskBodyImpl osEventSetExecutableTaskBody = new OsEventSetExecutableTaskBodyImpl();
		return osEventSetExecutableTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskActivationOperation createOsTaskActivationOperation() {
		OsTaskActivationOperationImpl osTaskActivationOperation = new OsTaskActivationOperationImpl();
		return osTaskActivationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEventSetActivationOperation createOsEventSetActivationOperation() {
		OsEventSetActivationOperationImpl osEventSetActivationOperation = new OsEventSetActivationOperationImpl();
		return osEventSetActivationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation() {
		TimingTriggeringExecutableStartOperationImpl timingTriggeringExecutableStartOperation = new TimingTriggeringExecutableStartOperationImpl();
		return timingTriggeringExecutableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainExecutableStartOperation createPlainExecutableStartOperation() {
		PlainExecutableStartOperationImpl plainExecutableStartOperation = new PlainExecutableStartOperationImpl();
		return plainExecutableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation() {
		ModeSwitchTriggeringExecutableStartOperationImpl modeSwitchTriggeringExecutableStartOperation = new ModeSwitchTriggeringExecutableStartOperationImpl();
		return modeSwitchTriggeringExecutableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCountupOperation createCycleCountupOperation() {
		CycleCountupOperationImpl cycleCountupOperation = new CycleCountupOperationImpl();
		return cycleCountupOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCountupOperation createStartOffsetCountupOperation() {
		StartOffsetCountupOperationImpl startOffsetCountupOperation = new StartOffsetCountupOperationImpl();
		return startOffsetCountupOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocEmptyQueueApi createIocEmptyQueueApi() {
		IocEmptyQueueApiImpl iocEmptyQueueApi = new IocEmptyQueueApiImpl();
		return iocEmptyQueueApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rte createRte() {
		RteImpl rte = new RteImpl();
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalTrustedFunction createComSendSignalTrustedFunction() {
		ComSendSignalTrustedFunctionImpl comSendSignalTrustedFunction = new ComSendSignalTrustedFunctionImpl();
		return comSendSignalTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSetEventApi createOsSetEventApi() {
		OsSetEventApiImpl osSetEventApi = new OsSetEventApiImpl();
		return osSetEventApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody() {
		ComSendSignalImmediateTaskBodyImpl comSendSignalImmediateTaskBody = new ComSendSignalImmediateTaskBodyImpl();
		return comSendSignalImmediateTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxyOperation createComSendProxyOperation() {
		ComSendProxyOperationImpl comSendProxyOperation = new ComSendProxyOperationImpl();
		return comSendProxyOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi createIocReceiveGroupApi() {
		IocReceiveGroupApiImpl iocReceiveGroupApi = new IocReceiveGroupApiImpl();
		return iocReceiveGroupApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRoot createModuleRoot() {
		ModuleRootImpl moduleRoot = new ModuleRootImpl();
		return moduleRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterPartitionTimeoutOperation createInterPartitionTimeoutOperation() {
		InterPartitionTimeoutOperationImpl interPartitionTimeoutOperation = new InterPartitionTimeoutOperationImpl();
		return interPartitionTimeoutOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInitializeOperation createVariableInitializeOperation() {
		VariableInitializeOperationImpl variableInitializeOperation = new VariableInitializeOperationImpl();
		return variableInitializeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocInitializeOperation createIocInitializeOperation() {
		IocInitializeOperationImpl iocInitializeOperation = new IocInitializeOperationImpl();
		return iocInitializeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSuspendAllInterruptsApi createOsSuspendAllInterruptsApi() {
		OsSuspendAllInterruptsApiImpl osSuspendAllInterruptsApi = new OsSuspendAllInterruptsApiImpl();
		return osSuspendAllInterruptsApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsGetSpinlockApi createOsGetSpinlockApi() {
		OsGetSpinlockApiImpl osGetSpinlockApi = new OsGetSpinlockApiImpl();
		return osGetSpinlockApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticoreRteStartApi createMulticoreRteStartApi() {
		MulticoreRteStartApiImpl multicoreRteStartApi = new MulticoreRteStartApiImpl();
		return multicoreRteStartApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction() {
		RteBufferWriteTrustedFunctionImpl rteBufferWriteTrustedFunction = new RteBufferWriteTrustedFunctionImpl();
		return rteBufferWriteTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferSendTrustedFunction createRteBufferSendTrustedFunction() {
		RteBufferSendTrustedFunctionImpl rteBufferSendTrustedFunction = new RteBufferSendTrustedFunctionImpl();
		return rteBufferSendTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsTrustedFunction createCsTrustedFunction() {
		CsTrustedFunctionImpl csTrustedFunction = new CsTrustedFunctionImpl();
		return csTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsTfCalledRunnable createCsTfCalledRunnable() {
		CsTfCalledRunnableImpl csTfCalledRunnable = new CsTfCalledRunnableImpl();
		return csTfCalledRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerRunnableStartOperation createServerRunnableStartOperation() {
		ServerRunnableStartOperationImpl serverRunnableStartOperation = new ServerRunnableStartOperationImpl();
		return serverRunnableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation() {
		TrustedFunctionRteBufferWriteSendOperationImpl trustedFunctionRteBufferWriteSendOperation = new TrustedFunctionRteBufferWriteSendOperationImpl();
		return trustedFunctionRteBufferWriteSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendGroupApi createIocSendGroupApi() {
		IocSendGroupApiImpl iocSendGroupApi = new IocSendGroupApiImpl();
		return iocSendGroupApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocQueuedGroupCommunication createIocQueuedGroupCommunication() {
		IocQueuedGroupCommunicationImpl iocQueuedGroupCommunication = new IocQueuedGroupCommunicationImpl();
		return iocQueuedGroupCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglecoreRteStartApi createSinglecoreRteStartApi() {
		SinglecoreRteStartApiImpl singlecoreRteStartApi = new SinglecoreRteStartApiImpl();
		return singlecoreRteStartApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInternalHeader createRteInternalHeader() {
		RteInternalHeaderImpl rteInternalHeader = new RteInternalHeaderImpl();
		return rteInternalHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroup createModeDeclarationGroup() {
		ModeDeclarationGroupImpl modeDeclarationGroup = new ModeDeclarationGroupImpl();
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance createModeMachineInstance() {
		ModeMachineInstanceImpl modeMachineInstance = new ModeMachineInstanceImpl();
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMacro createFunctionMacro() {
		FunctionMacroImpl functionMacro = new FunctionMacroImpl();
		return functionMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComProxyFunctionTableFileContentsGroup createComProxyFunctionTableFileContentsGroup() {
		ComProxyFunctionTableFileContentsGroupImpl comProxyFunctionTableFileContentsGroup = new ComProxyFunctionTableFileContentsGroupImpl();
		return comProxyFunctionTableFileContentsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPassTypeEnum createParameterPassTypeEnumFromString(EDataType eDataType, String initialValue) {
		ParameterPassTypeEnum result = ParameterPassTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterPassTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionEnum createParameterDirectionEnumFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionEnum result = ParameterDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignednessEnum createSignednessEnumFromString(EDataType eDataType, String initialValue) {
		SignednessEnum result = SignednessEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignednessEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValueTypeEnum createConstantValueTypeEnumFromString(EDataType eDataType, String initialValue) {
		ConstantValueTypeEnum result = ConstantValueTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstantValueTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerbatimStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerbatimStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePackage getModulePackage() {
		return (ModulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModulePackage getPackage() {
		return ModulePackage.eINSTANCE;
	}

} //ModuleFactoryImpl
