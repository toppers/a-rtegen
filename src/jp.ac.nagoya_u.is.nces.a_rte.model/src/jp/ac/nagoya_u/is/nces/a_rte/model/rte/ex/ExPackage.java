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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex;

import org.eclipse.emf.ecore.EClass;
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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExFactory
 * @model kind="package"
 *        annotation="stereotypes extension='true'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ExPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ex";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/rte/ex";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExPackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.TimeValueExImpl <em>Time Value Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.TimeValueExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getTimeValueEx()
	 * @generated
	 */
	int TIME_VALUE_EX = 0;

	/**
	 * The number of structural features of the '<em>Time Value Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Greater Than Or Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_EX___IS_GREATER_THAN_OR_EQUALS__BIGDECIMAL_BIGDECIMAL = 0;

	/**
	 * The operation id for the '<em>Is Multiples Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_EX___IS_MULTIPLES_OF__BIGDECIMAL_BIGDECIMAL = 1;

	/**
	 * The operation id for the '<em>Subtract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_EX___SUBTRACT__BIGDECIMAL_BIGDECIMAL = 2;

	/**
	 * The number of operations of the '<em>Time Value Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_EX_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AlignmentTypeExImpl <em>Alignment Type Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AlignmentTypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAlignmentTypeEx()
	 * @generated
	 */
	int ALIGNMENT_TYPE_EX = 1;

	/**
	 * The number of structural features of the '<em>Alignment Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_TYPE_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Memory Mapping Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_TYPE_EX___GET_MEMORY_MAPPING_ALIGNMENT__STRING = 0;

	/**
	 * The number of operations of the '<em>Alignment Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_TYPE_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ReceiverExImpl <em>Receiver Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ReceiverExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getReceiverEx()
	 * @generated
	 */
	int RECEIVER_EX = 23;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuSenderExImpl <em>External Ecu Sender Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuSenderExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExternalEcuSenderEx()
	 * @generated
	 */
	int EXTERNAL_ECU_SENDER_EX = 24;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AssemblyDataInstanceConnectorExImpl <em>Assembly Data Instance Connector Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AssemblyDataInstanceConnectorExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAssemblyDataInstanceConnectorEx()
	 * @generated
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX = 22;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInCompositionExImpl <em>Variable Data Instance In Composition Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInCompositionExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataInstanceInCompositionEx()
	 * @generated
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = 17;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl <em>Com Signal Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComSignalEx()
	 * @generated
	 */
	int COM_SIGNAL_EX = 13;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInSwcExImpl <em>Variable Data Instance In Swc Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInSwcExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataInstanceInSwcEx()
	 * @generated
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX = 18;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RVariableDataInstanceInSwcExImpl <em>RVariable Data Instance In Swc Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RVariableDataInstanceInSwcExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getRVariableDataInstanceInSwcEx()
	 * @generated
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX = 20;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.PVariableDataInstanceInSwcExImpl <em>PVariable Data Instance In Swc Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.PVariableDataInstanceInSwcExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getPVariableDataInstanceInSwcEx()
	 * @generated
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX = 19;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ROperationInstanceInSwcExImpl <em>ROperation Instance In Swc Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ROperationInstanceInSwcExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getROperationInstanceInSwcEx()
	 * @generated
	 */
	int ROPERATION_INSTANCE_IN_SWC_EX = 21;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalMappingExImpl <em>Sender Receiver To Signal Mapping Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalMappingExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getSenderReceiverToSignalMappingEx()
	 * @generated
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX = 10;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EcucPartitionExImpl <em>Ecuc Partition Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EcucPartitionExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getEcucPartitionEx()
	 * @generated
	 */
	int ECUC_PARTITION_EX = 15;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AtomicSwComponentTypeExImpl <em>Atomic Sw Component Type Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AtomicSwComponentTypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAtomicSwComponentTypeEx()
	 * @generated
	 */
	int ATOMIC_SW_COMPONENT_TYPE_EX = 2;

	/**
	 * The number of structural features of the '<em>Atomic Sw Component Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE_EX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Atomic Sw Component Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SW_COMPONENT_TYPE_EX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ValueSpecificationExImpl <em>Value Specification Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ValueSpecificationExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getValueSpecificationEx()
	 * @generated
	 */
	int VALUE_SPECIFICATION_EX = 3;

	/**
	 * The number of structural features of the '<em>Value Specification Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get End Value Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION = 0;

	/**
	 * The operation id for the '<em>Get Value Spec As Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION = 1;

	/**
	 * The operation id for the '<em>Is For VALUE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION = 2;

	/**
	 * The operation id for the '<em>Is For ARRAY</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = 3;

	/**
	 * The operation id for the '<em>Is For STRUCTURE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = 4;

	/**
	 * The operation id for the '<em>Is For UNION</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = 5;

	/**
	 * The operation id for the '<em>Is For DATA REFERENCE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION = 6;

	/**
	 * The operation id for the '<em>Is Valid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = 7;

	/**
	 * The operation id for the '<em>Equals Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION = 8;

	/**
	 * The number of operations of the '<em>Value Specification Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_EX_OPERATION_COUNT = 9;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.NonqueuedSenderComSpecExImpl <em>Nonqueued Sender Com Spec Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.NonqueuedSenderComSpecExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getNonqueuedSenderComSpecEx()
	 * @generated
	 */
	int NONQUEUED_SENDER_COM_SPEC_EX = 4;

	/**
	 * The number of structural features of the '<em>Nonqueued Sender Com Spec Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Valid Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC_EX___HAS_VALID_INIT_VALUE__NONQUEUEDSENDERCOMSPEC = 0;

	/**
	 * The number of operations of the '<em>Nonqueued Sender Com Spec Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUEUED_SENDER_COM_SPEC_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuMethodExImpl <em>Compu Method Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuMethodExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getCompuMethodEx()
	 * @generated
	 */
	int COMPU_METHOD_EX = 5;

	/**
	 * The number of structural features of the '<em>Compu Method Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Enum Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD_EX___PROVIDES_ENUM_CONSTANT__COMPUMETHOD = 0;

	/**
	 * The number of operations of the '<em>Compu Method Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_METHOD_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuScaleExImpl <em>Compu Scale Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuScaleExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getCompuScaleEx()
	 * @generated
	 */
	int COMPU_SCALE_EX = 6;

	/**
	 * The number of structural features of the '<em>Compu Scale Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Enum Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE = 0;

	/**
	 * The operation id for the '<em>Get Enum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE = 1;

	/**
	 * The number of operations of the '<em>Compu Scale Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPU_SCALE_EX_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ApplicationDataTypeExImpl <em>Application Data Type Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ApplicationDataTypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getApplicationDataTypeEx()
	 * @generated
	 */
	int APPLICATION_DATA_TYPE_EX = 7;

	/**
	 * The number of structural features of the '<em>Application Data Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Upper Lower Limit Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE = 0;

	/**
	 * The number of operations of the '<em>Application Data Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_TYPE_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ImplementationDataTypeExImpl <em>Implementation Data Type Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ImplementationDataTypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getImplementationDataTypeEx()
	 * @generated
	 */
	int IMPLEMENTATION_DATA_TYPE_EX = 8;

	/**
	 * The feature id for the '<em><b>Compu Method Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX = 0;

	/**
	 * The number of structural features of the '<em>Implementation Data Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Provides Type Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE = 0;

	/**
	 * The operation id for the '<em>Provides Enum Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE = 1;

	/**
	 * The operation id for the '<em>Get Compu Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE = 2;

	/**
	 * The number of operations of the '<em>Implementation Data Type Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_EX_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExclusiveAreaExImpl <em>Exclusive Area Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExclusiveAreaExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExclusiveAreaEx()
	 * @generated
	 */
	int EXCLUSIVE_AREA_EX = 9;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX__BSW_SCHEDULABLE_ENTITY_EX = 0;

	/**
	 * The number of structural features of the '<em>Exclusive Area Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Using Partitions Of Bsw Exclusive Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA = 0;

	/**
	 * The operation id for the '<em>Provides Rte Enter Exit Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA = 1;

	/**
	 * The operation id for the '<em>Provides Schm Enter Exit Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA = 2;

	/**
	 * The number of operations of the '<em>Exclusive Area Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_AREA_EX_OPERATION_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Sender Receiver To Signal Mapping Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Mapped Data Instance In Composition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALMAPPING = 0;

	/**
	 * The number of operations of the '<em>Sender Receiver To Signal Mapping Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalGroupMappingExImpl <em>Sender Receiver To Signal Group Mapping Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalGroupMappingExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getSenderReceiverToSignalGroupMappingEx()
	 * @generated
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX = 11;

	/**
	 * The number of structural features of the '<em>Sender Receiver To Signal Group Mapping Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Mapped Data Instance In Composition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALGROUPMAPPING = 0;

	/**
	 * The number of operations of the '<em>Sender Receiver To Signal Group Mapping Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.OsTaskExImpl <em>Os Task Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.OsTaskExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getOsTaskEx()
	 * @generated
	 */
	int OS_TASK_EX = 12;

	/**
	 * The number of structural features of the '<em>Os Task Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Owner Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_EX___GET_OWNER_PARTITION__OSTASK = 0;

	/**
	 * The number of operations of the '<em>Os Task Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_EX_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sender Receiver To Signal Mapping Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX = 0;

	/**
	 * The number of structural features of the '<em>Com Signal Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Sender</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX___IS_SENDER__COMSIGNAL = 0;

	/**
	 * The operation id for the '<em>Is Receiver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL = 1;

	/**
	 * The operation id for the '<em>Get Variable Data Instance In Compositions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL = 2;

	/**
	 * The number of operations of the '<em>Com Signal Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_EX_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalGroupExImpl <em>Com Signal Group Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalGroupExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComSignalGroupEx()
	 * @generated
	 */
	int COM_SIGNAL_GROUP_EX = 14;

	/**
	 * The feature id for the '<em><b>Sender Receiver To Signal Group Mapping Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX__SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX = 0;

	/**
	 * The number of structural features of the '<em>Com Signal Group Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Sender</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP = 0;

	/**
	 * The operation id for the '<em>Is Receiver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX___IS_RECEIVER__COMSIGNALGROUP = 1;

	/**
	 * The operation id for the '<em>Get Variable Data Instance In Compositions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP = 2;

	/**
	 * The number of operations of the '<em>Com Signal Group Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SIGNAL_GROUP_EX_OPERATION_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Ecuc Partition Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is In Master Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION = 0;

	/**
	 * The operation id for the '<em>Is Master Bsw Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION = 1;

	/**
	 * The operation id for the '<em>Provides Restart Partition Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION = 2;

	/**
	 * The operation id for the '<em>Provides Partition Restarting Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION = 3;

	/**
	 * The number of operations of the '<em>Ecuc Partition Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECUC_PARTITION_EX_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataPrototypeExImpl <em>Variable Data Prototype Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataPrototypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataPrototypeEx()
	 * @generated
	 */
	int VARIABLE_DATA_PROTOTYPE_EX = 16;

	/**
	 * The number of structural features of the '<em>Variable Data Prototype Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Init At Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE = 0;

	/**
	 * The operation id for the '<em>Init At Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE = 1;

	/**
	 * The operation id for the '<em>Init At Partition Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE = 2;

	/**
	 * The operation id for the '<em>Get Initialization Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE = 3;

	/**
	 * The operation id for the '<em>Get Section Initialization Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE = 4;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE = 5;

	/**
	 * The number of operations of the '<em>Variable Data Prototype Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_PROTOTYPE_EX_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Value Specification Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX = 0;

	/**
	 * The number of structural features of the '<em>Variable Data Instance In Composition Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION = 0;

	/**
	 * The operation id for the '<em>Init At Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION = 1;

	/**
	 * The operation id for the '<em>Init At Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION = 2;

	/**
	 * The operation id for the '<em>Init At Partition Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION = 3;

	/**
	 * The operation id for the '<em>Get Init Value As Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE_AS_TEXT__VARIABLEDATAINSTANCEINCOMPOSITION = 4;

	/**
	 * The operation id for the '<em>Get Initialization Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAINSTANCEINSWC = 5;

	/**
	 * The operation id for the '<em>Get Section Initialization Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAINSTANCEINSWC = 6;

	/**
	 * The operation id for the '<em>Get Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = 7;

	/**
	 * The operation id for the '<em>Get Receiver Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = 8;

	/**
	 * The operation id for the '<em>Get Sender Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = 9;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = 10;

	/**
	 * The operation id for the '<em>Get Receiver Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = 11;

	/**
	 * The operation id for the '<em>Get Sender Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = 12;

	/**
	 * The operation id for the '<em>Equals Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___EQUALS_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION_VARIABLEDATAINSTANCEINCOMPOSITION = 13;

	/**
	 * The number of operations of the '<em>Variable Data Instance In Composition Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX_OPERATION_COUNT = 14;

	/**
	 * The feature id for the '<em><b>Alignment Type Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX = 0;

	/**
	 * The number of structural features of the '<em>Variable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Provides Init Value Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC = 0;

	/**
	 * The operation id for the '<em>Get Memory Mapping Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC = 1;

	/**
	 * The number of operations of the '<em>Variable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_EX_OPERATION_COUNT = 2;

	/**
	 * The number of structural features of the '<em>PVariable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Write Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC = 0;

	/**
	 * The operation id for the '<em>Provides Invalidate Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC = 1;

	/**
	 * The operation id for the '<em>Provides Send Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC = 2;

	/**
	 * The operation id for the '<em>Provides Feedback Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC = 3;

	/**
	 * The number of operations of the '<em>PVariable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_EX_OPERATION_COUNT = 4;

	/**
	 * The number of structural features of the '<em>RVariable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Requires Filter Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC = 0;

	/**
	 * The operation id for the '<em>Requires Filter Old Value Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC = 1;

	/**
	 * The operation id for the '<em>Requires Filter Occurrence Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OCCURRENCE_VARIABLE__RVARIABLEDATAINSTANCEINSWC = 2;

	/**
	 * The operation id for the '<em>Provides Read Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC = 3;

	/**
	 * The operation id for the '<em>Provides Receive Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC = 4;

	/**
	 * The number of operations of the '<em>RVariable Data Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_EX_OPERATION_COUNT = 5;

	/**
	 * The number of structural features of the '<em>ROperation Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Call Api</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC = 0;

	/**
	 * The number of operations of the '<em>ROperation Instance In Swc Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC_EX_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Variable Data Instance In Composition Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = 0;

	/**
	 * The number of structural features of the '<em>Assembly Data Instance Connector Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Inter Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX___IS_INTER_PARTITION__ASSEMBLYDATAINSTANCECONNECTOR = 0;

	/**
	 * The number of operations of the '<em>Assembly Data Instance Connector Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Receiver Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_EX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Receiver Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_EX_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Variable Data Instance In Composition Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = 0;

	/**
	 * The number of structural features of the '<em>External Ecu Sender Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Requires Rte Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER = 0;

	/**
	 * The operation id for the '<em>Requires Rte Invalidation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER = 1;

	/**
	 * The operation id for the '<em>Requires Rte Initialization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER = 2;

	/**
	 * The operation id for the '<em>Provides Com Rx Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_CALLBACK__EXTERNALECUSENDER = 3;

	/**
	 * The operation id for the '<em>Provides Com Inv Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INV_CALLBACK__EXTERNALECUSENDER = 4;

	/**
	 * The operation id for the '<em>Provides Com Rx TOut Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_TOUT_CALLBACK__EXTERNALECUSENDER = 5;

	/**
	 * The operation id for the '<em>Provides Com Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER = 6;

	/**
	 * The number of operations of the '<em>External Ecu Sender Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_EX_OPERATION_COUNT = 7;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuReceiverExImpl <em>External Ecu Receiver Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuReceiverExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExternalEcuReceiverEx()
	 * @generated
	 */
	int EXTERNAL_ECU_RECEIVER_EX = 25;

	/**
	 * The number of structural features of the '<em>External Ecu Receiver Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provides Com Tx And Tx Err Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_AND_TX_ERR_CALLBACK__EXTERNALECURECEIVER = 0;

	/**
	 * The operation id for the '<em>Provides Com Tx TOut Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_TOUT_CALLBACK__EXTERNALECURECEIVER = 1;

	/**
	 * The number of operations of the '<em>External Ecu Receiver Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_EX_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EntityStarterExImpl <em>Entity Starter Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EntityStarterExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getEntityStarterEx()
	 * @generated
	 */
	int ENTITY_STARTER_EX = 26;

	/**
	 * The number of structural features of the '<em>Entity Starter Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Timing Triggering Entity Start Implementations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER = 0;

	/**
	 * The number of operations of the '<em>Entity Starter Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER_EX_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl <em>Bsw Schedulable Entity Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getBswSchedulableEntityEx()
	 * @generated
	 */
	int BSW_SCHEDULABLE_ENTITY_EX = 27;

	/**
	 * The feature id for the '<em><b>Mode Declaration Group Prototype Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX = 0;

	/**
	 * The number of structural features of the '<em>Bsw Schedulable Entity Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Using Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY = 0;

	/**
	 * The operation id for the '<em>Get Call Root Bsw Schedulable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX___GET_CALL_ROOT_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY = 1;

	/**
	 * The operation id for the '<em>Get Mapped Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY = 2;

	/**
	 * The operation id for the '<em>Get Caller Bsw Schedulable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY = 3;

	/**
	 * The operation id for the '<em>Get Caller Bsw Schedulable Entities By Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY = 4;

	/**
	 * The number of operations of the '<em>Bsw Schedulable Entity Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_EX_OPERATION_COUNT = 5;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ModeDeclarationGroupPrototypeExImpl <em>Mode Declaration Group Prototype Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ModeDeclarationGroupPrototypeExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getModeDeclarationGroupPrototypeEx()
	 * @generated
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX = 28;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX__BSW_SCHEDULABLE_ENTITY_EX = 0;

	/**
	 * The number of structural features of the '<em>Mode Declaration Group Prototype Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Using Partition For Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE = 0;

	/**
	 * The operation id for the '<em>Get Using Partition For User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_USER__MODEDECLARATIONGROUPPROTOTYPE = 1;

	/**
	 * The operation id for the '<em>Get Using Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE = 2;

	/**
	 * The operation id for the '<em>Get Mode Manager Bsw Schedulable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_MANAGER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE = 3;

	/**
	 * The operation id for the '<em>Get Mode User Bsw Schedulable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_USER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE = 4;

	/**
	 * The operation id for the '<em>Get Parent Bsw Module Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_PARENT_BSW_MODULE_DESCRIPTION__MODEDECLARATIONGROUPPROTOTYPE = 5;

	/**
	 * The operation id for the '<em>Get Connected Provided Mode Prototypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_CONNECTED_PROVIDED_MODE_PROTOTYPES__MODEDECLARATIONGROUPPROTOTYPE = 6;

	/**
	 * The number of operations of the '<em>Mode Declaration Group Prototype Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_DECLARATION_GROUP_PROTOTYPE_EX_OPERATION_COUNT = 7;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RteEventExImpl <em>Rte Event Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RteEventExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getRteEventEx()
	 * @generated
	 */
	int RTE_EVENT_EX = 29;

	/**
	 * The number of structural features of the '<em>Rte Event Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Related Entity Starter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT = 0;

	/**
	 * The number of operations of the '<em>Rte Event Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EVENT_EX_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComGroupSignalExImpl <em>Com Group Signal Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComGroupSignalExImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComGroupSignalEx()
	 * @generated
	 */
	int COM_GROUP_SIGNAL_EX = 30;

	/**
	 * The number of structural features of the '<em>Com Group Signal Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_EX_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Implementation Record Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_RECORD_ELEMENT__COMGROUPSIGNAL = 0;

	/**
	 * The operation id for the '<em>Get Implementation Array Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_ARRAY_ELEMENT__COMGROUPSIGNAL = 1;

	/**
	 * The number of operations of the '<em>Com Group Signal Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_GROUP_SIGNAL_EX_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx <em>Time Value Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx
	 * @generated
	 */
	EClass getTimeValueEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#isGreaterThanOrEquals(java.math.BigDecimal, java.math.BigDecimal) <em>Is Greater Than Or Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Greater Than Or Equals</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#isGreaterThanOrEquals(java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getTimeValueEx__IsGreaterThanOrEquals__BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#isMultiplesOf(java.math.BigDecimal, java.math.BigDecimal) <em>Is Multiples Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multiples Of</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#isMultiplesOf(java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getTimeValueEx__IsMultiplesOf__BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#subtract(java.math.BigDecimal, java.math.BigDecimal) <em>Subtract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subtract</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx#subtract(java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getTimeValueEx__Subtract__BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx <em>Alignment Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alignment Type Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx
	 * @generated
	 */
	EClass getAlignmentTypeEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx#getMemoryMappingAlignment(java.lang.String) <em>Get Memory Mapping Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Memory Mapping Alignment</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx#getMemoryMappingAlignment(java.lang.String)
	 * @generated
	 */
	EOperation getAlignmentTypeEx__GetMemoryMappingAlignment__String();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx <em>Receiver Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx
	 * @generated
	 */
	EClass getReceiverEx();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx <em>External Ecu Sender Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ecu Sender Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx
	 * @generated
	 */
	EClass getExternalEcuSenderEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#getVariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Data Instance In Composition Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#getVariableDataInstanceInCompositionEx()
	 * @see #getExternalEcuSenderEx()
	 * @generated
	 */
	EReference getExternalEcuSenderEx_VariableDataInstanceInCompositionEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteFilter(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Rte Filter</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteFilter(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__RequiresRteFilter__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteInvalidation(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Invalidation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Rte Invalidation</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteInvalidation(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__RequiresRteInvalidation__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteInitialization(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Initialization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Rte Initialization</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#requiresRteInitialization(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__RequiresRteInitialization__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComRxCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Rx Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Rx Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComRxCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__ProvidesComRxCallback__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComInvCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Inv Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Inv Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComInvCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__ProvidesComInvCallback__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComRxTOutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Rx TOut Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Rx TOut Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComRxTOutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__ProvidesComRxTOutCallback__ExternalEcuSender();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#providesComCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 */
	EOperation getExternalEcuSenderEx__ProvidesComCallback__ExternalEcuSender();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx <em>External Ecu Receiver Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ecu Receiver Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx
	 * @generated
	 */
	EClass getExternalEcuReceiverEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx#providesComTxAndTxErrCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver) <em>Provides Com Tx And Tx Err Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Tx And Tx Err Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx#providesComTxAndTxErrCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver)
	 * @generated
	 */
	EOperation getExternalEcuReceiverEx__ProvidesComTxAndTxErrCallback__ExternalEcuReceiver();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx#providesComTxTOutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver) <em>Provides Com Tx TOut Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Com Tx TOut Callback</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuReceiverEx#providesComTxTOutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver)
	 * @generated
	 */
	EOperation getExternalEcuReceiverEx__ProvidesComTxTOutCallback__ExternalEcuReceiver();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx <em>Entity Starter Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Starter Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx
	 * @generated
	 */
	EClass getEntityStarterEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx#getTimingTriggeringEntityStartImplementations(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter) <em>Get Timing Triggering Entity Start Implementations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Timing Triggering Entity Start Implementations</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx#getTimingTriggeringEntityStartImplementations(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter)
	 * @generated
	 */
	EOperation getEntityStarterEx__GetTimingTriggeringEntityStartImplementations__EntityStarter();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Schedulable Entity Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx
	 * @generated
	 */
	EClass getBswSchedulableEntityEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getModeDeclarationGroupPrototypeEx()
	 * @see #getBswSchedulableEntityEx()
	 * @generated
	 */
	EReference getBswSchedulableEntityEx_ModeDeclarationGroupPrototypeEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Using Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 */
	EOperation getBswSchedulableEntityEx__GetUsingPartition__BswSchedulableEntity();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallRootBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Call Root Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Call Root Bsw Schedulable Entities</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallRootBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 */
	EOperation getBswSchedulableEntityEx__GetCallRootBswSchedulableEntities__BswSchedulableEntity();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Mapped Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapped Tasks</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 */
	EOperation getBswSchedulableEntityEx__GetMappedTasks__BswSchedulableEntity();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller Bsw Schedulable Entities</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 */
	EOperation getBswSchedulableEntityEx__GetCallerBswSchedulableEntities__BswSchedulableEntity();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities By Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller Bsw Schedulable Entities By Mode</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 */
	EOperation getBswSchedulableEntityEx__GetCallerBswSchedulableEntitiesByMode__BswSchedulableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx
	 * @generated
	 */
	EClass getModeDeclarationGroupPrototypeEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getBswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsw Schedulable Entity Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getBswSchedulableEntityEx()
	 * @see #getModeDeclarationGroupPrototypeEx()
	 * @generated
	 */
	EReference getModeDeclarationGroupPrototypeEx_BswSchedulableEntityEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartitionForManager(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Using Partition For Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Partition For Manager</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartitionForManager(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartitionForManager__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartitionForUser(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Using Partition For User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Partition For User</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartitionForUser(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartitionForUser__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Using Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetUsingPartition__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getModeManagerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Mode Manager Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mode Manager Bsw Schedulable Entities</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getModeManagerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetModeManagerBswSchedulableEntities__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getModeUserBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Mode User Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mode User Bsw Schedulable Entities</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getModeUserBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetModeUserBswSchedulableEntities__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getParentBswModuleDescription(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Parent Bsw Module Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Bsw Module Description</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getParentBswModuleDescription(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetParentBswModuleDescription__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getConnectedProvidedModePrototypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype) <em>Get Connected Provided Mode Prototypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connected Provided Mode Prototypes</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx#getConnectedProvidedModePrototypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype)
	 * @generated
	 */
	EOperation getModeDeclarationGroupPrototypeEx__GetConnectedProvidedModePrototypes__ModeDeclarationGroupPrototype();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx <em>Rte Event Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Event Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx
	 * @generated
	 */
	EClass getRteEventEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx#getRelatedEntityStarter(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent) <em>Get Related Entity Starter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Entity Starter</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RteEventEx#getRelatedEntityStarter(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent)
	 * @generated
	 */
	EOperation getRteEventEx__GetRelatedEntityStarter__RteEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx <em>Com Group Signal Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Group Signal Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx
	 * @generated
	 */
	EClass getComGroupSignalEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx#getImplementationRecordElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal) <em>Get Implementation Record Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Record Element</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx#getImplementationRecordElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal)
	 * @generated
	 */
	EOperation getComGroupSignalEx__GetImplementationRecordElement__ComGroupSignal();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx#getImplementationArrayElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal) <em>Get Implementation Array Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Array Element</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx#getImplementationArrayElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal)
	 * @generated
	 */
	EOperation getComGroupSignalEx__GetImplementationArrayElement__ComGroupSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx <em>Assembly Data Instance Connector Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Data Instance Connector Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx
	 * @generated
	 */
	EClass getAssemblyDataInstanceConnectorEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx#getVariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Data Instance In Composition Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx#getVariableDataInstanceInCompositionEx()
	 * @see #getAssemblyDataInstanceConnectorEx()
	 * @generated
	 */
	EReference getAssemblyDataInstanceConnectorEx_VariableDataInstanceInCompositionEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx#isInterPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector) <em>Is Inter Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inter Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx#isInterPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector)
	 * @generated
	 */
	EOperation getAssemblyDataInstanceConnectorEx__IsInterPartition__AssemblyDataInstanceConnector();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Instance In Composition Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx
	 * @generated
	 */
	EClass getVariableDataInstanceInCompositionEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx <em>Value Specification Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Specification Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx()
	 * @see #getVariableDataInstanceInCompositionEx()
	 * @generated
	 */
	EReference getVariableDataInstanceInCompositionEx_ValueSpecificationEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetPartition__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Declaration</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__InitAtDeclaration__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Start</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__InitAtStart__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Partition Restart</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__InitAtPartitionRestart__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Value As Text</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetInitValueAsText__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initialization Strategy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetInitializationStrategy__VariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Section Initialization Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetSectionInitializationPolicy__VariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetInitValue__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiver Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetReceiverInitValue__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sender Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetSenderInitValue__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetSwAddrMethod__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiver Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetReceiverSwAddrMethod__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sender Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__GetSenderSwAddrMethod__VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	EOperation getVariableDataInstanceInCompositionEx__EqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx <em>Com Signal Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Signal Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx
	 * @generated
	 */
	EClass getComSignalEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#getSenderReceiverToSignalMappingEx <em>Sender Receiver To Signal Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#getSenderReceiverToSignalMappingEx()
	 * @see #getComSignalEx()
	 * @generated
	 */
	EReference getComSignalEx_SenderReceiverToSignalMappingEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Sender</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sender</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 */
	EOperation getComSignalEx__IsSender__ComSignal();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Receiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Receiver</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 */
	EOperation getComSignalEx__IsReceiver__ComSignal();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Get Variable Data Instance In Compositions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Data Instance In Compositions</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx#getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 */
	EOperation getComSignalEx__GetVariableDataInstanceInCompositions__ComSignal();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx <em>Com Signal Group Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Signal Group Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx
	 * @generated
	 */
	EClass getComSignalGroupEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getSenderReceiverToSignalGroupMappingEx <em>Sender Receiver To Signal Group Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getSenderReceiverToSignalGroupMappingEx()
	 * @see #getComSignalGroupEx()
	 * @generated
	 */
	EReference getComSignalGroupEx_SenderReceiverToSignalGroupMappingEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup) <em>Is Sender</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sender</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup)
	 * @generated
	 */
	EOperation getComSignalGroupEx__IsSender__ComSignalGroup();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup) <em>Is Receiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Receiver</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup)
	 * @generated
	 */
	EOperation getComSignalGroupEx__IsReceiver__ComSignalGroup();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup) <em>Get Variable Data Instance In Compositions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Data Instance In Compositions</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup)
	 * @generated
	 */
	EOperation getComSignalGroupEx__GetVariableDataInstanceInCompositions__ComSignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx <em>Variable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Instance In Swc Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx
	 * @generated
	 */
	EClass getVariableDataInstanceInSwcEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getAlignmentTypeEx <em>Alignment Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alignment Type Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getAlignmentTypeEx()
	 * @see #getVariableDataInstanceInSwcEx()
	 * @generated
	 */
	EReference getVariableDataInstanceInSwcEx_AlignmentTypeEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#providesInitValueConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Provides Init Value Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Init Value Constant</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#providesInitValueConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwcEx__ProvidesInitValueConstant__VariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getMemoryMappingAlignment(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Memory Mapping Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Memory Mapping Alignment</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getMemoryMappingAlignment(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwcEx__GetMemoryMappingAlignment__VariableDataInstanceInSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx <em>RVariable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RVariable Data Instance In Swc Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx
	 * @generated
	 */
	EClass getRVariableDataInstanceInSwcEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc) <em>Requires Filter Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Filter Variable</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwcEx__RequiresFilterVariable__RVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterOldValueVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc) <em>Requires Filter Old Value Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Filter Old Value Variable</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterOldValueVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwcEx__RequiresFilterOldValueVariable__RVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterOccurrenceVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc) <em>Requires Filter Occurrence Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Filter Occurrence Variable</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#requiresFilterOccurrenceVariable(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwcEx__RequiresFilterOccurrenceVariable__RVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#providesReadApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc) <em>Provides Read Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Read Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#providesReadApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwcEx__ProvidesReadApi__RVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#providesReceiveApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc) <em>Provides Receive Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Receive Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx#providesReceiveApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwcEx__ProvidesReceiveApi__RVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx <em>PVariable Data Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVariable Data Instance In Swc Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx
	 * @generated
	 */
	EClass getPVariableDataInstanceInSwcEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesWriteApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc) <em>Provides Write Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Write Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesWriteApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwcEx__ProvidesWriteApi__PVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesInvalidateApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc) <em>Provides Invalidate Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Invalidate Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesInvalidateApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwcEx__ProvidesInvalidateApi__PVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesSendApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc) <em>Provides Send Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Send Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesSendApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwcEx__ProvidesSendApi__PVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesFeedbackApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc) <em>Provides Feedback Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Feedback Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx#providesFeedbackApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc)
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwcEx__ProvidesFeedbackApi__PVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx <em>ROperation Instance In Swc Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROperation Instance In Swc Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx
	 * @generated
	 */
	EClass getROperationInstanceInSwcEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx#providesCallApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc) <em>Provides Call Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Call Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx#providesCallApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc)
	 * @generated
	 */
	EOperation getROperationInstanceInSwcEx__ProvidesCallApi__ROperationInstanceInSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx <em>Sender Receiver To Signal Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx
	 * @generated
	 */
	EClass getSenderReceiverToSignalMappingEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx#getMappedDataInstanceInComposition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping) <em>Get Mapped Data Instance In Composition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapped Data Instance In Composition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx#getMappedDataInstanceInComposition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping)
	 * @generated
	 */
	EOperation getSenderReceiverToSignalMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx <em>Sender Receiver To Signal Group Mapping Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx
	 * @generated
	 */
	EClass getSenderReceiverToSignalGroupMappingEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx#getMappedDataInstanceInComposition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping) <em>Get Mapped Data Instance In Composition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapped Data Instance In Composition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx#getMappedDataInstanceInComposition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping)
	 * @generated
	 */
	EOperation getSenderReceiverToSignalGroupMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalGroupMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx <em>Os Task Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Task Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx
	 * @generated
	 */
	EClass getOsTaskEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx#getOwnerPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask) <em>Get Owner Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx#getOwnerPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask)
	 * @generated
	 */
	EOperation getOsTaskEx__GetOwnerPartition__OsTask();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx <em>Ecuc Partition Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecuc Partition Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx
	 * @generated
	 */
	EClass getEcucPartitionEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#isInMasterCore(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Is In Master Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Master Core</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#isInMasterCore(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 */
	EOperation getEcucPartitionEx__IsInMasterCore__EcucPartition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#isMasterBswPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Is Master Bsw Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Master Bsw Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#isMasterBswPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 */
	EOperation getEcucPartitionEx__IsMasterBswPartition__EcucPartition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#providesRestartPartitionApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Provides Restart Partition Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Restart Partition Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#providesRestartPartitionApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 */
	EOperation getEcucPartitionEx__ProvidesRestartPartitionApi__EcucPartition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#providesPartitionRestartingApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Provides Partition Restarting Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Partition Restarting Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx#providesPartitionRestartingApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 */
	EOperation getEcucPartitionEx__ProvidesPartitionRestartingApi__EcucPartition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx <em>Variable Data Prototype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Prototype Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx
	 * @generated
	 */
	EClass getVariableDataPrototypeEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Declaration</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__InitAtDeclaration__VariableDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Start</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__InitAtStart__VariableDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init At Partition Restart</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__InitAtPartitionRestart__VariableDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initialization Strategy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__GetInitializationStrategy__VariableDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Section Initialization Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__GetSectionInitializationPolicy__VariableDataPrototype();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 */
	EOperation getVariableDataPrototypeEx__GetSwAddrMethod__VariableDataPrototype();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx <em>Atomic Sw Component Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sw Component Type Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx
	 * @generated
	 */
	EClass getAtomicSwComponentTypeEx();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx <em>Value Specification Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx
	 * @generated
	 */
	EClass getValueSpecificationEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get End Value Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Value Spec</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 */
	EOperation getValueSpecificationEx__GetEndValueSpec__ValueSpecification();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get Value Spec As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value Spec As Text</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 */
	EOperation getValueSpecificationEx__GetValueSpecAsText__ValueSpecification();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For VALUE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is For VALUE</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsForVALUE__ValueSpecification();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For ARRAY</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is For ARRAY</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsForARRAY__ValueSpecification_ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For STRUCTURE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is For STRUCTURE</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsForSTRUCTURE__ValueSpecification_ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For UNION</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is For UNION</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsForUNION__ValueSpecification_ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For DATA REFERENCE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is For DATA REFERENCE</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsForDATA_REFERENCE__ValueSpecification();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getValueSpecificationEx__IsValidValue__ValueSpecification_ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 */
	EOperation getValueSpecificationEx__EqualsInitValue__ValueSpecification_ValueSpecification();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx <em>Nonqueued Sender Com Spec Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx
	 * @generated
	 */
	EClass getNonqueuedSenderComSpecEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx#hasValidInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec) <em>Has Valid Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx#hasValidInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedSenderComSpec)
	 * @generated
	 */
	EOperation getNonqueuedSenderComSpecEx__HasValidInitValue__NonqueuedSenderComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx <em>Compu Method Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu Method Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx
	 * @generated
	 */
	EClass getCompuMethodEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod) <em>Provides Enum Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Enum Constant</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod)
	 * @generated
	 */
	EOperation getCompuMethodEx__ProvidesEnumConstant__CompuMethod();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx <em>Compu Scale Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compu Scale Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx
	 * @generated
	 */
	EClass getCompuScaleEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale) <em>Provides Enum Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Enum Constant</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale)
	 * @generated
	 */
	EOperation getCompuScaleEx__ProvidesEnumConstant__CompuScale();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx#getEnumLiteral(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale) <em>Get Enum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enum Literal</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx#getEnumLiteral(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale)
	 * @generated
	 */
	EOperation getCompuScaleEx__GetEnumLiteral__CompuScale();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx <em>Application Data Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Data Type Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx
	 * @generated
	 */
	EClass getApplicationDataTypeEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx#providesUpperLowerLimitConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Provides Upper Lower Limit Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Upper Lower Limit Constant</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx#providesUpperLowerLimitConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getApplicationDataTypeEx__ProvidesUpperLowerLimitConstant__ApplicationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx <em>Implementation Data Type Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Data Type Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx
	 * @generated
	 */
	EClass getImplementationDataTypeEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#getCompuMethodEx <em>Compu Method Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compu Method Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#getCompuMethodEx()
	 * @see #getImplementationDataTypeEx()
	 * @generated
	 */
	EReference getImplementationDataTypeEx_CompuMethodEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#providesTypeDefinition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Provides Type Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Type Definition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#providesTypeDefinition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 */
	EOperation getImplementationDataTypeEx__ProvidesTypeDefinition__ImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Provides Enum Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Enum Constant</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getImplementationDataTypeEx__ProvidesEnumConstant__ImplementationDataType_ApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#getCompuMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Compu Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Compu Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx#getCompuMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 */
	EOperation getImplementationDataTypeEx__GetCompuMethod__ImplementationDataType_ApplicationDataType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx <em>Exclusive Area Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Area Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx
	 * @generated
	 */
	EClass getExclusiveAreaEx();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getBswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsw Schedulable Entity Ex</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getBswSchedulableEntityEx()
	 * @see #getExclusiveAreaEx()
	 * @generated
	 */
	EReference getExclusiveAreaEx_BswSchedulableEntityEx();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getUsingPartitionsOfBswExclusiveArea(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea) <em>Get Using Partitions Of Bsw Exclusive Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Using Partitions Of Bsw Exclusive Area</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getUsingPartitionsOfBswExclusiveArea(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea)
	 * @generated
	 */
	EOperation getExclusiveAreaEx__GetUsingPartitionsOfBswExclusiveArea__ExclusiveArea();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#providesRteEnterExitApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea) <em>Provides Rte Enter Exit Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Rte Enter Exit Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#providesRteEnterExitApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea)
	 * @generated
	 */
	EOperation getExclusiveAreaEx__ProvidesRteEnterExitApi__ExclusiveArea();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#providesSchmEnterExitApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea) <em>Provides Schm Enter Exit Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Schm Enter Exit Api</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#providesSchmEnterExitApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea)
	 * @generated
	 */
	EOperation getExclusiveAreaEx__ProvidesSchmEnterExitApi__ExclusiveArea();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExFactory getExFactory();

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
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.TimeValueExImpl <em>Time Value Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.TimeValueExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getTimeValueEx()
		 * @generated
		 */
		EClass TIME_VALUE_EX = eINSTANCE.getTimeValueEx();

		/**
		 * The meta object literal for the '<em><b>Is Greater Than Or Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_VALUE_EX___IS_GREATER_THAN_OR_EQUALS__BIGDECIMAL_BIGDECIMAL = eINSTANCE.getTimeValueEx__IsGreaterThanOrEquals__BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Is Multiples Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_VALUE_EX___IS_MULTIPLES_OF__BIGDECIMAL_BIGDECIMAL = eINSTANCE.getTimeValueEx__IsMultiplesOf__BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Subtract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_VALUE_EX___SUBTRACT__BIGDECIMAL_BIGDECIMAL = eINSTANCE.getTimeValueEx__Subtract__BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AlignmentTypeExImpl <em>Alignment Type Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AlignmentTypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAlignmentTypeEx()
		 * @generated
		 */
		EClass ALIGNMENT_TYPE_EX = eINSTANCE.getAlignmentTypeEx();

		/**
		 * The meta object literal for the '<em><b>Get Memory Mapping Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALIGNMENT_TYPE_EX___GET_MEMORY_MAPPING_ALIGNMENT__STRING = eINSTANCE.getAlignmentTypeEx__GetMemoryMappingAlignment__String();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ReceiverExImpl <em>Receiver Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ReceiverExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getReceiverEx()
		 * @generated
		 */
		EClass RECEIVER_EX = eINSTANCE.getReceiverEx();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuSenderExImpl <em>External Ecu Sender Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuSenderExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExternalEcuSenderEx()
		 * @generated
		 */
		EClass EXTERNAL_ECU_SENDER_EX = eINSTANCE.getExternalEcuSenderEx();

		/**
		 * The meta object literal for the '<em><b>Variable Data Instance In Composition Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = eINSTANCE.getExternalEcuSenderEx_VariableDataInstanceInCompositionEx();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__RequiresRteFilter__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Invalidation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__RequiresRteInvalidation__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Initialization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__RequiresRteInitialization__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Provides Com Rx Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_CALLBACK__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__ProvidesComRxCallback__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Provides Com Inv Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INV_CALLBACK__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__ProvidesComInvCallback__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Provides Com Rx TOut Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_TOUT_CALLBACK__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__ProvidesComRxTOutCallback__ExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Provides Com Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER = eINSTANCE.getExternalEcuSenderEx__ProvidesComCallback__ExternalEcuSender();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuReceiverExImpl <em>External Ecu Receiver Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuReceiverExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExternalEcuReceiverEx()
		 * @generated
		 */
		EClass EXTERNAL_ECU_RECEIVER_EX = eINSTANCE.getExternalEcuReceiverEx();

		/**
		 * The meta object literal for the '<em><b>Provides Com Tx And Tx Err Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_AND_TX_ERR_CALLBACK__EXTERNALECURECEIVER = eINSTANCE.getExternalEcuReceiverEx__ProvidesComTxAndTxErrCallback__ExternalEcuReceiver();

		/**
		 * The meta object literal for the '<em><b>Provides Com Tx TOut Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_TOUT_CALLBACK__EXTERNALECURECEIVER = eINSTANCE.getExternalEcuReceiverEx__ProvidesComTxTOutCallback__ExternalEcuReceiver();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EntityStarterExImpl <em>Entity Starter Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EntityStarterExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getEntityStarterEx()
		 * @generated
		 */
		EClass ENTITY_STARTER_EX = eINSTANCE.getEntityStarterEx();

		/**
		 * The meta object literal for the '<em><b>Get Timing Triggering Entity Start Implementations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER = eINSTANCE.getEntityStarterEx__GetTimingTriggeringEntityStartImplementations__EntityStarter();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl <em>Bsw Schedulable Entity Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getBswSchedulableEntityEx()
		 * @generated
		 */
		EClass BSW_SCHEDULABLE_ENTITY_EX = eINSTANCE.getBswSchedulableEntityEx();

		/**
		 * The meta object literal for the '<em><b>Mode Declaration Group Prototype Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX = eINSTANCE.getBswSchedulableEntityEx_ModeDeclarationGroupPrototypeEx();

		/**
		 * The meta object literal for the '<em><b>Get Using Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY = eINSTANCE.getBswSchedulableEntityEx__GetUsingPartition__BswSchedulableEntity();

		/**
		 * The meta object literal for the '<em><b>Get Call Root Bsw Schedulable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_SCHEDULABLE_ENTITY_EX___GET_CALL_ROOT_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY = eINSTANCE.getBswSchedulableEntityEx__GetCallRootBswSchedulableEntities__BswSchedulableEntity();

		/**
		 * The meta object literal for the '<em><b>Get Mapped Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY = eINSTANCE.getBswSchedulableEntityEx__GetMappedTasks__BswSchedulableEntity();

		/**
		 * The meta object literal for the '<em><b>Get Caller Bsw Schedulable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY = eINSTANCE.getBswSchedulableEntityEx__GetCallerBswSchedulableEntities__BswSchedulableEntity();

		/**
		 * The meta object literal for the '<em><b>Get Caller Bsw Schedulable Entities By Mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY = eINSTANCE.getBswSchedulableEntityEx__GetCallerBswSchedulableEntitiesByMode__BswSchedulableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ModeDeclarationGroupPrototypeExImpl <em>Mode Declaration Group Prototype Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ModeDeclarationGroupPrototypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getModeDeclarationGroupPrototypeEx()
		 * @generated
		 */
		EClass MODE_DECLARATION_GROUP_PROTOTYPE_EX = eINSTANCE.getModeDeclarationGroupPrototypeEx();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_DECLARATION_GROUP_PROTOTYPE_EX__BSW_SCHEDULABLE_ENTITY_EX = eINSTANCE.getModeDeclarationGroupPrototypeEx_BswSchedulableEntityEx();

		/**
		 * The meta object literal for the '<em><b>Get Using Partition For Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetUsingPartitionForManager__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Using Partition For User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_USER__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetUsingPartitionForUser__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Using Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetUsingPartition__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Mode Manager Bsw Schedulable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_MANAGER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetModeManagerBswSchedulableEntities__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Mode User Bsw Schedulable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_MODE_USER_BSW_SCHEDULABLE_ENTITIES__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetModeUserBswSchedulableEntities__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Parent Bsw Module Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_PARENT_BSW_MODULE_DESCRIPTION__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetParentBswModuleDescription__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Connected Provided Mode Prototypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_CONNECTED_PROVIDED_MODE_PROTOTYPES__MODEDECLARATIONGROUPPROTOTYPE = eINSTANCE.getModeDeclarationGroupPrototypeEx__GetConnectedProvidedModePrototypes__ModeDeclarationGroupPrototype();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RteEventExImpl <em>Rte Event Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RteEventExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getRteEventEx()
		 * @generated
		 */
		EClass RTE_EVENT_EX = eINSTANCE.getRteEventEx();

		/**
		 * The meta object literal for the '<em><b>Get Related Entity Starter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTE_EVENT_EX___GET_RELATED_ENTITY_STARTER__RTEEVENT = eINSTANCE.getRteEventEx__GetRelatedEntityStarter__RteEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComGroupSignalExImpl <em>Com Group Signal Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComGroupSignalExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComGroupSignalEx()
		 * @generated
		 */
		EClass COM_GROUP_SIGNAL_EX = eINSTANCE.getComGroupSignalEx();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Record Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_RECORD_ELEMENT__COMGROUPSIGNAL = eINSTANCE.getComGroupSignalEx__GetImplementationRecordElement__ComGroupSignal();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Array Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_ARRAY_ELEMENT__COMGROUPSIGNAL = eINSTANCE.getComGroupSignalEx__GetImplementationArrayElement__ComGroupSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AssemblyDataInstanceConnectorExImpl <em>Assembly Data Instance Connector Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AssemblyDataInstanceConnectorExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAssemblyDataInstanceConnectorEx()
		 * @generated
		 */
		EClass ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX = eINSTANCE.getAssemblyDataInstanceConnectorEx();

		/**
		 * The meta object literal for the '<em><b>Variable Data Instance In Composition Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = eINSTANCE.getAssemblyDataInstanceConnectorEx_VariableDataInstanceInCompositionEx();

		/**
		 * The meta object literal for the '<em><b>Is Inter Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX___IS_INTER_PARTITION__ASSEMBLYDATAINSTANCECONNECTOR = eINSTANCE.getAssemblyDataInstanceConnectorEx__IsInterPartition__AssemblyDataInstanceConnector();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInCompositionExImpl <em>Variable Data Instance In Composition Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInCompositionExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataInstanceInCompositionEx()
		 * @generated
		 */
		EClass VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX = eINSTANCE.getVariableDataInstanceInCompositionEx();

		/**
		 * The meta object literal for the '<em><b>Value Specification Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX = eINSTANCE.getVariableDataInstanceInCompositionEx_ValueSpecificationEx();

		/**
		 * The meta object literal for the '<em><b>Get Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetPartition__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Init At Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__InitAtDeclaration__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Init At Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__InitAtStart__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Init At Partition Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__InitAtPartitionRestart__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Init Value As Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE_AS_TEXT__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetInitValueAsText__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Initialization Strategy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAINSTANCEINSWC = eINSTANCE.getVariableDataInstanceInCompositionEx__GetInitializationStrategy__VariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Get Section Initialization Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAINSTANCEINSWC = eINSTANCE.getVariableDataInstanceInCompositionEx__GetSectionInitializationPolicy__VariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Get Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetInitValue__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Receiver Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetReceiverInitValue__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Sender Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetSenderInitValue__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetSwAddrMethod__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Receiver Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetReceiverSwAddrMethod__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Get Sender Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__GetSenderSwAddrMethod__VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Equals Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___EQUALS_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION_VARIABLEDATAINSTANCEINCOMPOSITION = eINSTANCE.getVariableDataInstanceInCompositionEx__EqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl <em>Com Signal Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComSignalEx()
		 * @generated
		 */
		EClass COM_SIGNAL_EX = eINSTANCE.getComSignalEx();

		/**
		 * The meta object literal for the '<em><b>Sender Receiver To Signal Mapping Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX = eINSTANCE.getComSignalEx_SenderReceiverToSignalMappingEx();

		/**
		 * The meta object literal for the '<em><b>Is Sender</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_EX___IS_SENDER__COMSIGNAL = eINSTANCE.getComSignalEx__IsSender__ComSignal();

		/**
		 * The meta object literal for the '<em><b>Is Receiver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL = eINSTANCE.getComSignalEx__IsReceiver__ComSignal();

		/**
		 * The meta object literal for the '<em><b>Get Variable Data Instance In Compositions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL = eINSTANCE.getComSignalEx__GetVariableDataInstanceInCompositions__ComSignal();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalGroupExImpl <em>Com Signal Group Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalGroupExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getComSignalGroupEx()
		 * @generated
		 */
		EClass COM_SIGNAL_GROUP_EX = eINSTANCE.getComSignalGroupEx();

		/**
		 * The meta object literal for the '<em><b>Sender Receiver To Signal Group Mapping Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SIGNAL_GROUP_EX__SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX = eINSTANCE.getComSignalGroupEx_SenderReceiverToSignalGroupMappingEx();

		/**
		 * The meta object literal for the '<em><b>Is Sender</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP = eINSTANCE.getComSignalGroupEx__IsSender__ComSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Is Receiver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_GROUP_EX___IS_RECEIVER__COMSIGNALGROUP = eINSTANCE.getComSignalGroupEx__IsReceiver__ComSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Get Variable Data Instance In Compositions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP = eINSTANCE.getComSignalGroupEx__GetVariableDataInstanceInCompositions__ComSignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInSwcExImpl <em>Variable Data Instance In Swc Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInSwcExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataInstanceInSwcEx()
		 * @generated
		 */
		EClass VARIABLE_DATA_INSTANCE_IN_SWC_EX = eINSTANCE.getVariableDataInstanceInSwcEx();

		/**
		 * The meta object literal for the '<em><b>Alignment Type Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX = eINSTANCE.getVariableDataInstanceInSwcEx_AlignmentTypeEx();

		/**
		 * The meta object literal for the '<em><b>Provides Init Value Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC = eINSTANCE.getVariableDataInstanceInSwcEx__ProvidesInitValueConstant__VariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Get Memory Mapping Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC = eINSTANCE.getVariableDataInstanceInSwcEx__GetMemoryMappingAlignment__VariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RVariableDataInstanceInSwcExImpl <em>RVariable Data Instance In Swc Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.RVariableDataInstanceInSwcExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getRVariableDataInstanceInSwcEx()
		 * @generated
		 */
		EClass RVARIABLE_DATA_INSTANCE_IN_SWC_EX = eINSTANCE.getRVariableDataInstanceInSwcEx();

		/**
		 * The meta object literal for the '<em><b>Requires Filter Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC = eINSTANCE.getRVariableDataInstanceInSwcEx__RequiresFilterVariable__RVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Requires Filter Old Value Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC = eINSTANCE.getRVariableDataInstanceInSwcEx__RequiresFilterOldValueVariable__RVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Requires Filter Occurrence Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OCCURRENCE_VARIABLE__RVARIABLEDATAINSTANCEINSWC = eINSTANCE.getRVariableDataInstanceInSwcEx__RequiresFilterOccurrenceVariable__RVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Provides Read Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC = eINSTANCE.getRVariableDataInstanceInSwcEx__ProvidesReadApi__RVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Provides Receive Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC = eINSTANCE.getRVariableDataInstanceInSwcEx__ProvidesReceiveApi__RVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.PVariableDataInstanceInSwcExImpl <em>PVariable Data Instance In Swc Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.PVariableDataInstanceInSwcExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getPVariableDataInstanceInSwcEx()
		 * @generated
		 */
		EClass PVARIABLE_DATA_INSTANCE_IN_SWC_EX = eINSTANCE.getPVariableDataInstanceInSwcEx();

		/**
		 * The meta object literal for the '<em><b>Provides Write Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC = eINSTANCE.getPVariableDataInstanceInSwcEx__ProvidesWriteApi__PVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Provides Invalidate Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC = eINSTANCE.getPVariableDataInstanceInSwcEx__ProvidesInvalidateApi__PVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Provides Send Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC = eINSTANCE.getPVariableDataInstanceInSwcEx__ProvidesSendApi__PVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Provides Feedback Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC = eINSTANCE.getPVariableDataInstanceInSwcEx__ProvidesFeedbackApi__PVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ROperationInstanceInSwcExImpl <em>ROperation Instance In Swc Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ROperationInstanceInSwcExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getROperationInstanceInSwcEx()
		 * @generated
		 */
		EClass ROPERATION_INSTANCE_IN_SWC_EX = eINSTANCE.getROperationInstanceInSwcEx();

		/**
		 * The meta object literal for the '<em><b>Provides Call Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC = eINSTANCE.getROperationInstanceInSwcEx__ProvidesCallApi__ROperationInstanceInSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalMappingExImpl <em>Sender Receiver To Signal Mapping Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalMappingExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getSenderReceiverToSignalMappingEx()
		 * @generated
		 */
		EClass SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX = eINSTANCE.getSenderReceiverToSignalMappingEx();

		/**
		 * The meta object literal for the '<em><b>Get Mapped Data Instance In Composition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALMAPPING = eINSTANCE.getSenderReceiverToSignalMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalGroupMappingExImpl <em>Sender Receiver To Signal Group Mapping Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.SenderReceiverToSignalGroupMappingExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getSenderReceiverToSignalGroupMappingEx()
		 * @generated
		 */
		EClass SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX = eINSTANCE.getSenderReceiverToSignalGroupMappingEx();

		/**
		 * The meta object literal for the '<em><b>Get Mapped Data Instance In Composition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX___GET_MAPPED_DATA_INSTANCE_IN_COMPOSITION__SENDERRECEIVERTOSIGNALGROUPMAPPING = eINSTANCE.getSenderReceiverToSignalGroupMappingEx__GetMappedDataInstanceInComposition__SenderReceiverToSignalGroupMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.OsTaskExImpl <em>Os Task Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.OsTaskExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getOsTaskEx()
		 * @generated
		 */
		EClass OS_TASK_EX = eINSTANCE.getOsTaskEx();

		/**
		 * The meta object literal for the '<em><b>Get Owner Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OS_TASK_EX___GET_OWNER_PARTITION__OSTASK = eINSTANCE.getOsTaskEx__GetOwnerPartition__OsTask();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EcucPartitionExImpl <em>Ecuc Partition Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.EcucPartitionExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getEcucPartitionEx()
		 * @generated
		 */
		EClass ECUC_PARTITION_EX = eINSTANCE.getEcucPartitionEx();

		/**
		 * The meta object literal for the '<em><b>Is In Master Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION = eINSTANCE.getEcucPartitionEx__IsInMasterCore__EcucPartition();

		/**
		 * The meta object literal for the '<em><b>Is Master Bsw Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION = eINSTANCE.getEcucPartitionEx__IsMasterBswPartition__EcucPartition();

		/**
		 * The meta object literal for the '<em><b>Provides Restart Partition Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION = eINSTANCE.getEcucPartitionEx__ProvidesRestartPartitionApi__EcucPartition();

		/**
		 * The meta object literal for the '<em><b>Provides Partition Restarting Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION = eINSTANCE.getEcucPartitionEx__ProvidesPartitionRestartingApi__EcucPartition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataPrototypeExImpl <em>Variable Data Prototype Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataPrototypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getVariableDataPrototypeEx()
		 * @generated
		 */
		EClass VARIABLE_DATA_PROTOTYPE_EX = eINSTANCE.getVariableDataPrototypeEx();

		/**
		 * The meta object literal for the '<em><b>Init At Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__InitAtDeclaration__VariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Init At Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__InitAtStart__VariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Init At Partition Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__InitAtPartitionRestart__VariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Initialization Strategy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__GetInitializationStrategy__VariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Section Initialization Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__GetSectionInitializationPolicy__VariableDataPrototype();

		/**
		 * The meta object literal for the '<em><b>Get Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE = eINSTANCE.getVariableDataPrototypeEx__GetSwAddrMethod__VariableDataPrototype();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AtomicSwComponentTypeExImpl <em>Atomic Sw Component Type Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.AtomicSwComponentTypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getAtomicSwComponentTypeEx()
		 * @generated
		 */
		EClass ATOMIC_SW_COMPONENT_TYPE_EX = eINSTANCE.getAtomicSwComponentTypeEx();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ValueSpecificationExImpl <em>Value Specification Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ValueSpecificationExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getValueSpecificationEx()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION_EX = eINSTANCE.getValueSpecificationEx();

		/**
		 * The meta object literal for the '<em><b>Get End Value Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION = eINSTANCE.getValueSpecificationEx__GetEndValueSpec__ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Get Value Spec As Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION = eINSTANCE.getValueSpecificationEx__GetValueSpecAsText__ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Is For VALUE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION = eINSTANCE.getValueSpecificationEx__IsForVALUE__ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Is For ARRAY</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = eINSTANCE.getValueSpecificationEx__IsForARRAY__ValueSpecification_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Is For STRUCTURE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = eINSTANCE.getValueSpecificationEx__IsForSTRUCTURE__ValueSpecification_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Is For UNION</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = eINSTANCE.getValueSpecificationEx__IsForUNION__ValueSpecification_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Is For DATA REFERENCE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION = eINSTANCE.getValueSpecificationEx__IsForDATA_REFERENCE__ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Is Valid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE = eINSTANCE.getValueSpecificationEx__IsValidValue__ValueSpecification_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Equals Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION = eINSTANCE.getValueSpecificationEx__EqualsInitValue__ValueSpecification_ValueSpecification();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.NonqueuedSenderComSpecExImpl <em>Nonqueued Sender Com Spec Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.NonqueuedSenderComSpecExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getNonqueuedSenderComSpecEx()
		 * @generated
		 */
		EClass NONQUEUED_SENDER_COM_SPEC_EX = eINSTANCE.getNonqueuedSenderComSpecEx();

		/**
		 * The meta object literal for the '<em><b>Has Valid Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NONQUEUED_SENDER_COM_SPEC_EX___HAS_VALID_INIT_VALUE__NONQUEUEDSENDERCOMSPEC = eINSTANCE.getNonqueuedSenderComSpecEx__HasValidInitValue__NonqueuedSenderComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuMethodExImpl <em>Compu Method Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuMethodExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getCompuMethodEx()
		 * @generated
		 */
		EClass COMPU_METHOD_EX = eINSTANCE.getCompuMethodEx();

		/**
		 * The meta object literal for the '<em><b>Provides Enum Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPU_METHOD_EX___PROVIDES_ENUM_CONSTANT__COMPUMETHOD = eINSTANCE.getCompuMethodEx__ProvidesEnumConstant__CompuMethod();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuScaleExImpl <em>Compu Scale Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.CompuScaleExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getCompuScaleEx()
		 * @generated
		 */
		EClass COMPU_SCALE_EX = eINSTANCE.getCompuScaleEx();

		/**
		 * The meta object literal for the '<em><b>Provides Enum Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE = eINSTANCE.getCompuScaleEx__ProvidesEnumConstant__CompuScale();

		/**
		 * The meta object literal for the '<em><b>Get Enum Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE = eINSTANCE.getCompuScaleEx__GetEnumLiteral__CompuScale();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ApplicationDataTypeExImpl <em>Application Data Type Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ApplicationDataTypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getApplicationDataTypeEx()
		 * @generated
		 */
		EClass APPLICATION_DATA_TYPE_EX = eINSTANCE.getApplicationDataTypeEx();

		/**
		 * The meta object literal for the '<em><b>Provides Upper Lower Limit Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE = eINSTANCE.getApplicationDataTypeEx__ProvidesUpperLowerLimitConstant__ApplicationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ImplementationDataTypeExImpl <em>Implementation Data Type Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ImplementationDataTypeExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getImplementationDataTypeEx()
		 * @generated
		 */
		EClass IMPLEMENTATION_DATA_TYPE_EX = eINSTANCE.getImplementationDataTypeEx();

		/**
		 * The meta object literal for the '<em><b>Compu Method Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX = eINSTANCE.getImplementationDataTypeEx_CompuMethodEx();

		/**
		 * The meta object literal for the '<em><b>Provides Type Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE = eINSTANCE.getImplementationDataTypeEx__ProvidesTypeDefinition__ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Provides Enum Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE = eINSTANCE.getImplementationDataTypeEx__ProvidesEnumConstant__ImplementationDataType_ApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Compu Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE = eINSTANCE.getImplementationDataTypeEx__GetCompuMethod__ImplementationDataType_ApplicationDataType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExclusiveAreaExImpl <em>Exclusive Area Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExclusiveAreaExImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl#getExclusiveAreaEx()
		 * @generated
		 */
		EClass EXCLUSIVE_AREA_EX = eINSTANCE.getExclusiveAreaEx();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_AREA_EX__BSW_SCHEDULABLE_ENTITY_EX = eINSTANCE.getExclusiveAreaEx_BswSchedulableEntityEx();

		/**
		 * The meta object literal for the '<em><b>Get Using Partitions Of Bsw Exclusive Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA = eINSTANCE.getExclusiveAreaEx__GetUsingPartitionsOfBswExclusiveArea__ExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Provides Rte Enter Exit Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA = eINSTANCE.getExclusiveAreaEx__ProvidesRteEnterExitApi__ExclusiveArea();

		/**
		 * The meta object literal for the '<em><b>Provides Schm Enter Exit Api</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA = eINSTANCE.getExclusiveAreaEx__ProvidesSchmEnterExitApi__ExclusiveArea();

	}

} //ExPackage
