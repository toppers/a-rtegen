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
package jp.ac.nagoya_u.is.nces.a_rte.app;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.app.internal.CmdLineParserUtils;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.ContractPhaseRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratePhaseRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratorOptions;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.IRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelEnvironment;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.GeneratorInfos;
import jp.ac.nagoya_u.is.nces.a_rte.validation.ModelValidationEnvironment;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * RTEジェネレータのアプリケーション機能を提供する。
 */
public class RteGeneratorApp {
	private static final Logger LOGGER = Logger.getLogger(RteGeneratorApp.class.getName());

	private GeneratePhaseRteGenerator generatePhaseRteGenerator;
	private ContractPhaseRteGenerator contractPhaseRteGenerator;

	private final GeneratorInitOptions generatorInitOptions;

	/**
	 * RTEジェネレータのJavaアプリケーション実行時のエントリポイント。
	 * @param args Javaアプリケーション実行引数
	 */
	public static void main(String[] args) {
		RteGeneratorApp app = new RteGeneratorApp();
		app.execute(args);
	}

	/**
	 * デフォルトの{@link RteGeneratorApp}を構築する。
	 */
	public RteGeneratorApp() {
		GeneratorInitOptions generatorInitOptions = new GeneratorInitOptions();
		generatorInitOptions.internalDataTypesFile = AppResources.getDefaultInternalDataTypesFile();
		generatorInitOptions.uncrustifyExecutableFile = AppResources.getDefaultUncrustifyExecutableFile();
		generatorInitOptions.uncrustifyConfigFile = AppResources.getDefaultUncrustifyConfigFile();
		this.generatorInitOptions = generatorInitOptions;
	}

	/**
	 * アプリケーションの初期設定を指定して{@link RteGeneratorApp}を構築する。
	 * @param generatorInitOptions アプリケーションの初期化オプション
	 */
	public RteGeneratorApp(GeneratorInitOptions generatorInitOptions) {
		this.generatorInitOptions = generatorInitOptions;
	}

	/**
	 * アプリケーションを実行する。
	 * @param args アプリケーション実行引数
	 */
	public void execute(String[] args) {
		GeneratorOptions options = new GeneratorOptions();

		CmdLineParser parser = new CmdLineParser(options);
		parser.setUsageWidth(100);

		try {
			parser.parseArgument(args);

		} catch (CmdLineException e) {
			// 表示オプション（ヘルプ表示，もしくはバージョン表示）が指定された場合は，エラーを無視する
			if (!options.isShowsOptionEnabled()) {
				System.err.println("Invalid command line options.");
				System.err.println(e.getMessage());
				System.err.println();
				showUsage(System.err, parser);
				return;
			}
		}

		if (options.showsHelp) {
			showUsage(System.out, parser);
			return;
		}

		if (options.showsVersion) {
			showVersion();
			return;
		}

		generate(options);
	}

	private void showUsage(PrintStream outputStream, CmdLineParser parser) {
		outputStream.print("Usage: rtegen");
		CmdLineParserUtils.printSingleLineUsage(parser, outputStream);
		outputStream.println();
		outputStream.println();
		parser.printUsage(outputStream);
	}

	private void showVersion() {
		System.out.println(GeneratorInfos.GENERATOR_COMMAND_NAME + " (" + GeneratorInfos.GENERATOR_TOOL_NAME + ") " + GeneratorInfos.GENERATOR_VERSION);
	}

	private void generate(GeneratorOptions options) {
		options.inputFiles.add(0, this.generatorInitOptions.internalDataTypesFile.getAbsolutePath());

		try {
			// RTEジェネレータを実行
			IRteGenerator rteGenerator = getRteGenerator(options);
			rteGenerator.generate(options);

		} catch (AppException e) {
			System.err.println("Generation cancelled on error.");
			LOGGER.log(Level.SEVERE, e.getMessage(), e);

		} catch (Exception e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			System.err.println("Generation cancelled on error.");
			LOGGER.log(Level.SEVERE, "Internal error occurred.", e);
		}
	}

	private IRteGenerator getRteGenerator(GeneratorOptions options) throws AppException {
		switch (options.generationPhase) {
		case CONTRACT:
			return this.getContractPhaseRteGenerator();
		case GENERATE:
		default:
			return this.getGeneratePhaseRteGenerator();
		}
	}

	private GeneratePhaseRteGenerator getGeneratePhaseRteGenerator() throws AppException {
		if (this.generatePhaseRteGenerator == null) {
			ModelEnvironment.initializeEnvironment();
			ModelValidationEnvironment.initializeEnvironment();

			GeneratePhaseRteGenerator generator = new GeneratePhaseRteGenerator(this.generatorInitOptions);
			this.generatePhaseRteGenerator = generator;
		}
		return this.generatePhaseRteGenerator;
	}

	private ContractPhaseRteGenerator getContractPhaseRteGenerator() throws AppException {
		if (this.contractPhaseRteGenerator == null) {
			ModelEnvironment.initializeEnvironment();
			ModelValidationEnvironment.initializeEnvironment();

			ContractPhaseRteGenerator generator = new ContractPhaseRteGenerator(this.generatorInitOptions);
			this.contractPhaseRteGenerator = generator;
		}
		return this.contractPhaseRteGenerator;
	}
}
