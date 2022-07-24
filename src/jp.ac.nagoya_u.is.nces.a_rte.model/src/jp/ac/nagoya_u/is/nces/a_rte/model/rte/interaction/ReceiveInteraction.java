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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction <em>Send Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getValueBufferImplementation <em>Value Buffer Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getFilterBufferImplementation <em>Filter Buffer Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getReceiveInteraction()
 * @model
 * @generated
 */
public interface ReceiveInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getReceiveInteraction_Receiver()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver#getReceiveInteraction
	 * @model opposite="receiveInteraction"
	 * @generated
	 */
	EList<Receiver> getReceiver();

	/**
	 * Returns the value of the '<em><b>Send Interaction</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Interaction</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getReceiveInteraction_SendInteraction()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction
	 * @model opposite="receiveInteraction"
	 * @generated
	 */
	EList<SendInteraction> getSendInteraction();

	/**
	 * Returns the value of the '<em><b>Value Buffer Implementation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Buffer Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Buffer Implementation</em>' containment reference.
	 * @see #setValueBufferImplementation(ValueBufferImplementation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getReceiveInteraction_ValueBufferImplementation()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ValueBufferImplementation getValueBufferImplementation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getValueBufferImplementation <em>Value Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Buffer Implementation</em>' containment reference.
	 * @see #getValueBufferImplementation()
	 * @generated
	 */
	void setValueBufferImplementation(ValueBufferImplementation value);

	/**
	 * Returns the value of the '<em><b>Filter Buffer Implementation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Buffer Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Buffer Implementation</em>' containment reference.
	 * @see #setFilterBufferImplementation(FilterBufferImplementation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getReceiveInteraction_FilterBufferImplementation()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	FilterBufferImplementation getFilterBufferImplementation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getFilterBufferImplementation <em>Filter Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Buffer Implementation</em>' containment reference.
	 * @see #getFilterBufferImplementation()
	 * @generated
	 */
	void setFilterBufferImplementation(FilterBufferImplementation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.receiver\n\t\t\t\t\t->select(oclIsKindOf(interaction::InternalEcuReceiver)).oclAsType(interaction::InternalEcuReceiver)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<InternalEcuReceiver> getInternalEcuReceivers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.receiver\n\t\t\t\t\t->select(oclIsKindOf(interaction::ExternalEcuReceiver)).oclAsType(interaction::ExternalEcuReceiver)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ExternalEcuReceiver> getExternalEcuReceivers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sendInteraction->exists(isInterCore())'"
	 * @generated
	 */
	boolean receivesInterCore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sendInteraction.sender.getOwnerCore()->asSet()->size() > 1'"
	 * @generated
	 */
	boolean receivesFromMultipleCores();

} // ReceiveInteraction
