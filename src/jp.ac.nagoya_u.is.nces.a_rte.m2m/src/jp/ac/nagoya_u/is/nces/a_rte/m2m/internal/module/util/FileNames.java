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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;

public class FileNames { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)
	// ファイル名の接頭辞・接尾辞
	public static final String SOURCE_FILE_NAME_POSTFIX = ".c";
	public static final String HEADER_FILE_NAME_POSTFIX = ".h";
	private static final String RTE_FILE_NAME_PREFIX = "Rte_";
	private static final String SCHM_FILE_NAME_PREFIX = "SchM_";

	// ヘッダガードマクロ名の接頭辞・接尾辞
	private static final String HEADER_GUARD_NAME_POSTFIX = "_H";
	private static final String RTE_HEADER_GUARD_NAME_PREFIX = "RTE_";
	private static final String SCHM_HEADER_GUARD_NAME_PREFIX = "SCHM_";

	// ファイル名
	public static final String BSW_MEMORY_MAPPING_HEADER_FILE_NAME = "MemMap" + HEADER_FILE_NAME_POSTFIX;
	public static final String IOC_HEADER_FILE_NAME = "Ioc" + HEADER_FILE_NAME_POSTFIX;
	public static final String COM_HEADER_FILE_NAME = "Com" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_HEADER_FILE_NAME = "Rte" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_TYPE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Type" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_LIFECYCLE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Main" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_CONFIGURATION_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Cfg" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_VFB_TRACE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Hook" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_CALLBACK_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Cbk" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_BSW_API_HEADER_NAME = RTE_FILE_NAME_PREFIX + "Bsw_Api" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_UTILITY_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Util" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_COMMON_RTE_INTERNAL_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Common" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_SOURCE_FILE_NAME = "Rte" + SOURCE_FILE_NAME_POSTFIX;

	// ヘッダガードマクロ名
	public static final String RTE_HEADER_GUARD_NAME = "RTE" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_TYPE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "TYPE" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_LIFECYCLE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "MAIN" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_CONFIGURATION_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "CFG" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_VFB_TRACE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "HOOK" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_CALLBACK_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "CBK" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_BSW_API_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "BSW_API" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_UTILITY_HEEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "UTIL" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_COMMON_RTE_INTERNAL_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "COMMON" + HEADER_GUARD_NAME_POSTFIX;

	public static String createRteApplicationTypeHeaderFileName(Swc sourceSwc) {
		return RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createRteApplicationTypeHeaderGuardName(Swc sourceSwc) {
		return RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createRteApplicationHeaderFileName(Swc sourceSwc) {
		return RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createRteApplicationHeaderGuardName(Swc sourceSwc) {
		return RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkTypeHeaderFileName(Bswm sourceBswm) {
		return SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkTypeHeaderGuardName(Bswm sourceBswm) {
		return SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkHeaderFileName(Bswm sourceBswm) {
		return SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkHeaderGuardName(Bswm sourceBswm) {
		return SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createPartitionRteInternalHeaderFileName(Partition sourcePartition) {
		return RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createPartitionRteInternalHeaderGuardName(Partition sourcePartition) {
		return RTE_HEADER_GUARD_NAME_PREFIX + "PARTITION_" + sourcePartition.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createPartitionRteSourceFileName(Partition sourcePartition) {
		return RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + SOURCE_FILE_NAME_POSTFIX;
	}

	public static String createSwcMemoryMappingHeaderFileName(Swc sourceSwc) {
		return sourceSwc.getCompartmentName() + "_MemMap" + HEADER_FILE_NAME_POSTFIX;
	}
}
