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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Task Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsTaskId <em>Os Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsTaskPriority <em>Os Task Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskEventImpl extends ModuleObjectImpl implements OsTaskEvent {
	/**
	 * The default value of the '{@link #getOsTaskId() <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskId() <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskId()
	 * @generated
	 * @ordered
	 */
	protected String osTaskId = OS_TASK_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> osEventId;

	/**
	 * The default value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskPriority = OS_TASK_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_TASK_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsTaskId() {
		return osTaskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskId(String newOsTaskId) {
		String oldOsTaskId = osTaskId;
		osTaskId = newOsTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__OS_TASK_ID, oldOsTaskId, osTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOsEventId() {
		if (osEventId == null) {
			osEventId = new EDataTypeUniqueEList<String>(String.class, this, ModulePackage.OS_TASK_EVENT__OS_EVENT_ID);
		}
		return osEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskPriority() {
		return osTaskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskPriority(Integer newOsTaskPriority) {
		Integer oldOsTaskPriority = osTaskPriority;
		osTaskPriority = newOsTaskPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY, oldOsTaskPriority, osTaskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				return getOsTaskId();
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				return getOsEventId();
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
				return getOsTaskPriority();
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				setOsTaskId((String)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				getOsEventId().clear();
				getOsEventId().addAll((Collection<? extends String>)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
				setOsTaskPriority((Integer)newValue);
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				setOsTaskId(OS_TASK_ID_EDEFAULT);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				getOsEventId().clear();
				return;
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
				setOsTaskPriority(OS_TASK_PRIORITY_EDEFAULT);
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				return OS_TASK_ID_EDEFAULT == null ? osTaskId != null : !OS_TASK_ID_EDEFAULT.equals(osTaskId);
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				return osEventId != null && !osEventId.isEmpty();
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
				return OS_TASK_PRIORITY_EDEFAULT == null ? osTaskPriority != null : !OS_TASK_PRIORITY_EDEFAULT.equals(osTaskPriority);
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
		result.append(" (osTaskId: ");
		result.append(osTaskId);
		result.append(", osEventId: ");
		result.append(osEventId);
		result.append(", osTaskPriority: ");
		result.append(osTaskPriority);
		result.append(')');
		return result.toString();
	}

} //OsTaskEventImpl
