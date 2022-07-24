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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_DATA_INSTANCE_CONNECTOR;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class SenderReceiverInteractionModelBuilder {
	private final InteractionModelBuildContext context;

	public SenderReceiverInteractionModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildInternalEcuPeers(this.context.cache.interactionRoot);
		buildExternalEcuPeers(this.context.cache.interactionRoot);
		buildIntraEcuInteractions(this.context.cache.interactionRoot);
		buildInterEcuInteractions(this.context.cache.interactionRoot);
		normalizeInteractions(this.context.cache.interactionRoot);

		determinesRteComResponsibility();
	}

	private void buildInternalEcuPeers(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU内の送信側，および受信側データ要素の生成
		for (VariableDataInstanceInComposition sourceDataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuSender(sourceDataInstanceInComposition));
		}
		for (VariableDataInstanceInComposition sourceDataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuReceiver(sourceDataInstanceInComposition));
		}
	}

	private InternalEcuSender createInternalEcuSender(VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuSender destSender = InteractionFactory.eINSTANCE.createInternalEcuSender();
		destSender.setOwnerPartition(ownerPartition);
		destSender.setSource(sourceDataInstanceInComposition);
		if (((PVariableDataInstanceInSwc)sourceDataInstanceInComposition.getPrototype()).isTAckEnabled()) {
			EList<DataSendCompletedEvent> rteEvents = ((PVariableDataInstanceInSwc)sourceDataInstanceInComposition.getPrototype()).getRelatedDataSendCompletedEvent();
			for (RteEvent rteEvent : rteEvents) {
				EntityStarter entityStarter = (EntityStarter) this.context.query.get(rteEvent, RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT);
				if (! destSender.getActivatesOnSendCompleted().contains(entityStarter)) { // COVERAGE (コードレビューで問題ないことを確認)
					destSender.getActivatesOnSendCompleted().add(entityStarter);
				}
			}
		}
		return destSender;
	}

	private InternalEcuReceiver createInternalEcuReceiver(VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createInternalEcuReceiver();
		destReceiver.setOwnerPartition(ownerPartition);
		destReceiver.setSource(sourceDataInstanceInComposition);
		
		EList<DataReceivedEvent> drEvents = ((RVariableDataInstanceInSwc)sourceDataInstanceInComposition.getPrototype()).getRelatedDataReceivedEvent();
		for (RteEvent rteEvent : drEvents) {
			EntityStarter entityStarter = (EntityStarter) this.context.query.get(rteEvent, RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT);
			if (! destReceiver.getActivatesOnReceived().contains(entityStarter)) { // COVERAGE (コードレビューで問題ないことを確認)
				destReceiver.getActivatesOnReceived().add(entityStarter);
			}
		}
		EList<DataReceiveErrorEvent> dreEvents = ((RVariableDataInstanceInSwc)sourceDataInstanceInComposition.getPrototype()).getRelatedDataReceiveErrorEvent();
		for (RteEvent rteEvent : dreEvents) {
			EntityStarter entityStarter = (EntityStarter) this.context.query.get(rteEvent, RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT);
			if (! destReceiver.getActivatesOnReceiveError().contains(entityStarter)) { // COVERAGE (コードレビューで問題ないことを確認)
				destReceiver.getActivatesOnReceiveError().add(entityStarter);
			}
		}
		return destReceiver;
	}

	private void buildExternalEcuPeers(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU間の送信側，および受信側データ要素の生成
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> connectedDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (connectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			if (this.context.query.get(sourceComSignal, COM_SIGNAL_EX___IS_SENDER__COMSIGNAL)) {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuReceiver(sourceComSignal));
			} else {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuSender(sourceComSignal));
			}
		}

		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> connectedDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (connectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			if (this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP)) {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuReceiver(sourceComSignalGroup));
			} else {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuSender(sourceComSignalGroup));
			}
		}
	}

	private ExternalEcuSender createExternalEcuSender(ComSignal sourceComSignal) {
		ExternalEcuSender destSender = InteractionFactory.eINSTANCE.createExternalEcuSender();
		destSender.setSourceSignal(sourceComSignal);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destSender.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destSender;
	}

	private ExternalEcuSender createExternalEcuSender(ComSignalGroup sourceComSignalGroup) {
		ExternalEcuSender destSender = InteractionFactory.eINSTANCE.createExternalEcuSender();
		destSender.setSourceSignalGroup(sourceComSignalGroup);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destSender.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destSender;
	}

	private ExternalEcuReceiver createExternalEcuReceiver(ComSignal sourceComSignal) {
		ExternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createExternalEcuReceiver();
		destReceiver.setSourceSignal(sourceComSignal);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destReceiver.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destReceiver;
	}

	private ExternalEcuReceiver createExternalEcuReceiver(ComSignalGroup sourceComSignalGroup) {
		ExternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createExternalEcuReceiver();
		destReceiver.setSourceSignalGroup(sourceComSignalGroup);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destReceiver.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destReceiver;
	}

	private void buildIntraEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU内の送信側，および受信側データ要素間のインタラクションを生成
		for (AssemblyDataInstanceConnector sourceConnector : this.context.query.<AssemblyDataInstanceConnector> findByKind(ASSEMBLY_DATA_INSTANCE_CONNECTOR)) {
			InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceConnector.getProvider()));
			InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnector.getRequester()));

			ReceiveInteraction destReceiveInteraction = createIntraReceiveInteraction(sourceConnector, receiver);
			SendInteraction destSendInteraction = createIntraSendInteraction(sourceConnector, sender, receiver, destReceiveInteraction);

			targetInteractionRoot.getInteraction().add(destSendInteraction);
			targetInteractionRoot.getInteraction().add(destReceiveInteraction);
		}
	}

	private SendInteraction createIntraSendInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuSender sender, InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);

		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createIntraReceiveInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private void buildInterEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU間の送信側，および受信側データ要素間のインタラクションを生成
		buildInterEcuInteractionsForComSignal(targetInteractionRoot);
		buildInterEcuInteractionsForComSignalGroup(targetInteractionRoot);
	}


	private void buildInterEcuInteractionsForComSignal(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> sourceConnectedDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (sourceConnectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL, sourceComSignal));
			if (optionalExtReceiver.isPresent()) {
				// ECU内->ECU外のインタラクションを構築
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();

				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver, destReceiveInteraction);

					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			} else {
				// ECU外->ECU内のインタラクションを構築
				ExternalEcuSender extSender = this.context.query.<ExternalEcuSender> findSingle(ref(EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, sourceComSignal));
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnectedDataInstanceInComposition));

					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromExternalToInternal(sourceConnectedDataInstanceInComposition, receiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromExternalToInternal(sourceComSignal, sourceConnectedDataInstanceInComposition, extSender, receiver, destReceiveInteraction);

					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			}
		}
	}

	private void buildInterEcuInteractionsForComSignalGroup(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceConnectedDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceConnectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}
			
			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP, sourceComSignalGroup));
			if (optionalExtReceiver.isPresent()) {
				// ECU内->ECU外のインタラクションを構築
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();
				
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver, destReceiveInteraction);
					
					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			} else {
				// ECU外->ECU内のインタラクションを構築
				ExternalEcuSender extSender = this.context.query.<ExternalEcuSender> findSingle(ref(EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, sourceComSignalGroup));
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnectedDataInstanceInComposition));
					
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromExternalToInternal(sourceConnectedDataInstanceInComposition, receiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromExternalToInternal(sourceComSignalGroup, sourceConnectedDataInstanceInComposition, extSender, receiver, destReceiveInteraction);
					
					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			}
		}
	}

	private SendInteraction createInterSendInteractionFromExternalToInternal(EcucContainer sourceComSignalOrComSignalGroup, VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuSender sender,
			InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);
		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createInterReceiveInteractionFromExternalToInternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, InternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private SendInteraction createInterSendInteractionFromInternalToExternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuReceiver receiver,
			ReceiveInteraction receiveInteraction) throws ModelException {
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));

		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);
		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createInterReceiveInteractionFromInternalToExternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private void normalizeInteractions(InteractionRoot targetInteractionRoot) {
		// 受信インタラクションの数を正規化
		for (InternalEcuReceiver targetReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (targetReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			List<ReceiveInteraction> oldReceiveInteractions = Lists.newArrayList(targetReceiver.getReceiveInteraction());

			// 元々設定されていた受信インタラクションをリソースから除外
			targetReceiver.getReceiveInteraction().clear();
			for (ReceiveInteraction oldReceiveInteraction : oldReceiveInteractions) {
				EcoreUtil.remove(oldReceiveInteraction);
			}

			ReceiveInteraction destCombinedReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
			destCombinedReceiveInteraction.getReceiver().add(targetReceiver);
			targetInteractionRoot.getInteraction().add(destCombinedReceiveInteraction);

			// 送信インタラクションの参照先を，束ねた受信インタラクションに置き換え
			for (ReceiveInteraction oldReceiveInteraction : oldReceiveInteractions) {
				for (SendInteraction targetSendInteraction : Lists.newArrayList(oldReceiveInteraction.getSendInteraction())) {
					targetSendInteraction.setReceiveInteraction(destCombinedReceiveInteraction);
				}
			}
		}
	}

	private void determinesRteComResponsibility() throws ModelException {
		// ポート接続多重度，および受信側データ要素の設定差異を見て，初期化・無効化・フィルタの実装をRTEで行う必要があるかを判定する
		for (ExternalEcuSender targetSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetSender.setRequiresRteInvalidation(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteInitialization(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteFilter(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER));
		}
	}
}
