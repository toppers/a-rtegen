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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Ecu Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getSourceSignal <em>Source Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getSourceSignalGroup <em>Source Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteFilter <em>Requires Rte Filter</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteInvalidation <em>Requires Rte Invalidation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteInitialization <em>Requires Rte Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalEcuSenderImpl extends SenderImpl implements ExternalEcuSender {
	/**
	 * The cached value of the '{@link #getSourceSignal() <em>Source Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSignal()
	 * @generated
	 * @ordered
	 */
	protected ComSignal sourceSignal;

	/**
	 * The cached value of the '{@link #getSourceSignalGroup() <em>Source Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected ComSignalGroup sourceSignalGroup;

	/**
	 * The default value of the '{@link #getRequiresRteFilter() <em>Requires Rte Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteFilter() <em>Requires Rte Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteFilter()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteFilter = REQUIRES_RTE_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresRteInvalidation() <em>Requires Rte Invalidation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInvalidation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_INVALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteInvalidation() <em>Requires Rte Invalidation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInvalidation()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteInvalidation = REQUIRES_RTE_INVALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresRteInitialization() <em>Requires Rte Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteInitialization() <em>Requires Rte Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInitialization()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteInitialization = REQUIRES_RTE_INITIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEcuSenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal getSourceSignal() {
		if (sourceSignal != null && ((EObject)sourceSignal).eIsProxy()) {
			InternalEObject oldSourceSignal = (InternalEObject)sourceSignal;
			sourceSignal = (ComSignal)eResolveProxy(oldSourceSignal);
			if (sourceSignal != oldSourceSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, oldSourceSignal, sourceSignal));
			}
		}
		return sourceSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal basicGetSourceSignal() {
		return sourceSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSignal(ComSignal newSourceSignal) {
		ComSignal oldSourceSignal = sourceSignal;
		sourceSignal = newSourceSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, oldSourceSignal, sourceSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup getSourceSignalGroup() {
		if (sourceSignalGroup != null && ((EObject)sourceSignalGroup).eIsProxy()) {
			InternalEObject oldSourceSignalGroup = (InternalEObject)sourceSignalGroup;
			sourceSignalGroup = (ComSignalGroup)eResolveProxy(oldSourceSignalGroup);
			if (sourceSignalGroup != oldSourceSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, oldSourceSignalGroup, sourceSignalGroup));
			}
		}
		return sourceSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup basicGetSourceSignalGroup() {
		return sourceSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSignalGroup(ComSignalGroup newSourceSignalGroup) {
		ComSignalGroup oldSourceSignalGroup = sourceSignalGroup;
		sourceSignalGroup = newSourceSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, oldSourceSignalGroup, sourceSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteFilter() {
		return requiresRteFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteFilter(Boolean newRequiresRteFilter) {
		Boolean oldRequiresRteFilter = requiresRteFilter;
		requiresRteFilter = newRequiresRteFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER, oldRequiresRteFilter, requiresRteFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteInvalidation() {
		return requiresRteInvalidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteInvalidation(Boolean newRequiresRteInvalidation) {
		Boolean oldRequiresRteInvalidation = requiresRteInvalidation;
		requiresRteInvalidation = newRequiresRteInvalidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION, oldRequiresRteInvalidation, requiresRteInvalidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteInitialization() {
		return requiresRteInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteInitialization(Boolean newRequiresRteInitialization) {
		Boolean oldRequiresRteInitialization = requiresRteInitialization;
		requiresRteInitialization = newRequiresRteInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION, oldRequiresRteInitialization, requiresRteInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				if (resolve) return getSourceSignal();
				return basicGetSourceSignal();
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				if (resolve) return getSourceSignalGroup();
				return basicGetSourceSignalGroup();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				return getRequiresRteFilter();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				return getRequiresRteInvalidation();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				return getRequiresRteInitialization();
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				setSourceSignal((ComSignal)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				setSourceSignalGroup((ComSignalGroup)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				setRequiresRteFilter((Boolean)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				setRequiresRteInvalidation((Boolean)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				setRequiresRteInitialization((Boolean)newValue);
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				setSourceSignal((ComSignal)null);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				setSourceSignalGroup((ComSignalGroup)null);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				setRequiresRteFilter(REQUIRES_RTE_FILTER_EDEFAULT);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				setRequiresRteInvalidation(REQUIRES_RTE_INVALIDATION_EDEFAULT);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				setRequiresRteInitialization(REQUIRES_RTE_INITIALIZATION_EDEFAULT);
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				return sourceSignal != null;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				return sourceSignalGroup != null;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				return REQUIRES_RTE_FILTER_EDEFAULT == null ? requiresRteFilter != null : !REQUIRES_RTE_FILTER_EDEFAULT.equals(requiresRteFilter);
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				return REQUIRES_RTE_INVALIDATION_EDEFAULT == null ? requiresRteInvalidation != null : !REQUIRES_RTE_INVALIDATION_EDEFAULT.equals(requiresRteInvalidation);
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				return REQUIRES_RTE_INITIALIZATION_EDEFAULT == null ? requiresRteInitialization != null : !REQUIRES_RTE_INITIALIZATION_EDEFAULT.equals(requiresRteInitialization);
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
		result.append(" (requiresRteFilter: ");
		result.append(requiresRteFilter);
		result.append(", requiresRteInvalidation: ");
		result.append(requiresRteInvalidation);
		result.append(", requiresRteInitialization: ");
		result.append(requiresRteInitialization);
		result.append(')');
		return result.toString();
	}

} //ExternalEcuSenderImpl
