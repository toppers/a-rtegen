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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskActivation <em>Os Task Activation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskPriority <em>Os Task Priority</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskSchedule <em>Os Task Schedule</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskAccessingApplication <em>Os Task Accessing Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskEvent <em>Os Task Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getMappedRteEvent <em>Mapped Rte Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOwnerApplication <em>Owner Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getMappedRteBswEvent <em>Mapped Rte Bsw Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskImpl extends EcucContainerImpl implements OsTask {
	/**
	 * The default value of the '{@link #getOsTaskActivation() <em>Os Task Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskActivation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskActivation() <em>Os Task Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskActivation()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskActivation = OS_TASK_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskPriority = OS_TASK_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsTaskSchedule() <em>Os Task Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final OsTaskScheduleEnum OS_TASK_SCHEDULE_EDEFAULT = OsTaskScheduleEnum.FULL;

	/**
	 * The cached value of the '{@link #getOsTaskSchedule() <em>Os Task Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskSchedule()
	 * @generated
	 * @ordered
	 */
	protected OsTaskScheduleEnum osTaskSchedule = OS_TASK_SCHEDULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsTaskAccessingApplication() <em>Os Task Accessing Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskAccessingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> osTaskAccessingApplication;

	/**
	 * The cached value of the '{@link #getOsTaskEvent() <em>Os Task Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> osTaskEvent;

	/**
	 * The cached value of the '{@link #getMappedRteEvent() <em>Mapped Rte Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRteEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEventToTaskMapping> mappedRteEvent;

	/**
	 * The cached value of the '{@link #getOwnerApplication() <em>Owner Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> ownerApplication;

	/**
	 * The cached value of the '{@link #getMappedRteBswEvent() <em>Mapped Rte Bsw Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRteBswEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> mappedRteBswEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskActivation() {
		return osTaskActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskActivation(Integer newOsTaskActivation) {
		Integer oldOsTaskActivation = osTaskActivation;
		osTaskActivation = newOsTaskActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_ACTIVATION, oldOsTaskActivation, osTaskActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskPriority() {
		return osTaskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskPriority(Integer newOsTaskPriority) {
		Integer oldOsTaskPriority = osTaskPriority;
		osTaskPriority = newOsTaskPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_PRIORITY, oldOsTaskPriority, osTaskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskScheduleEnum getOsTaskSchedule() {
		return osTaskSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskSchedule(OsTaskScheduleEnum newOsTaskSchedule) {
		OsTaskScheduleEnum oldOsTaskSchedule = osTaskSchedule;
		osTaskSchedule = newOsTaskSchedule == null ? OS_TASK_SCHEDULE_EDEFAULT : newOsTaskSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_SCHEDULE, oldOsTaskSchedule, osTaskSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOsTaskAccessingApplication() {
		if (osTaskAccessingApplication == null) {
			osTaskAccessingApplication = new EObjectResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION);
		}
		return osTaskAccessingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getOsTaskEvent() {
		if (osTaskEvent == null) {
			osTaskEvent = new EObjectResolvingEList<OsEvent>(OsEvent.class, this, EcucPackage.OS_TASK__OS_TASK_EVENT);
		}
		return osTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEventToTaskMapping> getMappedRteEvent() {
		if (mappedRteEvent == null) {
			mappedRteEvent = new EObjectWithInverseResolvingEList<RteEventToTaskMapping>(RteEventToTaskMapping.class, this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK);
		}
		return mappedRteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOwnerApplication() {
		if (ownerApplication == null) {
			ownerApplication = new EObjectWithInverseResolvingEList.ManyInverse<OsApplication>(OsApplication.class, this, EcucPackage.OS_TASK__OWNER_APPLICATION, EcucPackage.OS_APPLICATION__OS_APP_TASK);
		}
		return ownerApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getMappedRteBswEvent() {
		if (mappedRteBswEvent == null) {
			mappedRteBswEvent = new EObjectWithInverseResolvingEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK);
		}
		return mappedRteBswEvent;
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
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappedRteEvent()).basicAdd(otherEnd, msgs);
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnerApplication()).basicAdd(otherEnd, msgs);
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappedRteBswEvent()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return ((InternalEList<?>)getMappedRteEvent()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ((InternalEList<?>)getOwnerApplication()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return ((InternalEList<?>)getMappedRteBswEvent()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				return getOsTaskActivation();
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				return getOsTaskPriority();
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				return getOsTaskSchedule();
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				return getOsTaskAccessingApplication();
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				return getOsTaskEvent();
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return getMappedRteEvent();
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return getOwnerApplication();
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return getMappedRteBswEvent();
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				setOsTaskActivation((Integer)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				setOsTaskPriority((Integer)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				setOsTaskSchedule((OsTaskScheduleEnum)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				getOsTaskAccessingApplication().clear();
				getOsTaskAccessingApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				getOsTaskEvent().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				getMappedRteEvent().clear();
				getMappedRteEvent().addAll((Collection<? extends RteEventToTaskMapping>)newValue);
				return;
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				getOwnerApplication().clear();
				getOwnerApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				getMappedRteBswEvent().clear();
				getMappedRteBswEvent().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				setOsTaskActivation(OS_TASK_ACTIVATION_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				setOsTaskPriority(OS_TASK_PRIORITY_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				setOsTaskSchedule(OS_TASK_SCHEDULE_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				getOsTaskAccessingApplication().clear();
				return;
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				getMappedRteEvent().clear();
				return;
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				getOwnerApplication().clear();
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				getMappedRteBswEvent().clear();
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				return OS_TASK_ACTIVATION_EDEFAULT == null ? osTaskActivation != null : !OS_TASK_ACTIVATION_EDEFAULT.equals(osTaskActivation);
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				return OS_TASK_PRIORITY_EDEFAULT == null ? osTaskPriority != null : !OS_TASK_PRIORITY_EDEFAULT.equals(osTaskPriority);
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				return osTaskSchedule != OS_TASK_SCHEDULE_EDEFAULT;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				return osTaskAccessingApplication != null && !osTaskAccessingApplication.isEmpty();
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				return osTaskEvent != null && !osTaskEvent.isEmpty();
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return mappedRteEvent != null && !mappedRteEvent.isEmpty();
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ownerApplication != null && !ownerApplication.isEmpty();
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return mappedRteBswEvent != null && !mappedRteBswEvent.isEmpty();
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
		result.append(" (osTaskActivation: ");
		result.append(osTaskActivation);
		result.append(", osTaskPriority: ");
		result.append(osTaskPriority);
		result.append(", osTaskSchedule: ");
		result.append(osTaskSchedule);
		result.append(')');
		return result.toString();
	}

} //OsTaskImpl
