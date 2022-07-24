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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getSendInteraction <em>Send Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getValueBufferImplementation <em>Value Buffer Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getFilterBufferImplementation <em>Filter Buffer Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveInteractionImpl extends InteractionImpl implements ReceiveInteraction {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Receiver> receiver;

	/**
	 * The cached value of the '{@link #getSendInteraction() <em>Send Interaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<SendInteraction> sendInteraction;

	/**
	 * The cached value of the '{@link #getValueBufferImplementation() <em>Value Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBufferImplementation()
	 * @generated
	 * @ordered
	 */
	protected ValueBufferImplementation valueBufferImplementation;

	/**
	 * The cached value of the '{@link #getFilterBufferImplementation() <em>Filter Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterBufferImplementation()
	 * @generated
	 * @ordered
	 */
	protected FilterBufferImplementation filterBufferImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.RECEIVE_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receiver> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectWithInverseResolvingEList.ManyInverse<Receiver>(Receiver.class, this, InteractionPackage.RECEIVE_INTERACTION__RECEIVER, InteractionPackage.RECEIVER__RECEIVE_INTERACTION);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendInteraction> getSendInteraction() {
		if (sendInteraction == null) {
			sendInteraction = new EObjectWithInverseResolvingEList<SendInteraction>(SendInteraction.class, this, InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION, InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION);
		}
		return sendInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBufferImplementation getValueBufferImplementation() {
		return valueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBufferImplementation(ValueBufferImplementation newValueBufferImplementation, NotificationChain msgs) {
		ValueBufferImplementation oldValueBufferImplementation = valueBufferImplementation;
		valueBufferImplementation = newValueBufferImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, oldValueBufferImplementation, newValueBufferImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBufferImplementation(ValueBufferImplementation newValueBufferImplementation) {
		if (newValueBufferImplementation != valueBufferImplementation) {
			NotificationChain msgs = null;
			if (valueBufferImplementation != null)
				msgs = ((InternalEObject)valueBufferImplementation).eInverseRemove(this, InteractionPackage.VALUE_BUFFER_IMPLEMENTATION__PARENT, ValueBufferImplementation.class, msgs);
			if (newValueBufferImplementation != null)
				msgs = ((InternalEObject)newValueBufferImplementation).eInverseAdd(this, InteractionPackage.VALUE_BUFFER_IMPLEMENTATION__PARENT, ValueBufferImplementation.class, msgs);
			msgs = basicSetValueBufferImplementation(newValueBufferImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, newValueBufferImplementation, newValueBufferImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterBufferImplementation getFilterBufferImplementation() {
		return filterBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterBufferImplementation(FilterBufferImplementation newFilterBufferImplementation, NotificationChain msgs) {
		FilterBufferImplementation oldFilterBufferImplementation = filterBufferImplementation;
		filterBufferImplementation = newFilterBufferImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, oldFilterBufferImplementation, newFilterBufferImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterBufferImplementation(FilterBufferImplementation newFilterBufferImplementation) {
		if (newFilterBufferImplementation != filterBufferImplementation) {
			NotificationChain msgs = null;
			if (filterBufferImplementation != null)
				msgs = ((InternalEObject)filterBufferImplementation).eInverseRemove(this, InteractionPackage.FILTER_BUFFER_IMPLEMENTATION__PARENT, FilterBufferImplementation.class, msgs);
			if (newFilterBufferImplementation != null)
				msgs = ((InternalEObject)newFilterBufferImplementation).eInverseAdd(this, InteractionPackage.FILTER_BUFFER_IMPLEMENTATION__PARENT, FilterBufferImplementation.class, msgs);
			msgs = basicSetFilterBufferImplementation(newFilterBufferImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, newFilterBufferImplementation, newFilterBufferImplementation));
	}

	/**
	 * The cached invocation delegate for the '{@link #getInternalEcuReceivers() <em>Get Internal Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEcuReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InternalEcuReceiver> getInternalEcuReceivers() {
		try {
			return (EList<InternalEcuReceiver>)GET_INTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getExternalEcuReceivers() <em>Get External Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalEcuReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EXTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExternalEcuReceiver> getExternalEcuReceivers() {
		try {
			return (EList<ExternalEcuReceiver>)GET_EXTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #receivesInterCore() <em>Receives Inter Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #receivesInterCore()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RECEIVES_INTER_CORE__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_INTER_CORE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean receivesInterCore() {
		try {
			return (Boolean)RECEIVES_INTER_CORE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #receivesFromMultipleCores() <em>Receives From Multiple Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #receivesFromMultipleCores()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RECEIVES_FROM_MULTIPLE_CORES__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean receivesFromMultipleCores() {
		try {
			return (Boolean)RECEIVES_FROM_MULTIPLE_CORES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiver()).basicAdd(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSendInteraction()).basicAdd(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				if (valueBufferImplementation != null)
					msgs = ((InternalEObject)valueBufferImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, null, msgs);
				return basicSetValueBufferImplementation((ValueBufferImplementation)otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				if (filterBufferImplementation != null)
					msgs = ((InternalEObject)filterBufferImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, null, msgs);
				return basicSetFilterBufferImplementation((FilterBufferImplementation)otherEnd, msgs);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return ((InternalEList<?>)getSendInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return basicSetValueBufferImplementation(null, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return basicSetFilterBufferImplementation(null, msgs);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return getReceiver();
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return getSendInteraction();
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return getValueBufferImplementation();
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return getFilterBufferImplementation();
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends Receiver>)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				getSendInteraction().clear();
				getSendInteraction().addAll((Collection<? extends SendInteraction>)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				setValueBufferImplementation((ValueBufferImplementation)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				setFilterBufferImplementation((FilterBufferImplementation)newValue);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				getReceiver().clear();
				return;
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				getSendInteraction().clear();
				return;
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				setValueBufferImplementation((ValueBufferImplementation)null);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				setFilterBufferImplementation((FilterBufferImplementation)null);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return receiver != null && !receiver.isEmpty();
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return sendInteraction != null && !sendInteraction.isEmpty();
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return valueBufferImplementation != null;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return filterBufferImplementation != null;
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
			case InteractionPackage.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS:
				return getInternalEcuReceivers();
			case InteractionPackage.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS:
				return getExternalEcuReceivers();
			case InteractionPackage.RECEIVE_INTERACTION___RECEIVES_INTER_CORE:
				return receivesInterCore();
			case InteractionPackage.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES:
				return receivesFromMultipleCores();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiveInteractionImpl
