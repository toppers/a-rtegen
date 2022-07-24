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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generated Ecu Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsTask <em>Generated Os Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsEvent <em>Generated Os Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsSpinlock <em>Generated Os Spinlock</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsIocCommunication <em>Generated Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsTrustedFunction <em>Generated Os Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratedEcuConfigurationImpl extends InteractionObjectImpl implements GeneratedEcuConfiguration {
	/**
	 * The cached value of the '{@link #getGeneratedOsTask() <em>Generated Os Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTask> generatedOsTask;

	/**
	 * The cached value of the '{@link #getGeneratedOsEvent() <em>Generated Os Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> generatedOsEvent;

	/**
	 * The cached value of the '{@link #getGeneratedOsSpinlock() <em>Generated Os Spinlock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected EList<OsSpinlock> generatedOsSpinlock;

	/**
	 * The cached value of the '{@link #getGeneratedOsIocCommunication() <em>Generated Os Ioc Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsIocCommunication> generatedOsIocCommunication;

	/**
	 * The cached value of the '{@link #getGeneratedOsTrustedFunction() <em>Generated Os Trusted Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplicationTrustedFunction> generatedOsTrustedFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedEcuConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.GENERATED_ECU_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTask> getGeneratedOsTask() {
		if (generatedOsTask == null) {
			generatedOsTask = new EObjectResolvingEList<OsTask>(OsTask.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK);
		}
		return generatedOsTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getGeneratedOsEvent() {
		if (generatedOsEvent == null) {
			generatedOsEvent = new EObjectResolvingEList<OsEvent>(OsEvent.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT);
		}
		return generatedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsSpinlock> getGeneratedOsSpinlock() {
		if (generatedOsSpinlock == null) {
			generatedOsSpinlock = new EObjectResolvingEList<OsSpinlock>(OsSpinlock.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK);
		}
		return generatedOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsIocCommunication> getGeneratedOsIocCommunication() {
		if (generatedOsIocCommunication == null) {
			generatedOsIocCommunication = new EObjectResolvingEList<OsIocCommunication>(OsIocCommunication.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION);
		}
		return generatedOsIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplicationTrustedFunction> getGeneratedOsTrustedFunction() {
		if (generatedOsTrustedFunction == null) {
			generatedOsTrustedFunction = new EObjectResolvingEList<OsApplicationTrustedFunction>(OsApplicationTrustedFunction.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION);
		}
		return generatedOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				return getGeneratedOsTask();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				return getGeneratedOsEvent();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				return getGeneratedOsSpinlock();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				return getGeneratedOsIocCommunication();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				return getGeneratedOsTrustedFunction();
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				getGeneratedOsTask().clear();
				getGeneratedOsTask().addAll((Collection<? extends OsTask>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				getGeneratedOsEvent().clear();
				getGeneratedOsEvent().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				getGeneratedOsSpinlock().clear();
				getGeneratedOsSpinlock().addAll((Collection<? extends OsSpinlock>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				getGeneratedOsIocCommunication().clear();
				getGeneratedOsIocCommunication().addAll((Collection<? extends OsIocCommunication>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				getGeneratedOsTrustedFunction().clear();
				getGeneratedOsTrustedFunction().addAll((Collection<? extends OsApplicationTrustedFunction>)newValue);
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				getGeneratedOsTask().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				getGeneratedOsEvent().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				getGeneratedOsSpinlock().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				getGeneratedOsIocCommunication().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				getGeneratedOsTrustedFunction().clear();
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				return generatedOsTask != null && !generatedOsTask.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				return generatedOsEvent != null && !generatedOsEvent.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				return generatedOsSpinlock != null && !generatedOsSpinlock.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				return generatedOsIocCommunication != null && !generatedOsIocCommunication.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				return generatedOsTrustedFunction != null && !generatedOsTrustedFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneratedEcuConfigurationImpl
