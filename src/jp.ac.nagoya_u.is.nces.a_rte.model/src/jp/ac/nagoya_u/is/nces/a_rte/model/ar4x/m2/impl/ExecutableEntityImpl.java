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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getCanEnterExclusiveArea <em>Can Enter Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getRunsInsideExclusiveArea <em>Runs Inside Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableEntityImpl extends IdentifiableImpl implements ExecutableEntity {
	/**
	 * The cached value of the '{@link #getCanEnterExclusiveArea() <em>Can Enter Exclusive Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanEnterExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> canEnterExclusiveArea;

	/**
	 * The cached value of the '{@link #getRunsInsideExclusiveArea() <em>Runs Inside Exclusive Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsInsideExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> runsInsideExclusiveArea;

	/**
	 * The cached value of the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected SwAddrMethod swAddrMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.EXECUTABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getCanEnterExclusiveArea() {
		if (canEnterExclusiveArea == null) {
			canEnterExclusiveArea = new EObjectWithInverseResolvingEList.ManyInverse<ExclusiveArea>(ExclusiveArea.class, this, M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA, M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY);
		}
		return canEnterExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getRunsInsideExclusiveArea() {
		if (runsInsideExclusiveArea == null) {
			runsInsideExclusiveArea = new EObjectResolvingEList<ExclusiveArea>(ExclusiveArea.class, this, M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA);
		}
		return runsInsideExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		if (swAddrMethod != null && ((EObject)swAddrMethod).eIsProxy()) {
			InternalEObject oldSwAddrMethod = (InternalEObject)swAddrMethod;
			swAddrMethod = (SwAddrMethod)eResolveProxy(oldSwAddrMethod);
			if (swAddrMethod != oldSwAddrMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
			}
		}
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod basicGetSwAddrMethod() {
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAddrMethod(SwAddrMethod newSwAddrMethod) {
		SwAddrMethod oldSwAddrMethod = swAddrMethod;
		swAddrMethod = newSwAddrMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCanEnterExclusiveArea()).basicAdd(otherEnd, msgs);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return ((InternalEList<?>)getCanEnterExclusiveArea()).basicRemove(otherEnd, msgs);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return getCanEnterExclusiveArea();
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				return getRunsInsideExclusiveArea();
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				if (resolve) return getSwAddrMethod();
				return basicGetSwAddrMethod();
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				getCanEnterExclusiveArea().clear();
				getCanEnterExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				getRunsInsideExclusiveArea().clear();
				getRunsInsideExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)newValue);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				getCanEnterExclusiveArea().clear();
				return;
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				getRunsInsideExclusiveArea().clear();
				return;
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)null);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return canEnterExclusiveArea != null && !canEnterExclusiveArea.isEmpty();
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				return runsInsideExclusiveArea != null && !runsInsideExclusiveArea.isEmpty();
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				return swAddrMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutableEntityImpl
