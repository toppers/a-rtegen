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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Pointer Target Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl#getTargetCategory <em>Target Category</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl#getSwDataDefProps <em>Sw Data Def Props</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwPointerTargetPropsImpl extends M2ObjectImpl implements SwPointerTargetProps {
	/**
	 * The default value of the '{@link #getTargetCategory() <em>Target Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCategory() <em>Target Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected String targetCategory = TARGET_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwDataDefProps() <em>Sw Data Def Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwDataDefProps()
	 * @generated
	 * @ordered
	 */
	protected SwDataDefProps swDataDefProps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwPointerTargetPropsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_POINTER_TARGET_PROPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCategory() {
		return targetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCategory(String newTargetCategory) {
		String oldTargetCategory = targetCategory;
		targetCategory = newTargetCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY, oldTargetCategory, targetCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwDataDefProps getSwDataDefProps() {
		return swDataDefProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwDataDefProps(SwDataDefProps newSwDataDefProps, NotificationChain msgs) {
		SwDataDefProps oldSwDataDefProps = swDataDefProps;
		swDataDefProps = newSwDataDefProps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, oldSwDataDefProps, newSwDataDefProps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwDataDefProps(SwDataDefProps newSwDataDefProps) {
		if (newSwDataDefProps != swDataDefProps) {
			NotificationChain msgs = null;
			if (swDataDefProps != null)
				msgs = ((InternalEObject)swDataDefProps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, null, msgs);
			if (newSwDataDefProps != null)
				msgs = ((InternalEObject)newSwDataDefProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, null, msgs);
			msgs = basicSetSwDataDefProps(newSwDataDefProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, newSwDataDefProps, newSwDataDefProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				return basicSetSwDataDefProps(null, msgs);
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				return getTargetCategory();
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				return getSwDataDefProps();
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				setTargetCategory((String)newValue);
				return;
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)newValue);
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				setTargetCategory(TARGET_CATEGORY_EDEFAULT);
				return;
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)null);
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				return TARGET_CATEGORY_EDEFAULT == null ? targetCategory != null : !TARGET_CATEGORY_EDEFAULT.equals(targetCategory);
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				return swDataDefProps != null;
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
		result.append(" (targetCategory: ");
		result.append(targetCategory);
		result.append(')');
		return result.toString();
	}

} //SwPointerTargetPropsImpl
