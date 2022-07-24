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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_MODULE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_ROOT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_REFERENCE_VALUE__VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IDENTIFIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util.EcucModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucConfigurationVariantEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifiable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class EcucToM2Mapper {
	private final static Logger LOGGER = Logger.getLogger(EcucToM2Mapper.class.getName());

	private final Resource eResource;
	private final ModelQuery query;

	private EcucRoot ecucRoot;

	private M2Root m2Root;
	private Autosar autosar;

	public EcucToM2Mapper(Resource eResource) {
		this.eResource = eResource;
		this.query = new ModelQuery(eResource);
	}

	public void map() throws ModelException {
		this.ecucRoot = this.query.findSingleByKind(ECUC_ROOT);

		this.m2Root = M2Factory.eINSTANCE.createM2Root();
		this.eResource.getContents().add(this.m2Root);

		this.autosar = M2Factory.eINSTANCE.createAutosar();
		this.m2Root.setAutosar(this.autosar);

		for (EcucModule ecucModule : this.query.<EObject, EcucModule> selectByKind(this.ecucRoot.eContents(), ECUC_MODULE)) {
			mapEcucModule(ecucModule);
		}

		resolveReference();
	}

	private void mapEcucModule(EcucModule ecucModule) {
		ArPackage parentPackage = makeParentPackages(this.autosar, ecucModule.getReference());

		EcucModuleConfigurationValues m2Module;
		if (ecucModule.getSource() == null) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			m2Module = M2Factory.eINSTANCE.createEcucModuleConfigurationValues();
			m2Module.setDefinitionRef(EcucModelUtils.DEFAULT_ECUC_DEFINITION_REFERENCE_PREFIX + ecucModule.eClass().getName());
			m2Module.setShortName(ecucModule.getShortName());
			m2Module.setEcucDefEdition(M2ModelUtils.DEFAULT_ECUC_DEF_EDITION);
			m2Module.setImplementationConfigVariant(EcucConfigurationVariantEnum.PRECONFIGURED_CONFIGURATION);
		} else {
			m2Module = EmfUtils.copyItself((EcucModuleConfigurationValues) ecucModule.getSource());
		}
		parentPackage.getElement().add(m2Module);

		ecucModule.setSource(m2Module);

		LOGGER.finest("mapped " + ecucModule + " to " + m2Module);

		for (EReference eReference : getMappingContainmentReferences(ecucModule)) {
			mapEcucContainers(ecucModule, m2Module, eReference);
		}
	}

	private void mapEcucContainers(EcucModule ecucModule, EcucModuleConfigurationValues m2Module, EReference eReference) {
		List<EcucContainer> ecucContainers = EmfUtils.getFeatureValues(ecucModule, eReference);
		for (EcucContainer ecucContainer : ecucContainers) {
			mapEcucContainer(m2Module, ecucContainer);
		}
	}

	private void mapEcucContainer(EcucModuleConfigurationValues m2Module, EcucContainer ecucContainer) {
		EcucContainerValue m2Container;
		if (ecucContainer.getSource() == null) {
			m2Container = M2Factory.eINSTANCE.createEcucContainerValue();
			m2Container.setDefinitionRef(m2Module.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + ecucContainer.eClass().getName());
			m2Container.setShortName(ecucContainer.getShortName());
		} else {
			m2Container = EmfUtils.copyItself((EcucContainerValue) ecucContainer.getSource());
		}
		m2Module.getContainer().add(m2Container);

		ecucContainer.setSource(m2Container);

		LOGGER.finest("mapped " + ecucContainer + " to " + m2Container);

		for (EAttribute eAttribute : getMappingAttributes(ecucContainer)) {
			mapEcucParam(m2Container, ecucContainer, eAttribute);
		}

		for (EReference eReference : getMappingReferences(ecucContainer)) {
			mapEcucReference(m2Container, ecucContainer, eReference);
		}

		for (EReference eReference : getMappingContainmentReferences(ecucContainer)) {
			mapEcucContainers(ecucContainer, m2Container, eReference);
		}
	}

	private void mapEcucContainer(EcucContainerValue m2ParentContainer, EcucContainer ecucContainer) {
		EcucContainerValue m2Container;
		if (ecucContainer.getSource() == null) { // COVERAGE 常にtrue(現状のツールワークフローではfalseを通らないが，コードレビュー済みであるため問題ない)
			m2Container = M2Factory.eINSTANCE.createEcucContainerValue();
			m2Container.setDefinitionRef(m2ParentContainer.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + ecucContainer.eClass().getName());
			m2Container.setShortName(ecucContainer.getShortName());
		} else { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			m2Container = EmfUtils.copyItself((EcucContainerValue) ecucContainer.getSource());
		}
		m2ParentContainer.getSubContainer().add(m2Container);

		ecucContainer.setSource(m2Container);

		LOGGER.finest("mapped " + ecucContainer + " to " + m2Container);

		for (EAttribute eAttribute : getMappingAttributes(ecucContainer)) {
			mapEcucParam(m2Container, ecucContainer, eAttribute);
		}

		for (EReference eReference : getMappingReferences(ecucContainer)) {
			mapEcucReference(m2Container, ecucContainer, eReference);
		}

		for (EReference eReference : getMappingContainmentReferences(ecucContainer)) {
			mapEcucContainers(ecucContainer, m2Container, eReference);
		}
	}

	private void mapEcucContainers(EcucContainer ecucContainer, EcucContainerValue m2Container, EReference eReference) {
		List<EcucContainer> ecucSubContainers = EmfUtils.getFeatureValues(ecucContainer, eReference);
		for (EcucContainer ecucSubContainer : ecucSubContainers) {
			mapEcucContainer(m2Container, ecucSubContainer);
		}
	}

	private Iterable<EReference> getMappingReferences(final EcucReferrable ecucContainer) {
		return Iterables.filter(ecucContainer.eClass().getEAllReferences(), new Predicate<EReference>() {
			@Override
			public boolean apply(EReference input) {
				return !input.isContainment() && !input.isDerived() && !EcucModelUtils.isNonEcucFeature(input) && ecucContainer.eGet(input) != null;
			}
		});
	}

	private Iterable<EReference> getMappingContainmentReferences(final EcucReferrable ecucContainer) {
		return Iterables.filter(ecucContainer.eClass().getEAllReferences(), new Predicate<EReference>() {
			@Override
			public boolean apply(EReference input) {
				return input.isContainment() && !input.isDerived() && !EcucModelUtils.isNonEcucFeature(input) && ecucContainer.eGet(input) != null; // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
			}
		});
	}

	private Iterable<EAttribute> getMappingAttributes(final EcucReferrable ecucContainer) {
		return Iterables.filter(ecucContainer.eClass().getEAllAttributes(), new Predicate<EAttribute>() {
			@Override
			public boolean apply(EAttribute input) {
				return !input.isDerived() && !input.isID() && !EcucModelUtils.isNonEcucFeature(input) && ecucContainer.eGet(input) != null; // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
			}
		});
	}

	private void mapEcucReference(EcucContainerValue m2Container, EcucReferrable ecucContainer, EReference eReference) {

		if (IDENTIFIABLE.isSuperTypeOf(eReference.getEReferenceType())) {
			List<Identifiable> identifiables = EmfUtils.getFeatureValues(ecucContainer, eReference);
			for (Identifiable identifiable : identifiables) {
				mapEcucReferenceValue(m2Container, eReference, identifiable);
			}

		} else if (ECUC_REFERRABLE.isSuperTypeOf(eReference.getEReferenceType())) { // COVERAGE 常にtrue(リファレンスはIdentifiable，もしくはEcucReferrableのいずれかであるため)
			List<EcucReferrable> ecucReferrables = EmfUtils.getFeatureValues(ecucContainer, eReference);
			for (EcucReferrable ecucReferrable : ecucReferrables) {
				mapEcucReferenceValue(m2Container, eReference, ecucReferrable);
			}
		}
	}

	private void mapEcucReferenceValue(EcucContainerValue m2Container, EReference eReference, EcucReferrable ecucReferrable) {
		EcucReferenceValue ecucReferenceValue = M2Factory.eINSTANCE.createEcucReferenceValue();
		ecucReferenceValue.setDefinitionRef(m2Container.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + EcucModelUtils.getReferenceDefinitionShortNameOfRoleFeature(eReference));
		if (ecucReferrable.getSource() != null) {
			ecucReferenceValue.setValue(ecucReferrable.getSource());
		} else {
			ecucReferenceValue.addUnresolvedReference(ECUC_REFERENCE_VALUE__VALUE, M2ModelUtils.ID_PREFIX + ecucReferrable.getReference());
		}
		m2Container.getReferenceValue().add(ecucReferenceValue);
		LOGGER.finest("mapped " + ecucReferrable + " to " + ecucReferenceValue);
	}

	private void mapEcucReferenceValue(EcucContainerValue m2Container, EReference eReference, Identifiable identifiable) {
		EcucReferenceValue ecucReferenceValue = M2Factory.eINSTANCE.createEcucReferenceValue();
		ecucReferenceValue.setDefinitionRef(m2Container.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + EcucModelUtils.getReferenceDefinitionShortNameOfRoleFeature(eReference));
		ecucReferenceValue.setValue(identifiable);
		m2Container.getReferenceValue().add(ecucReferenceValue);

		LOGGER.finest("mapped " + identifiable + " to " + ecucReferenceValue);
	}

	private void mapEcucParam(EcucContainerValue m2Container, EcucReferrable ecucContainer, EAttribute eAttribute) {
		List<Object> values = EmfUtils.getFeatureValues(ecucContainer, eAttribute);
		if (M2ModelUtils.isNumericalAttribute(eAttribute)) {
			for (Object value : values) {
				mapEcucNumericalParamValue(m2Container, ecucContainer, eAttribute, value);
			}

		} else {
			for (Object value : values) {
				mapEcucTextualParamValue(m2Container, ecucContainer, eAttribute, value);
			}
		}
	}

	private void mapEcucTextualParamValue(EcucContainerValue m2Container, EcucReferrable ecucContainer, EAttribute eAttribute, Object value) {
		EcucTextualParamValue ecucTextualParamValue = M2Factory.eINSTANCE.createEcucTextualParamValue();
		ecucTextualParamValue.setDefinitionRef(m2Container.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + EcucModelUtils.getParameterDefinitionShortNameOfRoleFeature(eAttribute));
		ecucTextualParamValue.setValue(String.valueOf(value));
		m2Container.getParameterValue().add(ecucTextualParamValue);

		LOGGER.finest("mapped " + ecucContainer + " " + eAttribute + " " + value + " to " + ecucTextualParamValue);
	}

	private void mapEcucNumericalParamValue(EcucContainerValue m2Container, EcucReferrable ecucContainer, EAttribute eAttribute, Object value) {
		EcucNumericalParamValue ecucNumericalParamValue = M2Factory.eINSTANCE.createEcucNumericalParamValue();
		ecucNumericalParamValue.setDefinitionRef(m2Container.getDefinitionRef() + M2ModelUtils.REFERENCE_SEPARATOR + EcucModelUtils.getParameterDefinitionShortNameOfRoleFeature(eAttribute));
		ecucNumericalParamValue.setValue(M2ModelUtils.convertValueToBigDecimal(value));
		m2Container.getParameterValue().add(ecucNumericalParamValue);

		LOGGER.finest("mapped " + ecucContainer + " " + eAttribute + " " + value + " to " + ecucNumericalParamValue);
	}

	private void resolveReference() throws ModelException {
		TreeIterator<EObject> eAllContents = this.m2Root.eAllContents();
		while (eAllContents.hasNext()) {
			ExtendedEObject eObject = (ExtendedEObject) eAllContents.next();
			eObject.resolveReferences();
		}
	}

	private ArPackage makeParentPackages(Autosar targetAutosar, String reference) {
		List<String> referenceSegments = Arrays.asList(reference.split(M2ModelUtils.REFERENCE_SEPARATOR));
		Preconditions.checkArgument(referenceSegments.size() >= 2); // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)

		List<String> shortNames = referenceSegments.subList(1, referenceSegments.size()); // ショートネームのみ取り出す

		String rootPackageShortName = shortNames.get(0);
		List<String> subPackageShortNames = shortNames.size() < 2 ? Collections.<String> emptyList() : shortNames.subList(1, shortNames.size() - 1); // COVERAGE 常にfalse(現状のツールワークフローではtrueを通らないが，コードレビュー済みであるため問題ない)

		// ルートパッケージの構築
		ArPackage rootPackage;
		Optional<ArPackage> foundRootPackage = this.query.trySelectSingle(targetAutosar.getArPackage(), hasAttr(REFERRABLE__SHORT_NAME, rootPackageShortName));
		if (!foundRootPackage.isPresent()) { // COVERAGE 常にtrue(現状のツールワークフローではfalseを通らないが，コードレビュー済みであるため問題ない)
			rootPackage = M2Factory.eINSTANCE.createArPackage();
			rootPackage.setShortName(rootPackageShortName);
			targetAutosar.getArPackage().add(rootPackage);
		} else { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
			rootPackage = foundRootPackage.get();
		}

		// サブパッケージの構築
		ArPackage currentPackage = rootPackage;
		for (String shortName : subPackageShortNames) { // COVERAGE 内部に未達(現状のツールワークフローでは通らないが，コードレビュー済みであるため問題ない)
			Optional<ArPackage> foundSubPackage = this.query.trySelectSingle(currentPackage.getArPackage(), hasAttr(REFERRABLE__SHORT_NAME, shortName));

			if (!foundSubPackage.isPresent()) { // COVERAGE 常にtrue(現状のツールワークフローでは通らないが，コードレビュー済みであるため問題ない)
				ArPackage subPackage = M2Factory.eINSTANCE.createArPackage();
				subPackage.setShortName(shortName);
				currentPackage.getArPackage().add(subPackage);
				currentPackage = subPackage;
			} else { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
				currentPackage = foundSubPackage.get();
			}
		}
		return currentPackage;
	}
}
