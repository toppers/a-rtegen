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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.SW_COMPONENT_INSTANCE_IN_SYSTEM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CORE__CORE_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.GeneratorInfos;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

/**
 * 論理区画のモデルを構築する。
 */
public class LogicalCompartmentModelBuilder {
	private final ModuleModelBuildContext context;

	public LogicalCompartmentModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	/**
	 * システムコンフィグレーションから論理区画のモデルを構築する。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildFromSystem() throws ModelException {
		buildRoot();

		Optional<EcucPartitionCollection> ecucPartitionCollection = this.context.query.tryFindSingleByKind(ECUC_PARTITION_COLLECTION);
		if (ecucPartitionCollection.isPresent()) {
			// パーティションあり構成
			buildFromPartitionedSystem(this.context.cache.rte, ecucPartitionCollection.get());
		} else {
			// パーティションなし構成
			buildFromNonPartitionedSystem(this.context.cache.rte);
		}
		
		buildBswm(this.context.cache.rte);
	}

	/**
	 * SW-C・BSWMのコンフィグレーションから論理区画のモデルを構築する。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildFromSwcAndBswm() throws ModelException {
		buildRoot();
		buildFromSwcAndBswm(this.context.cache.rte);
	}

	private void buildFromSwcAndBswm(Rte targetRte) {
		Core destCore = createDefaultCore();
		targetRte.getCore().add(destCore);

		Partition destPartition = createDefaultPartition();
		destCore.getPartition().add(destPartition);

		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			destPartition.getSwc().add(createSwc(sourceSwComponentType));
		}

		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = sourceBswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}

			Bswm destBswm = createBswm(sourceBswModuleDescription);
			targetRte.getBswm().add(destBswm);

			// エクスキュータブルをpartedBswmに登録する
			for (BswSchedulableEntity sourceBswSchedulableEntity : internalBehavior.getBswSchedulableEntity()) {
				PartedBswm targetPartedBswm = createPartedBswm(destBswm, destPartition);
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destBswSchedulableEntity = createBswSchedulableEntity(sourceBswSchedulableEntity, sourceBswModuleDescription);
				targetPartedBswm.getDependentBswSchedulableEntity().add(destBswSchedulableEntity);
			}
		}

		// マスタコアのBSWM配置パーティションをキャッシュ
		this.context.cache.masterBswPartition = destPartition;
	}
	
	private void buildBswm(Rte targetRte) throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = sourceBswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}
			Bswm bswm = createBswm(sourceBswModuleDescription);
			targetRte.getBswm().add(bswm);

			// エクスキュータブルをpartedBswmに登録する
			for (BswSchedulableEntity sourceBswSchedulableEntity : internalBehavior.getBswSchedulableEntity()) {
				Collection<EcucPartition> usingEcucPartitions = this.context.query.get(sourceBswSchedulableEntity, BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY);
				EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
				Partition targetPartition = this.context.builtQuery.findDestPartition(usingEcucPartition);
				
				PartedBswm targetPartedBswm = createPartedBswm(bswm, targetPartition);
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destBswSchedulableEntity = createBswSchedulableEntity(sourceBswSchedulableEntity, sourceBswModuleDescription);
				targetPartedBswm.getDependentBswSchedulableEntity().add(destBswSchedulableEntity);
			}
		}
	}

	private void buildRoot() {
		Rte destRte = ModuleFactory.eINSTANCE.createRte();
		destRte.setGenerationInfo(createGenerationInfo());
		this.context.cache.moduleRoot.setRte(destRte);
		this.context.cache.rte = destRte;
	}

	private GenerationInfo createGenerationInfo() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		GenerationInfo destGenerationInfo = ModuleFactory.eINSTANCE.createGenerationInfo();
		destGenerationInfo.setGeneratorName(GeneratorInfos.GENERATOR_TOOL_NAME);
		destGenerationInfo.setGeneratorVersion(GeneratorInfos.GENERATOR_VERSION);
		if (context.options.writeGenerationTimeStamp) {
			destGenerationInfo.setGenerationDate(format.format(new Date()));
		}
		return destGenerationInfo;
	}

	private void buildFromPartitionedSystem(Rte targetRte, EcucPartitionCollection sourceEcucPartitionCollection) throws ModelException {
		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		for (Integer sourceCoreId : sourceEcucPartitionCollection.getAssignedCores()) {
			targetRte.getCore().add(createCore(sourceCoreId, osOs));
		}

		for (EcucPartition sourceEcucPartition : sourceEcucPartitionCollection.getEcucPartition()) {
			Core targetOwnerCore = this.context.query.findSingle(hasAttr(CORE__CORE_ID, sourceEcucPartition.getOwnerCore()));

			Partition destPartition = createPartition(sourceEcucPartition);
			targetOwnerCore.getPartition().add(destPartition);

			for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : sourceEcucPartition.getEcucPartitionSoftwareComponent()) {
				destPartition.getSwc().add(createSwc(sourceSwComponentInstanceInSystem.getPrototype().getType()));
			}
		}

		// マスタコアのBSWM配置パーティションをキャッシュ
		this.context.cache.masterBswPartition = this.context.builtQuery.findDestPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE パーティション構成ではマスタコアのBSWM配置パーティションは必ず存在する
	}

	private void buildFromNonPartitionedSystem(Rte targetRte) {
		Core destCore = createDefaultCore();
		targetRte.getCore().add(destCore);

		Partition destPartition = createDefaultPartition();
		destCore.getPartition().add(destPartition);

		for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : this.context.query.<SwComponentInstanceInSystem> findByKind(SW_COMPONENT_INSTANCE_IN_SYSTEM)) {
			Swc destSwc = createSwc(sourceSwComponentInstanceInSystem.getPrototype().getType());
			destPartition.getSwc().add(destSwc);
		}

		// マスタコアのBSWM配置パーティションをキャッシュ
		this.context.cache.masterBswPartition = destPartition;
	}

	private Core createDefaultCore() {
		Core destCore = ModuleFactory.eINSTANCE.createCore();
		destCore.setCompartmentName(String.valueOf(ConfigValues.DEFAULT_CORE_ID));
		destCore.setCoreId(ConfigValues.DEFAULT_CORE_ID);
		destCore.setIsMasterCore(true);
		return destCore;
	}

	private Core createCore(Integer sourceCoreId, OsOS osOs) {
		Core destCore = ModuleFactory.eINSTANCE.createCore();
		destCore.setCompartmentName(String.valueOf(sourceCoreId));
		destCore.setCoreId(sourceCoreId);
		destCore.setIsMasterCore(Objects.equal(osOs.getOsMasterCoreId(), destCore.getCoreId()));
		return destCore;
	}

	private Partition createDefaultPartition() {
		Partition partition = ModuleFactory.eINSTANCE.createPartition();
		partition.setCompartmentName("DefaultPartition");
		return partition;
	}

	private Partition createPartition(EcucPartition sourceEcucPartition) {
		Partition destPartition = ModuleFactory.eINSTANCE.createPartition();
		destPartition.setCompartmentName(sourceEcucPartition.getShortName());
		destPartition.setIsBswPartition(sourceEcucPartition.getEcucPartitionBswModuleExecution());
		destPartition.setSingleSource(sourceEcucPartition);
		return destPartition;
	}

	private Swc createSwc(SwComponentType sourceSwComponentType) {
		Swc destSwc = ModuleFactory.eINSTANCE.createSwc();
		destSwc.setCompartmentName(sourceSwComponentType.getShortName());
		destSwc.setSingleSource(sourceSwComponentType);
		return destSwc;
	}

	private Bswm createBswm(BswModuleDescription sourceBswModuleDescription) {
		Bswm destBswm = ModuleFactory.eINSTANCE.createBswm();
		destBswm.setCompartmentName(Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription));
		destBswm.setSingleSource(sourceBswModuleDescription);
		return destBswm;
	}
	
	private PartedBswm createPartedBswm(Bswm targetBswm, Partition targetPartition) {
		PartedBswm destPartedBswm = targetBswm.getSinglePartedBswm(targetPartition);
		if (destPartedBswm == null) {
			destPartedBswm = ModuleFactory.eINSTANCE.createPartedBswm();
			targetPartition.getPartedBswm().add(destPartedBswm);
			targetBswm.getPartedBswm().add(destPartedBswm);
		}
		return destPartedBswm;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity createBswSchedulableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity sourceBswModuleEntity, BswModuleDescription sourceBswModuleDescription) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destEntity = ModuleFactory.eINSTANCE.createBswSchedulableEntity();
		destEntity.setSingleSource(sourceBswModuleEntity);
		destEntity.setSymbolName(SymbolNames.createBswSchedulableEntityName(sourceBswModuleDescription, sourceBswModuleEntity));
		return destEntity;
	}
}
