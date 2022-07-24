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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sw Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getAtomicSwComponentType()
 * @model abstract="true"
 * @generated
 */
public interface AtomicSwComponentType extends SwComponentType {

	/**
	 * Returns the value of the '<em><b>Internal Behavior</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Behavior</em>' containment reference.
	 * @see #setInternalBehavior(SwcInternalBehavior)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getAtomicSwComponentType_InternalBehavior()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="tags xml.roleWrapperElement='true'"
	 * @generated
	 */
	SwcInternalBehavior getInternalBehavior();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Behavior</em>' containment reference.
	 * @see #getInternalBehavior()
	 * @generated
	 */
	void setInternalBehavior(SwcInternalBehavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 使用しているアプリケーションデータ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getUsingDataTypes()\n\t\t\t\t\t->select(oclIsKindOf(ApplicationDataType)).oclAsType(ApplicationDataType)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ApplicationDataType> getUsingApplicationDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 使用しているアプリケーションデータ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getUsingDataTypes()\n\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ImplementationDataType> getUsingImplementationDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 使用しているAUTOSARデータ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let internalUsingDataTypes : Set(AutosarDataType) = if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getUsingDataTypes()\n\t\t\t\t\tendif\n\t\t\t\tin getRPorts().getUsingDataTypes()\n\t\t\t\t\t->union(getPPorts().getUsingDataTypes())\n\t\t\t\t\t->union(internalUsingDataTypes)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<AutosarDataType> getUsingDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 実装データ型の取得
	 * <!-- end-model-doc -->
	 * @model required="true" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse self.internalBehavior.getImplementationDataType(dataType)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(AutosarDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getImplementationDataTypes(applicationDataType)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getRPorts().requiredInterface\n\t\t\t\t\t->union(getPPorts().providedInterface)\n\t\t\t\t\t->select(oclIsKindOf(ClientServerInterface)).oclAsType(ClientServerInterface)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ClientServerInterface> getUsingClientServerInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.port\n\t\t\t\t\t->select(oclIsKindOf(RPortPrototype)).oclAsType(RPortPrototype)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<RPortPrototype> getRPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.port\n\t\t\t\t\t->select(oclIsKindOf(PPortPrototype)).oclAsType(PPortPrototype)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<PPortPrototype> getPPorts();
} // AtomicSwComponentType
