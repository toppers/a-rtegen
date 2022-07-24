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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.*;

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
public class RteTestFactoryImpl extends EFactoryImpl implements RteTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteTestFactory init() {
		try {
			RteTestFactory theRteTestFactory = (RteTestFactory)EPackage.Registry.INSTANCE.getEFactory(RteTestPackage.eNS_URI);
			if (theRteTestFactory != null) {
				return theRteTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RteTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestFactoryImpl() {
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
			case RteTestPackage.RTE_TEST_MODULE: return createRteTestModule();
			case RteTestPackage.OS_STUB_HEADER: return createOsStubHeader();
			case RteTestPackage.COM_STUB_HEADER: return createComStubHeader();
			case RteTestPackage.IOC_MOCK_HEADER: return createIocMockHeader();
			case RteTestPackage.SWC_MOCK_HEADER: return createSwcMockHeader();
			case RteTestPackage.RTE_TEST_ROOT: return createRteTestRoot();
			case RteTestPackage.IOC_MOCK_SOURCE: return createIocMockSource();
			case RteTestPackage.SWC_MOCK_SOURCE: return createSwcMockSource();
			case RteTestPackage.RTE_TEST: return createRteTest();
			case RteTestPackage.BSWM_MOCK_HEADER: return createBswmMockHeader();
			case RteTestPackage.BSWM_MOCK_SOURCE: return createBswmMockSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestModule createRteTestModule() {
		RteTestModuleImpl rteTestModule = new RteTestModuleImpl();
		return rteTestModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsStubHeader createOsStubHeader() {
		OsStubHeaderImpl osStubHeader = new OsStubHeaderImpl();
		return osStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComStubHeader createComStubHeader() {
		ComStubHeaderImpl comStubHeader = new ComStubHeaderImpl();
		return comStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockHeader createIocMockHeader() {
		IocMockHeaderImpl iocMockHeader = new IocMockHeaderImpl();
		return iocMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMockHeader createSwcMockHeader() {
		SwcMockHeaderImpl swcMockHeader = new SwcMockHeaderImpl();
		return swcMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestRoot createRteTestRoot() {
		RteTestRootImpl rteTestRoot = new RteTestRootImpl();
		return rteTestRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockSource createIocMockSource() {
		IocMockSourceImpl iocMockSource = new IocMockSourceImpl();
		return iocMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMockSource createSwcMockSource() {
		SwcMockSourceImpl swcMockSource = new SwcMockSourceImpl();
		return swcMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTest createRteTest() {
		RteTestImpl rteTest = new RteTestImpl();
		return rteTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswmMockHeader createBswmMockHeader() {
		BswmMockHeaderImpl bswmMockHeader = new BswmMockHeaderImpl();
		return bswmMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswmMockSource createBswmMockSource() {
		BswmMockSourceImpl bswmMockSource = new BswmMockSourceImpl();
		return bswmMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestPackage getRteTestPackage() {
		return (RteTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RteTestPackage getPackage() {
		return RteTestPackage.eINSTANCE;
	}

} //RteTestFactoryImpl
