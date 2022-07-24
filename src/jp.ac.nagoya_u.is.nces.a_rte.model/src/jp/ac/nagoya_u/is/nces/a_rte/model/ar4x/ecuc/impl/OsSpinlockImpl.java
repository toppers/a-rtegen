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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Spinlock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl#getOsSpinlockAccessingApplication <em>Os Spinlock Accessing Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl#getOsSpinlockLockMethod <em>Os Spinlock Lock Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsSpinlockImpl extends EcucContainerImpl implements OsSpinlock {
	/**
	 * The cached value of the '{@link #getOsSpinlockAccessingApplication() <em>Os Spinlock Accessing Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockAccessingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> osSpinlockAccessingApplication;
	/**
	 * The default value of the '{@link #getOsSpinlockLockMethod() <em>Os Spinlock Lock Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockLockMethod()
	 * @generated
	 * @ordered
	 */
	protected static final OsSpinlockLockMethodEnum OS_SPINLOCK_LOCK_METHOD_EDEFAULT = OsSpinlockLockMethodEnum.LOCK_NOTHING;
	/**
	 * The cached value of the '{@link #getOsSpinlockLockMethod() <em>Os Spinlock Lock Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockLockMethod()
	 * @generated
	 * @ordered
	 */
	protected OsSpinlockLockMethodEnum osSpinlockLockMethod = OS_SPINLOCK_LOCK_METHOD_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsSpinlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_SPINLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOsSpinlockAccessingApplication() {
		if (osSpinlockAccessingApplication == null) {
			osSpinlockAccessingApplication = new EObjectResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION);
		}
		return osSpinlockAccessingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlockLockMethodEnum getOsSpinlockLockMethod() {
		return osSpinlockLockMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsSpinlockLockMethod(OsSpinlockLockMethodEnum newOsSpinlockLockMethod) {
		OsSpinlockLockMethodEnum oldOsSpinlockLockMethod = osSpinlockLockMethod;
		osSpinlockLockMethod = newOsSpinlockLockMethod == null ? OS_SPINLOCK_LOCK_METHOD_EDEFAULT : newOsSpinlockLockMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD, oldOsSpinlockLockMethod, osSpinlockLockMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				return getOsSpinlockAccessingApplication();
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				return getOsSpinlockLockMethod();
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				getOsSpinlockAccessingApplication().clear();
				getOsSpinlockAccessingApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				setOsSpinlockLockMethod((OsSpinlockLockMethodEnum)newValue);
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				getOsSpinlockAccessingApplication().clear();
				return;
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				setOsSpinlockLockMethod(OS_SPINLOCK_LOCK_METHOD_EDEFAULT);
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				return osSpinlockAccessingApplication != null && !osSpinlockAccessingApplication.isEmpty();
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				return osSpinlockLockMethod != OS_SPINLOCK_LOCK_METHOD_EDEFAULT;
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
		result.append(" (osSpinlockLockMethod: ");
		result.append(osSpinlockLockMethod);
		result.append(')');
		return result.toString();
	}

} //OsSpinlockImpl
