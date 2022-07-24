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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;

public class SenderReceiverImplementationModelBuilder {
	private final InteractionModelBuildContext context;
	private final InteractionRules interactionRules;

	public SenderReceiverImplementationModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
		this.interactionRules = new InteractionRules(context);
	}

	public void build() throws ModelException {
		buildReceiveImplementations();
		buildSendImplementations();
		optimizeComValueBufferImplementations();
	}

	private void buildReceiveImplementations() throws ModelException {
		// ReceiveInteractionのImplementationを設定
		for (InternalEcuReceiver sourceReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (sourceReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction sourceAndTargetReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);

			buildReceiveImplementation(sourceAndTargetReceiveInteraction, sourceReceiver);
		}
	}

	private void buildReceiveImplementation(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		boolean isIntraEcuExists = !sourceReceiver.getInternalEcuSenders().isEmpty();
		boolean isInterEcuExists = !sourceReceiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(sourceAndTargetReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));

		if (sourceDataInstance.isFilterEnabled() && DataFilterTypeEnum.NEVER.equals(sourceDataInstance.getFilter().getDataFilterType())) {
			// フィルタNEVERの場合，実装を生成しない
			return;
		}

		// 値保持用のバッファを生成
		if (this.interactionRules.usesRteBufferForReceiveInteraction(sourceAndTargetReceiveInteraction, sourceReceiver)) {
			RteValueBufferImplementation destValueBufferImplementation = InteractionFactory.eINSTANCE.createRteValueBufferImplementation();
			destValueBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setValueBufferImplementation(destValueBufferImplementation);
		} else {
			IocValueBufferImplementation destValueBufferImplementation = InteractionFactory.eINSTANCE.createIocValueBufferImplementation();
			destValueBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setValueBufferImplementation(destValueBufferImplementation);
		}

		sourceAndTargetReceiveInteraction.getValueBufferImplementation().setHasStatus(sourceDataInstance.isAliveTimeoutEnabled() && (isInterEcuExists || isInterPartitionExists));

		// フィルタ用のバッファを生成
		boolean anySenderRequiresRteFilter = isIntraEcuExists || this.context.query.exists(sourceReceiver.getExternalEcuSenders(), hasAttr(EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER, true));
		if (this.context.query.<Boolean> get(sourceDataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC) && anySenderRequiresRteFilter) {
			FilterBufferImplementation destFilterBufferImplementation = InteractionFactory.eINSTANCE.createFilterBufferImplementation();
			destFilterBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setFilterBufferImplementation(destFilterBufferImplementation);
		}
	}

	private void buildSendImplementations() throws ModelException {
		for (Sender sourceSender : this.context.query.<Sender> findByKind(SENDER)) {
			// TAckStatusVariableImplementationを設定
			if (sourceSender instanceof InternalEcuSender) {
				buildTAckStatusVariableImplementation((InternalEcuSender) sourceSender);
			}

			// SendInteractionのImplementationを設定
			for (SendInteraction sourceAndTargetSendInteraction : sourceSender.getSendInteraction()) {
				buildSendImplementation(sourceAndTargetSendInteraction, sourceSender);
			}
		}
	}

	private void buildTAckStatusVariableImplementation(InternalEcuSender sourceSender) throws ModelException {
		// 1:0連携であれば，TAｃｋStatusは作成不要(常にRTE_E_UNCONNECTEDを返すため)
		if (sourceSender.getSendInteraction().isEmpty()) {
			return;
		}
		// ECU内連携のみであれば，TAｃｋStatusは作成不要(常にRTE_E_TRANSMIT_ACKを返すため)
		if (sourceSender.getExternalEcuReceivers().isEmpty()) {
			return;
		}

		VariableDataInstanceInSwc variableDataInstanceInSwc = sourceSender.getSource().getPrototype();
		// FeedbackApiの提供有無をチェック(variableDataInstanceInSwcEx_...)
		if(this.context.query.get(variableDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC)){
			TAckStatusVariableImplementation destTAckStatusVariableImplementation = InteractionFactory.eINSTANCE.createTAckStatusVariableImplementation();
			destTAckStatusVariableImplementation.setOwnerPartition(sourceSender.getOwnerPartition());
			sourceSender.setTAckStatusVariableImplementation(destTAckStatusVariableImplementation);
		}
	}

	private void buildSendImplementation(SendInteraction sourceAndTargetSendInteraction, Sender sourceSender) throws ModelException {
		Receiver sourceReceiver = sourceAndTargetSendInteraction.getReceiveInteraction().getReceiver().get(0);

		if (sourceReceiver instanceof InternalEcuReceiver) {
			// ECU内
			if (sourceAndTargetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof RteValueBufferImplementation) {
				if (!sourceAndTargetSendInteraction.isInterPartition() || sourceSender.getOwnerPartition().isTrusted()) {
					// RTEバッファ送信
					RteSendImplementation destRteSendImplementation = InteractionFactory.eINSTANCE.createRteSendImplementation();
					sourceAndTargetSendInteraction.setImplementation(destRteSendImplementation);
				} else {
					// 信頼関数経由RTEバッファ送信
					TrustedFunctionRteSendImplementation destTrustedFunctionRteSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionRteSendImplementation();
					sourceAndTargetSendInteraction.setImplementation(destTrustedFunctionRteSendImplementation);
				}
			} else if (sourceAndTargetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof IocValueBufferImplementation) {
				// IOC送信
				IocSendImplementation destIocSendImplementation = InteractionFactory.eINSTANCE.createIocSendImplementation();
				sourceAndTargetSendInteraction.setImplementation(destIocSendImplementation);
			}
		} else {
			// ECU間
			ExternalEcuReceiver sourceExternalEcuReceiver = (ExternalEcuReceiver) sourceReceiver;

			ComSignal sourceComSignal = sourceExternalEcuReceiver.getSourceSignal();
			ComSignalGroup sourceComSignalGroup = sourceExternalEcuReceiver.getSourceSignalGroup();

			if (sourceSender.getOwnerPartition() == null) {
				// パーティション構成なしの場合，直接COM送信
				DirectComSendImplementation destDirectComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
				destDirectComSendImplementation.setComSignal(sourceComSignal);
				destDirectComSendImplementation.setComSignalGroup(sourceComSignalGroup);
				sourceAndTargetSendInteraction.setImplementation(destDirectComSendImplementation);
			} else if (this.context.query.get(sourceSender.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION)) {
				// マスタコア
				if (sourceSender.getOwnerPartition().isTrusted()) {
					// 信頼パーティションの場合，直接COM送信
					DirectComSendImplementation destDirectComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
					destDirectComSendImplementation.setComSignal(sourceComSignal);
					destDirectComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destDirectComSendImplementation);
				} else {
					// 非信頼パーティションの場合，信頼関数経由COM送信
					TrustedFunctionComSendImplementation destTrustedFunctionComSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionComSendImplementation();
					destTrustedFunctionComSendImplementation.setComSignal(sourceComSignal);
					destTrustedFunctionComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destTrustedFunctionComSendImplementation);
				}
			} else {
				// スレーブコア
				if ((sourceComSignal != null && sourceComSignal.transfersImmediately()) ||
					(sourceComSignalGroup != null && sourceComSignalGroup.transfersImmediately())) {
					ImmediateProxyComSendImplementation destImmediateProxyComSendImplementation = InteractionFactory.eINSTANCE.createImmediateProxyComSendImplementation();
					destImmediateProxyComSendImplementation.setComSignal(sourceComSignal);
					destImmediateProxyComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destImmediateProxyComSendImplementation);
				} else {
					PeriodicProxyComSendImplementation destPeriodicProxyComSendImplementation = InteractionFactory.eINSTANCE.createPeriodicProxyComSendImplementation();
					destPeriodicProxyComSendImplementation.setComSignal(sourceComSignal);
					destPeriodicProxyComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destPeriodicProxyComSendImplementation);
				}
			}
		}
	}

	private void optimizeComValueBufferImplementations() throws ModelException {
		// Comコールバックが不要な場合はCom受信に変更
		for (InternalEcuReceiver sourceInternalEcuReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (sourceInternalEcuReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction sourceAndTargetReceiveInteraction = sourceInternalEcuReceiver.getReceiveInteraction().get(0);
			optimizeComValueBufferImplementation(sourceAndTargetReceiveInteraction, sourceInternalEcuReceiver);
		}
	}

	private void optimizeComValueBufferImplementation(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		if (!this.interactionRules.appliesSrComValueBufferOptimization(sourceAndTargetReceiveInteraction, sourceReceiver)) {
			return;
		}

		ExternalEcuSender sourceExternalEcuSender = sourceReceiver.getExternalEcuSenders().get(0);

		// 最適化を実施
		// SendInteractionのImplementationを削除する。
		for (SendInteraction targetSendInteraction : sourceAndTargetReceiveInteraction.getSendInteraction()) {
			targetSendInteraction.setImplementation(null);
		}

		// ReceiveInteractionのImplementaitionをComバッファに変更する。
		ComSignal comSignal = sourceExternalEcuSender.getSourceSignal();
		ComSignalGroup comSignalGroup = sourceExternalEcuSender.getSourceSignalGroup();

		ComValueBufferImplementation destComValueBufferImplementation = InteractionFactory.eINSTANCE.createComValueBufferImplementation();
		destComValueBufferImplementation.setComSignal(comSignal);
		destComValueBufferImplementation.setComSignalGroup(comSignalGroup);
		sourceAndTargetReceiveInteraction.setValueBufferImplementation(destComValueBufferImplementation);
	}
}
