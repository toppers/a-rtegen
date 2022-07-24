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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Queued Group Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl#getSendApi <em>Send Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocQueuedGroupCommunicationImpl extends IocCommunicationImpl implements IocQueuedGroupCommunication {
	/**
	 * The cached value of the '{@link #getReceiveApi() <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveGroupApi receiveApi;

	/**
	 * The cached value of the '{@link #getSendApi() <em>Send Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendApi()
	 * @generated
	 * @ordered
	 */
	protected IocSendGroupApi sendApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocQueuedGroupCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_QUEUED_GROUP_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi getReceiveApi() {
		return receiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveApi(IocReceiveGroupApi newReceiveApi, NotificationChain msgs) {
		IocReceiveGroupApi oldReceiveApi = receiveApi;
		receiveApi = newReceiveApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, oldReceiveApi, newReceiveApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveApi(IocReceiveGroupApi newReceiveApi) {
		if (newReceiveApi != receiveApi) {
			NotificationChain msgs = null;
			if (receiveApi != null)
				msgs = ((InternalEObject)receiveApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, null, msgs);
			if (newReceiveApi != null)
				msgs = ((InternalEObject)newReceiveApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, null, msgs);
			msgs = basicSetReceiveApi(newReceiveApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, newReceiveApi, newReceiveApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendGroupApi getSendApi() {
		return sendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendApi(IocSendGroupApi newSendApi, NotificationChain msgs) {
		IocSendGroupApi oldSendApi = sendApi;
		sendApi = newSendApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, oldSendApi, newSendApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendApi(IocSendGroupApi newSendApi) {
		if (newSendApi != sendApi) {
			NotificationChain msgs = null;
			if (sendApi != null)
				msgs = ((InternalEObject)sendApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, null, msgs);
			if (newSendApi != null)
				msgs = ((InternalEObject)newSendApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, null, msgs);
			msgs = basicSetSendApi(newSendApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, newSendApi, newSendApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return basicSetReceiveApi(null, msgs);
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return basicSetSendApi(null, msgs);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return getReceiveApi();
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return getSendApi();
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveGroupApi)newValue);
				return;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				setSendApi((IocSendGroupApi)newValue);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveGroupApi)null);
				return;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				setSendApi((IocSendGroupApi)null);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return receiveApi != null;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return sendApi != null;
		}
		return super.eIsSet(featureID);
	}

} //IocQueuedGroupCommunicationImpl
