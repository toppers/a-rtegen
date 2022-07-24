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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getInitValueConstant <em>Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getInitAtDefinition <em>Init At Definition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getInitWithConstantValue <em>Init With Constant Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getHasConst <em>Has Const</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl#getHasStatic <em>Has Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVariableImpl extends VariableImpl implements GlobalVariable {
	/**
	 * The cached value of the '{@link #getInitValueConstant() <em>Init Value Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initValueConstant;

	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapping memoryMapping;

	/**
	 * The default value of the '{@link #getInitAtDefinition() <em>Init At Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitAtDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INIT_AT_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitAtDefinition() <em>Init At Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitAtDefinition()
	 * @generated
	 * @ordered
	 */
	protected Boolean initAtDefinition = INIT_AT_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitWithConstantValue() <em>Init With Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitWithConstantValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INIT_WITH_CONSTANT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitWithConstantValue() <em>Init With Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitWithConstantValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean initWithConstantValue = INIT_WITH_CONSTANT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasConst() <em>Has Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasConst() <em>Has Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasConst = HAS_CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasStatic() <em>Has Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasStatic() <em>Has Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasStatic = HAS_STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.GLOBAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitValueConstant() {
		if (initValueConstant != null && ((EObject)initValueConstant).eIsProxy()) {
			InternalEObject oldInitValueConstant = (InternalEObject)initValueConstant;
			initValueConstant = (Constant)eResolveProxy(oldInitValueConstant);
			if (initValueConstant != oldInitValueConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
			}
		}
		return initValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInitValueConstant() {
		return initValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValueConstant(Constant newInitValueConstant) {
		Constant oldInitValueConstant = initValueConstant;
		initValueConstant = newInitValueConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping getMemoryMapping() {
		if (memoryMapping != null && ((EObject)memoryMapping).eIsProxy()) {
			InternalEObject oldMemoryMapping = (InternalEObject)memoryMapping;
			memoryMapping = (MemoryMapping)eResolveProxy(oldMemoryMapping);
			if (memoryMapping != oldMemoryMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
			}
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping basicGetMemoryMapping() {
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapping(MemoryMapping newMemoryMapping) {
		MemoryMapping oldMemoryMapping = memoryMapping;
		memoryMapping = newMemoryMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInitAtDefinition() {
		return initAtDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitAtDefinition(Boolean newInitAtDefinition) {
		Boolean oldInitAtDefinition = initAtDefinition;
		initAtDefinition = newInitAtDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__INIT_AT_DEFINITION, oldInitAtDefinition, initAtDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInitWithConstantValue() {
		return initWithConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitWithConstantValue(Boolean newInitWithConstantValue) {
		Boolean oldInitWithConstantValue = initWithConstantValue;
		initWithConstantValue = newInitWithConstantValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE, oldInitWithConstantValue, initWithConstantValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasConst() {
		return hasConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConst(Boolean newHasConst) {
		Boolean oldHasConst = hasConst;
		hasConst = newHasConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__HAS_CONST, oldHasConst, hasConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasStatic() {
		return hasStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasStatic(Boolean newHasStatic) {
		Boolean oldHasStatic = hasStatic;
		hasStatic = newHasStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE__HAS_STATIC, oldHasStatic, hasStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT:
				if (resolve) return getInitValueConstant();
				return basicGetInitValueConstant();
			case ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING:
				if (resolve) return getMemoryMapping();
				return basicGetMemoryMapping();
			case ModulePackage.GLOBAL_VARIABLE__INIT_AT_DEFINITION:
				return getInitAtDefinition();
			case ModulePackage.GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE:
				return getInitWithConstantValue();
			case ModulePackage.GLOBAL_VARIABLE__HAS_CONST:
				return getHasConst();
			case ModulePackage.GLOBAL_VARIABLE__HAS_STATIC:
				return getHasStatic();
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
			case ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE__INIT_AT_DEFINITION:
				setInitAtDefinition((Boolean)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE:
				setInitWithConstantValue((Boolean)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE__HAS_CONST:
				setHasConst((Boolean)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE__HAS_STATIC:
				setHasStatic((Boolean)newValue);
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
			case ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)null);
				return;
			case ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)null);
				return;
			case ModulePackage.GLOBAL_VARIABLE__INIT_AT_DEFINITION:
				setInitAtDefinition(INIT_AT_DEFINITION_EDEFAULT);
				return;
			case ModulePackage.GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE:
				setInitWithConstantValue(INIT_WITH_CONSTANT_VALUE_EDEFAULT);
				return;
			case ModulePackage.GLOBAL_VARIABLE__HAS_CONST:
				setHasConst(HAS_CONST_EDEFAULT);
				return;
			case ModulePackage.GLOBAL_VARIABLE__HAS_STATIC:
				setHasStatic(HAS_STATIC_EDEFAULT);
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
			case ModulePackage.GLOBAL_VARIABLE__INIT_VALUE_CONSTANT:
				return initValueConstant != null;
			case ModulePackage.GLOBAL_VARIABLE__MEMORY_MAPPING:
				return memoryMapping != null;
			case ModulePackage.GLOBAL_VARIABLE__INIT_AT_DEFINITION:
				return INIT_AT_DEFINITION_EDEFAULT == null ? initAtDefinition != null : !INIT_AT_DEFINITION_EDEFAULT.equals(initAtDefinition);
			case ModulePackage.GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE:
				return INIT_WITH_CONSTANT_VALUE_EDEFAULT == null ? initWithConstantValue != null : !INIT_WITH_CONSTANT_VALUE_EDEFAULT.equals(initWithConstantValue);
			case ModulePackage.GLOBAL_VARIABLE__HAS_CONST:
				return HAS_CONST_EDEFAULT == null ? hasConst != null : !HAS_CONST_EDEFAULT.equals(hasConst);
			case ModulePackage.GLOBAL_VARIABLE__HAS_STATIC:
				return HAS_STATIC_EDEFAULT == null ? hasStatic != null : !HAS_STATIC_EDEFAULT.equals(hasStatic);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initAtDefinition: ");
		result.append(initAtDefinition);
		result.append(", initWithConstantValue: ");
		result.append(initWithConstantValue);
		result.append(", hasConst: ");
		result.append(hasConst);
		result.append(", hasStatic: ");
		result.append(hasStatic);
		result.append(')');
		return result.toString();
	}

} //GlobalVariableImpl
