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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl#getComSignal <em>Com Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl#getComSignalGroup <em>Com Signal Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComSendImplementationImpl extends SendImplementationImpl implements ComSendImplementation {
	/**
	 * The cached value of the '{@link #getComSignal() <em>Com Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignal()
	 * @generated
	 * @ordered
	 */
	protected ComSignal comSignal;

	/**
	 * The cached value of the '{@link #getComSignalGroup() <em>Com Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected ComSignalGroup comSignalGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.COM_SEND_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal getComSignal() {
		if (comSignal != null && ((EObject)comSignal).eIsProxy()) {
			InternalEObject oldComSignal = (InternalEObject)comSignal;
			comSignal = (ComSignal)eResolveProxy(oldComSignal);
			if (comSignal != oldComSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL, oldComSignal, comSignal));
			}
		}
		return comSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal basicGetComSignal() {
		return comSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSignal(ComSignal newComSignal) {
		ComSignal oldComSignal = comSignal;
		comSignal = newComSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL, oldComSignal, comSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup getComSignalGroup() {
		if (comSignalGroup != null && ((EObject)comSignalGroup).eIsProxy()) {
			InternalEObject oldComSignalGroup = (InternalEObject)comSignalGroup;
			comSignalGroup = (ComSignalGroup)eResolveProxy(oldComSignalGroup);
			if (comSignalGroup != oldComSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP, oldComSignalGroup, comSignalGroup));
			}
		}
		return comSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup basicGetComSignalGroup() {
		return comSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSignalGroup(ComSignalGroup newComSignalGroup) {
		ComSignalGroup oldComSignalGroup = comSignalGroup;
		comSignalGroup = newComSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP, oldComSignalGroup, comSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL:
				if (resolve) return getComSignal();
				return basicGetComSignal();
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP:
				if (resolve) return getComSignalGroup();
				return basicGetComSignalGroup();
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
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL:
				setComSignal((ComSignal)newValue);
				return;
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP:
				setComSignalGroup((ComSignalGroup)newValue);
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
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL:
				setComSignal((ComSignal)null);
				return;
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP:
				setComSignalGroup((ComSignalGroup)null);
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
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL:
				return comSignal != null;
			case InteractionPackage.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP:
				return comSignalGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ComSendImplementationImpl
