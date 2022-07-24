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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RVariable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl#getContextRPort <em>Context RPort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RVariableDataInstanceInSwcImpl extends VariableDataInstanceInSwcImpl implements RVariableDataInstanceInSwc {
	/**
	 * The cached setting delegate for the '{@link #getContextRPort() <em>Context RPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTEXT_RPORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RVariableDataInstanceInSwcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototype getContextRPort() {
		return (RPortPrototype)CONTEXT_RPORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The cached invocation delegate for the '{@link #isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FILTER_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterEnabled() {
		try {
			return (Boolean)IS_FILTER_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getFilter() <em>Get Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_FILTER__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilter getFilter() {
		try {
			return (DataFilter)GET_FILTER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isAliveTimeoutEnabled() <em>Is Alive Timeout Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAliveTimeoutEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ALIVE_TIMEOUT_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAliveTimeoutEnabled() {
		try {
			return (Boolean)IS_ALIVE_TIMEOUT_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INVALIDATION_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvalidationEnabled() {
		try {
			return (Boolean)IS_INVALIDATION_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInvalidationKeep() <em>Is Invalidation Keep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidationKeep()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INVALIDATION_KEEP__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_KEEP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvalidationKeep() {
		try {
			return (Boolean)IS_INVALIDATION_KEEP__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInvalidationReplace() <em>Is Invalidation Replace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidationReplace()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INVALIDATION_REPLACE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_REPLACE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvalidationReplace() {
		try {
			return (Boolean)IS_INVALIDATION_REPLACE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInvalidationPolicy() <em>Get Invalidation Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INVALIDATION_POLICY__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidationPolicy getInvalidationPolicy() {
		try {
			return (InvalidationPolicy)GET_INVALIDATION_POLICY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitValue() <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INIT_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInitValue() {
		try {
			return (ValueSpecification)GET_INIT_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getQueueLength() <em>Get Queue Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_QUEUE_LENGTH__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQueueLength() {
		try {
			return (Integer)GET_QUEUE_LENGTH__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getComSpec() <em>Get Com Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSpec()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_COM_SPEC__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverComSpec getComSpec() {
		try {
			return (ReceiverComSpec)GET_COM_SPEC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getRelatedDataReceivedEvent() <em>Get Related Data Received Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDataReceivedEvent()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_RELATED_DATA_RECEIVED_EVENT__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVED_EVENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataReceivedEvent> getRelatedDataReceivedEvent() {
		try {
			return (EList<DataReceivedEvent>)GET_RELATED_DATA_RECEIVED_EVENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getRelatedDataReceiveErrorEvent() <em>Get Related Data Receive Error Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDataReceiveErrorEvent()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_RELATED_DATA_RECEIVE_ERROR_EVENT__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVE_ERROR_EVENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataReceiveErrorEvent> getRelatedDataReceiveErrorEvent() {
		try {
			return (EList<DataReceiveErrorEvent>)GET_RELATED_DATA_RECEIVE_ERROR_EVENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT:
				return getContextRPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT:
				return CONTEXT_RPORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED:
				return isFilterEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER:
				return getFilter();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED:
				return isAliveTimeoutEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED:
				return isInvalidationEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_KEEP:
				return isInvalidationKeep();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_REPLACE:
				return isInvalidationReplace();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY:
				return getInvalidationPolicy();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE:
				return getInitValue();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH:
				return getQueueLength();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC:
				return getComSpec();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVED_EVENT:
				return getRelatedDataReceivedEvent();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVE_ERROR_EVENT:
				return getRelatedDataReceiveErrorEvent();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RVariableDataInstanceInSwcImpl
