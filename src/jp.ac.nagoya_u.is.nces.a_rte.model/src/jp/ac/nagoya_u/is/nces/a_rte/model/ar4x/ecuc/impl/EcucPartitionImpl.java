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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getEcucPartitionBswModuleExecution <em>Ecuc Partition Bsw Module Execution</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getPartitionCanBeRestarted <em>Partition Can Be Restarted</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getEcucPartitionSoftwareComponent <em>Ecuc Partition Software Component</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getImplOsApplication <em>Impl Os Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucPartitionImpl extends EcucContainerImpl implements EcucPartition {
	/**
	 * The default value of the '{@link #getEcucPartitionBswModuleExecution() <em>Ecuc Partition Bsw Module Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionBswModuleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcucPartitionBswModuleExecution() <em>Ecuc Partition Bsw Module Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionBswModuleExecution()
	 * @generated
	 * @ordered
	 */
	protected Boolean ecucPartitionBswModuleExecution = ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionCanBeRestarted() <em>Partition Can Be Restarted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionCanBeRestarted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARTITION_CAN_BE_RESTARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionCanBeRestarted() <em>Partition Can Be Restarted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionCanBeRestarted()
	 * @generated
	 * @ordered
	 */
	protected Boolean partitionCanBeRestarted = PARTITION_CAN_BE_RESTARTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEcucPartitionSoftwareComponent() <em>Ecuc Partition Software Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionSoftwareComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SwComponentInstanceInSystem> ecucPartitionSoftwareComponent;

	/**
	 * The cached value of the '{@link #getImplOsApplication() <em>Impl Os Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplOsApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> implOsApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.ECUC_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEcucPartitionBswModuleExecution() {
		return ecucPartitionBswModuleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcucPartitionBswModuleExecution(Boolean newEcucPartitionBswModuleExecution) {
		Boolean oldEcucPartitionBswModuleExecution = ecucPartitionBswModuleExecution;
		ecucPartitionBswModuleExecution = newEcucPartitionBswModuleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, oldEcucPartitionBswModuleExecution, ecucPartitionBswModuleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPartitionCanBeRestarted() {
		return partitionCanBeRestarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionCanBeRestarted(Boolean newPartitionCanBeRestarted) {
		Boolean oldPartitionCanBeRestarted = partitionCanBeRestarted;
		partitionCanBeRestarted = newPartitionCanBeRestarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED, oldPartitionCanBeRestarted, partitionCanBeRestarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwComponentInstanceInSystem> getEcucPartitionSoftwareComponent() {
		if (ecucPartitionSoftwareComponent == null) {
			ecucPartitionSoftwareComponent = new EObjectWithInverseResolvingEList.ManyInverse<SwComponentInstanceInSystem>(SwComponentInstanceInSystem.class, this, EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION);
		}
		return ecucPartitionSoftwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getImplOsApplication() {
		if (implOsApplication == null) {
			implOsApplication = new EObjectWithInverseResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION, EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION);
		}
		return implOsApplication;
	}

	/**
	 * The cached invocation delegate for the '{@link #isTrusted() <em>Is Trusted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrusted()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TRUSTED__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.ECUC_PARTITION___IS_TRUSTED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrusted() {
		try {
			return (Boolean)IS_TRUSTED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getOwnerCore() <em>Get Owner Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerCore()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_OWNER_CORE__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOwnerCore() {
		try {
			return (Integer)GET_OWNER_CORE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEcucPartitionSoftwareComponent()).basicAdd(otherEnd, msgs);
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplOsApplication()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ((InternalEList<?>)getEcucPartitionSoftwareComponent()).basicRemove(otherEnd, msgs);
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return ((InternalEList<?>)getImplOsApplication()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				return getEcucPartitionBswModuleExecution();
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				return getPartitionCanBeRestarted();
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return getEcucPartitionSoftwareComponent();
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return getImplOsApplication();
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				setEcucPartitionBswModuleExecution((Boolean)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				setPartitionCanBeRestarted((Boolean)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				getEcucPartitionSoftwareComponent().clear();
				getEcucPartitionSoftwareComponent().addAll((Collection<? extends SwComponentInstanceInSystem>)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				getImplOsApplication().clear();
				getImplOsApplication().addAll((Collection<? extends OsApplication>)newValue);
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				setEcucPartitionBswModuleExecution(ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT);
				return;
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				setPartitionCanBeRestarted(PARTITION_CAN_BE_RESTARTED_EDEFAULT);
				return;
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				getEcucPartitionSoftwareComponent().clear();
				return;
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				getImplOsApplication().clear();
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
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				return ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT == null ? ecucPartitionBswModuleExecution != null : !ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT.equals(ecucPartitionBswModuleExecution);
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				return PARTITION_CAN_BE_RESTARTED_EDEFAULT == null ? partitionCanBeRestarted != null : !PARTITION_CAN_BE_RESTARTED_EDEFAULT.equals(partitionCanBeRestarted);
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ecucPartitionSoftwareComponent != null && !ecucPartitionSoftwareComponent.isEmpty();
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return implOsApplication != null && !implOsApplication.isEmpty();
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
			case EcucPackage.ECUC_PARTITION___IS_TRUSTED:
				return isTrusted();
			case EcucPackage.ECUC_PARTITION___GET_OWNER_CORE:
				return getOwnerCore();
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
		result.append(" (ecucPartitionBswModuleExecution: ");
		result.append(ecucPartitionBswModuleExecution);
		result.append(", partitionCanBeRestarted: ");
		result.append(partitionCanBeRestarted);
		result.append(')');
		return result.toString();
	}

} //EcucPartitionImpl
