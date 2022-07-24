package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import com.google.common.base.Optional;
import com.google.common.collect.ListMultimap;

public class ModuleRules {

	private final ModuleModelBuildContext context;

	public ModuleRules(ModuleModelBuildContext context) {
		this.context = context;
	}

	public boolean usesInlineSrProvidedApi(PVariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (!canUseInlineApi()) {
			return false;
		}
		if (!isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));
		if (sender.getSendInteraction().isEmpty()) {
			return true;
		} else if (sender.getSendInteraction().size() == 1) {
			SendInteraction sendInteraction = sender.getSendInteraction().get(0);
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				ReceiveInteraction receiveInteraction = sendInteraction.getReceiveInteraction();
				// 1:Nはインライン対象外なので、0番目固定で確認する
				InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
				RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
				if (!rDataInstanceInSwc.isFilterEnabled()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean usesInlineSrRequiredApi(RVariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (!canUseInlineApi()) {
			return false;
		}
		if (!isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));
		if (receiver.getReceiveInteraction().isEmpty()) {
			return true;
		}
		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);
		if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// IOCはインライン化しない
				|| receiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			return false;
		}
		if (!receiver.getExternalEcuSenders().isEmpty()) {
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ECU間はインライン化しない
			return false;
		}
		return true;
	}

	public boolean usesInlineFeedbackApi(PVariableDataInstanceInSwc dataInstanceInSwc) {
		if (!canUseInlineApi()) {
			return false;
		}
		return isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort());
	}

	public boolean usesInlineCsApi(EcucPartition clientEcucPartition, EcucPartition serverPartition, ROperationInstanceInSwc rOperationInstanceInSwc) {
		if (clientEcucPartition == null && serverPartition == null) {
			return true;
		} else if (clientEcucPartition == null || serverPartition == null) {
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ecucPartition, pEcucPartition のいずれかがnullのときはありえない
			return false;
		}

		if (clientEcucPartition != serverPartition) {
			if (!clientEcucPartition.isTrusted()) {
				// 別パーティションの場合はインライン化を行わない
				return false;
			}
			// 別パーティションで送信、受信ともに信頼である場合、コマンドラインオプションでインライン化判定を行う
		}

		return usesInlineCsApi(rOperationInstanceInSwc);
	}

	public boolean usesInlineCsApi(ROperationInstanceInSwc rOperationInstanceInSwc) {
		if (!canUseInlineApi()) {
			return false;
		}
		return isEnableTakeAddressFalse(rOperationInstanceInSwc.getContextPort());
	}

	public boolean usesInlineIrvApi() {
		return canUseInlineApi();
	}

	public boolean usesInlineExcludeApi() {
		return canUseInlineApi();
	}

	private boolean canUseInlineApi() {
		// generationPhaseでない場合はインライン化を行わない
		if (!this.context.options.generationPhase) {
			return false;
		}

		// コマンドラインオプションが指定されていた場合はインライン化を行わない
		if (this.context.options.withoutStaticInline) {
			return false;
		}

		return true;
	}

	private boolean isEnableTakeAddressFalse(PortPrototype portPrototype) {
		// EnableTakeAddressがfalseの場合インライン化対象
		if (portPrototype.getPortApiOption().isEmpty()) {
			return false;
		}
		return !portPrototype.getPortApiOption().get(0).getEnableTakeAddress();
	}

	public boolean needsExclusionForSendOperation(RteBufferNonqueuedSendOperation sendOperation) {
		Type type = sendOperation.getAccessVariable().getValueVariable().getType();
		return sendOperation.getAccessVariable().getStatusVariable() != null || sendOperation.getFilterOperation() != null || !Types.isAtomicType(type);
	}

	public boolean needsExclusionForReadOperation(RteBufferNonqueuedReadOperation readOperation) {
		Type type = readOperation.getAccessVariable().getValueVariable().getType();
		return readOperation.getAccessVariable().getStatusVariable() != null || !Types.isAtomicType(type);
	}

	public boolean needsExclusionForIrvOperation(Type sourceType) {
		return !Types.isAtomicType(sourceType);
	}

	/**
	 * 有効な(発火する可能性のある)BSWイベントかを判定する
	 * @param sourceBswEvent 判定対象のBSWイベント
	 * @return 有効なBSWイベントの場合、true。それ以外の場合、false。
	 */
	public boolean isEnabledBswEvent(BswEvent sourceBswEvent) {
		// BSWイベント共通の有効／無効判定
		if (!checksEnabledOfBswEventCommonPart(sourceBswEvent)) {
			return false;
		}

		// 各BSWイベント固有の有効／無効判定
		if (sourceBswEvent instanceof BswModeSwitchEvent) {
			// モード切替イベント
			return checksEnabledOfBswModeSwitchEventSpecificPart((BswModeSwitchEvent) sourceBswEvent);
		} else {
			// その他イベント
			return true; // 固有のチェックなし
		}
	}

	// BSWイベントが有効であるかの判定(モード切替イベント固有の部分のみチェック)
	private boolean checksEnabledOfBswModeSwitchEventSpecificPart(BswModeSwitchEvent sourceBswModeSwitchEvent) {
		// NOTE 現状onEntryのみサポートしているため、onEntry以外(onTransition・onExit)は無効なイベントと判定する
		if (!ModeActivationKind.ON_ENTRY.equals(sourceBswModeSwitchEvent.getActivation())) {
			return false;
		}

		ModeInBswModuleDescriptionInstanceRef onEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);

		// イベントの発火元となるモード宣言グループプロトタイプにアクセスがなければ、無効なイベントと判定
		if (!sourceBswModeSwitchEvent.getStartsOnEvent().getAccessedModeGroup().contains(onEntryModeIref.getContextModeDeclarationGroup())) {
			return false;
		}

		// イベントの発火元となるモードが無効化されていれば、無効なイベントと判定
		for (ModeInBswModuleDescriptionInstanceRef disabledInModeIref : sourceBswModeSwitchEvent.getDisabledInMode()) {
			if (onEntryModeIref.getContextModeDeclarationGroup() == disabledInModeIref.getContextModeDeclarationGroup() && onEntryModeIref.getTargetMode() == disabledInModeIref.getTargetMode()) {
				return false;
			}
		}

		return true;
	}

	// BSWイベントが有効であるかを判定(全BSWイベント共通の部分のみチェック)
	private boolean checksEnabledOfBswEventCommonPart(BswEvent bswEvent) {
		return !isBswEventDisabledByMode(bswEvent);
	}

	// BSWイベントがモード依存無効化制御により無効化されているかを判定
	private boolean isBswEventDisabledByMode(BswEvent bswEvent) {
		// モード依存無効化制御を対象となるモード宣言グループプロトタイプの単位にグループ化
		ListMultimap<ModeDeclarationGroupPrototype, ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefsGroupByContextModeGroup = this.context.query.groupByKey(bswEvent.getDisabledInMode(),
				MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP);

		// 各モード宣言グループプロトタイプについて、BSWイベントがモード依存無効化制御により無効化されているかを判定
		for (ModeDeclarationGroupPrototype disabledInModeContextModeGroup : disabledInModeIrefsGroupByContextModeGroup.keySet()) {
			List<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs = disabledInModeIrefsGroupByContextModeGroup.get(disabledInModeContextModeGroup);
			List<ModeDeclaration> disabledInModeTargetModes = this.context.query.collect(disabledInModeIrefs, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE);

			// 有効な提供側であるか、もしくは、 要求側を参照しているときに、有効な提供側があるかをチェック
			ModeDeclarationGroupPrototype enabledProvidedPrototype = getEnableProvidedModeDeclarationGroupPrototype(disabledInModeContextModeGroup);
			if (enabledProvidedPrototype == null) {
				// 有効な提供側が存在しない場合
				// NOTE 有効な提供側が存在しなければモードが初期モード以外に遷移することはないので、初期モードが無効化されていれば、BSWイベントがモード依存無効化制御により無効化されていると判定する
				if (disabledInModeTargetModes.contains(disabledInModeContextModeGroup.getType().getInitialMode())) {
					return true;
				}
			} else {
				// 有効な提供側が存在する場合
				// モード宣言グループプロトタイプの全モードが無効化されていれば、BSWイベントがモード依存無効化制御により無効化されていると判定する
				if (disabledInModeTargetModes.containsAll(disabledInModeContextModeGroup.getType().getModeDeclaration())) {
					return true;
				}
			}
		}

		return false;
	}

	private ModeDeclarationGroupPrototype getEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// 有効な提供側であれば、それを返す
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return prototype;
		}

		// 要求側の場合、有効な提供側があればそれを返す
		Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)
				.AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, prototype)));
		if (connection.isPresent()) { // 1:1(n)
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, connection.get().getRteBswProvidedModeGroup());
			if (modeInstance.isPresent()) {
				return connection.get().getRteBswProvidedModeGroup();
			}
		}
		return null;
	}
}
