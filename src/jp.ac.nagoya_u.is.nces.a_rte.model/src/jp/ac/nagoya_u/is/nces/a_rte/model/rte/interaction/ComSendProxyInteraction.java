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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Send Proxy Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequesterPartition <em>Requester Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getSignalDataType <em>Signal Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequestOsIocCommunication <em>Request Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getValueOsIocCommunication <em>Value Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction()
 * @model
 * @generated
 */
public interface ComSendProxyInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Requester Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester Partition</em>' reference.
	 * @see #setRequesterPartition(EcucPartition)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction_RequesterPartition()
	 * @model required="true"
	 * @generated
	 */
	EcucPartition getRequesterPartition();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequesterPartition <em>Requester Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester Partition</em>' reference.
	 * @see #getRequesterPartition()
	 * @generated
	 */
	void setRequesterPartition(EcucPartition value);

	/**
	 * Returns the value of the '<em><b>Signal Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Data Type</em>' reference.
	 * @see #setSignalDataType(ImplementationDataType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction_SignalDataType()
	 * @model required="true"
	 * @generated
	 */
	ImplementationDataType getSignalDataType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getSignalDataType <em>Signal Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Data Type</em>' reference.
	 * @see #getSignalDataType()
	 * @generated
	 */
	void setSignalDataType(ImplementationDataType value);

	/**
	 * Returns the value of the '<em><b>Request Os Ioc Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Ioc Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 送信要求用IOC通信
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Os Ioc Communication</em>' reference.
	 * @see #setRequestOsIocCommunication(OsIocCommunication)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction_RequestOsIocCommunication()
	 * @model required="true"
	 * @generated
	 */
	OsIocCommunication getRequestOsIocCommunication();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequestOsIocCommunication <em>Request Os Ioc Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Os Ioc Communication</em>' reference.
	 * @see #getRequestOsIocCommunication()
	 * @generated
	 */
	void setRequestOsIocCommunication(OsIocCommunication value);

	/**
	 * Returns the value of the '<em><b>Value Os Ioc Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 値伝搬用IOC通信
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Os Ioc Communication</em>' reference.
	 * @see #setValueOsIocCommunication(OsIocCommunication)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction_ValueOsIocCommunication()
	 * @model required="true"
	 * @generated
	 */
	OsIocCommunication getValueOsIocCommunication();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getValueOsIocCommunication <em>Value Os Ioc Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Os Ioc Communication</em>' reference.
	 * @see #getValueOsIocCommunication()
	 * @generated
	 */
	void setValueOsIocCommunication(OsIocCommunication value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference.
	 * @see #setProxy(ComSendProxy)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getComSendProxyInteraction_Proxy()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getInteraction
	 * @model opposite="interaction" required="true"
	 * @generated
	 */
	ComSendProxy getProxy();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getProxy <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(ComSendProxy value);

} // ComSendProxyInteraction
