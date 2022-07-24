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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.CharMatcher;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;

/**
 * M2モデルに関するユーティリティ機能を提供する。
 */
public class M2ModelUtils {

	/**
	 * M2モデルのオブジェクトのIDの接頭辞
	 */
	public static final String ID_PREFIX = "m2.";

	/**
	 * M2モデルのリファレンスの区切り文字
	 */
	public static final String REFERENCE_SEPARATOR = "/";

	/**
	 * リファレンスのロール名の接尾辞
	 */
	public static final String REFERENCE_ROLE_SUFFIX = "Ref";

	/**
	 * タイプリファレンスのロール名の接尾辞
	 */
	public static final String TYPE_REFERENCE_ROLE_SUFFIX = "Tref";

	/**
	 * インスタンスリファレンスのロール名の接尾辞
	 */
	public static final String INSTANCE_REFERENCE_ROLE_SUFFIX = "Iref";

	/**
	 * mixedStringの値を保持する属性のロール名
	 */
	public static final String MIXED_STRING_VALUE_FEATURE_NAME = "value";

	// 数値，および論理値の文字列表現
	private static final String BINARY_PREFIX = "0b";
	private static final String OCTAL_PREFIX = "0";
	private static final CharMatcher OCTAL_RANGE = CharMatcher.inRange('0', '7').precomputed();
	private static final String HEX_PREFIX = "0x";
	private static final CharMatcher FLOAT_SPECIFIC_CHARS = CharMatcher.anyOf(".E").precomputed();
	private static final Integer BOOLEAN_TRUE_VALUE = 1;
	private static final Integer BOOLEAN_FALSE_VALUE = 0;
	private static final List<String> BOOLEAN_TRUE_TEXT_REPRESENTATIONS = Lists.newArrayList("1", "true");

	// モデルのステレオタイプに関するアノテーション
	private static final String IS_OF_TYPE_STEREOTYPE = "isOfType";
	private static final String MIXED_STRING_STEREOTYPE = "atpMixedString";
	private static final String NON_M2_STEREOTYPE = "nonM2";

	// XML永続化に関するアノテーション
	private static final String XML_ROLE_WRAPPER_ELEMENT_TAG = "xml.roleWrapperElement"; // ロールラッパーを強制的に有効にする
	private static final String XML_NAME_TAG = "xml.name"; // ロールに対応するXMLタグ名(単数形)
	private static final String XML_NAME_PLURAL_TAG = "xml.namePlural"; // ロールに対応するXMLタグ名(複数形)

	/**
	 * ecucDefのデフォルト値
	 */
	public static final String DEFAULT_ECUC_DEF_EDITION = "4.2.0";

	/**
	 * リファレンスの種別を表す。
	 */
	public static enum ReferenceType {
		/**
		 * AUTOSARモデルにおける集約を表す。
		 */
		CONTAINMENT,

		/**
		 * AUTOSARモデルにおけるリファレンスを表す。
		 */
		REFERENCE,

		/**
		 * AUTOSARモデルにおけるタイプリファレンスを表す。
		 */
		TYPE_REFERENCE,
	}

	/**
	 * {@link EStructuralFeature}からインスタンスリファレンスのロール名を取得する。
	 * @param eStructuralFeature 取得対象の{@link EStructuralFeature}
	 * @return インスタンスリファレンスのロール名
	 */
	public static String getIrefRoleNameOfRoleFeature(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName() + INSTANCE_REFERENCE_ROLE_SUFFIX;
	}

	/**
	 * リファレンスの種別を判定する。
	 * @param eReference 判定対象の{@link EReference}
	 * @return リファレンスの種別
	 */
	public static ReferenceType getReferenceType(EReference eReference) {
		if (eReference.isContainment()) {
			return ReferenceType.CONTAINMENT;
		} else {
			if (EmfUtils.hasStereotype(eReference, IS_OF_TYPE_STEREOTYPE)) {
				return ReferenceType.TYPE_REFERENCE;
			} else {
				return ReferenceType.REFERENCE;
			}
		}
	}

	/**
	 * 文字列を、指定された{@link EStructuralFeature}に設定可能なオブジェクトに変換する。
	 * @param originalValue 変換元の文字列
	 * @param eFeature 変換先の{@link EStructuralFeature}
	 * @return 変換結果のオブジェクト
	 * @throws ModelException 変換に失敗した場合
	 */
	public static Object convertValueForFeature(String originalValue, EStructuralFeature eFeature) throws ModelException {
		return convertValueToType(originalValue, (EDataType) eFeature.getEType());
	}

	/**
	 * {@link BigDecimal}を、指定された{@link EStructuralFeature}に設定可能なオブジェクトに変換する。
	 * @param originalValue 変換元の{@link BigDecimal}
	 * @param eFeature 変換先の{@link EStructuralFeature}
	 * @return 変換結果のオブジェクト
	 * @throws ModelException 変換に失敗した場合
	 */
	public static Object convertValueForFeature(BigDecimal originalValue, EStructuralFeature eFeature) throws ModelException {
		return convertValueToType(originalValue, (EDataType) eFeature.getEType());
	}

	/**
	 * 文字列が、指定された{@link EDataType}のオブジェクトに変換可能かを判定する。
	 * @param originalValue 変換元の文字列
	 * @param type 変換先の{@link EDataType}
	 * @return 変換可能である場合、true。それ以外の場合、false。
	 */
	public static boolean tryConvertValueToType(String originalValue, EDataType type) {
		try {
			tryConvertValueToType(originalValue, type);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * 文字列を、指定された{@link EDataType}のオブジェクトに変換する。
	 * @param originalValue 変換元の文字列
	 * @param type 変換先の{@link EDataType}
	 * @return 変換結果のオブジェクト
	 * @throws ModelException 変換に失敗した場合
	 */
	public static Object convertValueToType(String originalValue, EDataType type) throws ModelException {
		try {
			if (isJavaBigDecimal(type)) {
				return parseNumerical(originalValue);
			} else if (isJavaBigInteger(type)) {
				return parseBigInteger(originalValue);
			} else if (isJavaIntegerType(type)) {
				return parseInteger(originalValue);
			} else if (isJavaBooleanType(type)) {
				return parseBoolean(originalValue);
			} else if (isJavaStringType(type)) {
				return originalValue;
			} else if (type instanceof EEnum) {
				EEnum eEnum = (EEnum) type;
				if (eEnum.getEEnumLiteral(originalValue) == null) {
					throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
				} else {
					return type.getEPackage().getEFactoryInstance().createFromString(type, originalValue);
				}
			} else {
				throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
			}
		} catch (NumberFormatException e) {
			throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".", e);
		}
	}

	/**
	 * {@link BigDecimal}を、指定された{@link EDataType}のオブジェクトに変換する。
	 * @param originalValue 変換元の{@link BigDecimal}
	 * @param type 変換先の{@link EDataType}
	 * @return 変換結果のオブジェクト
	 * @throws ModelException 変換に失敗した場合
	 */
	public static Object convertValueToType(BigDecimal originalValue, EDataType type) throws ModelException {
		try {
			if (isJavaBigDecimal(type)) {
				return originalValue;
			} else if (isJavaBigInteger(type)) {
				return originalValue.toBigIntegerExact();
			}
			if (isJavaIntegerType(type)) {
				return originalValue.intValueExact();
			} else if (isJavaBooleanType(type)) {
				return BOOLEAN_TRUE_VALUE.equals(originalValue.intValueExact());
			} else if (isJavaStringType(type)) {
				return String.valueOf(originalValue);
			} else {
				throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
			}
		} catch (ArithmeticException e) {
			throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
		}
	}

	private static boolean isJavaBigDecimal(EDataType type) {
		return BigDecimal.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaBigInteger(EDataType type) {
		return BigInteger.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaIntegerType(EDataType type) {
		return Integer.class.equals(type.getInstanceClass()) || int.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaBooleanType(EDataType type) {
		return Boolean.class.equals(type.getInstanceClass()) || boolean.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaStringType(EDataType type) {
		return String.class.equals(type.getInstanceClass());
	}

	public static BigDecimal parseNumerical(String originalValue) {
		if ("true".equals(originalValue)) {
			originalValue = "1";
		} else if ("false".equals(originalValue)) {
			originalValue = "0";
		}
		if (FLOAT_SPECIFIC_CHARS.matchesAnyOf(originalValue)) {
			return new BigDecimal(originalValue);
		} else {
			return new BigDecimal(parseBigInteger(originalValue));
		}
	}

	private static BigInteger parseBigInteger(String originalValue) {
		if (isBinaryString(originalValue)) {
			return new BigInteger(originalValue.substring(BINARY_PREFIX.length()), 2);
		} else if (isOctalString(originalValue)) {
			return new BigInteger(originalValue.substring(OCTAL_PREFIX.length()), 8);
		} else if (isHexString(originalValue)) {
			return new BigInteger(originalValue.substring(HEX_PREFIX.length()), 16);
		} else {
			return new BigInteger(originalValue);
		}
	}

	private static int parseInteger(String originalValue) {
		if (isBinaryString(originalValue)) {
			return Integer.parseInt(originalValue.substring(BINARY_PREFIX.length()), 2);
		} else if (isOctalString(originalValue)) {
			return Integer.parseInt(originalValue.substring(OCTAL_PREFIX.length()), 8);
		} else if (isHexString(originalValue)) {
			return Integer.parseInt(originalValue.substring(HEX_PREFIX.length()), 16);
		} else {
			return Integer.parseInt(originalValue);
		}
	}

	private static boolean isBinaryString(String originalValue) {
		return originalValue.startsWith(BINARY_PREFIX);
	}

	private static boolean isHexString(String originalValue) {
		return originalValue.startsWith(HEX_PREFIX);
	}

	private static boolean isOctalString(String originalValue) {
		return originalValue.startsWith(OCTAL_PREFIX) && originalValue.length() > 1 && OCTAL_RANGE.matchesAllOf(originalValue);
	}

	private static boolean parseBoolean(String originalValue) {
		return BOOLEAN_TRUE_TEXT_REPRESENTATIONS.contains(originalValue);
	}

	/**
	 * {@link EClass}にmixedStringのステレオタイプが付与されているかを判定する。
	 * @param eClass 判定対象の{@link EClass}
	 * @return {@link EClass}にmixedStringのステレオタイプが付与されている場合、true。それ以外の場合、false。
	 */
	public static boolean hasMixedStringStereotype(EClass eClass) {
		return EmfUtils.hasStereotype(eClass, MIXED_STRING_STEREOTYPE);
	}

	/**
	 * {@link EStructuralFeature}の永続化時にロールラッパを使用するかを判定する。
	 * @param eStructuralFeature 判定対象の{@link EStructuralFeature}
	 * @param defaultValue {@link EStructuralFeature}にxml.roleWrapperEnabledが設定されていない場合のデフォルト値
	 * @return {@link EStructuralFeature}の永続化時にロールラッパを使用する場合、true。それ以外の場合、false。
	 */
	public static boolean isXmlRoleWrapperEnabled(EStructuralFeature eStructuralFeature, boolean defaultValue) {
		return EmfUtils.getBooleanTagValue(eStructuralFeature, XML_ROLE_WRAPPER_ELEMENT_TAG, defaultValue);
	}

	/**
	 * {@link EStructuralFeature}に設定されたxml.nameの値を取得する。
	 * @param eStructuralFeature 取得対象の{@link EStructuralFeature}
	 * @return　{@link EStructuralFeature}に設定されたxml.nameの値
	 */
	public static Optional<String> tryGetXmlName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, XML_NAME_TAG);
	}

	/**
	 * {@link EStructuralFeature}に設定されたxml.namePluralの値を取得する。
	 * @param eStructuralFeature 取得対象の{@link EStructuralFeature}
	 * @return　{@link EStructuralFeature}に設定されたxml.namePluralの値
	 */
	public static Optional<String> tryGetXmlPluralName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, XML_NAME_PLURAL_TAG);
	}

	/**
	 * <p>数値オブジェクトを{@link BigDecimal}に変換する。</p>
	 * <p>NOTE 現在、変換可能な数値オブジェクトは{@link BigDecimal}、{@link BigInteger}、{@link Boolean}、{@link Integer}のみであることに注意。</p>
	 * @param value 変換元の数値オブジェクト
	 * @return 変換可能な数値オブジェクトである場合、変換結果の{@link BigDecimal}。それ以外の場合、null。
	 */
	public static BigDecimal convertValueToBigDecimal(Object value) {
		if (value instanceof BigDecimal) {
			return new BigDecimal((BigInteger) value);

		} else if (value instanceof BigInteger) {
			return new BigDecimal((BigInteger) value);

		} else if (value instanceof Boolean) {
			Boolean booleanValue = (Boolean) value;
			return BigDecimal.valueOf(booleanValue ? BOOLEAN_TRUE_VALUE : BOOLEAN_FALSE_VALUE);

		} else if (value instanceof Integer) {
			return BigDecimal.valueOf((Integer) value);

		} else {
			return null;
		}
	}

	/**
	 * 数値型の属性かどうかを判定する。
	 * @param eAttribute 判定対象の{@link EAttribute}
	 * @return 数値型の属性である場合、true。それ以外の場合、false。
	 */
	public static boolean isNumericalAttribute(EAttribute eAttribute) {
		return isJavaBooleanType(eAttribute.getEAttributeType()) || isJavaIntegerType(eAttribute.getEAttributeType()) || isJavaBigInteger(eAttribute.getEAttributeType())
				|| isJavaBigDecimal(eAttribute.getEAttributeType());
	}

	/**
	 * M2モデルのオブジェクトへのリファレンスを生成する。
	 * @param object リファレンスの生成対象の{@link M2Object}
	 * @return M2モデルのオブジェクトへのリファレンス
	 */
	public static String generateAutosarReference(M2Object object) {
		StringBuilder sb = new StringBuilder();

		EObject container = object;
		while (container != null) {
			if (container instanceof Referrable) {
				Referrable referrable = (Referrable) container;
				sb.insert(0, REFERENCE_SEPARATOR + referrable.getShortName());
			}
			container = container.eContainer();
		}
		return sb.toString();
	}

	/**
	 * {@link Referrable}へのリファレンスベース(親モデル要素のリファレンス)を取得する。
	 * @param referrable リファレンスベースの取得対象の{@link Referrable}
	 * @return {@link Referrable}へのリファレンスベース
	 */
	public static String getReferenceBase(Referrable referrable) {
		String reference = referrable.getReference();
		int lastIndex = reference.lastIndexOf(REFERENCE_SEPARATOR);
		return lastIndex == -1 ? "" : reference.substring(0, lastIndex);
	}

	/**
	 * {@link EStructuralFeature}がAUTOSARのM2で定義された属性／リファレンスであるかを判定する。
	 * @param eFeature 判定対象の{@link EStructuralFeature}
	 * @return {@link EStructuralFeature}がAUTOSARのM2で定義された属性／リファレンスである場合、true。それ以外の場合、false。
	 */
	public static boolean isNonM2Feature(EStructuralFeature eFeature) {
		return EmfUtils.hasStereotype(eFeature, NON_M2_STEREOTYPE);
	}
}
