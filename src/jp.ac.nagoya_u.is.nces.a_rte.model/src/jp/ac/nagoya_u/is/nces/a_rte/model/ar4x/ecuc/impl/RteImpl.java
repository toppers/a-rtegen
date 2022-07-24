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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteGeneration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteGeneration <em>Rte Generation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteBswGeneral <em>Rte Bsw General</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteSwComponentInstance <em>Rte Sw Component Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteOsInteraction <em>Rte Os Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteInitializationBehavior <em>Rte Initialization Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteBswModuleInstance <em>Rte Bsw Module Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteImpl extends EcucModuleImpl implements Rte {
	/**
	 * The cached value of the '{@link #getRteGeneration() <em>Rte Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteGeneration()
	 * @generated
	 * @ordered
	 */
	protected RteGeneration rteGeneration;

	/**
	 * The cached value of the '{@link #getRteBswGeneral() <em>Rte Bsw General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswGeneral()
	 * @generated
	 * @ordered
	 */
	protected RteBswGeneral rteBswGeneral;

	/**
	 * The cached value of the '{@link #getRteSwComponentInstance() <em>Rte Sw Component Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSwComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RteSwComponentInstance> rteSwComponentInstance;

	/**
	 * The cached value of the '{@link #getRteOsInteraction() <em>Rte Os Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteOsInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<RteOsInteraction> rteOsInteraction;

	/**
	 * The cached value of the '{@link #getRteInitializationBehavior() <em>Rte Initialization Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<RteInitializationBehavior> rteInitializationBehavior;

	/**
	 * The cached value of the '{@link #getRteBswModuleInstance() <em>Rte Bsw Module Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswModuleInstance> rteBswModuleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteGeneration getRteGeneration() {
		return rteGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteGeneration(RteGeneration newRteGeneration, NotificationChain msgs) {
		RteGeneration oldRteGeneration = rteGeneration;
		rteGeneration = newRteGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_GENERATION, oldRteGeneration, newRteGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteGeneration(RteGeneration newRteGeneration) {
		if (newRteGeneration != rteGeneration) {
			NotificationChain msgs = null;
			if (rteGeneration != null)
				msgs = ((InternalEObject)rteGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_GENERATION, null, msgs);
			if (newRteGeneration != null)
				msgs = ((InternalEObject)newRteGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_GENERATION, null, msgs);
			msgs = basicSetRteGeneration(newRteGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_GENERATION, newRteGeneration, newRteGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswGeneral getRteBswGeneral() {
		return rteBswGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswGeneral(RteBswGeneral newRteBswGeneral, NotificationChain msgs) {
		RteBswGeneral oldRteBswGeneral = rteBswGeneral;
		rteBswGeneral = newRteBswGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_BSW_GENERAL, oldRteBswGeneral, newRteBswGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswGeneral(RteBswGeneral newRteBswGeneral) {
		if (newRteBswGeneral != rteBswGeneral) {
			NotificationChain msgs = null;
			if (rteBswGeneral != null)
				msgs = ((InternalEObject)rteBswGeneral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_BSW_GENERAL, null, msgs);
			if (newRteBswGeneral != null)
				msgs = ((InternalEObject)newRteBswGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_BSW_GENERAL, null, msgs);
			msgs = basicSetRteBswGeneral(newRteBswGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_BSW_GENERAL, newRteBswGeneral, newRteBswGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteSwComponentInstance> getRteSwComponentInstance() {
		if (rteSwComponentInstance == null) {
			rteSwComponentInstance = new EObjectContainmentEList<RteSwComponentInstance>(RteSwComponentInstance.class, this, EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE);
		}
		return rteSwComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteOsInteraction> getRteOsInteraction() {
		if (rteOsInteraction == null) {
			rteOsInteraction = new EObjectContainmentEList<RteOsInteraction>(RteOsInteraction.class, this, EcucPackage.RTE__RTE_OS_INTERACTION);
		}
		return rteOsInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteInitializationBehavior> getRteInitializationBehavior() {
		if (rteInitializationBehavior == null) {
			rteInitializationBehavior = new EObjectContainmentEList<RteInitializationBehavior>(RteInitializationBehavior.class, this, EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR);
		}
		return rteInitializationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswModuleInstance> getRteBswModuleInstance() {
		if (rteBswModuleInstance == null) {
			rteBswModuleInstance = new EObjectContainmentEList<RteBswModuleInstance>(RteBswModuleInstance.class, this, EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE);
		}
		return rteBswModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE__RTE_GENERATION:
				return basicSetRteGeneration(null, msgs);
			case EcucPackage.RTE__RTE_BSW_GENERAL:
				return basicSetRteBswGeneral(null, msgs);
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return ((InternalEList<?>)getRteSwComponentInstance()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return ((InternalEList<?>)getRteOsInteraction()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return ((InternalEList<?>)getRteInitializationBehavior()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return ((InternalEList<?>)getRteBswModuleInstance()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE__RTE_GENERATION:
				return getRteGeneration();
			case EcucPackage.RTE__RTE_BSW_GENERAL:
				return getRteBswGeneral();
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return getRteSwComponentInstance();
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return getRteOsInteraction();
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return getRteInitializationBehavior();
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return getRteBswModuleInstance();
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
			case EcucPackage.RTE__RTE_GENERATION:
				setRteGeneration((RteGeneration)newValue);
				return;
			case EcucPackage.RTE__RTE_BSW_GENERAL:
				setRteBswGeneral((RteBswGeneral)newValue);
				return;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				getRteSwComponentInstance().clear();
				getRteSwComponentInstance().addAll((Collection<? extends RteSwComponentInstance>)newValue);
				return;
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				getRteOsInteraction().clear();
				getRteOsInteraction().addAll((Collection<? extends RteOsInteraction>)newValue);
				return;
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				getRteInitializationBehavior().clear();
				getRteInitializationBehavior().addAll((Collection<? extends RteInitializationBehavior>)newValue);
				return;
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				getRteBswModuleInstance().clear();
				getRteBswModuleInstance().addAll((Collection<? extends RteBswModuleInstance>)newValue);
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
			case EcucPackage.RTE__RTE_GENERATION:
				setRteGeneration((RteGeneration)null);
				return;
			case EcucPackage.RTE__RTE_BSW_GENERAL:
				setRteBswGeneral((RteBswGeneral)null);
				return;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				getRteSwComponentInstance().clear();
				return;
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				getRteOsInteraction().clear();
				return;
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				getRteInitializationBehavior().clear();
				return;
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				getRteBswModuleInstance().clear();
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
			case EcucPackage.RTE__RTE_GENERATION:
				return rteGeneration != null;
			case EcucPackage.RTE__RTE_BSW_GENERAL:
				return rteBswGeneral != null;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return rteSwComponentInstance != null && !rteSwComponentInstance.isEmpty();
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return rteOsInteraction != null && !rteOsInteraction.isEmpty();
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return rteInitializationBehavior != null && !rteInitializationBehavior.isEmpty();
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return rteBswModuleInstance != null && !rteBswModuleInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteImpl
