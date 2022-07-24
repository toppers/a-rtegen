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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceiveErrorEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataReceivedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RVariable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getContextRPort <em>Context RPort</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getRVariableDataInstanceInSwc()
 * @model
 * @generated
 */
public interface RVariableDataInstanceInSwc extends VariableDataInstanceInSwc {

	/**
	 * Returns the value of the '<em><b>Context RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context RPort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context RPort</em>' reference.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getRVariableDataInstanceInSwc_ContextRPort()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='contextPort.oclAsType(m2::RPortPrototype)'"
	 * @generated
	 */
	RPortPrototype getContextRPort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if getFilter().oclIsUndefined()\n\t\t\t\t\tthen false\n\t\t\t\t\telse getFilter().isFilterEnabled()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean isFilterEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let filter : m2::DataFilter = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).filter\n\t\t\t\tin if filter.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse filter\n\t\t\t\t\tendif'"
	 * @generated
	 */
	DataFilter getFilter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::NonqueuedReceiverComSpec = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec)\n\t\t\t\tin not comSpec.oclIsUndefined() and comSpec.aliveTimeout <> 0'"
	 * @generated
	 */
	boolean isAliveTimeoutEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 無効化が有効かどうか
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationEnabled().oclAsType(Boolean)'"
	 * @generated
	 */
	boolean isInvalidationEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 無効化ポリシーがKeepかどうか
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationKeep().oclAsType(Boolean)'"
	 * @generated
	 */
	boolean isInvalidationKeep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 無効化ポリシーがReplaceかどうか
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationReplace().oclAsType(Boolean)'"
	 * @generated
	 */
	boolean isInvalidationReplace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 無効値処理方法の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='contextRPort.requiredInterface.oclAsType(m2::SenderReceiverInterface).invalidationPolicy\n\t\t\t\t\t->any(dataElement = self.prototype)'"
	 * @generated
	 */
	InvalidationPolicy getInvalidationPolicy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initValue : m2::ValueSpecification = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).initValue\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse initValue\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getInitValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QueuedReceiverComSpecのキュー長を返す
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PositiveInteger" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::QueuedReceiverComSpec = getComSpec().oclAsType(m2::QueuedReceiverComSpec)\n\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse comSpec.queueLength\n\t\t\t\t\tendif'"
	 * @generated
	 */
	Integer getQueueLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::ReceiverComSpec = contextRPort.requiredComSpec.oclAsType(m2::ReceiverComSpec)->any(dataElement = self.prototype)\n\t\t\t\t\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\t\telse comSpec\n\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	ReceiverComSpec getComSpec();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ar4x::m2::DataReceivedEvent.allInstances()->select(data = self)->asOrderedSet()'"
	 * @generated
	 */
	EList<DataReceivedEvent> getRelatedDataReceivedEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ar4x::m2::DataReceiveErrorEvent.allInstances()->select(data = self)->asOrderedSet()'"
	 * @generated
	 */
	EList<DataReceiveErrorEvent> getRelatedDataReceiveErrorEvent();

} // RVariableDataInstanceInSwc
