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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSystemCycle;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteGeneration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl.RtePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class EcucPackageImpl extends EPackageImpl implements EcucPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteGenerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswGeneralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteSwComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEventToTaskMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucReferrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteExclusiveAreaImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comGroupSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucPartitionCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osSpinlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteOsInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteUsedOsActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteInitializationBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osIocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osIocCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osIocSenderPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osIocReceiverPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osIocDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osApplicationTrustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osOSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswEventToTaskMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswRequiredModeGroupConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswModuleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswExclusiveAreaImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osSystemCycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osTaskScheduleEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rteExclusiveAreaImplMechanismEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comTransferPropertyEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osSpinlockLockMethodEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rteInitializationStrategyEnumEEnum = null;

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcucPackageImpl() {
		super(eNS_URI, EcucFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcucPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcucPackage init() {
		if (isInited) return (EcucPackage)EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI);

		// Obtain or create and register package
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcucPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theEcucPackage.createPackageContents();
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theEcucPackage.initializePackageContents();
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcucPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcucPackage.eNS_URI, theEcucPackage);
		return theEcucPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRte() {
		return rteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteGeneration() {
		return (EReference)rteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteBswGeneral() {
		return (EReference)rteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteSwComponentInstance() {
		return (EReference)rteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteOsInteraction() {
		return (EReference)rteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteInitializationBehavior() {
		return (EReference)rteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteBswModuleInstance() {
		return (EReference)rteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteGeneration() {
		return rteGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswGeneral() {
		return rteBswGeneralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteBswGeneral_RteUseComShadowSignalApi() {
		return (EAttribute)rteBswGeneralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucObject() {
		return ecucObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucRoot() {
		return ecucRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucRoot_Rte() {
		return (EReference)ecucRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucRoot_Os() {
		return (EReference)ecucRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucRoot_Com() {
		return (EReference)ecucRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucRoot_EcuC() {
		return (EReference)ecucRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteSwComponentInstance() {
		return rteSwComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSwComponentInstance_RteEventToTaskMapping() {
		return (EReference)rteSwComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSwComponentInstance_RteExclusiveAreaImplementation() {
		return (EReference)rteSwComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSwComponentInstance_RteSoftwareComponentInstance() {
		return (EReference)rteSwComponentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteEventToTaskMapping() {
		return rteEventToTaskMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEventToTaskMapping_RteEvent() {
		return (EReference)rteEventToTaskMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteEventToTaskMapping_RteActivationOffset() {
		return (EAttribute)rteEventToTaskMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEventToTaskMapping_RteMappedToTask() {
		return (EReference)rteEventToTaskMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteEventToTaskMapping_RtePositionInTask() {
		return (EAttribute)rteEventToTaskMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEventToTaskMapping_RteUsedOsAlarm() {
		return (EReference)rteEventToTaskMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEventToTaskMapping_RteUsedOsEvent() {
		return (EReference)rteEventToTaskMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucReferrable() {
		return ecucReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucReferrable_Id() {
		return (EAttribute)ecucReferrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucReferrable_ShortName() {
		return (EAttribute)ecucReferrableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucReferrable_Reference() {
		return (EAttribute)ecucReferrableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucReferrable_Source() {
		return (EReference)ecucReferrableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucModule() {
		return ecucModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucModule_ReferenceBase() {
		return (EAttribute)ecucModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucContainer() {
		return ecucContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOs() {
		return osEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsTask() {
		return (EReference)osEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsEvent() {
		return (EReference)osEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsApplication() {
		return (EReference)osEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsAlarm() {
		return (EReference)osEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsResource() {
		return (EReference)osEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsSpinlock() {
		return (EReference)osEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsIoc() {
		return (EReference)osEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOs_OsOS() {
		return (EReference)osEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTask() {
		return osTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTask_OsTaskActivation() {
		return (EAttribute)osTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTask_OsTaskPriority() {
		return (EAttribute)osTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTask_OsTaskSchedule() {
		return (EAttribute)osTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTask_OsTaskAccessingApplication() {
		return (EReference)osTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTask_OsTaskEvent() {
		return (EReference)osTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTask_MappedRteEvent() {
		return (EReference)osTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTask_OwnerApplication() {
		return (EReference)osTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTask_MappedRteBswEvent() {
		return (EReference)osTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteExclusiveAreaImplementation() {
		return rteExclusiveAreaImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteExclusiveAreaImplementation_RteExclusiveAreaImplMechanism() {
		return (EAttribute)rteExclusiveAreaImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteExclusiveAreaImplementation_RteExclusiveArea() {
		return (EReference)rteExclusiveAreaImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteExclusiveAreaImplementation_RteExclusiveAreaOsResource() {
		return (EReference)rteExclusiveAreaImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteExclusiveAreaImplementation_RteExclusiveAreaOsSpinlock() {
		return (EReference)rteExclusiveAreaImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsEvent() {
		return osEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsEvent_OsEventMask() {
		return (EAttribute)osEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCom() {
		return comEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCom_ComConfig() {
		return (EReference)comEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComConfig() {
		return comConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComConfig_ComSignal() {
		return (EReference)comConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComConfig_ComSignalGroup() {
		return (EReference)comConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignal() {
		return comSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignal_ComSystemTemplateSystemSignal() {
		return (EReference)comSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignal_ComHandleId() {
		return (EAttribute)comSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignal_ComTransferProperty() {
		return (EAttribute)comSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignal_ComBitSize() {
		return (EAttribute)comSignalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignal_ComSignalLength() {
		return (EAttribute)comSignalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignal__TransfersImmediately() {
		return comSignalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignalGroup() {
		return comSignalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalGroup_ComSystemTemplateSignalGroup() {
		return (EReference)comSignalGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalGroup_ComGroupSignal() {
		return (EReference)comSignalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignalGroup_ComHandleId() {
		return (EAttribute)comSignalGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignalGroup_ComTransferProperty() {
		return (EAttribute)comSignalGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComSignalGroup__TransfersImmediately() {
		return comSignalGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComGroupSignal() {
		return comGroupSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComGroupSignal_ComSystemTemplateSystemSignal() {
		return (EReference)comGroupSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComGroupSignal_ComHandleId() {
		return (EAttribute)comGroupSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComGroupSignal_ComBitSize() {
		return (EAttribute)comGroupSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComGroupSignal_ComSignalLength() {
		return (EAttribute)comGroupSignalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsAlarm() {
		return osAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAlarm_ExpectedConfig() {
		return (EReference)osAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsResource() {
		return osResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsApplication() {
		return osApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsApplication_OsApplicationCoreAssignment() {
		return (EAttribute)osApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsApplication_OsTrusted() {
		return (EAttribute)osApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsApplication_OsAppEcucPartition() {
		return (EReference)osApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsApplication_OsApplicationTrustedFunction() {
		return (EReference)osApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsApplication_OsAppTask() {
		return (EReference)osApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcuC() {
		return ecuCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcuC_EcucPartitionCollection() {
		return (EReference)ecuCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucPartitionCollection() {
		return ecucPartitionCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucPartitionCollection_EcucPartition() {
		return (EReference)ecucPartitionCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartitionCollection__GetAssignedCores() {
		return ecucPartitionCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucPartition() {
		return ecucPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucPartition_EcucPartitionBswModuleExecution() {
		return (EAttribute)ecucPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucPartition_PartitionCanBeRestarted() {
		return (EAttribute)ecucPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucPartition_EcucPartitionSoftwareComponent() {
		return (EReference)ecucPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucPartition_ImplOsApplication() {
		return (EReference)ecucPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartition__IsTrusted() {
		return ecucPartitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcucPartition__GetOwnerCore() {
		return ecucPartitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsSpinlock() {
		return osSpinlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsSpinlock_OsSpinlockAccessingApplication() {
		return (EReference)osSpinlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsSpinlock_OsSpinlockLockMethod() {
		return (EAttribute)osSpinlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteOsInteraction() {
		return rteOsInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteOsInteraction_RteUsedOsActivation() {
		return (EReference)rteOsInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteUsedOsActivation() {
		return rteUsedOsActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteUsedOsActivation_RteExpectedTickDuration() {
		return (EAttribute)rteUsedOsActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteUsedOsActivation_RteExpectedActivationOffset() {
		return (EAttribute)rteUsedOsActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteUsedOsActivation_RteActivationOsAlarm() {
		return (EReference)rteUsedOsActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteInitializationBehavior() {
		return rteInitializationBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteInitializationBehavior_RteInitializationStrategy() {
		return (EAttribute)rteInitializationBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteInitializationBehavior_RteSectionInitializationPolicy() {
		return (EAttribute)rteInitializationBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsIoc() {
		return osIocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIoc_OsIocCommunication() {
		return (EReference)osIocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsIocCommunication() {
		return osIocCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocCommunication_OsIocSenderProperties() {
		return (EReference)osIocCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocCommunication_OsIocReceiverProperties() {
		return (EReference)osIocCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocCommunication_OsIocDataProperties() {
		return (EReference)osIocCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsIocCommunication_OsIocBufferLength() {
		return (EAttribute)osIocCommunicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOsIocCommunication__GetLoopbackSenderProperties() {
		return osIocCommunicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsIocSenderProperties() {
		return osIocSenderPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsIocSenderProperties_OsIocSenderId() {
		return (EAttribute)osIocSenderPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocSenderProperties_OsIocSendingOsApplication() {
		return (EReference)osIocSenderPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocSenderProperties_Parent() {
		return (EReference)osIocSenderPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsIocReceiverProperties() {
		return osIocReceiverPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocReceiverProperties_OsIocReceivingOsApplication() {
		return (EReference)osIocReceiverPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsIocDataProperties() {
		return osIocDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsIocDataProperties_OsIocDataPropertyIndex() {
		return (EAttribute)osIocDataPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsIocDataProperties_OsIocInitValue() {
		return (EAttribute)osIocDataPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsIocDataProperties_OsIocDataType() {
		return (EReference)osIocDataPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsApplicationTrustedFunction() {
		return osApplicationTrustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsApplicationTrustedFunction_OsTrustedFunctionName() {
		return (EAttribute)osApplicationTrustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsApplicationTrustedFunction_Parent() {
		return (EReference)osApplicationTrustedFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsOS() {
		return osOSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsOS_OsNumberOfCores() {
		return (EAttribute)osOSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsOS_OsMasterCoreId() {
		return (EAttribute)osOSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsOS_OsSystemCycle() {
		return (EReference)osOSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOsOS__IsMulticoreOs() {
		return osOSEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswEventToTaskMapping() {
		return rteBswEventToTaskMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteBswEventToTaskMapping_RteBswActivationOffset() {
		return (EAttribute)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswEventToTaskMapping_RteBswEvent() {
		return (EReference)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteBswEventToTaskMapping_RteBswPositionInTask() {
		return (EAttribute)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswEventToTaskMapping_RteBswMappedToTask() {
		return (EReference)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswEventToTaskMapping_RteBswUsedOsAlarm() {
		return (EReference)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswEventToTaskMapping_RteBswUsedOsEvent() {
		return (EReference)rteBswEventToTaskMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswRequiredModeGroupConnection() {
		return rteBswRequiredModeGroupConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswRequiredModeGroupConnection_Parent() {
		return (EReference)rteBswRequiredModeGroupConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswRequiredModeGroupConnection_RteBswProvidedModeGroup() {
		return (EReference)rteBswRequiredModeGroupConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswRequiredModeGroupConnection_RteBswRequiredModeGroup() {
		return (EReference)rteBswRequiredModeGroupConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswModuleInstance() {
		return rteBswModuleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswModuleInstance_RteBswEventToTaskMapping() {
		return (EReference)rteBswModuleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswModuleInstance_RteBswExclusiveAreaImpl() {
		return (EReference)rteBswModuleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswModuleInstance_RteBswImplementation() {
		return (EReference)rteBswModuleInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswModuleInstance_RteBswRequiredModeGroupConnection() {
		return (EReference)rteBswModuleInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswExclusiveAreaImpl() {
		return rteBswExclusiveAreaImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswExclusiveAreaImpl_RteBswExclusiveArea() {
		return (EReference)rteBswExclusiveAreaImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteBswExclusiveAreaImpl_RteExclusiveAreaImplMechanism() {
		return (EAttribute)rteBswExclusiveAreaImplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsSpinlock() {
		return (EReference)rteBswExclusiveAreaImplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsSystemCycle() {
		return osSystemCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsResource() {
		return (EReference)rteBswExclusiveAreaImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOsTaskScheduleEnum() {
		return osTaskScheduleEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRteExclusiveAreaImplMechanismEnum() {
		return rteExclusiveAreaImplMechanismEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComTransferPropertyEnum() {
		return comTransferPropertyEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOsSpinlockLockMethodEnum() {
		return osSpinlockLockMethodEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRteInitializationStrategyEnum() {
		return rteInitializationStrategyEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucFactory getEcucFactory() {
		return (EcucFactory)getEFactoryInstance();
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
		ecucObjectEClass = createEClass(ECUC_OBJECT);

		ecucReferrableEClass = createEClass(ECUC_REFERRABLE);
		createEAttribute(ecucReferrableEClass, ECUC_REFERRABLE__ID);
		createEAttribute(ecucReferrableEClass, ECUC_REFERRABLE__SHORT_NAME);
		createEAttribute(ecucReferrableEClass, ECUC_REFERRABLE__REFERENCE);
		createEReference(ecucReferrableEClass, ECUC_REFERRABLE__SOURCE);

		ecucModuleEClass = createEClass(ECUC_MODULE);
		createEAttribute(ecucModuleEClass, ECUC_MODULE__REFERENCE_BASE);

		ecucContainerEClass = createEClass(ECUC_CONTAINER);

		rteEClass = createEClass(RTE);
		createEReference(rteEClass, RTE__RTE_GENERATION);
		createEReference(rteEClass, RTE__RTE_BSW_GENERAL);
		createEReference(rteEClass, RTE__RTE_SW_COMPONENT_INSTANCE);
		createEReference(rteEClass, RTE__RTE_OS_INTERACTION);
		createEReference(rteEClass, RTE__RTE_INITIALIZATION_BEHAVIOR);
		createEReference(rteEClass, RTE__RTE_BSW_MODULE_INSTANCE);

		rteGenerationEClass = createEClass(RTE_GENERATION);

		rteBswGeneralEClass = createEClass(RTE_BSW_GENERAL);
		createEAttribute(rteBswGeneralEClass, RTE_BSW_GENERAL__RTE_USE_COM_SHADOW_SIGNAL_API);

		ecucRootEClass = createEClass(ECUC_ROOT);
		createEReference(ecucRootEClass, ECUC_ROOT__RTE);
		createEReference(ecucRootEClass, ECUC_ROOT__OS);
		createEReference(ecucRootEClass, ECUC_ROOT__COM);
		createEReference(ecucRootEClass, ECUC_ROOT__ECU_C);

		rteSwComponentInstanceEClass = createEClass(RTE_SW_COMPONENT_INSTANCE);
		createEReference(rteSwComponentInstanceEClass, RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING);
		createEReference(rteSwComponentInstanceEClass, RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION);
		createEReference(rteSwComponentInstanceEClass, RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE);

		rteEventToTaskMappingEClass = createEClass(RTE_EVENT_TO_TASK_MAPPING);
		createEReference(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT);
		createEAttribute(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET);
		createEReference(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK);
		createEAttribute(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK);
		createEReference(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM);
		createEReference(rteEventToTaskMappingEClass, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT);

		osEClass = createEClass(OS);
		createEReference(osEClass, OS__OS_TASK);
		createEReference(osEClass, OS__OS_EVENT);
		createEReference(osEClass, OS__OS_APPLICATION);
		createEReference(osEClass, OS__OS_ALARM);
		createEReference(osEClass, OS__OS_RESOURCE);
		createEReference(osEClass, OS__OS_SPINLOCK);
		createEReference(osEClass, OS__OS_IOC);
		createEReference(osEClass, OS__OS_OS);

		osTaskEClass = createEClass(OS_TASK);
		createEAttribute(osTaskEClass, OS_TASK__OS_TASK_ACTIVATION);
		createEAttribute(osTaskEClass, OS_TASK__OS_TASK_PRIORITY);
		createEAttribute(osTaskEClass, OS_TASK__OS_TASK_SCHEDULE);
		createEReference(osTaskEClass, OS_TASK__OS_TASK_ACCESSING_APPLICATION);
		createEReference(osTaskEClass, OS_TASK__OS_TASK_EVENT);
		createEReference(osTaskEClass, OS_TASK__MAPPED_RTE_EVENT);
		createEReference(osTaskEClass, OS_TASK__OWNER_APPLICATION);
		createEReference(osTaskEClass, OS_TASK__MAPPED_RTE_BSW_EVENT);

		rteExclusiveAreaImplementationEClass = createEClass(RTE_EXCLUSIVE_AREA_IMPLEMENTATION);
		createEAttribute(rteExclusiveAreaImplementationEClass, RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM);
		createEReference(rteExclusiveAreaImplementationEClass, RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA);
		createEReference(rteExclusiveAreaImplementationEClass, RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE);
		createEReference(rteExclusiveAreaImplementationEClass, RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK);

		osEventEClass = createEClass(OS_EVENT);
		createEAttribute(osEventEClass, OS_EVENT__OS_EVENT_MASK);

		comEClass = createEClass(COM);
		createEReference(comEClass, COM__COM_CONFIG);

		comConfigEClass = createEClass(COM_CONFIG);
		createEReference(comConfigEClass, COM_CONFIG__COM_SIGNAL);
		createEReference(comConfigEClass, COM_CONFIG__COM_SIGNAL_GROUP);

		comSignalEClass = createEClass(COM_SIGNAL);
		createEReference(comSignalEClass, COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL);
		createEAttribute(comSignalEClass, COM_SIGNAL__COM_HANDLE_ID);
		createEAttribute(comSignalEClass, COM_SIGNAL__COM_TRANSFER_PROPERTY);
		createEAttribute(comSignalEClass, COM_SIGNAL__COM_BIT_SIZE);
		createEAttribute(comSignalEClass, COM_SIGNAL__COM_SIGNAL_LENGTH);
		createEOperation(comSignalEClass, COM_SIGNAL___TRANSFERS_IMMEDIATELY);

		comSignalGroupEClass = createEClass(COM_SIGNAL_GROUP);
		createEReference(comSignalGroupEClass, COM_SIGNAL_GROUP__COM_GROUP_SIGNAL);
		createEReference(comSignalGroupEClass, COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP);
		createEAttribute(comSignalGroupEClass, COM_SIGNAL_GROUP__COM_HANDLE_ID);
		createEAttribute(comSignalGroupEClass, COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY);
		createEOperation(comSignalGroupEClass, COM_SIGNAL_GROUP___TRANSFERS_IMMEDIATELY);

		comGroupSignalEClass = createEClass(COM_GROUP_SIGNAL);
		createEReference(comGroupSignalEClass, COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL);
		createEAttribute(comGroupSignalEClass, COM_GROUP_SIGNAL__COM_HANDLE_ID);
		createEAttribute(comGroupSignalEClass, COM_GROUP_SIGNAL__COM_BIT_SIZE);
		createEAttribute(comGroupSignalEClass, COM_GROUP_SIGNAL__COM_SIGNAL_LENGTH);

		osAlarmEClass = createEClass(OS_ALARM);
		createEReference(osAlarmEClass, OS_ALARM__EXPECTED_CONFIG);

		osResourceEClass = createEClass(OS_RESOURCE);

		osApplicationEClass = createEClass(OS_APPLICATION);
		createEAttribute(osApplicationEClass, OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT);
		createEAttribute(osApplicationEClass, OS_APPLICATION__OS_TRUSTED);
		createEReference(osApplicationEClass, OS_APPLICATION__OS_APP_ECUC_PARTITION);
		createEReference(osApplicationEClass, OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION);
		createEReference(osApplicationEClass, OS_APPLICATION__OS_APP_TASK);

		ecuCEClass = createEClass(ECU_C);
		createEReference(ecuCEClass, ECU_C__ECUC_PARTITION_COLLECTION);

		ecucPartitionCollectionEClass = createEClass(ECUC_PARTITION_COLLECTION);
		createEReference(ecucPartitionCollectionEClass, ECUC_PARTITION_COLLECTION__ECUC_PARTITION);
		createEOperation(ecucPartitionCollectionEClass, ECUC_PARTITION_COLLECTION___GET_ASSIGNED_CORES);

		ecucPartitionEClass = createEClass(ECUC_PARTITION);
		createEAttribute(ecucPartitionEClass, ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION);
		createEAttribute(ecucPartitionEClass, ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED);
		createEReference(ecucPartitionEClass, ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT);
		createEReference(ecucPartitionEClass, ECUC_PARTITION__IMPL_OS_APPLICATION);
		createEOperation(ecucPartitionEClass, ECUC_PARTITION___IS_TRUSTED);
		createEOperation(ecucPartitionEClass, ECUC_PARTITION___GET_OWNER_CORE);

		osSpinlockEClass = createEClass(OS_SPINLOCK);
		createEReference(osSpinlockEClass, OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION);
		createEAttribute(osSpinlockEClass, OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD);

		rteOsInteractionEClass = createEClass(RTE_OS_INTERACTION);
		createEReference(rteOsInteractionEClass, RTE_OS_INTERACTION__RTE_USED_OS_ACTIVATION);

		rteUsedOsActivationEClass = createEClass(RTE_USED_OS_ACTIVATION);
		createEAttribute(rteUsedOsActivationEClass, RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION);
		createEAttribute(rteUsedOsActivationEClass, RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET);
		createEReference(rteUsedOsActivationEClass, RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM);

		rteInitializationBehaviorEClass = createEClass(RTE_INITIALIZATION_BEHAVIOR);
		createEAttribute(rteInitializationBehaviorEClass, RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY);
		createEAttribute(rteInitializationBehaviorEClass, RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY);

		osIocEClass = createEClass(OS_IOC);
		createEReference(osIocEClass, OS_IOC__OS_IOC_COMMUNICATION);

		osIocCommunicationEClass = createEClass(OS_IOC_COMMUNICATION);
		createEReference(osIocCommunicationEClass, OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES);
		createEReference(osIocCommunicationEClass, OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES);
		createEReference(osIocCommunicationEClass, OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES);
		createEAttribute(osIocCommunicationEClass, OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH);
		createEOperation(osIocCommunicationEClass, OS_IOC_COMMUNICATION___GET_LOOPBACK_SENDER_PROPERTIES);

		osIocSenderPropertiesEClass = createEClass(OS_IOC_SENDER_PROPERTIES);
		createEReference(osIocSenderPropertiesEClass, OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION);
		createEReference(osIocSenderPropertiesEClass, OS_IOC_SENDER_PROPERTIES__PARENT);
		createEAttribute(osIocSenderPropertiesEClass, OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID);

		osIocReceiverPropertiesEClass = createEClass(OS_IOC_RECEIVER_PROPERTIES);
		createEReference(osIocReceiverPropertiesEClass, OS_IOC_RECEIVER_PROPERTIES__OS_IOC_RECEIVING_OS_APPLICATION);

		osIocDataPropertiesEClass = createEClass(OS_IOC_DATA_PROPERTIES);
		createEAttribute(osIocDataPropertiesEClass, OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX);
		createEAttribute(osIocDataPropertiesEClass, OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE);
		createEReference(osIocDataPropertiesEClass, OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE);

		osApplicationTrustedFunctionEClass = createEClass(OS_APPLICATION_TRUSTED_FUNCTION);
		createEAttribute(osApplicationTrustedFunctionEClass, OS_APPLICATION_TRUSTED_FUNCTION__OS_TRUSTED_FUNCTION_NAME);
		createEReference(osApplicationTrustedFunctionEClass, OS_APPLICATION_TRUSTED_FUNCTION__PARENT);

		osOSEClass = createEClass(OS_OS);
		createEAttribute(osOSEClass, OS_OS__OS_NUMBER_OF_CORES);
		createEAttribute(osOSEClass, OS_OS__OS_MASTER_CORE_ID);
		createEReference(osOSEClass, OS_OS__OS_SYSTEM_CYCLE);
		createEOperation(osOSEClass, OS_OS___IS_MULTICORE_OS);

		rteBswEventToTaskMappingEClass = createEClass(RTE_BSW_EVENT_TO_TASK_MAPPING);
		createEAttribute(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET);
		createEReference(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT);
		createEAttribute(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK);
		createEReference(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK);
		createEReference(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM);
		createEReference(rteBswEventToTaskMappingEClass, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT);

		rteBswRequiredModeGroupConnectionEClass = createEClass(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION);
		createEReference(rteBswRequiredModeGroupConnectionEClass, RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT);
		createEReference(rteBswRequiredModeGroupConnectionEClass, RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP);
		createEReference(rteBswRequiredModeGroupConnectionEClass, RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP);

		rteBswModuleInstanceEClass = createEClass(RTE_BSW_MODULE_INSTANCE);
		createEReference(rteBswModuleInstanceEClass, RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING);
		createEReference(rteBswModuleInstanceEClass, RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL);
		createEReference(rteBswModuleInstanceEClass, RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION);
		createEReference(rteBswModuleInstanceEClass, RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION);

		rteBswExclusiveAreaImplEClass = createEClass(RTE_BSW_EXCLUSIVE_AREA_IMPL);
		createEReference(rteBswExclusiveAreaImplEClass, RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA);
		createEReference(rteBswExclusiveAreaImplEClass, RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE);
		createEAttribute(rteBswExclusiveAreaImplEClass, RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM);
		createEReference(rteBswExclusiveAreaImplEClass, RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK);

		osSystemCycleEClass = createEClass(OS_SYSTEM_CYCLE);

		// Create enums
		osTaskScheduleEnumEEnum = createEEnum(OS_TASK_SCHEDULE_ENUM);
		rteExclusiveAreaImplMechanismEnumEEnum = createEEnum(RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM);
		comTransferPropertyEnumEEnum = createEEnum(COM_TRANSFER_PROPERTY_ENUM);
		osSpinlockLockMethodEnumEEnum = createEEnum(OS_SPINLOCK_LOCK_METHOD_ENUM);
		rteInitializationStrategyEnumEEnum = createEEnum(RTE_INITIALIZATION_STRATEGY_ENUM);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecucReferrableEClass.getESuperTypes().add(this.getEcucObject());
		ecucModuleEClass.getESuperTypes().add(this.getEcucReferrable());
		ecucContainerEClass.getESuperTypes().add(this.getEcucReferrable());
		rteEClass.getESuperTypes().add(this.getEcucModule());
		rteGenerationEClass.getESuperTypes().add(this.getEcucContainer());
		rteBswGeneralEClass.getESuperTypes().add(this.getEcucContainer());
		rteSwComponentInstanceEClass.getESuperTypes().add(this.getEcucContainer());
		rteEventToTaskMappingEClass.getESuperTypes().add(this.getEcucContainer());
		osEClass.getESuperTypes().add(this.getEcucModule());
		osTaskEClass.getESuperTypes().add(this.getEcucContainer());
		rteExclusiveAreaImplementationEClass.getESuperTypes().add(this.getEcucContainer());
		osEventEClass.getESuperTypes().add(this.getEcucContainer());
		comEClass.getESuperTypes().add(this.getEcucModule());
		comConfigEClass.getESuperTypes().add(this.getEcucContainer());
		comSignalEClass.getESuperTypes().add(this.getEcucContainer());
		comSignalGroupEClass.getESuperTypes().add(this.getEcucContainer());
		comGroupSignalEClass.getESuperTypes().add(this.getEcucContainer());
		osAlarmEClass.getESuperTypes().add(this.getEcucContainer());
		osResourceEClass.getESuperTypes().add(this.getEcucContainer());
		osApplicationEClass.getESuperTypes().add(this.getEcucContainer());
		ecuCEClass.getESuperTypes().add(this.getEcucModule());
		ecucPartitionCollectionEClass.getESuperTypes().add(this.getEcucContainer());
		ecucPartitionEClass.getESuperTypes().add(this.getEcucContainer());
		osSpinlockEClass.getESuperTypes().add(this.getEcucContainer());
		rteOsInteractionEClass.getESuperTypes().add(this.getEcucContainer());
		rteUsedOsActivationEClass.getESuperTypes().add(this.getEcucContainer());
		rteInitializationBehaviorEClass.getESuperTypes().add(this.getEcucContainer());
		osIocEClass.getESuperTypes().add(this.getEcucContainer());
		osIocCommunicationEClass.getESuperTypes().add(this.getEcucContainer());
		osIocSenderPropertiesEClass.getESuperTypes().add(this.getEcucContainer());
		osIocReceiverPropertiesEClass.getESuperTypes().add(this.getEcucContainer());
		osIocDataPropertiesEClass.getESuperTypes().add(this.getEcucContainer());
		osApplicationTrustedFunctionEClass.getESuperTypes().add(this.getEcucContainer());
		osOSEClass.getESuperTypes().add(this.getEcucContainer());
		rteBswEventToTaskMappingEClass.getESuperTypes().add(this.getEcucContainer());
		rteBswRequiredModeGroupConnectionEClass.getESuperTypes().add(this.getEcucContainer());
		rteBswModuleInstanceEClass.getESuperTypes().add(this.getEcucContainer());
		rteBswExclusiveAreaImplEClass.getESuperTypes().add(this.getEcucContainer());
		osSystemCycleEClass.getESuperTypes().add(this.getEcucContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(ecucObjectEClass, EcucObject.class, "EcucObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecucReferrableEClass, EcucReferrable.class, "EcucReferrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucReferrable_Id(), theM2Package.getString(), "id", null, 1, 1, EcucReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcucReferrable_ShortName(), theM2Package.getIdentifier(), "shortName", null, 1, 1, EcucReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcucReferrable_Reference(), theM2Package.getRef(), "reference", null, 1, 1, EcucReferrable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEcucReferrable_Source(), theM2Package.getIdentifiable(), null, "source", null, 1, 1, EcucReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucModuleEClass, EcucModule.class, "EcucModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucModule_ReferenceBase(), theM2Package.getRef(), "referenceBase", null, 1, 1, EcucModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucContainerEClass, EcucContainer.class, "EcucContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rteEClass, Rte.class, "Rte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRte_RteGeneration(), this.getRteGeneration(), null, "rteGeneration", null, 1, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRte_RteBswGeneral(), this.getRteBswGeneral(), null, "rteBswGeneral", null, 1, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRte_RteSwComponentInstance(), this.getRteSwComponentInstance(), null, "rteSwComponentInstance", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRte_RteOsInteraction(), this.getRteOsInteraction(), null, "rteOsInteraction", null, 1, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRte_RteInitializationBehavior(), this.getRteInitializationBehavior(), null, "rteInitializationBehavior", null, 1, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRte_RteBswModuleInstance(), this.getRteBswModuleInstance(), null, "rteBswModuleInstance", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteGenerationEClass, RteGeneration.class, "RteGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rteBswGeneralEClass, RteBswGeneral.class, "RteBswGeneral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteBswGeneral_RteUseComShadowSignalApi(), theM2Package.getBoolean(), "rteUseComShadowSignalApi", null, 1, 1, RteBswGeneral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucRootEClass, EcucRoot.class, "EcucRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcucRoot_Rte(), this.getRte(), null, "rte", null, 0, 1, EcucRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucRoot_Os(), this.getOs(), null, "os", null, 0, 1, EcucRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucRoot_Com(), this.getCom(), null, "com", null, 0, 1, EcucRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucRoot_EcuC(), this.getEcuC(), null, "ecuC", null, 0, 1, EcucRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteSwComponentInstanceEClass, RteSwComponentInstance.class, "RteSwComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteSwComponentInstance_RteEventToTaskMapping(), this.getRteEventToTaskMapping(), null, "rteEventToTaskMapping", null, 0, -1, RteSwComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteSwComponentInstance_RteExclusiveAreaImplementation(), this.getRteExclusiveAreaImplementation(), null, "rteExclusiveAreaImplementation", null, 0, -1, RteSwComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteSwComponentInstance_RteSoftwareComponentInstance(), theM2Package.getSwComponentPrototype(), null, "rteSoftwareComponentInstance", null, 0, 1, RteSwComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteEventToTaskMappingEClass, RteEventToTaskMapping.class, "RteEventToTaskMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteEventToTaskMapping_RteEvent(), theM2Package.getRteEvent(), theM2Package.getRteEvent_Config(), "rteEvent", null, 1, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteEventToTaskMapping_RteActivationOffset(), theM2Package.getTimeValue(), "rteActivationOffset", null, 0, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteEventToTaskMapping_RteMappedToTask(), this.getOsTask(), this.getOsTask_MappedRteEvent(), "rteMappedToTask", null, 0, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteEventToTaskMapping_RtePositionInTask(), theM2Package.getInteger(), "rtePositionInTask", null, 0, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteEventToTaskMapping_RteUsedOsAlarm(), this.getOsAlarm(), null, "rteUsedOsAlarm", null, 0, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteEventToTaskMapping_RteUsedOsEvent(), this.getOsEvent(), null, "rteUsedOsEvent", null, 0, 1, RteEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEClass, Os.class, "Os", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOs_OsTask(), this.getOsTask(), null, "osTask", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsEvent(), this.getOsEvent(), null, "osEvent", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsApplication(), this.getOsApplication(), null, "osApplication", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsAlarm(), this.getOsAlarm(), null, "osAlarm", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsResource(), this.getOsResource(), null, "osResource", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsSpinlock(), this.getOsSpinlock(), null, "osSpinlock", null, 0, -1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsIoc(), this.getOsIoc(), null, "osIoc", null, 0, 1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOs_OsOS(), this.getOsOS(), null, "osOS", null, 1, 1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osTaskEClass, OsTask.class, "OsTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsTask_OsTaskActivation(), theM2Package.getPositiveInteger(), "osTaskActivation", null, 1, 1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsTask_OsTaskPriority(), theM2Package.getInteger(), "osTaskPriority", null, 1, 1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsTask_OsTaskSchedule(), this.getOsTaskScheduleEnum(), "osTaskSchedule", null, 1, 1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsTask_OsTaskAccessingApplication(), this.getOsApplication(), null, "osTaskAccessingApplication", null, 0, -1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOsTask_OsTaskEvent(), this.getOsEvent(), null, "osTaskEvent", null, 0, -1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOsTask_MappedRteEvent(), this.getRteEventToTaskMapping(), this.getRteEventToTaskMapping_RteMappedToTask(), "mappedRteEvent", null, 0, -1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOsTask_OwnerApplication(), this.getOsApplication(), this.getOsApplication_OsAppTask(), "ownerApplication", null, 0, -1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOsTask_MappedRteBswEvent(), this.getRteBswEventToTaskMapping(), this.getRteBswEventToTaskMapping_RteBswMappedToTask(), "mappedRteBswEvent", null, 0, -1, OsTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteExclusiveAreaImplementationEClass, RteExclusiveAreaImplementation.class, "RteExclusiveAreaImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteExclusiveAreaImplementation_RteExclusiveAreaImplMechanism(), this.getRteExclusiveAreaImplMechanismEnum(), "rteExclusiveAreaImplMechanism", null, 0, 1, RteExclusiveAreaImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteExclusiveAreaImplementation_RteExclusiveArea(), theM2Package.getExclusiveArea(), theM2Package.getExclusiveArea_SwcConfig(), "rteExclusiveArea", null, 1, 1, RteExclusiveAreaImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteExclusiveAreaImplementation_RteExclusiveAreaOsResource(), this.getOsResource(), null, "rteExclusiveAreaOsResource", null, 0, 1, RteExclusiveAreaImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteExclusiveAreaImplementation_RteExclusiveAreaOsSpinlock(), this.getOsSpinlock(), null, "rteExclusiveAreaOsSpinlock", null, 0, 1, RteExclusiveAreaImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEventEClass, OsEvent.class, "OsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsEvent_OsEventMask(), theM2Package.getUnlimitedInteger(), "osEventMask", null, 0, 1, OsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comEClass, Com.class, "Com", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCom_ComConfig(), this.getComConfig(), null, "comConfig", null, 1, 1, Com.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comConfigEClass, ComConfig.class, "ComConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComConfig_ComSignal(), this.getComSignal(), null, "comSignal", null, 0, -1, ComConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComConfig_ComSignalGroup(), this.getComSignalGroup(), null, "comSignalGroup", null, 0, -1, ComConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comSignalEClass, ComSignal.class, "ComSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSignal_ComSystemTemplateSystemSignal(), theM2Package.getISignalToIPduMapping(), null, "comSystemTemplateSystemSignal", null, 0, 1, ComSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignal_ComHandleId(), theM2Package.getInteger(), "comHandleId", null, 1, 1, ComSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignal_ComTransferProperty(), this.getComTransferPropertyEnum(), "comTransferProperty", null, 0, 1, ComSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignal_ComBitSize(), theM2Package.getInteger(), "comBitSize", null, 0, 1, ComSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignal_ComSignalLength(), theM2Package.getInteger(), "comSignalLength", null, 0, 1, ComSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComSignal__TransfersImmediately(), ecorePackage.getEBoolean(), "transfersImmediately", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comSignalGroupEClass, ComSignalGroup.class, "ComSignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSignalGroup_ComGroupSignal(), this.getComGroupSignal(), null, "comGroupSignal", null, 0, -1, ComSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSignalGroup_ComSystemTemplateSignalGroup(), theM2Package.getISignalToIPduMapping(), null, "comSystemTemplateSignalGroup", null, 0, 1, ComSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignalGroup_ComHandleId(), theM2Package.getInteger(), "comHandleId", null, 1, 1, ComSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComSignalGroup_ComTransferProperty(), this.getComTransferPropertyEnum(), "comTransferProperty", null, 0, 1, ComSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComSignalGroup__TransfersImmediately(), ecorePackage.getEBoolean(), "transfersImmediately", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comGroupSignalEClass, ComGroupSignal.class, "ComGroupSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComGroupSignal_ComSystemTemplateSystemSignal(), theM2Package.getISignalToIPduMapping(), null, "comSystemTemplateSystemSignal", null, 0, 1, ComGroupSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComGroupSignal_ComHandleId(), theM2Package.getInteger(), "comHandleId", null, 1, 1, ComGroupSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComGroupSignal_ComBitSize(), theM2Package.getInteger(), "comBitSize", null, 0, 1, ComGroupSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComGroupSignal_ComSignalLength(), theM2Package.getInteger(), "comSignalLength", null, 0, 1, ComGroupSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osAlarmEClass, OsAlarm.class, "OsAlarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsAlarm_ExpectedConfig(), this.getRteUsedOsActivation(), this.getRteUsedOsActivation_RteActivationOsAlarm(), "expectedConfig", null, 0, -1, OsAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(osResourceEClass, OsResource.class, "OsResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osApplicationEClass, OsApplication.class, "OsApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsApplication_OsApplicationCoreAssignment(), theM2Package.getInteger(), "osApplicationCoreAssignment", null, 0, 1, OsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsApplication_OsTrusted(), theM2Package.getBoolean(), "osTrusted", null, 1, 1, OsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsApplication_OsAppEcucPartition(), this.getEcucPartition(), this.getEcucPartition_ImplOsApplication(), "osAppEcucPartition", null, 0, 1, OsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsApplication_OsApplicationTrustedFunction(), this.getOsApplicationTrustedFunction(), this.getOsApplicationTrustedFunction_Parent(), "osApplicationTrustedFunction", null, 0, -1, OsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsApplication_OsAppTask(), this.getOsTask(), this.getOsTask_OwnerApplication(), "osAppTask", null, 0, -1, OsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecuCEClass, EcuC.class, "EcuC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcuC_EcucPartitionCollection(), this.getEcucPartitionCollection(), null, "ecucPartitionCollection", null, 0, 1, EcuC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucPartitionCollectionEClass, EcucPartitionCollection.class, "EcucPartitionCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcucPartitionCollection_EcucPartition(), this.getEcucPartition(), null, "ecucPartition", null, 0, -1, EcucPartitionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEcucPartitionCollection__GetAssignedCores(), theM2Package.getInteger(), "getAssignedCores", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(ecucPartitionEClass, EcucPartition.class, "EcucPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucPartition_EcucPartitionBswModuleExecution(), theM2Package.getBoolean(), "ecucPartitionBswModuleExecution", null, 1, 1, EcucPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcucPartition_PartitionCanBeRestarted(), theM2Package.getBoolean(), "partitionCanBeRestarted", null, 1, 1, EcucPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucPartition_EcucPartitionSoftwareComponent(), theInstancePackage.getSwComponentInstanceInSystem(), theInstancePackage.getSwComponentInstanceInSystem_OwnerPartition(), "ecucPartitionSoftwareComponent", null, 0, -1, EcucPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucPartition_ImplOsApplication(), this.getOsApplication(), this.getOsApplication_OsAppEcucPartition(), "implOsApplication", null, 0, -1, EcucPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEcucPartition__IsTrusted(), ecorePackage.getEBoolean(), "isTrusted", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEcucPartition__GetOwnerCore(), theM2Package.getInteger(), "getOwnerCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(osSpinlockEClass, OsSpinlock.class, "OsSpinlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsSpinlock_OsSpinlockAccessingApplication(), this.getOsApplication(), null, "osSpinlockAccessingApplication", null, 0, -1, OsSpinlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsSpinlock_OsSpinlockLockMethod(), this.getOsSpinlockLockMethodEnum(), "osSpinlockLockMethod", null, 1, 1, OsSpinlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteOsInteractionEClass, RteOsInteraction.class, "RteOsInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteOsInteraction_RteUsedOsActivation(), this.getRteUsedOsActivation(), null, "rteUsedOsActivation", null, 0, -1, RteOsInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteUsedOsActivationEClass, RteUsedOsActivation.class, "RteUsedOsActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteUsedOsActivation_RteExpectedTickDuration(), theM2Package.getTimeValue(), "rteExpectedTickDuration", null, 1, 1, RteUsedOsActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteUsedOsActivation_RteExpectedActivationOffset(), theM2Package.getTimeValue(), "rteExpectedActivationOffset", null, 1, 1, RteUsedOsActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteUsedOsActivation_RteActivationOsAlarm(), this.getOsAlarm(), this.getOsAlarm_ExpectedConfig(), "rteActivationOsAlarm", null, 0, 1, RteUsedOsActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteInitializationBehaviorEClass, RteInitializationBehavior.class, "RteInitializationBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteInitializationBehavior_RteInitializationStrategy(), this.getRteInitializationStrategyEnum(), "rteInitializationStrategy", null, 1, 1, RteInitializationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteInitializationBehavior_RteSectionInitializationPolicy(), theM2Package.getSectionInitializationPolicyType(), "rteSectionInitializationPolicy", null, 1, -1, RteInitializationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osIocEClass, OsIoc.class, "OsIoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsIoc_OsIocCommunication(), this.getOsIocCommunication(), null, "osIocCommunication", null, 0, -1, OsIoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(osIocCommunicationEClass, OsIocCommunication.class, "OsIocCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsIocCommunication_OsIocSenderProperties(), this.getOsIocSenderProperties(), this.getOsIocSenderProperties_Parent(), "osIocSenderProperties", null, 1, -1, OsIocCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsIocCommunication_OsIocReceiverProperties(), this.getOsIocReceiverProperties(), null, "osIocReceiverProperties", null, 1, 1, OsIocCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsIocCommunication_OsIocDataProperties(), this.getOsIocDataProperties(), null, "osIocDataProperties", null, 1, -1, OsIocCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsIocCommunication_OsIocBufferLength(), theM2Package.getInteger(), "osIocBufferLength", null, 0, 1, OsIocCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOsIocCommunication__GetLoopbackSenderProperties(), this.getOsIocSenderProperties(), "getLoopbackSenderProperties", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(osIocSenderPropertiesEClass, OsIocSenderProperties.class, "OsIocSenderProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsIocSenderProperties_OsIocSendingOsApplication(), this.getOsApplication(), null, "osIocSendingOsApplication", null, 1, 1, OsIocSenderProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsIocSenderProperties_Parent(), this.getOsIocCommunication(), this.getOsIocCommunication_OsIocSenderProperties(), "parent", null, 1, 1, OsIocSenderProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsIocSenderProperties_OsIocSenderId(), theM2Package.getInteger(), "osIocSenderId", null, 0, 1, OsIocSenderProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osIocReceiverPropertiesEClass, OsIocReceiverProperties.class, "OsIocReceiverProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsIocReceiverProperties_OsIocReceivingOsApplication(), this.getOsApplication(), null, "osIocReceivingOsApplication", null, 1, 1, OsIocReceiverProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osIocDataPropertiesEClass, OsIocDataProperties.class, "OsIocDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsIocDataProperties_OsIocDataPropertyIndex(), theM2Package.getInteger(), "osIocDataPropertyIndex", null, 0, 1, OsIocDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsIocDataProperties_OsIocInitValue(), theM2Package.getVerbatimString(), "osIocInitValue", null, 0, 1, OsIocDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsIocDataProperties_OsIocDataType(), theM2Package.getImplementationDataType(), null, "osIocDataType", null, 1, 1, OsIocDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osApplicationTrustedFunctionEClass, OsApplicationTrustedFunction.class, "OsApplicationTrustedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsApplicationTrustedFunction_OsTrustedFunctionName(), theM2Package.getCIdentifier(), "osTrustedFunctionName", null, 1, 1, OsApplicationTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsApplicationTrustedFunction_Parent(), this.getOsApplication(), this.getOsApplication_OsApplicationTrustedFunction(), "parent", null, 1, 1, OsApplicationTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(osOSEClass, OsOS.class, "OsOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsOS_OsNumberOfCores(), theM2Package.getInteger(), "osNumberOfCores", null, 0, 1, OsOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsOS_OsMasterCoreId(), theM2Package.getInteger(), "osMasterCoreId", null, 0, 1, OsOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsOS_OsSystemCycle(), this.getOsSystemCycle(), null, "osSystemCycle", null, 0, 1, OsOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOsOS__IsMulticoreOs(), ecorePackage.getEBoolean(), "isMulticoreOs", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rteBswEventToTaskMappingEClass, RteBswEventToTaskMapping.class, "RteBswEventToTaskMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteBswEventToTaskMapping_RteBswActivationOffset(), theM2Package.getTimeValue(), "rteBswActivationOffset", null, 0, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswEventToTaskMapping_RteBswEvent(), theM2Package.getBswEvent(), theM2Package.getBswEvent_Config(), "rteBswEvent", null, 1, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteBswEventToTaskMapping_RteBswPositionInTask(), theM2Package.getInteger(), "rteBswPositionInTask", null, 0, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswEventToTaskMapping_RteBswMappedToTask(), this.getOsTask(), this.getOsTask_MappedRteBswEvent(), "rteBswMappedToTask", null, 0, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswEventToTaskMapping_RteBswUsedOsAlarm(), this.getOsAlarm(), null, "rteBswUsedOsAlarm", null, 0, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswEventToTaskMapping_RteBswUsedOsEvent(), this.getOsEvent(), null, "rteBswUsedOsEvent", null, 0, 1, RteBswEventToTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteBswRequiredModeGroupConnectionEClass, RteBswRequiredModeGroupConnection.class, "RteBswRequiredModeGroupConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteBswRequiredModeGroupConnection_Parent(), this.getRteBswModuleInstance(), this.getRteBswModuleInstance_RteBswRequiredModeGroupConnection(), "parent", null, 1, 1, RteBswRequiredModeGroupConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswRequiredModeGroupConnection_RteBswProvidedModeGroup(), theM2Package.getModeDeclarationGroupPrototype(), null, "rteBswProvidedModeGroup", null, 1, 1, RteBswRequiredModeGroupConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswRequiredModeGroupConnection_RteBswRequiredModeGroup(), theM2Package.getModeDeclarationGroupPrototype(), null, "rteBswRequiredModeGroup", null, 1, 1, RteBswRequiredModeGroupConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteBswModuleInstanceEClass, RteBswModuleInstance.class, "RteBswModuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteBswModuleInstance_RteBswEventToTaskMapping(), this.getRteBswEventToTaskMapping(), null, "rteBswEventToTaskMapping", null, 0, -1, RteBswModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswModuleInstance_RteBswExclusiveAreaImpl(), this.getRteBswExclusiveAreaImpl(), null, "rteBswExclusiveAreaImpl", null, 0, -1, RteBswModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswModuleInstance_RteBswImplementation(), theM2Package.getBswImplementation(), null, "rteBswImplementation", null, 1, 1, RteBswModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswModuleInstance_RteBswRequiredModeGroupConnection(), this.getRteBswRequiredModeGroupConnection(), this.getRteBswRequiredModeGroupConnection_Parent(), "rteBswRequiredModeGroupConnection", null, 0, -1, RteBswModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rteBswExclusiveAreaImplEClass, RteBswExclusiveAreaImpl.class, "RteBswExclusiveAreaImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteBswExclusiveAreaImpl_RteBswExclusiveArea(), theM2Package.getExclusiveArea(), theM2Package.getExclusiveArea_BswConfig(), "rteBswExclusiveArea", null, 1, 1, RteBswExclusiveAreaImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsResource(), this.getOsResource(), null, "rteBswExclusiveAreaOsResource", null, 0, 1, RteBswExclusiveAreaImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteBswExclusiveAreaImpl_RteExclusiveAreaImplMechanism(), this.getRteExclusiveAreaImplMechanismEnum(), "rteExclusiveAreaImplMechanism", null, 0, 1, RteBswExclusiveAreaImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsSpinlock(), this.getOsSpinlock(), null, "rteBswExclusiveAreaOsSpinlock", null, 0, 1, RteBswExclusiveAreaImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osSystemCycleEClass, OsSystemCycle.class, "OsSystemCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(osTaskScheduleEnumEEnum, OsTaskScheduleEnum.class, "OsTaskScheduleEnum");
		addEEnumLiteral(osTaskScheduleEnumEEnum, OsTaskScheduleEnum.FULL);
		addEEnumLiteral(osTaskScheduleEnumEEnum, OsTaskScheduleEnum.NON);

		initEEnum(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.class, "RteExclusiveAreaImplMechanismEnum");
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.ALL_INTERRUPT_BLOCKING);
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.COOPERATIVE_RUNNABLE_PLACEMENT);
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.OS_INTERRUPT_BLOCKING);
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.OS_RESOURCE);
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.OS_SPINLOCK);
		addEEnumLiteral(rteExclusiveAreaImplMechanismEnumEEnum, RteExclusiveAreaImplMechanismEnum.NONE);

		initEEnum(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.class, "ComTransferPropertyEnum");
		addEEnumLiteral(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.PENDING);
		addEEnumLiteral(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.TRIGGERED);
		addEEnumLiteral(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.TRIGGERED_ON_CHANGE);
		addEEnumLiteral(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.TRIGGERED_ON_CHANGE_WITHOUT_REPETITION);
		addEEnumLiteral(comTransferPropertyEnumEEnum, ComTransferPropertyEnum.TRIGGERED_WITHOUT_REPETITION);

		initEEnum(osSpinlockLockMethodEnumEEnum, OsSpinlockLockMethodEnum.class, "OsSpinlockLockMethodEnum");
		addEEnumLiteral(osSpinlockLockMethodEnumEEnum, OsSpinlockLockMethodEnum.LOCK_NOTHING);
		addEEnumLiteral(osSpinlockLockMethodEnumEEnum, OsSpinlockLockMethodEnum.LOCK_CAT2_INTERRUPTS);
		addEEnumLiteral(osSpinlockLockMethodEnumEEnum, OsSpinlockLockMethodEnum.LOCK_ALL_INTERRUPTS);

		initEEnum(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.class, "RteInitializationStrategyEnum");
		addEEnumLiteral(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION);
		addEEnumLiteral(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART);
		addEEnumLiteral(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_RTE_START);
		addEEnumLiteral(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART);
		addEEnumLiteral(rteInitializationStrategyEnumEEnum, RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_NONE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// stereotypes
		createStereotypesAnnotations();
		// tags
		createTagsAnnotations();
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
	 * Initializes the annotations for <b>stereotypes</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStereotypesAnnotations() {
		String source = "stereotypes";			
		addAnnotation
		  (getEcucReferrable_ShortName(), 
		   source, 
		   new String[] {
			 "nonEcuc", "true"
		   });		
		addAnnotation
		  (getEcucReferrable_Source(), 
		   source, 
		   new String[] {
			 "nonEcuc", "true"
		   });		
		addAnnotation
		  (getEcucModule_ReferenceBase(), 
		   source, 
		   new String[] {
			 "nonEcuc", "true"
		   });									
	}

	/**
	 * Initializes the annotations for <b>tags</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTagsAnnotations() {
		String source = "tags";						
		addAnnotation
		  (getOsTask_OsTaskAccessingApplication(), 
		   source, 
		   new String[] {
			 "ecuc.definitionShortName", "OsTaskAccessingApplication"
		   });							
		addAnnotation
		  (getOsSpinlock_OsSpinlockAccessingApplication(), 
		   source, 
		   new String[] {
			 "ecuc.definitionShortName", "OsSpinlockAccessingApplication"
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
		  (getComSignal__TransfersImmediately(), 
		   source, 
		   new String[] {
			 "body", "not comTransferProperty.oclIsUndefined() and comTransferProperty <> ComTransferPropertyEnum::PENDING"
		   });		
		addAnnotation
		  (getComSignalGroup__TransfersImmediately(), 
		   source, 
		   new String[] {
			 "body", "not comTransferProperty.oclIsUndefined() and comTransferProperty <> ComTransferPropertyEnum::PENDING"
		   });		
		addAnnotation
		  (getEcucPartitionCollection__GetAssignedCores(), 
		   source, 
		   new String[] {
			 "body", "self.ecucPartition.getOwnerCore()\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getEcucPartition__IsTrusted(), 
		   source, 
		   new String[] {
			 "body", "let osApp : OsApplication = self.implOsApplication->any(true)\n\t\t\t\t\t\t\tin if osApp.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\t\telse osApp.osTrusted\n\t\t\t\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getEcucPartition__GetOwnerCore(), 
		   source, 
		   new String[] {
			 "body", "let osApp : OsApplication = self.implOsApplication->any(true)\n\t\t\t\t\t\t\tin if osApp.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\t\telse osApp.osApplicationCoreAssignment\n\t\t\t\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getOsIocCommunication__GetLoopbackSenderProperties(), 
		   source, 
		   new String[] {
			 "body", "let loopback : OsIocSenderProperties = osIocSenderProperties\n\t\t\t\t\t->any(osIocSendingOsApplication = self.osIocReceiverProperties.osIocReceivingOsApplication)\n\t\t\t\tin if loopback.oclIsUndefined()\n\t\t\t\t\tthen null else loopback\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getOsOS__IsMulticoreOs(), 
		   source, 
		   new String[] {
			 "body", "not self.osNumberOfCores.oclIsUndefined()"
		   });
	}

} //EcucPackageImpl
