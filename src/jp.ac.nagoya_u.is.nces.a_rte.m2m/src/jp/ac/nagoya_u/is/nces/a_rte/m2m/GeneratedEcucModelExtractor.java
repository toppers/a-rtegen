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
package jp.ac.nagoya_u.is.nces.a_rte.m2m;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_ROOT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.GENERATED_ECU_CONFIGURATION;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.resource.Resource;

public class GeneratedEcucModelExtractor {
	private class Extractor {
		private final ModelQuery sourceQuery;
		private EcucRoot sourceEcucRoot;
		private GeneratedEcuConfiguration generatedEcuConfiguration;

		private final Resource eDestResource;
		private EcucRoot destEcucRoot;

		public Extractor(Resource eDestResource, Resource eSourceResource) {
			this.eDestResource = eDestResource;
			this.sourceQuery = new ModelQuery(eSourceResource);
		}

		public void extract() throws ModelException {
			this.generatedEcuConfiguration = this.sourceQuery.findSingleByKind(GENERATED_ECU_CONFIGURATION);
			this.sourceEcucRoot = this.sourceQuery.findSingleByKind(ECUC_ROOT);

			// ECUCのルートを構築
			this.destEcucRoot = EmfUtils.copyItself(this.sourceEcucRoot);
			this.eDestResource.getContents().add(this.destEcucRoot);

			// OSのECUCを構築
			extractOs(this.destEcucRoot, this.sourceEcucRoot.getOs());
		}

		private void extractOs(EcucRoot destEcucRoot, Os sourceOs) {
			Os destOs = EmfUtils.copyItself(sourceOs);
			destEcucRoot.setOs(destOs);

			extractOsEvent(destOs, sourceOs);
			extractOsSpinlock(destOs, sourceOs);
			extractOsTask(destOs, sourceOs);
			extractOsIoc(destOs, sourceOs);
			extractOsTrustedFunction(destOs, sourceOs);
		}

		private void extractOsEvent(Os destOs, Os sourceOs) {
			for (OsEvent sourceOsEvent : this.generatedEcuConfiguration.getGeneratedOsEvent()) {
				destOs.getOsEvent().add(EmfUtils.copy(sourceOsEvent));
			}
		}

		private void extractOsSpinlock(Os destOs, Os sourceOs) {
			for (OsSpinlock sourceOsSpinlock : this.generatedEcuConfiguration.getGeneratedOsSpinlock()) {
				destOs.getOsSpinlock().add(EmfUtils.copy(sourceOsSpinlock));
			}
		}

		private void extractOsTask(Os destOs, Os sourceOs) {
			for (OsTask sourceOsTask : this.generatedEcuConfiguration.getGeneratedOsTask()) {
				OsTask destOsTask = EmfUtils.copy(sourceOsTask);
				destOs.getOsTask().add(destOsTask);

				// OSアプリケーションに割り付け
				if (!sourceOsTask.getOwnerApplication().isEmpty()) { // COVERAGE 常にtrue(現状，OSAPありの場合にしかタスクは生成されないため)
					OsApplication destOsApplication = findOrCreateDestOsApplication(destOs, sourceOsTask.getOwnerApplication().get(0));
					destOsApplication.getOsAppTask().add(destOsTask);
				}
			}
		}

		private void extractOsIoc(Os destOs, Os sourceOs) {
			OsIoc destOsIoc = EmfUtils.copyItself(sourceOs.getOsIoc());
			destOs.setOsIoc(destOsIoc);

			for (OsIocCommunication sourceOsIocCommunication : this.generatedEcuConfiguration.getGeneratedOsIocCommunication()) {
				destOsIoc.getOsIocCommunication().add(EmfUtils.copy(sourceOsIocCommunication));
			}
		}

		private void extractOsTrustedFunction(Os destOs, Os sourceOs) {
			for (OsApplicationTrustedFunction sourceOsTrustedFunction : this.generatedEcuConfiguration.getGeneratedOsTrustedFunction()) {
				OsApplication destOsApplication = findOrCreateDestOsApplication(destOs, sourceOsTrustedFunction.getParent());
				destOsApplication.getOsApplicationTrustedFunction().add(EmfUtils.copy(sourceOsTrustedFunction));
			}
		}

		private OsApplication findOrCreateDestOsApplication(Os destOs, OsApplication sourceOsApplication) {
			OsApplication destOsApplication = (OsApplication) this.eDestResource.getEObject(sourceOsApplication.getId());
			if (destOsApplication == null) {
				destOsApplication = EmfUtils.copyItself(sourceOsApplication);
				destOs.getOsApplication().add(destOsApplication);
			}
			/*
			 * NOTE：#91, #93対応
			 * 本来はAUTOSAR標準仕様に従ってツールチェーンの仕様定義およびRTEジェネレータの出力仕様を定義するべきだが，
			 * 2014/3末リリースに向けて暫定的に以下の対応とする．
			 *　・OsTrustedは出力しない(#91)
			 *　・OsApplicationCoreAssignmentは出力しない(#93)
			 */
			destOsApplication.setOsTrusted(null);
			destOsApplication.setOsApplicationCoreAssignment(null);
			return destOsApplication;
		}
	}

	public void extract(Resource eDestResource, Resource eSourceResource) throws M2MException {
		try {
			Extractor extractor = new Extractor(eDestResource, eSourceResource);
			extractor.extract();
		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new M2MException("Internal error occurred while generating OS configurations.", e);
		}
	}
}
