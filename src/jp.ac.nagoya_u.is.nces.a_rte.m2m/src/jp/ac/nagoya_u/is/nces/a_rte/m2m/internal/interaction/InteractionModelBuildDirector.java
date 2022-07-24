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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERACTION_REFERRABLE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.ComSendProxyModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.EntityInteractionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.GeneratedEcucModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.InteractionModelBuildContext;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SenderReceiverImplementationModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SenderReceiverInteractionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SourceModelCacheBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.util.InteractionModelUtils;

public class InteractionModelBuildDirector implements IInteractionModelBuildDirector {
	/*
	 * (non-Javadoc)
	 * 
	 * @see jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.
	 * IInteractionModelBuildDirector
	 * #build(jp.ac.nagoya_u.is.nces.a_rte.m2m.internal
	 * .interaction.builder.BuildContext)
	 */
	@Override
	public void build(InteractionModelBuildContext context) throws M2MException {

		try {
			// モデル変換元モデルのキャッシュを構築
			SourceModelCacheBuilder sourceModelCacheBuilder = new SourceModelCacheBuilder(context);
			sourceModelCacheBuilder.build();

			// モデルの構築
			InteractionRoot interactionRoot = InteractionFactory.eINSTANCE.createInteractionRoot();
			context.eResource.getContents().add(interactionRoot);
			context.cache.interactionRoot = interactionRoot;

			// エンティティの連携内容・連携実現方式モデルを構築
			EntityInteractionModelBuilder entityInteractionBuilder = new EntityInteractionModelBuilder(context);
			entityInteractionBuilder.build();

			// S/Rの連携内容モデルを構築
			SenderReceiverInteractionModelBuilder srInteractionBuilder = new SenderReceiverInteractionModelBuilder(context);
			srInteractionBuilder.build();

			// S/Rの連携実現方式モデルを構築
			SenderReceiverImplementationModelBuilder srImplementationBuilder = new SenderReceiverImplementationModelBuilder(context);
			srImplementationBuilder.build();

			ComSendProxyModelBuilder comSendProxyBuilder = new ComSendProxyModelBuilder(context);
			comSendProxyBuilder.build();

			// 不足しているECUCモデルを生成
			GeneratedEcucModelBuilder generatedEcucBuilder = new GeneratedEcucModelBuilder(context);
			generatedEcucBuilder.build();

			// 構築したモデルにIDを割り振り
			buildModelIds(context);

		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new M2MException("Internal error occurred while building RTE design.", e);
		}
	}

	private void buildModelIds(InteractionModelBuildContext context) {
		int idIndex = 1;
		for (InteractionReferrable referrable : context.query.<InteractionReferrable> findByKind(INTERACTION_REFERRABLE)) {
			referrable.setId(InteractionModelUtils.ID_PREFIX + referrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}
}
