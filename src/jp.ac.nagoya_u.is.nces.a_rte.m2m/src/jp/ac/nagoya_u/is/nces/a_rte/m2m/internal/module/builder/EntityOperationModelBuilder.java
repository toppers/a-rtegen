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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER__START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION__POSITION_IN_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.DISABLED_IN_MODE__DISABLED_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PlainExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ServerRunnableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class EntityOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private final ModuleRules moduleRules;

	private final ExcludeOperationModelBuilder excludeOperationBuilder;


	public EntityOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.moduleRules = new ModuleRules(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public OsTaskActivationOperation createOsTaskActivationOperation(OsTaskActivateEntityStarter sourceEntityStarter, OsTask sourceOsTask) throws ModelException {
		OsTaskActivationOperation destOsTaskActivationOperation = ModuleFactory.eINSTANCE.createOsTaskActivationOperation();
		destOsTaskActivationOperation.setSingleSource(sourceEntityStarter);
		buildEntityCountupOperation(destOsTaskActivationOperation, sourceEntityStarter);
	
		// エクスキュータブル起動処理の構築
		for (EntityStartInteraction sourceStartInteraction : sortedCopyOfEntityStartInteractions(sourceEntityStarter.getStartInteraction())) {
			buildExecutableStartOperation(destOsTaskActivationOperation, sourceStartInteraction);
		}
		return destOsTaskActivationOperation;
	}

	public List<OsEventSetActivationOperation> createOsEventSetActivationOperations(List<OsEventSetEntityStarter> sourceEntityStarters, OsTask sourceOsTask) throws ModelException {

		// EntityStartInteractionをタスク内実行順序によりソート
		List<EntityStartInteraction> entityStartInteractions = this.context.query.collect(sourceEntityStarters, ENTITY_STARTER__START_INTERACTION);
		List<EntityStartInteraction> sortedEntityStartInteractions = sortedCopyOfEntityStartInteractions(entityStartInteractions);

		// OSイベント設定のハンドリング処理を構築
		List<OsEventSetActivationOperation> destOperations = Lists.newArrayList();
		for (EntityStartInteraction sourceStartInteraction : sortedEntityStartInteractions) {
			OsEventSetEntityStarter sourceEntityStarter = (OsEventSetEntityStarter) sourceStartInteraction.getStarter();
			destOperations.add(createOsEventSetActivationOperation(sourceEntityStarter, sourceStartInteraction, sourceOsTask));
		}

		// 同一のEntityStarterから生成されたオペレーションが並んでいる場合，OSイベント設定のハンドリング処理を結合
		List<OsEventSetActivationOperation> destCombinedOperations = Lists.newArrayList(destOperations.get(0));
		OsEventSetActivationOperation destCombineTargetOperation = destCombinedOperations.get(0);

		for (OsEventSetActivationOperation destOperation : destOperations.subList(1, destOperations.size())) {
			if (destCombineTargetOperation.getSingleSource() == destOperation.getSingleSource()) {
				// 元になったEntityStarterが同一なので，処理を結合
				destCombineTargetOperation.getExecutableStartOperation().addAll(destOperation.getExecutableStartOperation());
			} else {
				// 元になったEntityStarterが異なるので，次の結合を開始する
				destCombinedOperations.add(destOperation);
				destCombineTargetOperation = destOperation;
			}
		}
	
		// カウントアップ処理を構築
		for (OsEventSetEntityStarter sourceEntityStarter : sourceEntityStarters) {
			List<OsEventSetActivationOperation> targetActivationOperations = this.context.builtQuery.selectDests(destCombinedOperations, sourceEntityStarter);
			OsEventSetActivationOperation targetActivationOperation = Iterables.getLast(targetActivationOperations);
	
			buildEntityCountupOperation(targetActivationOperation, sourceEntityStarter);
		}
		return destCombinedOperations;
	}

	private List<EntityStartInteraction> sortedCopyOfEntityStartInteractions(List<EntityStartInteraction> sourceEntityStartInteractions) {
		return Ordering.natural().onResultOf(this.context.query.<Integer> features2Function(ENTITY_START_INTERACTION__POSITION_IN_TASK)).sortedCopy(sourceEntityStartInteractions);
	}

	private OsEventSetActivationOperation createOsEventSetActivationOperation(OsEventSetEntityStarter sourceEntityStarter, EntityStartInteraction sourceStartInteraction, OsTask sourceOsTask)
			throws ModelException {
		OsEventSetActivationOperation destContextActivationOperation = ModuleFactory.eINSTANCE.createOsEventSetActivationOperation();
		destContextActivationOperation.setSingleSource(sourceEntityStarter);
	
		// エクスキュータブル起動処理の構築
		buildExecutableStartOperation(destContextActivationOperation, sourceStartInteraction);
		destContextActivationOperation.setActivationOsEventId(sourceEntityStarter.getSourceOsEvent().getShortName());
		return destContextActivationOperation;
	}

	private void buildExecutableStartOperation(ContextActivationOperation targetContextActivationOperation, EntityStartInteraction sourceStartInteraction) throws ModelException {
		if (!isEnabledEntityStartInteraction(sourceStartInteraction)) {
			return;
		}
		if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) {
			TimingTriggeringEntityStartImplementation sourceTimingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createTimingTriggeringExecutableStartOperation(sourceStartInteraction, sourceTimingTriggeringEntityStartImplementation));

		} else if (sourceStartInteraction.getImplementation() instanceof PlainEntityStartImplementation) { // COVERAGE 常にtrue(現状，ImplementationはTimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementationのみのため)
			PlainEntityStartImplementation plainImplementation = (PlainEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createPlainExecutableStartOperation(sourceStartInteraction, plainImplementation));
		}
	}

	private boolean isEnabledEntityStartInteraction(EntityStartInteraction sourceStartInteraction) {
		if (sourceStartInteraction instanceof BswSchedulableEntityStartInteraction) {
			return this.moduleRules.isEnabledBswEvent(((BswSchedulableEntityStartInteraction)sourceStartInteraction).getSourceEvent());
		}
		return true; // RTEでは，モードが未サポートのため常に有効
	}

	private TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			TimingTriggeringEntityStartImplementation sourceStartImplementation) throws ModelException {

		TimingTriggeringExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createTimingTriggeringExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceStartInteraction.getStartOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceStartInteraction);

		if (sourceStartImplementation.requiresCycleAdjust()) {
			destOperation.setCycleCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getCycleCounterImplementation()));
			destOperation.setCyclePeriodConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME));
			destOperation.setCycleOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME));
		}
		if (sourceStartImplementation.requiresStartOffsetAdjust()) {
			destOperation.setStartOffsetCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getStartOffsetCounterImplementation()));
			destOperation.setStartOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME));
		}

		return destOperation;
	}

	private PlainExecutableStartOperation createPlainExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			PlainEntityStartImplementation sourcePlainImplementation) throws ModelException {

		PlainExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createPlainExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceStartInteraction.getStartOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceStartInteraction);
		return destOperation;
	}

	private Optional<ModeDeclarationGroupPrototype> tryGetEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// 有効な提供側であれば、それを返す
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return Optional.of(prototype);
		}

		// 要求側の場合、有効な提供側があればそれを返す
		Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)
				.AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, prototype)));
		if (connection.isPresent()) { // 1:1(n)
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, connection.get().getRteBswProvidedModeGroup());
			if (modeInstance.isPresent()) {
				return Optional.of(connection.get().getRteBswProvidedModeGroup());
			}
		}
		return Optional.absent();
	}
	
	private void buildDisabledInModePartOfExecutableStartOperation(ExecutableStartOperation targetOperation, EntityStartInteraction sourceStartInteraction) throws ModelException {
		// RTEでは，モードが未サポート
		if (sourceStartInteraction instanceof BswSchedulableEntityStartInteraction) {
			buildDisabledInModePartOfExecutableStartOperation(targetOperation, ((BswSchedulableEntityStartInteraction)sourceStartInteraction).getSourceEvent());
		}
	}

	private void buildDisabledInModePartOfExecutableStartOperation(ExecutableStartOperation targetOperation, BswEvent sourceBswEvent) throws ModelException {
		for (ModeInBswModuleDescriptionInstanceRef sourceDisabledInModeIref : sourceBswEvent.getDisabledInMode()) {
			Optional<ModeDeclarationGroupPrototype> sourceEnableProvidedModePrototype = tryGetEnableProvidedModeDeclarationGroupPrototype(sourceDisabledInModeIref.getContextModeDeclarationGroup());
			if (!sourceEnableProvidedModePrototype.isPresent()) {
				// 0:1連携(提供側のモードマシンインスタンスが不要なケースを含む)の場合はここに来る。事前(isEnabledEvent())に必要と判定されているため、disabled判定は不要
				continue;
			}

			Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswEvent.getParent().getParent());
			ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceDisabledInModeIref.getContextModeDeclarationGroup().getType());
			Constant disabledModeConstant = this.context.builtQuery.selectDest(modeDeclarationGroup.getModeConstant(), sourceDisabledInModeIref.getTargetMode());

			ModeMachineInstance machineInstance = this.context.builtQuery.findDest(MODE_MACHINE_INSTANCE, sourceEnableProvidedModePrototype.get());

			DisabledInMode destDisabledInMode = ModuleFactory.eINSTANCE.createDisabledInMode();
			destDisabledInMode.setDisabledMode(disabledModeConstant);
			destDisabledInMode.setModeMachineInstance(machineInstance);
			targetOperation.getDisabledInMode().add(destDisabledInMode);
		}

		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(DISABLED_IN_MODE__DISABLED_MODE, CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetOperation.getDisabledInMode(), ordering);
	}

	public ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation(BswModuleDescription sourceBswModuleDescription, BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		ModeSwitchTriggeringExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceBswModeSwitchEvent.getStartsOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceBswModeSwitchEvent);
		setStartMode(sourceBswModuleDescription, destOperation, sourceBswModeSwitchEvent);
		return destOperation;
	}

	private void setStartMode(BswModuleDescription sourceBswModuleDescription, ModeSwitchTriggeringExecutableStartOperation targetOperation, BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		String startModeConstantName = SymbolNames.createModeConstantName(sourceBswModuleDescription, sourceBswModeSwitchEvent.getModeIref().get(0));
		Constant startMode = this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, startModeConstantName)));

		targetOperation.getStartMode().add(startMode);
	}
	
	private void buildEntityCountupOperation(ContextActivationOperation targetContextActivationOperation, EntityStarter sourceEntityStarter) throws ModelException {
		// 周期調整カウンタ変数の構築
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			targetContextActivationOperation.setCycleCountupOperation(createCycleCountupOperation(sourceEntityStarter.getCycleCounterImplementation()));
		}
	
		// 開始オフセット調整カウンタ変数の構築
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			targetContextActivationOperation.setStartOffsetCountupOperation(createStartOffsetCountupOperation(sourceEntityStarter.getStartOffsetCounterImplementation()));
		}
	}

	private CycleCountupOperation createCycleCountupOperation(CycleCounterImplementation sourceCycleCounterImplementation) throws ModelException {
		CycleCountupOperation destCycleCountupOperation = ModuleFactory.eINSTANCE.createCycleCountupOperation();
		destCycleCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceCycleCounterImplementation));
		destCycleCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceCycleCounterImplementation));
		return destCycleCountupOperation;
	}

	private StartOffsetCountupOperation createStartOffsetCountupOperation(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation) throws ModelException {
		StartOffsetCountupOperation destStartOffsetCountupOperation = ModuleFactory.eINSTANCE.createStartOffsetCountupOperation();
		destStartOffsetCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartOffsetCounterImplementation));
		destStartOffsetCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartOffsetCounterImplementation));
		return destStartOffsetCountupOperation;
	}

	public ServerRunnableStartOperation createServerRunnableStartOperation(POperationInstanceInSwc sourceProvidedOperationInstanceInSwc) throws ModelException {
		jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity = sourceProvidedOperationInstanceInSwc.getOperationInvokedEvent().get(0).getStartOnEvent();
		// 使用するポート定義引数を関連付
		List<Value> portArgValues = Collections.emptyList();
		if (!sourceProvidedOperationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			PortApiOption portApiOption = sourceProvidedOperationInstanceInSwc.getContextPort().getPortApiOption().get(0);
			portArgValues = this.context.builtQuery.<Value> findDests(VALUE, portApiOption.getPortArgValue());
		}

		ServerRunnableStartOperation destOperation = ModuleFactory.eINSTANCE.createServerRunnableStartOperation();
		destOperation.getPortArgValue().addAll(portArgValues);
		buildCommonPartOfExecutableStartOperation(destOperation, sourceExecutableEntity);
		return destOperation;
	}
	
	private void buildCommonPartOfExecutableStartOperation(ExecutableStartOperation targetOperation, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ExecutableEntity executableEntity = this.context.builtQuery.findDest(EXECUTABLE_ENTITY, sourceExecutableEntity);

		targetOperation.setStartExecutable(executableEntity);
		for (ExclusiveArea sourceExclusiveArea : sourceExecutableEntity.getRunsInsideExclusiveArea()) {
			targetOperation.getRieaExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		}
	}
}
