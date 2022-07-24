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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Ioc Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl#getOsIocSenderProperties <em>Os Ioc Sender Properties</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl#getOsIocReceiverProperties <em>Os Ioc Receiver Properties</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl#getOsIocDataProperties <em>Os Ioc Data Properties</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl#getOsIocBufferLength <em>Os Ioc Buffer Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsIocCommunicationImpl extends EcucContainerImpl implements OsIocCommunication {
	/**
	 * The cached value of the '{@link #getOsIocSenderProperties() <em>Os Ioc Sender Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocSenderProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<OsIocSenderProperties> osIocSenderProperties;

	/**
	 * The cached value of the '{@link #getOsIocReceiverProperties() <em>Os Ioc Receiver Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocReceiverProperties()
	 * @generated
	 * @ordered
	 */
	protected OsIocReceiverProperties osIocReceiverProperties;

	/**
	 * The cached value of the '{@link #getOsIocDataProperties() <em>Os Ioc Data Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<OsIocDataProperties> osIocDataProperties;

	/**
	 * The default value of the '{@link #getOsIocBufferLength() <em>Os Ioc Buffer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocBufferLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_IOC_BUFFER_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocBufferLength() <em>Os Ioc Buffer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocBufferLength()
	 * @generated
	 * @ordered
	 */
	protected Integer osIocBufferLength = OS_IOC_BUFFER_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsIocCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_IOC_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsIocSenderProperties> getOsIocSenderProperties() {
		if (osIocSenderProperties == null) {
			osIocSenderProperties = new EObjectContainmentWithInverseEList<OsIocSenderProperties>(OsIocSenderProperties.class, this, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES, EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT);
		}
		return osIocSenderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocReceiverProperties getOsIocReceiverProperties() {
		return osIocReceiverProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsIocReceiverProperties(OsIocReceiverProperties newOsIocReceiverProperties, NotificationChain msgs) {
		OsIocReceiverProperties oldOsIocReceiverProperties = osIocReceiverProperties;
		osIocReceiverProperties = newOsIocReceiverProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES, oldOsIocReceiverProperties, newOsIocReceiverProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocReceiverProperties(OsIocReceiverProperties newOsIocReceiverProperties) {
		if (newOsIocReceiverProperties != osIocReceiverProperties) {
			NotificationChain msgs = null;
			if (osIocReceiverProperties != null)
				msgs = ((InternalEObject)osIocReceiverProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES, null, msgs);
			if (newOsIocReceiverProperties != null)
				msgs = ((InternalEObject)newOsIocReceiverProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES, null, msgs);
			msgs = basicSetOsIocReceiverProperties(newOsIocReceiverProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES, newOsIocReceiverProperties, newOsIocReceiverProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsIocDataProperties> getOsIocDataProperties() {
		if (osIocDataProperties == null) {
			osIocDataProperties = new EObjectContainmentEList<OsIocDataProperties>(OsIocDataProperties.class, this, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES);
		}
		return osIocDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsIocBufferLength() {
		return osIocBufferLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocBufferLength(Integer newOsIocBufferLength) {
		Integer oldOsIocBufferLength = osIocBufferLength;
		osIocBufferLength = newOsIocBufferLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH, oldOsIocBufferLength, osIocBufferLength));
	}

	/**
	 * The cached invocation delegate for the '{@link #getLoopbackSenderProperties() <em>Get Loopback Sender Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopbackSenderProperties()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_LOOPBACK_SENDER_PROPERTIES__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.OS_IOC_COMMUNICATION___GET_LOOPBACK_SENDER_PROPERTIES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocSenderProperties getLoopbackSenderProperties() {
		try {
			return (OsIocSenderProperties)GET_LOOPBACK_SENDER_PROPERTIES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOsIocSenderProperties()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				return ((InternalEList<?>)getOsIocSenderProperties()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
				return basicSetOsIocReceiverProperties(null, msgs);
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
				return ((InternalEList<?>)getOsIocDataProperties()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				return getOsIocSenderProperties();
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
				return getOsIocReceiverProperties();
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
				return getOsIocDataProperties();
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH:
				return getOsIocBufferLength();
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				getOsIocSenderProperties().clear();
				getOsIocSenderProperties().addAll((Collection<? extends OsIocSenderProperties>)newValue);
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
				setOsIocReceiverProperties((OsIocReceiverProperties)newValue);
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
				getOsIocDataProperties().clear();
				getOsIocDataProperties().addAll((Collection<? extends OsIocDataProperties>)newValue);
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH:
				setOsIocBufferLength((Integer)newValue);
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				getOsIocSenderProperties().clear();
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
				setOsIocReceiverProperties((OsIocReceiverProperties)null);
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
				getOsIocDataProperties().clear();
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH:
				setOsIocBufferLength(OS_IOC_BUFFER_LENGTH_EDEFAULT);
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
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
				return osIocSenderProperties != null && !osIocSenderProperties.isEmpty();
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
				return osIocReceiverProperties != null;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
				return osIocDataProperties != null && !osIocDataProperties.isEmpty();
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH:
				return OS_IOC_BUFFER_LENGTH_EDEFAULT == null ? osIocBufferLength != null : !OS_IOC_BUFFER_LENGTH_EDEFAULT.equals(osIocBufferLength);
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
			case EcucPackage.OS_IOC_COMMUNICATION___GET_LOOPBACK_SENDER_PROPERTIES:
				return getLoopbackSenderProperties();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (osIocBufferLength: ");
		result.append(osIocBufferLength);
		result.append(')');
		return result.toString();
	}

} //OsIocCommunicationImpl
