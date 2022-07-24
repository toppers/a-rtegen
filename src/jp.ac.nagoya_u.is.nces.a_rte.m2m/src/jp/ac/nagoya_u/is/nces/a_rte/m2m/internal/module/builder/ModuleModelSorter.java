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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION__RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION__RECEIVE_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.ACTIVATION_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SEND_PROXY_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SEND_PROXY_OPERATION__ACCESS_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INTER_PARTITION_TIMEOUT_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.LOCAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TACK_NOTIFY_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE_INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;

import java.util.Comparator;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ModelSortUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsActivateTaskApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Functions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class ModuleModelSorter {

	private ModuleModelBuildContext context;

	public ModuleModelSorter(ModuleModelBuildContext context) {
		this.context = context;
	}

	@SuppressWarnings("unchecked")
	public void sortFileContents(File targetFile) {
		for (EReference eReference : targetFile.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
//				if (TYPE.isSuperTypeOf(eReference.getEReferenceType())) {
//					EList<Type> targetTypes = (EList<Type>) targetFile.eGet(eReference);
//					sortTypes(targetTypes);
//
//				} else
				if (CONSTANT.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<Constant> targetConstants = (EList<Constant>) targetFile.eGet(eReference);
					sortConstants(targetConstants);

				} else if (GLOBAL_VARIABLE.isSuperTypeOf(eReference.getEReferenceType())) {	// COVERAGE 常にfalse(現状のツールワークフローではtrueを通らないが，コードレビュー済みであるため問題ない)
					EList<GlobalVariable> targetGlobalVariables = (EList<GlobalVariable>) targetFile.eGet(eReference);
					sortGlobalVariables(targetGlobalVariables);

				} else if (FUNCTION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<Function> targetFunctions = (EList<Function>) targetFile.eGet(eReference);
					sortFunctions(targetFunctions);

				} else if (MEMORY_MAPPING.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<MemoryMapping> targetMemoryMappings = (EList<MemoryMapping>) targetFile.eGet(eReference);
					sortMemoryMappings(targetMemoryMappings);

				} else if (GLOBAL_VARIABLE_FILE_CONTENTS_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<GlobalVariableFileContentsGroup> targetGlobalVariableGroups = (EList<GlobalVariableFileContentsGroup>) targetFile.eGet(eReference);
					sortGlobalVariableGroups(targetGlobalVariableGroups);

				} else if (FUNCTION_FILE_CONTENTS_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<FunctionFileContentsGroup> targetFunctionGroups = (EList<FunctionFileContentsGroup>) targetFile.eGet(eReference);
					sortFunctionGroups(targetFunctionGroups);
				} else if (MODE_DECLARATION_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<ModeDeclarationGroup> targetModeDeclarationGroups = (EList<ModeDeclarationGroup>) targetFile.eGet(eReference);
					sortModeDeclarationGroups(targetModeDeclarationGroups);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void sortFunctionContents(Function targetFunction) {
		
		for (EAttribute eAttribute : targetFunction.eClass().getEAllAttributes()) {
			if (OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID.equals(eAttribute)) {
				EList<OsEventSetExecutableTaskBody> targetOperations = (EList<OsEventSetExecutableTaskBody>) targetFunction.eGet(eAttribute);
				ECollections.sort(targetOperations);
			}
		}
		
		for (EReference eReference : targetFunction.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				if (INITIALIZE_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<InitializeOperation> targetOperations = (EList<InitializeOperation>) targetFunction.eGet(eReference);
					sortInitializeOperations(targetOperations);
				} else if (SEND_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<SendOperation> targetOperations = (EList<SendOperation>) targetFunction.eGet(eReference);
					sortSendOperations(targetOperations);
				} else if (COM_SEND_PROXY_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<ComSendProxyOperation> targetOperations = (EList<ComSendProxyOperation>) targetFunction.eGet(eReference);
					sortProxyComSendOperations(targetOperations);
				} else if (ACTIVATION_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<ActivationOperation> targetOperations = (EList<ActivationOperation>) targetFunction.eGet(eReference);
					sortActivationOperations(targetOperations);
				} else if (TACK_NOTIFY_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<TAckNotifyOperation> targetOperations = (EList<TAckNotifyOperation>) targetFunction.eGet(eReference);
					sortTAckNortifyOperations(targetOperations);
				} else if (RTE_CORE_START_API_IMPL.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<RteCoreStartApiImpl> targetOperations = (EList<RteCoreStartApiImpl>) targetFunction.eGet(eReference);
					sortRteCoreStartApi(targetOperations);
				} else if (SCHM_CORE_INIT_API_IMPL.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<SchmCoreInitApiImpl> targetOperations = (EList<SchmCoreInitApiImpl>) targetFunction.eGet(eReference);
					sortSchmCoreInitApi(targetOperations);
				} else if (LOCAL_VARIABLE.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<LocalVariable> targetLocalVariables = (EList<LocalVariable>) targetFunction.eGet(eReference);
					sortLocalVariables(targetLocalVariables);

				}

				// NOTE ReadOperationは必ず多重度1のため，ソートを行なわない．
				// NOTE ContextActivationOperation, RunnableStartOperationは例外的にOperationの生成時にソートを行うため，ここではソートしない．

			} else {
				if (INTER_PARTITION_TIMEOUT_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					InterPartitionTimeoutOperation targetOperation = (InterPartitionTimeoutOperation) targetFunction.eGet(eReference);
					if (targetOperation == null) { // COVERAGE 常にfalse(現状のツールワークフローではtrueを通らないが，コードレビュー済みであるため問題ない)
						continue;
					}
					sortInterPartitionTimeoutOperationContents(targetOperation);

				}
			}
		}
	}

	private void sortTAckNortifyOperations(EList<TAckNotifyOperation> targetOperations) {
		for (TAckNotifyOperation targetOperation : targetOperations) {
			sortActivationOperations(targetOperation.getActivationOperation());
		}
	}

	private void sortActivationOperations(EList<ActivationOperation> targetOperations) {
		Ordering<ActivationOperation> ordering = Ordering.from(createActivationOperationTaskPriorityComparator()).compound(Ordering.from(createActivationOperationArgNameComparator()));
		ECollections.sort(targetOperations, ordering);
	}

	private void sortInitializeOperations(EList<InitializeOperation> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModelSortUtils.eObject2EClassPriorityFunction(VARIABLE_INITIALIZE_OPERATION, IOC_INITIALIZE_OPERATION));
		ECollections.sort(targetOperations, ordering);

		for (InitializeOperation targetOperation : targetOperations) {
			sortInitializeOperationContents(targetOperation);
		}
	}

	private void sortInitializeOperationContents(InitializeOperation targetOperation) {
		if (targetOperation instanceof VariableInitializeOperation) {
			VariableInitializeOperation variableInitializeOperation = (VariableInitializeOperation) targetOperation;
			sortGlobalVariables(variableInitializeOperation.getInitVariable());

		} else if (targetOperation instanceof IocInitializeOperation) { // COVERAGE 常にtrue(現状，InitializeOperationは，VariableInitializeOperationかIocInitializeOperationのいずれかであるため)
			IocInitializeOperation iocInitializeOperation = (IocInitializeOperation) targetOperation;
			sortFunctions(iocInitializeOperation.getInitIocApi());
		}
	}

	private void sortSendOperations(EList<SendOperation> targetOperations) {
		com.google.common.base.Function<EObject, ReceiveInteraction> sendOperation2ReceiveInteraction = ModuleModelSorter.this.context.query.<ReceiveInteraction> features2Function(MODULE_OBJECT__SOURCE, SEND_INTERACTION__RECEIVE_INTERACTION);

		com.google.common.base.Function<EObject, Receiver> sendOperation2Receiver = Functions
				.compose(ModuleModelSorter.this.context.query.<Receiver> feature2Function(RECEIVE_INTERACTION__RECEIVER), sendOperation2ReceiveInteraction);
		com.google.common.base.Function<EObject, InternalEcuReceiver> sendOperation2InternalEcuReceiver = Functions.compose(
				ModuleModelSorter.this.context.query.<InternalEcuReceiver> operation2Function(RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS), sendOperation2ReceiveInteraction);
		com.google.common.base.Function<EObject, ExternalEcuReceiver> sendOperation2ExternalEcuReceiver = Functions.compose(
				ModuleModelSorter.this.context.query.<ExternalEcuReceiver> operation2Function(RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS), sendOperation2ReceiveInteraction);

		Ordering<EObject> ordering = Ordering.natural().onResultOf(Functions.compose(ModelSortUtils.eObject2EClassPriorityFunction(INTERNAL_ECU_RECEIVER, EXTERNAL_ECU_RECEIVER), sendOperation2Receiver))
				.compound(Ordering.from(createInternalEcuReceiverComparator()).nullsLast().onResultOf(sendOperation2InternalEcuReceiver))
				.compound(Ordering.from(createExternalEcuReceiverComparator()).nullsLast().onResultOf(sendOperation2ExternalEcuReceiver));
		ECollections.sort(targetOperations, ordering);
		
		for (SendOperation targetOperation : targetOperations) {
			for (EReference eReference : targetOperation.eClass().getEAllReferences()) {
				if (eReference.isMany()) {
					if (LOCAL_VARIABLE.isSuperTypeOf(eReference.getEReferenceType())) {
						@SuppressWarnings("unchecked")
						EList<LocalVariable> targetLocalVariables = (EList<LocalVariable>) targetOperation.eGet(eReference);
						sortLocalVariables(targetLocalVariables);
					}
				}
			}
		}
	}
	
	private Comparator<ActivationOperation> createActivationOperationArgNameComparator() {
		return new Comparator<ActivationOperation>() {
			@Override
			public int compare(ActivationOperation o1, ActivationOperation o2) {
				String o1ActivationName = o1.getActivationApi() instanceof OsActivateTaskApi ? ((OsActivateTaskApi)o1.getActivationApi()).getOsTaskId() : ((OsSetEventApi)o1.getActivationApi()).getOsTaskId() + ((OsSetEventApi)o1.getActivationApi()).getOsEventId();
				String o2ActivationName = o2.getActivationApi() instanceof OsActivateTaskApi ? ((OsActivateTaskApi)o2.getActivationApi()).getOsTaskId() : ((OsSetEventApi)o2.getActivationApi()).getOsTaskId() + ((OsSetEventApi)o2.getActivationApi()).getOsEventId();
				return ComparisonChain.start().compare(o1ActivationName, o2ActivationName).result();
			}
		};
	}
	
	private Comparator<ActivationOperation> createActivationOperationTaskPriorityComparator() {
		return new Comparator<ActivationOperation>() {
			@Override
			public int compare(ActivationOperation o1, ActivationOperation o2) {
				return o2.getOsTaskPriority() - o1.getOsTaskPriority();
			}
		};
	}

	private Comparator<InternalEcuReceiver> createInternalEcuReceiverComparator() {
		return new Comparator<InternalEcuReceiver>() {
			@Override
			public int compare(InternalEcuReceiver o1, InternalEcuReceiver o2) {
				VariableDataInstanceInComposition source1 = o1.getSource();
				PortPrototype contextPort1 = source1.getPrototype().getContextPort();
				SwComponentType contextSwc1 = contextPort1.getParent();

				VariableDataInstanceInComposition source2 = o2.getSource();
				PortPrototype contextPort2 = source2.getPrototype().getContextPort();
				SwComponentType contextSwc2 = contextPort2.getParent();

				return ComparisonChain.start().compare(contextSwc1.getShortName(), contextSwc2.getShortName()).compare(contextPort1.getShortName(), contextPort2.getShortName())
						.compare(source1.getTargetShortName(), source2.getTargetShortName()).result();
			}
		};
	}

	private Comparator<ExternalEcuReceiver> createExternalEcuReceiverComparator() {
		return new Comparator<ExternalEcuReceiver>() {
			@Override
			public int compare(ExternalEcuReceiver o1, ExternalEcuReceiver o2) {
				String o1Signal = o1.getSourceSignal() != null ? o1.getSourceSignal().getShortName() : o1.getSourceSignalGroup().getShortName();
				String o2Signal = o2.getSourceSignal() != null ? o2.getSourceSignal().getShortName() : o2.getSourceSignalGroup().getShortName();
				return ComparisonChain.start().compare(o1Signal, o2Signal).result();
			}
		};
	}

	private void sortInterPartitionTimeoutOperationContents(InterPartitionTimeoutOperation targetOperation) {
		sortGlobalVariables(targetOperation.getTimeoutVariable());
	}

	private void sortProxyComSendOperations(EList<ComSendProxyOperation> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(COM_SEND_PROXY_OPERATION__ACCESS_API, FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}
	
	private void sortSchmCoreInitApi(EList<SchmCoreInitApiImpl> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}

	private void sortRteCoreStartApi(EList<RteCoreStartApiImpl> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}

	private void sortFunctionGroups(EList<? extends FunctionFileContentsGroup> targetFunctionGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetFunctionGroups, ordering);

		for (FunctionFileContentsGroup functionFileContentsGroup : targetFunctionGroups) {
			sortFunctionGroupContents(functionFileContentsGroup);
		}
	}

	private void sortFunctionGroupContents(FunctionFileContentsGroup targetFunctionGroup) {
		sortFunctions(targetFunctionGroup.getFunction());
	}

	private void sortGlobalVariableGroups(EList<? extends GlobalVariableFileContentsGroup> targetGlobalVariableGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetGlobalVariableGroups, ordering);

		for (GlobalVariableFileContentsGroup targetGlobalVariableGroup : targetGlobalVariableGroups) {
			sortGlobalVariableGroupContents(targetGlobalVariableGroup);
		}
	}

	private void sortGlobalVariableGroupContents(GlobalVariableFileContentsGroup targetGlobalVariableGroup) {
		sortGlobalVariables(targetGlobalVariableGroup.getGlobalVariable());
	}

	private void sortConstants(EList<? extends Constant> targetConstants) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetConstants, ordering);
	}

	private void sortGlobalVariables(EList<? extends GlobalVariable> targetGlobalVariables) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(VARIABLE__SYMBOL_NAME));
		ECollections.sort(targetGlobalVariables, ordering);
	}

	private void sortLocalVariables(EList<? extends LocalVariable> targetLocalVariables) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(VARIABLE__SYMBOL_NAME));
		ECollections.sort(targetLocalVariables, ordering);
	}

	private void sortFunctions(EList<? extends Function> targetFunctions) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetFunctions, ordering);

		for (Function targetFunction : targetFunctions) {
			sortFunctionContents(targetFunction);
		}
	}

	private void sortMemoryMappings(EList<? extends MemoryMapping> targetMemoryMappings) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetMemoryMappings, ordering);
	}

	private void sortModeDeclarationGroups(EList<ModeDeclarationGroup> targetModeDeclarationGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetModeDeclarationGroups, ordering);
	}
}
