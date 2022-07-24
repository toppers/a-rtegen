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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_COMMUNICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_SENDER_PROPERTIES;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SPINLOCK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;

/**
 * 不足しているECUC情報を生成する． 入力モデル中に，生成対象のECUC情報が存在している場合は，入力されたECUC情報を使用する．
 */
public class GeneratedEcucModelBuilder {
	private final InteractionModelBuildContext context;
	private final InteractionRules interactionRules;
	private final InteractionModelSorter sorter;

	public GeneratedEcucModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
		this.interactionRules = new InteractionRules(context);
		this.sorter = new InteractionModelSorter(context);
	}

	public void build() throws ModelException {
		Os sourceAndTargetOs = this.context.cache.sourceOs;

		// コア間連携における排他のためのスピンロックを追加
		if (this.interactionRules.needsSpinlockForRteInternalExclusion()) {
			buildRteInternalSpinlock(sourceAndTargetOs);
		}

		// プロキシCOM通信のためのタスク，イベント，IOCを追加
		Optional<ImmediateComSendProxy> sourceAndTargetImmediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (sourceAndTargetImmediateComSendProxy.isPresent()) {
			OsApplication targetOsApplication = sourceAndTargetImmediateComSendProxy.get().getOwnerPartition().getImplOsApplication().get(0);
			buildComSendSignalImmediateOsEventAndTask(sourceAndTargetOs, targetOsApplication, sourceAndTargetImmediateComSendProxy.get());
		}

		for (ComSendProxyInteraction sourceAndTargetProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			buildComSendProxyOsIocCommunication(getOrCreateOsIoc(sourceAndTargetOs), sourceAndTargetProxyInteraction);
		}

		// S/R IOC送信のためのIOCを追加
		for (IocValueBufferImplementation sourceAndTargetValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			buildSrInterPartitionOsIocCommunication(getOrCreateOsIoc(sourceAndTargetOs), sourceAndTargetValueBufferImplementation);
		}

		// 信頼関数経由COM送信のための信頼関数を追加
		buildComSendSignalTrustedFunctions();

		// 信頼関数経由のS/Rのための信頼関数を追加
		buildSrTrustedFunctions();

		// 信頼関数経由のC/Sのための信頼関数を追加
		buildCsTrustedFunctions();

		// 生成したECUCのソート
		GeneratedEcuConfiguration targetGeneratedEcuConfiguration = this.context.cache.interactionRoot.getGeneratedEcuConfiguration();
		if (targetGeneratedEcuConfiguration != null) {
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsEvent());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsTask());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsSpinlock());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsTrustedFunction());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsIocCommunication());
		}
	}

	private void buildSrTrustedFunctions() throws ModelException {
		// 信頼関数経由RTE送信のための信頼関数を追加
		for (TrustedFunctionRteSendImplementation sourceAndTargetSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			buildRteBufferSendTrustedFunctions(sourceAndTargetSendImplementation);
		}
	}

	private OsIoc getOrCreateOsIoc(Os sourceAndTargetOs) {
		if (sourceAndTargetOs.getOsIoc() == null) {
			OsIoc destOsIoc = EcucFactory.eINSTANCE.createOsIoc();
			destOsIoc.setShortName(Identifiers.DEFAULT_OS_IOC_NAME);
			sourceAndTargetOs.setOsIoc(destOsIoc);
		}
		return sourceAndTargetOs.getOsIoc();
	}

	private void buildRteInternalSpinlock(Os targetOs) {
		Optional<OsSpinlock> inputOsSpinlock = tryFindOsConfig(OS_SPINLOCK, Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		if (!inputOsSpinlock.isPresent()) {
			OsSpinlock destOsSpinlock = createRteInternalSpinlock(targetOs);
			targetOs.getOsSpinlock().add(destOsSpinlock);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsSpinlock().add(destOsSpinlock);
		}
	}

	private OsSpinlock createRteInternalSpinlock(Os os) {
		OsSpinlock destOsSpinlock = EcucFactory.eINSTANCE.createOsSpinlock();
		destOsSpinlock.setShortName(Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		destOsSpinlock.getOsSpinlockAccessingApplication().addAll(os.getOsApplication());
		destOsSpinlock.setOsSpinlockLockMethod(OsSpinlockLockMethodEnum.LOCK_ALL_INTERRUPTS);
		return destOsSpinlock;
	}

	private void buildComSendSignalImmediateOsEventAndTask(Os targetOs, OsApplication targetOsApplication, ImmediateComSendProxy sourceAndTargetComSendProxy) {
		// OSイベントの構築
		OsEvent destOsEvent;

		Optional<OsEvent> inputOsEvent = tryFindOsConfig(OS_EVENT, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		if (inputOsEvent.isPresent()) {
			destOsEvent = inputOsEvent.get();

		} else {
			destOsEvent = createComSendSignalImmediateOsEvent();
			targetOs.getOsEvent().add(destOsEvent);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsEvent().add(destOsEvent);
		}

		sourceAndTargetComSendProxy.setOsEvent(destOsEvent);

		// OSタスクの構築
		Optional<OsTask> inputOsTask = tryFindOsConfig(OS_TASK, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		if (!inputOsTask.isPresent()) {
			OsTask destOsTask = createComSendSignalImmediateOsTask(targetOs, sourceAndTargetComSendProxy, destOsEvent);
			targetOsApplication.getOsAppTask().add(destOsTask);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTask().add(destOsTask);
		}
	}

	private OsTask createComSendSignalImmediateOsTask(Os targetOs, ImmediateComSendProxy sourceComSendProxy, OsEvent osEvent) {
		OsTask destOsTask = EcucFactory.eINSTANCE.createOsTask();
		destOsTask.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		destOsTask.setOsTaskActivation(ConfigValues.DEFAULT_OS_TASK_ACTIVATION);
		destOsTask.setOsTaskPriority(ConfigValues.DEFAULT_OS_TASK_PRIORITY);
		destOsTask.setOsTaskSchedule(ConfigValues.DEFAULT_OS_TASK_SCHEDULE);
		destOsTask.getOsTaskAccessingApplication().addAll(sourceComSendProxy.getRequesterOsApplications());
		destOsTask.getOsTaskEvent().add(osEvent);
		targetOs.getOsTask().add(destOsTask);
		return destOsTask;
	}

	private OsEvent createComSendSignalImmediateOsEvent() {
		OsEvent destOsEvent = EcucFactory.eINSTANCE.createOsEvent();
		destOsEvent.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		return destOsEvent;
	}

	private void buildComSendProxyOsIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceAndTargetProxyInteraction) throws ModelException {
		// 要求伝搬用のIOC通信を構築
		OsIocCommunication destRequestOsIocCommunication;

		String requestOsIocComName = (sourceAndTargetProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
				? Identifiers.createPeriodicComProxyRequestOsIocCommunicationName(sourceAndTargetProxyInteraction)
				: Identifiers.createImmediateComProxyRequestOsIocCommunicationName(sourceAndTargetProxyInteraction);
		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, requestOsIocComName);
		if (inputOsIocCommunication.isPresent()) {
			destRequestOsIocCommunication = inputOsIocCommunication.get();
		} else {
			destRequestOsIocCommunication = createComSendProxyIocCommunication(targetOsIoc, sourceAndTargetProxyInteraction, requestOsIocComName);
			destRequestOsIocCommunication.setOsIocBufferLength(getComSendProxyValueIocDefaultBufferLength(sourceAndTargetProxyInteraction));
			destRequestOsIocCommunication.getOsIocDataProperties().add(createComSendProxyFunctionTableIndexDataProperties());
		}
		sourceAndTargetProxyInteraction.setRequestOsIocCommunication(destRequestOsIocCommunication);

		// 値伝搬用のIOC通信を構築
		ProxyComSendImplementation sourceSendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceAndTargetProxyInteraction));
		InternalEcuSender sourceSender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceSender.getSource().getPrototype();

		EcucReferrable sourceComSignalOrComSignalGroup = sourceSendImplementation.getComSignal() != null ? sourceSendImplementation.getComSignal() : sourceSendImplementation.getComSignalGroup();
		String valueIocComName = (sourceAndTargetProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
				? Identifiers.createPeriodicComProxyValueOsIocCommunicationName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup)
				: Identifiers.createImmediateComProxyValueOsIocCommunicationName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup);
		
		OsIocCommunication destValueOsIocCommunication;
		Optional<OsIocCommunication> inputOsIocCommunicationForValue = tryFindOsConfig(OS_IOC_COMMUNICATION, valueIocComName);
		if (inputOsIocCommunicationForValue.isPresent()) {
			destValueOsIocCommunication = inputOsIocCommunicationForValue.get();
		} else {
			destValueOsIocCommunication = createComSendProxyIocCommunication(targetOsIoc, sourceAndTargetProxyInteraction, valueIocComName);
			destValueOsIocCommunication.setOsIocBufferLength(1); // 値伝搬用のキューはsourceDataInstanceInSwcとシグナルで使い分けるため、サイズは1で良い
			destValueOsIocCommunication.getOsIocDataProperties().add(createComSendProxySignalDataDataProperties(sourceAndTargetProxyInteraction));
		}
		sourceAndTargetProxyInteraction.setValueOsIocCommunication(destValueOsIocCommunication);
	}

	private OsIocCommunication createComSendProxyIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceProxyInteraction, String osIocCommunicationName) {
		OsIocCommunication destOsIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		destOsIocCommunication.setShortName(osIocCommunicationName);
		targetOsIoc.getOsIocCommunication().add(destOsIocCommunication);
		
		// 生成したECUCであることを明示
		getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(destOsIocCommunication);

		// 受信側情報の構築
		destOsIocCommunication.setOsIocReceiverProperties(createComSendProxyOsIocReceiverProperties(sourceProxyInteraction));

		// 送信側情報の構築
		destOsIocCommunication.getOsIocSenderProperties().add(createComSendProxyOsIocSenderProperties(sourceProxyInteraction));
		return destOsIocCommunication;
	}

	private OsIocSenderProperties createComSendProxyOsIocSenderProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(Identifiers.DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME);
		destOsIocSenderProperties.setOsIocSendingOsApplication(sourceProxyInteraction.getRequesterPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private OsIocReceiverProperties createComSendProxyOsIocReceiverProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocReceiverProperties destOsIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		destOsIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		destOsIocReceiverProperties.setOsIocReceivingOsApplication(sourceProxyInteraction.getProxy().getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocReceiverProperties;
	}

	private OsIocDataProperties createComSendProxySignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocDataProperties destSignalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destSignalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		destSignalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		return destSignalDataDataProperties;
	}

	private OsIocDataProperties createComSendProxyFunctionTableIndexDataProperties() {
		OsIocDataProperties destFunctionTableIndexDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destFunctionTableIndexDataProperties.setShortName(Identifiers.COM_PROXY_FUNCTION_INDEX_NAME);
		destFunctionTableIndexDataProperties.setOsIocDataType(this.context.cache.sourceUint32Type);
		return destFunctionTableIndexDataProperties;
	}

	private int getComSendProxyValueIocDefaultBufferLength(ComSendProxyInteraction sourceProxyInteraction) {
		int count = 0; // 自身を必ず足しこむため、0からスタートする
		for (ComSendProxyInteraction sourceAnotherProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			if (sourceAnotherProxyInteraction.getRequesterPartition() == sourceProxyInteraction.getRequesterPartition()) {
				if ((sourceAnotherProxyInteraction.getProxy() instanceof PeriodicComSendProxy && sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					|| (sourceAnotherProxyInteraction.getProxy() instanceof ImmediateComSendProxy && sourceProxyInteraction.getProxy() instanceof ImmediateComSendProxy)) {
					count++;
				}
			}
		}
		return count;
	}

	private void buildSrInterPartitionOsIocCommunication(OsIoc targetOsIoc, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceValueBufferImplementation.getParent();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		// IOC通信を構築
		OsIocCommunication destOsIocCommunication;

		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, Identifiers.createSrInterPartitionOsIocCommunicationName(sourceDataInstance));
		if (inputOsIocCommunication.isPresent()) {
			destOsIocCommunication = inputOsIocCommunication.get();

		} else {
			destOsIocCommunication = createSrInterPartitionOsIocCommunication(sourceDataInstance);
			targetOsIoc.getOsIocCommunication().add(destOsIocCommunication);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(destOsIocCommunication);

			// データ情報の構築
			destOsIocCommunication.getOsIocDataProperties().add(createSrInterPartitionOsIocDataProperties(sourceReceiver, sourceDataInstance));

			// 受信側情報の構築
			destOsIocCommunication.setOsIocReceiverProperties(createSrInterPartitionOsIocReceiverProperties(sourceValueBufferImplementation));
		}

		// 実装に使用するIOCをひもづけ
		sourceValueBufferImplementation.setOsIocCommunication(destOsIocCommunication);

		// 送信側情報を構築

		// 初期化用に，ループバックの送信側情報を構築
		if (!sourceDataInstance.isEventSemantics()) {
			Optional<EcucReferrable> inputLoopbackOsIocSenderProperties = tryFindOsConfig(destOsIocCommunication, OS_IOC_SENDER_PROPERTIES,
					Identifiers.createOsIocSenderPropertiesName(sourceReceiver.getSource()));
			if (!inputLoopbackOsIocSenderProperties.isPresent()) {
				destOsIocCommunication.getOsIocSenderProperties().add(createSrInterPartitionLoopbackOsIocSenderProperties(sourceReceiver));
			}
		}

		// 各送信者用の送信側情報を構築
		for (SendInteraction sourceSendInteraction : sourceReceiveInteraction.getSendInteraction()) {
			Sender sourceSender = sourceSendInteraction.getSender().get(0);
			IocSendImplementation targetIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation(); // NOTE IOCバッファを使用する場合、送信側は必ずIOC送信

			OsIocSenderProperties destOsIocSenderProperties;

			Optional<OsIocSenderProperties> inputOsIocSenderProperties = tryFindOsConfig(destOsIocCommunication, OS_IOC_SENDER_PROPERTIES, createSrInterPartitionOsIocSenderPropertyName(sourceSender));
			if (inputOsIocSenderProperties.isPresent()) {
				destOsIocSenderProperties = inputOsIocSenderProperties.get();

			} else {
				destOsIocSenderProperties = createSrInterPartitionOsIocSenderProperties(sourceSendInteraction, sourceSender);
				destOsIocCommunication.getOsIocSenderProperties().add(destOsIocSenderProperties);
			}

			// 実装に使用するIOCセンダをひもづけ
			targetIocSendImplementation.setOsIocSenderProperties(destOsIocSenderProperties);
		}

		// OsIocSenderPropertiesをソート
		this.sorter.sortEcucContainers(destOsIocCommunication.getOsIocSenderProperties());

		// senderIdを割り振り（送信者数がNの場合のみ）
		if (destOsIocCommunication.getOsIocSenderProperties().size() > 1) {
			int nextSenderId = 0;
			for (OsIocSenderProperties targetOsIocSenderProperties : destOsIocCommunication.getOsIocSenderProperties()) {
				targetOsIocSenderProperties.setOsIocSenderId(nextSenderId);
				nextSenderId++;
			}
		}
	}

	private OsIocSenderProperties createSrInterPartitionLoopbackOsIocSenderProperties(InternalEcuReceiver sourceReceiver) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(Identifiers.createOsIocSenderPropertiesName(sourceReceiver.getSource()));
		destOsIocSenderProperties.setOsIocSendingOsApplication(sourceReceiver.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private OsIocSenderProperties createSrInterPartitionOsIocSenderProperties(SendInteraction sourceSendInteraction, Sender sender) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(createSrInterPartitionOsIocSenderPropertyName(sender));
		destOsIocSenderProperties.setOsIocSendingOsApplication(sender.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private String createSrInterPartitionOsIocSenderPropertyName(Sender sourceSender) {
		if (sourceSender instanceof InternalEcuSender) {
			InternalEcuSender sourceInternalEcuSender = (InternalEcuSender) sourceSender;
			return Identifiers.createOsIocSenderPropertiesName(sourceInternalEcuSender.getSource());

		} else {
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった関係上,本判定のelseがは通過しないようになっている.
			ExternalEcuSender sourceExternalEcuSender = (ExternalEcuSender) sourceSender;
			if (sourceExternalEcuSender.getSourceSignal() != null) {
				return Identifiers.createOsIocSenderPropertiesName(sourceExternalEcuSender.getSourceSignal());
			} else {
				return Identifiers.createOsIocSenderPropertiesName(sourceExternalEcuSender.getSourceSignalGroup());
			}
		}
	}

	private OsIocReceiverProperties createSrInterPartitionOsIocReceiverProperties(IocValueBufferImplementation sourceValueBufferImplementation) {
		OsIocReceiverProperties destOsIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		destOsIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		destOsIocReceiverProperties.setOsIocReceivingOsApplication(sourceValueBufferImplementation.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocReceiverProperties;
	}

	private OsIocCommunication createSrInterPartitionOsIocCommunication(RVariableDataInstanceInSwc sourceDataInstance) {
		OsIocCommunication destOsIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		destOsIocCommunication.setShortName(Identifiers.createSrInterPartitionOsIocCommunicationName(sourceDataInstance));
		if (sourceDataInstance.isEventSemantics()) {
			destOsIocCommunication.setOsIocBufferLength(sourceDataInstance.getQueueLength());
		}
		return destOsIocCommunication;
	}

	private OsIocDataProperties createSrInterPartitionOsIocDataProperties(InternalEcuReceiver sourceReceiver, RVariableDataInstanceInSwc sourceDataInstance) throws ModelException {
		OsIocDataProperties destOsIocDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destOsIocDataProperties.setShortName(Identifiers.DEFAULT_OS_IOC_DATA_PROPERTIES_NAME);
		if (!sourceDataInstance.isEventSemantics()) {
			ValueSpecification initValue = this.context.query.get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
			destOsIocDataProperties.setOsIocInitValue(getValueSpecificationValueAsText(initValue));
		}
		destOsIocDataProperties.setOsIocDataType(sourceDataInstance.getImplementationDataType());
		return destOsIocDataProperties;
	}

	private String getValueSpecificationValueAsText(ValueSpecification value) throws ModelException {
		value = this.context.query.get(value, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		String text = "";
		if (value instanceof ArrayValueSpecification) {
			for (ValueSpecification valueSpecification : ((ArrayValueSpecification) value).getElement()) {
				text += this.context.query.get(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else if (value instanceof RecordValueSpecification) {
			for (ValueSpecification valueSpecification : ((RecordValueSpecification) value).getField()) {
				text += this.context.query.get(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else {
			return this.context.query.get(value, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION);
		}
	}
	
	private void buildComSendSignalTrustedFunctions() {
		List<TrustedFunctionComSendImplementation> sourceImplForComSignals = this.context.query.<TrustedFunctionComSendImplementation> find(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		for (TrustedFunctionComSendImplementation sourceImplForComSignal : sourceImplForComSignals) {
			buildComSendSignalTrustedFunction(sourceImplForComSignal, Identifiers.createComSendSignalTrustedFunctionName(sourceImplForComSignal.getComSignal()), SymbolNames.createComSendSignalTrustedFunctionName(sourceImplForComSignal.getComSignal()));
		}

		List<TrustedFunctionComSendImplementation> sourceImplForComSignalGroups = this.context.query.<TrustedFunctionComSendImplementation> find(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		for (TrustedFunctionComSendImplementation sourceImplForComSignalGroup : sourceImplForComSignalGroups) {
			buildComSendSignalTrustedFunction(sourceImplForComSignalGroup, Identifiers.createComSendSignalGroupTrustedFunctionName(sourceImplForComSignalGroup.getComSignalGroup()), SymbolNames.createComSendSignalGroupTrustedFunctionName(sourceImplForComSignalGroup.getComSignalGroup()));
		}
	}

	private void buildComSendSignalTrustedFunction(TrustedFunctionComSendImplementation sourceImplementation, String tfShortName, String tfSymbolName) {
		EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE 信頼関数を構築する場合には必ずマスタパーティションが存在するため、存在チェックを行わない
		OsApplication targetOsApplication = sourceMasterBswPartition.getImplOsApplication().get(0);

		// データ書き込み用の信頼関数の構築
		OsApplicationTrustedFunction destOsTrustedFunction;

		Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION, tfShortName);
		if (inputTrustedFunction.isPresent()) {
			destOsTrustedFunction = inputTrustedFunction.get();
		} else {
			destOsTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
			destOsTrustedFunction.setShortName(tfShortName);
			destOsTrustedFunction.setOsTrustedFunctionName(tfSymbolName);
			targetOsApplication.getOsApplicationTrustedFunction().add(destOsTrustedFunction);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destOsTrustedFunction);
		}
		sourceImplementation.setOsTrustedFunction(destOsTrustedFunction);
	}

	private void buildRteBufferSendTrustedFunctions(TrustedFunctionRteSendImplementation sourceAndTargetSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceAndTargetSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		InternalEcuReceiver sourceReceiver = sourceSendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
		PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sourceSender.getSource().getPrototype();

		EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
				hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceSender.getOwnerPartition().getOwnerCore())));
		OsApplication targetOsApplication = bswPartition.getImplOsApplication().get(0);

		// データ書き込み用の信頼関数の構築
		OsApplicationTrustedFunction destWriteTrustedFunction;

		Optional<OsApplicationTrustedFunction> inputWriteTrustedFunction;
		if (sourceDataInstanceInSwc.isEventSemantics()) {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferSendTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
		} else {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferWriteTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
		}
		
		if (inputWriteTrustedFunction.isPresent()) {
			destWriteTrustedFunction = inputWriteTrustedFunction.get();

		} else {
			destWriteTrustedFunction = createRteBufferWriteTrustedFunction(sourceSender, sourceReceiver, sourceDataInstanceInSwc.isEventSemantics());
			targetOsApplication.getOsApplicationTrustedFunction().add(destWriteTrustedFunction);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destWriteTrustedFunction);
		}

		sourceAndTargetSendImplementation.setWriteOsTrustedFunction(destWriteTrustedFunction);

		// データ無効化用の信頼関数の構築
		if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
			OsApplicationTrustedFunction destInvalidateTrustedFunction;

			Optional<OsApplicationTrustedFunction> inputInvalidateTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferInvalidateTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
			if (inputInvalidateTrustedFunction.isPresent()) {
				destInvalidateTrustedFunction = inputInvalidateTrustedFunction.get();

			} else {
				destInvalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sourceSender, sourceReceiver);
				targetOsApplication.getOsApplicationTrustedFunction().add(destInvalidateTrustedFunction);

				getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destInvalidateTrustedFunction);
			}

			sourceAndTargetSendImplementation.setInvalidateOsTrustedFunction(destInvalidateTrustedFunction);
		}
	}

	private OsApplicationTrustedFunction createRteBufferWriteTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver, Boolean isEventSemantics) {
		OsApplicationTrustedFunction destOsApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();

		if (isEventSemantics) {
			destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		} else {
			destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		}

		return destOsApplicationTrustedFunction;
	}

	private OsApplicationTrustedFunction createRteBufferInvalidateTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver) {
		OsApplicationTrustedFunction destOsApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		return destOsApplicationTrustedFunction;
	}
	
	private void buildCsTrustedFunctions() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.interactionRules.needsTrustedFunctionForCsCall(sourceOperationInstanceInSwc)) {
						// 送信：非信頼、受信：信頼の場合、信頼関数使用
						Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION, Identifiers.createCsCallTfName(sourceSwComponentType));
						if (!inputTrustedFunction.isPresent()) {
							Optional<EcucPartition> sourcePPartition = tryGetPEcucPartition(sourceOperationInstanceInSwc);

							OsApplication targetOsApplication = sourcePPartition.get().getImplOsApplication().get(0); // NOTE 信頼関数を使用する場合、要求側パーティションは必ず存在する
							OsApplicationTrustedFunction destOsTrustedFunction = createCsTrustedFunction(sourceSwComponentType);
							targetOsApplication.getOsApplicationTrustedFunction().add(destOsTrustedFunction);

							getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destOsTrustedFunction);
						}
					}
				}
			}
		}
	}

	// NOTE できればexモデルに定義したほうがよい
	private Optional<EcucPartition> tryGetPEcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		Optional<AssemblyOperationInstanceConnector> connector = this.context.query.<AssemblyOperationInstanceConnector> tryFindSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, rOpInComposition));
		if (!connector.isPresent()) { // COVERAGE 現状は、常にfalse(信頼関数を使用する場合、要求側パーティションは必ず存在する)
			return Optional.absent();
		}

		PortInstanceInComposition pPortInComposition = connector.get().getProvider().getParent();
		if (pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent(); // COVERAGE 現状は、常にfalse(信頼関数を使用する場合、要求側パーティションは必ず存在する)
		}

		return Optional.of(pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}

	private OsApplicationTrustedFunction createCsTrustedFunction(AtomicSwComponentType sourceSwComponentType) {
		OsApplicationTrustedFunction destOsTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		destOsTrustedFunction.setShortName(Identifiers.createCsCallTfName(sourceSwComponentType));
		destOsTrustedFunction.setOsTrustedFunctionName(SymbolNames.createCsCallTfName(sourceSwComponentType));
		return destOsTrustedFunction;
	}

	private GeneratedEcuConfiguration getOrCreateGeneratedEcuConfiguration() {
		InteractionRoot targetInteractionRoot = this.context.cache.interactionRoot;

		if (targetInteractionRoot.getGeneratedEcuConfiguration() == null) {
			targetInteractionRoot.setGeneratedEcuConfiguration(InteractionFactory.eINSTANCE.createGeneratedEcuConfiguration());
		}
		return targetInteractionRoot.getGeneratedEcuConfiguration();
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EObject eObject, EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(eObject, isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}
}
