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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage
 * @generated
 */
public class ModuleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModulePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSwitch() {
		if (modelPackage == null) {
			modelPackage = ModulePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModulePackage.MODULE_OBJECT: {
				ModuleObject moduleObject = (ModuleObject)theEObject;
				T result = caseModuleObject(moduleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODULE_REFERRABLE: {
				ModuleReferrable moduleReferrable = (ModuleReferrable)theEObject;
				T result = caseModuleReferrable(moduleReferrable);
				if (result == null) result = caseModuleObject(moduleReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseModuleObject(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.EXECUTABLE_ENTITY: {
				ExecutableEntity executableEntity = (ExecutableEntity)theEObject;
				T result = caseExecutableEntity(executableEntity);
				if (result == null) result = caseFunction(executableEntity);
				if (result == null) result = caseModuleReferrable(executableEntity);
				if (result == null) result = caseModuleObject(executableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BSW_SCHEDULABLE_ENTITY: {
				BswSchedulableEntity bswSchedulableEntity = (BswSchedulableEntity)theEObject;
				T result = caseBswSchedulableEntity(bswSchedulableEntity);
				if (result == null) result = caseExecutableEntity(bswSchedulableEntity);
				if (result == null) result = caseFunction(bswSchedulableEntity);
				if (result == null) result = caseModuleReferrable(bswSchedulableEntity);
				if (result == null) result = caseModuleObject(bswSchedulableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RUNNABLE_ENTITY: {
				RunnableEntity runnableEntity = (RunnableEntity)theEObject;
				T result = caseRunnableEntity(runnableEntity);
				if (result == null) result = caseExecutableEntity(runnableEntity);
				if (result == null) result = caseFunction(runnableEntity);
				if (result == null) result = caseModuleReferrable(runnableEntity);
				if (result == null) result = caseModuleObject(runnableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_API: {
				RteApi rteApi = (RteApi)theEObject;
				T result = caseRteApi(rteApi);
				if (result == null) result = caseFunction(rteApi);
				if (result == null) result = caseModuleReferrable(rteApi);
				if (result == null) result = caseModuleObject(rteApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.WRITE_API: {
				WriteApi writeApi = (WriteApi)theEObject;
				T result = caseWriteApi(writeApi);
				if (result == null) result = caseRteApi(writeApi);
				if (result == null) result = caseFunction(writeApi);
				if (result == null) result = caseModuleReferrable(writeApi);
				if (result == null) result = caseModuleObject(writeApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SEND_OPERATION: {
				SendOperation sendOperation = (SendOperation)theEObject;
				T result = caseSendOperation(sendOperation);
				if (result == null) result = caseOperation(sendOperation);
				if (result == null) result = caseModuleObject(sendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION: {
				RteBufferNonqueuedSendOperation rteBufferNonqueuedSendOperation = (RteBufferNonqueuedSendOperation)theEObject;
				T result = caseRteBufferNonqueuedSendOperation(rteBufferNonqueuedSendOperation);
				if (result == null) result = caseSendOperation(rteBufferNonqueuedSendOperation);
				if (result == null) result = caseOperation(rteBufferNonqueuedSendOperation);
				if (result == null) result = caseModuleObject(rteBufferNonqueuedSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_NONQUEUED_READ_OPERATION: {
				RteBufferNonqueuedReadOperation rteBufferNonqueuedReadOperation = (RteBufferNonqueuedReadOperation)theEObject;
				T result = caseRteBufferNonqueuedReadOperation(rteBufferNonqueuedReadOperation);
				if (result == null) result = caseReadOperation(rteBufferNonqueuedReadOperation);
				if (result == null) result = caseOperation(rteBufferNonqueuedReadOperation);
				if (result == null) result = caseModuleObject(rteBufferNonqueuedReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.READ_OPERATION: {
				ReadOperation readOperation = (ReadOperation)theEObject;
				T result = caseReadOperation(readOperation);
				if (result == null) result = caseOperation(readOperation);
				if (result == null) result = caseModuleObject(readOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.READ_API: {
				ReadApi readApi = (ReadApi)theEObject;
				T result = caseReadApi(readApi);
				if (result == null) result = caseRteApi(readApi);
				if (result == null) result = caseFunction(readApi);
				if (result == null) result = caseModuleReferrable(readApi);
				if (result == null) result = caseModuleObject(readApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IRV_READ_OPERATION: {
				IrvReadOperation irvReadOperation = (IrvReadOperation)theEObject;
				T result = caseIrvReadOperation(irvReadOperation);
				if (result == null) result = caseOperation(irvReadOperation);
				if (result == null) result = caseModuleObject(irvReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IRV_READ_API: {
				IrvReadApi irvReadApi = (IrvReadApi)theEObject;
				T result = caseIrvReadApi(irvReadApi);
				if (result == null) result = caseRteApi(irvReadApi);
				if (result == null) result = caseFunction(irvReadApi);
				if (result == null) result = caseModuleReferrable(irvReadApi);
				if (result == null) result = caseModuleObject(irvReadApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IRV_WRITE_OPERATION: {
				IrvWriteOperation irvWriteOperation = (IrvWriteOperation)theEObject;
				T result = caseIrvWriteOperation(irvWriteOperation);
				if (result == null) result = caseOperation(irvWriteOperation);
				if (result == null) result = caseModuleObject(irvWriteOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IRV_WRITE_API: {
				IrvWriteApi irvWriteApi = (IrvWriteApi)theEObject;
				T result = caseIrvWriteApi(irvWriteApi);
				if (result == null) result = caseRteApi(irvWriteApi);
				if (result == null) result = caseFunction(irvWriteApi);
				if (result == null) result = caseModuleReferrable(irvWriteApi);
				if (result == null) result = caseModuleObject(irvWriteApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_VARIABLE_SET: {
				RteBufferVariableSet rteBufferVariableSet = (RteBufferVariableSet)theEObject;
				T result = caseRteBufferVariableSet(rteBufferVariableSet);
				if (result == null) result = caseGlobalVariable(rteBufferVariableSet);
				if (result == null) result = caseVariable(rteBufferVariableSet);
				if (result == null) result = caseValue(rteBufferVariableSet);
				if (result == null) result = caseModuleReferrable(rteBufferVariableSet);
				if (result == null) result = caseModuleObject(rteBufferVariableSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.GLOBAL_VARIABLE_SET: {
				GlobalVariableSet globalVariableSet = (GlobalVariableSet)theEObject;
				T result = caseGlobalVariableSet(globalVariableSet);
				if (result == null) result = caseGlobalVariable(globalVariableSet);
				if (result == null) result = caseVariable(globalVariableSet);
				if (result == null) result = caseValue(globalVariableSet);
				if (result == null) result = caseModuleReferrable(globalVariableSet);
				if (result == null) result = caseModuleObject(globalVariableSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_VARIABLE: {
				ComProxyFunctionTableVariable comProxyFunctionTableVariable = (ComProxyFunctionTableVariable)theEObject;
				T result = caseComProxyFunctionTableVariable(comProxyFunctionTableVariable);
				if (result == null) result = caseGlobalVariable(comProxyFunctionTableVariable);
				if (result == null) result = caseVariable(comProxyFunctionTableVariable);
				if (result == null) result = caseValue(comProxyFunctionTableVariable);
				if (result == null) result = caseModuleReferrable(comProxyFunctionTableVariable);
				if (result == null) result = caseModuleObject(comProxyFunctionTableVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_SOURCE: {
				RteSource rteSource = (RteSource)theEObject;
				T result = caseRteSource(rteSource);
				if (result == null) result = caseSourceFile(rteSource);
				if (result == null) result = caseFile(rteSource);
				if (result == null) result = caseModuleReferrable(rteSource);
				if (result == null) result = caseModuleObject(rteSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_MODULE: {
				RteModule rteModule = (RteModule)theEObject;
				T result = caseRteModule(rteModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseVariable(globalVariable);
				if (result == null) result = caseValue(globalVariable);
				if (result == null) result = caseModuleReferrable(globalVariable);
				if (result == null) result = caseModuleObject(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseModuleReferrable(file);
				if (result == null) result = caseModuleObject(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseVariable(parameter);
				if (result == null) result = caseValue(parameter);
				if (result == null) result = caseModuleReferrable(parameter);
				if (result == null) result = caseModuleObject(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseModuleReferrable(type);
				if (result == null) result = caseModuleObject(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariable(localVariable);
				if (result == null) result = caseValue(localVariable);
				if (result == null) result = caseModuleReferrable(localVariable);
				if (result == null) result = caseModuleObject(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_APPLICATION_HEADER: {
				RteApplicationHeader rteApplicationHeader = (RteApplicationHeader)theEObject;
				T result = caseRteApplicationHeader(rteApplicationHeader);
				if (result == null) result = caseHeaderFile(rteApplicationHeader);
				if (result == null) result = caseFile(rteApplicationHeader);
				if (result == null) result = caseModuleReferrable(rteApplicationHeader);
				if (result == null) result = caseModuleObject(rteApplicationHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseModuleReferrable(function);
				if (result == null) result = caseModuleObject(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.LOGICAL_COMPARTMENT: {
				LogicalCompartment logicalCompartment = (LogicalCompartment)theEObject;
				T result = caseLogicalCompartment(logicalCompartment);
				if (result == null) result = caseModuleReferrable(logicalCompartment);
				if (result == null) result = caseModuleObject(logicalCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE: {
				Rte rte = (Rte)theEObject;
				T result = caseRte(rte);
				if (result == null) result = caseLogicalCompartment(rte);
				if (result == null) result = caseModuleReferrable(rte);
				if (result == null) result = caseModuleObject(rte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseLogicalCompartment(core);
				if (result == null) result = caseModuleReferrable(core);
				if (result == null) result = caseModuleObject(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T result = casePartition(partition);
				if (result == null) result = caseLogicalCompartment(partition);
				if (result == null) result = caseModuleReferrable(partition);
				if (result == null) result = caseModuleObject(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SWC: {
				Swc swc = (Swc)theEObject;
				T result = caseSwc(swc);
				if (result == null) result = caseLogicalCompartment(swc);
				if (result == null) result = caseModuleReferrable(swc);
				if (result == null) result = caseModuleObject(swc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_HEADER: {
				RteHeader rteHeader = (RteHeader)theEObject;
				T result = caseRteHeader(rteHeader);
				if (result == null) result = caseHeaderFile(rteHeader);
				if (result == null) result = caseFile(rteHeader);
				if (result == null) result = caseModuleReferrable(rteHeader);
				if (result == null) result = caseModuleObject(rteHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BSW_API_HEADER: {
				RteBswApiHeader rteBswApiHeader = (RteBswApiHeader)theEObject;
				T result = caseRteBswApiHeader(rteBswApiHeader);
				if (result == null) result = caseHeaderFile(rteBswApiHeader);
				if (result == null) result = caseFile(rteBswApiHeader);
				if (result == null) result = caseModuleReferrable(rteBswApiHeader);
				if (result == null) result = caseModuleObject(rteBswApiHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_LIFECYCLE_HEADER: {
				RteLifecycleHeader rteLifecycleHeader = (RteLifecycleHeader)theEObject;
				T result = caseRteLifecycleHeader(rteLifecycleHeader);
				if (result == null) result = caseHeaderFile(rteLifecycleHeader);
				if (result == null) result = caseFile(rteLifecycleHeader);
				if (result == null) result = caseModuleReferrable(rteLifecycleHeader);
				if (result == null) result = caseModuleObject(rteLifecycleHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER: {
				RteApplicationTypeHeader rteApplicationTypeHeader = (RteApplicationTypeHeader)theEObject;
				T result = caseRteApplicationTypeHeader(rteApplicationTypeHeader);
				if (result == null) result = caseHeaderFile(rteApplicationTypeHeader);
				if (result == null) result = caseFile(rteApplicationTypeHeader);
				if (result == null) result = caseModuleReferrable(rteApplicationTypeHeader);
				if (result == null) result = caseModuleObject(rteApplicationTypeHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_VFB_TRACE_HEADER: {
				RteVfbTraceHeader rteVfbTraceHeader = (RteVfbTraceHeader)theEObject;
				T result = caseRteVfbTraceHeader(rteVfbTraceHeader);
				if (result == null) result = caseHeaderFile(rteVfbTraceHeader);
				if (result == null) result = caseFile(rteVfbTraceHeader);
				if (result == null) result = caseModuleReferrable(rteVfbTraceHeader);
				if (result == null) result = caseModuleObject(rteVfbTraceHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_CONFIGURATION_HEADER: {
				RteConfigurationHeader rteConfigurationHeader = (RteConfigurationHeader)theEObject;
				T result = caseRteConfigurationHeader(rteConfigurationHeader);
				if (result == null) result = caseHeaderFile(rteConfigurationHeader);
				if (result == null) result = caseFile(rteConfigurationHeader);
				if (result == null) result = caseModuleReferrable(rteConfigurationHeader);
				if (result == null) result = caseModuleObject(rteConfigurationHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_CALLBACK_HEADER: {
				RteCallbackHeader rteCallbackHeader = (RteCallbackHeader)theEObject;
				T result = caseRteCallbackHeader(rteCallbackHeader);
				if (result == null) result = caseHeaderFile(rteCallbackHeader);
				if (result == null) result = caseFile(rteCallbackHeader);
				if (result == null) result = caseModuleReferrable(rteCallbackHeader);
				if (result == null) result = caseModuleObject(rteCallbackHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_TYPE_HEADER: {
				RteTypeHeader rteTypeHeader = (RteTypeHeader)theEObject;
				T result = caseRteTypeHeader(rteTypeHeader);
				if (result == null) result = caseHeaderFile(rteTypeHeader);
				if (result == null) result = caseFile(rteTypeHeader);
				if (result == null) result = caseModuleReferrable(rteTypeHeader);
				if (result == null) result = caseModuleObject(rteTypeHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.INVALIDATE_API: {
				InvalidateApi invalidateApi = (InvalidateApi)theEObject;
				T result = caseInvalidateApi(invalidateApi);
				if (result == null) result = caseRteApi(invalidateApi);
				if (result == null) result = caseFunction(invalidateApi);
				if (result == null) result = caseModuleReferrable(invalidateApi);
				if (result == null) result = caseModuleObject(invalidateApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION: {
				IocNonqueuedSendOperation iocNonqueuedSendOperation = (IocNonqueuedSendOperation)theEObject;
				T result = caseIocNonqueuedSendOperation(iocNonqueuedSendOperation);
				if (result == null) result = caseIocSendOperation(iocNonqueuedSendOperation);
				if (result == null) result = caseSendOperation(iocNonqueuedSendOperation);
				if (result == null) result = caseOperation(iocNonqueuedSendOperation);
				if (result == null) result = caseModuleObject(iocNonqueuedSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.DIRECT_COM_SEND_OPERATION: {
				DirectComSendOperation directComSendOperation = (DirectComSendOperation)theEObject;
				T result = caseDirectComSendOperation(directComSendOperation);
				if (result == null) result = caseComSendOperation(directComSendOperation);
				if (result == null) result = caseSendOperation(directComSendOperation);
				if (result == null) result = caseOperation(directComSendOperation);
				if (result == null) result = caseModuleObject(directComSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION: {
				TrustedFunctionRteOperation trustedFunctionRteOperation = (TrustedFunctionRteOperation)theEObject;
				T result = caseTrustedFunctionRteOperation(trustedFunctionRteOperation);
				if (result == null) result = caseSendOperation(trustedFunctionRteOperation);
				if (result == null) result = caseOperation(trustedFunctionRteOperation);
				if (result == null) result = caseModuleObject(trustedFunctionRteOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION: {
				TrustedFunctionRteBufferWriteSendOperation trustedFunctionRteBufferWriteSendOperation = (TrustedFunctionRteBufferWriteSendOperation)theEObject;
				T result = caseTrustedFunctionRteBufferWriteSendOperation(trustedFunctionRteBufferWriteSendOperation);
				if (result == null) result = caseTrustedFunctionRteOperation(trustedFunctionRteBufferWriteSendOperation);
				if (result == null) result = caseSendOperation(trustedFunctionRteBufferWriteSendOperation);
				if (result == null) result = caseOperation(trustedFunctionRteBufferWriteSendOperation);
				if (result == null) result = caseModuleObject(trustedFunctionRteBufferWriteSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION: {
				TrustedFunctionRteBufferSendSendOperation trustedFunctionRteBufferSendSendOperation = (TrustedFunctionRteBufferSendSendOperation)theEObject;
				T result = caseTrustedFunctionRteBufferSendSendOperation(trustedFunctionRteBufferSendSendOperation);
				if (result == null) result = caseTrustedFunctionRteOperation(trustedFunctionRteBufferSendSendOperation);
				if (result == null) result = caseSendOperation(trustedFunctionRteBufferSendSendOperation);
				if (result == null) result = caseOperation(trustedFunctionRteBufferSendSendOperation);
				if (result == null) result = caseModuleObject(trustedFunctionRteBufferSendSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION: {
				TrustedFunctionRteBufferInvalidateSendOperation trustedFunctionRteBufferInvalidateSendOperation = (TrustedFunctionRteBufferInvalidateSendOperation)theEObject;
				T result = caseTrustedFunctionRteBufferInvalidateSendOperation(trustedFunctionRteBufferInvalidateSendOperation);
				if (result == null) result = caseTrustedFunctionRteOperation(trustedFunctionRteBufferInvalidateSendOperation);
				if (result == null) result = caseSendOperation(trustedFunctionRteBufferInvalidateSendOperation);
				if (result == null) result = caseOperation(trustedFunctionRteBufferInvalidateSendOperation);
				if (result == null) result = caseModuleObject(trustedFunctionRteBufferInvalidateSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION: {
				RteBufferInvalidateTrustedFunction rteBufferInvalidateTrustedFunction = (RteBufferInvalidateTrustedFunction)theEObject;
				T result = caseRteBufferInvalidateTrustedFunction(rteBufferInvalidateTrustedFunction);
				if (result == null) result = caseTrustedFunction(rteBufferInvalidateTrustedFunction);
				if (result == null) result = caseFunction(rteBufferInvalidateTrustedFunction);
				if (result == null) result = caseModuleReferrable(rteBufferInvalidateTrustedFunction);
				if (result == null) result = caseModuleObject(rteBufferInvalidateTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION: {
				TrustedFunctionComSendOperation trustedFunctionComSendOperation = (TrustedFunctionComSendOperation)theEObject;
				T result = caseTrustedFunctionComSendOperation(trustedFunctionComSendOperation);
				if (result == null) result = caseComSendOperation(trustedFunctionComSendOperation);
				if (result == null) result = caseSendOperation(trustedFunctionComSendOperation);
				if (result == null) result = caseOperation(trustedFunctionComSendOperation);
				if (result == null) result = caseModuleObject(trustedFunctionComSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION: {
				ImmediateProxyComSendOperation immediateProxyComSendOperation = (ImmediateProxyComSendOperation)theEObject;
				T result = caseImmediateProxyComSendOperation(immediateProxyComSendOperation);
				if (result == null) result = caseProxyComSendOperation(immediateProxyComSendOperation);
				if (result == null) result = caseComSendOperation(immediateProxyComSendOperation);
				if (result == null) result = caseSendOperation(immediateProxyComSendOperation);
				if (result == null) result = caseOperation(immediateProxyComSendOperation);
				if (result == null) result = caseModuleObject(immediateProxyComSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PERIODIC_PROXY_COM_SEND_OPERATION: {
				PeriodicProxyComSendOperation periodicProxyComSendOperation = (PeriodicProxyComSendOperation)theEObject;
				T result = casePeriodicProxyComSendOperation(periodicProxyComSendOperation);
				if (result == null) result = caseProxyComSendOperation(periodicProxyComSendOperation);
				if (result == null) result = caseComSendOperation(periodicProxyComSendOperation);
				if (result == null) result = caseSendOperation(periodicProxyComSendOperation);
				if (result == null) result = caseOperation(periodicProxyComSendOperation);
				if (result == null) result = caseModuleObject(periodicProxyComSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_NONQUEUED_READ_OPERATION: {
				IocNonqueuedReadOperation iocNonqueuedReadOperation = (IocNonqueuedReadOperation)theEObject;
				T result = caseIocNonqueuedReadOperation(iocNonqueuedReadOperation);
				if (result == null) result = caseReadOperation(iocNonqueuedReadOperation);
				if (result == null) result = caseOperation(iocNonqueuedReadOperation);
				if (result == null) result = caseModuleObject(iocNonqueuedReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_READ_OPERATION: {
				ComReadOperation comReadOperation = (ComReadOperation)theEObject;
				T result = caseComReadOperation(comReadOperation);
				if (result == null) result = caseReadOperation(comReadOperation);
				if (result == null) result = caseOperation(comReadOperation);
				if (result == null) result = caseModuleObject(comReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION: {
				IocNonqueuedCommunication iocNonqueuedCommunication = (IocNonqueuedCommunication)theEObject;
				T result = caseIocNonqueuedCommunication(iocNonqueuedCommunication);
				if (result == null) result = caseIocCommunication(iocNonqueuedCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_WRITE_API: {
				IocWriteApi iocWriteApi = (IocWriteApi)theEObject;
				T result = caseIocWriteApi(iocWriteApi);
				if (result == null) result = caseIocApi(iocWriteApi);
				if (result == null) result = caseFunction(iocWriteApi);
				if (result == null) result = caseModuleReferrable(iocWriteApi);
				if (result == null) result = caseModuleObject(iocWriteApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_READ_API: {
				IocReadApi iocReadApi = (IocReadApi)theEObject;
				T result = caseIocReadApi(iocReadApi);
				if (result == null) result = caseIocApi(iocReadApi);
				if (result == null) result = caseFunction(iocReadApi);
				if (result == null) result = caseModuleReferrable(iocReadApi);
				if (result == null) result = caseModuleObject(iocReadApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_API: {
				ComSendSignalApi comSendSignalApi = (ComSendSignalApi)theEObject;
				T result = caseComSendSignalApi(comSendSignalApi);
				if (result == null) result = caseComApi(comSendSignalApi);
				if (result == null) result = caseFunction(comSendSignalApi);
				if (result == null) result = caseModuleReferrable(comSendSignalApi);
				if (result == null) result = caseModuleObject(comSendSignalApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_RECEIVE_SIGNAL_API: {
				ComReceiveSignalApi comReceiveSignalApi = (ComReceiveSignalApi)theEObject;
				T result = caseComReceiveSignalApi(comReceiveSignalApi);
				if (result == null) result = caseComApi(comReceiveSignalApi);
				if (result == null) result = caseFunction(comReceiveSignalApi);
				if (result == null) result = caseModuleReferrable(comReceiveSignalApi);
				if (result == null) result = caseModuleObject(comReceiveSignalApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_RX_CALLBACK: {
				ComRxCallback comRxCallback = (ComRxCallback)theEObject;
				T result = caseComRxCallback(comRxCallback);
				if (result == null) result = caseComCallback(comRxCallback);
				if (result == null) result = caseFunction(comRxCallback);
				if (result == null) result = caseModuleReferrable(comRxCallback);
				if (result == null) result = caseModuleObject(comRxCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_OPERATION: {
				ComSendOperation comSendOperation = (ComSendOperation)theEObject;
				T result = caseComSendOperation(comSendOperation);
				if (result == null) result = caseSendOperation(comSendOperation);
				if (result == null) result = caseOperation(comSendOperation);
				if (result == null) result = caseModuleObject(comSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_CALLBACK: {
				ComCallback comCallback = (ComCallback)theEObject;
				T result = caseComCallback(comCallback);
				if (result == null) result = caseFunction(comCallback);
				if (result == null) result = caseModuleReferrable(comCallback);
				if (result == null) result = caseModuleObject(comCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_RX_TOUT_CALLBACK: {
				ComRxTOutCallback comRxTOutCallback = (ComRxTOutCallback)theEObject;
				T result = caseComRxTOutCallback(comRxTOutCallback);
				if (result == null) result = caseComCallback(comRxTOutCallback);
				if (result == null) result = caseFunction(comRxTOutCallback);
				if (result == null) result = caseModuleReferrable(comRxTOutCallback);
				if (result == null) result = caseModuleObject(comRxTOutCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_INV_CALLBACK: {
				ComInvCallback comInvCallback = (ComInvCallback)theEObject;
				T result = caseComInvCallback(comInvCallback);
				if (result == null) result = caseComCallback(comInvCallback);
				if (result == null) result = caseFunction(comInvCallback);
				if (result == null) result = caseModuleReferrable(comInvCallback);
				if (result == null) result = caseModuleObject(comInvCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY: {
				ComSendSignalProxyEntity comSendSignalProxyEntity = (ComSendSignalProxyEntity)theEObject;
				T result = caseComSendSignalProxyEntity(comSendSignalProxyEntity);
				if (result == null) result = caseBswSchedulableEntity(comSendSignalProxyEntity);
				if (result == null) result = caseExecutableEntity(comSendSignalProxyEntity);
				if (result == null) result = caseFunction(comSendSignalProxyEntity);
				if (result == null) result = caseModuleReferrable(comSendSignalProxyEntity);
				if (result == null) result = caseModuleObject(comSendSignalProxyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_ENTITY: {
				ComSendSignalImmediateEntity comSendSignalImmediateEntity = (ComSendSignalImmediateEntity)theEObject;
				T result = caseComSendSignalImmediateEntity(comSendSignalImmediateEntity);
				if (result == null) result = caseComSendSignalProxyEntity(comSendSignalImmediateEntity);
				if (result == null) result = caseBswSchedulableEntity(comSendSignalImmediateEntity);
				if (result == null) result = caseExecutableEntity(comSendSignalImmediateEntity);
				if (result == null) result = caseFunction(comSendSignalImmediateEntity);
				if (result == null) result = caseModuleReferrable(comSendSignalImmediateEntity);
				if (result == null) result = caseModuleObject(comSendSignalImmediateEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_PERIODIC_ENTITY: {
				ComSendSignalPeriodicEntity comSendSignalPeriodicEntity = (ComSendSignalPeriodicEntity)theEObject;
				T result = caseComSendSignalPeriodicEntity(comSendSignalPeriodicEntity);
				if (result == null) result = caseComSendSignalProxyEntity(comSendSignalPeriodicEntity);
				if (result == null) result = caseBswSchedulableEntity(comSendSignalPeriodicEntity);
				if (result == null) result = caseExecutableEntity(comSendSignalPeriodicEntity);
				if (result == null) result = caseFunction(comSendSignalPeriodicEntity);
				if (result == null) result = caseModuleReferrable(comSendSignalPeriodicEntity);
				if (result == null) result = caseModuleObject(comSendSignalPeriodicEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TACK_NOTIFY_OPERATION: {
				TAckNotifyOperation tAckNotifyOperation = (TAckNotifyOperation)theEObject;
				T result = caseTAckNotifyOperation(tAckNotifyOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_TX_TOUT_CALLBACK: {
				ComTxTOutCallback comTxTOutCallback = (ComTxTOutCallback)theEObject;
				T result = caseComTxTOutCallback(comTxTOutCallback);
				if (result == null) result = caseComCallback(comTxTOutCallback);
				if (result == null) result = caseFunction(comTxTOutCallback);
				if (result == null) result = caseModuleReferrable(comTxTOutCallback);
				if (result == null) result = caseModuleObject(comTxTOutCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_TACK_CALLBACK: {
				ComTAckCallback comTAckCallback = (ComTAckCallback)theEObject;
				T result = caseComTAckCallback(comTAckCallback);
				if (result == null) result = caseComCallback(comTAckCallback);
				if (result == null) result = caseFunction(comTAckCallback);
				if (result == null) result = caseModuleReferrable(comTAckCallback);
				if (result == null) result = caseModuleObject(comTAckCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_TERR_CALLBACK: {
				ComTErrCallback comTErrCallback = (ComTErrCallback)theEObject;
				T result = caseComTErrCallback(comTErrCallback);
				if (result == null) result = caseComCallback(comTErrCallback);
				if (result == null) result = caseFunction(comTErrCallback);
				if (result == null) result = caseModuleReferrable(comTErrCallback);
				if (result == null) result = caseModuleObject(comTErrCallback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FILTER_OPERATION: {
				FilterOperation filterOperation = (FilterOperation)theEObject;
				T result = caseFilterOperation(filterOperation);
				if (result == null) result = caseOperation(filterOperation);
				if (result == null) result = caseModuleObject(filterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION: {
				MaskedNewDiffersMaskedOldFilterOperation maskedNewDiffersMaskedOldFilterOperation = (MaskedNewDiffersMaskedOldFilterOperation)theEObject;
				T result = caseMaskedNewDiffersMaskedOldFilterOperation(maskedNewDiffersMaskedOldFilterOperation);
				if (result == null) result = caseFilterOperation(maskedNewDiffersMaskedOldFilterOperation);
				if (result == null) result = caseOperation(maskedNewDiffersMaskedOldFilterOperation);
				if (result == null) result = caseModuleObject(maskedNewDiffersMaskedOldFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION: {
				MaskedNewDiffersXFilterOperation maskedNewDiffersXFilterOperation = (MaskedNewDiffersXFilterOperation)theEObject;
				T result = caseMaskedNewDiffersXFilterOperation(maskedNewDiffersXFilterOperation);
				if (result == null) result = caseFilterOperation(maskedNewDiffersXFilterOperation);
				if (result == null) result = caseOperation(maskedNewDiffersXFilterOperation);
				if (result == null) result = caseModuleObject(maskedNewDiffersXFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.NEW_IS_WITHIN_FILTER_OPERATION: {
				NewIsWithinFilterOperation newIsWithinFilterOperation = (NewIsWithinFilterOperation)theEObject;
				T result = caseNewIsWithinFilterOperation(newIsWithinFilterOperation);
				if (result == null) result = caseFilterOperation(newIsWithinFilterOperation);
				if (result == null) result = caseOperation(newIsWithinFilterOperation);
				if (result == null) result = caseModuleObject(newIsWithinFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION: {
				NewIsOutsideFilterOperation newIsOutsideFilterOperation = (NewIsOutsideFilterOperation)theEObject;
				T result = caseNewIsOutsideFilterOperation(newIsOutsideFilterOperation);
				if (result == null) result = caseFilterOperation(newIsOutsideFilterOperation);
				if (result == null) result = caseOperation(newIsOutsideFilterOperation);
				if (result == null) result = caseModuleObject(newIsOutsideFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MASKED_NEW_EQUALS_XFILTER_OPERATION: {
				MaskedNewEqualsXFilterOperation maskedNewEqualsXFilterOperation = (MaskedNewEqualsXFilterOperation)theEObject;
				T result = caseMaskedNewEqualsXFilterOperation(maskedNewEqualsXFilterOperation);
				if (result == null) result = caseFilterOperation(maskedNewEqualsXFilterOperation);
				if (result == null) result = caseOperation(maskedNewEqualsXFilterOperation);
				if (result == null) result = caseModuleObject(maskedNewEqualsXFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION: {
				OneEveryNFilterOperation oneEveryNFilterOperation = (OneEveryNFilterOperation)theEObject;
				T result = caseOneEveryNFilterOperation(oneEveryNFilterOperation);
				if (result == null) result = caseFilterOperation(oneEveryNFilterOperation);
				if (result == null) result = caseOperation(oneEveryNFilterOperation);
				if (result == null) result = caseModuleObject(oneEveryNFilterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_CORE_START_API_IMPL: {
				RteCoreStartApiImpl rteCoreStartApiImpl = (RteCoreStartApiImpl)theEObject;
				T result = caseRteCoreStartApiImpl(rteCoreStartApiImpl);
				if (result == null) result = caseRteLifecycleApi(rteCoreStartApiImpl);
				if (result == null) result = caseFunction(rteCoreStartApiImpl);
				if (result == null) result = caseModuleReferrable(rteCoreStartApiImpl);
				if (result == null) result = caseModuleObject(rteCoreStartApiImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_STOP_API: {
				RteStopApi rteStopApi = (RteStopApi)theEObject;
				T result = caseRteStopApi(rteStopApi);
				if (result == null) result = caseRteLifecycleApi(rteStopApi);
				if (result == null) result = caseFunction(rteStopApi);
				if (result == null) result = caseModuleReferrable(rteStopApi);
				if (result == null) result = caseModuleObject(rteStopApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RESTART_PARTITION_API: {
				RestartPartitionApi restartPartitionApi = (RestartPartitionApi)theEObject;
				T result = caseRestartPartitionApi(restartPartitionApi);
				if (result == null) result = caseRteLifecycleApi(restartPartitionApi);
				if (result == null) result = caseFunction(restartPartitionApi);
				if (result == null) result = caseModuleReferrable(restartPartitionApi);
				if (result == null) result = caseModuleObject(restartPartitionApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PARTITION_RESTARTING_API: {
				PartitionRestartingApi partitionRestartingApi = (PartitionRestartingApi)theEObject;
				T result = casePartitionRestartingApi(partitionRestartingApi);
				if (result == null) result = caseRteLifecycleApi(partitionRestartingApi);
				if (result == null) result = caseFunction(partitionRestartingApi);
				if (result == null) result = caseModuleReferrable(partitionRestartingApi);
				if (result == null) result = caseModuleObject(partitionRestartingApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PARTITION_TERMINATED_API: {
				PartitionTerminatedApi partitionTerminatedApi = (PartitionTerminatedApi)theEObject;
				T result = casePartitionTerminatedApi(partitionTerminatedApi);
				if (result == null) result = caseRteLifecycleApi(partitionTerminatedApi);
				if (result == null) result = caseFunction(partitionTerminatedApi);
				if (result == null) result = caseModuleReferrable(partitionTerminatedApi);
				if (result == null) result = caseModuleObject(partitionTerminatedApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_LIFECYCLE_API: {
				RteLifecycleApi rteLifecycleApi = (RteLifecycleApi)theEObject;
				T result = caseRteLifecycleApi(rteLifecycleApi);
				if (result == null) result = caseFunction(rteLifecycleApi);
				if (result == null) result = caseModuleReferrable(rteLifecycleApi);
				if (result == null) result = caseModuleObject(rteLifecycleApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SEND_API: {
				SendApi sendApi = (SendApi)theEObject;
				T result = caseSendApi(sendApi);
				if (result == null) result = caseRteApi(sendApi);
				if (result == null) result = caseFunction(sendApi);
				if (result == null) result = caseModuleReferrable(sendApi);
				if (result == null) result = caseModuleObject(sendApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RECEIVE_API: {
				ReceiveApi receiveApi = (ReceiveApi)theEObject;
				T result = caseReceiveApi(receiveApi);
				if (result == null) result = caseRteApi(receiveApi);
				if (result == null) result = caseFunction(receiveApi);
				if (result == null) result = caseModuleReferrable(receiveApi);
				if (result == null) result = caseModuleObject(receiveApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_QUEUED_SEND_OPERATION: {
				RteBufferQueuedSendOperation rteBufferQueuedSendOperation = (RteBufferQueuedSendOperation)theEObject;
				T result = caseRteBufferQueuedSendOperation(rteBufferQueuedSendOperation);
				if (result == null) result = caseSendOperation(rteBufferQueuedSendOperation);
				if (result == null) result = caseOperation(rteBufferQueuedSendOperation);
				if (result == null) result = caseModuleObject(rteBufferQueuedSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_QUEUED_VARIABLE: {
				RteBufferQueuedVariable rteBufferQueuedVariable = (RteBufferQueuedVariable)theEObject;
				T result = caseRteBufferQueuedVariable(rteBufferQueuedVariable);
				if (result == null) result = caseGlobalVariable(rteBufferQueuedVariable);
				if (result == null) result = caseVariable(rteBufferQueuedVariable);
				if (result == null) result = caseValue(rteBufferQueuedVariable);
				if (result == null) result = caseModuleReferrable(rteBufferQueuedVariable);
				if (result == null) result = caseModuleObject(rteBufferQueuedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_QUEUED_READ_OPERATION: {
				RteBufferQueuedReadOperation rteBufferQueuedReadOperation = (RteBufferQueuedReadOperation)theEObject;
				T result = caseRteBufferQueuedReadOperation(rteBufferQueuedReadOperation);
				if (result == null) result = caseReadOperation(rteBufferQueuedReadOperation);
				if (result == null) result = caseOperation(rteBufferQueuedReadOperation);
				if (result == null) result = caseModuleObject(rteBufferQueuedReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_QUEUED_COMMUNICATION: {
				IocQueuedCommunication iocQueuedCommunication = (IocQueuedCommunication)theEObject;
				T result = caseIocQueuedCommunication(iocQueuedCommunication);
				if (result == null) result = caseIocCommunication(iocQueuedCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_RECEIVE_API: {
				IocReceiveApi iocReceiveApi = (IocReceiveApi)theEObject;
				T result = caseIocReceiveApi(iocReceiveApi);
				if (result == null) result = caseIocApi(iocReceiveApi);
				if (result == null) result = caseFunction(iocReceiveApi);
				if (result == null) result = caseModuleReferrable(iocReceiveApi);
				if (result == null) result = caseModuleObject(iocReceiveApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_SEND_API: {
				IocSendApi iocSendApi = (IocSendApi)theEObject;
				T result = caseIocSendApi(iocSendApi);
				if (result == null) result = caseIocApi(iocSendApi);
				if (result == null) result = caseFunction(iocSendApi);
				if (result == null) result = caseModuleReferrable(iocSendApi);
				if (result == null) result = caseModuleObject(iocSendApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_SEND_OPERATION: {
				IocSendOperation iocSendOperation = (IocSendOperation)theEObject;
				T result = caseIocSendOperation(iocSendOperation);
				if (result == null) result = caseSendOperation(iocSendOperation);
				if (result == null) result = caseOperation(iocSendOperation);
				if (result == null) result = caseModuleObject(iocSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_QUEUED_SEND_OPERATION: {
				IocQueuedSendOperation iocQueuedSendOperation = (IocQueuedSendOperation)theEObject;
				T result = caseIocQueuedSendOperation(iocQueuedSendOperation);
				if (result == null) result = caseIocSendOperation(iocQueuedSendOperation);
				if (result == null) result = caseSendOperation(iocQueuedSendOperation);
				if (result == null) result = caseOperation(iocQueuedSendOperation);
				if (result == null) result = caseModuleObject(iocQueuedSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_QUEUED_READ_OPERATION: {
				IocQueuedReadOperation iocQueuedReadOperation = (IocQueuedReadOperation)theEObject;
				T result = caseIocQueuedReadOperation(iocQueuedReadOperation);
				if (result == null) result = caseReadOperation(iocQueuedReadOperation);
				if (result == null) result = caseOperation(iocQueuedReadOperation);
				if (result == null) result = caseModuleObject(iocQueuedReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CALL_API: {
				CallApi callApi = (CallApi)theEObject;
				T result = caseCallApi(callApi);
				if (result == null) result = caseRteApi(callApi);
				if (result == null) result = caseFunction(callApi);
				if (result == null) result = caseModuleReferrable(callApi);
				if (result == null) result = caseModuleObject(callApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TF_CALL_API: {
				TfCallApi tfCallApi = (TfCallApi)theEObject;
				T result = caseTfCallApi(tfCallApi);
				if (result == null) result = caseCallApi(tfCallApi);
				if (result == null) result = caseRteApi(tfCallApi);
				if (result == null) result = caseFunction(tfCallApi);
				if (result == null) result = caseModuleReferrable(tfCallApi);
				if (result == null) result = caseModuleObject(tfCallApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.EXECUTABLE_START_OPERATION: {
				ExecutableStartOperation executableStartOperation = (ExecutableStartOperation)theEObject;
				T result = caseExecutableStartOperation(executableStartOperation);
				if (result == null) result = caseOperation(executableStartOperation);
				if (result == null) result = caseModuleObject(executableStartOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.DISABLED_IN_MODE: {
				DisabledInMode disabledInMode = (DisabledInMode)theEObject;
				T result = caseDisabledInMode(disabledInMode);
				if (result == null) result = caseOperation(disabledInMode);
				if (result == null) result = caseModuleObject(disabledInMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.EXCLUDE_OPERATION: {
				ExcludeOperation excludeOperation = (ExcludeOperation)theEObject;
				T result = caseExcludeOperation(excludeOperation);
				if (result == null) result = caseOperation(excludeOperation);
				if (result == null) result = caseModuleObject(excludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION: {
				AllInterruptBlockExcludeOperation allInterruptBlockExcludeOperation = (AllInterruptBlockExcludeOperation)theEObject;
				T result = caseAllInterruptBlockExcludeOperation(allInterruptBlockExcludeOperation);
				if (result == null) result = caseExcludeOperation(allInterruptBlockExcludeOperation);
				if (result == null) result = caseOperation(allInterruptBlockExcludeOperation);
				if (result == null) result = caseModuleObject(allInterruptBlockExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION: {
				OsInterruptBlockExcludeOperation osInterruptBlockExcludeOperation = (OsInterruptBlockExcludeOperation)theEObject;
				T result = caseOsInterruptBlockExcludeOperation(osInterruptBlockExcludeOperation);
				if (result == null) result = caseExcludeOperation(osInterruptBlockExcludeOperation);
				if (result == null) result = caseOperation(osInterruptBlockExcludeOperation);
				if (result == null) result = caseModuleObject(osInterruptBlockExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION: {
				OsSpinlockExcludeOperation osSpinlockExcludeOperation = (OsSpinlockExcludeOperation)theEObject;
				T result = caseOsSpinlockExcludeOperation(osSpinlockExcludeOperation);
				if (result == null) result = caseExcludeOperation(osSpinlockExcludeOperation);
				if (result == null) result = caseOperation(osSpinlockExcludeOperation);
				if (result == null) result = caseModuleObject(osSpinlockExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION: {
				OsResourceExcludeOperation osResourceExcludeOperation = (OsResourceExcludeOperation)theEObject;
				T result = caseOsResourceExcludeOperation(osResourceExcludeOperation);
				if (result == null) result = caseExcludeOperation(osResourceExcludeOperation);
				if (result == null) result = caseOperation(osResourceExcludeOperation);
				if (result == null) result = caseModuleObject(osResourceExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.NONE_EXCLUDE_OPERATION: {
				NoneExcludeOperation noneExcludeOperation = (NoneExcludeOperation)theEObject;
				T result = caseNoneExcludeOperation(noneExcludeOperation);
				if (result == null) result = caseExcludeOperation(noneExcludeOperation);
				if (result == null) result = caseOperation(noneExcludeOperation);
				if (result == null) result = caseModuleObject(noneExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseValue(constant);
				if (result == null) result = caseModuleReferrable(constant);
				if (result == null) result = caseModuleObject(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CONSTANT_MEMBER: {
				ConstantMember constantMember = (ConstantMember)theEObject;
				T result = caseConstantMember(constantMember);
				if (result == null) result = caseConstant(constantMember);
				if (result == null) result = caseValue(constantMember);
				if (result == null) result = caseModuleReferrable(constantMember);
				if (result == null) result = caseModuleObject(constantMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_ENTER_API: {
				RteEnterApi rteEnterApi = (RteEnterApi)theEObject;
				T result = caseRteEnterApi(rteEnterApi);
				if (result == null) result = caseRteApi(rteEnterApi);
				if (result == null) result = caseFunction(rteEnterApi);
				if (result == null) result = caseModuleReferrable(rteEnterApi);
				if (result == null) result = caseModuleObject(rteEnterApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_EXIT_API: {
				RteExitApi rteExitApi = (RteExitApi)theEObject;
				T result = caseRteExitApi(rteExitApi);
				if (result == null) result = caseRteApi(rteExitApi);
				if (result == null) result = caseFunction(rteExitApi);
				if (result == null) result = caseModuleReferrable(rteExitApi);
				if (result == null) result = caseModuleObject(rteExitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_BACKGROUND_TASK_ACTIVATION_EXECUTABLE_TASK_BODY: {
				OsBackgroundTaskActivationExecutableTaskBody osBackgroundTaskActivationExecutableTaskBody = (OsBackgroundTaskActivationExecutableTaskBody)theEObject;
				T result = caseOsBackgroundTaskActivationExecutableTaskBody(osBackgroundTaskActivationExecutableTaskBody);
				if (result == null) result = caseTaskBody(osBackgroundTaskActivationExecutableTaskBody);
				if (result == null) result = caseFunction(osBackgroundTaskActivationExecutableTaskBody);
				if (result == null) result = caseModuleReferrable(osBackgroundTaskActivationExecutableTaskBody);
				if (result == null) result = caseModuleObject(osBackgroundTaskActivationExecutableTaskBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY: {
				OsTaskActivationExecutableTaskBody osTaskActivationExecutableTaskBody = (OsTaskActivationExecutableTaskBody)theEObject;
				T result = caseOsTaskActivationExecutableTaskBody(osTaskActivationExecutableTaskBody);
				if (result == null) result = caseTaskBody(osTaskActivationExecutableTaskBody);
				if (result == null) result = caseFunction(osTaskActivationExecutableTaskBody);
				if (result == null) result = caseModuleReferrable(osTaskActivationExecutableTaskBody);
				if (result == null) result = caseModuleObject(osTaskActivationExecutableTaskBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY: {
				OsEventSetExecutableTaskBody osEventSetExecutableTaskBody = (OsEventSetExecutableTaskBody)theEObject;
				T result = caseOsEventSetExecutableTaskBody(osEventSetExecutableTaskBody);
				if (result == null) result = caseTaskBody(osEventSetExecutableTaskBody);
				if (result == null) result = caseFunction(osEventSetExecutableTaskBody);
				if (result == null) result = caseModuleReferrable(osEventSetExecutableTaskBody);
				if (result == null) result = caseModuleObject(osEventSetExecutableTaskBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_TASK_ACTIVATION_OPERATION: {
				OsTaskActivationOperation osTaskActivationOperation = (OsTaskActivationOperation)theEObject;
				T result = caseOsTaskActivationOperation(osTaskActivationOperation);
				if (result == null) result = caseContextActivationOperation(osTaskActivationOperation);
				if (result == null) result = caseOperation(osTaskActivationOperation);
				if (result == null) result = caseModuleObject(osTaskActivationOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION: {
				OsEventSetActivationOperation osEventSetActivationOperation = (OsEventSetActivationOperation)theEObject;
				T result = caseOsEventSetActivationOperation(osEventSetActivationOperation);
				if (result == null) result = caseContextActivationOperation(osEventSetActivationOperation);
				if (result == null) result = caseOperation(osEventSetActivationOperation);
				if (result == null) result = caseModuleObject(osEventSetActivationOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CONTEXT_ACTIVATION_OPERATION: {
				ContextActivationOperation contextActivationOperation = (ContextActivationOperation)theEObject;
				T result = caseContextActivationOperation(contextActivationOperation);
				if (result == null) result = caseOperation(contextActivationOperation);
				if (result == null) result = caseModuleObject(contextActivationOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION: {
				TimingTriggeringExecutableStartOperation timingTriggeringExecutableStartOperation = (TimingTriggeringExecutableStartOperation)theEObject;
				T result = caseTimingTriggeringExecutableStartOperation(timingTriggeringExecutableStartOperation);
				if (result == null) result = caseExecutableStartOperation(timingTriggeringExecutableStartOperation);
				if (result == null) result = caseOperation(timingTriggeringExecutableStartOperation);
				if (result == null) result = caseModuleObject(timingTriggeringExecutableStartOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PLAIN_EXECUTABLE_START_OPERATION: {
				PlainExecutableStartOperation plainExecutableStartOperation = (PlainExecutableStartOperation)theEObject;
				T result = casePlainExecutableStartOperation(plainExecutableStartOperation);
				if (result == null) result = caseExecutableStartOperation(plainExecutableStartOperation);
				if (result == null) result = caseOperation(plainExecutableStartOperation);
				if (result == null) result = caseModuleObject(plainExecutableStartOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION: {
				ModeSwitchTriggeringExecutableStartOperation modeSwitchTriggeringExecutableStartOperation = (ModeSwitchTriggeringExecutableStartOperation)theEObject;
				T result = caseModeSwitchTriggeringExecutableStartOperation(modeSwitchTriggeringExecutableStartOperation);
				if (result == null) result = caseExecutableStartOperation(modeSwitchTriggeringExecutableStartOperation);
				if (result == null) result = caseOperation(modeSwitchTriggeringExecutableStartOperation);
				if (result == null) result = caseModuleObject(modeSwitchTriggeringExecutableStartOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CYCLE_COUNTUP_OPERATION: {
				CycleCountupOperation cycleCountupOperation = (CycleCountupOperation)theEObject;
				T result = caseCycleCountupOperation(cycleCountupOperation);
				if (result == null) result = caseOperation(cycleCountupOperation);
				if (result == null) result = caseModuleObject(cycleCountupOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION: {
				StartOffsetCountupOperation startOffsetCountupOperation = (StartOffsetCountupOperation)theEObject;
				T result = caseStartOffsetCountupOperation(startOffsetCountupOperation);
				if (result == null) result = caseOperation(startOffsetCountupOperation);
				if (result == null) result = caseModuleObject(startOffsetCountupOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TASK_BODY: {
				TaskBody taskBody = (TaskBody)theEObject;
				T result = caseTaskBody(taskBody);
				if (result == null) result = caseFunction(taskBody);
				if (result == null) result = caseModuleReferrable(taskBody);
				if (result == null) result = caseModuleObject(taskBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_EMPTY_QUEUE_API: {
				IocEmptyQueueApi iocEmptyQueueApi = (IocEmptyQueueApi)theEObject;
				T result = caseIocEmptyQueueApi(iocEmptyQueueApi);
				if (result == null) result = caseIocApi(iocEmptyQueueApi);
				if (result == null) result = caseFunction(iocEmptyQueueApi);
				if (result == null) result = caseModuleReferrable(iocEmptyQueueApi);
				if (result == null) result = caseModuleObject(iocEmptyQueueApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_API: {
				ComApi comApi = (ComApi)theEObject;
				T result = caseComApi(comApi);
				if (result == null) result = caseFunction(comApi);
				if (result == null) result = caseModuleReferrable(comApi);
				if (result == null) result = caseModuleObject(comApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_API: {
				IocApi iocApi = (IocApi)theEObject;
				T result = caseIocApi(iocApi);
				if (result == null) result = caseFunction(iocApi);
				if (result == null) result = caseModuleReferrable(iocApi);
				if (result == null) result = caseModuleObject(iocApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseModuleReferrable(value);
				if (result == null) result = caseModuleObject(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION: {
				TrustedFunction trustedFunction = (TrustedFunction)theEObject;
				T result = caseTrustedFunction(trustedFunction);
				if (result == null) result = caseFunction(trustedFunction);
				if (result == null) result = caseModuleReferrable(trustedFunction);
				if (result == null) result = caseModuleObject(trustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION: {
				ComSendSignalTrustedFunction comSendSignalTrustedFunction = (ComSendSignalTrustedFunction)theEObject;
				T result = caseComSendSignalTrustedFunction(comSendSignalTrustedFunction);
				if (result == null) result = caseTrustedFunction(comSendSignalTrustedFunction);
				if (result == null) result = caseFunction(comSendSignalTrustedFunction);
				if (result == null) result = caseModuleReferrable(comSendSignalTrustedFunction);
				if (result == null) result = caseModuleObject(comSendSignalTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_SET_EVENT_API: {
				OsSetEventApi osSetEventApi = (OsSetEventApi)theEObject;
				T result = caseOsSetEventApi(osSetEventApi);
				if (result == null) result = caseOsApi(osSetEventApi);
				if (result == null) result = caseFunction(osSetEventApi);
				if (result == null) result = caseModuleReferrable(osSetEventApi);
				if (result == null) result = caseModuleObject(osSetEventApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_API: {
				OsApi osApi = (OsApi)theEObject;
				T result = caseOsApi(osApi);
				if (result == null) result = caseFunction(osApi);
				if (result == null) result = caseModuleReferrable(osApi);
				if (result == null) result = caseModuleObject(osApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY: {
				ComSendSignalImmediateTaskBody comSendSignalImmediateTaskBody = (ComSendSignalImmediateTaskBody)theEObject;
				T result = caseComSendSignalImmediateTaskBody(comSendSignalImmediateTaskBody);
				if (result == null) result = caseTaskBody(comSendSignalImmediateTaskBody);
				if (result == null) result = caseFunction(comSendSignalImmediateTaskBody);
				if (result == null) result = caseModuleReferrable(comSendSignalImmediateTaskBody);
				if (result == null) result = caseModuleObject(comSendSignalImmediateTaskBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseValue(variable);
				if (result == null) result = caseModuleReferrable(variable);
				if (result == null) result = caseModuleObject(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_PROXY_OPERATION: {
				ComSendProxyOperation comSendProxyOperation = (ComSendProxyOperation)theEObject;
				T result = caseComSendProxyOperation(comSendProxyOperation);
				if (result == null) result = caseOperation(comSendProxyOperation);
				if (result == null) result = caseModuleObject(comSendProxyOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_RECEIVE_GROUP_API: {
				IocReceiveGroupApi iocReceiveGroupApi = (IocReceiveGroupApi)theEObject;
				T result = caseIocReceiveGroupApi(iocReceiveGroupApi);
				if (result == null) result = caseIocReceiveApi(iocReceiveGroupApi);
				if (result == null) result = caseIocApi(iocReceiveGroupApi);
				if (result == null) result = caseFunction(iocReceiveGroupApi);
				if (result == null) result = caseModuleReferrable(iocReceiveGroupApi);
				if (result == null) result = caseModuleObject(iocReceiveGroupApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODULE_ROOT: {
				ModuleRoot moduleRoot = (ModuleRoot)theEObject;
				T result = caseModuleRoot(moduleRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.INTER_PARTITION_TIMEOUT_OPERATION: {
				InterPartitionTimeoutOperation interPartitionTimeoutOperation = (InterPartitionTimeoutOperation)theEObject;
				T result = caseInterPartitionTimeoutOperation(interPartitionTimeoutOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.INITIALIZE_OPERATION: {
				InitializeOperation initializeOperation = (InitializeOperation)theEObject;
				T result = caseInitializeOperation(initializeOperation);
				if (result == null) result = caseOperation(initializeOperation);
				if (result == null) result = caseModuleObject(initializeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.VARIABLE_INITIALIZE_OPERATION: {
				VariableInitializeOperation variableInitializeOperation = (VariableInitializeOperation)theEObject;
				T result = caseVariableInitializeOperation(variableInitializeOperation);
				if (result == null) result = caseInitializeOperation(variableInitializeOperation);
				if (result == null) result = caseOperation(variableInitializeOperation);
				if (result == null) result = caseModuleObject(variableInitializeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_INITIALIZE_OPERATION: {
				IocInitializeOperation iocInitializeOperation = (IocInitializeOperation)theEObject;
				T result = caseIocInitializeOperation(iocInitializeOperation);
				if (result == null) result = caseInitializeOperation(iocInitializeOperation);
				if (result == null) result = caseOperation(iocInitializeOperation);
				if (result == null) result = caseModuleObject(iocInitializeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_SUSPEND_ALL_INTERRUPTS_API: {
				OsSuspendAllInterruptsApi osSuspendAllInterruptsApi = (OsSuspendAllInterruptsApi)theEObject;
				T result = caseOsSuspendAllInterruptsApi(osSuspendAllInterruptsApi);
				if (result == null) result = caseOsApi(osSuspendAllInterruptsApi);
				if (result == null) result = caseFunction(osSuspendAllInterruptsApi);
				if (result == null) result = caseModuleReferrable(osSuspendAllInterruptsApi);
				if (result == null) result = caseModuleObject(osSuspendAllInterruptsApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_GET_SPINLOCK_API: {
				OsGetSpinlockApi osGetSpinlockApi = (OsGetSpinlockApi)theEObject;
				T result = caseOsGetSpinlockApi(osGetSpinlockApi);
				if (result == null) result = caseOsApi(osGetSpinlockApi);
				if (result == null) result = caseFunction(osGetSpinlockApi);
				if (result == null) result = caseModuleReferrable(osGetSpinlockApi);
				if (result == null) result = caseModuleObject(osGetSpinlockApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MULTICORE_RTE_START_API: {
				MulticoreRteStartApi multicoreRteStartApi = (MulticoreRteStartApi)theEObject;
				T result = caseMulticoreRteStartApi(multicoreRteStartApi);
				if (result == null) result = caseRteStartApi(multicoreRteStartApi);
				if (result == null) result = caseRteLifecycleApi(multicoreRteStartApi);
				if (result == null) result = caseFunction(multicoreRteStartApi);
				if (result == null) result = caseModuleReferrable(multicoreRteStartApi);
				if (result == null) result = caseModuleObject(multicoreRteStartApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_WRITE_TRUSTED_FUNCTION: {
				RteBufferWriteTrustedFunction rteBufferWriteTrustedFunction = (RteBufferWriteTrustedFunction)theEObject;
				T result = caseRteBufferWriteTrustedFunction(rteBufferWriteTrustedFunction);
				if (result == null) result = caseTrustedFunction(rteBufferWriteTrustedFunction);
				if (result == null) result = caseFunction(rteBufferWriteTrustedFunction);
				if (result == null) result = caseModuleReferrable(rteBufferWriteTrustedFunction);
				if (result == null) result = caseModuleObject(rteBufferWriteTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION: {
				RteBufferSendTrustedFunction rteBufferSendTrustedFunction = (RteBufferSendTrustedFunction)theEObject;
				T result = caseRteBufferSendTrustedFunction(rteBufferSendTrustedFunction);
				if (result == null) result = caseTrustedFunction(rteBufferSendTrustedFunction);
				if (result == null) result = caseFunction(rteBufferSendTrustedFunction);
				if (result == null) result = caseModuleReferrable(rteBufferSendTrustedFunction);
				if (result == null) result = caseModuleObject(rteBufferSendTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CS_TRUSTED_FUNCTION: {
				CsTrustedFunction csTrustedFunction = (CsTrustedFunction)theEObject;
				T result = caseCsTrustedFunction(csTrustedFunction);
				if (result == null) result = caseTrustedFunction(csTrustedFunction);
				if (result == null) result = caseFunction(csTrustedFunction);
				if (result == null) result = caseModuleReferrable(csTrustedFunction);
				if (result == null) result = caseModuleObject(csTrustedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CS_TF_CALLED_RUNNABLE: {
				CsTfCalledRunnable csTfCalledRunnable = (CsTfCalledRunnable)theEObject;
				T result = caseCsTfCalledRunnable(csTfCalledRunnable);
				if (result == null) result = caseModuleObject(csTfCalledRunnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SERVER_RUNNABLE_START_OPERATION: {
				ServerRunnableStartOperation serverRunnableStartOperation = (ServerRunnableStartOperation)theEObject;
				T result = caseServerRunnableStartOperation(serverRunnableStartOperation);
				if (result == null) result = caseExecutableStartOperation(serverRunnableStartOperation);
				if (result == null) result = caseOperation(serverRunnableStartOperation);
				if (result == null) result = caseModuleObject(serverRunnableStartOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_COMMUNICATION: {
				IocCommunication iocCommunication = (IocCommunication)theEObject;
				T result = caseIocCommunication(iocCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PROXY_COM_SEND_OPERATION: {
				ProxyComSendOperation proxyComSendOperation = (ProxyComSendOperation)theEObject;
				T result = caseProxyComSendOperation(proxyComSendOperation);
				if (result == null) result = caseComSendOperation(proxyComSendOperation);
				if (result == null) result = caseSendOperation(proxyComSendOperation);
				if (result == null) result = caseOperation(proxyComSendOperation);
				if (result == null) result = caseModuleObject(proxyComSendOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_SEND_GROUP_API: {
				IocSendGroupApi iocSendGroupApi = (IocSendGroupApi)theEObject;
				T result = caseIocSendGroupApi(iocSendGroupApi);
				if (result == null) result = caseIocSendApi(iocSendGroupApi);
				if (result == null) result = caseIocApi(iocSendGroupApi);
				if (result == null) result = caseFunction(iocSendGroupApi);
				if (result == null) result = caseModuleReferrable(iocSendGroupApi);
				if (result == null) result = caseModuleObject(iocSendGroupApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION: {
				IocQueuedGroupCommunication iocQueuedGroupCommunication = (IocQueuedGroupCommunication)theEObject;
				T result = caseIocQueuedGroupCommunication(iocQueuedGroupCommunication);
				if (result == null) result = caseIocCommunication(iocQueuedGroupCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SINGLECORE_RTE_START_API: {
				SinglecoreRteStartApi singlecoreRteStartApi = (SinglecoreRteStartApi)theEObject;
				T result = caseSinglecoreRteStartApi(singlecoreRteStartApi);
				if (result == null) result = caseRteStartApi(singlecoreRteStartApi);
				if (result == null) result = caseRteLifecycleApi(singlecoreRteStartApi);
				if (result == null) result = caseFunction(singlecoreRteStartApi);
				if (result == null) result = caseModuleReferrable(singlecoreRteStartApi);
				if (result == null) result = caseModuleObject(singlecoreRteStartApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_START_API: {
				RteStartApi rteStartApi = (RteStartApi)theEObject;
				T result = caseRteStartApi(rteStartApi);
				if (result == null) result = caseRteLifecycleApi(rteStartApi);
				if (result == null) result = caseFunction(rteStartApi);
				if (result == null) result = caseModuleReferrable(rteStartApi);
				if (result == null) result = caseModuleObject(rteStartApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.HEADER_FILE: {
				HeaderFile headerFile = (HeaderFile)theEObject;
				T result = caseHeaderFile(headerFile);
				if (result == null) result = caseFile(headerFile);
				if (result == null) result = caseModuleReferrable(headerFile);
				if (result == null) result = caseModuleObject(headerFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = caseFile(sourceFile);
				if (result == null) result = caseModuleReferrable(sourceFile);
				if (result == null) result = caseModuleObject(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_INTERNAL_HEADER: {
				RteInternalHeader rteInternalHeader = (RteInternalHeader)theEObject;
				T result = caseRteInternalHeader(rteInternalHeader);
				if (result == null) result = caseHeaderFile(rteInternalHeader);
				if (result == null) result = caseFile(rteInternalHeader);
				if (result == null) result = caseModuleReferrable(rteInternalHeader);
				if (result == null) result = caseModuleObject(rteInternalHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_TYPE: {
				ModeType modeType = (ModeType)theEObject;
				T result = caseModeType(modeType);
				if (result == null) result = caseType(modeType);
				if (result == null) result = caseModuleReferrable(modeType);
				if (result == null) result = caseModuleObject(modeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_DECLARATION_GROUP: {
				ModeDeclarationGroup modeDeclarationGroup = (ModeDeclarationGroup)theEObject;
				T result = caseModeDeclarationGroup(modeDeclarationGroup);
				if (result == null) result = caseModuleReferrable(modeDeclarationGroup);
				if (result == null) result = caseModuleObject(modeDeclarationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_QUEUE_TYPE: {
				ModeQueueType modeQueueType = (ModeQueueType)theEObject;
				T result = caseModeQueueType(modeQueueType);
				if (result == null) result = caseType(modeQueueType);
				if (result == null) result = caseModuleReferrable(modeQueueType);
				if (result == null) result = caseModuleObject(modeQueueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_QUEUED_VARIABLE: {
				ModeQueuedVariable modeQueuedVariable = (ModeQueuedVariable)theEObject;
				T result = caseModeQueuedVariable(modeQueuedVariable);
				if (result == null) result = caseGlobalVariable(modeQueuedVariable);
				if (result == null) result = caseVariable(modeQueuedVariable);
				if (result == null) result = caseValue(modeQueuedVariable);
				if (result == null) result = caseModuleReferrable(modeQueuedVariable);
				if (result == null) result = caseModuleObject(modeQueuedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODE_MACHINE_INSTANCE: {
				ModeMachineInstance modeMachineInstance = (ModeMachineInstance)theEObject;
				T result = caseModeMachineInstance(modeMachineInstance);
				if (result == null) result = caseModuleReferrable(modeMachineInstance);
				if (result == null) result = caseModuleObject(modeMachineInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FUNCTION_MACRO: {
				FunctionMacro functionMacro = (FunctionMacro)theEObject;
				T result = caseFunctionMacro(functionMacro);
				if (result == null) result = caseModuleObject(functionMacro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP: {
				ComProxyFunctionTableFileContentsGroup comProxyFunctionTableFileContentsGroup = (ComProxyFunctionTableFileContentsGroup)theEObject;
				T result = caseComProxyFunctionTableFileContentsGroup(comProxyFunctionTableFileContentsGroup);
				if (result == null) result = caseModuleObject(comProxyFunctionTableFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseModuleReferrable(primitiveType);
				if (result == null) result = caseModuleObject(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_PRIMITIVE_TYPE: {
				RedefinitionPrimitiveType redefinitionPrimitiveType = (RedefinitionPrimitiveType)theEObject;
				T result = caseRedefinitionPrimitiveType(redefinitionPrimitiveType);
				if (result == null) result = casePrimitiveType(redefinitionPrimitiveType);
				if (result == null) result = caseRedefinitionType(redefinitionPrimitiveType);
				if (result == null) result = caseType(redefinitionPrimitiveType);
				if (result == null) result = caseModuleReferrable(redefinitionPrimitiveType);
				if (result == null) result = caseModuleObject(redefinitionPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseType(arrayType);
				if (result == null) result = caseModuleReferrable(arrayType);
				if (result == null) result = caseModuleObject(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_ARRAY_TYPE: {
				RedefinitionArrayType redefinitionArrayType = (RedefinitionArrayType)theEObject;
				T result = caseRedefinitionArrayType(redefinitionArrayType);
				if (result == null) result = caseArrayType(redefinitionArrayType);
				if (result == null) result = caseRedefinitionType(redefinitionArrayType);
				if (result == null) result = caseType(redefinitionArrayType);
				if (result == null) result = caseModuleReferrable(redefinitionArrayType);
				if (result == null) result = caseModuleObject(redefinitionArrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				T result = caseUnionType(unionType);
				if (result == null) result = caseType(unionType);
				if (result == null) result = caseModuleReferrable(unionType);
				if (result == null) result = caseModuleObject(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_UNION_TYPE: {
				RedefinitionUnionType redefinitionUnionType = (RedefinitionUnionType)theEObject;
				T result = caseRedefinitionUnionType(redefinitionUnionType);
				if (result == null) result = caseUnionType(redefinitionUnionType);
				if (result == null) result = caseRedefinitionType(redefinitionUnionType);
				if (result == null) result = caseType(redefinitionUnionType);
				if (result == null) result = caseModuleReferrable(redefinitionUnionType);
				if (result == null) result = caseModuleObject(redefinitionUnionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.STRUCT_TYPE: {
				StructType structType = (StructType)theEObject;
				T result = caseStructType(structType);
				if (result == null) result = caseType(structType);
				if (result == null) result = caseModuleReferrable(structType);
				if (result == null) result = caseModuleObject(structType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_STRUCT_TYPE: {
				RedefinitionStructType redefinitionStructType = (RedefinitionStructType)theEObject;
				T result = caseRedefinitionStructType(redefinitionStructType);
				if (result == null) result = caseStructType(redefinitionStructType);
				if (result == null) result = caseRedefinitionType(redefinitionStructType);
				if (result == null) result = caseType(redefinitionStructType);
				if (result == null) result = caseModuleReferrable(redefinitionStructType);
				if (result == null) result = caseModuleObject(redefinitionStructType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BLACKBOX_TYPE: {
				BlackboxType blackboxType = (BlackboxType)theEObject;
				T result = caseBlackboxType(blackboxType);
				if (result == null) result = caseType(blackboxType);
				if (result == null) result = caseModuleReferrable(blackboxType);
				if (result == null) result = caseModuleObject(blackboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.UNION_MEMBER: {
				UnionMember unionMember = (UnionMember)theEObject;
				T result = caseUnionMember(unionMember);
				if (result == null) result = caseModuleObject(unionMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.STRUCT_MEMBER: {
				StructMember structMember = (StructMember)theEObject;
				T result = caseStructMember(structMember);
				if (result == null) result = caseModuleObject(structMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.VARIABLE_MEMBER: {
				VariableMember variableMember = (VariableMember)theEObject;
				T result = caseVariableMember(variableMember);
				if (result == null) result = caseVariable(variableMember);
				if (result == null) result = caseValue(variableMember);
				if (result == null) result = caseModuleReferrable(variableMember);
				if (result == null) result = caseModuleObject(variableMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_UTILITY_HEADER: {
				RteUtilityHeader rteUtilityHeader = (RteUtilityHeader)theEObject;
				T result = caseRteUtilityHeader(rteUtilityHeader);
				if (result == null) result = caseHeaderFile(rteUtilityHeader);
				if (result == null) result = caseFile(rteUtilityHeader);
				if (result == null) result = caseModuleReferrable(rteUtilityHeader);
				if (result == null) result = caseModuleObject(rteUtilityHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BLACKBOX_HEADER: {
				BlackboxHeader blackboxHeader = (BlackboxHeader)theEObject;
				T result = caseBlackboxHeader(blackboxHeader);
				if (result == null) result = caseHeaderFile(blackboxHeader);
				if (result == null) result = caseFile(blackboxHeader);
				if (result == null) result = caseModuleReferrable(blackboxHeader);
				if (result == null) result = caseModuleObject(blackboxHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE: {
				RteBufferQueueType rteBufferQueueType = (RteBufferQueueType)theEObject;
				T result = caseRteBufferQueueType(rteBufferQueueType);
				if (result == null) result = caseType(rteBufferQueueType);
				if (result == null) result = caseModuleReferrable(rteBufferQueueType);
				if (result == null) result = caseModuleObject(rteBufferQueueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_NONQUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE: {
				RteNonqueuedSendTrustedFunctionParamType rteNonqueuedSendTrustedFunctionParamType = (RteNonqueuedSendTrustedFunctionParamType)theEObject;
				T result = caseRteNonqueuedSendTrustedFunctionParamType(rteNonqueuedSendTrustedFunctionParamType);
				if (result == null) result = caseType(rteNonqueuedSendTrustedFunctionParamType);
				if (result == null) result = caseModuleReferrable(rteNonqueuedSendTrustedFunctionParamType);
				if (result == null) result = caseModuleObject(rteNonqueuedSendTrustedFunctionParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_QUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE: {
				RteQueuedSendTrustedFunctionParamType rteQueuedSendTrustedFunctionParamType = (RteQueuedSendTrustedFunctionParamType)theEObject;
				T result = caseRteQueuedSendTrustedFunctionParamType(rteQueuedSendTrustedFunctionParamType);
				if (result == null) result = caseType(rteQueuedSendTrustedFunctionParamType);
				if (result == null) result = caseModuleReferrable(rteQueuedSendTrustedFunctionParamType);
				if (result == null) result = caseModuleObject(rteQueuedSendTrustedFunctionParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE: {
				ComSendTrustedFunctionParamType comSendTrustedFunctionParamType = (ComSendTrustedFunctionParamType)theEObject;
				T result = caseComSendTrustedFunctionParamType(comSendTrustedFunctionParamType);
				if (result == null) result = caseType(comSendTrustedFunctionParamType);
				if (result == null) result = caseModuleReferrable(comSendTrustedFunctionParamType);
				if (result == null) result = caseModuleObject(comSendTrustedFunctionParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.CS_TRUSTED_FUNCTION_PARAM_TYPE: {
				CsTrustedFunctionParamType csTrustedFunctionParamType = (CsTrustedFunctionParamType)theEObject;
				T result = caseCsTrustedFunctionParamType(csTrustedFunctionParamType);
				if (result == null) result = caseType(csTrustedFunctionParamType);
				if (result == null) result = caseModuleReferrable(csTrustedFunctionParamType);
				if (result == null) result = caseModuleObject(csTrustedFunctionParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.NEVER_READ_OPERATION: {
				NeverReadOperation neverReadOperation = (NeverReadOperation)theEObject;
				T result = caseNeverReadOperation(neverReadOperation);
				if (result == null) result = caseReadOperation(neverReadOperation);
				if (result == null) result = caseOperation(neverReadOperation);
				if (result == null) result = caseModuleObject(neverReadOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MEMORY_MAPPING: {
				MemoryMapping memoryMapping = (MemoryMapping)theEObject;
				T result = caseMemoryMapping(memoryMapping);
				if (result == null) result = caseModuleReferrable(memoryMapping);
				if (result == null) result = caseModuleObject(memoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SWC_MEMORY_MAPPING: {
				SwcMemoryMapping swcMemoryMapping = (SwcMemoryMapping)theEObject;
				T result = caseSwcMemoryMapping(swcMemoryMapping);
				if (result == null) result = caseMemoryMapping(swcMemoryMapping);
				if (result == null) result = caseModuleReferrable(swcMemoryMapping);
				if (result == null) result = caseModuleObject(swcMemoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BSW_MEMORY_MAPPING: {
				BswMemoryMapping bswMemoryMapping = (BswMemoryMapping)theEObject;
				T result = caseBswMemoryMapping(bswMemoryMapping);
				if (result == null) result = caseMemoryMapping(bswMemoryMapping);
				if (result == null) result = caseModuleReferrable(bswMemoryMapping);
				if (result == null) result = caseModuleObject(bswMemoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP: {
				GlobalVariableFileContentsGroup globalVariableFileContentsGroup = (GlobalVariableFileContentsGroup)theEObject;
				T result = caseGlobalVariableFileContentsGroup(globalVariableFileContentsGroup);
				if (result == null) result = caseModuleObject(globalVariableFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP: {
				FunctionFileContentsGroup functionFileContentsGroup = (FunctionFileContentsGroup)theEObject;
				T result = caseFunctionFileContentsGroup(functionFileContentsGroup);
				if (result == null) result = caseModuleObject(functionFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_API_FILE_CONTENTS_GROUP: {
				RteApiFileContentsGroup rteApiFileContentsGroup = (RteApiFileContentsGroup)theEObject;
				T result = caseRteApiFileContentsGroup(rteApiFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(rteApiFileContentsGroup);
				if (result == null) result = caseModuleObject(rteApiFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP: {
				RteLifecycleApiFileContentsGroup rteLifecycleApiFileContentsGroup = (RteLifecycleApiFileContentsGroup)theEObject;
				T result = caseRteLifecycleApiFileContentsGroup(rteLifecycleApiFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(rteLifecycleApiFileContentsGroup);
				if (result == null) result = caseModuleObject(rteLifecycleApiFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TASK_BODY_FILE_CONTENTS_GROUP: {
				TaskBodyFileContentsGroup taskBodyFileContentsGroup = (TaskBodyFileContentsGroup)theEObject;
				T result = caseTaskBodyFileContentsGroup(taskBodyFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(taskBodyFileContentsGroup);
				if (result == null) result = caseModuleObject(taskBodyFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP: {
				BswSchedulableEntityFileContentsGroup bswSchedulableEntityFileContentsGroup = (BswSchedulableEntityFileContentsGroup)theEObject;
				T result = caseBswSchedulableEntityFileContentsGroup(bswSchedulableEntityFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(bswSchedulableEntityFileContentsGroup);
				if (result == null) result = caseModuleObject(bswSchedulableEntityFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_CALLBACK_FILE_CONTENTS_GROUP: {
				ComCallbackFileContentsGroup comCallbackFileContentsGroup = (ComCallbackFileContentsGroup)theEObject;
				T result = caseComCallbackFileContentsGroup(comCallbackFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(comCallbackFileContentsGroup);
				if (result == null) result = caseModuleObject(comCallbackFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP: {
				TrustedFunctionFileContentsGroup trustedFunctionFileContentsGroup = (TrustedFunctionFileContentsGroup)theEObject;
				T result = caseTrustedFunctionFileContentsGroup(trustedFunctionFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(trustedFunctionFileContentsGroup);
				if (result == null) result = caseModuleObject(trustedFunctionFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP: {
				ExecutableEntityFileContentsGroup executableEntityFileContentsGroup = (ExecutableEntityFileContentsGroup)theEObject;
				T result = caseExecutableEntityFileContentsGroup(executableEntityFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(executableEntityFileContentsGroup);
				if (result == null) result = caseModuleObject(executableEntityFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER: {
				BswMemoryMappingHeader bswMemoryMappingHeader = (BswMemoryMappingHeader)theEObject;
				T result = caseBswMemoryMappingHeader(bswMemoryMappingHeader);
				if (result == null) result = caseHeaderFile(bswMemoryMappingHeader);
				if (result == null) result = caseFile(bswMemoryMappingHeader);
				if (result == null) result = caseModuleReferrable(bswMemoryMappingHeader);
				if (result == null) result = caseModuleObject(bswMemoryMappingHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER: {
				SwcMemoryMappingHeader swcMemoryMappingHeader = (SwcMemoryMappingHeader)theEObject;
				T result = caseSwcMemoryMappingHeader(swcMemoryMappingHeader);
				if (result == null) result = caseHeaderFile(swcMemoryMappingHeader);
				if (result == null) result = caseFile(swcMemoryMappingHeader);
				if (result == null) result = caseModuleReferrable(swcMemoryMappingHeader);
				if (result == null) result = caseModuleObject(swcMemoryMappingHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.GENERATION_INFO: {
				GenerationInfo generationInfo = (GenerationInfo)theEObject;
				T result = caseGenerationInfo(generationInfo);
				if (result == null) result = caseModuleObject(generationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MACRO: {
				Macro macro = (Macro)theEObject;
				T result = caseMacro(macro);
				if (result == null) result = caseModuleReferrable(macro);
				if (result == null) result = caseModuleObject(macro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_API: {
				SchmApi schmApi = (SchmApi)theEObject;
				T result = caseSchmApi(schmApi);
				if (result == null) result = caseFunction(schmApi);
				if (result == null) result = caseModuleReferrable(schmApi);
				if (result == null) result = caseModuleObject(schmApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SIGNAL_API_WRAPPER: {
				ComSignalApiWrapper comSignalApiWrapper = (ComSignalApiWrapper)theEObject;
				T result = caseComSignalApiWrapper(comSignalApiWrapper);
				if (result == null) result = caseFunction(comSignalApiWrapper);
				if (result == null) result = caseModuleReferrable(comSignalApiWrapper);
				if (result == null) result = caseModuleObject(comSignalApiWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_PROXY_FUNCTION: {
				ComProxyFunction comProxyFunction = (ComProxyFunction)theEObject;
				T result = caseComProxyFunction(comProxyFunction);
				if (result == null) result = caseFunction(comProxyFunction);
				if (result == null) result = caseModuleReferrable(comProxyFunction);
				if (result == null) result = caseModuleObject(comProxyFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SEND_SIGNAL_API_WRAPPER: {
				ComSendSignalApiWrapper comSendSignalApiWrapper = (ComSendSignalApiWrapper)theEObject;
				T result = caseComSendSignalApiWrapper(comSendSignalApiWrapper);
				if (result == null) result = caseComSignalApiWrapper(comSendSignalApiWrapper);
				if (result == null) result = caseFunction(comSendSignalApiWrapper);
				if (result == null) result = caseModuleReferrable(comSendSignalApiWrapper);
				if (result == null) result = caseModuleObject(comSendSignalApiWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_RECEIVE_SIGNAL_API_WRAPPER: {
				ComReceiveSignalApiWrapper comReceiveSignalApiWrapper = (ComReceiveSignalApiWrapper)theEObject;
				T result = caseComReceiveSignalApiWrapper(comReceiveSignalApiWrapper);
				if (result == null) result = caseComSignalApiWrapper(comReceiveSignalApiWrapper);
				if (result == null) result = caseFunction(comReceiveSignalApiWrapper);
				if (result == null) result = caseModuleReferrable(comReceiveSignalApiWrapper);
				if (result == null) result = caseModuleObject(comReceiveSignalApiWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_LIFECYCLE_API: {
				SchmLifecycleApi schmLifecycleApi = (SchmLifecycleApi)theEObject;
				T result = caseSchmLifecycleApi(schmLifecycleApi);
				if (result == null) result = caseFunction(schmLifecycleApi);
				if (result == null) result = caseModuleReferrable(schmLifecycleApi);
				if (result == null) result = caseModuleObject(schmLifecycleApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_ENTER_API: {
				SchmEnterApi schmEnterApi = (SchmEnterApi)theEObject;
				T result = caseSchmEnterApi(schmEnterApi);
				if (result == null) result = caseSchmApi(schmEnterApi);
				if (result == null) result = caseFunction(schmEnterApi);
				if (result == null) result = caseModuleReferrable(schmEnterApi);
				if (result == null) result = caseModuleObject(schmEnterApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_EXIT_API: {
				SchmExitApi schmExitApi = (SchmExitApi)theEObject;
				T result = caseSchmExitApi(schmExitApi);
				if (result == null) result = caseSchmApi(schmExitApi);
				if (result == null) result = caseFunction(schmExitApi);
				if (result == null) result = caseModuleReferrable(schmExitApi);
				if (result == null) result = caseModuleObject(schmExitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_MODE_API: {
				SchmModeApi schmModeApi = (SchmModeApi)theEObject;
				T result = caseSchmModeApi(schmModeApi);
				if (result == null) result = caseSchmApi(schmModeApi);
				if (result == null) result = caseFunction(schmModeApi);
				if (result == null) result = caseModuleReferrable(schmModeApi);
				if (result == null) result = caseModuleObject(schmModeApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_SWITCH_API: {
				SchmSwitchApi schmSwitchApi = (SchmSwitchApi)theEObject;
				T result = caseSchmSwitchApi(schmSwitchApi);
				if (result == null) result = caseSchmApi(schmSwitchApi);
				if (result == null) result = caseFunction(schmSwitchApi);
				if (result == null) result = caseModuleReferrable(schmSwitchApi);
				if (result == null) result = caseModuleObject(schmSwitchApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE: {
				OsTaskEventsTriggeredByMode osTaskEventsTriggeredByMode = (OsTaskEventsTriggeredByMode)theEObject;
				T result = caseOsTaskEventsTriggeredByMode(osTaskEventsTriggeredByMode);
				if (result == null) result = caseModuleObject(osTaskEventsTriggeredByMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_TASK_EVENT: {
				OsTaskEvent osTaskEvent = (OsTaskEvent)theEObject;
				T result = caseOsTaskEvent(osTaskEvent);
				if (result == null) result = caseModuleObject(osTaskEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODULE_INTERLINK_HEADER: {
				ModuleInterlinkHeader moduleInterlinkHeader = (ModuleInterlinkHeader)theEObject;
				T result = caseModuleInterlinkHeader(moduleInterlinkHeader);
				if (result == null) result = caseHeaderFile(moduleInterlinkHeader);
				if (result == null) result = caseFile(moduleInterlinkHeader);
				if (result == null) result = caseModuleReferrable(moduleInterlinkHeader);
				if (result == null) result = caseModuleObject(moduleInterlinkHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_API_FILE_CONTENTS_GROUP: {
				SchmApiFileContentsGroup schmApiFileContentsGroup = (SchmApiFileContentsGroup)theEObject;
				T result = caseSchmApiFileContentsGroup(schmApiFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(schmApiFileContentsGroup);
				if (result == null) result = caseModuleObject(schmApiFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP: {
				ComSignalApiWrapperFileContentsGroup comSignalApiWrapperFileContentsGroup = (ComSignalApiWrapperFileContentsGroup)theEObject;
				T result = caseComSignalApiWrapperFileContentsGroup(comSignalApiWrapperFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(comSignalApiWrapperFileContentsGroup);
				if (result == null) result = caseModuleObject(comSignalApiWrapperFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP: {
				ComProxyFunctionFileContentsGroup comProxyFunctionFileContentsGroup = (ComProxyFunctionFileContentsGroup)theEObject;
				T result = caseComProxyFunctionFileContentsGroup(comProxyFunctionFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(comProxyFunctionFileContentsGroup);
				if (result == null) result = caseModuleObject(comProxyFunctionFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER: {
				ModuleInterlinkTypeHeader moduleInterlinkTypeHeader = (ModuleInterlinkTypeHeader)theEObject;
				T result = caseModuleInterlinkTypeHeader(moduleInterlinkTypeHeader);
				if (result == null) result = caseHeaderFile(moduleInterlinkTypeHeader);
				if (result == null) result = caseFile(moduleInterlinkTypeHeader);
				if (result == null) result = caseModuleReferrable(moduleInterlinkTypeHeader);
				if (result == null) result = caseModuleObject(moduleInterlinkTypeHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP: {
				SchmLifecycleApiFileContentsGroup schmLifecycleApiFileContentsGroup = (SchmLifecycleApiFileContentsGroup)theEObject;
				T result = caseSchmLifecycleApiFileContentsGroup(schmLifecycleApiFileContentsGroup);
				if (result == null) result = caseFunctionFileContentsGroup(schmLifecycleApiFileContentsGroup);
				if (result == null) result = caseModuleObject(schmLifecycleApiFileContentsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.PARTED_BSWM: {
				PartedBswm partedBswm = (PartedBswm)theEObject;
				T result = casePartedBswm(partedBswm);
				if (result == null) result = caseLogicalCompartment(partedBswm);
				if (result == null) result = caseModuleReferrable(partedBswm);
				if (result == null) result = caseModuleObject(partedBswm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.BSWM: {
				Bswm bswm = (Bswm)theEObject;
				T result = caseBswm(bswm);
				if (result == null) result = caseLogicalCompartment(bswm);
				if (result == null) result = caseModuleReferrable(bswm);
				if (result == null) result = caseModuleObject(bswm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_DEINIT_API: {
				SchmDeinitApi schmDeinitApi = (SchmDeinitApi)theEObject;
				T result = caseSchmDeinitApi(schmDeinitApi);
				if (result == null) result = caseSchmLifecycleApi(schmDeinitApi);
				if (result == null) result = caseFunction(schmDeinitApi);
				if (result == null) result = caseModuleReferrable(schmDeinitApi);
				if (result == null) result = caseModuleObject(schmDeinitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_INIT_API: {
				SchmInitApi schmInitApi = (SchmInitApi)theEObject;
				T result = caseSchmInitApi(schmInitApi);
				if (result == null) result = caseSchmLifecycleApi(schmInitApi);
				if (result == null) result = caseFunction(schmInitApi);
				if (result == null) result = caseModuleReferrable(schmInitApi);
				if (result == null) result = caseModuleObject(schmInitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SINGLECORE_SCHM_INIT_API: {
				SinglecoreSchmInitApi singlecoreSchmInitApi = (SinglecoreSchmInitApi)theEObject;
				T result = caseSinglecoreSchmInitApi(singlecoreSchmInitApi);
				if (result == null) result = caseSchmInitApi(singlecoreSchmInitApi);
				if (result == null) result = caseSchmLifecycleApi(singlecoreSchmInitApi);
				if (result == null) result = caseFunction(singlecoreSchmInitApi);
				if (result == null) result = caseModuleReferrable(singlecoreSchmInitApi);
				if (result == null) result = caseModuleObject(singlecoreSchmInitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.MULTICORE_SCHM_INIT_API: {
				MulticoreSchmInitApi multicoreSchmInitApi = (MulticoreSchmInitApi)theEObject;
				T result = caseMulticoreSchmInitApi(multicoreSchmInitApi);
				if (result == null) result = caseSchmInitApi(multicoreSchmInitApi);
				if (result == null) result = caseSchmLifecycleApi(multicoreSchmInitApi);
				if (result == null) result = caseFunction(multicoreSchmInitApi);
				if (result == null) result = caseModuleReferrable(multicoreSchmInitApi);
				if (result == null) result = caseModuleObject(multicoreSchmInitApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.SCHM_CORE_INIT_API_IMPL: {
				SchmCoreInitApiImpl schmCoreInitApiImpl = (SchmCoreInitApiImpl)theEObject;
				T result = caseSchmCoreInitApiImpl(schmCoreInitApiImpl);
				if (result == null) result = caseSchmInitApi(schmCoreInitApiImpl);
				if (result == null) result = caseSchmLifecycleApi(schmCoreInitApiImpl);
				if (result == null) result = caseFunction(schmCoreInitApiImpl);
				if (result == null) result = caseModuleReferrable(schmCoreInitApiImpl);
				if (result == null) result = caseModuleObject(schmCoreInitApiImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.POINTER_TYPE: {
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = caseType(pointerType);
				if (result == null) result = caseModuleReferrable(pointerType);
				if (result == null) result = caseModuleObject(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_POINTER_TYPE: {
				RedefinitionPointerType redefinitionPointerType = (RedefinitionPointerType)theEObject;
				T result = caseRedefinitionPointerType(redefinitionPointerType);
				if (result == null) result = casePointerType(redefinitionPointerType);
				if (result == null) result = caseRedefinitionType(redefinitionPointerType);
				if (result == null) result = caseType(redefinitionPointerType);
				if (result == null) result = caseModuleReferrable(redefinitionPointerType);
				if (result == null) result = caseModuleObject(redefinitionPointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.REDEFINITION_TYPE: {
				RedefinitionType redefinitionType = (RedefinitionType)theEObject;
				T result = caseRedefinitionType(redefinitionType);
				if (result == null) result = caseType(redefinitionType);
				if (result == null) result = caseModuleReferrable(redefinitionType);
				if (result == null) result = caseModuleObject(redefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.ACTIVATION_OPERATION: {
				ActivationOperation activationOperation = (ActivationOperation)theEObject;
				T result = caseActivationOperation(activationOperation);
				if (result == null) result = caseOperation(activationOperation);
				if (result == null) result = caseModuleObject(activationOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.OS_ACTIVATE_TASK_API: {
				OsActivateTaskApi osActivateTaskApi = (OsActivateTaskApi)theEObject;
				T result = caseOsActivateTaskApi(osActivateTaskApi);
				if (result == null) result = caseOsApi(osActivateTaskApi);
				if (result == null) result = caseFunction(osActivateTaskApi);
				if (result == null) result = caseModuleReferrable(osActivateTaskApi);
				if (result == null) result = caseModuleObject(osActivateTaskApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.FEEDBACK_API: {
				FeedbackApi feedbackApi = (FeedbackApi)theEObject;
				T result = caseFeedbackApi(feedbackApi);
				if (result == null) result = caseRteApi(feedbackApi);
				if (result == null) result = caseFunction(feedbackApi);
				if (result == null) result = caseModuleReferrable(feedbackApi);
				if (result == null) result = caseModuleObject(feedbackApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.LOGICAL_BLOCK: {
				LogicalBlock logicalBlock = (LogicalBlock)theEObject;
				T result = caseLogicalBlock(logicalBlock);
				if (result == null) result = caseModuleReferrable(logicalBlock);
				if (result == null) result = caseModuleObject(logicalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.TACK_STATUS: {
				TAckStatus tAckStatus = (TAckStatus)theEObject;
				T result = caseTAckStatus(tAckStatus);
				if (result == null) result = caseLogicalBlock(tAckStatus);
				if (result == null) result = caseModuleReferrable(tAckStatus);
				if (result == null) result = caseModuleObject(tAckStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModulePackage.USER_DEFINED_EXCLUDE_OPERATION: {
				UserDefinedExcludeOperation userDefinedExcludeOperation = (UserDefinedExcludeOperation)theEObject;
				T result = caseUserDefinedExcludeOperation(userDefinedExcludeOperation);
				if (result == null) result = caseExcludeOperation(userDefinedExcludeOperation);
				if (result == null) result = caseOperation(userDefinedExcludeOperation);
				if (result == null) result = caseModuleObject(userDefinedExcludeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleObject(ModuleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReferrable(ModuleReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteApi(WriteApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendOperation(SendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferNonqueuedSendOperation(RteBufferNonqueuedSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferNonqueuedReadOperation(RteBufferNonqueuedReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadOperation(ReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadApi(ReadApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irv Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irv Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrvReadOperation(IrvReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irv Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irv Read Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrvReadApi(IrvReadApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irv Write Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irv Write Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrvWriteOperation(IrvWriteOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irv Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irv Write Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrvWriteApi(IrvWriteApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Variable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferVariableSet(RteBufferVariableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariableSet(GlobalVariableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Proxy Function Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Proxy Function Table Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComProxyFunctionTableVariable(ComProxyFunctionTableVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteSource(RteSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteApi(RteApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteModule(RteModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Application Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Application Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteApplicationHeader(RteApplicationHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalCompartment(LogicalCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwc(Swc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteHeader(RteHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Bsw Api Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Bsw Api Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBswApiHeader(RteBswApiHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Lifecycle Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Lifecycle Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteLifecycleHeader(RteLifecycleHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Application Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Application Type Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteApplicationTypeHeader(RteApplicationTypeHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Vfb Trace Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Vfb Trace Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteVfbTraceHeader(RteVfbTraceHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Configuration Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Configuration Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteConfigurationHeader(RteConfigurationHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Callback Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Callback Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteCallbackHeader(RteCallbackHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Type Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteTypeHeader(RteTypeHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalidate Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalidate Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidateApi(InvalidateApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Nonqueued Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocNonqueuedSendOperation(IocNonqueuedSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectComSendOperation(DirectComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Rte Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Rte Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionRteOperation(TrustedFunctionRteOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Send Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Send Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionRteBufferSendSendOperation(TrustedFunctionRteBufferSendSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionComSendOperation(TrustedFunctionComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Proxy Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateProxyComSendOperation(ImmediateProxyComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Proxy Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicProxyComSendOperation(PeriodicProxyComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Nonqueued Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocNonqueuedReadOperation(IocNonqueuedReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComReadOperation(ComReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Nonqueued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Nonqueued Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocNonqueuedCommunication(IocNonqueuedCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Write Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocWriteApi(IocWriteApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Read Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocReadApi(IocReadApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalApi(ComSendSignalApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Receive Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Receive Signal Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComReceiveSignalApi(ComReceiveSignalApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Rx Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Rx Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComRxCallback(ComRxCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendOperation(ComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComCallback(ComCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Rx TOut Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Rx TOut Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComRxTOutCallback(ComRxTOutCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Inv Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Inv Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComInvCallback(ComInvCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Proxy Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Proxy Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalProxyEntity(ComSendSignalProxyEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Immediate Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Immediate Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalImmediateEntity(ComSendSignalImmediateEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Periodic Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Periodic Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAck Notify Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAck Notify Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAckNotifyOperation(TAckNotifyOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Tx TOut Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Tx TOut Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComTxTOutCallback(ComTxTOutCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com TAck Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com TAck Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComTAckCallback(ComTAckCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com TErr Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com TErr Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComTErrCallback(ComTErrCallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOperation(FilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskedNewDiffersMaskedOldFilterOperation(MaskedNewDiffersMaskedOldFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masked New Differs XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masked New Differs XFilter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskedNewDiffersXFilterOperation(MaskedNewDiffersXFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Is Within Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Is Within Filter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewIsWithinFilterOperation(NewIsWithinFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Is Outside Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Is Outside Filter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewIsOutsideFilterOperation(NewIsOutsideFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masked New Equals XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masked New Equals XFilter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskedNewEqualsXFilterOperation(MaskedNewEqualsXFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Every NFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Every NFilter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneEveryNFilterOperation(OneEveryNFilterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Core Start Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Core Start Api Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteCoreStartApiImpl(RteCoreStartApiImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Stop Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Stop Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteStopApi(RteStopApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restart Partition Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restart Partition Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestartPartitionApi(RestartPartitionApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Restarting Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Restarting Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionRestartingApi(PartitionRestartingApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Terminated Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Terminated Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionTerminatedApi(PartitionTerminatedApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Lifecycle Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Lifecycle Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteLifecycleApi(RteLifecycleApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendApi(SendApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveApi(ReceiveApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Queued Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferQueuedSendOperation(RteBufferQueuedSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Queued Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferQueuedVariable(RteBufferQueuedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Queued Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferQueuedReadOperation(RteBufferQueuedReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Queued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Queued Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocQueuedCommunication(IocQueuedCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Receive Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocReceiveApi(IocReceiveApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Send Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocSendApi(IocSendApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocSendOperation(IocSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Queued Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocQueuedSendOperation(IocQueuedSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Queued Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocQueuedReadOperation(IocQueuedReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallApi(CallApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tf Call Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tf Call Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfCallApi(TfCallApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Start Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableStartOperation(ExecutableStartOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabled In Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabled In Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabledInMode(DisabledInMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableEntity(ExecutableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeOperation(ExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Interrupt Block Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllInterruptBlockExcludeOperation(AllInterruptBlockExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Interrupt Block Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsInterruptBlockExcludeOperation(OsInterruptBlockExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Spinlock Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Spinlock Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsSpinlockExcludeOperation(OsSpinlockExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Resource Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Resource Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsResourceExcludeOperation(OsResourceExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneExcludeOperation(NoneExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantMember(ConstantMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntity(BswSchedulableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableEntity(RunnableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Enter Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteEnterApi(RteEnterApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Exit Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteExitApi(RteExitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Background Task Activation Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Background Task Activation Executable Task Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsBackgroundTaskActivationExecutableTaskBody(OsBackgroundTaskActivationExecutableTaskBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Activation Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Activation Executable Task Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskActivationExecutableTaskBody(OsTaskActivationExecutableTaskBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Event Set Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Event Set Executable Task Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsEventSetExecutableTaskBody(OsEventSetExecutableTaskBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Activation Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskActivationOperation(OsTaskActivationOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Event Set Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Event Set Activation Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsEventSetActivationOperation(OsEventSetActivationOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Activation Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextActivationOperation(ContextActivationOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Triggering Executable Start Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingTriggeringExecutableStartOperation(TimingTriggeringExecutableStartOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Executable Start Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainExecutableStartOperation(PlainExecutableStartOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeSwitchTriggeringExecutableStartOperation(ModeSwitchTriggeringExecutableStartOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cycle Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cycle Countup Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCycleCountupOperation(CycleCountupOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Offset Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Offset Countup Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOffsetCountupOperation(StartOffsetCountupOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskBody(TaskBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Empty Queue Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Empty Queue Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocEmptyQueueApi(IocEmptyQueueApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComApi(ComApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocApi(IocApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRte(Rte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunction(TrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalTrustedFunction(ComSendSignalTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Set Event Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Set Event Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsSetEventApi(OsSetEventApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsApi(OsApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Immediate Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Immediate Task Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Proxy Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Proxy Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendProxyOperation(ComSendProxyOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Receive Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Receive Group Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocReceiveGroupApi(IocReceiveGroupApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRoot(ModuleRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Partition Timeout Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Partition Timeout Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterPartitionTimeoutOperation(InterPartitionTimeoutOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialize Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializeOperation(InitializeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Initialize Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableInitializeOperation(VariableInitializeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Initialize Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocInitializeOperation(IocInitializeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Suspend All Interrupts Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Suspend All Interrupts Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsSuspendAllInterruptsApi(OsSuspendAllInterruptsApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Get Spinlock Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Get Spinlock Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsGetSpinlockApi(OsGetSpinlockApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicore Rte Start Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticoreRteStartApi(MulticoreRteStartApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Write Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Write Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferWriteTrustedFunction(RteBufferWriteTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Send Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Send Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferSendTrustedFunction(RteBufferSendTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cs Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cs Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsTrustedFunction(CsTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cs Tf Called Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cs Tf Called Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsTfCalledRunnable(CsTfCalledRunnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Runnable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Runnable Start Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerRunnableStartOperation(ServerRunnableStartOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionRteBufferWriteSendOperation(TrustedFunctionRteBufferWriteSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocCommunication(IocCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Com Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyComSendOperation(ProxyComSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Send Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Send Group Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocSendGroupApi(IocSendGroupApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Queued Group Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Queued Group Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocQueuedGroupCommunication(IocQueuedGroupCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singlecore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singlecore Rte Start Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglecoreRteStartApi(SinglecoreRteStartApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Start Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteStartApi(RteStartApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderFile(HeaderFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Internal Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Internal Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteInternalHeader(RteInternalHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclarationGroup(ModeDeclarationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Machine Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Machine Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeMachineInstance(ModeMachineInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Macro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Macro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMacro(FunctionMacro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Proxy Function Table File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Proxy Function Table File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComProxyFunctionTableFileContentsGroup(ComProxyFunctionTableFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeType(ModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionPrimitiveType(RedefinitionPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionArrayType(RedefinitionArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionType(UnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionUnionType(RedefinitionUnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructType(StructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionStructType(RedefinitionStructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackbox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackbox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboxType(BlackboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionMember(UnionMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructMember(StructMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableMember(VariableMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Utility Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Utility Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteUtilityHeader(RteUtilityHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackbox Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackbox Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboxHeader(BlackboxHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Queue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferQueueType(RteBufferQueueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Nonqueued Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Nonqueued Send Trusted Function Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteNonqueuedSendTrustedFunctionParamType(RteNonqueuedSendTrustedFunctionParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Queued Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Queued Send Trusted Function Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteQueuedSendTrustedFunctionParamType(RteQueuedSendTrustedFunctionParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Queue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeQueueType(ModeQueueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Trusted Function Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendTrustedFunctionParamType(ComSendTrustedFunctionParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cs Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cs Trusted Function Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsTrustedFunctionParamType(CsTrustedFunctionParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Never Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Never Read Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeverReadOperation(NeverReadOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteBufferInvalidateTrustedFunction(RteBufferInvalidateTrustedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionRteBufferInvalidateSendOperation(TrustedFunctionRteBufferInvalidateSendOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMapping(MemoryMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Memory Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcMemoryMapping(SwcMemoryMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Memory Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswMemoryMapping(BswMemoryMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariableFileContentsGroup(GlobalVariableFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionFileContentsGroup(FunctionFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Api File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteApiFileContentsGroup(RteApiFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Lifecycle Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Lifecycle Api File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteLifecycleApiFileContentsGroup(RteLifecycleApiFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Body File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Body File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskBodyFileContentsGroup(TaskBodyFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntityFileContentsGroup(BswSchedulableEntityFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Callback File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Callback File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComCallbackFileContentsGroup(ComCallbackFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionFileContentsGroup(TrustedFunctionFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Entity File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Entity File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableEntityFileContentsGroup(ExecutableEntityFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Memory Mapping Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswMemoryMappingHeader(BswMemoryMappingHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Memory Mapping Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcMemoryMappingHeader(SwcMemoryMappingHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationInfo(GenerationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacro(Macro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmApi(SchmApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Api Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Api Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalApiWrapper(ComSignalApiWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Proxy Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Proxy Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComProxyFunction(ComProxyFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Signal Api Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Signal Api Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendSignalApiWrapper(ComSendSignalApiWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Receive Signal Api Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Receive Signal Api Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComReceiveSignalApiWrapper(ComReceiveSignalApiWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Lifecycle Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Lifecycle Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmLifecycleApi(SchmLifecycleApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Enter Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmEnterApi(SchmEnterApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Exit Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmExitApi(SchmExitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Switch Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Switch Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmSwitchApi(SchmSwitchApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Events Triggered By Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Events Triggered By Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskEventsTriggeredByMode(OsTaskEventsTriggeredByMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskEvent(OsTaskEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Queued Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeQueuedVariable(ModeQueuedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Mode Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Mode Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmModeApi(SchmModeApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interlink Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interlink Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInterlinkHeader(ModuleInterlinkHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Api File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmApiFileContentsGroup(SchmApiFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Api Wrapper File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Api Wrapper File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalApiWrapperFileContentsGroup(ComSignalApiWrapperFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Proxy Function File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Proxy Function File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComProxyFunctionFileContentsGroup(ComProxyFunctionFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interlink Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interlink Type Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInterlinkTypeHeader(ModuleInterlinkTypeHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Lifecycle Api File Contents Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Lifecycle Api File Contents Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmLifecycleApiFileContentsGroup(SchmLifecycleApiFileContentsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parted Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parted Bswm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartedBswm(PartedBswm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bswm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswm(Bswm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Deinit Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Deinit Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmDeinitApi(SchmDeinitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Init Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmInitApi(SchmInitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singlecore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singlecore Schm Init Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglecoreSchmInitApi(SinglecoreSchmInitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicore Schm Init Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticoreSchmInitApi(MulticoreSchmInitApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schm Core Init Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schm Core Init Api Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchmCoreInitApiImpl(SchmCoreInitApiImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionPointerType(RedefinitionPointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinitionType(RedefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationOperation(ActivationOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Activate Task Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Activate Task Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsActivateTaskApi(OsActivateTaskApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackApi(FeedbackApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalBlock(LogicalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAck Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAck Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAckStatus(TAckStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Exclude Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedExcludeOperation(UserDefinedExcludeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModuleSwitch
