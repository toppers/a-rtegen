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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Sw Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getInnerPort <em>Inner Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getOuterPort <em>Outer Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getInnerPortIref <em>Inner Port Iref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationSwConnectorImpl extends SwConnectorImpl implements DelegationSwConnector {
	/**
	 * The cached value of the '{@link #getInnerPort() <em>Inner Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPort()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition innerPort;

	/**
	 * The cached value of the '{@link #getOuterPort() <em>Outer Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterPort()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype outerPort;

	/**
	 * The cached value of the '{@link #getInnerPortIref() <em>Inner Port Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPortIref()
	 * @generated
	 * @ordered
	 */
	protected PortInCompositionInstanceRef innerPortIref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationSwConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.DELEGATION_SW_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getOuterPort() {
		if (outerPort != null && ((EObject)outerPort).eIsProxy()) {
			InternalEObject oldOuterPort = (InternalEObject)outerPort;
			outerPort = (PortPrototype)eResolveProxy(oldOuterPort);
			if (outerPort != oldOuterPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT, oldOuterPort, outerPort));
			}
		}
		return outerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetOuterPort() {
		return outerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterPort(PortPrototype newOuterPort) {
		PortPrototype oldOuterPort = outerPort;
		outerPort = newOuterPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT, oldOuterPort, outerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInCompositionInstanceRef getInnerPortIref() {
		return innerPortIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerPortIref(PortInCompositionInstanceRef newInnerPortIref, NotificationChain msgs) {
		PortInCompositionInstanceRef oldInnerPortIref = innerPortIref;
		innerPortIref = newInnerPortIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, oldInnerPortIref, newInnerPortIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPortIref(PortInCompositionInstanceRef newInnerPortIref) {
		if (newInnerPortIref != innerPortIref) {
			NotificationChain msgs = null;
			if (innerPortIref != null)
				msgs = ((InternalEObject)innerPortIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, null, msgs);
			if (newInnerPortIref != null)
				msgs = ((InternalEObject)newInnerPortIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, null, msgs);
			msgs = basicSetInnerPortIref(newInnerPortIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, newInnerPortIref, newInnerPortIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return basicSetInnerPortIref(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getInnerPort() {
		if (innerPort != null && ((EObject)innerPort).eIsProxy()) {
			InternalEObject oldInnerPort = (InternalEObject)innerPort;
			innerPort = (PortInstanceInComposition)eResolveProxy(oldInnerPort);
			if (innerPort != oldInnerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT, oldInnerPort, innerPort));
			}
		}
		return innerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetInnerPort() {
		return innerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPort(PortInstanceInComposition newInnerPort) {
		PortInstanceInComposition oldInnerPort = innerPort;
		innerPort = newInnerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT, oldInnerPort, innerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				if (resolve) return getInnerPort();
				return basicGetInnerPort();
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				if (resolve) return getOuterPort();
				return basicGetOuterPort();
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return getInnerPortIref();
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				setInnerPort((PortInstanceInComposition)newValue);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				setOuterPort((PortPrototype)newValue);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				setInnerPortIref((PortInCompositionInstanceRef)newValue);
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				setInnerPort((PortInstanceInComposition)null);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				setOuterPort((PortPrototype)null);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				setInnerPortIref((PortInCompositionInstanceRef)null);
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				return innerPort != null;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				return outerPort != null;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return innerPortIref != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationSwConnectorImpl
