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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteEvent <em>Rte Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteActivationOffset <em>Rte Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteMappedToTask <em>Rte Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRtePositionInTask <em>Rte Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteUsedOsAlarm <em>Rte Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteUsedOsEvent <em>Rte Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteEventToTaskMappingImpl extends EcucContainerImpl implements RteEventToTaskMapping {
	/**
	 * The cached value of the '{@link #getRteEvent() <em>Rte Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteEvent()
	 * @generated
	 * @ordered
	 */
	protected RteEvent rteEvent;
	/**
	 * The default value of the '{@link #getRteActivationOffset() <em>Rte Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RTE_ACTIVATION_OFFSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRteActivationOffset() <em>Rte Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rteActivationOffset = RTE_ACTIVATION_OFFSET_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRteMappedToTask() <em>Rte Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteMappedToTask()
	 * @generated
	 * @ordered
	 */
	protected OsTask rteMappedToTask;
	/**
	 * The default value of the '{@link #getRtePositionInTask() <em>Rte Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePositionInTask()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RTE_POSITION_IN_TASK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRtePositionInTask() <em>Rte Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePositionInTask()
	 * @generated
	 * @ordered
	 */
	protected Integer rtePositionInTask = RTE_POSITION_IN_TASK_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRteUsedOsAlarm() <em>Rte Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteUsedOsAlarm()
	 * @generated
	 * @ordered
	 */
	protected OsAlarm rteUsedOsAlarm;
	/**
	 * The cached value of the '{@link #getRteUsedOsEvent() <em>Rte Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteUsedOsEvent()
	 * @generated
	 * @ordered
	 */
	protected OsEvent rteUsedOsEvent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteEventToTaskMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEvent getRteEvent() {
		if (rteEvent != null && ((EObject)rteEvent).eIsProxy()) {
			InternalEObject oldRteEvent = (InternalEObject)rteEvent;
			rteEvent = (RteEvent)eResolveProxy(oldRteEvent);
			if (rteEvent != oldRteEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, oldRteEvent, rteEvent));
			}
		}
		return rteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEvent basicGetRteEvent() {
		return rteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteEvent(RteEvent newRteEvent, NotificationChain msgs) {
		RteEvent oldRteEvent = rteEvent;
		rteEvent = newRteEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, oldRteEvent, newRteEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteEvent(RteEvent newRteEvent) {
		if (newRteEvent != rteEvent) {
			NotificationChain msgs = null;
			if (rteEvent != null)
				msgs = ((InternalEObject)rteEvent).eInverseRemove(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
			if (newRteEvent != null)
				msgs = ((InternalEObject)newRteEvent).eInverseAdd(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
			msgs = basicSetRteEvent(newRteEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, newRteEvent, newRteEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRteActivationOffset() {
		return rteActivationOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteActivationOffset(BigDecimal newRteActivationOffset) {
		BigDecimal oldRteActivationOffset = rteActivationOffset;
		rteActivationOffset = newRteActivationOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET, oldRteActivationOffset, rteActivationOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask getRteMappedToTask() {
		if (rteMappedToTask != null && ((EObject)rteMappedToTask).eIsProxy()) {
			InternalEObject oldRteMappedToTask = (InternalEObject)rteMappedToTask;
			rteMappedToTask = (OsTask)eResolveProxy(oldRteMappedToTask);
			if (rteMappedToTask != oldRteMappedToTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, oldRteMappedToTask, rteMappedToTask));
			}
		}
		return rteMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask basicGetRteMappedToTask() {
		return rteMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteMappedToTask(OsTask newRteMappedToTask, NotificationChain msgs) {
		OsTask oldRteMappedToTask = rteMappedToTask;
		rteMappedToTask = newRteMappedToTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, oldRteMappedToTask, newRteMappedToTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteMappedToTask(OsTask newRteMappedToTask) {
		if (newRteMappedToTask != rteMappedToTask) {
			NotificationChain msgs = null;
			if (rteMappedToTask != null)
				msgs = ((InternalEObject)rteMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
			if (newRteMappedToTask != null)
				msgs = ((InternalEObject)newRteMappedToTask).eInverseAdd(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
			msgs = basicSetRteMappedToTask(newRteMappedToTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, newRteMappedToTask, newRteMappedToTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRtePositionInTask() {
		return rtePositionInTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtePositionInTask(Integer newRtePositionInTask) {
		Integer oldRtePositionInTask = rtePositionInTask;
		rtePositionInTask = newRtePositionInTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK, oldRtePositionInTask, rtePositionInTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm getRteUsedOsAlarm() {
		if (rteUsedOsAlarm != null && ((EObject)rteUsedOsAlarm).eIsProxy()) {
			InternalEObject oldRteUsedOsAlarm = (InternalEObject)rteUsedOsAlarm;
			rteUsedOsAlarm = (OsAlarm)eResolveProxy(oldRteUsedOsAlarm);
			if (rteUsedOsAlarm != oldRteUsedOsAlarm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM, oldRteUsedOsAlarm, rteUsedOsAlarm));
			}
		}
		return rteUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm basicGetRteUsedOsAlarm() {
		return rteUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteUsedOsAlarm(OsAlarm newRteUsedOsAlarm) {
		OsAlarm oldRteUsedOsAlarm = rteUsedOsAlarm;
		rteUsedOsAlarm = newRteUsedOsAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM, oldRteUsedOsAlarm, rteUsedOsAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent getRteUsedOsEvent() {
		if (rteUsedOsEvent != null && ((EObject)rteUsedOsEvent).eIsProxy()) {
			InternalEObject oldRteUsedOsEvent = (InternalEObject)rteUsedOsEvent;
			rteUsedOsEvent = (OsEvent)eResolveProxy(oldRteUsedOsEvent);
			if (rteUsedOsEvent != oldRteUsedOsEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, oldRteUsedOsEvent, rteUsedOsEvent));
			}
		}
		return rteUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent basicGetRteUsedOsEvent() {
		return rteUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteUsedOsEvent(OsEvent newRteUsedOsEvent) {
		OsEvent oldRteUsedOsEvent = rteUsedOsEvent;
		rteUsedOsEvent = newRteUsedOsEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, oldRteUsedOsEvent, rteUsedOsEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				if (rteEvent != null)
					msgs = ((InternalEObject)rteEvent).eInverseRemove(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
				return basicSetRteEvent((RteEvent)otherEnd, msgs);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				if (rteMappedToTask != null)
					msgs = ((InternalEObject)rteMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
				return basicSetRteMappedToTask((OsTask)otherEnd, msgs);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				return basicSetRteEvent(null, msgs);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				return basicSetRteMappedToTask(null, msgs);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				if (resolve) return getRteEvent();
				return basicGetRteEvent();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				return getRteActivationOffset();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				if (resolve) return getRteMappedToTask();
				return basicGetRteMappedToTask();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				return getRtePositionInTask();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				if (resolve) return getRteUsedOsAlarm();
				return basicGetRteUsedOsAlarm();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				if (resolve) return getRteUsedOsEvent();
				return basicGetRteUsedOsEvent();
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				setRteEvent((RteEvent)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				setRteActivationOffset((BigDecimal)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				setRteMappedToTask((OsTask)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				setRtePositionInTask((Integer)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				setRteUsedOsAlarm((OsAlarm)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				setRteUsedOsEvent((OsEvent)newValue);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				setRteEvent((RteEvent)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				setRteActivationOffset(RTE_ACTIVATION_OFFSET_EDEFAULT);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				setRteMappedToTask((OsTask)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				setRtePositionInTask(RTE_POSITION_IN_TASK_EDEFAULT);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				setRteUsedOsAlarm((OsAlarm)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				setRteUsedOsEvent((OsEvent)null);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				return rteEvent != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				return RTE_ACTIVATION_OFFSET_EDEFAULT == null ? rteActivationOffset != null : !RTE_ACTIVATION_OFFSET_EDEFAULT.equals(rteActivationOffset);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				return rteMappedToTask != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				return RTE_POSITION_IN_TASK_EDEFAULT == null ? rtePositionInTask != null : !RTE_POSITION_IN_TASK_EDEFAULT.equals(rtePositionInTask);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				return rteUsedOsAlarm != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				return rteUsedOsEvent != null;
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
		result.append(" (rteActivationOffset: ");
		result.append(rteActivationOffset);
		result.append(", rtePositionInTask: ");
		result.append(rtePositionInTask);
		result.append(')');
		return result.toString();
	}

} //RteEventToTaskMappingImpl
