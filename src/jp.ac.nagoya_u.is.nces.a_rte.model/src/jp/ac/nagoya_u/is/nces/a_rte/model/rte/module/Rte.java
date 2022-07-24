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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getCore <em>Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getBswm <em>Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo <em>Generation Info</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentType <em>Dependent Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentConstant <em>Dependent Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentOsApi <em>Dependent Os Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentIocCommunication <em>Dependent Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentComApi <em>Dependent Com Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getIocInitValueConstant <em>Ioc Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getIocInitValueVariableSet <em>Ioc Init Value Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteMemoryMapping <em>Rte Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTfParamType <em>Com Send Signal Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalGroupTfParamType <em>Com Send Signal Group Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getCsTfParamType <em>Cs Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteNonqueuedSendTfParamType <em>Sr Rte Nonqueued Send Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteQueuedSendTfParamType <em>Sr Rte Queued Send Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteBufferQueueMaxLengthConstant <em>Sr Rte Buffer Queue Max Length Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteBufferQueueType <em>Sr Rte Buffer Queue Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getImmediateConstant <em>Immediate Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComCallback <em>Com Callback</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi <em>Rte Start Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi <em>Rte Stop Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi <em>Schm Init Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi <em>Schm Deinit Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte()
 * @model
 * @generated
 */
public interface Rte extends LogicalCompartment {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_Core()
	 * @model containment="true"
	 * @generated
	 */
	EList<Core> getCore();

	/**
	 * Returns the value of the '<em><b>Com Callback</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Callback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Callback</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComCallback()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComCallback> getComCallback();

	/**
	 * Returns the value of the '<em><b>Com Send Signal Periodic Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Periodic Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Periodic Entity</em>' containment reference.
	 * @see #setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalPeriodicEntity()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalPeriodicEntity getComSendSignalPeriodicEntity();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Periodic Entity</em>' containment reference.
	 * @see #getComSendSignalPeriodicEntity()
	 * @generated
	 */
	void setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity value);

	/**
	 * Returns the value of the '<em><b>Com Send Signal Immediate Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Immediate Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Immediate Entity</em>' containment reference.
	 * @see #setComSendSignalImmediateEntity(ComSendSignalImmediateEntity)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalImmediateEntity()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalImmediateEntity getComSendSignalImmediateEntity();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Immediate Entity</em>' containment reference.
	 * @see #getComSendSignalImmediateEntity()
	 * @generated
	 */
	void setComSendSignalImmediateEntity(ComSendSignalImmediateEntity value);

	/**
	 * Returns the value of the '<em><b>Com Send Signal Trusted Function</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Trusted Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Trusted Function</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalTrustedFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComSendSignalTrustedFunction> getComSendSignalTrustedFunction();

	/**
	 * Returns the value of the '<em><b>Dependent Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getDependentType();

	/**
	 * Returns the value of the '<em><b>Immediate Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ImmediateConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getImmediateConstant();

	/**
	 * Returns the value of the '<em><b>Sr Rte Buffer Queue Max Length Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Buffer Queue Max Length Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Buffer Queue Max Length Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SrRteBufferQueueMaxLengthConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrRteBufferQueueMaxLengthConstant();

	/**
	 * Returns the value of the '<em><b>Dependent Os Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Os Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Os Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentOsApi()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsApi> getDependentOsApi();

	/**
	 * Returns the value of the '<em><b>Dependent Ioc Communication</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Ioc Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Ioc Communication</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentIocCommunication()
	 * @model containment="true"
	 * @generated
	 */
	EList<IocCommunication> getDependentIocCommunication();

	/**
	 * Returns the value of the '<em><b>Dependent Com Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Com Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Com Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentComApi()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComApi> getDependentComApi();

	/**
	 * Returns the value of the '<em><b>Ioc Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Init Value Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_IocInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getIocInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Ioc Init Value Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Init Value Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Init Value Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_IocInitValueVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferVariableSet> getIocInitValueVariableSet();

	/**
	 * Returns the value of the '<em><b>Rte Start Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Start Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Start Api</em>' containment reference.
	 * @see #setRteStartApi(RteStartApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteStartApi()
	 * @model containment="true"
	 * @generated
	 */
	RteStartApi getRteStartApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi <em>Rte Start Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Start Api</em>' containment reference.
	 * @see #getRteStartApi()
	 * @generated
	 */
	void setRteStartApi(RteStartApi value);

	/**
	 * Returns the value of the '<em><b>Dependent Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getDependentConstant();

	/**
	 * Returns the value of the '<em><b>Com Send Signal Immediate Task Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Immediate Task Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Immediate Task Body</em>' containment reference.
	 * @see #setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalImmediateTaskBody()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalImmediateTaskBody getComSendSignalImmediateTaskBody();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Immediate Task Body</em>' containment reference.
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 */
	void setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody value);

	/**
	 * Returns the value of the '<em><b>Rte Stop Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Stop Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Stop Api</em>' containment reference.
	 * @see #setRteStopApi(RteStopApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteStopApi()
	 * @model containment="true"
	 * @generated
	 */
	RteStopApi getRteStopApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi <em>Rte Stop Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Stop Api</em>' containment reference.
	 * @see #getRteStopApi()
	 * @generated
	 */
	void setRteStopApi(RteStopApi value);

	/**
	 * Returns the value of the '<em><b>Implementation Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Data Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ImplementationDataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getImplementationDataType();

	/**
	 * Returns the value of the '<em><b>Com Send Signal Tf Param Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Tf Param Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Tf Param Type</em>' containment reference.
	 * @see #setComSendSignalTfParamType(ComSendTrustedFunctionParamType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalTfParamType()
	 * @model containment="true"
	 * @generated
	 */
	ComSendTrustedFunctionParamType getComSendSignalTfParamType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTfParamType <em>Com Send Signal Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Tf Param Type</em>' containment reference.
	 * @see #getComSendSignalTfParamType()
	 * @generated
	 */
	void setComSendSignalTfParamType(ComSendTrustedFunctionParamType value);

	/**
	 * Returns the value of the '<em><b>Com Send Signal Group Tf Param Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Group Tf Param Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Group Tf Param Type</em>' containment reference.
	 * @see #setComSendSignalGroupTfParamType(ComSendTrustedFunctionParamType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalGroupTfParamType()
	 * @model containment="true"
	 * @generated
	 */
	ComSendTrustedFunctionParamType getComSendSignalGroupTfParamType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalGroupTfParamType <em>Com Send Signal Group Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Group Tf Param Type</em>' containment reference.
	 * @see #getComSendSignalGroupTfParamType()
	 * @generated
	 */
	void setComSendSignalGroupTfParamType(ComSendTrustedFunctionParamType value);

	/**
	 * Returns the value of the '<em><b>Cs Tf Param Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunctionParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Param Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Param Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_CsTfParamType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CsTrustedFunctionParamType> getCsTfParamType();

	/**
	 * Returns the value of the '<em><b>Sr Rte Nonqueued Send Tf Param Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Nonqueued Send Tf Param Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Nonqueued Send Tf Param Type</em>' containment reference.
	 * @see #setSrRteNonqueuedSendTfParamType(RteNonqueuedSendTrustedFunctionParamType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SrRteNonqueuedSendTfParamType()
	 * @model containment="true"
	 * @generated
	 */
	RteNonqueuedSendTrustedFunctionParamType getSrRteNonqueuedSendTfParamType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteNonqueuedSendTfParamType <em>Sr Rte Nonqueued Send Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Rte Nonqueued Send Tf Param Type</em>' containment reference.
	 * @see #getSrRteNonqueuedSendTfParamType()
	 * @generated
	 */
	void setSrRteNonqueuedSendTfParamType(RteNonqueuedSendTrustedFunctionParamType value);

	/**
	 * Returns the value of the '<em><b>Sr Rte Queued Send Tf Param Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Queued Send Tf Param Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Queued Send Tf Param Type</em>' containment reference.
	 * @see #setSrRteQueuedSendTfParamType(RteQueuedSendTrustedFunctionParamType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SrRteQueuedSendTfParamType()
	 * @model containment="true"
	 * @generated
	 */
	RteQueuedSendTrustedFunctionParamType getSrRteQueuedSendTfParamType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSrRteQueuedSendTfParamType <em>Sr Rte Queued Send Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Rte Queued Send Tf Param Type</em>' containment reference.
	 * @see #getSrRteQueuedSendTfParamType()
	 * @generated
	 */
	void setSrRteQueuedSendTfParamType(RteQueuedSendTrustedFunctionParamType value);

	/**
	 * Returns the value of the '<em><b>Sr Rte Buffer Queue Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Buffer Queue Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Buffer Queue Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SrRteBufferQueueType()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferQueueType> getSrRteBufferQueueType();

	/**
	 * Returns the value of the '<em><b>Rte Memory Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Memory Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Memory Mapping</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteMemoryMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswMemoryMapping> getRteMemoryMapping();

	/**
	 * Returns the value of the '<em><b>Generation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Info</em>' containment reference.
	 * @see #setGenerationInfo(GenerationInfo)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_GenerationInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenerationInfo getGenerationInfo();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo <em>Generation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Info</em>' containment reference.
	 * @see #getGenerationInfo()
	 * @generated
	 */
	void setGenerationInfo(GenerationInfo value);

	/**
	 * Returns the value of the '<em><b>Bswm</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_Bswm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bswm> getBswm();

	/**
	 * Returns the value of the '<em><b>Schm Init Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Init Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Init Api</em>' containment reference.
	 * @see #setSchmInitApi(SchmInitApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SchmInitApi()
	 * @model containment="true"
	 * @generated
	 */
	SchmInitApi getSchmInitApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi <em>Schm Init Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schm Init Api</em>' containment reference.
	 * @see #getSchmInitApi()
	 * @generated
	 */
	void setSchmInitApi(SchmInitApi value);

	/**
	 * Returns the value of the '<em><b>Schm Deinit Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Deinit Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Deinit Api</em>' containment reference.
	 * @see #setSchmDeinitApi(SchmDeinitApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SchmDeinitApi()
	 * @model containment="true"
	 * @generated
	 */
	SchmDeinitApi getSchmDeinitApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi <em>Schm Deinit Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schm Deinit Api</em>' containment reference.
	 * @see #getSchmDeinitApi()
	 * @generated
	 */
	void setSchmDeinitApi(SchmDeinitApi value);

} // Rte
