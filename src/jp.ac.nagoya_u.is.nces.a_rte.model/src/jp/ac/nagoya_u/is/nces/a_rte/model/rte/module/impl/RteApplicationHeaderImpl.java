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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Application Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getHasInlineApi <em>Has Inline Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getDeclarationsRteApiGroup <em>Declarations Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteApplicationHeaderImpl extends HeaderFileImpl implements RteApplicationHeader {
	/**
	 * The default value of the '{@link #getHasInlineApi() <em>Has Inline Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInlineApi()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_INLINE_API_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasInlineApi() <em>Has Inline Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInlineApi()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasInlineApi = HAS_INLINE_API_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceMacro() <em>Source Macro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMacro()
	 * @generated
	 * @ordered
	 */
	protected EList<Macro> sourceMacro;

	/**
	 * The cached value of the '{@link #getGlobalVariableGroup() <em>Global Variable Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariableFileContentsGroup> globalVariableGroup;

	/**
	 * The cached value of the '{@link #getRteApiGroup() <em>Rte Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApiFileContentsGroup> rteApiGroup;

	/**
	 * The cached value of the '{@link #getDeclarationsRteApiGroup() <em>Declarations Rte Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationsRteApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApiFileContentsGroup> declarationsRteApiGroup;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constant;

	/**
	 * The cached value of the '{@link #getDependentExecutableEntityGroup() <em>Dependent Executable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExecutableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntityFileContentsGroup> dependentExecutableEntityGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteApplicationHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_APPLICATION_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasInlineApi() {
		return hasInlineApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInlineApi(Boolean newHasInlineApi) {
		Boolean oldHasInlineApi = hasInlineApi;
		hasInlineApi = newHasInlineApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API, oldHasInlineApi, hasInlineApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getSourceMacro() {
		if (sourceMacro == null) {
			sourceMacro = new EObjectResolvingEList<Macro>(Macro.class, this, ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO);
		}
		return sourceMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableFileContentsGroup>(GlobalVariableFileContentsGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiFileContentsGroup> getRteApiGroup() {
		if (rteApiGroup == null) {
			rteApiGroup = new EObjectContainmentEList<RteApiFileContentsGroup>(RteApiFileContentsGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP);
		}
		return rteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiFileContentsGroup> getDeclarationsRteApiGroup() {
		if (declarationsRteApiGroup == null) {
			declarationsRteApiGroup = new EObjectContainmentEList<RteApiFileContentsGroup>(RteApiFileContentsGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP);
		}
		return declarationsRteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_APPLICATION_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntityFileContentsGroup> getDependentExecutableEntityGroup() {
		if (dependentExecutableEntityGroup == null) {
			dependentExecutableEntityGroup = new EObjectContainmentEList<ExecutableEntityFileContentsGroup>(ExecutableEntityFileContentsGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		}
		return dependentExecutableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return ((InternalEList<?>)getRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return ((InternalEList<?>)getDeclarationsRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getDependentExecutableEntityGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				return getHasInlineApi();
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				return getSourceMacro();
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return getRteApiGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return getDeclarationsRteApiGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				return getConstant();
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return getDependentExecutableEntityGroup();
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				setHasInlineApi((Boolean)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				getSourceMacro().clear();
				getSourceMacro().addAll((Collection<? extends Macro>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				getRteApiGroup().addAll((Collection<? extends RteApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				getDeclarationsRteApiGroup().clear();
				getDeclarationsRteApiGroup().addAll((Collection<? extends RteApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				getDependentExecutableEntityGroup().addAll((Collection<? extends ExecutableEntityFileContentsGroup>)newValue);
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				setHasInlineApi(HAS_INLINE_API_EDEFAULT);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				getSourceMacro().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				getDeclarationsRteApiGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				getConstant().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				return HAS_INLINE_API_EDEFAULT == null ? hasInlineApi != null : !HAS_INLINE_API_EDEFAULT.equals(hasInlineApi);
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				return sourceMacro != null && !sourceMacro.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return rteApiGroup != null && !rteApiGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return declarationsRteApiGroup != null && !declarationsRteApiGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return dependentExecutableEntityGroup != null && !dependentExecutableEntityGroup.isEmpty();
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
		result.append(" (hasInlineApi: ");
		result.append(hasInlineApi);
		result.append(')');
		return result.toString();
	}

} //RteApplicationHeaderImpl
