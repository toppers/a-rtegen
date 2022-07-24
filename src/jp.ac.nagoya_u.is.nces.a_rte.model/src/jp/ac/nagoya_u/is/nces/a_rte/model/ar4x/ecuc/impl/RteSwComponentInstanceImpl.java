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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;

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
 * An implementation of the model object '<em><b>Rte Sw Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteEventToTaskMapping <em>Rte Event To Task Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteExclusiveAreaImplementation <em>Rte Exclusive Area Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteSoftwareComponentInstance <em>Rte Software Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteSwComponentInstanceImpl extends EcucContainerImpl implements RteSwComponentInstance {
	/**
	 * The cached value of the '{@link #getRteEventToTaskMapping() <em>Rte Event To Task Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEventToTaskMapping> rteEventToTaskMapping;
	/**
	 * The cached value of the '{@link #getRteExclusiveAreaImplementation() <em>Rte Exclusive Area Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<RteExclusiveAreaImplementation> rteExclusiveAreaImplementation;
	/**
	 * The cached value of the '{@link #getRteSoftwareComponentInstance() <em>Rte Software Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSoftwareComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected SwComponentPrototype rteSoftwareComponentInstance;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteSwComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_SW_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEventToTaskMapping> getRteEventToTaskMapping() {
		if (rteEventToTaskMapping == null) {
			rteEventToTaskMapping = new EObjectContainmentEList<RteEventToTaskMapping>(RteEventToTaskMapping.class, this, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING);
		}
		return rteEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteExclusiveAreaImplementation> getRteExclusiveAreaImplementation() {
		if (rteExclusiveAreaImplementation == null) {
			rteExclusiveAreaImplementation = new EObjectContainmentEList<RteExclusiveAreaImplementation>(RteExclusiveAreaImplementation.class, this, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION);
		}
		return rteExclusiveAreaImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype getRteSoftwareComponentInstance() {
		if (rteSoftwareComponentInstance != null && ((EObject)rteSoftwareComponentInstance).eIsProxy()) {
			InternalEObject oldRteSoftwareComponentInstance = (InternalEObject)rteSoftwareComponentInstance;
			rteSoftwareComponentInstance = (SwComponentPrototype)eResolveProxy(oldRteSoftwareComponentInstance);
			if (rteSoftwareComponentInstance != oldRteSoftwareComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE, oldRteSoftwareComponentInstance, rteSoftwareComponentInstance));
			}
		}
		return rteSoftwareComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype basicGetRteSoftwareComponentInstance() {
		return rteSoftwareComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteSoftwareComponentInstance(SwComponentPrototype newRteSoftwareComponentInstance) {
		SwComponentPrototype oldRteSoftwareComponentInstance = rteSoftwareComponentInstance;
		rteSoftwareComponentInstance = newRteSoftwareComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE, oldRteSoftwareComponentInstance, rteSoftwareComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return ((InternalEList<?>)getRteEventToTaskMapping()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return ((InternalEList<?>)getRteExclusiveAreaImplementation()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return getRteEventToTaskMapping();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return getRteExclusiveAreaImplementation();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				if (resolve) return getRteSoftwareComponentInstance();
				return basicGetRteSoftwareComponentInstance();
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				getRteEventToTaskMapping().clear();
				getRteEventToTaskMapping().addAll((Collection<? extends RteEventToTaskMapping>)newValue);
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				getRteExclusiveAreaImplementation().clear();
				getRteExclusiveAreaImplementation().addAll((Collection<? extends RteExclusiveAreaImplementation>)newValue);
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				setRteSoftwareComponentInstance((SwComponentPrototype)newValue);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				getRteEventToTaskMapping().clear();
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				getRteExclusiveAreaImplementation().clear();
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				setRteSoftwareComponentInstance((SwComponentPrototype)null);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return rteEventToTaskMapping != null && !rteEventToTaskMapping.isEmpty();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return rteExclusiveAreaImplementation != null && !rteExclusiveAreaImplementation.isEmpty();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				return rteSoftwareComponentInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RteSwComponentInstanceImpl
