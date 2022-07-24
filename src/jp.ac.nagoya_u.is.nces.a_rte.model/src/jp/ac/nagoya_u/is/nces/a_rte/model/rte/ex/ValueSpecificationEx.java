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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getValueSpecificationEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ValueSpecificationEx extends ExtendedEObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.oclIsKindOf(m2::ConstantReference)\n\t\t\t\t\t\tthen this_.oclAsType(m2::ConstantReference).getEndValueSpec()\n\t\t\t\t\telse this_\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getEndValueSpec(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 定数値の文字列取得
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let endValueSpec : m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin if endValueSpec.oclIsKindOf(ar4x::m2::NumericalValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::NumericalValueSpecification).value.toString()\n\t\t\t\t\telse if endValueSpec.oclIsKindOf(ar4x::m2::TextValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::TextValueSpecification).value\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	String getValueSpecAsText(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification) or end.oclIsKindOf(ar4x::m2::TextValueSpecification)'"
	 * @generated
	 */
	boolean isForVALUE(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::ArrayValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->size() = type.subElement->first().arraySize\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->forAll(v | isForVALUE(v))'"
	 * @generated
	 */
	boolean isForARRAY(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = type.subElement->size()\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->forAll(v | isForVALUE(v))'"
	 * @generated
	 */
	boolean isForSTRUCTURE(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = 1\n\t\t\t\tand\n\t\t\t\tisForVALUE(end.oclAsType(ar4x::m2::RecordValueSpecification).field->first())'"
	 * @generated
	 */
	boolean isForUNION(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification)'"
	 * @generated
	 */
	boolean isForDATA_REFERENCE(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif type.category = \'VALUE\' then\n\t\t\t\t\tisForVALUE(value)\n\t\t\t\telse if type.category = \'ARRAY\' then\n\t\t\t\t\tisForARRAY(value, type)\n\t\t\t\telse if type.category = \'STRUCTURE\' then\n\t\t\t\t\tisForSTRUCTURE(value, type)\n\t\t\t\telse if type.category = \'UNION\' then\n\t\t\t\t\tisForUNION(value, type)\n\t\t\t\telse if type.category = \'DATA_REFERENCE\' then\n\t\t\t\t\tisForDATA_REFERENCE(value)\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif endif endif endif endif'"
	 * @generated
	 */
	boolean isValidValue(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" v1Required="true" v2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet endV1 : ar4x::m2::ValueSpecification = getEndValueSpec(v1),\n\t\t\t\t\tendV2 : ar4x::m2::ValueSpecification = getEndValueSpec(v2)\n\t\t\t\tin\n\t\t\t\tif endV1.oclIsTypeOf(ar4x::m2::ArrayValueSpecification) then\n\t\t\t\t\tlet arrayV1 : ar4x::m2::ArrayValueSpecification = endV1.oclAsType(ar4x::m2::ArrayValueSpecification),\n\t\t\t\t\t\tarrayV2 : ar4x::m2::ArrayValueSpecification = endV2.oclAsType(ar4x::m2::ArrayValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif arrayV1.element->size() <> arrayV2.element->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(arrayV1.element->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(arrayV1.element->at(i), arrayV2.element->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse if endV1.oclIsTypeOf(ar4x::m2::RecordValueSpecification) then\n\t\t\t\t\tlet recV1 : ar4x::m2::RecordValueSpecification = endV1.oclAsType(ar4x::m2::RecordValueSpecification),\n\t\t\t\t\t\trecV2 : ar4x::m2::RecordValueSpecification = endV2.oclAsType(ar4x::m2::RecordValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif recV1.field->size() <> recV2.field->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(recV1.field->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(recV1.field->at(i), recV2.field->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tgetValueSpecAsText(endV1) = getValueSpecAsText(endV2)\n\t\t\t\tendif endif'"
	 * @generated
	 */
	boolean equalsInitValue(ValueSpecification v1, ValueSpecification v2);

} // ValueSpecificationEx
