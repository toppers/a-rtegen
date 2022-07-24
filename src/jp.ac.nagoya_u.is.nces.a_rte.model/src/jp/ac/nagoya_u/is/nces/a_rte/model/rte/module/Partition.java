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
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSwc <em>Swc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartedBswm <em>Parted Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getIsBswPartition <em>Is Bsw Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getOsTrustedMacro <em>Os Trusted Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComReceiveBufferVariableSet <em>Com Receive Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComSignalApiWrapper <em>Com Signal Api Wrapper</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComSignalApiAlias <em>Com Signal Api Alias</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComMetaDataVariableSet <em>Com Meta Data Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunction <em>Com Proxy Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunctionTableIndexConstant <em>Com Proxy Function Table Index Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunctionTableSizeConstant <em>Com Proxy Function Table Size Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunctionTableVariable <em>Com Proxy Function Table Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyBufferVariableSet <em>Com Proxy Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrRteBufferInitValueConstant <em>Sr Rte Buffer Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrRteBufferVariableSet <em>Sr Rte Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrRteBufferQueuedVariable <em>Sr Rte Buffer Queued Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferSendTrustedFunction <em>Rte Buffer Send Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrFilterConstant <em>Sr Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrFilterOldValueVariable <em>Sr Filter Old Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSrFilterOccurrenceVariable <em>Sr Filter Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getCsTfArgcConstant <em>Cs Tf Argc Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getCsTfOpidConstant <em>Cs Tf Opid Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getCsTrustedFunction <em>Cs Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartVariable <em>Entity Start Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartConstant <em>Entity Start Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getTaskBody <em>Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRestartPartitionApi <em>Restart Partition Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionTerminatedApi <em>Partition Terminated Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionRestartingApi <em>Partition Restarting Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends LogicalCompartment {
	/**
	 * Returns the value of the '<em><b>Is Bsw Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bsw Partition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bsw Partition</em>' attribute.
	 * @see #setIsBswPartition(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_IsBswPartition()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsBswPartition();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getIsBswPartition <em>Is Bsw Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bsw Partition</em>' attribute.
	 * @see #getIsBswPartition()
	 * @generated
	 */
	void setIsBswPartition(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Core)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getPartition
	 * @model opposite="partition" required="true" transient="false"
	 * @generated
	 */
	Core getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Core value);

	/**
	 * Returns the value of the '<em><b>Swc</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_Swc()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Swc> getSwc();

	/**
	 * Returns the value of the '<em><b>Restart Partition Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart Partition Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Partition Api</em>' containment reference.
	 * @see #setRestartPartitionApi(RestartPartitionApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_RestartPartitionApi()
	 * @model containment="true"
	 * @generated
	 */
	RestartPartitionApi getRestartPartitionApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRestartPartitionApi <em>Restart Partition Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Partition Api</em>' containment reference.
	 * @see #getRestartPartitionApi()
	 * @generated
	 */
	void setRestartPartitionApi(RestartPartitionApi value);

	/**
	 * Returns the value of the '<em><b>Partition Terminated Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Terminated Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Terminated Api</em>' containment reference.
	 * @see #setPartitionTerminatedApi(PartitionTerminatedApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_PartitionTerminatedApi()
	 * @model containment="true"
	 * @generated
	 */
	PartitionTerminatedApi getPartitionTerminatedApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionTerminatedApi <em>Partition Terminated Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Terminated Api</em>' containment reference.
	 * @see #getPartitionTerminatedApi()
	 * @generated
	 */
	void setPartitionTerminatedApi(PartitionTerminatedApi value);

	/**
	 * Returns the value of the '<em><b>Partition Restarting Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Restarting Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Restarting Api</em>' containment reference.
	 * @see #setPartitionRestartingApi(PartitionRestartingApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_PartitionRestartingApi()
	 * @model containment="true"
	 * @generated
	 */
	PartitionRestartingApi getPartitionRestartingApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionRestartingApi <em>Partition Restarting Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Restarting Api</em>' containment reference.
	 * @see #getPartitionRestartingApi()
	 * @generated
	 */
	void setPartitionRestartingApi(PartitionRestartingApi value);

	/**
	 * Returns the value of the '<em><b>TAck Status</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAck Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAck Status</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_TAckStatus()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TAckStatus> getTAckStatus();

	/**
	 * Returns the value of the '<em><b>Task Body</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Body</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_TaskBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskBody> getTaskBody();

	/**
	 * Returns the value of the '<em><b>Cs Tf Argc Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Argc Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Argc Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_CsTfArgcConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getCsTfArgcConstant();

	/**
	 * Returns the value of the '<em><b>Cs Tf Opid Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Opid Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Opid Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_CsTfOpidConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getCsTfOpidConstant();

	/**
	 * Returns the value of the '<em><b>Cs Trusted Function</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Trusted Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Trusted Function</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_CsTrustedFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CsTrustedFunction> getCsTrustedFunction();

	/**
	 * Returns the value of the '<em><b>Entity Start Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Start Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Start Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_EntityStartVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getEntityStartVariable();

	/**
	 * Returns the value of the '<em><b>Entity Start Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Start Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Start Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_EntityStartConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getEntityStartConstant();

	/**
	 * Returns the value of the '<em><b>Rte Buffer Send Trusted Function</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Buffer Send Trusted Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Buffer Send Trusted Function</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_RteBufferSendTrustedFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrustedFunction> getRteBufferSendTrustedFunction();

	/**
	 * Returns the value of the '<em><b>Sr Filter Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Filter Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Filter Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrFilterConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrFilterConstant();

	/**
	 * Returns the value of the '<em><b>Sr Filter Old Value Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Filter Old Value Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Filter Old Value Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrFilterOldValueVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GlobalVariable> getSrFilterOldValueVariable();

	/**
	 * Returns the value of the '<em><b>Sr Filter Occurrence Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Filter Occurrence Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Filter Occurrence Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrFilterOccurrenceVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GlobalVariable> getSrFilterOccurrenceVariable();

	/**
	 * Returns the value of the '<em><b>Os Trusted Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Trusted Macro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Trusted Macro</em>' containment reference.
	 * @see #setOsTrustedMacro(Macro)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_OsTrustedMacro()
	 * @model containment="true"
	 * @generated
	 */
	Macro getOsTrustedMacro();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getOsTrustedMacro <em>Os Trusted Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Trusted Macro</em>' containment reference.
	 * @see #getOsTrustedMacro()
	 * @generated
	 */
	void setOsTrustedMacro(Macro value);

	/**
	 * Returns the value of the '<em><b>Com Receive Buffer Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Receive Buffer Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Receive Buffer Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComReceiveBufferVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferVariableSet> getComReceiveBufferVariableSet();

	/**
	 * Returns the value of the '<em><b>Com Signal Api Wrapper</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Signal Api Wrapper</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Signal Api Wrapper</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComSignalApiWrapper()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComSignalApiWrapper> getComSignalApiWrapper();

	/**
	 * Returns the value of the '<em><b>Com Signal Api Alias</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Signal Api Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Signal Api Alias</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComSignalApiAlias()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionMacro> getComSignalApiAlias();

	/**
	 * Returns the value of the '<em><b>Com Meta Data Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Meta Data Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Meta Data Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComMetaDataVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariableSet> getComMetaDataVariableSet();

	/**
	 * Returns the value of the '<em><b>Parted Bswm</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parted Bswm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parted Bswm</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_PartedBswm()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PartedBswm> getPartedBswm();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function Table Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function Table Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function Table Variable</em>' containment reference.
	 * @see #setComProxyFunctionTableVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComProxyFunctionTableVariable()
	 * @model containment="true"
	 * @generated
	 */
	GlobalVariable getComProxyFunctionTableVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunctionTableVariable <em>Com Proxy Function Table Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Proxy Function Table Variable</em>' containment reference.
	 * @see #getComProxyFunctionTableVariable()
	 * @generated
	 */
	void setComProxyFunctionTableVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Com Proxy Buffer Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Buffer Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Buffer Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComProxyBufferVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferVariableSet> getComProxyBufferVariableSet();

	/**
	 * Returns the value of the '<em><b>Sr Rte Buffer Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Buffer Init Value Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Buffer Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrRteBufferInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrRteBufferInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Sr Rte Buffer Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Buffer Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Buffer Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrRteBufferVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferVariableSet> getSrRteBufferVariableSet();

	/**
	 * Returns the value of the '<em><b>Sr Rte Buffer Queued Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Rte Buffer Queued Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Rte Buffer Queued Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_SrRteBufferQueuedVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferQueuedVariable> getSrRteBufferQueuedVariable();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComProxyFunction()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComProxyFunction> getComProxyFunction();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function Table Index Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function Table Index Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function Table Index Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComProxyFunctionTableIndexConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getComProxyFunctionTableIndexConstant();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function Table Size Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function Table Size Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function Table Size Constant</em>' containment reference.
	 * @see #setComProxyFunctionTableSizeConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartition_ComProxyFunctionTableSizeConstant()
	 * @model containment="true"
	 * @generated
	 */
	Constant getComProxyFunctionTableSizeConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getComProxyFunctionTableSizeConstant <em>Com Proxy Function Table Size Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Proxy Function Table Size Constant</em>' containment reference.
	 * @see #getComProxyFunctionTableSizeConstant()
	 * @generated
	 */
	void setComProxyFunctionTableSizeConstant(Constant value);

} // Partition
