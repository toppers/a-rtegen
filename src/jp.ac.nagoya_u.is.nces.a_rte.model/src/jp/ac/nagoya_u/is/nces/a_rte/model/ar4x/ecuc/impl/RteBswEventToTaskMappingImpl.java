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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswEvent <em>Rte Bsw Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswEventToTaskMappingImpl extends EcucContainerImpl implements RteBswEventToTaskMapping {
	/**
	 * The default value of the '{@link #getRteBswActivationOffset() <em>Rte Bsw Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RTE_BSW_ACTIVATION_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteBswActivationOffset() <em>Rte Bsw Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rteBswActivationOffset = RTE_BSW_ACTIVATION_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteBswEvent() <em>Rte Bsw Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswEvent()
	 * @generated
	 * @ordered
	 */
	protected BswEvent rteBswEvent;

	/**
	 * The default value of the '{@link #getRteBswPositionInTask() <em>Rte Bsw Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswPositionInTask()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RTE_BSW_POSITION_IN_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteBswPositionInTask() <em>Rte Bsw Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswPositionInTask()
	 * @generated
	 * @ordered
	 */
	protected Integer rteBswPositionInTask = RTE_BSW_POSITION_IN_TASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteBswMappedToTask() <em>Rte Bsw Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswMappedToTask()
	 * @generated
	 * @ordered
	 */
	protected OsTask rteBswMappedToTask;

	/**
	 * The cached value of the '{@link #getRteBswUsedOsAlarm() <em>Rte Bsw Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswUsedOsAlarm()
	 * @generated
	 * @ordered
	 */
	protected OsAlarm rteBswUsedOsAlarm;

	/**
	 * The cached value of the '{@link #getRteBswUsedOsEvent() <em>Rte Bsw Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswUsedOsEvent()
	 * @generated
	 * @ordered
	 */
	protected OsEvent rteBswUsedOsEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswEventToTaskMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRteBswActivationOffset() {
		return rteBswActivationOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswActivationOffset(BigDecimal newRteBswActivationOffset) {
		BigDecimal oldRteBswActivationOffset = rteBswActivationOffset;
		rteBswActivationOffset = newRteBswActivationOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET, oldRteBswActivationOffset, rteBswActivationOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswEvent getRteBswEvent() {
		if (rteBswEvent != null && ((EObject)rteBswEvent).eIsProxy()) {
			InternalEObject oldRteBswEvent = (InternalEObject)rteBswEvent;
			rteBswEvent = (BswEvent)eResolveProxy(oldRteBswEvent);
			if (rteBswEvent != oldRteBswEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT, oldRteBswEvent, rteBswEvent));
			}
		}
		return rteBswEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswEvent basicGetRteBswEvent() {
		return rteBswEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswEvent(BswEvent newRteBswEvent, NotificationChain msgs) {
		BswEvent oldRteBswEvent = rteBswEvent;
		rteBswEvent = newRteBswEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT, oldRteBswEvent, newRteBswEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswEvent(BswEvent newRteBswEvent) {
		if (newRteBswEvent != rteBswEvent) {
			NotificationChain msgs = null;
			if (rteBswEvent != null)
				msgs = ((InternalEObject)rteBswEvent).eInverseRemove(this, M2Package.BSW_EVENT__CONFIG, BswEvent.class, msgs);
			if (newRteBswEvent != null)
				msgs = ((InternalEObject)newRteBswEvent).eInverseAdd(this, M2Package.BSW_EVENT__CONFIG, BswEvent.class, msgs);
			msgs = basicSetRteBswEvent(newRteBswEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT, newRteBswEvent, newRteBswEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRteBswPositionInTask() {
		return rteBswPositionInTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswPositionInTask(Integer newRteBswPositionInTask) {
		Integer oldRteBswPositionInTask = rteBswPositionInTask;
		rteBswPositionInTask = newRteBswPositionInTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK, oldRteBswPositionInTask, rteBswPositionInTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask getRteBswMappedToTask() {
		if (rteBswMappedToTask != null && ((EObject)rteBswMappedToTask).eIsProxy()) {
			InternalEObject oldRteBswMappedToTask = (InternalEObject)rteBswMappedToTask;
			rteBswMappedToTask = (OsTask)eResolveProxy(oldRteBswMappedToTask);
			if (rteBswMappedToTask != oldRteBswMappedToTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK, oldRteBswMappedToTask, rteBswMappedToTask));
			}
		}
		return rteBswMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask basicGetRteBswMappedToTask() {
		return rteBswMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswMappedToTask(OsTask newRteBswMappedToTask, NotificationChain msgs) {
		OsTask oldRteBswMappedToTask = rteBswMappedToTask;
		rteBswMappedToTask = newRteBswMappedToTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK, oldRteBswMappedToTask, newRteBswMappedToTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswMappedToTask(OsTask newRteBswMappedToTask) {
		if (newRteBswMappedToTask != rteBswMappedToTask) {
			NotificationChain msgs = null;
			if (rteBswMappedToTask != null)
				msgs = ((InternalEObject)rteBswMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT, OsTask.class, msgs);
			if (newRteBswMappedToTask != null)
				msgs = ((InternalEObject)newRteBswMappedToTask).eInverseAdd(this, EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT, OsTask.class, msgs);
			msgs = basicSetRteBswMappedToTask(newRteBswMappedToTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK, newRteBswMappedToTask, newRteBswMappedToTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm getRteBswUsedOsAlarm() {
		if (rteBswUsedOsAlarm != null && ((EObject)rteBswUsedOsAlarm).eIsProxy()) {
			InternalEObject oldRteBswUsedOsAlarm = (InternalEObject)rteBswUsedOsAlarm;
			rteBswUsedOsAlarm = (OsAlarm)eResolveProxy(oldRteBswUsedOsAlarm);
			if (rteBswUsedOsAlarm != oldRteBswUsedOsAlarm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM, oldRteBswUsedOsAlarm, rteBswUsedOsAlarm));
			}
		}
		return rteBswUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm basicGetRteBswUsedOsAlarm() {
		return rteBswUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswUsedOsAlarm(OsAlarm newRteBswUsedOsAlarm) {
		OsAlarm oldRteBswUsedOsAlarm = rteBswUsedOsAlarm;
		rteBswUsedOsAlarm = newRteBswUsedOsAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM, oldRteBswUsedOsAlarm, rteBswUsedOsAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent getRteBswUsedOsEvent() {
		if (rteBswUsedOsEvent != null && ((EObject)rteBswUsedOsEvent).eIsProxy()) {
			InternalEObject oldRteBswUsedOsEvent = (InternalEObject)rteBswUsedOsEvent;
			rteBswUsedOsEvent = (OsEvent)eResolveProxy(oldRteBswUsedOsEvent);
			if (rteBswUsedOsEvent != oldRteBswUsedOsEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT, oldRteBswUsedOsEvent, rteBswUsedOsEvent));
			}
		}
		return rteBswUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent basicGetRteBswUsedOsEvent() {
		return rteBswUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswUsedOsEvent(OsEvent newRteBswUsedOsEvent) {
		OsEvent oldRteBswUsedOsEvent = rteBswUsedOsEvent;
		rteBswUsedOsEvent = newRteBswUsedOsEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT, oldRteBswUsedOsEvent, rteBswUsedOsEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				if (rteBswEvent != null)
					msgs = ((InternalEObject)rteBswEvent).eInverseRemove(this, M2Package.BSW_EVENT__CONFIG, BswEvent.class, msgs);
				return basicSetRteBswEvent((BswEvent)otherEnd, msgs);
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				if (rteBswMappedToTask != null)
					msgs = ((InternalEObject)rteBswMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT, OsTask.class, msgs);
				return basicSetRteBswMappedToTask((OsTask)otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				return basicSetRteBswEvent(null, msgs);
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				return basicSetRteBswMappedToTask(null, msgs);
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
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET:
				return getRteBswActivationOffset();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				if (resolve) return getRteBswEvent();
				return basicGetRteBswEvent();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK:
				return getRteBswPositionInTask();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				if (resolve) return getRteBswMappedToTask();
				return basicGetRteBswMappedToTask();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM:
				if (resolve) return getRteBswUsedOsAlarm();
				return basicGetRteBswUsedOsAlarm();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT:
				if (resolve) return getRteBswUsedOsEvent();
				return basicGetRteBswUsedOsEvent();
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
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET:
				setRteBswActivationOffset((BigDecimal)newValue);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				setRteBswEvent((BswEvent)newValue);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK:
				setRteBswPositionInTask((Integer)newValue);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				setRteBswMappedToTask((OsTask)newValue);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM:
				setRteBswUsedOsAlarm((OsAlarm)newValue);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT:
				setRteBswUsedOsEvent((OsEvent)newValue);
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
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET:
				setRteBswActivationOffset(RTE_BSW_ACTIVATION_OFFSET_EDEFAULT);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				setRteBswEvent((BswEvent)null);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK:
				setRteBswPositionInTask(RTE_BSW_POSITION_IN_TASK_EDEFAULT);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				setRteBswMappedToTask((OsTask)null);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM:
				setRteBswUsedOsAlarm((OsAlarm)null);
				return;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT:
				setRteBswUsedOsEvent((OsEvent)null);
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
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET:
				return RTE_BSW_ACTIVATION_OFFSET_EDEFAULT == null ? rteBswActivationOffset != null : !RTE_BSW_ACTIVATION_OFFSET_EDEFAULT.equals(rteBswActivationOffset);
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT:
				return rteBswEvent != null;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK:
				return RTE_BSW_POSITION_IN_TASK_EDEFAULT == null ? rteBswPositionInTask != null : !RTE_BSW_POSITION_IN_TASK_EDEFAULT.equals(rteBswPositionInTask);
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK:
				return rteBswMappedToTask != null;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM:
				return rteBswUsedOsAlarm != null;
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT:
				return rteBswUsedOsEvent != null;
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
		result.append(" (rteBswActivationOffset: ");
		result.append(rteBswActivationOffset);
		result.append(", rteBswPositionInTask: ");
		result.append(rteBswPositionInTask);
		result.append(')');
		return result.toString();
	}

} //RteBswEventToTaskMappingImpl
