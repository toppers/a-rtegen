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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecuc Module Configuration Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl#getEcucDefEdition <em>Ecuc Def Edition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl#getImplementationConfigVariant <em>Implementation Config Variant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucModuleConfigurationValuesImpl extends ArElementImpl implements EcucModuleConfigurationValues {
	/**
	 * The default value of the '{@link #getDefinitionRef() <em>Definition Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionRef() <em>Definition Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected String definitionRef = DEFINITION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcucDefEdition() <em>Ecuc Def Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucDefEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String ECUC_DEF_EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcucDefEdition() <em>Ecuc Def Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucDefEdition()
	 * @generated
	 * @ordered
	 */
	protected String ecucDefEdition = ECUC_DEF_EDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationConfigVariant() <em>Implementation Config Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConfigVariant()
	 * @generated
	 * @ordered
	 */
	protected static final EcucConfigurationVariantEnum IMPLEMENTATION_CONFIG_VARIANT_EDEFAULT = EcucConfigurationVariantEnum.VARIANT_POST_BUILD_SELECTABLE;

	/**
	 * The cached value of the '{@link #getImplementationConfigVariant() <em>Implementation Config Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConfigVariant()
	 * @generated
	 * @ordered
	 */
	protected EcucConfigurationVariantEnum implementationConfigVariant = IMPLEMENTATION_CONFIG_VARIANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucContainerValue> container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucModuleConfigurationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ECUC_MODULE_CONFIGURATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucContainerValue> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<EcucContainerValue>(EcucContainerValue.class, this, M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcucDefEdition() {
		return ecucDefEdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcucDefEdition(String newEcucDefEdition) {
		String oldEcucDefEdition = ecucDefEdition;
		ecucDefEdition = newEcucDefEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION, oldEcucDefEdition, ecucDefEdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucConfigurationVariantEnum getImplementationConfigVariant() {
		return implementationConfigVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationConfigVariant(EcucConfigurationVariantEnum newImplementationConfigVariant) {
		EcucConfigurationVariantEnum oldImplementationConfigVariant = implementationConfigVariant;
		implementationConfigVariant = newImplementationConfigVariant == null ? IMPLEMENTATION_CONFIG_VARIANT_EDEFAULT : newImplementationConfigVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT, oldImplementationConfigVariant, implementationConfigVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionRef() {
		return definitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionRef(String newDefinitionRef) {
		String oldDefinitionRef = definitionRef;
		definitionRef = newDefinitionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF, oldDefinitionRef, definitionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
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
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF:
				return getDefinitionRef();
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION:
				return getEcucDefEdition();
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT:
				return getImplementationConfigVariant();
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER:
				return getContainer();
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
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF:
				setDefinitionRef((String)newValue);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION:
				setEcucDefEdition((String)newValue);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT:
				setImplementationConfigVariant((EcucConfigurationVariantEnum)newValue);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends EcucContainerValue>)newValue);
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
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF:
				setDefinitionRef(DEFINITION_REF_EDEFAULT);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION:
				setEcucDefEdition(ECUC_DEF_EDITION_EDEFAULT);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT:
				setImplementationConfigVariant(IMPLEMENTATION_CONFIG_VARIANT_EDEFAULT);
				return;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER:
				getContainer().clear();
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
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF:
				return DEFINITION_REF_EDEFAULT == null ? definitionRef != null : !DEFINITION_REF_EDEFAULT.equals(definitionRef);
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION:
				return ECUC_DEF_EDITION_EDEFAULT == null ? ecucDefEdition != null : !ECUC_DEF_EDITION_EDEFAULT.equals(ecucDefEdition);
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT:
				return implementationConfigVariant != IMPLEMENTATION_CONFIG_VARIANT_EDEFAULT;
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER:
				return container != null && !container.isEmpty();
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
		result.append(" (definitionRef: ");
		result.append(definitionRef);
		result.append(", ecucDefEdition: ");
		result.append(ecucDefEdition);
		result.append(", implementationConfigVariant: ");
		result.append(implementationConfigVariant);
		result.append(')');
		return result.toString();
	}

} //EcucModuleConfigurationValuesImpl
