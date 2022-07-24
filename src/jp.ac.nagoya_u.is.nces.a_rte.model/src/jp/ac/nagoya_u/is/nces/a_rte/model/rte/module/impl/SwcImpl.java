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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSwcMemoryMapping <em>Swc Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getDependentRunnableEntity <em>Dependent Runnable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getDependentExternalRunnableEntity <em>Dependent External Runnable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getRteApi <em>Rte Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiEnumConstant <em>Api Enum Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiUpperLowerLimitConstant <em>Api Upper Lower Limit Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSrApiInitValueConstant <em>Sr Api Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSrImplInitValueConstant <em>Sr Impl Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSrImplInvalidValueConstant <em>Sr Impl Invalid Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSrFilterConstant <em>Sr Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getCsApiApplicationErrorConstant <em>Cs Api Application Error Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getCsPortArgValueConstant <em>Cs Port Arg Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getCsPortArgValueVariable <em>Cs Port Arg Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getIrvBufferInitValueConstant <em>Irv Buffer Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getIrvBufferVariableSet <em>Irv Buffer Variable Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcImpl extends LogicalCompartmentImpl implements Swc {
	/**
	 * The cached value of the '{@link #getSwcMemoryMapping() <em>Swc Memory Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMemoryMapping> swcMemoryMapping;

	/**
	 * The cached value of the '{@link #getDependentRunnableEntity() <em>Dependent Runnable Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentRunnableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableEntity> dependentRunnableEntity;

	/**
	 * The cached value of the '{@link #getDependentExternalRunnableEntity() <em>Dependent External Runnable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExternalRunnableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableEntity> dependentExternalRunnableEntity;

	/**
	 * The cached value of the '{@link #getRteApi() <em>Rte Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApi()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApi> rteApi;

	/**
	 * The cached value of the '{@link #getApiEnumConstant() <em>Api Enum Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnumConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiEnumConstant;

	/**
	 * The cached value of the '{@link #getApiUpperLowerLimitConstant() <em>Api Upper Lower Limit Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiUpperLowerLimitConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiUpperLowerLimitConstant;

	/**
	 * The cached value of the '{@link #getSrApiInitValueConstant() <em>Sr Api Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrApiInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srApiInitValueConstant;

	/**
	 * The cached value of the '{@link #getSrImplInitValueConstant() <em>Sr Impl Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrImplInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srImplInitValueConstant;

	/**
	 * The cached value of the '{@link #getSrImplInvalidValueConstant() <em>Sr Impl Invalid Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrImplInvalidValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srImplInvalidValueConstant;

	/**
	 * The cached value of the '{@link #getSrFilterConstant() <em>Sr Filter Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFilterConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srFilterConstant;

	/**
	 * The cached value of the '{@link #getCsApiApplicationErrorConstant() <em>Cs Api Application Error Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsApiApplicationErrorConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> csApiApplicationErrorConstant;

	/**
	 * The cached value of the '{@link #getCsPortArgValueConstant() <em>Cs Port Arg Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsPortArgValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> csPortArgValueConstant;

	/**
	 * The cached value of the '{@link #getCsPortArgValueVariable() <em>Cs Port Arg Value Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsPortArgValueVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> csPortArgValueVariable;

	/**
	 * The cached value of the '{@link #getIrvBufferInitValueConstant() <em>Irv Buffer Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrvBufferInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> irvBufferInitValueConstant;

	/**
	 * The cached value of the '{@link #getIrvBufferVariableSet() <em>Irv Buffer Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrvBufferVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> irvBufferVariableSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMemoryMapping> getSwcMemoryMapping() {
		if (swcMemoryMapping == null) {
			swcMemoryMapping = new EObjectContainmentEList<SwcMemoryMapping>(SwcMemoryMapping.class, this, ModulePackage.SWC__SWC_MEMORY_MAPPING);
		}
		return swcMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableEntity> getDependentRunnableEntity() {
		if (dependentRunnableEntity == null) {
			dependentRunnableEntity = new EObjectContainmentEList<RunnableEntity>(RunnableEntity.class, this, ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY);
		}
		return dependentRunnableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableEntity> getDependentExternalRunnableEntity() {
		if (dependentExternalRunnableEntity == null) {
			dependentExternalRunnableEntity = new EObjectResolvingEList<RunnableEntity>(RunnableEntity.class, this, ModulePackage.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY);
		}
		return dependentExternalRunnableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getParent() {
		if (eContainerFeatureID() != ModulePackage.SWC__PARENT) return null;
		return (Partition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Partition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.SWC__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Partition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.SWC__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.PARTITION__SWC, Partition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SWC__PARENT, newParent, newParent));
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
			case ModulePackage.SWC__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Partition)otherEnd, msgs);
			case ModulePackage.SWC__RTE_API:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRteApi()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApi> getRteApi() {
		if (rteApi == null) {
			rteApi = new EObjectContainmentWithInverseEList<RteApi>(RteApi.class, this, ModulePackage.SWC__RTE_API, ModulePackage.RTE_API__PARENT);
		}
		return rteApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiEnumConstant() {
		if (apiEnumConstant == null) {
			apiEnumConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_ENUM_CONSTANT);
		}
		return apiEnumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiUpperLowerLimitConstant() {
		if (apiUpperLowerLimitConstant == null) {
			apiUpperLowerLimitConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT);
		}
		return apiUpperLowerLimitConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrApiInitValueConstant() {
		if (srApiInitValueConstant == null) {
			srApiInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT);
		}
		return srApiInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrImplInitValueConstant() {
		if (srImplInitValueConstant == null) {
			srImplInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT);
		}
		return srImplInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrImplInvalidValueConstant() {
		if (srImplInvalidValueConstant == null) {
			srImplInvalidValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT);
		}
		return srImplInvalidValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrFilterConstant() {
		if (srFilterConstant == null) {
			srFilterConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__SR_FILTER_CONSTANT);
		}
		return srFilterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getCsApiApplicationErrorConstant() {
		if (csApiApplicationErrorConstant == null) {
			csApiApplicationErrorConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT);
		}
		return csApiApplicationErrorConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getCsPortArgValueConstant() {
		if (csPortArgValueConstant == null) {
			csPortArgValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT);
		}
		return csPortArgValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getCsPortArgValueVariable() {
		if (csPortArgValueVariable == null) {
			csPortArgValueVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE);
		}
		return csPortArgValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getIrvBufferInitValueConstant() {
		if (irvBufferInitValueConstant == null) {
			irvBufferInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT);
		}
		return irvBufferInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getIrvBufferVariableSet() {
		if (irvBufferVariableSet == null) {
			irvBufferVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET);
		}
		return irvBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SWC__PARENT:
				return basicSetParent(null, msgs);
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return ((InternalEList<?>)getSwcMemoryMapping()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY:
				return ((InternalEList<?>)getDependentRunnableEntity()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__RTE_API:
				return ((InternalEList<?>)getRteApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return ((InternalEList<?>)getApiEnumConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return ((InternalEList<?>)getApiUpperLowerLimitConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getSrApiInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getSrImplInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT:
				return ((InternalEList<?>)getSrImplInvalidValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__SR_FILTER_CONSTANT:
				return ((InternalEList<?>)getSrFilterConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT:
				return ((InternalEList<?>)getCsApiApplicationErrorConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT:
				return ((InternalEList<?>)getCsPortArgValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE:
				return ((InternalEList<?>)getCsPortArgValueVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getIrvBufferInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET:
				return ((InternalEList<?>)getIrvBufferVariableSet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.SWC__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTITION__SWC, Partition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SWC__PARENT:
				return getParent();
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return getSwcMemoryMapping();
			case ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY:
				return getDependentRunnableEntity();
			case ModulePackage.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY:
				return getDependentExternalRunnableEntity();
			case ModulePackage.SWC__RTE_API:
				return getRteApi();
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return getApiEnumConstant();
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return getApiUpperLowerLimitConstant();
			case ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT:
				return getSrApiInitValueConstant();
			case ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT:
				return getSrImplInitValueConstant();
			case ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT:
				return getSrImplInvalidValueConstant();
			case ModulePackage.SWC__SR_FILTER_CONSTANT:
				return getSrFilterConstant();
			case ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT:
				return getCsApiApplicationErrorConstant();
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT:
				return getCsPortArgValueConstant();
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE:
				return getCsPortArgValueVariable();
			case ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT:
				return getIrvBufferInitValueConstant();
			case ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET:
				return getIrvBufferVariableSet();
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
			case ModulePackage.SWC__PARENT:
				setParent((Partition)newValue);
				return;
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				getSwcMemoryMapping().clear();
				getSwcMemoryMapping().addAll((Collection<? extends SwcMemoryMapping>)newValue);
				return;
			case ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY:
				getDependentRunnableEntity().clear();
				getDependentRunnableEntity().addAll((Collection<? extends RunnableEntity>)newValue);
				return;
			case ModulePackage.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY:
				getDependentExternalRunnableEntity().clear();
				getDependentExternalRunnableEntity().addAll((Collection<? extends RunnableEntity>)newValue);
				return;
			case ModulePackage.SWC__RTE_API:
				getRteApi().clear();
				getRteApi().addAll((Collection<? extends RteApi>)newValue);
				return;
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				getApiEnumConstant().clear();
				getApiEnumConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				getApiUpperLowerLimitConstant().clear();
				getApiUpperLowerLimitConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT:
				getSrApiInitValueConstant().clear();
				getSrApiInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT:
				getSrImplInitValueConstant().clear();
				getSrImplInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT:
				getSrImplInvalidValueConstant().clear();
				getSrImplInvalidValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__SR_FILTER_CONSTANT:
				getSrFilterConstant().clear();
				getSrFilterConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT:
				getCsApiApplicationErrorConstant().clear();
				getCsApiApplicationErrorConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT:
				getCsPortArgValueConstant().clear();
				getCsPortArgValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE:
				getCsPortArgValueVariable().clear();
				getCsPortArgValueVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT:
				getIrvBufferInitValueConstant().clear();
				getIrvBufferInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET:
				getIrvBufferVariableSet().clear();
				getIrvBufferVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
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
			case ModulePackage.SWC__PARENT:
				setParent((Partition)null);
				return;
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				getSwcMemoryMapping().clear();
				return;
			case ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY:
				getDependentRunnableEntity().clear();
				return;
			case ModulePackage.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY:
				getDependentExternalRunnableEntity().clear();
				return;
			case ModulePackage.SWC__RTE_API:
				getRteApi().clear();
				return;
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				getApiEnumConstant().clear();
				return;
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				getApiUpperLowerLimitConstant().clear();
				return;
			case ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT:
				getSrApiInitValueConstant().clear();
				return;
			case ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT:
				getSrImplInitValueConstant().clear();
				return;
			case ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT:
				getSrImplInvalidValueConstant().clear();
				return;
			case ModulePackage.SWC__SR_FILTER_CONSTANT:
				getSrFilterConstant().clear();
				return;
			case ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT:
				getCsApiApplicationErrorConstant().clear();
				return;
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT:
				getCsPortArgValueConstant().clear();
				return;
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE:
				getCsPortArgValueVariable().clear();
				return;
			case ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT:
				getIrvBufferInitValueConstant().clear();
				return;
			case ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET:
				getIrvBufferVariableSet().clear();
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
			case ModulePackage.SWC__PARENT:
				return getParent() != null;
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return swcMemoryMapping != null && !swcMemoryMapping.isEmpty();
			case ModulePackage.SWC__DEPENDENT_RUNNABLE_ENTITY:
				return dependentRunnableEntity != null && !dependentRunnableEntity.isEmpty();
			case ModulePackage.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY:
				return dependentExternalRunnableEntity != null && !dependentExternalRunnableEntity.isEmpty();
			case ModulePackage.SWC__RTE_API:
				return rteApi != null && !rteApi.isEmpty();
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return apiEnumConstant != null && !apiEnumConstant.isEmpty();
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return apiUpperLowerLimitConstant != null && !apiUpperLowerLimitConstant.isEmpty();
			case ModulePackage.SWC__SR_API_INIT_VALUE_CONSTANT:
				return srApiInitValueConstant != null && !srApiInitValueConstant.isEmpty();
			case ModulePackage.SWC__SR_IMPL_INIT_VALUE_CONSTANT:
				return srImplInitValueConstant != null && !srImplInitValueConstant.isEmpty();
			case ModulePackage.SWC__SR_IMPL_INVALID_VALUE_CONSTANT:
				return srImplInvalidValueConstant != null && !srImplInvalidValueConstant.isEmpty();
			case ModulePackage.SWC__SR_FILTER_CONSTANT:
				return srFilterConstant != null && !srFilterConstant.isEmpty();
			case ModulePackage.SWC__CS_API_APPLICATION_ERROR_CONSTANT:
				return csApiApplicationErrorConstant != null && !csApiApplicationErrorConstant.isEmpty();
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_CONSTANT:
				return csPortArgValueConstant != null && !csPortArgValueConstant.isEmpty();
			case ModulePackage.SWC__CS_PORT_ARG_VALUE_VARIABLE:
				return csPortArgValueVariable != null && !csPortArgValueVariable.isEmpty();
			case ModulePackage.SWC__IRV_BUFFER_INIT_VALUE_CONSTANT:
				return irvBufferInitValueConstant != null && !irvBufferInitValueConstant.isEmpty();
			case ModulePackage.SWC__IRV_BUFFER_VARIABLE_SET:
				return irvBufferVariableSet != null && !irvBufferVariableSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwcImpl
