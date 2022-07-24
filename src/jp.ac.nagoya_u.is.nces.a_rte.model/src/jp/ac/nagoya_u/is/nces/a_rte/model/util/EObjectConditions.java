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
package jp.ac.nagoya_u.is.nces.a_rte.model.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.internal.CollectionCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.EObjectOperationValueCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.EObjectStructuralFeatureValuesCondition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.query.conditions.Condition;
import org.eclipse.emf.query.conditions.Not;
import org.eclipse.emf.query.conditions.ObjectInstanceCondition;
import org.eclipse.emf.query.conditions.booleans.BooleanCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectInstanceCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferenceValueCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferencerCondition;
import org.eclipse.emf.query.conditions.numbers.NumberCondition.IntegerValue;
import org.eclipse.emf.query.conditions.strings.StringValue;

/**
 * EMFのオブジェクトの検索条件を提供する．
 */
public class EObjectConditions { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)
	/**
	 * 型一致判定の条件を生成する． 本条件は，オブジェクトが判定対象の型と同一の型，もしくはその型のサブクラスである場合，真と判定する．
	 * 
	 * @param eClass 判定対象の型
	 * @return 型一致判定の条件．
	 */
	public static EObjectCondition isKindOf(EClass eClass) {
		return new EObjectTypeRelationCondition(eClass, TypeRelation.SAMETYPE_OR_SUBTYPE_LITERAL);
	}

	/**
	 * リファレンスの値一致判定の条件を生成する．
	 * 本条件は，オブジェクトが判定対象のリファレンスを持ち，そのリファレンスの参照先が判定対象のオブジェクトと一致する場合，真と判定する．
	 * 
	 * @param eReference 判定対象のリファレンス
	 * @param value 判定対象のオブジェクト
	 * @return リファレンスの値一致判定．
	 */
	public static EObjectCondition ref(EReference eReference, EObject value) {
		return new EObjectReferenceValueCondition(eReference, value == null ? EObjectInstanceCondition.IS_NULL : new EObjectInstanceCondition(value));
	}

	/**
	 * リファレンスの存在判定の条件を生成する．
	 * 本条件は，オブジェクトが判定対象のリファレンスを持ち，そのリファレンスによりいずれかのオブジェクトを参照している場合，真と判定する．
	 * 
	 * @param eReference 判定対象のリファレンス
	 * @return リファレンスの値一致判定．
	 */
	public static EObjectCondition refExists(EReference eReference) {
		Condition valueCondition = eReference.isMany() ? new Not(CollectionCondition.EMPTY) : new Not(EObjectInstanceCondition.IS_NULL); // COVERAGE 常にfalse(現状のツールワークフローではtrueは通らないが，コードレビュー済みであるため問題ない)
		return new EObjectStructuralFeatureValuesCondition(eReference, valueCondition);
	}

	/**
	 * リファレンスによりあるオブジェクトを参照しているかの判定の条件を生成する．
	 * 本条件は，オブジェクトのいずれかのリファレンスの参照先が判定対象のオブジェクトと一致する場合，真と判定する．
	 * 
	 * @param value 判定対象のオブジェクト
	 * @return リファレンスの値一致判定．
	 */
	public static EObjectCondition ref(EObject value) {
		return new EObjectReferencerCondition(value);
	}

	/**
	 * 属性の値一致判定の条件を生成する． 本条件は，オブジェクトが判定対象の属性を持ち，その属性の値が判定対象の文字列値と一致する場合，真と判定する．
	 * 
	 * @param eAttribute 判定対象の属性
	 * @param value 判定対象の文字列値
	 * @return 属性の値一致判定．
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, String value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, createStringValueCondition(value));
	}

	/**
	 * 属性の値一致判定の条件を生成する． 本条件は，オブジェクトが判定対象の属性を持ち，その属性の値が判定対象の整数値と一致する場合，真と判定する．
	 * 
	 * @param eAttribute 判定対象の属性
	 * @param value 判定対象の整数値
	 * @return 属性の値一致判定．
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, Integer value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, createIntegerValueCondition(value));
	}

	/**
	 * 属性の値一致判定の条件を生成する． 本条件は，オブジェクトが判定対象の属性を持ち，その属性の値が判定対象の値と一致する場合，真と判定する．
	 * 
	 * @param eAttribute 判定対象の属性
	 * @param value 判定対象の値
	 * @return 属性の値一致判定．
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, Object value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, value == null ? ObjectInstanceCondition.IS_NULL : new ObjectInstanceCondition(value)); // COVERAGE 常にfalse(現状のツールワークフローではtrueは通らないが，コードレビュー済みであるため問題ない)
	}

	/**
	 * オペレーション処理結果の値一致判定の条件を生成する．
	 * 本条件は，オブジェクトが判定対象のオペレーションを持ち，そのオペレーションの処理結果が判定対象の論理値と一致する場合，真と判定する．
	 * 
	 * @param eOperation 判定に使用するオペレーション
	 * @param result 判定対象の論理値
	 * @return オペレーション処理結果の値一致判定．
	 */
	public static EObjectCondition hasOp(EOperation eOperation, Boolean result) {
		return hasOp(eOperation, createBooleanValueCondition(result), new Object[0]);
	}

	/**
	 * オペレーション処理結果の値一致判定の条件を生成する．
	 * 本条件は，オブジェクトが判定対象のオペレーションを持ち，そのオペレーションの処理結果が判定対象の数値と一致する場合，真と判定する．
	 * 
	 * @param eOperation 判定に使用するオペレーション
	 * @param result 判定対象の数値
	 * @return オペレーション処理結果の値一致判定．
	 */
	public static EObjectCondition hasOp(EOperation eOperation, Integer result) {
		return hasOp(eOperation, createIntegerValueCondition(result), new Object[0]);
	}

	/**
	 * オペレーション処理結果の値一致判定の条件を生成する．
	 * 本条件は，オブジェクトが判定対象のオペレーションを持ち，そのオペレーションの処理結果が判定対象の文字列と一致する場合，真と判定する．
	 * 
	 * @param eOperation 判定に使用するオペレーション
	 * @param result 判定対象の文字列
	 * @return オペレーション処理結果の値一致判定．
	 */
	public static EObjectCondition hasOp(EOperation eOperation, String result) {
		return hasOp(eOperation, createStringValueCondition(result), new Object[0]);
	}

	private static EObjectCondition hasOp(EOperation eOperation, Condition valueCondition, Object... arguments) {
		return new EObjectOperationValueCondition(eOperation, arguments, valueCondition);
	}

	private static Condition createIntegerValueCondition(Integer value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new Not(ObjectInstanceCondition.IS_NULL).AND(new IntegerValue(value));
	}

	private static Condition createBooleanValueCondition(Boolean value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new BooleanCondition(value); // COVERAGE 常にfalse(現状のツールワークフローではtrueは通らないが，コードレビュー済みであるため問題ない)
	}

	private static Condition createStringValueCondition(String value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new Not(ObjectInstanceCondition.IS_NULL).AND(new StringValue(value)); // COVERAGE 常にfalse(現状のツールワークフローではtrueは通らないが，コードレビュー済みであるため問題ない)
	}
}
