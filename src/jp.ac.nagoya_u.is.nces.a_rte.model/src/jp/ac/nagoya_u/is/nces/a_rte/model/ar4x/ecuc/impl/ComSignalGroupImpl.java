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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl#getComGroupSignal <em>Com Group Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl#getComSystemTemplateSignalGroup <em>Com System Template Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl#getComHandleId <em>Com Handle Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl#getComTransferProperty <em>Com Transfer Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalGroupImpl extends EcucContainerImpl implements ComSignalGroup {
	/**
	 * The cached value of the '{@link #getComGroupSignal() <em>Com Group Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComGroupSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<ComGroupSignal> comGroupSignal;

	/**
	 * The cached value of the '{@link #getComSystemTemplateSignalGroup() <em>Com System Template Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSystemTemplateSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected ISignalToIPduMapping comSystemTemplateSignalGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.COM_SIGNAL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping getComSystemTemplateSignalGroup() {
		if (comSystemTemplateSignalGroup != null && ((EObject)comSystemTemplateSignalGroup).eIsProxy()) {
			InternalEObject oldComSystemTemplateSignalGroup = (InternalEObject)comSystemTemplateSignalGroup;
			comSystemTemplateSignalGroup = (ISignalToIPduMapping)eResolveProxy(oldComSystemTemplateSignalGroup);
			if (comSystemTemplateSignalGroup != oldComSystemTemplateSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP, oldComSystemTemplateSignalGroup, comSystemTemplateSignalGroup));
			}
		}
		return comSystemTemplateSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping basicGetComSystemTemplateSignalGroup() {
		return comSystemTemplateSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSystemTemplateSignalGroup(ISignalToIPduMapping newComSystemTemplateSignalGroup) {
		ISignalToIPduMapping oldComSystemTemplateSignalGroup = comSystemTemplateSignalGroup;
		comSystemTemplateSignalGroup = newComSystemTemplateSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP, oldComSystemTemplateSignalGroup, comSystemTemplateSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComGroupSignal> getComGroupSignal() {
		if (comGroupSignal == null) {
			comGroupSignal = new EObjectContainmentEList<ComGroupSignal>(ComGroupSignal.class, this, EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL);
		}
		return comGroupSignal;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL_GROUP__COM_HANDLE_ID, oldComHandleId, comHandleId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY, oldComTransferProperty, comTransferProperty));
	}

	/**
	 * The cached invocation delegate for the '{@link #transfersImmediately() <em>Transfers Immediately</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #transfersImmediately()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TRANSFERS_IMMEDIATELY__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.COM_SIGNAL_GROUP___TRANSFERS_IMMEDIATELY).getInvocationDelegate();

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL:
				return ((InternalEList<?>)getComGroupSignal()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL:
				return getComGroupSignal();
			case EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP:
				if (resolve) return getComSystemTemplateSignalGroup();
				return basicGetComSystemTemplateSignalGroup();
			case EcucPackage.COM_SIGNAL_GROUP__COM_HANDLE_ID:
				return getComHandleId();
			case EcucPackage.COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY:
				return getComTransferProperty();
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
			case EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL:
				getComGroupSignal().clear();
				getComGroupSignal().addAll((Collection<? extends ComGroupSignal>)newValue);
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP:
				setComSystemTemplateSignalGroup((ISignalToIPduMapping)newValue);
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_HANDLE_ID:
				setComHandleId((Integer)newValue);
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY:
				setComTransferProperty((ComTransferPropertyEnum)newValue);
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
			case EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL:
				getComGroupSignal().clear();
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP:
				setComSystemTemplateSignalGroup((ISignalToIPduMapping)null);
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_HANDLE_ID:
				setComHandleId(COM_HANDLE_ID_EDEFAULT);
				return;
			case EcucPackage.COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY:
				setComTransferProperty(COM_TRANSFER_PROPERTY_EDEFAULT);
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
			case EcucPackage.COM_SIGNAL_GROUP__COM_GROUP_SIGNAL:
				return comGroupSignal != null && !comGroupSignal.isEmpty();
			case EcucPackage.COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP:
				return comSystemTemplateSignalGroup != null;
			case EcucPackage.COM_SIGNAL_GROUP__COM_HANDLE_ID:
				return COM_HANDLE_ID_EDEFAULT == null ? comHandleId != null : !COM_HANDLE_ID_EDEFAULT.equals(comHandleId);
			case EcucPackage.COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY:
				return comTransferProperty != COM_TRANSFER_PROPERTY_EDEFAULT;
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
			case EcucPackage.COM_SIGNAL_GROUP___TRANSFERS_IMMEDIATELY:
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
		result.append(')');
		return result.toString();
	}

} //ComSignalGroupImpl
