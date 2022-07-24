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
package jp.ac.nagoya_u.is.nces.a_rte.persist;

import java.io.File;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.InstanceModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelMerger;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelReferenceResolver;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ToEcucMapper;

import org.eclipse.emf.ecore.resource.Resource;

public class AutosarModelLoader {
	private final static Logger LOGGER = Logger.getLogger(AutosarModelLoader.class.getName());

	private final M2ModelMerger m2ModelMerger;

	private File schemaFile;
	private M2ModelLoader m2ModelLoader;

	/**
	 * ジェネレートフェーズ用のAutosarModelLoaderを生成する．
	 * 
	 * @return 生成されたジェネレートトフェーズ用のAutosarModelLoader．
	 */
	public static AutosarModelLoader forGeneratePhase() {
		return new AutosarModelLoader();
	}

	/**
	 * コントラクトフェーズ用のAutosarModelLoaderを生成する． 現状，ジェネレートフェーズとの差異は設けていない．
	 * 
	 * @return 生成されたコントラクトフェーズ用のAutosarModelLoader．
	 */
	public static AutosarModelLoader forContractPhase() {
		return new AutosarModelLoader();
	}

	private AutosarModelLoader() {
		this.m2ModelMerger = new M2ModelMerger();
	}

	public void setSchemaFile(File schemaFile) {
		this.schemaFile = schemaFile;
		this.m2ModelLoader = null;
	}

	public void loadM2(Resource eResource, Iterable<String> files) throws PersistException {
		Autosar mergedAutosar = M2Factory.eINSTANCE.createAutosar();
		for (String file : files) {
			LOGGER.fine("Loading AUTOSAR file " + file);
			M2Root m2Root = getM2ModelLoader().load(file);

			LOGGER.fine("Merging AUTOSAR file " + file);
			this.m2ModelMerger.merge(mergedAutosar, m2Root.getAutosar());
		}

		M2Root m2Root = M2Factory.eINSTANCE.createM2Root();
		m2Root.setAutosar(mergedAutosar);
		eResource.getContents().add(m2Root);
		
		M2ModelReferenceResolver referenceResolver = new M2ModelReferenceResolver();
		referenceResolver.resolve(m2Root.getAutosar());
	}

	public void loadInstance(Resource eResource) throws PersistException {
		// インスタンスモデルの構築
		InstanceModelBuilder builder = new InstanceModelBuilder(eResource);
		builder.build();

		// M2モデル情報のECUCモデルへのマッピング
		M2ToEcucMapper mapper = new M2ToEcucMapper(eResource);
		mapper.map();
	}
	private M2ModelLoader getM2ModelLoader() throws PersistException {
		if (this.m2ModelLoader == null) {
			this.m2ModelLoader = new M2ModelLoader(this.schemaFile);
		}
		return this.m2ModelLoader;
	}
}
