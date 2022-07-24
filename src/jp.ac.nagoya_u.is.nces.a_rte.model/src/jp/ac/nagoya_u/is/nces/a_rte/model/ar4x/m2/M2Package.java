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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface M2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "m2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/ar4x/m2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "m2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M2Package eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2RootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getM2Root()
	 * @generated
	 */
	int M2_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Autosar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_ROOT__AUTOSAR = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarImpl <em>Autosar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosar()
	 * @generated
	 */
	int AUTOSAR = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IdentifiableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 4;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArPackageImpl <em>Ar Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArPackageImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArPackage()
	 * @generated
	 */
	int AR_PACKAGE = 2;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArElementImpl <em>Ar Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArElementImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArElement()
	 * @generated
	 */
	int AR_ELEMENT = 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2ObjectImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getM2Object()
	 * @generated
	 */
	int M2_OBJECT = 5;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR__ID = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ar Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR__AR_PACKAGE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Autosar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Autosar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl <em>Sw Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwBaseType()
	 * @generated
	 */
	int SW_BASE_TYPE = 6;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverInterfaceImpl <em>Sender Receiver Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverInterfaceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverInterface()
	 * @generated
	 */
	int SENDER_RECEIVER_INTERFACE = 7;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeImpl <em>Variable Data Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableDataPrototype()
	 * @generated
	 */
	int VARIABLE_DATA_PROTOTYPE = 8;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferrableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__ID = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__SHORT_NAME = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__REFERENCE = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__SHORT_NAME = REFERRABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__REFERENCE = REFERRABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__CATEGORY = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__ELEMENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ar Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE__AR_PACKAGE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ar Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ar Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PACKAGE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The number of structural features of the '<em>Ar Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ar Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Base Type Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__BASE_TYPE_ENCODING = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__BASE_TYPE_SIZE = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE__NATIVE_DECLARATION = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sw Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Upper Limit For Unsigned Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE___GET_UPPER_LIMIT_FOR_UNSIGNED_INTEGER = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sw Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_BASE_TYPE_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentTypeImpl <em>Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwComponentType()
	 * @generated
	 */
	int SW_COMPONENT_TYPE = 10;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeImpl <em>Port Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortPrototype()
	 * @generated
	 */
	int PORT_PROTOTYPE = 11;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AtomicSwComponentTypeImpl <em>Atomic Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AtomicSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAtomicSwComponentType()
	 * @generated
	 */
	int ATOMIC_SW_COMPONENT_TYPE = 12;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationSwComponentTypeImpl <em>Application Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationSwComponentType()
	 * @generated
	 */
	int APPLICATION_SW_COMPONENT_TYPE = 13;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl <em>RPort Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortPrototype()
	 * @generated
	 */
	int RPORT_PROTOTYPE = 14;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeImpl <em>PPort Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortPrototype()
	 * @generated
	 */
	int PPORT_PROTOTYPE = 15;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl <em>Swc Internal Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcInternalBehavior()
	 * @generated
	 */
	int SWC_INTERNAL_BEHAVIOR = 16;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl <em>Runnable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRunnableEntity()
	 * @generated
	 */
	int RUNNABLE_ENTITY = 18;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableAccessImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 19;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl <em>Autosar Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarVariableRef()
	 * @generated
	 */
	int AUTOSAR_VARIABLE_REF = 20;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RteEventImpl <em>Rte Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RteEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRteEvent()
	 * @generated
	 */
	int RTE_EVENT = 22;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TimingEventImpl <em>Timing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TimingEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTimingEvent()
	 * @generated
	 */
	int TIMING_EVENT = 23;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl <em>Ecuc Module Configuration Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucModuleConfigurationValues()
	 * @generated
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES = 29;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl <em>Ecuc Container Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucContainerValue()
	 * @generated
	 */
	int ECUC_CONTAINER_VALUE = 30;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucParameterValueImpl <em>Ecuc Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucParameterValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucParameterValue()
	 * @generated
	 */
	int ECUC_PARAMETER_VALUE = 31;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucNumericalParamValueImpl <em>Ecuc Numerical Param Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucNumericalParamValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucNumericalParamValue()
	 * @generated
	 */
	int ECUC_NUMERICAL_PARAM_VALUE = 32;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucTextualParamValueImpl <em>Ecuc Textual Param Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucTextualParamValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucTextualParamValue()
	 * @generated
	 */
	int ECUC_TEXTUAL_PARAM_VALUE = 33;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucAbstractReferenceValueImpl <em>Ecuc Abstract Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucAbstractReferenceValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucAbstractReferenceValue()
	 * @generated
	 */
	int ECUC_ABSTRACT_REFERENCE_VALUE = 34;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucReferenceValueImpl <em>Ecuc Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucReferenceValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucReferenceValue()
	 * @generated
	 */
	int ECUC_REFERENCE_VALUE = 35;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucInstanceReferenceValueImpl <em>Ecuc Instance Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucInstanceReferenceValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucInstanceReferenceValue()
	 * @generated
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE = 36;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortComSpecImpl <em>RPort Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortComSpec()
	 * @generated
	 */
	int RPORT_COM_SPEC = 37;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortComSpecImpl <em>PPort Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortComSpec()
	 * @generated
	 */
	int PPORT_COM_SPEC = 38;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReceiverComSpecImpl <em>Receiver Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReceiverComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReceiverComSpec()
	 * @generated
	 */
	int RECEIVER_COM_SPEC = 39;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderComSpecImpl <em>Sender Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderComSpec()
	 * @generated
	 */
	int SENDER_COM_SPEC = 40;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedSenderComSpecImpl <em>Nonqueued Sender Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedSenderComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNonqueuedSenderComSpec()
	 * @generated
	 */
	int NONQUEUED_SENDER_COM_SPEC = 42;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl <em>Nonqueued Receiver Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNonqueuedReceiverComSpec()
	 * @generated
	 */
	int NONQUEUED_RECEIVER_COM_SPEC = 44;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInterfaceImpl <em>Port Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInterfaceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortInterface()
	 * @generated
	 */
	int PORT_INTERFACE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Port Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INTERFACE_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__ID = PORT_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__SHORT_NAME = PORT_INTERFACE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__REFERENCE = PORT_INTERFACE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__CATEGORY = PORT_INTERFACE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__DATA_ELEMENT = PORT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalidation Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE__INVALIDATION_POLICY = PORT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sender Receiver Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE_FEATURE_COUNT = PORT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sender Receiver Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_INTERFACE_OPERATION_COUNT = PORT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompositionSwComponentTypeImpl <em>Composition Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompositionSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompositionSwComponentType()
	 * @generated
	 */
	int COMPOSITION_SW_COMPONENT_TYPE = 46;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwConnectorImpl <em>Sw Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwConnector()
	 * @generated
	 */
	int SW_CONNECTOR = 47;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl <em>Assembly Sw Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAssemblySwConnector()
	 * @generated
	 */
	int ASSEMBLY_SW_CONNECTOR = 48;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl <em>Delegation Sw Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDelegationSwConnector()
	 * @generated
	 */
	int DELEGATION_SW_CONNECTOR = 49;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeInCompositionInstanceRefImpl <em>RPort Prototype In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = 51;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeInCompositionInstanceRefImpl <em>PPort Prototype In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = 52;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentPrototypeImpl <em>Sw Component Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwComponentPrototype()
	 * @generated
	 */
	int SW_COMPONENT_PROTOTYPE = 53;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 54;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl <em>Autosar Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarDataType()
	 * @generated
	 */
	int AUTOSAR_DATA_TYPE = 55;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationDataTypeImpl <em>Application Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationDataTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationDataType()
	 * @generated
	 */
	int APPLICATION_DATA_TYPE = 56;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeImpl <em>Implementation Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementationDataType()
	 * @generated
	 */
	int IMPLEMENTATION_DATA_TYPE = 57;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl <em>Sw Data Def Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwDataDefProps()
	 * @generated
	 */
	int SW_DATA_DEF_PROPS = 59;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl <em>Data Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataTypeMap()
	 * @generated
	 */
	int DATA_TYPE_MAP = 60;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMappingSetImpl <em>Data Type Mapping Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMappingSetImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataTypeMappingSet()
	 * @generated
	 */
	int DATA_TYPE_MAPPING_SET = 61;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationPrimitiveDataTypeImpl <em>Application Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationPrimitiveDataTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationPrimitiveDataType()
	 * @generated
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE = 66;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl <em>Data Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataPrototype()
	 * @generated
	 */
	int DATA_PROTOTYPE = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__SW_DATA_DEF_PROPS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__SW_ADDR_METHOD = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__SW_ALIGNMENT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE___GET_SW_IMPL_POLICY = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTOTYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataPrototypeImpl <em>Autosar Data Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarDataPrototype()
	 * @generated
	 */
	int AUTOSAR_DATA_PROTOTYPE = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__ID = DATA_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__SHORT_NAME = DATA_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__REFERENCE = DATA_PROTOTYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__CATEGORY = DATA_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__SW_DATA_DEF_PROPS = DATA_PROTOTYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__SW_ADDR_METHOD = DATA_PROTOTYPE__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__SW_ALIGNMENT = DATA_PROTOTYPE__SW_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE__TYPE = DATA_PROTOTYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Autosar Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE_FEATURE_COUNT = DATA_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE___GET_SW_IMPL_POLICY = DATA_PROTOTYPE___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE___GET_SW_ADDR_METHOD = DATA_PROTOTYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE___GET_SW_ALIGNMENT = DATA_PROTOTYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE = DATA_PROTOTYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE = DATA_PROTOTYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Autosar Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_PROTOTYPE_OPERATION_COUNT = DATA_PROTOTYPE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__ID = AUTOSAR_DATA_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__SHORT_NAME = AUTOSAR_DATA_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__REFERENCE = AUTOSAR_DATA_PROTOTYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__CATEGORY = AUTOSAR_DATA_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__SW_DATA_DEF_PROPS = AUTOSAR_DATA_PROTOTYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__SW_ADDR_METHOD = AUTOSAR_DATA_PROTOTYPE__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__SW_ALIGNMENT = AUTOSAR_DATA_PROTOTYPE__SW_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__TYPE = AUTOSAR_DATA_PROTOTYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE__INIT_VALUE = AUTOSAR_DATA_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_FEATURE_COUNT = AUTOSAR_DATA_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE___GET_SW_IMPL_POLICY = AUTOSAR_DATA_PROTOTYPE___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE___GET_SW_ADDR_METHOD = AUTOSAR_DATA_PROTOTYPE___GET_SW_ADDR_METHOD;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE___GET_SW_ALIGNMENT = AUTOSAR_DATA_PROTOTYPE___GET_SW_ALIGNMENT;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE = AUTOSAR_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE = AUTOSAR_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Variable Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_OPERATION_COUNT = AUTOSAR_DATA_PROTOTYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE__PORT = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_TYPE_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__PARENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Api Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE__PORT_API_OPTION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__ID = SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME = SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__REFERENCE = SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__CATEGORY = SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__PORT = SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT = SW_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = SW_COMPONENT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = SW_COMPONENT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = SW_COMPONENT_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = SW_COMPONENT_TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = SW_COMPONENT_TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS = SW_COMPONENT_TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS = SW_COMPONENT_TYPE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Atomic Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT = SW_COMPONENT_TYPE_OPERATION_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Application Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Application Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__ID = PORT_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__SHORT_NAME = PORT_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__REFERENCE = PORT_PROTOTYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__CATEGORY = PORT_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__PARENT = PORT_PROTOTYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Port Api Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__PORT_API_OPTION = PORT_PROTOTYPE__PORT_API_OPTION;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__REQUIRED_INTERFACE = PORT_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Com Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE__REQUIRED_COM_SPEC = PORT_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPort Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_FEATURE_COUNT = PORT_PROTOTYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE___GET_USING_DATA_TYPES = PORT_PROTOTYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPort Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_OPERATION_COUNT = PORT_PROTOTYPE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__ID = PORT_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__SHORT_NAME = PORT_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__REFERENCE = PORT_PROTOTYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__CATEGORY = PORT_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__PARENT = PORT_PROTOTYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Port Api Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__PORT_API_OPTION = PORT_PROTOTYPE__PORT_API_OPTION;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__PROVIDED_INTERFACE = PORT_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Com Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE__PROVIDED_COM_SPEC = PORT_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PPort Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_FEATURE_COUNT = PORT_PROTOTYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE___GET_USING_DATA_TYPES = PORT_PROTOTYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>PPort Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_OPERATION_COUNT = PORT_PROTOTYPE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Type Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusive Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__RUNNABLE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__EVENT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Api Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Included Data Type Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__PARENT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Explicit Inter Runnable Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Swc Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_PARENT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Referencer Included Data Type Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__APPLICATIONDATATYPE = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referencer Included Data Type Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__IMPLEMENTATIONDATATYPE = IDENTIFIABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_USING_DATA_TYPES = IDENTIFIABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = IDENTIFIABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__APPLICATIONDATATYPE = IDENTIFIABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = IDENTIFIABLE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Swc Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_INTERNAL_BEHAVIOR_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl <em>Executable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getExecutableEntity()
	 * @generated
	 */
	int EXECUTABLE_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__SW_ADDR_METHOD = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Executable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Executable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__ID = EXECUTABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__SHORT_NAME = EXECUTABLE_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__REFERENCE = EXECUTABLE_ENTITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__CATEGORY = EXECUTABLE_ENTITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__SW_ADDR_METHOD = EXECUTABLE_ENTITY__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Data Send Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__DATA_SEND_POINT = EXECUTABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Receive Point By Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT = EXECUTABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Call Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__SERVER_CALL_POINT = EXECUTABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__EVENT = EXECUTABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__PARENT = EXECUTABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__SYMBOL = EXECUTABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Written Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE = EXECUTABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Read Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY__READ_LOCAL_VARIABLE = EXECUTABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Runnable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_FEATURE_COUNT = EXECUTABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Runnable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_OPERATION_COUNT = EXECUTABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Accessed Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__ACCESSED_VARIABLE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Autosar Variable Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Autosar Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Autosar Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_VARIABLE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Autosar Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_VARIABLE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl <em>Variable In Atomic Swc Type Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableInAtomicSwcTypeInstanceRef()
	 * @generated
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF = 21;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Data Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable In Atomic Swc Type Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable In Atomic Swc Type Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef <em>IInstance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIInstanceRef()
	 * @generated
	 */
	int IINSTANCE_REF = 104;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__START_ON_EVENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT__CONFIG = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT__PERIOD = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BackgroundEventImpl <em>Background Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BackgroundEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBackgroundEvent()
	 * @generated
	 */
	int BACKGROUND_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The number of structural features of the '<em>Background Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Background Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataSendCompletedEventImpl <em>Data Send Completed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataSendCompletedEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataSendCompletedEvent()
	 * @generated
	 */
	int DATA_SEND_COMPLETED_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Event Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Source Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE_DATA = RTE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Send Completed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Send Completed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEND_COMPLETED_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceivedEventImpl <em>Data Received Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceivedEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataReceivedEvent()
	 * @generated
	 */
	int DATA_RECEIVED_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Data Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__DATA_IREF = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT__DATA = RTE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Received Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Received Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVED_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceiveErrorEventImpl <em>Data Receive Error Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceiveErrorEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataReceiveErrorEvent()
	 * @generated
	 */
	int DATA_RECEIVE_ERROR_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Data Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__DATA_IREF = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT__DATA = RTE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Receive Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Receive Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECEIVE_ERROR_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RVariableInAtomicSwcInstanceRefImpl <em>RVariable In Atomic Swc Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RVariableInAtomicSwcInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRVariableInAtomicSwcInstanceRef()
	 * @generated
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF = 28;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_DATA_ELEMENT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RVariable In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RVariable In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecuc Def Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation Config Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ecuc Module Configuration Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ecuc Module Configuration Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_CONFIGURATION_VALUES_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__DEFINITION_REF = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__PARAMETER_VALUE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__REFERENCE_VALUE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE__SUB_CONTAINER = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ecuc Container Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ecuc Container Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_VALUE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARAMETER_VALUE__DEFINITION_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecuc Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARAMETER_VALUE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecuc Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARAMETER_VALUE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_NUMERICAL_PARAM_VALUE__DEFINITION_REF = ECUC_PARAMETER_VALUE__DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_NUMERICAL_PARAM_VALUE__VALUE = ECUC_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecuc Numerical Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_NUMERICAL_PARAM_VALUE_FEATURE_COUNT = ECUC_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecuc Numerical Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_NUMERICAL_PARAM_VALUE_OPERATION_COUNT = ECUC_PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_TEXTUAL_PARAM_VALUE__DEFINITION_REF = ECUC_PARAMETER_VALUE__DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_TEXTUAL_PARAM_VALUE__VALUE = ECUC_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecuc Textual Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_TEXTUAL_PARAM_VALUE_FEATURE_COUNT = ECUC_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecuc Textual Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_TEXTUAL_PARAM_VALUE_OPERATION_COUNT = ECUC_PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecuc Abstract Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecuc Abstract Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ABSTRACT_REFERENCE_VALUE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERENCE_VALUE__DEFINITION_REF = ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERENCE_VALUE__VALUE = ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecuc Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERENCE_VALUE_FEATURE_COUNT = ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecuc Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERENCE_VALUE_OPERATION_COUNT = ECUC_ABSTRACT_REFERENCE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE__DEFINITION_REF = ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Value Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE__VALUE_IREF = ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE__VALUE = ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ecuc Instance Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE_FEATURE_COUNT = ECUC_ABSTRACT_REFERENCE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ecuc Instance Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_INSTANCE_REFERENCE_VALUE_OPERATION_COUNT = ECUC_ABSTRACT_REFERENCE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPort Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_COM_SPEC_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPort Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_COM_SPEC_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PPort Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_COM_SPEC_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PPort Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_COM_SPEC_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_COM_SPEC__DATA_ELEMENT = RPORT_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_COM_SPEC_FEATURE_COUNT = RPORT_COM_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_COM_SPEC_OPERATION_COUNT = RPORT_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_COM_SPEC__DATA_ELEMENT = PPORT_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmission Acknowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE = PPORT_COM_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_COM_SPEC_FEATURE_COUNT = PPORT_COM_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_COM_SPEC_OPERATION_COUNT = PPORT_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TransmissionAcknowledgementRequestImpl <em>Transmission Acknowledgement Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TransmissionAcknowledgementRequestImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTransmissionAcknowledgementRequest()
	 * @generated
	 */
	int TRANSMISSION_ACKNOWLEDGEMENT_REQUEST = 41;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_ACKNOWLEDGEMENT_REQUEST__TIMEOUT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transmission Acknowledgement Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_ACKNOWLEDGEMENT_REQUEST_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transmission Acknowledgement Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_ACKNOWLEDGEMENT_REQUEST_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC__DATA_ELEMENT = SENDER_COM_SPEC__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transmission Acknowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE = SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC__INIT_VALUE = SENDER_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nonqueued Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC_FEATURE_COUNT = SENDER_COM_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nonqueued Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC_OPERATION_COUNT = SENDER_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedSenderComSpecImpl <em>Queued Sender Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedSenderComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getQueuedSenderComSpec()
	 * @generated
	 */
	int QUEUED_SENDER_COM_SPEC = 43;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_SENDER_COM_SPEC__DATA_ELEMENT = SENDER_COM_SPEC__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transmission Acknowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE = SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE;

	/**
	 * The number of structural features of the '<em>Queued Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_SENDER_COM_SPEC_FEATURE_COUNT = SENDER_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Queued Sender Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_SENDER_COM_SPEC_OPERATION_COUNT = SENDER_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC__DATA_ELEMENT = RECEIVER_COM_SPEC__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alive Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT = RECEIVER_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE = RECEIVER_COM_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC__FILTER = RECEIVER_COM_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nonqueued Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC_FEATURE_COUNT = RECEIVER_COM_SPEC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Nonqueued Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_RECEIVER_COM_SPEC_OPERATION_COUNT = RECEIVER_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__ID = SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__SHORT_NAME = SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__REFERENCE = SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__CATEGORY = SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__PORT = SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__COMPONENT = SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE__CONNECTOR = SW_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE_FEATURE_COUNT = SW_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_SW_COMPONENT_TYPE_OPERATION_COUNT = SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The number of structural features of the '<em>Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_CONNECTOR_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__ID = SW_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__SHORT_NAME = SW_CONNECTOR__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__REFERENCE = SW_CONNECTOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__CATEGORY = SW_CONNECTOR__CATEGORY;

	/**
	 * The feature id for the '<em><b>Requester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__REQUESTER = SW_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__PROVIDER = SW_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provider Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF = SW_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requester Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF = SW_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assembly Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR_FEATURE_COUNT = SW_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Assembly Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_SW_CONNECTOR_OPERATION_COUNT = SW_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__ID = SW_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__SHORT_NAME = SW_CONNECTOR__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__REFERENCE = SW_CONNECTOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__CATEGORY = SW_CONNECTOR__CATEGORY;

	/**
	 * The feature id for the '<em><b>Inner Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__INNER_PORT = SW_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__OUTER_PORT = SW_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner Port Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR__INNER_PORT_IREF = SW_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delegation Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR_FEATURE_COUNT = SW_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Delegation Sw Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_SW_CONNECTOR_OPERATION_COUNT = SW_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeInCompositionInstanceRefImpl <em>Port Prototype In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	int PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = 50;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Target RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPort Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RPort Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Target PPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PPort Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PPort Prototype In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE__INSTANCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sw Component Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sw Component Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_PROTOTYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__INVALID_VALUE = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__COMPU_METHOD = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__DATA_CONSTR = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE__SW_ADDR_METHOD = AR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Autosar Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Autosar Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_DATA_TYPE_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__ID = AUTOSAR_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__SHORT_NAME = AUTOSAR_DATA_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__REFERENCE = AUTOSAR_DATA_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__CATEGORY = AUTOSAR_DATA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__SW_DATA_DEF_PROPS = AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Invalid Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__INVALID_VALUE = AUTOSAR_DATA_TYPE__INVALID_VALUE;

	/**
	 * The feature id for the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__COMPU_METHOD = AUTOSAR_DATA_TYPE__COMPU_METHOD;

	/**
	 * The feature id for the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__DATA_CONSTR = AUTOSAR_DATA_TYPE__DATA_CONSTR;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE__SW_ADDR_METHOD = AUTOSAR_DATA_TYPE__SW_ADDR_METHOD;

	/**
	 * The number of structural features of the '<em>Application Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE_FEATURE_COUNT = AUTOSAR_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE___GET_SW_IMPL_POLICY = AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY;

	/**
	 * The number of operations of the '<em>Application Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE_OPERATION_COUNT = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__ID = AUTOSAR_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__SHORT_NAME = AUTOSAR_DATA_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__REFERENCE = AUTOSAR_DATA_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__CATEGORY = AUTOSAR_DATA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__SW_DATA_DEF_PROPS = AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Invalid Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__INVALID_VALUE = AUTOSAR_DATA_TYPE__INVALID_VALUE;

	/**
	 * The feature id for the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__COMPU_METHOD = AUTOSAR_DATA_TYPE__COMPU_METHOD;

	/**
	 * The feature id for the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__DATA_CONSTR = AUTOSAR_DATA_TYPE__DATA_CONSTR;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__SW_ADDR_METHOD = AUTOSAR_DATA_TYPE__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Sub Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__SUB_ELEMENT = AUTOSAR_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__BASE_TYPE = AUTOSAR_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__SW_ALIGNMENT = AUTOSAR_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implementation Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_FEATURE_COUNT = AUTOSAR_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___GET_SW_IMPL_POLICY = AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Leaf Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___GET_LEAF_IMPLEMENTATION_DATA_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Primitive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_PRIMITIVE_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Pointer Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_POINTER_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Array Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_ARRAY_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Struct Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_STRUCT_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Union Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_UNION_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Redefinition Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_REDEFINITION_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Complex Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE___IS_COMPLEX_TYPE = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Implementation Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_OPERATION_COUNT = AUTOSAR_DATA_TYPE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupPrototypeImpl <em>Mode Declaration Group Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclarationGroupPrototype()
	 * @generated
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE = 62;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeRequestTypeMapImpl <em>Mode Request Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeRequestTypeMapImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeRequestTypeMap()
	 * @generated
	 */
	int MODE_REQUEST_TYPE_MAP = 63;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationImpl <em>Mode Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclaration()
	 * @generated
	 */
	int MODE_DECLARATION = 64;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupImpl <em>Mode Declaration Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclarationGroup()
	 * @generated
	 */
	int MODE_DECLARATION_GROUP = 65;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl <em>Exclusive Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getExclusiveArea()
	 * @generated
	 */
	int EXCLUSIVE_AREA = 69;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NumericalValueSpecificationImpl <em>Numerical Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NumericalValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNumericalValueSpecification()
	 * @generated
	 */
	int NUMERICAL_VALUE_SPECIFICATION = 70;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TextValueSpecificationImpl <em>Text Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TextValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTextValueSpecification()
	 * @generated
	 */
	int TEXT_VALUE_SPECIFICATION = 71;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantReferenceImpl <em>Constant Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantReferenceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getConstantReference()
	 * @generated
	 */
	int CONSTANT_REFERENCE = 72;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferenceValueSpecificationImpl <em>Reference Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferenceValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReferenceValueSpecification()
	 * @generated
	 */
	int REFERENCE_VALUE_SPECIFICATION = 73;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArrayValueSpecificationImpl <em>Array Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArrayValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArrayValueSpecification()
	 * @generated
	 */
	int ARRAY_VALUE_SPECIFICATION = 74;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RecordValueSpecificationImpl <em>Record Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RecordValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRecordValueSpecification()
	 * @generated
	 */
	int RECORD_VALUE_SPECIFICATION = 75;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationValueSpecificationImpl <em>Application Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationValueSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationValueSpecification()
	 * @generated
	 */
	int APPLICATION_VALUE_SPECIFICATION = 76;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantSpecificationImpl <em>Constant Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantSpecificationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getConstantSpecification()
	 * @generated
	 */
	int CONSTANT_SPECIFICATION = 77;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.OperationInvokedEventImpl <em>Operation Invoked Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.OperationInvokedEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getOperationInvokedEvent()
	 * @generated
	 */
	int OPERATION_INVOKED_EVENT = 78;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl <em>POperation In Atomic Swc Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPOperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF = 79;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerInterfaceImpl <em>Client Server Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerInterfaceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getClientServerInterface()
	 * @generated
	 */
	int CLIENT_SERVER_INTERFACE = 80;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerOperationImpl <em>Client Server Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getClientServerOperation()
	 * @generated
	 */
	int CLIENT_SERVER_OPERATION = 81;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationErrorImpl <em>Application Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationErrorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationError()
	 * @generated
	 */
	int APPLICATION_ERROR = 82;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArgumentDataPrototypeImpl <em>Argument Data Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArgumentDataPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArgumentDataPrototype()
	 * @generated
	 */
	int ARGUMENT_DATA_PROTOTYPE = 83;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataFilterImpl <em>Data Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataFilterImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataFilter()
	 * @generated
	 */
	int DATA_FILTER = 84;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedReceiverComSpecImpl <em>Queued Receiver Com Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedReceiverComSpecImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getQueuedReceiverComSpec()
	 * @generated
	 */
	int QUEUED_RECEIVER_COM_SPEC = 85;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InvalidationPolicyImpl <em>Invalidation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InvalidationPolicyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInvalidationPolicy()
	 * @generated
	 */
	int INVALIDATION_POLICY = 86;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl <em>Port Api Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortApiOption()
	 * @generated
	 */
	int PORT_API_OPTION = 87;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortDefinedArgumentValueImpl <em>Port Defined Argument Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortDefinedArgumentValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortDefinedArgumentValue()
	 * @generated
	 */
	int PORT_DEFINED_ARGUMENT_VALUE = 88;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IncludedDataTypeSetImpl <em>Included Data Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IncludedDataTypeSetImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIncludedDataTypeSet()
	 * @generated
	 */
	int INCLUDED_DATA_TYPE_SET = 89;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 90;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RootSwCompositionPrototypeImpl <em>Root Sw Composition Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RootSwCompositionPrototypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRootSwCompositionPrototype()
	 * @generated
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE = 91;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemMappingImpl <em>System Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemMapping()
	 * @generated
	 */
	int SYSTEM_MAPPING = 92;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataMapping()
	 * @generated
	 */
	int DATA_MAPPING = 93;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalImpl <em>System Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemSignal()
	 * @generated
	 */
	int SYSTEM_SIGNAL = 94;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalImpl <em>ISignal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignal()
	 * @generated
	 */
	int ISIGNAL = 95;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalIPduImpl <em>ISignal IPdu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalIPduImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalIPdu()
	 * @generated
	 */
	int ISIGNAL_IPDU = 96;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl <em>ISignal To IPdu Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalToIPduMapping()
	 * @generated
	 */
	int ISIGNAL_TO_IPDU_MAPPING = 97;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalMappingImpl <em>Sender Receiver To Signal Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverToSignalMapping()
	 * @generated
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING = 98;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl <em>Sender Receiver To Signal Group Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverToSignalGroupMapping()
	 * @generated
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING = 99;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl <em>Variable Data Prototype In System Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableDataPrototypeInSystemInstanceRef()
	 * @generated
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF = 100;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl <em>Ecuc Value Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucValueCollection()
	 * @generated
	 */
	int ECUC_VALUE_COLLECTION = 101;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServerCallPointImpl <em>Server Call Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServerCallPointImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServerCallPoint()
	 * @generated
	 */
	int SERVER_CALL_POINT = 102;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SynchronousServerCallPointImpl <em>Synchronous Server Call Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SynchronousServerCallPointImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSynchronousServerCallPoint()
	 * @generated
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT = 103;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl <em>ROperation In Atomic Swc Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getROperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF = 105;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl <em>Sw Addr Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwAddrMethod()
	 * @generated
	 */
	int SW_ADDR_METHOD = 106;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuMethodImpl <em>Compu Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuMethodImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuMethod()
	 * @generated
	 */
	int COMPU_METHOD = 107;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrImpl <em>Data Constr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataConstr()
	 * @generated
	 */
	int DATA_CONSTR = 108;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrRuleImpl <em>Data Constr Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrRuleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataConstrRule()
	 * @generated
	 */
	int DATA_CONSTR_RULE = 109;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl <em>Internal Constrs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInternalConstrs()
	 * @generated
	 */
	int INTERNAL_CONSTRS = 110;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuImpl <em>Compu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompu()
	 * @generated
	 */
	int COMPU = 111;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.LimitImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 112;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuScaleImpl <em>Compu Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuScaleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuScale()
	 * @generated
	 */
	int COMPU_SCALE = 113;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AnyInstanceRefImpl <em>Any Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AnyInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAnyInstanceRef()
	 * @generated
	 */
	int ANY_INSTANCE_REF = 115;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcuAbstractionSwComponentTypeImpl <em>Ecu Abstraction Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcuAbstractionSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcuAbstractionSwComponentType()
	 * @generated
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE = 116;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NvBlockSwComponentTypeImpl <em>Nv Block Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NvBlockSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNvBlockSwComponentType()
	 * @generated
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE = 117;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SensorActuatorSwComponentTypeImpl <em>Sensor Actuator Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SensorActuatorSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSensorActuatorSwComponentType()
	 * @generated
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE = 118;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ComplexDeviceDriverSwComponentTypeImpl <em>Complex Device Driver Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ComplexDeviceDriverSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getComplexDeviceDriverSwComponentType()
	 * @generated
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE = 119;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceProxySwComponentTypeImpl <em>Service Proxy Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceProxySwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServiceProxySwComponentType()
	 * @generated
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE = 120;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceSwComponentTypeImpl <em>Service Sw Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceSwComponentTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServiceSwComponentType()
	 * @generated
	 */
	int SERVICE_SW_COMPONENT_TYPE = 121;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInCompositionInstanceRefImpl <em>Port In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortInCompositionInstanceRef()
	 * @generated
	 */
	int PORT_IN_COMPOSITION_INSTANCE_REF = 122;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortInCompositionInstanceRefImpl <em>PPort In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortInCompositionInstanceRef()
	 * @generated
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF = 123;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortInCompositionInstanceRefImpl <em>RPort In Composition Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortInCompositionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortInCompositionInstanceRef()
	 * @generated
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF = 124;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior <em>Internal Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInternalBehavior()
	 * @generated
	 */
	int INTERNAL_BEHAVIOR = 125;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl <em>Swc Bsw Runnable Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcBswRunnableMapping()
	 * @generated
	 */
	int SWC_BSW_RUNNABLE_MAPPING = 126;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl <em>Swc Bsw Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcBswMapping()
	 * @generated
	 */
	int SWC_BSW_MAPPING = 127;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl <em>Bsw Internal Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswInternalBehavior()
	 * @generated
	 */
	int BSW_INTERNAL_BEHAVIOR = 128;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl <em>Bsw Mode Sender Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModeSenderPolicy()
	 * @generated
	 */
	int BSW_MODE_SENDER_POLICY = 129;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 130;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswImplementationImpl <em>Bsw Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswImplementation()
	 * @generated
	 */
	int BSW_IMPLEMENTATION = 131;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl <em>Bsw Module Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleDescription()
	 * @generated
	 */
	int BSW_MODULE_DESCRIPTION = 132;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl <em>Bsw Module Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleEntry()
	 * @generated
	 */
	int BSW_MODULE_ENTRY = 133;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl <em>Bsw Module Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleEntity()
	 * @generated
	 */
	int BSW_MODULE_ENTITY = 134;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswSchedulableEntityImpl <em>Bsw Schedulable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswSchedulableEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswSchedulableEntity()
	 * @generated
	 */
	int BSW_SCHEDULABLE_ENTITY = 135;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl <em>Bsw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswEvent()
	 * @generated
	 */
	int BSW_EVENT = 136;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSwitchEventImpl <em>Bsw Mode Switch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSwitchEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModeSwitchEvent()
	 * @generated
	 */
	int BSW_MODE_SWITCH_EVENT = 137;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeInBswModuleDescriptionInstanceRefImpl <em>Mode In Bsw Module Description Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeInBswModuleDescriptionInstanceRefImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeInBswModuleDescriptionInstanceRef()
	 * @generated
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF = 138;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind <em>Mode Activation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeActivationKind()
	 * @generated
	 */
	int MODE_ACTIVATION_KIND = 159;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswTimingEventImpl <em>Bsw Timing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswTimingEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswTimingEvent()
	 * @generated
	 */
	int BSW_TIMING_EVENT = 139;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswCalledEntityImpl <em>Bsw Called Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswCalledEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswCalledEntity()
	 * @generated
	 */
	int BSW_CALLED_ENTITY = 141;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInterruptEntityImpl <em>Bsw Interrupt Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInterruptEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswInterruptEntity()
	 * @generated
	 */
	int BSW_INTERRUPT_ENTITY = 142;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeElementImpl <em>Implementation Data Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeElementImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementationDataTypeElement()
	 * @generated
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Size Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE_SEMANTICS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implementation Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Redefinition Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT___IS_REDEFINITION_TYPE = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invalid Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__INVALID_VALUE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__BASE_TYPE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Impl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__SW_IMPL_POLICY = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__SW_ADDR_METHOD = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__SW_ALIGNMENT = M2_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__COMPU_METHOD = M2_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__DATA_CONSTR = M2_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE = M2_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sw Pointer Target Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS = M2_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Sw Data Def Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Sw Data Def Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_DATA_DEF_PROPS_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAP__APPLICATION_DATA_TYPE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAP_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAP_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Type Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__DATA_TYPE_MAP = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode Request Type Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET__MODE_REQUEST_TYPE_MAP = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type Mapping Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type Mapping Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_MAPPING_SET_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE__TYPE = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mode Declaration Group Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mode Declaration Group Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_REQUEST_TYPE_MAP__IMPLEMENTATION_DATA_TYPE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_REQUEST_TYPE_MAP__MODE_GROUP = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Request Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_REQUEST_TYPE_MAP_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Request Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_REQUEST_TYPE_MAP_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Mode Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mode Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Initial Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__INITIAL_MODE = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP__MODE_DECLARATION = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Declaration Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Declaration Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__ID = APPLICATION_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__SHORT_NAME = APPLICATION_DATA_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__REFERENCE = APPLICATION_DATA_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__CATEGORY = APPLICATION_DATA_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__SW_DATA_DEF_PROPS = APPLICATION_DATA_TYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Invalid Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__INVALID_VALUE = APPLICATION_DATA_TYPE__INVALID_VALUE;

	/**
	 * The feature id for the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__COMPU_METHOD = APPLICATION_DATA_TYPE__COMPU_METHOD;

	/**
	 * The feature id for the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__DATA_CONSTR = APPLICATION_DATA_TYPE__DATA_CONSTR;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE__SW_ADDR_METHOD = APPLICATION_DATA_TYPE__SW_ADDR_METHOD;

	/**
	 * The number of structural features of the '<em>Application Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE_FEATURE_COUNT = APPLICATION_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE___GET_SW_IMPL_POLICY = APPLICATION_DATA_TYPE___GET_SW_IMPL_POLICY;

	/**
	 * The number of operations of the '<em>Application Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PRIMITIVE_DATA_TYPE_OPERATION_COUNT = APPLICATION_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Swc Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__SWC_CONFIG = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bsw Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__BSW_CONFIG = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__PARENT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enter Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exclusive Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Exclusive Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_VALUE_SPECIFICATION__VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numerical Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numerical Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_SPECIFICATION__VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE__CONSTANT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get End Value Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE___GET_END_VALUE_SPEC = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_SPECIFICATION__ELEMENT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_SPECIFICATION__FIELD = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Value Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION__VALUE_SPEC = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SPECIFICATION_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__ID = RTE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__SHORT_NAME = RTE_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__REFERENCE = RTE_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__CATEGORY = RTE_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__START_ON_EVENT = RTE_EVENT__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__CONFIG = RTE_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Operation Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__OPERATION_IREF = RTE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT__OPERATION = RTE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Invoked Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT_FEATURE_COUNT = RTE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Invoked Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INVOKED_EVENT_OPERATION_COUNT = RTE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context PPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Provided Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>POperation In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>POperation In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_IN_ATOMIC_SWC_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__ID = PORT_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__SHORT_NAME = PORT_INTERFACE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__REFERENCE = PORT_INTERFACE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__CATEGORY = PORT_INTERFACE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__OPERATION = PORT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE__POSSIBLE_ERROR = PORT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client Server Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE_FEATURE_COUNT = PORT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client Server Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_INTERFACE_OPERATION_COUNT = PORT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__POSSIBLE_ERROR = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION__ARGUMENT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client Server Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client Server Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_OPERATION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__ERROR_CODE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR__PARENT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ERROR_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__ID = AUTOSAR_DATA_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__SHORT_NAME = AUTOSAR_DATA_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__REFERENCE = AUTOSAR_DATA_PROTOTYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__CATEGORY = AUTOSAR_DATA_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__SW_DATA_DEF_PROPS = AUTOSAR_DATA_PROTOTYPE__SW_DATA_DEF_PROPS;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__SW_ADDR_METHOD = AUTOSAR_DATA_PROTOTYPE__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__SW_ALIGNMENT = AUTOSAR_DATA_PROTOTYPE__SW_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__TYPE = AUTOSAR_DATA_PROTOTYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE__DIRECTION = AUTOSAR_DATA_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE_FEATURE_COUNT = AUTOSAR_DATA_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE___GET_SW_IMPL_POLICY = AUTOSAR_DATA_PROTOTYPE___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE___GET_SW_ADDR_METHOD = AUTOSAR_DATA_PROTOTYPE___GET_SW_ADDR_METHOD;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE___GET_SW_ALIGNMENT = AUTOSAR_DATA_PROTOTYPE___GET_SW_ALIGNMENT;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE = AUTOSAR_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE = AUTOSAR_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Argument Data Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DATA_PROTOTYPE_OPERATION_COUNT = AUTOSAR_DATA_PROTOTYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__DATA_FILTER_TYPE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__MASK = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__MAX = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__MIN = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__OFFSET = M2_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__PERIOD = M2_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER__X = M2_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Filter Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER___IS_FILTER_ENABLED = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER___IS_COMPATIBLE_WITH__DATAFILTER = M2_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTER_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_RECEIVER_COM_SPEC__DATA_ELEMENT = RECEIVER_COM_SPEC__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_RECEIVER_COM_SPEC__QUEUE_LENGTH = RECEIVER_COM_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Queued Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_RECEIVER_COM_SPEC_FEATURE_COUNT = RECEIVER_COM_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Queued Receiver Com Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_RECEIVER_COM_SPEC_OPERATION_COUNT = RECEIVER_COM_SPEC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY__DATA_ELEMENT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handle Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY__HANDLE_INVALID = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invalidation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Invalidation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY___IS_INVALIDATION_ENABLED = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Invalidation Keep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY___IS_INVALIDATION_KEEP = M2_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Invalidation Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY___IS_INVALIDATION_REPLACE = M2_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Invalidation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_POLICY_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Arg Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_API_OPTION__PORT_ARG_VALUE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_API_OPTION__PORT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Take Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_API_OPTION__ENABLE_TAKE_ADDRESS = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Api Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_API_OPTION_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Port Api Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_API_OPTION_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINED_ARGUMENT_VALUE__VALUE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINED_ARGUMENT_VALUE__VALUE_TYPE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINED_ARGUMENT_VALUE__PARENT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Defined Argument Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINED_ARGUMENT_VALUE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Port Defined Argument Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINED_ARGUMENT_VALUE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_DATA_TYPE_SET__DATA_TYPE = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Included Data Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_DATA_TYPE_SET_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Included Data Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_DATA_TYPE_SET_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Root Software Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROOT_SOFTWARE_COMPOSITION = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MAPPING = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Software Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE__SOFTWARE_COMPOSITION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Sw Composition Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Sw Composition Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SW_COMPOSITION_PROTOTYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING__DATA_MAPPING = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MAPPING_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>System Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL__SYSTEM_SIGNAL = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ISignal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ISignal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>ISignal To Pdu Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU__ISIGNAL_TO_PDU_MAPPING = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ISignal IPdu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ISignal IPdu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_IPDU_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>ISignal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__ISIGNAL = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ISignal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ISignal To IPdu Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ISignal To IPdu Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_TO_IPDU_MAPPING_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING__SYSTEM_SIGNAL = DATA_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT_IREF = DATA_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT = DATA_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sender Receiver To Signal Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_FEATURE_COUNT = DATA_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sender Receiver To Signal Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_OPERATION_COUNT = DATA_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP = DATA_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Element Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF = DATA_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT = DATA_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING = DATA_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sender Receiver To Signal Group Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_FEATURE_COUNT = DATA_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sender Receiver To Signal Group Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_OPERATION_COUNT = DATA_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Data Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Data Prototype In System Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable Data Prototype In System Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Ecuc Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__ECUC_VALUE = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecu Extract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION__ECU_EXTRACT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ecuc Value Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ecuc Value Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_VALUE_COLLECTION_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Operation Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__OPERATION_IREF = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT__OPERATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Call Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server Call Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_POINT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__ID = SERVER_CALL_POINT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__SHORT_NAME = SERVER_CALL_POINT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__REFERENCE = SERVER_CALL_POINT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__CATEGORY = SERVER_CALL_POINT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Operation Iref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__OPERATION_IREF = SERVER_CALL_POINT__OPERATION_IREF;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT__OPERATION = SERVER_CALL_POINT__OPERATION;

	/**
	 * The number of structural features of the '<em>Synchronous Server Call Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT_FEATURE_COUNT = SERVER_CALL_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronous Server Call Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_POINT_OPERATION_COUNT = SERVER_CALL_POINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_REF__INSTANCE_REF = 0;

	/**
	 * The number of structural features of the '<em>IInstance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IInstance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_REF_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Required Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROperation In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ROperation In Atomic Swc Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Memory Allocation Keyword Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Initialization Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sw Addr Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sw Addr Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_ADDR_METHOD_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Compu Internal To Phys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD__COMPU_INTERNAL_TO_PHYS = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Constr Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR__DATA_CONSTR_RULE = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Constr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Lower Limit Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR___GET_LOWER_LIMIT_VALUE = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Upper Limit Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR___GET_UPPER_LIMIT_VALUE = AR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Constr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Constrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR_RULE__INTERNAL_CONSTRS = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Constr Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR_RULE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Constr Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTR_RULE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONSTRS__LOWER_LIMIT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONSTRS__UPPER_LIMIT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Constrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONSTRS_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internal Constrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONSTRS_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compu Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU__COMPU_SCALE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__VALUE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE__LOWER_LIMIT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE__SHORT_LABEL = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE__SYMBOL = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE__UPPER_LIMIT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compu Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE__COMPU_CONST = M2_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compu Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compu Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuConstImpl <em>Compu Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuConstImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuConst()
	 * @generated
	 */
	int COMPU_CONST = 114;

	/**
	 * The feature id for the '<em><b>Vt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_CONST__VT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compu Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_CONST_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compu Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_CONST_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INSTANCE_REF__CONTEXT_ELEMENT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INSTANCE_REF__TARGET = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Any Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Any Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Ecu Abstraction Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Ecu Abstraction Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_ABSTRACTION_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Nv Block Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Nv Block Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_BLOCK_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Sensor Actuator Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Sensor Actuator Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTUATOR_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Complex Device Driver Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Complex Device Driver Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Service Proxy Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Service Proxy Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROXY_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__ID = ATOMIC_SW_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__SHORT_NAME = ATOMIC_SW_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__REFERENCE = ATOMIC_SW_COMPONENT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__CATEGORY = ATOMIC_SW_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__PORT = ATOMIC_SW_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Service Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE_FEATURE_COUNT = ATOMIC_SW_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Using Application Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Using Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE;

	/**
	 * The operation id for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES;

	/**
	 * The operation id for the '<em>Get RPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_RPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS;

	/**
	 * The operation id for the '<em>Get PPorts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE___GET_PPORTS = ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS;

	/**
	 * The number of operations of the '<em>Service Sw Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SW_COMPONENT_TYPE_OPERATION_COUNT = ATOMIC_SW_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = PORT_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = PORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Target PPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT = PORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PPort In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = PORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PPort In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPORT_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = PORT_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF = PORT_IN_COMPOSITION_INSTANCE_REF__INSTANCE_REF;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = PORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Target RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT = PORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPort In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT = PORT_IN_COMPOSITION_INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RPort In Composition Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT = PORT_IN_COMPOSITION_INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Type Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusive Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR__EXCLUSIVE_AREA = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR___GET_PARENT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOR_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swc Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bsw Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swc Bsw Runnable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_RUNNABLE_MAPPING_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swc Bsw Runnable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_RUNNABLE_MAPPING_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Runnable Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__RUNNABLE_MAPPING = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Swc Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__SWC_BEHAVIOR = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bsw Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING__BSW_BEHAVIOR = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Swc Bsw Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Swc Bsw Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_BSW_MAPPING_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__ID = INTERNAL_BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__SHORT_NAME = INTERNAL_BEHAVIOR__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__REFERENCE = INTERNAL_BEHAVIOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__CATEGORY = INTERNAL_BEHAVIOR__CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Type Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING = INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING;

	/**
	 * The feature id for the '<em><b>Exclusive Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA = INTERNAL_BEHAVIOR__EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__PARENT = INTERNAL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__ENTITY = INTERNAL_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__EVENT = INTERNAL_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION = INTERNAL_BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode Sender Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY = INTERNAL_BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY = INTERNAL_BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bsw Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR_FEATURE_COUNT = INTERNAL_BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR___GET_PARENT = INTERNAL_BEHAVIOR___GET_PARENT;

	/**
	 * The number of operations of the '<em>Bsw Internal Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERNAL_BEHAVIOR_OPERATION_COUNT = INTERNAL_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Mode Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SENDER_POLICY__QUEUE_LENGTH = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bsw Mode Sender Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SENDER_POLICY_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bsw Mode Sender Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SENDER_POLICY_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Swc Bsw Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SWC_BSW_MAPPING = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__ID = IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__SHORT_NAME = IMPLEMENTATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__REFERENCE = IMPLEMENTATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__CATEGORY = IMPLEMENTATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Swc Bsw Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__SWC_BSW_MAPPING = IMPLEMENTATION__SWC_BSW_MAPPING;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION__BEHAVIOR = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_IMPLEMENTATION_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Internal Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Mode Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Mode Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bsw Module Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Enable Internal Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bsw Module Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_DESCRIPTION_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__SERVICE_ID = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__CALL_TYPE = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY__EXECUTION_CONTEXT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bsw Module Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bsw Module Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTRY_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__ID = EXECUTABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__SHORT_NAME = EXECUTABLE_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__REFERENCE = EXECUTABLE_ENTITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__CATEGORY = EXECUTABLE_ENTITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__SW_ADDR_METHOD = EXECUTABLE_ENTITY__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Implemented Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY = EXECUTABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__PARENT = EXECUTABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accessed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP = EXECUTABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Managed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY__MANAGED_MODE_GROUP = EXECUTABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bsw Module Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY_FEATURE_COUNT = EXECUTABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bsw Module Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODULE_ENTITY_OPERATION_COUNT = EXECUTABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__ID = BSW_MODULE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__SHORT_NAME = BSW_MODULE_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__REFERENCE = BSW_MODULE_ENTITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__CATEGORY = BSW_MODULE_ENTITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__SW_ADDR_METHOD = BSW_MODULE_ENTITY__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Implemented Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__IMPLEMENTED_ENTRY = BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__PARENT = BSW_MODULE_ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Accessed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__ACCESSED_MODE_GROUP = BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP;

	/**
	 * The feature id for the '<em><b>Managed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__MANAGED_MODE_GROUP = BSW_MODULE_ENTITY__MANAGED_MODE_GROUP;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__EVENT = BSW_MODULE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Schedulable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT = BSW_MODULE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Schedulable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_OPERATION_COUNT = BSW_MODULE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__REFERENCE = IDENTIFIABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Starts On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__STARTS_ON_EVENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__CONFIG = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__PARENT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled In Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT__DISABLED_IN_MODE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bsw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bsw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_EVENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__ID = BSW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__SHORT_NAME = BSW_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__REFERENCE = BSW_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__CATEGORY = BSW_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Starts On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__STARTS_ON_EVENT = BSW_EVENT__STARTS_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__CONFIG = BSW_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__PARENT = BSW_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Disabled In Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__DISABLED_IN_MODE = BSW_EVENT__DISABLED_IN_MODE;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__ACTIVATION = BSW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode Iref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT__MODE_IREF = BSW_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bsw Mode Switch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT_FEATURE_COUNT = BSW_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bsw Mode Switch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MODE_SWITCH_EVENT_OPERATION_COUNT = BSW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__INSTANCE_REF = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Mode Declaration Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode In Bsw Module Description Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mode In Bsw Module Description Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__ID = BSW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__SHORT_NAME = BSW_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__REFERENCE = BSW_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__CATEGORY = BSW_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Starts On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__STARTS_ON_EVENT = BSW_EVENT__STARTS_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__CONFIG = BSW_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__PARENT = BSW_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Disabled In Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__DISABLED_IN_MODE = BSW_EVENT__DISABLED_IN_MODE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT__PERIOD = BSW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Timing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT_FEATURE_COUNT = BSW_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Timing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_TIMING_EVENT_OPERATION_COUNT = BSW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswBackgroundEventImpl <em>Bsw Background Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswBackgroundEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswBackgroundEvent()
	 * @generated
	 */
	int BSW_BACKGROUND_EVENT = 140;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__ID = BSW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__SHORT_NAME = BSW_EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__REFERENCE = BSW_EVENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__CATEGORY = BSW_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Starts On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__STARTS_ON_EVENT = BSW_EVENT__STARTS_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__CONFIG = BSW_EVENT__CONFIG;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__PARENT = BSW_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Disabled In Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT__DISABLED_IN_MODE = BSW_EVENT__DISABLED_IN_MODE;

	/**
	 * The number of structural features of the '<em>Bsw Background Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT_FEATURE_COUNT = BSW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bsw Background Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_BACKGROUND_EVENT_OPERATION_COUNT = BSW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__ID = BSW_MODULE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__SHORT_NAME = BSW_MODULE_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__REFERENCE = BSW_MODULE_ENTITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__CATEGORY = BSW_MODULE_ENTITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__SW_ADDR_METHOD = BSW_MODULE_ENTITY__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Implemented Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__IMPLEMENTED_ENTRY = BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__PARENT = BSW_MODULE_ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Accessed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__ACCESSED_MODE_GROUP = BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP;

	/**
	 * The feature id for the '<em><b>Managed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY__MANAGED_MODE_GROUP = BSW_MODULE_ENTITY__MANAGED_MODE_GROUP;

	/**
	 * The number of structural features of the '<em>Bsw Called Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY_FEATURE_COUNT = BSW_MODULE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bsw Called Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_CALLED_ENTITY_OPERATION_COUNT = BSW_MODULE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__ID = BSW_MODULE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__SHORT_NAME = BSW_MODULE_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__REFERENCE = BSW_MODULE_ENTITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__CATEGORY = BSW_MODULE_ENTITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = BSW_MODULE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA;

	/**
	 * The feature id for the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__SW_ADDR_METHOD = BSW_MODULE_ENTITY__SW_ADDR_METHOD;

	/**
	 * The feature id for the '<em><b>Implemented Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__IMPLEMENTED_ENTRY = BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__PARENT = BSW_MODULE_ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Accessed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__ACCESSED_MODE_GROUP = BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP;

	/**
	 * The feature id for the '<em><b>Managed Mode Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__MANAGED_MODE_GROUP = BSW_MODULE_ENTITY__MANAGED_MODE_GROUP;

	/**
	 * The feature id for the '<em><b>Interrupt Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY__INTERRUPT_SOURCE = BSW_MODULE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Interrupt Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY_FEATURE_COUNT = BSW_MODULE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Interrupt Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_INTERRUPT_ENTITY_OPERATION_COUNT = BSW_MODULE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalGroupImpl <em>System Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemSignalGroup()
	 * @generated
	 */
	int SYSTEM_SIGNAL_GROUP = 143;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>System Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP__SYSTEM_SIGNAL = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SIGNAL_GROUP_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalGroupImpl <em>ISignal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalGroup()
	 * @generated
	 */
	int ISIGNAL_GROUP = 144;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__ID = AR_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__SHORT_NAME = AR_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__REFERENCE = AR_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__CATEGORY = AR_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>System Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__SYSTEM_SIGNAL_GROUP = AR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ISignal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP__ISIGNAL = AR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ISignal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP_FEATURE_COUNT = AR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ISignal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIGNAL_GROUP_OPERATION_COUNT = AR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecCompositeTypeMappingImpl <em>Sender Rec Composite Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecCompositeTypeMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecCompositeTypeMapping()
	 * @generated
	 */
	int SENDER_REC_COMPOSITE_TYPE_MAPPING = 145;

	/**
	 * The number of structural features of the '<em>Sender Rec Composite Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_COMPOSITE_TYPE_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sender Rec Composite Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_COMPOSITE_TYPE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordTypeMappingImpl <em>Sender Rec Record Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordTypeMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecRecordTypeMapping()
	 * @generated
	 */
	int SENDER_REC_RECORD_TYPE_MAPPING = 146;

	/**
	 * The feature id for the '<em><b>Record Element Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_TYPE_MAPPING__RECORD_ELEMENT_MAPPING = SENDER_REC_COMPOSITE_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender Rec Record Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_TYPE_MAPPING_FEATURE_COUNT = SENDER_REC_COMPOSITE_TYPE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sender Rec Record Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_TYPE_MAPPING_OPERATION_COUNT = SENDER_REC_COMPOSITE_TYPE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl <em>Sender Rec Record Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecRecordElementMapping()
	 * @generated
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING = 147;

	/**
	 * The feature id for the '<em><b>Implementation Record Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sender Rec Record Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sender Rec Record Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_RECORD_ELEMENT_MAPPING_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayTypeMappingImpl <em>Sender Rec Array Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayTypeMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecArrayTypeMapping()
	 * @generated
	 */
	int SENDER_REC_ARRAY_TYPE_MAPPING = 148;

	/**
	 * The feature id for the '<em><b>Array Element Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_TYPE_MAPPING__ARRAY_ELEMENT_MAPPING = SENDER_REC_COMPOSITE_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender Rec Array Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_TYPE_MAPPING_FEATURE_COUNT = SENDER_REC_COMPOSITE_TYPE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sender Rec Array Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_TYPE_MAPPING_OPERATION_COUNT = SENDER_REC_COMPOSITE_TYPE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IndexedArrayElementImpl <em>Indexed Array Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IndexedArrayElementImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIndexedArrayElement()
	 * @generated
	 */
	int INDEXED_ARRAY_ELEMENT = 149;

	/**
	 * The feature id for the '<em><b>Implementation Array Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_ARRAY_ELEMENT__IMPLEMENTATION_ARRAY_ELEMENT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_ARRAY_ELEMENT__INDEX = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indexed Array Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_ARRAY_ELEMENT_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Indexed Array Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_ARRAY_ELEMENT_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl <em>Sender Rec Array Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecArrayElementMapping()
	 * @generated
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING = 150;

	/**
	 * The feature id for the '<em><b>Indexed Array Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sender Rec Array Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sender Rec Array Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_REC_ARRAY_ELEMENT_MAPPING_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl <em>Sw Pointer Target Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwPointerTargetProps()
	 * @generated
	 */
	int SW_POINTER_TARGET_PROPS = 151;

	/**
	 * The feature id for the '<em><b>Target Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_POINTER_TARGET_PROPS__TARGET_CATEGORY = M2_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sw Data Def Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS = M2_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sw Pointer Target Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_POINTER_TARGET_PROPS_FEATURE_COUNT = M2_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sw Pointer Target Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_POINTER_TARGET_PROPS_OPERATION_COUNT = M2_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum <em>Argument Direction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArgumentDirectionEnum()
	 * @generated
	 */
	int ARGUMENT_DIRECTION_ENUM = 153;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum <em>Data Filter Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataFilterTypeEnum()
	 * @generated
	 */
	int DATA_FILTER_TYPE_ENUM = 154;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum <em>Handle Invalid Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getHandleInvalidEnum()
	 * @generated
	 */
	int HANDLE_INVALID_ENUM = 155;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum <em>Sw Impl Policy Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwImplPolicyEnum()
	 * @generated
	 */
	int SW_IMPL_POLICY_ENUM = 156;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType <em>Memory Allocation Keyword Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getMemoryAllocationKeywordPolicyType()
	 * @generated
	 */
	int MEMORY_ALLOCATION_KEYWORD_POLICY_TYPE = 157;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum <em>Ecuc Configuration Variant Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucConfigurationVariantEnum()
	 * @generated
	 */
	int ECUC_CONFIGURATION_VARIANT_ENUM = 158;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum <em>Bsw Call Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswCallTypeEnum()
	 * @generated
	 */
	int BSW_CALL_TYPE_ENUM = 160;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum <em>Bsw Execution Context Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswExecutionContextEnum()
	 * @generated
	 */
	int BSW_EXECUTION_CONTEXT_ENUM = 161;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum <em>Array Size Semantics Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArraySizeSemanticsEnum()
	 * @generated
	 */
	int ARRAY_SIZE_SEMANTICS_ENUM = 152;

	/**
	 * The meta object id for the '<em>Numerical</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNumerical()
	 * @generated
	 */
	int NUMERICAL = 162;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 163;

	/**
	 * The meta object id for the '<em>Unlimited Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getUnlimitedInteger()
	 * @generated
	 */
	int UNLIMITED_INTEGER = 164;

	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 165;

	/**
	 * The meta object id for the '<em>Time Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 166;

	/**
	 * The meta object id for the '<em>Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRef()
	 * @generated
	 */
	int REF = 167;

	/**
	 * The meta object id for the '<em>CIdentifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCIdentifier()
	 * @generated
	 */
	int CIDENTIFIER = 168;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 169;

	/**
	 * The meta object id for the '<em>Verbatim String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVerbatimString()
	 * @generated
	 */
	int VERBATIM_STRING = 170;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 171;

	/**
	 * The meta object id for the '<em>Native Declaration String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNativeDeclarationString()
	 * @generated
	 */
	int NATIVE_DECLARATION_STRING = 172;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 173;

	/**
	 * The meta object id for the '<em>Section Initialization Policy Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSectionInitializationPolicyType()
	 * @generated
	 */
	int SECTION_INITIALIZATION_POLICY_TYPE = 174;

	/**
	 * The meta object id for the '<em>Category String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCategoryString()
	 * @generated
	 */
	int CATEGORY_STRING = 175;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getString()
	 * @generated
	 */
	int STRING = 176;

	/**
	 * The meta object id for the '<em>Base Type Encoding String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBaseTypeEncodingString()
	 * @generated
	 */
	int BASE_TYPE_ENCODING_STRING = 177;

	/**
	 * The meta object id for the '<em>Revision Label String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRevisionLabelString()
	 * @generated
	 */
	int REVISION_LABEL_STRING = 178;

	/**
	 * The meta object id for the '<em>Alignment Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAlignmentType()
	 * @generated
	 */
	int ALIGNMENT_TYPE = 179;

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root
	 * @generated
	 */
	EClass getM2Root();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root#getAutosar <em>Autosar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autosar</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root#getAutosar()
	 * @see #getM2Root()
	 * @generated
	 */
	EReference getM2Root_Autosar();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar <em>Autosar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autosar</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar
	 * @generated
	 */
	EClass getAutosar();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar#getId()
	 * @see #getAutosar()
	 * @generated
	 */
	EAttribute getAutosar_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar#getArPackage <em>Ar Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ar Package</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar#getArPackage()
	 * @see #getAutosar()
	 * @generated
	 */
	EReference getAutosar_ArPackage();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage <em>Ar Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ar Package</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage
	 * @generated
	 */
	EClass getArPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage#getElement()
	 * @see #getArPackage()
	 * @generated
	 */
	EReference getArPackage_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage#getArPackage <em>Ar Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ar Package</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage#getArPackage()
	 * @see #getArPackage()
	 * @generated
	 */
	EReference getArPackage_ArPackage();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArElement <em>Ar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ar Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArElement
	 * @generated
	 */
	EClass getArElement();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable#getCategory()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Category();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object
	 * @generated
	 */
	EClass getM2Object();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType <em>Sw Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Base Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType
	 * @generated
	 */
	EClass getSwBaseType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getBaseTypeEncoding <em>Base Type Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type Encoding</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getBaseTypeEncoding()
	 * @see #getSwBaseType()
	 * @generated
	 */
	EAttribute getSwBaseType_BaseTypeEncoding();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getBaseTypeSize <em>Base Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type Size</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getBaseTypeSize()
	 * @see #getSwBaseType()
	 * @generated
	 */
	EAttribute getSwBaseType_BaseTypeSize();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getNativeDeclaration <em>Native Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Declaration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getNativeDeclaration()
	 * @see #getSwBaseType()
	 * @generated
	 */
	EAttribute getSwBaseType_NativeDeclaration();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getUpperLimitForUnsignedInteger() <em>Get Upper Limit For Unsigned Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Upper Limit For Unsigned Integer</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType#getUpperLimitForUnsignedInteger()
	 * @generated
	 */
	EOperation getSwBaseType__GetUpperLimitForUnsignedInteger();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface <em>Sender Receiver Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver Interface</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface
	 * @generated
	 */
	EClass getSenderReceiverInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface#getDataElement()
	 * @see #getSenderReceiverInterface()
	 * @generated
	 */
	EReference getSenderReceiverInterface_DataElement();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface#getInvalidationPolicy <em>Invalidation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invalidation Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface#getInvalidationPolicy()
	 * @see #getSenderReceiverInterface()
	 * @generated
	 */
	EReference getSenderReceiverInterface_InvalidationPolicy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype <em>Variable Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype
	 * @generated
	 */
	EClass getVariableDataPrototype();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype#getInitValue()
	 * @see #getVariableDataPrototype()
	 * @generated
	 */
	EReference getVariableDataPrototype_InitValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getId()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getShortName()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable#getReference()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_Reference();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType <em>Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType
	 * @generated
	 */
	EClass getSwComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType#getPort()
	 * @see #getSwComponentType()
	 * @generated
	 */
	EReference getSwComponentType_Port();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype <em>Port Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype
	 * @generated
	 */
	EClass getPortPrototype();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype#getParent()
	 * @see #getPortPrototype()
	 * @generated
	 */
	EReference getPortPrototype_Parent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype#getPortApiOption <em>Port Api Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Api Option</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype#getPortApiOption()
	 * @see #getPortPrototype()
	 * @generated
	 */
	EReference getPortPrototype_PortApiOption();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType <em>Atomic Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType
	 * @generated
	 */
	EClass getAtomicSwComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior()
	 * @see #getAtomicSwComponentType()
	 * @generated
	 */
	EReference getAtomicSwComponentType_InternalBehavior();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingApplicationDataTypes() <em>Get Using Application Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Application Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingApplicationDataTypes()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetUsingApplicationDataTypes();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingImplementationDataTypes() <em>Get Using Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Implementation Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingImplementationDataTypes()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetUsingImplementationDataTypes();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingDataTypes()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetUsingDataTypes();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType)
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetImplementationDataType__AutosarDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetImplementationDataTypes__ApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingClientServerInterfaces() <em>Get Using Client Server Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Client Server Interfaces</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getUsingClientServerInterfaces()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetUsingClientServerInterfaces();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getRPorts() <em>Get RPorts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RPorts</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getRPorts()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetRPorts();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getPPorts() <em>Get PPorts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PPorts</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getPPorts()
	 * @generated
	 */
	EOperation getAtomicSwComponentType__GetPPorts();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationSwComponentType <em>Application Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationSwComponentType
	 * @generated
	 */
	EClass getApplicationSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype <em>RPort Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPort Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype
	 * @generated
	 */
	EClass getRPortPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getRequiredInterface()
	 * @see #getRPortPrototype()
	 * @generated
	 */
	EReference getRPortPrototype_RequiredInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getRequiredComSpec <em>Required Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getRequiredComSpec()
	 * @see #getRPortPrototype()
	 * @generated
	 */
	EReference getRPortPrototype_RequiredComSpec();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype#getUsingDataTypes()
	 * @generated
	 */
	EOperation getRPortPrototype__GetUsingDataTypes();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype <em>PPort Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPort Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype
	 * @generated
	 */
	EClass getPPortPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getProvidedInterface()
	 * @see #getPPortPrototype()
	 * @generated
	 */
	EReference getPPortPrototype_ProvidedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getProvidedComSpec <em>Provided Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getProvidedComSpec()
	 * @see #getPPortPrototype()
	 * @generated
	 */
	EReference getPPortPrototype_ProvidedComSpec();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype#getUsingDataTypes()
	 * @generated
	 */
	EOperation getPPortPrototype__GetUsingDataTypes();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior <em>Swc Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Internal Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior
	 * @generated
	 */
	EClass getSwcInternalBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getRunnable()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_Runnable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getEvent()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getPortApiOption <em>Port Api Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Api Option</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getPortApiOption()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_PortApiOption();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getIncludedDataTypeSet <em>Included Data Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Data Type Set</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getIncludedDataTypeSet()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_IncludedDataTypeSet();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getExplicitInterRunnableVariable <em>Explicit Inter Runnable Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Explicit Inter Runnable Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getExplicitInterRunnableVariable()
	 * @see #getSwcInternalBehavior()
	 * @generated
	 */
	EReference getSwcInternalBehavior_ExplicitInterRunnableVariable();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Referencer Included Data Type Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referencer Included Data Type Sets</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Get Referencer Included Data Type Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referencer Included Data Type Sets</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getReferencerIncludedDataTypeSets(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getUsingDataTypes()
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetUsingDataTypes();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType)
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetImplementationDataType__AutosarDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetImplementationDataType__ApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Types</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getSwcInternalBehavior__GetImplementationDataTypes__ApplicationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity
	 * @generated
	 */
	EClass getExecutableEntity();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getCanEnterExclusiveArea <em>Can Enter Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Enter Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getCanEnterExclusiveArea()
	 * @see #getExecutableEntity()
	 * @generated
	 */
	EReference getExecutableEntity_CanEnterExclusiveArea();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getRunsInsideExclusiveArea <em>Runs Inside Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs Inside Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getRunsInsideExclusiveArea()
	 * @see #getExecutableEntity()
	 * @generated
	 */
	EReference getExecutableEntity_RunsInsideExclusiveArea();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getSwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sw Addr Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getSwAddrMethod()
	 * @see #getExecutableEntity()
	 * @generated
	 */
	EReference getExecutableEntity_SwAddrMethod();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity <em>Runnable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity
	 * @generated
	 */
	EClass getRunnableEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getDataSendPoint <em>Data Send Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Send Point</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getDataSendPoint()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_DataSendPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getDataReceivePointByArgument <em>Data Receive Point By Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Receive Point By Argument</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getDataReceivePointByArgument()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_DataReceivePointByArgument();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getSymbol()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EAttribute getRunnableEntity_Symbol();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getWrittenLocalVariable <em>Written Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Written Local Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getWrittenLocalVariable()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_WrittenLocalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getReadLocalVariable <em>Read Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Read Local Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getReadLocalVariable()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_ReadLocalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getServerCallPoint <em>Server Call Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server Call Point</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getServerCallPoint()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_ServerCallPoint();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getEvent()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_Event();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent()
	 * @see #getRunnableEntity()
	 * @generated
	 */
	EReference getRunnableEntity_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess#getAccessedVariable <em>Accessed Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accessed Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess#getAccessedVariable()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EReference getVariableAccess_AccessedVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef <em>Autosar Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autosar Variable Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef
	 * @generated
	 */
	EClass getAutosarVariableRef();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getAutosarVariableIref <em>Autosar Variable Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autosar Variable Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getAutosarVariableIref()
	 * @see #getAutosarVariableRef()
	 * @generated
	 */
	EReference getAutosarVariableRef_AutosarVariableIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getAutosarVariable <em>Autosar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Autosar Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getAutosarVariable()
	 * @see #getAutosarVariableRef()
	 * @generated
	 */
	EReference getAutosarVariableRef_AutosarVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getLocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef#getLocalVariable()
	 * @see #getAutosarVariableRef()
	 * @generated
	 */
	EReference getAutosarVariableRef_LocalVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef <em>Variable In Atomic Swc Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable In Atomic Swc Type Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef
	 * @generated
	 */
	EClass getVariableInAtomicSwcTypeInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef#getPortPrototype <em>Port Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef#getPortPrototype()
	 * @see #getVariableInAtomicSwcTypeInstanceRef()
	 * @generated
	 */
	EReference getVariableInAtomicSwcTypeInstanceRef_PortPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef#getTargetDataPrototype <em>Target Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcTypeInstanceRef#getTargetDataPrototype()
	 * @see #getVariableInAtomicSwcTypeInstanceRef()
	 * @generated
	 */
	EReference getVariableInAtomicSwcTypeInstanceRef_TargetDataPrototype();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent <em>Rte Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent
	 * @generated
	 */
	EClass getRteEvent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getStartOnEvent <em>Start On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start On Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getStartOnEvent()
	 * @see #getRteEvent()
	 * @generated
	 */
	EReference getRteEvent_StartOnEvent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getConfig()
	 * @see #getRteEvent()
	 * @generated
	 */
	EReference getRteEvent_Config();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent <em>Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent
	 * @generated
	 */
	EClass getTimingEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent#getPeriod()
	 * @see #getTimingEvent()
	 * @generated
	 */
	EAttribute getTimingEvent_Period();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent <em>Background Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent
	 * @generated
	 */
	EClass getBackgroundEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent <em>Data Send Completed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Send Completed Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent
	 * @generated
	 */
	EClass getDataSendCompletedEvent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSource <em>Event Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSource()
	 * @see #getDataSendCompletedEvent()
	 * @generated
	 */
	EReference getDataSendCompletedEvent_EventSource();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSourceData <em>Event Source Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Source Data</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSourceData()
	 * @see #getDataSendCompletedEvent()
	 * @generated
	 */
	EReference getDataSendCompletedEvent_EventSourceData();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent <em>Data Received Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Received Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent
	 * @generated
	 */
	EClass getDataReceivedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent#getDataIref <em>Data Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent#getDataIref()
	 * @see #getDataReceivedEvent()
	 * @generated
	 */
	EReference getDataReceivedEvent_DataIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent#getData()
	 * @see #getDataReceivedEvent()
	 * @generated
	 */
	EReference getDataReceivedEvent_Data();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent <em>Data Receive Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Receive Error Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent
	 * @generated
	 */
	EClass getDataReceiveErrorEvent();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent#getDataIref <em>Data Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent#getDataIref()
	 * @see #getDataReceiveErrorEvent()
	 * @generated
	 */
	EReference getDataReceiveErrorEvent_DataIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent#getData()
	 * @see #getDataReceiveErrorEvent()
	 * @generated
	 */
	EReference getDataReceiveErrorEvent_Data();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef <em>RVariable In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RVariable In Atomic Swc Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef
	 * @generated
	 */
	EClass getRVariableInAtomicSwcInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef#getContextRPort <em>Context RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context RPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef#getContextRPort()
	 * @see #getRVariableInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getRVariableInAtomicSwcInstanceRef_ContextRPort();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef#getTargetDataElement <em>Target Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RVariableInAtomicSwcInstanceRef#getTargetDataElement()
	 * @see #getRVariableInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getRVariableInAtomicSwcInstanceRef_TargetDataElement();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues <em>Ecuc Module Configuration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Module Configuration Values</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues
	 * @generated
	 */
	EClass getEcucModuleConfigurationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getContainer()
	 * @see #getEcucModuleConfigurationValues()
	 * @generated
	 */
	EReference getEcucModuleConfigurationValues_Container();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getEcucDefEdition <em>Ecuc Def Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecuc Def Edition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getEcucDefEdition()
	 * @see #getEcucModuleConfigurationValues()
	 * @generated
	 */
	EAttribute getEcucModuleConfigurationValues_EcucDefEdition();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getImplementationConfigVariant <em>Implementation Config Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Config Variant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getImplementationConfigVariant()
	 * @see #getEcucModuleConfigurationValues()
	 * @generated
	 */
	EAttribute getEcucModuleConfigurationValues_ImplementationConfigVariant();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues#getDefinitionRef()
	 * @see #getEcucModuleConfigurationValues()
	 * @generated
	 */
	EAttribute getEcucModuleConfigurationValues_DefinitionRef();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue <em>Ecuc Container Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Container Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue
	 * @generated
	 */
	EClass getEcucContainerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getSubContainer <em>Sub Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Container</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getSubContainer()
	 * @see #getEcucContainerValue()
	 * @generated
	 */
	EReference getEcucContainerValue_SubContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getParameterValue()
	 * @see #getEcucContainerValue()
	 * @generated
	 */
	EReference getEcucContainerValue_ParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getDefinitionRef()
	 * @see #getEcucContainerValue()
	 * @generated
	 */
	EAttribute getEcucContainerValue_DefinitionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue#getReferenceValue()
	 * @see #getEcucContainerValue()
	 * @generated
	 */
	EReference getEcucContainerValue_ReferenceValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue <em>Ecuc Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Parameter Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue
	 * @generated
	 */
	EClass getEcucParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue#getDefinitionRef()
	 * @see #getEcucParameterValue()
	 * @generated
	 */
	EAttribute getEcucParameterValue_DefinitionRef();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue <em>Ecuc Numerical Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Numerical Param Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue
	 * @generated
	 */
	EClass getEcucNumericalParamValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue#getValue()
	 * @see #getEcucNumericalParamValue()
	 * @generated
	 */
	EAttribute getEcucNumericalParamValue_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue <em>Ecuc Textual Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Textual Param Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue
	 * @generated
	 */
	EClass getEcucTextualParamValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue#getValue()
	 * @see #getEcucTextualParamValue()
	 * @generated
	 */
	EAttribute getEcucTextualParamValue_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue <em>Ecuc Abstract Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Abstract Reference Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue
	 * @generated
	 */
	EClass getEcucAbstractReferenceValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue#getDefinitionRef()
	 * @see #getEcucAbstractReferenceValue()
	 * @generated
	 */
	EAttribute getEcucAbstractReferenceValue_DefinitionRef();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue <em>Ecuc Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Reference Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue
	 * @generated
	 */
	EClass getEcucReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue#getValue()
	 * @see #getEcucReferenceValue()
	 * @generated
	 */
	EReference getEcucReferenceValue_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue <em>Ecuc Instance Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Instance Reference Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue
	 * @generated
	 */
	EClass getEcucInstanceReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue#getValueIref <em>Value Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue#getValueIref()
	 * @see #getEcucInstanceReferenceValue()
	 * @generated
	 */
	EReference getEcucInstanceReferenceValue_ValueIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue#getValue()
	 * @see #getEcucInstanceReferenceValue()
	 * @generated
	 */
	EReference getEcucInstanceReferenceValue_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortComSpec <em>RPort Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPort Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortComSpec
	 * @generated
	 */
	EClass getRPortComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortComSpec <em>PPort Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPort Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortComSpec
	 * @generated
	 */
	EClass getPPortComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec <em>Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec
	 * @generated
	 */
	EClass getReceiverComSpec();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec#getDataElement()
	 * @see #getReceiverComSpec()
	 * @generated
	 */
	EReference getReceiverComSpec_DataElement();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec <em>Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec
	 * @generated
	 */
	EClass getSenderComSpec();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec#getDataElement()
	 * @see #getSenderComSpec()
	 * @generated
	 */
	EReference getSenderComSpec_DataElement();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec#getTransmissionAcknowledge <em>Transmission Acknowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmission Acknowledge</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderComSpec#getTransmissionAcknowledge()
	 * @see #getSenderComSpec()
	 * @generated
	 */
	EReference getSenderComSpec_TransmissionAcknowledge();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest <em>Transmission Acknowledgement Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Acknowledgement Request</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest
	 * @generated
	 */
	EClass getTransmissionAcknowledgementRequest();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TransmissionAcknowledgementRequest#getTimeout()
	 * @see #getTransmissionAcknowledgementRequest()
	 * @generated
	 */
	EAttribute getTransmissionAcknowledgementRequest_Timeout();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec <em>Nonqueued Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonqueued Sender Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec
	 * @generated
	 */
	EClass getNonqueuedSenderComSpec();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec#getInitValue()
	 * @see #getNonqueuedSenderComSpec()
	 * @generated
	 */
	EReference getNonqueuedSenderComSpec_InitValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedSenderComSpec <em>Queued Sender Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queued Sender Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedSenderComSpec
	 * @generated
	 */
	EClass getQueuedSenderComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec <em>Nonqueued Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonqueued Receiver Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec
	 * @generated
	 */
	EClass getNonqueuedReceiverComSpec();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getAliveTimeout <em>Alive Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alive Timeout</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getAliveTimeout()
	 * @see #getNonqueuedReceiverComSpec()
	 * @generated
	 */
	EAttribute getNonqueuedReceiverComSpec_AliveTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getInitValue()
	 * @see #getNonqueuedReceiverComSpec()
	 * @generated
	 */
	EReference getNonqueuedReceiverComSpec_InitValue();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec#getFilter()
	 * @see #getNonqueuedReceiverComSpec()
	 * @generated
	 */
	EReference getNonqueuedReceiverComSpec_Filter();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInterface <em>Port Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Interface</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInterface
	 * @generated
	 */
	EClass getPortInterface();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType <em>Composition Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType
	 * @generated
	 */
	EClass getCompositionSwComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType#getComponent()
	 * @see #getCompositionSwComponentType()
	 * @generated
	 */
	EReference getCompositionSwComponentType_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompositionSwComponentType#getConnector()
	 * @see #getCompositionSwComponentType()
	 * @generated
	 */
	EReference getCompositionSwComponentType_Connector();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector <em>Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector
	 * @generated
	 */
	EClass getSwConnector();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector <em>Assembly Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Sw Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector
	 * @generated
	 */
	EClass getAssemblySwConnector();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getRequester <em>Requester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requester</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getRequester()
	 * @see #getAssemblySwConnector()
	 * @generated
	 */
	EReference getAssemblySwConnector_Requester();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getProvider()
	 * @see #getAssemblySwConnector()
	 * @generated
	 */
	EReference getAssemblySwConnector_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getProviderIref <em>Provider Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getProviderIref()
	 * @see #getAssemblySwConnector()
	 * @generated
	 */
	EReference getAssemblySwConnector_ProviderIref();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getRequesterIref <em>Requester Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requester Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector#getRequesterIref()
	 * @see #getAssemblySwConnector()
	 * @generated
	 */
	EReference getAssemblySwConnector_RequesterIref();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector <em>Delegation Sw Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Sw Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector
	 * @generated
	 */
	EClass getDelegationSwConnector();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getOuterPort <em>Outer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getOuterPort()
	 * @see #getDelegationSwConnector()
	 * @generated
	 */
	EReference getDelegationSwConnector_OuterPort();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getInnerPortIref <em>Inner Port Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Port Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getInnerPortIref()
	 * @see #getDelegationSwConnector()
	 * @generated
	 */
	EReference getDelegationSwConnector_InnerPortIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getInnerPort <em>Inner Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector#getInnerPort()
	 * @see #getDelegationSwConnector()
	 * @generated
	 */
	EReference getDelegationSwConnector_InnerPort();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef <em>RPort Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPort Prototype In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	EClass getRPortPrototypeInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef#getTargetRPort <em>Target RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target RPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef#getTargetRPort()
	 * @see #getRPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	EReference getRPortPrototypeInCompositionInstanceRef_TargetRPort();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef <em>PPort Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPort Prototype In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	EClass getPPortPrototypeInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef#getTargetPPort <em>Target PPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target PPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef#getTargetPPort()
	 * @see #getPPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	EReference getPPortPrototypeInCompositionInstanceRef_TargetPPort();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype <em>Sw Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Component Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype
	 * @generated
	 */
	EClass getSwComponentPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype#getType()
	 * @see #getSwComponentPrototype()
	 * @generated
	 */
	EReference getSwComponentPrototype_Type();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype#getInstance()
	 * @see #getSwComponentPrototype()
	 * @generated
	 */
	EReference getSwComponentPrototype_Instance();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType <em>Autosar Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autosar Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType
	 * @generated
	 */
	EClass getAutosarDataType();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Data Def Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwDataDefProps()
	 * @see #getAutosarDataType()
	 * @generated
	 */
	EReference getAutosarDataType_SwDataDefProps();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getInvalidValue <em>Invalid Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invalid Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getInvalidValue()
	 * @see #getAutosarDataType()
	 * @generated
	 */
	EReference getAutosarDataType_InvalidValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getCompuMethod <em>Compu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compu Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getCompuMethod()
	 * @see #getAutosarDataType()
	 * @generated
	 */
	EReference getAutosarDataType_CompuMethod();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getDataConstr <em>Data Constr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Constr</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getDataConstr()
	 * @see #getAutosarDataType()
	 * @generated
	 */
	EReference getAutosarDataType_DataConstr();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sw Addr Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwAddrMethod()
	 * @see #getAutosarDataType()
	 * @generated
	 */
	EReference getAutosarDataType_SwAddrMethod();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Impl Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType#getSwImplPolicy()
	 * @generated
	 */
	EOperation getAutosarDataType__GetSwImplPolicy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType <em>Application Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType
	 * @generated
	 */
	EClass getApplicationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType
	 * @generated
	 */
	EClass getImplementationDataType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getBaseType()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EReference getImplementationDataType_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getSwAlignment <em>Sw Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Alignment</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getSwAlignment()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_SwAlignment();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getSubElement <em>Sub Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getSubElement()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EReference getImplementationDataType_SubElement();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getLeafImplementationDataType() <em>Get Leaf Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaf Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#getLeafImplementationDataType()
	 * @generated
	 */
	EOperation getImplementationDataType__GetLeafImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isPrimitiveType() <em>Is Primitive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isPrimitiveType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsPrimitiveType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isPointerType() <em>Is Pointer Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Pointer Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isPointerType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsPointerType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isArrayType() <em>Is Array Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Array Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isArrayType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsArrayType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isStructType() <em>Is Struct Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Struct Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isStructType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsStructType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isUnionType() <em>Is Union Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Union Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isUnionType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsUnionType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isRedefinitionType() <em>Is Redefinition Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Redefinition Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isRedefinitionType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsRedefinitionType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isComplexType() <em>Is Complex Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Complex Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType#isComplexType()
	 * @generated
	 */
	EOperation getImplementationDataType__IsComplexType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Data Def Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps
	 * @generated
	 */
	EClass getSwDataDefProps();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getInvalidValue <em>Invalid Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invalid Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getInvalidValue()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_InvalidValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getBaseType()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwImplPolicy <em>Sw Impl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Impl Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwImplPolicy()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EAttribute getSwDataDefProps_SwImplPolicy();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sw Addr Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAddrMethod()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_SwAddrMethod();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAlignment <em>Sw Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Alignment</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAlignment()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EAttribute getSwDataDefProps_SwAlignment();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getCompuMethod <em>Compu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compu Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getCompuMethod()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_CompuMethod();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getDataConstr <em>Data Constr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Constr</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getDataConstr()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_DataConstr();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getImplementationDataType()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_ImplementationDataType();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwPointerTargetProps <em>Sw Pointer Target Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Pointer Target Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwPointerTargetProps()
	 * @see #getSwDataDefProps()
	 * @generated
	 */
	EReference getSwDataDefProps_SwPointerTargetProps();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap <em>Data Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Map</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap
	 * @generated
	 */
	EClass getDataTypeMap();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap#getImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap#getImplementationDataType()
	 * @see #getDataTypeMap()
	 * @generated
	 */
	EReference getDataTypeMap_ImplementationDataType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap#getApplicationDataType <em>Application Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap#getApplicationDataType()
	 * @see #getDataTypeMap()
	 * @generated
	 */
	EReference getDataTypeMap_ApplicationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet <em>Data Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Mapping Set</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet
	 * @generated
	 */
	EClass getDataTypeMappingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet#getDataTypeMap <em>Data Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Map</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet#getDataTypeMap()
	 * @see #getDataTypeMappingSet()
	 * @generated
	 */
	EReference getDataTypeMappingSet_DataTypeMap();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet#getModeRequestTypeMap <em>Mode Request Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Request Type Map</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet#getModeRequestTypeMap()
	 * @see #getDataTypeMappingSet()
	 * @generated
	 */
	EReference getDataTypeMappingSet_ModeRequestTypeMap();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype <em>Mode Declaration Group Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Declaration Group Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype
	 * @generated
	 */
	EClass getModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype#getType()
	 * @see #getModeDeclarationGroupPrototype()
	 * @generated
	 */
	EReference getModeDeclarationGroupPrototype_Type();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap <em>Mode Request Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Request Type Map</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap
	 * @generated
	 */
	EClass getModeRequestTypeMap();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap#getImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap#getImplementationDataType()
	 * @see #getModeRequestTypeMap()
	 * @generated
	 */
	EReference getModeRequestTypeMap_ImplementationDataType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap#getModeGroup <em>Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap#getModeGroup()
	 * @see #getModeRequestTypeMap()
	 * @generated
	 */
	EReference getModeRequestTypeMap_ModeGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration <em>Mode Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Declaration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration
	 * @generated
	 */
	EClass getModeDeclaration();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup <em>Mode Declaration Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Declaration Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup
	 * @generated
	 */
	EClass getModeDeclarationGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup#getInitialMode <em>Initial Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Mode</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup#getInitialMode()
	 * @see #getModeDeclarationGroup()
	 * @generated
	 */
	EReference getModeDeclarationGroup_InitialMode();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup#getModeDeclaration <em>Mode Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Declaration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup#getModeDeclaration()
	 * @see #getModeDeclarationGroup()
	 * @generated
	 */
	EReference getModeDeclarationGroup_ModeDeclaration();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationPrimitiveDataType <em>Application Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Primitive Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationPrimitiveDataType
	 * @generated
	 */
	EClass getApplicationPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype <em>Autosar Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autosar Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype
	 * @generated
	 */
	EClass getAutosarDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getSwAddrMethod() <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getSwAddrMethod()
	 * @generated
	 */
	EOperation getAutosarDataPrototype__GetSwAddrMethod();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getSwAlignment() <em>Get Sw Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Alignment</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getSwAlignment()
	 * @generated
	 */
	EOperation getAutosarDataPrototype__GetSwAlignment();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getApplicationDataType() <em>Get Application Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Application Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getApplicationDataType()
	 * @generated
	 */
	EOperation getAutosarDataPrototype__GetApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getImplementationDataType() <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataPrototype#getImplementationDataType()
	 * @generated
	 */
	EOperation getAutosarDataPrototype__GetImplementationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype <em>Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype
	 * @generated
	 */
	EClass getDataPrototype();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Data Def Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwDataDefProps()
	 * @see #getDataPrototype()
	 * @generated
	 */
	EReference getDataPrototype_SwDataDefProps();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sw Addr Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwAddrMethod()
	 * @see #getDataPrototype()
	 * @generated
	 */
	EReference getDataPrototype_SwAddrMethod();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwAlignment <em>Sw Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Alignment</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwAlignment()
	 * @see #getDataPrototype()
	 * @generated
	 */
	EAttribute getDataPrototype_SwAlignment();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getType()
	 * @see #getDataPrototype()
	 * @generated
	 */
	EReference getDataPrototype_Type();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Impl Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataPrototype#getSwImplPolicy()
	 * @generated
	 */
	EOperation getDataPrototype__GetSwImplPolicy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea <em>Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea
	 * @generated
	 */
	EClass getExclusiveArea();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getParent()
	 * @see #getExclusiveArea()
	 * @generated
	 */
	EReference getExclusiveArea_Parent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getEnterExecutableEntity <em>Enter Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enter Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getEnterExecutableEntity()
	 * @see #getExclusiveArea()
	 * @generated
	 */
	EReference getExclusiveArea_EnterExecutableEntity();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getSwcConfig <em>Swc Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Swc Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getSwcConfig()
	 * @see #getExclusiveArea()
	 * @generated
	 */
	EReference getExclusiveArea_SwcConfig();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getBswConfig <em>Bsw Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bsw Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getBswConfig()
	 * @see #getExclusiveArea()
	 * @generated
	 */
	EReference getExclusiveArea_BswConfig();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification <em>Numerical Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification
	 * @generated
	 */
	EClass getNumericalValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification#getValue()
	 * @see #getNumericalValueSpecification()
	 * @generated
	 */
	EAttribute getNumericalValueSpecification_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification <em>Text Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification
	 * @generated
	 */
	EClass getTextValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification#getValue()
	 * @see #getTextValueSpecification()
	 * @generated
	 */
	EAttribute getTextValueSpecification_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference <em>Constant Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Reference</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference
	 * @generated
	 */
	EClass getConstantReference();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference#getConstant()
	 * @see #getConstantReference()
	 * @generated
	 */
	EReference getConstantReference_Constant();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference#getEndValueSpec() <em>Get End Value Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Value Spec</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference#getEndValueSpec()
	 * @generated
	 */
	EOperation getConstantReference__GetEndValueSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReferenceValueSpecification <em>Reference Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReferenceValueSpecification
	 * @generated
	 */
	EClass getReferenceValueSpecification();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification <em>Array Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification
	 * @generated
	 */
	EClass getArrayValueSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification#getElement()
	 * @see #getArrayValueSpecification()
	 * @generated
	 */
	EReference getArrayValueSpecification_Element();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification <em>Record Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification
	 * @generated
	 */
	EClass getRecordValueSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification#getField()
	 * @see #getRecordValueSpecification()
	 * @generated
	 */
	EReference getRecordValueSpecification_Field();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationValueSpecification <em>Application Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Value Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationValueSpecification
	 * @generated
	 */
	EClass getApplicationValueSpecification();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification <em>Constant Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Specification</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification
	 * @generated
	 */
	EClass getConstantSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification#getValueSpec <em>Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantSpecification#getValueSpec()
	 * @see #getConstantSpecification()
	 * @generated
	 */
	EReference getConstantSpecification_ValueSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent <em>Operation Invoked Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Invoked Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent
	 * @generated
	 */
	EClass getOperationInvokedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent#getOperationIref <em>Operation Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent#getOperationIref()
	 * @see #getOperationInvokedEvent()
	 * @generated
	 */
	EReference getOperationInvokedEvent_OperationIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent#getOperation()
	 * @see #getOperationInvokedEvent()
	 * @generated
	 */
	EReference getOperationInvokedEvent_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef <em>POperation In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POperation In Atomic Swc Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef
	 * @generated
	 */
	EClass getPOperationInAtomicSwcInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef#getContextPPort <em>Context PPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context PPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef#getContextPPort()
	 * @see #getPOperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getPOperationInAtomicSwcInstanceRef_ContextPPort();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef#getTargetProvidedOperation <em>Target Provided Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Provided Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef#getTargetProvidedOperation()
	 * @see #getPOperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getPOperationInAtomicSwcInstanceRef_TargetProvidedOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface <em>Client Server Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Server Interface</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface
	 * @generated
	 */
	EClass getClientServerInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface#getOperation()
	 * @see #getClientServerInterface()
	 * @generated
	 */
	EReference getClientServerInterface_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface#getPossibleError <em>Possible Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Error</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface#getPossibleError()
	 * @see #getClientServerInterface()
	 * @generated
	 */
	EReference getClientServerInterface_PossibleError();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation <em>Client Server Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Server Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation
	 * @generated
	 */
	EClass getClientServerOperation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation#getPossibleError <em>Possible Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Error</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation#getPossibleError()
	 * @see #getClientServerOperation()
	 * @generated
	 */
	EReference getClientServerOperation_PossibleError();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation#getArgument()
	 * @see #getClientServerOperation()
	 * @generated
	 */
	EReference getClientServerOperation_Argument();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError <em>Application Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Error</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError
	 * @generated
	 */
	EClass getApplicationError();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError#getErrorCode()
	 * @see #getApplicationError()
	 * @generated
	 */
	EAttribute getApplicationError_ErrorCode();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError#getParent()
	 * @see #getApplicationError()
	 * @generated
	 */
	EReference getApplicationError_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype <em>Argument Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype
	 * @generated
	 */
	EClass getArgumentDataPrototype();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype#getDirection()
	 * @see #getArgumentDataPrototype()
	 * @generated
	 */
	EAttribute getArgumentDataPrototype_Direction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter <em>Data Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Filter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter
	 * @generated
	 */
	EClass getDataFilter();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getDataFilterType <em>Data Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Filter Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getDataFilterType()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_DataFilterType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMask()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_Mask();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMax()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_Max();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getMin()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_Min();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getOffset()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_Offset();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getPeriod()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_Period();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#getX()
	 * @see #getDataFilter()
	 * @generated
	 */
	EAttribute getDataFilter_X();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filter Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#isFilterEnabled()
	 * @generated
	 */
	EOperation getDataFilter__IsFilterEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#isCompatibleWith(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter#isCompatibleWith(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter)
	 * @generated
	 */
	EOperation getDataFilter__IsCompatibleWith__DataFilter();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec <em>Queued Receiver Com Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queued Receiver Com Spec</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec
	 * @generated
	 */
	EClass getQueuedReceiverComSpec();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedReceiverComSpec#getQueueLength()
	 * @see #getQueuedReceiverComSpec()
	 * @generated
	 */
	EAttribute getQueuedReceiverComSpec_QueueLength();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy <em>Invalidation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalidation Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy
	 * @generated
	 */
	EClass getInvalidationPolicy();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#getDataElement()
	 * @see #getInvalidationPolicy()
	 * @generated
	 */
	EReference getInvalidationPolicy_DataElement();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#getHandleInvalid <em>Handle Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Invalid</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#getHandleInvalid()
	 * @see #getInvalidationPolicy()
	 * @generated
	 */
	EAttribute getInvalidationPolicy_HandleInvalid();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationEnabled()
	 * @generated
	 */
	EOperation getInvalidationPolicy__IsInvalidationEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationKeep() <em>Is Invalidation Keep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Keep</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationKeep()
	 * @generated
	 */
	EOperation getInvalidationPolicy__IsInvalidationKeep();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationReplace() <em>Is Invalidation Replace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Replace</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy#isInvalidationReplace()
	 * @generated
	 */
	EOperation getInvalidationPolicy__IsInvalidationReplace();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption <em>Port Api Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Api Option</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption
	 * @generated
	 */
	EClass getPortApiOption();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getPortArgValue <em>Port Arg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Arg Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getPortArgValue()
	 * @see #getPortApiOption()
	 * @generated
	 */
	EReference getPortApiOption_PortArgValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getPort()
	 * @see #getPortApiOption()
	 * @generated
	 */
	EReference getPortApiOption_Port();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getEnableTakeAddress <em>Enable Take Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Take Address</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption#getEnableTakeAddress()
	 * @see #getPortApiOption()
	 * @generated
	 */
	EAttribute getPortApiOption_EnableTakeAddress();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue <em>Port Defined Argument Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Defined Argument Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue
	 * @generated
	 */
	EClass getPortDefinedArgumentValue();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getValue()
	 * @see #getPortDefinedArgumentValue()
	 * @generated
	 */
	EReference getPortDefinedArgumentValue_Value();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getValueType()
	 * @see #getPortDefinedArgumentValue()
	 * @generated
	 */
	EReference getPortDefinedArgumentValue_ValueType();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue#getParent()
	 * @see #getPortDefinedArgumentValue()
	 * @generated
	 */
	EReference getPortDefinedArgumentValue_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet <em>Included Data Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Data Type Set</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet
	 * @generated
	 */
	EClass getIncludedDataTypeSet();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet#getLiteralPrefix <em>Literal Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Prefix</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet#getLiteralPrefix()
	 * @see #getIncludedDataTypeSet()
	 * @generated
	 */
	EAttribute getIncludedDataTypeSet_LiteralPrefix();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet#getDataType()
	 * @see #getIncludedDataTypeSet()
	 * @generated
	 */
	EReference getIncludedDataTypeSet_DataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System#getRootSoftwareComposition <em>Root Software Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Software Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System#getRootSoftwareComposition()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RootSoftwareComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System#getMapping()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Mapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype <em>Root Sw Composition Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Sw Composition Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype
	 * @generated
	 */
	EClass getRootSwCompositionPrototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype#getSoftwareComposition <em>Software Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype#getSoftwareComposition()
	 * @see #getRootSwCompositionPrototype()
	 * @generated
	 */
	EReference getRootSwCompositionPrototype_SoftwareComposition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping <em>System Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping
	 * @generated
	 */
	EClass getSystemMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping#getDataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemMapping#getDataMapping()
	 * @see #getSystemMapping()
	 * @generated
	 */
	EReference getSystemMapping_DataMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal
	 * @generated
	 */
	EClass getSystemSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal <em>ISignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISignal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal
	 * @generated
	 */
	EClass getISignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal#getSystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignal#getSystemSignal()
	 * @see #getISignal()
	 * @generated
	 */
	EReference getISignal_SystemSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu <em>ISignal IPdu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISignal IPdu</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu
	 * @generated
	 */
	EClass getISignalIPdu();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu#getISignalToPduMapping <em>ISignal To Pdu Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ISignal To Pdu Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalIPdu#getISignalToPduMapping()
	 * @see #getISignalIPdu()
	 * @generated
	 */
	EReference getISignalIPdu_ISignalToPduMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping <em>ISignal To IPdu Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISignal To IPdu Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping
	 * @generated
	 */
	EClass getISignalToIPduMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping#getISignal <em>ISignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ISignal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping#getISignal()
	 * @see #getISignalToIPduMapping()
	 * @generated
	 */
	EReference getISignalToIPduMapping_ISignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping#getISignalGroup <em>ISignal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ISignal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping#getISignalGroup()
	 * @see #getISignalToIPduMapping()
	 * @generated
	 */
	EReference getISignalToIPduMapping_ISignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping <em>Sender Receiver To Signal Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver To Signal Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping
	 * @generated
	 */
	EClass getSenderReceiverToSignalMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getSystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getSystemSignal()
	 * @see #getSenderReceiverToSignalMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalMapping_SystemSignal();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getDataElementIref <em>Data Element Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Element Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getDataElementIref()
	 * @see #getSenderReceiverToSignalMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalMapping_DataElementIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping#getDataElement()
	 * @see #getSenderReceiverToSignalMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalMapping_DataElement();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping <em>Sender Receiver To Signal Group Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver To Signal Group Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping
	 * @generated
	 */
	EClass getSenderReceiverToSignalGroupMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getSignalGroup()
	 * @see #getSenderReceiverToSignalGroupMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalGroupMapping_SignalGroup();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getDataElementIref <em>Data Element Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Element Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getDataElementIref()
	 * @see #getSenderReceiverToSignalGroupMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalGroupMapping_DataElementIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getDataElement()
	 * @see #getSenderReceiverToSignalGroupMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalGroupMapping_DataElement();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getTypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping#getTypeMapping()
	 * @see #getSenderReceiverToSignalGroupMapping()
	 * @generated
	 */
	EReference getSenderReceiverToSignalGroupMapping_TypeMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef <em>Variable Data Prototype In System Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Prototype In System Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef
	 * @generated
	 */
	EClass getVariableDataPrototypeInSystemInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getContextComponent <em>Context Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getContextComponent()
	 * @see #getVariableDataPrototypeInSystemInstanceRef()
	 * @generated
	 */
	EReference getVariableDataPrototypeInSystemInstanceRef_ContextComponent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getContextPort <em>Context Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getContextPort()
	 * @see #getVariableDataPrototypeInSystemInstanceRef()
	 * @generated
	 */
	EReference getVariableDataPrototypeInSystemInstanceRef_ContextPort();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getTargetDataPrototype <em>Target Data Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Data Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef#getTargetDataPrototype()
	 * @see #getVariableDataPrototypeInSystemInstanceRef()
	 * @generated
	 */
	EReference getVariableDataPrototypeInSystemInstanceRef_TargetDataPrototype();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection <em>Ecuc Value Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Value Collection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection
	 * @generated
	 */
	EClass getEcucValueCollection();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection#getEcucValue <em>Ecuc Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecuc Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection#getEcucValue()
	 * @see #getEcucValueCollection()
	 * @generated
	 */
	EReference getEcucValueCollection_EcucValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection#getEcuExtract <em>Ecu Extract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecu Extract</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection#getEcuExtract()
	 * @see #getEcucValueCollection()
	 * @generated
	 */
	EReference getEcucValueCollection_EcuExtract();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint <em>Server Call Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Call Point</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint
	 * @generated
	 */
	EClass getServerCallPoint();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint#getOperationIref <em>Operation Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint#getOperationIref()
	 * @see #getServerCallPoint()
	 * @generated
	 */
	EReference getServerCallPoint_OperationIref();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint#getOperation()
	 * @see #getServerCallPoint()
	 * @generated
	 */
	EReference getServerCallPoint_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SynchronousServerCallPoint <em>Synchronous Server Call Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Server Call Point</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SynchronousServerCallPoint
	 * @generated
	 */
	EClass getSynchronousServerCallPoint();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef <em>IInstance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IInstance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef
	 * @generated
	 */
	EClass getIInstanceRef();

	/**
	 * Returns the meta object for the attribute list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef#getInstanceRef <em>Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef#getInstanceRef()
	 * @see #getIInstanceRef()
	 * @generated
	 */
	EAttribute getIInstanceRef_InstanceRef();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef <em>ROperation In Atomic Swc Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROperation In Atomic Swc Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef
	 * @generated
	 */
	EClass getROperationInAtomicSwcInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef#getContextRPort <em>Context RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context RPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef#getContextRPort()
	 * @see #getROperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getROperationInAtomicSwcInstanceRef_ContextRPort();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef#getTargetRequiredOperation <em>Target Required Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Required Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef#getTargetRequiredOperation()
	 * @see #getROperationInAtomicSwcInstanceRef()
	 * @generated
	 */
	EReference getROperationInAtomicSwcInstanceRef_TargetRequiredOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef <em>Port Prototype In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Prototype In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef
	 * @generated
	 */
	EClass getPortPrototypeInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef#getContextComponent <em>Context Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototypeInCompositionInstanceRef#getContextComponent()
	 * @see #getPortPrototypeInCompositionInstanceRef()
	 * @generated
	 */
	EReference getPortPrototypeInCompositionInstanceRef_ContextComponent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod <em>Sw Addr Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Addr Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod
	 * @generated
	 */
	EClass getSwAddrMethod();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod#getMemoryAllocationKeywordPolicy <em>Memory Allocation Keyword Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Allocation Keyword Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod#getMemoryAllocationKeywordPolicy()
	 * @see #getSwAddrMethod()
	 * @generated
	 */
	EAttribute getSwAddrMethod_MemoryAllocationKeywordPolicy();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod#getSectionInitializationPolicy <em>Section Initialization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Initialization Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod#getSectionInitializationPolicy()
	 * @see #getSwAddrMethod()
	 * @generated
	 */
	EAttribute getSwAddrMethod_SectionInitializationPolicy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod <em>Compu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod
	 * @generated
	 */
	EClass getCompuMethod();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod#getCompuInternalToPhys <em>Compu Internal To Phys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compu Internal To Phys</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod#getCompuInternalToPhys()
	 * @see #getCompuMethod()
	 * @generated
	 */
	EReference getCompuMethod_CompuInternalToPhys();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr <em>Data Constr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constr</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr
	 * @generated
	 */
	EClass getDataConstr();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getDataConstrRule <em>Data Constr Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Constr Rule</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getDataConstrRule()
	 * @see #getDataConstr()
	 * @generated
	 */
	EReference getDataConstr_DataConstrRule();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getLowerLimitValue() <em>Get Lower Limit Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Lower Limit Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getLowerLimitValue()
	 * @generated
	 */
	EOperation getDataConstr__GetLowerLimitValue();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getUpperLimitValue() <em>Get Upper Limit Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Upper Limit Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr#getUpperLimitValue()
	 * @generated
	 */
	EOperation getDataConstr__GetUpperLimitValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule <em>Data Constr Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constr Rule</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule
	 * @generated
	 */
	EClass getDataConstrRule();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule#getInternalConstrs <em>Internal Constrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Constrs</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule#getInternalConstrs()
	 * @see #getDataConstrRule()
	 * @generated
	 */
	EReference getDataConstrRule_InternalConstrs();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs <em>Internal Constrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Constrs</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs
	 * @generated
	 */
	EClass getInternalConstrs();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs#getLowerLimit()
	 * @see #getInternalConstrs()
	 * @generated
	 */
	EReference getInternalConstrs_LowerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs#getUpperLimit()
	 * @see #getInternalConstrs()
	 * @generated
	 */
	EReference getInternalConstrs_UpperLimit();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu <em>Compu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu
	 * @generated
	 */
	EClass getCompu();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu#getCompuScale <em>Compu Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compu Scale</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Compu#getCompuScale()
	 * @see #getCompu()
	 * @generated
	 */
	EReference getCompu_CompuScale();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit#getValue()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Value();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale <em>Compu Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu Scale</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale
	 * @generated
	 */
	EClass getCompuScale();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getSymbol()
	 * @see #getCompuScale()
	 * @generated
	 */
	EAttribute getCompuScale_Symbol();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getLowerLimit()
	 * @see #getCompuScale()
	 * @generated
	 */
	EReference getCompuScale_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getShortLabel <em>Short Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Label</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getShortLabel()
	 * @see #getCompuScale()
	 * @generated
	 */
	EAttribute getCompuScale_ShortLabel();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getUpperLimit()
	 * @see #getCompuScale()
	 * @generated
	 */
	EReference getCompuScale_UpperLimit();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getCompuConst <em>Compu Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compu Const</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale#getCompuConst()
	 * @see #getCompuScale()
	 * @generated
	 */
	EReference getCompuScale_CompuConst();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst <em>Compu Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu Const</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst
	 * @generated
	 */
	EClass getCompuConst();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst#getVt <em>Vt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vt</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuConst#getVt()
	 * @see #getCompuConst()
	 * @generated
	 */
	EAttribute getCompuConst_Vt();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef <em>Any Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef
	 * @generated
	 */
	EClass getAnyInstanceRef();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef#getContextElement <em>Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef#getContextElement()
	 * @see #getAnyInstanceRef()
	 * @generated
	 */
	EReference getAnyInstanceRef_ContextElement();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AnyInstanceRef#getTarget()
	 * @see #getAnyInstanceRef()
	 * @generated
	 */
	EReference getAnyInstanceRef_Target();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcuAbstractionSwComponentType <em>Ecu Abstraction Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecu Abstraction Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcuAbstractionSwComponentType
	 * @generated
	 */
	EClass getEcuAbstractionSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NvBlockSwComponentType <em>Nv Block Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nv Block Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NvBlockSwComponentType
	 * @generated
	 */
	EClass getNvBlockSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SensorActuatorSwComponentType <em>Sensor Actuator Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Actuator Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SensorActuatorSwComponentType
	 * @generated
	 */
	EClass getSensorActuatorSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ComplexDeviceDriverSwComponentType <em>Complex Device Driver Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Device Driver Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ComplexDeviceDriverSwComponentType
	 * @generated
	 */
	EClass getComplexDeviceDriverSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceProxySwComponentType <em>Service Proxy Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Proxy Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceProxySwComponentType
	 * @generated
	 */
	EClass getServiceProxySwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceSwComponentType <em>Service Sw Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Sw Component Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServiceSwComponentType
	 * @generated
	 */
	EClass getServiceSwComponentType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef <em>Port In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef
	 * @generated
	 */
	EClass getPortInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef#getContextComponent <em>Context Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef#getContextComponent()
	 * @see #getPortInCompositionInstanceRef()
	 * @generated
	 */
	EReference getPortInCompositionInstanceRef_ContextComponent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef <em>PPort In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPort In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef
	 * @generated
	 */
	EClass getPPortInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef#getTargetPPort <em>Target PPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target PPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortInCompositionInstanceRef#getTargetPPort()
	 * @see #getPPortInCompositionInstanceRef()
	 * @generated
	 */
	EReference getPPortInCompositionInstanceRef_TargetPPort();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef <em>RPort In Composition Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPort In Composition Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef
	 * @generated
	 */
	EClass getRPortInCompositionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef#getTargetRPort <em>Target RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target RPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortInCompositionInstanceRef#getTargetRPort()
	 * @see #getRPortInCompositionInstanceRef()
	 * @generated
	 */
	EReference getRPortInCompositionInstanceRef_TargetRPort();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior
	 * @generated
	 */
	EClass getInternalBehavior();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getDataTypeMapping <em>Data Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getDataTypeMapping()
	 * @see #getInternalBehavior()
	 * @generated
	 */
	EReference getInternalBehavior_DataTypeMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getExclusiveArea <em>Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getExclusiveArea()
	 * @see #getInternalBehavior()
	 * @generated
	 */
	EReference getInternalBehavior_ExclusiveArea();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getParent() <em>Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior#getParent()
	 * @generated
	 */
	EOperation getInternalBehavior__GetParent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping <em>Swc Bsw Runnable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Bsw Runnable Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping
	 * @generated
	 */
	EClass getSwcBswRunnableMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping#getSwcRunnable <em>Swc Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swc Runnable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping#getSwcRunnable()
	 * @see #getSwcBswRunnableMapping()
	 * @generated
	 */
	EReference getSwcBswRunnableMapping_SwcRunnable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping#getBswEntity <em>Bsw Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsw Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping#getBswEntity()
	 * @see #getSwcBswRunnableMapping()
	 * @generated
	 */
	EReference getSwcBswRunnableMapping_BswEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping <em>Swc Bsw Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Bsw Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping
	 * @generated
	 */
	EClass getSwcBswMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getRunnableMapping <em>Runnable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getRunnableMapping()
	 * @see #getSwcBswMapping()
	 * @generated
	 */
	EReference getSwcBswMapping_RunnableMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getSwcBehavior <em>Swc Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swc Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getSwcBehavior()
	 * @see #getSwcBswMapping()
	 * @generated
	 */
	EReference getSwcBswMapping_SwcBehavior();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getBswBehavior <em>Bsw Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsw Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping#getBswBehavior()
	 * @see #getSwcBswMapping()
	 * @generated
	 */
	EReference getSwcBswMapping_BswBehavior();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior <em>Bsw Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Internal Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior
	 * @generated
	 */
	EClass getBswInternalBehavior();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getParent()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getEntity()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getEvent()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_Event();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getImplementation()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getModeSenderPolicy <em>Mode Sender Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Sender Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getModeSenderPolicy()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_ModeSenderPolicy();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getBswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bsw Schedulable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior#getBswSchedulableEntity()
	 * @see #getBswInternalBehavior()
	 * @generated
	 */
	EReference getBswInternalBehavior_BswSchedulableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy <em>Bsw Mode Sender Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Mode Sender Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy
	 * @generated
	 */
	EClass getBswModeSenderPolicy();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy#getProvidedModeGroup <em>Provided Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy#getProvidedModeGroup()
	 * @see #getBswModeSenderPolicy()
	 * @generated
	 */
	EReference getBswModeSenderPolicy_ProvidedModeGroup();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy#getQueueLength()
	 * @see #getBswModeSenderPolicy()
	 * @generated
	 */
	EAttribute getBswModeSenderPolicy_QueueLength();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation#getSwcBswMapping <em>Swc Bsw Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swc Bsw Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Implementation#getSwcBswMapping()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_SwcBswMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation <em>Bsw Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation
	 * @generated
	 */
	EClass getBswImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation#getBehavior()
	 * @see #getBswImplementation()
	 * @generated
	 */
	EReference getBswImplementation_Behavior();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription <em>Bsw Module Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Module Description</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription
	 * @generated
	 */
	EClass getBswModuleDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getInternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getInternalBehavior()
	 * @see #getBswModuleDescription()
	 * @generated
	 */
	EReference getBswModuleDescription_InternalBehavior();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getProvidedEntry <em>Provided Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Entry</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getProvidedEntry()
	 * @see #getBswModuleDescription()
	 * @generated
	 */
	EReference getBswModuleDescription_ProvidedEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getProvidedModeGroup <em>Provided Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getProvidedModeGroup()
	 * @see #getBswModuleDescription()
	 * @generated
	 */
	EReference getBswModuleDescription_ProvidedModeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getRequiredModeGroup <em>Required Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getRequiredModeGroup()
	 * @see #getBswModuleDescription()
	 * @generated
	 */
	EReference getBswModuleDescription_RequiredModeGroup();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getEnableInternalBehavior() <em>Get Enable Internal Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enable Internal Behavior</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription#getEnableInternalBehavior()
	 * @generated
	 */
	EOperation getBswModuleDescription__GetEnableInternalBehavior();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry <em>Bsw Module Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Module Entry</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry
	 * @generated
	 */
	EClass getBswModuleEntry();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getServiceId()
	 * @see #getBswModuleEntry()
	 * @generated
	 */
	EAttribute getBswModuleEntry_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getCallType <em>Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getCallType()
	 * @see #getBswModuleEntry()
	 * @generated
	 */
	EAttribute getBswModuleEntry_CallType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Context</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry#getExecutionContext()
	 * @see #getBswModuleEntry()
	 * @generated
	 */
	EAttribute getBswModuleEntry_ExecutionContext();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity <em>Bsw Module Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Module Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity
	 * @generated
	 */
	EClass getBswModuleEntity();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getImplementedEntry <em>Implemented Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implemented Entry</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getImplementedEntry()
	 * @see #getBswModuleEntity()
	 * @generated
	 */
	EReference getBswModuleEntity_ImplementedEntry();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getParent()
	 * @see #getBswModuleEntity()
	 * @generated
	 */
	EReference getBswModuleEntity_Parent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getAccessedModeGroup <em>Accessed Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getAccessedModeGroup()
	 * @see #getBswModuleEntity()
	 * @generated
	 */
	EReference getBswModuleEntity_AccessedModeGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getManagedModeGroup <em>Managed Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity#getManagedModeGroup()
	 * @see #getBswModuleEntity()
	 * @generated
	 */
	EReference getBswModuleEntity_ManagedModeGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Schedulable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity
	 * @generated
	 */
	EClass getBswSchedulableEntity();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity#getEvent()
	 * @see #getBswSchedulableEntity()
	 * @generated
	 */
	EReference getBswSchedulableEntity_Event();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent <em>Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent
	 * @generated
	 */
	EClass getBswEvent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getStartsOnEvent <em>Starts On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starts On Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getStartsOnEvent()
	 * @see #getBswEvent()
	 * @generated
	 */
	EReference getBswEvent_StartsOnEvent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig()
	 * @see #getBswEvent()
	 * @generated
	 */
	EReference getBswEvent_Config();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getParent()
	 * @see #getBswEvent()
	 * @generated
	 */
	EReference getBswEvent_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getDisabledInMode <em>Disabled In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disabled In Mode</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getDisabledInMode()
	 * @see #getBswEvent()
	 * @generated
	 */
	EReference getBswEvent_DisabledInMode();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent <em>Bsw Mode Switch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Mode Switch Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent
	 * @generated
	 */
	EClass getBswModeSwitchEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent#getActivation()
	 * @see #getBswModeSwitchEvent()
	 * @generated
	 */
	EAttribute getBswModeSwitchEvent_Activation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent#getModeIref <em>Mode Iref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Iref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent#getModeIref()
	 * @see #getBswModeSwitchEvent()
	 * @generated
	 */
	EReference getBswModeSwitchEvent_ModeIref();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef <em>Mode In Bsw Module Description Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode In Bsw Module Description Instance Ref</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef
	 * @generated
	 */
	EClass getModeInBswModuleDescriptionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef#getContextModeDeclarationGroup <em>Context Mode Declaration Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Mode Declaration Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef#getContextModeDeclarationGroup()
	 * @see #getModeInBswModuleDescriptionInstanceRef()
	 * @generated
	 */
	EReference getModeInBswModuleDescriptionInstanceRef_ContextModeDeclarationGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef#getTargetMode <em>Target Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Mode</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef#getTargetMode()
	 * @see #getModeInBswModuleDescriptionInstanceRef()
	 * @generated
	 */
	EReference getModeInBswModuleDescriptionInstanceRef_TargetMode();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind <em>Mode Activation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Activation Kind</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind
	 * @generated
	 */
	EEnum getModeActivationKind();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent <em>Bsw Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Timing Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent
	 * @generated
	 */
	EClass getBswTimingEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent#getPeriod()
	 * @see #getBswTimingEvent()
	 * @generated
	 */
	EAttribute getBswTimingEvent_Period();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswBackgroundEvent <em>Bsw Background Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Background Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswBackgroundEvent
	 * @generated
	 */
	EClass getBswBackgroundEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCalledEntity <em>Bsw Called Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Called Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCalledEntity
	 * @generated
	 */
	EClass getBswCalledEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity <em>Bsw Interrupt Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Interrupt Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity
	 * @generated
	 */
	EClass getBswInterruptEntity();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity#getInterruptSource <em>Interrupt Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupt Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInterruptEntity#getInterruptSource()
	 * @see #getBswInterruptEntity()
	 * @generated
	 */
	EAttribute getBswInterruptEntity_InterruptSource();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement <em>Implementation Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Data Type Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement
	 * @generated
	 */
	EClass getImplementationDataTypeElement();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Size</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getArraySize()
	 * @see #getImplementationDataTypeElement()
	 * @generated
	 */
	EAttribute getImplementationDataTypeElement_ArraySize();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getArraySizeSemantics <em>Array Size Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Size Semantics</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getArraySizeSemantics()
	 * @see #getImplementationDataTypeElement()
	 * @generated
	 */
	EAttribute getImplementationDataTypeElement_ArraySizeSemantics();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getSubElement <em>Sub Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getSubElement()
	 * @see #getImplementationDataTypeElement()
	 * @generated
	 */
	EReference getImplementationDataTypeElement_SubElement();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getSwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Data Def Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#getSwDataDefProps()
	 * @see #getImplementationDataTypeElement()
	 * @generated
	 */
	EReference getImplementationDataTypeElement_SwDataDefProps();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#isRedefinitionType() <em>Is Redefinition Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Redefinition Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement#isRedefinitionType()
	 * @generated
	 */
	EOperation getImplementationDataTypeElement__IsRedefinitionType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup <em>System Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup
	 * @generated
	 */
	EClass getSystemSignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup#getSystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup#getSystemSignal()
	 * @see #getSystemSignalGroup()
	 * @generated
	 */
	EReference getSystemSignalGroup_SystemSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup <em>ISignal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISignal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup
	 * @generated
	 */
	EClass getISignalGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup#getSystemSignalGroup <em>System Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup#getSystemSignalGroup()
	 * @see #getISignalGroup()
	 * @generated
	 */
	EReference getISignalGroup_SystemSignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup#getISignal <em>ISignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ISignal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalGroup#getISignal()
	 * @see #getISignalGroup()
	 * @generated
	 */
	EReference getISignalGroup_ISignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping <em>Sender Rec Composite Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Rec Composite Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping
	 * @generated
	 */
	EClass getSenderRecCompositeTypeMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping <em>Sender Rec Record Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Rec Record Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping
	 * @generated
	 */
	EClass getSenderRecRecordTypeMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping#getRecordElementMapping <em>Record Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Element Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping#getRecordElementMapping()
	 * @see #getSenderRecRecordTypeMapping()
	 * @generated
	 */
	EReference getSenderRecRecordTypeMapping_RecordElementMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping <em>Sender Rec Record Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Rec Record Element Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping
	 * @generated
	 */
	EClass getSenderRecRecordElementMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getImplementationRecordElement <em>Implementation Record Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Record Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getImplementationRecordElement()
	 * @see #getSenderRecRecordElementMapping()
	 * @generated
	 */
	EReference getSenderRecRecordElementMapping_ImplementationRecordElement();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getComplexTypeMapping <em>Complex Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getComplexTypeMapping()
	 * @see #getSenderRecRecordElementMapping()
	 * @generated
	 */
	EReference getSenderRecRecordElementMapping_ComplexTypeMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getSystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping#getSystemSignal()
	 * @see #getSenderRecRecordElementMapping()
	 * @generated
	 */
	EReference getSenderRecRecordElementMapping_SystemSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping <em>Sender Rec Array Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Rec Array Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping
	 * @generated
	 */
	EClass getSenderRecArrayTypeMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping#getArrayElementMapping <em>Array Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Element Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping#getArrayElementMapping()
	 * @see #getSenderRecArrayTypeMapping()
	 * @generated
	 */
	EReference getSenderRecArrayTypeMapping_ArrayElementMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement <em>Indexed Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Array Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement
	 * @generated
	 */
	EClass getIndexedArrayElement();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement#getImplementationArrayElement <em>Implementation Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Array Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement#getImplementationArrayElement()
	 * @see #getIndexedArrayElement()
	 * @generated
	 */
	EReference getIndexedArrayElement_ImplementationArrayElement();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement#getIndex()
	 * @see #getIndexedArrayElement()
	 * @generated
	 */
	EAttribute getIndexedArrayElement_Index();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping <em>Sender Rec Array Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Rec Array Element Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping
	 * @generated
	 */
	EClass getSenderRecArrayElementMapping();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getIndexedArrayElement <em>Indexed Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexed Array Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getIndexedArrayElement()
	 * @see #getSenderRecArrayElementMapping()
	 * @generated
	 */
	EReference getSenderRecArrayElementMapping_IndexedArrayElement();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getComplexTypeMapping <em>Complex Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getComplexTypeMapping()
	 * @see #getSenderRecArrayElementMapping()
	 * @generated
	 */
	EReference getSenderRecArrayElementMapping_ComplexTypeMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getSystemSignal <em>System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping#getSystemSignal()
	 * @see #getSenderRecArrayElementMapping()
	 * @generated
	 */
	EReference getSenderRecArrayElementMapping_SystemSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps <em>Sw Pointer Target Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Pointer Target Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps
	 * @generated
	 */
	EClass getSwPointerTargetProps();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps#getTargetCategory <em>Target Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Category</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps#getTargetCategory()
	 * @see #getSwPointerTargetProps()
	 * @generated
	 */
	EAttribute getSwPointerTargetProps_TargetCategory();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps#getSwDataDefProps <em>Sw Data Def Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Data Def Props</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps#getSwDataDefProps()
	 * @see #getSwPointerTargetProps()
	 * @generated
	 */
	EReference getSwPointerTargetProps_SwDataDefProps();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum <em>Argument Direction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Argument Direction Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum
	 * @generated
	 */
	EEnum getArgumentDirectionEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum <em>Data Filter Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Filter Type Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum
	 * @generated
	 */
	EEnum getDataFilterTypeEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum <em>Handle Invalid Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handle Invalid Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum
	 * @generated
	 */
	EEnum getHandleInvalidEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum <em>Sw Impl Policy Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sw Impl Policy Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum
	 * @generated
	 */
	EEnum getSwImplPolicyEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType <em>Memory Allocation Keyword Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Allocation Keyword Policy Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType
	 * @generated
	 */
	EEnum getMemoryAllocationKeywordPolicyType();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum <em>Ecuc Configuration Variant Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ecuc Configuration Variant Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum
	 * @generated
	 */
	EEnum getEcucConfigurationVariantEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum <em>Bsw Call Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bsw Call Type Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum
	 * @generated
	 */
	EEnum getBswCallTypeEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum <em>Bsw Execution Context Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bsw Execution Context Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum
	 * @generated
	 */
	EEnum getBswExecutionContextEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum <em>Array Size Semantics Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Array Size Semantics Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum
	 * @generated
	 */
	EEnum getArraySizeSemanticsEnum();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Numerical</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getNumerical();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Unlimited Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getUnlimitedInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Value</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getTimeValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRef();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CIdentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CIdentifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Verbatim String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verbatim String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getVerbatimString();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Native Declaration String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Native Declaration String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNativeDeclarationString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Section Initialization Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Section Initialization Policy Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getSectionInitializationPolicyType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Category String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Category String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCategoryString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Base Type Encoding String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Type Encoding String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getBaseTypeEncodingString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Revision Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Revision Label String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRevisionLabelString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Alignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAlignmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M2Factory getM2Factory();

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
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2RootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getM2Root()
		 * @generated
		 */
		EClass M2_ROOT = eINSTANCE.getM2Root();

		/**
		 * The meta object literal for the '<em><b>Autosar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M2_ROOT__AUTOSAR = eINSTANCE.getM2Root_Autosar();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarImpl <em>Autosar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosar()
		 * @generated
		 */
		EClass AUTOSAR = eINSTANCE.getAutosar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOSAR__ID = eINSTANCE.getAutosar_Id();

		/**
		 * The meta object literal for the '<em><b>Ar Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR__AR_PACKAGE = eINSTANCE.getAutosar_ArPackage();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArPackageImpl <em>Ar Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArPackageImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArPackage()
		 * @generated
		 */
		EClass AR_PACKAGE = eINSTANCE.getArPackage();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AR_PACKAGE__ELEMENT = eINSTANCE.getArPackage_Element();

		/**
		 * The meta object literal for the '<em><b>Ar Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AR_PACKAGE__AR_PACKAGE = eINSTANCE.getArPackage_ArPackage();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArElementImpl <em>Ar Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArElementImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArElement()
		 * @generated
		 */
		EClass AR_ELEMENT = eINSTANCE.getArElement();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IdentifiableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__CATEGORY = eINSTANCE.getIdentifiable_Category();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2ObjectImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getM2Object()
		 * @generated
		 */
		EClass M2_OBJECT = eINSTANCE.getM2Object();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl <em>Sw Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwBaseType()
		 * @generated
		 */
		EClass SW_BASE_TYPE = eINSTANCE.getSwBaseType();

		/**
		 * The meta object literal for the '<em><b>Base Type Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_BASE_TYPE__BASE_TYPE_ENCODING = eINSTANCE.getSwBaseType_BaseTypeEncoding();

		/**
		 * The meta object literal for the '<em><b>Base Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_BASE_TYPE__BASE_TYPE_SIZE = eINSTANCE.getSwBaseType_BaseTypeSize();

		/**
		 * The meta object literal for the '<em><b>Native Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_BASE_TYPE__NATIVE_DECLARATION = eINSTANCE.getSwBaseType_NativeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Upper Limit For Unsigned Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SW_BASE_TYPE___GET_UPPER_LIMIT_FOR_UNSIGNED_INTEGER = eINSTANCE.getSwBaseType__GetUpperLimitForUnsignedInteger();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverInterfaceImpl <em>Sender Receiver Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverInterfaceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverInterface()
		 * @generated
		 */
		EClass SENDER_RECEIVER_INTERFACE = eINSTANCE.getSenderReceiverInterface();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_INTERFACE__DATA_ELEMENT = eINSTANCE.getSenderReceiverInterface_DataElement();

		/**
		 * The meta object literal for the '<em><b>Invalidation Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_INTERFACE__INVALIDATION_POLICY = eINSTANCE.getSenderReceiverInterface_InvalidationPolicy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeImpl <em>Variable Data Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableDataPrototype()
		 * @generated
		 */
		EClass VARIABLE_DATA_PROTOTYPE = eINSTANCE.getVariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_PROTOTYPE__INIT_VALUE = eINSTANCE.getVariableDataPrototype_InitValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferrableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__ID = eINSTANCE.getReferrable_Id();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__SHORT_NAME = eINSTANCE.getReferrable_ShortName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__REFERENCE = eINSTANCE.getReferrable_Reference();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentTypeImpl <em>Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwComponentType()
		 * @generated
		 */
		EClass SW_COMPONENT_TYPE = eINSTANCE.getSwComponentType();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_TYPE__PORT = eINSTANCE.getSwComponentType_Port();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeImpl <em>Port Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortPrototype()
		 * @generated
		 */
		EClass PORT_PROTOTYPE = eINSTANCE.getPortPrototype();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PROTOTYPE__PARENT = eINSTANCE.getPortPrototype_Parent();

		/**
		 * The meta object literal for the '<em><b>Port Api Option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PROTOTYPE__PORT_API_OPTION = eINSTANCE.getPortPrototype_PortApiOption();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AtomicSwComponentTypeImpl <em>Atomic Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AtomicSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAtomicSwComponentType()
		 * @generated
		 */
		EClass ATOMIC_SW_COMPONENT_TYPE = eINSTANCE.getAtomicSwComponentType();

		/**
		 * The meta object literal for the '<em><b>Internal Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR = eINSTANCE.getAtomicSwComponentType_InternalBehavior();

		/**
		 * The meta object literal for the '<em><b>Get Using Application Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES = eINSTANCE.getAtomicSwComponentType__GetUsingApplicationDataTypes();

		/**
		 * The meta object literal for the '<em><b>Get Using Implementation Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES = eINSTANCE.getAtomicSwComponentType__GetUsingImplementationDataTypes();

		/**
		 * The meta object literal for the '<em><b>Get Using Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES = eINSTANCE.getAtomicSwComponentType__GetUsingDataTypes();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = eINSTANCE.getAtomicSwComponentType__GetImplementationDataType__AutosarDataType();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = eINSTANCE.getAtomicSwComponentType__GetImplementationDataTypes__ApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Using Client Server Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES = eINSTANCE.getAtomicSwComponentType__GetUsingClientServerInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get RPorts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS = eINSTANCE.getAtomicSwComponentType__GetRPorts();

		/**
		 * The meta object literal for the '<em><b>Get PPorts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS = eINSTANCE.getAtomicSwComponentType__GetPPorts();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationSwComponentTypeImpl <em>Application Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationSwComponentType()
		 * @generated
		 */
		EClass APPLICATION_SW_COMPONENT_TYPE = eINSTANCE.getApplicationSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl <em>RPort Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortPrototype()
		 * @generated
		 */
		EClass RPORT_PROTOTYPE = eINSTANCE.getRPortPrototype();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPORT_PROTOTYPE__REQUIRED_INTERFACE = eINSTANCE.getRPortPrototype_RequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Required Com Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPORT_PROTOTYPE__REQUIRED_COM_SPEC = eINSTANCE.getRPortPrototype_RequiredComSpec();

		/**
		 * The meta object literal for the '<em><b>Get Using Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RPORT_PROTOTYPE___GET_USING_DATA_TYPES = eINSTANCE.getRPortPrototype__GetUsingDataTypes();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeImpl <em>PPort Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortPrototype()
		 * @generated
		 */
		EClass PPORT_PROTOTYPE = eINSTANCE.getPPortPrototype();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPORT_PROTOTYPE__PROVIDED_INTERFACE = eINSTANCE.getPPortPrototype_ProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Provided Com Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPORT_PROTOTYPE__PROVIDED_COM_SPEC = eINSTANCE.getPPortPrototype_ProvidedComSpec();

		/**
		 * The meta object literal for the '<em><b>Get Using Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PPORT_PROTOTYPE___GET_USING_DATA_TYPES = eINSTANCE.getPPortPrototype__GetUsingDataTypes();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl <em>Swc Internal Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcInternalBehaviorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcInternalBehavior()
		 * @generated
		 */
		EClass SWC_INTERNAL_BEHAVIOR = eINSTANCE.getSwcInternalBehavior();

		/**
		 * The meta object literal for the '<em><b>Runnable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__RUNNABLE = eINSTANCE.getSwcInternalBehavior_Runnable();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__EVENT = eINSTANCE.getSwcInternalBehavior_Event();

		/**
		 * The meta object literal for the '<em><b>Port Api Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION = eINSTANCE.getSwcInternalBehavior_PortApiOption();

		/**
		 * The meta object literal for the '<em><b>Included Data Type Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET = eINSTANCE.getSwcInternalBehavior_IncludedDataTypeSet();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__PARENT = eINSTANCE.getSwcInternalBehavior_Parent();

		/**
		 * The meta object literal for the '<em><b>Explicit Inter Runnable Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE = eINSTANCE.getSwcInternalBehavior_ExplicitInterRunnableVariable();

		/**
		 * The meta object literal for the '<em><b>Get Referencer Included Data Type Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__APPLICATIONDATATYPE = eINSTANCE.getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Referencer Included Data Type Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__IMPLEMENTATIONDATATYPE = eINSTANCE.getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Using Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_USING_DATA_TYPES = eINSTANCE.getSwcInternalBehavior__GetUsingDataTypes();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE = eINSTANCE.getSwcInternalBehavior__GetImplementationDataType__AutosarDataType();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__APPLICATIONDATATYPE = eINSTANCE.getSwcInternalBehavior__GetImplementationDataType__ApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE = eINSTANCE.getSwcInternalBehavior__GetImplementationDataTypes__ApplicationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl <em>Executable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getExecutableEntity()
		 * @generated
		 */
		EClass EXECUTABLE_ENTITY = eINSTANCE.getExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Can Enter Exclusive Area</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA = eINSTANCE.getExecutableEntity_CanEnterExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Runs Inside Exclusive Area</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA = eINSTANCE.getExecutableEntity_RunsInsideExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Sw Addr Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY__SW_ADDR_METHOD = eINSTANCE.getExecutableEntity_SwAddrMethod();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl <em>Runnable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRunnableEntity()
		 * @generated
		 */
		EClass RUNNABLE_ENTITY = eINSTANCE.getRunnableEntity();

		/**
		 * The meta object literal for the '<em><b>Data Send Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__DATA_SEND_POINT = eINSTANCE.getRunnableEntity_DataSendPoint();

		/**
		 * The meta object literal for the '<em><b>Data Receive Point By Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT = eINSTANCE.getRunnableEntity_DataReceivePointByArgument();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE_ENTITY__SYMBOL = eINSTANCE.getRunnableEntity_Symbol();

		/**
		 * The meta object literal for the '<em><b>Written Local Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE = eINSTANCE.getRunnableEntity_WrittenLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Read Local Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__READ_LOCAL_VARIABLE = eINSTANCE.getRunnableEntity_ReadLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Server Call Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__SERVER_CALL_POINT = eINSTANCE.getRunnableEntity_ServerCallPoint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__EVENT = eINSTANCE.getRunnableEntity_Event();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY__PARENT = eINSTANCE.getRunnableEntity_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableAccessImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Accessed Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESS__ACCESSED_VARIABLE = eINSTANCE.getVariableAccess_AccessedVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl <em>Autosar Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarVariableRef()
		 * @generated
		 */
		EClass AUTOSAR_VARIABLE_REF = eINSTANCE.getAutosarVariableRef();

		/**
		 * The meta object literal for the '<em><b>Autosar Variable Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF = eINSTANCE.getAutosarVariableRef_AutosarVariableIref();

		/**
		 * The meta object literal for the '<em><b>Autosar Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE = eINSTANCE.getAutosarVariableRef_AutosarVariable();

		/**
		 * The meta object literal for the '<em><b>Local Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE = eINSTANCE.getAutosarVariableRef_LocalVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl <em>Variable In Atomic Swc Type Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableInAtomicSwcTypeInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableInAtomicSwcTypeInstanceRef()
		 * @generated
		 */
		EClass VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF = eINSTANCE.getVariableInAtomicSwcTypeInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Port Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE = eINSTANCE.getVariableInAtomicSwcTypeInstanceRef_PortPrototype();

		/**
		 * The meta object literal for the '<em><b>Target Data Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE = eINSTANCE.getVariableInAtomicSwcTypeInstanceRef_TargetDataPrototype();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RteEventImpl <em>Rte Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RteEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRteEvent()
		 * @generated
		 */
		EClass RTE_EVENT = eINSTANCE.getRteEvent();

		/**
		 * The meta object literal for the '<em><b>Start On Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT__START_ON_EVENT = eINSTANCE.getRteEvent_StartOnEvent();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT__CONFIG = eINSTANCE.getRteEvent_Config();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TimingEventImpl <em>Timing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TimingEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTimingEvent()
		 * @generated
		 */
		EClass TIMING_EVENT = eINSTANCE.getTimingEvent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_EVENT__PERIOD = eINSTANCE.getTimingEvent_Period();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BackgroundEventImpl <em>Background Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BackgroundEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBackgroundEvent()
		 * @generated
		 */
		EClass BACKGROUND_EVENT = eINSTANCE.getBackgroundEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataSendCompletedEventImpl <em>Data Send Completed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataSendCompletedEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataSendCompletedEvent()
		 * @generated
		 */
		EClass DATA_SEND_COMPLETED_EVENT = eINSTANCE.getDataSendCompletedEvent();

		/**
		 * The meta object literal for the '<em><b>Event Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE = eINSTANCE.getDataSendCompletedEvent_EventSource();

		/**
		 * The meta object literal for the '<em><b>Event Source Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE_DATA = eINSTANCE.getDataSendCompletedEvent_EventSourceData();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceivedEventImpl <em>Data Received Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceivedEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataReceivedEvent()
		 * @generated
		 */
		EClass DATA_RECEIVED_EVENT = eINSTANCE.getDataReceivedEvent();

		/**
		 * The meta object literal for the '<em><b>Data Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RECEIVED_EVENT__DATA_IREF = eINSTANCE.getDataReceivedEvent_DataIref();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RECEIVED_EVENT__DATA = eINSTANCE.getDataReceivedEvent_Data();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceiveErrorEventImpl <em>Data Receive Error Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataReceiveErrorEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataReceiveErrorEvent()
		 * @generated
		 */
		EClass DATA_RECEIVE_ERROR_EVENT = eINSTANCE.getDataReceiveErrorEvent();

		/**
		 * The meta object literal for the '<em><b>Data Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RECEIVE_ERROR_EVENT__DATA_IREF = eINSTANCE.getDataReceiveErrorEvent_DataIref();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RECEIVE_ERROR_EVENT__DATA = eINSTANCE.getDataReceiveErrorEvent_Data();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RVariableInAtomicSwcInstanceRefImpl <em>RVariable In Atomic Swc Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RVariableInAtomicSwcInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRVariableInAtomicSwcInstanceRef()
		 * @generated
		 */
		EClass RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF = eINSTANCE.getRVariableInAtomicSwcInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context RPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT = eINSTANCE.getRVariableInAtomicSwcInstanceRef_ContextRPort();

		/**
		 * The meta object literal for the '<em><b>Target Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_DATA_ELEMENT = eINSTANCE.getRVariableInAtomicSwcInstanceRef_TargetDataElement();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl <em>Ecuc Module Configuration Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucModuleConfigurationValuesImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucModuleConfigurationValues()
		 * @generated
		 */
		EClass ECUC_MODULE_CONFIGURATION_VALUES = eINSTANCE.getEcucModuleConfigurationValues();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER = eINSTANCE.getEcucModuleConfigurationValues_Container();

		/**
		 * The meta object literal for the '<em><b>Ecuc Def Edition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION = eINSTANCE.getEcucModuleConfigurationValues_EcucDefEdition();

		/**
		 * The meta object literal for the '<em><b>Implementation Config Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT = eINSTANCE.getEcucModuleConfigurationValues_ImplementationConfigVariant();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF = eINSTANCE.getEcucModuleConfigurationValues_DefinitionRef();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl <em>Ecuc Container Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucContainerValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucContainerValue()
		 * @generated
		 */
		EClass ECUC_CONTAINER_VALUE = eINSTANCE.getEcucContainerValue();

		/**
		 * The meta object literal for the '<em><b>Sub Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_CONTAINER_VALUE__SUB_CONTAINER = eINSTANCE.getEcucContainerValue_SubContainer();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_CONTAINER_VALUE__PARAMETER_VALUE = eINSTANCE.getEcucContainerValue_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_CONTAINER_VALUE__DEFINITION_REF = eINSTANCE.getEcucContainerValue_DefinitionRef();

		/**
		 * The meta object literal for the '<em><b>Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_CONTAINER_VALUE__REFERENCE_VALUE = eINSTANCE.getEcucContainerValue_ReferenceValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucParameterValueImpl <em>Ecuc Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucParameterValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucParameterValue()
		 * @generated
		 */
		EClass ECUC_PARAMETER_VALUE = eINSTANCE.getEcucParameterValue();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_PARAMETER_VALUE__DEFINITION_REF = eINSTANCE.getEcucParameterValue_DefinitionRef();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucNumericalParamValueImpl <em>Ecuc Numerical Param Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucNumericalParamValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucNumericalParamValue()
		 * @generated
		 */
		EClass ECUC_NUMERICAL_PARAM_VALUE = eINSTANCE.getEcucNumericalParamValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_NUMERICAL_PARAM_VALUE__VALUE = eINSTANCE.getEcucNumericalParamValue_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucTextualParamValueImpl <em>Ecuc Textual Param Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucTextualParamValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucTextualParamValue()
		 * @generated
		 */
		EClass ECUC_TEXTUAL_PARAM_VALUE = eINSTANCE.getEcucTextualParamValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_TEXTUAL_PARAM_VALUE__VALUE = eINSTANCE.getEcucTextualParamValue_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucAbstractReferenceValueImpl <em>Ecuc Abstract Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucAbstractReferenceValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucAbstractReferenceValue()
		 * @generated
		 */
		EClass ECUC_ABSTRACT_REFERENCE_VALUE = eINSTANCE.getEcucAbstractReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF = eINSTANCE.getEcucAbstractReferenceValue_DefinitionRef();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucReferenceValueImpl <em>Ecuc Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucReferenceValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucReferenceValue()
		 * @generated
		 */
		EClass ECUC_REFERENCE_VALUE = eINSTANCE.getEcucReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_REFERENCE_VALUE__VALUE = eINSTANCE.getEcucReferenceValue_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucInstanceReferenceValueImpl <em>Ecuc Instance Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucInstanceReferenceValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucInstanceReferenceValue()
		 * @generated
		 */
		EClass ECUC_INSTANCE_REFERENCE_VALUE = eINSTANCE.getEcucInstanceReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Value Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_INSTANCE_REFERENCE_VALUE__VALUE_IREF = eINSTANCE.getEcucInstanceReferenceValue_ValueIref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_INSTANCE_REFERENCE_VALUE__VALUE = eINSTANCE.getEcucInstanceReferenceValue_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortComSpecImpl <em>RPort Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortComSpec()
		 * @generated
		 */
		EClass RPORT_COM_SPEC = eINSTANCE.getRPortComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortComSpecImpl <em>PPort Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortComSpec()
		 * @generated
		 */
		EClass PPORT_COM_SPEC = eINSTANCE.getPPortComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReceiverComSpecImpl <em>Receiver Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReceiverComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReceiverComSpec()
		 * @generated
		 */
		EClass RECEIVER_COM_SPEC = eINSTANCE.getReceiverComSpec();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_COM_SPEC__DATA_ELEMENT = eINSTANCE.getReceiverComSpec_DataElement();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderComSpecImpl <em>Sender Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderComSpec()
		 * @generated
		 */
		EClass SENDER_COM_SPEC = eINSTANCE.getSenderComSpec();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_COM_SPEC__DATA_ELEMENT = eINSTANCE.getSenderComSpec_DataElement();

		/**
		 * The meta object literal for the '<em><b>Transmission Acknowledge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE = eINSTANCE.getSenderComSpec_TransmissionAcknowledge();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TransmissionAcknowledgementRequestImpl <em>Transmission Acknowledgement Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TransmissionAcknowledgementRequestImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTransmissionAcknowledgementRequest()
		 * @generated
		 */
		EClass TRANSMISSION_ACKNOWLEDGEMENT_REQUEST = eINSTANCE.getTransmissionAcknowledgementRequest();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_ACKNOWLEDGEMENT_REQUEST__TIMEOUT = eINSTANCE.getTransmissionAcknowledgementRequest_Timeout();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedSenderComSpecImpl <em>Nonqueued Sender Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedSenderComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNonqueuedSenderComSpec()
		 * @generated
		 */
		EClass NONQUEUED_SENDER_COM_SPEC = eINSTANCE.getNonqueuedSenderComSpec();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NONQUEUED_SENDER_COM_SPEC__INIT_VALUE = eINSTANCE.getNonqueuedSenderComSpec_InitValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedSenderComSpecImpl <em>Queued Sender Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedSenderComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getQueuedSenderComSpec()
		 * @generated
		 */
		EClass QUEUED_SENDER_COM_SPEC = eINSTANCE.getQueuedSenderComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl <em>Nonqueued Receiver Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNonqueuedReceiverComSpec()
		 * @generated
		 */
		EClass NONQUEUED_RECEIVER_COM_SPEC = eINSTANCE.getNonqueuedReceiverComSpec();

		/**
		 * The meta object literal for the '<em><b>Alive Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT = eINSTANCE.getNonqueuedReceiverComSpec_AliveTimeout();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE = eINSTANCE.getNonqueuedReceiverComSpec_InitValue();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NONQUEUED_RECEIVER_COM_SPEC__FILTER = eINSTANCE.getNonqueuedReceiverComSpec_Filter();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInterfaceImpl <em>Port Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInterfaceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortInterface()
		 * @generated
		 */
		EClass PORT_INTERFACE = eINSTANCE.getPortInterface();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompositionSwComponentTypeImpl <em>Composition Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompositionSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompositionSwComponentType()
		 * @generated
		 */
		EClass COMPOSITION_SW_COMPONENT_TYPE = eINSTANCE.getCompositionSwComponentType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_SW_COMPONENT_TYPE__COMPONENT = eINSTANCE.getCompositionSwComponentType_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_SW_COMPONENT_TYPE__CONNECTOR = eINSTANCE.getCompositionSwComponentType_Connector();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwConnectorImpl <em>Sw Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwConnector()
		 * @generated
		 */
		EClass SW_CONNECTOR = eINSTANCE.getSwConnector();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl <em>Assembly Sw Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAssemblySwConnector()
		 * @generated
		 */
		EClass ASSEMBLY_SW_CONNECTOR = eINSTANCE.getAssemblySwConnector();

		/**
		 * The meta object literal for the '<em><b>Requester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_SW_CONNECTOR__REQUESTER = eINSTANCE.getAssemblySwConnector_Requester();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_SW_CONNECTOR__PROVIDER = eINSTANCE.getAssemblySwConnector_Provider();

		/**
		 * The meta object literal for the '<em><b>Provider Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF = eINSTANCE.getAssemblySwConnector_ProviderIref();

		/**
		 * The meta object literal for the '<em><b>Requester Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF = eINSTANCE.getAssemblySwConnector_RequesterIref();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl <em>Delegation Sw Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDelegationSwConnector()
		 * @generated
		 */
		EClass DELEGATION_SW_CONNECTOR = eINSTANCE.getDelegationSwConnector();

		/**
		 * The meta object literal for the '<em><b>Outer Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_SW_CONNECTOR__OUTER_PORT = eINSTANCE.getDelegationSwConnector_OuterPort();

		/**
		 * The meta object literal for the '<em><b>Inner Port Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_SW_CONNECTOR__INNER_PORT_IREF = eINSTANCE.getDelegationSwConnector_InnerPortIref();

		/**
		 * The meta object literal for the '<em><b>Inner Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_SW_CONNECTOR__INNER_PORT = eINSTANCE.getDelegationSwConnector_InnerPort();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeInCompositionInstanceRefImpl <em>RPort Prototype In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortPrototypeInCompositionInstanceRef()
		 * @generated
		 */
		EClass RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getRPortPrototypeInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Target RPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT = eINSTANCE.getRPortPrototypeInCompositionInstanceRef_TargetRPort();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeInCompositionInstanceRefImpl <em>PPort Prototype In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortPrototypeInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortPrototypeInCompositionInstanceRef()
		 * @generated
		 */
		EClass PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getPPortPrototypeInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Target PPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT = eINSTANCE.getPPortPrototypeInCompositionInstanceRef_TargetPPort();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentPrototypeImpl <em>Sw Component Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwComponentPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwComponentPrototype()
		 * @generated
		 */
		EClass SW_COMPONENT_PROTOTYPE = eINSTANCE.getSwComponentPrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_PROTOTYPE__TYPE = eINSTANCE.getSwComponentPrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_PROTOTYPE__INSTANCE = eINSTANCE.getSwComponentPrototype_Instance();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl <em>Autosar Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarDataType()
		 * @generated
		 */
		EClass AUTOSAR_DATA_TYPE = eINSTANCE.getAutosarDataType();

		/**
		 * The meta object literal for the '<em><b>Sw Data Def Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS = eINSTANCE.getAutosarDataType_SwDataDefProps();

		/**
		 * The meta object literal for the '<em><b>Invalid Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_DATA_TYPE__INVALID_VALUE = eINSTANCE.getAutosarDataType_InvalidValue();

		/**
		 * The meta object literal for the '<em><b>Compu Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_DATA_TYPE__COMPU_METHOD = eINSTANCE.getAutosarDataType_CompuMethod();

		/**
		 * The meta object literal for the '<em><b>Data Constr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_DATA_TYPE__DATA_CONSTR = eINSTANCE.getAutosarDataType_DataConstr();

		/**
		 * The meta object literal for the '<em><b>Sw Addr Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOSAR_DATA_TYPE__SW_ADDR_METHOD = eINSTANCE.getAutosarDataType_SwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Get Sw Impl Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY = eINSTANCE.getAutosarDataType__GetSwImplPolicy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationDataTypeImpl <em>Application Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationDataTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationDataType()
		 * @generated
		 */
		EClass APPLICATION_DATA_TYPE = eINSTANCE.getApplicationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeImpl <em>Implementation Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementationDataType()
		 * @generated
		 */
		EClass IMPLEMENTATION_DATA_TYPE = eINSTANCE.getImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE__BASE_TYPE = eINSTANCE.getImplementationDataType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Sw Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__SW_ALIGNMENT = eINSTANCE.getImplementationDataType_SwAlignment();

		/**
		 * The meta object literal for the '<em><b>Sub Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE__SUB_ELEMENT = eINSTANCE.getImplementationDataType_SubElement();

		/**
		 * The meta object literal for the '<em><b>Get Leaf Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___GET_LEAF_IMPLEMENTATION_DATA_TYPE = eINSTANCE.getImplementationDataType__GetLeafImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Is Primitive Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_PRIMITIVE_TYPE = eINSTANCE.getImplementationDataType__IsPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Is Pointer Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_POINTER_TYPE = eINSTANCE.getImplementationDataType__IsPointerType();

		/**
		 * The meta object literal for the '<em><b>Is Array Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_ARRAY_TYPE = eINSTANCE.getImplementationDataType__IsArrayType();

		/**
		 * The meta object literal for the '<em><b>Is Struct Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_STRUCT_TYPE = eINSTANCE.getImplementationDataType__IsStructType();

		/**
		 * The meta object literal for the '<em><b>Is Union Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_UNION_TYPE = eINSTANCE.getImplementationDataType__IsUnionType();

		/**
		 * The meta object literal for the '<em><b>Is Redefinition Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_REDEFINITION_TYPE = eINSTANCE.getImplementationDataType__IsRedefinitionType();

		/**
		 * The meta object literal for the '<em><b>Is Complex Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE___IS_COMPLEX_TYPE = eINSTANCE.getImplementationDataType__IsComplexType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl <em>Sw Data Def Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwDataDefProps()
		 * @generated
		 */
		EClass SW_DATA_DEF_PROPS = eINSTANCE.getSwDataDefProps();

		/**
		 * The meta object literal for the '<em><b>Invalid Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__INVALID_VALUE = eINSTANCE.getSwDataDefProps_InvalidValue();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__BASE_TYPE = eINSTANCE.getSwDataDefProps_BaseType();

		/**
		 * The meta object literal for the '<em><b>Sw Impl Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_DATA_DEF_PROPS__SW_IMPL_POLICY = eINSTANCE.getSwDataDefProps_SwImplPolicy();

		/**
		 * The meta object literal for the '<em><b>Sw Addr Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__SW_ADDR_METHOD = eINSTANCE.getSwDataDefProps_SwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Sw Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_DATA_DEF_PROPS__SW_ALIGNMENT = eINSTANCE.getSwDataDefProps_SwAlignment();

		/**
		 * The meta object literal for the '<em><b>Compu Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__COMPU_METHOD = eINSTANCE.getSwDataDefProps_CompuMethod();

		/**
		 * The meta object literal for the '<em><b>Data Constr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__DATA_CONSTR = eINSTANCE.getSwDataDefProps_DataConstr();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE = eINSTANCE.getSwDataDefProps_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Sw Pointer Target Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS = eINSTANCE.getSwDataDefProps_SwPointerTargetProps();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl <em>Data Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataTypeMap()
		 * @generated
		 */
		EClass DATA_TYPE_MAP = eINSTANCE.getDataTypeMap();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE = eINSTANCE.getDataTypeMap_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Application Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_MAP__APPLICATION_DATA_TYPE = eINSTANCE.getDataTypeMap_ApplicationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMappingSetImpl <em>Data Type Mapping Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMappingSetImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataTypeMappingSet()
		 * @generated
		 */
		EClass DATA_TYPE_MAPPING_SET = eINSTANCE.getDataTypeMappingSet();

		/**
		 * The meta object literal for the '<em><b>Data Type Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_MAPPING_SET__DATA_TYPE_MAP = eINSTANCE.getDataTypeMappingSet_DataTypeMap();

		/**
		 * The meta object literal for the '<em><b>Mode Request Type Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_MAPPING_SET__MODE_REQUEST_TYPE_MAP = eINSTANCE.getDataTypeMappingSet_ModeRequestTypeMap();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupPrototypeImpl <em>Mode Declaration Group Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclarationGroupPrototype()
		 * @generated
		 */
		EClass MODE_DECLARATION_GROUP_PROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_DECLARATION_GROUP_PROTOTYPE__TYPE = eINSTANCE.getModeDeclarationGroupPrototype_Type();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeRequestTypeMapImpl <em>Mode Request Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeRequestTypeMapImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeRequestTypeMap()
		 * @generated
		 */
		EClass MODE_REQUEST_TYPE_MAP = eINSTANCE.getModeRequestTypeMap();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_REQUEST_TYPE_MAP__IMPLEMENTATION_DATA_TYPE = eINSTANCE.getModeRequestTypeMap_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Mode Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_REQUEST_TYPE_MAP__MODE_GROUP = eINSTANCE.getModeRequestTypeMap_ModeGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationImpl <em>Mode Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclaration()
		 * @generated
		 */
		EClass MODE_DECLARATION = eINSTANCE.getModeDeclaration();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupImpl <em>Mode Declaration Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeDeclarationGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeDeclarationGroup()
		 * @generated
		 */
		EClass MODE_DECLARATION_GROUP = eINSTANCE.getModeDeclarationGroup();

		/**
		 * The meta object literal for the '<em><b>Initial Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_DECLARATION_GROUP__INITIAL_MODE = eINSTANCE.getModeDeclarationGroup_InitialMode();

		/**
		 * The meta object literal for the '<em><b>Mode Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_DECLARATION_GROUP__MODE_DECLARATION = eINSTANCE.getModeDeclarationGroup_ModeDeclaration();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationPrimitiveDataTypeImpl <em>Application Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationPrimitiveDataTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationPrimitiveDataType()
		 * @generated
		 */
		EClass APPLICATION_PRIMITIVE_DATA_TYPE = eINSTANCE.getApplicationPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataPrototypeImpl <em>Autosar Data Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAutosarDataPrototype()
		 * @generated
		 */
		EClass AUTOSAR_DATA_PROTOTYPE = eINSTANCE.getAutosarDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTOSAR_DATA_PROTOTYPE___GET_SW_ADDR_METHOD = eINSTANCE.getAutosarDataPrototype__GetSwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Get Sw Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTOSAR_DATA_PROTOTYPE___GET_SW_ALIGNMENT = eINSTANCE.getAutosarDataPrototype__GetSwAlignment();

		/**
		 * The meta object literal for the '<em><b>Get Application Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTOSAR_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE = eINSTANCE.getAutosarDataPrototype__GetApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTOSAR_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE = eINSTANCE.getAutosarDataPrototype__GetImplementationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl <em>Data Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataPrototype()
		 * @generated
		 */
		EClass DATA_PROTOTYPE = eINSTANCE.getDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Sw Data Def Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROTOTYPE__SW_DATA_DEF_PROPS = eINSTANCE.getDataPrototype_SwDataDefProps();

		/**
		 * The meta object literal for the '<em><b>Sw Addr Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROTOTYPE__SW_ADDR_METHOD = eINSTANCE.getDataPrototype_SwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Sw Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROTOTYPE__SW_ALIGNMENT = eINSTANCE.getDataPrototype_SwAlignment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROTOTYPE__TYPE = eINSTANCE.getDataPrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Get Sw Impl Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROTOTYPE___GET_SW_IMPL_POLICY = eINSTANCE.getDataPrototype__GetSwImplPolicy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl <em>Exclusive Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getExclusiveArea()
		 * @generated
		 */
		EClass EXCLUSIVE_AREA = eINSTANCE.getExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_AREA__PARENT = eINSTANCE.getExclusiveArea_Parent();

		/**
		 * The meta object literal for the '<em><b>Enter Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY = eINSTANCE.getExclusiveArea_EnterExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Swc Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_AREA__SWC_CONFIG = eINSTANCE.getExclusiveArea_SwcConfig();

		/**
		 * The meta object literal for the '<em><b>Bsw Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_AREA__BSW_CONFIG = eINSTANCE.getExclusiveArea_BswConfig();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NumericalValueSpecificationImpl <em>Numerical Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NumericalValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNumericalValueSpecification()
		 * @generated
		 */
		EClass NUMERICAL_VALUE_SPECIFICATION = eINSTANCE.getNumericalValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_VALUE_SPECIFICATION__VALUE = eINSTANCE.getNumericalValueSpecification_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TextValueSpecificationImpl <em>Text Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.TextValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTextValueSpecification()
		 * @generated
		 */
		EClass TEXT_VALUE_SPECIFICATION = eINSTANCE.getTextValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE_SPECIFICATION__VALUE = eINSTANCE.getTextValueSpecification_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantReferenceImpl <em>Constant Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantReferenceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getConstantReference()
		 * @generated
		 */
		EClass CONSTANT_REFERENCE = eINSTANCE.getConstantReference();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_REFERENCE__CONSTANT = eINSTANCE.getConstantReference_Constant();

		/**
		 * The meta object literal for the '<em><b>Get End Value Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTANT_REFERENCE___GET_END_VALUE_SPEC = eINSTANCE.getConstantReference__GetEndValueSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferenceValueSpecificationImpl <em>Reference Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ReferenceValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getReferenceValueSpecification()
		 * @generated
		 */
		EClass REFERENCE_VALUE_SPECIFICATION = eINSTANCE.getReferenceValueSpecification();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArrayValueSpecificationImpl <em>Array Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArrayValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArrayValueSpecification()
		 * @generated
		 */
		EClass ARRAY_VALUE_SPECIFICATION = eINSTANCE.getArrayValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE_SPECIFICATION__ELEMENT = eINSTANCE.getArrayValueSpecification_Element();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RecordValueSpecificationImpl <em>Record Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RecordValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRecordValueSpecification()
		 * @generated
		 */
		EClass RECORD_VALUE_SPECIFICATION = eINSTANCE.getRecordValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_VALUE_SPECIFICATION__FIELD = eINSTANCE.getRecordValueSpecification_Field();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationValueSpecificationImpl <em>Application Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationValueSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationValueSpecification()
		 * @generated
		 */
		EClass APPLICATION_VALUE_SPECIFICATION = eINSTANCE.getApplicationValueSpecification();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantSpecificationImpl <em>Constant Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ConstantSpecificationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getConstantSpecification()
		 * @generated
		 */
		EClass CONSTANT_SPECIFICATION = eINSTANCE.getConstantSpecification();

		/**
		 * The meta object literal for the '<em><b>Value Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_SPECIFICATION__VALUE_SPEC = eINSTANCE.getConstantSpecification_ValueSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.OperationInvokedEventImpl <em>Operation Invoked Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.OperationInvokedEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getOperationInvokedEvent()
		 * @generated
		 */
		EClass OPERATION_INVOKED_EVENT = eINSTANCE.getOperationInvokedEvent();

		/**
		 * The meta object literal for the '<em><b>Operation Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INVOKED_EVENT__OPERATION_IREF = eINSTANCE.getOperationInvokedEvent_OperationIref();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INVOKED_EVENT__OPERATION = eINSTANCE.getOperationInvokedEvent_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl <em>POperation In Atomic Swc Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPOperationInAtomicSwcInstanceRef()
		 * @generated
		 */
		EClass POPERATION_IN_ATOMIC_SWC_INSTANCE_REF = eINSTANCE.getPOperationInAtomicSwcInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context PPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT = eINSTANCE.getPOperationInAtomicSwcInstanceRef_ContextPPort();

		/**
		 * The meta object literal for the '<em><b>Target Provided Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION = eINSTANCE.getPOperationInAtomicSwcInstanceRef_TargetProvidedOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerInterfaceImpl <em>Client Server Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerInterfaceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getClientServerInterface()
		 * @generated
		 */
		EClass CLIENT_SERVER_INTERFACE = eINSTANCE.getClientServerInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_INTERFACE__OPERATION = eINSTANCE.getClientServerInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Possible Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_INTERFACE__POSSIBLE_ERROR = eINSTANCE.getClientServerInterface_PossibleError();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerOperationImpl <em>Client Server Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ClientServerOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getClientServerOperation()
		 * @generated
		 */
		EClass CLIENT_SERVER_OPERATION = eINSTANCE.getClientServerOperation();

		/**
		 * The meta object literal for the '<em><b>Possible Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_OPERATION__POSSIBLE_ERROR = eINSTANCE.getClientServerOperation_PossibleError();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_OPERATION__ARGUMENT = eINSTANCE.getClientServerOperation_Argument();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationErrorImpl <em>Application Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ApplicationErrorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getApplicationError()
		 * @generated
		 */
		EClass APPLICATION_ERROR = eINSTANCE.getApplicationError();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_ERROR__ERROR_CODE = eINSTANCE.getApplicationError_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ERROR__PARENT = eINSTANCE.getApplicationError_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArgumentDataPrototypeImpl <em>Argument Data Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ArgumentDataPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArgumentDataPrototype()
		 * @generated
		 */
		EClass ARGUMENT_DATA_PROTOTYPE = eINSTANCE.getArgumentDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DATA_PROTOTYPE__DIRECTION = eINSTANCE.getArgumentDataPrototype_Direction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataFilterImpl <em>Data Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataFilterImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataFilter()
		 * @generated
		 */
		EClass DATA_FILTER = eINSTANCE.getDataFilter();

		/**
		 * The meta object literal for the '<em><b>Data Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__DATA_FILTER_TYPE = eINSTANCE.getDataFilter_DataFilterType();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__MASK = eINSTANCE.getDataFilter_Mask();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__MAX = eINSTANCE.getDataFilter_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__MIN = eINSTANCE.getDataFilter_Min();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__OFFSET = eINSTANCE.getDataFilter_Offset();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__PERIOD = eINSTANCE.getDataFilter_Period();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILTER__X = eINSTANCE.getDataFilter_X();

		/**
		 * The meta object literal for the '<em><b>Is Filter Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FILTER___IS_FILTER_ENABLED = eINSTANCE.getDataFilter__IsFilterEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FILTER___IS_COMPATIBLE_WITH__DATAFILTER = eINSTANCE.getDataFilter__IsCompatibleWith__DataFilter();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedReceiverComSpecImpl <em>Queued Receiver Com Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.QueuedReceiverComSpecImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getQueuedReceiverComSpec()
		 * @generated
		 */
		EClass QUEUED_RECEIVER_COM_SPEC = eINSTANCE.getQueuedReceiverComSpec();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUED_RECEIVER_COM_SPEC__QUEUE_LENGTH = eINSTANCE.getQueuedReceiverComSpec_QueueLength();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InvalidationPolicyImpl <em>Invalidation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InvalidationPolicyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInvalidationPolicy()
		 * @generated
		 */
		EClass INVALIDATION_POLICY = eINSTANCE.getInvalidationPolicy();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATION_POLICY__DATA_ELEMENT = eINSTANCE.getInvalidationPolicy_DataElement();

		/**
		 * The meta object literal for the '<em><b>Handle Invalid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION_POLICY__HANDLE_INVALID = eINSTANCE.getInvalidationPolicy_HandleInvalid();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVALIDATION_POLICY___IS_INVALIDATION_ENABLED = eINSTANCE.getInvalidationPolicy__IsInvalidationEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Keep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVALIDATION_POLICY___IS_INVALIDATION_KEEP = eINSTANCE.getInvalidationPolicy__IsInvalidationKeep();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Replace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVALIDATION_POLICY___IS_INVALIDATION_REPLACE = eINSTANCE.getInvalidationPolicy__IsInvalidationReplace();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl <em>Port Api Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortApiOptionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortApiOption()
		 * @generated
		 */
		EClass PORT_API_OPTION = eINSTANCE.getPortApiOption();

		/**
		 * The meta object literal for the '<em><b>Port Arg Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_API_OPTION__PORT_ARG_VALUE = eINSTANCE.getPortApiOption_PortArgValue();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_API_OPTION__PORT = eINSTANCE.getPortApiOption_Port();

		/**
		 * The meta object literal for the '<em><b>Enable Take Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_API_OPTION__ENABLE_TAKE_ADDRESS = eINSTANCE.getPortApiOption_EnableTakeAddress();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortDefinedArgumentValueImpl <em>Port Defined Argument Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortDefinedArgumentValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortDefinedArgumentValue()
		 * @generated
		 */
		EClass PORT_DEFINED_ARGUMENT_VALUE = eINSTANCE.getPortDefinedArgumentValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINED_ARGUMENT_VALUE__VALUE = eINSTANCE.getPortDefinedArgumentValue_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINED_ARGUMENT_VALUE__VALUE_TYPE = eINSTANCE.getPortDefinedArgumentValue_ValueType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINED_ARGUMENT_VALUE__PARENT = eINSTANCE.getPortDefinedArgumentValue_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IncludedDataTypeSetImpl <em>Included Data Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IncludedDataTypeSetImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIncludedDataTypeSet()
		 * @generated
		 */
		EClass INCLUDED_DATA_TYPE_SET = eINSTANCE.getIncludedDataTypeSet();

		/**
		 * The meta object literal for the '<em><b>Literal Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX = eINSTANCE.getIncludedDataTypeSet_LiteralPrefix();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_DATA_TYPE_SET__DATA_TYPE = eINSTANCE.getIncludedDataTypeSet_DataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Root Software Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ROOT_SOFTWARE_COMPOSITION = eINSTANCE.getSystem_RootSoftwareComposition();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MAPPING = eINSTANCE.getSystem_Mapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RootSwCompositionPrototypeImpl <em>Root Sw Composition Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RootSwCompositionPrototypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRootSwCompositionPrototype()
		 * @generated
		 */
		EClass ROOT_SW_COMPOSITION_PROTOTYPE = eINSTANCE.getRootSwCompositionPrototype();

		/**
		 * The meta object literal for the '<em><b>Software Composition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SW_COMPOSITION_PROTOTYPE__SOFTWARE_COMPOSITION = eINSTANCE.getRootSwCompositionPrototype_SoftwareComposition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemMappingImpl <em>System Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemMapping()
		 * @generated
		 */
		EClass SYSTEM_MAPPING = eINSTANCE.getSystemMapping();

		/**
		 * The meta object literal for the '<em><b>Data Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MAPPING__DATA_MAPPING = eINSTANCE.getSystemMapping_DataMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataMapping()
		 * @generated
		 */
		EClass DATA_MAPPING = eINSTANCE.getDataMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalImpl <em>System Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemSignal()
		 * @generated
		 */
		EClass SYSTEM_SIGNAL = eINSTANCE.getSystemSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalImpl <em>ISignal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignal()
		 * @generated
		 */
		EClass ISIGNAL = eINSTANCE.getISignal();

		/**
		 * The meta object literal for the '<em><b>System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL__SYSTEM_SIGNAL = eINSTANCE.getISignal_SystemSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalIPduImpl <em>ISignal IPdu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalIPduImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalIPdu()
		 * @generated
		 */
		EClass ISIGNAL_IPDU = eINSTANCE.getISignalIPdu();

		/**
		 * The meta object literal for the '<em><b>ISignal To Pdu Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL_IPDU__ISIGNAL_TO_PDU_MAPPING = eINSTANCE.getISignalIPdu_ISignalToPduMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl <em>ISignal To IPdu Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalToIPduMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalToIPduMapping()
		 * @generated
		 */
		EClass ISIGNAL_TO_IPDU_MAPPING = eINSTANCE.getISignalToIPduMapping();

		/**
		 * The meta object literal for the '<em><b>ISignal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL_TO_IPDU_MAPPING__ISIGNAL = eINSTANCE.getISignalToIPduMapping_ISignal();

		/**
		 * The meta object literal for the '<em><b>ISignal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP = eINSTANCE.getISignalToIPduMapping_ISignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalMappingImpl <em>Sender Receiver To Signal Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverToSignalMapping()
		 * @generated
		 */
		EClass SENDER_RECEIVER_TO_SIGNAL_MAPPING = eINSTANCE.getSenderReceiverToSignalMapping();

		/**
		 * The meta object literal for the '<em><b>System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_MAPPING__SYSTEM_SIGNAL = eINSTANCE.getSenderReceiverToSignalMapping_SystemSignal();

		/**
		 * The meta object literal for the '<em><b>Data Element Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT_IREF = eINSTANCE.getSenderReceiverToSignalMapping_DataElementIref();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT = eINSTANCE.getSenderReceiverToSignalMapping_DataElement();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl <em>Sender Receiver To Signal Group Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderReceiverToSignalGroupMapping()
		 * @generated
		 */
		EClass SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING = eINSTANCE.getSenderReceiverToSignalGroupMapping();

		/**
		 * The meta object literal for the '<em><b>Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP = eINSTANCE.getSenderReceiverToSignalGroupMapping_SignalGroup();

		/**
		 * The meta object literal for the '<em><b>Data Element Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF = eINSTANCE.getSenderReceiverToSignalGroupMapping_DataElementIref();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT = eINSTANCE.getSenderReceiverToSignalGroupMapping_DataElement();

		/**
		 * The meta object literal for the '<em><b>Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING = eINSTANCE.getSenderReceiverToSignalGroupMapping_TypeMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl <em>Variable Data Prototype In System Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVariableDataPrototypeInSystemInstanceRef()
		 * @generated
		 */
		EClass VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF = eINSTANCE.getVariableDataPrototypeInSystemInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT = eINSTANCE.getVariableDataPrototypeInSystemInstanceRef_ContextComponent();

		/**
		 * The meta object literal for the '<em><b>Context Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT = eINSTANCE.getVariableDataPrototypeInSystemInstanceRef_ContextPort();

		/**
		 * The meta object literal for the '<em><b>Target Data Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE = eINSTANCE.getVariableDataPrototypeInSystemInstanceRef_TargetDataPrototype();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl <em>Ecuc Value Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucValueCollection()
		 * @generated
		 */
		EClass ECUC_VALUE_COLLECTION = eINSTANCE.getEcucValueCollection();

		/**
		 * The meta object literal for the '<em><b>Ecuc Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_VALUE_COLLECTION__ECUC_VALUE = eINSTANCE.getEcucValueCollection_EcucValue();

		/**
		 * The meta object literal for the '<em><b>Ecu Extract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_VALUE_COLLECTION__ECU_EXTRACT = eINSTANCE.getEcucValueCollection_EcuExtract();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServerCallPointImpl <em>Server Call Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServerCallPointImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServerCallPoint()
		 * @generated
		 */
		EClass SERVER_CALL_POINT = eINSTANCE.getServerCallPoint();

		/**
		 * The meta object literal for the '<em><b>Operation Iref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CALL_POINT__OPERATION_IREF = eINSTANCE.getServerCallPoint_OperationIref();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CALL_POINT__OPERATION = eINSTANCE.getServerCallPoint_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SynchronousServerCallPointImpl <em>Synchronous Server Call Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SynchronousServerCallPointImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSynchronousServerCallPoint()
		 * @generated
		 */
		EClass SYNCHRONOUS_SERVER_CALL_POINT = eINSTANCE.getSynchronousServerCallPoint();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef <em>IInstance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIInstanceRef()
		 * @generated
		 */
		EClass IINSTANCE_REF = eINSTANCE.getIInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Instance Ref</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IINSTANCE_REF__INSTANCE_REF = eINSTANCE.getIInstanceRef_InstanceRef();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl <em>ROperation In Atomic Swc Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getROperationInAtomicSwcInstanceRef()
		 * @generated
		 */
		EClass ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF = eINSTANCE.getROperationInAtomicSwcInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context RPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT = eINSTANCE.getROperationInAtomicSwcInstanceRef_ContextRPort();

		/**
		 * The meta object literal for the '<em><b>Target Required Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION = eINSTANCE.getROperationInAtomicSwcInstanceRef_TargetRequiredOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeInCompositionInstanceRefImpl <em>Port Prototype In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortPrototypeInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortPrototypeInCompositionInstanceRef()
		 * @generated
		 */
		EClass PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getPortPrototypeInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = eINSTANCE.getPortPrototypeInCompositionInstanceRef_ContextComponent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl <em>Sw Addr Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwAddrMethod()
		 * @generated
		 */
		EClass SW_ADDR_METHOD = eINSTANCE.getSwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Memory Allocation Keyword Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY = eINSTANCE.getSwAddrMethod_MemoryAllocationKeywordPolicy();

		/**
		 * The meta object literal for the '<em><b>Section Initialization Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY = eINSTANCE.getSwAddrMethod_SectionInitializationPolicy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuMethodImpl <em>Compu Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuMethodImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuMethod()
		 * @generated
		 */
		EClass COMPU_METHOD = eINSTANCE.getCompuMethod();

		/**
		 * The meta object literal for the '<em><b>Compu Internal To Phys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPU_METHOD__COMPU_INTERNAL_TO_PHYS = eINSTANCE.getCompuMethod_CompuInternalToPhys();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrImpl <em>Data Constr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataConstr()
		 * @generated
		 */
		EClass DATA_CONSTR = eINSTANCE.getDataConstr();

		/**
		 * The meta object literal for the '<em><b>Data Constr Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONSTR__DATA_CONSTR_RULE = eINSTANCE.getDataConstr_DataConstrRule();

		/**
		 * The meta object literal for the '<em><b>Get Lower Limit Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CONSTR___GET_LOWER_LIMIT_VALUE = eINSTANCE.getDataConstr__GetLowerLimitValue();

		/**
		 * The meta object literal for the '<em><b>Get Upper Limit Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CONSTR___GET_UPPER_LIMIT_VALUE = eINSTANCE.getDataConstr__GetUpperLimitValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrRuleImpl <em>Data Constr Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataConstrRuleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataConstrRule()
		 * @generated
		 */
		EClass DATA_CONSTR_RULE = eINSTANCE.getDataConstrRule();

		/**
		 * The meta object literal for the '<em><b>Internal Constrs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONSTR_RULE__INTERNAL_CONSTRS = eINSTANCE.getDataConstrRule_InternalConstrs();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl <em>Internal Constrs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInternalConstrs()
		 * @generated
		 */
		EClass INTERNAL_CONSTRS = eINSTANCE.getInternalConstrs();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_CONSTRS__LOWER_LIMIT = eINSTANCE.getInternalConstrs_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_CONSTRS__UPPER_LIMIT = eINSTANCE.getInternalConstrs_UpperLimit();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuImpl <em>Compu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompu()
		 * @generated
		 */
		EClass COMPU = eINSTANCE.getCompu();

		/**
		 * The meta object literal for the '<em><b>Compu Scale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPU__COMPU_SCALE = eINSTANCE.getCompu_CompuScale();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.LimitImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__VALUE = eINSTANCE.getLimit_Value();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuScaleImpl <em>Compu Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuScaleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuScale()
		 * @generated
		 */
		EClass COMPU_SCALE = eINSTANCE.getCompuScale();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPU_SCALE__SYMBOL = eINSTANCE.getCompuScale_Symbol();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPU_SCALE__LOWER_LIMIT = eINSTANCE.getCompuScale_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Short Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPU_SCALE__SHORT_LABEL = eINSTANCE.getCompuScale_ShortLabel();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPU_SCALE__UPPER_LIMIT = eINSTANCE.getCompuScale_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Compu Const</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPU_SCALE__COMPU_CONST = eINSTANCE.getCompuScale_CompuConst();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuConstImpl <em>Compu Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.CompuConstImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCompuConst()
		 * @generated
		 */
		EClass COMPU_CONST = eINSTANCE.getCompuConst();

		/**
		 * The meta object literal for the '<em><b>Vt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPU_CONST__VT = eINSTANCE.getCompuConst_Vt();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AnyInstanceRefImpl <em>Any Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AnyInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAnyInstanceRef()
		 * @generated
		 */
		EClass ANY_INSTANCE_REF = eINSTANCE.getAnyInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_INSTANCE_REF__CONTEXT_ELEMENT = eINSTANCE.getAnyInstanceRef_ContextElement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_INSTANCE_REF__TARGET = eINSTANCE.getAnyInstanceRef_Target();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcuAbstractionSwComponentTypeImpl <em>Ecu Abstraction Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcuAbstractionSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcuAbstractionSwComponentType()
		 * @generated
		 */
		EClass ECU_ABSTRACTION_SW_COMPONENT_TYPE = eINSTANCE.getEcuAbstractionSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NvBlockSwComponentTypeImpl <em>Nv Block Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NvBlockSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNvBlockSwComponentType()
		 * @generated
		 */
		EClass NV_BLOCK_SW_COMPONENT_TYPE = eINSTANCE.getNvBlockSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SensorActuatorSwComponentTypeImpl <em>Sensor Actuator Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SensorActuatorSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSensorActuatorSwComponentType()
		 * @generated
		 */
		EClass SENSOR_ACTUATOR_SW_COMPONENT_TYPE = eINSTANCE.getSensorActuatorSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ComplexDeviceDriverSwComponentTypeImpl <em>Complex Device Driver Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ComplexDeviceDriverSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getComplexDeviceDriverSwComponentType()
		 * @generated
		 */
		EClass COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE = eINSTANCE.getComplexDeviceDriverSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceProxySwComponentTypeImpl <em>Service Proxy Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceProxySwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServiceProxySwComponentType()
		 * @generated
		 */
		EClass SERVICE_PROXY_SW_COMPONENT_TYPE = eINSTANCE.getServiceProxySwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceSwComponentTypeImpl <em>Service Sw Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ServiceSwComponentTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getServiceSwComponentType()
		 * @generated
		 */
		EClass SERVICE_SW_COMPONENT_TYPE = eINSTANCE.getServiceSwComponentType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInCompositionInstanceRefImpl <em>Port In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PortInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPortInCompositionInstanceRef()
		 * @generated
		 */
		EClass PORT_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getPortInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT = eINSTANCE.getPortInCompositionInstanceRef_ContextComponent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortInCompositionInstanceRefImpl <em>PPort In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.PPortInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPPortInCompositionInstanceRef()
		 * @generated
		 */
		EClass PPORT_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getPPortInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Target PPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT = eINSTANCE.getPPortInCompositionInstanceRef_TargetPPort();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortInCompositionInstanceRefImpl <em>RPort In Composition Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortInCompositionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRPortInCompositionInstanceRef()
		 * @generated
		 */
		EClass RPORT_IN_COMPOSITION_INSTANCE_REF = eINSTANCE.getRPortInCompositionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Target RPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT = eINSTANCE.getRPortInCompositionInstanceRef_TargetRPort();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior <em>Internal Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInternalBehavior()
		 * @generated
		 */
		EClass INTERNAL_BEHAVIOR = eINSTANCE.getInternalBehavior();

		/**
		 * The meta object literal for the '<em><b>Data Type Mapping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING = eINSTANCE.getInternalBehavior_DataTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Exclusive Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_BEHAVIOR__EXCLUSIVE_AREA = eINSTANCE.getInternalBehavior_ExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Get Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_BEHAVIOR___GET_PARENT = eINSTANCE.getInternalBehavior__GetParent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl <em>Swc Bsw Runnable Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcBswRunnableMapping()
		 * @generated
		 */
		EClass SWC_BSW_RUNNABLE_MAPPING = eINSTANCE.getSwcBswRunnableMapping();

		/**
		 * The meta object literal for the '<em><b>Swc Runnable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE = eINSTANCE.getSwcBswRunnableMapping_SwcRunnable();

		/**
		 * The meta object literal for the '<em><b>Bsw Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY = eINSTANCE.getSwcBswRunnableMapping_BswEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl <em>Swc Bsw Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwcBswMapping()
		 * @generated
		 */
		EClass SWC_BSW_MAPPING = eINSTANCE.getSwcBswMapping();

		/**
		 * The meta object literal for the '<em><b>Runnable Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_BSW_MAPPING__RUNNABLE_MAPPING = eINSTANCE.getSwcBswMapping_RunnableMapping();

		/**
		 * The meta object literal for the '<em><b>Swc Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_BSW_MAPPING__SWC_BEHAVIOR = eINSTANCE.getSwcBswMapping_SwcBehavior();

		/**
		 * The meta object literal for the '<em><b>Bsw Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_BSW_MAPPING__BSW_BEHAVIOR = eINSTANCE.getSwcBswMapping_BswBehavior();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl <em>Bsw Internal Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswInternalBehavior()
		 * @generated
		 */
		EClass BSW_INTERNAL_BEHAVIOR = eINSTANCE.getBswInternalBehavior();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__PARENT = eINSTANCE.getBswInternalBehavior_Parent();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__ENTITY = eINSTANCE.getBswInternalBehavior_Entity();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__EVENT = eINSTANCE.getBswInternalBehavior_Event();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION = eINSTANCE.getBswInternalBehavior_Implementation();

		/**
		 * The meta object literal for the '<em><b>Mode Sender Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY = eINSTANCE.getBswInternalBehavior_ModeSenderPolicy();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY = eINSTANCE.getBswInternalBehavior_BswSchedulableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl <em>Bsw Mode Sender Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModeSenderPolicy()
		 * @generated
		 */
		EClass BSW_MODE_SENDER_POLICY = eINSTANCE.getBswModeSenderPolicy();

		/**
		 * The meta object literal for the '<em><b>Provided Mode Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP = eINSTANCE.getBswModeSenderPolicy_ProvidedModeGroup();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_MODE_SENDER_POLICY__QUEUE_LENGTH = eINSTANCE.getBswModeSenderPolicy_QueueLength();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Swc Bsw Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__SWC_BSW_MAPPING = eINSTANCE.getImplementation_SwcBswMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswImplementationImpl <em>Bsw Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswImplementation()
		 * @generated
		 */
		EClass BSW_IMPLEMENTATION = eINSTANCE.getBswImplementation();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_IMPLEMENTATION__BEHAVIOR = eINSTANCE.getBswImplementation_Behavior();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl <em>Bsw Module Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleDescription()
		 * @generated
		 */
		EClass BSW_MODULE_DESCRIPTION = eINSTANCE.getBswModuleDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR = eINSTANCE.getBswModuleDescription_InternalBehavior();

		/**
		 * The meta object literal for the '<em><b>Provided Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY = eINSTANCE.getBswModuleDescription_ProvidedEntry();

		/**
		 * The meta object literal for the '<em><b>Provided Mode Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP = eINSTANCE.getBswModuleDescription_ProvidedModeGroup();

		/**
		 * The meta object literal for the '<em><b>Required Mode Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP = eINSTANCE.getBswModuleDescription_RequiredModeGroup();

		/**
		 * The meta object literal for the '<em><b>Get Enable Internal Behavior</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR = eINSTANCE.getBswModuleDescription__GetEnableInternalBehavior();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl <em>Bsw Module Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntryImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleEntry()
		 * @generated
		 */
		EClass BSW_MODULE_ENTRY = eINSTANCE.getBswModuleEntry();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_MODULE_ENTRY__SERVICE_ID = eINSTANCE.getBswModuleEntry_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Call Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_MODULE_ENTRY__CALL_TYPE = eINSTANCE.getBswModuleEntry_CallType();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_MODULE_ENTRY__EXECUTION_CONTEXT = eINSTANCE.getBswModuleEntry_ExecutionContext();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl <em>Bsw Module Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModuleEntity()
		 * @generated
		 */
		EClass BSW_MODULE_ENTITY = eINSTANCE.getBswModuleEntity();

		/**
		 * The meta object literal for the '<em><b>Implemented Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY = eINSTANCE.getBswModuleEntity_ImplementedEntry();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_ENTITY__PARENT = eINSTANCE.getBswModuleEntity_Parent();

		/**
		 * The meta object literal for the '<em><b>Accessed Mode Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP = eINSTANCE.getBswModuleEntity_AccessedModeGroup();

		/**
		 * The meta object literal for the '<em><b>Managed Mode Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODULE_ENTITY__MANAGED_MODE_GROUP = eINSTANCE.getBswModuleEntity_ManagedModeGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswSchedulableEntityImpl <em>Bsw Schedulable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswSchedulableEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswSchedulableEntity()
		 * @generated
		 */
		EClass BSW_SCHEDULABLE_ENTITY = eINSTANCE.getBswSchedulableEntity();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_SCHEDULABLE_ENTITY__EVENT = eINSTANCE.getBswSchedulableEntity_Event();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl <em>Bsw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswEvent()
		 * @generated
		 */
		EClass BSW_EVENT = eINSTANCE.getBswEvent();

		/**
		 * The meta object literal for the '<em><b>Starts On Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_EVENT__STARTS_ON_EVENT = eINSTANCE.getBswEvent_StartsOnEvent();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_EVENT__CONFIG = eINSTANCE.getBswEvent_Config();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_EVENT__PARENT = eINSTANCE.getBswEvent_Parent();

		/**
		 * The meta object literal for the '<em><b>Disabled In Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_EVENT__DISABLED_IN_MODE = eINSTANCE.getBswEvent_DisabledInMode();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSwitchEventImpl <em>Bsw Mode Switch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSwitchEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswModeSwitchEvent()
		 * @generated
		 */
		EClass BSW_MODE_SWITCH_EVENT = eINSTANCE.getBswModeSwitchEvent();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_MODE_SWITCH_EVENT__ACTIVATION = eINSTANCE.getBswModeSwitchEvent_Activation();

		/**
		 * The meta object literal for the '<em><b>Mode Iref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MODE_SWITCH_EVENT__MODE_IREF = eINSTANCE.getBswModeSwitchEvent_ModeIref();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeInBswModuleDescriptionInstanceRefImpl <em>Mode In Bsw Module Description Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ModeInBswModuleDescriptionInstanceRefImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeInBswModuleDescriptionInstanceRef()
		 * @generated
		 */
		EClass MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF = eINSTANCE.getModeInBswModuleDescriptionInstanceRef();

		/**
		 * The meta object literal for the '<em><b>Context Mode Declaration Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP = eINSTANCE.getModeInBswModuleDescriptionInstanceRef_ContextModeDeclarationGroup();

		/**
		 * The meta object literal for the '<em><b>Target Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE = eINSTANCE.getModeInBswModuleDescriptionInstanceRef_TargetMode();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind <em>Mode Activation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getModeActivationKind()
		 * @generated
		 */
		EEnum MODE_ACTIVATION_KIND = eINSTANCE.getModeActivationKind();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswTimingEventImpl <em>Bsw Timing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswTimingEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswTimingEvent()
		 * @generated
		 */
		EClass BSW_TIMING_EVENT = eINSTANCE.getBswTimingEvent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_TIMING_EVENT__PERIOD = eINSTANCE.getBswTimingEvent_Period();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswBackgroundEventImpl <em>Bsw Background Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswBackgroundEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswBackgroundEvent()
		 * @generated
		 */
		EClass BSW_BACKGROUND_EVENT = eINSTANCE.getBswBackgroundEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswCalledEntityImpl <em>Bsw Called Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswCalledEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswCalledEntity()
		 * @generated
		 */
		EClass BSW_CALLED_ENTITY = eINSTANCE.getBswCalledEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInterruptEntityImpl <em>Bsw Interrupt Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInterruptEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswInterruptEntity()
		 * @generated
		 */
		EClass BSW_INTERRUPT_ENTITY = eINSTANCE.getBswInterruptEntity();

		/**
		 * The meta object literal for the '<em><b>Interrupt Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSW_INTERRUPT_ENTITY__INTERRUPT_SOURCE = eINSTANCE.getBswInterruptEntity_InterruptSource();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeElementImpl <em>Implementation Data Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ImplementationDataTypeElementImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getImplementationDataTypeElement()
		 * @generated
		 */
		EClass IMPLEMENTATION_DATA_TYPE_ELEMENT = eINSTANCE.getImplementationDataTypeElement();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE = eINSTANCE.getImplementationDataTypeElement_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Array Size Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE_SEMANTICS = eINSTANCE.getImplementationDataTypeElement_ArraySizeSemantics();

		/**
		 * The meta object literal for the '<em><b>Sub Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT = eINSTANCE.getImplementationDataTypeElement_SubElement();

		/**
		 * The meta object literal for the '<em><b>Sw Data Def Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS = eINSTANCE.getImplementationDataTypeElement_SwDataDefProps();

		/**
		 * The meta object literal for the '<em><b>Is Redefinition Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE_ELEMENT___IS_REDEFINITION_TYPE = eINSTANCE.getImplementationDataTypeElement__IsRedefinitionType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalGroupImpl <em>System Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SystemSignalGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSystemSignalGroup()
		 * @generated
		 */
		EClass SYSTEM_SIGNAL_GROUP = eINSTANCE.getSystemSignalGroup();

		/**
		 * The meta object literal for the '<em><b>System Signal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SIGNAL_GROUP__SYSTEM_SIGNAL = eINSTANCE.getSystemSignalGroup_SystemSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalGroupImpl <em>ISignal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ISignalGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getISignalGroup()
		 * @generated
		 */
		EClass ISIGNAL_GROUP = eINSTANCE.getISignalGroup();

		/**
		 * The meta object literal for the '<em><b>System Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL_GROUP__SYSTEM_SIGNAL_GROUP = eINSTANCE.getISignalGroup_SystemSignalGroup();

		/**
		 * The meta object literal for the '<em><b>ISignal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISIGNAL_GROUP__ISIGNAL = eINSTANCE.getISignalGroup_ISignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecCompositeTypeMappingImpl <em>Sender Rec Composite Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecCompositeTypeMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecCompositeTypeMapping()
		 * @generated
		 */
		EClass SENDER_REC_COMPOSITE_TYPE_MAPPING = eINSTANCE.getSenderRecCompositeTypeMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordTypeMappingImpl <em>Sender Rec Record Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordTypeMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecRecordTypeMapping()
		 * @generated
		 */
		EClass SENDER_REC_RECORD_TYPE_MAPPING = eINSTANCE.getSenderRecRecordTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Record Element Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_RECORD_TYPE_MAPPING__RECORD_ELEMENT_MAPPING = eINSTANCE.getSenderRecRecordTypeMapping_RecordElementMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl <em>Sender Rec Record Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecRecordElementMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecRecordElementMapping()
		 * @generated
		 */
		EClass SENDER_REC_RECORD_ELEMENT_MAPPING = eINSTANCE.getSenderRecRecordElementMapping();

		/**
		 * The meta object literal for the '<em><b>Implementation Record Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT = eINSTANCE.getSenderRecRecordElementMapping_ImplementationRecordElement();

		/**
		 * The meta object literal for the '<em><b>Complex Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING = eINSTANCE.getSenderRecRecordElementMapping_ComplexTypeMapping();

		/**
		 * The meta object literal for the '<em><b>System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL = eINSTANCE.getSenderRecRecordElementMapping_SystemSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayTypeMappingImpl <em>Sender Rec Array Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayTypeMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecArrayTypeMapping()
		 * @generated
		 */
		EClass SENDER_REC_ARRAY_TYPE_MAPPING = eINSTANCE.getSenderRecArrayTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Array Element Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_ARRAY_TYPE_MAPPING__ARRAY_ELEMENT_MAPPING = eINSTANCE.getSenderRecArrayTypeMapping_ArrayElementMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IndexedArrayElementImpl <em>Indexed Array Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.IndexedArrayElementImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIndexedArrayElement()
		 * @generated
		 */
		EClass INDEXED_ARRAY_ELEMENT = eINSTANCE.getIndexedArrayElement();

		/**
		 * The meta object literal for the '<em><b>Implementation Array Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXED_ARRAY_ELEMENT__IMPLEMENTATION_ARRAY_ELEMENT = eINSTANCE.getIndexedArrayElement_ImplementationArrayElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXED_ARRAY_ELEMENT__INDEX = eINSTANCE.getIndexedArrayElement_Index();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl <em>Sender Rec Array Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSenderRecArrayElementMapping()
		 * @generated
		 */
		EClass SENDER_REC_ARRAY_ELEMENT_MAPPING = eINSTANCE.getSenderRecArrayElementMapping();

		/**
		 * The meta object literal for the '<em><b>Indexed Array Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT = eINSTANCE.getSenderRecArrayElementMapping_IndexedArrayElement();

		/**
		 * The meta object literal for the '<em><b>Complex Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING = eINSTANCE.getSenderRecArrayElementMapping_ComplexTypeMapping();

		/**
		 * The meta object literal for the '<em><b>System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL = eINSTANCE.getSenderRecArrayElementMapping_SystemSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl <em>Sw Pointer Target Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwPointerTargetProps()
		 * @generated
		 */
		EClass SW_POINTER_TARGET_PROPS = eINSTANCE.getSwPointerTargetProps();

		/**
		 * The meta object literal for the '<em><b>Target Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_POINTER_TARGET_PROPS__TARGET_CATEGORY = eINSTANCE.getSwPointerTargetProps_TargetCategory();

		/**
		 * The meta object literal for the '<em><b>Sw Data Def Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS = eINSTANCE.getSwPointerTargetProps_SwDataDefProps();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum <em>Argument Direction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArgumentDirectionEnum()
		 * @generated
		 */
		EEnum ARGUMENT_DIRECTION_ENUM = eINSTANCE.getArgumentDirectionEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum <em>Data Filter Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getDataFilterTypeEnum()
		 * @generated
		 */
		EEnum DATA_FILTER_TYPE_ENUM = eINSTANCE.getDataFilterTypeEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum <em>Handle Invalid Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getHandleInvalidEnum()
		 * @generated
		 */
		EEnum HANDLE_INVALID_ENUM = eINSTANCE.getHandleInvalidEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum <em>Sw Impl Policy Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSwImplPolicyEnum()
		 * @generated
		 */
		EEnum SW_IMPL_POLICY_ENUM = eINSTANCE.getSwImplPolicyEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType <em>Memory Allocation Keyword Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getMemoryAllocationKeywordPolicyType()
		 * @generated
		 */
		EEnum MEMORY_ALLOCATION_KEYWORD_POLICY_TYPE = eINSTANCE.getMemoryAllocationKeywordPolicyType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum <em>Ecuc Configuration Variant Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getEcucConfigurationVariantEnum()
		 * @generated
		 */
		EEnum ECUC_CONFIGURATION_VARIANT_ENUM = eINSTANCE.getEcucConfigurationVariantEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum <em>Bsw Call Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswCallTypeEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswCallTypeEnum()
		 * @generated
		 */
		EEnum BSW_CALL_TYPE_ENUM = eINSTANCE.getBswCallTypeEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum <em>Bsw Execution Context Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswExecutionContextEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBswExecutionContextEnum()
		 * @generated
		 */
		EEnum BSW_EXECUTION_CONTEXT_ENUM = eINSTANCE.getBswExecutionContextEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum <em>Array Size Semantics Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArraySizeSemanticsEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getArraySizeSemanticsEnum()
		 * @generated
		 */
		EEnum ARRAY_SIZE_SEMANTICS_ENUM = eINSTANCE.getArraySizeSemanticsEnum();

		/**
		 * The meta object literal for the '<em>Numerical</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNumerical()
		 * @generated
		 */
		EDataType NUMERICAL = eINSTANCE.getNumerical();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Unlimited Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getUnlimitedInteger()
		 * @generated
		 */
		EDataType UNLIMITED_INTEGER = eINSTANCE.getUnlimitedInteger();

		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '<em>Time Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getTimeValue()
		 * @generated
		 */
		EDataType TIME_VALUE = eINSTANCE.getTimeValue();

		/**
		 * The meta object literal for the '<em>Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRef()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em>CIdentifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCIdentifier()
		 * @generated
		 */
		EDataType CIDENTIFIER = eINSTANCE.getCIdentifier();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Verbatim String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getVerbatimString()
		 * @generated
		 */
		EDataType VERBATIM_STRING = eINSTANCE.getVerbatimString();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Native Declaration String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getNativeDeclarationString()
		 * @generated
		 */
		EDataType NATIVE_DECLARATION_STRING = eINSTANCE.getNativeDeclarationString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Section Initialization Policy Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getSectionInitializationPolicyType()
		 * @generated
		 */
		EDataType SECTION_INITIALIZATION_POLICY_TYPE = eINSTANCE.getSectionInitializationPolicyType();

		/**
		 * The meta object literal for the '<em>Category String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getCategoryString()
		 * @generated
		 */
		EDataType CATEGORY_STRING = eINSTANCE.getCategoryString();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Base Type Encoding String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getBaseTypeEncodingString()
		 * @generated
		 */
		EDataType BASE_TYPE_ENCODING_STRING = eINSTANCE.getBaseTypeEncodingString();

		/**
		 * The meta object literal for the '<em>Revision Label String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getRevisionLabelString()
		 * @generated
		 */
		EDataType REVISION_LABEL_STRING = eINSTANCE.getRevisionLabelString();

		/**
		 * The meta object literal for the '<em>Alignment Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl#getAlignmentType()
		 * @generated
		 */
		EDataType ALIGNMENT_TYPE = eINSTANCE.getAlignmentType();

	}

} //M2Package
