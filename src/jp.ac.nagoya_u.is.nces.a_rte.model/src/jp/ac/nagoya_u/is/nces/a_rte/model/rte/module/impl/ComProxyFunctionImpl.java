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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getIocReceiveSymbolName <em>Ioc Receive Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getSendSignalFunctionSymbolName <em>Send Signal Function Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getBufferVariable <em>Buffer Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getSignalInformationSymbolName <em>Signal Information Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getIsGroup <em>Is Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComProxyFunctionImpl extends FunctionImpl implements ComProxyFunction {
	/**
	 * The default value of the '{@link #getIocReceiveSymbolName() <em>Ioc Receive Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocReceiveSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String IOC_RECEIVE_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIocReceiveSymbolName() <em>Ioc Receive Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocReceiveSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String iocReceiveSymbolName = IOC_RECEIVE_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendSignalFunctionSymbolName() <em>Send Signal Function Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendSignalFunctionSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_SIGNAL_FUNCTION_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendSignalFunctionSymbolName() <em>Send Signal Function Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendSignalFunctionSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String sendSignalFunctionSymbolName = SEND_SIGNAL_FUNCTION_SYMBOL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBufferVariable() <em>Buffer Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable bufferVariable;

	/**
	 * The default value of the '{@link #getSignalInformationSymbolName() <em>Signal Information Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalInformationSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_INFORMATION_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalInformationSymbolName() <em>Signal Information Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalInformationSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String signalInformationSymbolName = SIGNAL_INFORMATION_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGroup = IS_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationOperation() <em>Activation Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationOperation> activationOperation;

	/**
	 * The cached value of the '{@link #getTAckStatus() <em>TAck Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckStatus()
	 * @generated
	 * @ordered
	 */
	protected TAckStatus tAckStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComProxyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_PROXY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getParent() {
		if (eContainerFeatureID() != ModulePackage.COM_PROXY_FUNCTION__PARENT) return null;
		return (Partition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Partition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.COM_PROXY_FUNCTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Partition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.COM_PROXY_FUNCTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.PARTITION__COM_PROXY_FUNCTION, Partition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIocReceiveSymbolName() {
		return iocReceiveSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocReceiveSymbolName(String newIocReceiveSymbolName) {
		String oldIocReceiveSymbolName = iocReceiveSymbolName;
		iocReceiveSymbolName = newIocReceiveSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME, oldIocReceiveSymbolName, iocReceiveSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendSignalFunctionSymbolName() {
		return sendSignalFunctionSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendSignalFunctionSymbolName(String newSendSignalFunctionSymbolName) {
		String oldSendSignalFunctionSymbolName = sendSignalFunctionSymbolName;
		sendSignalFunctionSymbolName = newSendSignalFunctionSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__SEND_SIGNAL_FUNCTION_SYMBOL_NAME, oldSendSignalFunctionSymbolName, sendSignalFunctionSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getBufferVariable() {
		if (bufferVariable != null && ((EObject)bufferVariable).eIsProxy()) {
			InternalEObject oldBufferVariable = (InternalEObject)bufferVariable;
			bufferVariable = (Variable)eResolveProxy(oldBufferVariable);
			if (bufferVariable != oldBufferVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE, oldBufferVariable, bufferVariable));
			}
		}
		return bufferVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetBufferVariable() {
		return bufferVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferVariable(Variable newBufferVariable) {
		Variable oldBufferVariable = bufferVariable;
		bufferVariable = newBufferVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE, oldBufferVariable, bufferVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignalInformationSymbolName() {
		return signalInformationSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalInformationSymbolName(String newSignalInformationSymbolName) {
		String oldSignalInformationSymbolName = signalInformationSymbolName;
		signalInformationSymbolName = newSignalInformationSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__SIGNAL_INFORMATION_SYMBOL_NAME, oldSignalInformationSymbolName, signalInformationSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGroup() {
		return isGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroup(Boolean newIsGroup) {
		Boolean oldIsGroup = isGroup;
		isGroup = newIsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__IS_GROUP, oldIsGroup, isGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationOperation> getActivationOperation() {
		if (activationOperation == null) {
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION);
		}
		return activationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus getTAckStatus() {
		if (tAckStatus != null && ((EObject)tAckStatus).eIsProxy()) {
			InternalEObject oldTAckStatus = (InternalEObject)tAckStatus;
			tAckStatus = (TAckStatus)eResolveProxy(oldTAckStatus);
			if (tAckStatus != oldTAckStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS, oldTAckStatus, tAckStatus));
			}
		}
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus basicGetTAckStatus() {
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTAckStatus(TAckStatus newTAckStatus) {
		TAckStatus oldTAckStatus = tAckStatus;
		tAckStatus = newTAckStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS, oldTAckStatus, tAckStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Partition)otherEnd, msgs);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return basicSetParent(null, msgs);
			case ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION:
				return ((InternalEList<?>)getActivationOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTITION__COM_PROXY_FUNCTION, Partition.class, msgs);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return getParent();
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				return getIocReceiveSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__SEND_SIGNAL_FUNCTION_SYMBOL_NAME:
				return getSendSignalFunctionSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE:
				if (resolve) return getBufferVariable();
				return basicGetBufferVariable();
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_INFORMATION_SYMBOL_NAME:
				return getSignalInformationSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				return getIsGroup();
			case ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION:
				return getActivationOperation();
			case ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS:
				if (resolve) return getTAckStatus();
				return basicGetTAckStatus();
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				setParent((Partition)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				setIocReceiveSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SEND_SIGNAL_FUNCTION_SYMBOL_NAME:
				setSendSignalFunctionSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE:
				setBufferVariable((Variable)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_INFORMATION_SYMBOL_NAME:
				setSignalInformationSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				setIsGroup((Boolean)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS:
				setTAckStatus((TAckStatus)newValue);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				setParent((Partition)null);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				setIocReceiveSymbolName(IOC_RECEIVE_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SEND_SIGNAL_FUNCTION_SYMBOL_NAME:
				setSendSignalFunctionSymbolName(SEND_SIGNAL_FUNCTION_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE:
				setBufferVariable((Variable)null);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_INFORMATION_SYMBOL_NAME:
				setSignalInformationSymbolName(SIGNAL_INFORMATION_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				setIsGroup(IS_GROUP_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				return;
			case ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS:
				setTAckStatus((TAckStatus)null);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return getParent() != null;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				return IOC_RECEIVE_SYMBOL_NAME_EDEFAULT == null ? iocReceiveSymbolName != null : !IOC_RECEIVE_SYMBOL_NAME_EDEFAULT.equals(iocReceiveSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__SEND_SIGNAL_FUNCTION_SYMBOL_NAME:
				return SEND_SIGNAL_FUNCTION_SYMBOL_NAME_EDEFAULT == null ? sendSignalFunctionSymbolName != null : !SEND_SIGNAL_FUNCTION_SYMBOL_NAME_EDEFAULT.equals(sendSignalFunctionSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_VARIABLE:
				return bufferVariable != null;
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_INFORMATION_SYMBOL_NAME:
				return SIGNAL_INFORMATION_SYMBOL_NAME_EDEFAULT == null ? signalInformationSymbolName != null : !SIGNAL_INFORMATION_SYMBOL_NAME_EDEFAULT.equals(signalInformationSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				return IS_GROUP_EDEFAULT == null ? isGroup != null : !IS_GROUP_EDEFAULT.equals(isGroup);
			case ModulePackage.COM_PROXY_FUNCTION__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
			case ModulePackage.COM_PROXY_FUNCTION__TACK_STATUS:
				return tAckStatus != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iocReceiveSymbolName: ");
		result.append(iocReceiveSymbolName);
		result.append(", sendSignalFunctionSymbolName: ");
		result.append(sendSignalFunctionSymbolName);
		result.append(", signalInformationSymbolName: ");
		result.append(signalInformationSymbolName);
		result.append(", isGroup: ");
		result.append(isGroup);
		result.append(')');
		return result.toString();
	}

} //ComProxyFunctionImpl
