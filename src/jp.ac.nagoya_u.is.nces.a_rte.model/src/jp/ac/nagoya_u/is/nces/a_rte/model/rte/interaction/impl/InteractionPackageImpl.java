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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl.RtePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContextImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionPackageImpl extends EPackageImpl implements InteractionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionReferrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEcuSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEcuSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEcuReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBufferImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteValueBufferImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEcuReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directComSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionComSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicProxyComSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateProxyComSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAckStatusVariableImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterBufferImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocValueBufferImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comValueBufferImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionRteSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyComSendImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendProxyInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicComSendProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateComSendProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infiniteloopImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneShootImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPoolingImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStarterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskActivateEntityStarterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEventSetEntityStarterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStartInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingTriggeringEntityStartConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStartImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingTriggeringEntityStartImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainEntityStartImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEntityStartInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOffsetCounterImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cycleCounterImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedEcuConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswSchedulableEntityStartInteractionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractionPackageImpl() {
		super(eNS_URI, InteractionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InteractionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractionPackage init() {
		if (isInited) return (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);

		// Obtain or create and register package
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InteractionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionPackage.createPackageContents();
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theEcucPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theInteractionPackage.initializePackageContents();
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theEcucPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInteractionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractionPackage.eNS_URI, theInteractionPackage);
		return theInteractionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionObject() {
		return interactionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionReferrable() {
		return interactionReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionReferrable_Id() {
		return (EAttribute)interactionReferrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSender() {
		return senderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSender_SendInteraction() {
		return (EReference)senderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__HasMultipleReceivers() {
		return senderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__GetReceivers() {
		return senderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__HasMultipleInternalEcuReceivers() {
		return senderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__GetInternalEcuReceivers() {
		return senderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__GetExternalEcuReceivers() {
		return senderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSender__HasSendImplementation() {
		return senderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEcuSender() {
		return internalEcuSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuSender_Source() {
		return (EReference)internalEcuSenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuSender_TAckStatusVariableImplementation() {
		return (EReference)internalEcuSenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuSender_ActivatesOnSendCompleted() {
		return (EReference)internalEcuSenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuSender__IsEventSemantics() {
		return internalEcuSenderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalEcuSender() {
		return externalEcuSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalEcuSender_SourceSignal() {
		return (EReference)externalEcuSenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalEcuSender_SourceSignalGroup() {
		return (EReference)externalEcuSenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalEcuSender_RequiresRteFilter() {
		return (EAttribute)externalEcuSenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalEcuSender_RequiresRteInvalidation() {
		return (EAttribute)externalEcuSenderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalEcuSender_RequiresRteInitialization() {
		return (EAttribute)externalEcuSenderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendInteraction() {
		return sendInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendInteraction_Sender() {
		return (EReference)sendInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendInteraction_ReceiveInteraction() {
		return (EReference)sendInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendInteraction_Implementation() {
		return (EReference)sendInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendInteraction__GetInternalEcuSenders() {
		return sendInteractionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendInteraction__GetExternalEcuSenders() {
		return sendInteractionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendInteraction__IsInterCore() {
		return sendInteractionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendInteraction__IsInterPartition() {
		return sendInteractionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveInteraction() {
		return receiveInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveInteraction_Receiver() {
		return (EReference)receiveInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveInteraction_SendInteraction() {
		return (EReference)receiveInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveInteraction_ValueBufferImplementation() {
		return (EReference)receiveInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveInteraction_FilterBufferImplementation() {
		return (EReference)receiveInteractionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveInteraction__GetInternalEcuReceivers() {
		return receiveInteractionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveInteraction__GetExternalEcuReceivers() {
		return receiveInteractionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveInteraction__ReceivesInterCore() {
		return receiveInteractionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveInteraction__ReceivesFromMultipleCores() {
		return receiveInteractionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiver_ReceiveInteraction() {
		return (EReference)receiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiver__GetSenders() {
		return receiverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiver__HasMultipleSenders() {
		return receiverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiver__GetInternalEcuSenders() {
		return receiverEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiver__GetExternalEcuSenders() {
		return receiverEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEcuReceiver() {
		return internalEcuReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuReceiver_Source() {
		return (EReference)internalEcuReceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuReceiver_ActivatesOnReceived() {
		return (EReference)internalEcuReceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEcuReceiver_ActivatesOnReceiveError() {
		return (EReference)internalEcuReceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__IsInvalidationEnabled() {
		return internalEcuReceiverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__GetHandleInvalid() {
		return internalEcuReceiverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__IsFilterEnabled() {
		return internalEcuReceiverEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__GetFilter() {
		return internalEcuReceiverEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__IsAliveTimeoutEnabled() {
		return internalEcuReceiverEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalEcuReceiver__IsEventSemantics() {
		return internalEcuReceiverEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBufferImplementation() {
		return valueBufferImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBufferImplementation_Parent() {
		return (EReference)valueBufferImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueBufferImplementation_HasStatus() {
		return (EAttribute)valueBufferImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteValueBufferImplementation() {
		return rteValueBufferImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalEcuReceiver() {
		return externalEcuReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalEcuReceiver_SourceSignal() {
		return (EReference)externalEcuReceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalEcuReceiver_SourceSignalGroup() {
		return (EReference)externalEcuReceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendImplementation() {
		return sendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendImplementation_Parent() {
		return (EReference)sendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendImplementation__IsEventSemantics() {
		return sendImplementationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteSendImplementation() {
		return rteSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocSendImplementation() {
		return iocSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocSendImplementation_OsIocSenderProperties() {
		return (EReference)iocSendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectComSendImplementation() {
		return directComSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionComSendImplementation() {
		return trustedFunctionComSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionComSendImplementation_OsTrustedFunction() {
		return (EReference)trustedFunctionComSendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicProxyComSendImplementation() {
		return periodicProxyComSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateProxyComSendImplementation() {
		return immediateProxyComSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAckStatusVariableImplementation() {
		return tAckStatusVariableImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAckStatusVariableImplementation_Parent() {
		return (EReference)tAckStatusVariableImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterBufferImplementation() {
		return filterBufferImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterBufferImplementation_Parent() {
		return (EReference)filterBufferImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocValueBufferImplementation() {
		return iocValueBufferImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocValueBufferImplementation_OsIocCommunication() {
		return (EReference)iocValueBufferImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComValueBufferImplementation() {
		return comValueBufferImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComValueBufferImplementation_ComSignal() {
		return (EReference)comValueBufferImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComValueBufferImplementation_ComSignalGroup() {
		return (EReference)comValueBufferImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableImplementation() {
		return variableImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableImplementation_OwnerPartition() {
		return (EReference)variableImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionEnd() {
		return interactionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionEnd_OwnerPartition() {
		return (EReference)interactionEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionEnd__GetOwnerCore() {
		return interactionEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendImplementation() {
		return comSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendImplementation_ComSignal() {
		return (EReference)comSendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendImplementation_ComSignalGroup() {
		return (EReference)comSendImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionRoot() {
		return interactionRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionRoot_InteractionEnd() {
		return (EReference)interactionRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionRoot_Interaction() {
		return (EReference)interactionRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionRoot_GeneratedEcuConfiguration() {
		return (EReference)interactionRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionRteSendImplementation() {
		return trustedFunctionRteSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteSendImplementation_WriteOsTrustedFunction() {
		return (EReference)trustedFunctionRteSendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteSendImplementation_InvalidateOsTrustedFunction() {
		return (EReference)trustedFunctionRteSendImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyComSendImplementation() {
		return proxyComSendImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyComSendImplementation_ProxyInteraction() {
		return (EReference)proxyComSendImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendProxyInteraction() {
		return comSendProxyInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxyInteraction_RequesterPartition() {
		return (EReference)comSendProxyInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxyInteraction_SignalDataType() {
		return (EReference)comSendProxyInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxyInteraction_RequestOsIocCommunication() {
		return (EReference)comSendProxyInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxyInteraction_ValueOsIocCommunication() {
		return (EReference)comSendProxyInteractionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxyInteraction_Proxy() {
		return (EReference)comSendProxyInteractionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendProxy() {
		return comSendProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendProxy_Interaction() {
		return (EReference)comSendProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSendProxy__GetRequesterOsApplications() {
		return comSendProxyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicComSendProxy() {
		return periodicComSendProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateComSendProxy() {
		return immediateComSendProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmediateComSendProxy_OsEvent() {
		return (EReference)immediateComSendProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionContext() {
		return executionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_SourceOsTask() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_ExecutionContextImplementation() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_EntityStarter() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionContextImplementation() {
		return executionContextImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfiniteloopImplementation() {
		return infiniteloopImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneShootImplementation() {
		return oneShootImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPoolingImplementation() {
		return eventPoolingImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityStarter() {
		return entityStarterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStarter_ExecutionContext() {
		return (EReference)entityStarterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStarter_ExpectedConfig() {
		return (EReference)entityStarterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStarter_StartInteraction() {
		return (EReference)entityStarterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStarter_StartOffsetCounterImplementation() {
		return (EReference)entityStarterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStarter_CycleCounterImplementation() {
		return (EReference)entityStarterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskActivateEntityStarter() {
		return osTaskActivateEntityStarterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTaskActivateEntityStarter_SourceOsTask() {
		return (EReference)osTaskActivateEntityStarterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsEventSetEntityStarter() {
		return osEventSetEntityStarterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsEventSetEntityStarter_SourceOsTask() {
		return (EReference)osEventSetEntityStarterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsEventSetEntityStarter_SourceOsEvent() {
		return (EReference)osEventSetEntityStarterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityStartInteraction() {
		return entityStartInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStartInteraction_Starter() {
		return (EReference)entityStartInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStartInteraction_Implementation() {
		return (EReference)entityStartInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityStartInteraction_ActivationOffset() {
		return (EAttribute)entityStartInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityStartInteraction_PositionInTask() {
		return (EAttribute)entityStartInteractionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStartInteraction_StartOnEvent() {
		return (EReference)entityStartInteractionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityStartInteraction_TimingTriggeringEntityStartCondition() {
		return (EReference)entityStartInteractionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingTriggeringEntityStartCondition() {
		return timingTriggeringEntityStartConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingTriggeringEntityStartCondition_Period() {
		return (EAttribute)timingTriggeringEntityStartConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityStartImplementation() {
		return entityStartImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingTriggeringEntityStartImplementation() {
		return timingTriggeringEntityStartImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingTriggeringEntityStartImplementation_CyclePeriod() {
		return (EAttribute)timingTriggeringEntityStartImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingTriggeringEntityStartImplementation_StartOffset() {
		return (EAttribute)timingTriggeringEntityStartImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimingTriggeringEntityStartImplementation__GetCycleOffset() {
		return timingTriggeringEntityStartImplementationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimingTriggeringEntityStartImplementation__RequiresCycleAdjust() {
		return timingTriggeringEntityStartImplementationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimingTriggeringEntityStartImplementation__RequiresStartOffsetAdjust() {
		return timingTriggeringEntityStartImplementationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainEntityStartImplementation() {
		return plainEntityStartImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableEntityStartInteraction() {
		return runnableEntityStartInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntityStartInteraction_SourceEvent() {
		return (EReference)runnableEntityStartInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOffsetCounterImplementation() {
		return startOffsetCounterImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartOffsetCounterImplementation_MaxCount() {
		return (EAttribute)startOffsetCounterImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartOffsetCounterImplementation_Parent() {
		return (EReference)startOffsetCounterImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCycleCounterImplementation() {
		return cycleCounterImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCycleCounterImplementation_MaxCount() {
		return (EAttribute)cycleCounterImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCycleCounterImplementation_Parent() {
		return (EReference)cycleCounterImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratedEcuConfiguration() {
		return generatedEcuConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedEcuConfiguration_GeneratedOsTask() {
		return (EReference)generatedEcuConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedEcuConfiguration_GeneratedOsEvent() {
		return (EReference)generatedEcuConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedEcuConfiguration_GeneratedOsSpinlock() {
		return (EReference)generatedEcuConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedEcuConfiguration_GeneratedOsIocCommunication() {
		return (EReference)generatedEcuConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedEcuConfiguration_GeneratedOsTrustedFunction() {
		return (EReference)generatedEcuConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswSchedulableEntityStartInteraction() {
		return bswSchedulableEntityStartInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswSchedulableEntityStartInteraction_SourceEvent() {
		return (EReference)bswSchedulableEntityStartInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactory getInteractionFactory() {
		return (InteractionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interactionObjectEClass = createEClass(INTERACTION_OBJECT);

		interactionReferrableEClass = createEClass(INTERACTION_REFERRABLE);
		createEAttribute(interactionReferrableEClass, INTERACTION_REFERRABLE__ID);

		senderEClass = createEClass(SENDER);
		createEReference(senderEClass, SENDER__SEND_INTERACTION);
		createEOperation(senderEClass, SENDER___HAS_MULTIPLE_RECEIVERS);
		createEOperation(senderEClass, SENDER___GET_RECEIVERS);
		createEOperation(senderEClass, SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS);
		createEOperation(senderEClass, SENDER___GET_INTERNAL_ECU_RECEIVERS);
		createEOperation(senderEClass, SENDER___GET_EXTERNAL_ECU_RECEIVERS);
		createEOperation(senderEClass, SENDER___HAS_SEND_IMPLEMENTATION);

		internalEcuSenderEClass = createEClass(INTERNAL_ECU_SENDER);
		createEReference(internalEcuSenderEClass, INTERNAL_ECU_SENDER__SOURCE);
		createEReference(internalEcuSenderEClass, INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION);
		createEReference(internalEcuSenderEClass, INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED);
		createEOperation(internalEcuSenderEClass, INTERNAL_ECU_SENDER___IS_EVENT_SEMANTICS);

		externalEcuSenderEClass = createEClass(EXTERNAL_ECU_SENDER);
		createEReference(externalEcuSenderEClass, EXTERNAL_ECU_SENDER__SOURCE_SIGNAL);
		createEReference(externalEcuSenderEClass, EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP);
		createEAttribute(externalEcuSenderEClass, EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER);
		createEAttribute(externalEcuSenderEClass, EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION);
		createEAttribute(externalEcuSenderEClass, EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION);

		sendInteractionEClass = createEClass(SEND_INTERACTION);
		createEReference(sendInteractionEClass, SEND_INTERACTION__SENDER);
		createEReference(sendInteractionEClass, SEND_INTERACTION__RECEIVE_INTERACTION);
		createEReference(sendInteractionEClass, SEND_INTERACTION__IMPLEMENTATION);
		createEOperation(sendInteractionEClass, SEND_INTERACTION___GET_INTERNAL_ECU_SENDERS);
		createEOperation(sendInteractionEClass, SEND_INTERACTION___GET_EXTERNAL_ECU_SENDERS);
		createEOperation(sendInteractionEClass, SEND_INTERACTION___IS_INTER_CORE);
		createEOperation(sendInteractionEClass, SEND_INTERACTION___IS_INTER_PARTITION);

		receiveInteractionEClass = createEClass(RECEIVE_INTERACTION);
		createEReference(receiveInteractionEClass, RECEIVE_INTERACTION__RECEIVER);
		createEReference(receiveInteractionEClass, RECEIVE_INTERACTION__SEND_INTERACTION);
		createEReference(receiveInteractionEClass, RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION);
		createEReference(receiveInteractionEClass, RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION);
		createEOperation(receiveInteractionEClass, RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS);
		createEOperation(receiveInteractionEClass, RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS);
		createEOperation(receiveInteractionEClass, RECEIVE_INTERACTION___RECEIVES_INTER_CORE);
		createEOperation(receiveInteractionEClass, RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES);

		receiverEClass = createEClass(RECEIVER);
		createEReference(receiverEClass, RECEIVER__RECEIVE_INTERACTION);
		createEOperation(receiverEClass, RECEIVER___HAS_MULTIPLE_SENDERS);
		createEOperation(receiverEClass, RECEIVER___GET_SENDERS);
		createEOperation(receiverEClass, RECEIVER___GET_INTERNAL_ECU_SENDERS);
		createEOperation(receiverEClass, RECEIVER___GET_EXTERNAL_ECU_SENDERS);

		internalEcuReceiverEClass = createEClass(INTERNAL_ECU_RECEIVER);
		createEReference(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER__SOURCE);
		createEReference(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED);
		createEReference(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___IS_INVALIDATION_ENABLED);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___GET_HANDLE_INVALID);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___IS_FILTER_ENABLED);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___GET_FILTER);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___IS_ALIVE_TIMEOUT_ENABLED);
		createEOperation(internalEcuReceiverEClass, INTERNAL_ECU_RECEIVER___IS_EVENT_SEMANTICS);

		valueBufferImplementationEClass = createEClass(VALUE_BUFFER_IMPLEMENTATION);
		createEReference(valueBufferImplementationEClass, VALUE_BUFFER_IMPLEMENTATION__PARENT);
		createEAttribute(valueBufferImplementationEClass, VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS);

		rteValueBufferImplementationEClass = createEClass(RTE_VALUE_BUFFER_IMPLEMENTATION);

		externalEcuReceiverEClass = createEClass(EXTERNAL_ECU_RECEIVER);
		createEReference(externalEcuReceiverEClass, EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL);
		createEReference(externalEcuReceiverEClass, EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP);

		sendImplementationEClass = createEClass(SEND_IMPLEMENTATION);
		createEReference(sendImplementationEClass, SEND_IMPLEMENTATION__PARENT);
		createEOperation(sendImplementationEClass, SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS);

		rteSendImplementationEClass = createEClass(RTE_SEND_IMPLEMENTATION);

		iocSendImplementationEClass = createEClass(IOC_SEND_IMPLEMENTATION);
		createEReference(iocSendImplementationEClass, IOC_SEND_IMPLEMENTATION__OS_IOC_SENDER_PROPERTIES);

		directComSendImplementationEClass = createEClass(DIRECT_COM_SEND_IMPLEMENTATION);

		trustedFunctionComSendImplementationEClass = createEClass(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION);
		createEReference(trustedFunctionComSendImplementationEClass, TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__OS_TRUSTED_FUNCTION);

		periodicProxyComSendImplementationEClass = createEClass(PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);

		immediateProxyComSendImplementationEClass = createEClass(IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);

		tAckStatusVariableImplementationEClass = createEClass(TACK_STATUS_VARIABLE_IMPLEMENTATION);
		createEReference(tAckStatusVariableImplementationEClass, TACK_STATUS_VARIABLE_IMPLEMENTATION__PARENT);

		filterBufferImplementationEClass = createEClass(FILTER_BUFFER_IMPLEMENTATION);
		createEReference(filterBufferImplementationEClass, FILTER_BUFFER_IMPLEMENTATION__PARENT);

		iocValueBufferImplementationEClass = createEClass(IOC_VALUE_BUFFER_IMPLEMENTATION);
		createEReference(iocValueBufferImplementationEClass, IOC_VALUE_BUFFER_IMPLEMENTATION__OS_IOC_COMMUNICATION);

		comValueBufferImplementationEClass = createEClass(COM_VALUE_BUFFER_IMPLEMENTATION);
		createEReference(comValueBufferImplementationEClass, COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL);
		createEReference(comValueBufferImplementationEClass, COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL_GROUP);

		variableImplementationEClass = createEClass(VARIABLE_IMPLEMENTATION);
		createEReference(variableImplementationEClass, VARIABLE_IMPLEMENTATION__OWNER_PARTITION);

		interactionEndEClass = createEClass(INTERACTION_END);
		createEReference(interactionEndEClass, INTERACTION_END__OWNER_PARTITION);
		createEOperation(interactionEndEClass, INTERACTION_END___GET_OWNER_CORE);

		comSendImplementationEClass = createEClass(COM_SEND_IMPLEMENTATION);
		createEReference(comSendImplementationEClass, COM_SEND_IMPLEMENTATION__COM_SIGNAL);
		createEReference(comSendImplementationEClass, COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP);

		interactionRootEClass = createEClass(INTERACTION_ROOT);
		createEReference(interactionRootEClass, INTERACTION_ROOT__INTERACTION_END);
		createEReference(interactionRootEClass, INTERACTION_ROOT__INTERACTION);
		createEReference(interactionRootEClass, INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION);

		trustedFunctionRteSendImplementationEClass = createEClass(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION);
		createEReference(trustedFunctionRteSendImplementationEClass, TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION);
		createEReference(trustedFunctionRteSendImplementationEClass, TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION);

		proxyComSendImplementationEClass = createEClass(PROXY_COM_SEND_IMPLEMENTATION);
		createEReference(proxyComSendImplementationEClass, PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION);

		comSendProxyInteractionEClass = createEClass(COM_SEND_PROXY_INTERACTION);
		createEReference(comSendProxyInteractionEClass, COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION);
		createEReference(comSendProxyInteractionEClass, COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE);
		createEReference(comSendProxyInteractionEClass, COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION);
		createEReference(comSendProxyInteractionEClass, COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION);
		createEReference(comSendProxyInteractionEClass, COM_SEND_PROXY_INTERACTION__PROXY);

		comSendProxyEClass = createEClass(COM_SEND_PROXY);
		createEReference(comSendProxyEClass, COM_SEND_PROXY__INTERACTION);
		createEOperation(comSendProxyEClass, COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS);

		periodicComSendProxyEClass = createEClass(PERIODIC_COM_SEND_PROXY);

		immediateComSendProxyEClass = createEClass(IMMEDIATE_COM_SEND_PROXY);
		createEReference(immediateComSendProxyEClass, IMMEDIATE_COM_SEND_PROXY__OS_EVENT);

		interactionEClass = createEClass(INTERACTION);

		executionContextEClass = createEClass(EXECUTION_CONTEXT);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__SOURCE_OS_TASK);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__EXECUTION_CONTEXT_IMPLEMENTATION);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__ENTITY_STARTER);

		executionContextImplementationEClass = createEClass(EXECUTION_CONTEXT_IMPLEMENTATION);

		infiniteloopImplementationEClass = createEClass(INFINITELOOP_IMPLEMENTATION);

		oneShootImplementationEClass = createEClass(ONE_SHOOT_IMPLEMENTATION);

		eventPoolingImplementationEClass = createEClass(EVENT_POOLING_IMPLEMENTATION);

		entityStarterEClass = createEClass(ENTITY_STARTER);
		createEReference(entityStarterEClass, ENTITY_STARTER__EXECUTION_CONTEXT);
		createEReference(entityStarterEClass, ENTITY_STARTER__EXPECTED_CONFIG);
		createEReference(entityStarterEClass, ENTITY_STARTER__START_INTERACTION);
		createEReference(entityStarterEClass, ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION);
		createEReference(entityStarterEClass, ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION);

		osTaskActivateEntityStarterEClass = createEClass(OS_TASK_ACTIVATE_ENTITY_STARTER);
		createEReference(osTaskActivateEntityStarterEClass, OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK);

		osEventSetEntityStarterEClass = createEClass(OS_EVENT_SET_ENTITY_STARTER);
		createEReference(osEventSetEntityStarterEClass, OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK);
		createEReference(osEventSetEntityStarterEClass, OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT);

		entityStartInteractionEClass = createEClass(ENTITY_START_INTERACTION);
		createEReference(entityStartInteractionEClass, ENTITY_START_INTERACTION__STARTER);
		createEReference(entityStartInteractionEClass, ENTITY_START_INTERACTION__IMPLEMENTATION);
		createEAttribute(entityStartInteractionEClass, ENTITY_START_INTERACTION__ACTIVATION_OFFSET);
		createEAttribute(entityStartInteractionEClass, ENTITY_START_INTERACTION__POSITION_IN_TASK);
		createEReference(entityStartInteractionEClass, ENTITY_START_INTERACTION__START_ON_EVENT);
		createEReference(entityStartInteractionEClass, ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION);

		timingTriggeringEntityStartConditionEClass = createEClass(TIMING_TRIGGERING_ENTITY_START_CONDITION);
		createEAttribute(timingTriggeringEntityStartConditionEClass, TIMING_TRIGGERING_ENTITY_START_CONDITION__PERIOD);

		runnableEntityStartInteractionEClass = createEClass(RUNNABLE_ENTITY_START_INTERACTION);
		createEReference(runnableEntityStartInteractionEClass, RUNNABLE_ENTITY_START_INTERACTION__SOURCE_EVENT);

		bswSchedulableEntityStartInteractionEClass = createEClass(BSW_SCHEDULABLE_ENTITY_START_INTERACTION);
		createEReference(bswSchedulableEntityStartInteractionEClass, BSW_SCHEDULABLE_ENTITY_START_INTERACTION__SOURCE_EVENT);

		entityStartImplementationEClass = createEClass(ENTITY_START_IMPLEMENTATION);

		timingTriggeringEntityStartImplementationEClass = createEClass(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION);
		createEAttribute(timingTriggeringEntityStartImplementationEClass, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD);
		createEAttribute(timingTriggeringEntityStartImplementationEClass, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET);
		createEOperation(timingTriggeringEntityStartImplementationEClass, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET);
		createEOperation(timingTriggeringEntityStartImplementationEClass, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST);
		createEOperation(timingTriggeringEntityStartImplementationEClass, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST);

		plainEntityStartImplementationEClass = createEClass(PLAIN_ENTITY_START_IMPLEMENTATION);

		startOffsetCounterImplementationEClass = createEClass(START_OFFSET_COUNTER_IMPLEMENTATION);
		createEAttribute(startOffsetCounterImplementationEClass, START_OFFSET_COUNTER_IMPLEMENTATION__MAX_COUNT);
		createEReference(startOffsetCounterImplementationEClass, START_OFFSET_COUNTER_IMPLEMENTATION__PARENT);

		cycleCounterImplementationEClass = createEClass(CYCLE_COUNTER_IMPLEMENTATION);
		createEAttribute(cycleCounterImplementationEClass, CYCLE_COUNTER_IMPLEMENTATION__MAX_COUNT);
		createEReference(cycleCounterImplementationEClass, CYCLE_COUNTER_IMPLEMENTATION__PARENT);

		generatedEcuConfigurationEClass = createEClass(GENERATED_ECU_CONFIGURATION);
		createEReference(generatedEcuConfigurationEClass, GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK);
		createEReference(generatedEcuConfigurationEClass, GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT);
		createEReference(generatedEcuConfigurationEClass, GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK);
		createEReference(generatedEcuConfigurationEClass, GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION);
		createEReference(generatedEcuConfigurationEClass, GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		M2Package theM2Package = (M2Package)EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		EcucPackage theEcucPackage = (EcucPackage)EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI);
		ModulePackage theModulePackage = (ModulePackage)EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionReferrableEClass.getESuperTypes().add(this.getInteractionObject());
		senderEClass.getESuperTypes().add(this.getInteractionEnd());
		internalEcuSenderEClass.getESuperTypes().add(this.getSender());
		externalEcuSenderEClass.getESuperTypes().add(this.getSender());
		sendInteractionEClass.getESuperTypes().add(this.getInteraction());
		receiveInteractionEClass.getESuperTypes().add(this.getInteraction());
		receiverEClass.getESuperTypes().add(this.getInteractionEnd());
		internalEcuReceiverEClass.getESuperTypes().add(this.getReceiver());
		valueBufferImplementationEClass.getESuperTypes().add(this.getVariableImplementation());
		rteValueBufferImplementationEClass.getESuperTypes().add(this.getValueBufferImplementation());
		externalEcuReceiverEClass.getESuperTypes().add(this.getReceiver());
		sendImplementationEClass.getESuperTypes().add(this.getInteractionReferrable());
		rteSendImplementationEClass.getESuperTypes().add(this.getSendImplementation());
		iocSendImplementationEClass.getESuperTypes().add(this.getSendImplementation());
		directComSendImplementationEClass.getESuperTypes().add(this.getComSendImplementation());
		trustedFunctionComSendImplementationEClass.getESuperTypes().add(this.getComSendImplementation());
		periodicProxyComSendImplementationEClass.getESuperTypes().add(this.getProxyComSendImplementation());
		immediateProxyComSendImplementationEClass.getESuperTypes().add(this.getProxyComSendImplementation());
		tAckStatusVariableImplementationEClass.getESuperTypes().add(this.getVariableImplementation());
		filterBufferImplementationEClass.getESuperTypes().add(this.getVariableImplementation());
		iocValueBufferImplementationEClass.getESuperTypes().add(this.getValueBufferImplementation());
		comValueBufferImplementationEClass.getESuperTypes().add(this.getValueBufferImplementation());
		variableImplementationEClass.getESuperTypes().add(this.getInteractionReferrable());
		interactionEndEClass.getESuperTypes().add(this.getInteractionReferrable());
		comSendImplementationEClass.getESuperTypes().add(this.getSendImplementation());
		trustedFunctionRteSendImplementationEClass.getESuperTypes().add(this.getSendImplementation());
		proxyComSendImplementationEClass.getESuperTypes().add(this.getComSendImplementation());
		comSendProxyInteractionEClass.getESuperTypes().add(this.getInteraction());
		comSendProxyEClass.getESuperTypes().add(this.getInteractionEnd());
		periodicComSendProxyEClass.getESuperTypes().add(this.getComSendProxy());
		immediateComSendProxyEClass.getESuperTypes().add(this.getComSendProxy());
		interactionEClass.getESuperTypes().add(this.getInteractionReferrable());
		executionContextEClass.getESuperTypes().add(this.getInteractionEnd());
		executionContextImplementationEClass.getESuperTypes().add(this.getInteractionObject());
		infiniteloopImplementationEClass.getESuperTypes().add(this.getExecutionContextImplementation());
		oneShootImplementationEClass.getESuperTypes().add(this.getExecutionContextImplementation());
		eventPoolingImplementationEClass.getESuperTypes().add(this.getExecutionContextImplementation());
		entityStarterEClass.getESuperTypes().add(this.getInteractionEnd());
		osTaskActivateEntityStarterEClass.getESuperTypes().add(this.getEntityStarter());
		osEventSetEntityStarterEClass.getESuperTypes().add(this.getEntityStarter());
		entityStartInteractionEClass.getESuperTypes().add(this.getInteraction());
		timingTriggeringEntityStartConditionEClass.getESuperTypes().add(this.getInteractionObject());
		runnableEntityStartInteractionEClass.getESuperTypes().add(this.getEntityStartInteraction());
		bswSchedulableEntityStartInteractionEClass.getESuperTypes().add(this.getEntityStartInteraction());
		entityStartImplementationEClass.getESuperTypes().add(this.getInteractionObject());
		timingTriggeringEntityStartImplementationEClass.getESuperTypes().add(this.getEntityStartImplementation());
		plainEntityStartImplementationEClass.getESuperTypes().add(this.getEntityStartImplementation());
		startOffsetCounterImplementationEClass.getESuperTypes().add(this.getVariableImplementation());
		cycleCounterImplementationEClass.getESuperTypes().add(this.getVariableImplementation());
		generatedEcuConfigurationEClass.getESuperTypes().add(this.getInteractionObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionObjectEClass, InteractionObject.class, "InteractionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionReferrableEClass, InteractionReferrable.class, "InteractionReferrable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionReferrable_Id(), theM2Package.getString(), "id", null, 1, 1, InteractionReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderEClass, Sender.class, "Sender", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSender_SendInteraction(), this.getSendInteraction(), this.getSendInteraction_Sender(), "sendInteraction", null, 0, -1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSender__HasMultipleReceivers(), ecorePackage.getEBoolean(), "hasMultipleReceivers", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSender__GetReceivers(), this.getReceiver(), "getReceivers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSender__HasMultipleInternalEcuReceivers(), ecorePackage.getEBoolean(), "hasMultipleInternalEcuReceivers", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSender__GetInternalEcuReceivers(), this.getInternalEcuReceiver(), "getInternalEcuReceivers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSender__GetExternalEcuReceivers(), this.getExternalEcuReceiver(), "getExternalEcuReceivers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSender__HasSendImplementation(), ecorePackage.getEBoolean(), "hasSendImplementation", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(internalEcuSenderEClass, InternalEcuSender.class, "InternalEcuSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalEcuSender_Source(), theInstancePackage.getVariableDataInstanceInComposition(), null, "source", null, 1, 1, InternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalEcuSender_TAckStatusVariableImplementation(), this.getTAckStatusVariableImplementation(), this.getTAckStatusVariableImplementation_Parent(), "tAckStatusVariableImplementation", null, 0, 1, InternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalEcuSender_ActivatesOnSendCompleted(), this.getEntityStarter(), null, "activatesOnSendCompleted", null, 0, -1, InternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getInternalEcuSender__IsEventSemantics(), ecorePackage.getEBoolean(), "isEventSemantics", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalEcuSenderEClass, ExternalEcuSender.class, "ExternalEcuSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalEcuSender_SourceSignal(), theEcucPackage.getComSignal(), null, "sourceSignal", null, 1, 1, ExternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalEcuSender_SourceSignalGroup(), theEcucPackage.getComSignalGroup(), null, "sourceSignalGroup", null, 1, 1, ExternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalEcuSender_RequiresRteFilter(), theM2Package.getBoolean(), "requiresRteFilter", null, 1, 1, ExternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalEcuSender_RequiresRteInvalidation(), theM2Package.getBoolean(), "requiresRteInvalidation", null, 1, 1, ExternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalEcuSender_RequiresRteInitialization(), theM2Package.getBoolean(), "requiresRteInitialization", null, 1, 1, ExternalEcuSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendInteractionEClass, SendInteraction.class, "SendInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendInteraction_Sender(), this.getSender(), this.getSender_SendInteraction(), "sender", null, 0, -1, SendInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendInteraction_ReceiveInteraction(), this.getReceiveInteraction(), this.getReceiveInteraction_SendInteraction(), "receiveInteraction", null, 1, 1, SendInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendInteraction_Implementation(), this.getSendImplementation(), this.getSendImplementation_Parent(), "implementation", null, 0, 1, SendInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSendInteraction__GetInternalEcuSenders(), this.getInternalEcuSender(), "getInternalEcuSenders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSendInteraction__GetExternalEcuSenders(), this.getExternalEcuSender(), "getExternalEcuSenders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSendInteraction__IsInterCore(), ecorePackage.getEBoolean(), "isInterCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSendInteraction__IsInterPartition(), ecorePackage.getEBoolean(), "isInterPartition", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receiveInteractionEClass, ReceiveInteraction.class, "ReceiveInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveInteraction_Receiver(), this.getReceiver(), this.getReceiver_ReceiveInteraction(), "receiver", null, 0, -1, ReceiveInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveInteraction_SendInteraction(), this.getSendInteraction(), this.getSendInteraction_ReceiveInteraction(), "sendInteraction", null, 0, -1, ReceiveInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveInteraction_ValueBufferImplementation(), this.getValueBufferImplementation(), this.getValueBufferImplementation_Parent(), "valueBufferImplementation", null, 0, 1, ReceiveInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveInteraction_FilterBufferImplementation(), this.getFilterBufferImplementation(), this.getFilterBufferImplementation_Parent(), "filterBufferImplementation", null, 0, 1, ReceiveInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReceiveInteraction__GetInternalEcuReceivers(), this.getInternalEcuReceiver(), "getInternalEcuReceivers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceiveInteraction__GetExternalEcuReceivers(), this.getExternalEcuReceiver(), "getExternalEcuReceivers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceiveInteraction__ReceivesInterCore(), ecorePackage.getEBoolean(), "receivesInterCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReceiveInteraction__ReceivesFromMultipleCores(), ecorePackage.getEBoolean(), "receivesFromMultipleCores", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiver_ReceiveInteraction(), this.getReceiveInteraction(), this.getReceiveInteraction_Receiver(), "receiveInteraction", null, 0, -1, Receiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReceiver__HasMultipleSenders(), ecorePackage.getEBoolean(), "hasMultipleSenders", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReceiver__GetSenders(), this.getSender(), "getSenders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceiver__GetInternalEcuSenders(), this.getInternalEcuSender(), "getInternalEcuSenders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceiver__GetExternalEcuSenders(), this.getExternalEcuSender(), "getExternalEcuSenders", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(internalEcuReceiverEClass, InternalEcuReceiver.class, "InternalEcuReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalEcuReceiver_Source(), theInstancePackage.getVariableDataInstanceInComposition(), null, "source", null, 1, 1, InternalEcuReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalEcuReceiver_ActivatesOnReceived(), this.getEntityStarter(), null, "activatesOnReceived", null, 0, -1, InternalEcuReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalEcuReceiver_ActivatesOnReceiveError(), this.getEntityStarter(), null, "activatesOnReceiveError", null, 0, -1, InternalEcuReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getInternalEcuReceiver__IsInvalidationEnabled(), ecorePackage.getEBoolean(), "isInvalidationEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInternalEcuReceiver__GetHandleInvalid(), theM2Package.getHandleInvalidEnum(), "getHandleInvalid", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInternalEcuReceiver__IsFilterEnabled(), ecorePackage.getEBoolean(), "isFilterEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInternalEcuReceiver__GetFilter(), theM2Package.getDataFilter(), "getFilter", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInternalEcuReceiver__IsAliveTimeoutEnabled(), ecorePackage.getEBoolean(), "isAliveTimeoutEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInternalEcuReceiver__IsEventSemantics(), ecorePackage.getEBoolean(), "isEventSemantics", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueBufferImplementationEClass, ValueBufferImplementation.class, "ValueBufferImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueBufferImplementation_Parent(), this.getReceiveInteraction(), this.getReceiveInteraction_ValueBufferImplementation(), "parent", null, 1, 1, ValueBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueBufferImplementation_HasStatus(), theM2Package.getBoolean(), "hasStatus", null, 1, 1, ValueBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteValueBufferImplementationEClass, RteValueBufferImplementation.class, "RteValueBufferImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalEcuReceiverEClass, ExternalEcuReceiver.class, "ExternalEcuReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalEcuReceiver_SourceSignal(), theEcucPackage.getComSignal(), null, "sourceSignal", null, 1, 1, ExternalEcuReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalEcuReceiver_SourceSignalGroup(), theEcucPackage.getComSignalGroup(), null, "sourceSignalGroup", null, 1, 1, ExternalEcuReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendImplementationEClass, SendImplementation.class, "SendImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendImplementation_Parent(), this.getSendInteraction(), this.getSendInteraction_Implementation(), "parent", null, 1, 1, SendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSendImplementation__IsEventSemantics(), ecorePackage.getEBoolean(), "isEventSemantics", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rteSendImplementationEClass, RteSendImplementation.class, "RteSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iocSendImplementationEClass, IocSendImplementation.class, "IocSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIocSendImplementation_OsIocSenderProperties(), theEcucPackage.getOsIocSenderProperties(), null, "osIocSenderProperties", null, 1, 1, IocSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directComSendImplementationEClass, DirectComSendImplementation.class, "DirectComSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trustedFunctionComSendImplementationEClass, TrustedFunctionComSendImplementation.class, "TrustedFunctionComSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrustedFunctionComSendImplementation_OsTrustedFunction(), theEcucPackage.getOsApplicationTrustedFunction(), null, "osTrustedFunction", null, 1, 1, TrustedFunctionComSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicProxyComSendImplementationEClass, PeriodicProxyComSendImplementation.class, "PeriodicProxyComSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(immediateProxyComSendImplementationEClass, ImmediateProxyComSendImplementation.class, "ImmediateProxyComSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAckStatusVariableImplementationEClass, TAckStatusVariableImplementation.class, "TAckStatusVariableImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAckStatusVariableImplementation_Parent(), this.getInternalEcuSender(), this.getInternalEcuSender_TAckStatusVariableImplementation(), "parent", null, 1, 1, TAckStatusVariableImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterBufferImplementationEClass, FilterBufferImplementation.class, "FilterBufferImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterBufferImplementation_Parent(), this.getReceiveInteraction(), this.getReceiveInteraction_FilterBufferImplementation(), "parent", null, 1, 1, FilterBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iocValueBufferImplementationEClass, IocValueBufferImplementation.class, "IocValueBufferImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIocValueBufferImplementation_OsIocCommunication(), theEcucPackage.getOsIocCommunication(), null, "osIocCommunication", null, 1, 1, IocValueBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comValueBufferImplementationEClass, ComValueBufferImplementation.class, "ComValueBufferImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComValueBufferImplementation_ComSignal(), theEcucPackage.getComSignal(), null, "comSignal", null, 1, 1, ComValueBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComValueBufferImplementation_ComSignalGroup(), theEcucPackage.getComSignalGroup(), null, "comSignalGroup", null, 1, 1, ComValueBufferImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableImplementationEClass, VariableImplementation.class, "VariableImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableImplementation_OwnerPartition(), theEcucPackage.getEcucPartition(), null, "ownerPartition", null, 0, 1, VariableImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEndEClass, InteractionEnd.class, "InteractionEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionEnd_OwnerPartition(), theEcucPackage.getEcucPartition(), null, "ownerPartition", null, 0, 1, InteractionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInteractionEnd__GetOwnerCore(), theM2Package.getInteger(), "getOwnerCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comSendImplementationEClass, ComSendImplementation.class, "ComSendImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSendImplementation_ComSignal(), theEcucPackage.getComSignal(), null, "comSignal", null, 1, 1, ComSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSendImplementation_ComSignalGroup(), theEcucPackage.getComSignalGroup(), null, "comSignalGroup", null, 1, 1, ComSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionRootEClass, InteractionRoot.class, "InteractionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionRoot_InteractionEnd(), this.getInteractionEnd(), null, "interactionEnd", null, 0, -1, InteractionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionRoot_Interaction(), this.getInteraction(), null, "interaction", null, 0, -1, InteractionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionRoot_GeneratedEcuConfiguration(), this.getGeneratedEcuConfiguration(), null, "generatedEcuConfiguration", null, 0, 1, InteractionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustedFunctionRteSendImplementationEClass, TrustedFunctionRteSendImplementation.class, "TrustedFunctionRteSendImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrustedFunctionRteSendImplementation_WriteOsTrustedFunction(), theEcucPackage.getOsApplicationTrustedFunction(), null, "writeOsTrustedFunction", null, 1, 1, TrustedFunctionRteSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrustedFunctionRteSendImplementation_InvalidateOsTrustedFunction(), theEcucPackage.getOsApplicationTrustedFunction(), null, "invalidateOsTrustedFunction", null, 0, 1, TrustedFunctionRteSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyComSendImplementationEClass, ProxyComSendImplementation.class, "ProxyComSendImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxyComSendImplementation_ProxyInteraction(), this.getComSendProxyInteraction(), null, "proxyInteraction", null, 1, 1, ProxyComSendImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comSendProxyInteractionEClass, ComSendProxyInteraction.class, "ComSendProxyInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSendProxyInteraction_RequesterPartition(), theEcucPackage.getEcucPartition(), null, "requesterPartition", null, 1, 1, ComSendProxyInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSendProxyInteraction_SignalDataType(), theM2Package.getImplementationDataType(), null, "signalDataType", null, 1, 1, ComSendProxyInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSendProxyInteraction_RequestOsIocCommunication(), theEcucPackage.getOsIocCommunication(), null, "requestOsIocCommunication", null, 1, 1, ComSendProxyInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSendProxyInteraction_ValueOsIocCommunication(), theEcucPackage.getOsIocCommunication(), null, "valueOsIocCommunication", null, 1, 1, ComSendProxyInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSendProxyInteraction_Proxy(), this.getComSendProxy(), this.getComSendProxy_Interaction(), "proxy", null, 1, 1, ComSendProxyInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comSendProxyEClass, ComSendProxy.class, "ComSendProxy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSendProxy_Interaction(), this.getComSendProxyInteraction(), this.getComSendProxyInteraction_Proxy(), "interaction", null, 0, -1, ComSendProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComSendProxy__GetRequesterOsApplications(), theEcucPackage.getOsApplication(), "getRequesterOsApplications", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(periodicComSendProxyEClass, PeriodicComSendProxy.class, "PeriodicComSendProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(immediateComSendProxyEClass, ImmediateComSendProxy.class, "ImmediateComSendProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImmediateComSendProxy_OsEvent(), theEcucPackage.getOsEvent(), null, "osEvent", null, 1, 1, ImmediateComSendProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionContextEClass, ExecutionContext.class, "ExecutionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionContext_SourceOsTask(), theEcucPackage.getOsTask(), null, "sourceOsTask", null, 1, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_ExecutionContextImplementation(), this.getExecutionContextImplementation(), null, "executionContextImplementation", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_EntityStarter(), this.getEntityStarter(), this.getEntityStarter_ExecutionContext(), "entityStarter", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionContextImplementationEClass, ExecutionContextImplementation.class, "ExecutionContextImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infiniteloopImplementationEClass, InfiniteloopImplementation.class, "InfiniteloopImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneShootImplementationEClass, OneShootImplementation.class, "OneShootImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventPoolingImplementationEClass, EventPoolingImplementation.class, "EventPoolingImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityStarterEClass, EntityStarter.class, "EntityStarter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityStarter_ExecutionContext(), this.getExecutionContext(), this.getExecutionContext_EntityStarter(), "executionContext", null, 1, 1, EntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStarter_ExpectedConfig(), theEcucPackage.getRteUsedOsActivation(), null, "expectedConfig", null, 1, 1, EntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStarter_StartInteraction(), this.getEntityStartInteraction(), this.getEntityStartInteraction_Starter(), "startInteraction", null, 0, -1, EntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStarter_StartOffsetCounterImplementation(), this.getStartOffsetCounterImplementation(), this.getStartOffsetCounterImplementation_Parent(), "startOffsetCounterImplementation", null, 0, 1, EntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStarter_CycleCounterImplementation(), this.getCycleCounterImplementation(), this.getCycleCounterImplementation_Parent(), "cycleCounterImplementation", null, 0, 1, EntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osTaskActivateEntityStarterEClass, OsTaskActivateEntityStarter.class, "OsTaskActivateEntityStarter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsTaskActivateEntityStarter_SourceOsTask(), theEcucPackage.getOsTask(), null, "sourceOsTask", null, 1, 1, OsTaskActivateEntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEventSetEntityStarterEClass, OsEventSetEntityStarter.class, "OsEventSetEntityStarter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsEventSetEntityStarter_SourceOsTask(), theEcucPackage.getOsTask(), null, "sourceOsTask", null, 1, 1, OsEventSetEntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsEventSetEntityStarter_SourceOsEvent(), theEcucPackage.getOsEvent(), null, "sourceOsEvent", null, 1, 1, OsEventSetEntityStarter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityStartInteractionEClass, EntityStartInteraction.class, "EntityStartInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityStartInteraction_Starter(), this.getEntityStarter(), this.getEntityStarter_StartInteraction(), "starter", null, 1, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStartInteraction_Implementation(), this.getEntityStartImplementation(), null, "implementation", null, 1, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityStartInteraction_ActivationOffset(), theM2Package.getTimeValue(), "activationOffset", null, 0, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityStartInteraction_PositionInTask(), theModulePackage.getInteger(), "positionInTask", null, 0, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStartInteraction_StartOnEvent(), theM2Package.getExecutableEntity(), null, "startOnEvent", null, 0, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityStartInteraction_TimingTriggeringEntityStartCondition(), this.getTimingTriggeringEntityStartCondition(), null, "timingTriggeringEntityStartCondition", null, 0, 1, EntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingTriggeringEntityStartConditionEClass, TimingTriggeringEntityStartCondition.class, "TimingTriggeringEntityStartCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingTriggeringEntityStartCondition_Period(), theM2Package.getTimeValue(), "period", null, 1, 1, TimingTriggeringEntityStartCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEntityStartInteractionEClass, RunnableEntityStartInteraction.class, "RunnableEntityStartInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableEntityStartInteraction_SourceEvent(), theM2Package.getRteEvent(), null, "sourceEvent", null, 1, 1, RunnableEntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswSchedulableEntityStartInteractionEClass, BswSchedulableEntityStartInteraction.class, "BswSchedulableEntityStartInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswSchedulableEntityStartInteraction_SourceEvent(), theM2Package.getBswEvent(), null, "sourceEvent", null, 1, 1, BswSchedulableEntityStartInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityStartImplementationEClass, EntityStartImplementation.class, "EntityStartImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timingTriggeringEntityStartImplementationEClass, TimingTriggeringEntityStartImplementation.class, "TimingTriggeringEntityStartImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingTriggeringEntityStartImplementation_CyclePeriod(), theM2Package.getPositiveInteger(), "cyclePeriod", null, 1, 1, TimingTriggeringEntityStartImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingTriggeringEntityStartImplementation_StartOffset(), theM2Package.getInteger(), "startOffset", null, 1, 1, TimingTriggeringEntityStartImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimingTriggeringEntityStartImplementation__GetCycleOffset(), theM2Package.getInteger(), "getCycleOffset", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimingTriggeringEntityStartImplementation__RequiresCycleAdjust(), ecorePackage.getEBoolean(), "requiresCycleAdjust", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimingTriggeringEntityStartImplementation__RequiresStartOffsetAdjust(), ecorePackage.getEBoolean(), "requiresStartOffsetAdjust", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plainEntityStartImplementationEClass, PlainEntityStartImplementation.class, "PlainEntityStartImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startOffsetCounterImplementationEClass, StartOffsetCounterImplementation.class, "StartOffsetCounterImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartOffsetCounterImplementation_MaxCount(), theM2Package.getInteger(), "maxCount", null, 1, 1, StartOffsetCounterImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartOffsetCounterImplementation_Parent(), this.getEntityStarter(), this.getEntityStarter_StartOffsetCounterImplementation(), "parent", null, 1, 1, StartOffsetCounterImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cycleCounterImplementationEClass, CycleCounterImplementation.class, "CycleCounterImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCycleCounterImplementation_MaxCount(), theM2Package.getInteger(), "maxCount", null, 1, 1, CycleCounterImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCycleCounterImplementation_Parent(), this.getEntityStarter(), this.getEntityStarter_CycleCounterImplementation(), "parent", null, 1, 1, CycleCounterImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedEcuConfigurationEClass, GeneratedEcuConfiguration.class, "GeneratedEcuConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratedEcuConfiguration_GeneratedOsTask(), theEcucPackage.getOsTask(), null, "generatedOsTask", null, 0, -1, GeneratedEcuConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratedEcuConfiguration_GeneratedOsEvent(), theEcucPackage.getOsEvent(), null, "generatedOsEvent", null, 0, -1, GeneratedEcuConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratedEcuConfiguration_GeneratedOsSpinlock(), theEcucPackage.getOsSpinlock(), null, "generatedOsSpinlock", null, 0, -1, GeneratedEcuConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratedEcuConfiguration_GeneratedOsIocCommunication(), theEcucPackage.getOsIocCommunication(), null, "generatedOsIocCommunication", null, 0, -1, GeneratedEcuConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratedEcuConfiguration_GeneratedOsTrustedFunction(), theEcucPackage.getOsApplicationTrustedFunction(), null, "generatedOsTrustedFunction", null, 0, -1, GeneratedEcuConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });																																		
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";			
		addAnnotation
		  (getSender__HasMultipleReceivers(), 
		   source, 
		   new String[] {
			 "body", "getReceivers()->size() > 1"
		   });		
		addAnnotation
		  (getSender__GetReceivers(), 
		   source, 
		   new String[] {
			 "body", "self.sendInteraction.receiveInteraction.receiver->asOrderedSet()"
		   });		
		addAnnotation
		  (getSender__HasMultipleInternalEcuReceivers(), 
		   source, 
		   new String[] {
			 "body", "getInternalEcuReceivers()->size() > 1"
		   });		
		addAnnotation
		  (getSender__GetInternalEcuReceivers(), 
		   source, 
		   new String[] {
			 "body", "self.sendInteraction.receiveInteraction.getInternalEcuReceivers()\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getSender__GetExternalEcuReceivers(), 
		   source, 
		   new String[] {
			 "body", "self.sendInteraction.receiveInteraction.getExternalEcuReceivers()\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getSender__HasSendImplementation(), 
		   source, 
		   new String[] {
			 "body", "sendInteraction->exists(not implementation.oclIsUndefined())"
		   });		
		addAnnotation
		  (getInternalEcuSender__IsEventSemantics(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.isEventSemantics()"
		   });		
		addAnnotation
		  (getSendInteraction__GetInternalEcuSenders(), 
		   source, 
		   new String[] {
			 "body", "self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::InternalEcuSender)).oclAsType(interaction::InternalEcuSender)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getSendInteraction__GetExternalEcuSenders(), 
		   source, 
		   new String[] {
			 "body", "self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::ExternalEcuSender)).oclAsType(interaction::ExternalEcuSender)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getSendInteraction__IsInterCore(), 
		   source, 
		   new String[] {
			 "body", "let senderCores : Set(m2::Integer) = self.sender.getOwnerCore()->asOrderedSet(),\n\t\t\t\t\t\treceiverCores : Set(m2::Integer) = self.receiveInteraction.receiver.getOwnerCore()->asOrderedSet()\n\t\t\t\tin senderCores->symmetricDifference(receiverCores)->notEmpty()"
		   });		
		addAnnotation
		  (getSendInteraction__IsInterPartition(), 
		   source, 
		   new String[] {
			 "body", "let senderPartitions : Set(ecuc::EcucPartition) = self.sender.ownerPartition->asOrderedSet(),\n\t\t\t\t\t\treceiverPartitions : Set(ecuc::EcucPartition) = self.receiveInteraction.receiver.ownerPartition->asOrderedSet()\n\t\t\t\tin senderPartitions->symmetricDifference(receiverPartitions)->notEmpty()"
		   });		
		addAnnotation
		  (getReceiveInteraction__GetInternalEcuReceivers(), 
		   source, 
		   new String[] {
			 "body", "self.receiver\n\t\t\t\t\t->select(oclIsKindOf(interaction::InternalEcuReceiver)).oclAsType(interaction::InternalEcuReceiver)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getReceiveInteraction__GetExternalEcuReceivers(), 
		   source, 
		   new String[] {
			 "body", "self.receiver\n\t\t\t\t\t->select(oclIsKindOf(interaction::ExternalEcuReceiver)).oclAsType(interaction::ExternalEcuReceiver)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getReceiveInteraction__ReceivesInterCore(), 
		   source, 
		   new String[] {
			 "body", "self.sendInteraction->exists(isInterCore())"
		   });		
		addAnnotation
		  (getReceiveInteraction__ReceivesFromMultipleCores(), 
		   source, 
		   new String[] {
			 "body", "self.sendInteraction.sender.getOwnerCore()->asSet()->size() > 1"
		   });		
		addAnnotation
		  (getReceiver__HasMultipleSenders(), 
		   source, 
		   new String[] {
			 "body", "getSenders()->size() > 1"
		   });		
		addAnnotation
		  (getReceiver__GetSenders(), 
		   source, 
		   new String[] {
			 "body", "self.receiveInteraction.sendInteraction.sender\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getReceiver__GetInternalEcuSenders(), 
		   source, 
		   new String[] {
			 "body", "self.receiveInteraction.sendInteraction.getInternalEcuSenders()\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getReceiver__GetExternalEcuSenders(), 
		   source, 
		   new String[] {
			 "body", "self.receiveInteraction.sendInteraction.getExternalEcuSenders()\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__IsInvalidationEnabled(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.oclAsType(instance::RVariableDataInstanceInSwc).isInvalidationEnabled()"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__GetHandleInvalid(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInvalidationPolicy().handleInvalid"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__IsFilterEnabled(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.oclAsType(instance::RVariableDataInstanceInSwc).isFilterEnabled()"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__GetFilter(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getFilter()"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__IsAliveTimeoutEnabled(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.oclAsType(instance::RVariableDataInstanceInSwc).isAliveTimeoutEnabled()"
		   });		
		addAnnotation
		  (getInternalEcuReceiver__IsEventSemantics(), 
		   source, 
		   new String[] {
			 "body", "self.source.prototype.isEventSemantics()"
		   });		
		addAnnotation
		  (getSendImplementation__IsEventSemantics(), 
		   source, 
		   new String[] {
			 "body", "self.parent.getInternalEcuSenders()->any(true).isEventSemantics()"
		   });		
		addAnnotation
		  (getInteractionEnd__GetOwnerCore(), 
		   source, 
		   new String[] {
			 "body", "if self.ownerPartition.getOwnerCore().oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse self.ownerPartition.getOwnerCore()\n\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getComSendProxy__GetRequesterOsApplications(), 
		   source, 
		   new String[] {
			 "body", "self.interaction.requesterPartition.implOsApplication->asOrderedSet()"
		   });		
		addAnnotation
		  (getTimingTriggeringEntityStartImplementation__GetCycleOffset(), 
		   source, 
		   new String[] {
			 "body", "self.startOffset.mod(self.cyclePeriod)"
		   });		
		addAnnotation
		  (getTimingTriggeringEntityStartImplementation__RequiresCycleAdjust(), 
		   source, 
		   new String[] {
			 "body", "self.cyclePeriod > 1"
		   });		
		addAnnotation
		  (getTimingTriggeringEntityStartImplementation__RequiresStartOffsetAdjust(), 
		   source, 
		   new String[] {
			 "body", "self.startOffset > 0"
		   });	
	}

} //InteractionPackageImpl
