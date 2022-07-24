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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.*;

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
public class EcucFactoryImpl extends EFactoryImpl implements EcucFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucFactory init() {
		try {
			EcucFactory theEcucFactory = (EcucFactory)EPackage.Registry.INSTANCE.getEFactory(EcucPackage.eNS_URI);
			if (theEcucFactory != null) {
				return theEcucFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcucFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucFactoryImpl() {
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
			case EcucPackage.RTE: return (EObject)createRte();
			case EcucPackage.RTE_GENERATION: return (EObject)createRteGeneration();
			case EcucPackage.RTE_BSW_GENERAL: return (EObject)createRteBswGeneral();
			case EcucPackage.ECUC_ROOT: return (EObject)createEcucRoot();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE: return (EObject)createRteSwComponentInstance();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING: return (EObject)createRteEventToTaskMapping();
			case EcucPackage.OS: return (EObject)createOs();
			case EcucPackage.OS_TASK: return (EObject)createOsTask();
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION: return (EObject)createRteExclusiveAreaImplementation();
			case EcucPackage.OS_EVENT: return (EObject)createOsEvent();
			case EcucPackage.COM: return (EObject)createCom();
			case EcucPackage.COM_CONFIG: return (EObject)createComConfig();
			case EcucPackage.COM_SIGNAL: return (EObject)createComSignal();
			case EcucPackage.COM_SIGNAL_GROUP: return (EObject)createComSignalGroup();
			case EcucPackage.COM_GROUP_SIGNAL: return (EObject)createComGroupSignal();
			case EcucPackage.OS_ALARM: return (EObject)createOsAlarm();
			case EcucPackage.OS_RESOURCE: return (EObject)createOsResource();
			case EcucPackage.OS_APPLICATION: return (EObject)createOsApplication();
			case EcucPackage.ECU_C: return (EObject)createEcuC();
			case EcucPackage.ECUC_PARTITION_COLLECTION: return (EObject)createEcucPartitionCollection();
			case EcucPackage.ECUC_PARTITION: return (EObject)createEcucPartition();
			case EcucPackage.OS_SPINLOCK: return (EObject)createOsSpinlock();
			case EcucPackage.RTE_OS_INTERACTION: return (EObject)createRteOsInteraction();
			case EcucPackage.RTE_USED_OS_ACTIVATION: return (EObject)createRteUsedOsActivation();
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR: return (EObject)createRteInitializationBehavior();
			case EcucPackage.OS_IOC: return (EObject)createOsIoc();
			case EcucPackage.OS_IOC_COMMUNICATION: return (EObject)createOsIocCommunication();
			case EcucPackage.OS_IOC_SENDER_PROPERTIES: return (EObject)createOsIocSenderProperties();
			case EcucPackage.OS_IOC_RECEIVER_PROPERTIES: return (EObject)createOsIocReceiverProperties();
			case EcucPackage.OS_IOC_DATA_PROPERTIES: return (EObject)createOsIocDataProperties();
			case EcucPackage.OS_APPLICATION_TRUSTED_FUNCTION: return (EObject)createOsApplicationTrustedFunction();
			case EcucPackage.OS_OS: return (EObject)createOsOS();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING: return (EObject)createRteBswEventToTaskMapping();
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION: return (EObject)createRteBswRequiredModeGroupConnection();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE: return (EObject)createRteBswModuleInstance();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL: return (EObject)createRteBswExclusiveAreaImpl();
			case EcucPackage.OS_SYSTEM_CYCLE: return (EObject)createOsSystemCycle();
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
			case EcucPackage.OS_TASK_SCHEDULE_ENUM:
				return createOsTaskScheduleEnumFromString(eDataType, initialValue);
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM:
				return createRteExclusiveAreaImplMechanismEnumFromString(eDataType, initialValue);
			case EcucPackage.COM_TRANSFER_PROPERTY_ENUM:
				return createComTransferPropertyEnumFromString(eDataType, initialValue);
			case EcucPackage.OS_SPINLOCK_LOCK_METHOD_ENUM:
				return createOsSpinlockLockMethodEnumFromString(eDataType, initialValue);
			case EcucPackage.RTE_INITIALIZATION_STRATEGY_ENUM:
				return createRteInitializationStrategyEnumFromString(eDataType, initialValue);
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
			case EcucPackage.OS_TASK_SCHEDULE_ENUM:
				return convertOsTaskScheduleEnumToString(eDataType, instanceValue);
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM:
				return convertRteExclusiveAreaImplMechanismEnumToString(eDataType, instanceValue);
			case EcucPackage.COM_TRANSFER_PROPERTY_ENUM:
				return convertComTransferPropertyEnumToString(eDataType, instanceValue);
			case EcucPackage.OS_SPINLOCK_LOCK_METHOD_ENUM:
				return convertOsSpinlockLockMethodEnumToString(eDataType, instanceValue);
			case EcucPackage.RTE_INITIALIZATION_STRATEGY_ENUM:
				return convertRteInitializationStrategyEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public RteGeneration createRteGeneration() {
		RteGenerationImpl rteGeneration = new RteGenerationImpl();
		return rteGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswGeneral createRteBswGeneral() {
		RteBswGeneralImpl rteBswGeneral = new RteBswGeneralImpl();
		return rteBswGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucRoot createEcucRoot() {
		EcucRootImpl ecucRoot = new EcucRootImpl();
		return ecucRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSwComponentInstance createRteSwComponentInstance() {
		RteSwComponentInstanceImpl rteSwComponentInstance = new RteSwComponentInstanceImpl();
		return rteSwComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEventToTaskMapping createRteEventToTaskMapping() {
		RteEventToTaskMappingImpl rteEventToTaskMapping = new RteEventToTaskMappingImpl();
		return rteEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os createOs() {
		OsImpl os = new OsImpl();
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask createOsTask() {
		OsTaskImpl osTask = new OsTaskImpl();
		return osTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplementation createRteExclusiveAreaImplementation() {
		RteExclusiveAreaImplementationImpl rteExclusiveAreaImplementation = new RteExclusiveAreaImplementationImpl();
		return rteExclusiveAreaImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent createOsEvent() {
		OsEventImpl osEvent = new OsEventImpl();
		return osEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Com createCom() {
		ComImpl com = new ComImpl();
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComConfig createComConfig() {
		ComConfigImpl comConfig = new ComConfigImpl();
		return comConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal createComSignal() {
		ComSignalImpl comSignal = new ComSignalImpl();
		return comSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup createComSignalGroup() {
		ComSignalGroupImpl comSignalGroup = new ComSignalGroupImpl();
		return comSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComGroupSignal createComGroupSignal() {
		ComGroupSignalImpl comGroupSignal = new ComGroupSignalImpl();
		return comGroupSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm createOsAlarm() {
		OsAlarmImpl osAlarm = new OsAlarmImpl();
		return osAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource createOsResource() {
		OsResourceImpl osResource = new OsResourceImpl();
		return osResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplication createOsApplication() {
		OsApplicationImpl osApplication = new OsApplicationImpl();
		return osApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuC createEcuC() {
		EcuCImpl ecuC = new EcuCImpl();
		return ecuC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartitionCollection createEcucPartitionCollection() {
		EcucPartitionCollectionImpl ecucPartitionCollection = new EcucPartitionCollectionImpl();
		return ecucPartitionCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition createEcucPartition() {
		EcucPartitionImpl ecucPartition = new EcucPartitionImpl();
		return ecucPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock createOsSpinlock() {
		OsSpinlockImpl osSpinlock = new OsSpinlockImpl();
		return osSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteOsInteraction createRteOsInteraction() {
		RteOsInteractionImpl rteOsInteraction = new RteOsInteractionImpl();
		return rteOsInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation createRteUsedOsActivation() {
		RteUsedOsActivationImpl rteUsedOsActivation = new RteUsedOsActivationImpl();
		return rteUsedOsActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationBehavior createRteInitializationBehavior() {
		RteInitializationBehaviorImpl rteInitializationBehavior = new RteInitializationBehaviorImpl();
		return rteInitializationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIoc createOsIoc() {
		OsIocImpl osIoc = new OsIocImpl();
		return osIoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication createOsIocCommunication() {
		OsIocCommunicationImpl osIocCommunication = new OsIocCommunicationImpl();
		return osIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocSenderProperties createOsIocSenderProperties() {
		OsIocSenderPropertiesImpl osIocSenderProperties = new OsIocSenderPropertiesImpl();
		return osIocSenderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocReceiverProperties createOsIocReceiverProperties() {
		OsIocReceiverPropertiesImpl osIocReceiverProperties = new OsIocReceiverPropertiesImpl();
		return osIocReceiverProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocDataProperties createOsIocDataProperties() {
		OsIocDataPropertiesImpl osIocDataProperties = new OsIocDataPropertiesImpl();
		return osIocDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction createOsApplicationTrustedFunction() {
		OsApplicationTrustedFunctionImpl osApplicationTrustedFunction = new OsApplicationTrustedFunctionImpl();
		return osApplicationTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsOS createOsOS() {
		OsOSImpl osOS = new OsOSImpl();
		return osOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswEventToTaskMapping createRteBswEventToTaskMapping() {
		RteBswEventToTaskMappingImpl rteBswEventToTaskMapping = new RteBswEventToTaskMappingImpl();
		return rteBswEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswRequiredModeGroupConnection createRteBswRequiredModeGroupConnection() {
		RteBswRequiredModeGroupConnectionImpl rteBswRequiredModeGroupConnection = new RteBswRequiredModeGroupConnectionImpl();
		return rteBswRequiredModeGroupConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswModuleInstance createRteBswModuleInstance() {
		RteBswModuleInstanceImpl rteBswModuleInstance = new RteBswModuleInstanceImpl();
		return rteBswModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswExclusiveAreaImpl createRteBswExclusiveAreaImpl() {
		RteBswExclusiveAreaImplImpl rteBswExclusiveAreaImpl = new RteBswExclusiveAreaImplImpl();
		return rteBswExclusiveAreaImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSystemCycle createOsSystemCycle() {
		OsSystemCycleImpl osSystemCycle = new OsSystemCycleImpl();
		return osSystemCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskScheduleEnum createOsTaskScheduleEnumFromString(EDataType eDataType, String initialValue) {
		OsTaskScheduleEnum result = OsTaskScheduleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsTaskScheduleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplMechanismEnum createRteExclusiveAreaImplMechanismEnumFromString(EDataType eDataType, String initialValue) {
		RteExclusiveAreaImplMechanismEnum result = RteExclusiveAreaImplMechanismEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRteExclusiveAreaImplMechanismEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransferPropertyEnum createComTransferPropertyEnumFromString(EDataType eDataType, String initialValue) {
		ComTransferPropertyEnum result = ComTransferPropertyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComTransferPropertyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlockLockMethodEnum createOsSpinlockLockMethodEnumFromString(EDataType eDataType, String initialValue) {
		OsSpinlockLockMethodEnum result = OsSpinlockLockMethodEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsSpinlockLockMethodEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum createRteInitializationStrategyEnumFromString(EDataType eDataType, String initialValue) {
		RteInitializationStrategyEnum result = RteInitializationStrategyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRteInitializationStrategyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPackage getEcucPackage() {
		return (EcucPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcucPackage getPackage() {
		return EcucPackage.eINSTANCE;
	}

} //EcucFactoryImpl
