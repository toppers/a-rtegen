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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Exclusive Area Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveArea <em>Rte Bsw Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveAreaOsResource <em>Rte Bsw Exclusive Area Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveAreaOsSpinlock <em>Rte Bsw Exclusive Area Os Spinlock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswExclusiveAreaImplImpl extends EcucContainerImpl implements RteBswExclusiveAreaImpl {
	/**
	 * The cached value of the '{@link #getRteBswExclusiveArea() <em>Rte Bsw Exclusive Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected ExclusiveArea rteBswExclusiveArea;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaOsResource() <em>Rte Bsw Exclusive Area Os Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaOsResource()
	 * @generated
	 * @ordered
	 */
	protected OsResource rteBswExclusiveAreaOsResource;

	/**
	 * The default value of the '{@link #getRteExclusiveAreaImplMechanism() <em>Rte Exclusive Area Impl Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final RteExclusiveAreaImplMechanismEnum RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT = RteExclusiveAreaImplMechanismEnum.ALL_INTERRUPT_BLOCKING;

	/**
	 * The cached value of the '{@link #getRteExclusiveAreaImplMechanism() <em>Rte Exclusive Area Impl Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplMechanism()
	 * @generated
	 * @ordered
	 */
	protected RteExclusiveAreaImplMechanismEnum rteExclusiveAreaImplMechanism = RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaOsSpinlock() <em>Rte Bsw Exclusive Area Os Spinlock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected OsSpinlock rteBswExclusiveAreaOsSpinlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswExclusiveAreaImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea getRteBswExclusiveArea() {
		if (rteBswExclusiveArea != null && ((EObject)rteBswExclusiveArea).eIsProxy()) {
			InternalEObject oldRteBswExclusiveArea = (InternalEObject)rteBswExclusiveArea;
			rteBswExclusiveArea = (ExclusiveArea)eResolveProxy(oldRteBswExclusiveArea);
			if (rteBswExclusiveArea != oldRteBswExclusiveArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, oldRteBswExclusiveArea, rteBswExclusiveArea));
			}
		}
		return rteBswExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea basicGetRteBswExclusiveArea() {
		return rteBswExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswExclusiveArea(ExclusiveArea newRteBswExclusiveArea, NotificationChain msgs) {
		ExclusiveArea oldRteBswExclusiveArea = rteBswExclusiveArea;
		rteBswExclusiveArea = newRteBswExclusiveArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, oldRteBswExclusiveArea, newRteBswExclusiveArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveArea(ExclusiveArea newRteBswExclusiveArea) {
		if (newRteBswExclusiveArea != rteBswExclusiveArea) {
			NotificationChain msgs = null;
			if (rteBswExclusiveArea != null)
				msgs = ((InternalEObject)rteBswExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
			if (newRteBswExclusiveArea != null)
				msgs = ((InternalEObject)newRteBswExclusiveArea).eInverseAdd(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
			msgs = basicSetRteBswExclusiveArea(newRteBswExclusiveArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, newRteBswExclusiveArea, newRteBswExclusiveArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplMechanismEnum getRteExclusiveAreaImplMechanism() {
		return rteExclusiveAreaImplMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExclusiveAreaImplMechanism(RteExclusiveAreaImplMechanismEnum newRteExclusiveAreaImplMechanism) {
		RteExclusiveAreaImplMechanismEnum oldRteExclusiveAreaImplMechanism = rteExclusiveAreaImplMechanism;
		rteExclusiveAreaImplMechanism = newRteExclusiveAreaImplMechanism == null ? RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT : newRteExclusiveAreaImplMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM, oldRteExclusiveAreaImplMechanism, rteExclusiveAreaImplMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock getRteBswExclusiveAreaOsSpinlock() {
		if (rteBswExclusiveAreaOsSpinlock != null && ((EObject)rteBswExclusiveAreaOsSpinlock).eIsProxy()) {
			InternalEObject oldRteBswExclusiveAreaOsSpinlock = (InternalEObject)rteBswExclusiveAreaOsSpinlock;
			rteBswExclusiveAreaOsSpinlock = (OsSpinlock)eResolveProxy(oldRteBswExclusiveAreaOsSpinlock);
			if (rteBswExclusiveAreaOsSpinlock != oldRteBswExclusiveAreaOsSpinlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteBswExclusiveAreaOsSpinlock, rteBswExclusiveAreaOsSpinlock));
			}
		}
		return rteBswExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock basicGetRteBswExclusiveAreaOsSpinlock() {
		return rteBswExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveAreaOsSpinlock(OsSpinlock newRteBswExclusiveAreaOsSpinlock) {
		OsSpinlock oldRteBswExclusiveAreaOsSpinlock = rteBswExclusiveAreaOsSpinlock;
		rteBswExclusiveAreaOsSpinlock = newRteBswExclusiveAreaOsSpinlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteBswExclusiveAreaOsSpinlock, rteBswExclusiveAreaOsSpinlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource getRteBswExclusiveAreaOsResource() {
		if (rteBswExclusiveAreaOsResource != null && ((EObject)rteBswExclusiveAreaOsResource).eIsProxy()) {
			InternalEObject oldRteBswExclusiveAreaOsResource = (InternalEObject)rteBswExclusiveAreaOsResource;
			rteBswExclusiveAreaOsResource = (OsResource)eResolveProxy(oldRteBswExclusiveAreaOsResource);
			if (rteBswExclusiveAreaOsResource != oldRteBswExclusiveAreaOsResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE, oldRteBswExclusiveAreaOsResource, rteBswExclusiveAreaOsResource));
			}
		}
		return rteBswExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource basicGetRteBswExclusiveAreaOsResource() {
		return rteBswExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveAreaOsResource(OsResource newRteBswExclusiveAreaOsResource) {
		OsResource oldRteBswExclusiveAreaOsResource = rteBswExclusiveAreaOsResource;
		rteBswExclusiveAreaOsResource = newRteBswExclusiveAreaOsResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE, oldRteBswExclusiveAreaOsResource, rteBswExclusiveAreaOsResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				if (rteBswExclusiveArea != null)
					msgs = ((InternalEObject)rteBswExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
				return basicSetRteBswExclusiveArea((ExclusiveArea)otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				return basicSetRteBswExclusiveArea(null, msgs);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				if (resolve) return getRteBswExclusiveArea();
				return basicGetRteBswExclusiveArea();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				if (resolve) return getRteBswExclusiveAreaOsResource();
				return basicGetRteBswExclusiveAreaOsResource();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return getRteExclusiveAreaImplMechanism();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				if (resolve) return getRteBswExclusiveAreaOsSpinlock();
				return basicGetRteBswExclusiveAreaOsSpinlock();
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				setRteBswExclusiveArea((ExclusiveArea)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteBswExclusiveAreaOsResource((OsResource)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism((RteExclusiveAreaImplMechanismEnum)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteBswExclusiveAreaOsSpinlock((OsSpinlock)newValue);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				setRteBswExclusiveArea((ExclusiveArea)null);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteBswExclusiveAreaOsResource((OsResource)null);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism(RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteBswExclusiveAreaOsSpinlock((OsSpinlock)null);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				return rteBswExclusiveArea != null;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				return rteBswExclusiveAreaOsResource != null;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return rteExclusiveAreaImplMechanism != RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				return rteBswExclusiveAreaOsSpinlock != null;
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
		result.append(" (rteExclusiveAreaImplMechanism: ");
		result.append(rteExclusiveAreaImplMechanism);
		result.append(')');
		return result.toString();
	}

} //RteBswExclusiveAreaImplImpl
