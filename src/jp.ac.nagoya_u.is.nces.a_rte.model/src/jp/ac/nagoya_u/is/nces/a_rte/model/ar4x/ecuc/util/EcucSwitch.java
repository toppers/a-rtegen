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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage
 * @generated
 */
public class EcucSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcucPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucSwitch() {
		if (modelPackage == null) {
			modelPackage = EcucPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcucPackage.ECUC_OBJECT: {
				EcucObject ecucObject = (EcucObject)theEObject;
				T result = caseEcucObject(ecucObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_REFERRABLE: {
				EcucReferrable ecucReferrable = (EcucReferrable)theEObject;
				T result = caseEcucReferrable(ecucReferrable);
				if (result == null) result = caseEcucObject(ecucReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_MODULE: {
				EcucModule ecucModule = (EcucModule)theEObject;
				T result = caseEcucModule(ecucModule);
				if (result == null) result = caseEcucReferrable(ecucModule);
				if (result == null) result = caseEcucObject(ecucModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_CONTAINER: {
				EcucContainer ecucContainer = (EcucContainer)theEObject;
				T result = caseEcucContainer(ecucContainer);
				if (result == null) result = caseEcucReferrable(ecucContainer);
				if (result == null) result = caseEcucObject(ecucContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE: {
				Rte rte = (Rte)theEObject;
				T result = caseRte(rte);
				if (result == null) result = caseEcucModule(rte);
				if (result == null) result = caseEcucReferrable(rte);
				if (result == null) result = caseEcucObject(rte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_GENERATION: {
				RteGeneration rteGeneration = (RteGeneration)theEObject;
				T result = caseRteGeneration(rteGeneration);
				if (result == null) result = caseEcucContainer(rteGeneration);
				if (result == null) result = caseEcucReferrable(rteGeneration);
				if (result == null) result = caseEcucObject(rteGeneration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_BSW_GENERAL: {
				RteBswGeneral rteBswGeneral = (RteBswGeneral)theEObject;
				T result = caseRteBswGeneral(rteBswGeneral);
				if (result == null) result = caseEcucContainer(rteBswGeneral);
				if (result == null) result = caseEcucReferrable(rteBswGeneral);
				if (result == null) result = caseEcucObject(rteBswGeneral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_ROOT: {
				EcucRoot ecucRoot = (EcucRoot)theEObject;
				T result = caseEcucRoot(ecucRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE: {
				RteSwComponentInstance rteSwComponentInstance = (RteSwComponentInstance)theEObject;
				T result = caseRteSwComponentInstance(rteSwComponentInstance);
				if (result == null) result = caseEcucContainer(rteSwComponentInstance);
				if (result == null) result = caseEcucReferrable(rteSwComponentInstance);
				if (result == null) result = caseEcucObject(rteSwComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING: {
				RteEventToTaskMapping rteEventToTaskMapping = (RteEventToTaskMapping)theEObject;
				T result = caseRteEventToTaskMapping(rteEventToTaskMapping);
				if (result == null) result = caseEcucContainer(rteEventToTaskMapping);
				if (result == null) result = caseEcucReferrable(rteEventToTaskMapping);
				if (result == null) result = caseEcucObject(rteEventToTaskMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS: {
				Os os = (Os)theEObject;
				T result = caseOs(os);
				if (result == null) result = caseEcucModule(os);
				if (result == null) result = caseEcucReferrable(os);
				if (result == null) result = caseEcucObject(os);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_TASK: {
				OsTask osTask = (OsTask)theEObject;
				T result = caseOsTask(osTask);
				if (result == null) result = caseEcucContainer(osTask);
				if (result == null) result = caseEcucReferrable(osTask);
				if (result == null) result = caseEcucObject(osTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION: {
				RteExclusiveAreaImplementation rteExclusiveAreaImplementation = (RteExclusiveAreaImplementation)theEObject;
				T result = caseRteExclusiveAreaImplementation(rteExclusiveAreaImplementation);
				if (result == null) result = caseEcucContainer(rteExclusiveAreaImplementation);
				if (result == null) result = caseEcucReferrable(rteExclusiveAreaImplementation);
				if (result == null) result = caseEcucObject(rteExclusiveAreaImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_EVENT: {
				OsEvent osEvent = (OsEvent)theEObject;
				T result = caseOsEvent(osEvent);
				if (result == null) result = caseEcucContainer(osEvent);
				if (result == null) result = caseEcucReferrable(osEvent);
				if (result == null) result = caseEcucObject(osEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.COM: {
				Com com = (Com)theEObject;
				T result = caseCom(com);
				if (result == null) result = caseEcucModule(com);
				if (result == null) result = caseEcucReferrable(com);
				if (result == null) result = caseEcucObject(com);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.COM_CONFIG: {
				ComConfig comConfig = (ComConfig)theEObject;
				T result = caseComConfig(comConfig);
				if (result == null) result = caseEcucContainer(comConfig);
				if (result == null) result = caseEcucReferrable(comConfig);
				if (result == null) result = caseEcucObject(comConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.COM_SIGNAL: {
				ComSignal comSignal = (ComSignal)theEObject;
				T result = caseComSignal(comSignal);
				if (result == null) result = caseEcucContainer(comSignal);
				if (result == null) result = caseEcucReferrable(comSignal);
				if (result == null) result = caseEcucObject(comSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.COM_SIGNAL_GROUP: {
				ComSignalGroup comSignalGroup = (ComSignalGroup)theEObject;
				T result = caseComSignalGroup(comSignalGroup);
				if (result == null) result = caseEcucContainer(comSignalGroup);
				if (result == null) result = caseEcucReferrable(comSignalGroup);
				if (result == null) result = caseEcucObject(comSignalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.COM_GROUP_SIGNAL: {
				ComGroupSignal comGroupSignal = (ComGroupSignal)theEObject;
				T result = caseComGroupSignal(comGroupSignal);
				if (result == null) result = caseEcucContainer(comGroupSignal);
				if (result == null) result = caseEcucReferrable(comGroupSignal);
				if (result == null) result = caseEcucObject(comGroupSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_ALARM: {
				OsAlarm osAlarm = (OsAlarm)theEObject;
				T result = caseOsAlarm(osAlarm);
				if (result == null) result = caseEcucContainer(osAlarm);
				if (result == null) result = caseEcucReferrable(osAlarm);
				if (result == null) result = caseEcucObject(osAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_RESOURCE: {
				OsResource osResource = (OsResource)theEObject;
				T result = caseOsResource(osResource);
				if (result == null) result = caseEcucContainer(osResource);
				if (result == null) result = caseEcucReferrable(osResource);
				if (result == null) result = caseEcucObject(osResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_APPLICATION: {
				OsApplication osApplication = (OsApplication)theEObject;
				T result = caseOsApplication(osApplication);
				if (result == null) result = caseEcucContainer(osApplication);
				if (result == null) result = caseEcucReferrable(osApplication);
				if (result == null) result = caseEcucObject(osApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECU_C: {
				EcuC ecuC = (EcuC)theEObject;
				T result = caseEcuC(ecuC);
				if (result == null) result = caseEcucModule(ecuC);
				if (result == null) result = caseEcucReferrable(ecuC);
				if (result == null) result = caseEcucObject(ecuC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_PARTITION_COLLECTION: {
				EcucPartitionCollection ecucPartitionCollection = (EcucPartitionCollection)theEObject;
				T result = caseEcucPartitionCollection(ecucPartitionCollection);
				if (result == null) result = caseEcucContainer(ecucPartitionCollection);
				if (result == null) result = caseEcucReferrable(ecucPartitionCollection);
				if (result == null) result = caseEcucObject(ecucPartitionCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.ECUC_PARTITION: {
				EcucPartition ecucPartition = (EcucPartition)theEObject;
				T result = caseEcucPartition(ecucPartition);
				if (result == null) result = caseEcucContainer(ecucPartition);
				if (result == null) result = caseEcucReferrable(ecucPartition);
				if (result == null) result = caseEcucObject(ecucPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_SPINLOCK: {
				OsSpinlock osSpinlock = (OsSpinlock)theEObject;
				T result = caseOsSpinlock(osSpinlock);
				if (result == null) result = caseEcucContainer(osSpinlock);
				if (result == null) result = caseEcucReferrable(osSpinlock);
				if (result == null) result = caseEcucObject(osSpinlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_OS_INTERACTION: {
				RteOsInteraction rteOsInteraction = (RteOsInteraction)theEObject;
				T result = caseRteOsInteraction(rteOsInteraction);
				if (result == null) result = caseEcucContainer(rteOsInteraction);
				if (result == null) result = caseEcucReferrable(rteOsInteraction);
				if (result == null) result = caseEcucObject(rteOsInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_USED_OS_ACTIVATION: {
				RteUsedOsActivation rteUsedOsActivation = (RteUsedOsActivation)theEObject;
				T result = caseRteUsedOsActivation(rteUsedOsActivation);
				if (result == null) result = caseEcucContainer(rteUsedOsActivation);
				if (result == null) result = caseEcucReferrable(rteUsedOsActivation);
				if (result == null) result = caseEcucObject(rteUsedOsActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR: {
				RteInitializationBehavior rteInitializationBehavior = (RteInitializationBehavior)theEObject;
				T result = caseRteInitializationBehavior(rteInitializationBehavior);
				if (result == null) result = caseEcucContainer(rteInitializationBehavior);
				if (result == null) result = caseEcucReferrable(rteInitializationBehavior);
				if (result == null) result = caseEcucObject(rteInitializationBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_IOC: {
				OsIoc osIoc = (OsIoc)theEObject;
				T result = caseOsIoc(osIoc);
				if (result == null) result = caseEcucContainer(osIoc);
				if (result == null) result = caseEcucReferrable(osIoc);
				if (result == null) result = caseEcucObject(osIoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_IOC_COMMUNICATION: {
				OsIocCommunication osIocCommunication = (OsIocCommunication)theEObject;
				T result = caseOsIocCommunication(osIocCommunication);
				if (result == null) result = caseEcucContainer(osIocCommunication);
				if (result == null) result = caseEcucReferrable(osIocCommunication);
				if (result == null) result = caseEcucObject(osIocCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_IOC_SENDER_PROPERTIES: {
				OsIocSenderProperties osIocSenderProperties = (OsIocSenderProperties)theEObject;
				T result = caseOsIocSenderProperties(osIocSenderProperties);
				if (result == null) result = caseEcucContainer(osIocSenderProperties);
				if (result == null) result = caseEcucReferrable(osIocSenderProperties);
				if (result == null) result = caseEcucObject(osIocSenderProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_IOC_RECEIVER_PROPERTIES: {
				OsIocReceiverProperties osIocReceiverProperties = (OsIocReceiverProperties)theEObject;
				T result = caseOsIocReceiverProperties(osIocReceiverProperties);
				if (result == null) result = caseEcucContainer(osIocReceiverProperties);
				if (result == null) result = caseEcucReferrable(osIocReceiverProperties);
				if (result == null) result = caseEcucObject(osIocReceiverProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_IOC_DATA_PROPERTIES: {
				OsIocDataProperties osIocDataProperties = (OsIocDataProperties)theEObject;
				T result = caseOsIocDataProperties(osIocDataProperties);
				if (result == null) result = caseEcucContainer(osIocDataProperties);
				if (result == null) result = caseEcucReferrable(osIocDataProperties);
				if (result == null) result = caseEcucObject(osIocDataProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_APPLICATION_TRUSTED_FUNCTION: {
				OsApplicationTrustedFunction osApplicationTrustedFunction = (OsApplicationTrustedFunction)theEObject;
				T result = caseOsApplicationTrustedFunction(osApplicationTrustedFunction);
				if (result == null) result = caseEcucContainer(osApplicationTrustedFunction);
				if (result == null) result = caseEcucReferrable(osApplicationTrustedFunction);
				if (result == null) result = caseEcucObject(osApplicationTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_OS: {
				OsOS osOS = (OsOS)theEObject;
				T result = caseOsOS(osOS);
				if (result == null) result = caseEcucContainer(osOS);
				if (result == null) result = caseEcucReferrable(osOS);
				if (result == null) result = caseEcucObject(osOS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING: {
				RteBswEventToTaskMapping rteBswEventToTaskMapping = (RteBswEventToTaskMapping)theEObject;
				T result = caseRteBswEventToTaskMapping(rteBswEventToTaskMapping);
				if (result == null) result = caseEcucContainer(rteBswEventToTaskMapping);
				if (result == null) result = caseEcucReferrable(rteBswEventToTaskMapping);
				if (result == null) result = caseEcucObject(rteBswEventToTaskMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION: {
				RteBswRequiredModeGroupConnection rteBswRequiredModeGroupConnection = (RteBswRequiredModeGroupConnection)theEObject;
				T result = caseRteBswRequiredModeGroupConnection(rteBswRequiredModeGroupConnection);
				if (result == null) result = caseEcucContainer(rteBswRequiredModeGroupConnection);
				if (result == null) result = caseEcucReferrable(rteBswRequiredModeGroupConnection);
				if (result == null) result = caseEcucObject(rteBswRequiredModeGroupConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_BSW_MODULE_INSTANCE: {
				RteBswModuleInstance rteBswModuleInstance = (RteBswModuleInstance)theEObject;
				T result = caseRteBswModuleInstance(rteBswModuleInstance);
				if (result == null) result = caseEcucContainer(rteBswModuleInstance);
				if (result == null) result = caseEcucReferrable(rteBswModuleInstance);
				if (result == null) result = caseEcucObject(rteBswModuleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL: {
				RteBswExclusiveAreaImpl rteBswExclusiveAreaImpl = (RteBswExclusiveAreaImpl)theEObject;
				T result = caseRteBswExclusiveAreaImpl(rteBswExclusiveAreaImpl);
				if (result == null) result = caseEcucContainer(rteBswExclusiveAreaImpl);
				if (result == null) result = caseEcucReferrable(rteBswExclusiveAreaImpl);
				if (result == null) result = caseEcucObject(rteBswExclusiveAreaImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcucPackage.OS_SYSTEM_CYCLE: {
				OsSystemCycle osSystemCycle = (OsSystemCycle)theEObject;
				T result = caseOsSystemCycle(osSystemCycle);
				if (result == null) result = caseEcucContainer(osSystemCycle);
				if (result == null) result = caseEcucReferrable(osSystemCycle);
				if (result == null) result = caseEcucObject(osSystemCycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRte(Rte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteGeneration(RteGeneration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw General</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw General</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswGeneral(RteBswGeneral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucObject(EcucObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucRoot(EcucRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Sw Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Sw Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteSwComponentInstance(RteSwComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Event To Task Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteEventToTaskMapping(RteEventToTaskMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucReferrable(EcucReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucModule(EcucModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucContainer(EcucContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOs(Os object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTask(OsTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Exclusive Area Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Exclusive Area Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteExclusiveAreaImplementation(RteExclusiveAreaImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsEvent(OsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCom(Com object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComConfig(ComConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignal(ComSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalGroup(ComSignalGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Group Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Group Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComGroupSignal(ComGroupSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsAlarm(OsAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsResource(OsResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsApplication(OsApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecu C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecu C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcuC(EcuC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucPartitionCollection(EcucPartitionCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucPartition(EcucPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Spinlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Spinlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsSpinlock(OsSpinlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Os Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Os Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteOsInteraction(RteOsInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Used Os Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Used Os Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteUsedOsActivation(RteUsedOsActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Initialization Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Initialization Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteInitializationBehavior(RteInitializationBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Ioc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Ioc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsIoc(OsIoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Ioc Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Ioc Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsIocCommunication(OsIocCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Ioc Sender Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Ioc Sender Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsIocSenderProperties(OsIocSenderProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Ioc Receiver Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Ioc Receiver Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsIocReceiverProperties(OsIocReceiverProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Ioc Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Ioc Data Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsIocDataProperties(OsIocDataProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Application Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Application Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsApplicationTrustedFunction(OsApplicationTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os OS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os OS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsOS(OsOS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw Event To Task Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswEventToTaskMapping(RteBswEventToTaskMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswRequiredModeGroupConnection(RteBswRequiredModeGroupConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw Module Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswModuleInstance(RteBswModuleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswExclusiveAreaImpl(RteBswExclusiveAreaImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os System Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os System Cycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsSystemCycle(OsSystemCycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcucSwitch
