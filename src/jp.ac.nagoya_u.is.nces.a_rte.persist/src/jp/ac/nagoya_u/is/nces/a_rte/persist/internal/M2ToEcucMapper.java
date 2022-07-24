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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_VALUE_COLLECTION;

import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util.EcucModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;

public class M2ToEcucMapper {
	private final static Logger LOGGER = Logger.getLogger(M2ToEcucMapper.class.getName());

	private final Resource eResource;
	private final ModelQuery query;
	private EcucRoot ecucRoot;

	public M2ToEcucMapper(Resource eResource) {
		this.eResource = eResource;
		this.query = new ModelQuery(eResource);
	}

	public void map() throws PersistException {
		this.ecucRoot = EcucFactory.eINSTANCE.createEcucRoot();
		this.eResource.getContents().add(this.ecucRoot);

		mapEcuc();
		resolveReference();
	}

	private void mapEcuc() throws PersistException {
		Optional<EcucValueCollection> ecucValueCollection = this.query.tryFindSingleByKind(ECUC_VALUE_COLLECTION);
		if (!ecucValueCollection.isPresent()) {
			return;
		}

		try {
			for (EcucModuleConfigurationValues ecucModuleConfigurationValues : ecucValueCollection.get().getEcucValue()) {
				mapModule(ecucModuleConfigurationValues);
			}
		} catch (InternalPersistException e) {
			throw new PersistException("Error occurred while loading ECU Configuration. " + e.getMessage(), e);
		}
	}

	private void mapModule(EcucModuleConfigurationValues m2Module) throws InternalPersistException {
		EStructuralFeature moduleFeature = this.ecucRoot.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(m2Module.getDefinitionRef()));
		if (moduleFeature == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		EcucModule ecucModule = createEcucModuleByFeature(moduleFeature);
		setRoleValue(this.ecucRoot, moduleFeature, ecucModule);

		ecucModule.setReferenceBase(M2ModelUtils.getReferenceBase(m2Module));
		ecucModule.setShortName(m2Module.getShortName());
		ecucModule.setSource(m2Module);

		LOGGER.finest("mapped " + m2Module + " to " + ecucModule);

		for (EcucContainerValue m2Container : m2Module.getContainer()) {
			mapContainer(ecucModule, m2Container);
		}
	}

	private void mapContainer(EcucReferrable ecucParentContainer, EcucContainerValue m2Container) throws InternalPersistException {
		EStructuralFeature containerFeature = ecucParentContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(m2Container.getDefinitionRef()));
		if (containerFeature == null) {
			return;
		}

		EcucContainer ecucContainer = createEcucContainerByFeature(containerFeature);
		setRoleValue(ecucParentContainer, containerFeature, ecucContainer);

		ecucContainer.setShortName(m2Container.getShortName());
		ecucContainer.setSource(m2Container);

		LOGGER.finest("mapped " + m2Container + " to " + ecucContainer);

		for (EcucParameterValue parameterValue : m2Container.getParameterValue()) {
			mapParameter(ecucContainer, parameterValue);
		}

		for (EcucAbstractReferenceValue referenceValue : m2Container.getReferenceValue()) {
			if (referenceValue instanceof EcucReferenceValue) {
				mapReference(ecucContainer, (EcucReferenceValue) referenceValue);
			} else if (referenceValue instanceof EcucInstanceReferenceValue) { // COVERAGE 常にtrue(現状のサポート範囲では，EcucAbstractReferenceValueはEcucReferenceValueとEcucInstanceReferenceValueのいずれかであるため)
				mapInstanceReference(ecucContainer, (EcucInstanceReferenceValue) referenceValue);
			}
		}

		for (EcucContainerValue subContainer : m2Container.getSubContainer()) {
			mapContainer(ecucContainer, subContainer);
		}
	}

	private void mapParameter(EcucReferrable ecucContainer, EcucParameterValue m2Parameter) throws InternalPersistException {
		EStructuralFeature parameterFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfParameterDef(m2Parameter.getDefinitionRef()));
		if (parameterFeature == null) {
			return;
		}

		try {
			if (m2Parameter instanceof EcucNumericalParamValue) {
				EcucNumericalParamValue ecucNumericalParamValue = (EcucNumericalParamValue) m2Parameter;
				setRoleValue(ecucContainer, parameterFeature, M2ModelUtils.convertValueForFeature(ecucNumericalParamValue.getValue(), parameterFeature));
			} else if (m2Parameter instanceof EcucTextualParamValue) { // COVERAGE 常にtrue(現状のサポート範囲では，EcucParameterValueはEcucNumericalParamValueとEcucTextualParamValueのいずれかであるため)
				EcucTextualParamValue ecucTextualParamValue = (EcucTextualParamValue) m2Parameter;
				setRoleValue(ecucContainer, parameterFeature, M2ModelUtils.convertValueForFeature(ecucTextualParamValue.getValue(), parameterFeature));
			}
		} catch (ModelException e) {
			throw new InternalPersistException("Error found in the parameter '" + parameterFeature.getName() + "' of " + ModelLabels.getLabel(ecucContainer) + ". " + e.getMessage(), e);
		}

		LOGGER.finest("mapped " + m2Parameter + " to " + ecucContainer + " " + parameterFeature);
	}

	private void mapReference(EcucObject ecucContainer, EcucReferenceValue m2Reference) throws InternalPersistException {
		EStructuralFeature roleFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfReferenceDef(m2Reference.getDefinitionRef()));
		if (roleFeature == null) {
			return;
		}

		if (M2Package.eINSTANCE.equals(roleFeature.getEType().getEPackage())) {
			// 型が合っているかを確認する
			if (!roleFeature.getEType().isInstance(m2Reference.getValue())) {
				throw new InternalPersistException("The referenced object " + m2Reference.getValue().getReference() + " is not typed with "
						+ roleFeature.getEType().getName() + " for the parameter '" + roleFeature.getName() + "' of "
						+ ModelLabels.getLabel(ecucContainer) + ".");
			}
			setRoleValue(ecucContainer, roleFeature, m2Reference.getValue());

		} else if (EcucPackage.eINSTANCE.equals(roleFeature.getEType().getEPackage())) { // COVERAGE 常にtrue(EcucReferenceValueの参照先要素は，m2かecucのいずれかのパッケージのものであるため)
			// ECUCのオブジェクトは生成が完了していないので，全オブジェクトの生成後にリファレンスを貼り直す．
			ecucContainer.addUnresolvedReference((EReference) roleFeature, EcucModelUtils.ID_PREFIX + m2Reference.getValue().getReference());
		}
		LOGGER.finest("mapped " + m2Reference + " to " + ecucContainer + " " + roleFeature);
	}

	private void mapInstanceReference(EcucReferrable ecucContainer, EcucInstanceReferenceValue m2InstanceReference) throws InternalPersistException {
		EStructuralFeature roleFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfInstanceReferenceDef(m2InstanceReference.getDefinitionRef()));
		if (roleFeature == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		if (!roleFeature.getEType().isInstance(m2InstanceReference.getValue())) {
			throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(m2InstanceReference.getValueIref()) + " is not typed with "
					+ roleFeature.getEType().getName() + " for the parameter '" + roleFeature.getName() + "' of "
					+ ModelLabels.getLabel(ecucContainer) + ".");
		}
		setRoleValue(ecucContainer, roleFeature, m2InstanceReference.getValue());
		LOGGER.finest("mapped " + m2InstanceReference + " to " + ecucContainer + " " + roleFeature);
	}

	private void resolveReference() throws PersistException {
		try {
			TreeIterator<EObject> eAllContents = this.ecucRoot.eAllContents();
			while (eAllContents.hasNext()) {
				ExtendedEObject eObject = (ExtendedEObject) eAllContents.next();
				eObject.resolveReferences();
			}
		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new PersistException("Internal error occurred while resolving autosar references of ECU Configuration. " + e.getMessage(), e);
		}
	}

	private void setRoleValue(EObject ecucObject, EStructuralFeature ecucFeature, Object value) {
		if (ecucFeature.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> containerList = (EList<Object>) ecucObject.eGet(ecucFeature);
			containerList.add(value);
		} else {
			ecucObject.eSet(ecucFeature, value);
		}
	}

	private EcucModule createEcucModuleByFeature(EStructuralFeature ecucFeature) {
		EClass eClass = (EClass) ecucFeature.getEType();
		return (EcucModule) EcucFactory.eINSTANCE.create(eClass);
	}

	private EcucContainer createEcucContainerByFeature(EStructuralFeature ecucFeature) {
		EClass eClass = (EClass) ecucFeature.getEType();
		return (EcucContainer) EcucFactory.eINSTANCE.create(eClass);
	}
}
