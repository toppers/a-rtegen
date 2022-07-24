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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc Internal Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getDataTypeMapping <em>Data Type Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getExclusiveArea <em>Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getPortApiOption <em>Port Api Option</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getIncludedDataTypeSet <em>Included Data Type Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl#getExplicitInterRunnableVariable <em>Explicit Inter Runnable Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcInternalBehaviorImpl extends IdentifiableImpl implements SwcInternalBehavior {
	/**
	 * The cached value of the '{@link #getDataTypeMapping() <em>Data Type Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeMappingSet> dataTypeMapping;

	/**
	 * The cached value of the '{@link #getExclusiveArea() <em>Exclusive Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> exclusiveArea;

	/**
	 * The cached value of the '{@link #getRunnable() <em>Runnable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableEntity> runnable;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEvent> event;

	/**
	 * The cached value of the '{@link #getPortApiOption() <em>Port Api Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortApiOption()
	 * @generated
	 * @ordered
	 */
	protected EList<PortApiOption> portApiOption;

	/**
	 * The cached value of the '{@link #getIncludedDataTypeSet() <em>Included Data Type Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedDataTypeSet()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedDataTypeSet> includedDataTypeSet;

	/**
	 * The cached value of the '{@link #getExplicitInterRunnableVariable() <em>Explicit Inter Runnable Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitInterRunnableVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDataPrototype> explicitInterRunnableVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcInternalBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SWC_INTERNAL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableEntity> getRunnable() {
		if (runnable == null) {
			runnable = new EObjectContainmentWithInverseEList<RunnableEntity>(RunnableEntity.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE, M2Package.RUNNABLE_ENTITY__PARENT);
		}
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<RteEvent>(RteEvent.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeMappingSet> getDataTypeMapping() {
		if (dataTypeMapping == null) {
			dataTypeMapping = new EObjectResolvingEList<DataTypeMappingSet>(DataTypeMappingSet.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING);
		}
		return dataTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getExclusiveArea() {
		if (exclusiveArea == null) {
			exclusiveArea = new EObjectContainmentWithInverseEList<ExclusiveArea>(ExclusiveArea.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, M2Package.EXCLUSIVE_AREA__PARENT);
		}
		return exclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortApiOption> getPortApiOption() {
		if (portApiOption == null) {
			portApiOption = new EObjectContainmentEList<PortApiOption>(PortApiOption.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION);
		}
		return portApiOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedDataTypeSet> getIncludedDataTypeSet() {
		if (includedDataTypeSet == null) {
			includedDataTypeSet = new EObjectContainmentEList<IncludedDataTypeSet>(IncludedDataTypeSet.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET);
		}
		return includedDataTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSwComponentType getParent() {
		if (eContainerFeatureID() != M2Package.SWC_INTERNAL_BEHAVIOR__PARENT) return null;
		return (AtomicSwComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AtomicSwComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.SWC_INTERNAL_BEHAVIOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AtomicSwComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.SWC_INTERNAL_BEHAVIOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR, AtomicSwComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_INTERNAL_BEHAVIOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDataPrototype> getExplicitInterRunnableVariable() {
		if (explicitInterRunnableVariable == null) {
			explicitInterRunnableVariable = new EObjectContainmentEList<VariableDataPrototype>(VariableDataPrototype.class, this, M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE);
		}
		return explicitInterRunnableVariable;
	}

	/**
	 * The cached invocation delegate for the '{@link #getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Referencer Included Data Type Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_REFERENCER_INCLUDED_DATA_TYPE_SETS_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ApplicationDataType dataType) {
		try {
			return (EList<IncludedDataTypeSet>)GET_REFERENCER_INCLUDED_DATA_TYPE_SETS_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{dataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Get Referencer Included Data Type Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_REFERENCER_INCLUDED_DATA_TYPE_SETS_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ImplementationDataType dataType) {
		try {
			return (EList<IncludedDataTypeSet>)GET_REFERENCER_INCLUDED_DATA_TYPE_SETS_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{dataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingDataTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_DATA_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_USING_DATA_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AutosarDataType> getUsingDataTypes() {
		try {
			return (EList<AutosarDataType>)GET_USING_DATA_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPE_AUTOSAR_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType(AutosarDataType dataType) {
		try {
			return (ImplementationDataType)GET_IMPLEMENTATION_DATA_TYPE_AUTOSAR_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{dataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType(ApplicationDataType applicationDataType) {
		try {
			return (ImplementationDataType)GET_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{applicationDataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPES_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType) {
		try {
			return (EList<ImplementationDataType>)GET_IMPLEMENTATION_DATA_TYPES_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{applicationDataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExclusiveArea()).basicAdd(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunnable()).basicAdd(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AtomicSwComponentType)otherEnd, msgs);
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return ((InternalEList<?>)getExclusiveArea()).basicRemove(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				return ((InternalEList<?>)getRunnable()).basicRemove(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
				return ((InternalEList<?>)getPortApiOption()).basicRemove(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
				return ((InternalEList<?>)getIncludedDataTypeSet()).basicRemove(otherEnd, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
				return ((InternalEList<?>)getExplicitInterRunnableVariable()).basicRemove(otherEnd, msgs);
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR, AtomicSwComponentType.class, msgs);
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				return getDataTypeMapping();
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return getExclusiveArea();
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				return getRunnable();
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
				return getEvent();
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
				return getPortApiOption();
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
				return getIncludedDataTypeSet();
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				return getParent();
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
				return getExplicitInterRunnableVariable();
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				getDataTypeMapping().clear();
				getDataTypeMapping().addAll((Collection<? extends DataTypeMappingSet>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				getExclusiveArea().clear();
				getExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				getRunnable().clear();
				getRunnable().addAll((Collection<? extends RunnableEntity>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends RteEvent>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
				getPortApiOption().clear();
				getPortApiOption().addAll((Collection<? extends PortApiOption>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
				getIncludedDataTypeSet().clear();
				getIncludedDataTypeSet().addAll((Collection<? extends IncludedDataTypeSet>)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				setParent((AtomicSwComponentType)newValue);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
				getExplicitInterRunnableVariable().clear();
				getExplicitInterRunnableVariable().addAll((Collection<? extends VariableDataPrototype>)newValue);
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				getDataTypeMapping().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				getExclusiveArea().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				getRunnable().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
				getEvent().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
				getPortApiOption().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
				getIncludedDataTypeSet().clear();
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				setParent((AtomicSwComponentType)null);
				return;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
				getExplicitInterRunnableVariable().clear();
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
			case M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				return dataTypeMapping != null && !dataTypeMapping.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return exclusiveArea != null && !exclusiveArea.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
				return runnable != null && !runnable.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
				return event != null && !event.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
				return portApiOption != null && !portApiOption.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
				return includedDataTypeSet != null && !includedDataTypeSet.isEmpty();
			case M2Package.SWC_INTERNAL_BEHAVIOR__PARENT:
				return getParent() != null;
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
				return explicitInterRunnableVariable != null && !explicitInterRunnableVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InternalBehavior.class) {
			switch (derivedFeatureID) {
				case M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING: return M2Package.INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING;
				case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA: return M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InternalBehavior.class) {
			switch (baseFeatureID) {
				case M2Package.INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING: return M2Package.SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING;
				case M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA: return M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__APPLICATIONDATATYPE:
				return getReferencerIncludedDataTypeSets((ApplicationDataType)arguments.get(0));
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__IMPLEMENTATIONDATATYPE:
				return getReferencerIncludedDataTypeSets((ImplementationDataType)arguments.get(0));
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_USING_DATA_TYPES:
				return getUsingDataTypes();
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE:
				return getImplementationDataType((AutosarDataType)arguments.get(0));
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__APPLICATIONDATATYPE:
				return getImplementationDataType((ApplicationDataType)arguments.get(0));
			case M2Package.SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE:
				return getImplementationDataTypes((ApplicationDataType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SwcInternalBehaviorImpl
