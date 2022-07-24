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

import java.lang.reflect.InvocationTargetException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getBaseTypeEncoding <em>Base Type Encoding</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getBaseTypeSize <em>Base Type Size</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getNativeDeclaration <em>Native Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwBaseTypeImpl extends ArElementImpl implements SwBaseType {
	/**
	 * The default value of the '{@link #getBaseTypeEncoding() <em>Base Type Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_ENCODING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseTypeEncoding() <em>Base Type Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeEncoding()
	 * @generated
	 * @ordered
	 */
	protected String baseTypeEncoding = BASE_TYPE_ENCODING_EDEFAULT;
	/**
	 * The default value of the '{@link #getBaseTypeSize() <em>Base Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BASE_TYPE_SIZE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseTypeSize() <em>Base Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeSize()
	 * @generated
	 * @ordered
	 */
	protected Integer baseTypeSize = BASE_TYPE_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNativeDeclaration() <em>Native Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_DECLARATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNativeDeclaration() <em>Native Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String nativeDeclaration = NATIVE_DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTypeEncoding() {
		return baseTypeEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeEncoding(String newBaseTypeEncoding) {
		String oldBaseTypeEncoding = baseTypeEncoding;
		baseTypeEncoding = newBaseTypeEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING, oldBaseTypeEncoding, baseTypeEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBaseTypeSize() {
		return baseTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeSize(Integer newBaseTypeSize) {
		Integer oldBaseTypeSize = baseTypeSize;
		baseTypeSize = newBaseTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE, oldBaseTypeSize, baseTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNativeDeclaration() {
		return nativeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeDeclaration(String newNativeDeclaration) {
		String oldNativeDeclaration = nativeDeclaration;
		nativeDeclaration = newNativeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__NATIVE_DECLARATION, oldNativeDeclaration, nativeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getUpperLimitForUnsignedInteger() {
		return Integer.valueOf((int)Math.pow(2, baseTypeSize) - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				return getBaseTypeEncoding();
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				return getBaseTypeSize();
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				return getNativeDeclaration();
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				setBaseTypeEncoding((String)newValue);
				return;
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				setBaseTypeSize((Integer)newValue);
				return;
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				setNativeDeclaration((String)newValue);
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				setBaseTypeEncoding(BASE_TYPE_ENCODING_EDEFAULT);
				return;
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				setBaseTypeSize(BASE_TYPE_SIZE_EDEFAULT);
				return;
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				setNativeDeclaration(NATIVE_DECLARATION_EDEFAULT);
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				return BASE_TYPE_ENCODING_EDEFAULT == null ? baseTypeEncoding != null : !BASE_TYPE_ENCODING_EDEFAULT.equals(baseTypeEncoding);
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				return BASE_TYPE_SIZE_EDEFAULT == null ? baseTypeSize != null : !BASE_TYPE_SIZE_EDEFAULT.equals(baseTypeSize);
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				return NATIVE_DECLARATION_EDEFAULT == null ? nativeDeclaration != null : !NATIVE_DECLARATION_EDEFAULT.equals(nativeDeclaration);
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
			case M2Package.SW_BASE_TYPE___GET_UPPER_LIMIT_FOR_UNSIGNED_INTEGER:
				return getUpperLimitForUnsignedInteger();
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
		result.append(" (baseTypeEncoding: ");
		result.append(baseTypeEncoding);
		result.append(", baseTypeSize: ");
		result.append(baseTypeSize);
		result.append(", nativeDeclaration: ");
		result.append(nativeDeclaration);
		result.append(')');
		return result.toString();
	}

} //SwBaseTypeImpl
