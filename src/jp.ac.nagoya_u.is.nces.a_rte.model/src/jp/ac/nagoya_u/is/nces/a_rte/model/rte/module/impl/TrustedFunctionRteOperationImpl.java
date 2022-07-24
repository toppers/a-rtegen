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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Rte Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getActivationFlagOnRxSuccess <em>Activation Flag On Rx Success</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionRteOperationImpl extends SendOperationImpl implements TrustedFunctionRteOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getTempReturnVariable() <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable tempReturnVariable;

	/**
	 * The cached value of the '{@link #getTrustedFunctionParamVariable() <em>Trusted Function Param Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionParamVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable trustedFunctionParamVariable;

	/**
	 * The cached value of the '{@link #getActivationFlagOnRxSuccess() <em>Activation Flag On Rx Success</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFlagOnRxSuccess()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> activationFlagOnRxSuccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionRteOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_RTE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && ((EObject)type).eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTempReturnVariable() {
		if (tempReturnVariable != null && ((EObject)tempReturnVariable).eIsProxy()) {
			InternalEObject oldTempReturnVariable = (InternalEObject)tempReturnVariable;
			tempReturnVariable = (Variable)eResolveProxy(oldTempReturnVariable);
			if (tempReturnVariable != oldTempReturnVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
			}
		}
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTempReturnVariable() {
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempReturnVariable(Variable newTempReturnVariable) {
		Variable oldTempReturnVariable = tempReturnVariable;
		tempReturnVariable = newTempReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getActivationFlagOnRxSuccess() {
		if (activationFlagOnRxSuccess == null) {
			activationFlagOnRxSuccess = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS);
		}
		return activationFlagOnRxSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getTrustedFunctionParamVariable() {
		if (trustedFunctionParamVariable != null && ((EObject)trustedFunctionParamVariable).eIsProxy()) {
			InternalEObject oldTrustedFunctionParamVariable = (InternalEObject)trustedFunctionParamVariable;
			trustedFunctionParamVariable = (LocalVariable)eResolveProxy(oldTrustedFunctionParamVariable);
			if (trustedFunctionParamVariable != oldTrustedFunctionParamVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
			}
		}
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetTrustedFunctionParamVariable() {
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedFunctionParamVariable(LocalVariable newTrustedFunctionParamVariable) {
		LocalVariable oldTrustedFunctionParamVariable = trustedFunctionParamVariable;
		trustedFunctionParamVariable = newTrustedFunctionParamVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				if (resolve) return getTempReturnVariable();
				return basicGetTempReturnVariable();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				if (resolve) return getTrustedFunctionParamVariable();
				return basicGetTrustedFunctionParamVariable();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				return getActivationFlagOnRxSuccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				getActivationFlagOnRxSuccess().clear();
				getActivationFlagOnRxSuccess().addAll((Collection<? extends LocalVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				getActivationFlagOnRxSuccess().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				return type != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				return tempReturnVariable != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				return trustedFunctionParamVariable != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				return activationFlagOnRxSuccess != null && !activationFlagOnRxSuccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionRteOperationImpl
