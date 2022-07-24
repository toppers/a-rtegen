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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
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
 * An implementation of the model object '<em><b>Internal Ecu Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl#getTAckStatusVariableImplementation <em>TAck Status Variable Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl#getActivatesOnSendCompleted <em>Activates On Send Completed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalEcuSenderImpl extends SenderImpl implements InternalEcuSender {
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
	 * The cached value of the '{@link #getTAckStatusVariableImplementation() <em>TAck Status Variable Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckStatusVariableImplementation()
	 * @generated
	 * @ordered
	 */
	protected TAckStatusVariableImplementation tAckStatusVariableImplementation;

	/**
	 * The cached value of the '{@link #getActivatesOnSendCompleted() <em>Activates On Send Completed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatesOnSendCompleted()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityStarter> activatesOnSendCompleted;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalEcuSenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERNAL_ECU_SENDER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERNAL_ECU_SENDER__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERNAL_ECU_SENDER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatusVariableImplementation getTAckStatusVariableImplementation() {
		return tAckStatusVariableImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTAckStatusVariableImplementation(TAckStatusVariableImplementation newTAckStatusVariableImplementation, NotificationChain msgs) {
		TAckStatusVariableImplementation oldTAckStatusVariableImplementation = tAckStatusVariableImplementation;
		tAckStatusVariableImplementation = newTAckStatusVariableImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION, oldTAckStatusVariableImplementation, newTAckStatusVariableImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTAckStatusVariableImplementation(TAckStatusVariableImplementation newTAckStatusVariableImplementation) {
		if (newTAckStatusVariableImplementation != tAckStatusVariableImplementation) {
			NotificationChain msgs = null;
			if (tAckStatusVariableImplementation != null)
				msgs = ((InternalEObject)tAckStatusVariableImplementation).eInverseRemove(this, InteractionPackage.TACK_STATUS_VARIABLE_IMPLEMENTATION__PARENT, TAckStatusVariableImplementation.class, msgs);
			if (newTAckStatusVariableImplementation != null)
				msgs = ((InternalEObject)newTAckStatusVariableImplementation).eInverseAdd(this, InteractionPackage.TACK_STATUS_VARIABLE_IMPLEMENTATION__PARENT, TAckStatusVariableImplementation.class, msgs);
			msgs = basicSetTAckStatusVariableImplementation(newTAckStatusVariableImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION, newTAckStatusVariableImplementation, newTAckStatusVariableImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityStarter> getActivatesOnSendCompleted() {
		if (activatesOnSendCompleted == null) {
			activatesOnSendCompleted = new EObjectResolvingEList<EntityStarter>(EntityStarter.class, this, InteractionPackage.INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED);
		}
		return activatesOnSendCompleted;
	}

	/**
	 * The cached invocation delegate for the '{@link #isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_EVENT_SEMANTICS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.INTERNAL_ECU_SENDER___IS_EVENT_SEMANTICS).getInvocationDelegate();

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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				if (tAckStatusVariableImplementation != null)
					msgs = ((InternalEObject)tAckStatusVariableImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION, null, msgs);
				return basicSetTAckStatusVariableImplementation((TAckStatusVariableImplementation)otherEnd, msgs);
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
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				return basicSetTAckStatusVariableImplementation(null, msgs);
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
			case InteractionPackage.INTERNAL_ECU_SENDER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				return getTAckStatusVariableImplementation();
			case InteractionPackage.INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED:
				return getActivatesOnSendCompleted();
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
			case InteractionPackage.INTERNAL_ECU_SENDER__SOURCE:
				setSource((VariableDataInstanceInComposition)newValue);
				return;
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				setTAckStatusVariableImplementation((TAckStatusVariableImplementation)newValue);
				return;
			case InteractionPackage.INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED:
				getActivatesOnSendCompleted().clear();
				getActivatesOnSendCompleted().addAll((Collection<? extends EntityStarter>)newValue);
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
			case InteractionPackage.INTERNAL_ECU_SENDER__SOURCE:
				setSource((VariableDataInstanceInComposition)null);
				return;
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				setTAckStatusVariableImplementation((TAckStatusVariableImplementation)null);
				return;
			case InteractionPackage.INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED:
				getActivatesOnSendCompleted().clear();
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
			case InteractionPackage.INTERNAL_ECU_SENDER__SOURCE:
				return source != null;
			case InteractionPackage.INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION:
				return tAckStatusVariableImplementation != null;
			case InteractionPackage.INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED:
				return activatesOnSendCompleted != null && !activatesOnSendCompleted.isEmpty();
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
			case InteractionPackage.INTERNAL_ECU_SENDER___IS_EVENT_SEMANTICS:
				return isEventSemantics();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalEcuSenderImpl
