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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Instance In Composition Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx <em>Value Specification Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInCompositionEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface VariableDataInstanceInCompositionEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Value Specification Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specification Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specification Ex</em>' reference.
	 * @see #setValueSpecificationEx(ValueSpecificationEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInCompositionEx_ValueSpecificationEx()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecificationEx getValueSpecificationEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx <em>Value Specification Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Specification Ex</em>' reference.
	 * @see #getValueSpecificationEx()
	 * @generated
	 */
	void setValueSpecificationEx(ValueSpecificationEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swComponentInstance : instance::SwComponentInstanceInSystem = this_.parent.contextComponent.instance\n\t\t\t\t\t->first()\n\t\t\t\tin if swComponentInstance.oclIsUndefined() or swComponentInstance.ownerPartition->isEmpty()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swComponentInstance.ownerPartition->any(true)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EcucPartition getPartition(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 宣言時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtDeclaration(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTEの開始時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtStart(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * パーティションの再起動時に初期化するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	boolean initAtPartitionRestart(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initValue : m2::ValueSpecification = getInitValue(this_)\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse valueSpecificationEx.getValueSpecAsText(initValue)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	String getInitValueAsText(VariableDataInstanceInComposition this_);

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
	RteInitializationStrategyEnum getInitializationStrategy(VariableDataInstanceInSwc this_);

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
	String getSectionInitializationPolicy(VariableDataInstanceInSwc this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初期値を取得する．
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receiverInitValue : m2::ValueSpecification = getReceiverInitValue(this_) , senderInitValue :\n\t\t\t\t\tm2::ValueSpecification = getSenderInitValue(this_)\n\t\t\t\tin if not receiverInitValue.oclIsUndefined()\n\t\t\t\t\tthen receiverInitValue\n\t\t\t\t\telse senderInitValue\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getReceiverInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getSenderInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ソフトウェアアドレッシング方式の取得
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receiverSwAddrMethod : m2::SwAddrMethod = getReceiverSwAddrMethod(this_) , senderSwAddrMethod :\n\t\t\t\t\tm2::SwAddrMethod = getSenderSwAddrMethod(this_)\n\t\t\t\tin if not senderSwAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen senderSwAddrMethod\n\t\t\t\t\telse receiverSwAddrMethod\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getReceiverSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getSenderSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" v1Required="true" v2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet initValue1 : m2::ValueSpecification = getInitValue(v1),\n\t\t\t\t\tinitValue2 : m2::ValueSpecification = getInitValue(v2)\n\t\t\t\tin\n\t\t\t\tif initValue1.oclIsUndefined() and initValue2.oclIsUndefined() then\n\t\t\t\t\ttrue\n\t\t\t\telse if initValue1.oclIsUndefined() or initValue2.oclIsUndefined() then\n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\tvalueSpecificationEx.equalsInitValue(initValue1, initValue2)\n\t\t\t\tendif endif'"
	 * @generated
	 */
	boolean equalsInitValue(VariableDataInstanceInComposition v1, VariableDataInstanceInComposition v2);

} // VariableDataInstanceInCompositionEx
