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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Module Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl#getCallType <em>Call Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswModuleEntryImpl extends ArElementImpl implements BswModuleEntry {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected Integer serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallType() <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallType()
	 * @generated
	 * @ordered
	 */
	protected static final BswCallTypeEnum CALL_TYPE_EDEFAULT = BswCallTypeEnum.REGULAR;

	/**
	 * The cached value of the '{@link #getCallType() <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallType()
	 * @generated
	 * @ordered
	 */
	protected BswCallTypeEnum callType = CALL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionContext() <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected static final BswExecutionContextEnum EXECUTION_CONTEXT_EDEFAULT = BswExecutionContextEnum.TASK;

	/**
	 * The cached value of the '{@link #getExecutionContext() <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected BswExecutionContextEnum executionContext = EXECUTION_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswModuleEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_MODULE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(Integer newServiceId) {
		Integer oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODULE_ENTRY__SERVICE_ID, oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswCallTypeEnum getCallType() {
		return callType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallType(BswCallTypeEnum newCallType) {
		BswCallTypeEnum oldCallType = callType;
		callType = newCallType == null ? CALL_TYPE_EDEFAULT : newCallType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODULE_ENTRY__CALL_TYPE, oldCallType, callType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswExecutionContextEnum getExecutionContext() {
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(BswExecutionContextEnum newExecutionContext) {
		BswExecutionContextEnum oldExecutionContext = executionContext;
		executionContext = newExecutionContext == null ? EXECUTION_CONTEXT_EDEFAULT : newExecutionContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODULE_ENTRY__EXECUTION_CONTEXT, oldExecutionContext, executionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.BSW_MODULE_ENTRY__SERVICE_ID:
				return getServiceId();
			case M2Package.BSW_MODULE_ENTRY__CALL_TYPE:
				return getCallType();
			case M2Package.BSW_MODULE_ENTRY__EXECUTION_CONTEXT:
				return getExecutionContext();
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
			case M2Package.BSW_MODULE_ENTRY__SERVICE_ID:
				setServiceId((Integer)newValue);
				return;
			case M2Package.BSW_MODULE_ENTRY__CALL_TYPE:
				setCallType((BswCallTypeEnum)newValue);
				return;
			case M2Package.BSW_MODULE_ENTRY__EXECUTION_CONTEXT:
				setExecutionContext((BswExecutionContextEnum)newValue);
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
			case M2Package.BSW_MODULE_ENTRY__SERVICE_ID:
				setServiceId(SERVICE_ID_EDEFAULT);
				return;
			case M2Package.BSW_MODULE_ENTRY__CALL_TYPE:
				setCallType(CALL_TYPE_EDEFAULT);
				return;
			case M2Package.BSW_MODULE_ENTRY__EXECUTION_CONTEXT:
				setExecutionContext(EXECUTION_CONTEXT_EDEFAULT);
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
			case M2Package.BSW_MODULE_ENTRY__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
			case M2Package.BSW_MODULE_ENTRY__CALL_TYPE:
				return callType != CALL_TYPE_EDEFAULT;
			case M2Package.BSW_MODULE_ENTRY__EXECUTION_CONTEXT:
				return executionContext != EXECUTION_CONTEXT_EDEFAULT;
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
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(", callType: ");
		result.append(callType);
		result.append(", executionContext: ");
		result.append(executionContext);
		result.append(')');
		return result.toString();
	}

} //BswModuleEntryImpl
