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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ecuc Configuration Variant Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getEcucConfigurationVariantEnum()
 * @model
 * @generated
 */
public enum EcucConfigurationVariantEnum implements Enumerator {
	/**
	 * The '<em><b>Variant Post Build Selectable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_SELECTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD_SELECTABLE(5, "variantPostBuildSelectable", "variantPostBuildSelectable"),

	/**
	 * The '<em><b>Variant Pre Compile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_PRE_COMPILE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_PRE_COMPILE(6, "variantPreCompile", "variantPreCompile"),

	/**
	 * The '<em><b>Preconfigured Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONFIGURED_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONFIGURED_CONFIGURATION(0, "preconfiguredConfiguration", "preconfiguredConfiguration"),

	/**
	 * The '<em><b>Variant Post Build Loadable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_LOADABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD_LOADABLE(4, "variantPostBuildLoadable", "variantPostBuildLoadable"),

	/**
	 * The '<em><b>Variant Post Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD(3, "variantPostBuild", "variantPostBuild"),

	/**
	 * The '<em><b>Variant Link Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_LINK_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_LINK_TIME(2, "variantLinkTime", "variantLinkTime"),

	/**
	 * The '<em><b>Recommended Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDED_CONFIGURATION(1, "recommendedConfiguration", "recommendedConfiguration");

	/**
	 * The '<em><b>Variant Post Build Selectable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build Selectable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_SELECTABLE
	 * @model name="variantPostBuildSelectable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_SELECTABLE_VALUE = 5;

	/**
	 * The '<em><b>Variant Pre Compile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Pre Compile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_PRE_COMPILE
	 * @model name="variantPreCompile"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_PRE_COMPILE_VALUE = 6;

	/**
	 * The '<em><b>Preconfigured Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preconfigured Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECONFIGURED_CONFIGURATION
	 * @model name="preconfiguredConfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONFIGURED_CONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>Variant Post Build Loadable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build Loadable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_LOADABLE
	 * @model name="variantPostBuildLoadable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_LOADABLE_VALUE = 4;

	/**
	 * The '<em><b>Variant Post Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD
	 * @model name="variantPostBuild"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_VALUE = 3;

	/**
	 * The '<em><b>Variant Link Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Link Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_LINK_TIME
	 * @model name="variantLinkTime"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_LINK_TIME_VALUE = 2;

	/**
	 * The '<em><b>Recommended Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recommended Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED_CONFIGURATION
	 * @model name="recommendedConfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDED_CONFIGURATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ecuc Configuration Variant Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EcucConfigurationVariantEnum[] VALUES_ARRAY =
		new EcucConfigurationVariantEnum[] {
			VARIANT_POST_BUILD_SELECTABLE,
			VARIANT_PRE_COMPILE,
			PRECONFIGURED_CONFIGURATION,
			VARIANT_POST_BUILD_LOADABLE,
			VARIANT_POST_BUILD,
			VARIANT_LINK_TIME,
			RECOMMENDED_CONFIGURATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Ecuc Configuration Variant Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EcucConfigurationVariantEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EcucConfigurationVariantEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EcucConfigurationVariantEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum get(int value) {
		switch (value) {
			case VARIANT_POST_BUILD_SELECTABLE_VALUE: return VARIANT_POST_BUILD_SELECTABLE;
			case VARIANT_PRE_COMPILE_VALUE: return VARIANT_PRE_COMPILE;
			case PRECONFIGURED_CONFIGURATION_VALUE: return PRECONFIGURED_CONFIGURATION;
			case VARIANT_POST_BUILD_LOADABLE_VALUE: return VARIANT_POST_BUILD_LOADABLE;
			case VARIANT_POST_BUILD_VALUE: return VARIANT_POST_BUILD;
			case VARIANT_LINK_TIME_VALUE: return VARIANT_LINK_TIME;
			case RECOMMENDED_CONFIGURATION_VALUE: return RECOMMENDED_CONFIGURATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EcucConfigurationVariantEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EcucConfigurationVariantEnum
