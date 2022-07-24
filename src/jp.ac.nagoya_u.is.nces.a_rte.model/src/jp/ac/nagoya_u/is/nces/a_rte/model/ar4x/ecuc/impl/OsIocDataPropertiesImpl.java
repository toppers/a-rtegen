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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Ioc Data Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocDataPropertyIndex <em>Os Ioc Data Property Index</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocInitValue <em>Os Ioc Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocDataType <em>Os Ioc Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsIocDataPropertiesImpl extends EcucContainerImpl implements OsIocDataProperties {
	/**
	 * The default value of the '{@link #getOsIocDataPropertyIndex() <em>Os Ioc Data Property Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataPropertyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocDataPropertyIndex() <em>Os Ioc Data Property Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataPropertyIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer osIocDataPropertyIndex = OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsIocInitValue() <em>Os Ioc Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_IOC_INIT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocInitValue() <em>Os Ioc Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocInitValue()
	 * @generated
	 * @ordered
	 */
	protected String osIocInitValue = OS_IOC_INIT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsIocDataType() <em>Os Ioc Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType osIocDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsIocDataPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_IOC_DATA_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsIocDataPropertyIndex() {
		return osIocDataPropertyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocDataPropertyIndex(Integer newOsIocDataPropertyIndex) {
		Integer oldOsIocDataPropertyIndex = osIocDataPropertyIndex;
		osIocDataPropertyIndex = newOsIocDataPropertyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX, oldOsIocDataPropertyIndex, osIocDataPropertyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsIocInitValue() {
		return osIocInitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocInitValue(String newOsIocInitValue) {
		String oldOsIocInitValue = osIocInitValue;
		osIocInitValue = newOsIocInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE, oldOsIocInitValue, osIocInitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getOsIocDataType() {
		if (osIocDataType != null && ((EObject)osIocDataType).eIsProxy()) {
			InternalEObject oldOsIocDataType = (InternalEObject)osIocDataType;
			osIocDataType = (ImplementationDataType)eResolveProxy(oldOsIocDataType);
			if (osIocDataType != oldOsIocDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE, oldOsIocDataType, osIocDataType));
			}
		}
		return osIocDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetOsIocDataType() {
		return osIocDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocDataType(ImplementationDataType newOsIocDataType) {
		ImplementationDataType oldOsIocDataType = osIocDataType;
		osIocDataType = newOsIocDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE, oldOsIocDataType, osIocDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				return getOsIocDataPropertyIndex();
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				return getOsIocInitValue();
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				if (resolve) return getOsIocDataType();
				return basicGetOsIocDataType();
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				setOsIocDataPropertyIndex((Integer)newValue);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				setOsIocInitValue((String)newValue);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				setOsIocDataType((ImplementationDataType)newValue);
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				setOsIocDataPropertyIndex(OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				setOsIocInitValue(OS_IOC_INIT_VALUE_EDEFAULT);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				setOsIocDataType((ImplementationDataType)null);
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				return OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT == null ? osIocDataPropertyIndex != null : !OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT.equals(osIocDataPropertyIndex);
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				return OS_IOC_INIT_VALUE_EDEFAULT == null ? osIocInitValue != null : !OS_IOC_INIT_VALUE_EDEFAULT.equals(osIocInitValue);
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				return osIocDataType != null;
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
		result.append(" (osIocDataPropertyIndex: ");
		result.append(osIocDataPropertyIndex);
		result.append(", osIocInitValue: ");
		result.append(osIocInitValue);
		result.append(')');
		return result.toString();
	}

} //OsIocDataPropertiesImpl
