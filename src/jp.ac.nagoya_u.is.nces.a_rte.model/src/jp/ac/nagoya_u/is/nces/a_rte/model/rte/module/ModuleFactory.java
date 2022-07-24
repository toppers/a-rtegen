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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage
 * @generated
 */
public interface ModuleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Api</em>'.
	 * @generated
	 */
	WriteApi createWriteApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * @generated
	 */
	RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * @generated
	 */
	RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Api</em>'.
	 * @generated
	 */
	ReadApi createReadApi();

	/**
	 * Returns a new object of class '<em>Irv Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Read Operation</em>'.
	 * @generated
	 */
	IrvReadOperation createIrvReadOperation();

	/**
	 * Returns a new object of class '<em>Irv Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Read Api</em>'.
	 * @generated
	 */
	IrvReadApi createIrvReadApi();

	/**
	 * Returns a new object of class '<em>Irv Write Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Write Operation</em>'.
	 * @generated
	 */
	IrvWriteOperation createIrvWriteOperation();

	/**
	 * Returns a new object of class '<em>Irv Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Write Api</em>'.
	 * @generated
	 */
	IrvWriteApi createIrvWriteApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Variable Set</em>'.
	 * @generated
	 */
	RteBufferVariableSet createRteBufferVariableSet();

	/**
	 * Returns a new object of class '<em>Global Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable Set</em>'.
	 * @generated
	 */
	GlobalVariableSet createGlobalVariableSet();

	/**
	 * Returns a new object of class '<em>Com Proxy Function Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Proxy Function Table Variable</em>'.
	 * @generated
	 */
	ComProxyFunctionTableVariable createComProxyFunctionTableVariable();

	/**
	 * Returns a new object of class '<em>Rte Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Source</em>'.
	 * @generated
	 */
	RteSource createRteSource();

	/**
	 * Returns a new object of class '<em>Rte Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Module</em>'.
	 * @generated
	 */
	RteModule createRteModule();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Type</em>'.
	 * @generated
	 */
	ModeType createModeType();

	/**
	 * Returns a new object of class '<em>Redefinition Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Primitive Type</em>'.
	 * @generated
	 */
	RedefinitionPrimitiveType createRedefinitionPrimitiveType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Redefinition Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Array Type</em>'.
	 * @generated
	 */
	RedefinitionArrayType createRedefinitionArrayType();

	/**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
	UnionType createUnionType();

	/**
	 * Returns a new object of class '<em>Redefinition Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Union Type</em>'.
	 * @generated
	 */
	RedefinitionUnionType createRedefinitionUnionType();

	/**
	 * Returns a new object of class '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Type</em>'.
	 * @generated
	 */
	StructType createStructType();

	/**
	 * Returns a new object of class '<em>Redefinition Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Struct Type</em>'.
	 * @generated
	 */
	RedefinitionStructType createRedefinitionStructType();

	/**
	 * Returns a new object of class '<em>Blackbox Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackbox Type</em>'.
	 * @generated
	 */
	BlackboxType createBlackboxType();

	/**
	 * Returns a new object of class '<em>Union Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Member</em>'.
	 * @generated
	 */
	UnionMember createUnionMember();

	/**
	 * Returns a new object of class '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Member</em>'.
	 * @generated
	 */
	StructMember createStructMember();

	/**
	 * Returns a new object of class '<em>Variable Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Member</em>'.
	 * @generated
	 */
	VariableMember createVariableMember();

	/**
	 * Returns a new object of class '<em>Rte Utility Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Utility Header</em>'.
	 * @generated
	 */
	RteUtilityHeader createRteUtilityHeader();

	/**
	 * Returns a new object of class '<em>Blackbox Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackbox Header</em>'.
	 * @generated
	 */
	BlackboxHeader createBlackboxHeader();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queue Type</em>'.
	 * @generated
	 */
	RteBufferQueueType createRteBufferQueueType();

	/**
	 * Returns a new object of class '<em>Rte Nonqueued Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Nonqueued Send Trusted Function Param Type</em>'.
	 * @generated
	 */
	RteNonqueuedSendTrustedFunctionParamType createRteNonqueuedSendTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Rte Queued Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Queued Send Trusted Function Param Type</em>'.
	 * @generated
	 */
	RteQueuedSendTrustedFunctionParamType createRteQueuedSendTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Mode Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Queue Type</em>'.
	 * @generated
	 */
	ModeQueueType createModeQueueType();

	/**
	 * Returns a new object of class '<em>Com Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Trusted Function Param Type</em>'.
	 * @generated
	 */
	ComSendTrustedFunctionParamType createComSendTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Cs Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cs Trusted Function Param Type</em>'.
	 * @generated
	 */
	CsTrustedFunctionParamType createCsTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Never Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Never Read Operation</em>'.
	 * @generated
	 */
	NeverReadOperation createNeverReadOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * @generated
	 */
	RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation();

	/**
	 * Returns a new object of class '<em>Swc Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Memory Mapping</em>'.
	 * @generated
	 */
	SwcMemoryMapping createSwcMemoryMapping();

	/**
	 * Returns a new object of class '<em>Bsw Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Memory Mapping</em>'.
	 * @generated
	 */
	BswMemoryMapping createBswMemoryMapping();

	/**
	 * Returns a new object of class '<em>Global Variable File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable File Contents Group</em>'.
	 * @generated
	 */
	GlobalVariableFileContentsGroup createGlobalVariableFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Rte Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Api File Contents Group</em>'.
	 * @generated
	 */
	RteApiFileContentsGroup createRteApiFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Rte Lifecycle Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Lifecycle Api File Contents Group</em>'.
	 * @generated
	 */
	RteLifecycleApiFileContentsGroup createRteLifecycleApiFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Task Body File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Body File Contents Group</em>'.
	 * @generated
	 */
	TaskBodyFileContentsGroup createTaskBodyFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity File Contents Group</em>'.
	 * @generated
	 */
	BswSchedulableEntityFileContentsGroup createBswSchedulableEntityFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Com Callback File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Callback File Contents Group</em>'.
	 * @generated
	 */
	ComCallbackFileContentsGroup createComCallbackFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Trusted Function File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function File Contents Group</em>'.
	 * @generated
	 */
	TrustedFunctionFileContentsGroup createTrustedFunctionFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Executable Entity File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Entity File Contents Group</em>'.
	 * @generated
	 */
	ExecutableEntityFileContentsGroup createExecutableEntityFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Bsw Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Memory Mapping Header</em>'.
	 * @generated
	 */
	BswMemoryMappingHeader createBswMemoryMappingHeader();

	/**
	 * Returns a new object of class '<em>Swc Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Memory Mapping Header</em>'.
	 * @generated
	 */
	SwcMemoryMappingHeader createSwcMemoryMappingHeader();

	/**
	 * Returns a new object of class '<em>Generation Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Info</em>'.
	 * @generated
	 */
	GenerationInfo createGenerationInfo();

	/**
	 * Returns a new object of class '<em>Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro</em>'.
	 * @generated
	 */
	Macro createMacro();

	/**
	 * Returns a new object of class '<em>Com Proxy Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Proxy Function</em>'.
	 * @generated
	 */
	ComProxyFunction createComProxyFunction();

	/**
	 * Returns a new object of class '<em>Com Send Signal Api Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Api Wrapper</em>'.
	 * @generated
	 */
	ComSendSignalApiWrapper createComSendSignalApiWrapper();

	/**
	 * Returns a new object of class '<em>Com Receive Signal Api Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Receive Signal Api Wrapper</em>'.
	 * @generated
	 */
	ComReceiveSignalApiWrapper createComReceiveSignalApiWrapper();

	/**
	 * Returns a new object of class '<em>Schm Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Enter Api</em>'.
	 * @generated
	 */
	SchmEnterApi createSchmEnterApi();

	/**
	 * Returns a new object of class '<em>Schm Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Exit Api</em>'.
	 * @generated
	 */
	SchmExitApi createSchmExitApi();

	/**
	 * Returns a new object of class '<em>Schm Switch Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Switch Api</em>'.
	 * @generated
	 */
	SchmSwitchApi createSchmSwitchApi();

	/**
	 * Returns a new object of class '<em>Os Task Events Triggered By Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Events Triggered By Mode</em>'.
	 * @generated
	 */
	OsTaskEventsTriggeredByMode createOsTaskEventsTriggeredByMode();

	/**
	 * Returns a new object of class '<em>Os Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Event</em>'.
	 * @generated
	 */
	OsTaskEvent createOsTaskEvent();

	/**
	 * Returns a new object of class '<em>Mode Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Queued Variable</em>'.
	 * @generated
	 */
	ModeQueuedVariable createModeQueuedVariable();

	/**
	 * Returns a new object of class '<em>Schm Mode Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Mode Api</em>'.
	 * @generated
	 */
	SchmModeApi createSchmModeApi();

	/**
	 * Returns a new object of class '<em>Interlink Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interlink Header</em>'.
	 * @generated
	 */
	ModuleInterlinkHeader createModuleInterlinkHeader();

	/**
	 * Returns a new object of class '<em>Schm Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Api File Contents Group</em>'.
	 * @generated
	 */
	SchmApiFileContentsGroup createSchmApiFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Com Signal Api Wrapper File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Api Wrapper File Contents Group</em>'.
	 * @generated
	 */
	ComSignalApiWrapperFileContentsGroup createComSignalApiWrapperFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Com Proxy Function File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Proxy Function File Contents Group</em>'.
	 * @generated
	 */
	ComProxyFunctionFileContentsGroup createComProxyFunctionFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Interlink Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interlink Type Header</em>'.
	 * @generated
	 */
	ModuleInterlinkTypeHeader createModuleInterlinkTypeHeader();

	/**
	 * Returns a new object of class '<em>Schm Lifecycle Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Lifecycle Api File Contents Group</em>'.
	 * @generated
	 */
	SchmLifecycleApiFileContentsGroup createSchmLifecycleApiFileContentsGroup();

	/**
	 * Returns a new object of class '<em>Parted Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parted Bswm</em>'.
	 * @generated
	 */
	PartedBswm createPartedBswm();

	/**
	 * Returns a new object of class '<em>Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bswm</em>'.
	 * @generated
	 */
	Bswm createBswm();

	/**
	 * Returns a new object of class '<em>Schm Deinit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Deinit Api</em>'.
	 * @generated
	 */
	SchmDeinitApi createSchmDeinitApi();

	/**
	 * Returns a new object of class '<em>Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Init Api</em>'.
	 * @generated
	 */
	SchmInitApi createSchmInitApi();

	/**
	 * Returns a new object of class '<em>Singlecore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singlecore Schm Init Api</em>'.
	 * @generated
	 */
	SinglecoreSchmInitApi createSinglecoreSchmInitApi();

	/**
	 * Returns a new object of class '<em>Multicore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicore Schm Init Api</em>'.
	 * @generated
	 */
	MulticoreSchmInitApi createMulticoreSchmInitApi();

	/**
	 * Returns a new object of class '<em>Schm Core Init Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Core Init Api Impl</em>'.
	 * @generated
	 */
	SchmCoreInitApiImpl createSchmCoreInitApiImpl();

	/**
	 * Returns a new object of class '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type</em>'.
	 * @generated
	 */
	PointerType createPointerType();

	/**
	 * Returns a new object of class '<em>Redefinition Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Pointer Type</em>'.
	 * @generated
	 */
	RedefinitionPointerType createRedefinitionPointerType();

	/**
	 * Returns a new object of class '<em>Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Operation</em>'.
	 * @generated
	 */
	ActivationOperation createActivationOperation();

	/**
	 * Returns a new object of class '<em>Os Activate Task Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Activate Task Api</em>'.
	 * @generated
	 */
	OsActivateTaskApi createOsActivateTaskApi();

	/**
	 * Returns a new object of class '<em>Feedback Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Api</em>'.
	 * @generated
	 */
	FeedbackApi createFeedbackApi();

	/**
	 * Returns a new object of class '<em>TAck Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAck Status</em>'.
	 * @generated
	 */
	TAckStatus createTAckStatus();

	/**
	 * Returns a new object of class '<em>User Defined Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Exclude Operation</em>'.
	 * @generated
	 */
	UserDefinedExcludeOperation createUserDefinedExcludeOperation();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Rte Application Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Application Header</em>'.
	 * @generated
	 */
	RteApplicationHeader createRteApplicationHeader();

	/**
	 * Returns a new object of class '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core</em>'.
	 * @generated
	 */
	Core createCore();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	Partition createPartition();

	/**
	 * Returns a new object of class '<em>Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc</em>'.
	 * @generated
	 */
	Swc createSwc();

	/**
	 * Returns a new object of class '<em>Rte Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Header</em>'.
	 * @generated
	 */
	RteHeader createRteHeader();

	/**
	 * Returns a new object of class '<em>Rte Bsw Api Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Api Header</em>'.
	 * @generated
	 */
	RteBswApiHeader createRteBswApiHeader();

	/**
	 * Returns a new object of class '<em>Rte Lifecycle Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Lifecycle Header</em>'.
	 * @generated
	 */
	RteLifecycleHeader createRteLifecycleHeader();

	/**
	 * Returns a new object of class '<em>Rte Application Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Application Type Header</em>'.
	 * @generated
	 */
	RteApplicationTypeHeader createRteApplicationTypeHeader();

	/**
	 * Returns a new object of class '<em>Rte Vfb Trace Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Vfb Trace Header</em>'.
	 * @generated
	 */
	RteVfbTraceHeader createRteVfbTraceHeader();

	/**
	 * Returns a new object of class '<em>Rte Configuration Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Configuration Header</em>'.
	 * @generated
	 */
	RteConfigurationHeader createRteConfigurationHeader();

	/**
	 * Returns a new object of class '<em>Rte Callback Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Callback Header</em>'.
	 * @generated
	 */
	RteCallbackHeader createRteCallbackHeader();

	/**
	 * Returns a new object of class '<em>Rte Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Type Header</em>'.
	 * @generated
	 */
	RteTypeHeader createRteTypeHeader();

	/**
	 * Returns a new object of class '<em>Invalidate Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalidate Api</em>'.
	 * @generated
	 */
	InvalidateApi createInvalidateApi();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Send Operation</em>'.
	 * @generated
	 */
	IocNonqueuedSendOperation createIocNonqueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Direct Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Com Send Operation</em>'.
	 * @generated
	 */
	DirectComSendOperation createDirectComSendOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteOperation createTrustedFunctionRteOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Buffer Send Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Buffer Send Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteBufferSendSendOperation createTrustedFunctionRteBufferSendSendOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Com Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionComSendOperation createTrustedFunctionComSendOperation();

	/**
	 * Returns a new object of class '<em>Immediate Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Proxy Com Send Operation</em>'.
	 * @generated
	 */
	ImmediateProxyComSendOperation createImmediateProxyComSendOperation();

	/**
	 * Returns a new object of class '<em>Periodic Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Proxy Com Send Operation</em>'.
	 * @generated
	 */
	PeriodicProxyComSendOperation createPeriodicProxyComSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Read Operation</em>'.
	 * @generated
	 */
	IocNonqueuedReadOperation createIocNonqueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Com Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Read Operation</em>'.
	 * @generated
	 */
	ComReadOperation createComReadOperation();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Communication</em>'.
	 * @generated
	 */
	IocNonqueuedCommunication createIocNonqueuedCommunication();

	/**
	 * Returns a new object of class '<em>Ioc Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Write Api</em>'.
	 * @generated
	 */
	IocWriteApi createIocWriteApi();

	/**
	 * Returns a new object of class '<em>Ioc Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Read Api</em>'.
	 * @generated
	 */
	IocReadApi createIocReadApi();

	/**
	 * Returns a new object of class '<em>Com Send Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Api</em>'.
	 * @generated
	 */
	ComSendSignalApi createComSendSignalApi();

	/**
	 * Returns a new object of class '<em>Com Receive Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Receive Signal Api</em>'.
	 * @generated
	 */
	ComReceiveSignalApi createComReceiveSignalApi();

	/**
	 * Returns a new object of class '<em>Com Rx Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Rx Callback</em>'.
	 * @generated
	 */
	ComRxCallback createComRxCallback();

	/**
	 * Returns a new object of class '<em>Com Rx TOut Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Rx TOut Callback</em>'.
	 * @generated
	 */
	ComRxTOutCallback createComRxTOutCallback();

	/**
	 * Returns a new object of class '<em>Com Inv Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Inv Callback</em>'.
	 * @generated
	 */
	ComInvCallback createComInvCallback();

	/**
	 * Returns a new object of class '<em>Com Send Signal Proxy Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Proxy Entity</em>'.
	 * @generated
	 */
	ComSendSignalProxyEntity createComSendSignalProxyEntity();

	/**
	 * Returns a new object of class '<em>Com Send Signal Immediate Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Immediate Entity</em>'.
	 * @generated
	 */
	ComSendSignalImmediateEntity createComSendSignalImmediateEntity();

	/**
	 * Returns a new object of class '<em>Com Send Signal Periodic Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Periodic Entity</em>'.
	 * @generated
	 */
	ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity();

	/**
	 * Returns a new object of class '<em>TAck Notify Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAck Notify Operation</em>'.
	 * @generated
	 */
	TAckNotifyOperation createTAckNotifyOperation();

	/**
	 * Returns a new object of class '<em>Com Tx TOut Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Tx TOut Callback</em>'.
	 * @generated
	 */
	ComTxTOutCallback createComTxTOutCallback();

	/**
	 * Returns a new object of class '<em>Com TAck Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com TAck Callback</em>'.
	 * @generated
	 */
	ComTAckCallback createComTAckCallback();

	/**
	 * Returns a new object of class '<em>Com TErr Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com TErr Callback</em>'.
	 * @generated
	 */
	ComTErrCallback createComTErrCallback();

	/**
	 * Returns a new object of class '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * @generated
	 */
	MaskedNewDiffersMaskedOldFilterOperation createMaskedNewDiffersMaskedOldFilterOperation();

	/**
	 * Returns a new object of class '<em>Masked New Differs XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Differs XFilter Operation</em>'.
	 * @generated
	 */
	MaskedNewDiffersXFilterOperation createMaskedNewDiffersXFilterOperation();

	/**
	 * Returns a new object of class '<em>New Is Within Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Is Within Filter Operation</em>'.
	 * @generated
	 */
	NewIsWithinFilterOperation createNewIsWithinFilterOperation();

	/**
	 * Returns a new object of class '<em>New Is Outside Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Is Outside Filter Operation</em>'.
	 * @generated
	 */
	NewIsOutsideFilterOperation createNewIsOutsideFilterOperation();

	/**
	 * Returns a new object of class '<em>Masked New Equals XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Equals XFilter Operation</em>'.
	 * @generated
	 */
	MaskedNewEqualsXFilterOperation createMaskedNewEqualsXFilterOperation();

	/**
	 * Returns a new object of class '<em>One Every NFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Every NFilter Operation</em>'.
	 * @generated
	 */
	OneEveryNFilterOperation createOneEveryNFilterOperation();

	/**
	 * Returns a new object of class '<em>Rte Core Start Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Core Start Api Impl</em>'.
	 * @generated
	 */
	RteCoreStartApiImpl createRteCoreStartApiImpl();

	/**
	 * Returns a new object of class '<em>Rte Stop Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Stop Api</em>'.
	 * @generated
	 */
	RteStopApi createRteStopApi();

	/**
	 * Returns a new object of class '<em>Restart Partition Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restart Partition Api</em>'.
	 * @generated
	 */
	RestartPartitionApi createRestartPartitionApi();

	/**
	 * Returns a new object of class '<em>Partition Restarting Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Restarting Api</em>'.
	 * @generated
	 */
	PartitionRestartingApi createPartitionRestartingApi();

	/**
	 * Returns a new object of class '<em>Partition Terminated Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Terminated Api</em>'.
	 * @generated
	 */
	PartitionTerminatedApi createPartitionTerminatedApi();

	/**
	 * Returns a new object of class '<em>Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Api</em>'.
	 * @generated
	 */
	SendApi createSendApi();

	/**
	 * Returns a new object of class '<em>Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Api</em>'.
	 * @generated
	 */
	ReceiveApi createReceiveApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Send Operation</em>'.
	 * @generated
	 */
	RteBufferQueuedSendOperation createRteBufferQueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Variable</em>'.
	 * @generated
	 */
	RteBufferQueuedVariable createRteBufferQueuedVariable();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Read Operation</em>'.
	 * @generated
	 */
	RteBufferQueuedReadOperation createRteBufferQueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Communication</em>'.
	 * @generated
	 */
	IocQueuedCommunication createIocQueuedCommunication();

	/**
	 * Returns a new object of class '<em>Ioc Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Receive Api</em>'.
	 * @generated
	 */
	IocReceiveApi createIocReceiveApi();

	/**
	 * Returns a new object of class '<em>Ioc Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Api</em>'.
	 * @generated
	 */
	IocSendApi createIocSendApi();

	/**
	 * Returns a new object of class '<em>Ioc Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Operation</em>'.
	 * @generated
	 */
	IocSendOperation createIocSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Send Operation</em>'.
	 * @generated
	 */
	IocQueuedSendOperation createIocQueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Read Operation</em>'.
	 * @generated
	 */
	IocQueuedReadOperation createIocQueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Call Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Api</em>'.
	 * @generated
	 */
	CallApi createCallApi();

	/**
	 * Returns a new object of class '<em>Tf Call Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tf Call Api</em>'.
	 * @generated
	 */
	TfCallApi createTfCallApi();

	/**
	 * Returns a new object of class '<em>Disabled In Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabled In Mode</em>'.
	 * @generated
	 */
	DisabledInMode createDisabledInMode();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity</em>'.
	 * @generated
	 */
	BswSchedulableEntity createBswSchedulableEntity();

	/**
	 * Returns a new object of class '<em>Runnable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Entity</em>'.
	 * @generated
	 */
	RunnableEntity createRunnableEntity();

	/**
	 * Returns a new object of class '<em>All Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Interrupt Block Exclude Operation</em>'.
	 * @generated
	 */
	AllInterruptBlockExcludeOperation createAllInterruptBlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Interrupt Block Exclude Operation</em>'.
	 * @generated
	 */
	OsInterruptBlockExcludeOperation createOsInterruptBlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Spinlock Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Spinlock Exclude Operation</em>'.
	 * @generated
	 */
	OsSpinlockExcludeOperation createOsSpinlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Resource Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Resource Exclude Operation</em>'.
	 * @generated
	 */
	OsResourceExcludeOperation createOsResourceExcludeOperation();

	/**
	 * Returns a new object of class '<em>None Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Exclude Operation</em>'.
	 * @generated
	 */
	NoneExcludeOperation createNoneExcludeOperation();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Constant Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Member</em>'.
	 * @generated
	 */
	ConstantMember createConstantMember();

	/**
	 * Returns a new object of class '<em>Rte Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Enter Api</em>'.
	 * @generated
	 */
	RteEnterApi createRteEnterApi();

	/**
	 * Returns a new object of class '<em>Rte Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Exit Api</em>'.
	 * @generated
	 */
	RteExitApi createRteExitApi();

	/**
	 * Returns a new object of class '<em>Os Background Task Activation Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Background Task Activation Executable Task Body</em>'.
	 * @generated
	 */
	OsBackgroundTaskActivationExecutableTaskBody createOsBackgroundTaskActivationExecutableTaskBody();

	/**
	 * Returns a new object of class '<em>Os Task Activation Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activation Executable Task Body</em>'.
	 * @generated
	 */
	OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody();

	/**
	 * Returns a new object of class '<em>Os Event Set Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Executable Task Body</em>'.
	 * @generated
	 */
	OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody();

	/**
	 * Returns a new object of class '<em>Os Task Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activation Operation</em>'.
	 * @generated
	 */
	OsTaskActivationOperation createOsTaskActivationOperation();

	/**
	 * Returns a new object of class '<em>Os Event Set Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Activation Operation</em>'.
	 * @generated
	 */
	OsEventSetActivationOperation createOsEventSetActivationOperation();

	/**
	 * Returns a new object of class '<em>Timing Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Triggering Executable Start Operation</em>'.
	 * @generated
	 */
	TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Plain Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Executable Start Operation</em>'.
	 * @generated
	 */
	PlainExecutableStartOperation createPlainExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * @generated
	 */
	ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Cycle Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle Countup Operation</em>'.
	 * @generated
	 */
	CycleCountupOperation createCycleCountupOperation();

	/**
	 * Returns a new object of class '<em>Start Offset Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Offset Countup Operation</em>'.
	 * @generated
	 */
	StartOffsetCountupOperation createStartOffsetCountupOperation();

	/**
	 * Returns a new object of class '<em>Ioc Empty Queue Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Empty Queue Api</em>'.
	 * @generated
	 */
	IocEmptyQueueApi createIocEmptyQueueApi();

	/**
	 * Returns a new object of class '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte</em>'.
	 * @generated
	 */
	Rte createRte();

	/**
	 * Returns a new object of class '<em>Com Send Signal Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Trusted Function</em>'.
	 * @generated
	 */
	ComSendSignalTrustedFunction createComSendSignalTrustedFunction();

	/**
	 * Returns a new object of class '<em>Os Set Event Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Set Event Api</em>'.
	 * @generated
	 */
	OsSetEventApi createOsSetEventApi();

	/**
	 * Returns a new object of class '<em>Com Send Signal Immediate Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Immediate Task Body</em>'.
	 * @generated
	 */
	ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody();

	/**
	 * Returns a new object of class '<em>Com Send Proxy Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Proxy Operation</em>'.
	 * @generated
	 */
	ComSendProxyOperation createComSendProxyOperation();

	/**
	 * Returns a new object of class '<em>Ioc Receive Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Receive Group Api</em>'.
	 * @generated
	 */
	IocReceiveGroupApi createIocReceiveGroupApi();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	ModuleRoot createModuleRoot();

	/**
	 * Returns a new object of class '<em>Inter Partition Timeout Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Partition Timeout Operation</em>'.
	 * @generated
	 */
	InterPartitionTimeoutOperation createInterPartitionTimeoutOperation();

	/**
	 * Returns a new object of class '<em>Variable Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Initialize Operation</em>'.
	 * @generated
	 */
	VariableInitializeOperation createVariableInitializeOperation();

	/**
	 * Returns a new object of class '<em>Ioc Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Initialize Operation</em>'.
	 * @generated
	 */
	IocInitializeOperation createIocInitializeOperation();

	/**
	 * Returns a new object of class '<em>Os Suspend All Interrupts Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Suspend All Interrupts Api</em>'.
	 * @generated
	 */
	OsSuspendAllInterruptsApi createOsSuspendAllInterruptsApi();

	/**
	 * Returns a new object of class '<em>Os Get Spinlock Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Get Spinlock Api</em>'.
	 * @generated
	 */
	OsGetSpinlockApi createOsGetSpinlockApi();

	/**
	 * Returns a new object of class '<em>Multicore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicore Rte Start Api</em>'.
	 * @generated
	 */
	MulticoreRteStartApi createMulticoreRteStartApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Write Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Write Trusted Function</em>'.
	 * @generated
	 */
	RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction();

	/**
	 * Returns a new object of class '<em>Rte Buffer Send Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Send Trusted Function</em>'.
	 * @generated
	 */
	RteBufferSendTrustedFunction createRteBufferSendTrustedFunction();

	/**
	 * Returns a new object of class '<em>Cs Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cs Trusted Function</em>'.
	 * @generated
	 */
	CsTrustedFunction createCsTrustedFunction();

	/**
	 * Returns a new object of class '<em>Cs Tf Called Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cs Tf Called Runnable</em>'.
	 * @generated
	 */
	CsTfCalledRunnable createCsTfCalledRunnable();

	/**
	 * Returns a new object of class '<em>Server Runnable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Runnable Start Operation</em>'.
	 * @generated
	 */
	ServerRunnableStartOperation createServerRunnableStartOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Send Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Group Api</em>'.
	 * @generated
	 */
	IocSendGroupApi createIocSendGroupApi();

	/**
	 * Returns a new object of class '<em>Ioc Queued Group Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Group Communication</em>'.
	 * @generated
	 */
	IocQueuedGroupCommunication createIocQueuedGroupCommunication();

	/**
	 * Returns a new object of class '<em>Singlecore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singlecore Rte Start Api</em>'.
	 * @generated
	 */
	SinglecoreRteStartApi createSinglecoreRteStartApi();

	/**
	 * Returns a new object of class '<em>Rte Internal Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Internal Header</em>'.
	 * @generated
	 */
	RteInternalHeader createRteInternalHeader();

	/**
	 * Returns a new object of class '<em>Mode Declaration Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration Group</em>'.
	 * @generated
	 */
	ModeDeclarationGroup createModeDeclarationGroup();

	/**
	 * Returns a new object of class '<em>Mode Machine Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Machine Instance</em>'.
	 * @generated
	 */
	ModeMachineInstance createModeMachineInstance();

	/**
	 * Returns a new object of class '<em>Function Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Macro</em>'.
	 * @generated
	 */
	FunctionMacro createFunctionMacro();

	/**
	 * Returns a new object of class '<em>Com Proxy Function Table File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Proxy Function Table File Contents Group</em>'.
	 * @generated
	 */
	ComProxyFunctionTableFileContentsGroup createComProxyFunctionTableFileContentsGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModulePackage getModulePackage();

} //ModuleFactory
