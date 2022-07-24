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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Internal Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getFunctionMacro <em>Function Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getComProxyFunctionTableGroup <em>Com Proxy Function Table Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getComSignalApiWrapperGroup <em>Com Signal Api Wrapper Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getSchmApiGroup <em>Schm Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteInternalHeaderImpl extends HeaderFileImpl implements RteInternalHeader {
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
	 * The cached value of the '{@link #getGlobalVariableGroup() <em>Global Variable Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariableFileContentsGroup> globalVariableGroup;

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
	 * The cached value of the '{@link #getBswSchedulableEntityGroup() <em>Bsw Schedulable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswSchedulableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<BswSchedulableEntityFileContentsGroup> bswSchedulableEntityGroup;

	/**
	 * The cached value of the '{@link #getRteCoreStartApiImpl() <em>Rte Core Start Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 * @ordered
	 */
	protected RteCoreStartApiImpl rteCoreStartApiImpl;

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
	 * The cached value of the '{@link #getSchmCoreInitApiImpl() <em>Schm Core Init Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 * @ordered
	 */
	protected SchmCoreInitApiImpl schmCoreInitApiImpl;

	/**
	 * The cached value of the '{@link #getFunctionMacro() <em>Function Macro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMacro()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionMacro> functionMacro;

	/**
	 * The cached value of the '{@link #getComProxyFunctionTableGroup() <em>Com Proxy Function Table Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunctionTableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComProxyFunctionTableFileContentsGroup> comProxyFunctionTableGroup;

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
	 * The cached value of the '{@link #getModeType() <em>Mode Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeType> modeType;

	/**
	 * The cached value of the '{@link #getModeDeclarationGroup() <em>Mode Declaration Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclarationGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroup> modeDeclarationGroup;

	/**
	 * The cached value of the '{@link #getModeMachineInstance() <em>Mode Machine Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMachineInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeMachineInstance> modeMachineInstance;

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
	 * The cached value of the '{@link #getSchmApiGroup() <em>Schm Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmApiFileContentsGroup> schmApiGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteInternalHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_INTERNAL_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_INTERNAL_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableFileContentsGroup>(GlobalVariableFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunctionFileContentsGroup> getTrustedFunctionGroup() {
		if (trustedFunctionGroup == null) {
			trustedFunctionGroup = new EObjectContainmentEList<TrustedFunctionFileContentsGroup>(TrustedFunctionFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP);
		}
		return trustedFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswSchedulableEntityFileContentsGroup> getBswSchedulableEntityGroup() {
		if (bswSchedulableEntityGroup == null) {
			bswSchedulableEntityGroup = new EObjectContainmentEList<BswSchedulableEntityFileContentsGroup>(BswSchedulableEntityFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP);
		}
		return bswSchedulableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl getRteCoreStartApiImpl() {
		if (rteCoreStartApiImpl != null && ((EObject)rteCoreStartApiImpl).eIsProxy()) {
			InternalEObject oldRteCoreStartApiImpl = (InternalEObject)rteCoreStartApiImpl;
			rteCoreStartApiImpl = (RteCoreStartApiImpl)eResolveProxy(oldRteCoreStartApiImpl);
			if (rteCoreStartApiImpl != oldRteCoreStartApiImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL, oldRteCoreStartApiImpl, rteCoreStartApiImpl));
			}
		}
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl basicGetRteCoreStartApiImpl() {
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCoreStartApiImpl(RteCoreStartApiImpl newRteCoreStartApiImpl) {
		RteCoreStartApiImpl oldRteCoreStartApiImpl = rteCoreStartApiImpl;
		rteCoreStartApiImpl = newRteCoreStartApiImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL, oldRteCoreStartApiImpl, rteCoreStartApiImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntityFileContentsGroup> getDependentExecutableEntityGroup() {
		if (dependentExecutableEntityGroup == null) {
			dependentExecutableEntityGroup = new EObjectContainmentEList<ExecutableEntityFileContentsGroup>(ExecutableEntityFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		}
		return dependentExecutableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl getSchmCoreInitApiImpl() {
		if (schmCoreInitApiImpl != null && ((EObject)schmCoreInitApiImpl).eIsProxy()) {
			InternalEObject oldSchmCoreInitApiImpl = (InternalEObject)schmCoreInitApiImpl;
			schmCoreInitApiImpl = (SchmCoreInitApiImpl)eResolveProxy(oldSchmCoreInitApiImpl);
			if (schmCoreInitApiImpl != oldSchmCoreInitApiImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL, oldSchmCoreInitApiImpl, schmCoreInitApiImpl));
			}
		}
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl basicGetSchmCoreInitApiImpl() {
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmCoreInitApiImpl(SchmCoreInitApiImpl newSchmCoreInitApiImpl) {
		SchmCoreInitApiImpl oldSchmCoreInitApiImpl = schmCoreInitApiImpl;
		schmCoreInitApiImpl = newSchmCoreInitApiImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL, oldSchmCoreInitApiImpl, schmCoreInitApiImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionMacro> getFunctionMacro() {
		if (functionMacro == null) {
			functionMacro = new EObjectContainmentEList<FunctionMacro>(FunctionMacro.class, this, ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO);
		}
		return functionMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComProxyFunctionTableFileContentsGroup> getComProxyFunctionTableGroup() {
		if (comProxyFunctionTableGroup == null) {
			comProxyFunctionTableGroup = new EObjectContainmentEList<ComProxyFunctionTableFileContentsGroup>(ComProxyFunctionTableFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP);
		}
		return comProxyFunctionTableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComSignalApiWrapperFileContentsGroup> getComSignalApiWrapperGroup() {
		if (comSignalApiWrapperGroup == null) {
			comSignalApiWrapperGroup = new EObjectContainmentEList<ComSignalApiWrapperFileContentsGroup>(ComSignalApiWrapperFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP);
		}
		return comSignalApiWrapperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeType> getModeType() {
		if (modeType == null) {
			modeType = new EObjectResolvingEList<ModeType>(ModeType.class, this, ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE);
		}
		return modeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroup> getModeDeclarationGroup() {
		if (modeDeclarationGroup == null) {
			modeDeclarationGroup = new EObjectResolvingEList<ModeDeclarationGroup>(ModeDeclarationGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP);
		}
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeMachineInstance> getModeMachineInstance() {
		if (modeMachineInstance == null) {
			modeMachineInstance = new EObjectResolvingEList<ModeMachineInstance>(ModeMachineInstance.class, this, ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE);
		}
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiFileContentsGroup> getRteApiGroup() {
		if (rteApiGroup == null) {
			rteApiGroup = new EObjectContainmentEList<RteApiFileContentsGroup>(RteApiFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP);
		}
		return rteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmApiFileContentsGroup> getSchmApiGroup() {
		if (schmApiGroup == null) {
			schmApiGroup = new EObjectContainmentEList<SchmApiFileContentsGroup>(SchmApiFileContentsGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP);
		}
		return schmApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return ((InternalEList<?>)getTrustedFunctionGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getBswSchedulableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getDependentExecutableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
				return ((InternalEList<?>)getFunctionMacro()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
				return ((InternalEList<?>)getComProxyFunctionTableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
				return ((InternalEList<?>)getComSignalApiWrapperGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
				return ((InternalEList<?>)getRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
				return ((InternalEList<?>)getSchmApiGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				return getConstant();
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return getTrustedFunctionGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return getBswSchedulableEntityGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				if (resolve) return getRteCoreStartApiImpl();
				return basicGetRteCoreStartApiImpl();
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return getDependentExecutableEntityGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				if (resolve) return getSchmCoreInitApiImpl();
				return basicGetSchmCoreInitApiImpl();
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
				return getFunctionMacro();
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
				return getComProxyFunctionTableGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
				return getComSignalApiWrapperGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE:
				return getModeType();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP:
				return getModeDeclarationGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE:
				return getModeMachineInstance();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
				return getRteApiGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
				return getSchmApiGroup();
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				getTrustedFunctionGroup().addAll((Collection<? extends TrustedFunctionFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				getBswSchedulableEntityGroup().addAll((Collection<? extends BswSchedulableEntityFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				getDependentExecutableEntityGroup().addAll((Collection<? extends ExecutableEntityFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
				getFunctionMacro().clear();
				getFunctionMacro().addAll((Collection<? extends FunctionMacro>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
				getComProxyFunctionTableGroup().clear();
				getComProxyFunctionTableGroup().addAll((Collection<? extends ComProxyFunctionTableFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
				getComSignalApiWrapperGroup().clear();
				getComSignalApiWrapperGroup().addAll((Collection<? extends ComSignalApiWrapperFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE:
				getModeType().clear();
				getModeType().addAll((Collection<? extends ModeType>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP:
				getModeDeclarationGroup().clear();
				getModeDeclarationGroup().addAll((Collection<? extends ModeDeclarationGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE:
				getModeMachineInstance().clear();
				getModeMachineInstance().addAll((Collection<? extends ModeMachineInstance>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				getRteApiGroup().addAll((Collection<? extends RteApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
				getSchmApiGroup().clear();
				getSchmApiGroup().addAll((Collection<? extends SchmApiFileContentsGroup>)newValue);
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				getConstant().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)null);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)null);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
				getFunctionMacro().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
				getComProxyFunctionTableGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
				getComSignalApiWrapperGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE:
				getModeType().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP:
				getModeDeclarationGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE:
				getModeMachineInstance().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
				getSchmApiGroup().clear();
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return trustedFunctionGroup != null && !trustedFunctionGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return bswSchedulableEntityGroup != null && !bswSchedulableEntityGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				return rteCoreStartApiImpl != null;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return dependentExecutableEntityGroup != null && !dependentExecutableEntityGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				return schmCoreInitApiImpl != null;
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
				return functionMacro != null && !functionMacro.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
				return comProxyFunctionTableGroup != null && !comProxyFunctionTableGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
				return comSignalApiWrapperGroup != null && !comSignalApiWrapperGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE:
				return modeType != null && !modeType.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP:
				return modeDeclarationGroup != null && !modeDeclarationGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE:
				return modeMachineInstance != null && !modeMachineInstance.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
				return rteApiGroup != null && !rteApiGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
				return schmApiGroup != null && !schmApiGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteInternalHeaderImpl
