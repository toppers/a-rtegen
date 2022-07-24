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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rte Initialization Strategy Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteInitializationStrategyEnum()
 * @model
 * @generated
 */
public enum RteInitializationStrategyEnum implements Enumerator {
	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION(0, "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION", "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART(1, "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART", "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_RTE_START(2, "RTE_INITIALIZATION_STRATEGY_AT_RTE_START", "RTE_INITIALIZATION_STRATEGY_AT_RTE_START"), /**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART(3, "RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART", "RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_NONE(4, "RTE_INITIALIZATION_STRATEGY_NONE", "RTE_INITIALIZATION_STRATEGY_NONE");

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE = 0;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE = 1;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE = 2;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE = 3;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Rte Initialization Strategy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RteInitializationStrategyEnum[] VALUES_ARRAY =
		new RteInitializationStrategyEnum[] {
			RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION,
			RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART,
			RTE_INITIALIZATION_STRATEGY_AT_RTE_START,
			RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART,
			RTE_INITIALIZATION_STRATEGY_NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rte Initialization Strategy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RteInitializationStrategyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteInitializationStrategyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteInitializationStrategyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum get(int value) {
		switch (value) {
			case RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION;
			case RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART;
			case RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_RTE_START;
			case RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART;
			case RTE_INITIALIZATION_STRATEGY_NONE_VALUE: return RTE_INITIALIZATION_STRATEGY_NONE;
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
	private RteInitializationStrategyEnum(int value, String name, String literal) {
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
	
} //RteInitializationStrategyEnum
