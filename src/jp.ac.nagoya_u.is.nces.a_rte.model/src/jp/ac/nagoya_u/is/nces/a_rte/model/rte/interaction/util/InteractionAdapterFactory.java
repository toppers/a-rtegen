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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage
 * @generated
 */
public class InteractionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InteractionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionSwitch<Adapter> modelSwitch =
		new InteractionSwitch<Adapter>() {
			@Override
			public Adapter caseInteractionObject(InteractionObject object) {
				return createInteractionObjectAdapter();
			}
			@Override
			public Adapter caseInteractionReferrable(InteractionReferrable object) {
				return createInteractionReferrableAdapter();
			}
			@Override
			public Adapter caseSender(Sender object) {
				return createSenderAdapter();
			}
			@Override
			public Adapter caseInternalEcuSender(InternalEcuSender object) {
				return createInternalEcuSenderAdapter();
			}
			@Override
			public Adapter caseExternalEcuSender(ExternalEcuSender object) {
				return createExternalEcuSenderAdapter();
			}
			@Override
			public Adapter caseSendInteraction(SendInteraction object) {
				return createSendInteractionAdapter();
			}
			@Override
			public Adapter caseReceiveInteraction(ReceiveInteraction object) {
				return createReceiveInteractionAdapter();
			}
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseInternalEcuReceiver(InternalEcuReceiver object) {
				return createInternalEcuReceiverAdapter();
			}
			@Override
			public Adapter caseValueBufferImplementation(ValueBufferImplementation object) {
				return createValueBufferImplementationAdapter();
			}
			@Override
			public Adapter caseRteValueBufferImplementation(RteValueBufferImplementation object) {
				return createRteValueBufferImplementationAdapter();
			}
			@Override
			public Adapter caseExternalEcuReceiver(ExternalEcuReceiver object) {
				return createExternalEcuReceiverAdapter();
			}
			@Override
			public Adapter caseSendImplementation(SendImplementation object) {
				return createSendImplementationAdapter();
			}
			@Override
			public Adapter caseRteSendImplementation(RteSendImplementation object) {
				return createRteSendImplementationAdapter();
			}
			@Override
			public Adapter caseIocSendImplementation(IocSendImplementation object) {
				return createIocSendImplementationAdapter();
			}
			@Override
			public Adapter caseDirectComSendImplementation(DirectComSendImplementation object) {
				return createDirectComSendImplementationAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionComSendImplementation(TrustedFunctionComSendImplementation object) {
				return createTrustedFunctionComSendImplementationAdapter();
			}
			@Override
			public Adapter casePeriodicProxyComSendImplementation(PeriodicProxyComSendImplementation object) {
				return createPeriodicProxyComSendImplementationAdapter();
			}
			@Override
			public Adapter caseImmediateProxyComSendImplementation(ImmediateProxyComSendImplementation object) {
				return createImmediateProxyComSendImplementationAdapter();
			}
			@Override
			public Adapter caseTAckStatusVariableImplementation(TAckStatusVariableImplementation object) {
				return createTAckStatusVariableImplementationAdapter();
			}
			@Override
			public Adapter caseFilterBufferImplementation(FilterBufferImplementation object) {
				return createFilterBufferImplementationAdapter();
			}
			@Override
			public Adapter caseIocValueBufferImplementation(IocValueBufferImplementation object) {
				return createIocValueBufferImplementationAdapter();
			}
			@Override
			public Adapter caseComValueBufferImplementation(ComValueBufferImplementation object) {
				return createComValueBufferImplementationAdapter();
			}
			@Override
			public Adapter caseVariableImplementation(VariableImplementation object) {
				return createVariableImplementationAdapter();
			}
			@Override
			public Adapter caseInteractionEnd(InteractionEnd object) {
				return createInteractionEndAdapter();
			}
			@Override
			public Adapter caseComSendImplementation(ComSendImplementation object) {
				return createComSendImplementationAdapter();
			}
			@Override
			public Adapter caseInteractionRoot(InteractionRoot object) {
				return createInteractionRootAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionRteSendImplementation(TrustedFunctionRteSendImplementation object) {
				return createTrustedFunctionRteSendImplementationAdapter();
			}
			@Override
			public Adapter caseProxyComSendImplementation(ProxyComSendImplementation object) {
				return createProxyComSendImplementationAdapter();
			}
			@Override
			public Adapter caseComSendProxyInteraction(ComSendProxyInteraction object) {
				return createComSendProxyInteractionAdapter();
			}
			@Override
			public Adapter caseComSendProxy(ComSendProxy object) {
				return createComSendProxyAdapter();
			}
			@Override
			public Adapter casePeriodicComSendProxy(PeriodicComSendProxy object) {
				return createPeriodicComSendProxyAdapter();
			}
			@Override
			public Adapter caseImmediateComSendProxy(ImmediateComSendProxy object) {
				return createImmediateComSendProxyAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseExecutionContext(ExecutionContext object) {
				return createExecutionContextAdapter();
			}
			@Override
			public Adapter caseExecutionContextImplementation(ExecutionContextImplementation object) {
				return createExecutionContextImplementationAdapter();
			}
			@Override
			public Adapter caseInfiniteloopImplementation(InfiniteloopImplementation object) {
				return createInfiniteloopImplementationAdapter();
			}
			@Override
			public Adapter caseOneShootImplementation(OneShootImplementation object) {
				return createOneShootImplementationAdapter();
			}
			@Override
			public Adapter caseEventPoolingImplementation(EventPoolingImplementation object) {
				return createEventPoolingImplementationAdapter();
			}
			@Override
			public Adapter caseEntityStarter(EntityStarter object) {
				return createEntityStarterAdapter();
			}
			@Override
			public Adapter caseOsTaskActivateEntityStarter(OsTaskActivateEntityStarter object) {
				return createOsTaskActivateEntityStarterAdapter();
			}
			@Override
			public Adapter caseOsEventSetEntityStarter(OsEventSetEntityStarter object) {
				return createOsEventSetEntityStarterAdapter();
			}
			@Override
			public Adapter caseEntityStartInteraction(EntityStartInteraction object) {
				return createEntityStartInteractionAdapter();
			}
			@Override
			public Adapter caseTimingTriggeringEntityStartCondition(TimingTriggeringEntityStartCondition object) {
				return createTimingTriggeringEntityStartConditionAdapter();
			}
			@Override
			public Adapter caseRunnableEntityStartInteraction(RunnableEntityStartInteraction object) {
				return createRunnableEntityStartInteractionAdapter();
			}
			@Override
			public Adapter caseBswSchedulableEntityStartInteraction(BswSchedulableEntityStartInteraction object) {
				return createBswSchedulableEntityStartInteractionAdapter();
			}
			@Override
			public Adapter caseEntityStartImplementation(EntityStartImplementation object) {
				return createEntityStartImplementationAdapter();
			}
			@Override
			public Adapter caseTimingTriggeringEntityStartImplementation(TimingTriggeringEntityStartImplementation object) {
				return createTimingTriggeringEntityStartImplementationAdapter();
			}
			@Override
			public Adapter casePlainEntityStartImplementation(PlainEntityStartImplementation object) {
				return createPlainEntityStartImplementationAdapter();
			}
			@Override
			public Adapter caseStartOffsetCounterImplementation(StartOffsetCounterImplementation object) {
				return createStartOffsetCounterImplementationAdapter();
			}
			@Override
			public Adapter caseCycleCounterImplementation(CycleCounterImplementation object) {
				return createCycleCounterImplementationAdapter();
			}
			@Override
			public Adapter caseGeneratedEcuConfiguration(GeneratedEcuConfiguration object) {
				return createGeneratedEcuConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionObject
	 * @generated
	 */
	public Adapter createInteractionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable
	 * @generated
	 */
	public Adapter createInteractionReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender <em>Internal Ecu Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender
	 * @generated
	 */
	public Adapter createInternalEcuSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender <em>External Ecu Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender
	 * @generated
	 */
	public Adapter createExternalEcuSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction
	 * @generated
	 */
	public Adapter createSendInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction
	 * @generated
	 */
	public Adapter createReceiveInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver <em>Internal Ecu Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver
	 * @generated
	 */
	public Adapter createInternalEcuReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation <em>Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation
	 * @generated
	 */
	public Adapter createValueBufferImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation <em>Rte Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation
	 * @generated
	 */
	public Adapter createRteValueBufferImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver <em>External Ecu Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver
	 * @generated
	 */
	public Adapter createExternalEcuReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation <em>Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation
	 * @generated
	 */
	public Adapter createSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation <em>Rte Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation
	 * @generated
	 */
	public Adapter createRteSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation <em>Ioc Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation
	 * @generated
	 */
	public Adapter createIocSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation <em>Direct Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation
	 * @generated
	 */
	public Adapter createDirectComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation <em>Trusted Function Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation
	 * @generated
	 */
	public Adapter createTrustedFunctionComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation <em>Periodic Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation
	 * @generated
	 */
	public Adapter createPeriodicProxyComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation <em>Immediate Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation
	 * @generated
	 */
	public Adapter createImmediateProxyComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation <em>TAck Status Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation
	 * @generated
	 */
	public Adapter createTAckStatusVariableImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation <em>Filter Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation
	 * @generated
	 */
	public Adapter createFilterBufferImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation <em>Ioc Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation
	 * @generated
	 */
	public Adapter createIocValueBufferImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation <em>Com Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation
	 * @generated
	 */
	public Adapter createComValueBufferImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation
	 * @generated
	 */
	public Adapter createVariableImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd
	 * @generated
	 */
	public Adapter createInteractionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation <em>Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation
	 * @generated
	 */
	public Adapter createComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot
	 * @generated
	 */
	public Adapter createInteractionRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation <em>Trusted Function Rte Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation
	 * @generated
	 */
	public Adapter createTrustedFunctionRteSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation <em>Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation
	 * @generated
	 */
	public Adapter createProxyComSendImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction <em>Com Send Proxy Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction
	 * @generated
	 */
	public Adapter createComSendProxyInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy <em>Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy
	 * @generated
	 */
	public Adapter createComSendProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy <em>Periodic Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy
	 * @generated
	 */
	public Adapter createPeriodicComSendProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy <em>Immediate Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy
	 * @generated
	 */
	public Adapter createImmediateComSendProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext
	 * @generated
	 */
	public Adapter createExecutionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContextImplementation <em>Execution Context Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContextImplementation
	 * @generated
	 */
	public Adapter createExecutionContextImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation <em>Infiniteloop Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation
	 * @generated
	 */
	public Adapter createInfiniteloopImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation <em>One Shoot Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation
	 * @generated
	 */
	public Adapter createOneShootImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation <em>Event Pooling Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation
	 * @generated
	 */
	public Adapter createEventPoolingImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter <em>Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter
	 * @generated
	 */
	public Adapter createEntityStarterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter <em>Os Task Activate Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter
	 * @generated
	 */
	public Adapter createOsTaskActivateEntityStarterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter <em>Os Event Set Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter
	 * @generated
	 */
	public Adapter createOsEventSetEntityStarterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction <em>Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction
	 * @generated
	 */
	public Adapter createEntityStartInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition <em>Timing Triggering Entity Start Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition
	 * @generated
	 */
	public Adapter createTimingTriggeringEntityStartConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation <em>Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation
	 * @generated
	 */
	public Adapter createEntityStartImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation <em>Timing Triggering Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation
	 * @generated
	 */
	public Adapter createTimingTriggeringEntityStartImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation <em>Plain Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation
	 * @generated
	 */
	public Adapter createPlainEntityStartImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction <em>Runnable Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction
	 * @generated
	 */
	public Adapter createRunnableEntityStartInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation <em>Start Offset Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation
	 * @generated
	 */
	public Adapter createStartOffsetCounterImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation <em>Cycle Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation
	 * @generated
	 */
	public Adapter createCycleCounterImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration <em>Generated Ecu Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration
	 * @generated
	 */
	public Adapter createGeneratedEcuConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction <em>Bsw Schedulable Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction
	 * @generated
	 */
	public Adapter createBswSchedulableEntityStartInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InteractionAdapterFactory
