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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IINSTANCE_REF;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Optional;

public class M2XmlUtils {
	public static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

	public enum XmlWrapType { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，staticメソッド群のクラスであるため問題ない)
		ROLE_WRAPPER_AND_ROLE, ROLE_WRAPPER_AND_TYPE, ROLE_AND_TYPE, ROLE, TYPE, REFERENCE_WRAPPER_AND_REFERENCE, REFERENCE, TYPE_REFERENCE, UNKNOWN,
	}

	public static final String VARIANTS_TAG_NAME_SUFFIX = "-VARIANTS";
	public static final String CONDITIONAL_TAG_NAME_SUFFIX = "-CONDITIONAL";
	public static final String AUTOSAR_NAMESPACE = "http://autosar.org/schema/r4.0";
	public static final String NAMESPACE_XSI = "http://www.w3.org/2001/XMLSchema-instance";
	public static final String SCHEMA_LOCATION = "http://autosar.org/schema/r4.0 AUTOSAR_4-0-3.xsd";

	public static final String DEST_ATTRIBUTE_NAME = "DEST";

	public static EStructuralFeature getM2FeatureByTagName(EClass eClass, String xmlTagName) {
		for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
			String featureXmlTagName = getM2FeatureXmlTagName(eStructuralFeature);
			if (xmlTagName.equals(featureXmlTagName)) {
				return eStructuralFeature;
			}
		}
		return null;
	}

	public static XmlWrapType getXmlWrapType(EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EAttribute) {
			return getXmlWrapType((EAttribute) eStructuralFeature);
		} else if (eStructuralFeature instanceof EReference) { // COVERAGE 常にtrue(EStructuralFeatureは，EAttributeとEReferenceのいずれかであるため)
			return getXmlWrapType((EReference) eStructuralFeature);
		} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return XmlWrapType.UNKNOWN;
		}
	}

	private static XmlWrapType getXmlWrapType(EAttribute eAttribute) {
		if (eAttribute.isMany() || M2ModelUtils.isXmlRoleWrapperEnabled(eAttribute, false)) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
			return XmlWrapType.ROLE_WRAPPER_AND_ROLE;
		} else {
			return XmlWrapType.ROLE;
		}
	}

	private static XmlWrapType getXmlWrapType(EReference eReference) {
		M2ModelUtils.ReferenceType referenceType = M2ModelUtils.getReferenceType(eReference);
	
		switch (referenceType) {
		case CONTAINMENT:
			if (eReference.isMany() || M2ModelUtils.isXmlRoleWrapperEnabled(eReference, false)) {
				if (IINSTANCE_REF.isSuperTypeOf((EClass) eReference.getEType())) { // iref
					return XmlWrapType.ROLE_WRAPPER_AND_ROLE;
				} else {
					return XmlWrapType.ROLE_WRAPPER_AND_TYPE;
				}
			} else if (((EClass) eReference.getEType()).isAbstract()) {
				return XmlWrapType.ROLE_AND_TYPE;
			} else {
				return XmlWrapType.ROLE;
			}
		case TYPE_REFERENCE:
			return XmlWrapType.TYPE_REFERENCE;
		case REFERENCE:
			if (eReference.isMany()) {
				return M2ModelUtils.isXmlRoleWrapperEnabled(eReference, true) ? XmlWrapType.REFERENCE_WRAPPER_AND_REFERENCE : XmlWrapType.REFERENCE;
			} else {
				return M2ModelUtils.isXmlRoleWrapperEnabled(eReference, false) ? XmlWrapType.REFERENCE_WRAPPER_AND_REFERENCE : XmlWrapType.REFERENCE; // COVERAGE 常にfalse(現状のツールワークフローではtrueは通らないが，コードレビュー済みであるため問題ない)
			}
		default: // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return XmlWrapType.UNKNOWN;
		}
	}

	private static String getM2FeatureXmlTagName(EStructuralFeature eStructuralFeature) {
		XmlWrapType wrapType = getXmlWrapType(eStructuralFeature);
		switch (wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
		case ROLE_WRAPPER_AND_TYPE:
			return getXmlRoleWrapperName(eStructuralFeature);
		case ROLE_AND_TYPE:
		case ROLE:
			return getXmlRoleName(eStructuralFeature);
		case REFERENCE_WRAPPER_AND_REFERENCE:
			return getXmlReferenceWrapperRoleName(eStructuralFeature);
		case REFERENCE:
			return getXmlReferenceRoleName(eStructuralFeature);
		case TYPE_REFERENCE:
			return getXmlTypeReferenceRoleName(eStructuralFeature);
		default: // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return null;
		}
	}

	public static String getXmlRoleWrapperName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlPluralName = M2ModelUtils.tryGetXmlPluralName(eStructuralFeature);
		return xmlPluralName.or(NameStringUtils.camelCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + "s"));
	}

	public static String getXmlRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.camelCaseToUpperCaseWithHyphen(eStructuralFeature.getName()));
	}

	public static String getXmlReferenceWrapperRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlPluralName = M2ModelUtils.tryGetXmlPluralName(eStructuralFeature);
		return xmlPluralName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.REFERENCE_ROLE_SUFFIX + "s"));
	}

	public static String getXmlReferenceRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.REFERENCE_ROLE_SUFFIX));
	}

	public static String getXmlTypeReferenceRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.TYPE_REFERENCE_ROLE_SUFFIX));
	}

	public static String getM2EnumLiteralName(String originalValue) {
		return NameStringUtils.upperCaseWithHyphenToCamelCase(originalValue);
	}

	public static String getXmlEnumLiteralName(Object originalValue) {
		return NameStringUtils.camelCaseToUpperCaseWithHyphen(String.valueOf(originalValue));
	}

	public static String getXmlTypeName(EClass eClass) {
		return NameStringUtils.camelCaseToUpperCaseWithHyphen(eClass.getName());
	}
}
