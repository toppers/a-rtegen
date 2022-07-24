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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComSystemTemplateSystemSignal <em>Com System Template System Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComHandleId <em>Com Handle Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComTransferProperty <em>Com Transfer Property</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComBitSize <em>Com Bit Size</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComSignalLength <em>Com Signal Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalImpl extends EcucContainerImpl implements ComSignal {
	/**
	 * The cached value of the '{@link #getComSystemTemplateSystemSignal() <em>Com System Template System Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSystemTemplateSystemSignal()
	 * @generated
	 * @ordered
	 */
	protected ISignalToIPduMapping comSystemTemplateSystemSignal;

	/**
	 * The default value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COM_HANDLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected Integer comHandleId = COM_HANDLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComTransferProperty() <em>Com Transfer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComTransferProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ComTransferPropertyEnum COM_TRANSFER_PROPERTY_EDEFAULT = ComTransferPropertyEnum.PENDING;

	/**
	 * The cached value of the '{@link #getComTransferProperty() <em>Com Transfer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComTransferProperty()
	 * @generated
	 * @ordered
	 */
	protected ComTransferPropertyEnum comTransferProperty = COM_TRANSFER_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComBitSize() <em>Com Bit Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComBitSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COM_BIT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComBitSize() <em>Com Bit Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComBitSize()
	 * @generated
	 * @ordered
	 */
	protected Integer comBitSize = COM_BIT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComSignalLength() <em>Com Signal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COM_SIGNAL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComSignalLength() <em>Com Signal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalLength()
	 * @generated
	 * @ordered
	 */
	protected Integer comSignalLength = COM_SIGNAL_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.COM_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping getComSystemTemplateSystemSignal() {
		if (comSystemTemplateSystemSignal != null && ((EObject)comSystemTemplateSystemSignal).eIsProxy()) {
			InternalEObject oldComSystemTemplateSystemSignal = (InternalEObject)comSystemTemplateSystemSignal;
			comSystemTemplateSystemSignal = (ISignalToIPduMapping)eResolveProxy(oldComSystemTemplateSystemSignal);
			if (comSystemTemplateSystemSignal != oldComSystemTemplateSystemSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
			}
		}
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping basicGetComSystemTemplateSystemSignal() {
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSystemTemplateSystemSignal(ISignalToIPduMapping newComSystemTemplateSystemSignal) {
		ISignalToIPduMapping oldComSystemTemplateSystemSignal = comSystemTemplateSystemSignal;
		comSystemTemplateSystemSignal = newComSystemTemplateSystemSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getComHandleId() {
		return comHandleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComHandleId(Integer newComHandleId) {
		Integer oldComHandleId = comHandleId;
		comHandleId = newComHandleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_HANDLE_ID, oldComHandleId, comHandleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransferPropertyEnum getComTransferProperty() {
		return comTransferProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComTransferProperty(ComTransferPropertyEnum newComTransferProperty) {
		ComTransferPropertyEnum oldComTransferProperty = comTransferProperty;
		comTransferProperty = newComTransferProperty == null ? COM_TRANSFER_PROPERTY_EDEFAULT : newComTransferProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY, oldComTransferProperty, comTransferProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getComBitSize() {
		return comBitSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComBitSize(Integer newComBitSize) {
		Integer oldComBitSize = comBitSize;
		comBitSize = newComBitSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_BIT_SIZE, oldComBitSize, comBitSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getComSignalLength() {
		return comSignalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSignalLength(Integer newComSignalLength) {
		Integer oldComSignalLength = comSignalLength;
		comSignalLength = newComSignalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_SIGNAL_LENGTH, oldComSignalLength, comSignalLength));
	}

	/**
	 * The cached invocation delegate for the '{@link #transfersImmediately() <em>Transfers Immediately</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #transfersImmediately()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TRANSFERS_IMMEDIATELY__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.COM_SIGNAL___TRANSFERS_IMMEDIATELY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean transfersImmediately() {
		try {
			return (Boolean)TRANSFERS_IMMEDIATELY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				if (resolve) return getComSystemTemplateSystemSignal();
				return basicGetComSystemTemplateSystemSignal();
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				return getComHandleId();
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				return getComTransferProperty();
			case EcucPackage.COM_SIGNAL__COM_BIT_SIZE:
				return getComBitSize();
			case EcucPackage.COM_SIGNAL__COM_SIGNAL_LENGTH:
				return getComSignalLength();
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				setComHandleId((Integer)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				setComTransferProperty((ComTransferPropertyEnum)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_BIT_SIZE:
				setComBitSize((Integer)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_SIGNAL_LENGTH:
				setComSignalLength((Integer)newValue);
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)null);
				return;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				setComHandleId(COM_HANDLE_ID_EDEFAULT);
				return;
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				setComTransferProperty(COM_TRANSFER_PROPERTY_EDEFAULT);
				return;
			case EcucPackage.COM_SIGNAL__COM_BIT_SIZE:
				setComBitSize(COM_BIT_SIZE_EDEFAULT);
				return;
			case EcucPackage.COM_SIGNAL__COM_SIGNAL_LENGTH:
				setComSignalLength(COM_SIGNAL_LENGTH_EDEFAULT);
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				return comSystemTemplateSystemSignal != null;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				return COM_HANDLE_ID_EDEFAULT == null ? comHandleId != null : !COM_HANDLE_ID_EDEFAULT.equals(comHandleId);
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				return comTransferProperty != COM_TRANSFER_PROPERTY_EDEFAULT;
			case EcucPackage.COM_SIGNAL__COM_BIT_SIZE:
				return COM_BIT_SIZE_EDEFAULT == null ? comBitSize != null : !COM_BIT_SIZE_EDEFAULT.equals(comBitSize);
			case EcucPackage.COM_SIGNAL__COM_SIGNAL_LENGTH:
				return COM_SIGNAL_LENGTH_EDEFAULT == null ? comSignalLength != null : !COM_SIGNAL_LENGTH_EDEFAULT.equals(comSignalLength);
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
			case EcucPackage.COM_SIGNAL___TRANSFERS_IMMEDIATELY:
				return transfersImmediately();
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
		result.append(" (comHandleId: ");
		result.append(comHandleId);
		result.append(", comTransferProperty: ");
		result.append(comTransferProperty);
		result.append(", comBitSize: ");
		result.append(comBitSize);
		result.append(", comSignalLength: ");
		result.append(comSignalLength);
		result.append(')');
		return result.toString();
	}

} //ComSignalImpl
