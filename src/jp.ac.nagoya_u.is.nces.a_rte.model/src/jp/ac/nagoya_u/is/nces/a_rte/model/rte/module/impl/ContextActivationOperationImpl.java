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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
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
 * An implementation of the model object '<em><b>Context Activation Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl#getExecutableStartOperation <em>Executable Start Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl#getCycleCountupOperation <em>Cycle Countup Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl#getStartOffsetCountupOperation <em>Start Offset Countup Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContextActivationOperationImpl extends OperationImpl implements ContextActivationOperation {
	/**
	 * The cached value of the '{@link #getExecutableStartOperation() <em>Executable Start Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableStartOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableStartOperation> executableStartOperation;

	/**
	 * The cached value of the '{@link #getCycleCountupOperation() <em>Cycle Countup Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCountupOperation()
	 * @generated
	 * @ordered
	 */
	protected CycleCountupOperation cycleCountupOperation;

	/**
	 * The cached value of the '{@link #getStartOffsetCountupOperation() <em>Start Offset Countup Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffsetCountupOperation()
	 * @generated
	 * @ordered
	 */
	protected StartOffsetCountupOperation startOffsetCountupOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextActivationOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CONTEXT_ACTIVATION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableStartOperation> getExecutableStartOperation() {
		if (executableStartOperation == null) {
			executableStartOperation = new EObjectContainmentEList<ExecutableStartOperation>(ExecutableStartOperation.class, this, ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION);
		}
		return executableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCountupOperation getCycleCountupOperation() {
		return cycleCountupOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycleCountupOperation(CycleCountupOperation newCycleCountupOperation, NotificationChain msgs) {
		CycleCountupOperation oldCycleCountupOperation = cycleCountupOperation;
		cycleCountupOperation = newCycleCountupOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION, oldCycleCountupOperation, newCycleCountupOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCountupOperation(CycleCountupOperation newCycleCountupOperation) {
		if (newCycleCountupOperation != cycleCountupOperation) {
			NotificationChain msgs = null;
			if (cycleCountupOperation != null)
				msgs = ((InternalEObject)cycleCountupOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION, null, msgs);
			if (newCycleCountupOperation != null)
				msgs = ((InternalEObject)newCycleCountupOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION, null, msgs);
			msgs = basicSetCycleCountupOperation(newCycleCountupOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION, newCycleCountupOperation, newCycleCountupOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCountupOperation getStartOffsetCountupOperation() {
		return startOffsetCountupOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOffsetCountupOperation(StartOffsetCountupOperation newStartOffsetCountupOperation, NotificationChain msgs) {
		StartOffsetCountupOperation oldStartOffsetCountupOperation = startOffsetCountupOperation;
		startOffsetCountupOperation = newStartOffsetCountupOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION, oldStartOffsetCountupOperation, newStartOffsetCountupOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffsetCountupOperation(StartOffsetCountupOperation newStartOffsetCountupOperation) {
		if (newStartOffsetCountupOperation != startOffsetCountupOperation) {
			NotificationChain msgs = null;
			if (startOffsetCountupOperation != null)
				msgs = ((InternalEObject)startOffsetCountupOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION, null, msgs);
			if (newStartOffsetCountupOperation != null)
				msgs = ((InternalEObject)newStartOffsetCountupOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION, null, msgs);
			msgs = basicSetStartOffsetCountupOperation(newStartOffsetCountupOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION, newStartOffsetCountupOperation, newStartOffsetCountupOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION:
				return ((InternalEList<?>)getExecutableStartOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION:
				return basicSetCycleCountupOperation(null, msgs);
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION:
				return basicSetStartOffsetCountupOperation(null, msgs);
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
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION:
				return getExecutableStartOperation();
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION:
				return getCycleCountupOperation();
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION:
				return getStartOffsetCountupOperation();
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
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				getExecutableStartOperation().addAll((Collection<? extends ExecutableStartOperation>)newValue);
				return;
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION:
				setCycleCountupOperation((CycleCountupOperation)newValue);
				return;
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION:
				setStartOffsetCountupOperation((StartOffsetCountupOperation)newValue);
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
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				return;
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION:
				setCycleCountupOperation((CycleCountupOperation)null);
				return;
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION:
				setStartOffsetCountupOperation((StartOffsetCountupOperation)null);
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
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION:
				return executableStartOperation != null && !executableStartOperation.isEmpty();
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION:
				return cycleCountupOperation != null;
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION:
				return startOffsetCountupOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextActivationOperationImpl
