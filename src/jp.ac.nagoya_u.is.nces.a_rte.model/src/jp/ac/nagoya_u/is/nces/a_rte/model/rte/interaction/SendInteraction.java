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
 * A representation of the model object '<em><b>Send Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getSender <em>Sender</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction()
 * @model
 * @generated
 */
public interface SendInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_Sender()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction
	 * @model opposite="sendInteraction"
	 * @generated
	 */
	EList<Sender> getSender();

	/**
	 * Returns the value of the '<em><b>Receive Interaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Interaction</em>' reference.
	 * @see #setReceiveInteraction(ReceiveInteraction)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_ReceiveInteraction()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction
	 * @model opposite="sendInteraction" required="true"
	 * @generated
	 */
	ReceiveInteraction getReceiveInteraction();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Interaction</em>' reference.
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	void setReceiveInteraction(ReceiveInteraction value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(SendImplementation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_Implementation()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	SendImplementation getImplementation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(SendImplementation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::InternalEcuSender)).oclAsType(interaction::InternalEcuSender)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<InternalEcuSender> getInternalEcuSenders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::ExternalEcuSender)).oclAsType(interaction::ExternalEcuSender)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ExternalEcuSender> getExternalEcuSenders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let senderCores : Set(m2::Integer) = self.sender.getOwnerCore()->asOrderedSet(),\n\t\t\t\t\t\treceiverCores : Set(m2::Integer) = self.receiveInteraction.receiver.getOwnerCore()->asOrderedSet()\n\t\t\t\tin senderCores->symmetricDifference(receiverCores)->notEmpty()'"
	 * @generated
	 */
	boolean isInterCore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let senderPartitions : Set(ecuc::EcucPartition) = self.sender.ownerPartition->asOrderedSet(),\n\t\t\t\t\t\treceiverPartitions : Set(ecuc::EcucPartition) = self.receiveInteraction.receiver.ownerPartition->asOrderedSet()\n\t\t\t\tin senderPartitions->symmetricDifference(receiverPartitions)->notEmpty()'"
	 * @generated
	 */
	boolean isInterPartition();

} // SendInteraction
