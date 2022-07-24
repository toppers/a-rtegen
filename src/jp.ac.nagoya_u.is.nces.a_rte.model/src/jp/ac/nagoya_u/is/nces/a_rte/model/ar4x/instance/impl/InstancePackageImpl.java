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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
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
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceReferrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceInCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataInstanceInCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pVariableDataInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rVariableDataInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyDataInstanceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationDataInstanceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOperationInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pOperationInstanceInSwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInstanceInCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyOperationInstanceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInstanceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swComponentInstanceInSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataInstanceEClass = null;

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancePackageImpl() {
		super(eNS_URI, InstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancePackage init() {
		if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Obtain or create and register package
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theEcucPackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theEcucPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
		return theInstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceReferrable() {
		return instanceReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceReferrable_Id() {
		return (EAttribute)instanceReferrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstanceInComposition() {
		return portInstanceInCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceInComposition_ContextComponent() {
		return (EReference)portInstanceInCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceInComposition_Prototype() {
		return (EReference)portInstanceInCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceInComposition_DataElement() {
		return (EReference)portInstanceInCompositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceInComposition_Operation() {
		return (EReference)portInstanceInCompositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataInstanceInSwc() {
		return variableDataInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInSwc_Prototype() {
		return (EReference)variableDataInstanceInSwcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInSwc_ContextPort() {
		return (EReference)variableDataInstanceInSwcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInSwc_Instance() {
		return (EReference)variableDataInstanceInSwcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetTargetShortName() {
		return variableDataInstanceInSwcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__IsEventSemantics() {
		return variableDataInstanceInSwcEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetSwImplPolicy() {
		return variableDataInstanceInSwcEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetBaseType() {
		return variableDataInstanceInSwcEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetInvalidValue() {
		return variableDataInstanceInSwcEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetSwAddrMethod() {
		return variableDataInstanceInSwcEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetSwAlignment() {
		return variableDataInstanceInSwcEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetApplicationDataType() {
		return variableDataInstanceInSwcEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetImplementationDataType() {
		return variableDataInstanceInSwcEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInSwc__GetOwnerAtomicSwc() {
		return variableDataInstanceInSwcEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataInstanceInComposition() {
		return variableDataInstanceInCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInComposition_Prototype() {
		return (EReference)variableDataInstanceInCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInComposition_Parent() {
		return (EReference)variableDataInstanceInCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInComposition_RequesterConnection() {
		return (EReference)variableDataInstanceInCompositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataInstanceInComposition_ProviderConnection() {
		return (EReference)variableDataInstanceInCompositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInComposition__IsProvided() {
		return variableDataInstanceInCompositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInComposition__IsRequired() {
		return variableDataInstanceInCompositionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableDataInstanceInComposition__GetTargetShortName() {
		return variableDataInstanceInCompositionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVariableDataInstanceInSwc() {
		return pVariableDataInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVariableDataInstanceInSwc_ContextPPort() {
		return (EReference)pVariableDataInstanceInSwcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__IsInvalidationEnabled() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__GetInvalidationPolicy() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__GetInitValue() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__GetComSpec() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__IsAccessedByDataSendPoint() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__IsTAckEnabled() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__IsTAckTimeoutEnabled() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVariableDataInstanceInSwc__GetRelatedDataSendCompletedEvent() {
		return pVariableDataInstanceInSwcEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRVariableDataInstanceInSwc() {
		return rVariableDataInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRVariableDataInstanceInSwc_ContextRPort() {
		return (EReference)rVariableDataInstanceInSwcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__IsFilterEnabled() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetFilter() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__IsAliveTimeoutEnabled() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__IsInvalidationEnabled() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__IsInvalidationKeep() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__IsInvalidationReplace() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetInvalidationPolicy() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetInitValue() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetQueueLength() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetComSpec() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetRelatedDataReceivedEvent() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRVariableDataInstanceInSwc__GetRelatedDataReceiveErrorEvent() {
		return rVariableDataInstanceInSwcEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyDataInstanceConnector() {
		return assemblyDataInstanceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDataInstanceConnector_Provider() {
		return (EReference)assemblyDataInstanceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDataInstanceConnector_Requester() {
		return (EReference)assemblyDataInstanceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationDataInstanceConnector() {
		return delegationDataInstanceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationDataInstanceConnector_Outer() {
		return (EReference)delegationDataInstanceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationDataInstanceConnector_Inner() {
		return (EReference)delegationDataInstanceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationInstanceInSwc() {
		return operationInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInSwc_Prototype() {
		return (EReference)operationInstanceInSwcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInSwc_ContextPort() {
		return (EReference)operationInstanceInSwcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInSwc_Instance() {
		return (EReference)operationInstanceInSwcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationInstanceInSwc__GetOwnerAtomicSwc() {
		return operationInstanceInSwcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROperationInstanceInSwc() {
		return rOperationInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOperationInstanceInSwc() {
		return pOperationInstanceInSwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOperationInstanceInSwc_OperationInvokedEvent() {
		return (EReference)pOperationInstanceInSwcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationInstanceInComposition() {
		return operationInstanceInCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInComposition_Prototype() {
		return (EReference)operationInstanceInCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInComposition_Parent() {
		return (EReference)operationInstanceInCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInComposition_RequesterConnection() {
		return (EReference)operationInstanceInCompositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInstanceInComposition_ProviderConnection() {
		return (EReference)operationInstanceInCompositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationInstanceInComposition__GetTargetShortName() {
		return operationInstanceInCompositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyOperationInstanceConnector() {
		return assemblyOperationInstanceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyOperationInstanceConnector_Requester() {
		return (EReference)assemblyOperationInstanceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyOperationInstanceConnector_Provider() {
		return (EReference)assemblyOperationInstanceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInstanceObject() {
		return iInstanceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIInstanceObject_InstanceId() {
		return (EAttribute)iInstanceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwComponentInstanceInSystem() {
		return swComponentInstanceInSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentInstanceInSystem_ContextRootComposition() {
		return (EReference)swComponentInstanceInSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentInstanceInSystem_Prototype() {
		return (EReference)swComponentInstanceInSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentInstanceInSystem_OwnerPartition() {
		return (EReference)swComponentInstanceInSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceRoot() {
		return instanceRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_AssemblyDataInstanceConnector() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_DelegationDataInstanceConnector() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_SwComponentInstanceInSystem() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_PortInstanceInComposition() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_VariableDataInstanceInSwc() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_OperationInstanceInSwc() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRoot_AssemblyOperationInstanceConnector() {
		return (EReference)instanceRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataInstance() {
		return variableDataInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactory getInstanceFactory() {
		return (InstanceFactory)getEFactoryInstance();
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
		instanceReferrableEClass = createEClass(INSTANCE_REFERRABLE);
		createEAttribute(instanceReferrableEClass, INSTANCE_REFERRABLE__ID);

		portInstanceInCompositionEClass = createEClass(PORT_INSTANCE_IN_COMPOSITION);
		createEReference(portInstanceInCompositionEClass, PORT_INSTANCE_IN_COMPOSITION__CONTEXT_COMPONENT);
		createEReference(portInstanceInCompositionEClass, PORT_INSTANCE_IN_COMPOSITION__PROTOTYPE);
		createEReference(portInstanceInCompositionEClass, PORT_INSTANCE_IN_COMPOSITION__DATA_ELEMENT);
		createEReference(portInstanceInCompositionEClass, PORT_INSTANCE_IN_COMPOSITION__OPERATION);

		variableDataInstanceInSwcEClass = createEClass(VARIABLE_DATA_INSTANCE_IN_SWC);
		createEReference(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE);
		createEReference(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT);
		createEReference(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE);
		createEOperation(variableDataInstanceInSwcEClass, VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC);

		variableDataInstanceInCompositionEClass = createEClass(VARIABLE_DATA_INSTANCE_IN_COMPOSITION);
		createEReference(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE);
		createEReference(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT);
		createEReference(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION);
		createEReference(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION);
		createEOperation(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED);
		createEOperation(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED);
		createEOperation(variableDataInstanceInCompositionEClass, VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME);

		pVariableDataInstanceInSwcEClass = createEClass(PVARIABLE_DATA_INSTANCE_IN_SWC);
		createEReference(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PPORT);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___IS_ACCESSED_BY_DATA_SEND_POINT);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___IS_TACK_ENABLED);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___IS_TACK_TIMEOUT_ENABLED);
		createEOperation(pVariableDataInstanceInSwcEClass, PVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_SEND_COMPLETED_EVENT);

		rVariableDataInstanceInSwcEClass = createEClass(RVARIABLE_DATA_INSTANCE_IN_SWC);
		createEReference(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_KEEP);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_REPLACE);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVED_EVENT);
		createEOperation(rVariableDataInstanceInSwcEClass, RVARIABLE_DATA_INSTANCE_IN_SWC___GET_RELATED_DATA_RECEIVE_ERROR_EVENT);

		assemblyDataInstanceConnectorEClass = createEClass(ASSEMBLY_DATA_INSTANCE_CONNECTOR);
		createEReference(assemblyDataInstanceConnectorEClass, ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER);
		createEReference(assemblyDataInstanceConnectorEClass, ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER);

		delegationDataInstanceConnectorEClass = createEClass(DELEGATION_DATA_INSTANCE_CONNECTOR);
		createEReference(delegationDataInstanceConnectorEClass, DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER);
		createEReference(delegationDataInstanceConnectorEClass, DELEGATION_DATA_INSTANCE_CONNECTOR__INNER);

		operationInstanceInSwcEClass = createEClass(OPERATION_INSTANCE_IN_SWC);
		createEReference(operationInstanceInSwcEClass, OPERATION_INSTANCE_IN_SWC__PROTOTYPE);
		createEReference(operationInstanceInSwcEClass, OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT);
		createEReference(operationInstanceInSwcEClass, OPERATION_INSTANCE_IN_SWC__INSTANCE);
		createEOperation(operationInstanceInSwcEClass, OPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC);

		rOperationInstanceInSwcEClass = createEClass(ROPERATION_INSTANCE_IN_SWC);

		pOperationInstanceInSwcEClass = createEClass(POPERATION_INSTANCE_IN_SWC);
		createEReference(pOperationInstanceInSwcEClass, POPERATION_INSTANCE_IN_SWC__OPERATION_INVOKED_EVENT);

		operationInstanceInCompositionEClass = createEClass(OPERATION_INSTANCE_IN_COMPOSITION);
		createEReference(operationInstanceInCompositionEClass, OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE);
		createEReference(operationInstanceInCompositionEClass, OPERATION_INSTANCE_IN_COMPOSITION__PARENT);
		createEReference(operationInstanceInCompositionEClass, OPERATION_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION);
		createEReference(operationInstanceInCompositionEClass, OPERATION_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION);
		createEOperation(operationInstanceInCompositionEClass, OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME);

		assemblyOperationInstanceConnectorEClass = createEClass(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR);
		createEReference(assemblyOperationInstanceConnectorEClass, ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER);
		createEReference(assemblyOperationInstanceConnectorEClass, ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__PROVIDER);

		iInstanceObjectEClass = createEClass(IINSTANCE_OBJECT);
		createEAttribute(iInstanceObjectEClass, IINSTANCE_OBJECT__INSTANCE_ID);

		swComponentInstanceInSystemEClass = createEClass(SW_COMPONENT_INSTANCE_IN_SYSTEM);
		createEReference(swComponentInstanceInSystemEClass, SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION);
		createEReference(swComponentInstanceInSystemEClass, SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE);
		createEReference(swComponentInstanceInSystemEClass, SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION);

		instanceRootEClass = createEClass(INSTANCE_ROOT);
		createEReference(instanceRootEClass, INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR);
		createEReference(instanceRootEClass, INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR);
		createEReference(instanceRootEClass, INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM);
		createEReference(instanceRootEClass, INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION);
		createEReference(instanceRootEClass, INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC);
		createEReference(instanceRootEClass, INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC);
		createEReference(instanceRootEClass, INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR);

		variableDataInstanceEClass = createEClass(VARIABLE_DATA_INSTANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instanceReferrableEClass.getESuperTypes().add(this.getIInstanceObject());
		portInstanceInCompositionEClass.getESuperTypes().add(this.getInstanceReferrable());
		variableDataInstanceInSwcEClass.getESuperTypes().add(this.getVariableDataInstance());
		variableDataInstanceInCompositionEClass.getESuperTypes().add(this.getVariableDataInstance());
		pVariableDataInstanceInSwcEClass.getESuperTypes().add(this.getVariableDataInstanceInSwc());
		rVariableDataInstanceInSwcEClass.getESuperTypes().add(this.getVariableDataInstanceInSwc());
		operationInstanceInSwcEClass.getESuperTypes().add(this.getInstanceReferrable());
		rOperationInstanceInSwcEClass.getESuperTypes().add(this.getOperationInstanceInSwc());
		pOperationInstanceInSwcEClass.getESuperTypes().add(this.getOperationInstanceInSwc());
		operationInstanceInCompositionEClass.getESuperTypes().add(this.getInstanceReferrable());
		swComponentInstanceInSystemEClass.getESuperTypes().add(this.getInstanceReferrable());
		variableDataInstanceEClass.getESuperTypes().add(this.getInstanceReferrable());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceReferrableEClass, InstanceReferrable.class, "InstanceReferrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceReferrable_Id(), theM2Package.getString(), "id", null, 1, 1, InstanceReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceInCompositionEClass, PortInstanceInComposition.class, "PortInstanceInComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstanceInComposition_ContextComponent(), theM2Package.getSwComponentPrototype(), null, "contextComponent", null, 1, 1, PortInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceInComposition_Prototype(), theM2Package.getPortPrototype(), null, "prototype", null, 1, 1, PortInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceInComposition_DataElement(), this.getVariableDataInstanceInComposition(), this.getVariableDataInstanceInComposition_Parent(), "dataElement", null, 0, -1, PortInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceInComposition_Operation(), this.getOperationInstanceInComposition(), this.getOperationInstanceInComposition_Parent(), "operation", null, 0, -1, PortInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDataInstanceInSwcEClass, VariableDataInstanceInSwc.class, "VariableDataInstanceInSwc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataInstanceInSwc_Prototype(), theM2Package.getVariableDataPrototype(), null, "prototype", null, 1, 1, VariableDataInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataInstanceInSwc_ContextPort(), theM2Package.getPortPrototype(), null, "contextPort", null, 1, 1, VariableDataInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataInstanceInSwc_Instance(), this.getVariableDataInstanceInComposition(), this.getVariableDataInstanceInComposition_Prototype(), "instance", null, 0, -1, VariableDataInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetTargetShortName(), theM2Package.getIdentifier(), "getTargetShortName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__IsEventSemantics(), ecorePackage.getEBoolean(), "isEventSemantics", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetSwImplPolicy(), theM2Package.getSwImplPolicyEnum(), "getSwImplPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetBaseType(), theM2Package.getSwBaseType(), "getBaseType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetInvalidValue(), theM2Package.getValueSpecification(), "getInvalidValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetSwAddrMethod(), theM2Package.getSwAddrMethod(), "getSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetSwAlignment(), theM2Package.getAlignmentType(), "getSwAlignment", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetApplicationDataType(), theM2Package.getApplicationDataType(), "getApplicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetImplementationDataType(), theM2Package.getImplementationDataType(), "getImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInSwc__GetOwnerAtomicSwc(), theM2Package.getAtomicSwComponentType(), "getOwnerAtomicSwc", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableDataInstanceInCompositionEClass, VariableDataInstanceInComposition.class, "VariableDataInstanceInComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataInstanceInComposition_Prototype(), this.getVariableDataInstanceInSwc(), this.getVariableDataInstanceInSwc_Instance(), "prototype", null, 1, 1, VariableDataInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataInstanceInComposition_Parent(), this.getPortInstanceInComposition(), this.getPortInstanceInComposition_DataElement(), "parent", null, 1, 1, VariableDataInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataInstanceInComposition_RequesterConnection(), this.getAssemblyDataInstanceConnector(), this.getAssemblyDataInstanceConnector_Provider(), "requesterConnection", null, 0, -1, VariableDataInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataInstanceInComposition_ProviderConnection(), this.getAssemblyDataInstanceConnector(), this.getAssemblyDataInstanceConnector_Requester(), "providerConnection", null, 0, -1, VariableDataInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getVariableDataInstanceInComposition__IsProvided(), ecorePackage.getEBoolean(), "isProvided", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInComposition__IsRequired(), ecorePackage.getEBoolean(), "isRequired", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableDataInstanceInComposition__GetTargetShortName(), theM2Package.getIdentifier(), "getTargetShortName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pVariableDataInstanceInSwcEClass, PVariableDataInstanceInSwc.class, "PVariableDataInstanceInSwc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPVariableDataInstanceInSwc_ContextPPort(), theM2Package.getPPortPrototype(), null, "contextPPort", null, 1, 1, PVariableDataInstanceInSwc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__IsInvalidationEnabled(), ecorePackage.getEBoolean(), "isInvalidationEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__GetInvalidationPolicy(), theM2Package.getInvalidationPolicy(), "getInvalidationPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__GetInitValue(), theM2Package.getValueSpecification(), "getInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__GetComSpec(), theM2Package.getSenderComSpec(), "getComSpec", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__IsAccessedByDataSendPoint(), ecorePackage.getEBoolean(), "isAccessedByDataSendPoint", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__IsTAckEnabled(), ecorePackage.getEBoolean(), "isTAckEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__IsTAckTimeoutEnabled(), ecorePackage.getEBoolean(), "isTAckTimeoutEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPVariableDataInstanceInSwc__GetRelatedDataSendCompletedEvent(), theM2Package.getDataSendCompletedEvent(), "getRelatedDataSendCompletedEvent", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rVariableDataInstanceInSwcEClass, RVariableDataInstanceInSwc.class, "RVariableDataInstanceInSwc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRVariableDataInstanceInSwc_ContextRPort(), theM2Package.getRPortPrototype(), null, "contextRPort", null, 1, 1, RVariableDataInstanceInSwc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__IsFilterEnabled(), ecorePackage.getEBoolean(), "isFilterEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetFilter(), theM2Package.getDataFilter(), "getFilter", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__IsAliveTimeoutEnabled(), ecorePackage.getEBoolean(), "isAliveTimeoutEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__IsInvalidationEnabled(), ecorePackage.getEBoolean(), "isInvalidationEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__IsInvalidationKeep(), ecorePackage.getEBoolean(), "isInvalidationKeep", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__IsInvalidationReplace(), ecorePackage.getEBoolean(), "isInvalidationReplace", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetInvalidationPolicy(), theM2Package.getInvalidationPolicy(), "getInvalidationPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetInitValue(), theM2Package.getValueSpecification(), "getInitValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetQueueLength(), theM2Package.getPositiveInteger(), "getQueueLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetComSpec(), theM2Package.getReceiverComSpec(), "getComSpec", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetRelatedDataReceivedEvent(), theM2Package.getDataReceivedEvent(), "getRelatedDataReceivedEvent", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRVariableDataInstanceInSwc__GetRelatedDataReceiveErrorEvent(), theM2Package.getDataReceiveErrorEvent(), "getRelatedDataReceiveErrorEvent", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(assemblyDataInstanceConnectorEClass, AssemblyDataInstanceConnector.class, "AssemblyDataInstanceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyDataInstanceConnector_Provider(), this.getVariableDataInstanceInComposition(), this.getVariableDataInstanceInComposition_RequesterConnection(), "provider", null, 1, 1, AssemblyDataInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDataInstanceConnector_Requester(), this.getVariableDataInstanceInComposition(), this.getVariableDataInstanceInComposition_ProviderConnection(), "requester", null, 1, 1, AssemblyDataInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationDataInstanceConnectorEClass, DelegationDataInstanceConnector.class, "DelegationDataInstanceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationDataInstanceConnector_Outer(), this.getVariableDataInstanceInSwc(), null, "outer", null, 1, 1, DelegationDataInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationDataInstanceConnector_Inner(), this.getVariableDataInstanceInComposition(), null, "inner", null, 1, 1, DelegationDataInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationInstanceInSwcEClass, OperationInstanceInSwc.class, "OperationInstanceInSwc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInstanceInSwc_Prototype(), theM2Package.getClientServerOperation(), null, "prototype", null, 1, 1, OperationInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInstanceInSwc_ContextPort(), theM2Package.getPortPrototype(), null, "contextPort", null, 1, 1, OperationInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInstanceInSwc_Instance(), this.getOperationInstanceInComposition(), this.getOperationInstanceInComposition_Prototype(), "instance", null, 0, -1, OperationInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getOperationInstanceInSwc__GetOwnerAtomicSwc(), theM2Package.getAtomicSwComponentType(), "getOwnerAtomicSwc", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rOperationInstanceInSwcEClass, ROperationInstanceInSwc.class, "ROperationInstanceInSwc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pOperationInstanceInSwcEClass, POperationInstanceInSwc.class, "POperationInstanceInSwc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPOperationInstanceInSwc_OperationInvokedEvent(), theM2Package.getOperationInvokedEvent(), theM2Package.getOperationInvokedEvent_Operation(), "operationInvokedEvent", null, 0, -1, POperationInstanceInSwc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationInstanceInCompositionEClass, OperationInstanceInComposition.class, "OperationInstanceInComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInstanceInComposition_Prototype(), this.getOperationInstanceInSwc(), this.getOperationInstanceInSwc_Instance(), "prototype", null, 1, 1, OperationInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInstanceInComposition_Parent(), this.getPortInstanceInComposition(), this.getPortInstanceInComposition_Operation(), "parent", null, 1, 1, OperationInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInstanceInComposition_RequesterConnection(), this.getAssemblyOperationInstanceConnector(), this.getAssemblyOperationInstanceConnector_Provider(), "requesterConnection", null, 0, -1, OperationInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInstanceInComposition_ProviderConnection(), this.getAssemblyOperationInstanceConnector(), this.getAssemblyOperationInstanceConnector_Requester(), "providerConnection", null, 0, -1, OperationInstanceInComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getOperationInstanceInComposition__GetTargetShortName(), theM2Package.getIdentifier(), "getTargetShortName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assemblyOperationInstanceConnectorEClass, AssemblyOperationInstanceConnector.class, "AssemblyOperationInstanceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyOperationInstanceConnector_Requester(), this.getOperationInstanceInComposition(), this.getOperationInstanceInComposition_ProviderConnection(), "requester", null, 1, 1, AssemblyOperationInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyOperationInstanceConnector_Provider(), this.getOperationInstanceInComposition(), this.getOperationInstanceInComposition_RequesterConnection(), "provider", null, 1, 1, AssemblyOperationInstanceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iInstanceObjectEClass, IInstanceObject.class, "IInstanceObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIInstanceObject_InstanceId(), theM2Package.getIdentifier(), "instanceId", null, 1, -1, IInstanceObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(swComponentInstanceInSystemEClass, SwComponentInstanceInSystem.class, "SwComponentInstanceInSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwComponentInstanceInSystem_ContextRootComposition(), theM2Package.getRootSwCompositionPrototype(), null, "contextRootComposition", null, 1, 1, SwComponentInstanceInSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwComponentInstanceInSystem_Prototype(), theM2Package.getSwComponentPrototype(), theM2Package.getSwComponentPrototype_Instance(), "prototype", null, 1, 1, SwComponentInstanceInSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwComponentInstanceInSystem_OwnerPartition(), theEcucPackage.getEcucPartition(), theEcucPackage.getEcucPartition_EcucPartitionSoftwareComponent(), "ownerPartition", null, 0, -1, SwComponentInstanceInSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(instanceRootEClass, InstanceRoot.class, "InstanceRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceRoot_AssemblyDataInstanceConnector(), this.getAssemblyDataInstanceConnector(), null, "assemblyDataInstanceConnector", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_DelegationDataInstanceConnector(), this.getDelegationDataInstanceConnector(), null, "delegationDataInstanceConnector", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_SwComponentInstanceInSystem(), this.getSwComponentInstanceInSystem(), null, "swComponentInstanceInSystem", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_PortInstanceInComposition(), this.getPortInstanceInComposition(), null, "portInstanceInComposition", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_VariableDataInstanceInSwc(), this.getVariableDataInstanceInSwc(), null, "variableDataInstanceInSwc", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_OperationInstanceInSwc(), this.getOperationInstanceInSwc(), null, "operationInstanceInSwc", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceRoot_AssemblyOperationInstanceConnector(), this.getAssemblyOperationInstanceConnector(), null, "assemblyOperationInstanceConnector", null, 0, -1, InstanceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDataInstanceEClass, VariableDataInstance.class, "VariableDataInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getVariableDataInstanceInSwc__GetTargetShortName(), 
		   source, 
		   new String[] {
			 "body", "self.prototype.shortName"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__IsEventSemantics(), 
		   source, 
		   new String[] {
			 "body", "getSwImplPolicy() = m2::SwImplPolicyEnum::queued"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetSwImplPolicy(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.getSwImplPolicy().oclIsUndefined() and applType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen applType.getSwImplPolicy()\n\t\t\t\t\telse if not implType.getSwImplPolicy().oclIsUndefined() and implType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen implType.getSwImplPolicy()\n\t\t\t\t\telse self.prototype.getSwImplPolicy()\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetBaseType(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not implType.baseType.oclIsUndefined()\n\t\t\t\t\t\tthen implType.baseType\n\t\t\t\t\telse null\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetInvalidValue(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen applType.invalidValue\n\t\t\t\t\telse if not implType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen implType.invalidValue\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetSwAddrMethod(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not self.prototype.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAddrMethod\n\t\t\t\t\telse if not implType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAddrMethod\n\t\t\t\t\telse if not implType.getLeafImplementationDataType().swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.getLeafImplementationDataType().swAddrMethod\n\t\t\t\t\telse if not applType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applType.swAddrMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif endif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetSwAlignment(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not self.prototype.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAlignment\n\t\t\t\t\telse if not implType.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAlignment\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.prototype.type.oclIsKindOf(m2::ApplicationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ApplicationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.prototype.type.oclIsKindOf(m2::ImplementationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ImplementationDataType)\n\t\t\t\t\telse\n\t\t\t\t\t\tgetOwnerAtomicSwc().getImplementationDataType(self.prototype.type.oclAsType(m2::ApplicationPrimitiveDataType))\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getVariableDataInstanceInSwc__GetOwnerAtomicSwc(), 
		   source, 
		   new String[] {
			 "body", "self.contextPort.parent.oclAsType(m2::AtomicSwComponentType)"
		   });		
		addAnnotation
		  (getVariableDataInstanceInComposition__IsProvided(), 
		   source, 
		   new String[] {
			 "body", "prototype.oclIsKindOf(PVariableDataInstanceInSwc)"
		   });		
		addAnnotation
		  (getVariableDataInstanceInComposition__IsRequired(), 
		   source, 
		   new String[] {
			 "body", "prototype.oclIsKindOf(RVariableDataInstanceInSwc)"
		   });		
		addAnnotation
		  (getVariableDataInstanceInComposition__GetTargetShortName(), 
		   source, 
		   new String[] {
			 "body", "self.prototype.prototype.shortName"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwc__IsInvalidationEnabled(), 
		   source, 
		   new String[] {
			 "body", "not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationEnabled().oclAsType(Boolean)"
		   });			
		addAnnotation
		  (getPVariableDataInstanceInSwc__GetInvalidationPolicy(), 
		   source, 
		   new String[] {
			 "body", "contextPPort.providedInterface.oclAsType(m2::SenderReceiverInterface).invalidationPolicy\n\t\t\t\t\t->any(dataElement = self.prototype)"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__GetInitValue(), 
		   source, 
		   new String[] {
			 "body", "let initValue : m2::ValueSpecification = getComSpec().oclAsType(m2::NonqueuedSenderComSpec).initValue\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse initValue\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__GetComSpec(), 
		   source, 
		   new String[] {
			 "body", "let comSpec : m2::SenderComSpec = contextPPort.providedComSpec.oclAsType(m2::SenderComSpec)->any(dataElement = self.prototype)\n\t\t\t\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\telse comSpec\n\t\t\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__IsAccessedByDataSendPoint(), 
		   source, 
		   new String[] {
			 "body", "getOwnerAtomicSwc().internalBehavior.runnable.dataSendPoint->exists(accessedVariable.autosarVariable = self)"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__IsTAckEnabled(), 
		   source, 
		   new String[] {
			 "body", "not getComSpec().transmissionAcknowledge.oclIsUndefined()"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__IsTAckTimeoutEnabled(), 
		   source, 
		   new String[] {
			 "body", "not getComSpec().transmissionAcknowledge.oclIsUndefined() and getComSpec().transmissionAcknowledge.timeout <> 0"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc__GetRelatedDataSendCompletedEvent(), 
		   source, 
		   new String[] {
			 "body", "ar4x::m2::DataSendCompletedEvent.allInstances()->select(eventSourceData = self)->asOrderedSet()"
		   });		
		addAnnotation
		  (getPVariableDataInstanceInSwc_ContextPPort(), 
		   source, 
		   new String[] {
			 "derivation", "contextPort.oclAsType(m2::PPortPrototype)"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__IsFilterEnabled(), 
		   source, 
		   new String[] {
			 "body", "if getFilter().oclIsUndefined()\n\t\t\t\t\tthen false\n\t\t\t\t\telse getFilter().isFilterEnabled()\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetFilter(), 
		   source, 
		   new String[] {
			 "body", "let filter : m2::DataFilter = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).filter\n\t\t\t\tin if filter.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse filter\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__IsAliveTimeoutEnabled(), 
		   source, 
		   new String[] {
			 "body", "let comSpec : m2::NonqueuedReceiverComSpec = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec)\n\t\t\t\tin not comSpec.oclIsUndefined() and comSpec.aliveTimeout <> 0"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwc__IsInvalidationEnabled(), 
		   source, 
		   new String[] {
			 "body", "not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationEnabled().oclAsType(Boolean)"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwc__IsInvalidationKeep(), 
		   source, 
		   new String[] {
			 "body", "not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationKeep().oclAsType(Boolean)"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwc__IsInvalidationReplace(), 
		   source, 
		   new String[] {
			 "body", "not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationReplace().oclAsType(Boolean)"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetInvalidationPolicy(), 
		   source, 
		   new String[] {
			 "body", "contextRPort.requiredInterface.oclAsType(m2::SenderReceiverInterface).invalidationPolicy\n\t\t\t\t\t->any(dataElement = self.prototype)"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetInitValue(), 
		   source, 
		   new String[] {
			 "body", "let initValue : m2::ValueSpecification = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).initValue\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse initValue\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetQueueLength(), 
		   source, 
		   new String[] {
			 "body", "let comSpec : m2::QueuedReceiverComSpec = getComSpec().oclAsType(m2::QueuedReceiverComSpec)\n\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse comSpec.queueLength\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetComSpec(), 
		   source, 
		   new String[] {
			 "body", "let comSpec : m2::ReceiverComSpec = contextRPort.requiredComSpec.oclAsType(m2::ReceiverComSpec)->any(dataElement = self.prototype)\n\t\t\t\t\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\t\telse comSpec\n\t\t\t\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetRelatedDataReceivedEvent(), 
		   source, 
		   new String[] {
			 "body", "ar4x::m2::DataReceivedEvent.allInstances()->select(data = self)->asOrderedSet()"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc__GetRelatedDataReceiveErrorEvent(), 
		   source, 
		   new String[] {
			 "body", "ar4x::m2::DataReceiveErrorEvent.allInstances()->select(data = self)->asOrderedSet()"
		   });		
		addAnnotation
		  (getRVariableDataInstanceInSwc_ContextRPort(), 
		   source, 
		   new String[] {
			 "derivation", "contextPort.oclAsType(m2::RPortPrototype)"
		   });			
		addAnnotation
		  (getOperationInstanceInSwc__GetOwnerAtomicSwc(), 
		   source, 
		   new String[] {
			 "body", "self.contextPort.parent.oclAsType(m2::AtomicSwComponentType)"
		   });		
		addAnnotation
		  (getOperationInstanceInComposition__GetTargetShortName(), 
		   source, 
		   new String[] {
			 "body", "self.prototype.prototype.shortName"
		   });
	}

} //InstancePackageImpl
