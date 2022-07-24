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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autosar Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getAutosarVariableIref <em>Autosar Variable Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getAutosarVariable <em>Autosar Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getLocalVariable <em>Local Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutosarVariableRefImpl extends M2ObjectImpl implements AutosarVariableRef {
	/**
	 * The cached value of the '{@link #getAutosarVariableIref() <em>Autosar Variable Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosarVariableIref()
	 * @generated
	 * @ordered
	 */
	protected VariableInAtomicSwcTypeInstanceRef autosarVariableIref;

	/**
	 * The cached value of the '{@link #getAutosarVariable() <em>Autosar Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosarVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInSwc autosarVariable;

	/**
	 * The cached value of the '{@link #getLocalVariable() <em>Local Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototype localVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutosarVariableRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.AUTOSAR_VARIABLE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInAtomicSwcTypeInstanceRef getAutosarVariableIref() {
		return autosarVariableIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutosarVariableIref(VariableInAtomicSwcTypeInstanceRef newAutosarVariableIref, NotificationChain msgs) {
		VariableInAtomicSwcTypeInstanceRef oldAutosarVariableIref = autosarVariableIref;
		autosarVariableIref = newAutosarVariableIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, oldAutosarVariableIref, newAutosarVariableIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosarVariableIref(VariableInAtomicSwcTypeInstanceRef newAutosarVariableIref) {
		if (newAutosarVariableIref != autosarVariableIref) {
			NotificationChain msgs = null;
			if (autosarVariableIref != null)
				msgs = ((InternalEObject)autosarVariableIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, null, msgs);
			if (newAutosarVariableIref != null)
				msgs = ((InternalEObject)newAutosarVariableIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, null, msgs);
			msgs = basicSetAutosarVariableIref(newAutosarVariableIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, newAutosarVariableIref, newAutosarVariableIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc getAutosarVariable() {
		if (autosarVariable != null && ((EObject)autosarVariable).eIsProxy()) {
			InternalEObject oldAutosarVariable = (InternalEObject)autosarVariable;
			autosarVariable = (VariableDataInstanceInSwc)eResolveProxy(oldAutosarVariable);
			if (autosarVariable != oldAutosarVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE, oldAutosarVariable, autosarVariable));
			}
		}
		return autosarVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc basicGetAutosarVariable() {
		return autosarVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosarVariable(VariableDataInstanceInSwc newAutosarVariable) {
		VariableDataInstanceInSwc oldAutosarVariable = autosarVariable;
		autosarVariable = newAutosarVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE, oldAutosarVariable, autosarVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype getLocalVariable() {
		if (localVariable != null && ((EObject)localVariable).eIsProxy()) {
			InternalEObject oldLocalVariable = (InternalEObject)localVariable;
			localVariable = (VariableDataPrototype)eResolveProxy(oldLocalVariable);
			if (localVariable != oldLocalVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE, oldLocalVariable, localVariable));
			}
		}
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype basicGetLocalVariable() {
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVariable(VariableDataPrototype newLocalVariable) {
		VariableDataPrototype oldLocalVariable = localVariable;
		localVariable = newLocalVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE, oldLocalVariable, localVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return basicSetAutosarVariableIref(null, msgs);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return getAutosarVariableIref();
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				if (resolve) return getAutosarVariable();
				return basicGetAutosarVariable();
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				if (resolve) return getLocalVariable();
				return basicGetLocalVariable();
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				setAutosarVariableIref((VariableInAtomicSwcTypeInstanceRef)newValue);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				setAutosarVariable((VariableDataInstanceInSwc)newValue);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				setLocalVariable((VariableDataPrototype)newValue);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				setAutosarVariableIref((VariableInAtomicSwcTypeInstanceRef)null);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				setAutosarVariable((VariableDataInstanceInSwc)null);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				setLocalVariable((VariableDataPrototype)null);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return autosarVariableIref != null;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				return autosarVariable != null;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				return localVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AutosarVariableRefImpl
