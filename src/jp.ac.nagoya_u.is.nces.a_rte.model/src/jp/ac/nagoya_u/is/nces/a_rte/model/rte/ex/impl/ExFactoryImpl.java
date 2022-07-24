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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.*;

import org.eclipse.emf.ecore.EClass;
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
public class ExFactoryImpl extends EFactoryImpl implements ExFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExFactory init() {
		try {
			ExFactory theExFactory = (ExFactory)EPackage.Registry.INSTANCE.getEFactory(ExPackage.eNS_URI);
			if (theExFactory != null) {
				return theExFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExFactoryImpl() {
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
			case ExPackage.TIME_VALUE_EX: return (EObject)createTimeValueEx();
			case ExPackage.ALIGNMENT_TYPE_EX: return (EObject)createAlignmentTypeEx();
			case ExPackage.ATOMIC_SW_COMPONENT_TYPE_EX: return (EObject)createAtomicSwComponentTypeEx();
			case ExPackage.VALUE_SPECIFICATION_EX: return (EObject)createValueSpecificationEx();
			case ExPackage.NONQUEUED_SENDER_COM_SPEC_EX: return (EObject)createNonqueuedSenderComSpecEx();
			case ExPackage.COMPU_METHOD_EX: return (EObject)createCompuMethodEx();
			case ExPackage.COMPU_SCALE_EX: return (EObject)createCompuScaleEx();
			case ExPackage.APPLICATION_DATA_TYPE_EX: return (EObject)createApplicationDataTypeEx();
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX: return (EObject)createImplementationDataTypeEx();
			case ExPackage.EXCLUSIVE_AREA_EX: return (EObject)createExclusiveAreaEx();
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX: return (EObject)createSenderReceiverToSignalMappingEx();
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX: return (EObject)createSenderReceiverToSignalGroupMappingEx();
			case ExPackage.OS_TASK_EX: return (EObject)createOsTaskEx();
			case ExPackage.COM_SIGNAL_EX: return (EObject)createComSignalEx();
			case ExPackage.COM_SIGNAL_GROUP_EX: return (EObject)createComSignalGroupEx();
			case ExPackage.ECUC_PARTITION_EX: return (EObject)createEcucPartitionEx();
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX: return (EObject)createVariableDataPrototypeEx();
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX: return (EObject)createVariableDataInstanceInCompositionEx();
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createVariableDataInstanceInSwcEx();
			case ExPackage.PVARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createPVariableDataInstanceInSwcEx();
			case ExPackage.RVARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createRVariableDataInstanceInSwcEx();
			case ExPackage.ROPERATION_INSTANCE_IN_SWC_EX: return (EObject)createROperationInstanceInSwcEx();
			case ExPackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX: return (EObject)createAssemblyDataInstanceConnectorEx();
			case ExPackage.RECEIVER_EX: return (EObject)createReceiverEx();
			case ExPackage.EXTERNAL_ECU_SENDER_EX: return (EObject)createExternalEcuSenderEx();
			case ExPackage.EXTERNAL_ECU_RECEIVER_EX: return (EObject)createExternalEcuReceiverEx();
			case ExPackage.ENTITY_STARTER_EX: return (EObject)createEntityStarterEx();
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX: return (EObject)createBswSchedulableEntityEx();
			case ExPackage.MODE_DECLARATION_GROUP_PROTOTYPE_EX: return (EObject)createModeDeclarationGroupPrototypeEx();
			case ExPackage.RTE_EVENT_EX: return (EObject)createRteEventEx();
			case ExPackage.COM_GROUP_SIGNAL_EX: return (EObject)createComGroupSignalEx();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueEx createTimeValueEx() {
		TimeValueExImpl timeValueEx = new TimeValueExImpl();
		return timeValueEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentTypeEx createAlignmentTypeEx() {
		AlignmentTypeExImpl alignmentTypeEx = new AlignmentTypeExImpl();
		return alignmentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverEx createReceiverEx() {
		ReceiverExImpl receiverEx = new ReceiverExImpl();
		return receiverEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuSenderEx createExternalEcuSenderEx() {
		ExternalEcuSenderExImpl externalEcuSenderEx = new ExternalEcuSenderExImpl();
		return externalEcuSenderEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuReceiverEx createExternalEcuReceiverEx() {
		ExternalEcuReceiverExImpl externalEcuReceiverEx = new ExternalEcuReceiverExImpl();
		return externalEcuReceiverEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarterEx createEntityStarterEx() {
		EntityStarterExImpl entityStarterEx = new EntityStarterExImpl();
		return entityStarterEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityEx createBswSchedulableEntityEx() {
		BswSchedulableEntityExImpl bswSchedulableEntityEx = new BswSchedulableEntityExImpl();
		return bswSchedulableEntityEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx createModeDeclarationGroupPrototypeEx() {
		ModeDeclarationGroupPrototypeExImpl modeDeclarationGroupPrototypeEx = new ModeDeclarationGroupPrototypeExImpl();
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEventEx createRteEventEx() {
		RteEventExImpl rteEventEx = new RteEventExImpl();
		return rteEventEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComGroupSignalEx createComGroupSignalEx() {
		ComGroupSignalExImpl comGroupSignalEx = new ComGroupSignalExImpl();
		return comGroupSignalEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDataInstanceConnectorEx createAssemblyDataInstanceConnectorEx() {
		AssemblyDataInstanceConnectorExImpl assemblyDataInstanceConnectorEx = new AssemblyDataInstanceConnectorExImpl();
		return assemblyDataInstanceConnectorEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInCompositionEx createVariableDataInstanceInCompositionEx() {
		VariableDataInstanceInCompositionExImpl variableDataInstanceInCompositionEx = new VariableDataInstanceInCompositionExImpl();
		return variableDataInstanceInCompositionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalEx createComSignalEx() {
		ComSignalExImpl comSignalEx = new ComSignalExImpl();
		return comSignalEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroupEx createComSignalGroupEx() {
		ComSignalGroupExImpl comSignalGroupEx = new ComSignalGroupExImpl();
		return comSignalGroupEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwcEx createVariableDataInstanceInSwcEx() {
		VariableDataInstanceInSwcExImpl variableDataInstanceInSwcEx = new VariableDataInstanceInSwcExImpl();
		return variableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RVariableDataInstanceInSwcEx createRVariableDataInstanceInSwcEx() {
		RVariableDataInstanceInSwcExImpl rVariableDataInstanceInSwcEx = new RVariableDataInstanceInSwcExImpl();
		return rVariableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVariableDataInstanceInSwcEx createPVariableDataInstanceInSwcEx() {
		PVariableDataInstanceInSwcExImpl pVariableDataInstanceInSwcEx = new PVariableDataInstanceInSwcExImpl();
		return pVariableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROperationInstanceInSwcEx createROperationInstanceInSwcEx() {
		ROperationInstanceInSwcExImpl rOperationInstanceInSwcEx = new ROperationInstanceInSwcExImpl();
		return rOperationInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx createSenderReceiverToSignalMappingEx() {
		SenderReceiverToSignalMappingExImpl senderReceiverToSignalMappingEx = new SenderReceiverToSignalMappingExImpl();
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalGroupMappingEx createSenderReceiverToSignalGroupMappingEx() {
		SenderReceiverToSignalGroupMappingExImpl senderReceiverToSignalGroupMappingEx = new SenderReceiverToSignalGroupMappingExImpl();
		return senderReceiverToSignalGroupMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskEx createOsTaskEx() {
		OsTaskExImpl osTaskEx = new OsTaskExImpl();
		return osTaskEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartitionEx createEcucPartitionEx() {
		EcucPartitionExImpl ecucPartitionEx = new EcucPartitionExImpl();
		return ecucPartitionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototypeEx createVariableDataPrototypeEx() {
		VariableDataPrototypeExImpl variableDataPrototypeEx = new VariableDataPrototypeExImpl();
		return variableDataPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSwComponentTypeEx createAtomicSwComponentTypeEx() {
		AtomicSwComponentTypeExImpl atomicSwComponentTypeEx = new AtomicSwComponentTypeExImpl();
		return atomicSwComponentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationEx createValueSpecificationEx() {
		ValueSpecificationExImpl valueSpecificationEx = new ValueSpecificationExImpl();
		return valueSpecificationEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonqueuedSenderComSpecEx createNonqueuedSenderComSpecEx() {
		NonqueuedSenderComSpecExImpl nonqueuedSenderComSpecEx = new NonqueuedSenderComSpecExImpl();
		return nonqueuedSenderComSpecEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethodEx createCompuMethodEx() {
		CompuMethodExImpl compuMethodEx = new CompuMethodExImpl();
		return compuMethodEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuScaleEx createCompuScaleEx() {
		CompuScaleExImpl compuScaleEx = new CompuScaleExImpl();
		return compuScaleEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataTypeEx createApplicationDataTypeEx() {
		ApplicationDataTypeExImpl applicationDataTypeEx = new ApplicationDataTypeExImpl();
		return applicationDataTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeEx createImplementationDataTypeEx() {
		ImplementationDataTypeExImpl implementationDataTypeEx = new ImplementationDataTypeExImpl();
		return implementationDataTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveAreaEx createExclusiveAreaEx() {
		ExclusiveAreaExImpl exclusiveAreaEx = new ExclusiveAreaExImpl();
		return exclusiveAreaEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExPackage getExPackage() {
		return (ExPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExPackage getPackage() {
		return ExPackage.eINSTANCE;
	}

} //ExFactoryImpl
