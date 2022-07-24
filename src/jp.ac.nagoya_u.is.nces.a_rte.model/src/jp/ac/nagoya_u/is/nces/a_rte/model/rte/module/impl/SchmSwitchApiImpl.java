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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Switch Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getOsTaskEventTriggeredByMode <em>Os Task Event Triggered By Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getExecutableStartOperation <em>Executable Start Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmSwitchApiImpl extends SchmApiImpl implements SchmSwitchApi {
	/**
	 * The cached value of the '{@link #getModeMachineInstance() <em>Mode Machine Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMachineInstance()
	 * @generated
	 * @ordered
	 */
	protected ModeMachineInstance modeMachineInstance;

	/**
	 * The cached value of the '{@link #getOsTaskEventTriggeredByMode() <em>Os Task Event Triggered By Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEventTriggeredByMode()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTaskEventsTriggeredByMode> osTaskEventTriggeredByMode;

	/**
	 * The cached value of the '{@link #getExecutableStartOperation() <em>Executable Start Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableStartOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchTriggeringExecutableStartOperation> executableStartOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmSwitchApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_SWITCH_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance getModeMachineInstance() {
		if (modeMachineInstance != null && ((EObject)modeMachineInstance).eIsProxy()) {
			InternalEObject oldModeMachineInstance = (InternalEObject)modeMachineInstance;
			modeMachineInstance = (ModeMachineInstance)eResolveProxy(oldModeMachineInstance);
			if (modeMachineInstance != oldModeMachineInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
			}
		}
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance basicGetModeMachineInstance() {
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeMachineInstance(ModeMachineInstance newModeMachineInstance) {
		ModeMachineInstance oldModeMachineInstance = modeMachineInstance;
		modeMachineInstance = newModeMachineInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTaskEventsTriggeredByMode> getOsTaskEventTriggeredByMode() {
		if (osTaskEventTriggeredByMode == null) {
			osTaskEventTriggeredByMode = new EObjectContainmentEList<OsTaskEventsTriggeredByMode>(OsTaskEventsTriggeredByMode.class, this, ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE);
		}
		return osTaskEventTriggeredByMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchTriggeringExecutableStartOperation> getExecutableStartOperation() {
		if (executableStartOperation == null) {
			executableStartOperation = new EObjectContainmentEList<ModeSwitchTriggeringExecutableStartOperation>(ModeSwitchTriggeringExecutableStartOperation.class, this, ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION);
		}
		return executableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return ((InternalEList<?>)getOsTaskEventTriggeredByMode()).basicRemove(otherEnd, msgs);
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return ((InternalEList<?>)getExecutableStartOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				if (resolve) return getModeMachineInstance();
				return basicGetModeMachineInstance();
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return getOsTaskEventTriggeredByMode();
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return getExecutableStartOperation();
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				getOsTaskEventTriggeredByMode().clear();
				getOsTaskEventTriggeredByMode().addAll((Collection<? extends OsTaskEventsTriggeredByMode>)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				getExecutableStartOperation().addAll((Collection<? extends ModeSwitchTriggeringExecutableStartOperation>)newValue);
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				getOsTaskEventTriggeredByMode().clear();
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				return modeMachineInstance != null;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return osTaskEventTriggeredByMode != null && !osTaskEventTriggeredByMode.isEmpty();
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return executableStartOperation != null && !executableStartOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchmSwitchApiImpl
