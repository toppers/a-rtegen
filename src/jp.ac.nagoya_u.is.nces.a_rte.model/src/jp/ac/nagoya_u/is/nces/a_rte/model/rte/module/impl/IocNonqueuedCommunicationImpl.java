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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Nonqueued Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl#getWriteApi <em>Write Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl#getReadApi <em>Read Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl#getInitValueVariable <em>Init Value Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocNonqueuedCommunicationImpl extends IocCommunicationImpl implements IocNonqueuedCommunication {
	/**
	 * The cached value of the '{@link #getWriteApi() <em>Write Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteApi()
	 * @generated
	 * @ordered
	 */
	protected EList<IocWriteApi> writeApi;

	/**
	 * The cached value of the '{@link #getReadApi() <em>Read Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadApi()
	 * @generated
	 * @ordered
	 */
	protected IocReadApi readApi;

	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected Constant initValue;

	/**
	 * The cached value of the '{@link #getInitValueVariable() <em>Init Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable initValueVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocNonqueuedCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocWriteApi> getWriteApi() {
		if (writeApi == null) {
			writeApi = new EObjectContainmentWithInverseEList<IocWriteApi>(IocWriteApi.class, this, ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API, ModulePackage.IOC_WRITE_API__PARENT);
		}
		return writeApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReadApi getReadApi() {
		return readApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadApi(IocReadApi newReadApi, NotificationChain msgs) {
		IocReadApi oldReadApi = readApi;
		readApi = newReadApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API, oldReadApi, newReadApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadApi(IocReadApi newReadApi) {
		if (newReadApi != readApi) {
			NotificationChain msgs = null;
			if (readApi != null)
				msgs = ((InternalEObject)readApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API, null, msgs);
			if (newReadApi != null)
				msgs = ((InternalEObject)newReadApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API, null, msgs);
			msgs = basicSetReadApi(newReadApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API, newReadApi, newReadApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitValue() {
		if (initValue != null && ((EObject)initValue).eIsProxy()) {
			InternalEObject oldInitValue = (InternalEObject)initValue;
			initValue = (Constant)eResolveProxy(oldInitValue);
			if (initValue != oldInitValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE, oldInitValue, initValue));
			}
		}
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValue(Constant newInitValue) {
		Constant oldInitValue = initValue;
		initValue = newInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE, oldInitValue, initValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getInitValueVariable() {
		if (initValueVariable != null && ((EObject)initValueVariable).eIsProxy()) {
			InternalEObject oldInitValueVariable = (InternalEObject)initValueVariable;
			initValueVariable = (GlobalVariable)eResolveProxy(oldInitValueVariable);
			if (initValueVariable != oldInitValueVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE, oldInitValueVariable, initValueVariable));
			}
		}
		return initValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetInitValueVariable() {
		return initValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValueVariable(GlobalVariable newInitValueVariable) {
		GlobalVariable oldInitValueVariable = initValueVariable;
		initValueVariable = newInitValueVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE, oldInitValueVariable, initValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWriteApi()).basicAdd(otherEnd, msgs);
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
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				return ((InternalEList<?>)getWriteApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
				return basicSetReadApi(null, msgs);
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
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				return getWriteApi();
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
				return getReadApi();
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE:
				if (resolve) return getInitValue();
				return basicGetInitValue();
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE:
				if (resolve) return getInitValueVariable();
				return basicGetInitValueVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				getWriteApi().clear();
				getWriteApi().addAll((Collection<? extends IocWriteApi>)newValue);
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
				setReadApi((IocReadApi)newValue);
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE:
				setInitValue((Constant)newValue);
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE:
				setInitValueVariable((GlobalVariable)newValue);
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
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				getWriteApi().clear();
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
				setReadApi((IocReadApi)null);
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE:
				setInitValue((Constant)null);
				return;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE:
				setInitValueVariable((GlobalVariable)null);
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
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
				return writeApi != null && !writeApi.isEmpty();
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
				return readApi != null;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE:
				return initValue != null;
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE:
				return initValueVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //IocNonqueuedCommunicationImpl
