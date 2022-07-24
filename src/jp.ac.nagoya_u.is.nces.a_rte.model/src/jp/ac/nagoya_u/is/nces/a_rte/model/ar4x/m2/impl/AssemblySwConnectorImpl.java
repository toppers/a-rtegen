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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Sw Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getProviderIref <em>Provider Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getRequesterIref <em>Requester Iref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblySwConnectorImpl extends SwConnectorImpl implements AssemblySwConnector {
	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition requester;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition provider;

	/**
	 * The cached value of the '{@link #getProviderIref() <em>Provider Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIref()
	 * @generated
	 * @ordered
	 */
	protected PPortPrototypeInCompositionInstanceRef providerIref;

	/**
	 * The cached value of the '{@link #getRequesterIref() <em>Requester Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterIref()
	 * @generated
	 * @ordered
	 */
	protected RPortPrototypeInCompositionInstanceRef requesterIref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblySwConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ASSEMBLY_SW_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getRequester() {
		if (requester != null && ((EObject)requester).eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (PortInstanceInComposition)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(PortInstanceInComposition newRequester) {
		PortInstanceInComposition oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER, oldRequester, requester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getProvider() {
		if (provider != null && ((EObject)provider).eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (PortInstanceInComposition)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(PortInstanceInComposition newProvider) {
		PortInstanceInComposition oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototypeInCompositionInstanceRef getProviderIref() {
		return providerIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIref(PPortPrototypeInCompositionInstanceRef newProviderIref, NotificationChain msgs) {
		PPortPrototypeInCompositionInstanceRef oldProviderIref = providerIref;
		providerIref = newProviderIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, oldProviderIref, newProviderIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIref(PPortPrototypeInCompositionInstanceRef newProviderIref) {
		if (newProviderIref != providerIref) {
			NotificationChain msgs = null;
			if (providerIref != null)
				msgs = ((InternalEObject)providerIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, null, msgs);
			if (newProviderIref != null)
				msgs = ((InternalEObject)newProviderIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, null, msgs);
			msgs = basicSetProviderIref(newProviderIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, newProviderIref, newProviderIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototypeInCompositionInstanceRef getRequesterIref() {
		return requesterIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequesterIref(RPortPrototypeInCompositionInstanceRef newRequesterIref, NotificationChain msgs) {
		RPortPrototypeInCompositionInstanceRef oldRequesterIref = requesterIref;
		requesterIref = newRequesterIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, oldRequesterIref, newRequesterIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequesterIref(RPortPrototypeInCompositionInstanceRef newRequesterIref) {
		if (newRequesterIref != requesterIref) {
			NotificationChain msgs = null;
			if (requesterIref != null)
				msgs = ((InternalEObject)requesterIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, null, msgs);
			if (newRequesterIref != null)
				msgs = ((InternalEObject)newRequesterIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, null, msgs);
			msgs = basicSetRequesterIref(newRequesterIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, newRequesterIref, newRequesterIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return basicSetProviderIref(null, msgs);
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return basicSetRequesterIref(null, msgs);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return getProviderIref();
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return getRequesterIref();
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				setRequester((PortInstanceInComposition)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				setProvider((PortInstanceInComposition)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				setProviderIref((PPortPrototypeInCompositionInstanceRef)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				setRequesterIref((RPortPrototypeInCompositionInstanceRef)newValue);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				setRequester((PortInstanceInComposition)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				setProvider((PortInstanceInComposition)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				setProviderIref((PPortPrototypeInCompositionInstanceRef)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				setRequesterIref((RPortPrototypeInCompositionInstanceRef)null);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				return requester != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				return provider != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return providerIref != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return requesterIref != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblySwConnectorImpl
