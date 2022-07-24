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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Trusted Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfParamTypeName <em>Cs Tf Param Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfArgcConstantName <em>Cs Tf Argc Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfOpidConstantName <em>Cs Tf Opid Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfName <em>Cs Tf Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getNeedsCheckArg <em>Needs Check Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TfCallApiImpl extends CallApiImpl implements TfCallApi {
	/**
	 * The default value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_PARAM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected String csTfParamTypeName = CS_TF_PARAM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfArgcConstantName() <em>Cs Tf Argc Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfArgcConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_ARGC_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfArgcConstantName() <em>Cs Tf Argc Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfArgcConstantName()
	 * @generated
	 * @ordered
	 */
	protected String csTfArgcConstantName = CS_TF_ARGC_CONSTANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_OPID_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected String csTfOpidConstantName = CS_TF_OPID_CONSTANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfName() <em>Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfName() <em>Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfName()
	 * @generated
	 * @ordered
	 */
	protected String csTfName = CS_TF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEEDS_CHECK_ARG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected Boolean needsCheckArg = NEEDS_CHECK_ARG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TfCallApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TF_CALL_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfParamTypeName() {
		return csTfParamTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfParamTypeName(String newCsTfParamTypeName) {
		String oldCsTfParamTypeName = csTfParamTypeName;
		csTfParamTypeName = newCsTfParamTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME, oldCsTfParamTypeName, csTfParamTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfArgcConstantName() {
		return csTfArgcConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfArgcConstantName(String newCsTfArgcConstantName) {
		String oldCsTfArgcConstantName = csTfArgcConstantName;
		csTfArgcConstantName = newCsTfArgcConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME, oldCsTfArgcConstantName, csTfArgcConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfOpidConstantName() {
		return csTfOpidConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfOpidConstantName(String newCsTfOpidConstantName) {
		String oldCsTfOpidConstantName = csTfOpidConstantName;
		csTfOpidConstantName = newCsTfOpidConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME, oldCsTfOpidConstantName, csTfOpidConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfName() {
		return csTfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfName(String newCsTfName) {
		String oldCsTfName = csTfName;
		csTfName = newCsTfName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_NAME, oldCsTfName, csTfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNeedsCheckArg() {
		return needsCheckArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCheckArg(Boolean newNeedsCheckArg) {
		Boolean oldNeedsCheckArg = needsCheckArg;
		needsCheckArg = newNeedsCheckArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG, oldNeedsCheckArg, needsCheckArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				return getCsTfParamTypeName();
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				return getCsTfArgcConstantName();
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				return getCsTfOpidConstantName();
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				return getCsTfName();
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				return getNeedsCheckArg();
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				setCsTfArgcConstantName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				setCsTfName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg((Boolean)newValue);
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName(CS_TF_PARAM_TYPE_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				setCsTfArgcConstantName(CS_TF_ARGC_CONSTANT_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName(CS_TF_OPID_CONSTANT_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				setCsTfName(CS_TF_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg(NEEDS_CHECK_ARG_EDEFAULT);
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				return CS_TF_PARAM_TYPE_NAME_EDEFAULT == null ? csTfParamTypeName != null : !CS_TF_PARAM_TYPE_NAME_EDEFAULT.equals(csTfParamTypeName);
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				return CS_TF_ARGC_CONSTANT_NAME_EDEFAULT == null ? csTfArgcConstantName != null : !CS_TF_ARGC_CONSTANT_NAME_EDEFAULT.equals(csTfArgcConstantName);
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				return CS_TF_OPID_CONSTANT_NAME_EDEFAULT == null ? csTfOpidConstantName != null : !CS_TF_OPID_CONSTANT_NAME_EDEFAULT.equals(csTfOpidConstantName);
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				return CS_TF_NAME_EDEFAULT == null ? csTfName != null : !CS_TF_NAME_EDEFAULT.equals(csTfName);
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				return NEEDS_CHECK_ARG_EDEFAULT == null ? needsCheckArg != null : !NEEDS_CHECK_ARG_EDEFAULT.equals(needsCheckArg);
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
		result.append(" (csTfParamTypeName: ");
		result.append(csTfParamTypeName);
		result.append(", csTfArgcConstantName: ");
		result.append(csTfArgcConstantName);
		result.append(", csTfOpidConstantName: ");
		result.append(csTfOpidConstantName);
		result.append(", csTfName: ");
		result.append(csTfName);
		result.append(", needsCheckArg: ");
		result.append(needsCheckArg);
		result.append(')');
		return result.toString();
	}

} //TfCallApiImpl
