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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;

import com.google.common.base.Optional;

public class MemoryMappingModelBuilder {

	private final ModuleModelBuildContext context;

	public MemoryMappingModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public MemoryMapping buildDataElementMemoryMapping(Optional<EcucPartition> sourcePartition, VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		SwAddrMethod swAddrMethod = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION);
		String alignment = this.context.query.get(sourceDataInstanceInComposition.getPrototype(), VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC);
		String memorySectionName = swAddrMethod != null ? SymbolNames.createVariableMemorySectionName(swAddrMethod, Optional.fromNullable(alignment)) : SymbolNames
				.createVariableMemorySectionName(sourcePartition);

		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildDataElementMemoryMapping(Optional<EcucPartition> sourcePartition, VariableDataPrototype prototype) {
		SwAddrMethod swAddrMethod =prototype.getSwAddrMethod();
		String alignment = prototype.getSwAlignment();
		String memorySectionName = swAddrMethod != null ? SymbolNames.createVariableMemorySectionName(swAddrMethod, Optional.fromNullable(alignment)) : SymbolNames
				.createVariableMemorySectionName(sourcePartition);

		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildModeDeclarationMemoryMapping(Optional<EcucPartition> sourcePartition, ModeDeclarationGroupPrototype prototype) {
		String memorySectionName = SymbolNames.createVariableMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}
	
	public MemoryMapping buildRteVariableMemoryMapping(Optional<EcucPartition> sourcePartition) {
		String memorySectionName = SymbolNames.createVariableMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildRteFunctionMemoryMapping(Optional<EcucPartition> sourcePartition) {
		String memorySectionName = SymbolNames.createFunctionMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}

	private BswMemoryMapping buildRteMemoryMapping(String memorySectionName) {
		Optional<BswMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(this.context.cache.rte.getRteMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			BswMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createBswMemoryMapping();
			memoryMapping.setPrefix(SymbolNames.RTE_MEMORY_MAPPING_PREFIX);
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			this.context.cache.rte.getRteMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}

	public SwcMemoryMapping buildRunnableEntityMemoryMapping(Swc targetSwc, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity) {
		String memorySectionName = sourceRunnableEntity.getSwAddrMethod() != null ? SymbolNames.createFunctionMemorySectionName(sourceRunnableEntity.getSwAddrMethod())
				: SymbolNames.createSwcFunctionMemorySectionName();

		return buildSwcMemoryMapping(targetSwc, memorySectionName);
	}

	public BswMemoryMapping buildBswSchedulableEntityMemoryMapping(PartedBswm targetPartedBswm, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity sourceBswSchedulableEntity) {
		String memorySectionName = sourceBswSchedulableEntity.getSwAddrMethod() != null ? SymbolNames.createFunctionMemorySectionName(sourceBswSchedulableEntity.getSwAddrMethod())
				: SymbolNames.createSwcFunctionMemorySectionName();

		return buildBswmMemoryMapping(targetPartedBswm, memorySectionName);
	}

	private BswMemoryMapping buildBswmMemoryMapping(PartedBswm targetPartedBswm, String memorySectionName) {
		Optional<BswMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(targetPartedBswm.getBswMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			BswMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createBswMemoryMapping();
			memoryMapping.setPrefix(generateSnp(targetPartedBswm.getBswm()));
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			targetPartedBswm.getBswMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}

	private SwcMemoryMapping buildSwcMemoryMapping(Swc targetSwc, String memorySectionName) {
		Optional<SwcMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(targetSwc.getSwcMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			SwcMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createSwcMemoryMapping();
			memoryMapping.setPrefix(targetSwc.getCompartmentName());
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			targetSwc.getSwcMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}
	
	private String generateSnp(Bswm targetBswm) {
		// SectionNamePrefixに対応する場合はここを変更する必要あり
		return ((BswModuleDescription) targetBswm.getSingleSource()).getShortName();	
	}
}
