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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Module Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswEventToTaskMapping <em>Rte Bsw Event To Task Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswExclusiveAreaImpl <em>Rte Bsw Exclusive Area Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswImplementation <em>Rte Bsw Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswRequiredModeGroupConnection <em>Rte Bsw Required Mode Group Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswModuleInstanceImpl extends EcucContainerImpl implements RteBswModuleInstance {
	/**
	 * The cached value of the '{@link #getRteBswEventToTaskMapping() <em>Rte Bsw Event To Task Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> rteBswEventToTaskMapping;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaImpl() <em>Rte Bsw Exclusive Area Impl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswExclusiveAreaImpl> rteBswExclusiveAreaImpl;

	/**
	 * The cached value of the '{@link #getRteBswImplementation() <em>Rte Bsw Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswImplementation()
	 * @generated
	 * @ordered
	 */
	protected BswImplementation rteBswImplementation;

	/**
	 * The cached value of the '{@link #getRteBswRequiredModeGroupConnection() <em>Rte Bsw Required Mode Group Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswRequiredModeGroupConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswRequiredModeGroupConnection> rteBswRequiredModeGroupConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getRteBswEventToTaskMapping() {
		if (rteBswEventToTaskMapping == null) {
			rteBswEventToTaskMapping = new EObjectContainmentEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING);
		}
		return rteBswEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswExclusiveAreaImpl> getRteBswExclusiveAreaImpl() {
		if (rteBswExclusiveAreaImpl == null) {
			rteBswExclusiveAreaImpl = new EObjectContainmentEList<RteBswExclusiveAreaImpl>(RteBswExclusiveAreaImpl.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL);
		}
		return rteBswExclusiveAreaImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswImplementation getRteBswImplementation() {
		if (rteBswImplementation != null && ((EObject)rteBswImplementation).eIsProxy()) {
			InternalEObject oldRteBswImplementation = (InternalEObject)rteBswImplementation;
			rteBswImplementation = (BswImplementation)eResolveProxy(oldRteBswImplementation);
			if (rteBswImplementation != oldRteBswImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, oldRteBswImplementation, rteBswImplementation));
			}
		}
		return rteBswImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswImplementation basicGetRteBswImplementation() {
		return rteBswImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswImplementation(BswImplementation newRteBswImplementation) {
		BswImplementation oldRteBswImplementation = rteBswImplementation;
		rteBswImplementation = newRteBswImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, oldRteBswImplementation, rteBswImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswRequiredModeGroupConnection> getRteBswRequiredModeGroupConnection() {
		if (rteBswRequiredModeGroupConnection == null) {
			rteBswRequiredModeGroupConnection = new EObjectContainmentWithInverseEList<RteBswRequiredModeGroupConnection>(RteBswRequiredModeGroupConnection.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT);
		}
		return rteBswRequiredModeGroupConnection;
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRteBswRequiredModeGroupConnection()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return ((InternalEList<?>)getRteBswEventToTaskMapping()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return ((InternalEList<?>)getRteBswExclusiveAreaImpl()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return ((InternalEList<?>)getRteBswRequiredModeGroupConnection()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return getRteBswEventToTaskMapping();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return getRteBswExclusiveAreaImpl();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				if (resolve) return getRteBswImplementation();
				return basicGetRteBswImplementation();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return getRteBswRequiredModeGroupConnection();
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				getRteBswEventToTaskMapping().clear();
				getRteBswEventToTaskMapping().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				getRteBswExclusiveAreaImpl().clear();
				getRteBswExclusiveAreaImpl().addAll((Collection<? extends RteBswExclusiveAreaImpl>)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				setRteBswImplementation((BswImplementation)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				getRteBswRequiredModeGroupConnection().clear();
				getRteBswRequiredModeGroupConnection().addAll((Collection<? extends RteBswRequiredModeGroupConnection>)newValue);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				getRteBswEventToTaskMapping().clear();
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				getRteBswExclusiveAreaImpl().clear();
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				setRteBswImplementation((BswImplementation)null);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				getRteBswRequiredModeGroupConnection().clear();
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return rteBswEventToTaskMapping != null && !rteBswEventToTaskMapping.isEmpty();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return rteBswExclusiveAreaImpl != null && !rteBswExclusiveAreaImpl.isEmpty();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				return rteBswImplementation != null;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return rteBswRequiredModeGroupConnection != null && !rteBswRequiredModeGroupConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteBswModuleInstanceImpl
