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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Api Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl#getPortArgValue <em>Port Arg Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl#getEnableTakeAddress <em>Enable Take Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortApiOptionImpl extends M2ObjectImpl implements PortApiOption {
	/**
	 * The cached value of the '{@link #getPortArgValue() <em>Port Arg Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortArgValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDefinedArgumentValue> portArgValue;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype port;

	/**
	 * The default value of the '{@link #getEnableTakeAddress() <em>Enable Take Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTakeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_TAKE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableTakeAddress() <em>Enable Take Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTakeAddress()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableTakeAddress = ENABLE_TAKE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortApiOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.PORT_API_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortDefinedArgumentValue> getPortArgValue() {
		if (portArgValue == null) {
			portArgValue = new EObjectContainmentWithInverseEList<PortDefinedArgumentValue>(PortDefinedArgumentValue.class, this, M2Package.PORT_API_OPTION__PORT_ARG_VALUE, M2Package.PORT_DEFINED_ARGUMENT_VALUE__PARENT);
		}
		return portArgValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getPort() {
		if (port != null && ((EObject)port).eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (PortPrototype)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.PORT_API_OPTION__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(PortPrototype newPort, NotificationChain msgs) {
		PortPrototype oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.PORT_API_OPTION__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(PortPrototype newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, M2Package.PORT_PROTOTYPE__PORT_API_OPTION, PortPrototype.class, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, M2Package.PORT_PROTOTYPE__PORT_API_OPTION, PortPrototype.class, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.PORT_API_OPTION__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnableTakeAddress() {
		return enableTakeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableTakeAddress(Boolean newEnableTakeAddress) {
		Boolean oldEnableTakeAddress = enableTakeAddress;
		enableTakeAddress = newEnableTakeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.PORT_API_OPTION__ENABLE_TAKE_ADDRESS, oldEnableTakeAddress, enableTakeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortArgValue()).basicAdd(otherEnd, msgs);
			case M2Package.PORT_API_OPTION__PORT:
				if (port != null)
					msgs = ((InternalEObject)port).eInverseRemove(this, M2Package.PORT_PROTOTYPE__PORT_API_OPTION, PortPrototype.class, msgs);
				return basicSetPort((PortPrototype)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				return ((InternalEList<?>)getPortArgValue()).basicRemove(otherEnd, msgs);
			case M2Package.PORT_API_OPTION__PORT:
				return basicSetPort(null, msgs);
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
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				return getPortArgValue();
			case M2Package.PORT_API_OPTION__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case M2Package.PORT_API_OPTION__ENABLE_TAKE_ADDRESS:
				return getEnableTakeAddress();
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
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				getPortArgValue().clear();
				getPortArgValue().addAll((Collection<? extends PortDefinedArgumentValue>)newValue);
				return;
			case M2Package.PORT_API_OPTION__PORT:
				setPort((PortPrototype)newValue);
				return;
			case M2Package.PORT_API_OPTION__ENABLE_TAKE_ADDRESS:
				setEnableTakeAddress((Boolean)newValue);
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
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				getPortArgValue().clear();
				return;
			case M2Package.PORT_API_OPTION__PORT:
				setPort((PortPrototype)null);
				return;
			case M2Package.PORT_API_OPTION__ENABLE_TAKE_ADDRESS:
				setEnableTakeAddress(ENABLE_TAKE_ADDRESS_EDEFAULT);
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
			case M2Package.PORT_API_OPTION__PORT_ARG_VALUE:
				return portArgValue != null && !portArgValue.isEmpty();
			case M2Package.PORT_API_OPTION__PORT:
				return port != null;
			case M2Package.PORT_API_OPTION__ENABLE_TAKE_ADDRESS:
				return ENABLE_TAKE_ADDRESS_EDEFAULT == null ? enableTakeAddress != null : !ENABLE_TAKE_ADDRESS_EDEFAULT.equals(enableTakeAddress);
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
		result.append(" (enableTakeAddress: ");
		result.append(enableTakeAddress);
		result.append(')');
		return result.toString();
	}

} //PortApiOptionImpl
