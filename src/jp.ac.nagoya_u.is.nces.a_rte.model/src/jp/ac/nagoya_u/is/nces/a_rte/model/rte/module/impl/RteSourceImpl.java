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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getDependentExternalExecutableEntityGroup <em>Dependent External Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getTaskBodyGroup <em>Task Body Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getComCallbackGroup <em>Com Callback Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSchmApiGroup <em>Schm Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getComSignalApiWrapperGroup <em>Com Signal Api Wrapper Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getComProxyFunctionGroup <em>Com Proxy Function Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteSourceImpl extends SourceFileImpl implements RteSource {
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
	 * The cached value of the '{@link #getDependentExternalExecutableEntityGroup() <em>Dependent External Executable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExternalExecutableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntityFileContentsGroup> dependentExternalExecutableEntityGroup;

	/**
	 * The cached value of the '{@link #getBswSchedulableEntityGroup() <em>Bsw Schedulable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswSchedulableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<BswSchedulableEntityFileContentsGroup> bswSchedulableEntityGroup;

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
	 * The cached value of the '{@link #getRteLifecycleApiGroup() <em>Rte Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteLifecycleApiFileContentsGroup> rteLifecycleApiGroup;

	/**
	 * The cached value of the '{@link #getTaskBodyGroup() <em>Task Body Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBodyGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskBodyFileContentsGroup> taskBodyGroup;

	/**
	 * The cached value of the '{@link #getComCallbackGroup() <em>Com Callback Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallbackGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComCallbackFileContentsGroup> comCallbackGroup;

	/**
	 * The cached value of the '{@link #getTrustedFunctionGroup() <em>Trusted Function Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustedFunctionFileContentsGroup> trustedFunctionGroup;

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
	 * The cached value of the '{@link #getSchmLifecycleApiGroup() <em>Schm Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmLifecycleApiFileContentsGroup> schmLifecycleApiGroup;

	/**
	 * The cached value of the '{@link #getSchmApiGroup() <em>Schm Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmApiFileContentsGroup> schmApiGroup;

	/**
	 * The cached value of the '{@link #getComSignalApiWrapperGroup() <em>Com Signal Api Wrapper Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalApiWrapperGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComSignalApiWrapperFileContentsGroup> comSignalApiWrapperGroup;

	/**
	 * The cached value of the '{@link #getComProxyFunctionGroup() <em>Com Proxy Function Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComProxyFunctionFileContentsGroup> comProxyFunctionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableFileContentsGroup>(GlobalVariableFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntityFileContentsGroup> getDependentExternalExecutableEntityGroup() {
		if (dependentExternalExecutableEntityGroup == null) {
			dependentExternalExecutableEntityGroup = new EObjectContainmentEList<ExecutableEntityFileContentsGroup>(ExecutableEntityFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP);
		}
		return dependentExternalExecutableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswSchedulableEntityFileContentsGroup> getBswSchedulableEntityGroup() {
		if (bswSchedulableEntityGroup == null) {
			bswSchedulableEntityGroup = new EObjectContainmentEList<BswSchedulableEntityFileContentsGroup>(BswSchedulableEntityFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP);
		}
		return bswSchedulableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiFileContentsGroup> getRteApiGroup() {
		if (rteApiGroup == null) {
			rteApiGroup = new EObjectContainmentEList<RteApiFileContentsGroup>(RteApiFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__RTE_API_GROUP);
		}
		return rteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteLifecycleApiFileContentsGroup> getRteLifecycleApiGroup() {
		if (rteLifecycleApiGroup == null) {
			rteLifecycleApiGroup = new EObjectContainmentEList<RteLifecycleApiFileContentsGroup>(RteLifecycleApiFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP);
		}
		return rteLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskBodyFileContentsGroup> getTaskBodyGroup() {
		if (taskBodyGroup == null) {
			taskBodyGroup = new EObjectContainmentEList<TaskBodyFileContentsGroup>(TaskBodyFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__TASK_BODY_GROUP);
		}
		return taskBodyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComCallbackFileContentsGroup> getComCallbackGroup() {
		if (comCallbackGroup == null) {
			comCallbackGroup = new EObjectContainmentEList<ComCallbackFileContentsGroup>(ComCallbackFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP);
		}
		return comCallbackGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunctionFileContentsGroup> getTrustedFunctionGroup() {
		if (trustedFunctionGroup == null) {
			trustedFunctionGroup = new EObjectContainmentEList<TrustedFunctionFileContentsGroup>(TrustedFunctionFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP);
		}
		return trustedFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getSourceMacro() {
		if (sourceMacro == null) {
			sourceMacro = new EObjectResolvingEList<Macro>(Macro.class, this, ModulePackage.RTE_SOURCE__SOURCE_MACRO);
		}
		return sourceMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmLifecycleApiFileContentsGroup> getSchmLifecycleApiGroup() {
		if (schmLifecycleApiGroup == null) {
			schmLifecycleApiGroup = new EObjectContainmentEList<SchmLifecycleApiFileContentsGroup>(SchmLifecycleApiFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP);
		}
		return schmLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmApiFileContentsGroup> getSchmApiGroup() {
		if (schmApiGroup == null) {
			schmApiGroup = new EObjectContainmentEList<SchmApiFileContentsGroup>(SchmApiFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__SCHM_API_GROUP);
		}
		return schmApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComSignalApiWrapperFileContentsGroup> getComSignalApiWrapperGroup() {
		if (comSignalApiWrapperGroup == null) {
			comSignalApiWrapperGroup = new EObjectContainmentEList<ComSignalApiWrapperFileContentsGroup>(ComSignalApiWrapperFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP);
		}
		return comSignalApiWrapperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComProxyFunctionFileContentsGroup> getComProxyFunctionGroup() {
		if (comProxyFunctionGroup == null) {
			comProxyFunctionGroup = new EObjectContainmentEList<ComProxyFunctionFileContentsGroup>(ComProxyFunctionFileContentsGroup.class, this, ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP);
		}
		return comProxyFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getDependentExternalExecutableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getBswSchedulableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return ((InternalEList<?>)getRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getRteLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return ((InternalEList<?>)getTaskBodyGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return ((InternalEList<?>)getComCallbackGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return ((InternalEList<?>)getTrustedFunctionGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getSchmLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return ((InternalEList<?>)getSchmApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
				return ((InternalEList<?>)getComSignalApiWrapperGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
				return ((InternalEList<?>)getComProxyFunctionGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
				return getDependentExternalExecutableEntityGroup();
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return getBswSchedulableEntityGroup();
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return getRteApiGroup();
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return getRteLifecycleApiGroup();
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return getTaskBodyGroup();
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return getComCallbackGroup();
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return getTrustedFunctionGroup();
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				return getSourceMacro();
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return getSchmLifecycleApiGroup();
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return getSchmApiGroup();
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
				return getComSignalApiWrapperGroup();
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
				return getComProxyFunctionGroup();
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
				getDependentExternalExecutableEntityGroup().clear();
				getDependentExternalExecutableEntityGroup().addAll((Collection<? extends ExecutableEntityFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				getBswSchedulableEntityGroup().addAll((Collection<? extends BswSchedulableEntityFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				getRteApiGroup().clear();
				getRteApiGroup().addAll((Collection<? extends RteApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				getRteLifecycleApiGroup().addAll((Collection<? extends RteLifecycleApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				getTaskBodyGroup().clear();
				getTaskBodyGroup().addAll((Collection<? extends TaskBodyFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
				getComCallbackGroup().addAll((Collection<? extends ComCallbackFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				getTrustedFunctionGroup().addAll((Collection<? extends TrustedFunctionFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				getSourceMacro().clear();
				getSourceMacro().addAll((Collection<? extends Macro>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				getSchmLifecycleApiGroup().addAll((Collection<? extends SchmLifecycleApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				getSchmApiGroup().clear();
				getSchmApiGroup().addAll((Collection<? extends SchmApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
				getComSignalApiWrapperGroup().clear();
				getComSignalApiWrapperGroup().addAll((Collection<? extends ComSignalApiWrapperFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
				getComProxyFunctionGroup().clear();
				getComProxyFunctionGroup().addAll((Collection<? extends ComProxyFunctionFileContentsGroup>)newValue);
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
				getDependentExternalExecutableEntityGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				getRteApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				getTaskBodyGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				getSourceMacro().clear();
				return;
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				getSchmApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
				getComSignalApiWrapperGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
				getComProxyFunctionGroup().clear();
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
				return dependentExternalExecutableEntityGroup != null && !dependentExternalExecutableEntityGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return bswSchedulableEntityGroup != null && !bswSchedulableEntityGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return rteApiGroup != null && !rteApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return rteLifecycleApiGroup != null && !rteLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return taskBodyGroup != null && !taskBodyGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return comCallbackGroup != null && !comCallbackGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return trustedFunctionGroup != null && !trustedFunctionGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				return sourceMacro != null && !sourceMacro.isEmpty();
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return schmLifecycleApiGroup != null && !schmLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return schmApiGroup != null && !schmApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
				return comSignalApiWrapperGroup != null && !comSignalApiWrapperGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
				return comProxyFunctionGroup != null && !comProxyFunctionGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteSourceImpl
