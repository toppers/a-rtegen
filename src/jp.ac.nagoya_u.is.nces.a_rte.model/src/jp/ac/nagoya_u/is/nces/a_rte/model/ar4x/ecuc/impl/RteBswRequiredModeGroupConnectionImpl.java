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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Required Mode Group Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl#getRteBswProvidedModeGroup <em>Rte Bsw Provided Mode Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl#getRteBswRequiredModeGroup <em>Rte Bsw Required Mode Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswRequiredModeGroupConnectionImpl extends EcucContainerImpl implements RteBswRequiredModeGroupConnection {
	/**
	 * The cached value of the '{@link #getRteBswProvidedModeGroup() <em>Rte Bsw Provided Mode Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswProvidedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroupPrototype rteBswProvidedModeGroup;

	/**
	 * The cached value of the '{@link #getRteBswRequiredModeGroup() <em>Rte Bsw Required Mode Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswRequiredModeGroup()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroupPrototype rteBswRequiredModeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswRequiredModeGroupConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswModuleInstance getParent() {
		if (eContainerFeatureID() != EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT) return null;
		return (RteBswModuleInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(RteBswModuleInstance newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(RteBswModuleInstance newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION, RteBswModuleInstance.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype getRteBswProvidedModeGroup() {
		if (rteBswProvidedModeGroup != null && ((EObject)rteBswProvidedModeGroup).eIsProxy()) {
			InternalEObject oldRteBswProvidedModeGroup = (InternalEObject)rteBswProvidedModeGroup;
			rteBswProvidedModeGroup = (ModeDeclarationGroupPrototype)eResolveProxy(oldRteBswProvidedModeGroup);
			if (rteBswProvidedModeGroup != oldRteBswProvidedModeGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, oldRteBswProvidedModeGroup, rteBswProvidedModeGroup));
			}
		}
		return rteBswProvidedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype basicGetRteBswProvidedModeGroup() {
		return rteBswProvidedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswProvidedModeGroup(ModeDeclarationGroupPrototype newRteBswProvidedModeGroup) {
		ModeDeclarationGroupPrototype oldRteBswProvidedModeGroup = rteBswProvidedModeGroup;
		rteBswProvidedModeGroup = newRteBswProvidedModeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, oldRteBswProvidedModeGroup, rteBswProvidedModeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype getRteBswRequiredModeGroup() {
		if (rteBswRequiredModeGroup != null && ((EObject)rteBswRequiredModeGroup).eIsProxy()) {
			InternalEObject oldRteBswRequiredModeGroup = (InternalEObject)rteBswRequiredModeGroup;
			rteBswRequiredModeGroup = (ModeDeclarationGroupPrototype)eResolveProxy(oldRteBswRequiredModeGroup);
			if (rteBswRequiredModeGroup != oldRteBswRequiredModeGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, oldRteBswRequiredModeGroup, rteBswRequiredModeGroup));
			}
		}
		return rteBswRequiredModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype basicGetRteBswRequiredModeGroup() {
		return rteBswRequiredModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswRequiredModeGroup(ModeDeclarationGroupPrototype newRteBswRequiredModeGroup) {
		ModeDeclarationGroupPrototype oldRteBswRequiredModeGroup = rteBswRequiredModeGroup;
		rteBswRequiredModeGroup = newRteBswRequiredModeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, oldRteBswRequiredModeGroup, rteBswRequiredModeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((RteBswModuleInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				return eInternalContainer().eInverseRemove(this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION, RteBswModuleInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				return getParent();
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP:
				if (resolve) return getRteBswProvidedModeGroup();
				return basicGetRteBswProvidedModeGroup();
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP:
				if (resolve) return getRteBswRequiredModeGroup();
				return basicGetRteBswRequiredModeGroup();
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
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				setParent((RteBswModuleInstance)newValue);
				return;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP:
				setRteBswProvidedModeGroup((ModeDeclarationGroupPrototype)newValue);
				return;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP:
				setRteBswRequiredModeGroup((ModeDeclarationGroupPrototype)newValue);
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
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				setParent((RteBswModuleInstance)null);
				return;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP:
				setRteBswProvidedModeGroup((ModeDeclarationGroupPrototype)null);
				return;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP:
				setRteBswRequiredModeGroup((ModeDeclarationGroupPrototype)null);
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
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT:
				return getParent() != null;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP:
				return rteBswProvidedModeGroup != null;
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP:
				return rteBswRequiredModeGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //RteBswRequiredModeGroupConnectionImpl
