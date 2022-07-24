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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_REFERRABLE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.BuiltinSymbolModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.LogicalCompartmentModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.ModuleModelBuildContext;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteFileModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteFunctionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteStaticSymbolModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.SourceModelCacheBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.util.ModuleModelUtils;

public class ContractPhaseModuleModelBuildDirector implements IModuleModelBuildDirector {

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.IModuleModelBuildDirector#build(jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.ModuleModelBuildContext)
	 */
	@Override
	public void build(ModuleModelBuildContext context) throws M2MException {
		ModuleRoot moduleRoot = ModuleFactory.eINSTANCE.createModuleRoot();
		context.eResource.getContents().add(moduleRoot);
		context.cache.moduleRoot = moduleRoot;

		try {
			// 生成元モデルのキャッシュを構築
			SourceModelCacheBuilder sourceModelCacheBuilder = new SourceModelCacheBuilder(context);
			sourceModelCacheBuilder.build();

			// モジュールモデルの論理構造の構築
			LogicalCompartmentModelBuilder logicalCompartmentModelBuilder = new LogicalCompartmentModelBuilder(context);
			logicalCompartmentModelBuilder.buildFromSwcAndBswm();

			// 基底型モデルの構築
			BuiltinSymbolModelBuilder builtinTypeBuilder = new BuiltinSymbolModelBuilder(context);
			builtinTypeBuilder.build();

			// RTEの静的シンボル，および関数モデルの構築
			RteStaticSymbolModelBuilder rteStaticSymbolModelBuilder = new RteStaticSymbolModelBuilder(context);
			rteStaticSymbolModelBuilder.buildApiSymbols();

			RteFunctionModelBuilder rteApiBuilder = new RteFunctionModelBuilder(context);
			rteApiBuilder.buildApiFunctions();

			// RTEのファイルモデルの構築
			RteFileModelBuilder fileBuilder = new RteFileModelBuilder(context);
			fileBuilder.buildRoot();
			fileBuilder.buildDependentFiles();
			fileBuilder.buildApiFiles();
			if (context.options.doesGenerateMemoryMappingHeaderSkelton) {
				fileBuilder.buildMemoryMappingHeaders();
			}
			fileBuilder.buildGenerationInfo();
			fileBuilder.sortFileContents();

			// モデルにIDを割り振る
			buildModelIds(context);

		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new M2MException("Internal error occurred while building RTE code structures.", e);
		}
	}

	private void buildModelIds(ModuleModelBuildContext context) {
		int idIndex = 1;
		for (ModuleReferrable referrable : context.query.<ModuleReferrable> findByKind(MODULE_REFERRABLE)) {
			referrable.setId(ModuleModelUtils.ID_PREFIX + referrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}
}
