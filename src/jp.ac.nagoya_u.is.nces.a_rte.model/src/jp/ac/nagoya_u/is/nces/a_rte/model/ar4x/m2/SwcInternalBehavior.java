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
 * A representation of the model object '<em><b>Swc Internal Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getEvent <em>Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getPortApiOption <em>Port Api Option</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getIncludedDataTypeSet <em>Included Data Type Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getExplicitInterRunnableVariable <em>Explicit Inter Runnable Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior()
 * @model
 * @generated
 */
public interface SwcInternalBehavior extends Identifiable, InternalBehavior {
	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Runnable()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<RunnableEntity> getRunnable();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteEvent> getEvent();

	/**
	 * Returns the value of the '<em><b>Port Api Option</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Api Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Api Option</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_PortApiOption()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortApiOption> getPortApiOption();

	/**
	 * Returns the value of the '<em><b>Included Data Type Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Data Type Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Data Type Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_IncludedDataTypeSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getIncludedDataTypeSet();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AtomicSwComponentType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior
	 * @model opposite="internalBehavior" required="true" transient="false" derived="true"
	 * @generated
	 */
	AtomicSwComponentType getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AtomicSwComponentType value);

	/**
	 * Returns the value of the '<em><b>Explicit Inter Runnable Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Inter Runnable Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Inter Runnable Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_ExplicitInterRunnableVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDataPrototype> getExplicitInterRunnableVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アプリケーションデータ型を参照するIncludedDataTypeSetの取得
	 * <!-- end-model-doc -->
	 * @model ordered="false" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType->includes(dataType))'"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ApplicationDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 実装データ型を参照するIncludedDataTypeSetの取得
	 * <!-- end-model-doc -->
	 * @model ordered="false" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType\n\t\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t\t->includes(dataType))'"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ImplementationDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 使用しているAUTOSARデータ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet.dataType->asOrderedSet()'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if dataType.oclIsKindOf(ImplementationDataType)\n\t\t\t\t\tthen dataType.oclAsType(ImplementationDataType)\n\t\t\t\t\telse self.getImplementationDataType(dataType.oclAsType(ApplicationDataType))\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(AutosarDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implDataType : ImplementationDataType = getImplementationDataTypes(applicationDataType)->any(true)\n\t\t\t\tin if implDataType.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse implDataType\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(ApplicationDataType applicationDataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.dataTypeMapping.dataTypeMap->select(m | m.applicationDataType = applicationDataType).implementationDataType->asOrderedSet()'"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType);

} // SwcInternalBehavior
