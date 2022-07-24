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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Used Os Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl#getRteExpectedTickDuration <em>Rte Expected Tick Duration</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl#getRteExpectedActivationOffset <em>Rte Expected Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl#getRteActivationOsAlarm <em>Rte Activation Os Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteUsedOsActivationImpl extends EcucContainerImpl implements RteUsedOsActivation {
	/**
	 * The default value of the '{@link #getRteExpectedTickDuration() <em>Rte Expected Tick Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExpectedTickDuration()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RTE_EXPECTED_TICK_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteExpectedTickDuration() <em>Rte Expected Tick Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExpectedTickDuration()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rteExpectedTickDuration = RTE_EXPECTED_TICK_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRteExpectedActivationOffset() <em>Rte Expected Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExpectedActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RTE_EXPECTED_ACTIVATION_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteExpectedActivationOffset() <em>Rte Expected Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExpectedActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rteExpectedActivationOffset = RTE_EXPECTED_ACTIVATION_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteActivationOsAlarm() <em>Rte Activation Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteActivationOsAlarm()
	 * @generated
	 * @ordered
	 */
	protected OsAlarm rteActivationOsAlarm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteUsedOsActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_USED_OS_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRteExpectedTickDuration() {
		return rteExpectedTickDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExpectedTickDuration(BigDecimal newRteExpectedTickDuration) {
		BigDecimal oldRteExpectedTickDuration = rteExpectedTickDuration;
		rteExpectedTickDuration = newRteExpectedTickDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION, oldRteExpectedTickDuration, rteExpectedTickDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRteExpectedActivationOffset() {
		return rteExpectedActivationOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExpectedActivationOffset(BigDecimal newRteExpectedActivationOffset) {
		BigDecimal oldRteExpectedActivationOffset = rteExpectedActivationOffset;
		rteExpectedActivationOffset = newRteExpectedActivationOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET, oldRteExpectedActivationOffset, rteExpectedActivationOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm getRteActivationOsAlarm() {
		if (rteActivationOsAlarm != null && ((EObject)rteActivationOsAlarm).eIsProxy()) {
			InternalEObject oldRteActivationOsAlarm = (InternalEObject)rteActivationOsAlarm;
			rteActivationOsAlarm = (OsAlarm)eResolveProxy(oldRteActivationOsAlarm);
			if (rteActivationOsAlarm != oldRteActivationOsAlarm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM, oldRteActivationOsAlarm, rteActivationOsAlarm));
			}
		}
		return rteActivationOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm basicGetRteActivationOsAlarm() {
		return rteActivationOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteActivationOsAlarm(OsAlarm newRteActivationOsAlarm, NotificationChain msgs) {
		OsAlarm oldRteActivationOsAlarm = rteActivationOsAlarm;
		rteActivationOsAlarm = newRteActivationOsAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM, oldRteActivationOsAlarm, newRteActivationOsAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteActivationOsAlarm(OsAlarm newRteActivationOsAlarm) {
		if (newRteActivationOsAlarm != rteActivationOsAlarm) {
			NotificationChain msgs = null;
			if (rteActivationOsAlarm != null)
				msgs = ((InternalEObject)rteActivationOsAlarm).eInverseRemove(this, EcucPackage.OS_ALARM__EXPECTED_CONFIG, OsAlarm.class, msgs);
			if (newRteActivationOsAlarm != null)
				msgs = ((InternalEObject)newRteActivationOsAlarm).eInverseAdd(this, EcucPackage.OS_ALARM__EXPECTED_CONFIG, OsAlarm.class, msgs);
			msgs = basicSetRteActivationOsAlarm(newRteActivationOsAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM, newRteActivationOsAlarm, newRteActivationOsAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				if (rteActivationOsAlarm != null)
					msgs = ((InternalEObject)rteActivationOsAlarm).eInverseRemove(this, EcucPackage.OS_ALARM__EXPECTED_CONFIG, OsAlarm.class, msgs);
				return basicSetRteActivationOsAlarm((OsAlarm)otherEnd, msgs);
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
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				return basicSetRteActivationOsAlarm(null, msgs);
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
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION:
				return getRteExpectedTickDuration();
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET:
				return getRteExpectedActivationOffset();
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				if (resolve) return getRteActivationOsAlarm();
				return basicGetRteActivationOsAlarm();
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
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION:
				setRteExpectedTickDuration((BigDecimal)newValue);
				return;
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET:
				setRteExpectedActivationOffset((BigDecimal)newValue);
				return;
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				setRteActivationOsAlarm((OsAlarm)newValue);
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
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION:
				setRteExpectedTickDuration(RTE_EXPECTED_TICK_DURATION_EDEFAULT);
				return;
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET:
				setRteExpectedActivationOffset(RTE_EXPECTED_ACTIVATION_OFFSET_EDEFAULT);
				return;
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				setRteActivationOsAlarm((OsAlarm)null);
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
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION:
				return RTE_EXPECTED_TICK_DURATION_EDEFAULT == null ? rteExpectedTickDuration != null : !RTE_EXPECTED_TICK_DURATION_EDEFAULT.equals(rteExpectedTickDuration);
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET:
				return RTE_EXPECTED_ACTIVATION_OFFSET_EDEFAULT == null ? rteExpectedActivationOffset != null : !RTE_EXPECTED_ACTIVATION_OFFSET_EDEFAULT.equals(rteExpectedActivationOffset);
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM:
				return rteActivationOsAlarm != null;
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
		result.append(" (rteExpectedTickDuration: ");
		result.append(rteExpectedTickDuration);
		result.append(", rteExpectedActivationOffset: ");
		result.append(rteExpectedActivationOffset);
		result.append(')');
		return result.toString();
	}

} //RteUsedOsActivationImpl
