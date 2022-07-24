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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Ecu Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl#getActivatesOnReceived <em>Activates On Received</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl#getActivatesOnReceiveError <em>Activates On Receive Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalEcuReceiverImpl extends ReceiverImpl implements InternalEcuReceiver {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInComposition source;

	/**
	 * The cached value of the '{@link #getActivatesOnReceived() <em>Activates On Received</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatesOnReceived()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityStarter> activatesOnReceived;
	/**
	 * The cached value of the '{@link #getActivatesOnReceiveError() <em>Activates On Receive Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatesOnReceiveError()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityStarter> activatesOnReceiveError;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalEcuReceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition getSource() {
		if (source != null && ((EObject)source).eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (VariableDataInstanceInComposition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(VariableDataInstanceInComposition newSource) {
		VariableDataInstanceInComposition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityStarter> getActivatesOnReceived() {
		if (activatesOnReceived == null) {
			activatesOnReceived = new EObjectResolvingEList<EntityStarter>(EntityStarter.class, this, InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED);
		}
		return activatesOnReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityStarter> getActivatesOnReceiveError() {
		if (activatesOnReceiveError == null) {
			activatesOnReceiveError = new EObjectResolvingEList<EntityStarter>(EntityStarter.class, this, InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR);
		}
		return activatesOnReceiveError;
	}

	/**
	 * The cached invocation delegate for the '{@link #isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INVALIDATION_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___IS_INVALIDATION_ENABLED).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #getHandleInvalid() <em>Get Handle Invalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_HANDLE_INVALID__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___GET_HANDLE_INVALID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleInvalidEnum getHandleInvalid() {
		try {
			return (HandleInvalidEnum)GET_HANDLE_INVALID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FILTER_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___IS_FILTER_ENABLED).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate GET_FILTER__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___GET_FILTER).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate IS_ALIVE_TIMEOUT_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___IS_ALIVE_TIMEOUT_ENABLED).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_EVENT_SEMANTICS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_RECEIVER___IS_EVENT_SEMANTICS).getInvocationDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED:
				return getActivatesOnReceived();
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR:
				return getActivatesOnReceiveError();
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
			case InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE:
				setSource((VariableDataInstanceInComposition)newValue);
				return;
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED:
				getActivatesOnReceived().clear();
				getActivatesOnReceived().addAll((Collection<? extends EntityStarter>)newValue);
				return;
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR:
				getActivatesOnReceiveError().clear();
				getActivatesOnReceiveError().addAll((Collection<? extends EntityStarter>)newValue);
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
			case InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE:
				setSource((VariableDataInstanceInComposition)null);
				return;
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED:
				getActivatesOnReceived().clear();
				return;
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR:
				getActivatesOnReceiveError().clear();
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
			case InteractionPackage.INTERNAL_ECU_RECEIVER__SOURCE:
				return source != null;
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED:
				return activatesOnReceived != null && !activatesOnReceived.isEmpty();
			case InteractionPackage.INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR:
				return activatesOnReceiveError != null && !activatesOnReceiveError.isEmpty();
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
			case InteractionPackage.INTERNAL_ECU_RECEIVER___IS_INVALIDATION_ENABLED:
				return isInvalidationEnabled();
			case InteractionPackage.INTERNAL_ECU_RECEIVER___GET_HANDLE_INVALID:
				return getHandleInvalid();
			case InteractionPackage.INTERNAL_ECU_RECEIVER___IS_FILTER_ENABLED:
				return isFilterEnabled();
			case InteractionPackage.INTERNAL_ECU_RECEIVER___GET_FILTER:
				return getFilter();
			case InteractionPackage.INTERNAL_ECU_RECEIVER___IS_ALIVE_TIMEOUT_ENABLED:
				return isAliveTimeoutEnabled();
			case InteractionPackage.INTERNAL_ECU_RECEIVER___IS_EVENT_SEMANTICS:
				return isEventSemantics();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalEcuReceiverImpl
