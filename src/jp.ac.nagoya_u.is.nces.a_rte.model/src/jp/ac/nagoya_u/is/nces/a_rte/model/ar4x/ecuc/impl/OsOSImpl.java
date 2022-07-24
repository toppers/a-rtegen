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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSystemCycle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os OS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl#getOsNumberOfCores <em>Os Number Of Cores</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl#getOsMasterCoreId <em>Os Master Core Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl#getOsSystemCycle <em>Os System Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsOSImpl extends EcucContainerImpl implements OsOS {
	/**
	 * The default value of the '{@link #getOsNumberOfCores() <em>Os Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_NUMBER_OF_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsNumberOfCores() <em>Os Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected Integer osNumberOfCores = OS_NUMBER_OF_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsMasterCoreId() <em>Os Master Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsMasterCoreId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_MASTER_CORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsMasterCoreId() <em>Os Master Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsMasterCoreId()
	 * @generated
	 * @ordered
	 */
	protected Integer osMasterCoreId = OS_MASTER_CORE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsSystemCycle() <em>Os System Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSystemCycle()
	 * @generated
	 * @ordered
	 */
	protected OsSystemCycle osSystemCycle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsOSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_OS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsNumberOfCores() {
		return osNumberOfCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsNumberOfCores(Integer newOsNumberOfCores) {
		Integer oldOsNumberOfCores = osNumberOfCores;
		osNumberOfCores = newOsNumberOfCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_OS__OS_NUMBER_OF_CORES, oldOsNumberOfCores, osNumberOfCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsMasterCoreId() {
		return osMasterCoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsMasterCoreId(Integer newOsMasterCoreId) {
		Integer oldOsMasterCoreId = osMasterCoreId;
		osMasterCoreId = newOsMasterCoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_OS__OS_MASTER_CORE_ID, oldOsMasterCoreId, osMasterCoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSystemCycle getOsSystemCycle() {
		return osSystemCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsSystemCycle(OsSystemCycle newOsSystemCycle, NotificationChain msgs) {
		OsSystemCycle oldOsSystemCycle = osSystemCycle;
		osSystemCycle = newOsSystemCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.OS_OS__OS_SYSTEM_CYCLE, oldOsSystemCycle, newOsSystemCycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsSystemCycle(OsSystemCycle newOsSystemCycle) {
		if (newOsSystemCycle != osSystemCycle) {
			NotificationChain msgs = null;
			if (osSystemCycle != null)
				msgs = ((InternalEObject)osSystemCycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS_OS__OS_SYSTEM_CYCLE, null, msgs);
			if (newOsSystemCycle != null)
				msgs = ((InternalEObject)newOsSystemCycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS_OS__OS_SYSTEM_CYCLE, null, msgs);
			msgs = basicSetOsSystemCycle(newOsSystemCycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_OS__OS_SYSTEM_CYCLE, newOsSystemCycle, newOsSystemCycle));
	}

	/**
	 * The cached invocation delegate for the '{@link #isMulticoreOs() <em>Is Multicore Os</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticoreOs()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MULTICORE_OS__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.OS_OS___IS_MULTICORE_OS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticoreOs() {
		try {
			return (Boolean)IS_MULTICORE_OS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case EcucPackage.OS_OS__OS_SYSTEM_CYCLE:
				return basicSetOsSystemCycle(null, msgs);
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
			case EcucPackage.OS_OS__OS_NUMBER_OF_CORES:
				return getOsNumberOfCores();
			case EcucPackage.OS_OS__OS_MASTER_CORE_ID:
				return getOsMasterCoreId();
			case EcucPackage.OS_OS__OS_SYSTEM_CYCLE:
				return getOsSystemCycle();
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
			case EcucPackage.OS_OS__OS_NUMBER_OF_CORES:
				setOsNumberOfCores((Integer)newValue);
				return;
			case EcucPackage.OS_OS__OS_MASTER_CORE_ID:
				setOsMasterCoreId((Integer)newValue);
				return;
			case EcucPackage.OS_OS__OS_SYSTEM_CYCLE:
				setOsSystemCycle((OsSystemCycle)newValue);
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
			case EcucPackage.OS_OS__OS_NUMBER_OF_CORES:
				setOsNumberOfCores(OS_NUMBER_OF_CORES_EDEFAULT);
				return;
			case EcucPackage.OS_OS__OS_MASTER_CORE_ID:
				setOsMasterCoreId(OS_MASTER_CORE_ID_EDEFAULT);
				return;
			case EcucPackage.OS_OS__OS_SYSTEM_CYCLE:
				setOsSystemCycle((OsSystemCycle)null);
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
			case EcucPackage.OS_OS__OS_NUMBER_OF_CORES:
				return OS_NUMBER_OF_CORES_EDEFAULT == null ? osNumberOfCores != null : !OS_NUMBER_OF_CORES_EDEFAULT.equals(osNumberOfCores);
			case EcucPackage.OS_OS__OS_MASTER_CORE_ID:
				return OS_MASTER_CORE_ID_EDEFAULT == null ? osMasterCoreId != null : !OS_MASTER_CORE_ID_EDEFAULT.equals(osMasterCoreId);
			case EcucPackage.OS_OS__OS_SYSTEM_CYCLE:
				return osSystemCycle != null;
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
			case EcucPackage.OS_OS___IS_MULTICORE_OS:
				return isMulticoreOs();
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
		result.append(" (osNumberOfCores: ");
		result.append(osNumberOfCores);
		result.append(", osMasterCoreId: ");
		result.append(osMasterCoreId);
		result.append(')');
		return result.toString();
	}

} //OsOSImpl
