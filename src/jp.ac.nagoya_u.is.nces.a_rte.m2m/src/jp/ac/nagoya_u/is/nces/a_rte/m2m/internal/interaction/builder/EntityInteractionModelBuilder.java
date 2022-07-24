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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__MAPPED_RTE_BSW_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__MAPPED_RTE_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXECUTION_CONTEXT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.MathUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswBackgroundEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;

public class EntityInteractionModelBuilder {
	private final InteractionModelBuildContext context;

	public EntityInteractionModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildExecutionContext(this.context.cache.interactionRoot);
		buildExecutionContextImplementation(this.context.cache.interactionRoot);
		buildEntityStarters(this.context.cache.interactionRoot);
		buildEntityStartInteractions(this.context.cache.interactionRoot);
		buildEntityStartImplementations(this.context.cache.interactionRoot);
		buildStarterCounterImplementations(this.context.cache.interactionRoot);
	}

	private void buildExecutionContext(InteractionRoot targetInteractionRoot) throws ModelException {
		// 本来は直接関数起動するオペレーション呼出しイベントについても生成すべきだが，
		// 現状はそこまで必要ないので構築していない．
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			if (sourceOsTask.getMappedRteEvent().isEmpty() && sourceOsTask.getMappedRteBswEvent().isEmpty()) {
				continue;
			}
			targetInteractionRoot.getInteractionEnd().add(createExecutionContext(sourceOsTask));
		}
	}

	private ExecutionContext createExecutionContext(OsTask sourceOsTask) throws ModelException {
		ExecutionContext executionContext = InteractionFactory.eINSTANCE.createExecutionContext();
		executionContext.setSourceOsTask(sourceOsTask);
		return executionContext;
	}

	private void buildExecutionContextImplementation(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ExecutionContext sourceAndTargetExecutionContext : this.context.query.<ExecutionContext> findByKind(EXECUTION_CONTEXT)) {
			OsTask sourceOsTask = sourceAndTargetExecutionContext.getSourceOsTask();

			if (isUsedInfiniteloopImplementation(sourceOsTask)) {
				sourceAndTargetExecutionContext.setExecutionContextImplementation(createInfiniteloopImplementation());
			} else {
				// OSイベントが設定されているかどうか
				List<OsEvent> sourceUsedOsEvents = getUsedOsEvents(sourceOsTask);
				if (sourceUsedOsEvents.isEmpty()) {
					sourceAndTargetExecutionContext.setExecutionContextImplementation(createOneShootImplementation());
				} else {
					sourceAndTargetExecutionContext.setExecutionContextImplementation(createEventPoolingImplementation());
				}
			}
		}
	}

	private boolean isUsedInfiniteloopImplementation(OsTask sourceOsTask) {
		List<OsAlarm> sourceOsAlarms = getUsedOsAlarms(sourceOsTask);
		if (sourceOsAlarms.isEmpty()) {
			if (!sourceOsTask.getMappedRteEvent().isEmpty() && sourceOsTask.getMappedRteEvent().get(0).getRteEvent() instanceof BackgroundEvent) {
				return true;
			}
			if (!sourceOsTask.getMappedRteBswEvent().isEmpty() && sourceOsTask.getMappedRteBswEvent().get(0).getRteBswEvent() instanceof BswBackgroundEvent) {
				return true;
			}
		}
		return false;
	}
	
	private InfiniteloopImplementation createInfiniteloopImplementation() throws ModelException {
		return InteractionFactory.eINSTANCE.createInfiniteloopImplementation();
	}

	private OneShootImplementation createOneShootImplementation() throws ModelException {
		return InteractionFactory.eINSTANCE.createOneShootImplementation();
	}

	private EventPoolingImplementation createEventPoolingImplementation() throws ModelException {
		return InteractionFactory.eINSTANCE.createEventPoolingImplementation();
	}

	private void buildEntityStarters(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ExecutionContext sourceAndTargetExecutionContext : this.context.query.<ExecutionContext> findByKind(EXECUTION_CONTEXT)) {
			OsTask sourceOsTask = sourceAndTargetExecutionContext.getSourceOsTask();

			// OSイベントが設定されているかどうか
			List<OsEvent> sourceUsedOsEvents = getUsedOsEvents(sourceOsTask);
			if (sourceUsedOsEvents.isEmpty()) {
				// OSタスク起動によるエクスキュータブル起動
				targetInteractionRoot.getInteractionEnd().add(createOsTaskEntityStarter(sourceAndTargetExecutionContext, sourceOsTask));
			} else {
				// OSイベント設定によるエクスキュータブル起動
				for (OsEvent sourceUsedOsEvent : sourceUsedOsEvents) {
					targetInteractionRoot.getInteractionEnd().add(createOsEventEntityStarter(sourceAndTargetExecutionContext, sourceOsTask, sourceUsedOsEvent));
				}
			}
		}
	}

	private OsTaskActivateEntityStarter createOsTaskEntityStarter(ExecutionContext sourceExecutionContext, OsTask sourceOsTask) throws ModelException {
		List<OsAlarm> sourceOsAlarms = getUsedOsAlarms(sourceOsTask);
		EcucPartition partition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsTaskActivateEntityStarter destEntityStarter = InteractionFactory.eINSTANCE.createOsTaskActivateEntityStarter();
		destEntityStarter.setExecutionContext(sourceExecutionContext);
		destEntityStarter.setSourceOsTask(sourceOsTask);
		destEntityStarter.setOwnerPartition(partition);
		buildExpectedConfigOfEntityStarter(destEntityStarter, sourceOsAlarms);
		return destEntityStarter;
	}

	private OsEventSetEntityStarter createOsEventEntityStarter(ExecutionContext sourceExecutionContext, OsTask sourceOsTask, OsEvent sourceOsEvent) throws ModelException {
		List<OsAlarm> sourceOsAlarms = getUsedOsAlarms(sourceOsTask, sourceOsEvent);
		EcucPartition partition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsEventSetEntityStarter destEntityStarter = InteractionFactory.eINSTANCE.createOsEventSetEntityStarter();
		destEntityStarter.setExecutionContext(sourceExecutionContext);
		destEntityStarter.setSourceOsTask(sourceOsTask);
		destEntityStarter.setSourceOsEvent(sourceOsEvent);
		destEntityStarter.setOwnerPartition(partition);
		buildExpectedConfigOfEntityStarter(destEntityStarter, sourceOsAlarms);
		return destEntityStarter;
	}

	private void buildExpectedConfigOfEntityStarter(EntityStarter targetEntityStarter, List<OsAlarm> sourceOsAlarms) {
		if (sourceOsAlarms.isEmpty()) {
			return;
		}

		targetEntityStarter.setExpectedConfig(sourceOsAlarms.get(0).getExpectedConfig().get(0));
	}

	private void buildEntityStartInteractions(InteractionRoot targetInteractionRoot) {
		// OSタスク起動により起動するエクスキュータブルの開始連携を構築
		for (OsTaskActivateEntityStarter sourceAndTargetEntityStarter : this.context.query.<OsTaskActivateEntityStarter> findByKind(OS_TASK_ACTIVATE_ENTITY_STARTER)) {
			for (RteEventToTaskMapping sourceRteEventConfig : sourceAndTargetEntityStarter.getSourceOsTask().getMappedRteEvent()) {
				targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, sourceAndTargetEntityStarter));
			}
			
			for (RteBswEventToTaskMapping sourceBswEventConfig : sourceAndTargetEntityStarter.getSourceOsTask().getMappedRteBswEvent()) {
				// BswImplementationが存在しているBswInternalBehaviorに属しているBswSchedulableEntityのみ生成の対象とする.
				if (!sourceBswEventConfig.getRteBswEvent().getStartsOnEvent().getParent().getImplementation().isEmpty()) {
					// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					// BSWイベントが有効でない(有効なInternalBehavior)に含まれていない場合
					targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceBswEventConfig, sourceAndTargetEntityStarter));
				}
			}
		}

		// OSイベント設定により起動するエクスキュータブルの開始連携を構築
		for (OsEventSetEntityStarter sourceAndTargetEntityStarter : this.context.query.<OsEventSetEntityStarter> findByKind(OS_EVENT_SET_ENTITY_STARTER)) {
			for (RteEventToTaskMapping sourceRteEventConfig : getMappedRteEventConfigs(sourceAndTargetEntityStarter.getSourceOsTask(), sourceAndTargetEntityStarter.getSourceOsEvent())) {
				targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, sourceAndTargetEntityStarter));
			}

			for (RteBswEventToTaskMapping sourceBswEventConfig : getMappedBswEventConfigs(sourceAndTargetEntityStarter.getSourceOsTask(), sourceAndTargetEntityStarter.getSourceOsEvent())) {
				targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceBswEventConfig, sourceAndTargetEntityStarter));
			}
		}
	}

	private List<OsEvent> getUsedOsEvents(OsTask osTask) {
		List<OsEvent> usedOsEvents = new ArrayList<OsEvent>();
		usedOsEvents.addAll(this.context.query.<OsEvent> collect(osTask, OS_TASK__MAPPED_RTE_EVENT, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT));
		usedOsEvents.addAll(this.context.query.<OsEvent> collect(osTask, OS_TASK__MAPPED_RTE_BSW_EVENT, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT));
		return ImmutableSet.copyOf(usedOsEvents).asList();
	}

	private List<OsAlarm> getUsedOsAlarms(OsTask osTask) {
		List<OsAlarm> usedOsAlarms = new ArrayList<OsAlarm>();
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(osTask, OS_TASK__MAPPED_RTE_EVENT, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM));
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(osTask, OS_TASK__MAPPED_RTE_BSW_EVENT, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM));
		return ImmutableSet.copyOf(usedOsAlarms).asList();
	}

	private List<OsAlarm> getUsedOsAlarms(OsTask osTask, OsEvent osEvent) {
		List<OsAlarm> usedOsAlarms = new ArrayList<OsAlarm>();
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(getMappedRteEventConfigs(osTask, osEvent), RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM));
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(getMappedBswEventConfigs(osTask, osEvent), RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM));
		return ImmutableSet.copyOf(usedOsAlarms).asList();
	}

	private List<RteEventToTaskMapping> getMappedRteEventConfigs(OsTask osTask, OsEvent osEvent) {
		return this.context.query.select(osTask.getMappedRteEvent(), ref(RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, osEvent));
	}

	private List<RteBswEventToTaskMapping> getMappedBswEventConfigs(OsTask osTask, OsEvent osEvent) {
		return this.context.query.select(osTask.getMappedRteBswEvent(), ref(RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT, osEvent));
	}

	private RunnableEntityStartInteraction createRunnableEntityStartInteraction(RteEventToTaskMapping sourceRteEventConfig, EntityStarter entityStarter) {
		RunnableEntityStartInteraction destStartInteraction = InteractionFactory.eINSTANCE.createRunnableEntityStartInteraction();
		destStartInteraction.setStarter(entityStarter);
		destStartInteraction.setActivationOffset(sourceRteEventConfig.getRteActivationOffset());
		destStartInteraction.setPositionInTask(sourceRteEventConfig.getRtePositionInTask());
		destStartInteraction.setSourceEvent(sourceRteEventConfig.getRteEvent());
		destStartInteraction.setStartOnEvent(sourceRteEventConfig.getRteEvent().getStartOnEvent());
		if (sourceRteEventConfig.getRteEvent() instanceof TimingEvent) {
			destStartInteraction.setTimingTriggeringEntityStartCondition(
					createTimingTriggeringEntityStartCondition(((TimingEvent)sourceRteEventConfig.getRteEvent()).getPeriod()));
		}
		return destStartInteraction;
	}

	private BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction(RteBswEventToTaskMapping sourceRteBswEventConfig, EntityStarter entityStarter) {
		BswSchedulableEntityStartInteraction destStartInteraction = InteractionFactory.eINSTANCE.createBswSchedulableEntityStartInteraction();
		destStartInteraction.setStarter(entityStarter);
		destStartInteraction.setActivationOffset(sourceRteBswEventConfig.getRteBswActivationOffset());
		destStartInteraction.setPositionInTask(sourceRteBswEventConfig.getRteBswPositionInTask());
		destStartInteraction.setSourceEvent(sourceRteBswEventConfig.getRteBswEvent());
		destStartInteraction.setStartOnEvent(sourceRteBswEventConfig.getRteBswEvent().getStartsOnEvent());
		if (sourceRteBswEventConfig.getRteBswEvent() instanceof BswTimingEvent) {
			destStartInteraction.setTimingTriggeringEntityStartCondition(
					createTimingTriggeringEntityStartCondition(((BswTimingEvent)sourceRteBswEventConfig.getRteBswEvent()).getPeriod()));
		}
		return destStartInteraction;
	}

	private TimingTriggeringEntityStartCondition createTimingTriggeringEntityStartCondition(BigDecimal period) {
		TimingTriggeringEntityStartCondition destStartCondition = InteractionFactory.eINSTANCE.createTimingTriggeringEntityStartCondition();
		destStartCondition.setPeriod(period);
		return destStartCondition;
	}
	
	private void buildEntityStartImplementations(InteractionRoot targetInteractionRoot) {
		for (EntityStartInteraction sourceAndTargetStartInteraction : this.context.query.<EntityStartInteraction> findByKind(ENTITY_START_INTERACTION)) {
			if (sourceAndTargetStartInteraction.getTimingTriggeringEntityStartCondition() != null) {
				sourceAndTargetStartInteraction.setImplementation(createTimingTriggeringEntityStartImplementation(sourceAndTargetStartInteraction));
			} else {
				sourceAndTargetStartInteraction.setImplementation(createPlainEntityStartImplementation(sourceAndTargetStartInteraction));
			}
		}
	}

	private TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation(EntityStartInteraction sourceAndTargetStartInteraction) {
		// NOTE 周期イベントの場合，必ずEntityStarterに周期情報が設定されているため、存在チェックは行わない
		RteUsedOsActivation sourceExpectedConfig = sourceAndTargetStartInteraction.getStarter().getExpectedConfig();
		BigDecimal starterStartOffset = sourceExpectedConfig.getRteExpectedActivationOffset();
		BigDecimal starterPeriod = sourceExpectedConfig.getRteExpectedTickDuration();
		BigDecimal entityStartOffset = (sourceAndTargetStartInteraction.getActivationOffset() == null) ? BigDecimal.ZERO : sourceAndTargetStartInteraction.getActivationOffset();

		// Starterとエクスキュータブルの間の周期，およびオフセットの差分を算出
		TimingTriggeringEntityStartImplementation destStartImplementation = InteractionFactory.eINSTANCE.createTimingTriggeringEntityStartImplementation();
		destStartImplementation.setStartOffset(entityStartOffset.subtract(starterStartOffset).divide(starterPeriod).intValue());
		destStartImplementation.setCyclePeriod(sourceAndTargetStartInteraction.getTimingTriggeringEntityStartCondition().getPeriod().divide(starterPeriod).intValue());
		return destStartImplementation;
	}

	private PlainEntityStartImplementation createPlainEntityStartImplementation(EntityStartInteraction sourceAndTargetStartInteraction) {
		return InteractionFactory.eINSTANCE.createPlainEntityStartImplementation();
	}
	
	private void buildStarterCounterImplementations(InteractionRoot targetInteractionRoot) throws ModelException {
		for (EntityStarter sourceAndTargetEntityStarter : this.context.query.<EntityStarter> findByKind(ENTITY_STARTER)) {
			List<TimingTriggeringEntityStartImplementation> startImplementations = this.context.query.get(sourceAndTargetEntityStarter,
					ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER);

			// 周期調整が必要な場合，調整用カウンタを用意する
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST, true))) {
				sourceAndTargetEntityStarter.setCycleCounterImplementation(createCycleCounterImplementation(startImplementations, sourceAndTargetEntityStarter.getOwnerPartition()));
			}

			// 開始オフセット調整が必要な場合，調整用カウンタを用意する
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST, true))) {
				sourceAndTargetEntityStarter.setStartOffsetCounterImplementation(createStartOffsetCounterImplementation(startImplementations, sourceAndTargetEntityStarter.getOwnerPartition()));
			}
		}
	}

	private StartOffsetCounterImplementation createStartOffsetCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> startOffsets = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET);

		StartOffsetCounterImplementation destStartOffsetCounterImplementation = InteractionFactory.eINSTANCE.createStartOffsetCounterImplementation();
		destStartOffsetCounterImplementation.setMaxCount(Ordering.natural().max(startOffsets));
		destStartOffsetCounterImplementation.setOwnerPartition(ownerPartition);
		return destStartOffsetCounterImplementation;
	}

	private CycleCounterImplementation createCycleCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> cyclePeriods = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD);

		CycleCounterImplementation destCycleCounterImplementation = InteractionFactory.eINSTANCE.createCycleCounterImplementation();
		destCycleCounterImplementation.setMaxCount(MathUtils.lcm(cyclePeriods));
		destCycleCounterImplementation.setOwnerPartition(ownerPartition);
		return destCycleCounterImplementation;
	}
}
