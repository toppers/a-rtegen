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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import java.math.BigDecimal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Start Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getActivationOffset <em>Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getPositionInTask <em>Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getStartOnEvent <em>Start On Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getTimingTriggeringEntityStartCondition <em>Timing Triggering Entity Start Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityStartInteractionImpl extends InteractionImpl implements EntityStartInteraction {
	/**
	 * The cached value of the '{@link #getStarter() <em>Starter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarter()
	 * @generated
	 * @ordered
	 */
	protected EntityStarter starter;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EntityStartImplementation implementation;

	/**
	 * The default value of the '{@link #getActivationOffset() <em>Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTIVATION_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationOffset() <em>Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal activationOffset = ACTIVATION_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionInTask() <em>Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionInTask()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_IN_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionInTask() <em>Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionInTask()
	 * @generated
	 * @ordered
	 */
	protected Integer positionInTask = POSITION_IN_TASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartOnEvent() <em>Start On Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOnEvent()
	 * @generated
	 * @ordered
	 */
	protected ExecutableEntity startOnEvent;

	/**
	 * The cached value of the '{@link #getTimingTriggeringEntityStartCondition() <em>Timing Triggering Entity Start Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTriggeringEntityStartCondition()
	 * @generated
	 * @ordered
	 */
	protected TimingTriggeringEntityStartCondition timingTriggeringEntityStartCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityStartInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ENTITY_START_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarter getStarter() {
		if (starter != null && ((EObject)starter).eIsProxy()) {
			InternalEObject oldStarter = (InternalEObject)starter;
			starter = (EntityStarter)eResolveProxy(oldStarter);
			if (starter != oldStarter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_START_INTERACTION__STARTER, oldStarter, starter));
			}
		}
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarter basicGetStarter() {
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(EntityStarter newStarter, NotificationChain msgs) {
		EntityStarter oldStarter = starter;
		starter = newStarter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__STARTER, oldStarter, newStarter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarter(EntityStarter newStarter) {
		if (newStarter != starter) {
			NotificationChain msgs = null;
			if (starter != null)
				msgs = ((InternalEObject)starter).eInverseRemove(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
			if (newStarter != null)
				msgs = ((InternalEObject)newStarter).eInverseAdd(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
			msgs = basicSetStarter(newStarter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__STARTER, newStarter, newStarter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStartImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(EntityStartImplementation newImplementation, NotificationChain msgs) {
		EntityStartImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(EntityStartImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getActivationOffset() {
		return activationOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationOffset(BigDecimal newActivationOffset) {
		BigDecimal oldActivationOffset = activationOffset;
		activationOffset = newActivationOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__ACTIVATION_OFFSET, oldActivationOffset, activationOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPositionInTask() {
		return positionInTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionInTask(Integer newPositionInTask) {
		Integer oldPositionInTask = positionInTask;
		positionInTask = newPositionInTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__POSITION_IN_TASK, oldPositionInTask, positionInTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity getStartOnEvent() {
		if (startOnEvent != null && ((EObject)startOnEvent).eIsProxy()) {
			InternalEObject oldStartOnEvent = (InternalEObject)startOnEvent;
			startOnEvent = (ExecutableEntity)eResolveProxy(oldStartOnEvent);
			if (startOnEvent != oldStartOnEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT, oldStartOnEvent, startOnEvent));
			}
		}
		return startOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity basicGetStartOnEvent() {
		return startOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOnEvent(ExecutableEntity newStartOnEvent) {
		ExecutableEntity oldStartOnEvent = startOnEvent;
		startOnEvent = newStartOnEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT, oldStartOnEvent, startOnEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringEntityStartCondition getTimingTriggeringEntityStartCondition() {
		return timingTriggeringEntityStartCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTriggeringEntityStartCondition(TimingTriggeringEntityStartCondition newTimingTriggeringEntityStartCondition, NotificationChain msgs) {
		TimingTriggeringEntityStartCondition oldTimingTriggeringEntityStartCondition = timingTriggeringEntityStartCondition;
		timingTriggeringEntityStartCondition = newTimingTriggeringEntityStartCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION, oldTimingTriggeringEntityStartCondition, newTimingTriggeringEntityStartCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTriggeringEntityStartCondition(TimingTriggeringEntityStartCondition newTimingTriggeringEntityStartCondition) {
		if (newTimingTriggeringEntityStartCondition != timingTriggeringEntityStartCondition) {
			NotificationChain msgs = null;
			if (timingTriggeringEntityStartCondition != null)
				msgs = ((InternalEObject)timingTriggeringEntityStartCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION, null, msgs);
			if (newTimingTriggeringEntityStartCondition != null)
				msgs = ((InternalEObject)newTimingTriggeringEntityStartCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION, null, msgs);
			msgs = basicSetTimingTriggeringEntityStartCondition(newTimingTriggeringEntityStartCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION, newTimingTriggeringEntityStartCondition, newTimingTriggeringEntityStartCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				if (starter != null)
					msgs = ((InternalEObject)starter).eInverseRemove(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
				return basicSetStarter((EntityStarter)otherEnd, msgs);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				return basicSetStarter(null, msgs);
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION:
				return basicSetTimingTriggeringEntityStartCondition(null, msgs);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				if (resolve) return getStarter();
				return basicGetStarter();
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return getImplementation();
			case InteractionPackage.ENTITY_START_INTERACTION__ACTIVATION_OFFSET:
				return getActivationOffset();
			case InteractionPackage.ENTITY_START_INTERACTION__POSITION_IN_TASK:
				return getPositionInTask();
			case InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT:
				if (resolve) return getStartOnEvent();
				return basicGetStartOnEvent();
			case InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION:
				return getTimingTriggeringEntityStartCondition();
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				setStarter((EntityStarter)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				setImplementation((EntityStartImplementation)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__ACTIVATION_OFFSET:
				setActivationOffset((BigDecimal)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__POSITION_IN_TASK:
				setPositionInTask((Integer)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT:
				setStartOnEvent((ExecutableEntity)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION:
				setTimingTriggeringEntityStartCondition((TimingTriggeringEntityStartCondition)newValue);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				setStarter((EntityStarter)null);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				setImplementation((EntityStartImplementation)null);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__ACTIVATION_OFFSET:
				setActivationOffset(ACTIVATION_OFFSET_EDEFAULT);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__POSITION_IN_TASK:
				setPositionInTask(POSITION_IN_TASK_EDEFAULT);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT:
				setStartOnEvent((ExecutableEntity)null);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION:
				setTimingTriggeringEntityStartCondition((TimingTriggeringEntityStartCondition)null);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				return starter != null;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return implementation != null;
			case InteractionPackage.ENTITY_START_INTERACTION__ACTIVATION_OFFSET:
				return ACTIVATION_OFFSET_EDEFAULT == null ? activationOffset != null : !ACTIVATION_OFFSET_EDEFAULT.equals(activationOffset);
			case InteractionPackage.ENTITY_START_INTERACTION__POSITION_IN_TASK:
				return POSITION_IN_TASK_EDEFAULT == null ? positionInTask != null : !POSITION_IN_TASK_EDEFAULT.equals(positionInTask);
			case InteractionPackage.ENTITY_START_INTERACTION__START_ON_EVENT:
				return startOnEvent != null;
			case InteractionPackage.ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION:
				return timingTriggeringEntityStartCondition != null;
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
		result.append(" (activationOffset: ");
		result.append(activationOffset);
		result.append(", positionInTask: ");
		result.append(positionInTask);
		result.append(')');
		return result.toString();
	}

} //EntityStartInteractionImpl
