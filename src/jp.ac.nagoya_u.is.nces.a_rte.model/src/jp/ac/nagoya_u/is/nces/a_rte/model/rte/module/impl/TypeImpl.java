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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getIsAnonymous <em>Is Anonymous</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSignedness <em>Signedness</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getOriginalTypeSymbolName <em>Original Type Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends ModuleReferrableImpl implements Type {
	/**
	 * The default value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String symbolName = SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ANONYMOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAnonymous = IS_ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected static final SignednessEnum SIGNEDNESS_EDEFAULT = SignednessEnum.SIGNED;

	/**
	 * The cached value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected SignednessEnum signedness = SIGNEDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalTypeSymbolName() <em>Original Type Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTypeSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalTypeSymbolName() <em>Original Type Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTypeSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String originalTypeSymbolName = ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolName() {
		return symbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolName(String newSymbolName) {
		String oldSymbolName = symbolName;
		symbolName = newSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SYMBOL_NAME, oldSymbolName, symbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAnonymous() {
		return isAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAnonymous(Boolean newIsAnonymous) {
		Boolean oldIsAnonymous = isAnonymous;
		isAnonymous = newIsAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__IS_ANONYMOUS, oldIsAnonymous, isAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignednessEnum getSignedness() {
		return signedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedness(SignednessEnum newSignedness) {
		SignednessEnum oldSignedness = signedness;
		signedness = newSignedness == null ? SIGNEDNESS_EDEFAULT : newSignedness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SIGNEDNESS, oldSignedness, signedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalTypeSymbolName() {
		return originalTypeSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalTypeSymbolName(String newOriginalTypeSymbolName) {
		String oldOriginalTypeSymbolName = originalTypeSymbolName;
		originalTypeSymbolName = newOriginalTypeSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME, oldOriginalTypeSymbolName, originalTypeSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TYPE__SYMBOL_NAME:
				return getSymbolName();
			case ModulePackage.TYPE__IS_ANONYMOUS:
				return getIsAnonymous();
			case ModulePackage.TYPE__SIGNEDNESS:
				return getSignedness();
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				return getOriginalTypeSymbolName();
			case ModulePackage.TYPE__SIZE:
				return getSize();
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				setSymbolName((String)newValue);
				return;
			case ModulePackage.TYPE__IS_ANONYMOUS:
				setIsAnonymous((Boolean)newValue);
				return;
			case ModulePackage.TYPE__SIGNEDNESS:
				setSignedness((SignednessEnum)newValue);
				return;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				setOriginalTypeSymbolName((String)newValue);
				return;
			case ModulePackage.TYPE__SIZE:
				setSize((Integer)newValue);
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				setSymbolName(SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.TYPE__IS_ANONYMOUS:
				setIsAnonymous(IS_ANONYMOUS_EDEFAULT);
				return;
			case ModulePackage.TYPE__SIGNEDNESS:
				setSignedness(SIGNEDNESS_EDEFAULT);
				return;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				setOriginalTypeSymbolName(ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				return SYMBOL_NAME_EDEFAULT == null ? symbolName != null : !SYMBOL_NAME_EDEFAULT.equals(symbolName);
			case ModulePackage.TYPE__IS_ANONYMOUS:
				return IS_ANONYMOUS_EDEFAULT == null ? isAnonymous != null : !IS_ANONYMOUS_EDEFAULT.equals(isAnonymous);
			case ModulePackage.TYPE__SIGNEDNESS:
				return signedness != SIGNEDNESS_EDEFAULT;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				return ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT == null ? originalTypeSymbolName != null : !ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT.equals(originalTypeSymbolName);
			case ModulePackage.TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (symbolName: ");
		result.append(symbolName);
		result.append(", isAnonymous: ");
		result.append(isAnonymous);
		result.append(", signedness: ");
		result.append(signedness);
		result.append(", originalTypeSymbolName: ");
		result.append(originalTypeSymbolName);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
