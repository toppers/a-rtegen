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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage
 * @generated
 */
public interface ExFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Value Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Value Ex</em>'.
	 * @generated
	 */
	TimeValueEx createTimeValueEx();

	/**
	 * Returns a new object of class '<em>Alignment Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment Type Ex</em>'.
	 * @generated
	 */
	AlignmentTypeEx createAlignmentTypeEx();

	/**
	 * Returns a new object of class '<em>Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver Ex</em>'.
	 * @generated
	 */
	ReceiverEx createReceiverEx();

	/**
	 * Returns a new object of class '<em>External Ecu Sender Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Sender Ex</em>'.
	 * @generated
	 */
	ExternalEcuSenderEx createExternalEcuSenderEx();

	/**
	 * Returns a new object of class '<em>External Ecu Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Receiver Ex</em>'.
	 * @generated
	 */
	ExternalEcuReceiverEx createExternalEcuReceiverEx();

	/**
	 * Returns a new object of class '<em>Entity Starter Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Starter Ex</em>'.
	 * @generated
	 */
	EntityStarterEx createEntityStarterEx();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity Ex</em>'.
	 * @generated
	 */
	BswSchedulableEntityEx createBswSchedulableEntityEx();

	/**
	 * Returns a new object of class '<em>Mode Declaration Group Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @generated
	 */
	ModeDeclarationGroupPrototypeEx createModeDeclarationGroupPrototypeEx();

	/**
	 * Returns a new object of class '<em>Rte Event Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Event Ex</em>'.
	 * @generated
	 */
	RteEventEx createRteEventEx();

	/**
	 * Returns a new object of class '<em>Com Group Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Group Signal Ex</em>'.
	 * @generated
	 */
	ComGroupSignalEx createComGroupSignalEx();

	/**
	 * Returns a new object of class '<em>Assembly Data Instance Connector Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Data Instance Connector Ex</em>'.
	 * @generated
	 */
	AssemblyDataInstanceConnectorEx createAssemblyDataInstanceConnectorEx();

	/**
	 * Returns a new object of class '<em>Variable Data Instance In Composition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Instance In Composition Ex</em>'.
	 * @generated
	 */
	VariableDataInstanceInCompositionEx createVariableDataInstanceInCompositionEx();

	/**
	 * Returns a new object of class '<em>Com Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Ex</em>'.
	 * @generated
	 */
	ComSignalEx createComSignalEx();

	/**
	 * Returns a new object of class '<em>Com Signal Group Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Group Ex</em>'.
	 * @generated
	 */
	ComSignalGroupEx createComSignalGroupEx();

	/**
	 * Returns a new object of class '<em>Variable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	VariableDataInstanceInSwcEx createVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>RVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RVariable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	RVariableDataInstanceInSwcEx createRVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>PVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVariable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	PVariableDataInstanceInSwcEx createPVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>ROperation Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROperation Instance In Swc Ex</em>'.
	 * @generated
	 */
	ROperationInstanceInSwcEx createROperationInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @generated
	 */
	SenderReceiverToSignalMappingEx createSenderReceiverToSignalMappingEx();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @generated
	 */
	SenderReceiverToSignalGroupMappingEx createSenderReceiverToSignalGroupMappingEx();

	/**
	 * Returns a new object of class '<em>Os Task Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Ex</em>'.
	 * @generated
	 */
	OsTaskEx createOsTaskEx();

	/**
	 * Returns a new object of class '<em>Ecuc Partition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Partition Ex</em>'.
	 * @generated
	 */
	EcucPartitionEx createEcucPartitionEx();

	/**
	 * Returns a new object of class '<em>Variable Data Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Prototype Ex</em>'.
	 * @generated
	 */
	VariableDataPrototypeEx createVariableDataPrototypeEx();

	/**
	 * Returns a new object of class '<em>Atomic Sw Component Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Sw Component Type Ex</em>'.
	 * @generated
	 */
	AtomicSwComponentTypeEx createAtomicSwComponentTypeEx();

	/**
	 * Returns a new object of class '<em>Value Specification Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification Ex</em>'.
	 * @generated
	 */
	ValueSpecificationEx createValueSpecificationEx();

	/**
	 * Returns a new object of class '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * @generated
	 */
	NonqueuedSenderComSpecEx createNonqueuedSenderComSpecEx();

	/**
	 * Returns a new object of class '<em>Compu Method Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Method Ex</em>'.
	 * @generated
	 */
	CompuMethodEx createCompuMethodEx();

	/**
	 * Returns a new object of class '<em>Compu Scale Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Scale Ex</em>'.
	 * @generated
	 */
	CompuScaleEx createCompuScaleEx();

	/**
	 * Returns a new object of class '<em>Application Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Data Type Ex</em>'.
	 * @generated
	 */
	ApplicationDataTypeEx createApplicationDataTypeEx();

	/**
	 * Returns a new object of class '<em>Implementation Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Data Type Ex</em>'.
	 * @generated
	 */
	ImplementationDataTypeEx createImplementationDataTypeEx();

	/**
	 * Returns a new object of class '<em>Exclusive Area Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Area Ex</em>'.
	 * @generated
	 */
	ExclusiveAreaEx createExclusiveAreaEx();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExPackage getExPackage();

} //ExFactory
