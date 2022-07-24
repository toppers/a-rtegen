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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Every NFilter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getOccurrenceVariable <em>Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneEveryNFilterOperationImpl extends FilterOperationImpl implements OneEveryNFilterOperation {
	/**
	 * The cached value of the '{@link #getOccurrenceVariable() <em>Occurrence Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable occurrenceVariable;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Constant period;
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Constant offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneEveryNFilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.ONE_EVERY_NFILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getOccurrenceVariable() {
		if (occurrenceVariable != null && ((EObject)occurrenceVariable).eIsProxy()) {
			InternalEObject oldOccurrenceVariable = (InternalEObject)occurrenceVariable;
			occurrenceVariable = (GlobalVariable)eResolveProxy(oldOccurrenceVariable);
			if (occurrenceVariable != oldOccurrenceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE, oldOccurrenceVariable, occurrenceVariable));
			}
		}
		return occurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetOccurrenceVariable() {
		return occurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceVariable(GlobalVariable newOccurrenceVariable) {
		GlobalVariable oldOccurrenceVariable = occurrenceVariable;
		occurrenceVariable = newOccurrenceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE, oldOccurrenceVariable, occurrenceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getPeriod() {
		if (period != null && ((EObject)period).eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Constant)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Constant newPeriod) {
		Constant oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getOffset() {
		if (offset != null && ((EObject)offset).eIsProxy()) {
			InternalEObject oldOffset = (InternalEObject)offset;
			offset = (Constant)eResolveProxy(oldOffset);
			if (offset != oldOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET, oldOffset, offset));
			}
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Constant newOffset) {
		Constant oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				if (resolve) return getOccurrenceVariable();
				return basicGetOccurrenceVariable();
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				setOccurrenceVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				setPeriod((Constant)newValue);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				setOffset((Constant)newValue);
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				setOccurrenceVariable((GlobalVariable)null);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				setPeriod((Constant)null);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				setOffset((Constant)null);
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				return occurrenceVariable != null;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				return period != null;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //OneEveryNFilterOperationImpl
