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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl#getContextPort <em>Context Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableDataInstanceInSwcImpl extends VariableDataInstanceImpl implements VariableDataInstanceInSwc {
	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototype prototype;

	/**
	 * The cached value of the '{@link #getContextPort() <em>Context Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPort()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype contextPort;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDataInstanceInComposition> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInSwcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceId() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		Collections.addAll(instanceRefs, getContextPort().getId(), getPrototype().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype getPrototype() {
		if (prototype != null && ((EObject)prototype).eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (VariableDataPrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(VariableDataPrototype newPrototype) {
		VariableDataPrototype oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE, oldPrototype, prototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getContextPort() {
		if (contextPort != null && ((EObject)contextPort).eIsProxy()) {
			InternalEObject oldContextPort = (InternalEObject)contextPort;
			contextPort = (PortPrototype)eResolveProxy(oldContextPort);
			if (contextPort != oldContextPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, oldContextPort, contextPort));
			}
		}
		return contextPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetContextPort() {
		return contextPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextPort(PortPrototype newContextPort) {
		PortPrototype oldContextPort = contextPort;
		contextPort = newContextPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, oldContextPort, contextPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDataInstanceInComposition> getInstance() {
		if (instance == null) {
			instance = new EObjectWithInverseResolvingEList<VariableDataInstanceInComposition>(VariableDataInstanceInComposition.class, this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE);
		}
		return instance;
	}

	/**
	 * The cached invocation delegate for the '{@link #getTargetShortName() <em>Get Target Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetShortName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TARGET_SHORT_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetShortName() {
		try {
			return (String)GET_TARGET_SHORT_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_EVENT_SEMANTICS__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEventSemantics() {
		try {
			return (Boolean)IS_EVENT_SEMANTICS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum getSwImplPolicy() {
		try {
			return (SwImplPolicyEnum)GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getBaseType() <em>Get Base Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_BASE_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType getBaseType() {
		try {
			return (SwBaseType)GET_BASE_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInvalidValue() <em>Get Invalid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INVALID_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInvalidValue() {
		try {
			return (ValueSpecification)GET_INVALID_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwAddrMethod() <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_ADDR_METHOD__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		try {
			return (SwAddrMethod)GET_SW_ADDR_METHOD__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwAlignment() <em>Get Sw Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_ALIGNMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwAlignment() {
		try {
			return (String)GET_SW_ALIGNMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getApplicationDataType() <em>Get Application Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataType getApplicationDataType() {
		try {
			return (ApplicationDataType)GET_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataType() <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType() {
		try {
			return (ImplementationDataType)GET_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getOwnerAtomicSwc() <em>Get Owner Atomic Swc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerAtomicSwc()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_OWNER_ATOMIC_SWC__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSwComponentType getOwnerAtomicSwc() {
		try {
			return (AtomicSwComponentType)GET_OWNER_ATOMIC_SWC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstance()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT:
				if (resolve) return getContextPort();
				return basicGetContextPort();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				return getInstance();
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE:
				setPrototype((VariableDataPrototype)newValue);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT:
				setContextPort((PortPrototype)newValue);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends VariableDataInstanceInComposition>)newValue);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE:
				setPrototype((VariableDataPrototype)null);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT:
				setContextPort((PortPrototype)null);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				getInstance().clear();
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE:
				return prototype != null;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT:
				return contextPort != null;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME:
				return getTargetShortName();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS:
				return isEventSemantics();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY:
				return getSwImplPolicy();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE:
				return getBaseType();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE:
				return getInvalidValue();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD:
				return getSwAddrMethod();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT:
				return getSwAlignment();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE:
				return getApplicationDataType();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE:
				return getImplementationDataType();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC:
				return getOwnerAtomicSwc();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataInstanceInSwcImpl
