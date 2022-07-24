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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Rec Record Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl#getImplementationRecordElement <em>Implementation Record Element</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl#getComplexTypeMapping <em>Complex Type Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl#getSystemSignal <em>System Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderRecRecordElementMappingImpl extends M2ObjectImpl implements SenderRecRecordElementMapping {
	/**
	 * The cached value of the '{@link #getImplementationRecordElement() <em>Implementation Record Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationRecordElement()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataTypeElement implementationRecordElement;

	/**
	 * The cached value of the '{@link #getComplexTypeMapping() <em>Complex Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected SenderRecCompositeTypeMapping complexTypeMapping;

	/**
	 * The cached value of the '{@link #getSystemSignal() <em>System Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemSignal()
	 * @generated
	 * @ordered
	 */
	protected SystemSignal systemSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderRecRecordElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SENDER_REC_RECORD_ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeElement getImplementationRecordElement() {
		if (implementationRecordElement != null && ((EObject)implementationRecordElement).eIsProxy()) {
			InternalEObject oldImplementationRecordElement = (InternalEObject)implementationRecordElement;
			implementationRecordElement = (ImplementationDataTypeElement)eResolveProxy(oldImplementationRecordElement);
			if (implementationRecordElement != oldImplementationRecordElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT, oldImplementationRecordElement, implementationRecordElement));
			}
		}
		return implementationRecordElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeElement basicGetImplementationRecordElement() {
		return implementationRecordElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationRecordElement(ImplementationDataTypeElement newImplementationRecordElement) {
		ImplementationDataTypeElement oldImplementationRecordElement = implementationRecordElement;
		implementationRecordElement = newImplementationRecordElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT, oldImplementationRecordElement, implementationRecordElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRecCompositeTypeMapping getComplexTypeMapping() {
		return complexTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexTypeMapping(SenderRecCompositeTypeMapping newComplexTypeMapping, NotificationChain msgs) {
		SenderRecCompositeTypeMapping oldComplexTypeMapping = complexTypeMapping;
		complexTypeMapping = newComplexTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, oldComplexTypeMapping, newComplexTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexTypeMapping(SenderRecCompositeTypeMapping newComplexTypeMapping) {
		if (newComplexTypeMapping != complexTypeMapping) {
			NotificationChain msgs = null;
			if (complexTypeMapping != null)
				msgs = ((InternalEObject)complexTypeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, null, msgs);
			if (newComplexTypeMapping != null)
				msgs = ((InternalEObject)newComplexTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, null, msgs);
			msgs = basicSetComplexTypeMapping(newComplexTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, newComplexTypeMapping, newComplexTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignal getSystemSignal() {
		if (systemSignal != null && ((EObject)systemSignal).eIsProxy()) {
			InternalEObject oldSystemSignal = (InternalEObject)systemSignal;
			systemSignal = (SystemSignal)eResolveProxy(oldSystemSignal);
			if (systemSignal != oldSystemSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL, oldSystemSignal, systemSignal));
			}
		}
		return systemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignal basicGetSystemSignal() {
		return systemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemSignal(SystemSignal newSystemSignal) {
		SystemSignal oldSystemSignal = systemSignal;
		systemSignal = newSystemSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL, oldSystemSignal, systemSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return basicSetComplexTypeMapping(null, msgs);
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
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT:
				if (resolve) return getImplementationRecordElement();
				return basicGetImplementationRecordElement();
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return getComplexTypeMapping();
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				if (resolve) return getSystemSignal();
				return basicGetSystemSignal();
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
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT:
				setImplementationRecordElement((ImplementationDataTypeElement)newValue);
				return;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				setComplexTypeMapping((SenderRecCompositeTypeMapping)newValue);
				return;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				setSystemSignal((SystemSignal)newValue);
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
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT:
				setImplementationRecordElement((ImplementationDataTypeElement)null);
				return;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				setComplexTypeMapping((SenderRecCompositeTypeMapping)null);
				return;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				setSystemSignal((SystemSignal)null);
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
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT:
				return implementationRecordElement != null;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return complexTypeMapping != null;
			case M2Package.SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				return systemSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //SenderRecRecordElementMappingImpl
