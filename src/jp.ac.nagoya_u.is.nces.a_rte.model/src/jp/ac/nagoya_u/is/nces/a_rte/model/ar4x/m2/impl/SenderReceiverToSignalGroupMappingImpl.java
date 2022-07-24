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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiver To Signal Group Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getDataElementIref <em>Data Element Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getTypeMapping <em>Type Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderReceiverToSignalGroupMappingImpl extends DataMappingImpl implements SenderReceiverToSignalGroupMapping {
	/**
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected SystemSignalGroup signalGroup;

	/**
	 * The cached value of the '{@link #getDataElementIref() <em>Data Element Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElementIref()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototypeInSystemInstanceRef dataElementIref;

	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstance dataElement;

	/**
	 * The cached value of the '{@link #getTypeMapping() <em>Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected SenderRecCompositeTypeMapping typeMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverToSignalGroupMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignalGroup getSignalGroup() {
		if (signalGroup != null && ((EObject)signalGroup).eIsProxy()) {
			InternalEObject oldSignalGroup = (InternalEObject)signalGroup;
			signalGroup = (SystemSignalGroup)eResolveProxy(oldSignalGroup);
			if (signalGroup != oldSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, oldSignalGroup, signalGroup));
			}
		}
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignalGroup basicGetSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalGroup(SystemSignalGroup newSignalGroup) {
		SystemSignalGroup oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, oldSignalGroup, signalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototypeInSystemInstanceRef getDataElementIref() {
		return dataElementIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataElementIref(VariableDataPrototypeInSystemInstanceRef newDataElementIref, NotificationChain msgs) {
		VariableDataPrototypeInSystemInstanceRef oldDataElementIref = dataElementIref;
		dataElementIref = newDataElementIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, oldDataElementIref, newDataElementIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElementIref(VariableDataPrototypeInSystemInstanceRef newDataElementIref) {
		if (newDataElementIref != dataElementIref) {
			NotificationChain msgs = null;
			if (dataElementIref != null)
				msgs = ((InternalEObject)dataElementIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, null, msgs);
			if (newDataElementIref != null)
				msgs = ((InternalEObject)newDataElementIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, null, msgs);
			msgs = basicSetDataElementIref(newDataElementIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, newDataElementIref, newDataElementIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstance getDataElement() {
		if (dataElement != null && ((EObject)dataElement).eIsProxy()) {
			InternalEObject oldDataElement = (InternalEObject)dataElement;
			dataElement = (VariableDataInstance)eResolveProxy(oldDataElement);
			if (dataElement != oldDataElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT, oldDataElement, dataElement));
			}
		}
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstance basicGetDataElement() {
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElement(VariableDataInstance newDataElement) {
		VariableDataInstance oldDataElement = dataElement;
		dataElement = newDataElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT, oldDataElement, dataElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRecCompositeTypeMapping getTypeMapping() {
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMapping(SenderRecCompositeTypeMapping newTypeMapping, NotificationChain msgs) {
		SenderRecCompositeTypeMapping oldTypeMapping = typeMapping;
		typeMapping = newTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, oldTypeMapping, newTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMapping(SenderRecCompositeTypeMapping newTypeMapping) {
		if (newTypeMapping != typeMapping) {
			NotificationChain msgs = null;
			if (typeMapping != null)
				msgs = ((InternalEObject)typeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, null, msgs);
			if (newTypeMapping != null)
				msgs = ((InternalEObject)newTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, null, msgs);
			msgs = basicSetTypeMapping(newTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, newTypeMapping, newTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return basicSetDataElementIref(null, msgs);
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return basicSetTypeMapping(null, msgs);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				if (resolve) return getSignalGroup();
				return basicGetSignalGroup();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return getDataElementIref();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				if (resolve) return getDataElement();
				return basicGetDataElement();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return getTypeMapping();
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				setSignalGroup((SystemSignalGroup)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				setDataElementIref((VariableDataPrototypeInSystemInstanceRef)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				setDataElement((VariableDataInstance)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				setTypeMapping((SenderRecCompositeTypeMapping)newValue);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				setSignalGroup((SystemSignalGroup)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				setDataElementIref((VariableDataPrototypeInSystemInstanceRef)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				setDataElement((VariableDataInstance)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				setTypeMapping((SenderRecCompositeTypeMapping)null);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				return signalGroup != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return dataElementIref != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				return dataElement != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return typeMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //SenderReceiverToSignalGroupMappingImpl
