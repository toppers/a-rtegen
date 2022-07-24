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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage
 * @generated
 */
public class ExSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExSwitch() {
		if (modelPackage == null) {
			modelPackage = ExPackage.eINSTANCE;
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
			case ExPackage.TIME_VALUE_EX: {
				TimeValueEx timeValueEx = (TimeValueEx)theEObject;
				T result = caseTimeValueEx(timeValueEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ALIGNMENT_TYPE_EX: {
				AlignmentTypeEx alignmentTypeEx = (AlignmentTypeEx)theEObject;
				T result = caseAlignmentTypeEx(alignmentTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ATOMIC_SW_COMPONENT_TYPE_EX: {
				AtomicSwComponentTypeEx atomicSwComponentTypeEx = (AtomicSwComponentTypeEx)theEObject;
				T result = caseAtomicSwComponentTypeEx(atomicSwComponentTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VALUE_SPECIFICATION_EX: {
				ValueSpecificationEx valueSpecificationEx = (ValueSpecificationEx)theEObject;
				T result = caseValueSpecificationEx(valueSpecificationEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.NONQUEUED_SENDER_COM_SPEC_EX: {
				NonqueuedSenderComSpecEx nonqueuedSenderComSpecEx = (NonqueuedSenderComSpecEx)theEObject;
				T result = caseNonqueuedSenderComSpecEx(nonqueuedSenderComSpecEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COMPU_METHOD_EX: {
				CompuMethodEx compuMethodEx = (CompuMethodEx)theEObject;
				T result = caseCompuMethodEx(compuMethodEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COMPU_SCALE_EX: {
				CompuScaleEx compuScaleEx = (CompuScaleEx)theEObject;
				T result = caseCompuScaleEx(compuScaleEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.APPLICATION_DATA_TYPE_EX: {
				ApplicationDataTypeEx applicationDataTypeEx = (ApplicationDataTypeEx)theEObject;
				T result = caseApplicationDataTypeEx(applicationDataTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX: {
				ImplementationDataTypeEx implementationDataTypeEx = (ImplementationDataTypeEx)theEObject;
				T result = caseImplementationDataTypeEx(implementationDataTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.EXCLUSIVE_AREA_EX: {
				ExclusiveAreaEx exclusiveAreaEx = (ExclusiveAreaEx)theEObject;
				T result = caseExclusiveAreaEx(exclusiveAreaEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX: {
				SenderReceiverToSignalMappingEx senderReceiverToSignalMappingEx = (SenderReceiverToSignalMappingEx)theEObject;
				T result = caseSenderReceiverToSignalMappingEx(senderReceiverToSignalMappingEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX: {
				SenderReceiverToSignalGroupMappingEx senderReceiverToSignalGroupMappingEx = (SenderReceiverToSignalGroupMappingEx)theEObject;
				T result = caseSenderReceiverToSignalGroupMappingEx(senderReceiverToSignalGroupMappingEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.OS_TASK_EX: {
				OsTaskEx osTaskEx = (OsTaskEx)theEObject;
				T result = caseOsTaskEx(osTaskEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COM_SIGNAL_EX: {
				ComSignalEx comSignalEx = (ComSignalEx)theEObject;
				T result = caseComSignalEx(comSignalEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COM_SIGNAL_GROUP_EX: {
				ComSignalGroupEx comSignalGroupEx = (ComSignalGroupEx)theEObject;
				T result = caseComSignalGroupEx(comSignalGroupEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ECUC_PARTITION_EX: {
				EcucPartitionEx ecucPartitionEx = (EcucPartitionEx)theEObject;
				T result = caseEcucPartitionEx(ecucPartitionEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX: {
				VariableDataPrototypeEx variableDataPrototypeEx = (VariableDataPrototypeEx)theEObject;
				T result = caseVariableDataPrototypeEx(variableDataPrototypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX: {
				VariableDataInstanceInCompositionEx variableDataInstanceInCompositionEx = (VariableDataInstanceInCompositionEx)theEObject;
				T result = caseVariableDataInstanceInCompositionEx(variableDataInstanceInCompositionEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				VariableDataInstanceInSwcEx variableDataInstanceInSwcEx = (VariableDataInstanceInSwcEx)theEObject;
				T result = caseVariableDataInstanceInSwcEx(variableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.PVARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				PVariableDataInstanceInSwcEx pVariableDataInstanceInSwcEx = (PVariableDataInstanceInSwcEx)theEObject;
				T result = casePVariableDataInstanceInSwcEx(pVariableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.RVARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				RVariableDataInstanceInSwcEx rVariableDataInstanceInSwcEx = (RVariableDataInstanceInSwcEx)theEObject;
				T result = caseRVariableDataInstanceInSwcEx(rVariableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ROPERATION_INSTANCE_IN_SWC_EX: {
				ROperationInstanceInSwcEx rOperationInstanceInSwcEx = (ROperationInstanceInSwcEx)theEObject;
				T result = caseROperationInstanceInSwcEx(rOperationInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX: {
				AssemblyDataInstanceConnectorEx assemblyDataInstanceConnectorEx = (AssemblyDataInstanceConnectorEx)theEObject;
				T result = caseAssemblyDataInstanceConnectorEx(assemblyDataInstanceConnectorEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.RECEIVER_EX: {
				ReceiverEx receiverEx = (ReceiverEx)theEObject;
				T result = caseReceiverEx(receiverEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.EXTERNAL_ECU_SENDER_EX: {
				ExternalEcuSenderEx externalEcuSenderEx = (ExternalEcuSenderEx)theEObject;
				T result = caseExternalEcuSenderEx(externalEcuSenderEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.EXTERNAL_ECU_RECEIVER_EX: {
				ExternalEcuReceiverEx externalEcuReceiverEx = (ExternalEcuReceiverEx)theEObject;
				T result = caseExternalEcuReceiverEx(externalEcuReceiverEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ENTITY_STARTER_EX: {
				EntityStarterEx entityStarterEx = (EntityStarterEx)theEObject;
				T result = caseEntityStarterEx(entityStarterEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX: {
				BswSchedulableEntityEx bswSchedulableEntityEx = (BswSchedulableEntityEx)theEObject;
				T result = caseBswSchedulableEntityEx(bswSchedulableEntityEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.MODE_DECLARATION_GROUP_PROTOTYPE_EX: {
				ModeDeclarationGroupPrototypeEx modeDeclarationGroupPrototypeEx = (ModeDeclarationGroupPrototypeEx)theEObject;
				T result = caseModeDeclarationGroupPrototypeEx(modeDeclarationGroupPrototypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.RTE_EVENT_EX: {
				RteEventEx rteEventEx = (RteEventEx)theEObject;
				T result = caseRteEventEx(rteEventEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COM_GROUP_SIGNAL_EX: {
				ComGroupSignalEx comGroupSignalEx = (ComGroupSignalEx)theEObject;
				T result = caseComGroupSignalEx(comGroupSignalEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValueEx(TimeValueEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentTypeEx(AlignmentTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiverEx(ReceiverEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ecu Sender Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ecu Sender Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEcuSenderEx(ExternalEcuSenderEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ecu Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ecu Receiver Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEcuReceiverEx(ExternalEcuReceiverEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Starter Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Starter Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStarterEx(EntityStarterEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntityEx(BswSchedulableEntityEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Event Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Event Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteEventEx(RteEventEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Group Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Group Signal Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComGroupSignalEx(ComGroupSignalEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyDataInstanceConnectorEx(AssemblyDataInstanceConnectorEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalEx(ComSignalEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Group Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Group Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalGroupEx(ComSignalGroupEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInSwcEx(VariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVariableDataInstanceInSwcEx(RVariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVariableDataInstanceInSwcEx(PVariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperation Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperation Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperationInstanceInSwcEx(ROperationInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalMappingEx(SenderReceiverToSignalMappingEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalGroupMappingEx(SenderReceiverToSignalGroupMappingEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskEx(OsTaskEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Partition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Partition Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucPartitionEx(EcucPartitionEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Prototype Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataPrototypeEx(VariableDataPrototypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Sw Component Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Sw Component Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicSwComponentTypeEx(AtomicSwComponentTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationEx(ValueSpecificationEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonqueuedSenderComSpecEx(NonqueuedSenderComSpecEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Method Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Method Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuMethodEx(CompuMethodEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Scale Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Scale Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuScaleEx(CompuScaleEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDataTypeEx(ApplicationDataTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Data Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDataTypeEx(ImplementationDataTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Area Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Area Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveAreaEx(ExclusiveAreaEx object) {
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

} //ExSwitch
