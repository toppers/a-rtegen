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
import java.util.Collections;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable In Atomic Swc Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl#getPortPrototype <em>Port Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl#getTargetDataPrototype <em>Target Data Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableInAtomicSwcTypeInstanceRefImpl extends M2ObjectImpl implements VariableInAtomicSwcTypeInstanceRef {
	/**
	 * The cached value of the '{@link #getPortPrototype() <em>Port Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortPrototype()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype portPrototype;

	/**
	 * The cached value of the '{@link #getTargetDataPrototype() <em>Target Data Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDataPrototype()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototype targetDataPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableInAtomicSwcTypeInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceRef() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		Collections.addAll(instanceRefs, getPortPrototype().getId(), getTargetDataPrototype().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getPortPrototype() {
		if (portPrototype != null && ((EObject)portPrototype).eIsProxy()) {
			InternalEObject oldPortPrototype = (InternalEObject)portPrototype;
			portPrototype = (PortPrototype)eResolveProxy(oldPortPrototype);
			if (portPrototype != oldPortPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE, oldPortPrototype, portPrototype));
			}
		}
		return portPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetPortPrototype() {
		return portPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortPrototype(PortPrototype newPortPrototype) {
		PortPrototype oldPortPrototype = portPrototype;
		portPrototype = newPortPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE, oldPortPrototype, portPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype getTargetDataPrototype() {
		if (targetDataPrototype != null && ((EObject)targetDataPrototype).eIsProxy()) {
			InternalEObject oldTargetDataPrototype = (InternalEObject)targetDataPrototype;
			targetDataPrototype = (VariableDataPrototype)eResolveProxy(oldTargetDataPrototype);
			if (targetDataPrototype != oldTargetDataPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE, oldTargetDataPrototype, targetDataPrototype));
			}
		}
		return targetDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype basicGetTargetDataPrototype() {
		return targetDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDataPrototype(VariableDataPrototype newTargetDataPrototype) {
		VariableDataPrototype oldTargetDataPrototype = targetDataPrototype;
		targetDataPrototype = newTargetDataPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE, oldTargetDataPrototype, targetDataPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF:
				return getInstanceRef();
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE:
				if (resolve) return getPortPrototype();
				return basicGetPortPrototype();
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				if (resolve) return getTargetDataPrototype();
				return basicGetTargetDataPrototype();
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
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				getInstanceRef().addAll((Collection<? extends String>)newValue);
				return;
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE:
				setPortPrototype((PortPrototype)newValue);
				return;
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				setTargetDataPrototype((VariableDataPrototype)newValue);
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
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				return;
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE:
				setPortPrototype((PortPrototype)null);
				return;
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				setTargetDataPrototype((VariableDataPrototype)null);
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
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF:
				return !getInstanceRef().isEmpty();
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE:
				return portPrototype != null;
			case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				return targetDataPrototype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (derivedFeatureID) {
				case M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF: return M2Package.IINSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (baseFeatureID) {
				case M2Package.IINSTANCE_REF__INSTANCE_REF: return M2Package.VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableInAtomicSwcInstanceRefImpl
