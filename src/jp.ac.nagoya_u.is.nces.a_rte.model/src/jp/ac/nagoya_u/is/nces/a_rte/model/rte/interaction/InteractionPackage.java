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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface InteractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/rte/interaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionPackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionObjectImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionObject()
	 * @generated
	 */
	int INTERACTION_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionReferrableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionReferrable()
	 * @generated
	 */
	int INTERACTION_REFERRABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REFERRABLE__ID = INTERACTION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REFERRABLE_FEATURE_COUNT = INTERACTION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REFERRABLE_OPERATION_COUNT = INTERACTION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionEndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionEndImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionEnd()
	 * @generated
	 */
	int INTERACTION_END = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_END__ID = INTERACTION_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_END__OWNER_PARTITION = INTERACTION_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_END_FEATURE_COUNT = INTERACTION_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_END___GET_OWNER_CORE = INTERACTION_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_END_OPERATION_COUNT = INTERACTION_REFERRABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SenderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__ID = INTERACTION_END__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__OWNER_PARTITION = INTERACTION_END__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Send Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__SEND_INTERACTION = INTERACTION_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = INTERACTION_END_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___GET_OWNER_CORE = INTERACTION_END___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___HAS_MULTIPLE_RECEIVERS = INTERACTION_END_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___GET_RECEIVERS = INTERACTION_END_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Multiple Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS = INTERACTION_END_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___GET_INTERNAL_ECU_RECEIVERS = INTERACTION_END_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get External Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___GET_EXTERNAL_ECU_RECEIVERS = INTERACTION_END_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Send Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER___HAS_SEND_IMPLEMENTATION = INTERACTION_END_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_OPERATION_COUNT = INTERACTION_END_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl <em>Internal Ecu Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInternalEcuSender()
	 * @generated
	 */
	int INTERNAL_ECU_SENDER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__ID = SENDER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__OWNER_PARTITION = SENDER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Send Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__SEND_INTERACTION = SENDER__SEND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__SOURCE = SENDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TAck Status Variable Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION = SENDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activates On Send Completed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED = SENDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Ecu Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER_FEATURE_COUNT = SENDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___GET_OWNER_CORE = SENDER___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___HAS_MULTIPLE_RECEIVERS = SENDER___HAS_MULTIPLE_RECEIVERS;

	/**
	 * The operation id for the '<em>Get Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___GET_RECEIVERS = SENDER___GET_RECEIVERS;

	/**
	 * The operation id for the '<em>Has Multiple Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS = SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___GET_INTERNAL_ECU_RECEIVERS = SENDER___GET_INTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Get External Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___GET_EXTERNAL_ECU_RECEIVERS = SENDER___GET_EXTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Has Send Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___HAS_SEND_IMPLEMENTATION = SENDER___HAS_SEND_IMPLEMENTATION;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER___IS_EVENT_SEMANTICS = SENDER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Ecu Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_SENDER_OPERATION_COUNT = SENDER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl <em>External Ecu Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExternalEcuSender()
	 * @generated
	 */
	int EXTERNAL_ECU_SENDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__ID = SENDER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__OWNER_PARTITION = SENDER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Send Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__SEND_INTERACTION = SENDER__SEND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Source Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__SOURCE_SIGNAL = SENDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP = SENDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Rte Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER = SENDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Rte Invalidation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION = SENDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requires Rte Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION = SENDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>External Ecu Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_FEATURE_COUNT = SENDER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___GET_OWNER_CORE = SENDER___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___HAS_MULTIPLE_RECEIVERS = SENDER___HAS_MULTIPLE_RECEIVERS;

	/**
	 * The operation id for the '<em>Get Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___GET_RECEIVERS = SENDER___GET_RECEIVERS;

	/**
	 * The operation id for the '<em>Has Multiple Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS = SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___GET_INTERNAL_ECU_RECEIVERS = SENDER___GET_INTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Get External Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___GET_EXTERNAL_ECU_RECEIVERS = SENDER___GET_EXTERNAL_ECU_RECEIVERS;

	/**
	 * The operation id for the '<em>Has Send Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER___HAS_SEND_IMPLEMENTATION = SENDER___HAS_SEND_IMPLEMENTATION;

	/**
	 * The number of operations of the '<em>External Ecu Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_SENDER_OPERATION_COUNT = SENDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ID = INTERACTION_REFERRABLE__ID;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = INTERACTION_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = INTERACTION_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl <em>Send Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSendInteraction()
	 * @generated
	 */
	int SEND_INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION__ID = INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION__SENDER = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION__RECEIVE_INTERACTION = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION__IMPLEMENTATION = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Internal Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION___GET_INTERNAL_ECU_SENDERS = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get External Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION___GET_EXTERNAL_ECU_SENDERS = INTERACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Inter Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION___IS_INTER_CORE = INTERACTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Inter Partition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION___IS_INTER_PARTITION = INTERACTION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Send Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl <em>Receive Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getReceiveInteraction()
	 * @generated
	 */
	int RECEIVE_INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION__ID = INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION__RECEIVER = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION__SEND_INTERACTION = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Buffer Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Buffer Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Receive Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get External Ecu Receivers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS = INTERACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Receives Inter Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION___RECEIVES_INTER_CORE = INTERACTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Receives From Multiple Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES = INTERACTION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Receive Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiverImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__ID = INTERACTION_END__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__OWNER_PARTITION = INTERACTION_END__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Receive Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__RECEIVE_INTERACTION = INTERACTION_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = INTERACTION_END_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER___GET_OWNER_CORE = INTERACTION_END___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER___HAS_MULTIPLE_SENDERS = INTERACTION_END_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER___GET_SENDERS = INTERACTION_END_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER___GET_INTERNAL_ECU_SENDERS = INTERACTION_END_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get External Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER___GET_EXTERNAL_ECU_SENDERS = INTERACTION_END_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = INTERACTION_END_OPERATION_COUNT + 4;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl <em>Internal Ecu Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInternalEcuReceiver()
	 * @generated
	 */
	int INTERNAL_ECU_RECEIVER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__ID = RECEIVER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__OWNER_PARTITION = RECEIVER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Receive Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__RECEIVE_INTERACTION = RECEIVER__RECEIVE_INTERACTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__SOURCE = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activates On Received</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activates On Receive Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Ecu Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_OWNER_CORE = RECEIVER___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___HAS_MULTIPLE_SENDERS = RECEIVER___HAS_MULTIPLE_SENDERS;

	/**
	 * The operation id for the '<em>Get Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_SENDERS = RECEIVER___GET_SENDERS;

	/**
	 * The operation id for the '<em>Get Internal Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_INTERNAL_ECU_SENDERS = RECEIVER___GET_INTERNAL_ECU_SENDERS;

	/**
	 * The operation id for the '<em>Get External Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_EXTERNAL_ECU_SENDERS = RECEIVER___GET_EXTERNAL_ECU_SENDERS;

	/**
	 * The operation id for the '<em>Is Invalidation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___IS_INVALIDATION_ENABLED = RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Handle Invalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_HANDLE_INVALID = RECEIVER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filter Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___IS_FILTER_ENABLED = RECEIVER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___GET_FILTER = RECEIVER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Alive Timeout Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___IS_ALIVE_TIMEOUT_ENABLED = RECEIVER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER___IS_EVENT_SEMANTICS = RECEIVER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Internal Ecu Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ECU_RECEIVER_OPERATION_COUNT = RECEIVER_OPERATION_COUNT + 6;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.VariableImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getVariableImplementation()
	 * @generated
	 */
	int VARIABLE_IMPLEMENTATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__ID = INTERACTION_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__OWNER_PARTITION = INTERACTION_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION_FEATURE_COUNT = INTERACTION_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION_OPERATION_COUNT = INTERACTION_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ValueBufferImplementationImpl <em>Value Buffer Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ValueBufferImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getValueBufferImplementation()
	 * @generated
	 */
	int VALUE_BUFFER_IMPLEMENTATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION__ID = VARIABLE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION = VARIABLE_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION__PARENT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT = VARIABLE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteValueBufferImplementationImpl <em>Rte Value Buffer Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteValueBufferImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRteValueBufferImplementation()
	 * @generated
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION__ID = VALUE_BUFFER_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION = VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION__PARENT = VALUE_BUFFER_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Has Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS = VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS;

	/**
	 * The number of structural features of the '<em>Rte Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT = VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuReceiverImpl <em>External Ecu Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuReceiverImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExternalEcuReceiver()
	 * @generated
	 */
	int EXTERNAL_ECU_RECEIVER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER__ID = RECEIVER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER__OWNER_PARTITION = RECEIVER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Receive Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER__RECEIVE_INTERACTION = RECEIVER__RECEIVE_INTERACTION;

	/**
	 * The feature id for the '<em><b>Source Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Ecu Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER___GET_OWNER_CORE = RECEIVER___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Has Multiple Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER___HAS_MULTIPLE_SENDERS = RECEIVER___HAS_MULTIPLE_SENDERS;

	/**
	 * The operation id for the '<em>Get Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER___GET_SENDERS = RECEIVER___GET_SENDERS;

	/**
	 * The operation id for the '<em>Get Internal Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER___GET_INTERNAL_ECU_SENDERS = RECEIVER___GET_INTERNAL_ECU_SENDERS;

	/**
	 * The operation id for the '<em>Get External Ecu Senders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER___GET_EXTERNAL_ECU_SENDERS = RECEIVER___GET_EXTERNAL_ECU_SENDERS;

	/**
	 * The number of operations of the '<em>External Ecu Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ECU_RECEIVER_OPERATION_COUNT = RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendImplementationImpl <em>Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSendImplementation()
	 * @generated
	 */
	int SEND_IMPLEMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_IMPLEMENTATION__ID = INTERACTION_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_IMPLEMENTATION__PARENT = INTERACTION_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_IMPLEMENTATION_FEATURE_COUNT = INTERACTION_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = INTERACTION_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_IMPLEMENTATION_OPERATION_COUNT = INTERACTION_REFERRABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteSendImplementationImpl <em>Rte Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRteSendImplementation()
	 * @generated
	 */
	int RTE_SEND_IMPLEMENTATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SEND_IMPLEMENTATION__ID = SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SEND_IMPLEMENTATION__PARENT = SEND_IMPLEMENTATION__PARENT;

	/**
	 * The number of structural features of the '<em>Rte Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SEND_IMPLEMENTATION_FEATURE_COUNT = SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Rte Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SEND_IMPLEMENTATION_OPERATION_COUNT = SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocSendImplementationImpl <em>Ioc Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getIocSendImplementation()
	 * @generated
	 */
	int IOC_SEND_IMPLEMENTATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION__ID = SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION__PARENT = SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Os Ioc Sender Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION__OS_IOC_SENDER_PROPERTIES = SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION_FEATURE_COUNT = SEND_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Ioc Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_IMPLEMENTATION_OPERATION_COUNT = SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl <em>Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendImplementation()
	 * @generated
	 */
	int COM_SEND_IMPLEMENTATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION__ID = SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION__PARENT = SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION__COM_SIGNAL = SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = SEND_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION_FEATURE_COUNT = SEND_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_IMPLEMENTATION_OPERATION_COUNT = SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.DirectComSendImplementationImpl <em>Direct Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.DirectComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getDirectComSendImplementation()
	 * @generated
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION__ID = COM_SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION__PARENT = COM_SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION__COM_SIGNAL = COM_SEND_IMPLEMENTATION__COM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;

	/**
	 * The number of structural features of the '<em>Direct Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION_FEATURE_COUNT = COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Direct Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_IMPLEMENTATION_OPERATION_COUNT = COM_SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionComSendImplementationImpl <em>Trusted Function Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTrustedFunctionComSendImplementation()
	 * @generated
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__ID = COM_SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__PARENT = COM_SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__COM_SIGNAL = COM_SEND_IMPLEMENTATION__COM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Os Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__OS_TRUSTED_FUNCTION = COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trusted Function Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION_FEATURE_COUNT = COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Trusted Function Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION_OPERATION_COUNT = COM_SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ProxyComSendImplementationImpl <em>Proxy Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ProxyComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getProxyComSendImplementation()
	 * @generated
	 */
	int PROXY_COM_SEND_IMPLEMENTATION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION__ID = COM_SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION__PARENT = COM_SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL = COM_SEND_IMPLEMENTATION__COM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Proxy Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION = COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION_FEATURE_COUNT = COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_IMPLEMENTATION_OPERATION_COUNT = COM_SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicProxyComSendImplementationImpl <em>Periodic Proxy Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicProxyComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPeriodicProxyComSendImplementation()
	 * @generated
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION__ID = PROXY_COM_SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION__PARENT = PROXY_COM_SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL = PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Proxy Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION = PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;

	/**
	 * The number of structural features of the '<em>Periodic Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION_FEATURE_COUNT = PROXY_COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = PROXY_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Periodic Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_IMPLEMENTATION_OPERATION_COUNT = PROXY_COM_SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateProxyComSendImplementationImpl <em>Immediate Proxy Com Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateProxyComSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getImmediateProxyComSendImplementation()
	 * @generated
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION__ID = PROXY_COM_SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION__PARENT = PROXY_COM_SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL = PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = PROXY_COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Proxy Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION = PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;

	/**
	 * The number of structural features of the '<em>Immediate Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION_FEATURE_COUNT = PROXY_COM_SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = PROXY_COM_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Immediate Proxy Com Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION_OPERATION_COUNT = PROXY_COM_SEND_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TAckStatusVariableImplementationImpl <em>TAck Status Variable Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TAckStatusVariableImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTAckStatusVariableImplementation()
	 * @generated
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION__ID = VARIABLE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION__OWNER_PARTITION = VARIABLE_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION__PARENT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TAck Status Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION_FEATURE_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TAck Status Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACK_STATUS_VARIABLE_IMPLEMENTATION_OPERATION_COUNT = VARIABLE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.FilterBufferImplementationImpl <em>Filter Buffer Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.FilterBufferImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getFilterBufferImplementation()
	 * @generated
	 */
	int FILTER_BUFFER_IMPLEMENTATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_BUFFER_IMPLEMENTATION__ID = VARIABLE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_BUFFER_IMPLEMENTATION__OWNER_PARTITION = VARIABLE_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_BUFFER_IMPLEMENTATION__PARENT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_BUFFER_IMPLEMENTATION_FEATURE_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_BUFFER_IMPLEMENTATION_OPERATION_COUNT = VARIABLE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocValueBufferImplementationImpl <em>Ioc Value Buffer Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocValueBufferImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getIocValueBufferImplementation()
	 * @generated
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION__ID = VALUE_BUFFER_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION = VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION__PARENT = VALUE_BUFFER_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Has Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS = VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS;

	/**
	 * The feature id for the '<em><b>Os Ioc Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION__OS_IOC_COMMUNICATION = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT = VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComValueBufferImplementationImpl <em>Com Value Buffer Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComValueBufferImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComValueBufferImplementation()
	 * @generated
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__ID = VALUE_BUFFER_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION = VALUE_BUFFER_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__PARENT = VALUE_BUFFER_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Has Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS = VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS;

	/**
	 * The feature id for the '<em><b>Com Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL_GROUP = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT = VALUE_BUFFER_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Value Buffer Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT = VALUE_BUFFER_IMPLEMENTATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionRoot()
	 * @generated
	 */
	int INTERACTION_ROOT = 26;

	/**
	 * The feature id for the '<em><b>Interaction End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ROOT__INTERACTION_END = 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ROOT__INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Generated Ecu Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ROOT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl <em>Trusted Function Rte Send Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTrustedFunctionRteSendImplementation()
	 * @generated
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__ID = SEND_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__PARENT = SEND_IMPLEMENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Write Os Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION = SEND_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalidate Os Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION = SEND_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trusted Function Rte Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION_FEATURE_COUNT = SEND_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;

	/**
	 * The number of operations of the '<em>Trusted Function Rte Send Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION_OPERATION_COUNT = SEND_IMPLEMENTATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl <em>Com Send Proxy Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendProxyInteraction()
	 * @generated
	 */
	int COM_SEND_PROXY_INTERACTION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__ID = INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Requester Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Request Os Ioc Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Os Ioc Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION__PROXY = INTERACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Com Send Proxy Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Com Send Proxy Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyImpl <em>Com Send Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendProxy()
	 * @generated
	 */
	int COM_SEND_PROXY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY__ID = INTERACTION_END__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY__OWNER_PARTITION = INTERACTION_END__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY__INTERACTION = INTERACTION_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_FEATURE_COUNT = INTERACTION_END_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY___GET_OWNER_CORE = INTERACTION_END___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Get Requester Os Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS = INTERACTION_END_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION_COUNT = INTERACTION_END_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicComSendProxyImpl <em>Periodic Com Send Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicComSendProxyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPeriodicComSendProxy()
	 * @generated
	 */
	int PERIODIC_COM_SEND_PROXY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY__ID = COM_SEND_PROXY__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY__OWNER_PARTITION = COM_SEND_PROXY__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY__INTERACTION = COM_SEND_PROXY__INTERACTION;

	/**
	 * The number of structural features of the '<em>Periodic Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY_FEATURE_COUNT = COM_SEND_PROXY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY___GET_OWNER_CORE = COM_SEND_PROXY___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Get Requester Os Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS = COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS;

	/**
	 * The number of operations of the '<em>Periodic Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_COM_SEND_PROXY_OPERATION_COUNT = COM_SEND_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateComSendProxyImpl <em>Immediate Com Send Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateComSendProxyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getImmediateComSendProxy()
	 * @generated
	 */
	int IMMEDIATE_COM_SEND_PROXY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY__ID = COM_SEND_PROXY__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY__OWNER_PARTITION = COM_SEND_PROXY__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY__INTERACTION = COM_SEND_PROXY__INTERACTION;

	/**
	 * The feature id for the '<em><b>Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY__OS_EVENT = COM_SEND_PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY_FEATURE_COUNT = COM_SEND_PROXY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY___GET_OWNER_CORE = COM_SEND_PROXY___GET_OWNER_CORE;

	/**
	 * The operation id for the '<em>Get Requester Os Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS = COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS;

	/**
	 * The number of operations of the '<em>Immediate Com Send Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_COM_SEND_PROXY_OPERATION_COUNT = COM_SEND_PROXY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExecutionContext()
	 * @generated
	 */
	int EXECUTION_CONTEXT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__ID = INTERACTION_END__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__OWNER_PARTITION = INTERACTION_END__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Source Os Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__SOURCE_OS_TASK = INTERACTION_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Context Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__EXECUTION_CONTEXT_IMPLEMENTATION = INTERACTION_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Starter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__ENTITY_STARTER = INTERACTION_END_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_FEATURE_COUNT = INTERACTION_END_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_OWNER_CORE = INTERACTION_END___GET_OWNER_CORE;

	/**
	 * The number of operations of the '<em>Execution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_OPERATION_COUNT = INTERACTION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImplementationImpl <em>Execution Context Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExecutionContextImplementation()
	 * @generated
	 */
	int EXECUTION_CONTEXT_IMPLEMENTATION = 35;

	/**
	 * The number of structural features of the '<em>Execution Context Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_IMPLEMENTATION_FEATURE_COUNT = INTERACTION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Context Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_IMPLEMENTATION_OPERATION_COUNT = INTERACTION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InfiniteloopImplementationImpl <em>Infiniteloop Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InfiniteloopImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInfiniteloopImplementation()
	 * @generated
	 */
	int INFINITELOOP_IMPLEMENTATION = 36;

	/**
	 * The number of structural features of the '<em>Infiniteloop Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITELOOP_IMPLEMENTATION_FEATURE_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infiniteloop Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITELOOP_IMPLEMENTATION_OPERATION_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OneShootImplementationImpl <em>One Shoot Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OneShootImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOneShootImplementation()
	 * @generated
	 */
	int ONE_SHOOT_IMPLEMENTATION = 37;

	/**
	 * The number of structural features of the '<em>One Shoot Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_SHOOT_IMPLEMENTATION_FEATURE_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Shoot Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_SHOOT_IMPLEMENTATION_OPERATION_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventPoolingImplementationImpl <em>Event Pooling Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventPoolingImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEventPoolingImplementation()
	 * @generated
	 */
	int EVENT_POOLING_IMPLEMENTATION = 38;

	/**
	 * The number of structural features of the '<em>Event Pooling Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_POOLING_IMPLEMENTATION_FEATURE_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Pooling Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_POOLING_IMPLEMENTATION_OPERATION_COUNT = EXECUTION_CONTEXT_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl <em>Entity Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStarter()
	 * @generated
	 */
	int ENTITY_STARTER = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__ID = INTERACTION_END__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__OWNER_PARTITION = INTERACTION_END__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__EXECUTION_CONTEXT = INTERACTION_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__EXPECTED_CONFIG = INTERACTION_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__START_INTERACTION = INTERACTION_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Offset Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION = INTERACTION_END_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cycle Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION = INTERACTION_END_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER_FEATURE_COUNT = INTERACTION_END_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER___GET_OWNER_CORE = INTERACTION_END___GET_OWNER_CORE;

	/**
	 * The number of operations of the '<em>Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STARTER_OPERATION_COUNT = INTERACTION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsTaskActivateEntityStarterImpl <em>Os Task Activate Entity Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsTaskActivateEntityStarterImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOsTaskActivateEntityStarter()
	 * @generated
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__ID = ENTITY_STARTER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__OWNER_PARTITION = ENTITY_STARTER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__EXECUTION_CONTEXT = ENTITY_STARTER__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Expected Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__EXPECTED_CONFIG = ENTITY_STARTER__EXPECTED_CONFIG;

	/**
	 * The feature id for the '<em><b>Start Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__START_INTERACTION = ENTITY_STARTER__START_INTERACTION;

	/**
	 * The feature id for the '<em><b>Start Offset Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION = ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Cycle Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION = ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Source Os Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK = ENTITY_STARTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Task Activate Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER_FEATURE_COUNT = ENTITY_STARTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER___GET_OWNER_CORE = ENTITY_STARTER___GET_OWNER_CORE;

	/**
	 * The number of operations of the '<em>Os Task Activate Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATE_ENTITY_STARTER_OPERATION_COUNT = ENTITY_STARTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl <em>Os Event Set Entity Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOsEventSetEntityStarter()
	 * @generated
	 */
	int OS_EVENT_SET_ENTITY_STARTER = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__ID = ENTITY_STARTER__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__OWNER_PARTITION = ENTITY_STARTER__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__EXECUTION_CONTEXT = ENTITY_STARTER__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Expected Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__EXPECTED_CONFIG = ENTITY_STARTER__EXPECTED_CONFIG;

	/**
	 * The feature id for the '<em><b>Start Interaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__START_INTERACTION = ENTITY_STARTER__START_INTERACTION;

	/**
	 * The feature id for the '<em><b>Start Offset Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION = ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Cycle Counter Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION = ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Source Os Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK = ENTITY_STARTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT = ENTITY_STARTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Event Set Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER_FEATURE_COUNT = ENTITY_STARTER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Owner Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER___GET_OWNER_CORE = ENTITY_STARTER___GET_OWNER_CORE;

	/**
	 * The number of operations of the '<em>Os Event Set Entity Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ENTITY_STARTER_OPERATION_COUNT = ENTITY_STARTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl <em>Entity Start Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStartInteraction()
	 * @generated
	 */
	int ENTITY_START_INTERACTION = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__ID = INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__STARTER = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__IMPLEMENTATION = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__ACTIVATION_OFFSET = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__POSITION_IN_TASK = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__START_ON_EVENT = INTERACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timing Triggering Entity Start Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION = INTERACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartConditionImpl <em>Timing Triggering Entity Start Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartConditionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTimingTriggeringEntityStartCondition()
	 * @generated
	 */
	int TIMING_TRIGGERING_ENTITY_START_CONDITION = 43;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_CONDITION__PERIOD = INTERACTION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timing Triggering Entity Start Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_CONDITION_FEATURE_COUNT = INTERACTION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timing Triggering Entity Start Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_CONDITION_OPERATION_COUNT = INTERACTION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartImplementationImpl <em>Entity Start Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStartImplementation()
	 * @generated
	 */
	int ENTITY_START_IMPLEMENTATION = 46;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl <em>Timing Triggering Entity Start Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTimingTriggeringEntityStartImplementation()
	 * @generated
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION = 47;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RunnableEntityStartInteractionImpl <em>Runnable Entity Start Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RunnableEntityStartInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRunnableEntityStartInteraction()
	 * @generated
	 */
	int RUNNABLE_ENTITY_START_INTERACTION = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__ID = ENTITY_START_INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__STARTER = ENTITY_START_INTERACTION__STARTER;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__IMPLEMENTATION = ENTITY_START_INTERACTION__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__ACTIVATION_OFFSET = ENTITY_START_INTERACTION__ACTIVATION_OFFSET;

	/**
	 * The feature id for the '<em><b>Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__POSITION_IN_TASK = ENTITY_START_INTERACTION__POSITION_IN_TASK;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__START_ON_EVENT = ENTITY_START_INTERACTION__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Timing Triggering Entity Start Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION = ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION__SOURCE_EVENT = ENTITY_START_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runnable Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION_FEATURE_COUNT = ENTITY_START_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runnable Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_START_INTERACTION_OPERATION_COUNT = ENTITY_START_INTERACTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.StartOffsetCounterImplementationImpl <em>Start Offset Counter Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.StartOffsetCounterImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getStartOffsetCounterImplementation()
	 * @generated
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION = 49;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.CycleCounterImplementationImpl <em>Cycle Counter Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.CycleCounterImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getCycleCounterImplementation()
	 * @generated
	 */
	int CYCLE_COUNTER_IMPLEMENTATION = 50;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl <em>Generated Ecu Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getGeneratedEcuConfiguration()
	 * @generated
	 */
	int GENERATED_ECU_CONFIGURATION = 51;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.BswSchedulableEntityStartInteractionImpl <em>Bsw Schedulable Entity Start Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.BswSchedulableEntityStartInteractionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getBswSchedulableEntityStartInteraction()
	 * @generated
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__ID = ENTITY_START_INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__STARTER = ENTITY_START_INTERACTION__STARTER;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__IMPLEMENTATION = ENTITY_START_INTERACTION__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__ACTIVATION_OFFSET = ENTITY_START_INTERACTION__ACTIVATION_OFFSET;

	/**
	 * The feature id for the '<em><b>Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__POSITION_IN_TASK = ENTITY_START_INTERACTION__POSITION_IN_TASK;

	/**
	 * The feature id for the '<em><b>Start On Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__START_ON_EVENT = ENTITY_START_INTERACTION__START_ON_EVENT;

	/**
	 * The feature id for the '<em><b>Timing Triggering Entity Start Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION = ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION__SOURCE_EVENT = ENTITY_START_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Schedulable Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION_FEATURE_COUNT = ENTITY_START_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Schedulable Entity Start Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_START_INTERACTION_OPERATION_COUNT = ENTITY_START_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_IMPLEMENTATION_FEATURE_COUNT = INTERACTION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_START_IMPLEMENTATION_OPERATION_COUNT = INTERACTION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cycle Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD = ENTITY_START_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET = ENTITY_START_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing Triggering Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION_FEATURE_COUNT = ENTITY_START_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Cycle Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET = ENTITY_START_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Requires Cycle Adjust</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST = ENTITY_START_IMPLEMENTATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Requires Start Offset Adjust</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST = ENTITY_START_IMPLEMENTATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timing Triggering Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION_OPERATION_COUNT = ENTITY_START_IMPLEMENTATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PlainEntityStartImplementationImpl <em>Plain Entity Start Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PlainEntityStartImplementationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPlainEntityStartImplementation()
	 * @generated
	 */
	int PLAIN_ENTITY_START_IMPLEMENTATION = 48;

	/**
	 * The number of structural features of the '<em>Plain Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_ENTITY_START_IMPLEMENTATION_FEATURE_COUNT = ENTITY_START_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plain Entity Start Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_ENTITY_START_IMPLEMENTATION_OPERATION_COUNT = ENTITY_START_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION__ID = VARIABLE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION__OWNER_PARTITION = VARIABLE_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION__MAX_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION__PARENT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Offset Counter Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION_FEATURE_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Offset Counter Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTER_IMPLEMENTATION_OPERATION_COUNT = VARIABLE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION__ID = VARIABLE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION__OWNER_PARTITION = VARIABLE_IMPLEMENTATION__OWNER_PARTITION;

	/**
	 * The feature id for the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION__MAX_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION__PARENT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cycle Counter Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION_FEATURE_COUNT = VARIABLE_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cycle Counter Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTER_IMPLEMENTATION_OPERATION_COUNT = VARIABLE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated Os Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK = INTERACTION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated Os Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT = INTERACTION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generated Os Spinlock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK = INTERACTION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generated Os Ioc Communication</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION = INTERACTION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Os Trusted Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION = INTERACTION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generated Ecu Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION_FEATURE_COUNT = INTERACTION_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Generated Ecu Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ECU_CONFIGURATION_OPERATION_COUNT = INTERACTION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionObject
	 * @generated
	 */
	EClass getInteractionObject();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable
	 * @generated
	 */
	EClass getInteractionReferrable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable#getId()
	 * @see #getInteractionReferrable()
	 * @generated
	 */
	EAttribute getInteractionReferrable_Id();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction()
	 * @see #getSender()
	 * @generated
	 */
	EReference getSender_SendInteraction();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasMultipleReceivers() <em>Has Multiple Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Multiple Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasMultipleReceivers()
	 * @generated
	 */
	EOperation getSender__HasMultipleReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getReceivers() <em>Get Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getReceivers()
	 * @generated
	 */
	EOperation getSender__GetReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasMultipleInternalEcuReceivers() <em>Has Multiple Internal Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Multiple Internal Ecu Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasMultipleInternalEcuReceivers()
	 * @generated
	 */
	EOperation getSender__HasMultipleInternalEcuReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getInternalEcuReceivers() <em>Get Internal Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getInternalEcuReceivers()
	 * @generated
	 */
	EOperation getSender__GetInternalEcuReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getExternalEcuReceivers() <em>Get External Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Ecu Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getExternalEcuReceivers()
	 * @generated
	 */
	EOperation getSender__GetExternalEcuReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasSendImplementation() <em>Has Send Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Send Implementation</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#hasSendImplementation()
	 * @generated
	 */
	EOperation getSender__HasSendImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender <em>Internal Ecu Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Ecu Sender</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender
	 * @generated
	 */
	EClass getInternalEcuSender();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getSource()
	 * @see #getInternalEcuSender()
	 * @generated
	 */
	EReference getInternalEcuSender_Source();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getTAckStatusVariableImplementation <em>TAck Status Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TAck Status Variable Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getTAckStatusVariableImplementation()
	 * @see #getInternalEcuSender()
	 * @generated
	 */
	EReference getInternalEcuSender_TAckStatusVariableImplementation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getActivatesOnSendCompleted <em>Activates On Send Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activates On Send Completed</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#getActivatesOnSendCompleted()
	 * @see #getInternalEcuSender()
	 * @generated
	 */
	EReference getInternalEcuSender_ActivatesOnSendCompleted();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Event Semantics</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender#isEventSemantics()
	 * @generated
	 */
	EOperation getInternalEcuSender__IsEventSemantics();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender <em>External Ecu Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ecu Sender</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender
	 * @generated
	 */
	EClass getExternalEcuSender();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getSourceSignal <em>Source Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getSourceSignal()
	 * @see #getExternalEcuSender()
	 * @generated
	 */
	EReference getExternalEcuSender_SourceSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getSourceSignalGroup <em>Source Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getSourceSignalGroup()
	 * @see #getExternalEcuSender()
	 * @generated
	 */
	EReference getExternalEcuSender_SourceSignalGroup();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteFilter <em>Requires Rte Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Rte Filter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteFilter()
	 * @see #getExternalEcuSender()
	 * @generated
	 */
	EAttribute getExternalEcuSender_RequiresRteFilter();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteInvalidation <em>Requires Rte Invalidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Rte Invalidation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteInvalidation()
	 * @see #getExternalEcuSender()
	 * @generated
	 */
	EAttribute getExternalEcuSender_RequiresRteInvalidation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteInitialization <em>Requires Rte Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Rte Initialization</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender#getRequiresRteInitialization()
	 * @see #getExternalEcuSender()
	 * @generated
	 */
	EAttribute getExternalEcuSender_RequiresRteInitialization();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction
	 * @generated
	 */
	EClass getSendInteraction();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getSender()
	 * @see #getSendInteraction()
	 * @generated
	 */
	EReference getSendInteraction_Sender();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction()
	 * @see #getSendInteraction()
	 * @generated
	 */
	EReference getSendInteraction_ReceiveInteraction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation()
	 * @see #getSendInteraction()
	 * @generated
	 */
	EReference getSendInteraction_Implementation();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getInternalEcuSenders() <em>Get Internal Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Ecu Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getInternalEcuSenders()
	 * @generated
	 */
	EOperation getSendInteraction__GetInternalEcuSenders();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getExternalEcuSenders() <em>Get External Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Ecu Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getExternalEcuSenders()
	 * @generated
	 */
	EOperation getSendInteraction__GetExternalEcuSenders();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#isInterCore() <em>Is Inter Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inter Core</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#isInterCore()
	 * @generated
	 */
	EOperation getSendInteraction__IsInterCore();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#isInterPartition() <em>Is Inter Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inter Partition</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#isInterPartition()
	 * @generated
	 */
	EOperation getSendInteraction__IsInterPartition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction
	 * @generated
	 */
	EClass getReceiveInteraction();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getReceiver()
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	EReference getReceiveInteraction_Receiver();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction()
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	EReference getReceiveInteraction_SendInteraction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getValueBufferImplementation <em>Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getValueBufferImplementation()
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	EReference getReceiveInteraction_ValueBufferImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getFilterBufferImplementation <em>Filter Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getFilterBufferImplementation()
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	EReference getReceiveInteraction_FilterBufferImplementation();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getInternalEcuReceivers() <em>Get Internal Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Ecu Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getInternalEcuReceivers()
	 * @generated
	 */
	EOperation getReceiveInteraction__GetInternalEcuReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getExternalEcuReceivers() <em>Get External Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Ecu Receivers</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getExternalEcuReceivers()
	 * @generated
	 */
	EOperation getReceiveInteraction__GetExternalEcuReceivers();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#receivesInterCore() <em>Receives Inter Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receives Inter Core</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#receivesInterCore()
	 * @generated
	 */
	EOperation getReceiveInteraction__ReceivesInterCore();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#receivesFromMultipleCores() <em>Receives From Multiple Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receives From Multiple Cores</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#receivesFromMultipleCores()
	 * @generated
	 */
	EOperation getReceiveInteraction__ReceivesFromMultipleCores();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getReceiveInteraction()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_ReceiveInteraction();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getSenders() <em>Get Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getSenders()
	 * @generated
	 */
	EOperation getReceiver__GetSenders();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#hasMultipleSenders() <em>Has Multiple Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Multiple Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#hasMultipleSenders()
	 * @generated
	 */
	EOperation getReceiver__HasMultipleSenders();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getInternalEcuSenders() <em>Get Internal Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Ecu Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getInternalEcuSenders()
	 * @generated
	 */
	EOperation getReceiver__GetInternalEcuSenders();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getExternalEcuSenders() <em>Get External Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Ecu Senders</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getExternalEcuSenders()
	 * @generated
	 */
	EOperation getReceiver__GetExternalEcuSenders();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver <em>Internal Ecu Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Ecu Receiver</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver
	 * @generated
	 */
	EClass getInternalEcuReceiver();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getSource()
	 * @see #getInternalEcuReceiver()
	 * @generated
	 */
	EReference getInternalEcuReceiver_Source();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getActivatesOnReceived <em>Activates On Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activates On Received</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getActivatesOnReceived()
	 * @see #getInternalEcuReceiver()
	 * @generated
	 */
	EReference getInternalEcuReceiver_ActivatesOnReceived();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getActivatesOnReceiveError <em>Activates On Receive Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activates On Receive Error</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getActivatesOnReceiveError()
	 * @see #getInternalEcuReceiver()
	 * @generated
	 */
	EReference getInternalEcuReceiver_ActivatesOnReceiveError();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isInvalidationEnabled()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__IsInvalidationEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getHandleInvalid() <em>Get Handle Invalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Handle Invalid</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getHandleInvalid()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__GetHandleInvalid();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filter Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isFilterEnabled()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__IsFilterEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getFilter() <em>Get Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filter</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#getFilter()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__GetFilter();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isAliveTimeoutEnabled() <em>Is Alive Timeout Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Alive Timeout Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isAliveTimeoutEnabled()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__IsAliveTimeoutEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Event Semantics</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver#isEventSemantics()
	 * @generated
	 */
	EOperation getInternalEcuReceiver__IsEventSemantics();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation <em>Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation
	 * @generated
	 */
	EClass getValueBufferImplementation();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getParent()
	 * @see #getValueBufferImplementation()
	 * @generated
	 */
	EReference getValueBufferImplementation_Parent();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getHasStatus <em>Has Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Status</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getHasStatus()
	 * @see #getValueBufferImplementation()
	 * @generated
	 */
	EAttribute getValueBufferImplementation_HasStatus();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation <em>Rte Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Value Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation
	 * @generated
	 */
	EClass getRteValueBufferImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver <em>External Ecu Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ecu Receiver</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver
	 * @generated
	 */
	EClass getExternalEcuReceiver();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver#getSourceSignal <em>Source Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver#getSourceSignal()
	 * @see #getExternalEcuReceiver()
	 * @generated
	 */
	EReference getExternalEcuReceiver_SourceSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver#getSourceSignalGroup <em>Source Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver#getSourceSignalGroup()
	 * @see #getExternalEcuReceiver()
	 * @generated
	 */
	EReference getExternalEcuReceiver_SourceSignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation <em>Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation
	 * @generated
	 */
	EClass getSendImplementation();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent()
	 * @see #getSendImplementation()
	 * @generated
	 */
	EReference getSendImplementation_Parent();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Event Semantics</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#isEventSemantics()
	 * @generated
	 */
	EOperation getSendImplementation__IsEventSemantics();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation <em>Rte Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation
	 * @generated
	 */
	EClass getRteSendImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation <em>Ioc Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation
	 * @generated
	 */
	EClass getIocSendImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation#getOsIocSenderProperties <em>Os Ioc Sender Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Ioc Sender Properties</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation#getOsIocSenderProperties()
	 * @see #getIocSendImplementation()
	 * @generated
	 */
	EReference getIocSendImplementation_OsIocSenderProperties();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation <em>Direct Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation
	 * @generated
	 */
	EClass getDirectComSendImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation <em>Trusted Function Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation
	 * @generated
	 */
	EClass getTrustedFunctionComSendImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation#getOsTrustedFunction <em>Os Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation#getOsTrustedFunction()
	 * @see #getTrustedFunctionComSendImplementation()
	 * @generated
	 */
	EReference getTrustedFunctionComSendImplementation_OsTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation <em>Periodic Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Proxy Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation
	 * @generated
	 */
	EClass getPeriodicProxyComSendImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation <em>Immediate Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Proxy Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation
	 * @generated
	 */
	EClass getImmediateProxyComSendImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation <em>TAck Status Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAck Status Variable Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation
	 * @generated
	 */
	EClass getTAckStatusVariableImplementation();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation#getParent()
	 * @see #getTAckStatusVariableImplementation()
	 * @generated
	 */
	EReference getTAckStatusVariableImplementation_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation <em>Filter Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation
	 * @generated
	 */
	EClass getFilterBufferImplementation();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation#getParent()
	 * @see #getFilterBufferImplementation()
	 * @generated
	 */
	EReference getFilterBufferImplementation_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation <em>Ioc Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Value Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation
	 * @generated
	 */
	EClass getIocValueBufferImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation#getOsIocCommunication <em>Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation#getOsIocCommunication()
	 * @see #getIocValueBufferImplementation()
	 * @generated
	 */
	EReference getIocValueBufferImplementation_OsIocCommunication();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation <em>Com Value Buffer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Value Buffer Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation
	 * @generated
	 */
	EClass getComValueBufferImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation#getComSignal <em>Com Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation#getComSignal()
	 * @see #getComValueBufferImplementation()
	 * @generated
	 */
	EReference getComValueBufferImplementation_ComSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation#getComSignalGroup <em>Com Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation#getComSignalGroup()
	 * @see #getComValueBufferImplementation()
	 * @generated
	 */
	EReference getComValueBufferImplementation_ComSignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation
	 * @generated
	 */
	EClass getVariableImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation#getOwnerPartition <em>Owner Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.VariableImplementation#getOwnerPartition()
	 * @see #getVariableImplementation()
	 * @generated
	 */
	EReference getVariableImplementation_OwnerPartition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd
	 * @generated
	 */
	EClass getInteractionEnd();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd#getOwnerPartition <em>Owner Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd#getOwnerPartition()
	 * @see #getInteractionEnd()
	 * @generated
	 */
	EReference getInteractionEnd_OwnerPartition();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd#getOwnerCore() <em>Get Owner Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Core</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd#getOwnerCore()
	 * @generated
	 */
	EOperation getInteractionEnd__GetOwnerCore();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation <em>Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation
	 * @generated
	 */
	EClass getComSendImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation#getComSignal <em>Com Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Signal</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation#getComSignal()
	 * @see #getComSendImplementation()
	 * @generated
	 */
	EReference getComSendImplementation_ComSignal();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation#getComSignalGroup <em>Com Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Signal Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation#getComSignalGroup()
	 * @see #getComSendImplementation()
	 * @generated
	 */
	EReference getComSendImplementation_ComSignalGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot
	 * @generated
	 */
	EClass getInteractionRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getInteractionEnd <em>Interaction End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction End</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getInteractionEnd()
	 * @see #getInteractionRoot()
	 * @generated
	 */
	EReference getInteractionRoot_InteractionEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getInteraction()
	 * @see #getInteractionRoot()
	 * @generated
	 */
	EReference getInteractionRoot_Interaction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getGeneratedEcuConfiguration <em>Generated Ecu Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Ecu Configuration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot#getGeneratedEcuConfiguration()
	 * @see #getInteractionRoot()
	 * @generated
	 */
	EReference getInteractionRoot_GeneratedEcuConfiguration();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation <em>Trusted Function Rte Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Rte Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation
	 * @generated
	 */
	EClass getTrustedFunctionRteSendImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation#getWriteOsTrustedFunction <em>Write Os Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write Os Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation#getWriteOsTrustedFunction()
	 * @see #getTrustedFunctionRteSendImplementation()
	 * @generated
	 */
	EReference getTrustedFunctionRteSendImplementation_WriteOsTrustedFunction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation#getInvalidateOsTrustedFunction <em>Invalidate Os Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invalidate Os Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation#getInvalidateOsTrustedFunction()
	 * @see #getTrustedFunctionRteSendImplementation()
	 * @generated
	 */
	EReference getTrustedFunctionRteSendImplementation_InvalidateOsTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation <em>Proxy Com Send Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Com Send Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation
	 * @generated
	 */
	EClass getProxyComSendImplementation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation#getProxyInteraction <em>Proxy Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation#getProxyInteraction()
	 * @see #getProxyComSendImplementation()
	 * @generated
	 */
	EReference getProxyComSendImplementation_ProxyInteraction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction <em>Com Send Proxy Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Proxy Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction
	 * @generated
	 */
	EClass getComSendProxyInteraction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequesterPartition <em>Requester Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requester Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequesterPartition()
	 * @see #getComSendProxyInteraction()
	 * @generated
	 */
	EReference getComSendProxyInteraction_RequesterPartition();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getSignalDataType <em>Signal Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Data Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getSignalDataType()
	 * @see #getComSendProxyInteraction()
	 * @generated
	 */
	EReference getComSendProxyInteraction_SignalDataType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequestOsIocCommunication <em>Request Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getRequestOsIocCommunication()
	 * @see #getComSendProxyInteraction()
	 * @generated
	 */
	EReference getComSendProxyInteraction_RequestOsIocCommunication();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getValueOsIocCommunication <em>Value Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getValueOsIocCommunication()
	 * @see #getComSendProxyInteraction()
	 * @generated
	 */
	EReference getComSendProxyInteraction_ValueOsIocCommunication();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction#getProxy()
	 * @see #getComSendProxyInteraction()
	 * @generated
	 */
	EReference getComSendProxyInteraction_Proxy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy <em>Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Proxy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy
	 * @generated
	 */
	EClass getComSendProxy();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getInteraction()
	 * @see #getComSendProxy()
	 * @generated
	 */
	EReference getComSendProxy_Interaction();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getRequesterOsApplications() <em>Get Requester Os Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Requester Os Applications</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy#getRequesterOsApplications()
	 * @generated
	 */
	EOperation getComSendProxy__GetRequesterOsApplications();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy <em>Periodic Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Com Send Proxy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy
	 * @generated
	 */
	EClass getPeriodicComSendProxy();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy <em>Immediate Com Send Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Com Send Proxy</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy
	 * @generated
	 */
	EClass getImmediateComSendProxy();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy#getOsEvent <em>Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy#getOsEvent()
	 * @see #getImmediateComSendProxy()
	 * @generated
	 */
	EReference getImmediateComSendProxy_OsEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Context</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext
	 * @generated
	 */
	EClass getExecutionContext();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getSourceOsTask <em>Source Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getSourceOsTask()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_SourceOsTask();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getExecutionContextImplementation <em>Execution Context Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Context Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getExecutionContextImplementation()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_ExecutionContextImplementation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getEntityStarter <em>Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Starter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext#getEntityStarter()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_EntityStarter();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContextImplementation <em>Execution Context Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Context Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContextImplementation
	 * @generated
	 */
	EClass getExecutionContextImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation <em>Infiniteloop Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infiniteloop Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation
	 * @generated
	 */
	EClass getInfiniteloopImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation <em>One Shoot Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Shoot Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation
	 * @generated
	 */
	EClass getOneShootImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation <em>Event Pooling Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pooling Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation
	 * @generated
	 */
	EClass getEventPoolingImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter <em>Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Starter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter
	 * @generated
	 */
	EClass getEntityStarter();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Context</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getExecutionContext()
	 * @see #getEntityStarter()
	 * @generated
	 */
	EReference getEntityStarter_ExecutionContext();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getExpectedConfig <em>Expected Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Config</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getExpectedConfig()
	 * @see #getEntityStarter()
	 * @generated
	 */
	EReference getEntityStarter_ExpectedConfig();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getStartInteraction <em>Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getStartInteraction()
	 * @see #getEntityStarter()
	 * @generated
	 */
	EReference getEntityStarter_StartInteraction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getStartOffsetCounterImplementation <em>Start Offset Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Offset Counter Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getStartOffsetCounterImplementation()
	 * @see #getEntityStarter()
	 * @generated
	 */
	EReference getEntityStarter_StartOffsetCounterImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getCycleCounterImplementation <em>Cycle Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cycle Counter Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter#getCycleCounterImplementation()
	 * @see #getEntityStarter()
	 * @generated
	 */
	EReference getEntityStarter_CycleCounterImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter <em>Os Task Activate Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Task Activate Entity Starter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter
	 * @generated
	 */
	EClass getOsTaskActivateEntityStarter();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter#getSourceOsTask <em>Source Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter#getSourceOsTask()
	 * @see #getOsTaskActivateEntityStarter()
	 * @generated
	 */
	EReference getOsTaskActivateEntityStarter_SourceOsTask();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter <em>Os Event Set Entity Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Event Set Entity Starter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter
	 * @generated
	 */
	EClass getOsEventSetEntityStarter();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter#getSourceOsTask <em>Source Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter#getSourceOsTask()
	 * @see #getOsEventSetEntityStarter()
	 * @generated
	 */
	EReference getOsEventSetEntityStarter_SourceOsTask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter#getSourceOsEvent <em>Source Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter#getSourceOsEvent()
	 * @see #getOsEventSetEntityStarter()
	 * @generated
	 */
	EReference getOsEventSetEntityStarter_SourceOsEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction <em>Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Start Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction
	 * @generated
	 */
	EClass getEntityStartInteraction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getStarter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getStarter()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EReference getEntityStartInteraction_Starter();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getImplementation()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EReference getEntityStartInteraction_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getActivationOffset <em>Activation Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getActivationOffset()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EAttribute getEntityStartInteraction_ActivationOffset();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getPositionInTask <em>Position In Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position In Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getPositionInTask()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EAttribute getEntityStartInteraction_PositionInTask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getStartOnEvent <em>Start On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start On Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getStartOnEvent()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EReference getEntityStartInteraction_StartOnEvent();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getTimingTriggeringEntityStartCondition <em>Timing Triggering Entity Start Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Triggering Entity Start Condition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction#getTimingTriggeringEntityStartCondition()
	 * @see #getEntityStartInteraction()
	 * @generated
	 */
	EReference getEntityStartInteraction_TimingTriggeringEntityStartCondition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition <em>Timing Triggering Entity Start Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Triggering Entity Start Condition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition
	 * @generated
	 */
	EClass getTimingTriggeringEntityStartCondition();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartCondition#getPeriod()
	 * @see #getTimingTriggeringEntityStartCondition()
	 * @generated
	 */
	EAttribute getTimingTriggeringEntityStartCondition_Period();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation <em>Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Start Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation
	 * @generated
	 */
	EClass getEntityStartImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation <em>Timing Triggering Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Triggering Entity Start Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation
	 * @generated
	 */
	EClass getTimingTriggeringEntityStartImplementation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getCyclePeriod <em>Cycle Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getCyclePeriod()
	 * @see #getTimingTriggeringEntityStartImplementation()
	 * @generated
	 */
	EAttribute getTimingTriggeringEntityStartImplementation_CyclePeriod();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getStartOffset <em>Start Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getStartOffset()
	 * @see #getTimingTriggeringEntityStartImplementation()
	 * @generated
	 */
	EAttribute getTimingTriggeringEntityStartImplementation_StartOffset();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getCycleOffset() <em>Get Cycle Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cycle Offset</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#getCycleOffset()
	 * @generated
	 */
	EOperation getTimingTriggeringEntityStartImplementation__GetCycleOffset();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#requiresCycleAdjust() <em>Requires Cycle Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Cycle Adjust</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#requiresCycleAdjust()
	 * @generated
	 */
	EOperation getTimingTriggeringEntityStartImplementation__RequiresCycleAdjust();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#requiresStartOffsetAdjust() <em>Requires Start Offset Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Start Offset Adjust</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation#requiresStartOffsetAdjust()
	 * @generated
	 */
	EOperation getTimingTriggeringEntityStartImplementation__RequiresStartOffsetAdjust();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation <em>Plain Entity Start Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Entity Start Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PlainEntityStartImplementation
	 * @generated
	 */
	EClass getPlainEntityStartImplementation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction <em>Runnable Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Entity Start Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction
	 * @generated
	 */
	EClass getRunnableEntityStartInteraction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction#getSourceEvent <em>Source Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction#getSourceEvent()
	 * @see #getRunnableEntityStartInteraction()
	 * @generated
	 */
	EReference getRunnableEntityStartInteraction_SourceEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation <em>Start Offset Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Offset Counter Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation
	 * @generated
	 */
	EClass getStartOffsetCounterImplementation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation#getMaxCount <em>Max Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Count</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation#getMaxCount()
	 * @see #getStartOffsetCounterImplementation()
	 * @generated
	 */
	EAttribute getStartOffsetCounterImplementation_MaxCount();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation#getParent()
	 * @see #getStartOffsetCounterImplementation()
	 * @generated
	 */
	EReference getStartOffsetCounterImplementation_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation <em>Cycle Counter Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle Counter Implementation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation
	 * @generated
	 */
	EClass getCycleCounterImplementation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation#getMaxCount <em>Max Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Count</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation#getMaxCount()
	 * @see #getCycleCounterImplementation()
	 * @generated
	 */
	EAttribute getCycleCounterImplementation_MaxCount();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation#getParent()
	 * @see #getCycleCounterImplementation()
	 * @generated
	 */
	EReference getCycleCounterImplementation_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration <em>Generated Ecu Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Ecu Configuration</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration
	 * @generated
	 */
	EClass getGeneratedEcuConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsTask <em>Generated Os Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Os Task</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsTask()
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 */
	EReference getGeneratedEcuConfiguration_GeneratedOsTask();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsEvent <em>Generated Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Os Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsEvent()
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 */
	EReference getGeneratedEcuConfiguration_GeneratedOsEvent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsSpinlock <em>Generated Os Spinlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Os Spinlock</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsSpinlock()
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 */
	EReference getGeneratedEcuConfiguration_GeneratedOsSpinlock();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsIocCommunication <em>Generated Os Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Os Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsIocCommunication()
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 */
	EReference getGeneratedEcuConfiguration_GeneratedOsIocCommunication();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsTrustedFunction <em>Generated Os Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Os Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration#getGeneratedOsTrustedFunction()
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 */
	EReference getGeneratedEcuConfiguration_GeneratedOsTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction <em>Bsw Schedulable Entity Start Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction
	 * @generated
	 */
	EClass getBswSchedulableEntityStartInteraction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction#getSourceEvent <em>Source Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction#getSourceEvent()
	 * @see #getBswSchedulableEntityStartInteraction()
	 * @generated
	 */
	EReference getBswSchedulableEntityStartInteraction_SourceEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionFactory getInteractionFactory();

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
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionObjectImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionObject()
		 * @generated
		 */
		EClass INTERACTION_OBJECT = eINSTANCE.getInteractionObject();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionReferrableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionReferrable()
		 * @generated
		 */
		EClass INTERACTION_REFERRABLE = eINSTANCE.getInteractionReferrable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REFERRABLE__ID = eINSTANCE.getInteractionReferrable_Id();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SenderImpl <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SenderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '<em><b>Send Interaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER__SEND_INTERACTION = eINSTANCE.getSender_SendInteraction();

		/**
		 * The meta object literal for the '<em><b>Has Multiple Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___HAS_MULTIPLE_RECEIVERS = eINSTANCE.getSender__HasMultipleReceivers();

		/**
		 * The meta object literal for the '<em><b>Get Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___GET_RECEIVERS = eINSTANCE.getSender__GetReceivers();

		/**
		 * The meta object literal for the '<em><b>Has Multiple Internal Ecu Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___HAS_MULTIPLE_INTERNAL_ECU_RECEIVERS = eINSTANCE.getSender__HasMultipleInternalEcuReceivers();

		/**
		 * The meta object literal for the '<em><b>Get Internal Ecu Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___GET_INTERNAL_ECU_RECEIVERS = eINSTANCE.getSender__GetInternalEcuReceivers();

		/**
		 * The meta object literal for the '<em><b>Get External Ecu Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___GET_EXTERNAL_ECU_RECEIVERS = eINSTANCE.getSender__GetExternalEcuReceivers();

		/**
		 * The meta object literal for the '<em><b>Has Send Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENDER___HAS_SEND_IMPLEMENTATION = eINSTANCE.getSender__HasSendImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl <em>Internal Ecu Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuSenderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInternalEcuSender()
		 * @generated
		 */
		EClass INTERNAL_ECU_SENDER = eINSTANCE.getInternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_SENDER__SOURCE = eINSTANCE.getInternalEcuSender_Source();

		/**
		 * The meta object literal for the '<em><b>TAck Status Variable Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_SENDER__TACK_STATUS_VARIABLE_IMPLEMENTATION = eINSTANCE.getInternalEcuSender_TAckStatusVariableImplementation();

		/**
		 * The meta object literal for the '<em><b>Activates On Send Completed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_SENDER__ACTIVATES_ON_SEND_COMPLETED = eINSTANCE.getInternalEcuSender_ActivatesOnSendCompleted();

		/**
		 * The meta object literal for the '<em><b>Is Event Semantics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_SENDER___IS_EVENT_SEMANTICS = eINSTANCE.getInternalEcuSender__IsEventSemantics();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl <em>External Ecu Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExternalEcuSender()
		 * @generated
		 */
		EClass EXTERNAL_ECU_SENDER = eINSTANCE.getExternalEcuSender();

		/**
		 * The meta object literal for the '<em><b>Source Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ECU_SENDER__SOURCE_SIGNAL = eINSTANCE.getExternalEcuSender_SourceSignal();

		/**
		 * The meta object literal for the '<em><b>Source Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP = eINSTANCE.getExternalEcuSender_SourceSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER = eINSTANCE.getExternalEcuSender_RequiresRteFilter();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Invalidation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION = eINSTANCE.getExternalEcuSender_RequiresRteInvalidation();

		/**
		 * The meta object literal for the '<em><b>Requires Rte Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION = eINSTANCE.getExternalEcuSender_RequiresRteInitialization();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl <em>Send Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSendInteraction()
		 * @generated
		 */
		EClass SEND_INTERACTION = eINSTANCE.getSendInteraction();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_INTERACTION__SENDER = eINSTANCE.getSendInteraction_Sender();

		/**
		 * The meta object literal for the '<em><b>Receive Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_INTERACTION__RECEIVE_INTERACTION = eINSTANCE.getSendInteraction_ReceiveInteraction();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_INTERACTION__IMPLEMENTATION = eINSTANCE.getSendInteraction_Implementation();

		/**
		 * The meta object literal for the '<em><b>Get Internal Ecu Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_INTERACTION___GET_INTERNAL_ECU_SENDERS = eINSTANCE.getSendInteraction__GetInternalEcuSenders();

		/**
		 * The meta object literal for the '<em><b>Get External Ecu Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_INTERACTION___GET_EXTERNAL_ECU_SENDERS = eINSTANCE.getSendInteraction__GetExternalEcuSenders();

		/**
		 * The meta object literal for the '<em><b>Is Inter Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_INTERACTION___IS_INTER_CORE = eINSTANCE.getSendInteraction__IsInterCore();

		/**
		 * The meta object literal for the '<em><b>Is Inter Partition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_INTERACTION___IS_INTER_PARTITION = eINSTANCE.getSendInteraction__IsInterPartition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl <em>Receive Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getReceiveInteraction()
		 * @generated
		 */
		EClass RECEIVE_INTERACTION = eINSTANCE.getReceiveInteraction();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_INTERACTION__RECEIVER = eINSTANCE.getReceiveInteraction_Receiver();

		/**
		 * The meta object literal for the '<em><b>Send Interaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_INTERACTION__SEND_INTERACTION = eINSTANCE.getReceiveInteraction_SendInteraction();

		/**
		 * The meta object literal for the '<em><b>Value Buffer Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION = eINSTANCE.getReceiveInteraction_ValueBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Filter Buffer Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION = eINSTANCE.getReceiveInteraction_FilterBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Get Internal Ecu Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS = eINSTANCE.getReceiveInteraction__GetInternalEcuReceivers();

		/**
		 * The meta object literal for the '<em><b>Get External Ecu Receivers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS = eINSTANCE.getReceiveInteraction__GetExternalEcuReceivers();

		/**
		 * The meta object literal for the '<em><b>Receives Inter Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_INTERACTION___RECEIVES_INTER_CORE = eINSTANCE.getReceiveInteraction__ReceivesInterCore();

		/**
		 * The meta object literal for the '<em><b>Receives From Multiple Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES = eINSTANCE.getReceiveInteraction__ReceivesFromMultipleCores();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiverImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '<em><b>Receive Interaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__RECEIVE_INTERACTION = eINSTANCE.getReceiver_ReceiveInteraction();

		/**
		 * The meta object literal for the '<em><b>Get Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVER___GET_SENDERS = eINSTANCE.getReceiver__GetSenders();

		/**
		 * The meta object literal for the '<em><b>Has Multiple Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVER___HAS_MULTIPLE_SENDERS = eINSTANCE.getReceiver__HasMultipleSenders();

		/**
		 * The meta object literal for the '<em><b>Get Internal Ecu Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVER___GET_INTERNAL_ECU_SENDERS = eINSTANCE.getReceiver__GetInternalEcuSenders();

		/**
		 * The meta object literal for the '<em><b>Get External Ecu Senders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVER___GET_EXTERNAL_ECU_SENDERS = eINSTANCE.getReceiver__GetExternalEcuSenders();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl <em>Internal Ecu Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InternalEcuReceiverImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInternalEcuReceiver()
		 * @generated
		 */
		EClass INTERNAL_ECU_RECEIVER = eINSTANCE.getInternalEcuReceiver();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_RECEIVER__SOURCE = eINSTANCE.getInternalEcuReceiver_Source();

		/**
		 * The meta object literal for the '<em><b>Activates On Received</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVED = eINSTANCE.getInternalEcuReceiver_ActivatesOnReceived();

		/**
		 * The meta object literal for the '<em><b>Activates On Receive Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ECU_RECEIVER__ACTIVATES_ON_RECEIVE_ERROR = eINSTANCE.getInternalEcuReceiver_ActivatesOnReceiveError();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___IS_INVALIDATION_ENABLED = eINSTANCE.getInternalEcuReceiver__IsInvalidationEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Handle Invalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___GET_HANDLE_INVALID = eINSTANCE.getInternalEcuReceiver__GetHandleInvalid();

		/**
		 * The meta object literal for the '<em><b>Is Filter Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___IS_FILTER_ENABLED = eINSTANCE.getInternalEcuReceiver__IsFilterEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___GET_FILTER = eINSTANCE.getInternalEcuReceiver__GetFilter();

		/**
		 * The meta object literal for the '<em><b>Is Alive Timeout Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___IS_ALIVE_TIMEOUT_ENABLED = eINSTANCE.getInternalEcuReceiver__IsAliveTimeoutEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Event Semantics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ECU_RECEIVER___IS_EVENT_SEMANTICS = eINSTANCE.getInternalEcuReceiver__IsEventSemantics();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ValueBufferImplementationImpl <em>Value Buffer Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ValueBufferImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getValueBufferImplementation()
		 * @generated
		 */
		EClass VALUE_BUFFER_IMPLEMENTATION = eINSTANCE.getValueBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BUFFER_IMPLEMENTATION__PARENT = eINSTANCE.getValueBufferImplementation_Parent();

		/**
		 * The meta object literal for the '<em><b>Has Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_BUFFER_IMPLEMENTATION__HAS_STATUS = eINSTANCE.getValueBufferImplementation_HasStatus();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteValueBufferImplementationImpl <em>Rte Value Buffer Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteValueBufferImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRteValueBufferImplementation()
		 * @generated
		 */
		EClass RTE_VALUE_BUFFER_IMPLEMENTATION = eINSTANCE.getRteValueBufferImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuReceiverImpl <em>External Ecu Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuReceiverImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExternalEcuReceiver()
		 * @generated
		 */
		EClass EXTERNAL_ECU_RECEIVER = eINSTANCE.getExternalEcuReceiver();

		/**
		 * The meta object literal for the '<em><b>Source Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL = eINSTANCE.getExternalEcuReceiver_SourceSignal();

		/**
		 * The meta object literal for the '<em><b>Source Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP = eINSTANCE.getExternalEcuReceiver_SourceSignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendImplementationImpl <em>Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getSendImplementation()
		 * @generated
		 */
		EClass SEND_IMPLEMENTATION = eINSTANCE.getSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_IMPLEMENTATION__PARENT = eINSTANCE.getSendImplementation_Parent();

		/**
		 * The meta object literal for the '<em><b>Is Event Semantics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS = eINSTANCE.getSendImplementation__IsEventSemantics();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteSendImplementationImpl <em>Rte Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RteSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRteSendImplementation()
		 * @generated
		 */
		EClass RTE_SEND_IMPLEMENTATION = eINSTANCE.getRteSendImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocSendImplementationImpl <em>Ioc Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getIocSendImplementation()
		 * @generated
		 */
		EClass IOC_SEND_IMPLEMENTATION = eINSTANCE.getIocSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Sender Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_SEND_IMPLEMENTATION__OS_IOC_SENDER_PROPERTIES = eINSTANCE.getIocSendImplementation_OsIocSenderProperties();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.DirectComSendImplementationImpl <em>Direct Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.DirectComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getDirectComSendImplementation()
		 * @generated
		 */
		EClass DIRECT_COM_SEND_IMPLEMENTATION = eINSTANCE.getDirectComSendImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionComSendImplementationImpl <em>Trusted Function Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTrustedFunctionComSendImplementation()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION = eINSTANCE.getTrustedFunctionComSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Os Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION__OS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionComSendImplementation_OsTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicProxyComSendImplementationImpl <em>Periodic Proxy Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicProxyComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPeriodicProxyComSendImplementation()
		 * @generated
		 */
		EClass PERIODIC_PROXY_COM_SEND_IMPLEMENTATION = eINSTANCE.getPeriodicProxyComSendImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateProxyComSendImplementationImpl <em>Immediate Proxy Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateProxyComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getImmediateProxyComSendImplementation()
		 * @generated
		 */
		EClass IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION = eINSTANCE.getImmediateProxyComSendImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TAckStatusVariableImplementationImpl <em>TAck Status Variable Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TAckStatusVariableImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTAckStatusVariableImplementation()
		 * @generated
		 */
		EClass TACK_STATUS_VARIABLE_IMPLEMENTATION = eINSTANCE.getTAckStatusVariableImplementation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACK_STATUS_VARIABLE_IMPLEMENTATION__PARENT = eINSTANCE.getTAckStatusVariableImplementation_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.FilterBufferImplementationImpl <em>Filter Buffer Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.FilterBufferImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getFilterBufferImplementation()
		 * @generated
		 */
		EClass FILTER_BUFFER_IMPLEMENTATION = eINSTANCE.getFilterBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_BUFFER_IMPLEMENTATION__PARENT = eINSTANCE.getFilterBufferImplementation_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocValueBufferImplementationImpl <em>Ioc Value Buffer Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.IocValueBufferImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getIocValueBufferImplementation()
		 * @generated
		 */
		EClass IOC_VALUE_BUFFER_IMPLEMENTATION = eINSTANCE.getIocValueBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Os Ioc Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_VALUE_BUFFER_IMPLEMENTATION__OS_IOC_COMMUNICATION = eINSTANCE.getIocValueBufferImplementation_OsIocCommunication();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComValueBufferImplementationImpl <em>Com Value Buffer Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComValueBufferImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComValueBufferImplementation()
		 * @generated
		 */
		EClass COM_VALUE_BUFFER_IMPLEMENTATION = eINSTANCE.getComValueBufferImplementation();

		/**
		 * The meta object literal for the '<em><b>Com Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL = eINSTANCE.getComValueBufferImplementation_ComSignal();

		/**
		 * The meta object literal for the '<em><b>Com Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_VALUE_BUFFER_IMPLEMENTATION__COM_SIGNAL_GROUP = eINSTANCE.getComValueBufferImplementation_ComSignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.VariableImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getVariableImplementation()
		 * @generated
		 */
		EClass VARIABLE_IMPLEMENTATION = eINSTANCE.getVariableImplementation();

		/**
		 * The meta object literal for the '<em><b>Owner Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IMPLEMENTATION__OWNER_PARTITION = eINSTANCE.getVariableImplementation_OwnerPartition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionEndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionEndImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionEnd()
		 * @generated
		 */
		EClass INTERACTION_END = eINSTANCE.getInteractionEnd();

		/**
		 * The meta object literal for the '<em><b>Owner Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_END__OWNER_PARTITION = eINSTANCE.getInteractionEnd_OwnerPartition();

		/**
		 * The meta object literal for the '<em><b>Get Owner Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_END___GET_OWNER_CORE = eINSTANCE.getInteractionEnd__GetOwnerCore();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl <em>Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendImplementation()
		 * @generated
		 */
		EClass COM_SEND_IMPLEMENTATION = eINSTANCE.getComSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Com Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_IMPLEMENTATION__COM_SIGNAL = eINSTANCE.getComSendImplementation_ComSignal();

		/**
		 * The meta object literal for the '<em><b>Com Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP = eINSTANCE.getComSendImplementation_ComSignalGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteractionRoot()
		 * @generated
		 */
		EClass INTERACTION_ROOT = eINSTANCE.getInteractionRoot();

		/**
		 * The meta object literal for the '<em><b>Interaction End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ROOT__INTERACTION_END = eINSTANCE.getInteractionRoot_InteractionEnd();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ROOT__INTERACTION = eINSTANCE.getInteractionRoot_Interaction();

		/**
		 * The meta object literal for the '<em><b>Generated Ecu Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION = eINSTANCE.getInteractionRoot_GeneratedEcuConfiguration();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl <em>Trusted Function Rte Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTrustedFunctionRteSendImplementation()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION = eINSTANCE.getTrustedFunctionRteSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Write Os Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionRteSendImplementation_WriteOsTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Invalidate Os Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionRteSendImplementation_InvalidateOsTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ProxyComSendImplementationImpl <em>Proxy Com Send Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ProxyComSendImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getProxyComSendImplementation()
		 * @generated
		 */
		EClass PROXY_COM_SEND_IMPLEMENTATION = eINSTANCE.getProxyComSendImplementation();

		/**
		 * The meta object literal for the '<em><b>Proxy Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION = eINSTANCE.getProxyComSendImplementation_ProxyInteraction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl <em>Com Send Proxy Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendProxyInteraction()
		 * @generated
		 */
		EClass COM_SEND_PROXY_INTERACTION = eINSTANCE.getComSendProxyInteraction();

		/**
		 * The meta object literal for the '<em><b>Requester Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION = eINSTANCE.getComSendProxyInteraction_RequesterPartition();

		/**
		 * The meta object literal for the '<em><b>Signal Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE = eINSTANCE.getComSendProxyInteraction_SignalDataType();

		/**
		 * The meta object literal for the '<em><b>Request Os Ioc Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION = eINSTANCE.getComSendProxyInteraction_RequestOsIocCommunication();

		/**
		 * The meta object literal for the '<em><b>Value Os Ioc Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION = eINSTANCE.getComSendProxyInteraction_ValueOsIocCommunication();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_INTERACTION__PROXY = eINSTANCE.getComSendProxyInteraction_Proxy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyImpl <em>Com Send Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getComSendProxy()
		 * @generated
		 */
		EClass COM_SEND_PROXY = eINSTANCE.getComSendProxy();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY__INTERACTION = eINSTANCE.getComSendProxy_Interaction();

		/**
		 * The meta object literal for the '<em><b>Get Requester Os Applications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COM_SEND_PROXY___GET_REQUESTER_OS_APPLICATIONS = eINSTANCE.getComSendProxy__GetRequesterOsApplications();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicComSendProxyImpl <em>Periodic Com Send Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PeriodicComSendProxyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPeriodicComSendProxy()
		 * @generated
		 */
		EClass PERIODIC_COM_SEND_PROXY = eINSTANCE.getPeriodicComSendProxy();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateComSendProxyImpl <em>Immediate Com Send Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ImmediateComSendProxyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getImmediateComSendProxy()
		 * @generated
		 */
		EClass IMMEDIATE_COM_SEND_PROXY = eINSTANCE.getImmediateComSendProxy();

		/**
		 * The meta object literal for the '<em><b>Os Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_COM_SEND_PROXY__OS_EVENT = eINSTANCE.getImmediateComSendProxy_OsEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExecutionContext()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT = eINSTANCE.getExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Source Os Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__SOURCE_OS_TASK = eINSTANCE.getExecutionContext_SourceOsTask();

		/**
		 * The meta object literal for the '<em><b>Execution Context Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__EXECUTION_CONTEXT_IMPLEMENTATION = eINSTANCE.getExecutionContext_ExecutionContextImplementation();

		/**
		 * The meta object literal for the '<em><b>Entity Starter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__ENTITY_STARTER = eINSTANCE.getExecutionContext_EntityStarter();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImplementationImpl <em>Execution Context Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExecutionContextImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getExecutionContextImplementation()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT_IMPLEMENTATION = eINSTANCE.getExecutionContextImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InfiniteloopImplementationImpl <em>Infiniteloop Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InfiniteloopImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getInfiniteloopImplementation()
		 * @generated
		 */
		EClass INFINITELOOP_IMPLEMENTATION = eINSTANCE.getInfiniteloopImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OneShootImplementationImpl <em>One Shoot Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OneShootImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOneShootImplementation()
		 * @generated
		 */
		EClass ONE_SHOOT_IMPLEMENTATION = eINSTANCE.getOneShootImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventPoolingImplementationImpl <em>Event Pooling Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventPoolingImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEventPoolingImplementation()
		 * @generated
		 */
		EClass EVENT_POOLING_IMPLEMENTATION = eINSTANCE.getEventPoolingImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl <em>Entity Starter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStarter()
		 * @generated
		 */
		EClass ENTITY_STARTER = eINSTANCE.getEntityStarter();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STARTER__EXECUTION_CONTEXT = eINSTANCE.getEntityStarter_ExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Expected Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STARTER__EXPECTED_CONFIG = eINSTANCE.getEntityStarter_ExpectedConfig();

		/**
		 * The meta object literal for the '<em><b>Start Interaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STARTER__START_INTERACTION = eINSTANCE.getEntityStarter_StartInteraction();

		/**
		 * The meta object literal for the '<em><b>Start Offset Counter Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION = eINSTANCE.getEntityStarter_StartOffsetCounterImplementation();

		/**
		 * The meta object literal for the '<em><b>Cycle Counter Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION = eINSTANCE.getEntityStarter_CycleCounterImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsTaskActivateEntityStarterImpl <em>Os Task Activate Entity Starter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsTaskActivateEntityStarterImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOsTaskActivateEntityStarter()
		 * @generated
		 */
		EClass OS_TASK_ACTIVATE_ENTITY_STARTER = eINSTANCE.getOsTaskActivateEntityStarter();

		/**
		 * The meta object literal for the '<em><b>Source Os Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK = eINSTANCE.getOsTaskActivateEntityStarter_SourceOsTask();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl <em>Os Event Set Entity Starter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getOsEventSetEntityStarter()
		 * @generated
		 */
		EClass OS_EVENT_SET_ENTITY_STARTER = eINSTANCE.getOsEventSetEntityStarter();

		/**
		 * The meta object literal for the '<em><b>Source Os Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK = eINSTANCE.getOsEventSetEntityStarter_SourceOsTask();

		/**
		 * The meta object literal for the '<em><b>Source Os Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT = eINSTANCE.getOsEventSetEntityStarter_SourceOsEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl <em>Entity Start Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStartInteraction()
		 * @generated
		 */
		EClass ENTITY_START_INTERACTION = eINSTANCE.getEntityStartInteraction();

		/**
		 * The meta object literal for the '<em><b>Starter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_START_INTERACTION__STARTER = eINSTANCE.getEntityStartInteraction_Starter();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_START_INTERACTION__IMPLEMENTATION = eINSTANCE.getEntityStartInteraction_Implementation();

		/**
		 * The meta object literal for the '<em><b>Activation Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_START_INTERACTION__ACTIVATION_OFFSET = eINSTANCE.getEntityStartInteraction_ActivationOffset();

		/**
		 * The meta object literal for the '<em><b>Position In Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_START_INTERACTION__POSITION_IN_TASK = eINSTANCE.getEntityStartInteraction_PositionInTask();

		/**
		 * The meta object literal for the '<em><b>Start On Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_START_INTERACTION__START_ON_EVENT = eINSTANCE.getEntityStartInteraction_StartOnEvent();

		/**
		 * The meta object literal for the '<em><b>Timing Triggering Entity Start Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_START_INTERACTION__TIMING_TRIGGERING_ENTITY_START_CONDITION = eINSTANCE.getEntityStartInteraction_TimingTriggeringEntityStartCondition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartConditionImpl <em>Timing Triggering Entity Start Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartConditionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTimingTriggeringEntityStartCondition()
		 * @generated
		 */
		EClass TIMING_TRIGGERING_ENTITY_START_CONDITION = eINSTANCE.getTimingTriggeringEntityStartCondition();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_TRIGGERING_ENTITY_START_CONDITION__PERIOD = eINSTANCE.getTimingTriggeringEntityStartCondition_Period();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartImplementationImpl <em>Entity Start Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getEntityStartImplementation()
		 * @generated
		 */
		EClass ENTITY_START_IMPLEMENTATION = eINSTANCE.getEntityStartImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl <em>Timing Triggering Entity Start Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getTimingTriggeringEntityStartImplementation()
		 * @generated
		 */
		EClass TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION = eINSTANCE.getTimingTriggeringEntityStartImplementation();

		/**
		 * The meta object literal for the '<em><b>Cycle Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD = eINSTANCE.getTimingTriggeringEntityStartImplementation_CyclePeriod();

		/**
		 * The meta object literal for the '<em><b>Start Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET = eINSTANCE.getTimingTriggeringEntityStartImplementation_StartOffset();

		/**
		 * The meta object literal for the '<em><b>Get Cycle Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET = eINSTANCE.getTimingTriggeringEntityStartImplementation__GetCycleOffset();

		/**
		 * The meta object literal for the '<em><b>Requires Cycle Adjust</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST = eINSTANCE.getTimingTriggeringEntityStartImplementation__RequiresCycleAdjust();

		/**
		 * The meta object literal for the '<em><b>Requires Start Offset Adjust</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST = eINSTANCE.getTimingTriggeringEntityStartImplementation__RequiresStartOffsetAdjust();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PlainEntityStartImplementationImpl <em>Plain Entity Start Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.PlainEntityStartImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getPlainEntityStartImplementation()
		 * @generated
		 */
		EClass PLAIN_ENTITY_START_IMPLEMENTATION = eINSTANCE.getPlainEntityStartImplementation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RunnableEntityStartInteractionImpl <em>Runnable Entity Start Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.RunnableEntityStartInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getRunnableEntityStartInteraction()
		 * @generated
		 */
		EClass RUNNABLE_ENTITY_START_INTERACTION = eINSTANCE.getRunnableEntityStartInteraction();

		/**
		 * The meta object literal for the '<em><b>Source Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ENTITY_START_INTERACTION__SOURCE_EVENT = eINSTANCE.getRunnableEntityStartInteraction_SourceEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.StartOffsetCounterImplementationImpl <em>Start Offset Counter Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.StartOffsetCounterImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getStartOffsetCounterImplementation()
		 * @generated
		 */
		EClass START_OFFSET_COUNTER_IMPLEMENTATION = eINSTANCE.getStartOffsetCounterImplementation();

		/**
		 * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_OFFSET_COUNTER_IMPLEMENTATION__MAX_COUNT = eINSTANCE.getStartOffsetCounterImplementation_MaxCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OFFSET_COUNTER_IMPLEMENTATION__PARENT = eINSTANCE.getStartOffsetCounterImplementation_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.CycleCounterImplementationImpl <em>Cycle Counter Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.CycleCounterImplementationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getCycleCounterImplementation()
		 * @generated
		 */
		EClass CYCLE_COUNTER_IMPLEMENTATION = eINSTANCE.getCycleCounterImplementation();

		/**
		 * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYCLE_COUNTER_IMPLEMENTATION__MAX_COUNT = eINSTANCE.getCycleCounterImplementation_MaxCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE_COUNTER_IMPLEMENTATION__PARENT = eINSTANCE.getCycleCounterImplementation_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl <em>Generated Ecu Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getGeneratedEcuConfiguration()
		 * @generated
		 */
		EClass GENERATED_ECU_CONFIGURATION = eINSTANCE.getGeneratedEcuConfiguration();

		/**
		 * The meta object literal for the '<em><b>Generated Os Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK = eINSTANCE.getGeneratedEcuConfiguration_GeneratedOsTask();

		/**
		 * The meta object literal for the '<em><b>Generated Os Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT = eINSTANCE.getGeneratedEcuConfiguration_GeneratedOsEvent();

		/**
		 * The meta object literal for the '<em><b>Generated Os Spinlock</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK = eINSTANCE.getGeneratedEcuConfiguration_GeneratedOsSpinlock();

		/**
		 * The meta object literal for the '<em><b>Generated Os Ioc Communication</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION = eINSTANCE.getGeneratedEcuConfiguration_GeneratedOsIocCommunication();

		/**
		 * The meta object literal for the '<em><b>Generated Os Trusted Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION = eINSTANCE.getGeneratedEcuConfiguration_GeneratedOsTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.BswSchedulableEntityStartInteractionImpl <em>Bsw Schedulable Entity Start Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.BswSchedulableEntityStartInteractionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl#getBswSchedulableEntityStartInteraction()
		 * @generated
		 */
		EClass BSW_SCHEDULABLE_ENTITY_START_INTERACTION = eINSTANCE.getBswSchedulableEntityStartInteraction();

		/**
		 * The meta object literal for the '<em><b>Source Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_SCHEDULABLE_ENTITY_START_INTERACTION__SOURCE_EVENT = eINSTANCE.getBswSchedulableEntityStartInteraction_SourceEvent();

	}

} //InteractionPackage
