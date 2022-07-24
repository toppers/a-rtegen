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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue;
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
 * An implementation of the model object '<em><b>Ecuc Container Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl#getReferenceValue <em>Reference Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl#getSubContainer <em>Sub Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucContainerValueImpl extends IdentifiableImpl implements EcucContainerValue {
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
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucParameterValue> parameterValue;

	/**
	 * The cached value of the '{@link #getReferenceValue() <em>Reference Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucAbstractReferenceValue> referenceValue;

	/**
	 * The cached value of the '{@link #getSubContainer() <em>Sub Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucContainerValue> subContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucContainerValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ECUC_CONTAINER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucContainerValue> getSubContainer() {
		if (subContainer == null) {
			subContainer = new EObjectContainmentEList<EcucContainerValue>(EcucContainerValue.class, this, M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER);
		}
		return subContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucParameterValue> getParameterValue() {
		if (parameterValue == null) {
			parameterValue = new EObjectContainmentEList<EcucParameterValue>(EcucParameterValue.class, this, M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE);
		}
		return parameterValue;
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
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ECUC_CONTAINER_VALUE__DEFINITION_REF, oldDefinitionRef, definitionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucAbstractReferenceValue> getReferenceValue() {
		if (referenceValue == null) {
			referenceValue = new EObjectContainmentEList<EcucAbstractReferenceValue>(EcucAbstractReferenceValue.class, this, M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE);
		}
		return referenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE:
				return ((InternalEList<?>)getParameterValue()).basicRemove(otherEnd, msgs);
			case M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE:
				return ((InternalEList<?>)getReferenceValue()).basicRemove(otherEnd, msgs);
			case M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER:
				return ((InternalEList<?>)getSubContainer()).basicRemove(otherEnd, msgs);
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
			case M2Package.ECUC_CONTAINER_VALUE__DEFINITION_REF:
				return getDefinitionRef();
			case M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE:
				return getParameterValue();
			case M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE:
				return getReferenceValue();
			case M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER:
				return getSubContainer();
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
			case M2Package.ECUC_CONTAINER_VALUE__DEFINITION_REF:
				setDefinitionRef((String)newValue);
				return;
			case M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE:
				getParameterValue().clear();
				getParameterValue().addAll((Collection<? extends EcucParameterValue>)newValue);
				return;
			case M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE:
				getReferenceValue().clear();
				getReferenceValue().addAll((Collection<? extends EcucAbstractReferenceValue>)newValue);
				return;
			case M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER:
				getSubContainer().clear();
				getSubContainer().addAll((Collection<? extends EcucContainerValue>)newValue);
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
			case M2Package.ECUC_CONTAINER_VALUE__DEFINITION_REF:
				setDefinitionRef(DEFINITION_REF_EDEFAULT);
				return;
			case M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE:
				getParameterValue().clear();
				return;
			case M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE:
				getReferenceValue().clear();
				return;
			case M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER:
				getSubContainer().clear();
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
			case M2Package.ECUC_CONTAINER_VALUE__DEFINITION_REF:
				return DEFINITION_REF_EDEFAULT == null ? definitionRef != null : !DEFINITION_REF_EDEFAULT.equals(definitionRef);
			case M2Package.ECUC_CONTAINER_VALUE__PARAMETER_VALUE:
				return parameterValue != null && !parameterValue.isEmpty();
			case M2Package.ECUC_CONTAINER_VALUE__REFERENCE_VALUE:
				return referenceValue != null && !referenceValue.isEmpty();
			case M2Package.ECUC_CONTAINER_VALUE__SUB_CONTAINER:
				return subContainer != null && !subContainer.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EcucContainerValueImpl
