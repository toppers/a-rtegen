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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.*;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System;
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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package
 * @generated
 */
public class M2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Switch() {
		if (modelPackage == null) {
			modelPackage = M2Package.eINSTANCE;
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
			case M2Package.M2_ROOT: {
				M2Root m2Root = (M2Root)theEObject;
				T result = caseM2Root(m2Root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AUTOSAR: {
				Autosar autosar = (Autosar)theEObject;
				T result = caseAutosar(autosar);
				if (result == null) result = caseM2Object(autosar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AR_PACKAGE: {
				ArPackage arPackage = (ArPackage)theEObject;
				T result = caseArPackage(arPackage);
				if (result == null) result = caseIdentifiable(arPackage);
				if (result == null) result = caseReferrable(arPackage);
				if (result == null) result = caseM2Object(arPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AR_ELEMENT: {
				ArElement arElement = (ArElement)theEObject;
				T result = caseArElement(arElement);
				if (result == null) result = caseIdentifiable(arElement);
				if (result == null) result = caseReferrable(arElement);
				if (result == null) result = caseM2Object(arElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = caseReferrable(identifiable);
				if (result == null) result = caseM2Object(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.M2_OBJECT: {
				M2Object m2Object = (M2Object)theEObject;
				T result = caseM2Object(m2Object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_BASE_TYPE: {
				SwBaseType swBaseType = (SwBaseType)theEObject;
				T result = caseSwBaseType(swBaseType);
				if (result == null) result = caseArElement(swBaseType);
				if (result == null) result = caseIdentifiable(swBaseType);
				if (result == null) result = caseReferrable(swBaseType);
				if (result == null) result = caseM2Object(swBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_RECEIVER_INTERFACE: {
				SenderReceiverInterface senderReceiverInterface = (SenderReceiverInterface)theEObject;
				T result = caseSenderReceiverInterface(senderReceiverInterface);
				if (result == null) result = casePortInterface(senderReceiverInterface);
				if (result == null) result = caseArElement(senderReceiverInterface);
				if (result == null) result = caseIdentifiable(senderReceiverInterface);
				if (result == null) result = caseReferrable(senderReceiverInterface);
				if (result == null) result = caseM2Object(senderReceiverInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.VARIABLE_DATA_PROTOTYPE: {
				VariableDataPrototype variableDataPrototype = (VariableDataPrototype)theEObject;
				T result = caseVariableDataPrototype(variableDataPrototype);
				if (result == null) result = caseAutosarDataPrototype(variableDataPrototype);
				if (result == null) result = caseDataPrototype(variableDataPrototype);
				if (result == null) result = caseIdentifiable(variableDataPrototype);
				if (result == null) result = caseReferrable(variableDataPrototype);
				if (result == null) result = caseM2Object(variableDataPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.REFERRABLE: {
				Referrable referrable = (Referrable)theEObject;
				T result = caseReferrable(referrable);
				if (result == null) result = caseM2Object(referrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_COMPONENT_TYPE: {
				SwComponentType swComponentType = (SwComponentType)theEObject;
				T result = caseSwComponentType(swComponentType);
				if (result == null) result = caseArElement(swComponentType);
				if (result == null) result = caseIdentifiable(swComponentType);
				if (result == null) result = caseReferrable(swComponentType);
				if (result == null) result = caseM2Object(swComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_PROTOTYPE: {
				PortPrototype portPrototype = (PortPrototype)theEObject;
				T result = casePortPrototype(portPrototype);
				if (result == null) result = caseIdentifiable(portPrototype);
				if (result == null) result = caseReferrable(portPrototype);
				if (result == null) result = caseM2Object(portPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ATOMIC_SW_COMPONENT_TYPE: {
				AtomicSwComponentType atomicSwComponentType = (AtomicSwComponentType)theEObject;
				T result = caseAtomicSwComponentType(atomicSwComponentType);
				if (result == null) result = caseSwComponentType(atomicSwComponentType);
				if (result == null) result = caseArElement(atomicSwComponentType);
				if (result == null) result = caseIdentifiable(atomicSwComponentType);
				if (result == null) result = caseReferrable(atomicSwComponentType);
				if (result == null) result = caseM2Object(atomicSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.APPLICATION_SW_COMPONENT_TYPE: {
				ApplicationSwComponentType applicationSwComponentType = (ApplicationSwComponentType)theEObject;
				T result = caseApplicationSwComponentType(applicationSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(applicationSwComponentType);
				if (result == null) result = caseSwComponentType(applicationSwComponentType);
				if (result == null) result = caseArElement(applicationSwComponentType);
				if (result == null) result = caseIdentifiable(applicationSwComponentType);
				if (result == null) result = caseReferrable(applicationSwComponentType);
				if (result == null) result = caseM2Object(applicationSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RPORT_PROTOTYPE: {
				RPortPrototype rPortPrototype = (RPortPrototype)theEObject;
				T result = caseRPortPrototype(rPortPrototype);
				if (result == null) result = casePortPrototype(rPortPrototype);
				if (result == null) result = caseIdentifiable(rPortPrototype);
				if (result == null) result = caseReferrable(rPortPrototype);
				if (result == null) result = caseM2Object(rPortPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PPORT_PROTOTYPE: {
				PPortPrototype pPortPrototype = (PPortPrototype)theEObject;
				T result = casePPortPrototype(pPortPrototype);
				if (result == null) result = casePortPrototype(pPortPrototype);
				if (result == null) result = caseIdentifiable(pPortPrototype);
				if (result == null) result = caseReferrable(pPortPrototype);
				if (result == null) result = caseM2Object(pPortPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SWC_INTERNAL_BEHAVIOR: {
				SwcInternalBehavior swcInternalBehavior = (SwcInternalBehavior)theEObject;
				T result = caseSwcInternalBehavior(swcInternalBehavior);
				if (result == null) result = caseInternalBehavior(swcInternalBehavior);
				if (result == null) result = caseIdentifiable(swcInternalBehavior);
				if (result == null) result = caseReferrable(swcInternalBehavior);
				if (result == null) result = caseM2Object(swcInternalBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.EXECUTABLE_ENTITY: {
				ExecutableEntity executableEntity = (ExecutableEntity)theEObject;
				T result = caseExecutableEntity(executableEntity);
				if (result == null) result = caseIdentifiable(executableEntity);
				if (result == null) result = caseReferrable(executableEntity);
				if (result == null) result = caseM2Object(executableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RUNNABLE_ENTITY: {
				RunnableEntity runnableEntity = (RunnableEntity)theEObject;
				T result = caseRunnableEntity(runnableEntity);
				if (result == null) result = caseExecutableEntity(runnableEntity);
				if (result == null) result = caseIdentifiable(runnableEntity);
				if (result == null) result = caseReferrable(runnableEntity);
				if (result == null) result = caseM2Object(runnableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.VARIABLE_ACCESS: {
				VariableAccess variableAccess = (VariableAccess)theEObject;
				T result = caseVariableAccess(variableAccess);
				if (result == null) result = caseIdentifiable(variableAccess);
				if (result == null) result = caseReferrable(variableAccess);
				if (result == null) result = caseM2Object(variableAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AUTOSAR_VARIABLE_REF: {
				AutosarVariableRef autosarVariableRef = (AutosarVariableRef)theEObject;
				T result = caseAutosarVariableRef(autosarVariableRef);
				if (result == null) result = caseM2Object(autosarVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF: {
				VariableInAtomicSwcTypeInstanceRef variableInAtomicSwcTypeInstanceRef = (VariableInAtomicSwcTypeInstanceRef)theEObject;
				T result = caseVariableInAtomicSwcTypeInstanceRef(variableInAtomicSwcTypeInstanceRef);
				if (result == null) result = caseM2Object(variableInAtomicSwcTypeInstanceRef);
				if (result == null) result = caseIInstanceRef(variableInAtomicSwcTypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RTE_EVENT: {
				RteEvent rteEvent = (RteEvent)theEObject;
				T result = caseRteEvent(rteEvent);
				if (result == null) result = caseIdentifiable(rteEvent);
				if (result == null) result = caseReferrable(rteEvent);
				if (result == null) result = caseM2Object(rteEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.TIMING_EVENT: {
				TimingEvent timingEvent = (TimingEvent)theEObject;
				T result = caseTimingEvent(timingEvent);
				if (result == null) result = caseRteEvent(timingEvent);
				if (result == null) result = caseIdentifiable(timingEvent);
				if (result == null) result = caseReferrable(timingEvent);
				if (result == null) result = caseM2Object(timingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BACKGROUND_EVENT: {
				BackgroundEvent backgroundEvent = (BackgroundEvent)theEObject;
				T result = caseBackgroundEvent(backgroundEvent);
				if (result == null) result = caseRteEvent(backgroundEvent);
				if (result == null) result = caseIdentifiable(backgroundEvent);
				if (result == null) result = caseReferrable(backgroundEvent);
				if (result == null) result = caseM2Object(backgroundEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_SEND_COMPLETED_EVENT: {
				DataSendCompletedEvent dataSendCompletedEvent = (DataSendCompletedEvent)theEObject;
				T result = caseDataSendCompletedEvent(dataSendCompletedEvent);
				if (result == null) result = caseRteEvent(dataSendCompletedEvent);
				if (result == null) result = caseIdentifiable(dataSendCompletedEvent);
				if (result == null) result = caseReferrable(dataSendCompletedEvent);
				if (result == null) result = caseM2Object(dataSendCompletedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_RECEIVED_EVENT: {
				DataReceivedEvent dataReceivedEvent = (DataReceivedEvent)theEObject;
				T result = caseDataReceivedEvent(dataReceivedEvent);
				if (result == null) result = caseRteEvent(dataReceivedEvent);
				if (result == null) result = caseIdentifiable(dataReceivedEvent);
				if (result == null) result = caseReferrable(dataReceivedEvent);
				if (result == null) result = caseM2Object(dataReceivedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_RECEIVE_ERROR_EVENT: {
				DataReceiveErrorEvent dataReceiveErrorEvent = (DataReceiveErrorEvent)theEObject;
				T result = caseDataReceiveErrorEvent(dataReceiveErrorEvent);
				if (result == null) result = caseRteEvent(dataReceiveErrorEvent);
				if (result == null) result = caseIdentifiable(dataReceiveErrorEvent);
				if (result == null) result = caseReferrable(dataReceiveErrorEvent);
				if (result == null) result = caseM2Object(dataReceiveErrorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF: {
				RVariableInAtomicSwcInstanceRef rVariableInAtomicSwcInstanceRef = (RVariableInAtomicSwcInstanceRef)theEObject;
				T result = caseRVariableInAtomicSwcInstanceRef(rVariableInAtomicSwcInstanceRef);
				if (result == null) result = caseM2Object(rVariableInAtomicSwcInstanceRef);
				if (result == null) result = caseIInstanceRef(rVariableInAtomicSwcInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES: {
				EcucModuleConfigurationValues ecucModuleConfigurationValues = (EcucModuleConfigurationValues)theEObject;
				T result = caseEcucModuleConfigurationValues(ecucModuleConfigurationValues);
				if (result == null) result = caseArElement(ecucModuleConfigurationValues);
				if (result == null) result = caseIdentifiable(ecucModuleConfigurationValues);
				if (result == null) result = caseReferrable(ecucModuleConfigurationValues);
				if (result == null) result = caseM2Object(ecucModuleConfigurationValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_CONTAINER_VALUE: {
				EcucContainerValue ecucContainerValue = (EcucContainerValue)theEObject;
				T result = caseEcucContainerValue(ecucContainerValue);
				if (result == null) result = caseIdentifiable(ecucContainerValue);
				if (result == null) result = caseReferrable(ecucContainerValue);
				if (result == null) result = caseM2Object(ecucContainerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_PARAMETER_VALUE: {
				EcucParameterValue ecucParameterValue = (EcucParameterValue)theEObject;
				T result = caseEcucParameterValue(ecucParameterValue);
				if (result == null) result = caseM2Object(ecucParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_NUMERICAL_PARAM_VALUE: {
				EcucNumericalParamValue ecucNumericalParamValue = (EcucNumericalParamValue)theEObject;
				T result = caseEcucNumericalParamValue(ecucNumericalParamValue);
				if (result == null) result = caseEcucParameterValue(ecucNumericalParamValue);
				if (result == null) result = caseM2Object(ecucNumericalParamValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_TEXTUAL_PARAM_VALUE: {
				EcucTextualParamValue ecucTextualParamValue = (EcucTextualParamValue)theEObject;
				T result = caseEcucTextualParamValue(ecucTextualParamValue);
				if (result == null) result = caseEcucParameterValue(ecucTextualParamValue);
				if (result == null) result = caseM2Object(ecucTextualParamValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_ABSTRACT_REFERENCE_VALUE: {
				EcucAbstractReferenceValue ecucAbstractReferenceValue = (EcucAbstractReferenceValue)theEObject;
				T result = caseEcucAbstractReferenceValue(ecucAbstractReferenceValue);
				if (result == null) result = caseM2Object(ecucAbstractReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_REFERENCE_VALUE: {
				EcucReferenceValue ecucReferenceValue = (EcucReferenceValue)theEObject;
				T result = caseEcucReferenceValue(ecucReferenceValue);
				if (result == null) result = caseEcucAbstractReferenceValue(ecucReferenceValue);
				if (result == null) result = caseM2Object(ecucReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_INSTANCE_REFERENCE_VALUE: {
				EcucInstanceReferenceValue ecucInstanceReferenceValue = (EcucInstanceReferenceValue)theEObject;
				T result = caseEcucInstanceReferenceValue(ecucInstanceReferenceValue);
				if (result == null) result = caseEcucAbstractReferenceValue(ecucInstanceReferenceValue);
				if (result == null) result = caseM2Object(ecucInstanceReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RPORT_COM_SPEC: {
				RPortComSpec rPortComSpec = (RPortComSpec)theEObject;
				T result = caseRPortComSpec(rPortComSpec);
				if (result == null) result = caseM2Object(rPortComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PPORT_COM_SPEC: {
				PPortComSpec pPortComSpec = (PPortComSpec)theEObject;
				T result = casePPortComSpec(pPortComSpec);
				if (result == null) result = caseM2Object(pPortComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RECEIVER_COM_SPEC: {
				ReceiverComSpec receiverComSpec = (ReceiverComSpec)theEObject;
				T result = caseReceiverComSpec(receiverComSpec);
				if (result == null) result = caseRPortComSpec(receiverComSpec);
				if (result == null) result = caseM2Object(receiverComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_COM_SPEC: {
				SenderComSpec senderComSpec = (SenderComSpec)theEObject;
				T result = caseSenderComSpec(senderComSpec);
				if (result == null) result = casePPortComSpec(senderComSpec);
				if (result == null) result = caseM2Object(senderComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.TRANSMISSION_ACKNOWLEDGEMENT_REQUEST: {
				TransmissionAcknowledgementRequest transmissionAcknowledgementRequest = (TransmissionAcknowledgementRequest)theEObject;
				T result = caseTransmissionAcknowledgementRequest(transmissionAcknowledgementRequest);
				if (result == null) result = caseM2Object(transmissionAcknowledgementRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.NONQUEUED_SENDER_COM_SPEC: {
				NonqueuedSenderComSpec nonqueuedSenderComSpec = (NonqueuedSenderComSpec)theEObject;
				T result = caseNonqueuedSenderComSpec(nonqueuedSenderComSpec);
				if (result == null) result = caseSenderComSpec(nonqueuedSenderComSpec);
				if (result == null) result = casePPortComSpec(nonqueuedSenderComSpec);
				if (result == null) result = caseM2Object(nonqueuedSenderComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.QUEUED_SENDER_COM_SPEC: {
				QueuedSenderComSpec queuedSenderComSpec = (QueuedSenderComSpec)theEObject;
				T result = caseQueuedSenderComSpec(queuedSenderComSpec);
				if (result == null) result = caseSenderComSpec(queuedSenderComSpec);
				if (result == null) result = casePPortComSpec(queuedSenderComSpec);
				if (result == null) result = caseM2Object(queuedSenderComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC: {
				NonqueuedReceiverComSpec nonqueuedReceiverComSpec = (NonqueuedReceiverComSpec)theEObject;
				T result = caseNonqueuedReceiverComSpec(nonqueuedReceiverComSpec);
				if (result == null) result = caseReceiverComSpec(nonqueuedReceiverComSpec);
				if (result == null) result = caseRPortComSpec(nonqueuedReceiverComSpec);
				if (result == null) result = caseM2Object(nonqueuedReceiverComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_INTERFACE: {
				PortInterface portInterface = (PortInterface)theEObject;
				T result = casePortInterface(portInterface);
				if (result == null) result = caseArElement(portInterface);
				if (result == null) result = caseIdentifiable(portInterface);
				if (result == null) result = caseReferrable(portInterface);
				if (result == null) result = caseM2Object(portInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPOSITION_SW_COMPONENT_TYPE: {
				CompositionSwComponentType compositionSwComponentType = (CompositionSwComponentType)theEObject;
				T result = caseCompositionSwComponentType(compositionSwComponentType);
				if (result == null) result = caseSwComponentType(compositionSwComponentType);
				if (result == null) result = caseArElement(compositionSwComponentType);
				if (result == null) result = caseIdentifiable(compositionSwComponentType);
				if (result == null) result = caseReferrable(compositionSwComponentType);
				if (result == null) result = caseM2Object(compositionSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_CONNECTOR: {
				SwConnector swConnector = (SwConnector)theEObject;
				T result = caseSwConnector(swConnector);
				if (result == null) result = caseIdentifiable(swConnector);
				if (result == null) result = caseReferrable(swConnector);
				if (result == null) result = caseM2Object(swConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ASSEMBLY_SW_CONNECTOR: {
				AssemblySwConnector assemblySwConnector = (AssemblySwConnector)theEObject;
				T result = caseAssemblySwConnector(assemblySwConnector);
				if (result == null) result = caseSwConnector(assemblySwConnector);
				if (result == null) result = caseIdentifiable(assemblySwConnector);
				if (result == null) result = caseReferrable(assemblySwConnector);
				if (result == null) result = caseM2Object(assemblySwConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DELEGATION_SW_CONNECTOR: {
				DelegationSwConnector delegationSwConnector = (DelegationSwConnector)theEObject;
				T result = caseDelegationSwConnector(delegationSwConnector);
				if (result == null) result = caseSwConnector(delegationSwConnector);
				if (result == null) result = caseIdentifiable(delegationSwConnector);
				if (result == null) result = caseReferrable(delegationSwConnector);
				if (result == null) result = caseM2Object(delegationSwConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF: {
				PortPrototypeInCompositionInstanceRef portPrototypeInCompositionInstanceRef = (PortPrototypeInCompositionInstanceRef)theEObject;
				T result = casePortPrototypeInCompositionInstanceRef(portPrototypeInCompositionInstanceRef);
				if (result == null) result = caseM2Object(portPrototypeInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(portPrototypeInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF: {
				RPortPrototypeInCompositionInstanceRef rPortPrototypeInCompositionInstanceRef = (RPortPrototypeInCompositionInstanceRef)theEObject;
				T result = caseRPortPrototypeInCompositionInstanceRef(rPortPrototypeInCompositionInstanceRef);
				if (result == null) result = casePortPrototypeInCompositionInstanceRef(rPortPrototypeInCompositionInstanceRef);
				if (result == null) result = caseM2Object(rPortPrototypeInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(rPortPrototypeInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF: {
				PPortPrototypeInCompositionInstanceRef pPortPrototypeInCompositionInstanceRef = (PPortPrototypeInCompositionInstanceRef)theEObject;
				T result = casePPortPrototypeInCompositionInstanceRef(pPortPrototypeInCompositionInstanceRef);
				if (result == null) result = casePortPrototypeInCompositionInstanceRef(pPortPrototypeInCompositionInstanceRef);
				if (result == null) result = caseM2Object(pPortPrototypeInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(pPortPrototypeInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_COMPONENT_PROTOTYPE: {
				SwComponentPrototype swComponentPrototype = (SwComponentPrototype)theEObject;
				T result = caseSwComponentPrototype(swComponentPrototype);
				if (result == null) result = caseIdentifiable(swComponentPrototype);
				if (result == null) result = caseReferrable(swComponentPrototype);
				if (result == null) result = caseM2Object(swComponentPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = caseM2Object(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AUTOSAR_DATA_TYPE: {
				AutosarDataType autosarDataType = (AutosarDataType)theEObject;
				T result = caseAutosarDataType(autosarDataType);
				if (result == null) result = caseArElement(autosarDataType);
				if (result == null) result = caseIdentifiable(autosarDataType);
				if (result == null) result = caseReferrable(autosarDataType);
				if (result == null) result = caseM2Object(autosarDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.APPLICATION_DATA_TYPE: {
				ApplicationDataType applicationDataType = (ApplicationDataType)theEObject;
				T result = caseApplicationDataType(applicationDataType);
				if (result == null) result = caseAutosarDataType(applicationDataType);
				if (result == null) result = caseArElement(applicationDataType);
				if (result == null) result = caseIdentifiable(applicationDataType);
				if (result == null) result = caseReferrable(applicationDataType);
				if (result == null) result = caseM2Object(applicationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.IMPLEMENTATION_DATA_TYPE: {
				ImplementationDataType implementationDataType = (ImplementationDataType)theEObject;
				T result = caseImplementationDataType(implementationDataType);
				if (result == null) result = caseAutosarDataType(implementationDataType);
				if (result == null) result = caseArElement(implementationDataType);
				if (result == null) result = caseIdentifiable(implementationDataType);
				if (result == null) result = caseReferrable(implementationDataType);
				if (result == null) result = caseM2Object(implementationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.IMPLEMENTATION_DATA_TYPE_ELEMENT: {
				ImplementationDataTypeElement implementationDataTypeElement = (ImplementationDataTypeElement)theEObject;
				T result = caseImplementationDataTypeElement(implementationDataTypeElement);
				if (result == null) result = caseIdentifiable(implementationDataTypeElement);
				if (result == null) result = caseReferrable(implementationDataTypeElement);
				if (result == null) result = caseM2Object(implementationDataTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_DATA_DEF_PROPS: {
				SwDataDefProps swDataDefProps = (SwDataDefProps)theEObject;
				T result = caseSwDataDefProps(swDataDefProps);
				if (result == null) result = caseM2Object(swDataDefProps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_TYPE_MAP: {
				DataTypeMap dataTypeMap = (DataTypeMap)theEObject;
				T result = caseDataTypeMap(dataTypeMap);
				if (result == null) result = caseM2Object(dataTypeMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_TYPE_MAPPING_SET: {
				DataTypeMappingSet dataTypeMappingSet = (DataTypeMappingSet)theEObject;
				T result = caseDataTypeMappingSet(dataTypeMappingSet);
				if (result == null) result = caseArElement(dataTypeMappingSet);
				if (result == null) result = caseIdentifiable(dataTypeMappingSet);
				if (result == null) result = caseReferrable(dataTypeMappingSet);
				if (result == null) result = caseM2Object(dataTypeMappingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.MODE_DECLARATION_GROUP_PROTOTYPE: {
				ModeDeclarationGroupPrototype modeDeclarationGroupPrototype = (ModeDeclarationGroupPrototype)theEObject;
				T result = caseModeDeclarationGroupPrototype(modeDeclarationGroupPrototype);
				if (result == null) result = caseArElement(modeDeclarationGroupPrototype);
				if (result == null) result = caseIdentifiable(modeDeclarationGroupPrototype);
				if (result == null) result = caseReferrable(modeDeclarationGroupPrototype);
				if (result == null) result = caseM2Object(modeDeclarationGroupPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.MODE_REQUEST_TYPE_MAP: {
				ModeRequestTypeMap modeRequestTypeMap = (ModeRequestTypeMap)theEObject;
				T result = caseModeRequestTypeMap(modeRequestTypeMap);
				if (result == null) result = caseM2Object(modeRequestTypeMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.MODE_DECLARATION: {
				ModeDeclaration modeDeclaration = (ModeDeclaration)theEObject;
				T result = caseModeDeclaration(modeDeclaration);
				if (result == null) result = caseArElement(modeDeclaration);
				if (result == null) result = caseIdentifiable(modeDeclaration);
				if (result == null) result = caseReferrable(modeDeclaration);
				if (result == null) result = caseM2Object(modeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.MODE_DECLARATION_GROUP: {
				ModeDeclarationGroup modeDeclarationGroup = (ModeDeclarationGroup)theEObject;
				T result = caseModeDeclarationGroup(modeDeclarationGroup);
				if (result == null) result = caseArElement(modeDeclarationGroup);
				if (result == null) result = caseIdentifiable(modeDeclarationGroup);
				if (result == null) result = caseReferrable(modeDeclarationGroup);
				if (result == null) result = caseM2Object(modeDeclarationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.APPLICATION_PRIMITIVE_DATA_TYPE: {
				ApplicationPrimitiveDataType applicationPrimitiveDataType = (ApplicationPrimitiveDataType)theEObject;
				T result = caseApplicationPrimitiveDataType(applicationPrimitiveDataType);
				if (result == null) result = caseApplicationDataType(applicationPrimitiveDataType);
				if (result == null) result = caseAutosarDataType(applicationPrimitiveDataType);
				if (result == null) result = caseArElement(applicationPrimitiveDataType);
				if (result == null) result = caseIdentifiable(applicationPrimitiveDataType);
				if (result == null) result = caseReferrable(applicationPrimitiveDataType);
				if (result == null) result = caseM2Object(applicationPrimitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.AUTOSAR_DATA_PROTOTYPE: {
				AutosarDataPrototype autosarDataPrototype = (AutosarDataPrototype)theEObject;
				T result = caseAutosarDataPrototype(autosarDataPrototype);
				if (result == null) result = caseDataPrototype(autosarDataPrototype);
				if (result == null) result = caseIdentifiable(autosarDataPrototype);
				if (result == null) result = caseReferrable(autosarDataPrototype);
				if (result == null) result = caseM2Object(autosarDataPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_PROTOTYPE: {
				DataPrototype dataPrototype = (DataPrototype)theEObject;
				T result = caseDataPrototype(dataPrototype);
				if (result == null) result = caseIdentifiable(dataPrototype);
				if (result == null) result = caseReferrable(dataPrototype);
				if (result == null) result = caseM2Object(dataPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.EXCLUSIVE_AREA: {
				ExclusiveArea exclusiveArea = (ExclusiveArea)theEObject;
				T result = caseExclusiveArea(exclusiveArea);
				if (result == null) result = caseIdentifiable(exclusiveArea);
				if (result == null) result = caseReferrable(exclusiveArea);
				if (result == null) result = caseM2Object(exclusiveArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.NUMERICAL_VALUE_SPECIFICATION: {
				NumericalValueSpecification numericalValueSpecification = (NumericalValueSpecification)theEObject;
				T result = caseNumericalValueSpecification(numericalValueSpecification);
				if (result == null) result = caseValueSpecification(numericalValueSpecification);
				if (result == null) result = caseM2Object(numericalValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.TEXT_VALUE_SPECIFICATION: {
				TextValueSpecification textValueSpecification = (TextValueSpecification)theEObject;
				T result = caseTextValueSpecification(textValueSpecification);
				if (result == null) result = caseValueSpecification(textValueSpecification);
				if (result == null) result = caseM2Object(textValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.CONSTANT_REFERENCE: {
				ConstantReference constantReference = (ConstantReference)theEObject;
				T result = caseConstantReference(constantReference);
				if (result == null) result = caseValueSpecification(constantReference);
				if (result == null) result = caseM2Object(constantReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.REFERENCE_VALUE_SPECIFICATION: {
				ReferenceValueSpecification referenceValueSpecification = (ReferenceValueSpecification)theEObject;
				T result = caseReferenceValueSpecification(referenceValueSpecification);
				if (result == null) result = caseValueSpecification(referenceValueSpecification);
				if (result == null) result = caseM2Object(referenceValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ARRAY_VALUE_SPECIFICATION: {
				ArrayValueSpecification arrayValueSpecification = (ArrayValueSpecification)theEObject;
				T result = caseArrayValueSpecification(arrayValueSpecification);
				if (result == null) result = caseValueSpecification(arrayValueSpecification);
				if (result == null) result = caseM2Object(arrayValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RECORD_VALUE_SPECIFICATION: {
				RecordValueSpecification recordValueSpecification = (RecordValueSpecification)theEObject;
				T result = caseRecordValueSpecification(recordValueSpecification);
				if (result == null) result = caseValueSpecification(recordValueSpecification);
				if (result == null) result = caseM2Object(recordValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.APPLICATION_VALUE_SPECIFICATION: {
				ApplicationValueSpecification applicationValueSpecification = (ApplicationValueSpecification)theEObject;
				T result = caseApplicationValueSpecification(applicationValueSpecification);
				if (result == null) result = caseValueSpecification(applicationValueSpecification);
				if (result == null) result = caseM2Object(applicationValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.CONSTANT_SPECIFICATION: {
				ConstantSpecification constantSpecification = (ConstantSpecification)theEObject;
				T result = caseConstantSpecification(constantSpecification);
				if (result == null) result = caseArElement(constantSpecification);
				if (result == null) result = caseIdentifiable(constantSpecification);
				if (result == null) result = caseReferrable(constantSpecification);
				if (result == null) result = caseM2Object(constantSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.OPERATION_INVOKED_EVENT: {
				OperationInvokedEvent operationInvokedEvent = (OperationInvokedEvent)theEObject;
				T result = caseOperationInvokedEvent(operationInvokedEvent);
				if (result == null) result = caseRteEvent(operationInvokedEvent);
				if (result == null) result = caseIdentifiable(operationInvokedEvent);
				if (result == null) result = caseReferrable(operationInvokedEvent);
				if (result == null) result = caseM2Object(operationInvokedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF: {
				POperationInAtomicSwcInstanceRef pOperationInAtomicSwcInstanceRef = (POperationInAtomicSwcInstanceRef)theEObject;
				T result = casePOperationInAtomicSwcInstanceRef(pOperationInAtomicSwcInstanceRef);
				if (result == null) result = caseM2Object(pOperationInAtomicSwcInstanceRef);
				if (result == null) result = caseIInstanceRef(pOperationInAtomicSwcInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.CLIENT_SERVER_INTERFACE: {
				ClientServerInterface clientServerInterface = (ClientServerInterface)theEObject;
				T result = caseClientServerInterface(clientServerInterface);
				if (result == null) result = casePortInterface(clientServerInterface);
				if (result == null) result = caseArElement(clientServerInterface);
				if (result == null) result = caseIdentifiable(clientServerInterface);
				if (result == null) result = caseReferrable(clientServerInterface);
				if (result == null) result = caseM2Object(clientServerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.CLIENT_SERVER_OPERATION: {
				ClientServerOperation clientServerOperation = (ClientServerOperation)theEObject;
				T result = caseClientServerOperation(clientServerOperation);
				if (result == null) result = caseIdentifiable(clientServerOperation);
				if (result == null) result = caseReferrable(clientServerOperation);
				if (result == null) result = caseM2Object(clientServerOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.APPLICATION_ERROR: {
				ApplicationError applicationError = (ApplicationError)theEObject;
				T result = caseApplicationError(applicationError);
				if (result == null) result = caseIdentifiable(applicationError);
				if (result == null) result = caseReferrable(applicationError);
				if (result == null) result = caseM2Object(applicationError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ARGUMENT_DATA_PROTOTYPE: {
				ArgumentDataPrototype argumentDataPrototype = (ArgumentDataPrototype)theEObject;
				T result = caseArgumentDataPrototype(argumentDataPrototype);
				if (result == null) result = caseAutosarDataPrototype(argumentDataPrototype);
				if (result == null) result = caseDataPrototype(argumentDataPrototype);
				if (result == null) result = caseIdentifiable(argumentDataPrototype);
				if (result == null) result = caseReferrable(argumentDataPrototype);
				if (result == null) result = caseM2Object(argumentDataPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_FILTER: {
				DataFilter dataFilter = (DataFilter)theEObject;
				T result = caseDataFilter(dataFilter);
				if (result == null) result = caseM2Object(dataFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.QUEUED_RECEIVER_COM_SPEC: {
				QueuedReceiverComSpec queuedReceiverComSpec = (QueuedReceiverComSpec)theEObject;
				T result = caseQueuedReceiverComSpec(queuedReceiverComSpec);
				if (result == null) result = caseReceiverComSpec(queuedReceiverComSpec);
				if (result == null) result = caseRPortComSpec(queuedReceiverComSpec);
				if (result == null) result = caseM2Object(queuedReceiverComSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.INVALIDATION_POLICY: {
				InvalidationPolicy invalidationPolicy = (InvalidationPolicy)theEObject;
				T result = caseInvalidationPolicy(invalidationPolicy);
				if (result == null) result = caseM2Object(invalidationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_API_OPTION: {
				PortApiOption portApiOption = (PortApiOption)theEObject;
				T result = casePortApiOption(portApiOption);
				if (result == null) result = caseM2Object(portApiOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_DEFINED_ARGUMENT_VALUE: {
				PortDefinedArgumentValue portDefinedArgumentValue = (PortDefinedArgumentValue)theEObject;
				T result = casePortDefinedArgumentValue(portDefinedArgumentValue);
				if (result == null) result = caseM2Object(portDefinedArgumentValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.INCLUDED_DATA_TYPE_SET: {
				IncludedDataTypeSet includedDataTypeSet = (IncludedDataTypeSet)theEObject;
				T result = caseIncludedDataTypeSet(includedDataTypeSet);
				if (result == null) result = caseM2Object(includedDataTypeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SYSTEM: {
				System system = (System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseArElement(system);
				if (result == null) result = caseIdentifiable(system);
				if (result == null) result = caseReferrable(system);
				if (result == null) result = caseM2Object(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ROOT_SW_COMPOSITION_PROTOTYPE: {
				RootSwCompositionPrototype rootSwCompositionPrototype = (RootSwCompositionPrototype)theEObject;
				T result = caseRootSwCompositionPrototype(rootSwCompositionPrototype);
				if (result == null) result = caseIdentifiable(rootSwCompositionPrototype);
				if (result == null) result = caseReferrable(rootSwCompositionPrototype);
				if (result == null) result = caseM2Object(rootSwCompositionPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SYSTEM_MAPPING: {
				SystemMapping systemMapping = (SystemMapping)theEObject;
				T result = caseSystemMapping(systemMapping);
				if (result == null) result = caseIdentifiable(systemMapping);
				if (result == null) result = caseReferrable(systemMapping);
				if (result == null) result = caseM2Object(systemMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_MAPPING: {
				DataMapping dataMapping = (DataMapping)theEObject;
				T result = caseDataMapping(dataMapping);
				if (result == null) result = caseM2Object(dataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SYSTEM_SIGNAL: {
				SystemSignal systemSignal = (SystemSignal)theEObject;
				T result = caseSystemSignal(systemSignal);
				if (result == null) result = caseArElement(systemSignal);
				if (result == null) result = caseIdentifiable(systemSignal);
				if (result == null) result = caseReferrable(systemSignal);
				if (result == null) result = caseM2Object(systemSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ISIGNAL: {
				ISignal iSignal = (ISignal)theEObject;
				T result = caseISignal(iSignal);
				if (result == null) result = caseArElement(iSignal);
				if (result == null) result = caseIdentifiable(iSignal);
				if (result == null) result = caseReferrable(iSignal);
				if (result == null) result = caseM2Object(iSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ISIGNAL_IPDU: {
				ISignalIPdu iSignalIPdu = (ISignalIPdu)theEObject;
				T result = caseISignalIPdu(iSignalIPdu);
				if (result == null) result = caseArElement(iSignalIPdu);
				if (result == null) result = caseIdentifiable(iSignalIPdu);
				if (result == null) result = caseReferrable(iSignalIPdu);
				if (result == null) result = caseM2Object(iSignalIPdu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ISIGNAL_TO_IPDU_MAPPING: {
				ISignalToIPduMapping iSignalToIPduMapping = (ISignalToIPduMapping)theEObject;
				T result = caseISignalToIPduMapping(iSignalToIPduMapping);
				if (result == null) result = caseIdentifiable(iSignalToIPduMapping);
				if (result == null) result = caseReferrable(iSignalToIPduMapping);
				if (result == null) result = caseM2Object(iSignalToIPduMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_MAPPING: {
				SenderReceiverToSignalMapping senderReceiverToSignalMapping = (SenderReceiverToSignalMapping)theEObject;
				T result = caseSenderReceiverToSignalMapping(senderReceiverToSignalMapping);
				if (result == null) result = caseDataMapping(senderReceiverToSignalMapping);
				if (result == null) result = caseM2Object(senderReceiverToSignalMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING: {
				SenderReceiverToSignalGroupMapping senderReceiverToSignalGroupMapping = (SenderReceiverToSignalGroupMapping)theEObject;
				T result = caseSenderReceiverToSignalGroupMapping(senderReceiverToSignalGroupMapping);
				if (result == null) result = caseDataMapping(senderReceiverToSignalGroupMapping);
				if (result == null) result = caseM2Object(senderReceiverToSignalGroupMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF: {
				VariableDataPrototypeInSystemInstanceRef variableDataPrototypeInSystemInstanceRef = (VariableDataPrototypeInSystemInstanceRef)theEObject;
				T result = caseVariableDataPrototypeInSystemInstanceRef(variableDataPrototypeInSystemInstanceRef);
				if (result == null) result = caseM2Object(variableDataPrototypeInSystemInstanceRef);
				if (result == null) result = caseIInstanceRef(variableDataPrototypeInSystemInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECUC_VALUE_COLLECTION: {
				EcucValueCollection ecucValueCollection = (EcucValueCollection)theEObject;
				T result = caseEcucValueCollection(ecucValueCollection);
				if (result == null) result = caseArElement(ecucValueCollection);
				if (result == null) result = caseIdentifiable(ecucValueCollection);
				if (result == null) result = caseReferrable(ecucValueCollection);
				if (result == null) result = caseM2Object(ecucValueCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SERVER_CALL_POINT: {
				ServerCallPoint serverCallPoint = (ServerCallPoint)theEObject;
				T result = caseServerCallPoint(serverCallPoint);
				if (result == null) result = caseIdentifiable(serverCallPoint);
				if (result == null) result = caseReferrable(serverCallPoint);
				if (result == null) result = caseM2Object(serverCallPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SYNCHRONOUS_SERVER_CALL_POINT: {
				SynchronousServerCallPoint synchronousServerCallPoint = (SynchronousServerCallPoint)theEObject;
				T result = caseSynchronousServerCallPoint(synchronousServerCallPoint);
				if (result == null) result = caseServerCallPoint(synchronousServerCallPoint);
				if (result == null) result = caseIdentifiable(synchronousServerCallPoint);
				if (result == null) result = caseReferrable(synchronousServerCallPoint);
				if (result == null) result = caseM2Object(synchronousServerCallPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.IINSTANCE_REF: {
				IInstanceRef iInstanceRef = (IInstanceRef)theEObject;
				T result = caseIInstanceRef(iInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF: {
				ROperationInAtomicSwcInstanceRef rOperationInAtomicSwcInstanceRef = (ROperationInAtomicSwcInstanceRef)theEObject;
				T result = caseROperationInAtomicSwcInstanceRef(rOperationInAtomicSwcInstanceRef);
				if (result == null) result = caseM2Object(rOperationInAtomicSwcInstanceRef);
				if (result == null) result = caseIInstanceRef(rOperationInAtomicSwcInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_ADDR_METHOD: {
				SwAddrMethod swAddrMethod = (SwAddrMethod)theEObject;
				T result = caseSwAddrMethod(swAddrMethod);
				if (result == null) result = caseArElement(swAddrMethod);
				if (result == null) result = caseIdentifiable(swAddrMethod);
				if (result == null) result = caseReferrable(swAddrMethod);
				if (result == null) result = caseM2Object(swAddrMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPU_METHOD: {
				CompuMethod compuMethod = (CompuMethod)theEObject;
				T result = caseCompuMethod(compuMethod);
				if (result == null) result = caseArElement(compuMethod);
				if (result == null) result = caseIdentifiable(compuMethod);
				if (result == null) result = caseReferrable(compuMethod);
				if (result == null) result = caseM2Object(compuMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_CONSTR: {
				DataConstr dataConstr = (DataConstr)theEObject;
				T result = caseDataConstr(dataConstr);
				if (result == null) result = caseArElement(dataConstr);
				if (result == null) result = caseIdentifiable(dataConstr);
				if (result == null) result = caseReferrable(dataConstr);
				if (result == null) result = caseM2Object(dataConstr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.DATA_CONSTR_RULE: {
				DataConstrRule dataConstrRule = (DataConstrRule)theEObject;
				T result = caseDataConstrRule(dataConstrRule);
				if (result == null) result = caseM2Object(dataConstrRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.INTERNAL_CONSTRS: {
				InternalConstrs internalConstrs = (InternalConstrs)theEObject;
				T result = caseInternalConstrs(internalConstrs);
				if (result == null) result = caseM2Object(internalConstrs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPU: {
				Compu compu = (Compu)theEObject;
				T result = caseCompu(compu);
				if (result == null) result = caseM2Object(compu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.LIMIT: {
				Limit limit = (Limit)theEObject;
				T result = caseLimit(limit);
				if (result == null) result = caseM2Object(limit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPU_SCALE: {
				CompuScale compuScale = (CompuScale)theEObject;
				T result = caseCompuScale(compuScale);
				if (result == null) result = caseM2Object(compuScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPU_CONST: {
				CompuConst compuConst = (CompuConst)theEObject;
				T result = caseCompuConst(compuConst);
				if (result == null) result = caseM2Object(compuConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ANY_INSTANCE_REF: {
				AnyInstanceRef anyInstanceRef = (AnyInstanceRef)theEObject;
				T result = caseAnyInstanceRef(anyInstanceRef);
				if (result == null) result = caseM2Object(anyInstanceRef);
				if (result == null) result = caseIInstanceRef(anyInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ECU_ABSTRACTION_SW_COMPONENT_TYPE: {
				EcuAbstractionSwComponentType ecuAbstractionSwComponentType = (EcuAbstractionSwComponentType)theEObject;
				T result = caseEcuAbstractionSwComponentType(ecuAbstractionSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(ecuAbstractionSwComponentType);
				if (result == null) result = caseSwComponentType(ecuAbstractionSwComponentType);
				if (result == null) result = caseArElement(ecuAbstractionSwComponentType);
				if (result == null) result = caseIdentifiable(ecuAbstractionSwComponentType);
				if (result == null) result = caseReferrable(ecuAbstractionSwComponentType);
				if (result == null) result = caseM2Object(ecuAbstractionSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.NV_BLOCK_SW_COMPONENT_TYPE: {
				NvBlockSwComponentType nvBlockSwComponentType = (NvBlockSwComponentType)theEObject;
				T result = caseNvBlockSwComponentType(nvBlockSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(nvBlockSwComponentType);
				if (result == null) result = caseSwComponentType(nvBlockSwComponentType);
				if (result == null) result = caseArElement(nvBlockSwComponentType);
				if (result == null) result = caseIdentifiable(nvBlockSwComponentType);
				if (result == null) result = caseReferrable(nvBlockSwComponentType);
				if (result == null) result = caseM2Object(nvBlockSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENSOR_ACTUATOR_SW_COMPONENT_TYPE: {
				SensorActuatorSwComponentType sensorActuatorSwComponentType = (SensorActuatorSwComponentType)theEObject;
				T result = caseSensorActuatorSwComponentType(sensorActuatorSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(sensorActuatorSwComponentType);
				if (result == null) result = caseSwComponentType(sensorActuatorSwComponentType);
				if (result == null) result = caseArElement(sensorActuatorSwComponentType);
				if (result == null) result = caseIdentifiable(sensorActuatorSwComponentType);
				if (result == null) result = caseReferrable(sensorActuatorSwComponentType);
				if (result == null) result = caseM2Object(sensorActuatorSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE: {
				ComplexDeviceDriverSwComponentType complexDeviceDriverSwComponentType = (ComplexDeviceDriverSwComponentType)theEObject;
				T result = caseComplexDeviceDriverSwComponentType(complexDeviceDriverSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(complexDeviceDriverSwComponentType);
				if (result == null) result = caseSwComponentType(complexDeviceDriverSwComponentType);
				if (result == null) result = caseArElement(complexDeviceDriverSwComponentType);
				if (result == null) result = caseIdentifiable(complexDeviceDriverSwComponentType);
				if (result == null) result = caseReferrable(complexDeviceDriverSwComponentType);
				if (result == null) result = caseM2Object(complexDeviceDriverSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SERVICE_PROXY_SW_COMPONENT_TYPE: {
				ServiceProxySwComponentType serviceProxySwComponentType = (ServiceProxySwComponentType)theEObject;
				T result = caseServiceProxySwComponentType(serviceProxySwComponentType);
				if (result == null) result = caseAtomicSwComponentType(serviceProxySwComponentType);
				if (result == null) result = caseSwComponentType(serviceProxySwComponentType);
				if (result == null) result = caseArElement(serviceProxySwComponentType);
				if (result == null) result = caseIdentifiable(serviceProxySwComponentType);
				if (result == null) result = caseReferrable(serviceProxySwComponentType);
				if (result == null) result = caseM2Object(serviceProxySwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SERVICE_SW_COMPONENT_TYPE: {
				ServiceSwComponentType serviceSwComponentType = (ServiceSwComponentType)theEObject;
				T result = caseServiceSwComponentType(serviceSwComponentType);
				if (result == null) result = caseAtomicSwComponentType(serviceSwComponentType);
				if (result == null) result = caseSwComponentType(serviceSwComponentType);
				if (result == null) result = caseArElement(serviceSwComponentType);
				if (result == null) result = caseIdentifiable(serviceSwComponentType);
				if (result == null) result = caseReferrable(serviceSwComponentType);
				if (result == null) result = caseM2Object(serviceSwComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PORT_IN_COMPOSITION_INSTANCE_REF: {
				PortInCompositionInstanceRef portInCompositionInstanceRef = (PortInCompositionInstanceRef)theEObject;
				T result = casePortInCompositionInstanceRef(portInCompositionInstanceRef);
				if (result == null) result = caseM2Object(portInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(portInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.PPORT_IN_COMPOSITION_INSTANCE_REF: {
				PPortInCompositionInstanceRef pPortInCompositionInstanceRef = (PPortInCompositionInstanceRef)theEObject;
				T result = casePPortInCompositionInstanceRef(pPortInCompositionInstanceRef);
				if (result == null) result = casePortInCompositionInstanceRef(pPortInCompositionInstanceRef);
				if (result == null) result = caseM2Object(pPortInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(pPortInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.RPORT_IN_COMPOSITION_INSTANCE_REF: {
				RPortInCompositionInstanceRef rPortInCompositionInstanceRef = (RPortInCompositionInstanceRef)theEObject;
				T result = caseRPortInCompositionInstanceRef(rPortInCompositionInstanceRef);
				if (result == null) result = casePortInCompositionInstanceRef(rPortInCompositionInstanceRef);
				if (result == null) result = caseM2Object(rPortInCompositionInstanceRef);
				if (result == null) result = caseIInstanceRef(rPortInCompositionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.INTERNAL_BEHAVIOR: {
				InternalBehavior internalBehavior = (InternalBehavior)theEObject;
				T result = caseInternalBehavior(internalBehavior);
				if (result == null) result = caseIdentifiable(internalBehavior);
				if (result == null) result = caseReferrable(internalBehavior);
				if (result == null) result = caseM2Object(internalBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SWC_BSW_RUNNABLE_MAPPING: {
				SwcBswRunnableMapping swcBswRunnableMapping = (SwcBswRunnableMapping)theEObject;
				T result = caseSwcBswRunnableMapping(swcBswRunnableMapping);
				if (result == null) result = caseM2Object(swcBswRunnableMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SWC_BSW_MAPPING: {
				SwcBswMapping swcBswMapping = (SwcBswMapping)theEObject;
				T result = caseSwcBswMapping(swcBswMapping);
				if (result == null) result = caseArElement(swcBswMapping);
				if (result == null) result = caseIdentifiable(swcBswMapping);
				if (result == null) result = caseReferrable(swcBswMapping);
				if (result == null) result = caseM2Object(swcBswMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_INTERNAL_BEHAVIOR: {
				BswInternalBehavior bswInternalBehavior = (BswInternalBehavior)theEObject;
				T result = caseBswInternalBehavior(bswInternalBehavior);
				if (result == null) result = caseInternalBehavior(bswInternalBehavior);
				if (result == null) result = caseIdentifiable(bswInternalBehavior);
				if (result == null) result = caseReferrable(bswInternalBehavior);
				if (result == null) result = caseM2Object(bswInternalBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_MODE_SENDER_POLICY: {
				BswModeSenderPolicy bswModeSenderPolicy = (BswModeSenderPolicy)theEObject;
				T result = caseBswModeSenderPolicy(bswModeSenderPolicy);
				if (result == null) result = caseM2Object(bswModeSenderPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T result = caseImplementation(implementation);
				if (result == null) result = caseArElement(implementation);
				if (result == null) result = caseIdentifiable(implementation);
				if (result == null) result = caseReferrable(implementation);
				if (result == null) result = caseM2Object(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_IMPLEMENTATION: {
				BswImplementation bswImplementation = (BswImplementation)theEObject;
				T result = caseBswImplementation(bswImplementation);
				if (result == null) result = caseImplementation(bswImplementation);
				if (result == null) result = caseArElement(bswImplementation);
				if (result == null) result = caseIdentifiable(bswImplementation);
				if (result == null) result = caseReferrable(bswImplementation);
				if (result == null) result = caseM2Object(bswImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_MODULE_DESCRIPTION: {
				BswModuleDescription bswModuleDescription = (BswModuleDescription)theEObject;
				T result = caseBswModuleDescription(bswModuleDescription);
				if (result == null) result = caseArElement(bswModuleDescription);
				if (result == null) result = caseIdentifiable(bswModuleDescription);
				if (result == null) result = caseReferrable(bswModuleDescription);
				if (result == null) result = caseM2Object(bswModuleDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_MODULE_ENTRY: {
				BswModuleEntry bswModuleEntry = (BswModuleEntry)theEObject;
				T result = caseBswModuleEntry(bswModuleEntry);
				if (result == null) result = caseArElement(bswModuleEntry);
				if (result == null) result = caseIdentifiable(bswModuleEntry);
				if (result == null) result = caseReferrable(bswModuleEntry);
				if (result == null) result = caseM2Object(bswModuleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_MODULE_ENTITY: {
				BswModuleEntity bswModuleEntity = (BswModuleEntity)theEObject;
				T result = caseBswModuleEntity(bswModuleEntity);
				if (result == null) result = caseExecutableEntity(bswModuleEntity);
				if (result == null) result = caseIdentifiable(bswModuleEntity);
				if (result == null) result = caseReferrable(bswModuleEntity);
				if (result == null) result = caseM2Object(bswModuleEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_SCHEDULABLE_ENTITY: {
				BswSchedulableEntity bswSchedulableEntity = (BswSchedulableEntity)theEObject;
				T result = caseBswSchedulableEntity(bswSchedulableEntity);
				if (result == null) result = caseBswModuleEntity(bswSchedulableEntity);
				if (result == null) result = caseExecutableEntity(bswSchedulableEntity);
				if (result == null) result = caseIdentifiable(bswSchedulableEntity);
				if (result == null) result = caseReferrable(bswSchedulableEntity);
				if (result == null) result = caseM2Object(bswSchedulableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_EVENT: {
				BswEvent bswEvent = (BswEvent)theEObject;
				T result = caseBswEvent(bswEvent);
				if (result == null) result = caseIdentifiable(bswEvent);
				if (result == null) result = caseReferrable(bswEvent);
				if (result == null) result = caseM2Object(bswEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_MODE_SWITCH_EVENT: {
				BswModeSwitchEvent bswModeSwitchEvent = (BswModeSwitchEvent)theEObject;
				T result = caseBswModeSwitchEvent(bswModeSwitchEvent);
				if (result == null) result = caseBswEvent(bswModeSwitchEvent);
				if (result == null) result = caseIdentifiable(bswModeSwitchEvent);
				if (result == null) result = caseReferrable(bswModeSwitchEvent);
				if (result == null) result = caseM2Object(bswModeSwitchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF: {
				ModeInBswModuleDescriptionInstanceRef modeInBswModuleDescriptionInstanceRef = (ModeInBswModuleDescriptionInstanceRef)theEObject;
				T result = caseModeInBswModuleDescriptionInstanceRef(modeInBswModuleDescriptionInstanceRef);
				if (result == null) result = caseM2Object(modeInBswModuleDescriptionInstanceRef);
				if (result == null) result = caseIInstanceRef(modeInBswModuleDescriptionInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_TIMING_EVENT: {
				BswTimingEvent bswTimingEvent = (BswTimingEvent)theEObject;
				T result = caseBswTimingEvent(bswTimingEvent);
				if (result == null) result = caseBswEvent(bswTimingEvent);
				if (result == null) result = caseIdentifiable(bswTimingEvent);
				if (result == null) result = caseReferrable(bswTimingEvent);
				if (result == null) result = caseM2Object(bswTimingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_BACKGROUND_EVENT: {
				BswBackgroundEvent bswBackgroundEvent = (BswBackgroundEvent)theEObject;
				T result = caseBswBackgroundEvent(bswBackgroundEvent);
				if (result == null) result = caseBswEvent(bswBackgroundEvent);
				if (result == null) result = caseIdentifiable(bswBackgroundEvent);
				if (result == null) result = caseReferrable(bswBackgroundEvent);
				if (result == null) result = caseM2Object(bswBackgroundEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_CALLED_ENTITY: {
				BswCalledEntity bswCalledEntity = (BswCalledEntity)theEObject;
				T result = caseBswCalledEntity(bswCalledEntity);
				if (result == null) result = caseBswModuleEntity(bswCalledEntity);
				if (result == null) result = caseExecutableEntity(bswCalledEntity);
				if (result == null) result = caseIdentifiable(bswCalledEntity);
				if (result == null) result = caseReferrable(bswCalledEntity);
				if (result == null) result = caseM2Object(bswCalledEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.BSW_INTERRUPT_ENTITY: {
				BswInterruptEntity bswInterruptEntity = (BswInterruptEntity)theEObject;
				T result = caseBswInterruptEntity(bswInterruptEntity);
				if (result == null) result = caseBswModuleEntity(bswInterruptEntity);
				if (result == null) result = caseExecutableEntity(bswInterruptEntity);
				if (result == null) result = caseIdentifiable(bswInterruptEntity);
				if (result == null) result = caseReferrable(bswInterruptEntity);
				if (result == null) result = caseM2Object(bswInterruptEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SYSTEM_SIGNAL_GROUP: {
				SystemSignalGroup systemSignalGroup = (SystemSignalGroup)theEObject;
				T result = caseSystemSignalGroup(systemSignalGroup);
				if (result == null) result = caseArElement(systemSignalGroup);
				if (result == null) result = caseIdentifiable(systemSignalGroup);
				if (result == null) result = caseReferrable(systemSignalGroup);
				if (result == null) result = caseM2Object(systemSignalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.ISIGNAL_GROUP: {
				ISignalGroup iSignalGroup = (ISignalGroup)theEObject;
				T result = caseISignalGroup(iSignalGroup);
				if (result == null) result = caseArElement(iSignalGroup);
				if (result == null) result = caseIdentifiable(iSignalGroup);
				if (result == null) result = caseReferrable(iSignalGroup);
				if (result == null) result = caseM2Object(iSignalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_REC_COMPOSITE_TYPE_MAPPING: {
				SenderRecCompositeTypeMapping senderRecCompositeTypeMapping = (SenderRecCompositeTypeMapping)theEObject;
				T result = caseSenderRecCompositeTypeMapping(senderRecCompositeTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_REC_RECORD_TYPE_MAPPING: {
				SenderRecRecordTypeMapping senderRecRecordTypeMapping = (SenderRecRecordTypeMapping)theEObject;
				T result = caseSenderRecRecordTypeMapping(senderRecRecordTypeMapping);
				if (result == null) result = caseSenderRecCompositeTypeMapping(senderRecRecordTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING: {
				SenderRecRecordElementMapping senderRecRecordElementMapping = (SenderRecRecordElementMapping)theEObject;
				T result = caseSenderRecRecordElementMapping(senderRecRecordElementMapping);
				if (result == null) result = caseM2Object(senderRecRecordElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_REC_ARRAY_TYPE_MAPPING: {
				SenderRecArrayTypeMapping senderRecArrayTypeMapping = (SenderRecArrayTypeMapping)theEObject;
				T result = caseSenderRecArrayTypeMapping(senderRecArrayTypeMapping);
				if (result == null) result = caseSenderRecCompositeTypeMapping(senderRecArrayTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.INDEXED_ARRAY_ELEMENT: {
				IndexedArrayElement indexedArrayElement = (IndexedArrayElement)theEObject;
				T result = caseIndexedArrayElement(indexedArrayElement);
				if (result == null) result = caseM2Object(indexedArrayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING: {
				SenderRecArrayElementMapping senderRecArrayElementMapping = (SenderRecArrayElementMapping)theEObject;
				T result = caseSenderRecArrayElementMapping(senderRecArrayElementMapping);
				if (result == null) result = caseM2Object(senderRecArrayElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M2Package.SW_POINTER_TARGET_PROPS: {
				SwPointerTargetProps swPointerTargetProps = (SwPointerTargetProps)theEObject;
				T result = caseSwPointerTargetProps(swPointerTargetProps);
				if (result == null) result = caseM2Object(swPointerTargetProps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseM2Root(M2Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autosar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autosar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutosar(Autosar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ar Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ar Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArPackage(ArPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ar Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ar Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArElement(ArElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
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
	public T caseM2Object(M2Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwBaseType(SwBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverInterface(SenderReceiverInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataPrototype(VariableDataPrototype object) {
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
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwComponentType(SwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPrototype(PortPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicSwComponentType(AtomicSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSwComponentType(ApplicationSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPort Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPort Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPortPrototype(RPortPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPort Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPort Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPortPrototype(PPortPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Internal Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Internal Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcInternalBehavior(SwcInternalBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableEntity(ExecutableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableEntity(RunnableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAccess(VariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autosar Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autosar Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutosarVariableRef(AutosarVariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable In Atomic Swc Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable In Atomic Swc Type Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableInAtomicSwcTypeInstanceRef(VariableInAtomicSwcTypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteEvent(RteEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingEvent(TimingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundEvent(BackgroundEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Send Completed Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Send Completed Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSendCompletedEvent(DataSendCompletedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Received Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReceivedEvent(DataReceivedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Receive Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Receive Error Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReceiveErrorEvent(DataReceiveErrorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVariable In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVariable In Atomic Swc Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVariableInAtomicSwcInstanceRef(RVariableInAtomicSwcInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Module Configuration Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Module Configuration Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucModuleConfigurationValues(EcucModuleConfigurationValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Container Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Container Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucContainerValue(EcucContainerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucParameterValue(EcucParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Numerical Param Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Numerical Param Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucNumericalParamValue(EcucNumericalParamValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Textual Param Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Textual Param Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucTextualParamValue(EcucTextualParamValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Abstract Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Abstract Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucAbstractReferenceValue(EcucAbstractReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucReferenceValue(EcucReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Instance Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Instance Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucInstanceReferenceValue(EcucInstanceReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPort Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPort Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPortComSpec(RPortComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPort Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPort Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPortComSpec(PPortComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiverComSpec(ReceiverComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderComSpec(SenderComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Acknowledgement Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Acknowledgement Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionAcknowledgementRequest(TransmissionAcknowledgementRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonqueuedSenderComSpec(NonqueuedSenderComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queued Sender Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queued Sender Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuedSenderComSpec(QueuedSenderComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonqueued Receiver Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonqueued Receiver Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonqueuedReceiverComSpec(NonqueuedReceiverComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInterface(PortInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionSwComponentType(CompositionSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwConnector(SwConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Sw Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Sw Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblySwConnector(AssemblySwConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Sw Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Sw Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationSwConnector(DelegationSwConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPort Prototype In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPort Prototype In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPortPrototypeInCompositionInstanceRef(RPortPrototypeInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPort Prototype In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPort Prototype In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPortPrototypeInCompositionInstanceRef(PPortPrototypeInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Component Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Component Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwComponentPrototype(SwComponentPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autosar Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autosar Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutosarDataType(AutosarDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDataType(ApplicationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDataType(ImplementationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Data Def Props</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Data Def Props</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwDataDefProps(SwDataDefProps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeMap(DataTypeMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Mapping Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeMappingSet(DataTypeMappingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Request Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Request Type Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeRequestTypeMap(ModeRequestTypeMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclaration(ModeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclarationGroup(ModeDeclarationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationPrimitiveDataType(ApplicationPrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autosar Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autosar Data Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutosarDataPrototype(AutosarDataPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPrototype(DataPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveArea(ExclusiveArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalValueSpecification(NumericalValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextValueSpecification(TextValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantReference(ConstantReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceValueSpecification(ReferenceValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValueSpecification(ArrayValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordValueSpecification(RecordValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationValueSpecification(ApplicationValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantSpecification(ConstantSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Invoked Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Invoked Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInvokedEvent(OperationInvokedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POperation In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POperation In Atomic Swc Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOperationInAtomicSwcInstanceRef(POperationInAtomicSwcInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Server Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Server Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientServerInterface(ClientServerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Server Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Server Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientServerOperation(ClientServerOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationError(ApplicationError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Data Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentDataPrototype(ArgumentDataPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFilter(DataFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queued Receiver Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queued Receiver Com Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuedReceiverComSpec(QueuedReceiverComSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalidation Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalidation Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidationPolicy(InvalidationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Api Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Api Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortApiOption(PortApiOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Defined Argument Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Defined Argument Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDefinedArgumentValue(PortDefinedArgumentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Data Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Data Type Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedDataTypeSet(IncludedDataTypeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Sw Composition Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Sw Composition Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootSwCompositionPrototype(RootSwCompositionPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemMapping(SystemMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMapping(DataMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSignal(SystemSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISignal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISignal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISignal(ISignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISignal IPdu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISignal IPdu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISignalIPdu(ISignalIPdu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISignal To IPdu Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISignal To IPdu Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISignalToIPduMapping(ISignalToIPduMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalMapping(SenderReceiverToSignalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalGroupMapping(SenderReceiverToSignalGroupMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Prototype In System Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Prototype In System Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataPrototypeInSystemInstanceRef(VariableDataPrototypeInSystemInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Value Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Value Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucValueCollection(EcucValueCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Call Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Call Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerCallPoint(ServerCallPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Server Call Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Server Call Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousServerCallPoint(SynchronousServerCallPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IInstance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IInstance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIInstanceRef(IInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperation In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperation In Atomic Swc Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperationInAtomicSwcInstanceRef(ROperationInAtomicSwcInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Prototype In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Prototype In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPrototypeInCompositionInstanceRef(PortPrototypeInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Addr Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Addr Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwAddrMethod(SwAddrMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuMethod(CompuMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Constr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Constr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConstr(DataConstr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Constr Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Constr Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConstrRule(DataConstrRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Constrs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Constrs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConstrs(InternalConstrs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompu(Compu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuScale(CompuScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuConst(CompuConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyInstanceRef(AnyInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecu Abstraction Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecu Abstraction Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcuAbstractionSwComponentType(EcuAbstractionSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nv Block Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nv Block Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNvBlockSwComponentType(NvBlockSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Actuator Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Actuator Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorActuatorSwComponentType(SensorActuatorSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Device Driver Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Device Driver Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexDeviceDriverSwComponentType(ComplexDeviceDriverSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Proxy Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Proxy Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProxySwComponentType(ServiceProxySwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Sw Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSwComponentType(ServiceSwComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInCompositionInstanceRef(PortInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPort In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPort In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPortInCompositionInstanceRef(PPortInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPort In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPort In Composition Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPortInCompositionInstanceRef(RPortInCompositionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalBehavior(InternalBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Bsw Runnable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Bsw Runnable Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcBswRunnableMapping(SwcBswRunnableMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Bsw Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Bsw Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcBswMapping(SwcBswMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Internal Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Internal Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswInternalBehavior(BswInternalBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Mode Sender Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Mode Sender Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswModeSenderPolicy(BswModeSenderPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswImplementation(BswImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Module Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Module Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswModuleDescription(BswModuleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Module Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Module Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswModuleEntry(BswModuleEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Module Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Module Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswModuleEntity(BswModuleEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntity(BswSchedulableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswEvent(BswEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Mode Switch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Mode Switch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswModeSwitchEvent(BswModeSwitchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode In Bsw Module Description Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode In Bsw Module Description Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeInBswModuleDescriptionInstanceRef(ModeInBswModuleDescriptionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Timing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswTimingEvent(BswTimingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Background Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Background Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswBackgroundEvent(BswBackgroundEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Called Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Called Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswCalledEntity(BswCalledEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Interrupt Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Interrupt Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswInterruptEntity(BswInterruptEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Data Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDataTypeElement(ImplementationDataTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Signal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSignalGroup(SystemSignalGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISignal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISignal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISignalGroup(ISignalGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Rec Composite Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Rec Composite Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderRecCompositeTypeMapping(SenderRecCompositeTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Rec Record Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Rec Record Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderRecRecordTypeMapping(SenderRecRecordTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Rec Record Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Rec Record Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderRecRecordElementMapping(SenderRecRecordElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Rec Array Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Rec Array Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderRecArrayTypeMapping(SenderRecArrayTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexed Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexed Array Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexedArrayElement(IndexedArrayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Rec Array Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Rec Array Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderRecArrayElementMapping(SenderRecArrayElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Pointer Target Props</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Pointer Target Props</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwPointerTargetProps(SwPointerTargetProps object) {
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

} //M2Switch
