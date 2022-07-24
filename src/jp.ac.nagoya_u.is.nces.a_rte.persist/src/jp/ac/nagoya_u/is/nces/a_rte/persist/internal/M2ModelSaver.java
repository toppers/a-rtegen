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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_CONTAINER_VALUE__DEFINITION_REF;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_PARAMETER_VALUE__DEFINITION_REF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils.XmlWrapType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.io.Files;

public class M2ModelSaver {

	private static class Saver {
		private static final String XML_VERSION = "1.0";
		private static final Charset DEFAULT_ENCODING = Charset.forName("UTF-8");

		private final M2Root m2Root;
		private final XMLStreamWriter writer;

		public Saver(M2Root m2Root, File file) throws XMLStreamException, IOException {
			this.m2Root = m2Root;

			Files.createParentDirs(file);
			XMLOutputFactory factory = XMLOutputFactory.newInstance();
			factory.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, true);
			this.writer = new IndentingXMLStreamWriter(factory.createXMLStreamWriter(new FileOutputStream(file), DEFAULT_ENCODING.name()));
		}

		private void save() throws XMLStreamException {
			try {
				this.writer.writeStartDocument(DEFAULT_ENCODING.name(), XML_VERSION);
				this.writer.writeStartElement("AUTOSAR");
				this.writer.writeNamespace("", M2XmlUtils.AUTOSAR_NAMESPACE);
				this.writer.writeNamespace("xsi", M2XmlUtils.NAMESPACE_XSI);
				this.writer.writeAttribute("xsi:schemaLocation", M2XmlUtils.SCHEMA_LOCATION);

				writeContent(this.m2Root.getAutosar());
				this.writer.writeEndElement();

				this.writer.writeEndDocument();
				this.writer.flush();

			} finally { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				this.writer.close();
			}
		}

		private void writeContent(EObject eObject) throws XMLStreamException {
			for (EStructuralFeature eStructuralFeature : getPersistentFeatures(eObject.eClass())) {
				if (!eObject.eIsSet(eStructuralFeature)) {
					continue;
				}

				XmlWrapType xmlWrapType = M2XmlUtils.getXmlWrapType(eStructuralFeature);
				switch (xmlWrapType) {
				case REFERENCE:
					writeContentOfReference(eObject, eStructuralFeature);
					break;
				case REFERENCE_WRAPPER_AND_REFERENCE: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					// NOTE 未サポート
					break;
				case ROLE:
					writeContentOfRole(eObject, eStructuralFeature);
					break;
				case ROLE_AND_TYPE: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					writeContentOfRoleAndType(eObject, eStructuralFeature);
					break;
				case ROLE_WRAPPER_AND_ROLE: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					writeContentOfRoleWrapperAndRole(eObject, eStructuralFeature);
					break;
				case ROLE_WRAPPER_AND_TYPE:
					writeContentOfRoleWrapperAndType(eObject, eStructuralFeature);
					break;
				case TYPE_REFERENCE: // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					// NOTE 未サポート
					break;
				case UNKNOWN:
				default:
					break;
				}
			}
		}

		private Iterable<EStructuralFeature> getPersistentFeatures(EClass eClass) {
			return Iterables.filter(eClass.getEAllStructuralFeatures(), new Predicate<EStructuralFeature>() {
				@Override
				public boolean apply(EStructuralFeature input) {
					return !input.isTransient() && !input.isDerived() && !isID(input) && !M2ModelUtils.isNonM2Feature(input); // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
				}
			});
		}

		private boolean isID(EStructuralFeature eStructuralFeature) {
			if (eStructuralFeature instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) eStructuralFeature;
				return eAttribute.isID();
			} else {
				return false;
			}
		}

		private void writeContentOfReference(EObject eContainerObject, EStructuralFeature eStructuralFeature) throws XMLStreamException {
			List<Referrable> referrables = EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature);
			writeReference(eStructuralFeature, referrables);
		}

		private void writeReference(EStructuralFeature eStructuralFeature, List<Referrable> referrables) throws XMLStreamException {
			for (Referrable referrable : referrables) {
				String referenceRoleName = M2XmlUtils.getXmlReferenceRoleName(eStructuralFeature);
				this.writer.writeStartElement(referenceRoleName);
				this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, M2XmlUtils.getXmlTypeName(referrable.eClass()));
				this.writer.writeCharacters(referrable.getReference());
				this.writer.writeEndElement();
			}
		}

		private void writeContentOfRoleWrapperAndType(EObject eContainerObject, EStructuralFeature eStructuralFeature) throws XMLStreamException {
			List<EObject> eObjects = EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature);
			writeRoleWrapperAndTypes(eStructuralFeature, eObjects);
		}

		private void writeContentOfRoleWrapperAndRole(EObject eContainerObject, EStructuralFeature eStructuralFeature) throws XMLStreamException {
			if (eStructuralFeature.getEType() instanceof EDataType) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
				writeValueRoleWrapperAndRoles(eStructuralFeature, EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature));
			} else { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
				List<EObject> eObjects = EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature);
				writeRoleWrapperAndRoles(eStructuralFeature, eObjects);
			}
		}

		private void writeContentOfRoleAndType(EObject eContainerObject, EStructuralFeature eStructuralFeature) throws XMLStreamException {
			List<EObject> eObjects = EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			writeRoleAndTypes(eStructuralFeature, eObjects);
		}

		private void writeContentOfRole(EObject eContainerObject, EStructuralFeature eStructuralFeature) throws XMLStreamException {
			if (eStructuralFeature.getEType() instanceof EDataType) {
				if (isDefinitionRefRole(eStructuralFeature)) {
					writeDefinitionRefRole(eStructuralFeature, eContainerObject.eGet(eStructuralFeature));
				} else {
					writeValueRoles(eStructuralFeature, EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature));
				}
			} else { // COVERAGE 現状のツールワークフローでは通らないが，コードレビュー済みであるため問題ない
				List<EObject> eObjects = EmfUtils.getFeatureValues(eContainerObject, eStructuralFeature);
				writeRoles(eStructuralFeature, eObjects);
			}
		}

		private void writeRoleWrapperAndRoles(EStructuralFeature eStructuralFeature, List<EObject> eObjects) throws XMLStreamException {
			String roleWrapperName = M2XmlUtils.getXmlRoleWrapperName(eStructuralFeature); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			this.writer.writeStartElement(roleWrapperName);
			for (EObject eObject : eObjects) {
				writeRole(eStructuralFeature, eObject);
			}
			this.writer.writeEndElement();
		}

		private void writeRoles(EStructuralFeature eStructuralFeature, List<EObject> eObjects) throws XMLStreamException { // COVERAGE 現状のツールワークフローでは通らないが，コードレビュー済みであるため問題ない
			for (EObject eObject : eObjects) {
				writeRole(eStructuralFeature, eObject);
			}
		}

		private void writeRole(EStructuralFeature eStructuralFeature, EObject eObject) throws XMLStreamException { // COVERAGE 現状のツールワークフローでは通らないが，コードレビュー済みであるため問題ない
			String roleName = M2XmlUtils.getXmlRoleName(eStructuralFeature);
			this.writer.writeStartElement(roleName);
			writeContent(eObject);
			this.writer.writeEndElement();
		}

		private void writeValueRoles(EStructuralFeature eStructuralFeature, List<Object> values) throws XMLStreamException {
			for (Object eObject : values) {
				writeValueRole(eStructuralFeature, eObject);
			}
		}

		private void writeValueRole(EStructuralFeature eStructuralFeature, Object value) throws XMLStreamException {
			String roleName = M2XmlUtils.getXmlRoleName(eStructuralFeature);
			this.writer.writeStartElement(roleName);
			writeValue(eStructuralFeature, value);
			this.writer.writeEndElement();
		}

		private void writeValueRoleWrapperAndRoles(EStructuralFeature eStructuralFeature, List<Object> values) throws XMLStreamException {
			String roleWrapperName = M2XmlUtils.getXmlRoleWrapperName(eStructuralFeature); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			this.writer.writeStartElement(roleWrapperName);
			for (Object value : values) {
				writeValueRole(eStructuralFeature, value);
			}
			this.writer.writeEndElement();
		}

		private void writeDefinitionRefRole(EStructuralFeature eStructuralFeature, Object value) throws XMLStreamException {
			String roleName = M2XmlUtils.getXmlRoleName(eStructuralFeature);
			this.writer.writeStartElement(roleName);

			// NOTE definitionRefのみDEST属性は決め打ちとする
			if (ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF.equals(eStructuralFeature)) {
				this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-MODULE-DEF");
			} else if (ECUC_CONTAINER_VALUE__DEFINITION_REF.equals(eStructuralFeature)) {
				this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-CONTAINER-DEF");
			} else if (ECUC_PARAMETER_VALUE__DEFINITION_REF.equals(eStructuralFeature)) {
				/*
				 * NOTE：#91対応
				 * 本来はモデルからの修正する必要があるが，2014/3末リリースに向けて暫定的に以下の対応とする．
				 */
				if ("/AUTOSAR/EcucDefs/Os/OsApplication/OsApplicationTrustedFunction/OsTrustedFunctionName".equals(value)) {
					this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-FUNCTION-NAME-DEF");
				} else if ("/AUTOSAR/EcucDefs/Os/OsSpinlock/OsSpinlockLockMethod".equals(value)) {
					this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-ENUMERATION-PARAM-DEF");
				} else {
					this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-PARAMETER-DEF");
				}
			} else if (ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF.equals(eStructuralFeature)) { // COVERAGE 常にtrue(現状，サポート範囲内では，definitionRefの必要な要素は，EcucModuleConfigurationValues,EcucContainerValue,EcucParameterValue,EcucAbstractReferenceValueのいずれかであるため)
				this.writer.writeAttribute(M2XmlUtils.DEST_ATTRIBUTE_NAME, "ECUC-ABSTRACT-REFERENCE-DEF");
			}

			writeValue(eStructuralFeature, value);
			this.writer.writeEndElement();
		}

		private boolean isDefinitionRefRole(EStructuralFeature eStructuralFeature) {
			return ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF.equals(eStructuralFeature) || ECUC_CONTAINER_VALUE__DEFINITION_REF.equals(eStructuralFeature)
					|| ECUC_PARAMETER_VALUE__DEFINITION_REF.equals(eStructuralFeature) || ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF.equals(eStructuralFeature);
		}

		private void writeValue(EStructuralFeature eStructuralFeature, Object value) throws XMLStreamException {
			if (eStructuralFeature.getEType() instanceof EEnum) {
				this.writer.writeCharacters(M2XmlUtils.getXmlEnumLiteralName(value));
			} else {
				this.writer.writeCharacters(String.valueOf(value));
			}
		}

		private void writeRoleWrapperAndTypes(EStructuralFeature eStructuralFeature, List<EObject> eObjects) throws XMLStreamException {
			String roleWrapperName = M2XmlUtils.getXmlRoleWrapperName(eStructuralFeature);
			this.writer.writeStartElement(roleWrapperName);
			for (EObject eObject : eObjects) {
				writeType(eObject);
			}
			this.writer.writeEndElement();
		}

		private void writeType(EObject eObject) throws XMLStreamException {
			String typeName = M2XmlUtils.getXmlTypeName(eObject.eClass());
			this.writer.writeStartElement(typeName);
			writeContent(eObject);
			this.writer.writeEndElement();
		}

		private void writeRoleAndTypes(EStructuralFeature eStructuralFeature, List<EObject> eObjects) throws XMLStreamException {
			String roleName = M2XmlUtils.getXmlRoleName(eStructuralFeature); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			this.writer.writeStartElement(roleName);
			for (EObject eObject : eObjects) {
				writeType(eObject);
			}
			this.writer.writeEndElement();
		}
	}

	public void save(M2Root m2Root, File file) throws XMLStreamException, IOException {
		Saver saver = new Saver(m2Root, file);
		saver.save();
	}
}
