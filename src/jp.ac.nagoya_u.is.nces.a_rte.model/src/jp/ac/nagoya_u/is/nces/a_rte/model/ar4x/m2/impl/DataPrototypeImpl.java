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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl#getSwDataDefProps <em>Sw Data Def Props</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl#getSwAlignment <em>Sw Alignment</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataPrototypeImpl extends IdentifiableImpl implements DataPrototype {
	/**
	 * The cached value of the '{@link #getSwDataDefProps() <em>Sw Data Def Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwDataDefProps()
	 * @generated
	 * @ordered
	 */
	protected SwDataDefProps swDataDefProps;

	/**
	 * The cached setting delegate for the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SW_ADDR_METHOD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.DATA_PROTOTYPE__SW_ADDR_METHOD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSwAlignment() <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SW_ALIGNMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.DATA_PROTOTYPE__SW_ALIGNMENT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AutosarDataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.DATA_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwDataDefProps getSwDataDefProps() {
		return swDataDefProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwDataDefProps(SwDataDefProps newSwDataDefProps, NotificationChain msgs) {
		SwDataDefProps oldSwDataDefProps = swDataDefProps;
		swDataDefProps = newSwDataDefProps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS, oldSwDataDefProps, newSwDataDefProps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwDataDefProps(SwDataDefProps newSwDataDefProps) {
		if (newSwDataDefProps != swDataDefProps) {
			NotificationChain msgs = null;
			if (swDataDefProps != null)
				msgs = ((InternalEObject)swDataDefProps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS, null, msgs);
			if (newSwDataDefProps != null)
				msgs = ((InternalEObject)newSwDataDefProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS, null, msgs);
			msgs = basicSetSwDataDefProps(newSwDataDefProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS, newSwDataDefProps, newSwDataDefProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		return (SwAddrMethod)SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwAlignment() {
		return (String)SW_ALIGNMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosarDataType getType() {
		if (type != null && ((EObject)type).eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (AutosarDataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DATA_PROTOTYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosarDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AutosarDataType newType) {
		AutosarDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DATA_PROTOTYPE__TYPE, oldType, type));
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.DATA_PROTOTYPE___GET_SW_IMPL_POLICY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum getSwImplPolicy() {
		try {
			return (SwImplPolicyEnum)GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS:
				return basicSetSwDataDefProps(null, msgs);
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
			case M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS:
				return getSwDataDefProps();
			case M2Package.DATA_PROTOTYPE__SW_ADDR_METHOD:
				return getSwAddrMethod();
			case M2Package.DATA_PROTOTYPE__SW_ALIGNMENT:
				return getSwAlignment();
			case M2Package.DATA_PROTOTYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)newValue);
				return;
			case M2Package.DATA_PROTOTYPE__TYPE:
				setType((AutosarDataType)newValue);
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
			case M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)null);
				return;
			case M2Package.DATA_PROTOTYPE__TYPE:
				setType((AutosarDataType)null);
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
			case M2Package.DATA_PROTOTYPE__SW_DATA_DEF_PROPS:
				return swDataDefProps != null;
			case M2Package.DATA_PROTOTYPE__SW_ADDR_METHOD:
				return SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case M2Package.DATA_PROTOTYPE__SW_ALIGNMENT:
				return SW_ALIGNMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case M2Package.DATA_PROTOTYPE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case M2Package.DATA_PROTOTYPE___GET_SW_IMPL_POLICY:
				return getSwImplPolicy();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataPrototypeImpl
