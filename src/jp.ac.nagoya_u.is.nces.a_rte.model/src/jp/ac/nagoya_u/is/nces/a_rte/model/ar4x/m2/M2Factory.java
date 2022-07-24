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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package
 * @generated
 */
public interface M2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M2Factory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	M2Root createM2Root();

	/**
	 * Returns a new object of class '<em>Autosar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autosar</em>'.
	 * @generated
	 */
	Autosar createAutosar();

	/**
	 * Returns a new object of class '<em>Ar Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ar Package</em>'.
	 * @generated
	 */
	ArPackage createArPackage();

	/**
	 * Returns a new object of class '<em>Sw Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Base Type</em>'.
	 * @generated
	 */
	SwBaseType createSwBaseType();

	/**
	 * Returns a new object of class '<em>Sender Receiver Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver Interface</em>'.
	 * @generated
	 */
	SenderReceiverInterface createSenderReceiverInterface();

	/**
	 * Returns a new object of class '<em>Variable Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Prototype</em>'.
	 * @generated
	 */
	VariableDataPrototype createVariableDataPrototype();

	/**
	 * Returns a new object of class '<em>Application Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Sw Component Type</em>'.
	 * @generated
	 */
	ApplicationSwComponentType createApplicationSwComponentType();

	/**
	 * Returns a new object of class '<em>RPort Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPort Prototype</em>'.
	 * @generated
	 */
	RPortPrototype createRPortPrototype();

	/**
	 * Returns a new object of class '<em>PPort Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPort Prototype</em>'.
	 * @generated
	 */
	PPortPrototype createPPortPrototype();

	/**
	 * Returns a new object of class '<em>Swc Internal Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Internal Behavior</em>'.
	 * @generated
	 */
	SwcInternalBehavior createSwcInternalBehavior();

	/**
	 * Returns a new object of class '<em>Runnable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Entity</em>'.
	 * @generated
	 */
	RunnableEntity createRunnableEntity();

	/**
	 * Returns a new object of class '<em>Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Access</em>'.
	 * @generated
	 */
	VariableAccess createVariableAccess();

	/**
	 * Returns a new object of class '<em>Autosar Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autosar Variable Ref</em>'.
	 * @generated
	 */
	AutosarVariableRef createAutosarVariableRef();

	/**
	 * Returns a new object of class '<em>Variable In Atomic Swc Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable In Atomic Swc Type Instance Ref</em>'.
	 * @generated
	 */
	VariableInAtomicSwcTypeInstanceRef createVariableInAtomicSwcTypeInstanceRef();

	/**
	 * Returns a new object of class '<em>Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Event</em>'.
	 * @generated
	 */
	TimingEvent createTimingEvent();

	/**
	 * Returns a new object of class '<em>Background Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background Event</em>'.
	 * @generated
	 */
	BackgroundEvent createBackgroundEvent();

	/**
	 * Returns a new object of class '<em>Data Send Completed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Send Completed Event</em>'.
	 * @generated
	 */
	DataSendCompletedEvent createDataSendCompletedEvent();

	/**
	 * Returns a new object of class '<em>Data Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Received Event</em>'.
	 * @generated
	 */
	DataReceivedEvent createDataReceivedEvent();

	/**
	 * Returns a new object of class '<em>Data Receive Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Receive Error Event</em>'.
	 * @generated
	 */
	DataReceiveErrorEvent createDataReceiveErrorEvent();

	/**
	 * Returns a new object of class '<em>RVariable In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RVariable In Atomic Swc Instance Ref</em>'.
	 * @generated
	 */
	RVariableInAtomicSwcInstanceRef createRVariableInAtomicSwcInstanceRef();

	/**
	 * Returns a new object of class '<em>Ecuc Module Configuration Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Module Configuration Values</em>'.
	 * @generated
	 */
	EcucModuleConfigurationValues createEcucModuleConfigurationValues();

	/**
	 * Returns a new object of class '<em>Ecuc Container Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Container Value</em>'.
	 * @generated
	 */
	EcucContainerValue createEcucContainerValue();

	/**
	 * Returns a new object of class '<em>Ecuc Numerical Param Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Numerical Param Value</em>'.
	 * @generated
	 */
	EcucNumericalParamValue createEcucNumericalParamValue();

	/**
	 * Returns a new object of class '<em>Ecuc Textual Param Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Textual Param Value</em>'.
	 * @generated
	 */
	EcucTextualParamValue createEcucTextualParamValue();

	/**
	 * Returns a new object of class '<em>Ecuc Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Reference Value</em>'.
	 * @generated
	 */
	EcucReferenceValue createEcucReferenceValue();

	/**
	 * Returns a new object of class '<em>Ecuc Instance Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Instance Reference Value</em>'.
	 * @generated
	 */
	EcucInstanceReferenceValue createEcucInstanceReferenceValue();

	/**
	 * Returns a new object of class '<em>Transmission Acknowledgement Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Acknowledgement Request</em>'.
	 * @generated
	 */
	TransmissionAcknowledgementRequest createTransmissionAcknowledgementRequest();

	/**
	 * Returns a new object of class '<em>Nonqueued Sender Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonqueued Sender Com Spec</em>'.
	 * @generated
	 */
	NonqueuedSenderComSpec createNonqueuedSenderComSpec();

	/**
	 * Returns a new object of class '<em>Queued Sender Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queued Sender Com Spec</em>'.
	 * @generated
	 */
	QueuedSenderComSpec createQueuedSenderComSpec();

	/**
	 * Returns a new object of class '<em>Nonqueued Receiver Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonqueued Receiver Com Spec</em>'.
	 * @generated
	 */
	NonqueuedReceiverComSpec createNonqueuedReceiverComSpec();

	/**
	 * Returns a new object of class '<em>Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Interface</em>'.
	 * @generated
	 */
	PortInterface createPortInterface();

	/**
	 * Returns a new object of class '<em>Composition Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Sw Component Type</em>'.
	 * @generated
	 */
	CompositionSwComponentType createCompositionSwComponentType();

	/**
	 * Returns a new object of class '<em>Assembly Sw Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Sw Connector</em>'.
	 * @generated
	 */
	AssemblySwConnector createAssemblySwConnector();

	/**
	 * Returns a new object of class '<em>Delegation Sw Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Sw Connector</em>'.
	 * @generated
	 */
	DelegationSwConnector createDelegationSwConnector();

	/**
	 * Returns a new object of class '<em>RPort Prototype In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPort Prototype In Composition Instance Ref</em>'.
	 * @generated
	 */
	RPortPrototypeInCompositionInstanceRef createRPortPrototypeInCompositionInstanceRef();

	/**
	 * Returns a new object of class '<em>PPort Prototype In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPort Prototype In Composition Instance Ref</em>'.
	 * @generated
	 */
	PPortPrototypeInCompositionInstanceRef createPPortPrototypeInCompositionInstanceRef();

	/**
	 * Returns a new object of class '<em>Sw Component Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Component Prototype</em>'.
	 * @generated
	 */
	SwComponentPrototype createSwComponentPrototype();

	/**
	 * Returns a new object of class '<em>Implementation Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Data Type</em>'.
	 * @generated
	 */
	ImplementationDataType createImplementationDataType();

	/**
	 * Returns a new object of class '<em>Sw Data Def Props</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Data Def Props</em>'.
	 * @generated
	 */
	SwDataDefProps createSwDataDefProps();

	/**
	 * Returns a new object of class '<em>Data Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Map</em>'.
	 * @generated
	 */
	DataTypeMap createDataTypeMap();

	/**
	 * Returns a new object of class '<em>Data Type Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Mapping Set</em>'.
	 * @generated
	 */
	DataTypeMappingSet createDataTypeMappingSet();

	/**
	 * Returns a new object of class '<em>Mode Declaration Group Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration Group Prototype</em>'.
	 * @generated
	 */
	ModeDeclarationGroupPrototype createModeDeclarationGroupPrototype();

	/**
	 * Returns a new object of class '<em>Mode Request Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Request Type Map</em>'.
	 * @generated
	 */
	ModeRequestTypeMap createModeRequestTypeMap();

	/**
	 * Returns a new object of class '<em>Mode Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration</em>'.
	 * @generated
	 */
	ModeDeclaration createModeDeclaration();

	/**
	 * Returns a new object of class '<em>Mode Declaration Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration Group</em>'.
	 * @generated
	 */
	ModeDeclarationGroup createModeDeclarationGroup();

	/**
	 * Returns a new object of class '<em>Application Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Primitive Data Type</em>'.
	 * @generated
	 */
	ApplicationPrimitiveDataType createApplicationPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Exclusive Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Area</em>'.
	 * @generated
	 */
	ExclusiveArea createExclusiveArea();

	/**
	 * Returns a new object of class '<em>Numerical Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Value Specification</em>'.
	 * @generated
	 */
	NumericalValueSpecification createNumericalValueSpecification();

	/**
	 * Returns a new object of class '<em>Text Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Value Specification</em>'.
	 * @generated
	 */
	TextValueSpecification createTextValueSpecification();

	/**
	 * Returns a new object of class '<em>Constant Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Reference</em>'.
	 * @generated
	 */
	ConstantReference createConstantReference();

	/**
	 * Returns a new object of class '<em>Reference Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Value Specification</em>'.
	 * @generated
	 */
	ReferenceValueSpecification createReferenceValueSpecification();

	/**
	 * Returns a new object of class '<em>Array Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Value Specification</em>'.
	 * @generated
	 */
	ArrayValueSpecification createArrayValueSpecification();

	/**
	 * Returns a new object of class '<em>Record Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Value Specification</em>'.
	 * @generated
	 */
	RecordValueSpecification createRecordValueSpecification();

	/**
	 * Returns a new object of class '<em>Application Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Value Specification</em>'.
	 * @generated
	 */
	ApplicationValueSpecification createApplicationValueSpecification();

	/**
	 * Returns a new object of class '<em>Constant Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Specification</em>'.
	 * @generated
	 */
	ConstantSpecification createConstantSpecification();

	/**
	 * Returns a new object of class '<em>Operation Invoked Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Invoked Event</em>'.
	 * @generated
	 */
	OperationInvokedEvent createOperationInvokedEvent();

	/**
	 * Returns a new object of class '<em>POperation In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POperation In Atomic Swc Instance Ref</em>'.
	 * @generated
	 */
	POperationInAtomicSwcInstanceRef createPOperationInAtomicSwcInstanceRef();

	/**
	 * Returns a new object of class '<em>Client Server Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Interface</em>'.
	 * @generated
	 */
	ClientServerInterface createClientServerInterface();

	/**
	 * Returns a new object of class '<em>Client Server Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Operation</em>'.
	 * @generated
	 */
	ClientServerOperation createClientServerOperation();

	/**
	 * Returns a new object of class '<em>Application Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Error</em>'.
	 * @generated
	 */
	ApplicationError createApplicationError();

	/**
	 * Returns a new object of class '<em>Argument Data Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Data Prototype</em>'.
	 * @generated
	 */
	ArgumentDataPrototype createArgumentDataPrototype();

	/**
	 * Returns a new object of class '<em>Data Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Filter</em>'.
	 * @generated
	 */
	DataFilter createDataFilter();

	/**
	 * Returns a new object of class '<em>Queued Receiver Com Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queued Receiver Com Spec</em>'.
	 * @generated
	 */
	QueuedReceiverComSpec createQueuedReceiverComSpec();

	/**
	 * Returns a new object of class '<em>Invalidation Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalidation Policy</em>'.
	 * @generated
	 */
	InvalidationPolicy createInvalidationPolicy();

	/**
	 * Returns a new object of class '<em>Port Api Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Api Option</em>'.
	 * @generated
	 */
	PortApiOption createPortApiOption();

	/**
	 * Returns a new object of class '<em>Port Defined Argument Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Defined Argument Value</em>'.
	 * @generated
	 */
	PortDefinedArgumentValue createPortDefinedArgumentValue();

	/**
	 * Returns a new object of class '<em>Included Data Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Data Type Set</em>'.
	 * @generated
	 */
	IncludedDataTypeSet createIncludedDataTypeSet();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Root Sw Composition Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Sw Composition Prototype</em>'.
	 * @generated
	 */
	RootSwCompositionPrototype createRootSwCompositionPrototype();

	/**
	 * Returns a new object of class '<em>System Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Mapping</em>'.
	 * @generated
	 */
	SystemMapping createSystemMapping();

	/**
	 * Returns a new object of class '<em>System Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Signal</em>'.
	 * @generated
	 */
	SystemSignal createSystemSignal();

	/**
	 * Returns a new object of class '<em>ISignal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISignal</em>'.
	 * @generated
	 */
	ISignal createISignal();

	/**
	 * Returns a new object of class '<em>ISignal IPdu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISignal IPdu</em>'.
	 * @generated
	 */
	ISignalIPdu createISignalIPdu();

	/**
	 * Returns a new object of class '<em>ISignal To IPdu Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISignal To IPdu Mapping</em>'.
	 * @generated
	 */
	ISignalToIPduMapping createISignalToIPduMapping();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Mapping</em>'.
	 * @generated
	 */
	SenderReceiverToSignalMapping createSenderReceiverToSignalMapping();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Group Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Group Mapping</em>'.
	 * @generated
	 */
	SenderReceiverToSignalGroupMapping createSenderReceiverToSignalGroupMapping();

	/**
	 * Returns a new object of class '<em>Variable Data Prototype In System Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Prototype In System Instance Ref</em>'.
	 * @generated
	 */
	VariableDataPrototypeInSystemInstanceRef createVariableDataPrototypeInSystemInstanceRef();

	/**
	 * Returns a new object of class '<em>Ecuc Value Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Value Collection</em>'.
	 * @generated
	 */
	EcucValueCollection createEcucValueCollection();

	/**
	 * Returns a new object of class '<em>Synchronous Server Call Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Server Call Point</em>'.
	 * @generated
	 */
	SynchronousServerCallPoint createSynchronousServerCallPoint();

	/**
	 * Returns a new object of class '<em>ROperation In Atomic Swc Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROperation In Atomic Swc Instance Ref</em>'.
	 * @generated
	 */
	ROperationInAtomicSwcInstanceRef createROperationInAtomicSwcInstanceRef();

	/**
	 * Returns a new object of class '<em>Sw Addr Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Addr Method</em>'.
	 * @generated
	 */
	SwAddrMethod createSwAddrMethod();

	/**
	 * Returns a new object of class '<em>Compu Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Method</em>'.
	 * @generated
	 */
	CompuMethod createCompuMethod();

	/**
	 * Returns a new object of class '<em>Data Constr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Constr</em>'.
	 * @generated
	 */
	DataConstr createDataConstr();

	/**
	 * Returns a new object of class '<em>Data Constr Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Constr Rule</em>'.
	 * @generated
	 */
	DataConstrRule createDataConstrRule();

	/**
	 * Returns a new object of class '<em>Internal Constrs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Constrs</em>'.
	 * @generated
	 */
	InternalConstrs createInternalConstrs();

	/**
	 * Returns a new object of class '<em>Compu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu</em>'.
	 * @generated
	 */
	Compu createCompu();

	/**
	 * Returns a new object of class '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit</em>'.
	 * @generated
	 */
	Limit createLimit();

	/**
	 * Returns a new object of class '<em>Compu Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Scale</em>'.
	 * @generated
	 */
	CompuScale createCompuScale();

	/**
	 * Returns a new object of class '<em>Compu Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Const</em>'.
	 * @generated
	 */
	CompuConst createCompuConst();

	/**
	 * Returns a new object of class '<em>Any Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Instance Ref</em>'.
	 * @generated
	 */
	AnyInstanceRef createAnyInstanceRef();

	/**
	 * Returns a new object of class '<em>Ecu Abstraction Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecu Abstraction Sw Component Type</em>'.
	 * @generated
	 */
	EcuAbstractionSwComponentType createEcuAbstractionSwComponentType();

	/**
	 * Returns a new object of class '<em>Nv Block Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nv Block Sw Component Type</em>'.
	 * @generated
	 */
	NvBlockSwComponentType createNvBlockSwComponentType();

	/**
	 * Returns a new object of class '<em>Sensor Actuator Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Actuator Sw Component Type</em>'.
	 * @generated
	 */
	SensorActuatorSwComponentType createSensorActuatorSwComponentType();

	/**
	 * Returns a new object of class '<em>Complex Device Driver Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Device Driver Sw Component Type</em>'.
	 * @generated
	 */
	ComplexDeviceDriverSwComponentType createComplexDeviceDriverSwComponentType();

	/**
	 * Returns a new object of class '<em>Service Proxy Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Proxy Sw Component Type</em>'.
	 * @generated
	 */
	ServiceProxySwComponentType createServiceProxySwComponentType();

	/**
	 * Returns a new object of class '<em>Service Sw Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Sw Component Type</em>'.
	 * @generated
	 */
	ServiceSwComponentType createServiceSwComponentType();

	/**
	 * Returns a new object of class '<em>PPort In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPort In Composition Instance Ref</em>'.
	 * @generated
	 */
	PPortInCompositionInstanceRef createPPortInCompositionInstanceRef();

	/**
	 * Returns a new object of class '<em>RPort In Composition Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPort In Composition Instance Ref</em>'.
	 * @generated
	 */
	RPortInCompositionInstanceRef createRPortInCompositionInstanceRef();

	/**
	 * Returns a new object of class '<em>Swc Bsw Runnable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Bsw Runnable Mapping</em>'.
	 * @generated
	 */
	SwcBswRunnableMapping createSwcBswRunnableMapping();

	/**
	 * Returns a new object of class '<em>Swc Bsw Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Bsw Mapping</em>'.
	 * @generated
	 */
	SwcBswMapping createSwcBswMapping();

	/**
	 * Returns a new object of class '<em>Bsw Internal Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Internal Behavior</em>'.
	 * @generated
	 */
	BswInternalBehavior createBswInternalBehavior();

	/**
	 * Returns a new object of class '<em>Bsw Mode Sender Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Mode Sender Policy</em>'.
	 * @generated
	 */
	BswModeSenderPolicy createBswModeSenderPolicy();

	/**
	 * Returns a new object of class '<em>Bsw Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Implementation</em>'.
	 * @generated
	 */
	BswImplementation createBswImplementation();

	/**
	 * Returns a new object of class '<em>Bsw Module Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Module Description</em>'.
	 * @generated
	 */
	BswModuleDescription createBswModuleDescription();

	/**
	 * Returns a new object of class '<em>Bsw Module Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Module Entry</em>'.
	 * @generated
	 */
	BswModuleEntry createBswModuleEntry();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity</em>'.
	 * @generated
	 */
	BswSchedulableEntity createBswSchedulableEntity();

	/**
	 * Returns a new object of class '<em>Bsw Mode Switch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Mode Switch Event</em>'.
	 * @generated
	 */
	BswModeSwitchEvent createBswModeSwitchEvent();

	/**
	 * Returns a new object of class '<em>Mode In Bsw Module Description Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode In Bsw Module Description Instance Ref</em>'.
	 * @generated
	 */
	ModeInBswModuleDescriptionInstanceRef createModeInBswModuleDescriptionInstanceRef();

	/**
	 * Returns a new object of class '<em>Bsw Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Timing Event</em>'.
	 * @generated
	 */
	BswTimingEvent createBswTimingEvent();

	/**
	 * Returns a new object of class '<em>Bsw Background Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Background Event</em>'.
	 * @generated
	 */
	BswBackgroundEvent createBswBackgroundEvent();

	/**
	 * Returns a new object of class '<em>Bsw Called Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Called Entity</em>'.
	 * @generated
	 */
	BswCalledEntity createBswCalledEntity();

	/**
	 * Returns a new object of class '<em>Bsw Interrupt Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Interrupt Entity</em>'.
	 * @generated
	 */
	BswInterruptEntity createBswInterruptEntity();

	/**
	 * Returns a new object of class '<em>Implementation Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Data Type Element</em>'.
	 * @generated
	 */
	ImplementationDataTypeElement createImplementationDataTypeElement();

	/**
	 * Returns a new object of class '<em>System Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Signal Group</em>'.
	 * @generated
	 */
	SystemSignalGroup createSystemSignalGroup();

	/**
	 * Returns a new object of class '<em>ISignal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISignal Group</em>'.
	 * @generated
	 */
	ISignalGroup createISignalGroup();

	/**
	 * Returns a new object of class '<em>Sender Rec Record Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Rec Record Type Mapping</em>'.
	 * @generated
	 */
	SenderRecRecordTypeMapping createSenderRecRecordTypeMapping();

	/**
	 * Returns a new object of class '<em>Sender Rec Record Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Rec Record Element Mapping</em>'.
	 * @generated
	 */
	SenderRecRecordElementMapping createSenderRecRecordElementMapping();

	/**
	 * Returns a new object of class '<em>Sender Rec Array Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Rec Array Type Mapping</em>'.
	 * @generated
	 */
	SenderRecArrayTypeMapping createSenderRecArrayTypeMapping();

	/**
	 * Returns a new object of class '<em>Indexed Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexed Array Element</em>'.
	 * @generated
	 */
	IndexedArrayElement createIndexedArrayElement();

	/**
	 * Returns a new object of class '<em>Sender Rec Array Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Rec Array Element Mapping</em>'.
	 * @generated
	 */
	SenderRecArrayElementMapping createSenderRecArrayElementMapping();

	/**
	 * Returns a new object of class '<em>Sw Pointer Target Props</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Pointer Target Props</em>'.
	 * @generated
	 */
	SwPointerTargetProps createSwPointerTargetProps();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	M2Package getM2Package();

} //M2Factory
