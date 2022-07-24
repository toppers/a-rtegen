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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISignal To IPdu Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl#getISignal <em>ISignal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl#getISignalGroup <em>ISignal Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISignalToIPduMappingImpl extends IdentifiableImpl implements ISignalToIPduMapping {
	/**
	 * The cached value of the '{@link #getISignal() <em>ISignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISignal()
	 * @generated
	 * @ordered
	 */
	protected ISignal iSignal;

	/**
	 * The cached value of the '{@link #getISignalGroup() <em>ISignal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISignalGroup()
	 * @generated
	 * @ordered
	 */
	protected ISignalGroup iSignalGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISignalToIPduMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ISIGNAL_TO_IPDU_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignal getISignal() {
		if (iSignal != null && ((EObject)iSignal).eIsProxy()) {
			InternalEObject oldISignal = (InternalEObject)iSignal;
			iSignal = (ISignal)eResolveProxy(oldISignal);
			if (iSignal != oldISignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL, oldISignal, iSignal));
			}
		}
		return iSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignal basicGetISignal() {
		return iSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISignal(ISignal newISignal) {
		ISignal oldISignal = iSignal;
		iSignal = newISignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL, oldISignal, iSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalGroup getISignalGroup() {
		if (iSignalGroup != null && ((EObject)iSignalGroup).eIsProxy()) {
			InternalEObject oldISignalGroup = (InternalEObject)iSignalGroup;
			iSignalGroup = (ISignalGroup)eResolveProxy(oldISignalGroup);
			if (iSignalGroup != oldISignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP, oldISignalGroup, iSignalGroup));
			}
		}
		return iSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalGroup basicGetISignalGroup() {
		return iSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISignalGroup(ISignalGroup newISignalGroup) {
		ISignalGroup oldISignalGroup = iSignalGroup;
		iSignalGroup = newISignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP, oldISignalGroup, iSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL:
				if (resolve) return getISignal();
				return basicGetISignal();
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP:
				if (resolve) return getISignalGroup();
				return basicGetISignalGroup();
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
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL:
				setISignal((ISignal)newValue);
				return;
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP:
				setISignalGroup((ISignalGroup)newValue);
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
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL:
				setISignal((ISignal)null);
				return;
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP:
				setISignalGroup((ISignalGroup)null);
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
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL:
				return iSignal != null;
			case M2Package.ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP:
				return iSignalGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ISignalToIPduMappingImpl
