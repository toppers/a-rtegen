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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionFactoryImpl extends EFactoryImpl implements InteractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionFactory init() {
		try {
			InteractionFactory theInteractionFactory = (InteractionFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionPackage.eNS_URI);
			if (theInteractionFactory != null) {
				return theInteractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InteractionPackage.INTERACTION_OBJECT: return (EObject)createInteractionObject();
			case InteractionPackage.INTERACTION_REFERRABLE: return (EObject)createInteractionReferrable();
			case InteractionPackage.INTERNAL_ECU_SENDER: return (EObject)createInternalEcuSender();
			case InteractionPackage.EXTERNAL_ECU_SENDER: return (EObject)createExternalEcuSender();
			case InteractionPackage.SEND_INTERACTION: return (EObject)createSendInteraction();
			case InteractionPackage.RECEIVE_INTERACTION: return (EObject)createReceiveInteraction();
			case InteractionPackage.RECEIVER: return (EObject)createReceiver();
			case InteractionPackage.INTERNAL_ECU_RECEIVER: return (EObject)createInternalEcuReceiver();
			case InteractionPackage.RTE_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createRteValueBufferImplementation();
			case InteractionPackage.EXTERNAL_ECU_RECEIVER: return (EObject)createExternalEcuReceiver();
			case InteractionPackage.RTE_SEND_IMPLEMENTATION: return (EObject)createRteSendImplementation();
			case InteractionPackage.IOC_SEND_IMPLEMENTATION: return (EObject)createIocSendImplementation();
			case InteractionPackage.DIRECT_COM_SEND_IMPLEMENTATION: return (EObject)createDirectComSendImplementation();
			case InteractionPackage.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION: return (EObject)createTrustedFunctionComSendImplementation();
			case InteractionPackage.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION: return (EObject)createPeriodicProxyComSendImplementation();
			case InteractionPackage.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION: return (EObject)createImmediateProxyComSendImplementation();
			case InteractionPackage.TACK_STATUS_VARIABLE_IMPLEMENTATION: return (EObject)createTAckStatusVariableImplementation();
			case InteractionPackage.FILTER_BUFFER_IMPLEMENTATION: return (EObject)createFilterBufferImplementation();
			case InteractionPackage.IOC_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createIocValueBufferImplementation();
			case InteractionPackage.COM_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createComValueBufferImplementation();
			case InteractionPackage.INTERACTION_ROOT: return (EObject)createInteractionRoot();
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION: return (EObject)createTrustedFunctionRteSendImplementation();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION: return (EObject)createComSendProxyInteraction();
			case InteractionPackage.PERIODIC_COM_SEND_PROXY: return (EObject)createPeriodicComSendProxy();
			case InteractionPackage.IMMEDIATE_COM_SEND_PROXY: return (EObject)createImmediateComSendProxy();
			case InteractionPackage.EXECUTION_CONTEXT: return (EObject)createExecutionContext();
			case InteractionPackage.INFINITELOOP_IMPLEMENTATION: return (EObject)createInfiniteloopImplementation();
			case InteractionPackage.ONE_SHOOT_IMPLEMENTATION: return (EObject)createOneShootImplementation();
			case InteractionPackage.EVENT_POOLING_IMPLEMENTATION: return (EObject)createEventPoolingImplementation();
			case InteractionPackage.OS_TASK_ACTIVATE_ENTITY_STARTER: return (EObject)createOsTaskActivateEntityStarter();
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER: return (EObject)createOsEventSetEntityStarter();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_CONDITION: return (EObject)createTimingTriggeringEntityStartCondition();
			case InteractionPackage.RUNNABLE_ENTITY_START_INTERACTION: return (EObject)createRunnableEntityStartInteraction();
			case InteractionPackage.BSW_SCHEDULABLE_ENTITY_START_INTERACTION: return (EObject)createBswSchedulableEntityStartInteraction();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION: return (EObject)createTimingTriggeringEntityStartImplementation();
			case InteractionPackage.PLAIN_ENTITY_START_IMPLEMENTATION: return (EObject)createPlainEntityStartImplementation();
			case InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION: return (EObject)createStartOffsetCounterImplementation();
			case InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION: return (EObject)createCycleCounterImplementation();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION: return (EObject)createGeneratedEcuConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject createInteractionObject() {
		InteractionObjectImpl interactionObject = new InteractionObjectImpl();
		return interactionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionReferrable createInteractionReferrable() {
		InteractionReferrableImpl interactionReferrable = new InteractionReferrableImpl();
		return interactionReferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEcuSender createInternalEcuSender() {
		InternalEcuSenderImpl internalEcuSender = new InternalEcuSenderImpl();
		return internalEcuSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuSender createExternalEcuSender() {
		ExternalEcuSenderImpl externalEcuSender = new ExternalEcuSenderImpl();
		return externalEcuSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteraction createSendInteraction() {
		SendInteractionImpl sendInteraction = new SendInteractionImpl();
		return sendInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteraction createReceiveInteraction() {
		ReceiveInteractionImpl receiveInteraction = new ReceiveInteractionImpl();
		return receiveInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEcuReceiver createInternalEcuReceiver() {
		InternalEcuReceiverImpl internalEcuReceiver = new InternalEcuReceiverImpl();
		return internalEcuReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteValueBufferImplementation createRteValueBufferImplementation() {
		RteValueBufferImplementationImpl rteValueBufferImplementation = new RteValueBufferImplementationImpl();
		return rteValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuReceiver createExternalEcuReceiver() {
		ExternalEcuReceiverImpl externalEcuReceiver = new ExternalEcuReceiverImpl();
		return externalEcuReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSendImplementation createRteSendImplementation() {
		RteSendImplementationImpl rteSendImplementation = new RteSendImplementationImpl();
		return rteSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendImplementation createIocSendImplementation() {
		IocSendImplementationImpl iocSendImplementation = new IocSendImplementationImpl();
		return iocSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectComSendImplementation createDirectComSendImplementation() {
		DirectComSendImplementationImpl directComSendImplementation = new DirectComSendImplementationImpl();
		return directComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionComSendImplementation createTrustedFunctionComSendImplementation() {
		TrustedFunctionComSendImplementationImpl trustedFunctionComSendImplementation = new TrustedFunctionComSendImplementationImpl();
		return trustedFunctionComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicProxyComSendImplementation createPeriodicProxyComSendImplementation() {
		PeriodicProxyComSendImplementationImpl periodicProxyComSendImplementation = new PeriodicProxyComSendImplementationImpl();
		return periodicProxyComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateProxyComSendImplementation createImmediateProxyComSendImplementation() {
		ImmediateProxyComSendImplementationImpl immediateProxyComSendImplementation = new ImmediateProxyComSendImplementationImpl();
		return immediateProxyComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatusVariableImplementation createTAckStatusVariableImplementation() {
		TAckStatusVariableImplementationImpl tAckStatusVariableImplementation = new TAckStatusVariableImplementationImpl();
		return tAckStatusVariableImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterBufferImplementation createFilterBufferImplementation() {
		FilterBufferImplementationImpl filterBufferImplementation = new FilterBufferImplementationImpl();
		return filterBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocValueBufferImplementation createIocValueBufferImplementation() {
		IocValueBufferImplementationImpl iocValueBufferImplementation = new IocValueBufferImplementationImpl();
		return iocValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComValueBufferImplementation createComValueBufferImplementation() {
		ComValueBufferImplementationImpl comValueBufferImplementation = new ComValueBufferImplementationImpl();
		return comValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionRoot createInteractionRoot() {
		InteractionRootImpl interactionRoot = new InteractionRootImpl();
		return interactionRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteSendImplementation createTrustedFunctionRteSendImplementation() {
		TrustedFunctionRteSendImplementationImpl trustedFunctionRteSendImplementation = new TrustedFunctionRteSendImplementationImpl();
		return trustedFunctionRteSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxyInteraction createComSendProxyInteraction() {
		ComSendProxyInteractionImpl comSendProxyInteraction = new ComSendProxyInteractionImpl();
		return comSendProxyInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxyImpl periodicComSendProxy = new PeriodicComSendProxyImpl();
		return periodicComSendProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxyImpl immediateComSendProxy = new ImmediateComSendProxyImpl();
		return immediateComSendProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext createExecutionContext() {
		ExecutionContextImpl executionContext = new ExecutionContextImpl();
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfiniteloopImplementation createInfiniteloopImplementation() {
		InfiniteloopImplementationImpl infiniteloopImplementation = new InfiniteloopImplementationImpl();
		return infiniteloopImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneShootImplementation createOneShootImplementation() {
		OneShootImplementationImpl oneShootImplementation = new OneShootImplementationImpl();
		return oneShootImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPoolingImplementation createEventPoolingImplementation() {
		EventPoolingImplementationImpl eventPoolingImplementation = new EventPoolingImplementationImpl();
		return eventPoolingImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskActivateEntityStarter createOsTaskActivateEntityStarter() {
		OsTaskActivateEntityStarterImpl osTaskActivateEntityStarter = new OsTaskActivateEntityStarterImpl();
		return osTaskActivateEntityStarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEventSetEntityStarter createOsEventSetEntityStarter() {
		OsEventSetEntityStarterImpl osEventSetEntityStarter = new OsEventSetEntityStarterImpl();
		return osEventSetEntityStarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringEntityStartCondition createTimingTriggeringEntityStartCondition() {
		TimingTriggeringEntityStartConditionImpl timingTriggeringEntityStartCondition = new TimingTriggeringEntityStartConditionImpl();
		return timingTriggeringEntityStartCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation() {
		TimingTriggeringEntityStartImplementationImpl timingTriggeringEntityStartImplementation = new TimingTriggeringEntityStartImplementationImpl();
		return timingTriggeringEntityStartImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEntityStartImplementation createPlainEntityStartImplementation() {
		PlainEntityStartImplementationImpl plainEntityStartImplementation = new PlainEntityStartImplementationImpl();
		return plainEntityStartImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntityStartInteraction createRunnableEntityStartInteraction() {
		RunnableEntityStartInteractionImpl runnableEntityStartInteraction = new RunnableEntityStartInteractionImpl();
		return runnableEntityStartInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCounterImplementation createStartOffsetCounterImplementation() {
		StartOffsetCounterImplementationImpl startOffsetCounterImplementation = new StartOffsetCounterImplementationImpl();
		return startOffsetCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCounterImplementation createCycleCounterImplementation() {
		CycleCounterImplementationImpl cycleCounterImplementation = new CycleCounterImplementationImpl();
		return cycleCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedEcuConfiguration createGeneratedEcuConfiguration() {
		GeneratedEcuConfigurationImpl generatedEcuConfiguration = new GeneratedEcuConfigurationImpl();
		return generatedEcuConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction() {
		BswSchedulableEntityStartInteractionImpl bswSchedulableEntityStartInteraction = new BswSchedulableEntityStartInteractionImpl();
		return bswSchedulableEntityStartInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionPackage getInteractionPackage() {
		return (InteractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionPackage getPackage() {
		return InteractionPackage.eINSTANCE;
	}

} //InteractionFactoryImpl
