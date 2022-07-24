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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl.RtePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl;

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
public class ExPackageImpl extends EPackageImpl implements ExPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignmentTypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEcuSenderExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEcuReceiverExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStarterExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswSchedulableEntityExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeDeclarationGroupPrototypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEventExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comGroupSignalExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyDataInstanceConnectorExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataInstanceInCompositionExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalGroupExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataInstanceInSwcExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rVariableDataInstanceInSwcExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pVariableDataInstanceInSwcExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOperationInstanceInSwcExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverToSignalMappingExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverToSignalGroupMappingExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucPartitionExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataPrototypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicSwComponentTypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonqueuedSenderComSpecExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuMethodExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuScaleExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDataTypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationDataTypeExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveAreaExEClass = null;

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExPackageImpl() {
		super(eNS_URI, ExFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExPackage init() {
		if (isInited) return (ExPackage)EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI);

		// Obtain or create and register package
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theExPackage.createPackageContents();
		theRtePackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theEcucPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theExPackage.initializePackageContents();
		theRtePackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theEcucPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExPackage.eNS_URI, theExPackage);
		return theExPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValueEx() {
		return timeValueExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeValueEx__IsGreaterThanOrEquals__BigDecimal_BigDecimal() {
		return timeValueExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeValueEx__IsMultiplesOf__BigDecimal_BigDecimal() {
		return timeValueExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeValueEx__Subtract__BigDecimal_BigDecimal() {
		return timeValueExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignmentTypeEx() {
		return alignmentTypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlignmentTypeEx__GetMemoryMappingAlignment__String() {
		return alignmentTypeExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiverEx() {
		return receiverExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalEcuSenderEx() {
		return externalEcuSenderExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalEcuSenderEx_VariableDataInstanceInCompositionEx() {
		return (EReference)externalEcuSenderExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__RequiresRteFilter__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__RequiresRteInvalidation__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__RequiresRteInitialization__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__ProvidesComRxCallback__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__ProvidesComInvCallback__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__ProvidesComRxTOutCallback__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuSenderEx__ProvidesComCallback__ExternalEcuSender() {
		return externalEcuSenderExEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalEcuReceiverEx() {
		return externalEcuReceiverExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuReceiverEx__ProvidesComTxAndTxErrCallback__ExternalEcuReceiver() {
		return externalEcuReceiverExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalEcuReceiverEx__ProvidesComTxTOutCallback__ExternalEcuReceiver() {
		return externalEcuReceiverExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityStarterEx() {
		return entityStarterExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityStarterEx__GetTimingTriggeringEntityStartImplementations__EntityStarter() {
		return entityStarterExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswSchedulableEntityEx() {
		return bswSchedulableEntityExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswSchedulableEntityEx_ModeDeclarationGroupPrototypeEx() {
		return (EReference)bswSchedulableEntityExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswSchedulableEntityEx__GetUsingPartition__BswSchedulableEntity() {
		return bswSchedulableEntityExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswSchedulableEntityEx__GetCallRootBswSchedulableEntities__BswSchedulableEntity() {
		return bswSchedulableEntityExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswSchedulableEntityEx__GetMappedTasks__BswSchedulableEntity() {
		return bswSchedulableEntityExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswSchedulableEntityEx__GetCallerBswSchedulableEntities__BswSchedulableEntity() {
		return bswSchedulableEntityExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswSchedulableEntityEx__GetCallerBswSchedulableEntitiesByMode__BswSchedulableEntity() {
		return bswSchedulableEntityExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeDeclarationGroupPrototypeEx() {
		return modeDeclarationGroupPrototypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroupPrototypeEx_BswSchedulableEntityEx() {
		return (EReference)modeDeclarationGroupPrototypeExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartitionForManager__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartitionForUser__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartition__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetModeManagerBswSchedulableEntities__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetModeUserBswSchedulableEntities__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetParentBswModuleDescription__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeDeclarationGroupPrototypeEx__GetConnectedProvidedModePrototypes__ModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeExEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteEventEx() {
		return rteEventExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRteEventEx__GetRelatedEntityStarter__RteEvent() {
		return rteEventExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComGroupSignalEx() {
		return comGroupSignalExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComGroupSignalEx__GetImplementationRecordElement__ComGroupSignal() {
		return comGroupSignalExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComGroupSignalEx__GetImplementationArrayElement__ComGroupSignal() {
		return comGroupSignalExEClass.getEOperations().get(1);
	}

	public EClass getAssemblyDataInstanceConnectorEx() {
		return assemblyDataInstanceConnectorExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDataInstanceConnectorEx_VariableDataInstanceInCompositionEx() {
		return (EReference)assemblyDataInstanceConnectorExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssemblyDataInstanceConnectorEx__IsInterPartition__AssemblyDataInstanceConnector() {
		return assemblyDataInstanceConnectorExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataInstanceInCompositionEx() {
		return variableDataInstanceInCompositionExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInCompositionEx_ValueSpecificationEx() {
		return (EReference)variableDataInstanceInCompositionExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetPartition__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__InitAtDeclaration__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__InitAtStart__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__InitAtPartitionRestart__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetInitValueAsText__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetInitializationStrategy__VariableDataInstanceInSwc() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetSectionInitializationPolicy__VariableDataInstanceInSwc() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetInitValue__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetReceiverInitValue__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetSenderInitValue__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetSwAddrMethod__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetReceiverSwAddrMethod__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__GetSenderSwAddrMethod__VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInCompositionEx__EqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionExEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignalEx() {
		return comSignalExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalEx_SenderReceiverToSignalMappingEx() {
		return (EReference)comSignalExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalEx__IsSender__ComSignal() {
		return comSignalExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalEx__IsReceiver__ComSignal() {
		return comSignalExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalEx__GetVariableDataInstanceInCompositions__ComSignal() {
		return comSignalExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignalGroupEx() {
		return comSignalGroupExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalGroupEx_SenderReceiverToSignalGroupMappingEx() {
		return (EReference)comSignalGroupExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalGroupEx__IsSender__ComSignalGroup() {
		return comSignalGroupExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalGroupEx__IsReceiver__ComSignalGroup() {
		return comSignalGroupExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalGroupEx__GetVariableDataInstanceInCompositions__ComSignalGroup() {
		return comSignalGroupExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataInstanceInSwcEx() {
		return variableDataInstanceInSwcExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInSwcEx_AlignmentTypeEx() {
		return (EReference)variableDataInstanceInSwcExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwcEx__ProvidesInitValueConstant__VariableDataInstanceInSwc() {
		return variableDataInstanceInSwcExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwcEx__GetMemoryMappingAlignment__VariableDataInstanceInSwc() {
		return variableDataInstanceInSwcExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRVariableDataInstanceInSwcEx() {
		return rVariableDataInstanceInSwcExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwcEx__RequiresFilterVariable__RVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwcEx__RequiresFilterOldValueVariable__RVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwcEx__RequiresFilterOccurrenceVariable__RVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwcEx__ProvidesReadApi__RVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwcEx__ProvidesReceiveApi__RVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVariableDataInstanceInSwcEx() {
		return pVariableDataInstanceInSwcExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwcEx__ProvidesWriteApi__PVariableDataInstanceInSwc() {
		return pVariableDataInstanceInSwcExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwcEx__ProvidesInvalidateApi__PVariableDataInstanceInSwc() {
		return pVariableDataInstanceInSwcExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwcEx__ProvidesSendApi__PVariableDataInstanceInSwc() {
		return pVariableDataInstanceInSwcExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwcEx__ProvidesFeedbackApi__PVariableDataInstanceInSwc() {
		return pVariableDataInstanceInSwcExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROperationInstanceInSwcEx() {
		return rOperationInstanceInSwcExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getROperationInstanceInSwcEx__ProvidesCallApi__ROperationInstanceInSwc() {
		return rOperationInstanceInSwcExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverToSignalMappingEx() {
		return senderReceiverToSignalMappingExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSenderReceiverToSignalMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalMapping() {
		return senderReceiverToSignalMappingExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverToSignalGroupMappingEx() {
		return senderReceiverToSignalGroupMappingExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSenderReceiverToSignalGroupMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalGroupMapping() {
		return senderReceiverToSignalGroupMappingExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskEx() {
		return osTaskExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOsTaskEx__GetOwnerPartition__OsTask() {
		return osTaskExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucPartitionEx() {
		return ecucPartitionExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartitionEx__IsInMasterCore__EcucPartition() {
		return ecucPartitionExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartitionEx__IsMasterBswPartition__EcucPartition() {
		return ecucPartitionExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartitionEx__ProvidesRestartPartitionApi__EcucPartition() {
		return ecucPartitionExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartitionEx__ProvidesPartitionRestartingApi__EcucPartition() {
		return ecucPartitionExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataPrototypeEx() {
		return variableDataPrototypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__InitAtDeclaration__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__InitAtStart__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__InitAtPartitionRestart__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__GetInitializationStrategy__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__GetSectionInitializationPolicy__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataPrototypeEx__GetSwAddrMethod__VariableDataPrototype() {
		return variableDataPrototypeExEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicSwComponentTypeEx() {
		return atomicSwComponentTypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationEx() {
		return valueSpecificationExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__GetEndValueSpec__ValueSpecification() {
		return valueSpecificationExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__GetValueSpecAsText__ValueSpecification() {
		return valueSpecificationExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsForVALUE__ValueSpecification() {
		return valueSpecificationExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsForARRAY__ValueSpecification_ImplementationDataType() {
		return valueSpecificationExEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsForSTRUCTURE__ValueSpecification_ImplementationDataType() {
		return valueSpecificationExEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsForUNION__ValueSpecification_ImplementationDataType() {
		return valueSpecificationExEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsForDATA_REFERENCE__ValueSpecification() {
		return valueSpecificationExEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__IsValidValue__ValueSpecification_ImplementationDataType() {
		return valueSpecificationExEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationEx__EqualsInitValue__ValueSpecification_ValueSpecification() {
		return valueSpecificationExEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonqueuedSenderComSpecEx() {
		return nonqueuedSenderComSpecExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonqueuedSenderComSpecEx__HasValidInitValue__NonqueuedSenderComSpec() {
		return nonqueuedSenderComSpecExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuMethodEx() {
		return compuMethodExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompuMethodEx__ProvidesEnumConstant__CompuMethod() {
		return compuMethodExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuScaleEx() {
		return compuScaleExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompuScaleEx__ProvidesEnumConstant__CompuScale() {
		return compuScaleExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompuScaleEx__GetEnumLiteral__CompuScale() {
		return compuScaleExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDataTypeEx() {
		return applicationDataTypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationDataTypeEx__ProvidesUpperLowerLimitConstant__ApplicationDataType() {
		return applicationDataTypeExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationDataTypeEx() {
		return implementationDataTypeExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataTypeEx_CompuMethodEx() {
		return (EReference)implementationDataTypeExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataTypeEx__ProvidesTypeDefinition__ImplementationDataType() {
		return implementationDataTypeExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataTypeEx__ProvidesEnumConstant__ImplementationDataType_ApplicationDataType() {
		return implementationDataTypeExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataTypeEx__GetCompuMethod__ImplementationDataType_ApplicationDataType() {
		return implementationDataTypeExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveAreaEx() {
		return exclusiveAreaExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveAreaEx_BswSchedulableEntityEx() {
		return (EReference)exclusiveAreaExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveAreaEx__GetUsingPartitionsOfBswExclusiveArea__ExclusiveArea() {
		return exclusiveAreaExEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveAreaEx__ProvidesRteEnterExitApi__ExclusiveArea() {
		return exclusiveAreaExEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveAreaEx__ProvidesSchmEnterExitApi__ExclusiveArea() {
		return exclusiveAreaExEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExFactory getExFactory() {
		return (ExFactory)getEFactoryInstance();
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
		timeValueExEClass = createEClass(TIME_VALUE_EX);
		createEOperation(timeValueExEClass, TIME_VALUE_EX___IS_GREATER_THAN_OR_EQUALS__BIGDECIMAL_BIGDECIMAL);
		createEOperation(timeValueExEClass, TIME_VALUE_EX___IS_MULTIPLES_OF__BIGDECIMAL_BIGDECIMAL);
		createEOperation(timeValueExEClass, TIME_VALUE_EX___SUBTRACT__BIGDECIMAL_BIGDECIMAL);

		alignmentTypeExEClass = createEClass(ALIGNMENT_TYPE_EX);
		createEOperation(alignmentTypeExEClass, ALIGNMENT_TYPE_EX___GET_MEMORY_MAPPING_ALIGNMENT__STRING);

		atomicSwComponentTypeExEClass = createEClass(ATOMIC_SW_COMPONENT_TYPE_EX);

		valueSpecificationExEClass = createEClass(VALUE_SPECIFICATION_EX);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE);
		createEOperation(valueSpecificationExEClass, VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION);

		nonqueuedSenderComSpecExEClass = createEClass(NONQUEUED_SENDER_COM_SPEC_EX);
		createEOperation(nonqueuedSenderComSpecExEClass, NONQUEUED_SENDER_COM_SPEC_EX___HAS_VALID_INIT_VALUE__NONQUEUEDSENDERCOMSPEC);

		compuMethodExEClass = createEClass(COMPU_METHOD_EX);
		createEOperation(compuMethodExEClass, COMPU_METHOD_EX___PROVIDES_ENUM_CONSTANT__COMPUMETHOD);

		compuScaleExEClass = createEClass(COMPU_SCALE_EX);
		createEOperation(compuScaleExEClass, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE);
		createEOperation(compuScaleExEClass, COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE);

		applicationDataTypeExEClass = createEClass(APPLICATION_DATA_TYPE_EX);
		createEOperation(applicationDataTypeExEClass, APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE);

		implementationDataTypeExEClass = createEClass(IMPLEMENTATION_DATA_TYPE_EX);
		createEReference(implementationDataTypeExEClass, IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX);
		createEOperation(implementationDataTypeExEClass, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE);
		createEOperation(implementationDataTypeExEClass, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE);
		createEOperation(implementationDataTypeExEClass, IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE);

		exclusiveAreaExEClass = createEClass(EXCLUSIVE_AREA_EX);
		createEReference(exclusiveAreaExEClass, EXCLUSIVE_AREA_EX__BSW_SCHEDULABLE_ENTITY_EX);
		createEOperation(exclusiveAreaExEClass, EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA);
		createEOperation(exclusiveAreaExEClass, EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA);
		createEOperation(exclusiveAreaExEClass, EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA);

		senderReceiverToSignalMappingExEClass = createEClass(SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX);
		createEOperation(senderReceiverToSignalMappingExEClass, SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALMAPPING);

		senderReceiverToSignalGroupMappingExEClass = createEClass(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX);
		createEOperation(senderReceiverToSignalGroupMappingExEClass, SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALGROUPMAPPING);

		osTaskExEClass = createEClass(OS_TASK_EX);
		createEOperation(osTaskExEClass, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		comSignalExEClass = createEClass(COM_SIGNAL_EX);
		createEReference(comSignalExEClass, COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX);
		createEOperation(comSignalExEClass, COM_SIGNAL_EX___IS_SENDER__COMSIGNAL);
		createEOperation(comSignalExEClass, COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL);
		createEOperation(comSignalExEClass, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);

		comSignalGroupExEClass = createEClass(COM_SIGNAL_GROUP_EX);
		createEReference(comSignalGroupExEClass, COM_SIGNAL_GROUP_EX__SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX);
		createEOperation(comSignalGroupExEClass, COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP);
		createEOperation(comSignalGroupExEClass, COM_SIGNAL_GROUP_EX___IS_RECEIVER__COMSIGNALGROUP);
		createEOperation(comSignalGroupExEClass, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);

		ecucPartitionExEClass = createEClass(ECUC_PARTITION_EX);
		createEOperation(ecucPartitionExEClass, ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION);
		createEOperation(ecucPartitionExEClass, ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION);
		createEOperation(ecucPartitionExEClass, ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION);
		createEOperation(ecucPartitionExEClass, ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION);

		variableDataPrototypeExEClass = createEClass(VARIABLE_DATA_PROTOTYPE_EX);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE);
		createEOperation(variableDataPrototypeExEClass, VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE);

		variableDataInstanceInCompositionExEClass = createEClass(VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX);
		createEReference(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE_AS_TEXT__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAINSTANCEINSWC);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAINSTANCEINSWC);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION);
		createEOperation(variableDataInstanceInCompositionExEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___EQUALS_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION_VARIABLEDATAINSTANCEINCOMPOSITION);

		variableDataInstanceInSwcExEClass = createEClass(VARIABLE_DATA_INSTANCE_IN_SWC_EX);
		createEReference(variableDataInstanceInSwcExEClass, VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX);
		createEOperation(variableDataInstanceInSwcExEClass, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC);
		createEOperation(variableDataInstanceInSwcExEClass, VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC);

		pVariableDataInstanceInSwcExEClass = createEClass(PVARIABLE_DATA_INSTANCE_IN_SWC_EX);
		createEOperation(pVariableDataInstanceInSwcExEClass, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC);
		createEOperation(pVariableDataInstanceInSwcExEClass, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC);
		createEOperation(pVariableDataInstanceInSwcExEClass, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC);
		createEOperation(pVariableDataInstanceInSwcExEClass, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC);

		rVariableDataInstanceInSwcExEClass = createEClass(RVARIABLE_DATA_INSTANCE_IN_SWC_EX);
		createEOperation(rVariableDataInstanceInSwcExEClass, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC);
		createEOperation(rVariableDataInstanceInSwcExEClass, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC);
		createEOperation(rVariableDataInstanceInSwcExEClass, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OCCURRENCE_VARIABLE__RVARIABLEDATAINSTANCEINSWC);
		createEOperation(rVariableDataInstanceInSwcExEClass, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC);
		createEOperation(rVariableDataInstanceInSwcExEClass, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC);

		rOperationInstanceInSwcExEClass = createEClass(ROPERATION_INSTANCE_IN_SWC_EX);
		createEOperation(rOperationInstanceInSwcExEClass, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC);

		assemblyDataInstanceConnectorExEClass = createEClass(ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX);
		createEReference(assemblyDataInstanceConnectorExEClass, ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX);
		createEOperation(assemblyDataInstanceConnectorExEClass, ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX___IS_INTER_PARTITION__ASSEMBLYDATAINSTANCECONNECTOR);

		receiverExEClass = createEClass(RECEIVER_EX);

		externalEcuSenderExEClass = createEClass(EXTERNAL_ECU_SENDER_EX);
		createEReference(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_CALLBACK__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INV_CALLBACK__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_TOUT_CALLBACK__EXTERNALECUSENDER);
		createEOperation(externalEcuSenderExEClass, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER);

		externalEcuReceiverExEClass = createEClass(EXTERNAL_ECU_RECEIVER_EX);
		createEOperation(externalEcuReceiverExEClass, EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_AND_TX_ERR_CALLBACK__EXTERNALECURECEIVER);
		createEOperation(externalEcuReceiverExEClass, EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_TOUT_CALLBACK__EXTERNALECURECEIVER);

		entityStarterExEClass = createEClass(ENTITY_STARTER_EX);
		createEOperation(entityStarterExEClass, ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER);

		bswSchedulableEntityExEClass = createEClass(BSW_SCHEDULABLE_ENTITY_EX);
		createEReference(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX);
		createEOperation(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY);
		createEOperation(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX___GET_CALL_ROOT_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY);
		createEOperation(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY);
		createEOperation(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY);
		createEOperation(bswSchedulableEntityExEClass, BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY);

		modeDeclarationGroupPrototypeExEClass = createEClass(MODE_DECLARATION_GROUP_PROTOTYPE_EX);
		createEReference(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX__BSW_SCHEDULABLE_ENTITY_EX);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_USER__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_MANAGER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_USER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_PARENT_BSW_MODULE_DESCRIPTION__MODEDECLARATIONGROUPPROTOTYPE);
		createEOperation(modeDeclarationGroupPrototypeExEClass, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_CONNECTED_PROVIDED_MODE_PROTOTYPES__MODEDECLARATIONGROUPPROTOTYPE);

		rteEventExEClass = createEClass(RTE_EVENT_EX);
		createEOperation(rteEventExEClass, RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT);

		comGroupSignalExEClass = createEClass(COM_GROUP_SIGNAL_EX);
		createEOperation(comGroupSignalExEClass, COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_RECORD_ELEMENT__COMGROUPSIGNAL);
		createEOperation(comGroupSignalExEClass, COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_ARRAY_ELEMENT__COMGROUPSIGNAL);
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
		EcucPackage theEcucPackage = (EcucPackage)EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(timeValueExEClass, TimeValueEx.class, "TimeValueEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTimeValueEx__IsGreaterThanOrEquals__BigDecimal_BigDecimal(), ecorePackage.getEBoolean(), "isGreaterThanOrEquals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "another", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeValueEx__IsMultiplesOf__BigDecimal_BigDecimal(), ecorePackage.getEBoolean(), "isMultiplesOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "another", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeValueEx__Subtract__BigDecimal_BigDecimal(), theM2Package.getTimeValue(), "subtract", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getTimeValue(), "another", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alignmentTypeExEClass, AlignmentTypeEx.class, "AlignmentTypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAlignmentTypeEx__GetMemoryMappingAlignment__String(), theM2Package.getAlignmentType(), "getMemoryMappingAlignment", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getAlignmentType(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(atomicSwComponentTypeExEClass, AtomicSwComponentTypeEx.class, "AtomicSwComponentTypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSpecificationExEClass, ValueSpecificationEx.class, "ValueSpecificationEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getValueSpecificationEx__GetEndValueSpec__ValueSpecification(), theM2Package.getValueSpecification(), "getEndValueSpec", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__GetValueSpecAsText__ValueSpecification(), theM2Package.getString(), "getValueSpecAsText", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsForVALUE__ValueSpecification(), ecorePackage.getEBoolean(), "isForVALUE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsForARRAY__ValueSpecification_ImplementationDataType(), ecorePackage.getEBoolean(), "isForARRAY", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsForSTRUCTURE__ValueSpecification_ImplementationDataType(), ecorePackage.getEBoolean(), "isForSTRUCTURE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsForUNION__ValueSpecification_ImplementationDataType(), ecorePackage.getEBoolean(), "isForUNION", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsForDATA_REFERENCE__ValueSpecification(), ecorePackage.getEBoolean(), "isForDATA_REFERENCE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__IsValidValue__ValueSpecification_ImplementationDataType(), ecorePackage.getEBoolean(), "isValidValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationEx__EqualsInitValue__ValueSpecification_ValueSpecification(), ecorePackage.getEBoolean(), "equalsInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "v1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getValueSpecification(), "v2", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nonqueuedSenderComSpecExEClass, NonqueuedSenderComSpecEx.class, "NonqueuedSenderComSpecEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNonqueuedSenderComSpecEx__HasValidInitValue__NonqueuedSenderComSpec(), ecorePackage.getEBoolean(), "hasValidInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getNonqueuedSenderComSpec(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compuMethodExEClass, CompuMethodEx.class, "CompuMethodEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCompuMethodEx__ProvidesEnumConstant__CompuMethod(), ecorePackage.getEBoolean(), "providesEnumConstant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getCompuMethod(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compuScaleExEClass, CompuScaleEx.class, "CompuScaleEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCompuScaleEx__ProvidesEnumConstant__CompuScale(), ecorePackage.getEBoolean(), "providesEnumConstant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getCompuScale(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompuScaleEx__GetEnumLiteral__CompuScale(), theM2Package.getCIdentifier(), "getEnumLiteral", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getCompuScale(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationDataTypeExEClass, ApplicationDataTypeEx.class, "ApplicationDataTypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApplicationDataTypeEx__ProvidesUpperLowerLimitConstant__ApplicationDataType(), ecorePackage.getEBoolean(), "providesUpperLowerLimitConstant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getApplicationDataType(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementationDataTypeExEClass, ImplementationDataTypeEx.class, "ImplementationDataTypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationDataTypeEx_CompuMethodEx(), this.getCompuMethodEx(), null, "compuMethodEx", null, 1, 1, ImplementationDataTypeEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getImplementationDataTypeEx__ProvidesTypeDefinition__ImplementationDataType(), ecorePackage.getEBoolean(), "providesTypeDefinition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImplementationDataTypeEx__ProvidesEnumConstant__ImplementationDataType_ApplicationDataType(), ecorePackage.getEBoolean(), "providesEnumConstant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getApplicationDataType(), "applicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImplementationDataTypeEx__GetCompuMethod__ImplementationDataType_ApplicationDataType(), theM2Package.getCompuMethod(), "getCompuMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getImplementationDataType(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getApplicationDataType(), "applicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exclusiveAreaExEClass, ExclusiveAreaEx.class, "ExclusiveAreaEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusiveAreaEx_BswSchedulableEntityEx(), this.getBswSchedulableEntityEx(), null, "bswSchedulableEntityEx", null, 1, 1, ExclusiveAreaEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExclusiveAreaEx__GetUsingPartitionsOfBswExclusiveArea__ExclusiveArea(), theEcucPackage.getEcucPartition(), "getUsingPartitionsOfBswExclusiveArea", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getExclusiveArea(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExclusiveAreaEx__ProvidesRteEnterExitApi__ExclusiveArea(), ecorePackage.getEBoolean(), "providesRteEnterExitApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getExclusiveArea(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExclusiveAreaEx__ProvidesSchmEnterExitApi__ExclusiveArea(), ecorePackage.getEBoolean(), "providesSchmEnterExitApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getExclusiveArea(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(senderReceiverToSignalMappingExEClass, SenderReceiverToSignalMappingEx.class, "SenderReceiverToSignalMappingEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSenderReceiverToSignalMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalMapping(), theInstancePackage.getVariableDataInstanceInComposition(), "getMappedDataInstanceInComposition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getSenderReceiverToSignalMapping(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(senderReceiverToSignalGroupMappingExEClass, SenderReceiverToSignalGroupMappingEx.class, "SenderReceiverToSignalGroupMappingEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSenderReceiverToSignalGroupMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalGroupMapping(), theInstancePackage.getVariableDataInstanceInComposition(), "getMappedDataInstanceInComposition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getSenderReceiverToSignalGroupMapping(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(osTaskExEClass, OsTaskEx.class, "OsTaskEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOsTaskEx__GetOwnerPartition__OsTask(), theEcucPackage.getEcucPartition(), "getOwnerPartition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getOsTask(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comSignalExEClass, ComSignalEx.class, "ComSignalEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSignalEx_SenderReceiverToSignalMappingEx(), this.getSenderReceiverToSignalMappingEx(), null, "senderReceiverToSignalMappingEx", null, 1, 1, ComSignalEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComSignalEx__IsSender__ComSignal(), ecorePackage.getEBoolean(), "isSender", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignal(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComSignalEx__IsReceiver__ComSignal(), ecorePackage.getEBoolean(), "isReceiver", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignal(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComSignalEx__GetVariableDataInstanceInCompositions__ComSignal(), theInstancePackage.getVariableDataInstanceInComposition(), "getVariableDataInstanceInCompositions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignal(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comSignalGroupExEClass, ComSignalGroupEx.class, "ComSignalGroupEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSignalGroupEx_SenderReceiverToSignalGroupMappingEx(), this.getSenderReceiverToSignalGroupMappingEx(), null, "senderReceiverToSignalGroupMappingEx", null, 1, 1, ComSignalGroupEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComSignalGroupEx__IsSender__ComSignalGroup(), ecorePackage.getEBoolean(), "isSender", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignalGroup(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComSignalGroupEx__IsReceiver__ComSignalGroup(), ecorePackage.getEBoolean(), "isReceiver", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignalGroup(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComSignalGroupEx__GetVariableDataInstanceInCompositions__ComSignalGroup(), theInstancePackage.getVariableDataInstanceInComposition(), "getVariableDataInstanceInCompositions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcucPackage.getComSignalGroup(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ecucPartitionExEClass, EcucPartitionEx.class, "EcucPartitionEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEcucPartitionEx__IsInMasterCore__EcucPartition(), ecorePackage.getEBoolean(), "isInMasterCore", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getEcucPartition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcucPartitionEx__IsMasterBswPartition__EcucPartition(), ecorePackage.getEBoolean(), "isMasterBswPartition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getEcucPartition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcucPartitionEx__ProvidesRestartPartitionApi__EcucPartition(), ecorePackage.getEBoolean(), "providesRestartPartitionApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getEcucPartition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcucPartitionEx__ProvidesPartitionRestartingApi__EcucPartition(), ecorePackage.getEBoolean(), "providesPartitionRestartingApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcucPackage.getEcucPartition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableDataPrototypeExEClass, VariableDataPrototypeEx.class, "VariableDataPrototypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getVariableDataPrototypeEx__InitAtDeclaration__VariableDataPrototype(), ecorePackage.getEBoolean(), "initAtDeclaration", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataPrototypeEx__InitAtStart__VariableDataPrototype(), ecorePackage.getEBoolean(), "initAtStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataPrototypeEx__InitAtPartitionRestart__VariableDataPrototype(), ecorePackage.getEBoolean(), "initAtPartitionRestart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataPrototypeEx__GetInitializationStrategy__VariableDataPrototype(), theEcucPackage.getRteInitializationStrategyEnum(), "getInitializationStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataPrototypeEx__GetSectionInitializationPolicy__VariableDataPrototype(), theM2Package.getString(), "getSectionInitializationPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataPrototypeEx__GetSwAddrMethod__VariableDataPrototype(), theM2Package.getSwAddrMethod(), "getSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getVariableDataPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableDataInstanceInCompositionExEClass, VariableDataInstanceInCompositionEx.class, "VariableDataInstanceInCompositionEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataInstanceInCompositionEx_ValueSpecificationEx(), this.getValueSpecificationEx(), null, "valueSpecificationEx", null, 1, 1, VariableDataInstanceInCompositionEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetPartition__VariableDataInstanceInComposition(), theEcucPackage.getEcucPartition(), "getPartition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__InitAtDeclaration__VariableDataInstanceInComposition(), ecorePackage.getEBoolean(), "initAtDeclaration", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__InitAtStart__VariableDataInstanceInComposition(), ecorePackage.getEBoolean(), "initAtStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__InitAtPartitionRestart__VariableDataInstanceInComposition(), ecorePackage.getEBoolean(), "initAtPartitionRestart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetInitValueAsText__VariableDataInstanceInComposition(), theM2Package.getString(), "getInitValueAsText", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetInitializationStrategy__VariableDataInstanceInSwc(), theEcucPackage.getRteInitializationStrategyEnum(), "getInitializationStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetSectionInitializationPolicy__VariableDataInstanceInSwc(), theM2Package.getString(), "getSectionInitializationPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetInitValue__VariableDataInstanceInComposition(), theM2Package.getValueSpecification(), "getInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetReceiverInitValue__VariableDataInstanceInComposition(), theM2Package.getValueSpecification(), "getReceiverInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetSenderInitValue__VariableDataInstanceInComposition(), theM2Package.getValueSpecification(), "getSenderInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetSwAddrMethod__VariableDataInstanceInComposition(), theM2Package.getSwAddrMethod(), "getSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetReceiverSwAddrMethod__VariableDataInstanceInComposition(), theM2Package.getSwAddrMethod(), "getReceiverSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__GetSenderSwAddrMethod__VariableDataInstanceInComposition(), theM2Package.getSwAddrMethod(), "getSenderSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInCompositionEx__EqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition(), ecorePackage.getEBoolean(), "equalsInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "v1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInComposition(), "v2", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableDataInstanceInSwcExEClass, VariableDataInstanceInSwcEx.class, "VariableDataInstanceInSwcEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataInstanceInSwcEx_AlignmentTypeEx(), this.getAlignmentTypeEx(), null, "alignmentTypeEx", null, 1, 1, VariableDataInstanceInSwcEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInSwcEx__ProvidesInitValueConstant__VariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesInitValueConstant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableDataInstanceInSwcEx__GetMemoryMappingAlignment__VariableDataInstanceInSwc(), theM2Package.getAlignmentType(), "getMemoryMappingAlignment", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pVariableDataInstanceInSwcExEClass, PVariableDataInstanceInSwcEx.class, "PVariableDataInstanceInSwcEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPVariableDataInstanceInSwcEx__ProvidesWriteApi__PVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesWriteApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getPVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPVariableDataInstanceInSwcEx__ProvidesInvalidateApi__PVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesInvalidateApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getPVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPVariableDataInstanceInSwcEx__ProvidesSendApi__PVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesSendApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getPVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPVariableDataInstanceInSwcEx__ProvidesFeedbackApi__PVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesFeedbackApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getPVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rVariableDataInstanceInSwcExEClass, RVariableDataInstanceInSwcEx.class, "RVariableDataInstanceInSwcEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRVariableDataInstanceInSwcEx__RequiresFilterVariable__RVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "requiresFilterVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getRVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRVariableDataInstanceInSwcEx__RequiresFilterOldValueVariable__RVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "requiresFilterOldValueVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getRVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRVariableDataInstanceInSwcEx__RequiresFilterOccurrenceVariable__RVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "requiresFilterOccurrenceVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getRVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRVariableDataInstanceInSwcEx__ProvidesReadApi__RVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesReadApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getRVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRVariableDataInstanceInSwcEx__ProvidesReceiveApi__RVariableDataInstanceInSwc(), ecorePackage.getEBoolean(), "providesReceiveApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getRVariableDataInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rOperationInstanceInSwcExEClass, ROperationInstanceInSwcEx.class, "ROperationInstanceInSwcEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getROperationInstanceInSwcEx__ProvidesCallApi__ROperationInstanceInSwc(), ecorePackage.getEBoolean(), "providesCallApi", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getROperationInstanceInSwc(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assemblyDataInstanceConnectorExEClass, AssemblyDataInstanceConnectorEx.class, "AssemblyDataInstanceConnectorEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyDataInstanceConnectorEx_VariableDataInstanceInCompositionEx(), this.getVariableDataInstanceInCompositionEx(), null, "variableDataInstanceInCompositionEx", null, 1, 1, AssemblyDataInstanceConnectorEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssemblyDataInstanceConnectorEx__IsInterPartition__AssemblyDataInstanceConnector(), ecorePackage.getEBoolean(), "isInterPartition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInstancePackage.getAssemblyDataInstanceConnector(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receiverExEClass, ReceiverEx.class, "ReceiverEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalEcuSenderExEClass, ExternalEcuSenderEx.class, "ExternalEcuSenderEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalEcuSenderEx_VariableDataInstanceInCompositionEx(), this.getVariableDataInstanceInCompositionEx(), null, "variableDataInstanceInCompositionEx", null, 1, 1, ExternalEcuSenderEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__RequiresRteFilter__ExternalEcuSender(), ecorePackage.getEBoolean(), "requiresRteFilter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__RequiresRteInvalidation__ExternalEcuSender(), ecorePackage.getEBoolean(), "requiresRteInvalidation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__RequiresRteInitialization__ExternalEcuSender(), ecorePackage.getEBoolean(), "requiresRteInitialization", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__ProvidesComRxCallback__ExternalEcuSender(), ecorePackage.getEBoolean(), "providesComRxCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__ProvidesComInvCallback__ExternalEcuSender(), ecorePackage.getEBoolean(), "providesComInvCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__ProvidesComRxTOutCallback__ExternalEcuSender(), ecorePackage.getEBoolean(), "providesComRxTOutCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuSenderEx__ProvidesComCallback__ExternalEcuSender(), ecorePackage.getEBoolean(), "providesComCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuSender(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalEcuReceiverExEClass, ExternalEcuReceiverEx.class, "ExternalEcuReceiverEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExternalEcuReceiverEx__ProvidesComTxAndTxErrCallback__ExternalEcuReceiver(), ecorePackage.getEBoolean(), "providesComTxAndTxErrCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuReceiver(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExternalEcuReceiverEx__ProvidesComTxTOutCallback__ExternalEcuReceiver(), ecorePackage.getEBoolean(), "providesComTxTOutCallback", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInteractionPackage.getExternalEcuReceiver(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityStarterExEClass, EntityStarterEx.class, "EntityStarterEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEntityStarterEx__GetTimingTriggeringEntityStartImplementations__EntityStarter(), theInteractionPackage.getTimingTriggeringEntityStartImplementation(), "getTimingTriggeringEntityStartImplementations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theInteractionPackage.getEntityStarter(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bswSchedulableEntityExEClass, BswSchedulableEntityEx.class, "BswSchedulableEntityEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswSchedulableEntityEx_ModeDeclarationGroupPrototypeEx(), this.getModeDeclarationGroupPrototypeEx(), null, "modeDeclarationGroupPrototypeEx", null, 1, 1, BswSchedulableEntityEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBswSchedulableEntityEx__GetUsingPartition__BswSchedulableEntity(), theEcucPackage.getEcucPartition(), "getUsingPartition", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getBswSchedulableEntity(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBswSchedulableEntityEx__GetCallRootBswSchedulableEntities__BswSchedulableEntity(), theM2Package.getBswSchedulableEntity(), "getCallRootBswSchedulableEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getBswSchedulableEntity(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBswSchedulableEntityEx__GetMappedTasks__BswSchedulableEntity(), theEcucPackage.getOsTask(), "getMappedTasks", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getBswSchedulableEntity(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBswSchedulableEntityEx__GetCallerBswSchedulableEntities__BswSchedulableEntity(), theM2Package.getBswSchedulableEntity(), "getCallerBswSchedulableEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getBswSchedulableEntity(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBswSchedulableEntityEx__GetCallerBswSchedulableEntitiesByMode__BswSchedulableEntity(), theM2Package.getBswSchedulableEntity(), "getCallerBswSchedulableEntitiesByMode", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getBswSchedulableEntity(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modeDeclarationGroupPrototypeExEClass, ModeDeclarationGroupPrototypeEx.class, "ModeDeclarationGroupPrototypeEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeDeclarationGroupPrototypeEx_BswSchedulableEntityEx(), this.getBswSchedulableEntityEx(), null, "bswSchedulableEntityEx", null, 1, 1, ModeDeclarationGroupPrototypeEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetUsingPartitionForManager__ModeDeclarationGroupPrototype(), theEcucPackage.getEcucPartition(), "getUsingPartitionForManager", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetUsingPartitionForUser__ModeDeclarationGroupPrototype(), theEcucPackage.getEcucPartition(), "getUsingPartitionForUser", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetUsingPartition__ModeDeclarationGroupPrototype(), theEcucPackage.getEcucPartition(), "getUsingPartition", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetModeManagerBswSchedulableEntities__ModeDeclarationGroupPrototype(), theM2Package.getBswSchedulableEntity(), "getModeManagerBswSchedulableEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetModeUserBswSchedulableEntities__ModeDeclarationGroupPrototype(), theM2Package.getBswSchedulableEntity(), "getModeUserBswSchedulableEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetParentBswModuleDescription__ModeDeclarationGroupPrototype(), theM2Package.getBswModuleDescription(), "getParentBswModuleDescription", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeDeclarationGroupPrototypeEx__GetConnectedProvidedModePrototypes__ModeDeclarationGroupPrototype(), theM2Package.getModeDeclarationGroupPrototype(), "getConnectedProvidedModePrototypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theM2Package.getModeDeclarationGroupPrototype(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rteEventExEClass, RteEventEx.class, "RteEventEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRteEventEx__GetRelatedEntityStarter__RteEvent(), theInteractionPackage.getEntityStarter(), "getRelatedEntityStarter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theM2Package.getRteEvent(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comGroupSignalExEClass, ComGroupSignalEx.class, "ComGroupSignalEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getComGroupSignalEx__GetImplementationRecordElement__ComGroupSignal(), theM2Package.getImplementationDataTypeElement(), "getImplementationRecordElement", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcucPackage.getComGroupSignal(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComGroupSignalEx__GetImplementationArrayElement__ComGroupSignal(), theM2Package.getImplementationDataTypeElement(), "getImplementationArrayElement", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcucPackage.getComGroupSignal(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// stereotypes
		createStereotypesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>stereotypes</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStereotypesAnnotations() {
		String source = "stereotypes";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "extension", "true"
		   });																																																																																																																																																							
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
		  (getValueSpecificationEx__GetEndValueSpec__ValueSpecification(), 
		   source, 
		   new String[] {
			 "body", "if this_.oclIsKindOf(m2::ConstantReference)\n\t\t\t\t\t\tthen this_.oclAsType(m2::ConstantReference).getEndValueSpec()\n\t\t\t\t\telse this_\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getValueSpecificationEx__GetValueSpecAsText__ValueSpecification(), 
		   source, 
		   new String[] {
			 "body", "let endValueSpec : m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin if endValueSpec.oclIsKindOf(ar4x::m2::NumericalValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::NumericalValueSpecification).value.toString()\n\t\t\t\t\telse if endValueSpec.oclIsKindOf(ar4x::m2::TextValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::TextValueSpecification).value\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsForVALUE__ValueSpecification(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification) or end.oclIsKindOf(ar4x::m2::TextValueSpecification)"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsForARRAY__ValueSpecification_ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::ArrayValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->size() = type.subElement->first().arraySize\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->forAll(v | isForVALUE(v))"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsForSTRUCTURE__ValueSpecification_ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = type.subElement->size()\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->forAll(v | isForVALUE(v))"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsForUNION__ValueSpecification_ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = 1\n\t\t\t\tand\n\t\t\t\tisForVALUE(end.oclAsType(ar4x::m2::RecordValueSpecification).field->first())"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsForDATA_REFERENCE__ValueSpecification(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification)"
		   });		
		addAnnotation
		  (getValueSpecificationEx__IsValidValue__ValueSpecification_ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif type.category = \'VALUE\' then\n\t\t\t\t\tisForVALUE(value)\n\t\t\t\telse if type.category = \'ARRAY\' then\n\t\t\t\t\tisForARRAY(value, type)\n\t\t\t\telse if type.category = \'STRUCTURE\' then\n\t\t\t\t\tisForSTRUCTURE(value, type)\n\t\t\t\telse if type.category = \'UNION\' then\n\t\t\t\t\tisForUNION(value, type)\n\t\t\t\telse if type.category = \'DATA_REFERENCE\' then\n\t\t\t\t\tisForDATA_REFERENCE(value)\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif endif endif endif endif"
		   });		
		addAnnotation
		  (getValueSpecificationEx__EqualsInitValue__ValueSpecification_ValueSpecification(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet endV1 : ar4x::m2::ValueSpecification = getEndValueSpec(v1),\n\t\t\t\t\tendV2 : ar4x::m2::ValueSpecification = getEndValueSpec(v2)\n\t\t\t\tin\n\t\t\t\tif endV1.oclIsTypeOf(ar4x::m2::ArrayValueSpecification) then\n\t\t\t\t\tlet arrayV1 : ar4x::m2::ArrayValueSpecification = endV1.oclAsType(ar4x::m2::ArrayValueSpecification),\n\t\t\t\t\t\tarrayV2 : ar4x::m2::ArrayValueSpecification = endV2.oclAsType(ar4x::m2::ArrayValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif arrayV1.element->size() <> arrayV2.element->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(arrayV1.element->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(arrayV1.element->at(i), arrayV2.element->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse if endV1.oclIsTypeOf(ar4x::m2::RecordValueSpecification) then\n\t\t\t\t\tlet recV1 : ar4x::m2::RecordValueSpecification = endV1.oclAsType(ar4x::m2::RecordValueSpecification),\n\t\t\t\t\t\trecV2 : ar4x::m2::RecordValueSpecification = endV2.oclAsType(ar4x::m2::RecordValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif recV1.field->size() <> recV2.field->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(recV1.field->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(recV1.field->at(i), recV2.field->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tgetValueSpecAsText(endV1) = getValueSpecAsText(endV2)\n\t\t\t\tendif endif"
		   });		
		addAnnotation
		  (getNonqueuedSenderComSpecEx__HasValidInitValue__NonqueuedSenderComSpec(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif this_.initValue.oclIsUndefined() then\n\t\t\t\t\tfalse\n\t\t\t\telse if this_.dataElement.type.oclIsTypeOf(ar4x::m2::ImplementationDataType) then\n\t\t\t\t\tlet type : ar4x::m2::ImplementationDataType = this_.dataElement.type.oclAsType(ar4x::m2::ImplementationDataType)\n\t\t\t\t\tin\n\t\t\t\t\tif type.category = \'VALUE\' then\n\t\t\t\t\t\tValueSpecificationEx::isForVALUE(this_.initValue)\n\t\t\t\t\telse if type.category = \'ARRAY\' then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if type.category = \'STRUCTURE\' then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if type.category = \'UNION\' then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if type.category = \'DATA_REFERENCE\' then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if type.category = \'TYPE_REFERENCE\' then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif endif endif endif endif endif\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif endif"
		   });		
		addAnnotation
		  (getCompuMethodEx__ProvidesEnumConstant__CompuMethod(), 
		   source, 
		   new String[] {
			 "body", "Set{\'TEXTTABLE\', \'SCALE_LINEAR_AND_TEXTTABLE\', \'SCALE_RATIONAL_AND_TEXTTABLE\'}\n\t\t\t\t\t->includes(this_.category) and not this_.compuInternalToPhys.oclIsUndefined()"
		   });		
		addAnnotation
		  (getCompuScaleEx__ProvidesEnumConstant__CompuScale(), 
		   source, 
		   new String[] {
			 "body", "not this_.lowerLimit.oclIsUndefined() and not this_.upperLimit.oclIsUndefined() and this_.lowerLimit.value =\n\t\t\t\t\tthis_.upperLimit.value"
		   });		
		addAnnotation
		  (getCompuScaleEx__GetEnumLiteral__CompuScale(), 
		   source, 
		   new String[] {
			 "body", "if not this_.symbol.oclIsUndefined()\n\t\t\t\t\t\tthen this_.symbol\n\t\t\t\t\telse if not this_.compuConst.vt.oclIsUndefined()\n\t\t\t\t\t\tthen this_.compuConst.vt\n\t\t\t\t\telse if not this_.shortLabel.oclIsUndefined()\n\t\t\t\t\t\tthen this_.shortLabel\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif"
		   });		
		addAnnotation
		  (getApplicationDataTypeEx__ProvidesUpperLowerLimitConstant__ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "not this_.dataConstr.getUpperLimitValue().oclIsUndefined() and not\n\t\t\t\t\tthis_.dataConstr.getLowerLimitValue().oclIsUndefined()"
		   });		
		addAnnotation
		  (getImplementationDataTypeEx__ProvidesTypeDefinition__ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "if this_.baseType.oclIsUndefined()\n\t\t\t\t\t then true\n\t\t\t\t\telse not this_.baseType.nativeDeclaration.oclIsUndefined()\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getImplementationDataTypeEx__ProvidesEnumConstant__ImplementationDataType_ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "let compuMethod : m2::CompuMethod = getCompuMethod(this_, applicationDataType)\n\t\t\t\tin if compuMethod.oclIsUndefined()\n\t\t\t\t\tthen false\n\t\t\t\t\telse compuMethodEx.providesEnumConstant(compuMethod)\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getImplementationDataTypeEx__GetCompuMethod__ImplementationDataType_ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "if not applicationDataType.compuMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applicationDataType.compuMethod\n\t\t\t\t\telse if not this_.compuMethod.oclIsUndefined()\n\t\t\t\t\t\tthen this_.compuMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getExclusiveAreaEx__GetUsingPartitionsOfBswExclusiveArea__ExclusiveArea(), 
		   source, 
		   new String[] {
			 "body", "let bswInternalBehavior : ar4x::m2::BswInternalBehavior = this_.parent.oclAsType(ar4x::m2::BswInternalBehavior)\n\t\t\t\t\t\tin\n\t\t\t\t\t\tbswInternalBehavior.bswSchedulableEntity->select(canEnterExclusiveArea->includes(this_))\n\t\t\t\t\t\t->union(bswInternalBehavior.bswSchedulableEntity->select(runsInsideExclusiveArea->includes(this_)))\n\t\t\t\t\t\t->collect(m | bswSchedulableEntityEx.getUsingPartition(m))->asSet()",
			 "pre", "this_.parent.oclIsKindOf(ar4x::m2::BswInternalBehavior)"
		   });			
		addAnnotation
		  (getExclusiveAreaEx__ProvidesRteEnterExitApi__ExclusiveArea(), 
		   source, 
		   new String[] {
			 "body", "this_.parent.oclAsType(ar4x::m2::SwcInternalBehavior).runnable.canEnterExclusiveArea->includes(this_)",
			 "pre", "this_.parent.oclIsKindOf(ar4x::m2::SwcInternalBehavior)"
		   });			
		addAnnotation
		  (getExclusiveAreaEx__ProvidesSchmEnterExitApi__ExclusiveArea(), 
		   source, 
		   new String[] {
			 "body", "this_.parent.oclAsType(ar4x::m2::BswInternalBehavior).bswSchedulableEntity.canEnterExclusiveArea->includes(this_)",
			 "pre", "this_.parent.oclIsKindOf(ar4x::m2::BswInternalBehavior)"
		   });			
		addAnnotation
		  (getSenderReceiverToSignalMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalMapping(), 
		   source, 
		   new String[] {
			 "body", "if this_.dataElement.oclIsKindOf(instance::VariableDataInstanceInComposition)\n\t\t\t\t\tthen this_.dataElement.oclAsType(instance::VariableDataInstanceInComposition)\n\t\t\t\t\telse\n\t\t\t\t\tlet dataInstanceInComposition : instance::VariableDataInstanceInComposition =\n\t\t\t\t\t\tinstance::DelegationDataInstanceConnector.allInstances()\n\t\t\t\t\t\t->any(outer = this_.dataElement).inner\n\t\t\t\t\tin if dataInstanceInComposition.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse dataInstanceInComposition\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getSenderReceiverToSignalGroupMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalGroupMapping(), 
		   source, 
		   new String[] {
			 "body", "if this_.dataElement.oclIsKindOf(instance::VariableDataInstanceInComposition)\n\t\t\t\t\tthen this_.dataElement.oclAsType(instance::VariableDataInstanceInComposition)\n\t\t\t\t\telse\n\t\t\t\t\tlet dataInstanceInComposition : instance::VariableDataInstanceInComposition =\n\t\t\t\t\t\tinstance::DelegationDataInstanceConnector.allInstances()\n\t\t\t\t\t\t->any(outer = this_.dataElement).inner\n\t\t\t\t\tin if dataInstanceInComposition.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse dataInstanceInComposition\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getOsTaskEx__GetOwnerPartition__OsTask(), 
		   source, 
		   new String[] {
			 "body", "let partition : ecuc::EcucPartition = this_.ownerApplication.osAppEcucPartition->any(true)\n\t\t\t\tin if partition.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse partition\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getComSignalEx__IsSender__ComSignal(), 
		   source, 
		   new String[] {
			 "body", "getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isProvided())"
		   });		
		addAnnotation
		  (getComSignalEx__IsReceiver__ComSignal(), 
		   source, 
		   new String[] {
			 "body", "getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isRequired())"
		   });			
		addAnnotation
		  (getComSignalEx__GetVariableDataInstanceInCompositions__ComSignal(), 
		   source, 
		   new String[] {
			 "body", "let systemSignal : ar4x::m2::SystemSignal = this_.comSystemTemplateSystemSignal.iSignal.systemSignal\n\t\t\t\tin if systemSignal.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderReceiverToSignalMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.systemSignal = systemSignal)\n\t\t\t\t\t\t->collect(m | senderReceiverToSignalMappingEx.getMappedDataInstanceInComposition(m))\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getComSignalGroupEx__IsSender__ComSignalGroup(), 
		   source, 
		   new String[] {
			 "body", "getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isProvided())"
		   });		
		addAnnotation
		  (getComSignalGroupEx__IsReceiver__ComSignalGroup(), 
		   source, 
		   new String[] {
			 "body", "getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isRequired())"
		   });			
		addAnnotation
		  (getComSignalGroupEx__GetVariableDataInstanceInCompositions__ComSignalGroup(), 
		   source, 
		   new String[] {
			 "body", "let systemSignalGroup : ar4x::m2::SystemSignalGroup = this_.comSystemTemplateSignalGroup.iSignalGroup.systemSignalGroup\n\t\t\t\tin if systemSignalGroup.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderReceiverToSignalGroupMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.signalGroup = systemSignalGroup)\n\t\t\t\t\t\t->collect(m | senderReceiverToSignalGroupMappingEx.getMappedDataInstanceInComposition(m))\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getEcucPartitionEx__IsInMasterCore__EcucPartition(), 
		   source, 
		   new String[] {
			 "body", "let osOs : ecuc::OsOS = ecuc::OsOS.allInstances()\n\t\t\t\t\t->any(true)\n\t\t\t\tin this_.getOwnerCore().oclIsUndefined() or osOs.osMasterCoreId = this_.getOwnerCore()"
		   });			
		addAnnotation
		  (getEcucPartitionEx__IsMasterBswPartition__EcucPartition(), 
		   source, 
		   new String[] {
			 "body", "isInMasterCore(this_) and this_.ecucPartitionBswModuleExecution"
		   });			
		addAnnotation
		  (getEcucPartitionEx__ProvidesRestartPartitionApi__EcucPartition(), 
		   source, 
		   new String[] {
			 "body", "this_.partitionCanBeRestarted"
		   });			
		addAnnotation
		  (getEcucPartitionEx__ProvidesPartitionRestartingApi__EcucPartition(), 
		   source, 
		   new String[] {
			 "body", "this_.partitionCanBeRestarted"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__InitAtDeclaration__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__InitAtStart__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__InitAtPartitionRestart__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__GetInitializationStrategy__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let behavior : ar4x::ecuc::RteInitializationBehavior = ecuc::RteInitializationBehavior.allInstances()\n\t\t\t\t\t->select(rteSectionInitializationPolicy\n\t\t\t\t\t\t->includes(getSectionInitializationPolicy(this_)))\n\t\t\t\t\t->any(true)\n\t\t\t\tin if behavior.oclIsUndefined()\n\t\t\t\t\tthen ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START\n\t\t\t\t\telse behavior.rteInitializationStrategy\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__GetSectionInitializationPolicy__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swAddrMethod.sectionInitializationPolicy\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataPrototypeEx__GetSwAddrMethod__VariableDataPrototype(), 
		   source, 
		   new String[] {
			 "body", "let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if not swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen swAddrMethod\n\t\t\t\t\telse if not this_.getImplementationDataType().oclIsUndefined()\n\t\t\t\t\tthen this_.getImplementationDataType().getLeafImplementationDataType()\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetPartition__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let swComponentInstance : instance::SwComponentInstanceInSystem = this_.parent.contextComponent.instance\n\t\t\t\t\t->first()\n\t\t\t\tin if swComponentInstance.oclIsUndefined() or swComponentInstance.ownerPartition->isEmpty()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swComponentInstance.ownerPartition->any(true)\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__InitAtDeclaration__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__InitAtStart__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__InitAtPartitionRestart__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetInitValueAsText__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let initValue : m2::ValueSpecification = getInitValue(this_)\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse valueSpecificationEx.getValueSpecAsText(initValue)\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetInitializationStrategy__VariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "let behavior : ar4x::ecuc::RteInitializationBehavior = ecuc::RteInitializationBehavior.allInstances()\n\t\t\t\t\t->select(rteSectionInitializationPolicy\n\t\t\t\t\t\t->includes(getSectionInitializationPolicy(this_)))\n\t\t\t\t\t->any(true)\n\t\t\t\tin if behavior.oclIsUndefined()\n\t\t\t\t\tthen ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START\n\t\t\t\t\telse behavior.rteInitializationStrategy\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetSectionInitializationPolicy__VariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swAddrMethod.sectionInitializationPolicy\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetInitValue__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let receiverInitValue : m2::ValueSpecification = getReceiverInitValue(this_) , senderInitValue :\n\t\t\t\t\tm2::ValueSpecification = getSenderInitValue(this_)\n\t\t\t\tin if not receiverInitValue.oclIsUndefined()\n\t\t\t\t\tthen receiverInitValue\n\t\t\t\t\telse senderInitValue\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetReceiverInitValue__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetSenderInitValue__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetSwAddrMethod__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "let receiverSwAddrMethod : m2::SwAddrMethod = getReceiverSwAddrMethod(this_) , senderSwAddrMethod :\n\t\t\t\t\tm2::SwAddrMethod = getSenderSwAddrMethod(this_)\n\t\t\t\tin if not senderSwAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen senderSwAddrMethod\n\t\t\t\t\telse receiverSwAddrMethod\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetReceiverSwAddrMethod__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__GetSenderSwAddrMethod__VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getVariableDataInstanceInCompositionEx__EqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet initValue1 : m2::ValueSpecification = getInitValue(v1),\n\t\t\t\t\tinitValue2 : m2::ValueSpecification = getInitValue(v2)\n\t\t\t\tin\n\t\t\t\tif initValue1.oclIsUndefined() and initValue2.oclIsUndefined() then\n\t\t\t\t\ttrue\n\t\t\t\telse if initValue1.oclIsUndefined() or initValue2.oclIsUndefined() then\n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\tvalueSpecificationEx.equalsInitValue(initValue1, initValue2)\n\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwcEx__ProvidesInitValueConstant__VariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.isEventSemantics()"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwcEx__GetMemoryMappingAlignment__VariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "let swAlignment : String = this_.getSwAlignment(), baseType : m2::SwBaseType = this_.getBaseType() in\n\t\t\t\t\tif not swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen alignmentTypeEx.getMemoryMappingAlignment(swAlignment)\n\t\t\t\t\telse if not baseType.baseTypeSize.oclIsUndefined()\n\t\t\t\t\t\tthen baseType.baseTypeSize.toString()\n\t\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwcEx__ProvidesWriteApi__PVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.isEventSemantics() and this_.isAccessedByDataSendPoint()"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwcEx__ProvidesInvalidateApi__PVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.isEventSemantics() and this_.isInvalidationEnabled() and this_.isAccessedByDataSendPoint()"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwcEx__ProvidesSendApi__PVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "this_.isEventSemantics() and this_.isAccessedByDataSendPoint()"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwcEx__ProvidesFeedbackApi__PVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "this_.isAccessedByDataSendPoint() and this_.isTAckEnabled()"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwcEx__RequiresFilterVariable__RVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "requiresFilterOldValueVariable(this_) or requiresFilterOccurrenceVariable(this_)"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwcEx__RequiresFilterOldValueVariable__RVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.getFilter().oclIsUndefined() and this_.getFilter().dataFilterType =\n\t\t\t\t\tm2::DataFilterTypeEnum::maskedNewDiffersMaskedOld"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwcEx__RequiresFilterOccurrenceVariable__RVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.getFilter().oclIsUndefined() and this_.getFilter().dataFilterType =\n\t\t\t\t\tm2::DataFilterTypeEnum::oneEveryN"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwcEx__ProvidesReadApi__RVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "not this_.isEventSemantics() and\n\t\t\t\t\tthis_.getOwnerAtomicSwc().internalBehavior.runnable.dataReceivePointByArgument\n\t\t\t\t\t->exists(accessedVariable.autosarVariable = this_)"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwcEx__ProvidesReceiveApi__RVariableDataInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "this_.isEventSemantics() and this_.getOwnerAtomicSwc().internalBehavior.runnable.dataReceivePointByArgument\n\t\t\t\t\t->exists(accessedVariable.autosarVariable = this_)"
		   });			
		addAnnotation
		  (getROperationInstanceInSwcEx__ProvidesCallApi__ROperationInstanceInSwc(), 
		   source, 
		   new String[] {
			 "body", "this_.getOwnerAtomicSwc().internalBehavior.runnable.serverCallPoint\n\t\t\t\t\t->exists(operation = this_)"
		   });		
		addAnnotation
		  (getAssemblyDataInstanceConnectorEx__IsInterPartition__AssemblyDataInstanceConnector(), 
		   source, 
		   new String[] {
			 "body", "variableDataInstanceInCompositionEx.getPartition(this_.provider) <>\n\t\t\t\t\tvariableDataInstanceInCompositionEx.getPartition(this_.requester)"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__RequiresRteFilter__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "let receivers : Set(rte::interaction::InternalEcuReceiver) = this_.getInternalEcuReceivers() ,\n\t\t\t\t\tfilterReceivers : Set(rte::interaction::InternalEcuReceiver) = receivers->select(isFilterEnabled())\n\t\t\t\tin receivers->exists(isFilterEnabled())\n\t\t\t\t\tand (receivers->exists(hasMultipleSenders())\n\t\t\t\t\t\tor not receivers->forAll(isFilterEnabled())\n\t\t\t\t\t\tor filterReceivers->exists(r1, r2 | not r1.getFilter().isCompatibleWith(r2.getFilter())))"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__RequiresRteInvalidation__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "let receivers : Set(rte::interaction::InternalEcuReceiver) = this_.getInternalEcuReceivers() ,\n\t\t\t\t\t\tinvReceivers : Set(rte::interaction::InternalEcuReceiver) = receivers->select(isInvalidationEnabled())\n\t\t\t\tin receivers->exists(isInvalidationEnabled())\n\t\t\t\t\tand (not receivers->forAll(isInvalidationEnabled())\n\t\t\t\t\t\tor invReceivers->exists(r1, r2 | r1.getHandleInvalid() <> r2.getHandleInvalid()))"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__RequiresRteInitialization__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "this_.hasMultipleInternalEcuReceivers()\n\t\t\t\t\tand this_.getInternalEcuReceivers()->exists(r1, r2 | not variableDataInstanceInCompositionEx.equalsInitValue(r1.source, r2.source))"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__ProvidesComRxCallback__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "this_.sendInteraction->exists(not implementation.oclIsUndefined())\n\t\t\t\t\tor this_.getInternalEcuReceivers()->exists(activatesOnReceived->notEmpty())"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__ProvidesComInvCallback__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "this_.sendInteraction\n\t\t\t\t\t->exists(not implementation.oclIsUndefined() and receiveInteraction.getInternalEcuReceivers()\n\t\t\t\t\t\t->exists(isInvalidationEnabled()))\n\t\t\t\t\tor this_.getInternalEcuReceivers()->exists(activatesOnReceived->notEmpty() and isInvalidationEnabled())"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__ProvidesComRxTOutCallback__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "this_.sendInteraction\n\t\t\t\t\t->exists(not implementation.oclIsUndefined() and receiveInteraction.getInternalEcuReceivers()\n\t\t\t\t\t\t->exists(isAliveTimeoutEnabled()))"
		   });			
		addAnnotation
		  (getExternalEcuSenderEx__ProvidesComCallback__ExternalEcuSender(), 
		   source, 
		   new String[] {
			 "body", "providesComRxCallback(this_)\n\t\t\t\t   or providesComInvCallback(this_)\n\t\t\t\t   or providesComRxTOutCallback(this_)"
		   });			
		addAnnotation
		  (getExternalEcuReceiverEx__ProvidesComTxAndTxErrCallback__ExternalEcuReceiver(), 
		   source, 
		   new String[] {
			 "body", "this_.getInternalEcuSenders()->select(sendInteraction->exists(implementation.oclIsKindOf(rte::interaction::ComSendImplementation)))\n\t\t\t\t\t->exists(source.prototype.oclAsType(ar4x::instance::PVariableDataInstanceInSwc).isTAckEnabled())"
		   });			
		addAnnotation
		  (getExternalEcuReceiverEx__ProvidesComTxTOutCallback__ExternalEcuReceiver(), 
		   source, 
		   new String[] {
			 "body", "this_.getInternalEcuSenders()->select(sendInteraction->exists(implementation.oclIsKindOf(rte::interaction::ComSendImplementation)))\n\t\t\t\t\t->exists(source.prototype.oclAsType(ar4x::instance::PVariableDataInstanceInSwc).isTAckTimeoutEnabled())"
		   });		
		addAnnotation
		  (getEntityStarterEx__GetTimingTriggeringEntityStartImplementations__EntityStarter(), 
		   source, 
		   new String[] {
			 "body", "this_.startInteraction.implementation\n\t\t\t\t\t->select(oclIsKindOf(interaction::TimingTriggeringEntityStartImplementation)).oclAsType(interaction::TimingTriggeringEntityStartImplementation)\n\t\t\t\t\t->asOrderedSet()"
		   });			
		addAnnotation
		  (getBswSchedulableEntityEx__GetUsingPartition__BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "body", "if ar4x::m2::BswImplementation.allInstances()->exists(behavior = this_.parent) then\n\t\t\t\t\t\t\tgetCallRootBswSchedulableEntities(this_)->collect(m | getMappedTasks(m)).ownerApplication.osAppEcucPartition->asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tSet{}\n\t\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getBswSchedulableEntityEx__GetMappedTasks__BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "body", "this_.event.config->select(not rteBswMappedToTask.oclIsUndefined()).rteBswMappedToTask->asSet()"
		   });			
		addAnnotation
		  (getBswSchedulableEntityEx__GetCallerBswSchedulableEntities__BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "body", "getCallerBswSchedulableEntitiesByMode(this_)"
		   });			
		addAnnotation
		  (getBswSchedulableEntityEx__GetCallerBswSchedulableEntitiesByMode__BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "body", "let sourceEvent : Set(ar4x::m2::BswModeSwitchEvent) = this_.event->select(oclIsKindOf(ar4x::m2::BswModeSwitchEvent)).oclAsType(ar4x::m2::BswModeSwitchEvent)->select(config->exists(rteBswMappedToTask.oclIsUndefined()))->asSet(),\n\t\t\t\t\t\teventSourceRequiredModePrototypes : Set(ar4x::m2::ModeDeclarationGroupPrototype) = sourceEvent.modeIref.contextModeDeclarationGroup->select(m | this_.accessedModeGroup->includes(m))->asSet(),\n\t\t\t\t\t\teventSourceProvidedModePrototypes : Set(ar4x::m2::ModeDeclarationGroupPrototype) = eventSourceRequiredModePrototypes->collect(m | modeDeclarationGroupPrototypeEx.getConnectedProvidedModePrototypes(m))->asSet()\n\t\t\t\t\t\tin eventSourceProvidedModePrototypes->collect(m | modeDeclarationGroupPrototypeEx.getModeManagerBswSchedulableEntities(m))->asSet()"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetUsingPartitionForManager__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\t\tgetModeManagerBswSchedulableEntities(this_)\n\t\t\t\t\t->collect(m | bswSchedulableEntityEx.getUsingPartition(m))->asOrderedSet()"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetUsingPartitionForUser__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\t\tgetModeUserBswSchedulableEntities(this_)\n\t\t\t\t\t->collect(m | bswSchedulableEntityEx.getUsingPartition(m))->asOrderedSet()"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetUsingPartition__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\t\tgetUsingPartitionForManager(this_)->union(getUsingPartitionForUser(this_))->asOrderedSet()"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetModeManagerBswSchedulableEntities__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "let enableInternalBehavior : ar4x::m2::BswInternalBehavior = getParentBswModuleDescription(this_).getEnableInternalBehavior()\n\t\t\t\t\t\tin if not enableInternalBehavior.oclIsUndefined() then\n\t\t\t\t\t\t\t\tenableInternalBehavior.bswSchedulableEntity->select(managedModeGroup->includes(this_))\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tSet{}\n\t\t\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetModeUserBswSchedulableEntities__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "let enableInternalBehavior : ar4x::m2::BswInternalBehavior = getParentBswModuleDescription(this_).getEnableInternalBehavior()\n\t\t\t\t\t\tin if not enableInternalBehavior.oclIsUndefined() then\n\t\t\t\t\t\t\t\tenableInternalBehavior.bswSchedulableEntity->select(accessedModeGroup->includes(this_))\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tSet{}\n\t\t\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetParentBswModuleDescription__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "let providerBswm : ar4x::m2::BswModuleDescription = ar4x::m2::BswModuleDescription.allInstances()->select(providedModeGroup->includes(this_))->any(true),\n\t\t\t\t\t\trequirerBswm : ar4x::m2::BswModuleDescription = ar4x::m2::BswModuleDescription.allInstances()->select(requiredModeGroup->includes(this_))->any(true)\n\t\t\t\t\t\tin if not providerBswm.oclIsUndefined() then\n\t\t\t\t\t\t\t\tproviderBswm\n\t\t\t\t\t\t\telse if not requirerBswm.oclIsUndefined() then\n\t\t\t\t\t\t\t\trequirerBswm\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tnull\n\t\t\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getModeDeclarationGroupPrototypeEx__GetConnectedProvidedModePrototypes__ModeDeclarationGroupPrototype(), 
		   source, 
		   new String[] {
			 "body", "ar4x::ecuc::RteBswRequiredModeGroupConnection.allInstances()->select(rteBswRequiredModeGroup = this_).rteBswProvidedModeGroup->asSet()"
		   });		
		addAnnotation
		  (getRteEventEx__GetRelatedEntityStarter__RteEvent(), 
		   source, 
		   new String[] {
			 "body", "let reStartInteraction : interaction::RunnableEntityStartInteraction = interaction::RunnableEntityStartInteraction.allInstances()->any(sourceEvent = this_)\n\t\t\t\t\tin\n\t\t\t\t\tinteraction::EntityStarter.allInstances()->any(startInteraction->includes(reStartInteraction))"
		   });		
		addAnnotation
		  (getComGroupSignalEx__GetImplementationRecordElement__ComGroupSignal(), 
		   source, 
		   new String[] {
			 "body", "let systemSignal : ar4x::m2::SystemSignal = this_.comSystemTemplateSystemSignal.iSignal.systemSignal\n\t\t\t\tin if systemSignal.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderRecRecordElementMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.systemSignal = systemSignal)\n\t\t\t\t\t\t->collect(m | m.implementationRecordElement)\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getComGroupSignalEx__GetImplementationArrayElement__ComGroupSignal(), 
		   source, 
		   new String[] {
			 "body", "let systemSignal : ar4x::m2::SystemSignal = this_.comSystemTemplateSystemSignal.iSignal.systemSignal\n\t\t\t\tin if systemSignal.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderRecArrayElementMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.systemSignal = systemSignal)\n\t\t\t\t\t\t->collect(m | m.indexedArrayElement.implementationArrayElement)\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif"
		   });
	}

} //ExPackageImpl
