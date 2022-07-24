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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.google.common.base.Strings;

public class IndentingXMLStreamWriter implements XMLStreamWriter {

	private static final String DEFAULT_INDENT_CHARS = "\t";
	private static final String DEFAULT_LINE_SEPARATOR = "\n";

	private final XMLStreamWriter xmlStreamWriter;
	private int indentLevel = 0;

	private int prevEventType;
	private final String lineSeparator;
	private final String indentChars;

	public IndentingXMLStreamWriter(XMLStreamWriter xmlStreamWriter) {
		this.xmlStreamWriter = xmlStreamWriter;
		this.lineSeparator = DEFAULT_LINE_SEPARATOR;
		this.indentChars = DEFAULT_INDENT_CHARS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#close()
	 */
	@Override
	public void close() throws XMLStreamException {
		this.xmlStreamWriter.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#flush()
	 */
	@Override
	public void flush() throws XMLStreamException {
		this.xmlStreamWriter.flush();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getNamespaceContext()
	 */
	@Override
	public NamespaceContext getNamespaceContext() {
		return this.xmlStreamWriter.getNamespaceContext(); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getPrefix(java.lang.String)
	 */
	@Override
	public String getPrefix(String uri) throws XMLStreamException {
		return this.xmlStreamWriter.getPrefix(uri); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getProperty(java.lang.String)
	 */
	@Override
	public Object getProperty(String name) throws IllegalArgumentException {
		return this.xmlStreamWriter.getProperty(name); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#setDefaultNamespace(java.lang.String)
	 */
	@Override
	public void setDefaultNamespace(String uri) throws XMLStreamException { // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
		this.xmlStreamWriter.setDefaultNamespace(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#setNamespaceContext(javax.xml.namespace
	 * .NamespaceContext)
	 */
	@Override
	public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {
		this.xmlStreamWriter.setNamespaceContext(context); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#setPrefix(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void setPrefix(String prefix, String uri) throws XMLStreamException {
		this.xmlStreamWriter.setPrefix(prefix, uri); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void writeAttribute(String prefix, String namespaceURI, String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(prefix, namespaceURI, localName, value); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(namespaceURI, localName, value); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeAttribute(String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(localName, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCData(java.lang.String)
	 */
	@Override
	public void writeCData(String data) throws XMLStreamException {
		this.xmlStreamWriter.writeCData(data); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCharacters(char[], int, int)
	 */
	@Override
	public void writeCharacters(char[] text, int start, int len) throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(text, start, len); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCharacters(java.lang.String)
	 */
	@Override
	public void writeCharacters(String text) throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(text);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeComment(java.lang.String)
	 */
	@Override
	public void writeComment(String data) throws XMLStreamException {
		this.xmlStreamWriter.writeComment(data); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeDTD(java.lang.String)
	 */
	@Override
	public void writeDTD(String dtd) throws XMLStreamException {
		this.xmlStreamWriter.writeDTD(dtd); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeDefaultNamespace(java.lang.String)
	 */
	@Override
	public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {
		this.xmlStreamWriter.writeDefaultNamespace(namespaceURI); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		beforeStartElement();
		beforeEndElement();
		this.xmlStreamWriter.writeEmptyElement(prefix, localName, namespaceURI); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {
		this.xmlStreamWriter.writeEmptyElement(namespaceURI, localName); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String localName) throws XMLStreamException {
		this.xmlStreamWriter.writeEmptyElement(localName); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEndDocument()
	 */
	@Override
	public void writeEndDocument() throws XMLStreamException {
		this.xmlStreamWriter.writeEndDocument();
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEndElement()
	 */
	@Override
	public void writeEndElement() throws XMLStreamException {
		beforeEndElement();
		this.xmlStreamWriter.writeEndElement();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEntityRef(java.lang.String)
	 */
	@Override
	public void writeEntityRef(String name) throws XMLStreamException {
		this.xmlStreamWriter.writeEntityRef(name); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeNamespace(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {
		this.xmlStreamWriter.writeNamespace(prefix, namespaceURI);
	}

	@Override
	public void writeProcessingInstruction(String target, String data) throws XMLStreamException {
		this.xmlStreamWriter.writeProcessingInstruction(target, data); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeProcessingInstruction(java.lang
	 * .String)
	 */
	@Override
	public void writeProcessingInstruction(String target) throws XMLStreamException {
		this.xmlStreamWriter.writeProcessingInstruction(target); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartDocument()
	 */
	@Override
	public void writeStartDocument() throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeStartDocument(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeStartDocument(String encoding, String version) throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(encoding, version);
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeStartDocument(java.lang.String)
	 */
	@Override
	public void writeStartDocument(String version) throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(version); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeStartElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(prefix, localName, namespaceURI); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(namespaceURI, localName); // COVERAGE 常に未達(現在のツールワークフローでは使用されないが，インタフェースの都合上残している． コードレビュー済みであるため問題ない)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String)
	 */
	@Override
	public void writeStartElement(String localName) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(localName);
	}

	private void beforeStartElement() throws XMLStreamException {
		if (this.prevEventType == XMLStreamConstants.START_ELEMENT) {
			incrementIndent();
		}
		lineFeed();
		this.prevEventType = XMLStreamConstants.START_ELEMENT;
	}

	private void beforeEndElement() throws XMLStreamException {
		if (this.prevEventType == XMLStreamConstants.END_ELEMENT) {
			decrementIndent();
			lineFeed();
		}
		this.prevEventType = XMLStreamConstants.END_ELEMENT;
	}

	private void lineFeed() throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(this.lineSeparator + Strings.repeat(this.indentChars, this.indentLevel));
	}

	private void incrementIndent() {
		this.indentLevel++;
	}

	private void decrementIndent() {
		this.indentLevel--;
	}

}
