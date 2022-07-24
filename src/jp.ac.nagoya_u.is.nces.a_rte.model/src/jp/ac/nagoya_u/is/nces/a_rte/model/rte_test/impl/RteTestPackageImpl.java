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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RteTestPackageImpl extends EPackageImpl implements RteTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteTestModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osStubHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comStubHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocMockHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcMockHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteTestRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocMockSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcMockSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswmMockHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswmMockSourceEClass = null;

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RteTestPackageImpl() {
		super(eNS_URI, RteTestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RteTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RteTestPackage init() {
		if (isInited) return (RteTestPackage)EPackage.Registry.INSTANCE.getEPackage(RteTestPackage.eNS_URI);

		// Obtain or create and register package
		RteTestPackageImpl theRteTestPackage = (RteTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RteTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RteTestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RtePackage.eINSTANCE.eClass();
		Ar4xPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRteTestPackage.createPackageContents();

		// Initialize created meta-data
		theRteTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRteTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RteTestPackage.eNS_URI, theRteTestPackage);
		return theRteTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteTestModule() {
		return rteTestModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_OsStubHeader() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_ComStubHeader() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_IocMockHeader() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_SwcMockHeader() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_SwcMockSource() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_IocMockSource() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_BswmMockHeader() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestModule_BswmMockSource() {
		return (EReference)rteTestModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsStubHeader() {
		return osStubHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsStubHeader_Constant() {
		return (EReference)osStubHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComStubHeader() {
		return comStubHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComStubHeader_Constant() {
		return (EReference)comStubHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocMockHeader() {
		return iocMockHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocMockHeader_IocApi() {
		return (EReference)iocMockHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcMockHeader() {
		return swcMockHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwcMockHeader_SwcName() {
		return (EAttribute)swcMockHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcMockHeader_ExecutableEntity() {
		return (EReference)swcMockHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteTestRoot() {
		return rteTestRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestRoot_RteTestModule() {
		return (EReference)rteTestRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTestRoot_RteTest() {
		return (EReference)rteTestRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocMockSource() {
		return iocMockSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocMockSource_IocApi() {
		return (EReference)iocMockSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcMockSource() {
		return swcMockSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwcMockSource_SwcName() {
		return (EAttribute)swcMockSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcMockSource_ExecutableEntity() {
		return (EReference)swcMockSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteTest() {
		return rteTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTest_OsStubConstant() {
		return (EReference)rteTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTest_ComStubConstant() {
		return (EReference)rteTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswmMockHeader() {
		return bswmMockHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswmMockHeader_ExecutableEntity() {
		return (EReference)bswmMockHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswmMockHeader_BswmName() {
		return (EAttribute)bswmMockHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswmMockSource() {
		return bswmMockSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswmMockSource_ExecutableEntity() {
		return (EReference)bswmMockSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswmMockSource_BswmName() {
		return (EAttribute)bswmMockSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestFactory getRteTestFactory() {
		return (RteTestFactory)getEFactoryInstance();
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
		rteTestModuleEClass = createEClass(RTE_TEST_MODULE);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__OS_STUB_HEADER);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__COM_STUB_HEADER);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__IOC_MOCK_HEADER);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__SWC_MOCK_HEADER);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__SWC_MOCK_SOURCE);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__IOC_MOCK_SOURCE);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__BSWM_MOCK_HEADER);
		createEReference(rteTestModuleEClass, RTE_TEST_MODULE__BSWM_MOCK_SOURCE);

		osStubHeaderEClass = createEClass(OS_STUB_HEADER);
		createEReference(osStubHeaderEClass, OS_STUB_HEADER__CONSTANT);

		comStubHeaderEClass = createEClass(COM_STUB_HEADER);
		createEReference(comStubHeaderEClass, COM_STUB_HEADER__CONSTANT);

		iocMockHeaderEClass = createEClass(IOC_MOCK_HEADER);
		createEReference(iocMockHeaderEClass, IOC_MOCK_HEADER__IOC_API);

		swcMockHeaderEClass = createEClass(SWC_MOCK_HEADER);
		createEAttribute(swcMockHeaderEClass, SWC_MOCK_HEADER__SWC_NAME);
		createEReference(swcMockHeaderEClass, SWC_MOCK_HEADER__EXECUTABLE_ENTITY);

		rteTestRootEClass = createEClass(RTE_TEST_ROOT);
		createEReference(rteTestRootEClass, RTE_TEST_ROOT__RTE_TEST_MODULE);
		createEReference(rteTestRootEClass, RTE_TEST_ROOT__RTE_TEST);

		iocMockSourceEClass = createEClass(IOC_MOCK_SOURCE);
		createEReference(iocMockSourceEClass, IOC_MOCK_SOURCE__IOC_API);

		swcMockSourceEClass = createEClass(SWC_MOCK_SOURCE);
		createEAttribute(swcMockSourceEClass, SWC_MOCK_SOURCE__SWC_NAME);
		createEReference(swcMockSourceEClass, SWC_MOCK_SOURCE__EXECUTABLE_ENTITY);

		rteTestEClass = createEClass(RTE_TEST);
		createEReference(rteTestEClass, RTE_TEST__OS_STUB_CONSTANT);
		createEReference(rteTestEClass, RTE_TEST__COM_STUB_CONSTANT);

		bswmMockHeaderEClass = createEClass(BSWM_MOCK_HEADER);
		createEReference(bswmMockHeaderEClass, BSWM_MOCK_HEADER__EXECUTABLE_ENTITY);
		createEAttribute(bswmMockHeaderEClass, BSWM_MOCK_HEADER__BSWM_NAME);

		bswmMockSourceEClass = createEClass(BSWM_MOCK_SOURCE);
		createEReference(bswmMockSourceEClass, BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY);
		createEAttribute(bswmMockSourceEClass, BSWM_MOCK_SOURCE__BSWM_NAME);
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
		ModulePackage theModulePackage = (ModulePackage)EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		osStubHeaderEClass.getESuperTypes().add(theModulePackage.getHeaderFile());
		comStubHeaderEClass.getESuperTypes().add(theModulePackage.getHeaderFile());
		iocMockHeaderEClass.getESuperTypes().add(theModulePackage.getHeaderFile());
		swcMockHeaderEClass.getESuperTypes().add(theModulePackage.getHeaderFile());
		iocMockSourceEClass.getESuperTypes().add(theModulePackage.getSourceFile());
		swcMockSourceEClass.getESuperTypes().add(theModulePackage.getSourceFile());
		bswmMockHeaderEClass.getESuperTypes().add(theModulePackage.getHeaderFile());
		bswmMockSourceEClass.getESuperTypes().add(theModulePackage.getSourceFile());

		// Initialize classes, features, and operations; add parameters
		initEClass(rteTestModuleEClass, RteTestModule.class, "RteTestModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteTestModule_OsStubHeader(), this.getOsStubHeader(), null, "osStubHeader", null, 1, 1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_ComStubHeader(), this.getComStubHeader(), null, "comStubHeader", null, 1, 1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_IocMockHeader(), this.getIocMockHeader(), null, "iocMockHeader", null, 1, 1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_SwcMockHeader(), this.getSwcMockHeader(), null, "swcMockHeader", null, 0, -1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_SwcMockSource(), this.getSwcMockSource(), null, "swcMockSource", null, 0, -1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_IocMockSource(), this.getIocMockSource(), null, "iocMockSource", null, 1, 1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_BswmMockHeader(), this.getBswmMockHeader(), null, "bswmMockHeader", null, 0, -1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestModule_BswmMockSource(), this.getBswmMockSource(), null, "bswmMockSource", null, 0, -1, RteTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osStubHeaderEClass, OsStubHeader.class, "OsStubHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsStubHeader_Constant(), theModulePackage.getConstant(), null, "constant", null, 0, -1, OsStubHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comStubHeaderEClass, ComStubHeader.class, "ComStubHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComStubHeader_Constant(), theModulePackage.getConstant(), null, "constant", null, 0, -1, ComStubHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iocMockHeaderEClass, IocMockHeader.class, "IocMockHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIocMockHeader_IocApi(), theModulePackage.getIocApi(), null, "iocApi", null, 0, -1, IocMockHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swcMockHeaderEClass, SwcMockHeader.class, "SwcMockHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwcMockHeader_SwcName(), theModulePackage.getCIdentifier(), "swcName", null, 1, 1, SwcMockHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcMockHeader_ExecutableEntity(), theModulePackage.getExecutableEntity(), null, "executableEntity", null, 0, -1, SwcMockHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteTestRootEClass, RteTestRoot.class, "RteTestRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteTestRoot_RteTestModule(), this.getRteTestModule(), null, "rteTestModule", null, 1, 1, RteTestRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTestRoot_RteTest(), this.getRteTest(), null, "rteTest", null, 1, 1, RteTestRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iocMockSourceEClass, IocMockSource.class, "IocMockSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIocMockSource_IocApi(), theModulePackage.getIocApi(), null, "iocApi", null, 0, -1, IocMockSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swcMockSourceEClass, SwcMockSource.class, "SwcMockSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwcMockSource_SwcName(), theModulePackage.getCIdentifier(), "swcName", null, 1, 1, SwcMockSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcMockSource_ExecutableEntity(), theModulePackage.getExecutableEntity(), null, "executableEntity", null, 0, -1, SwcMockSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteTestEClass, RteTest.class, "RteTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteTest_OsStubConstant(), theModulePackage.getConstant(), null, "osStubConstant", null, 0, -1, RteTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteTest_ComStubConstant(), theModulePackage.getConstant(), null, "comStubConstant", null, 0, -1, RteTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswmMockHeaderEClass, BswmMockHeader.class, "BswmMockHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswmMockHeader_ExecutableEntity(), theModulePackage.getExecutableEntity(), null, "executableEntity", null, 0, -1, BswmMockHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBswmMockHeader_BswmName(), theModulePackage.getCIdentifier(), "bswmName", null, 1, 1, BswmMockHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswmMockSourceEClass, BswmMockSource.class, "BswmMockSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswmMockSource_ExecutableEntity(), theModulePackage.getExecutableEntity(), null, "executableEntity", null, 0, -1, BswmMockSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBswmMockSource_BswmName(), theModulePackage.getCIdentifier(), "bswmName", null, 1, 1, BswmMockSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "module", "rte.ecore#//module"
		   });
	}

} //RteTestPackageImpl
