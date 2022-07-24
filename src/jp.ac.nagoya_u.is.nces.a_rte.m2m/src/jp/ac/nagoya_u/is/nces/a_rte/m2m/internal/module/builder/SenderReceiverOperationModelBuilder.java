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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERACTION_END__OWNER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SEND_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_SET_EVENT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_QUEUED_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_SEND_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_WRITE_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SEND_SIGNAL_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TACK_STATUS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferSendTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferSendSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Optional;

public class SenderReceiverOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private final ExcludeOperationModelBuilder excludeOperationBuilder;
	private final ModuleRules moduleRules;

	public SenderReceiverOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
		this.moduleRules = new ModuleRules(context);
	}

	public RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation(ReadApi targetApi, ReceiveInteraction sourceReceiveInteraction, Parameter dataParam, LocalVariable returnValueVariable)
			throws ModelException {
		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferNonqueuedReadOperation destRteBufferNonqueuedReadOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedReadOperation();
		buildReadOperation(destRteBufferNonqueuedReadOperation, dataParam, Optional.of(returnValueVariable));
		destRteBufferNonqueuedReadOperation.setAccessVariable(rteBuffer);
		if (targetApi.getIsInline()) {
			addInlineGlobalVariable(targetApi, rteBuffer.getValueVariable());
			if (rteBuffer.getStatusVariable() != null) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// ECU間はインライン化しない
				addInlineGlobalVariable(targetApi, rteBuffer.getStatusVariable());
			}
		}

		if (this.moduleRules.needsExclusionForReadOperation(destRteBufferNonqueuedReadOperation)) {
			destRteBufferNonqueuedReadOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceReceiveInteraction.receivesInterCore()));
		}

		return destRteBufferNonqueuedReadOperation;
	}

	public RteBufferQueuedReadOperation createRteBufferQueuedReadOperation(ReceiveInteraction sourceReceiveInteraction, Parameter dataParam, LocalVariable returnValueVariable) throws ModelException {
		RteBufferQueuedVariable queuedVariable = this.context.builtQuery.findDest(RTE_BUFFER_QUEUED_VARIABLE, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferQueuedReadOperation destRteBufferQueuedReadOperation = ModuleFactory.eINSTANCE.createRteBufferQueuedReadOperation();
		buildReadOperation(destRteBufferQueuedReadOperation, dataParam, Optional.of(returnValueVariable));
		destRteBufferQueuedReadOperation.setAccessVariable(queuedVariable);
		destRteBufferQueuedReadOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceReceiveInteraction.receivesInterCore()));
		return destRteBufferQueuedReadOperation;
	}

	public IocNonqueuedReadOperation createIocNonqueuedReadOperation(IocValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable)
			throws ModelException {
		IocReadApi iocReadApi = this.context.builtQuery.findDest(IOC_READ_API, sourceValueBufferImplementation.getOsIocCommunication());

		IocNonqueuedReadOperation destIocNonqueuedReadOperation = ModuleFactory.eINSTANCE.createIocNonqueuedReadOperation();
		buildReadOperation(destIocNonqueuedReadOperation, dataParam, Optional.of(returnValueVariable));
		destIocNonqueuedReadOperation.setAccessApi(iocReadApi);
		return destIocNonqueuedReadOperation;
	}

	public IocQueuedReadOperation createIocQueuedReceiveOperation(IocValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable,
			Variable tempReturnValueVariable) throws ModelException {
		IocReceiveApi iocReceiveApi = this.context.builtQuery.findDest(IOC_RECEIVE_API, sourceValueBufferImplementation.getOsIocCommunication());

		IocQueuedReadOperation destIocQueuedReceiveOperation = ModuleFactory.eINSTANCE.createIocQueuedReadOperation();
		buildReadOperation(destIocQueuedReceiveOperation, dataParam, Optional.of(returnValueVariable));
		destIocQueuedReceiveOperation.setAccessApi(iocReceiveApi);
		destIocQueuedReceiveOperation.setTempReturnVariable(tempReturnValueVariable);
		return destIocQueuedReceiveOperation;
	}

	public ComReadOperation createComReadOperation(ComValueBufferImplementation sourceValueBufferImplementation, RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceValueBufferImplementation.getComSignal() != null ? sourceValueBufferImplementation.getComSignal() : sourceValueBufferImplementation
				.getComSignalGroup();

		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceComSignalOrComSignalGroup);

		ComReadOperation destComReadOperation = ModuleFactory.eINSTANCE.createComReadOperation();
		buildReadOperation(destComReadOperation, dataParam, Optional.of(returnValueVariable));
		destComReadOperation.setAccessApi(comReceiveSignalApi);
		destComReadOperation.setTempReturnVariable(tempReturnValueVariable);
		return destComReadOperation;
	}

	public NeverReadOperation createNeverReadOperation(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.SR_IMPL_INIT_VALUE_ROLE_NAME);

		NeverReadOperation destReadOperation = ModuleFactory.eINSTANCE.createNeverReadOperation();
		buildReadOperation(destReadOperation, dataParam, Optional.<LocalVariable> absent());
		destReadOperation.setInitValueConstant(initValueConstant);
		if (targetApi.getIsInline()) {
			addInlineConstant(targetApi, initValueConstant);
		}
		return destReadOperation;
	}

	private void buildReadOperation(ReadOperation targetReadOperation, Parameter dataParam, Optional<LocalVariable> returnValueVariable) {
		targetReadOperation.setReadValueVariable(dataParam);
		if (returnValueVariable.isPresent()) {
			targetReadOperation.setReadStatusVariable(returnValueVariable.get());
		}
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForWriteApi(WriteApi sourceAndTargetApi, SendInteraction sourceSendInteraction, Parameter dataParam,
			LocalVariable filterResultVariable, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		RteBufferNonqueuedSendOperation destRteNonqueuedSendOperation = createRteBufferNonqueuedSendOperation(Optional.of(sourceAndTargetApi), sourceSendInteraction, dataParam,
				this.context.cache.rteErrorOkConstant);
		if (sourceRDataInstanceInSwc.isFilterEnabled()) {
			destRteNonqueuedSendOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
		}
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) {
				destRteNonqueuedSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		
		buildExcludeOperation(destRteNonqueuedSendOperation, sourceSendInteraction);
		return destRteNonqueuedSendOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForInvalidateApi(InvalidateApi sourceAndTargetApi, SendInteraction sourceSendInteraction,
			Constant invalidValueConstant, LocalVariable filterResultVariable, EList<ActivationOperation> activationOperations) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		HandleInvalidEnum sourceHandleInvalid = sourceRDataInstanceInSwc.isInvalidationEnabled() ? sourceRDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid()
				: HandleInvalidEnum.DONT_INVALIDATE;

		RteBufferNonqueuedSendOperation destOperation;
		switch (sourceHandleInvalid) {
		case KEEP: {
			destOperation = createRteBufferNonqueuedSendOperation(Optional.of(sourceAndTargetApi), sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiveInteraction.getValueBufferImplementation());

			destOperation = createRteBufferNonqueuedSendOperation(Optional.of(sourceAndTargetApi), sourceSendInteraction, initValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled()) {
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			destOperation = createRteBufferNonqueuedSendOperation(Optional.of(sourceAndTargetApi), sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		}
		for (ActivationOperation activationOperation : activationOperations) {
			if (activationOperation.getActivationFlag() != null) {
				destOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}

		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComReceiveCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender,
			Variable dataVariable, LocalVariable filterResultVariable, EList<ActivationOperation> activationOperations) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		RteBufferNonqueuedSendOperation destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, dataVariable, this.context.cache.rteErrorOkConstant);
		if (sourceRDataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) {
			destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
		}
		for (ActivationOperation activationOperation : activationOperations) {
			if (activationOperation.getActivationFlag() != null) {
				destOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}

		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComInvalidateCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender,
			LocalVariable filterResultVariable, EList<ActivationOperation> activationOperations) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		HandleInvalidEnum sourceHandleInvalid = sourceRDataInstanceInSwc.isInvalidationEnabled() ? sourceRDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid()
				: HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)

		RteBufferNonqueuedSendOperation destOperation;
		switch (sourceHandleInvalid) {
		case KEEP: {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceRDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);

			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiveInteraction.getValueBufferImplementation());

			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, initValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) {
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceRDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);

			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		}
		for (ActivationOperation activationOperation : activationOperations) {
			if (activationOperation.getActivationFlag() != null) {
				destOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComReceiveTimeoutCallback(SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue)
			throws ModelException {
		RteBufferNonqueuedSendOperation destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, sendValue, sendStatusValue);
		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForWriteTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable dataVariable,
			LocalVariable filterResultVariable) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		RteBufferNonqueuedSendOperation destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, dataVariable, this.context.cache.rteErrorOkConstant);
		if (sourceRDataInstanceInSwc.isFilterEnabled()) {
			destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
		}

		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForInvalidateTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable filterResultVariable)
			throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		HandleInvalidEnum sourceHandleInvalid = sourceRDataInstanceInSwc.isInvalidationEnabled() ? sourceRDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid()
				: HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)

		Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceRDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);

		RteBufferNonqueuedSendOperation destOperation;
		switch (sourceHandleInvalid) {
		case KEEP: {
			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiveInteraction.getValueBufferImplementation());

			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, initValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled()) {
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			destOperation = createRteBufferNonqueuedSendOperationWithoutInlineSupport(sourceSendInteraction, invalidValueConstant, this.context.cache.rteErrorOkConstant);
			if (sourceRDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destOperation.setFilterOperation(createFilterOperation(sourceReceiveInteraction, filterResultVariable));
			}
			break;
		}
		}

		buildExcludeOperation(destOperation, sourceSendInteraction);
		return destOperation;
	}

	private RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationWithoutInlineSupport(SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue)
			throws ModelException {
		return createRteBufferNonqueuedSendOperation(Optional.<RteApi> absent(), sourceSendInteraction, sendValue, sendStatusValue);
	}

	// RteBufferNonqueuedSendOperationを生成する。
	// NOTE FilterOperation、ExcludeOperationの生成有無は呼び出し元の関数に依存するため、本メソッドでは生成しない。
	// NOTE inline化を行わない場合、targetSwcは不要となるため、Optional.absent()を許容する。
	private RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation(Optional<? extends RteApi> targetApi, SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue)
			throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();

		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferNonqueuedSendOperation destSendOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedSendOperation();
		destSendOperation.setSingleSource(sourceSendInteraction);
		destSendOperation.setAccessVariable(rteBuffer);
		destSendOperation.setSendValue(sendValue);
		if (targetApi.isPresent() && targetApi.get().getIsInline()) {
			addInlineGlobalVariable(targetApi.get(), rteBuffer.getValueVariable());
			if (sendValue instanceof Constant) {
				addInlineConstant(targetApi.get(), (Constant) sendValue);
			}
		}
		if (rteBuffer.getStatusVariable() != null) {
			destSendOperation.setSendStatus(sendStatusValue);
			if (targetApi.isPresent() && targetApi.get().getIsInline()) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// ECU間はインライン化しない
				addInlineGlobalVariable(targetApi.get(), rteBuffer.getStatusVariable());
			}
		}
		return destSendOperation;
	}

	private void buildExcludeOperation(RteBufferNonqueuedSendOperation targetSendOperation, SendInteraction sourceSendInteraction) {
		if (this.moduleRules.needsExclusionForSendOperation(targetSendOperation)) {
			targetSendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceSendInteraction.getReceiveInteraction().receivesInterCore()));
		}
	}

	public TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation(TrustedFunctionRteSendImplementation sourceSendImplementation, Variable dataVariable,
			Variable returnValueVariable, Variable tempReturnValueVariable, LocalVariable trustedFunctionParamVariable, Type type, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		RteBufferWriteTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_WRITE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferWriteSendOperation destSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferWriteSendOperation();
		destSendOperation.setSingleSource(sourceSendImplementation.getParent());
		destSendOperation.setType(type);
		destSendOperation.setAccessTrustedFunction(trustedFunction);
		destSendOperation.setSendValue(dataVariable);
		destSendOperation.setReturnVariable(returnValueVariable);
		destSendOperation.setTempReturnVariable(tempReturnValueVariable);
		destSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					destSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		return destSendOperation;
	}

	public TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation(SendInteraction sourceSendInteraction,
			TrustedFunctionRteSendImplementation sourceSendImplementation, Variable returnValueVariable, Variable tempReturnValueVariable, LocalVariable trustedFunctionParamVariable, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		RteBufferInvalidateTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferInvalidateSendOperation destSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferInvalidateSendOperation();
		destSendOperation.setSingleSource(sourceSendInteraction);
		destSendOperation.setAccessTrustedFunction(trustedFunction);
		destSendOperation.setReturnVariable(returnValueVariable);
		destSendOperation.setTempReturnVariable(tempReturnValueVariable);
		destSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		return destSendOperation;
	}

	public TrustedFunctionRteBufferSendSendOperation createTrustedFunctionRteBufferSendSendOperation(TrustedFunctionRteSendImplementation sourceSendImplementation, Variable dataVariable,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable, LocalVariable trustedFunctionParamVariable, Type type, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		RteBufferSendTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_SEND_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferSendSendOperation destSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferSendSendOperation();
		destSendOperation.setSingleSource(sourceSendImplementation.getParent());
		destSendOperation.setAccessTrustedFunction(trustedFunction);
		destSendOperation.setSendValue(dataVariable);
		destSendOperation.setReturnVariable(returnValueVariable);
		destSendOperation.setTempReturnVariable(tempReturnValueVariable);
		destSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		destSendOperation.setType(type);
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		return destSendOperation;
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperation(SendInteraction sourceSendInteraction, Variable dataVariable) throws ModelException {
		return createRteBufferQueuedSendOperation(sourceSendInteraction, dataVariable, Optional.<LocalVariable> absent());
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperation(SendInteraction sourceSendInteraction, Variable dataVariable, Optional<LocalVariable> returnValueVariable)
			throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();

		RteBufferQueuedVariable queuedVariable = this.context.builtQuery.findDest(RTE_BUFFER_QUEUED_VARIABLE, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferQueuedSendOperation destSendOperation = ModuleFactory.eINSTANCE.createRteBufferQueuedSendOperation();
		destSendOperation.setSingleSource(sourceSendInteraction);
		destSendOperation.setAccessVariable(queuedVariable);
		destSendOperation.setSendValue(dataVariable);
		destSendOperation.setType(dataVariable.getType());
		if (returnValueVariable.isPresent()) {
			destSendOperation.setReturnVariable(returnValueVariable.get());
		}
		destSendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceReceiveInteraction.receivesInterCore()));
		return destSendOperation;
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperationForWriteTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable dataVariable)
			throws ModelException {
		return createRteBufferQueuedSendOperation(sourceSendInteraction, dataVariable, Optional.<LocalVariable> absent());
	}

	public IocNonqueuedSendOperation createIocNonqueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, Optional<LocalVariable> returnValueVariable, EList<ActivationOperation> activationOperationOnReceived)
			throws ModelException {
		IocWriteApi iocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, sourceSendImplementation.getOsIocSenderProperties());

		IocNonqueuedSendOperation destSendOperation = ModuleFactory.eINSTANCE.createIocNonqueuedSendOperation();
		destSendOperation.setSingleSource(sourceSendImplementation.getParent());
		destSendOperation.setAccessApi(iocWriteApi);
		destSendOperation.setSendValue(dataVariable);
		destSendOperation.setType(dataVariable.getType());
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					destSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		if (returnValueVariable.isPresent()) { // COVERAGE 常にtrue(不具合混入時のみfalseになるコードなので，未カバレッジで問題ない)
			destSendOperation.setReturnVariable(returnValueVariable.get());
		}
		return destSendOperation;
	}

	public SendOperation createIocQueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, Optional<LocalVariable> returnValueVariable, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった関係上,当メソッドは使用されない.
		return createIocQueuedSendOperation(sourceSendImplementation, dataVariable, returnValueVariable, Optional.<Variable> absent(), activationOperationOnReceived);
	}

	public SendOperation createIocQueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, Optional<LocalVariable> returnValueVariable,
			Optional<? extends Variable> tempReturnValueVariable, EList<ActivationOperation> activationOperationOnReceived) throws ModelException {
		IocSendApi iocSendApi = this.context.builtQuery.findDest(IOC_SEND_API, sourceSendImplementation.getOsIocSenderProperties());

		IocQueuedSendOperation destSendOperation = ModuleFactory.eINSTANCE.createIocQueuedSendOperation();
		destSendOperation.setSingleSource(sourceSendImplementation.getParent());
		destSendOperation.setAccessApi(iocSendApi);
		destSendOperation.setSendValue(dataVariable);
		destSendOperation.setType(dataVariable.getType());
		if (returnValueVariable.isPresent()) { // COVERAGE 常にtrue(不具合混入時のみfalseになるコードなので，未カバレッジで問題ない)
			destSendOperation.setReturnVariable(returnValueVariable.get());
		}
		if (tempReturnValueVariable.isPresent()) { // COVERAGE 常にtrue(不具合混入時のみfalseになるコードなので，未カバレッジで問題ない)
			destSendOperation.setTempReturnVariable(tempReturnValueVariable.get());
		}
		for (ActivationOperation activationOperation : activationOperationOnReceived) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				destSendOperation.getActivationFlagOnRxSuccess().add(activationOperation.getActivationFlag());
			}
		}
		return destSendOperation;
	}

	public DirectComSendOperation createDirectComSendOperation(DirectComSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable,
			LocalVariable tempReturnValueVariable, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		DirectComSendOperation destDirectComSendOperation = ModuleFactory.eINSTANCE.createDirectComSendOperation();
		buildComSendOperation(destDirectComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable, tempReturnValueVariable, tAckStatus,activationOperationOnSendCompleted);
		
		return destDirectComSendOperation;
	}

	public DirectComSendOperation createDirectComSendOperationForComTrustedFunction(ComSendImplementation sourceSendImplementation) throws ModelException {
		DirectComSendOperation destDirectComSendOperation = ModuleFactory.eINSTANCE.createDirectComSendOperation();
		EcucContainer sourceComSignalOrComSignalGroup = sourceSendImplementation.getComSignal() != null ? sourceSendImplementation.getComSignal() : sourceSendImplementation.getComSignalGroup();
		ComSendSignalApi comSendSignalApi = this.context.builtQuery.findDest(COM_SEND_SIGNAL_API, sourceComSignalOrComSignalGroup);
		destDirectComSendOperation.setSingleSource(sourceSendImplementation.getParent());
		destDirectComSendOperation.setAccessApi(comSendSignalApi);

		InternalEcuSender sourceSender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			destDirectComSendOperation.setTAckStatus(tAckStatus.get());
		}
		return destDirectComSendOperation;
	}

	public TrustedFunctionComSendOperation createTrustedFunctionComSendOperation(TrustedFunctionComSendImplementation sourceSendImplementation, Variable dataVariable,
			LocalVariable returnValueVariable, LocalVariable trustedFunctionParamVariable, LocalVariable tempReturnValueVariable, Type type, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		TrustedFunctionComSendOperation destTrustedFunctionComSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionComSendOperation();
		buildComSendOperation(destTrustedFunctionComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable, tempReturnValueVariable, tAckStatus, activationOperationOnSendCompleted);
		if (sourceSendImplementation.getComSignal() != null) {
			ComSendSignalTrustedFunction trustedFunction = this.context.builtQuery.findDest(COM_SEND_SIGNAL_TRUSTED_FUNCTION, sourceSendImplementation.getComSignal());
			destTrustedFunctionComSendOperation.setAccessTrustedFunction(trustedFunction);
		} else {
			ComSendSignalTrustedFunction trustedFunction = this.context.builtQuery.findDest(COM_SEND_SIGNAL_TRUSTED_FUNCTION, sourceSendImplementation.getComSignalGroup());
			destTrustedFunctionComSendOperation.setAccessTrustedFunction(trustedFunction);
		}
		destTrustedFunctionComSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		destTrustedFunctionComSendOperation.setType(type);
		destTrustedFunctionComSendOperation.setIsGroup(sourceSendImplementation.getComSignalGroup() != null);
		return destTrustedFunctionComSendOperation;
	}

	public ImmediateProxyComSendOperation createImmediateProxyComSendOperation(ImmediateProxyComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable,
			LocalVariable tempReturnValueVariable, Type type, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		OsSetEventApi activationApi = this.context.builtQuery.findDest(OS_SET_EVENT_API, sourceSendImplementation.getProxyInteraction().getProxy());

		ImmediateProxyComSendOperation destImmediateProxyComSendOperation = ModuleFactory.eINSTANCE.createImmediateProxyComSendOperation();
		buildProxyComSendOperation(destImmediateProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, tempReturnValueVariable, IOC_SEND_API, tAckStatus, activationOperationOnSendCompleted);
		destImmediateProxyComSendOperation.setActivationApi(activationApi);
		destImmediateProxyComSendOperation.setType(type);

		return destImmediateProxyComSendOperation;
	}

	public PeriodicProxyComSendOperation createPeriodicProxyComSendOperation(PeriodicProxyComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable,
			LocalVariable tempReturnValueVariable, Type type, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		PeriodicProxyComSendOperation destPeriodicProxyComSendOperation = ModuleFactory.eINSTANCE.createPeriodicProxyComSendOperation();
		buildProxyComSendOperation(destPeriodicProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, tempReturnValueVariable, IOC_SEND_API, tAckStatus, activationOperationOnSendCompleted);

		return destPeriodicProxyComSendOperation;
	}

	private void buildProxyComSendOperation(ProxyComSendOperation targetProxyComSendOperation, ProxyComSendImplementation sourceProxyComSendImplementation, Value dataValue,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable, EClass eProxyIocApiClass, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		InternalEcuSender sourceSender = sourceProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceSender.getSource().getPrototype();
		EcucContainer sourceComSignalOrComSignalGroup = sourceProxyComSendImplementation.getComSignal() != null ? sourceProxyComSendImplementation.getComSignal() : sourceProxyComSendImplementation
				.getComSignalGroup();

		IocSendApi requestProxyIocApi = this.context.builtQuery.findDest(eProxyIocApiClass, sourceProxyComSendImplementation.getProxyInteraction().getRequestOsIocCommunication()
				.getOsIocSenderProperties().get(0));
		buildComSendOperation(targetProxyComSendOperation, sourceProxyComSendImplementation, dataValue, returnValueVariable, tempReturnValueVariable, tAckStatus, activationOperationOnSendCompleted);
		targetProxyComSendOperation.setRequestProxyIocApi(requestProxyIocApi);

		IocSendApi valueProxyIocApi = this.context.builtQuery.findDest(eProxyIocApiClass, sourceProxyComSendImplementation.getProxyInteraction().getValueOsIocCommunication()
				.getOsIocSenderProperties().get(0));
		targetProxyComSendOperation.setValueProxyIocApi(valueProxyIocApi);
		targetProxyComSendOperation.setProxyFunctionIndexConstantName(SymbolNames.createComProxyFunctionTableIndexConstantName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
	}

	private void buildComSendOperation(ComSendOperation targetComSendOperation, ComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable,
			LocalVariable tempReturnValueVariable, TAckStatus tAckStatus, EList<ActivationOperation> activationOperationOnSendCompleted) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceSendImplementation.getComSignal() != null ? sourceSendImplementation.getComSignal() : sourceSendImplementation.getComSignalGroup();

		ComSendSignalApi comSendSignalApi = this.context.builtQuery.findDest(COM_SEND_SIGNAL_API, sourceComSignalOrComSignalGroup);

		targetComSendOperation.setSingleSource(sourceSendImplementation.getParent());
		targetComSendOperation.setAccessApi(comSendSignalApi);
		targetComSendOperation.setSendValue(dataValue);

		targetComSendOperation.setReturnVariable(returnValueVariable);
		targetComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		if (tAckStatus != null) {
			targetComSendOperation.setTAckStatus(tAckStatus);
		}

		for (ActivationOperation activationOperation : activationOperationOnSendCompleted) {
			if (activationOperation.getActivationFlag() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				targetComSendOperation.getActivationFlagOnTxErr().add(activationOperation.getActivationFlag());
			}
		}
	}

	public FilterOperation createFilterOperation(ReceiveInteraction sourceReceiveInteraction, Variable filterResultVariable) throws ModelException {
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceReceiverDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		switch (sourceReceiverDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			GlobalVariable filterOldValueVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceReceiveInteraction.getFilterBufferImplementation());
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MASK_ROLE_NAME);

			MaskedNewDiffersMaskedOldFilterOperation destMaskedNewDiffersMaskedOldFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewDiffersMaskedOldFilterOperation();
			destMaskedNewDiffersMaskedOldFilterOperation.setFilterResultVariable(filterResultVariable);
			destMaskedNewDiffersMaskedOldFilterOperation.setMask(maskConstant);
			destMaskedNewDiffersMaskedOldFilterOperation.setOldValueVariable(filterOldValueVariable);
			return destMaskedNewDiffersMaskedOldFilterOperation;
		}
		case MASKED_NEW_DIFFERS_X: {
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MASK_ROLE_NAME);
			Constant xConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_X_ROLE_NAME);

			MaskedNewDiffersXFilterOperation destMaskedNewDiffersXFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewDiffersXFilterOperation();
			destMaskedNewDiffersXFilterOperation.setFilterResultVariable(filterResultVariable);
			destMaskedNewDiffersXFilterOperation.setMask(maskConstant);
			destMaskedNewDiffersXFilterOperation.setX(xConstant);
			return destMaskedNewDiffersXFilterOperation;
		}
		case MASKED_NEW_EQUALS_X: {
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MASK_ROLE_NAME);
			Constant xConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_X_ROLE_NAME);

			MaskedNewEqualsXFilterOperation destMaskedNewEqualsXFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewEqualsXFilterOperation();
			destMaskedNewEqualsXFilterOperation.setFilterResultVariable(filterResultVariable);
			destMaskedNewEqualsXFilterOperation.setMask(maskConstant);
			destMaskedNewEqualsXFilterOperation.setX(xConstant);
			return destMaskedNewEqualsXFilterOperation;
		}
		case NEW_IS_OUTSIDE: {
			Constant minConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MIN_ROLE_NAME);
			Constant maxConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MAX_ROLE_NAME);

			NewIsOutsideFilterOperation destNewIsOutsideFilterOperation = ModuleFactory.eINSTANCE.createNewIsOutsideFilterOperation();
			destNewIsOutsideFilterOperation.setFilterResultVariable(filterResultVariable);
			destNewIsOutsideFilterOperation.setMin(minConstant);
			destNewIsOutsideFilterOperation.setMax(maxConstant);
			return destNewIsOutsideFilterOperation;
		}
		case NEW_IS_WITHIN: {
			Constant minConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MIN_ROLE_NAME);
			Constant maxConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_MAX_ROLE_NAME);

			NewIsWithinFilterOperation destNewIsWithinFilterOperation = ModuleFactory.eINSTANCE.createNewIsWithinFilterOperation();
			destNewIsWithinFilterOperation.setFilterResultVariable(filterResultVariable);
			destNewIsWithinFilterOperation.setMin(minConstant);
			destNewIsWithinFilterOperation.setMax(maxConstant);
			return destNewIsWithinFilterOperation;
		}
		case ONE_EVERY_N: {
			GlobalVariable filterOccurrenceVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceReceiveInteraction.getFilterBufferImplementation());

			Constant periodConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_PERIOD_ROLE_NAME);
			Constant offsetConstant = this.context.builtQuery.findDest(CONSTANT, sourceReceiverDataInstanceInSwc, RoleNames.SR_FILTER_OFFSET_ROLE_NAME);

			OneEveryNFilterOperation destOneEveryNFilterOperation = ModuleFactory.eINSTANCE.createOneEveryNFilterOperation();
			destOneEveryNFilterOperation.setFilterResultVariable(filterResultVariable);
			destOneEveryNFilterOperation.setOccurrenceVariable(filterOccurrenceVariable);
			destOneEveryNFilterOperation.setPeriod(periodConstant);
			destOneEveryNFilterOperation.setOffset(offsetConstant);
			return destOneEveryNFilterOperation;
		}
		case ALWAYS:
		case NEVER:
		default: // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			assert false;
			return null;
		}
	}

	public InterPartitionTimeoutOperation createInterPartitionTimeoutOperation(EcucPartition sourcePartition) throws ModelException {
		InterPartitionTimeoutOperation destTimeoutOperation = ModuleFactory.eINSTANCE.createInterPartitionTimeoutOperation();

		for (InternalEcuSender sourceSender : this.context.query.<InternalEcuSender> find(isKindOf(INTERNAL_ECU_SENDER).AND(ref(INTERACTION_END__OWNER_PARTITION, sourcePartition)))) {
			for (SendInteraction sourceSendInteraction : this.context.query.select(sourceSender.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true))) {
				ValueBufferImplementation sourceValueBufferImplementation = sourceSendInteraction.getReceiveInteraction().getValueBufferImplementation();
				if (sourceValueBufferImplementation == null) {
					continue;
				}
				if (!sourceValueBufferImplementation.getHasStatus()) {
					continue;
				}

				// NOTE 現状，ステータスを持つのはデータセマンティックスのRTEバッファのみ
				if (sourceValueBufferImplementation instanceof RteValueBufferImplementation) { // COVERAGE 常にtrue(現状，パーティション間のタイムアウト通知を行う場合，常にRteValueBufferImplementationであるため)
					RteBufferVariableSet srRteBufferVariableSet = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceValueBufferImplementation);
					destTimeoutOperation.getTimeoutVariable().add(srRteBufferVariableSet);
				}
			}
		}

		List<RteValueBufferImplementation> sourceValueBufferImplementations = this.context.query.collect(destTimeoutOperation.getTimeoutVariable(), MODULE_OBJECT__SOURCE);
		if (isMultipleSenderCoreExists(sourceValueBufferImplementations)) {
			destTimeoutOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(true));
		}
		return destTimeoutOperation;
	}

	private boolean isMultipleSenderCoreExists(List<RteValueBufferImplementation> sourceValueBufferImplementations) {
		for (RteValueBufferImplementation sourceValueBufferImplementation : sourceValueBufferImplementations) {
			ReceiveInteraction sourceReceiveInteraction = sourceValueBufferImplementation.getParent();
			if (sourceReceiveInteraction.receivesFromMultipleCores()) {
				return true;
			}
		}
		return false;
	}

	private void addInlineGlobalVariable(RteApi targetApi, GlobalVariable globalVariable) {
		if (!targetApi.getInlineGlobalVariable().contains(globalVariable)) { // COVERAGE (コードレビューで問題ないことを確認)
			targetApi.getInlineGlobalVariable().add(globalVariable);
		}
	}

	private void addInlineConstant(RteApi targetApi, Constant constant) {
		if (!targetApi.getInlineConstant().contains(constant)) { // COVERAGE (コードレビューで問題ないことを確認)
			targetApi.getInlineConstant().add(constant);
		}
	}
}
