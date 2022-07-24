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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Optional;

/**
 * ECUCモデルに関するユーティリティ機能を提供する。
 */
public class EcucModelUtils {

	/**
	 * ECUCモデルのID接頭辞
	 */
	public static final String ID_PREFIX = "ecuc.";

	/**
	 * ECUCモデルからEcucDefへのリファレンスの接頭辞
	 */
	public static final String DEFAULT_ECUC_DEFINITION_REFERENCE_PREFIX = "/AUTOSAR/EcucDefs/";

	private static final String REFERENCE_ROLE_SUFFIX = "Ref";
	private static final String INSTANCE_REFERENCE_ROLE_SUFFIX = "InstanceRef";
	private static final String NON_ECUC_STEREOTYPE = "nonEcuc";

	// ECUCに関するタグ
	private static final String DEFINITION_SHORT_NAME_TAG = "ecuc.definitionShortName";

	/**
	 * DefinitionRefからショートネーム部を抽出する。
	 * @param definitionRef DefinitionRefの文字列
	 * @return DefinitionRefのショートネーム部
	 */
	public static String getShortNameOfDefinitionRef(String definitionRef) {
		String[] shortNames = definitionRef.split(M2ModelUtils.REFERENCE_SEPARATOR);
		return shortNames[shortNames.length - 1];
	}

	/**
	 * {@link EAttribute}に対応するDefinitionRefのショートネーム部を取得する。
	 * @param eAttribute 取得元の{@link EAttribute}
	 * @return DefinitionRefのショートネーム部
	 */
	public static String getParameterDefinitionShortNameOfRoleFeature(EAttribute eAttribute) {
		return NameStringUtils.camelCaseToPascalCase(eAttribute.getName());
	}

	/**
	 * {@link EReference}に対応するDefinitionRefのショートネーム部を取得する。
	 * @param eReference 取得元の{@link EReference}
	 * @return DefinitionRefのショートネーム部
	 */
	public static String getReferenceDefinitionShortNameOfRoleFeature(EReference eReference) {
		Optional<String> definitionShortName = getDefinitionShortName(eReference);
		return definitionShortName.or(NameStringUtils.camelCaseToPascalCase(eReference.getName() + REFERENCE_ROLE_SUFFIX));
	}

	/**
	 * {@link EcucContainer}のDefinitionRefに対応するロール名を取得する。
	 * @param definitionRef {@link EcucContainer}のDefinitionRef
	 * @return {@link EcucContainer}のDefinitionRefに対応するロール名
	 */
	public static String getRoleNameOfContainerDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef));
	}

	/**
	 * {@link EcucParameterValue}のDefinitionRefに対応するロール名を取得する。
	 * @param definitionRef {@link EcucParameterValue}のDefinitionRef
	 * @return {@link EcucParameterValue}のDefinitionRefに対応するロール名
	 */
	public static String getRoleNameOfParameterDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef));
	}

	/**
	 * {@link EcucReferenceValue}のDefinitionRefに対応するロール名を取得する。
	 * @param definitionRef {@link EcucReferenceValue}のDefinitionRef
	 * @return {@link EcucReferenceValue}のDefinitionRefに対応するロール名
	 */
	public static String getRoleNameOfReferenceDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef)).replace(REFERENCE_ROLE_SUFFIX, "");
	}

	/**
	 * {@link EcucInstanceReferenceValue}のDefinitionRefに対応するロール名を取得する。
	 * @param definitionRef {@link EcucInstanceReferenceValue}のDefinitionRef
	 * @return {@link EcucInstanceReferenceValue}のDefinitionRefに対応するロール名
	 */
	public static String getRoleNameOfInstanceReferenceDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef)).replace(INSTANCE_REFERENCE_ROLE_SUFFIX, "");
	}

	/**
	 * AUTOSARのEcucParamDefで定義されていない属性／リファレンスかどうかを判定する。
	 * @param eStructuralFeature 判定対象の{@link EStructuralFeature}
	 * @return AUTOSARのEcucParamDefで定義されていない属性／リファレンスの場合、true。それ以外の場合、false。
	 */
	public static boolean isNonEcucFeature(EStructuralFeature eStructuralFeature) {
		return EmfUtils.hasStereotype(eStructuralFeature, NON_ECUC_STEREOTYPE);
	}

	private static Optional<String> getDefinitionShortName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, DEFINITION_SHORT_NAME_TAG);
	}
}
