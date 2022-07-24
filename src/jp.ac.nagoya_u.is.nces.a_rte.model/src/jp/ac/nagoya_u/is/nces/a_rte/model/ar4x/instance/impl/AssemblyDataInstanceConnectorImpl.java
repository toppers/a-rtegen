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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Data Instance Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl#getRequester <em>Requester</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyDataInstanceConnectorImpl extends ExtendedEObjectImpl implements AssemblyDataInstanceConnector {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInComposition provider;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInComposition requester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyDataInstanceConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ASSEMBLY_DATA_INSTANCE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition getProvider() {
		if (provider != null && ((EObject)provider).eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (VariableDataInstanceInComposition)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(VariableDataInstanceInComposition newProvider, NotificationChain msgs) {
		VariableDataInstanceInComposition oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(VariableDataInstanceInComposition newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition getRequester() {
		if (requester != null && ((EObject)requester).eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (VariableDataInstanceInComposition)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(VariableDataInstanceInComposition newRequester, NotificationChain msgs) {
		VariableDataInstanceInComposition oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(VariableDataInstanceInComposition newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				if (provider != null)
					msgs = ((InternalEObject)provider).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
				return basicSetProvider((VariableDataInstanceInComposition)otherEnd, msgs);
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				if (requester != null)
					msgs = ((InternalEObject)requester).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION, VariableDataInstanceInComposition.class, msgs);
				return basicSetRequester((VariableDataInstanceInComposition)otherEnd, msgs);
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
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				return basicSetProvider(null, msgs);
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				return basicSetRequester(null, msgs);
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
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
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
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				setProvider((VariableDataInstanceInComposition)newValue);
				return;
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				setRequester((VariableDataInstanceInComposition)newValue);
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
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				setProvider((VariableDataInstanceInComposition)null);
				return;
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				setRequester((VariableDataInstanceInComposition)null);
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
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER:
				return provider != null;
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER:
				return requester != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyDataInstanceConnectorImpl
