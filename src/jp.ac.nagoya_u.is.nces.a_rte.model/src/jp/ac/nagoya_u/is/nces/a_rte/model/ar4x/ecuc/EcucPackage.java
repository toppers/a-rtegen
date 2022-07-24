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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EcucPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecuc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/ar4x/ecuc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecuc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcucPackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucObjectImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucObject()
	 * @generated
	 */
	int ECUC_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucReferrableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucReferrable()
	 * @generated
	 */
	int ECUC_REFERRABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE__ID = ECUC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE__SHORT_NAME = ECUC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE__REFERENCE = ECUC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE__SOURCE = ECUC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE_FEATURE_COUNT = ECUC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_REFERRABLE_OPERATION_COUNT = ECUC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucModuleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucModule()
	 * @generated
	 */
	int ECUC_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE__ID = ECUC_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE__SHORT_NAME = ECUC_REFERRABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE__REFERENCE = ECUC_REFERRABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE__SOURCE = ECUC_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Reference Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE__REFERENCE_BASE = ECUC_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_FEATURE_COUNT = ECUC_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_MODULE_OPERATION_COUNT = ECUC_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucContainerImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucContainer()
	 * @generated
	 */
	int ECUC_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER__ID = ECUC_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER__SHORT_NAME = ECUC_REFERRABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER__REFERENCE = ECUC_REFERRABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER__SOURCE = ECUC_REFERRABLE__SOURCE;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_FEATURE_COUNT = ECUC_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_CONTAINER_OPERATION_COUNT = ECUC_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl <em>Rte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRte()
	 * @generated
	 */
	int RTE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__ID = ECUC_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SHORT_NAME = ECUC_MODULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__REFERENCE = ECUC_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SOURCE = ECUC_MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Reference Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__REFERENCE_BASE = ECUC_MODULE__REFERENCE_BASE;

	/**
	 * The feature id for the '<em><b>Rte Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_GENERATION = ECUC_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Bsw General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_BSW_GENERAL = ECUC_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Sw Component Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_SW_COMPONENT_INSTANCE = ECUC_MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Os Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_OS_INTERACTION = ECUC_MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rte Initialization Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_INITIALIZATION_BEHAVIOR = ECUC_MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rte Bsw Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_BSW_MODULE_INSTANCE = ECUC_MODULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_FEATURE_COUNT = ECUC_MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OPERATION_COUNT = ECUC_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteGenerationImpl <em>Rte Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteGenerationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteGeneration()
	 * @generated
	 */
	int RTE_GENERATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The number of structural features of the '<em>Rte Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_GENERATION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswGeneralImpl <em>Rte Bsw General</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswGeneralImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswGeneral()
	 * @generated
	 */
	int RTE_BSW_GENERAL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Use Com Shadow Signal Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL__RTE_USE_COM_SHADOW_SIGNAL_API = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Bsw General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Bsw General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_GENERAL_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucRoot()
	 * @generated
	 */
	int ECUC_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Rte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT__RTE = 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT__OS = 1;

	/**
	 * The feature id for the '<em><b>Com</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT__COM = 2;

	/**
	 * The feature id for the '<em><b>Ecu C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT__ECU_C = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl <em>Rte Sw Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteSwComponentInstance()
	 * @generated
	 */
	int RTE_SW_COMPONENT_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Event To Task Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Software Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rte Sw Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rte Sw Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SW_COMPONENT_INSTANCE_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl <em>Rte Event To Task Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteEventToTaskMapping()
	 * @generated
	 */
	int RTE_EVENT_TO_TASK_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Mapped To Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rte Used Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rte Used Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rte Event To Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rte Event To Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_TO_TASK_MAPPING_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl <em>Os</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOs()
	 * @generated
	 */
	int OS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__ID = ECUC_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__SHORT_NAME = ECUC_MODULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__REFERENCE = ECUC_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__SOURCE = ECUC_MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Reference Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__REFERENCE_BASE = ECUC_MODULE__REFERENCE_BASE;

	/**
	 * The feature id for the '<em><b>Os Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_TASK = ECUC_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_EVENT = ECUC_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_APPLICATION = ECUC_MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Os Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_ALARM = ECUC_MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Os Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_RESOURCE = ECUC_MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Os Spinlock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_SPINLOCK = ECUC_MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Os Ioc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_IOC = ECUC_MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Os OS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__OS_OS = ECUC_MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_FEATURE_COUNT = ECUC_MODULE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OPERATION_COUNT = ECUC_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl <em>Os Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsTask()
	 * @generated
	 */
	int OS_TASK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Task Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OS_TASK_ACTIVATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Task Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OS_TASK_PRIORITY = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Task Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OS_TASK_SCHEDULE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Os Task Accessing Application</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OS_TASK_ACCESSING_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Os Task Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OS_TASK_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mapped Rte Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__MAPPED_RTE_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner Application</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OWNER_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mapped Rte Bsw Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__MAPPED_RTE_BSW_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Os Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Os Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl <em>Rte Exclusive Area Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteExclusiveAreaImplementation()
	 * @generated
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area Impl Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area Os Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area Os Spinlock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rte Exclusive Area Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rte Exclusive Area Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXCLUSIVE_AREA_IMPLEMENTATION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsEventImpl <em>Os Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsEventImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsEvent()
	 * @generated
	 */
	int OS_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Event Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__OS_EVENT_MASK = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComImpl <em>Com</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getCom()
	 * @generated
	 */
	int COM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__ID = ECUC_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__SHORT_NAME = ECUC_MODULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__REFERENCE = ECUC_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__SOURCE = ECUC_MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Reference Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__REFERENCE_BASE = ECUC_MODULE__REFERENCE_BASE;

	/**
	 * The feature id for the '<em><b>Com Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__COM_CONFIG = ECUC_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FEATURE_COUNT = ECUC_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_OPERATION_COUNT = ECUC_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComConfigImpl <em>Com Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComConfigImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComConfig()
	 * @generated
	 */
	int COM_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__COM_SIGNAL = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG__COM_SIGNAL_GROUP = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CONFIG_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl <em>Com Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComSignal()
	 * @generated
	 */
	int COM_SIGNAL = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Com System Template System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Handle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__COM_HANDLE_ID = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Com Transfer Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__COM_TRANSFER_PROPERTY = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Com Bit Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__COM_BIT_SIZE = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Com Signal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL__COM_SIGNAL_LENGTH = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Com Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Transfers Immediately</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL___TRANSFERS_IMMEDIATELY = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl <em>Com Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComSignalGroup()
	 * @generated
	 */
	int COM_SIGNAL_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Com Group Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__COM_GROUP_SIGNAL = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com System Template Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Com Handle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__COM_HANDLE_ID = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Com Transfer Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Com Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Transfers Immediately</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP___TRANSFERS_IMMEDIATELY = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl <em>Com Group Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComGroupSignal()
	 * @generated
	 */
	int COM_GROUP_SIGNAL = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Com System Template System Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Handle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__COM_HANDLE_ID = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Com Bit Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__COM_BIT_SIZE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Com Signal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL__COM_SIGNAL_LENGTH = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Com Group Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Com Group Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsAlarmImpl <em>Os Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsAlarmImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsAlarm()
	 * @generated
	 */
	int OS_ALARM = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Expected Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM__EXPECTED_CONFIG = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ALARM_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsResourceImpl <em>Os Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsResourceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsResource()
	 * @generated
	 */
	int OS_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The number of structural features of the '<em>Os Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl <em>Os Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsApplication()
	 * @generated
	 */
	int OS_APPLICATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Application Core Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Trusted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__OS_TRUSTED = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os App Ecuc Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__OS_APP_ECUC_PARTITION = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Os Application Trusted Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Os App Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__OS_APP_TASK = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Os Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Os Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcuCImpl <em>Ecu C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcuCImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcuC()
	 * @generated
	 */
	int ECU_C = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__ID = ECUC_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__SHORT_NAME = ECUC_MODULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__REFERENCE = ECUC_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__SOURCE = ECUC_MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Reference Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__REFERENCE_BASE = ECUC_MODULE__REFERENCE_BASE;

	/**
	 * The feature id for the '<em><b>Ecuc Partition Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C__ECUC_PARTITION_COLLECTION = ECUC_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecu C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C_FEATURE_COUNT = ECUC_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecu C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_C_OPERATION_COUNT = ECUC_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionCollectionImpl <em>Partition Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionCollectionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucPartitionCollection()
	 * @generated
	 */
	int ECUC_PARTITION_COLLECTION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Ecuc Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION__ECUC_PARTITION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Assigned Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION___GET_ASSIGNED_CORES = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partition Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_COLLECTION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucPartition()
	 * @generated
	 */
	int ECUC_PARTITION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Ecuc Partition Bsw Module Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition Can Be Restarted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecuc Partition Software Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Impl Os Application</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION__IMPL_OS_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Trusted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION___IS_TRUSTED = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION___GET_OWNER_CORE = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl <em>Os Spinlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSpinlock()
	 * @generated
	 */
	int OS_SPINLOCK = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Spinlock Accessing Application</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Spinlock Lock Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Spinlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os Spinlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteOsInteractionImpl <em>Rte Os Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteOsInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteOsInteraction()
	 * @generated
	 */
	int RTE_OS_INTERACTION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Used Os Activation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION__RTE_USED_OS_ACTIVATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Os Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Os Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OS_INTERACTION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl <em>Rte Used Os Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteUsedOsActivation()
	 * @generated
	 */
	int RTE_USED_OS_ACTIVATION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Expected Tick Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Expected Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Activation Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rte Used Os Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rte Used Os Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_USED_OS_ACTIVATION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl <em>Rte Initialization Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteInitializationBehavior()
	 * @generated
	 */
	int RTE_INITIALIZATION_BEHAVIOR = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Initialization Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Section Initialization Policy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Initialization Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Initialization Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INITIALIZATION_BEHAVIOR_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocImpl <em>Os Ioc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIoc()
	 * @generated
	 */
	int OS_IOC = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Ioc Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC__OS_IOC_COMMUNICATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Ioc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Ioc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl <em>Os Ioc Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocCommunication()
	 * @generated
	 */
	int OS_IOC_COMMUNICATION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Ioc Sender Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Ioc Receiver Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Ioc Data Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Os Ioc Buffer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Os Ioc Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Loopback Sender Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION___GET_LOOPBACK_SENDER_PROPERTIES = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Ioc Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_COMMUNICATION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl <em>Os Ioc Sender Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocSenderProperties()
	 * @generated
	 */
	int OS_IOC_SENDER_PROPERTIES = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Ioc Sending Os Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__PARENT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Ioc Sender Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Os Ioc Sender Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Os Ioc Sender Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_SENDER_PROPERTIES_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocReceiverPropertiesImpl <em>Os Ioc Receiver Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocReceiverPropertiesImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocReceiverProperties()
	 * @generated
	 */
	int OS_IOC_RECEIVER_PROPERTIES = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Ioc Receiving Os Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES__OS_IOC_RECEIVING_OS_APPLICATION = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Ioc Receiver Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Ioc Receiver Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_RECEIVER_PROPERTIES_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl <em>Os Ioc Data Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocDataProperties()
	 * @generated
	 */
	int OS_IOC_DATA_PROPERTIES = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Ioc Data Property Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Ioc Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Ioc Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Os Ioc Data Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Os Ioc Data Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IOC_DATA_PROPERTIES_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationTrustedFunctionImpl <em>Os Application Trusted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationTrustedFunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsApplicationTrustedFunction()
	 * @generated
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Trusted Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__OS_TRUSTED_FUNCTION_NAME = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION__PARENT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Application Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os Application Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_TRUSTED_FUNCTION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl <em>Os OS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsOS()
	 * @generated
	 */
	int OS_OS = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Os Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__OS_NUMBER_OF_CORES = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Master Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__OS_MASTER_CORE_ID = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os System Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS__OS_SYSTEM_CYCLE = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Os OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Multicore Os</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS___IS_MULTICORE_OS = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OS_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl <em>Rte Bsw Event To Task Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswEventToTaskMapping()
	 * @generated
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Bsw Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Bsw Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Bsw Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Bsw Mapped To Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rte Bsw Used Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rte Bsw Used Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT = ECUC_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rte Bsw Event To Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rte Bsw Event To Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EVENT_TO_TASK_MAPPING_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl <em>Rte Bsw Required Mode Group Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswRequiredModeGroupConnection()
	 * @generated
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Bsw Provided Mode Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Bsw Required Mode Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rte Bsw Required Mode Group Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rte Bsw Required Mode Group Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl <em>Rte Bsw Module Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswModuleInstance()
	 * @generated
	 */
	int RTE_BSW_MODULE_INSTANCE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Bsw Event To Task Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Bsw Exclusive Area Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Bsw Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Bsw Required Mode Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rte Bsw Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rte Bsw Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_MODULE_INSTANCE_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl <em>Rte Bsw Exclusive Area Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswExclusiveAreaImpl()
	 * @generated
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Rte Bsw Exclusive Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Bsw Exclusive Area Os Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE = ECUC_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Exclusive Area Impl Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM = ECUC_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Bsw Exclusive Area Os Spinlock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK = ECUC_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rte Bsw Exclusive Area Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rte Bsw Exclusive Area Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BSW_EXCLUSIVE_AREA_IMPL_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSystemCycleImpl <em>Os System Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSystemCycleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSystemCycle()
	 * @generated
	 */
	int OS_SYSTEM_CYCLE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE__ID = ECUC_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE__SHORT_NAME = ECUC_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE__REFERENCE = ECUC_CONTAINER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE__SOURCE = ECUC_CONTAINER__SOURCE;

	/**
	 * The number of structural features of the '<em>Os System Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE_FEATURE_COUNT = ECUC_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os System Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SYSTEM_CYCLE_OPERATION_COUNT = ECUC_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum <em>Os Task Schedule Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsTaskScheduleEnum()
	 * @generated
	 */
	int OS_TASK_SCHEDULE_ENUM = 41;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum <em>Rte Exclusive Area Impl Mechanism Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteExclusiveAreaImplMechanismEnum()
	 * @generated
	 */
	int RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM = 42;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum <em>Com Transfer Property Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComTransferPropertyEnum()
	 * @generated
	 */
	int COM_TRANSFER_PROPERTY_ENUM = 43;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum <em>Os Spinlock Lock Method Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSpinlockLockMethodEnum()
	 * @generated
	 */
	int OS_SPINLOCK_LOCK_METHOD_ENUM = 44;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum <em>Rte Initialization Strategy Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteInitializationStrategyEnum()
	 * @generated
	 */
	int RTE_INITIALIZATION_STRATEGY_ENUM = 45;

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte
	 * @generated
	 */
	EClass getRte();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteGeneration <em>Rte Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Generation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteGeneration()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteBswGeneral <em>Rte Bsw General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Bsw General</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteBswGeneral()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteBswGeneral();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteSwComponentInstance <em>Rte Sw Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Sw Component Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteSwComponentInstance()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteSwComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteOsInteraction <em>Rte Os Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Os Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteOsInteraction()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteOsInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteInitializationBehavior <em>Rte Initialization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Initialization Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteInitializationBehavior()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteInitializationBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteBswModuleInstance <em>Rte Bsw Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Bsw Module Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte#getRteBswModuleInstance()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteBswModuleInstance();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteGeneration <em>Rte Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Generation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteGeneration
	 * @generated
	 */
	EClass getRteGeneration();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral <em>Rte Bsw General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Bsw General</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral
	 * @generated
	 */
	EClass getRteBswGeneral();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral#getRteUseComShadowSignalApi <em>Rte Use Com Shadow Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Use Com Shadow Signal Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral#getRteUseComShadowSignalApi()
	 * @see #getRteBswGeneral()
	 * @generated
	 */
	EAttribute getRteBswGeneral_RteUseComShadowSignalApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucObject
	 * @generated
	 */
	EClass getEcucObject();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot
	 * @generated
	 */
	EClass getEcucRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getRte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getRte()
	 * @see #getEcucRoot()
	 * @generated
	 */
	EReference getEcucRoot_Rte();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getOs()
	 * @see #getEcucRoot()
	 * @generated
	 */
	EReference getEcucRoot_Os();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getCom <em>Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getCom()
	 * @see #getEcucRoot()
	 * @generated
	 */
	EReference getEcucRoot_Com();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getEcuC <em>Ecu C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecu C</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot#getEcuC()
	 * @see #getEcucRoot()
	 * @generated
	 */
	EReference getEcucRoot_EcuC();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance <em>Rte Sw Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Sw Component Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance
	 * @generated
	 */
	EClass getRteSwComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteEventToTaskMapping <em>Rte Event To Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Event To Task Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteEventToTaskMapping()
	 * @see #getRteSwComponentInstance()
	 * @generated
	 */
	EReference getRteSwComponentInstance_RteEventToTaskMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteExclusiveAreaImplementation <em>Rte Exclusive Area Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Exclusive Area Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteExclusiveAreaImplementation()
	 * @see #getRteSwComponentInstance()
	 * @generated
	 */
	EReference getRteSwComponentInstance_RteExclusiveAreaImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteSoftwareComponentInstance <em>Rte Software Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Software Component Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance#getRteSoftwareComponentInstance()
	 * @see #getRteSwComponentInstance()
	 * @generated
	 */
	EReference getRteSwComponentInstance_RteSoftwareComponentInstance();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping <em>Rte Event To Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Event To Task Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping
	 * @generated
	 */
	EClass getRteEventToTaskMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteEvent <em>Rte Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteEvent()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EReference getRteEventToTaskMapping_RteEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteActivationOffset <em>Rte Activation Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Activation Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteActivationOffset()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EAttribute getRteEventToTaskMapping_RteActivationOffset();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteMappedToTask <em>Rte Mapped To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Mapped To Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteMappedToTask()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EReference getRteEventToTaskMapping_RteMappedToTask();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRtePositionInTask <em>Rte Position In Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Position In Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRtePositionInTask()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EAttribute getRteEventToTaskMapping_RtePositionInTask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsAlarm <em>Rte Used Os Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Used Os Alarm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsAlarm()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EReference getRteEventToTaskMapping_RteUsedOsAlarm();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsEvent <em>Rte Used Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Used Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsEvent()
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 */
	EReference getRteEventToTaskMapping_RteUsedOsEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable
	 * @generated
	 */
	EClass getEcucReferrable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getId()
	 * @see #getEcucReferrable()
	 * @generated
	 */
	EAttribute getEcucReferrable_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getShortName()
	 * @see #getEcucReferrable()
	 * @generated
	 */
	EAttribute getEcucReferrable_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getReference()
	 * @see #getEcucReferrable()
	 * @generated
	 */
	EAttribute getEcucReferrable_Reference();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable#getSource()
	 * @see #getEcucReferrable()
	 * @generated
	 */
	EReference getEcucReferrable_Source();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule
	 * @generated
	 */
	EClass getEcucModule();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule#getReferenceBase <em>Reference Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Base</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule#getReferenceBase()
	 * @see #getEcucModule()
	 * @generated
	 */
	EAttribute getEcucModule_ReferenceBase();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer
	 * @generated
	 */
	EClass getEcucContainer();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os
	 * @generated
	 */
	EClass getOs();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsTask <em>Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsTask()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsTask();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsEvent <em>Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsEvent()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsApplication <em>Os Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsApplication()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsAlarm <em>Os Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Alarm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsAlarm()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsAlarm();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsResource <em>Os Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Resource</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsResource()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsResource();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsSpinlock <em>Os Spinlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Spinlock</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsSpinlock()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsSpinlock();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsIoc <em>Os Ioc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Ioc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsIoc()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsIoc();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsOS <em>Os OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os OS</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsOS()
	 * @see #getOs()
	 * @generated
	 */
	EReference getOs_OsOS();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask <em>Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask
	 * @generated
	 */
	EClass getOsTask();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskActivation <em>Os Task Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Task Activation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskActivation()
	 * @see #getOsTask()
	 * @generated
	 */
	EAttribute getOsTask_OsTaskActivation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskPriority <em>Os Task Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Task Priority</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskPriority()
	 * @see #getOsTask()
	 * @generated
	 */
	EAttribute getOsTask_OsTaskPriority();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskSchedule <em>Os Task Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Task Schedule</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskSchedule()
	 * @see #getOsTask()
	 * @generated
	 */
	EAttribute getOsTask_OsTaskSchedule();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskAccessingApplication <em>Os Task Accessing Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Os Task Accessing Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskAccessingApplication()
	 * @see #getOsTask()
	 * @generated
	 */
	EReference getOsTask_OsTaskAccessingApplication();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskEvent <em>Os Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Os Task Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOsTaskEvent()
	 * @see #getOsTask()
	 * @generated
	 */
	EReference getOsTask_OsTaskEvent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteEvent <em>Mapped Rte Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped Rte Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteEvent()
	 * @see #getOsTask()
	 * @generated
	 */
	EReference getOsTask_MappedRteEvent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOwnerApplication <em>Owner Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getOwnerApplication()
	 * @see #getOsTask()
	 * @generated
	 */
	EReference getOsTask_OwnerApplication();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent <em>Mapped Rte Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped Rte Bsw Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent()
	 * @see #getOsTask()
	 * @generated
	 */
	EReference getOsTask_MappedRteBswEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation <em>Rte Exclusive Area Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Exclusive Area Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation
	 * @generated
	 */
	EClass getRteExclusiveAreaImplementation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Exclusive Area Impl Mechanism</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaImplMechanism()
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 */
	EAttribute getRteExclusiveAreaImplementation_RteExclusiveAreaImplMechanism();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveArea <em>Rte Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveArea()
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 */
	EReference getRteExclusiveAreaImplementation_RteExclusiveArea();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaOsResource <em>Rte Exclusive Area Os Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Exclusive Area Os Resource</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaOsResource()
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 */
	EReference getRteExclusiveAreaImplementation_RteExclusiveAreaOsResource();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaOsSpinlock <em>Rte Exclusive Area Os Spinlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Exclusive Area Os Spinlock</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation#getRteExclusiveAreaOsSpinlock()
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 */
	EReference getRteExclusiveAreaImplementation_RteExclusiveAreaOsSpinlock();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent <em>Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent
	 * @generated
	 */
	EClass getOsEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent#getOsEventMask <em>Os Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Event Mask</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent#getOsEventMask()
	 * @see #getOsEvent()
	 * @generated
	 */
	EAttribute getOsEvent_OsEventMask();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com <em>Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com
	 * @generated
	 */
	EClass getCom();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com#getComConfig <em>Com Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com#getComConfig()
	 * @see #getCom()
	 * @generated
	 */
	EReference getCom_ComConfig();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig <em>Com Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig
	 * @generated
	 */
	EClass getComConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig#getComSignal <em>Com Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig#getComSignal()
	 * @see #getComConfig()
	 * @generated
	 */
	EReference getComConfig_ComSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig#getComSignalGroup <em>Com Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig#getComSignalGroup()
	 * @see #getComConfig()
	 * @generated
	 */
	EReference getComConfig_ComSignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal <em>Com Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal
	 * @generated
	 */
	EClass getComSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComSystemTemplateSystemSignal <em>Com System Template System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com System Template System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComSystemTemplateSystemSignal()
	 * @see #getComSignal()
	 * @generated
	 */
	EReference getComSignal_ComSystemTemplateSystemSignal();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComHandleId <em>Com Handle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Handle Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComHandleId()
	 * @see #getComSignal()
	 * @generated
	 */
	EAttribute getComSignal_ComHandleId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComTransferProperty <em>Com Transfer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Transfer Property</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComTransferProperty()
	 * @see #getComSignal()
	 * @generated
	 */
	EAttribute getComSignal_ComTransferProperty();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComBitSize <em>Com Bit Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Bit Size</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComBitSize()
	 * @see #getComSignal()
	 * @generated
	 */
	EAttribute getComSignal_ComBitSize();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComSignalLength <em>Com Signal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Signal Length</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#getComSignalLength()
	 * @see #getComSignal()
	 * @generated
	 */
	EAttribute getComSignal_ComSignalLength();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#transfersImmediately() <em>Transfers Immediately</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfers Immediately</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal#transfersImmediately()
	 * @generated
	 */
	EOperation getComSignal__TransfersImmediately();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup <em>Com Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup
	 * @generated
	 */
	EClass getComSignalGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComSystemTemplateSignalGroup <em>Com System Template Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com System Template Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComSystemTemplateSignalGroup()
	 * @see #getComSignalGroup()
	 * @generated
	 */
	EReference getComSignalGroup_ComSystemTemplateSignalGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComGroupSignal <em>Com Group Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Group Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComGroupSignal()
	 * @see #getComSignalGroup()
	 * @generated
	 */
	EReference getComSignalGroup_ComGroupSignal();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComHandleId <em>Com Handle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Handle Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComHandleId()
	 * @see #getComSignalGroup()
	 * @generated
	 */
	EAttribute getComSignalGroup_ComHandleId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComTransferProperty <em>Com Transfer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Transfer Property</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#getComTransferProperty()
	 * @see #getComSignalGroup()
	 * @generated
	 */
	EAttribute getComSignalGroup_ComTransferProperty();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#transfersImmediately() <em>Transfers Immediately</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfers Immediately</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup#transfersImmediately()
	 * @generated
	 */
	EOperation getComSignalGroup__TransfersImmediately();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal <em>Com Group Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Group Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal
	 * @generated
	 */
	EClass getComGroupSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComSystemTemplateSystemSignal <em>Com System Template System Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com System Template System Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComSystemTemplateSystemSignal()
	 * @see #getComGroupSignal()
	 * @generated
	 */
	EReference getComGroupSignal_ComSystemTemplateSystemSignal();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComHandleId <em>Com Handle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Handle Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComHandleId()
	 * @see #getComGroupSignal()
	 * @generated
	 */
	EAttribute getComGroupSignal_ComHandleId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComBitSize <em>Com Bit Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Bit Size</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComBitSize()
	 * @see #getComGroupSignal()
	 * @generated
	 */
	EAttribute getComGroupSignal_ComBitSize();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComSignalLength <em>Com Signal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Signal Length</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal#getComSignalLength()
	 * @see #getComGroupSignal()
	 * @generated
	 */
	EAttribute getComGroupSignal_ComSignalLength();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm <em>Os Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Alarm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm
	 * @generated
	 */
	EClass getOsAlarm();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm#getExpectedConfig <em>Expected Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expected Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm#getExpectedConfig()
	 * @see #getOsAlarm()
	 * @generated
	 */
	EReference getOsAlarm_ExpectedConfig();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource <em>Os Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Resource</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource
	 * @generated
	 */
	EClass getOsResource();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication <em>Os Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication
	 * @generated
	 */
	EClass getOsApplication();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsApplicationCoreAssignment <em>Os Application Core Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Application Core Assignment</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsApplicationCoreAssignment()
	 * @see #getOsApplication()
	 * @generated
	 */
	EAttribute getOsApplication_OsApplicationCoreAssignment();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsTrusted <em>Os Trusted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Trusted</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsTrusted()
	 * @see #getOsApplication()
	 * @generated
	 */
	EAttribute getOsApplication_OsTrusted();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppEcucPartition <em>Os App Ecuc Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os App Ecuc Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppEcucPartition()
	 * @see #getOsApplication()
	 * @generated
	 */
	EReference getOsApplication_OsAppEcucPartition();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsApplicationTrustedFunction <em>Os Application Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Application Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsApplicationTrustedFunction()
	 * @see #getOsApplication()
	 * @generated
	 */
	EReference getOsApplication_OsApplicationTrustedFunction();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppTask <em>Os App Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Os App Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppTask()
	 * @see #getOsApplication()
	 * @generated
	 */
	EReference getOsApplication_OsAppTask();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC <em>Ecu C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecu C</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC
	 * @generated
	 */
	EClass getEcuC();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC#getEcucPartitionCollection <em>Ecuc Partition Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecuc Partition Collection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC#getEcucPartitionCollection()
	 * @see #getEcuC()
	 * @generated
	 */
	EReference getEcuC_EcucPartitionCollection();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection <em>Partition Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Collection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection
	 * @generated
	 */
	EClass getEcucPartitionCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection#getEcucPartition <em>Ecuc Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecuc Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection#getEcucPartition()
	 * @see #getEcucPartitionCollection()
	 * @generated
	 */
	EReference getEcucPartitionCollection_EcucPartition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection#getAssignedCores() <em>Get Assigned Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assigned Cores</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection#getAssignedCores()
	 * @generated
	 */
	EOperation getEcucPartitionCollection__GetAssignedCores();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition
	 * @generated
	 */
	EClass getEcucPartition();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionBswModuleExecution <em>Ecuc Partition Bsw Module Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecuc Partition Bsw Module Execution</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionBswModuleExecution()
	 * @see #getEcucPartition()
	 * @generated
	 */
	EAttribute getEcucPartition_EcucPartitionBswModuleExecution();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getPartitionCanBeRestarted <em>Partition Can Be Restarted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Can Be Restarted</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getPartitionCanBeRestarted()
	 * @see #getEcucPartition()
	 * @generated
	 */
	EAttribute getEcucPartition_PartitionCanBeRestarted();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionSoftwareComponent <em>Ecuc Partition Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecuc Partition Software Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionSoftwareComponent()
	 * @see #getEcucPartition()
	 * @generated
	 */
	EReference getEcucPartition_EcucPartitionSoftwareComponent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getImplOsApplication <em>Impl Os Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impl Os Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getImplOsApplication()
	 * @see #getEcucPartition()
	 * @generated
	 */
	EReference getEcucPartition_ImplOsApplication();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#isTrusted() <em>Is Trusted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Trusted</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#isTrusted()
	 * @generated
	 */
	EOperation getEcucPartition__IsTrusted();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getOwnerCore() <em>Get Owner Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Core</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getOwnerCore()
	 * @generated
	 */
	EOperation getEcucPartition__GetOwnerCore();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock <em>Os Spinlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Spinlock</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock
	 * @generated
	 */
	EClass getOsSpinlock();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock#getOsSpinlockAccessingApplication <em>Os Spinlock Accessing Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Os Spinlock Accessing Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock#getOsSpinlockAccessingApplication()
	 * @see #getOsSpinlock()
	 * @generated
	 */
	EReference getOsSpinlock_OsSpinlockAccessingApplication();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock#getOsSpinlockLockMethod <em>Os Spinlock Lock Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Spinlock Lock Method</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock#getOsSpinlockLockMethod()
	 * @see #getOsSpinlock()
	 * @generated
	 */
	EAttribute getOsSpinlock_OsSpinlockLockMethod();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction <em>Rte Os Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Os Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction
	 * @generated
	 */
	EClass getRteOsInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction#getRteUsedOsActivation <em>Rte Used Os Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Used Os Activation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction#getRteUsedOsActivation()
	 * @see #getRteOsInteraction()
	 * @generated
	 */
	EReference getRteOsInteraction_RteUsedOsActivation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation <em>Rte Used Os Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Used Os Activation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation
	 * @generated
	 */
	EClass getRteUsedOsActivation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteExpectedTickDuration <em>Rte Expected Tick Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Expected Tick Duration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteExpectedTickDuration()
	 * @see #getRteUsedOsActivation()
	 * @generated
	 */
	EAttribute getRteUsedOsActivation_RteExpectedTickDuration();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteExpectedActivationOffset <em>Rte Expected Activation Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Expected Activation Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteExpectedActivationOffset()
	 * @see #getRteUsedOsActivation()
	 * @generated
	 */
	EAttribute getRteUsedOsActivation_RteExpectedActivationOffset();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteActivationOsAlarm <em>Rte Activation Os Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Activation Os Alarm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation#getRteActivationOsAlarm()
	 * @see #getRteUsedOsActivation()
	 * @generated
	 */
	EReference getRteUsedOsActivation_RteActivationOsAlarm();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior <em>Rte Initialization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Initialization Behavior</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior
	 * @generated
	 */
	EClass getRteInitializationBehavior();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior#getRteInitializationStrategy <em>Rte Initialization Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Initialization Strategy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior#getRteInitializationStrategy()
	 * @see #getRteInitializationBehavior()
	 * @generated
	 */
	EAttribute getRteInitializationBehavior_RteInitializationStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior#getRteSectionInitializationPolicy <em>Rte Section Initialization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rte Section Initialization Policy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior#getRteSectionInitializationPolicy()
	 * @see #getRteInitializationBehavior()
	 * @generated
	 */
	EAttribute getRteInitializationBehavior_RteSectionInitializationPolicy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc <em>Os Ioc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Ioc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc
	 * @generated
	 */
	EClass getOsIoc();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc#getOsIocCommunication <em>Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc#getOsIocCommunication()
	 * @see #getOsIoc()
	 * @generated
	 */
	EReference getOsIoc_OsIocCommunication();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication <em>Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication
	 * @generated
	 */
	EClass getOsIocCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocSenderProperties <em>Os Ioc Sender Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Ioc Sender Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocSenderProperties()
	 * @see #getOsIocCommunication()
	 * @generated
	 */
	EReference getOsIocCommunication_OsIocSenderProperties();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocReceiverProperties <em>Os Ioc Receiver Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Ioc Receiver Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocReceiverProperties()
	 * @see #getOsIocCommunication()
	 * @generated
	 */
	EReference getOsIocCommunication_OsIocReceiverProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocDataProperties <em>Os Ioc Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Ioc Data Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocDataProperties()
	 * @see #getOsIocCommunication()
	 * @generated
	 */
	EReference getOsIocCommunication_OsIocDataProperties();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocBufferLength <em>Os Ioc Buffer Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Ioc Buffer Length</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getOsIocBufferLength()
	 * @see #getOsIocCommunication()
	 * @generated
	 */
	EAttribute getOsIocCommunication_OsIocBufferLength();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getLoopbackSenderProperties() <em>Get Loopback Sender Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Loopback Sender Properties</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication#getLoopbackSenderProperties()
	 * @generated
	 */
	EOperation getOsIocCommunication__GetLoopbackSenderProperties();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties <em>Os Ioc Sender Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Ioc Sender Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties
	 * @generated
	 */
	EClass getOsIocSenderProperties();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getOsIocSenderId <em>Os Ioc Sender Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Ioc Sender Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getOsIocSenderId()
	 * @see #getOsIocSenderProperties()
	 * @generated
	 */
	EAttribute getOsIocSenderProperties_OsIocSenderId();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getOsIocSendingOsApplication <em>Os Ioc Sending Os Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Ioc Sending Os Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getOsIocSendingOsApplication()
	 * @see #getOsIocSenderProperties()
	 * @generated
	 */
	EReference getOsIocSenderProperties_OsIocSendingOsApplication();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties#getParent()
	 * @see #getOsIocSenderProperties()
	 * @generated
	 */
	EReference getOsIocSenderProperties_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties <em>Os Ioc Receiver Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Ioc Receiver Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties
	 * @generated
	 */
	EClass getOsIocReceiverProperties();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties#getOsIocReceivingOsApplication <em>Os Ioc Receiving Os Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Ioc Receiving Os Application</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties#getOsIocReceivingOsApplication()
	 * @see #getOsIocReceiverProperties()
	 * @generated
	 */
	EReference getOsIocReceiverProperties_OsIocReceivingOsApplication();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties <em>Os Ioc Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Ioc Data Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties
	 * @generated
	 */
	EClass getOsIocDataProperties();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocDataPropertyIndex <em>Os Ioc Data Property Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Ioc Data Property Index</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocDataPropertyIndex()
	 * @see #getOsIocDataProperties()
	 * @generated
	 */
	EAttribute getOsIocDataProperties_OsIocDataPropertyIndex();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocInitValue <em>Os Ioc Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Ioc Init Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocInitValue()
	 * @see #getOsIocDataProperties()
	 * @generated
	 */
	EAttribute getOsIocDataProperties_OsIocInitValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocDataType <em>Os Ioc Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Ioc Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties#getOsIocDataType()
	 * @see #getOsIocDataProperties()
	 * @generated
	 */
	EReference getOsIocDataProperties_OsIocDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction <em>Os Application Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Application Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction
	 * @generated
	 */
	EClass getOsApplicationTrustedFunction();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction#getOsTrustedFunctionName <em>Os Trusted Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Trusted Function Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction#getOsTrustedFunctionName()
	 * @see #getOsApplicationTrustedFunction()
	 * @generated
	 */
	EAttribute getOsApplicationTrustedFunction_OsTrustedFunctionName();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction#getParent()
	 * @see #getOsApplicationTrustedFunction()
	 * @generated
	 */
	EReference getOsApplicationTrustedFunction_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS <em>Os OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os OS</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS
	 * @generated
	 */
	EClass getOsOS();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsNumberOfCores <em>Os Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Number Of Cores</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsNumberOfCores()
	 * @see #getOsOS()
	 * @generated
	 */
	EAttribute getOsOS_OsNumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsMasterCoreId <em>Os Master Core Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Master Core Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsMasterCoreId()
	 * @see #getOsOS()
	 * @generated
	 */
	EAttribute getOsOS_OsMasterCoreId();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsSystemCycle <em>Os System Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os System Cycle</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#getOsSystemCycle()
	 * @see #getOsOS()
	 * @generated
	 */
	EReference getOsOS_OsSystemCycle();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#isMulticoreOs() <em>Is Multicore Os</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multicore Os</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS#isMulticoreOs()
	 * @generated
	 */
	EOperation getOsOS__IsMulticoreOs();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping <em>Rte Bsw Event To Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Bsw Event To Task Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping
	 * @generated
	 */
	EClass getRteBswEventToTaskMapping();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Bsw Activation Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EAttribute getRteBswEventToTaskMapping_RteBswActivationOffset();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent <em>Rte Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EReference getRteBswEventToTaskMapping_RteBswEvent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Bsw Position In Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EAttribute getRteBswEventToTaskMapping_RteBswPositionInTask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Mapped To Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EReference getRteBswEventToTaskMapping_RteBswMappedToTask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Used Os Alarm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EReference getRteBswEventToTaskMapping_RteBswUsedOsAlarm();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Used Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent()
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 */
	EReference getRteBswEventToTaskMapping_RteBswUsedOsEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection <em>Rte Bsw Required Mode Group Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection
	 * @generated
	 */
	EClass getRteBswRequiredModeGroupConnection();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getParent()
	 * @see #getRteBswRequiredModeGroupConnection()
	 * @generated
	 */
	EReference getRteBswRequiredModeGroupConnection_Parent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getRteBswProvidedModeGroup <em>Rte Bsw Provided Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Provided Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getRteBswProvidedModeGroup()
	 * @see #getRteBswRequiredModeGroupConnection()
	 * @generated
	 */
	EReference getRteBswRequiredModeGroupConnection_RteBswProvidedModeGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getRteBswRequiredModeGroup <em>Rte Bsw Required Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Required Mode Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection#getRteBswRequiredModeGroup()
	 * @see #getRteBswRequiredModeGroupConnection()
	 * @generated
	 */
	EReference getRteBswRequiredModeGroupConnection_RteBswRequiredModeGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance <em>Rte Bsw Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Bsw Module Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance
	 * @generated
	 */
	EClass getRteBswModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswEventToTaskMapping <em>Rte Bsw Event To Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Bsw Event To Task Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswEventToTaskMapping()
	 * @see #getRteBswModuleInstance()
	 * @generated
	 */
	EReference getRteBswModuleInstance_RteBswEventToTaskMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswExclusiveAreaImpl <em>Rte Bsw Exclusive Area Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswExclusiveAreaImpl()
	 * @see #getRteBswModuleInstance()
	 * @generated
	 */
	EReference getRteBswModuleInstance_RteBswExclusiveAreaImpl();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswImplementation <em>Rte Bsw Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswImplementation()
	 * @see #getRteBswModuleInstance()
	 * @generated
	 */
	EReference getRteBswModuleInstance_RteBswImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswRequiredModeGroupConnection <em>Rte Bsw Required Mode Group Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance#getRteBswRequiredModeGroupConnection()
	 * @see #getRteBswModuleInstance()
	 * @generated
	 */
	EReference getRteBswModuleInstance_RteBswRequiredModeGroupConnection();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl <em>Rte Bsw Exclusive Area Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl
	 * @generated
	 */
	EClass getRteBswExclusiveAreaImpl();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveArea <em>Rte Bsw Exclusive Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Exclusive Area</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveArea()
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 */
	EReference getRteBswExclusiveAreaImpl_RteBswExclusiveArea();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rte Exclusive Area Impl Mechanism</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteExclusiveAreaImplMechanism()
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 */
	EAttribute getRteBswExclusiveAreaImpl_RteExclusiveAreaImplMechanism();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsSpinlock <em>Rte Bsw Exclusive Area Os Spinlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Exclusive Area Os Spinlock</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsSpinlock()
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 */
	EReference getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsSpinlock();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSystemCycle <em>Os System Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os System Cycle</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSystemCycle
	 * @generated
	 */
	EClass getOsSystemCycle();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsResource <em>Rte Bsw Exclusive Area Os Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Bsw Exclusive Area Os Resource</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsResource()
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 */
	EReference getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsResource();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum <em>Os Task Schedule Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Os Task Schedule Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum
	 * @generated
	 */
	EEnum getOsTaskScheduleEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum <em>Rte Exclusive Area Impl Mechanism Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rte Exclusive Area Impl Mechanism Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum
	 * @generated
	 */
	EEnum getRteExclusiveAreaImplMechanismEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum <em>Com Transfer Property Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Com Transfer Property Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum
	 * @generated
	 */
	EEnum getComTransferPropertyEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum <em>Os Spinlock Lock Method Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Os Spinlock Lock Method Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum
	 * @generated
	 */
	EEnum getOsSpinlockLockMethodEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum <em>Rte Initialization Strategy Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rte Initialization Strategy Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum
	 * @generated
	 */
	EEnum getRteInitializationStrategyEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcucFactory getEcucFactory();

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
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl <em>Rte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRte()
		 * @generated
		 */
		EClass RTE = eINSTANCE.getRte();

		/**
		 * The meta object literal for the '<em><b>Rte Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_GENERATION = eINSTANCE.getRte_RteGeneration();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_BSW_GENERAL = eINSTANCE.getRte_RteBswGeneral();

		/**
		 * The meta object literal for the '<em><b>Rte Sw Component Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_SW_COMPONENT_INSTANCE = eINSTANCE.getRte_RteSwComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Rte Os Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_OS_INTERACTION = eINSTANCE.getRte_RteOsInteraction();

		/**
		 * The meta object literal for the '<em><b>Rte Initialization Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_INITIALIZATION_BEHAVIOR = eINSTANCE.getRte_RteInitializationBehavior();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_BSW_MODULE_INSTANCE = eINSTANCE.getRte_RteBswModuleInstance();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteGenerationImpl <em>Rte Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteGenerationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteGeneration()
		 * @generated
		 */
		EClass RTE_GENERATION = eINSTANCE.getRteGeneration();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswGeneralImpl <em>Rte Bsw General</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswGeneralImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswGeneral()
		 * @generated
		 */
		EClass RTE_BSW_GENERAL = eINSTANCE.getRteBswGeneral();

		/**
		 * The meta object literal for the '<em><b>Rte Use Com Shadow Signal Api</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_BSW_GENERAL__RTE_USE_COM_SHADOW_SIGNAL_API = eINSTANCE.getRteBswGeneral_RteUseComShadowSignalApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucObjectImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucObject()
		 * @generated
		 */
		EClass ECUC_OBJECT = eINSTANCE.getEcucObject();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucRoot()
		 * @generated
		 */
		EClass ECUC_ROOT = eINSTANCE.getEcucRoot();

		/**
		 * The meta object literal for the '<em><b>Rte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_ROOT__RTE = eINSTANCE.getEcucRoot_Rte();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_ROOT__OS = eINSTANCE.getEcucRoot_Os();

		/**
		 * The meta object literal for the '<em><b>Com</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_ROOT__COM = eINSTANCE.getEcucRoot_Com();

		/**
		 * The meta object literal for the '<em><b>Ecu C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_ROOT__ECU_C = eINSTANCE.getEcucRoot_EcuC();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl <em>Rte Sw Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteSwComponentInstance()
		 * @generated
		 */
		EClass RTE_SW_COMPONENT_INSTANCE = eINSTANCE.getRteSwComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Rte Event To Task Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING = eINSTANCE.getRteSwComponentInstance_RteEventToTaskMapping();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION = eINSTANCE.getRteSwComponentInstance_RteExclusiveAreaImplementation();

		/**
		 * The meta object literal for the '<em><b>Rte Software Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE = eINSTANCE.getRteSwComponentInstance_RteSoftwareComponentInstance();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl <em>Rte Event To Task Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteEventToTaskMapping()
		 * @generated
		 */
		EClass RTE_EVENT_TO_TASK_MAPPING = eINSTANCE.getRteEventToTaskMapping();

		/**
		 * The meta object literal for the '<em><b>Rte Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT = eINSTANCE.getRteEventToTaskMapping_RteEvent();

		/**
		 * The meta object literal for the '<em><b>Rte Activation Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET = eINSTANCE.getRteEventToTaskMapping_RteActivationOffset();

		/**
		 * The meta object literal for the '<em><b>Rte Mapped To Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK = eINSTANCE.getRteEventToTaskMapping_RteMappedToTask();

		/**
		 * The meta object literal for the '<em><b>Rte Position In Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK = eINSTANCE.getRteEventToTaskMapping_RtePositionInTask();

		/**
		 * The meta object literal for the '<em><b>Rte Used Os Alarm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM = eINSTANCE.getRteEventToTaskMapping_RteUsedOsAlarm();

		/**
		 * The meta object literal for the '<em><b>Rte Used Os Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT = eINSTANCE.getRteEventToTaskMapping_RteUsedOsEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucReferrableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucReferrable()
		 * @generated
		 */
		EClass ECUC_REFERRABLE = eINSTANCE.getEcucReferrable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_REFERRABLE__ID = eINSTANCE.getEcucReferrable_Id();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_REFERRABLE__SHORT_NAME = eINSTANCE.getEcucReferrable_ShortName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_REFERRABLE__REFERENCE = eINSTANCE.getEcucReferrable_Reference();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_REFERRABLE__SOURCE = eINSTANCE.getEcucReferrable_Source();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucModuleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucModule()
		 * @generated
		 */
		EClass ECUC_MODULE = eINSTANCE.getEcucModule();

		/**
		 * The meta object literal for the '<em><b>Reference Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_MODULE__REFERENCE_BASE = eINSTANCE.getEcucModule_ReferenceBase();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucContainerImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucContainer()
		 * @generated
		 */
		EClass ECUC_CONTAINER = eINSTANCE.getEcucContainer();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl <em>Os</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOs()
		 * @generated
		 */
		EClass OS = eINSTANCE.getOs();

		/**
		 * The meta object literal for the '<em><b>Os Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_TASK = eINSTANCE.getOs_OsTask();

		/**
		 * The meta object literal for the '<em><b>Os Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_EVENT = eINSTANCE.getOs_OsEvent();

		/**
		 * The meta object literal for the '<em><b>Os Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_APPLICATION = eINSTANCE.getOs_OsApplication();

		/**
		 * The meta object literal for the '<em><b>Os Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_ALARM = eINSTANCE.getOs_OsAlarm();

		/**
		 * The meta object literal for the '<em><b>Os Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_RESOURCE = eINSTANCE.getOs_OsResource();

		/**
		 * The meta object literal for the '<em><b>Os Spinlock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_SPINLOCK = eINSTANCE.getOs_OsSpinlock();

		/**
		 * The meta object literal for the '<em><b>Os Ioc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_IOC = eINSTANCE.getOs_OsIoc();

		/**
		 * The meta object literal for the '<em><b>Os OS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS__OS_OS = eINSTANCE.getOs_OsOS();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl <em>Os Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsTask()
		 * @generated
		 */
		EClass OS_TASK = eINSTANCE.getOsTask();

		/**
		 * The meta object literal for the '<em><b>Os Task Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__OS_TASK_ACTIVATION = eINSTANCE.getOsTask_OsTaskActivation();

		/**
		 * The meta object literal for the '<em><b>Os Task Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__OS_TASK_PRIORITY = eINSTANCE.getOsTask_OsTaskPriority();

		/**
		 * The meta object literal for the '<em><b>Os Task Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__OS_TASK_SCHEDULE = eINSTANCE.getOsTask_OsTaskSchedule();

		/**
		 * The meta object literal for the '<em><b>Os Task Accessing Application</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__OS_TASK_ACCESSING_APPLICATION = eINSTANCE.getOsTask_OsTaskAccessingApplication();

		/**
		 * The meta object literal for the '<em><b>Os Task Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__OS_TASK_EVENT = eINSTANCE.getOsTask_OsTaskEvent();

		/**
		 * The meta object literal for the '<em><b>Mapped Rte Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__MAPPED_RTE_EVENT = eINSTANCE.getOsTask_MappedRteEvent();

		/**
		 * The meta object literal for the '<em><b>Owner Application</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__OWNER_APPLICATION = eINSTANCE.getOsTask_OwnerApplication();

		/**
		 * The meta object literal for the '<em><b>Mapped Rte Bsw Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__MAPPED_RTE_BSW_EVENT = eINSTANCE.getOsTask_MappedRteBswEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl <em>Rte Exclusive Area Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteExclusiveAreaImplementation()
		 * @generated
		 */
		EClass RTE_EXCLUSIVE_AREA_IMPLEMENTATION = eINSTANCE.getRteExclusiveAreaImplementation();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area Impl Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM = eINSTANCE.getRteExclusiveAreaImplementation_RteExclusiveAreaImplMechanism();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA = eINSTANCE.getRteExclusiveAreaImplementation_RteExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area Os Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE = eINSTANCE.getRteExclusiveAreaImplementation_RteExclusiveAreaOsResource();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area Os Spinlock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK = eINSTANCE.getRteExclusiveAreaImplementation_RteExclusiveAreaOsSpinlock();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsEventImpl <em>Os Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsEventImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsEvent()
		 * @generated
		 */
		EClass OS_EVENT = eINSTANCE.getOsEvent();

		/**
		 * The meta object literal for the '<em><b>Os Event Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_EVENT__OS_EVENT_MASK = eINSTANCE.getOsEvent_OsEventMask();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComImpl <em>Com</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getCom()
		 * @generated
		 */
		EClass COM = eINSTANCE.getCom();

		/**
		 * The meta object literal for the '<em><b>Com Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM__COM_CONFIG = eINSTANCE.getCom_ComConfig();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComConfigImpl <em>Com Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComConfigImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComConfig()
		 * @generated
		 */
		EClass COM_CONFIG = eINSTANCE.getComConfig();

		/**
		 * The meta object literal for the '<em><b>Com Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_CONFIG__COM_SIGNAL = eINSTANCE.getComConfig_ComSignal();

		/**
		 * The meta object literal for the '<em><b>Com Signal Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_CONFIG__COM_SIGNAL_GROUP = eINSTANCE.getComConfig_ComSignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl <em>Com Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComSignal()
		 * @generated
		 */
		EClass COM_SIGNAL = eINSTANCE.getComSignal();

		/**
		 * The meta object literal for the '<em><b>Com System Template System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL = eINSTANCE.getComSignal_ComSystemTemplateSystemSignal();

		/**
		 * The meta object literal for the '<em><b>Com Handle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL__COM_HANDLE_ID = eINSTANCE.getComSignal_ComHandleId();

		/**
		 * The meta object literal for the '<em><b>Com Transfer Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL__COM_TRANSFER_PROPERTY = eINSTANCE.getComSignal_ComTransferProperty();

		/**
		 * The meta object literal for the '<em><b>Com Bit Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL__COM_BIT_SIZE = eINSTANCE.getComSignal_ComBitSize();

		/**
		 * The meta object literal for the '<em><b>Com Signal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL__COM_SIGNAL_LENGTH = eINSTANCE.getComSignal_ComSignalLength();

		/**
		 * The meta object literal for the '<em><b>Transfers Immediately</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL___TRANSFERS_IMMEDIATELY = eINSTANCE.getComSignal__TransfersImmediately();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl <em>Com Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComSignalGroup()
		 * @generated
		 */
		EClass COM_SIGNAL_GROUP = eINSTANCE.getComSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Com System Template Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SIGNAL_GROUP__COM_SYSTEM_TEMPLATE_SIGNAL_GROUP = eINSTANCE.getComSignalGroup_ComSystemTemplateSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Com Group Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SIGNAL_GROUP__COM_GROUP_SIGNAL = eINSTANCE.getComSignalGroup_ComGroupSignal();

		/**
		 * The meta object literal for the '<em><b>Com Handle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL_GROUP__COM_HANDLE_ID = eINSTANCE.getComSignalGroup_ComHandleId();

		/**
		 * The meta object literal for the '<em><b>Com Transfer Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SIGNAL_GROUP__COM_TRANSFER_PROPERTY = eINSTANCE.getComSignalGroup_ComTransferProperty();

		/**
		 * The meta object literal for the '<em><b>Transfers Immediately</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_GROUP___TRANSFERS_IMMEDIATELY = eINSTANCE.getComSignalGroup__TransfersImmediately();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl <em>Com Group Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComGroupSignal()
		 * @generated
		 */
		EClass COM_GROUP_SIGNAL = eINSTANCE.getComGroupSignal();

		/**
		 * The meta object literal for the '<em><b>Com System Template System Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL = eINSTANCE.getComGroupSignal_ComSystemTemplateSystemSignal();

		/**
		 * The meta object literal for the '<em><b>Com Handle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_GROUP_SIGNAL__COM_HANDLE_ID = eINSTANCE.getComGroupSignal_ComHandleId();

		/**
		 * The meta object literal for the '<em><b>Com Bit Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_GROUP_SIGNAL__COM_BIT_SIZE = eINSTANCE.getComGroupSignal_ComBitSize();

		/**
		 * The meta object literal for the '<em><b>Com Signal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_GROUP_SIGNAL__COM_SIGNAL_LENGTH = eINSTANCE.getComGroupSignal_ComSignalLength();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsAlarmImpl <em>Os Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsAlarmImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsAlarm()
		 * @generated
		 */
		EClass OS_ALARM = eINSTANCE.getOsAlarm();

		/**
		 * The meta object literal for the '<em><b>Expected Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_ALARM__EXPECTED_CONFIG = eINSTANCE.getOsAlarm_ExpectedConfig();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsResourceImpl <em>Os Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsResourceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsResource()
		 * @generated
		 */
		EClass OS_RESOURCE = eINSTANCE.getOsResource();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl <em>Os Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsApplication()
		 * @generated
		 */
		EClass OS_APPLICATION = eINSTANCE.getOsApplication();

		/**
		 * The meta object literal for the '<em><b>Os Application Core Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_APPLICATION__OS_APPLICATION_CORE_ASSIGNMENT = eINSTANCE.getOsApplication_OsApplicationCoreAssignment();

		/**
		 * The meta object literal for the '<em><b>Os Trusted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_APPLICATION__OS_TRUSTED = eINSTANCE.getOsApplication_OsTrusted();

		/**
		 * The meta object literal for the '<em><b>Os App Ecuc Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__OS_APP_ECUC_PARTITION = eINSTANCE.getOsApplication_OsAppEcucPartition();

		/**
		 * The meta object literal for the '<em><b>Os Application Trusted Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__OS_APPLICATION_TRUSTED_FUNCTION = eINSTANCE.getOsApplication_OsApplicationTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Os App Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__OS_APP_TASK = eINSTANCE.getOsApplication_OsAppTask();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcuCImpl <em>Ecu C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcuCImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcuC()
		 * @generated
		 */
		EClass ECU_C = eINSTANCE.getEcuC();

		/**
		 * The meta object literal for the '<em><b>Ecuc Partition Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU_C__ECUC_PARTITION_COLLECTION = eINSTANCE.getEcuC_EcucPartitionCollection();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionCollectionImpl <em>Partition Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionCollectionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucPartitionCollection()
		 * @generated
		 */
		EClass ECUC_PARTITION_COLLECTION = eINSTANCE.getEcucPartitionCollection();

		/**
		 * The meta object literal for the '<em><b>Ecuc Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_PARTITION_COLLECTION__ECUC_PARTITION = eINSTANCE.getEcucPartitionCollection_EcucPartition();

		/**
		 * The meta object literal for the '<em><b>Get Assigned Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION_COLLECTION___GET_ASSIGNED_CORES = eINSTANCE.getEcucPartitionCollection__GetAssignedCores();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getEcucPartition()
		 * @generated
		 */
		EClass ECUC_PARTITION = eINSTANCE.getEcucPartition();

		/**
		 * The meta object literal for the '<em><b>Ecuc Partition Bsw Module Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION = eINSTANCE.getEcucPartition_EcucPartitionBswModuleExecution();

		/**
		 * The meta object literal for the '<em><b>Partition Can Be Restarted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED = eINSTANCE.getEcucPartition_PartitionCanBeRestarted();

		/**
		 * The meta object literal for the '<em><b>Ecuc Partition Software Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT = eINSTANCE.getEcucPartition_EcucPartitionSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Impl Os Application</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECUC_PARTITION__IMPL_OS_APPLICATION = eINSTANCE.getEcucPartition_ImplOsApplication();

		/**
		 * The meta object literal for the '<em><b>Is Trusted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION___IS_TRUSTED = eINSTANCE.getEcucPartition__IsTrusted();

		/**
		 * The meta object literal for the '<em><b>Get Owner Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION___GET_OWNER_CORE = eINSTANCE.getEcucPartition__GetOwnerCore();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl <em>Os Spinlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSpinlock()
		 * @generated
		 */
		EClass OS_SPINLOCK = eINSTANCE.getOsSpinlock();

		/**
		 * The meta object literal for the '<em><b>Os Spinlock Accessing Application</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION = eINSTANCE.getOsSpinlock_OsSpinlockAccessingApplication();

		/**
		 * The meta object literal for the '<em><b>Os Spinlock Lock Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD = eINSTANCE.getOsSpinlock_OsSpinlockLockMethod();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteOsInteractionImpl <em>Rte Os Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteOsInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteOsInteraction()
		 * @generated
		 */
		EClass RTE_OS_INTERACTION = eINSTANCE.getRteOsInteraction();

		/**
		 * The meta object literal for the '<em><b>Rte Used Os Activation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_OS_INTERACTION__RTE_USED_OS_ACTIVATION = eINSTANCE.getRteOsInteraction_RteUsedOsActivation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl <em>Rte Used Os Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteUsedOsActivationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteUsedOsActivation()
		 * @generated
		 */
		EClass RTE_USED_OS_ACTIVATION = eINSTANCE.getRteUsedOsActivation();

		/**
		 * The meta object literal for the '<em><b>Rte Expected Tick Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION = eINSTANCE.getRteUsedOsActivation_RteExpectedTickDuration();

		/**
		 * The meta object literal for the '<em><b>Rte Expected Activation Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET = eINSTANCE.getRteUsedOsActivation_RteExpectedActivationOffset();

		/**
		 * The meta object literal for the '<em><b>Rte Activation Os Alarm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM = eINSTANCE.getRteUsedOsActivation_RteActivationOsAlarm();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl <em>Rte Initialization Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteInitializationBehavior()
		 * @generated
		 */
		EClass RTE_INITIALIZATION_BEHAVIOR = eINSTANCE.getRteInitializationBehavior();

		/**
		 * The meta object literal for the '<em><b>Rte Initialization Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY = eINSTANCE.getRteInitializationBehavior_RteInitializationStrategy();

		/**
		 * The meta object literal for the '<em><b>Rte Section Initialization Policy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY = eINSTANCE.getRteInitializationBehavior_RteSectionInitializationPolicy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocImpl <em>Os Ioc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIoc()
		 * @generated
		 */
		EClass OS_IOC = eINSTANCE.getOsIoc();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC__OS_IOC_COMMUNICATION = eINSTANCE.getOsIoc_OsIocCommunication();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl <em>Os Ioc Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocCommunicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocCommunication()
		 * @generated
		 */
		EClass OS_IOC_COMMUNICATION = eINSTANCE.getOsIocCommunication();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Sender Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES = eINSTANCE.getOsIocCommunication_OsIocSenderProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Receiver Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES = eINSTANCE.getOsIocCommunication_OsIocReceiverProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Data Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES = eINSTANCE.getOsIocCommunication_OsIocDataProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Buffer Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH = eINSTANCE.getOsIocCommunication_OsIocBufferLength();

		/**
		 * The meta object literal for the '<em><b>Get Loopback Sender Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OS_IOC_COMMUNICATION___GET_LOOPBACK_SENDER_PROPERTIES = eINSTANCE.getOsIocCommunication__GetLoopbackSenderProperties();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl <em>Os Ioc Sender Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocSenderProperties()
		 * @generated
		 */
		EClass OS_IOC_SENDER_PROPERTIES = eINSTANCE.getOsIocSenderProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Sender Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID = eINSTANCE.getOsIocSenderProperties_OsIocSenderId();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Sending Os Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION = eINSTANCE.getOsIocSenderProperties_OsIocSendingOsApplication();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_SENDER_PROPERTIES__PARENT = eINSTANCE.getOsIocSenderProperties_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocReceiverPropertiesImpl <em>Os Ioc Receiver Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocReceiverPropertiesImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocReceiverProperties()
		 * @generated
		 */
		EClass OS_IOC_RECEIVER_PROPERTIES = eINSTANCE.getOsIocReceiverProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Receiving Os Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_RECEIVER_PROPERTIES__OS_IOC_RECEIVING_OS_APPLICATION = eINSTANCE.getOsIocReceiverProperties_OsIocReceivingOsApplication();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl <em>Os Ioc Data Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsIocDataProperties()
		 * @generated
		 */
		EClass OS_IOC_DATA_PROPERTIES = eINSTANCE.getOsIocDataProperties();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Data Property Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX = eINSTANCE.getOsIocDataProperties_OsIocDataPropertyIndex();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Init Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE = eINSTANCE.getOsIocDataProperties_OsIocInitValue();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE = eINSTANCE.getOsIocDataProperties_OsIocDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationTrustedFunctionImpl <em>Os Application Trusted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsApplicationTrustedFunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsApplicationTrustedFunction()
		 * @generated
		 */
		EClass OS_APPLICATION_TRUSTED_FUNCTION = eINSTANCE.getOsApplicationTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Os Trusted Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_APPLICATION_TRUSTED_FUNCTION__OS_TRUSTED_FUNCTION_NAME = eINSTANCE.getOsApplicationTrustedFunction_OsTrustedFunctionName();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION_TRUSTED_FUNCTION__PARENT = eINSTANCE.getOsApplicationTrustedFunction_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl <em>Os OS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsOSImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsOS()
		 * @generated
		 */
		EClass OS_OS = eINSTANCE.getOsOS();

		/**
		 * The meta object literal for the '<em><b>Os Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_OS__OS_NUMBER_OF_CORES = eINSTANCE.getOsOS_OsNumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Os Master Core Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_OS__OS_MASTER_CORE_ID = eINSTANCE.getOsOS_OsMasterCoreId();

		/**
		 * The meta object literal for the '<em><b>Os System Cycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_OS__OS_SYSTEM_CYCLE = eINSTANCE.getOsOS_OsSystemCycle();

		/**
		 * The meta object literal for the '<em><b>Is Multicore Os</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OS_OS___IS_MULTICORE_OS = eINSTANCE.getOsOS__IsMulticoreOs();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl <em>Rte Bsw Event To Task Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswEventToTaskMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswEventToTaskMapping()
		 * @generated
		 */
		EClass RTE_BSW_EVENT_TO_TASK_MAPPING = eINSTANCE.getRteBswEventToTaskMapping();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Activation Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_ACTIVATION_OFFSET = eINSTANCE.getRteBswEventToTaskMapping_RteBswActivationOffset();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT = eINSTANCE.getRteBswEventToTaskMapping_RteBswEvent();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Position In Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_POSITION_IN_TASK = eINSTANCE.getRteBswEventToTaskMapping_RteBswPositionInTask();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Mapped To Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK = eINSTANCE.getRteBswEventToTaskMapping_RteBswMappedToTask();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Used Os Alarm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM = eINSTANCE.getRteBswEventToTaskMapping_RteBswUsedOsAlarm();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Used Os Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT = eINSTANCE.getRteBswEventToTaskMapping_RteBswUsedOsEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl <em>Rte Bsw Required Mode Group Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswRequiredModeGroupConnectionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswRequiredModeGroupConnection()
		 * @generated
		 */
		EClass RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION = eINSTANCE.getRteBswRequiredModeGroupConnection();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT = eINSTANCE.getRteBswRequiredModeGroupConnection_Parent();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Provided Mode Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP = eINSTANCE.getRteBswRequiredModeGroupConnection_RteBswProvidedModeGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Required Mode Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP = eINSTANCE.getRteBswRequiredModeGroupConnection_RteBswRequiredModeGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl <em>Rte Bsw Module Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswModuleInstance()
		 * @generated
		 */
		EClass RTE_BSW_MODULE_INSTANCE = eINSTANCE.getRteBswModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Event To Task Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING = eINSTANCE.getRteBswModuleInstance_RteBswEventToTaskMapping();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Exclusive Area Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL = eINSTANCE.getRteBswModuleInstance_RteBswExclusiveAreaImpl();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION = eINSTANCE.getRteBswModuleInstance_RteBswImplementation();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Required Mode Group Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION = eINSTANCE.getRteBswModuleInstance_RteBswRequiredModeGroupConnection();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl <em>Rte Bsw Exclusive Area Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteBswExclusiveAreaImpl()
		 * @generated
		 */
		EClass RTE_BSW_EXCLUSIVE_AREA_IMPL = eINSTANCE.getRteBswExclusiveAreaImpl();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Exclusive Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA = eINSTANCE.getRteBswExclusiveAreaImpl_RteBswExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Rte Exclusive Area Impl Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM = eINSTANCE.getRteBswExclusiveAreaImpl_RteExclusiveAreaImplMechanism();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Exclusive Area Os Spinlock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK = eINSTANCE.getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsSpinlock();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSystemCycleImpl <em>Os System Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSystemCycleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSystemCycle()
		 * @generated
		 */
		EClass OS_SYSTEM_CYCLE = eINSTANCE.getOsSystemCycle();

		/**
		 * The meta object literal for the '<em><b>Rte Bsw Exclusive Area Os Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE = eINSTANCE.getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsResource();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum <em>Os Task Schedule Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsTaskScheduleEnum()
		 * @generated
		 */
		EEnum OS_TASK_SCHEDULE_ENUM = eINSTANCE.getOsTaskScheduleEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum <em>Rte Exclusive Area Impl Mechanism Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteExclusiveAreaImplMechanismEnum()
		 * @generated
		 */
		EEnum RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM = eINSTANCE.getRteExclusiveAreaImplMechanismEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum <em>Com Transfer Property Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getComTransferPropertyEnum()
		 * @generated
		 */
		EEnum COM_TRANSFER_PROPERTY_ENUM = eINSTANCE.getComTransferPropertyEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum <em>Os Spinlock Lock Method Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getOsSpinlockLockMethodEnum()
		 * @generated
		 */
		EEnum OS_SPINLOCK_LOCK_METHOD_ENUM = eINSTANCE.getOsSpinlockLockMethodEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum <em>Rte Initialization Strategy Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl#getRteInitializationStrategyEnum()
		 * @generated
		 */
		EEnum RTE_INITIALIZATION_STRATEGY_ENUM = eINSTANCE.getRteInitializationStrategyEnum();

	}

} //EcucPackage
