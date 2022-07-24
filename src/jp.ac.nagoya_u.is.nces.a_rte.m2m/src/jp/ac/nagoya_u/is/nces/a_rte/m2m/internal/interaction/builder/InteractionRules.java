package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import com.google.common.base.Optional;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;

public class InteractionRules {
	private final InteractionModelBuildContext context;

	public InteractionRules(InteractionModelBuildContext context) {
		this.context = context;
	}

	public boolean usesRteBufferForReceiveInteraction(ReceiveInteraction sourceReceiveInteraction, InternalEcuReceiver sourceReceiver) {
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		boolean isInterEcuExists = !sourceReceiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(sourceReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));

		// フィルタ／受信タイムアウト／無効化のいずれかが有効であれば、RTEバッファを使用
		if (sourceDataInstance.isFilterEnabled()) {
			return true;
		}
		if (sourceDataInstance.isAliveTimeoutEnabled()) {
			return true;
		}
		if (sourceDataInstance.isInvalidationEnabled()) {
			return true;
		}

		if (isInterEcuExists) {
			// ECU間連携を含む場合、RTEバッファを使用
			return true;
		} else if (isInterPartitionExists) {
			// ECU間連携を含まず、パーティション間連携を含む場合、untrustedパーティションに所属する送信側が存在しなければRTEバッファを使用する
			for (SendInteraction sourceSendInteraction : sourceReceiveInteraction.getSendInteraction()) {
				for (Sender sourceSender : sourceSendInteraction.getSender()) {
					if (!sourceSender.getOwnerPartition().isTrusted()) {
						return false;
					}
				}
			}
			return true;
		} else {
			// ECU間連携・パーティション間連携を含まない場合、RTEバッファを使用
			return true;
		}
	}

	public boolean appliesSrComValueBufferOptimization(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		// Receive RTEバッファでない場合は最適化対象外
		if (!(sourceAndTargetReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation)) {
			return false;
		}

		// セマンティクス判定:イベントの場合は最適化対象外
		if (sourceDataInstanceInSwc.isEventSemantics()) {
			return false;
		}

		// タイムアウトが設定されている場合は最適化対象外
		if (sourceDataInstanceInSwc.isAliveTimeoutEnabled()) {
			return false;
		}

		// 送信者のExternalEcuSenderが存在しない場合は最適化対象外
		if (sourceReceiver.getExternalEcuSenders().isEmpty()) {
			return false;
		}

		// 送信者が複数の場合は最適化対象外
		if (sourceReceiver.hasMultipleSenders()) {
			return false;
		}

		// RTEによる無効化，もしくはフィルタが必要な場合は最適化対象外
		ExternalEcuSender sourceExternalEcuSender = sourceReceiver.getExternalEcuSenders().get(0);
		if (sourceExternalEcuSender.getRequiresRteInvalidation() || sourceExternalEcuSender.getRequiresRteInitialization() || sourceExternalEcuSender.getRequiresRteFilter()) {
			return false;
		}

		// A-COM独自仕様オプション指定時以外はマスタコアのBSWPartitionでない場合は最適化対象外
		if (!this.context.options.comMultiCore) {
			if (sourceReceiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceReceiver.getOwnerCore())));
				if ((sourceReceiver.getOwnerPartition() != bswPartition) || 
					(this.context.query.get(sourceReceiver.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION) == Boolean.FALSE)) {
					return false;
				}
			}
		} else {
			// BSWPartitionでない場合は最適化対象外
			if (sourceReceiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceReceiver.getOwnerCore())));
				if (sourceReceiver.getOwnerPartition() != bswPartition) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean needsSpinlockForRteInternalExclusion() {

		// マルチコアOS判定
		if (!this.context.cache.sourceOs.getOsOS().isMulticoreOs()) {
			return false;
		}

		for (InternalEcuReceiver sourceReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {

			if (sourceReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			// コア跨ぎ判定
			// 以下は、SenderReceiverImplementationModelBuilder:buildReceiveImplementationsにてReceiveInteractionに「0」のみに設定しているため、同様に実装
			ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
			if (!sourceReceiveInteraction.receivesInterCore()) {
				// コア跨ぎでない場合、スピンロックなし
				continue;
			}

			// 「セマンティクス」「タイムアウト」「フィルター」判定
			RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
			ImplementationDataType sourceDataType = sourceDataInstanceInSwc.getImplementationDataType();
			if (!isNestedType(sourceDataType) &&
				!(sourceDataInstanceInSwc.isEventSemantics()) && 
				!(sourceDataInstanceInSwc.isAliveTimeoutEnabled()) &&
				!(sourceDataInstanceInSwc.isFilterEnabled()))
			{
				// 「Primitive」 and 「データセマンティクス」 and 「タイムアウト無効」 and 「フィルター無効」の場合、スピンロックなし
				continue;
			}

			// 実現方式判定
			ValueBufferImplementation sourceValueBufferImplementation = sourceReceiveInteraction.getValueBufferImplementation();
			if (!isSrRteBufferImplementation(sourceValueBufferImplementation)) {
				// 実現方式がRteValueBufferImplementationでない場合、スピンロックなし
				continue;
			}

			// スピンロックあり
			return true;
		}

		return false;
	}

	private boolean isNestedType(ImplementationDataType sourceDataType) {
		return sourceDataType.isArrayType() || sourceDataType.isStructType() || sourceDataType.isUnionType();
	}

	private boolean isSrRteBufferImplementation(ValueBufferImplementation implementation) {
		return implementation instanceof RteValueBufferImplementation;
	}

	public boolean needsTrustedFunctionForCsCall(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		Optional<EcucPartition> sourceRPartition = tryGetREcucPartition(sourceOperationInstanceInSwc);
		Optional<EcucPartition> sourcePPartition = tryGetPEcucPartition(sourceOperationInstanceInSwc);

		// COVERAGE (ecucPartitionが!isPresent()のときはpEcucPartitionも!isPresent()であるためカバレッジがパスしない．コードレビューで問題ないことを確認)
		return this.context.query.<Boolean> get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC) && sourceRPartition.isPresent()
				&& sourcePPartition.isPresent() && !sourceRPartition.get().isTrusted() && sourcePPartition.get().isTrusted();
	}

	// NOTE できればexモデルに定義したほうがよい
	private Optional<EcucPartition> tryGetREcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		PortInstanceInComposition rPortInComposition = rOpInComposition.getParent();
		if (rPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent();
		}

		return Optional.of(rPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}

	// NOTE できればexモデルに定義したほうがよい
	private Optional<EcucPartition> tryGetPEcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		Optional<AssemblyOperationInstanceConnector> connector = this.context.query.<AssemblyOperationInstanceConnector> tryFindSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, rOpInComposition));
		if (!connector.isPresent()) {
			return Optional.absent();
		}

		PortInstanceInComposition pPortInComposition = connector.get().getProvider().getParent();
		if (pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent();
		}

		return Optional.of(pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}
}
