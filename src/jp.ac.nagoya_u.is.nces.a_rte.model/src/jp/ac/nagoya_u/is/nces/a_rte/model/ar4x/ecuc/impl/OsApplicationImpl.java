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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl#getOsApplicationCoreAssignment <em>Os Application Core Assignment</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl#getOsTrusted <em>Os Trusted</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl#getOsAppEcucPartition <em>Os App Ecuc Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl#getOsApplicationTrustedFunction <em>Os Application Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl#getOsAppTask <em>Os App Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsApplicationImpl extends EcucContainerImpl implements OsApplication {
	/**
	 * The default value of the '{@link #getOsApplicationCoreAssignment() <em>Os Application Core Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsApplicationCoreAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_APPLICATION_CORE_ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsApplicationCoreAssignment() <em>Os Application Core Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsApplicationCoreAssignment()
	 * @generated
	 * @ordered
	 */
	protected Integer osApplicationCoreAssignment = OS_APPLICATION_CORE_ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsTrusted() <em>Os Trusted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTrusted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OS_TRUSTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTrusted() <em>Os Trusted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTrusted()
	 * @generated
	 * @ordered
	 */
	protected Boolean osTrusted = OS_TRUSTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsAppEcucPartition() <em>Os App Ecuc Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsAppEcucPartition()
	 * @generated
	 * @ordered
	 */
	protected EcucPartition osAppEcucPartition;

	/**
	 * The cached value of the '{@link #getOsApplicationTrustedFunction() <em>Os Application Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsApplicationTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplicationTrustedFunction> osApplicationTrustedFunction;

	/**
	 * The cached value of the '{@link #getOsAppTask() <em>Os App Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsAppTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTask> osAppTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsApplicationCoreAssignment() {
		return osApplicationCoreAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsApplicationCoreAssignment(Integer newOsApplicationCoreAssignment) {
		Integer oldOsApplicationCoreAssignment = osApplicationCoreAssignment;
		osApplicationCoreAssignment = newOsApplicationCoreAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT, oldOsApplicationCoreAssignment, osApplicationCoreAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOsTrusted() {
		return osTrusted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTrusted(Boolean newOsTrusted) {
		Boolean oldOsTrusted = osTrusted;
		osTrusted = newOsTrusted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_APPLICATION__OS_TRUSTED, oldOsTrusted, osTrusted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition getOsAppEcucPartition() {
		if (osAppEcucPartition != null && ((EObject)osAppEcucPartition).eIsProxy()) {
			InternalEObject oldOsAppEcucPartition = (InternalEObject)osAppEcucPartition;
			osAppEcucPartition = (EcucPartition)eResolveProxy(oldOsAppEcucPartition);
			if (osAppEcucPartition != oldOsAppEcucPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION, oldOsAppEcucPartition, osAppEcucPartition));
			}
		}
		return osAppEcucPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition basicGetOsAppEcucPartition() {
		return osAppEcucPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsAppEcucPartition(EcucPartition newOsAppEcucPartition, NotificationChain msgs) {
		EcucPartition oldOsAppEcucPartition = osAppEcucPartition;
		osAppEcucPartition = newOsAppEcucPartition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION, oldOsAppEcucPartition, newOsAppEcucPartition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsAppEcucPartition(EcucPartition newOsAppEcucPartition) {
		if (newOsAppEcucPartition != osAppEcucPartition) {
			NotificationChain msgs = null;
			if (osAppEcucPartition != null)
				msgs = ((InternalEObject)osAppEcucPartition).eInverseRemove(this, EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION, EcucPartition.class, msgs);
			if (newOsAppEcucPartition != null)
				msgs = ((InternalEObject)newOsAppEcucPartition).eInverseAdd(this, EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION, EcucPartition.class, msgs);
			msgs = basicSetOsAppEcucPartition(newOsAppEcucPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION, newOsAppEcucPartition, newOsAppEcucPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplicationTrustedFunction> getOsApplicationTrustedFunction() {
		if (osApplicationTrustedFunction == null) {
			osApplicationTrustedFunction = new EObjectContainmentWithInverseEList<OsApplicationTrustedFunction>(OsApplicationTrustedFunction.class, this, EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION, EcucPackage.OS_APPLICATION_TRUSTED_FUNCTION__PARENT);
		}
		return osApplicationTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTask> getOsAppTask() {
		if (osAppTask == null) {
			osAppTask = new EObjectWithInverseResolvingEList.ManyInverse<OsTask>(OsTask.class, this, EcucPackage.OS_APPLICATION__OS_APP_TASK, EcucPackage.OS_TASK__OWNER_APPLICATION);
		}
		return osAppTask;
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
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				if (osAppEcucPartition != null)
					msgs = ((InternalEObject)osAppEcucPartition).eInverseRemove(this, EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION, EcucPartition.class, msgs);
				return basicSetOsAppEcucPartition((EcucPartition)otherEnd, msgs);
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOsApplicationTrustedFunction()).basicAdd(otherEnd, msgs);
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOsAppTask()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				return basicSetOsAppEcucPartition(null, msgs);
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getOsApplicationTrustedFunction()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				return ((InternalEList<?>)getOsAppTask()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT:
				return getOsApplicationCoreAssignment();
			case EcucPackage.OS_APPLICATION__OS_TRUSTED:
				return getOsTrusted();
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				if (resolve) return getOsAppEcucPartition();
				return basicGetOsAppEcucPartition();
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				return getOsApplicationTrustedFunction();
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				return getOsAppTask();
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
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT:
				setOsApplicationCoreAssignment((Integer)newValue);
				return;
			case EcucPackage.OS_APPLICATION__OS_TRUSTED:
				setOsTrusted((Boolean)newValue);
				return;
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				setOsAppEcucPartition((EcucPartition)newValue);
				return;
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				getOsApplicationTrustedFunction().clear();
				getOsApplicationTrustedFunction().addAll((Collection<? extends OsApplicationTrustedFunction>)newValue);
				return;
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				getOsAppTask().clear();
				getOsAppTask().addAll((Collection<? extends OsTask>)newValue);
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
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT:
				setOsApplicationCoreAssignment(OS_APPLICATION_CORE_ASSIGNMENT_EDEFAULT);
				return;
			case EcucPackage.OS_APPLICATION__OS_TRUSTED:
				setOsTrusted(OS_TRUSTED_EDEFAULT);
				return;
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				setOsAppEcucPartition((EcucPartition)null);
				return;
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				getOsApplicationTrustedFunction().clear();
				return;
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				getOsAppTask().clear();
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
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT:
				return OS_APPLICATION_CORE_ASSIGNMENT_EDEFAULT == null ? osApplicationCoreAssignment != null : !OS_APPLICATION_CORE_ASSIGNMENT_EDEFAULT.equals(osApplicationCoreAssignment);
			case EcucPackage.OS_APPLICATION__OS_TRUSTED:
				return OS_TRUSTED_EDEFAULT == null ? osTrusted != null : !OS_TRUSTED_EDEFAULT.equals(osTrusted);
			case EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION:
				return osAppEcucPartition != null;
			case EcucPackage.OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION:
				return osApplicationTrustedFunction != null && !osApplicationTrustedFunction.isEmpty();
			case EcucPackage.OS_APPLICATION__OS_APP_TASK:
				return osAppTask != null && !osAppTask.isEmpty();
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
		result.append(" (osApplicationCoreAssignment: ");
		result.append(osApplicationCoreAssignment);
		result.append(", osTrusted: ");
		result.append(osTrusted);
		result.append(')');
		return result.toString();
	}

} //OsApplicationImpl
