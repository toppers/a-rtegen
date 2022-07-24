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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsActivateTaskApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;

import com.google.common.base.Optional;

/**
 * RTEが依存するOS APIのモデルを構築する。
 */
public class OsApiModelBuilder {

	private final ModuleModelBuildContext context;

	public OsApiModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() {
		Optional<ImmediateComSendProxy> sourceComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (sourceComSendProxy.isPresent()) {
			buildComSendSignalImmediateSetEventApi(this.context.cache.rte, sourceComSendProxy.get());
		}
		for (EntityStarter entityStarter : this.context.query.<EntityStarter> findByKind((ENTITY_STARTER))){
			if (entityStarter instanceof OsTaskActivateEntityStarter) {
				buildOsTaskActivateApi(this.context.cache.rte, (OsTaskActivateEntityStarter) entityStarter);
			} else if (entityStarter instanceof OsEventSetEntityStarter) { // COVERAGE 常にtrue(サブクラスは2つのため）
				buildOsSetEventActivateApi(this.context.cache.rte, (OsEventSetEntityStarter) entityStarter);
			}
		}
	}

	private void buildComSendSignalImmediateSetEventApi(Rte targetRte, ImmediateComSendProxy sourceComSendProxy) {
		OsSetEventApi destOsSetEventApi = ModuleFactory.eINSTANCE.createOsSetEventApi();
		destOsSetEventApi.setSingleSource(sourceComSendProxy);
		destOsSetEventApi.setSymbolName(SymbolNames.OS_SET_EVENT_API_NAME);
		destOsSetEventApi.setOsTaskId(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		destOsSetEventApi.setOsEventId(sourceComSendProxy.getOsEvent().getShortName());
		targetRte.getDependentOsApi().add(destOsSetEventApi);
	}
	
	private void buildOsTaskActivateApi(Rte targetRte, OsTaskActivateEntityStarter entityStarter) {
		OsActivateTaskApi destOsApi = ModuleFactory.eINSTANCE.createOsActivateTaskApi();
		destOsApi.setSingleSource(entityStarter);
		destOsApi.setSymbolName(SymbolNames.OS_ACTIVATE_TASK_API_NAME);
		destOsApi.setOsTaskId(entityStarter.getSourceOsTask().getShortName());
		targetRte.getDependentOsApi().add(destOsApi);
	}
	
	private void buildOsSetEventActivateApi(Rte targetRte, OsEventSetEntityStarter entityStarter) {
		OsSetEventApi destOsApi = ModuleFactory.eINSTANCE.createOsSetEventApi();
		destOsApi.setSingleSource(entityStarter);
		destOsApi.setSymbolName(SymbolNames.OS_SET_EVENT_API_NAME);
		destOsApi.setOsTaskId(entityStarter.getSourceOsTask().getShortName());
		destOsApi.setOsEventId(entityStarter.getSourceOsEvent().getShortName());
		targetRte.getDependentOsApi().add(destOsApi);
	}
}
