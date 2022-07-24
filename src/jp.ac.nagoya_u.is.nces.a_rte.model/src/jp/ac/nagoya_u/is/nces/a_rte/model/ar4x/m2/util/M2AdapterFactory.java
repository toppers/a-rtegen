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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.*;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package
 * @generated
 */
public class M2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = M2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M2Switch<Adapter> modelSwitch =
		new M2Switch<Adapter>() {
			@Override
			public Adapter caseM2Root(M2Root object) {
				return createM2RootAdapter();
			}
			@Override
			public Adapter caseAutosar(Autosar object) {
				return createAutosarAdapter();
			}
			@Override
			public Adapter caseArPackage(ArPackage object) {
				return createArPackageAdapter();
			}
			@Override
			public Adapter caseArElement(ArElement object) {
				return createArElementAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseM2Object(M2Object object) {
				return createM2ObjectAdapter();
			}
			@Override
			public Adapter caseSwBaseType(SwBaseType object) {
				return createSwBaseTypeAdapter();
			}
			@Override
			public Adapter caseSenderReceiverInterface(SenderReceiverInterface object) {
				return createSenderReceiverInterfaceAdapter();
			}
			@Override
			public Adapter caseVariableDataPrototype(VariableDataPrototype object) {
				return createVariableDataPrototypeAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseSwComponentType(SwComponentType object) {
				return createSwComponentTypeAdapter();
			}
			@Override
			public Adapter casePortPrototype(PortPrototype object) {
				return createPortPrototypeAdapter();
			}
			@Override
			public Adapter caseAtomicSwComponentType(AtomicSwComponentType object) {
				return createAtomicSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseApplicationSwComponentType(ApplicationSwComponentType object) {
				return createApplicationSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseRPortPrototype(RPortPrototype object) {
				return createRPortPrototypeAdapter();
			}
			@Override
			public Adapter casePPortPrototype(PPortPrototype object) {
				return createPPortPrototypeAdapter();
			}
			@Override
			public Adapter caseSwcInternalBehavior(SwcInternalBehavior object) {
				return createSwcInternalBehaviorAdapter();
			}
			@Override
			public Adapter caseExecutableEntity(ExecutableEntity object) {
				return createExecutableEntityAdapter();
			}
			@Override
			public Adapter caseRunnableEntity(RunnableEntity object) {
				return createRunnableEntityAdapter();
			}
			@Override
			public Adapter caseVariableAccess(VariableAccess object) {
				return createVariableAccessAdapter();
			}
			@Override
			public Adapter caseAutosarVariableRef(AutosarVariableRef object) {
				return createAutosarVariableRefAdapter();
			}
			@Override
			public Adapter caseVariableInAtomicSwcTypeInstanceRef(VariableInAtomicSwcTypeInstanceRef object) {
				return createVariableInAtomicSwcTypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseRteEvent(RteEvent object) {
				return createRteEventAdapter();
			}
			@Override
			public Adapter caseTimingEvent(TimingEvent object) {
				return createTimingEventAdapter();
			}
			@Override
			public Adapter caseBackgroundEvent(BackgroundEvent object) {
				return createBackgroundEventAdapter();
			}
			@Override
			public Adapter caseDataSendCompletedEvent(DataSendCompletedEvent object) {
				return createDataSendCompletedEventAdapter();
			}
			@Override
			public Adapter caseDataReceivedEvent(DataReceivedEvent object) {
				return createDataReceivedEventAdapter();
			}
			@Override
			public Adapter caseDataReceiveErrorEvent(DataReceiveErrorEvent object) {
				return createDataReceiveErrorEventAdapter();
			}
			@Override
			public Adapter caseRVariableInAtomicSwcInstanceRef(RVariableInAtomicSwcInstanceRef object) {
				return createRVariableInAtomicSwcInstanceRefAdapter();
			}
			@Override
			public Adapter caseEcucModuleConfigurationValues(EcucModuleConfigurationValues object) {
				return createEcucModuleConfigurationValuesAdapter();
			}
			@Override
			public Adapter caseEcucContainerValue(EcucContainerValue object) {
				return createEcucContainerValueAdapter();
			}
			@Override
			public Adapter caseEcucParameterValue(EcucParameterValue object) {
				return createEcucParameterValueAdapter();
			}
			@Override
			public Adapter caseEcucNumericalParamValue(EcucNumericalParamValue object) {
				return createEcucNumericalParamValueAdapter();
			}
			@Override
			public Adapter caseEcucTextualParamValue(EcucTextualParamValue object) {
				return createEcucTextualParamValueAdapter();
			}
			@Override
			public Adapter caseEcucAbstractReferenceValue(EcucAbstractReferenceValue object) {
				return createEcucAbstractReferenceValueAdapter();
			}
			@Override
			public Adapter caseEcucReferenceValue(EcucReferenceValue object) {
				return createEcucReferenceValueAdapter();
			}
			@Override
			public Adapter caseEcucInstanceReferenceValue(EcucInstanceReferenceValue object) {
				return createEcucInstanceReferenceValueAdapter();
			}
			@Override
			public Adapter caseRPortComSpec(RPortComSpec object) {
				return createRPortComSpecAdapter();
			}
			@Override
			public Adapter casePPortComSpec(PPortComSpec object) {
				return createPPortComSpecAdapter();
			}
			@Override
			public Adapter caseReceiverComSpec(ReceiverComSpec object) {
				return createReceiverComSpecAdapter();
			}
			@Override
			public Adapter caseSenderComSpec(SenderComSpec object) {
				return createSenderComSpecAdapter();
			}
			@Override
			public Adapter caseTransmissionAcknowledgementRequest(TransmissionAcknowledgementRequest object) {
				return createTransmissionAcknowledgementRequestAdapter();
			}
			@Override
			public Adapter caseNonqueuedSenderComSpec(NonqueuedSenderComSpec object) {
				return createNonqueuedSenderComSpecAdapter();
			}
			@Override
			public Adapter caseQueuedSenderComSpec(QueuedSenderComSpec object) {
				return createQueuedSenderComSpecAdapter();
			}
			@Override
			public Adapter caseNonqueuedReceiverComSpec(NonqueuedReceiverComSpec object) {
				return createNonqueuedReceiverComSpecAdapter();
			}
			@Override
			public Adapter casePortInterface(PortInterface object) {
				return createPortInterfaceAdapter();
			}
			@Override
			public Adapter caseCompositionSwComponentType(CompositionSwComponentType object) {
				return createCompositionSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseSwConnector(SwConnector object) {
				return createSwConnectorAdapter();
			}
			@Override
			public Adapter caseAssemblySwConnector(AssemblySwConnector object) {
				return createAssemblySwConnectorAdapter();
			}
			@Override
			public Adapter caseDelegationSwConnector(DelegationSwConnector object) {
				return createDelegationSwConnectorAdapter();
			}
			@Override
			public Adapter casePortPrototypeInCompositionInstanceRef(PortPrototypeInCompositionInstanceRef object) {
				return createPortPrototypeInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter caseRPortPrototypeInCompositionInstanceRef(RPortPrototypeInCompositionInstanceRef object) {
				return createRPortPrototypeInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter casePPortPrototypeInCompositionInstanceRef(PPortPrototypeInCompositionInstanceRef object) {
				return createPPortPrototypeInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter caseSwComponentPrototype(SwComponentPrototype object) {
				return createSwComponentPrototypeAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseAutosarDataType(AutosarDataType object) {
				return createAutosarDataTypeAdapter();
			}
			@Override
			public Adapter caseApplicationDataType(ApplicationDataType object) {
				return createApplicationDataTypeAdapter();
			}
			@Override
			public Adapter caseImplementationDataType(ImplementationDataType object) {
				return createImplementationDataTypeAdapter();
			}
			@Override
			public Adapter caseImplementationDataTypeElement(ImplementationDataTypeElement object) {
				return createImplementationDataTypeElementAdapter();
			}
			@Override
			public Adapter caseSwDataDefProps(SwDataDefProps object) {
				return createSwDataDefPropsAdapter();
			}
			@Override
			public Adapter caseDataTypeMap(DataTypeMap object) {
				return createDataTypeMapAdapter();
			}
			@Override
			public Adapter caseDataTypeMappingSet(DataTypeMappingSet object) {
				return createDataTypeMappingSetAdapter();
			}
			@Override
			public Adapter caseModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype object) {
				return createModeDeclarationGroupPrototypeAdapter();
			}
			@Override
			public Adapter caseModeRequestTypeMap(ModeRequestTypeMap object) {
				return createModeRequestTypeMapAdapter();
			}
			@Override
			public Adapter caseModeDeclaration(ModeDeclaration object) {
				return createModeDeclarationAdapter();
			}
			@Override
			public Adapter caseModeDeclarationGroup(ModeDeclarationGroup object) {
				return createModeDeclarationGroupAdapter();
			}
			@Override
			public Adapter caseApplicationPrimitiveDataType(ApplicationPrimitiveDataType object) {
				return createApplicationPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseAutosarDataPrototype(AutosarDataPrototype object) {
				return createAutosarDataPrototypeAdapter();
			}
			@Override
			public Adapter caseDataPrototype(DataPrototype object) {
				return createDataPrototypeAdapter();
			}
			@Override
			public Adapter caseExclusiveArea(ExclusiveArea object) {
				return createExclusiveAreaAdapter();
			}
			@Override
			public Adapter caseNumericalValueSpecification(NumericalValueSpecification object) {
				return createNumericalValueSpecificationAdapter();
			}
			@Override
			public Adapter caseTextValueSpecification(TextValueSpecification object) {
				return createTextValueSpecificationAdapter();
			}
			@Override
			public Adapter caseConstantReference(ConstantReference object) {
				return createConstantReferenceAdapter();
			}
			@Override
			public Adapter caseReferenceValueSpecification(ReferenceValueSpecification object) {
				return createReferenceValueSpecificationAdapter();
			}
			@Override
			public Adapter caseArrayValueSpecification(ArrayValueSpecification object) {
				return createArrayValueSpecificationAdapter();
			}
			@Override
			public Adapter caseRecordValueSpecification(RecordValueSpecification object) {
				return createRecordValueSpecificationAdapter();
			}
			@Override
			public Adapter caseApplicationValueSpecification(ApplicationValueSpecification object) {
				return createApplicationValueSpecificationAdapter();
			}
			@Override
			public Adapter caseConstantSpecification(ConstantSpecification object) {
				return createConstantSpecificationAdapter();
			}
			@Override
			public Adapter caseOperationInvokedEvent(OperationInvokedEvent object) {
				return createOperationInvokedEventAdapter();
			}
			@Override
			public Adapter casePOperationInAtomicSwcInstanceRef(POperationInAtomicSwcInstanceRef object) {
				return createPOperationInAtomicSwcInstanceRefAdapter();
			}
			@Override
			public Adapter caseClientServerInterface(ClientServerInterface object) {
				return createClientServerInterfaceAdapter();
			}
			@Override
			public Adapter caseClientServerOperation(ClientServerOperation object) {
				return createClientServerOperationAdapter();
			}
			@Override
			public Adapter caseApplicationError(ApplicationError object) {
				return createApplicationErrorAdapter();
			}
			@Override
			public Adapter caseArgumentDataPrototype(ArgumentDataPrototype object) {
				return createArgumentDataPrototypeAdapter();
			}
			@Override
			public Adapter caseDataFilter(DataFilter object) {
				return createDataFilterAdapter();
			}
			@Override
			public Adapter caseQueuedReceiverComSpec(QueuedReceiverComSpec object) {
				return createQueuedReceiverComSpecAdapter();
			}
			@Override
			public Adapter caseInvalidationPolicy(InvalidationPolicy object) {
				return createInvalidationPolicyAdapter();
			}
			@Override
			public Adapter casePortApiOption(PortApiOption object) {
				return createPortApiOptionAdapter();
			}
			@Override
			public Adapter casePortDefinedArgumentValue(PortDefinedArgumentValue object) {
				return createPortDefinedArgumentValueAdapter();
			}
			@Override
			public Adapter caseIncludedDataTypeSet(IncludedDataTypeSet object) {
				return createIncludedDataTypeSetAdapter();
			}
			@Override
			public Adapter caseSystem(System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseRootSwCompositionPrototype(RootSwCompositionPrototype object) {
				return createRootSwCompositionPrototypeAdapter();
			}
			@Override
			public Adapter caseSystemMapping(SystemMapping object) {
				return createSystemMappingAdapter();
			}
			@Override
			public Adapter caseDataMapping(DataMapping object) {
				return createDataMappingAdapter();
			}
			@Override
			public Adapter caseSystemSignal(SystemSignal object) {
				return createSystemSignalAdapter();
			}
			@Override
			public Adapter caseISignal(ISignal object) {
				return createISignalAdapter();
			}
			@Override
			public Adapter caseISignalIPdu(ISignalIPdu object) {
				return createISignalIPduAdapter();
			}
			@Override
			public Adapter caseISignalToIPduMapping(ISignalToIPduMapping object) {
				return createISignalToIPduMappingAdapter();
			}
			@Override
			public Adapter caseSenderReceiverToSignalMapping(SenderReceiverToSignalMapping object) {
				return createSenderReceiverToSignalMappingAdapter();
			}
			@Override
			public Adapter caseSenderReceiverToSignalGroupMapping(SenderReceiverToSignalGroupMapping object) {
				return createSenderReceiverToSignalGroupMappingAdapter();
			}
			@Override
			public Adapter caseVariableDataPrototypeInSystemInstanceRef(VariableDataPrototypeInSystemInstanceRef object) {
				return createVariableDataPrototypeInSystemInstanceRefAdapter();
			}
			@Override
			public Adapter caseEcucValueCollection(EcucValueCollection object) {
				return createEcucValueCollectionAdapter();
			}
			@Override
			public Adapter caseServerCallPoint(ServerCallPoint object) {
				return createServerCallPointAdapter();
			}
			@Override
			public Adapter caseSynchronousServerCallPoint(SynchronousServerCallPoint object) {
				return createSynchronousServerCallPointAdapter();
			}
			@Override
			public Adapter caseIInstanceRef(IInstanceRef object) {
				return createIInstanceRefAdapter();
			}
			@Override
			public Adapter caseROperationInAtomicSwcInstanceRef(ROperationInAtomicSwcInstanceRef object) {
				return createROperationInAtomicSwcInstanceRefAdapter();
			}
			@Override
			public Adapter caseSwAddrMethod(SwAddrMethod object) {
				return createSwAddrMethodAdapter();
			}
			@Override
			public Adapter caseCompuMethod(CompuMethod object) {
				return createCompuMethodAdapter();
			}
			@Override
			public Adapter caseDataConstr(DataConstr object) {
				return createDataConstrAdapter();
			}
			@Override
			public Adapter caseDataConstrRule(DataConstrRule object) {
				return createDataConstrRuleAdapter();
			}
			@Override
			public Adapter caseInternalConstrs(InternalConstrs object) {
				return createInternalConstrsAdapter();
			}
			@Override
			public Adapter caseCompu(Compu object) {
				return createCompuAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseCompuScale(CompuScale object) {
				return createCompuScaleAdapter();
			}
			@Override
			public Adapter caseCompuConst(CompuConst object) {
				return createCompuConstAdapter();
			}
			@Override
			public Adapter caseAnyInstanceRef(AnyInstanceRef object) {
				return createAnyInstanceRefAdapter();
			}
			@Override
			public Adapter caseEcuAbstractionSwComponentType(EcuAbstractionSwComponentType object) {
				return createEcuAbstractionSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseNvBlockSwComponentType(NvBlockSwComponentType object) {
				return createNvBlockSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseSensorActuatorSwComponentType(SensorActuatorSwComponentType object) {
				return createSensorActuatorSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseComplexDeviceDriverSwComponentType(ComplexDeviceDriverSwComponentType object) {
				return createComplexDeviceDriverSwComponentTypeAdapter();
			}
			@Override
			public Adapter caseServiceProxySwComponentType(ServiceProxySwComponentType object) {
				return createServiceProxySwComponentTypeAdapter();
			}
			@Override
			public Adapter caseServiceSwComponentType(ServiceSwComponentType object) {
				return createServiceSwComponentTypeAdapter();
			}
			@Override
			public Adapter casePortInCompositionInstanceRef(PortInCompositionInstanceRef object) {
				return createPortInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter casePPortInCompositionInstanceRef(PPortInCompositionInstanceRef object) {
				return createPPortInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter caseRPortInCompositionInstanceRef(RPortInCompositionInstanceRef object) {
				return createRPortInCompositionInstanceRefAdapter();
			}
			@Override
			public Adapter caseInternalBehavior(InternalBehavior object) {
				return createInternalBehaviorAdapter();
			}
			@Override
			public Adapter caseSwcBswRunnableMapping(SwcBswRunnableMapping object) {
				return createSwcBswRunnableMappingAdapter();
			}
			@Override
			public Adapter caseSwcBswMapping(SwcBswMapping object) {
				return createSwcBswMappingAdapter();
			}
			@Override
			public Adapter caseBswInternalBehavior(BswInternalBehavior object) {
				return createBswInternalBehaviorAdapter();
			}
			@Override
			public Adapter caseBswModeSenderPolicy(BswModeSenderPolicy object) {
				return createBswModeSenderPolicyAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseBswImplementation(BswImplementation object) {
				return createBswImplementationAdapter();
			}
			@Override
			public Adapter caseBswModuleDescription(BswModuleDescription object) {
				return createBswModuleDescriptionAdapter();
			}
			@Override
			public Adapter caseBswModuleEntry(BswModuleEntry object) {
				return createBswModuleEntryAdapter();
			}
			@Override
			public Adapter caseBswModuleEntity(BswModuleEntity object) {
				return createBswModuleEntityAdapter();
			}
			@Override
			public Adapter caseBswSchedulableEntity(BswSchedulableEntity object) {
				return createBswSchedulableEntityAdapter();
			}
			@Override
			public Adapter caseBswEvent(BswEvent object) {
				return createBswEventAdapter();
			}
			@Override
			public Adapter caseBswModeSwitchEvent(BswModeSwitchEvent object) {
				return createBswModeSwitchEventAdapter();
			}
			@Override
			public Adapter caseModeInBswModuleDescriptionInstanceRef(ModeInBswModuleDescriptionInstanceRef object) {
				return createModeInBswModuleDescriptionInstanceRefAdapter();
			}
			@Override
			public Adapter caseBswTimingEvent(BswTimingEvent object) {
				return createBswTimingEventAdapter();
			}
			@Override
			public Adapter caseBswBackgroundEvent(BswBackgroundEvent object) {
				return createBswBackgroundEventAdapter();
			}
			@Override
			public Adapter caseBswCalledEntity(BswCalledEntity object) {
				return createBswCalledEntityAdapter();
			}
			@Override
			public Adapter caseBswInterruptEntity(BswInterruptEntity object) {
				return createBswInterruptEntityAdapter();
			}
			@Override
			public Adapter caseSystemSignalGroup(SystemSignalGroup object) {
				return createSystemSignalGroupAdapter();
			}
			@Override
			public Adapter caseISignalGroup(ISignalGroup object) {
				return createISignalGroupAdapter();
			}
			@Override
			public Adapter caseSenderRecCompositeTypeMapping(SenderRecCompositeTypeMapping object) {
				return createSenderRecCompositeTypeMappingAdapter();
			}
			@Override
			public Adapter caseSenderRecRecordTypeMapping(SenderRecRecordTypeMapping object) {
				return createSenderRecRecordTypeMappingAdapter();
			}
			@Override
			public Adapter caseSenderRecRecordElementMapping(SenderRecRecordElementMapping object) {
				return createSenderRecRecordElementMappingAdapter();
			}
			@Override
			public Adapter caseSenderRecArrayTypeMapping(SenderRecArrayTypeMapping object) {
				return createSenderRecArrayTypeMappingAdapter();
			}
			@Override
			public Adapter caseIndexedArrayElement(IndexedArrayElement object) {
				return createIndexedArrayElementAdapter();
			}
			@Override
			public Adapter caseSenderRecArrayElementMapping(SenderRecArrayElementMapping object) {
				return createSenderRecArrayElementMappingAdapter();
			}
			@Override
			public Adapter caseSwPointerTargetProps(SwPointerTargetProps object) {
				return createSwPointerTargetPropsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root
	 * @generated
	 */
	public Adapter createM2RootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar <em>Autosar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar
	 * @generated
	 */
	public Adapter createAutosarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage <em>Ar Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage
	 * @generated
	 */
	public Adapter createArPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArElement <em>Ar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArElement
	 * @generated
	 */
	public Adapter createArElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object
	 * @generated
	 */
	public Adapter createM2ObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType <em>Sw Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType
	 * @generated
	 */
	public Adapter createSwBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface <em>Sender Receiver Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface
	 * @generated
	 */
	public Adapter createSenderReceiverInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype <em>Variable Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype
	 * @generated
	 */
	public Adapter createVariableDataPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType <em>Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType
	 * @generated
	 */
	public Adapter createSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype <em>Port Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype
	 * @generated
	 */
	public Adapter createPortPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType <em>Atomic Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType
	 * @generated
	 */
	public Adapter createAtomicSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationSwComponentType <em>Application Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationSwComponentType
	 * @generated
	 */
	public Adapter createApplicationSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype <em>RPort Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype
	 * @generated
	 */
	public Adapter createRPortPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype <em>PPort Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype
	 * @generated
	 */
	public Adapter createPPortPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior <em>Swc Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior
	 * @generated
	 */
	public Adapter createSwcInternalBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity
	 * @generated
	 */
	public Adapter createExecutableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity <em>Runnable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity
	 * @generated
	 */
	public Adapter createRunnableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess
	 * @generated
	 */
	public Adapter createVariableAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef <em>Autosar Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef
	 * @generated
	 */
	public Adapter createAutosarVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef <em>Variable In Atomic Swc Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef
	 * @generated
	 */
	public Adapter createVariableInAtomicSwcTypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent <em>Rte Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent
	 * @generated
	 */
	public Adapter createRteEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent <em>Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent
	 * @generated
	 */
	public Adapter createTimingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent <em>Background Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent
	 * @generated
	 */
	public Adapter createBackgroundEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent <em>Data Send Completed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent
	 * @generated
	 */
	public Adapter createDataSendCompletedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent <em>Data Received Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent
	 * @generated
	 */
	public Adapter createDataReceivedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent <em>Data Receive Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent
	 * @generated
	 */
	public Adapter createDataReceiveErrorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef <em>RVariable In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef
	 * @generated
	 */
	public Adapter createRVariableInAtomicSwcInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues <em>Ecuc Module Configuration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues
	 * @generated
	 */
	public Adapter createEcucModuleConfigurationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue <em>Ecuc Container Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue
	 * @generated
	 */
	public Adapter createEcucContainerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue <em>Ecuc Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue
	 * @generated
	 */
	public Adapter createEcucParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue <em>Ecuc Numerical Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue
	 * @generated
	 */
	public Adapter createEcucNumericalParamValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue <em>Ecuc Textual Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue
	 * @generated
	 */
	public Adapter createEcucTextualParamValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue <em>Ecuc Abstract Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue
	 * @generated
	 */
	public Adapter createEcucAbstractReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue <em>Ecuc Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue
	 * @generated
	 */
	public Adapter createEcucReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue <em>Ecuc Instance Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue
	 * @generated
	 */
	public Adapter createEcucInstanceReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortComSpec <em>RPort Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortComSpec
	 * @generated
	 */
	public Adapter createRPortComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortComSpec <em>PPort Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortComSpec
	 * @generated
	 */
	public Adapter createPPortComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec <em>Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec
	 * @generated
	 */
	public Adapter createReceiverComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec <em>Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec
	 * @generated
	 */
	public Adapter createSenderComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest <em>Transmission Acknowledgement Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest
	 * @generated
	 */
	public Adapter createTransmissionAcknowledgementRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec <em>Nonqueued Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec
	 * @generated
	 */
	public Adapter createNonqueuedSenderComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedSenderComSpec <em>Queued Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedSenderComSpec
	 * @generated
	 */
	public Adapter createQueuedSenderComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec <em>Nonqueued Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec
	 * @generated
	 */
	public Adapter createNonqueuedReceiverComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInterface <em>Port Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInterface
	 * @generated
	 */
	public Adapter createPortInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType <em>Composition Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType
	 * @generated
	 */
	public Adapter createCompositionSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector <em>Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector
	 * @generated
	 */
	public Adapter createSwConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector <em>Assembly Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector
	 * @generated
	 */
	public Adapter createAssemblySwConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector <em>Delegation Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector
	 * @generated
	 */
	public Adapter createDelegationSwConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef <em>RPort Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createRPortPrototypeInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef <em>PPort Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createPPortPrototypeInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype <em>Sw Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype
	 * @generated
	 */
	public Adapter createSwComponentPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType <em>Autosar Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType
	 * @generated
	 */
	public Adapter createAutosarDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType <em>Application Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType
	 * @generated
	 */
	public Adapter createApplicationDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType
	 * @generated
	 */
	public Adapter createImplementationDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps
	 * @generated
	 */
	public Adapter createSwDataDefPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap <em>Data Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap
	 * @generated
	 */
	public Adapter createDataTypeMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet <em>Data Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet
	 * @generated
	 */
	public Adapter createDataTypeMappingSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype <em>Mode Declaration Group Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype
	 * @generated
	 */
	public Adapter createModeDeclarationGroupPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap <em>Mode Request Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap
	 * @generated
	 */
	public Adapter createModeRequestTypeMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration <em>Mode Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration
	 * @generated
	 */
	public Adapter createModeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup <em>Mode Declaration Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup
	 * @generated
	 */
	public Adapter createModeDeclarationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationPrimitiveDataType <em>Application Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationPrimitiveDataType
	 * @generated
	 */
	public Adapter createApplicationPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype <em>Autosar Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype
	 * @generated
	 */
	public Adapter createAutosarDataPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype <em>Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype
	 * @generated
	 */
	public Adapter createDataPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea <em>Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea
	 * @generated
	 */
	public Adapter createExclusiveAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification <em>Numerical Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification
	 * @generated
	 */
	public Adapter createNumericalValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification <em>Text Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification
	 * @generated
	 */
	public Adapter createTextValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference <em>Constant Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference
	 * @generated
	 */
	public Adapter createConstantReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReferenceValueSpecification <em>Reference Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReferenceValueSpecification
	 * @generated
	 */
	public Adapter createReferenceValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification <em>Array Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification
	 * @generated
	 */
	public Adapter createArrayValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification <em>Record Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification
	 * @generated
	 */
	public Adapter createRecordValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationValueSpecification <em>Application Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationValueSpecification
	 * @generated
	 */
	public Adapter createApplicationValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification <em>Constant Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification
	 * @generated
	 */
	public Adapter createConstantSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent <em>Operation Invoked Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent
	 * @generated
	 */
	public Adapter createOperationInvokedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef <em>POperation In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef
	 * @generated
	 */
	public Adapter createPOperationInAtomicSwcInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface <em>Client Server Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface
	 * @generated
	 */
	public Adapter createClientServerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation <em>Client Server Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation
	 * @generated
	 */
	public Adapter createClientServerOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError <em>Application Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError
	 * @generated
	 */
	public Adapter createApplicationErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype <em>Argument Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype
	 * @generated
	 */
	public Adapter createArgumentDataPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter <em>Data Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter
	 * @generated
	 */
	public Adapter createDataFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec <em>Queued Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec
	 * @generated
	 */
	public Adapter createQueuedReceiverComSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy <em>Invalidation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy
	 * @generated
	 */
	public Adapter createInvalidationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption <em>Port Api Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption
	 * @generated
	 */
	public Adapter createPortApiOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue <em>Port Defined Argument Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue
	 * @generated
	 */
	public Adapter createPortDefinedArgumentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet <em>Included Data Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet
	 * @generated
	 */
	public Adapter createIncludedDataTypeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype <em>Root Sw Composition Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype
	 * @generated
	 */
	public Adapter createRootSwCompositionPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping <em>System Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping
	 * @generated
	 */
	public Adapter createSystemMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataMapping
	 * @generated
	 */
	public Adapter createDataMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal
	 * @generated
	 */
	public Adapter createSystemSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal <em>ISignal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal
	 * @generated
	 */
	public Adapter createISignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu <em>ISignal IPdu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu
	 * @generated
	 */
	public Adapter createISignalIPduAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping <em>ISignal To IPdu Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping
	 * @generated
	 */
	public Adapter createISignalToIPduMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping <em>Sender Receiver To Signal Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping
	 * @generated
	 */
	public Adapter createSenderReceiverToSignalMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping <em>Sender Receiver To Signal Group Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping
	 * @generated
	 */
	public Adapter createSenderReceiverToSignalGroupMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef <em>Variable Data Prototype In System Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef
	 * @generated
	 */
	public Adapter createVariableDataPrototypeInSystemInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection <em>Ecuc Value Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection
	 * @generated
	 */
	public Adapter createEcucValueCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint <em>Server Call Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint
	 * @generated
	 */
	public Adapter createServerCallPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SynchronousServerCallPoint <em>Synchronous Server Call Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SynchronousServerCallPoint
	 * @generated
	 */
	public Adapter createSynchronousServerCallPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef <em>IInstance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef
	 * @generated
	 */
	public Adapter createIInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef <em>ROperation In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef
	 * @generated
	 */
	public Adapter createROperationInAtomicSwcInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef <em>Port Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createPortPrototypeInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod
	 * @generated
	 */
	public Adapter createSwAddrMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod <em>Compu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod
	 * @generated
	 */
	public Adapter createCompuMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr <em>Data Constr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr
	 * @generated
	 */
	public Adapter createDataConstrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule <em>Data Constr Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule
	 * @generated
	 */
	public Adapter createDataConstrRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs <em>Internal Constrs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs
	 * @generated
	 */
	public Adapter createInternalConstrsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu <em>Compu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu
	 * @generated
	 */
	public Adapter createCompuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale <em>Compu Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale
	 * @generated
	 */
	public Adapter createCompuScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst <em>Compu Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst
	 * @generated
	 */
	public Adapter createCompuConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef <em>Any Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef
	 * @generated
	 */
	public Adapter createAnyInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcuAbstractionSwComponentType <em>Ecu Abstraction Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcuAbstractionSwComponentType
	 * @generated
	 */
	public Adapter createEcuAbstractionSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NvBlockSwComponentType <em>Nv Block Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NvBlockSwComponentType
	 * @generated
	 */
	public Adapter createNvBlockSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SensorActuatorSwComponentType <em>Sensor Actuator Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SensorActuatorSwComponentType
	 * @generated
	 */
	public Adapter createSensorActuatorSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ComplexDeviceDriverSwComponentType <em>Complex Device Driver Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ComplexDeviceDriverSwComponentType
	 * @generated
	 */
	public Adapter createComplexDeviceDriverSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceProxySwComponentType <em>Service Proxy Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceProxySwComponentType
	 * @generated
	 */
	public Adapter createServiceProxySwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceSwComponentType <em>Service Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceSwComponentType
	 * @generated
	 */
	public Adapter createServiceSwComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef <em>Port In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createPortInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef <em>PPort In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createPPortInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef <em>RPort In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef
	 * @generated
	 */
	public Adapter createRPortInCompositionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior
	 * @generated
	 */
	public Adapter createInternalBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping <em>Swc Bsw Runnable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping
	 * @generated
	 */
	public Adapter createSwcBswRunnableMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping <em>Swc Bsw Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping
	 * @generated
	 */
	public Adapter createSwcBswMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior <em>Bsw Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior
	 * @generated
	 */
	public Adapter createBswInternalBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy <em>Bsw Mode Sender Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy
	 * @generated
	 */
	public Adapter createBswModeSenderPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation <em>Bsw Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation
	 * @generated
	 */
	public Adapter createBswImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription <em>Bsw Module Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription
	 * @generated
	 */
	public Adapter createBswModuleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry <em>Bsw Module Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry
	 * @generated
	 */
	public Adapter createBswModuleEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity <em>Bsw Module Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity
	 * @generated
	 */
	public Adapter createBswModuleEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity
	 * @generated
	 */
	public Adapter createBswSchedulableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent <em>Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent
	 * @generated
	 */
	public Adapter createBswEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent <em>Bsw Mode Switch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent
	 * @generated
	 */
	public Adapter createBswModeSwitchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef <em>Mode In Bsw Module Description Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef
	 * @generated
	 */
	public Adapter createModeInBswModuleDescriptionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent <em>Bsw Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent
	 * @generated
	 */
	public Adapter createBswTimingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswBackgroundEvent <em>Bsw Background Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswBackgroundEvent
	 * @generated
	 */
	public Adapter createBswBackgroundEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCalledEntity <em>Bsw Called Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCalledEntity
	 * @generated
	 */
	public Adapter createBswCalledEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity <em>Bsw Interrupt Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity
	 * @generated
	 */
	public Adapter createBswInterruptEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement <em>Implementation Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement
	 * @generated
	 */
	public Adapter createImplementationDataTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup <em>System Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup
	 * @generated
	 */
	public Adapter createSystemSignalGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup <em>ISignal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup
	 * @generated
	 */
	public Adapter createISignalGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping <em>Sender Rec Composite Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping
	 * @generated
	 */
	public Adapter createSenderRecCompositeTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping <em>Sender Rec Record Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping
	 * @generated
	 */
	public Adapter createSenderRecRecordTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping <em>Sender Rec Record Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping
	 * @generated
	 */
	public Adapter createSenderRecRecordElementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping <em>Sender Rec Array Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping
	 * @generated
	 */
	public Adapter createSenderRecArrayTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement <em>Indexed Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement
	 * @generated
	 */
	public Adapter createIndexedArrayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping <em>Sender Rec Array Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping
	 * @generated
	 */
	public Adapter createSenderRecArrayElementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps <em>Sw Pointer Target Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps
	 * @generated
	 */
	public Adapter createSwPointerTargetPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //M2AdapterFactory
