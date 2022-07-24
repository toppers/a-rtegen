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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import module='rte.ecore#//module'"
 * @generated
 */
public interface RteTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rte_test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/rte-test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rte_test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RteTestPackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTestModule()
	 * @generated
	 */
	int RTE_TEST_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Os Stub Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__OS_STUB_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Com Stub Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__COM_STUB_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Ioc Mock Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__IOC_MOCK_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Swc Mock Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__SWC_MOCK_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Swc Mock Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__SWC_MOCK_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Ioc Mock Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__IOC_MOCK_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Bswm Mock Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__BSWM_MOCK_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Bswm Mock Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE__BSWM_MOCK_SOURCE = 7;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.OsStubHeaderImpl <em>Os Stub Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.OsStubHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getOsStubHeader()
	 * @generated
	 */
	int OS_STUB_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__SOURCE = ModulePackage.HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__SINGLE_SOURCE = ModulePackage.HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__ROLE_NAME = ModulePackage.HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__ID = ModulePackage.HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__FILE_NAME = ModulePackage.HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__GENERATION_INFO = ModulePackage.HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__GUARD_NAME = ModulePackage.HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__INCLUDE_HEADER = ModulePackage.HEADER_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER__CONSTANT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Stub Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER_FEATURE_COUNT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Stub Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_STUB_HEADER_OPERATION_COUNT = ModulePackage.HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.ComStubHeaderImpl <em>Com Stub Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.ComStubHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getComStubHeader()
	 * @generated
	 */
	int COM_STUB_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__SOURCE = ModulePackage.HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__SINGLE_SOURCE = ModulePackage.HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__ROLE_NAME = ModulePackage.HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__ID = ModulePackage.HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__FILE_NAME = ModulePackage.HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__GENERATION_INFO = ModulePackage.HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__GUARD_NAME = ModulePackage.HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__INCLUDE_HEADER = ModulePackage.HEADER_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER__CONSTANT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Stub Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER_FEATURE_COUNT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Stub Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STUB_HEADER_OPERATION_COUNT = ModulePackage.HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockHeaderImpl <em>Ioc Mock Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getIocMockHeader()
	 * @generated
	 */
	int IOC_MOCK_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__SOURCE = ModulePackage.HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__SINGLE_SOURCE = ModulePackage.HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__ROLE_NAME = ModulePackage.HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__ID = ModulePackage.HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__FILE_NAME = ModulePackage.HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__GENERATION_INFO = ModulePackage.HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__GUARD_NAME = ModulePackage.HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__INCLUDE_HEADER = ModulePackage.HEADER_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Ioc Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER__IOC_API = ModulePackage.HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER_FEATURE_COUNT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_HEADER_OPERATION_COUNT = ModulePackage.HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockHeaderImpl <em>Swc Mock Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getSwcMockHeader()
	 * @generated
	 */
	int SWC_MOCK_HEADER = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__SOURCE = ModulePackage.HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__SINGLE_SOURCE = ModulePackage.HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__ROLE_NAME = ModulePackage.HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__ID = ModulePackage.HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__FILE_NAME = ModulePackage.HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__GENERATION_INFO = ModulePackage.HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__GUARD_NAME = ModulePackage.HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__INCLUDE_HEADER = ModulePackage.HEADER_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Swc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__SWC_NAME = ModulePackage.HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER__EXECUTABLE_ENTITY = ModulePackage.HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swc Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER_FEATURE_COUNT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swc Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_HEADER_OPERATION_COUNT = ModulePackage.HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTestRoot()
	 * @generated
	 */
	int RTE_TEST_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Rte Test Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_ROOT__RTE_TEST_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Rte Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_ROOT__RTE_TEST = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockSourceImpl <em>Ioc Mock Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockSourceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getIocMockSource()
	 * @generated
	 */
	int IOC_MOCK_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__SOURCE = ModulePackage.SOURCE_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__SINGLE_SOURCE = ModulePackage.SOURCE_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__ROLE_NAME = ModulePackage.SOURCE_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__ID = ModulePackage.SOURCE_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__FILE_NAME = ModulePackage.SOURCE_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__GENERATION_INFO = ModulePackage.SOURCE_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__INCLUDE_HEADER = ModulePackage.SOURCE_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Ioc Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE__IOC_API = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE_FEATURE_COUNT = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_MOCK_SOURCE_OPERATION_COUNT = ModulePackage.SOURCE_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl <em>Swc Mock Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getSwcMockSource()
	 * @generated
	 */
	int SWC_MOCK_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__SOURCE = ModulePackage.SOURCE_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__SINGLE_SOURCE = ModulePackage.SOURCE_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__ROLE_NAME = ModulePackage.SOURCE_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__ID = ModulePackage.SOURCE_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__FILE_NAME = ModulePackage.SOURCE_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__GENERATION_INFO = ModulePackage.SOURCE_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__INCLUDE_HEADER = ModulePackage.SOURCE_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Swc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__SWC_NAME = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE__EXECUTABLE_ENTITY = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swc Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE_FEATURE_COUNT = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swc Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MOCK_SOURCE_OPERATION_COUNT = ModulePackage.SOURCE_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl <em>Rte Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTest()
	 * @generated
	 */
	int RTE_TEST = 8;

	/**
	 * The feature id for the '<em><b>Os Stub Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST__OS_STUB_CONSTANT = 0;

	/**
	 * The feature id for the '<em><b>Com Stub Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST__COM_STUB_CONSTANT = 1;

	/**
	 * The number of structural features of the '<em>Rte Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rte Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TEST_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockHeaderImpl <em>Bswm Mock Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getBswmMockHeader()
	 * @generated
	 */
	int BSWM_MOCK_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__SOURCE = ModulePackage.HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__SINGLE_SOURCE = ModulePackage.HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__ROLE_NAME = ModulePackage.HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__ID = ModulePackage.HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__FILE_NAME = ModulePackage.HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__GENERATION_INFO = ModulePackage.HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__GUARD_NAME = ModulePackage.HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__INCLUDE_HEADER = ModulePackage.HEADER_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__EXECUTABLE_ENTITY = ModulePackage.HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bswm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER__BSWM_NAME = ModulePackage.HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bswm Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER_FEATURE_COUNT = ModulePackage.HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bswm Mock Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_HEADER_OPERATION_COUNT = ModulePackage.HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl <em>Bswm Mock Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getBswmMockSource()
	 * @generated
	 */
	int BSWM_MOCK_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__SOURCE = ModulePackage.SOURCE_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__SINGLE_SOURCE = ModulePackage.SOURCE_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__ROLE_NAME = ModulePackage.SOURCE_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__ID = ModulePackage.SOURCE_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__FILE_NAME = ModulePackage.SOURCE_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__GENERATION_INFO = ModulePackage.SOURCE_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__INCLUDE_HEADER = ModulePackage.SOURCE_FILE__INCLUDE_HEADER;

	/**
	 * The feature id for the '<em><b>Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bswm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE__BSWM_NAME = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bswm Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE_FEATURE_COUNT = ModulePackage.SOURCE_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bswm Mock Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_MOCK_SOURCE_OPERATION_COUNT = ModulePackage.SOURCE_FILE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule
	 * @generated
	 */
	EClass getRteTestModule();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getOsStubHeader <em>Os Stub Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Stub Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getOsStubHeader()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_OsStubHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getComStubHeader <em>Com Stub Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Stub Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getComStubHeader()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_ComStubHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockHeader <em>Ioc Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ioc Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockHeader()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_IocMockHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockHeader <em>Swc Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockHeader()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_SwcMockHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockSource <em>Swc Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockSource()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_SwcMockSource();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockSource <em>Ioc Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ioc Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockSource()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_IocMockSource();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockHeader <em>Bswm Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bswm Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockHeader()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_BswmMockHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockSource <em>Bswm Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bswm Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockSource()
	 * @see #getRteTestModule()
	 * @generated
	 */
	EReference getRteTestModule_BswmMockSource();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader <em>Os Stub Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Stub Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader
	 * @generated
	 */
	EClass getOsStubHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader#getConstant()
	 * @see #getOsStubHeader()
	 * @generated
	 */
	EReference getOsStubHeader_Constant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader <em>Com Stub Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Stub Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader
	 * @generated
	 */
	EClass getComStubHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader#getConstant()
	 * @see #getComStubHeader()
	 * @generated
	 */
	EReference getComStubHeader_Constant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader <em>Ioc Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader
	 * @generated
	 */
	EClass getIocMockHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader#getIocApi <em>Ioc Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ioc Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader#getIocApi()
	 * @see #getIocMockHeader()
	 * @generated
	 */
	EReference getIocMockHeader_IocApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader <em>Swc Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader
	 * @generated
	 */
	EClass getSwcMockHeader();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader#getSwcName <em>Swc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swc Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader#getSwcName()
	 * @see #getSwcMockHeader()
	 * @generated
	 */
	EAttribute getSwcMockHeader_SwcName();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader#getExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader#getExecutableEntity()
	 * @see #getSwcMockHeader()
	 * @generated
	 */
	EReference getSwcMockHeader_ExecutableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot
	 * @generated
	 */
	EClass getRteTestRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule <em>Rte Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Test Module</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule()
	 * @see #getRteTestRoot()
	 * @generated
	 */
	EReference getRteTestRoot_RteTestModule();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest <em>Rte Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Test</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest()
	 * @see #getRteTestRoot()
	 * @generated
	 */
	EReference getRteTestRoot_RteTest();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource <em>Ioc Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource
	 * @generated
	 */
	EClass getIocMockSource();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource#getIocApi <em>Ioc Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ioc Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource#getIocApi()
	 * @see #getIocMockSource()
	 * @generated
	 */
	EReference getIocMockSource_IocApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource <em>Swc Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource
	 * @generated
	 */
	EClass getSwcMockSource();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getSwcName <em>Swc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swc Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getSwcName()
	 * @see #getSwcMockSource()
	 * @generated
	 */
	EAttribute getSwcMockSource_SwcName();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getExecutableEntity()
	 * @see #getSwcMockSource()
	 * @generated
	 */
	EReference getSwcMockSource_ExecutableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest <em>Rte Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Test</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest
	 * @generated
	 */
	EClass getRteTest();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getOsStubConstant <em>Os Stub Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Stub Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getOsStubConstant()
	 * @see #getRteTest()
	 * @generated
	 */
	EReference getRteTest_OsStubConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getComStubConstant <em>Com Stub Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Stub Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getComStubConstant()
	 * @see #getRteTest()
	 * @generated
	 */
	EReference getRteTest_ComStubConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader <em>Bswm Mock Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bswm Mock Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader
	 * @generated
	 */
	EClass getBswmMockHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getExecutableEntity()
	 * @see #getBswmMockHeader()
	 * @generated
	 */
	EReference getBswmMockHeader_ExecutableEntity();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getBswmName <em>Bswm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bswm Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getBswmName()
	 * @see #getBswmMockHeader()
	 * @generated
	 */
	EAttribute getBswmMockHeader_BswmName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource <em>Bswm Mock Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bswm Mock Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource
	 * @generated
	 */
	EClass getBswmMockSource();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource#getExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource#getExecutableEntity()
	 * @see #getBswmMockSource()
	 * @generated
	 */
	EReference getBswmMockSource_ExecutableEntity();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource#getBswmName <em>Bswm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bswm Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource#getBswmName()
	 * @see #getBswmMockSource()
	 * @generated
	 */
	EAttribute getBswmMockSource_BswmName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RteTestFactory getRteTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTestModule()
		 * @generated
		 */
		EClass RTE_TEST_MODULE = eINSTANCE.getRteTestModule();

		/**
		 * The meta object literal for the '<em><b>Os Stub Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__OS_STUB_HEADER = eINSTANCE.getRteTestModule_OsStubHeader();

		/**
		 * The meta object literal for the '<em><b>Com Stub Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__COM_STUB_HEADER = eINSTANCE.getRteTestModule_ComStubHeader();

		/**
		 * The meta object literal for the '<em><b>Ioc Mock Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__IOC_MOCK_HEADER = eINSTANCE.getRteTestModule_IocMockHeader();

		/**
		 * The meta object literal for the '<em><b>Swc Mock Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__SWC_MOCK_HEADER = eINSTANCE.getRteTestModule_SwcMockHeader();

		/**
		 * The meta object literal for the '<em><b>Swc Mock Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__SWC_MOCK_SOURCE = eINSTANCE.getRteTestModule_SwcMockSource();

		/**
		 * The meta object literal for the '<em><b>Ioc Mock Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__IOC_MOCK_SOURCE = eINSTANCE.getRteTestModule_IocMockSource();

		/**
		 * The meta object literal for the '<em><b>Bswm Mock Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__BSWM_MOCK_HEADER = eINSTANCE.getRteTestModule_BswmMockHeader();

		/**
		 * The meta object literal for the '<em><b>Bswm Mock Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_MODULE__BSWM_MOCK_SOURCE = eINSTANCE.getRteTestModule_BswmMockSource();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.OsStubHeaderImpl <em>Os Stub Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.OsStubHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getOsStubHeader()
		 * @generated
		 */
		EClass OS_STUB_HEADER = eINSTANCE.getOsStubHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_STUB_HEADER__CONSTANT = eINSTANCE.getOsStubHeader_Constant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.ComStubHeaderImpl <em>Com Stub Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.ComStubHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getComStubHeader()
		 * @generated
		 */
		EClass COM_STUB_HEADER = eINSTANCE.getComStubHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_STUB_HEADER__CONSTANT = eINSTANCE.getComStubHeader_Constant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockHeaderImpl <em>Ioc Mock Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getIocMockHeader()
		 * @generated
		 */
		EClass IOC_MOCK_HEADER = eINSTANCE.getIocMockHeader();

		/**
		 * The meta object literal for the '<em><b>Ioc Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_MOCK_HEADER__IOC_API = eINSTANCE.getIocMockHeader_IocApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockHeaderImpl <em>Swc Mock Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getSwcMockHeader()
		 * @generated
		 */
		EClass SWC_MOCK_HEADER = eINSTANCE.getSwcMockHeader();

		/**
		 * The meta object literal for the '<em><b>Swc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWC_MOCK_HEADER__SWC_NAME = eINSTANCE.getSwcMockHeader_SwcName();

		/**
		 * The meta object literal for the '<em><b>Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_MOCK_HEADER__EXECUTABLE_ENTITY = eINSTANCE.getSwcMockHeader_ExecutableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTestRoot()
		 * @generated
		 */
		EClass RTE_TEST_ROOT = eINSTANCE.getRteTestRoot();

		/**
		 * The meta object literal for the '<em><b>Rte Test Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_ROOT__RTE_TEST_MODULE = eINSTANCE.getRteTestRoot_RteTestModule();

		/**
		 * The meta object literal for the '<em><b>Rte Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST_ROOT__RTE_TEST = eINSTANCE.getRteTestRoot_RteTest();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockSourceImpl <em>Ioc Mock Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockSourceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getIocMockSource()
		 * @generated
		 */
		EClass IOC_MOCK_SOURCE = eINSTANCE.getIocMockSource();

		/**
		 * The meta object literal for the '<em><b>Ioc Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_MOCK_SOURCE__IOC_API = eINSTANCE.getIocMockSource_IocApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl <em>Swc Mock Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getSwcMockSource()
		 * @generated
		 */
		EClass SWC_MOCK_SOURCE = eINSTANCE.getSwcMockSource();

		/**
		 * The meta object literal for the '<em><b>Swc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWC_MOCK_SOURCE__SWC_NAME = eINSTANCE.getSwcMockSource_SwcName();

		/**
		 * The meta object literal for the '<em><b>Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_MOCK_SOURCE__EXECUTABLE_ENTITY = eINSTANCE.getSwcMockSource_ExecutableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl <em>Rte Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getRteTest()
		 * @generated
		 */
		EClass RTE_TEST = eINSTANCE.getRteTest();

		/**
		 * The meta object literal for the '<em><b>Os Stub Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST__OS_STUB_CONSTANT = eINSTANCE.getRteTest_OsStubConstant();

		/**
		 * The meta object literal for the '<em><b>Com Stub Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TEST__COM_STUB_CONSTANT = eINSTANCE.getRteTest_ComStubConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockHeaderImpl <em>Bswm Mock Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getBswmMockHeader()
		 * @generated
		 */
		EClass BSWM_MOCK_HEADER = eINSTANCE.getBswmMockHeader();

		/**
		 * The meta object literal for the '<em><b>Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSWM_MOCK_HEADER__EXECUTABLE_ENTITY = eINSTANCE.getBswmMockHeader_ExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Bswm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSWM_MOCK_HEADER__BSWM_NAME = eINSTANCE.getBswmMockHeader_BswmName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl <em>Bswm Mock Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestPackageImpl#getBswmMockSource()
		 * @generated
		 */
		EClass BSWM_MOCK_SOURCE = eINSTANCE.getBswmMockSource();

		/**
		 * The meta object literal for the '<em><b>Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY = eINSTANCE.getBswmMockSource_ExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Bswm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSWM_MOCK_SOURCE__BSWM_NAME = eINSTANCE.getBswmMockSource_BswmName();

	}

} //RteTestPackage
