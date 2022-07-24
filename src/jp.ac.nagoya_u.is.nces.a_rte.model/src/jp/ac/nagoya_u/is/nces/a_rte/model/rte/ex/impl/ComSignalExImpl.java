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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl#getSenderReceiverToSignalMappingEx <em>Sender Receiver To Signal Mapping Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalExImpl extends ExtendedEObjectImpl implements ComSignalEx {
	/**
	 * The cached value of the '{@link #getSenderReceiverToSignalMappingEx() <em>Sender Receiver To Signal Mapping Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderReceiverToSignalMappingEx()
	 * @generated
	 * @ordered
	 */
	protected SenderReceiverToSignalMappingEx senderReceiverToSignalMappingEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.COM_SIGNAL_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx getSenderReceiverToSignalMappingEx() {
		if (senderReceiverToSignalMappingEx != null && ((EObject)senderReceiverToSignalMappingEx).eIsProxy()) {
			InternalEObject oldSenderReceiverToSignalMappingEx = (InternalEObject)senderReceiverToSignalMappingEx;
			senderReceiverToSignalMappingEx = (SenderReceiverToSignalMappingEx)eResolveProxy(oldSenderReceiverToSignalMappingEx);
			if (senderReceiverToSignalMappingEx != oldSenderReceiverToSignalMappingEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX, oldSenderReceiverToSignalMappingEx, senderReceiverToSignalMappingEx));
			}
		}
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx basicGetSenderReceiverToSignalMappingEx() {
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderReceiverToSignalMappingEx(SenderReceiverToSignalMappingEx newSenderReceiverToSignalMappingEx) {
		SenderReceiverToSignalMappingEx oldSenderReceiverToSignalMappingEx = senderReceiverToSignalMappingEx;
		senderReceiverToSignalMappingEx = newSenderReceiverToSignalMappingEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX, oldSenderReceiverToSignalMappingEx, senderReceiverToSignalMappingEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Sender</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SENDER_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSender(ComSignal this_) {
		try {
			return (Boolean)IS_SENDER_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Receiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_RECEIVER_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceiver(ComSignal this_) {
		try {
			return (Boolean)IS_RECEIVER_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Get Variable Data Instance In Compositions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableDataInstanceInComposition> getVariableDataInstanceInCompositions(ComSignal this_) {
		try {
			return (EList<VariableDataInstanceInComposition>)GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				if (resolve) return getSenderReceiverToSignalMappingEx();
				return basicGetSenderReceiverToSignalMappingEx();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				setSenderReceiverToSignalMappingEx((SenderReceiverToSignalMappingEx)newValue);
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				setSenderReceiverToSignalMappingEx((SenderReceiverToSignalMappingEx)null);
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				return senderReceiverToSignalMappingEx != null;
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
			case ExPackage.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL:
				return isSender((ComSignal)arguments.get(0));
			case ExPackage.COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL:
				return isReceiver((ComSignal)arguments.get(0));
			case ExPackage.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL:
				return getVariableDataInstanceInCompositions((ComSignal)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComSignalExImpl
