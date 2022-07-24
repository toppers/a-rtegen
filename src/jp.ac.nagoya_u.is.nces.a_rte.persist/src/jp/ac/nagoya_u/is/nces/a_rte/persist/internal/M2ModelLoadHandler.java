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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util.EcucModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils.XmlWrapType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.base.Preconditions;

public class M2ModelLoadHandler extends DefaultHandler {

	private final static Logger LOGGER = Logger.getLogger(M2ModelLoadHandler.class.getName());

	private static enum XmlContextType {
		ROLE_WRAPPER, ROLE, TYPE, REFERENCE_WRAPPER, REFERENCE, TYPE_REFERENCE, UNKNOWN, VARIANTS, CONDITIONAL
	}

	private static class XmlContext {
		public String xmlTagName;
		public ExtendedEObject contextM2Element;
		public EStructuralFeature contextM2Feature;
		public XmlWrapType wrapType;
		public XmlContextType contextType;

		public XmlContext(String xmlTagName, ExtendedEObject contextM2Element, EStructuralFeature contextM2Feature, XmlWrapType wrapType, XmlContextType contextType) {
			this.xmlTagName = xmlTagName;
			this.contextM2Element = contextM2Element;
			this.contextM2Feature = contextM2Feature;
			this.wrapType = wrapType;
			this.contextType = contextType;
		}

		public XmlContext createRoleWrapperContext(String xmlTagName, EStructuralFeature m2Feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2Feature, wrapType, XmlContextType.ROLE_WRAPPER);
		}

		public XmlContext createReferenceWrapperContext(String xmlTagName, EStructuralFeature m2feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2feature, wrapType, XmlContextType.REFERENCE_WRAPPER);
		}

		public XmlContext createEClassRoleContext(String xmlTagName, ExtendedEObject m2Element, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, m2Element, null, wrapType, XmlContextType.ROLE);
		}

		public XmlContext createEDataTypeRoleContext(String xmlTagName, EStructuralFeature m2Feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2Feature, wrapType, XmlContextType.ROLE);
		}

		public XmlContext createReferenceContext(String xmlTagName, EStructuralFeature m2feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2feature, wrapType, XmlContextType.REFERENCE);
		}

		public XmlContext createEClassRoleContextInWrapper(String xmlTagName, ExtendedEObject m2Element) {
			return new XmlContext(xmlTagName, m2Element, null, XmlWrapType.ROLE, XmlContextType.ROLE); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
		}

		public XmlContext createEDataTypeRoleContextInWrapper(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.ROLE, XmlContextType.ROLE); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
		}

		public XmlContext createTypeContextInWrapper(String xmlTagName, ExtendedEObject m2Element) {
			return new XmlContext(xmlTagName, m2Element, null, XmlWrapType.TYPE, XmlContextType.TYPE);
		}

		public XmlContext createReferenceContextInWrapper(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.REFERENCE, XmlContextType.REFERENCE);
		}

		public XmlContext createVariantsContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, this.wrapType, XmlContextType.VARIANTS);
		}

		public XmlContext createConditionalContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, this.wrapType, XmlContextType.CONDITIONAL);
		}

		public XmlContext createUnknownContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.UNKNOWN, XmlContextType.UNKNOWN);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "XmlContext [xmlTagName=" + this.xmlTagName + ", contextM2Element=" + this.contextM2Element + ", contextM2Feature=" + this.contextM2Feature + ", wrapType=" + this.wrapType
					+ ", contextType=" + this.contextType + "]";
		}

		private static M2ModelLoadHandler.XmlContext createRootContext(M2Root m2Root) {
			return new M2ModelLoadHandler.XmlContext(null, m2Root, null, XmlWrapType.TYPE, M2ModelLoadHandler.XmlContextType.TYPE);
		}
	}

	private List<XmlContext> xmlContexts;
	private M2Root m2Root;
	private StringBuilder leaf = new StringBuilder();

	public M2Root getM2Root() {
		return this.m2Root;
	}

	@Override
	public void startDocument() throws SAXException {
		this.xmlContexts = new ArrayList<XmlContext>();
		this.m2Root = M2Factory.eINSTANCE.createM2Root();
		pushXmlContext(XmlContext.createRootContext(this.m2Root));
	}

	@Override
	public void endDocument() throws SAXException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		leaf.setLength(0);

		XmlContext currentXmlContext = getCurrentXmlContext();
		if (localName.endsWith(M2XmlUtils.VARIANTS_TAG_NAME_SUFFIX)) {
			pushXmlContext(currentXmlContext.createVariantsContext(localName));
			return;
		} else if (localName.endsWith(M2XmlUtils.CONDITIONAL_TAG_NAME_SUFFIX)) {
			pushXmlContext(currentXmlContext.createConditionalContext(localName));
			return;
		}
		
		switch (currentXmlContext.wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
		case ROLE_WRAPPER_AND_TYPE:
		case ROLE_AND_TYPE:
		case REFERENCE_WRAPPER_AND_REFERENCE:
			pushXmlContext(startElementInWrapper(localName));
			break;
		case ROLE:
		case TYPE:
			pushXmlContext(startElementInRoleOrType(localName));
			break;
		default:
			pushXmlContext(currentXmlContext.createUnknownContext(localName));
			break;
		}
	}

	private XmlContext startElementInRoleOrType(String localName) {
		XmlContext currentXmlContext = getCurrentXmlContext();

		EStructuralFeature m2feature = getM2FeatureByXmlElement(localName);
		if (m2feature != null) {
			XmlWrapType wrapType = M2XmlUtils.getXmlWrapType(m2feature);
			switch (wrapType) {
			case ROLE:
				if (m2feature.getEType() instanceof EClass) {
					EClass eClass = (EClass) m2feature.getEType();
					ExtendedEObject newElement = createM2Element(eClass);
					setValueToCurrentContextM2Element(m2feature, newElement);
					return currentXmlContext.createEClassRoleContext(localName, newElement, wrapType);
				} else if (m2feature.getEType() instanceof EDataType) { // COVERAGE 常にtrue(現状，ETypeはEClassとEDataTypeのいずれかであるため)
					return currentXmlContext.createEDataTypeRoleContext(localName, m2feature, wrapType);
				}
				break;
			case ROLE_WRAPPER_AND_ROLE:
			case ROLE_WRAPPER_AND_TYPE:
				return currentXmlContext.createRoleWrapperContext(localName, m2feature, wrapType);
			case ROLE_AND_TYPE:
				return currentXmlContext.createEDataTypeRoleContext(localName, m2feature, wrapType);
			case REFERENCE_WRAPPER_AND_REFERENCE:
				return currentXmlContext.createReferenceWrapperContext(localName, m2feature, wrapType);
			case REFERENCE:
			case TYPE_REFERENCE:
				return currentXmlContext.createReferenceContext(localName, m2feature, wrapType);
			default: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
				break;
			}
		}

		return currentXmlContext.createUnknownContext(localName);
	}

	private XmlContext startElementInWrapper(String localName) {
		XmlContext currentXmlContext = getCurrentXmlContext();
		switch (currentXmlContext.wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
			if (localName.equals(getCurrentXmlRoleName())) {
				if (currentXmlContext.contextM2Feature.getEType() instanceof EClass) {
					EClass eClass = (EClass) currentXmlContext.contextM2Feature.getEType();
					ExtendedEObject newElement = createM2Element(eClass);
					setValueToCurrentContextM2Element(getCurrentXmlContext().contextM2Feature, newElement);
					return currentXmlContext.createEClassRoleContextInWrapper(localName, newElement);
				} else if (currentXmlContext.contextM2Feature.getEType() instanceof EDataType) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
					return currentXmlContext.createEDataTypeRoleContextInWrapper(localName);
				}
			}
			break;
		case ROLE_WRAPPER_AND_TYPE:
		case ROLE_AND_TYPE:
			EClass eClass = (EClass) M2Package.eINSTANCE.getEClassifier(NameStringUtils.upperCaseWithHyphenToPascalCase(localName));
			if (eClass != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				ExtendedEObject newElement = createM2Element(eClass);
				setValueToCurrentContextM2Element(getCurrentXmlContext().contextM2Feature, newElement);
				return currentXmlContext.createTypeContextInWrapper(localName, newElement);
			}
			break;
		case REFERENCE_WRAPPER_AND_REFERENCE:
			if (localName.equals(getCurrentXmlReferenceRoleName())) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない) 
				return currentXmlContext.createReferenceContextInWrapper(localName);
			}
			break;
		default: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
			break;
		}
		return currentXmlContext.createUnknownContext(localName); // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (getCurrentXmlContext().contextType) {
		case ROLE:
			EStructuralFeature valueFeature = getValueFeature();
			if (valueFeature != null && valueFeature.getEType() instanceof EDataType) {
				String originalValue = leaf.toString();

				Object value;
				try {
					if (valueFeature.getEType() instanceof EEnum) {
						value = M2ModelUtils.convertValueForFeature(M2XmlUtils.getM2EnumLiteralName(originalValue), valueFeature);
					} else {
						value = M2ModelUtils.convertValueForFeature(originalValue, valueFeature);
					}
				} catch (ModelException e) {
					// ジェネレータで未使用のEcucContainerValueのNumerical値のパースエラー時に、仮の値に置き換えることで、
					// 未使用パラメータの型エラーにより生成処理が止まることを防ぐ。
					if (isSkippableNumericalParameter()) {
						// 使用しないNumericalパラメータであるため、仮の値(0)をセットすることで対処する。
						// 未使用であるためソース出力に影響せず、また、不足コンフィグ情報の出力対象にもならないため、仮の値を入れても問題ない。
						value = new BigDecimal(0);
					} else {
						throw new SAXException("Error found in the parameter '" + valueFeature.getName() + "' of " + ModelLabels.getLabel(getCurrentXmlContext().contextM2Element) + ". " + e.getMessage(),
								e);
					}
				}
				LOGGER.finest("set value '" + value + "' to " + valueFeature);
				setValueToCurrentContextM2Element(valueFeature, value);
			}
			break;
		case REFERENCE:
		case TYPE_REFERENCE:
			String value = leaf.toString();
			LOGGER.finest("set reference '" + value + "' to " + getCurrentXmlContext().contextM2Feature);
			getCurrentXmlContext().contextM2Element.addUnresolvedReference((EReference) getCurrentXmlContext().contextM2Feature, M2ModelUtils.ID_PREFIX + value);
			break;
		default:
			break;
		}

		popM2Element();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		leaf.append(String.valueOf(ch, start, length));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#warning(org.xml.sax.SAXParseException)
	 */
	@Override
	public void warning(SAXParseException exception) throws SAXException { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		if (getValueFeature() != null) {
			throw new SAXException("Error found in the parameter '" + getValueFeature().getName() + "' of " + ModelLabels.getLabel(getCurrentXmlContext().contextM2Element) + ". " + exception.getMessage(),
					exception);
		} else {
			throw exception;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException)
	 */
	@Override
	public void error(SAXParseException exception) throws SAXException {
		if (getValueFeature() != null) {
			throw new SAXException("Error found in the parameter '" + getValueFeature().getName() + "' of " + ModelLabels.getLabel(getCurrentXmlContext().contextM2Element) + ". " + exception.getMessage(),
					exception);
		} else {
			throw exception;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException)
	 */
	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		if (getValueFeature() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			throw new SAXException("Error found in the parameter '" + getValueFeature().getName() + "' of " + ModelLabels.getLabel(getCurrentXmlContext().contextM2Element) + ". " + exception.getMessage(),
					exception);
		} else {
			throw exception;
		}
	}

	private EStructuralFeature getValueFeature() {
		EStructuralFeature valueFeature = null;
		if (M2ModelUtils.hasMixedStringStereotype(getCurrentXmlContext().contextM2Element.eClass())) {
			valueFeature = getCurrentXmlContext().contextM2Element.eClass().getEStructuralFeature(M2ModelUtils.MIXED_STRING_VALUE_FEATURE_NAME);
		} else {
			if (getCurrentXmlContext().contextM2Feature != null) {
				valueFeature = getCurrentXmlContext().contextM2Feature;
			}
		}
		return valueFeature;
	}

	/* パース中のEcucModuleConfigurationValuesをXmlContextsから取得する */
	private EcucModuleConfigurationValues getParsingEcucModuleConfigurationValues() {
		for (XmlContext context : xmlContexts) {
			if (context.contextM2Element instanceof EcucModuleConfigurationValues) {
				return (EcucModuleConfigurationValues)context.contextM2Element;
			}
		}
		return null; // COVERAGE 常に未到達(isSkippableNumericalParameter()からの呼び出しでは到達しないため，未カバレッジで問題ない)
	}
	
	/* パース中のEcucContainerValueをXmlContextsから取得する */
	private List<EcucContainerValue> getParsingEcucContainerValues() {
		List<EcucContainerValue> values = new ArrayList<EcucContainerValue>();
		for (XmlContext context : xmlContexts) {
			if (context.contextM2Element instanceof EcucContainerValue) {
				if (!values.contains((EcucContainerValue)context.contextM2Element)) {
					values.add((EcucContainerValue)context.contextM2Element);
				}
			}
		}
		return values;
	}

	/* containerClass配下に、definitionRefで示されるクラスオブジェクトを作成する */
	private ExtendedEObject createObjectInEcucPackage(ExtendedEObject containerClass, String definitionRef) {
		EStructuralFeature eFeature = containerClass.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(definitionRef));
		if (eFeature == null) {
			return null;
		}
		EClass eClass = (EClass) eFeature.getEType();
		return (ExtendedEObject) EcucFactory.eINSTANCE.create(eClass);
	}
	
	/* containerClass配下に、definitionRefで示されるfeatureをセット可能か */
	private boolean isDefinedInEcore(ExtendedEObject containerClass, String definitionRef) {
		EStructuralFeature eFeature = containerClass.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(definitionRef));
		return eFeature != null;
	}

	/**
	 * パース中のパラメータが、スキップ可能(ジェネレータで使用しない)かを判定する
	 * ecucのコンフィグ情報、かつ、ジェネレータで使用するNumricalパラメータの場合にtrueを返す
	 * それ以外の場合にfalseを返す
	 */
	private boolean isSkippableNumericalParameter() {
		ExtendedEObject valueClass = getCurrentXmlContext().contextM2Element;
		if (!(valueClass instanceof EcucNumericalParamValue)) {
			return false;
		}
		EcucNumericalParamValue numericalValueClass = (EcucNumericalParamValue)valueClass;
		
		EcucModuleConfigurationValues configValues = getParsingEcucModuleConfigurationValues();
		if (configValues == null) { // COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			// EcucModuleConfigurationValuesをパース中でなければ、Numericalパラメータをパースしないため、到達しない
			return false;
		}
		
		ExtendedEObject containerClass = EcucFactory.eINSTANCE.createEcucRoot();

		// m2.EcucModuleConfigurationValuesに対応するecucパッケージのインスタンスを作成できるかにより、対象か否かを判定する
		containerClass = createObjectInEcucPackage(containerClass, configValues.getDefinitionRef());
		if (containerClass == null) {
			// 対象としないモジュールであるため、不要なパラメータである
			return true;
		}

		List<EcucContainerValue> containerValues = getParsingEcucContainerValues();
		if (containerValues.isEmpty()) { // COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			// コンテナ以外はNumericalパラメータを保持しないため、到達しない
			return false;
		}
		for (EcucContainerValue containerValue : containerValues) {
			// m2.EcucContainerValueに対応するecucパッケージのインスタンスを作成できるかにより、対象か否かを判定する
			containerClass = createObjectInEcucPackage(containerClass, containerValue.getDefinitionRef());
			if (containerClass == null) {
				// 対象としないコンテナであるため、不要なパラメータである
				return true;
			}
		}

		return !isDefinedInEcore(containerClass, numericalValueClass.getDefinitionRef());
	}

	private void setValueToCurrentContextM2Element(EStructuralFeature m2Feature, Object value) {
		Preconditions.checkArgument(m2Feature.getEType().isInstance(value));
		if (m2Feature.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> values = (EList<Object>) getCurrentXmlContext().contextM2Element.eGet(m2Feature);
			values.add(value);
		} else {
			getCurrentXmlContext().contextM2Element.eSet(m2Feature, value);
		}
	}

	private XmlContext getCurrentXmlContext() {
		return this.xmlContexts.get(this.xmlContexts.size() - 1);
	}

	private String getCurrentXmlRoleName() {
		return M2XmlUtils.getXmlRoleName(getCurrentXmlContext().contextM2Feature); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない) 
	}

	private String getCurrentXmlReferenceRoleName() {
		return M2XmlUtils.getXmlReferenceRoleName(getCurrentXmlContext().contextM2Feature);
	}

	private void pushXmlContext(XmlContext context) {
		LOGGER.finest("enter " + context);
		this.xmlContexts.add(context);
	}

	private void popM2Element() {
		LOGGER.finest("exit " + getCurrentXmlContext());
		this.xmlContexts.remove(this.xmlContexts.size() - 1);
	}

	private EStructuralFeature getM2FeatureByXmlElement(String localName) {
		return M2XmlUtils.getM2FeatureByTagName(getCurrentXmlContext().contextM2Element.eClass(), localName);
	}

	private ExtendedEObject createM2Element(EClass eClass) {
		return (ExtendedEObject) M2Factory.eINSTANCE.create(eClass);
	}
}
