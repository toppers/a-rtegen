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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage
 * @generated
 */
public class ExAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExPackage.eINSTANCE;
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
	protected ExSwitch<Adapter> modelSwitch =
		new ExSwitch<Adapter>() {
			@Override
			public Adapter caseTimeValueEx(TimeValueEx object) {
				return createTimeValueExAdapter();
			}
			@Override
			public Adapter caseAlignmentTypeEx(AlignmentTypeEx object) {
				return createAlignmentTypeExAdapter();
			}
			@Override
			public Adapter caseAtomicSwComponentTypeEx(AtomicSwComponentTypeEx object) {
				return createAtomicSwComponentTypeExAdapter();
			}
			@Override
			public Adapter caseValueSpecificationEx(ValueSpecificationEx object) {
				return createValueSpecificationExAdapter();
			}
			@Override
			public Adapter caseNonqueuedSenderComSpecEx(NonqueuedSenderComSpecEx object) {
				return createNonqueuedSenderComSpecExAdapter();
			}
			@Override
			public Adapter caseCompuMethodEx(CompuMethodEx object) {
				return createCompuMethodExAdapter();
			}
			@Override
			public Adapter caseCompuScaleEx(CompuScaleEx object) {
				return createCompuScaleExAdapter();
			}
			@Override
			public Adapter caseApplicationDataTypeEx(ApplicationDataTypeEx object) {
				return createApplicationDataTypeExAdapter();
			}
			@Override
			public Adapter caseImplementationDataTypeEx(ImplementationDataTypeEx object) {
				return createImplementationDataTypeExAdapter();
			}
			@Override
			public Adapter caseExclusiveAreaEx(ExclusiveAreaEx object) {
				return createExclusiveAreaExAdapter();
			}
			@Override
			public Adapter caseSenderReceiverToSignalMappingEx(SenderReceiverToSignalMappingEx object) {
				return createSenderReceiverToSignalMappingExAdapter();
			}
			@Override
			public Adapter caseSenderReceiverToSignalGroupMappingEx(SenderReceiverToSignalGroupMappingEx object) {
				return createSenderReceiverToSignalGroupMappingExAdapter();
			}
			@Override
			public Adapter caseOsTaskEx(OsTaskEx object) {
				return createOsTaskExAdapter();
			}
			@Override
			public Adapter caseComSignalEx(ComSignalEx object) {
				return createComSignalExAdapter();
			}
			@Override
			public Adapter caseComSignalGroupEx(ComSignalGroupEx object) {
				return createComSignalGroupExAdapter();
			}
			@Override
			public Adapter caseEcucPartitionEx(EcucPartitionEx object) {
				return createEcucPartitionExAdapter();
			}
			@Override
			public Adapter caseVariableDataPrototypeEx(VariableDataPrototypeEx object) {
				return createVariableDataPrototypeExAdapter();
			}
			@Override
			public Adapter caseVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx object) {
				return createVariableDataInstanceInCompositionExAdapter();
			}
			@Override
			public Adapter caseVariableDataInstanceInSwcEx(VariableDataInstanceInSwcEx object) {
				return createVariableDataInstanceInSwcExAdapter();
			}
			@Override
			public Adapter casePVariableDataInstanceInSwcEx(PVariableDataInstanceInSwcEx object) {
				return createPVariableDataInstanceInSwcExAdapter();
			}
			@Override
			public Adapter caseRVariableDataInstanceInSwcEx(RVariableDataInstanceInSwcEx object) {
				return createRVariableDataInstanceInSwcExAdapter();
			}
			@Override
			public Adapter caseROperationInstanceInSwcEx(ROperationInstanceInSwcEx object) {
				return createROperationInstanceInSwcExAdapter();
			}
			@Override
			public Adapter caseAssemblyDataInstanceConnectorEx(AssemblyDataInstanceConnectorEx object) {
				return createAssemblyDataInstanceConnectorExAdapter();
			}
			@Override
			public Adapter caseReceiverEx(ReceiverEx object) {
				return createReceiverExAdapter();
			}
			@Override
			public Adapter caseExternalEcuSenderEx(ExternalEcuSenderEx object) {
				return createExternalEcuSenderExAdapter();
			}
			@Override
			public Adapter caseExternalEcuReceiverEx(ExternalEcuReceiverEx object) {
				return createExternalEcuReceiverExAdapter();
			}
			@Override
			public Adapter caseEntityStarterEx(EntityStarterEx object) {
				return createEntityStarterExAdapter();
			}
			@Override
			public Adapter caseBswSchedulableEntityEx(BswSchedulableEntityEx object) {
				return createBswSchedulableEntityExAdapter();
			}
			@Override
			public Adapter caseModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx object) {
				return createModeDeclarationGroupPrototypeExAdapter();
			}
			@Override
			public Adapter caseRteEventEx(RteEventEx object) {
				return createRteEventExAdapter();
			}
			@Override
			public Adapter caseComGroupSignalEx(ComGroupSignalEx object) {
				return createComGroupSignalExAdapter();
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
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx <em>Time Value Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx
	 * @generated
	 */
	public Adapter createTimeValueExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx <em>Alignment Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx
	 * @generated
	 */
	public Adapter createAlignmentTypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx <em>Receiver Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx
	 * @generated
	 */
	public Adapter createReceiverExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx <em>External Ecu Sender Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx
	 * @generated
	 */
	public Adapter createExternalEcuSenderExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx <em>External Ecu Receiver Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx
	 * @generated
	 */
	public Adapter createExternalEcuReceiverExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx <em>Entity Starter Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx
	 * @generated
	 */
	public Adapter createEntityStarterExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx
	 * @generated
	 */
	public Adapter createBswSchedulableEntityExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx
	 * @generated
	 */
	public Adapter createModeDeclarationGroupPrototypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx <em>Rte Event Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx
	 * @generated
	 */
	public Adapter createRteEventExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx <em>Com Group Signal Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx
	 * @generated
	 */
	public Adapter createComGroupSignalExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx <em>Assembly Data Instance Connector Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx
	 * @generated
	 */
	public Adapter createAssemblyDataInstanceConnectorExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx
	 * @generated
	 */
	public Adapter createVariableDataInstanceInCompositionExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx <em>Com Signal Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx
	 * @generated
	 */
	public Adapter createComSignalExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx <em>Com Signal Group Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx
	 * @generated
	 */
	public Adapter createComSignalGroupExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx <em>Variable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx
	 * @generated
	 */
	public Adapter createVariableDataInstanceInSwcExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx <em>RVariable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx
	 * @generated
	 */
	public Adapter createRVariableDataInstanceInSwcExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx <em>PVariable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx
	 * @generated
	 */
	public Adapter createPVariableDataInstanceInSwcExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx <em>ROperation Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx
	 * @generated
	 */
	public Adapter createROperationInstanceInSwcExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx <em>Sender Receiver To Signal Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx
	 * @generated
	 */
	public Adapter createSenderReceiverToSignalMappingExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx <em>Sender Receiver To Signal Group Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx
	 * @generated
	 */
	public Adapter createSenderReceiverToSignalGroupMappingExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx <em>Os Task Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx
	 * @generated
	 */
	public Adapter createOsTaskExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx <em>Ecuc Partition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx
	 * @generated
	 */
	public Adapter createEcucPartitionExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx <em>Variable Data Prototype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx
	 * @generated
	 */
	public Adapter createVariableDataPrototypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx <em>Atomic Sw Component Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx
	 * @generated
	 */
	public Adapter createAtomicSwComponentTypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx <em>Value Specification Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx
	 * @generated
	 */
	public Adapter createValueSpecificationExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx <em>Nonqueued Sender Com Spec Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx
	 * @generated
	 */
	public Adapter createNonqueuedSenderComSpecExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx <em>Compu Method Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx
	 * @generated
	 */
	public Adapter createCompuMethodExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx <em>Compu Scale Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx
	 * @generated
	 */
	public Adapter createCompuScaleExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx <em>Application Data Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx
	 * @generated
	 */
	public Adapter createApplicationDataTypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx <em>Implementation Data Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx
	 * @generated
	 */
	public Adapter createImplementationDataTypeExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx <em>Exclusive Area Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx
	 * @generated
	 */
	public Adapter createExclusiveAreaExAdapter() {
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

} //ExAdapterFactory
