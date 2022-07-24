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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage
 * @generated
 */
public interface InteractionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	InteractionObject createInteractionObject();

	/**
	 * Returns a new object of class '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referrable</em>'.
	 * @generated
	 */
	InteractionReferrable createInteractionReferrable();

	/**
	 * Returns a new object of class '<em>Internal Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Ecu Sender</em>'.
	 * @generated
	 */
	InternalEcuSender createInternalEcuSender();

	/**
	 * Returns a new object of class '<em>External Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Sender</em>'.
	 * @generated
	 */
	ExternalEcuSender createExternalEcuSender();

	/**
	 * Returns a new object of class '<em>Send Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Interaction</em>'.
	 * @generated
	 */
	SendInteraction createSendInteraction();

	/**
	 * Returns a new object of class '<em>Receive Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Interaction</em>'.
	 * @generated
	 */
	ReceiveInteraction createReceiveInteraction();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>Internal Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Ecu Receiver</em>'.
	 * @generated
	 */
	InternalEcuReceiver createInternalEcuReceiver();

	/**
	 * Returns a new object of class '<em>Rte Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Value Buffer Implementation</em>'.
	 * @generated
	 */
	RteValueBufferImplementation createRteValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>External Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Receiver</em>'.
	 * @generated
	 */
	ExternalEcuReceiver createExternalEcuReceiver();

	/**
	 * Returns a new object of class '<em>Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Send Implementation</em>'.
	 * @generated
	 */
	RteSendImplementation createRteSendImplementation();

	/**
	 * Returns a new object of class '<em>Ioc Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Implementation</em>'.
	 * @generated
	 */
	IocSendImplementation createIocSendImplementation();

	/**
	 * Returns a new object of class '<em>Direct Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Com Send Implementation</em>'.
	 * @generated
	 */
	DirectComSendImplementation createDirectComSendImplementation();

	/**
	 * Returns a new object of class '<em>Trusted Function Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Com Send Implementation</em>'.
	 * @generated
	 */
	TrustedFunctionComSendImplementation createTrustedFunctionComSendImplementation();

	/**
	 * Returns a new object of class '<em>Periodic Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Proxy Com Send Implementation</em>'.
	 * @generated
	 */
	PeriodicProxyComSendImplementation createPeriodicProxyComSendImplementation();

	/**
	 * Returns a new object of class '<em>Immediate Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Proxy Com Send Implementation</em>'.
	 * @generated
	 */
	ImmediateProxyComSendImplementation createImmediateProxyComSendImplementation();

	/**
	 * Returns a new object of class '<em>TAck Status Variable Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAck Status Variable Implementation</em>'.
	 * @generated
	 */
	TAckStatusVariableImplementation createTAckStatusVariableImplementation();

	/**
	 * Returns a new object of class '<em>Filter Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Buffer Implementation</em>'.
	 * @generated
	 */
	FilterBufferImplementation createFilterBufferImplementation();

	/**
	 * Returns a new object of class '<em>Ioc Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Value Buffer Implementation</em>'.
	 * @generated
	 */
	IocValueBufferImplementation createIocValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>Com Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Value Buffer Implementation</em>'.
	 * @generated
	 */
	ComValueBufferImplementation createComValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	InteractionRoot createInteractionRoot();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Send Implementation</em>'.
	 * @generated
	 */
	TrustedFunctionRteSendImplementation createTrustedFunctionRteSendImplementation();

	/**
	 * Returns a new object of class '<em>Com Send Proxy Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Proxy Interaction</em>'.
	 * @generated
	 */
	ComSendProxyInteraction createComSendProxyInteraction();

	/**
	 * Returns a new object of class '<em>Periodic Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Com Send Proxy</em>'.
	 * @generated
	 */
	PeriodicComSendProxy createPeriodicComSendProxy();

	/**
	 * Returns a new object of class '<em>Immediate Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Com Send Proxy</em>'.
	 * @generated
	 */
	ImmediateComSendProxy createImmediateComSendProxy();

	/**
	 * Returns a new object of class '<em>Execution Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Context</em>'.
	 * @generated
	 */
	ExecutionContext createExecutionContext();

	/**
	 * Returns a new object of class '<em>Infiniteloop Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infiniteloop Implementation</em>'.
	 * @generated
	 */
	InfiniteloopImplementation createInfiniteloopImplementation();

	/**
	 * Returns a new object of class '<em>One Shoot Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Shoot Implementation</em>'.
	 * @generated
	 */
	OneShootImplementation createOneShootImplementation();

	/**
	 * Returns a new object of class '<em>Event Pooling Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Pooling Implementation</em>'.
	 * @generated
	 */
	EventPoolingImplementation createEventPoolingImplementation();

	/**
	 * Returns a new object of class '<em>Os Task Activate Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activate Entity Starter</em>'.
	 * @generated
	 */
	OsTaskActivateEntityStarter createOsTaskActivateEntityStarter();

	/**
	 * Returns a new object of class '<em>Os Event Set Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Entity Starter</em>'.
	 * @generated
	 */
	OsEventSetEntityStarter createOsEventSetEntityStarter();

	/**
	 * Returns a new object of class '<em>Timing Triggering Entity Start Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Triggering Entity Start Condition</em>'.
	 * @generated
	 */
	TimingTriggeringEntityStartCondition createTimingTriggeringEntityStartCondition();

	/**
	 * Returns a new object of class '<em>Timing Triggering Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Triggering Entity Start Implementation</em>'.
	 * @generated
	 */
	TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation();

	/**
	 * Returns a new object of class '<em>Plain Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Entity Start Implementation</em>'.
	 * @generated
	 */
	PlainEntityStartImplementation createPlainEntityStartImplementation();

	/**
	 * Returns a new object of class '<em>Runnable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Entity Start Interaction</em>'.
	 * @generated
	 */
	RunnableEntityStartInteraction createRunnableEntityStartInteraction();

	/**
	 * Returns a new object of class '<em>Start Offset Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Offset Counter Implementation</em>'.
	 * @generated
	 */
	StartOffsetCounterImplementation createStartOffsetCounterImplementation();

	/**
	 * Returns a new object of class '<em>Cycle Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle Counter Implementation</em>'.
	 * @generated
	 */
	CycleCounterImplementation createCycleCounterImplementation();

	/**
	 * Returns a new object of class '<em>Generated Ecu Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated Ecu Configuration</em>'.
	 * @generated
	 */
	GeneratedEcuConfiguration createGeneratedEcuConfiguration();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * @generated
	 */
	BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionPackage getInteractionPackage();

} //InteractionFactory
