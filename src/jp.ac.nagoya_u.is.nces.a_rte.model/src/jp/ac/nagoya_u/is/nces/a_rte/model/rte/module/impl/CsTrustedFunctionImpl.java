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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTfCalledRunnable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Cs Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CsTrustedFunctionImpl#getDataVariable <em>Data Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CsTrustedFunctionImpl#getCsTfParamTypeName <em>Cs Tf Param Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CsTrustedFunctionImpl#getCsTfCalledRunnable <em>Cs Tf Called Runnable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsTrustedFunctionImpl extends TrustedFunctionImpl implements CsTrustedFunction {
	/**
	 * The cached value of the '{@link #getDataVariable() <em>Data Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable dataVariable;

	/**
	 * The default value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_PARAM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected String csTfParamTypeName = CS_TF_PARAM_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCsTfCalledRunnable() <em>Cs Tf Called Runnable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfCalledRunnable()
	 * @generated
	 * @ordered
	 */
	protected EList<CsTfCalledRunnable> csTfCalledRunnable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsTrustedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CS_TRUSTED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getDataVariable() {
		if (dataVariable != null && ((EObject)dataVariable).eIsProxy()) {
			InternalEObject oldDataVariable = (InternalEObject)dataVariable;
			dataVariable = (LocalVariable)eResolveProxy(oldDataVariable);
			if (dataVariable != oldDataVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE, oldDataVariable, dataVariable));
			}
		}
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetDataVariable() {
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataVariable(LocalVariable newDataVariable) {
		LocalVariable oldDataVariable = dataVariable;
		dataVariable = newDataVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE, oldDataVariable, dataVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfParamTypeName() {
		return csTfParamTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfParamTypeName(String newCsTfParamTypeName) {
		String oldCsTfParamTypeName = csTfParamTypeName;
		csTfParamTypeName = newCsTfParamTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME, oldCsTfParamTypeName, csTfParamTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CsTfCalledRunnable> getCsTfCalledRunnable() {
		if (csTfCalledRunnable == null) {
			csTfCalledRunnable = new EObjectContainmentEList<CsTfCalledRunnable>(CsTfCalledRunnable.class, this, ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE);
		}
		return csTfCalledRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE:
				return ((InternalEList<?>)getCsTfCalledRunnable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE:
				if (resolve) return getDataVariable();
				return basicGetDataVariable();
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME:
				return getCsTfParamTypeName();
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE:
				return getCsTfCalledRunnable();
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
			case ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE:
				setDataVariable((LocalVariable)newValue);
				return;
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName((String)newValue);
				return;
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE:
				getCsTfCalledRunnable().clear();
				getCsTfCalledRunnable().addAll((Collection<? extends CsTfCalledRunnable>)newValue);
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
			case ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE:
				setDataVariable((LocalVariable)null);
				return;
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName(CS_TF_PARAM_TYPE_NAME_EDEFAULT);
				return;
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE:
				getCsTfCalledRunnable().clear();
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
			case ModulePackage.CS_TRUSTED_FUNCTION__DATA_VARIABLE:
				return dataVariable != null;
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME:
				return CS_TF_PARAM_TYPE_NAME_EDEFAULT == null ? csTfParamTypeName != null : !CS_TF_PARAM_TYPE_NAME_EDEFAULT.equals(csTfParamTypeName);
			case ModulePackage.CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE:
				return csTfCalledRunnable != null && !csTfCalledRunnable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (csTfParamTypeName: ");
		result.append(csTfParamTypeName);
		result.append(')');
		return result.toString();
	}

} //CsTrustedFunctionImpl
