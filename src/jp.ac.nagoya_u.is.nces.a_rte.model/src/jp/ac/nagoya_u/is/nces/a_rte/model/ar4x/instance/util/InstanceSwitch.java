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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.*;

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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
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
			case InstancePackage.INSTANCE_REFERRABLE: {
				InstanceReferrable instanceReferrable = (InstanceReferrable)theEObject;
				T result = caseInstanceReferrable(instanceReferrable);
				if (result == null) result = caseIInstanceObject(instanceReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PORT_INSTANCE_IN_COMPOSITION: {
				PortInstanceInComposition portInstanceInComposition = (PortInstanceInComposition)theEObject;
				T result = casePortInstanceInComposition(portInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(portInstanceInComposition);
				if (result == null) result = caseIInstanceObject(portInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC: {
				VariableDataInstanceInSwc variableDataInstanceInSwc = (VariableDataInstanceInSwc)theEObject;
				T result = caseVariableDataInstanceInSwc(variableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(variableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(variableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(variableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION: {
				VariableDataInstanceInComposition variableDataInstanceInComposition = (VariableDataInstanceInComposition)theEObject;
				T result = caseVariableDataInstanceInComposition(variableDataInstanceInComposition);
				if (result == null) result = caseVariableDataInstance(variableDataInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(variableDataInstanceInComposition);
				if (result == null) result = caseIInstanceObject(variableDataInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PVARIABLE_DATA_INSTANCE_IN_SWC: {
				PVariableDataInstanceInSwc pVariableDataInstanceInSwc = (PVariableDataInstanceInSwc)theEObject;
				T result = casePVariableDataInstanceInSwc(pVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstanceInSwc(pVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(pVariableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(pVariableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(pVariableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC: {
				RVariableDataInstanceInSwc rVariableDataInstanceInSwc = (RVariableDataInstanceInSwc)theEObject;
				T result = caseRVariableDataInstanceInSwc(rVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstanceInSwc(rVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(rVariableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(rVariableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(rVariableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR: {
				AssemblyDataInstanceConnector assemblyDataInstanceConnector = (AssemblyDataInstanceConnector)theEObject;
				T result = caseAssemblyDataInstanceConnector(assemblyDataInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR: {
				DelegationDataInstanceConnector delegationDataInstanceConnector = (DelegationDataInstanceConnector)theEObject;
				T result = caseDelegationDataInstanceConnector(delegationDataInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.OPERATION_INSTANCE_IN_SWC: {
				OperationInstanceInSwc operationInstanceInSwc = (OperationInstanceInSwc)theEObject;
				T result = caseOperationInstanceInSwc(operationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(operationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(operationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ROPERATION_INSTANCE_IN_SWC: {
				ROperationInstanceInSwc rOperationInstanceInSwc = (ROperationInstanceInSwc)theEObject;
				T result = caseROperationInstanceInSwc(rOperationInstanceInSwc);
				if (result == null) result = caseOperationInstanceInSwc(rOperationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(rOperationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(rOperationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.POPERATION_INSTANCE_IN_SWC: {
				POperationInstanceInSwc pOperationInstanceInSwc = (POperationInstanceInSwc)theEObject;
				T result = casePOperationInstanceInSwc(pOperationInstanceInSwc);
				if (result == null) result = caseOperationInstanceInSwc(pOperationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(pOperationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(pOperationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.OPERATION_INSTANCE_IN_COMPOSITION: {
				OperationInstanceInComposition operationInstanceInComposition = (OperationInstanceInComposition)theEObject;
				T result = caseOperationInstanceInComposition(operationInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(operationInstanceInComposition);
				if (result == null) result = caseIInstanceObject(operationInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR: {
				AssemblyOperationInstanceConnector assemblyOperationInstanceConnector = (AssemblyOperationInstanceConnector)theEObject;
				T result = caseAssemblyOperationInstanceConnector(assemblyOperationInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.IINSTANCE_OBJECT: {
				IInstanceObject iInstanceObject = (IInstanceObject)theEObject;
				T result = caseIInstanceObject(iInstanceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM: {
				SwComponentInstanceInSystem swComponentInstanceInSystem = (SwComponentInstanceInSystem)theEObject;
				T result = caseSwComponentInstanceInSystem(swComponentInstanceInSystem);
				if (result == null) result = caseInstanceReferrable(swComponentInstanceInSystem);
				if (result == null) result = caseIInstanceObject(swComponentInstanceInSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.INSTANCE_ROOT: {
				InstanceRoot instanceRoot = (InstanceRoot)theEObject;
				T result = caseInstanceRoot(instanceRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE: {
				VariableDataInstance variableDataInstance = (VariableDataInstance)theEObject;
				T result = caseVariableDataInstance(variableDataInstance);
				if (result == null) result = caseInstanceReferrable(variableDataInstance);
				if (result == null) result = caseIInstanceObject(variableDataInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseInstanceReferrable(InstanceReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstanceInComposition(PortInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInSwc(VariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInComposition(VariableDataInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVariableDataInstanceInSwc(PVariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVariableDataInstanceInSwc(RVariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyDataInstanceConnector(AssemblyDataInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Data Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationDataInstanceConnector(DelegationDataInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInstanceInSwc(OperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperationInstanceInSwc(ROperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POperation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOperationInstanceInSwc(POperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInstanceInComposition(OperationInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Operation Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Operation Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyOperationInstanceConnector(AssemblyOperationInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IInstance Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IInstance Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIInstanceObject(IInstanceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Component Instance In System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Component Instance In System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwComponentInstanceInSystem(SwComponentInstanceInSystem object) {
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
	public T caseInstanceRoot(InstanceRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstance(VariableDataInstance object) {
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

} //InstanceSwitch
