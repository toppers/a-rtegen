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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Ecu Sender Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#getVariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getExternalEcuSenderEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ExternalEcuSenderEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Variable Data Instance In Composition Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Data Instance In Composition Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Data Instance In Composition Ex</em>' reference.
	 * @see #setVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getExternalEcuSenderEx_VariableDataInstanceInCompositionEx()
	 * @model required="true"
	 * @generated
	 */
	VariableDataInstanceInCompositionEx getVariableDataInstanceInCompositionEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx#getVariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Data Instance In Composition Ex</em>' reference.
	 * @see #getVariableDataInstanceInCompositionEx()
	 * @generated
	 */
	void setVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTEによるフィルタを要求するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receivers : Set(rte::interaction::InternalEcuReceiver) = this_.getInternalEcuReceivers() ,\n\t\t\t\t\tfilterReceivers : Set(rte::interaction::InternalEcuReceiver) = receivers->select(isFilterEnabled())\n\t\t\t\tin receivers->exists(isFilterEnabled())\n\t\t\t\t\tand (receivers->exists(hasMultipleSenders())\n\t\t\t\t\t\tor not receivers->forAll(isFilterEnabled())\n\t\t\t\t\t\tor filterReceivers->exists(r1, r2 | not r1.getFilter().isCompatibleWith(r2.getFilter())))'"
	 * @generated
	 */
	boolean requiresRteFilter(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTEによる無効化を要求するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receivers : Set(rte::interaction::InternalEcuReceiver) = this_.getInternalEcuReceivers() ,\n\t\t\t\t\t\tinvReceivers : Set(rte::interaction::InternalEcuReceiver) = receivers->select(isInvalidationEnabled())\n\t\t\t\tin receivers->exists(isInvalidationEnabled())\n\t\t\t\t\tand (not receivers->forAll(isInvalidationEnabled())\n\t\t\t\t\t\tor invReceivers->exists(r1, r2 | r1.getHandleInvalid() <> r2.getHandleInvalid()))'"
	 * @generated
	 */
	boolean requiresRteInvalidation(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTEによる初期化を要求するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.hasMultipleInternalEcuReceivers()\n\t\t\t\t\tand this_.getInternalEcuReceivers()->exists(r1, r2 | not variableDataInstanceInCompositionEx.equalsInitValue(r1.source, r2.source))'"
	 * @generated
	 */
	boolean requiresRteInitialization(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COM受信コールバックを生成するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.sendInteraction->exists(not implementation.oclIsUndefined())\n\t\t\t\t\tor this_.getInternalEcuReceivers()->exists(activatesOnReceived->notEmpty())'"
	 * @generated
	 */
	boolean providesComRxCallback(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COM無効化コールバックを生成するかどうか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.sendInteraction\n\t\t\t\t\t->exists(not implementation.oclIsUndefined() and receiveInteraction.getInternalEcuReceivers()\n\t\t\t\t\t\t->exists(isInvalidationEnabled()))\n\t\t\t\t\tor this_.getInternalEcuReceivers()->exists(activatesOnReceived->notEmpty() and isInvalidationEnabled())'"
	 * @generated
	 */
	boolean providesComInvCallback(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COM受信タイムアウトコールバックを生成するかどうか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.sendInteraction\n\t\t\t\t\t->exists(not implementation.oclIsUndefined() and receiveInteraction.getInternalEcuReceivers()\n\t\t\t\t\t\t->exists(isAliveTimeoutEnabled()))'"
	 * @generated
	 */
	boolean providesComRxTOutCallback(ExternalEcuSender this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COMコールバックを生成するかどうか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='providesComRxCallback(this_)\n\t\t\t\t   or providesComInvCallback(this_)\n\t\t\t\t   or providesComRxTOutCallback(this_)'"
	 * @generated
	 */
	boolean providesComCallback(ExternalEcuSender this_);

} // ExternalEcuSenderEx
