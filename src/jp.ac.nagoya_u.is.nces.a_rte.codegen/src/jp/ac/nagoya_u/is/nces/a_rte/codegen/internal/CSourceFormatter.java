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
package jp.ac.nagoya_u.is.nces.a_rte.codegen.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.regex.Pattern;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * ソースコードにフォーマットを掛けます
 */
public class CSourceFormatter {

	private static final String DEFAULT_LINE_SEPARATOR = "\n";
	private static final String DEFAULT_INDENT_CHARS = "\t";

	/** {　の判定パターン */
	private static final Pattern IF_CLOSE_PATTERN = Pattern.compile("\\{(/\\*.*\\*/|\\s)*\\\\?\\s*$");
	private static final Pattern EXTERN_C_PATTERN = Pattern.compile("extern\\s*\"C\"");

	/** インデントをかけるオペレータの配列 */
	private static final List<String> INDENT_OPERATORS = Lists.newArrayList("+", "-", "=", "|", "?", "&&", "||");
	/** インデントをかけないオペレータの配列 */
	private static final List<String> NON_INDENT_OPERATORS = Lists.newArrayList("++", "--");

	/** IndexCount */
	private int indexCount = 0;

	/** 次行にインデントを掛けるべきかどうか */
	private boolean isNextLineShoudIndexed = false;

	private final Reader reader;
	private final Writer writer;
	private final String lineSeparator;
	private final String indentChars;

	/**
	 * @param reader フォーマットを掛けたい文字列の入力元Reader
	 * @param writer フォーマット後文字列の出力先Writer
	 */
	public CSourceFormatter(Reader reader, Writer writer) {
		this.reader = reader;
		this.writer = writer;
		this.lineSeparator = DEFAULT_LINE_SEPARATOR;
		this.indentChars = DEFAULT_INDENT_CHARS;
	}

	/**
	 * Cコードフォーマットを掛けます．
	 * <p>
	 * 以下のフォーマットを掛けます
	 * <ul>
	 * <li>中括弧"{"のインデントを４Tabで行う</li>
	 * <li>２行以上の空行は１行にまとめる</li>
	 * </ul>
	 * </p>
	 * 
	 * @throws IOException
	 */
	public final void format() throws IOException {
		boolean prevLineisEmpty = false;
		BufferedReader bufferedReader = new BufferedReader(this.reader);

		try {
			while (true) {
				String line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				// フォーマットを掛ける準備をします
				// タブ-> スペース置換
				// 行の前後のスペースのトリミング
				String preparedLine = prepareFormatLine(line);

				// 2行以上空行が続く場合は書き込みしない
				if (preparedLine.isEmpty() && prevLineisEmpty) {
					continue;
				}
				decIndexCountIfCloseBrace(preparedLine);

				String formattedLine = ajustFormatIndex(ajustOperatorIndex(preparedLine));

				incIndexCountIfStartBrace(preparedLine);

				// 次行のフォーマットの準備
				this.isNextLineShoudIndexed = endWithAnyOperatorOf(line, INDENT_OPERATORS);

				if (formattedLine.startsWith("*")) {
					formattedLine = " " + formattedLine;
				}

				String s = formattedLine.trim();
				if (s.isEmpty()) {
					formattedLine = s;
				}
				prevLineisEmpty = formattedLine.isEmpty();

				this.writer.write(formattedLine);
				this.writer.write(this.lineSeparator);
			}
		} finally { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			bufferedReader.close();
		}
	}

	private String ajustFormatIndex(final String line) {
		return createFormatIndex() + line;
	}

	private void incIndexCountIfStartBrace(final String line) {
		if (IF_CLOSE_PATTERN.matcher(line).find() && !EXTERN_C_PATTERN.matcher(line).find()) {
			this.indexCount++;
		}
	}

	private String createFormatIndex() {
		return Strings.repeat(this.indentChars, getIndexCount());
	}

	private int getIndexCount() {
		return this.indexCount;
	}

	private void decIndexCountIfCloseBrace(final String line) {
		if (this.indexCount == 0) {
			return;
		}
		if (line.startsWith("}") && !EXTERN_C_PATTERN.matcher(line).find()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			this.indexCount--;
		}
	}

	private String prepareFormatLine(final String line) {
		return line.replaceAll("\t", this.indentChars).trim();
	}

	private String ajustOperatorIndex(final String line) {
		if (this.isNextLineShoudIndexed) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return this.indentChars + line;
		} else if (startWithAnyOperatorOf(line, INDENT_OPERATORS) && !startWithAnyOperatorOf(line, NON_INDENT_OPERATORS)) {
			return this.indentChars + line;
		} else {
			return line;
		}
	}

	private boolean endWithAnyOperatorOf(final String line, List<String> indentOperators) {
		return Iterables.any(indentOperators, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return line.endsWith(input);
			}
		});
	}

	private boolean startWithAnyOperatorOf(final String line, List<String> indentOperators) {
		return Iterables.any(indentOperators, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return line.startsWith(input);
			}
		});
	}
}
