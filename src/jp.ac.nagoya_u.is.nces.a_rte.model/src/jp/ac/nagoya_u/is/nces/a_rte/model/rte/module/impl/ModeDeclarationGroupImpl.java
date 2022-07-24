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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
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
 * An implementation of the model object '<em><b>Mode Declaration Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeConstant <em>Mode Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeTransitionStatusConstant <em>Mode Transition Status Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeDeclarationGroupImpl extends ModuleReferrableImpl implements ModeDeclarationGroup {
	/**
	 * The cached value of the '{@link #getModeType() <em>Mode Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeType()
	 * @generated
	 * @ordered
	 */
	protected ModeType modeType;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected Type implementationDataType;

	/**
	 * The cached value of the '{@link #getModeConstant() <em>Mode Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> modeConstant;

	/**
	 * The cached value of the '{@link #getModeTransitionStatusConstant() <em>Mode Transition Status Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransitionStatusConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant modeTransitionStatusConstant;

	/**
	 * The cached value of the '{@link #getInitModeConstant() <em>Init Mode Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initModeConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeDeclarationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_DECLARATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getModeType() {
		return modeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeType(ModeType newModeType, NotificationChain msgs) {
		ModeType oldModeType = modeType;
		modeType = newModeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, oldModeType, newModeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeType(ModeType newModeType) {
		if (newModeType != modeType) {
			NotificationChain msgs = null;
			if (modeType != null)
				msgs = ((InternalEObject)modeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, null, msgs);
			if (newModeType != null)
				msgs = ((InternalEObject)newModeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, null, msgs);
			msgs = basicSetModeType(newModeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, newModeType, newModeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getImplementationDataType() {
		if (implementationDataType != null && ((EObject)implementationDataType).eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (Type)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(Type newImplementationDataType) {
		Type oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitModeConstant() {
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitModeConstant(Constant newInitModeConstant, NotificationChain msgs) {
		Constant oldInitModeConstant = initModeConstant;
		initModeConstant = newInitModeConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, oldInitModeConstant, newInitModeConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModeConstant(Constant newInitModeConstant) {
		if (newInitModeConstant != initModeConstant) {
			NotificationChain msgs = null;
			if (initModeConstant != null)
				msgs = ((InternalEObject)initModeConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, null, msgs);
			if (newInitModeConstant != null)
				msgs = ((InternalEObject)newInitModeConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, null, msgs);
			msgs = basicSetInitModeConstant(newInitModeConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, newInitModeConstant, newInitModeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getModeTransitionStatusConstant() {
		return modeTransitionStatusConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeTransitionStatusConstant(Constant newModeTransitionStatusConstant, NotificationChain msgs) {
		Constant oldModeTransitionStatusConstant = modeTransitionStatusConstant;
		modeTransitionStatusConstant = newModeTransitionStatusConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, oldModeTransitionStatusConstant, newModeTransitionStatusConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeTransitionStatusConstant(Constant newModeTransitionStatusConstant) {
		if (newModeTransitionStatusConstant != modeTransitionStatusConstant) {
			NotificationChain msgs = null;
			if (modeTransitionStatusConstant != null)
				msgs = ((InternalEObject)modeTransitionStatusConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			if (newModeTransitionStatusConstant != null)
				msgs = ((InternalEObject)newModeTransitionStatusConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			msgs = basicSetModeTransitionStatusConstant(newModeTransitionStatusConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, newModeTransitionStatusConstant, newModeTransitionStatusConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getModeConstant() {
		if (modeConstant == null) {
			modeConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT);
		}
		return modeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return basicSetModeType(null, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return ((InternalEList<?>)getModeConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return basicSetModeTransitionStatusConstant(null, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return basicSetInitModeConstant(null, msgs);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return getModeType();
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return getModeConstant();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return getModeTransitionStatusConstant();
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return getInitModeConstant();
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				setModeType((ModeType)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				getModeConstant().clear();
				getModeConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)newValue);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				setModeType((ModeType)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				getModeConstant().clear();
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)null);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return modeType != null;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return modeConstant != null && !modeConstant.isEmpty();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return modeTransitionStatusConstant != null;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return initModeConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeDeclarationGroupImpl
