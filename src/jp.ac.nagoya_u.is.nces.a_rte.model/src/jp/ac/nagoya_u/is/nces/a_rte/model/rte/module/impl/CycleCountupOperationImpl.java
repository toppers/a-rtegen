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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cycle Countup Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl#getCounterVariable <em>Counter Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl#getMaxConstant <em>Max Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CycleCountupOperationImpl extends OperationImpl implements CycleCountupOperation {
	/**
	 * The cached value of the '{@link #getCounterVariable() <em>Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable counterVariable;

	/**
	 * The cached value of the '{@link #getMaxConstant() <em>Max Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant maxConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CycleCountupOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CYCLE_COUNTUP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCounterVariable() {
		if (counterVariable != null && ((EObject)counterVariable).eIsProxy()) {
			InternalEObject oldCounterVariable = (InternalEObject)counterVariable;
			counterVariable = (GlobalVariable)eResolveProxy(oldCounterVariable);
			if (counterVariable != oldCounterVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE, oldCounterVariable, counterVariable));
			}
		}
		return counterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetCounterVariable() {
		return counterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterVariable(GlobalVariable newCounterVariable) {
		GlobalVariable oldCounterVariable = counterVariable;
		counterVariable = newCounterVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE, oldCounterVariable, counterVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMaxConstant() {
		if (maxConstant != null && ((EObject)maxConstant).eIsProxy()) {
			InternalEObject oldMaxConstant = (InternalEObject)maxConstant;
			maxConstant = (Constant)eResolveProxy(oldMaxConstant);
			if (maxConstant != oldMaxConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT, oldMaxConstant, maxConstant));
			}
		}
		return maxConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMaxConstant() {
		return maxConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConstant(Constant newMaxConstant) {
		Constant oldMaxConstant = maxConstant;
		maxConstant = newMaxConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT, oldMaxConstant, maxConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE:
				if (resolve) return getCounterVariable();
				return basicGetCounterVariable();
			case ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT:
				if (resolve) return getMaxConstant();
				return basicGetMaxConstant();
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
			case ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE:
				setCounterVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT:
				setMaxConstant((Constant)newValue);
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
			case ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE:
				setCounterVariable((GlobalVariable)null);
				return;
			case ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT:
				setMaxConstant((Constant)null);
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
			case ModulePackage.CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE:
				return counterVariable != null;
			case ModulePackage.CYCLE_COUNTUP_OPERATION__MAX_CONSTANT:
				return maxConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //CycleCountupOperationImpl
