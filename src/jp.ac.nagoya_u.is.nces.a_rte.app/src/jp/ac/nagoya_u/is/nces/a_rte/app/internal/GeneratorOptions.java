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
package jp.ac.nagoya_u.is.nces.a_rte.app.internal;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.app.AppResources;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteInteractionModelBuilderOptions;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilderOptions;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import com.google.common.collect.Lists;

/**
 * RTEジェネレータの実行時のオプションを表す。
 */
public class GeneratorOptions {

	/**
	 * RTEの生成フェーズを表す。
	 */
	public enum GenerationPhase {
		/**
		 * CONTRACTフェーズ
		 */
		CONTRACT,

		/**
		 * GENERATEフェーズ
		 */
		GENERATE,
	}

	/**
	 * ヘルプを表示するかどうか
	 */
	@Option(name = "--help", usage = "Display this information")
	public boolean showsHelp = false;

	/**
	 * 生成したRTEのファイルに生成時刻のタイムスタンプを出力するかどうか
	 */
	@Option(name = "-t", aliases = "--output-timestamp", usage = "Write the generation timestamp in RTE/SCHM codes")
	public boolean writeGenerationTimeStamp = false;

	/**
	 * RTEジェネレータのバージョンを表示するかどうか
	 */
	@Option(name = "-v", aliases = "--version", usage = "Display the version of the RTE generator")
	public boolean showsVersion = false;

	/**
	 * 生成したRTEの出力ディレクトリのパス
	 */
	@Option(name = "-o", aliases = "--output-directory", usage = "Specify the output directory for generated files (default: .)", metaVar = "<directory>")
	public String outputDirectory = ".";

	/**
	 * RTEの生成フェーズ
	 */
	@Option(name = "-p", aliases = "--generation-phase", usage = "Specify the RTE/SCHM generation phase(CONTRACT or GENERATE) (default: GENERATE)", metaVar = "<phase>")
	public GenerationPhase generationPhase = GenerationPhase.GENERATE;

	/**
	 * <p>デバッグモードを有効にするかどうか</p>
	 * <p>デバッグモードが有効に設定された場合、RTEジェネレータは実行時に内部モデルのダンプファイルを出力する。</p>
	 */
	@Option(hidden = true, name = "--debug", usage = "Enable debug mode")
	public boolean debugModeEnabled = false;

	/**
	 * RTEコンフィグレーションヘッダを出力するかどうか
	 */
	@Option(hidden = true, name = "--suppress-config-header", usage = "Suppress the generation of RTE Configuration Header")
	public boolean suppressConfigHeader = false;

	/**
	 * メモリマッピングheaderのスケルトンを生成するかどうか
	 */
	@Option(hidden = true, name = "--generate-memmap-skel", usage = "Generate memory mapping skeltons")
	public boolean doesGenerateMemoryMappingHeaderSkelton = false;

	/**
	 * RTEテスト用のヘルパファイル(周辺モジュールのスタブ、モック)を生成するかどうか
	 */
	@Option(hidden = true, name = "--generate-tests", usage = "Generate test helpers")
	public boolean doesGenerateTests = false;

	/**
	 * <p>RTEを強制的に生成するかどうか</p>
	 * <p>このオプションが設定された場合、RTEジェネレータは、RTEの生成に必要なECUCコンフィグレーションが不足している場合でも、コンフィグレーションが補完可能であればRTEを生成する。</p>
	 */
	@Option(hidden = true, name = "--force-generate-rte", usage = "Force to generate RTE")
	public boolean forcesGenerateRte = false;

	/**
	 * <p>static inlineによるインライン化を抑制するかどうか</p>
	 * <p>このオプションが</p>
	 */
	@Option(name = "--without-static-inline", usage = "Suppress static inlines")
	public boolean withoutStaticInline = false;

	/**
	 * <p>マルチコア対応のCOMを使用するかどうか</p>
	 * <p>このオプションが設定された場合、RTEジェネレータはマルチコア対応のCOMに最適化されたRTEを生成する。</p>
	 */
	@Option(name = "--com-multicore", usage = "Use COM Apis for multi core support")
	public boolean comMultiCore = false;
	
	/**
	 * RTEジェネレータの入力となるAUTOSAR XML
	 */
	@Argument(usage = "Input files(AUTOSAR XMLs)", metaVar = "<file1> [<file2> [<file3>] ...]", required = true)
	public List<String> inputFiles = Lists.newArrayList();
	
	/**
	 * AUTOSARスキーマファイルのディレクトリのパス
	 */
	@Option(name = "--schema-directory", usage = "Specify the schema directory for AUTOSAR scheme file", metaVar = "<directory>")
	public String schemaDirectory = AppResources.getDefaultSchemaDirectory();

	/**
	 * ツール情報の表示のためのオプションが指定されているかを判定する。
	 * @return 表示オプションが指定されている場合、true。それ以外の場合、false。
	 */
	public boolean isShowsOptionEnabled() {
		return this.showsHelp || this.showsVersion;
	}

	/**
	 * RTE連携モデル生成用のオプションを生成する。
	 * @return 生成したオプション
	 */
	public RteInteractionModelBuilderOptions createRteInteractionModelBuilderOptions() {
		RteInteractionModelBuilderOptions builderOptions = new RteInteractionModelBuilderOptions();
		builderOptions.comMultiCore = this.comMultiCore;
		return builderOptions;
	}

	/**
	 * RTEモジュールモデル生成用のオプションを生成する。
	 * @return 生成したオプション
	 */
	public RteModuleModelBuilderOptions createRteModuleModelBuilderOptions() {
		RteModuleModelBuilderOptions builderOptions = new RteModuleModelBuilderOptions();
		builderOptions.suppressConfigHeader = this.suppressConfigHeader;
		builderOptions.writeGenerationTimeStamp = this.writeGenerationTimeStamp;
		builderOptions.doesGenerateMemoryMappingHeaderSkelton = this.doesGenerateMemoryMappingHeaderSkelton;
		builderOptions.withoutStaticInline = this.withoutStaticInline;
		builderOptions.generationPhase = (this.generationPhase == GenerationPhase.GENERATE);
		return builderOptions;
	}
}
