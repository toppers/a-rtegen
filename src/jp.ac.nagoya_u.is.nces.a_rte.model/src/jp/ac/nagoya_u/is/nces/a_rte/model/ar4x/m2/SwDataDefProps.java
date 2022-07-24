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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Data Def Props</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getInvalidValue <em>Invalid Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwImplPolicy <em>Sw Impl Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAlignment <em>Sw Alignment</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getCompuMethod <em>Compu Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getDataConstr <em>Data Constr</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwPointerTargetProps <em>Sw Pointer Target Props</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps()
 * @model
 * @generated
 */
public interface SwDataDefProps extends M2Object {

	/**
	 * Returns the value of the '<em><b>Invalid Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Value</em>' containment reference.
	 * @see #setInvalidValue(ValueSpecification)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_InvalidValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getInvalidValue();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getInvalidValue <em>Invalid Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Value</em>' containment reference.
	 * @see #getInvalidValue()
	 * @generated
	 */
	void setInvalidValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBaseType(SwBaseType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_BaseType()
	 * @model
	 * @generated
	 */
	SwBaseType getBaseType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getBaseType <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(SwBaseType value);

	/**
	 * Returns the value of the '<em><b>Sw Impl Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Impl Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Impl Policy</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum
	 * @see #setSwImplPolicy(SwImplPolicyEnum)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_SwImplPolicy()
	 * @model
	 * @generated
	 */
	SwImplPolicyEnum getSwImplPolicy();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwImplPolicy <em>Sw Impl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Impl Policy</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum
	 * @see #getSwImplPolicy()
	 * @generated
	 */
	void setSwImplPolicy(SwImplPolicyEnum value);

	/**
	 * Returns the value of the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Addr Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Addr Method</em>' reference.
	 * @see #setSwAddrMethod(SwAddrMethod)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_SwAddrMethod()
	 * @model
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAddrMethod <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Addr Method</em>' reference.
	 * @see #getSwAddrMethod()
	 * @generated
	 */
	void setSwAddrMethod(SwAddrMethod value);

	/**
	 * Returns the value of the '<em><b>Sw Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Alignment</em>' attribute.
	 * @see #setSwAlignment(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_SwAlignment()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AlignmentType"
	 * @generated
	 */
	String getSwAlignment();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwAlignment <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Alignment</em>' attribute.
	 * @see #getSwAlignment()
	 * @generated
	 */
	void setSwAlignment(String value);

	/**
	 * Returns the value of the '<em><b>Compu Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compu Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compu Method</em>' reference.
	 * @see #setCompuMethod(CompuMethod)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_CompuMethod()
	 * @model
	 * @generated
	 */
	CompuMethod getCompuMethod();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getCompuMethod <em>Compu Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compu Method</em>' reference.
	 * @see #getCompuMethod()
	 * @generated
	 */
	void setCompuMethod(CompuMethod value);

	/**
	 * Returns the value of the '<em><b>Data Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Constr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Constr</em>' reference.
	 * @see #setDataConstr(DataConstr)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_DataConstr()
	 * @model
	 * @generated
	 */
	DataConstr getDataConstr();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getDataConstr <em>Data Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Constr</em>' reference.
	 * @see #getDataConstr()
	 * @generated
	 */
	void setDataConstr(DataConstr value);

	/**
	 * Returns the value of the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Data Type</em>' reference.
	 * @see #setImplementationDataType(ImplementationDataType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_ImplementationDataType()
	 * @model
	 * @generated
	 */
	ImplementationDataType getImplementationDataType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getImplementationDataType <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Data Type</em>' reference.
	 * @see #getImplementationDataType()
	 * @generated
	 */
	void setImplementationDataType(ImplementationDataType value);

	/**
	 * Returns the value of the '<em><b>Sw Pointer Target Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Pointer Target Props</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Pointer Target Props</em>' containment reference.
	 * @see #setSwPointerTargetProps(SwPointerTargetProps)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwDataDefProps_SwPointerTargetProps()
	 * @model containment="true"
	 * @generated
	 */
	SwPointerTargetProps getSwPointerTargetProps();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps#getSwPointerTargetProps <em>Sw Pointer Target Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Pointer Target Props</em>' containment reference.
	 * @see #getSwPointerTargetProps()
	 * @generated
	 */
	void setSwPointerTargetProps(SwPointerTargetProps value);
} // SwDataDefProps
