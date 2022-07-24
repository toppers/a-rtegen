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

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Prototype Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataPrototypeEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface VariableDataPrototypeEx extends ExtendedEObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 宣言時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtDeclaration(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTEの開始時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtStart(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * パーティションの再起動時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtPartitionRestart(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初期化戦略の取得
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let behavior : ar4x::ecuc::RteInitializationBehavior = ecuc::RteInitializationBehavior.allInstances()\n\t\t\t\t\t->select(rteSectionInitializationPolicy\n\t\t\t\t\t\t->includes(getSectionInitializationPolicy(this_)))\n\t\t\t\t\t->any(true)\n\t\t\t\tin if behavior.oclIsUndefined()\n\t\t\t\t\tthen ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START\n\t\t\t\t\telse behavior.rteInitializationStrategy\n\t\t\t\t\tendif'"
	 * @generated
	 */
	RteInitializationStrategyEnum getInitializationStrategy(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初期化戦略の取得
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swAddrMethod.sectionInitializationPolicy\n\t\t\t\t\tendif'"
	 * @generated
	 */
	String getSectionInitializationPolicy(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SwAddrMethodの取得（再定義型も考慮）
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if not swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen swAddrMethod\n\t\t\t\t\telse if not this_.getImplementationDataType().oclIsUndefined()\n\t\t\t\t\tthen this_.getImplementationDataType().getLeafImplementationDataType()\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod(VariableDataPrototype this_);

} // VariableDataPrototypeEx
