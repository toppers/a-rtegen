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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Queued Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getSendApi <em>Send Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getIocEmptyQueueApi <em>Ioc Empty Queue Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocQueuedCommunicationImpl extends IocCommunicationImpl implements IocQueuedCommunication {
	/**
	 * The cached value of the '{@link #getSendApi() <em>Send Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendApi()
	 * @generated
	 * @ordered
	 */
	protected EList<IocSendApi> sendApi;

	/**
	 * The cached value of the '{@link #getReceiveApi() <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveApi receiveApi;

	/**
	 * The cached value of the '{@link #getIocEmptyQueueApi() <em>Ioc Empty Queue Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocEmptyQueueApi()
	 * @generated
	 * @ordered
	 */
	protected IocEmptyQueueApi iocEmptyQueueApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocQueuedCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_QUEUED_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocSendApi> getSendApi() {
		if (sendApi == null) {
			sendApi = new EObjectContainmentEList<IocSendApi>(IocSendApi.class, this, ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API);
		}
		return sendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveApi getReceiveApi() {
		return receiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveApi(IocReceiveApi newReceiveApi, NotificationChain msgs) {
		IocReceiveApi oldReceiveApi = receiveApi;
		receiveApi = newReceiveApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, oldReceiveApi, newReceiveApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveApi(IocReceiveApi newReceiveApi) {
		if (newReceiveApi != receiveApi) {
			NotificationChain msgs = null;
			if (receiveApi != null)
				msgs = ((InternalEObject)receiveApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, null, msgs);
			if (newReceiveApi != null)
				msgs = ((InternalEObject)newReceiveApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, null, msgs);
			msgs = basicSetReceiveApi(newReceiveApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, newReceiveApi, newReceiveApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocEmptyQueueApi getIocEmptyQueueApi() {
		return iocEmptyQueueApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIocEmptyQueueApi(IocEmptyQueueApi newIocEmptyQueueApi, NotificationChain msgs) {
		IocEmptyQueueApi oldIocEmptyQueueApi = iocEmptyQueueApi;
		iocEmptyQueueApi = newIocEmptyQueueApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, oldIocEmptyQueueApi, newIocEmptyQueueApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocEmptyQueueApi(IocEmptyQueueApi newIocEmptyQueueApi) {
		if (newIocEmptyQueueApi != iocEmptyQueueApi) {
			NotificationChain msgs = null;
			if (iocEmptyQueueApi != null)
				msgs = ((InternalEObject)iocEmptyQueueApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, null, msgs);
			if (newIocEmptyQueueApi != null)
				msgs = ((InternalEObject)newIocEmptyQueueApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, null, msgs);
			msgs = basicSetIocEmptyQueueApi(newIocEmptyQueueApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, newIocEmptyQueueApi, newIocEmptyQueueApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return ((InternalEList<?>)getSendApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return basicSetReceiveApi(null, msgs);
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return basicSetIocEmptyQueueApi(null, msgs);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return getSendApi();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return getReceiveApi();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return getIocEmptyQueueApi();
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				getSendApi().clear();
				getSendApi().addAll((Collection<? extends IocSendApi>)newValue);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveApi)newValue);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				setIocEmptyQueueApi((IocEmptyQueueApi)newValue);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				getSendApi().clear();
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveApi)null);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				setIocEmptyQueueApi((IocEmptyQueueApi)null);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return sendApi != null && !sendApi.isEmpty();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return receiveApi != null;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return iocEmptyQueueApi != null;
		}
		return super.eIsSet(featureID);
	}

} //IocQueuedCommunicationImpl
