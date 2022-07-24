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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getStartsOnEvent <em>Starts On Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getDisabledInMode <em>Disabled In Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BswEventImpl extends IdentifiableImpl implements BswEvent {
	/**
	 * The cached value of the '{@link #getStartsOnEvent() <em>Starts On Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartsOnEvent()
	 * @generated
	 * @ordered
	 */
	protected BswSchedulableEntity startsOnEvent;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> config;

	/**
	 * The cached value of the '{@link #getDisabledInMode() <em>Disabled In Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInBswModuleDescriptionInstanceRef> disabledInMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity getStartsOnEvent() {
		if (startsOnEvent != null && ((EObject)startsOnEvent).eIsProxy()) {
			InternalEObject oldStartsOnEvent = (InternalEObject)startsOnEvent;
			startsOnEvent = (BswSchedulableEntity)eResolveProxy(oldStartsOnEvent);
			if (startsOnEvent != oldStartsOnEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.BSW_EVENT__STARTS_ON_EVENT, oldStartsOnEvent, startsOnEvent));
			}
		}
		return startsOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity basicGetStartsOnEvent() {
		return startsOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartsOnEvent(BswSchedulableEntity newStartsOnEvent, NotificationChain msgs) {
		BswSchedulableEntity oldStartsOnEvent = startsOnEvent;
		startsOnEvent = newStartsOnEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__STARTS_ON_EVENT, oldStartsOnEvent, newStartsOnEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartsOnEvent(BswSchedulableEntity newStartsOnEvent) {
		if (newStartsOnEvent != startsOnEvent) {
			NotificationChain msgs = null;
			if (startsOnEvent != null)
				msgs = ((InternalEObject)startsOnEvent).eInverseRemove(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
			if (newStartsOnEvent != null)
				msgs = ((InternalEObject)newStartsOnEvent).eInverseAdd(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
			msgs = basicSetStartsOnEvent(newStartsOnEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__STARTS_ON_EVENT, newStartsOnEvent, newStartsOnEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getConfig() {
		if (config == null) {
			config = new EObjectWithInverseResolvingEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, M2Package.BSW_EVENT__CONFIG, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT);
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.BSW_EVENT__PARENT) return null;
		return (BswInternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BswInternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.BSW_EVENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BswInternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.BSW_EVENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.BSW_INTERNAL_BEHAVIOR__EVENT, BswInternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeInBswModuleDescriptionInstanceRef> getDisabledInMode() {
		if (disabledInMode == null) {
			disabledInMode = new EObjectContainmentEList<ModeInBswModuleDescriptionInstanceRef>(ModeInBswModuleDescriptionInstanceRef.class, this, M2Package.BSW_EVENT__DISABLED_IN_MODE);
		}
		return disabledInMode;
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				if (startsOnEvent != null)
					msgs = ((InternalEObject)startsOnEvent).eInverseRemove(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
				return basicSetStartsOnEvent((BswSchedulableEntity)otherEnd, msgs);
			case M2Package.BSW_EVENT__CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfig()).basicAdd(otherEnd, msgs);
			case M2Package.BSW_EVENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BswInternalBehavior)otherEnd, msgs);
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				return basicSetStartsOnEvent(null, msgs);
			case M2Package.BSW_EVENT__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_EVENT__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.BSW_EVENT__DISABLED_IN_MODE:
				return ((InternalEList<?>)getDisabledInMode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M2Package.BSW_EVENT__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.BSW_INTERNAL_BEHAVIOR__EVENT, BswInternalBehavior.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				if (resolve) return getStartsOnEvent();
				return basicGetStartsOnEvent();
			case M2Package.BSW_EVENT__CONFIG:
				return getConfig();
			case M2Package.BSW_EVENT__PARENT:
				return getParent();
			case M2Package.BSW_EVENT__DISABLED_IN_MODE:
				return getDisabledInMode();
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				setStartsOnEvent((BswSchedulableEntity)newValue);
				return;
			case M2Package.BSW_EVENT__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
				return;
			case M2Package.BSW_EVENT__PARENT:
				setParent((BswInternalBehavior)newValue);
				return;
			case M2Package.BSW_EVENT__DISABLED_IN_MODE:
				getDisabledInMode().clear();
				getDisabledInMode().addAll((Collection<? extends ModeInBswModuleDescriptionInstanceRef>)newValue);
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				setStartsOnEvent((BswSchedulableEntity)null);
				return;
			case M2Package.BSW_EVENT__CONFIG:
				getConfig().clear();
				return;
			case M2Package.BSW_EVENT__PARENT:
				setParent((BswInternalBehavior)null);
				return;
			case M2Package.BSW_EVENT__DISABLED_IN_MODE:
				getDisabledInMode().clear();
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				return startsOnEvent != null;
			case M2Package.BSW_EVENT__CONFIG:
				return config != null && !config.isEmpty();
			case M2Package.BSW_EVENT__PARENT:
				return getParent() != null;
			case M2Package.BSW_EVENT__DISABLED_IN_MODE:
				return disabledInMode != null && !disabledInMode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BswEventImpl
