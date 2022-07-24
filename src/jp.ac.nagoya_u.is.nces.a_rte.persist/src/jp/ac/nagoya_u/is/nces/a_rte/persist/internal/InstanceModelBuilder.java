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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.IINSTANCE_OBJECT__INSTANCE_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.INSTANCE_REFERRABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_VALUE_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.PPORT_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.RPORT_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SW_CONNECTOR;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.util.InstanceModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Optional;

public class InstanceModelBuilder {

	private final Resource eResource;
	private final ModelQuery query;
	private RootSwCompositionPrototype rootSwCompositionPrototype;
	private InstanceRoot instanceRoot;

	public InstanceModelBuilder(Resource eResource) {
		this.eResource = eResource;
		this.query = new ModelQuery(eResource);
	}

	public void build() throws PersistException {
		try {
			Optional<EcucValueCollection> ecucValueCollection = this.query.tryFindSingleByKind(ECUC_VALUE_COLLECTION);
			System system = ecucValueCollection.isPresent() ? ecucValueCollection.get().getEcuExtract() : null;
			this.rootSwCompositionPrototype = system != null ? system.getRootSoftwareComposition() : null;

			InstanceRoot instanceRoot = InstanceFactory.eINSTANCE.createInstanceRoot();
			this.eResource.getContents().add(instanceRoot);
			this.instanceRoot = instanceRoot;

			buildInstanceModelsInSwc();
			if (this.rootSwCompositionPrototype != null) {
				buildInstanceModelsInComposition();
				buildInstanceModelsInSystem();
			} else {
				removeInstanceWhichHasModelsInComposition();
				removeInstanceWhichHasModelsInSystem();
			}

			resolveReference();

			buildConnectionOfInstanceModels();

			buildModelIds();

		} catch (InternalPersistException e) {
			throw new PersistException("Error occurred while resolving AUTOSAR instance references. " + e.getMessage(), e);
		}
	}

	private void removeInstanceWhichHasModelsInComposition() {
		for (SwConnector connector : this.query.<SwConnector> findByKind(SW_CONNECTOR)) {
			EcoreUtil.remove(connector);
		}
	}

	private void removeInstanceWhichHasModelsInSystem() {
		for (SenderReceiverToSignalMapping map : this.query.<SenderReceiverToSignalMapping> findByKind(SENDER_RECEIVER_TO_SIGNAL_MAPPING)) {
			EcoreUtil.remove(map);
		}
		for (SenderReceiverToSignalGroupMapping map : this.query.<SenderReceiverToSignalGroupMapping> findByKind(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING)) {
			EcoreUtil.remove(map);
		}
	}

	private void buildInstanceModelsInSwc() {
		for (RPortPrototype rPortPrototype : this.query.<RPortPrototype> findByKind(RPORT_PROTOTYPE)) {
			if (rPortPrototype.getRequiredInterface() instanceof SenderReceiverInterface) {
				SenderReceiverInterface senderReceiverInterface = (SenderReceiverInterface) rPortPrototype.getRequiredInterface();
				for (VariableDataPrototype dataElement : senderReceiverInterface.getDataElement()) {
					RVariableDataInstanceInSwc dataInstanceInSwc = InstanceFactory.eINSTANCE.createRVariableDataInstanceInSwc();
					dataInstanceInSwc.setContextPort(rPortPrototype);
					dataInstanceInSwc.setPrototype(dataElement);
					this.instanceRoot.getVariableDataInstanceInSwc().add(dataInstanceInSwc);
				}
			} else if (rPortPrototype.getRequiredInterface() instanceof ClientServerInterface) { // COVERAGE 常にtrue(現状，InterfaceはSenderReceiverInterfaceとClientServerInterfaceのいずれかであるため)
				ClientServerInterface clientServerInterface = (ClientServerInterface) rPortPrototype.getRequiredInterface();
				for (ClientServerOperation operation : clientServerInterface.getOperation()) {
					ROperationInstanceInSwc operationInstanceInSwc = InstanceFactory.eINSTANCE.createROperationInstanceInSwc();
					operationInstanceInSwc.setContextPort(rPortPrototype);
					operationInstanceInSwc.setPrototype(operation);
					this.instanceRoot.getOperationInstanceInSwc().add(operationInstanceInSwc);
				}
			}
		}

		for (PPortPrototype pPortPrototype : this.query.<PPortPrototype> findByKind(PPORT_PROTOTYPE)) {
			if (pPortPrototype.getProvidedInterface() instanceof SenderReceiverInterface) {
				SenderReceiverInterface senderReceiverInterface = (SenderReceiverInterface) pPortPrototype.getProvidedInterface();
				for (VariableDataPrototype dataElement : senderReceiverInterface.getDataElement()) {
					PVariableDataInstanceInSwc dataInstanceInSwc = InstanceFactory.eINSTANCE.createPVariableDataInstanceInSwc();
					dataInstanceInSwc.setContextPort(pPortPrototype);
					dataInstanceInSwc.setPrototype(dataElement);
					this.instanceRoot.getVariableDataInstanceInSwc().add(dataInstanceInSwc);
				}
			} else if (pPortPrototype.getProvidedInterface() instanceof ClientServerInterface) { // COVERAGE 常にtrue(現状，InterfaceはSenderReceiverInterfaceとClientServerInterfaceのいずれかであるため)
				ClientServerInterface clientServerInterface = (ClientServerInterface) pPortPrototype.getProvidedInterface();
				for (ClientServerOperation operation : clientServerInterface.getOperation()) {
					POperationInstanceInSwc operationInstanceInSwc = InstanceFactory.eINSTANCE.createPOperationInstanceInSwc();
					operationInstanceInSwc.setContextPort(pPortPrototype);
					operationInstanceInSwc.setPrototype(operation);
					this.instanceRoot.getOperationInstanceInSwc().add(operationInstanceInSwc);
				}
			}
		}
	}

	private void buildInstanceModelsInComposition() {
		for (SwComponentPrototype swComponentPrototype : this.rootSwCompositionPrototype.getSoftwareComposition().getComponent()) {
			for (PortPrototype portPrototype : swComponentPrototype.getType().getPort()) {
				PortInstanceInComposition portInstanceInComposition = InstanceFactory.eINSTANCE.createPortInstanceInComposition();
				portInstanceInComposition.setContextComponent(swComponentPrototype);
				portInstanceInComposition.setPrototype(portPrototype);
				this.instanceRoot.getPortInstanceInComposition().add(portInstanceInComposition);

				for (VariableDataInstanceInSwc dataInstanceInSwc : this.query.<VariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					VariableDataInstanceInComposition dataInstanceInComposition = InstanceFactory.eINSTANCE.createVariableDataInstanceInComposition();
					dataInstanceInComposition.setPrototype(dataInstanceInSwc);
					portInstanceInComposition.getDataElement().add(dataInstanceInComposition);
				}

				for (OperationInstanceInSwc operationInstanceInSwc : this.query.<OperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					OperationInstanceInComposition operationInstanceInComposition = InstanceFactory.eINSTANCE.createOperationInstanceInComposition();
					operationInstanceInComposition.setPrototype(operationInstanceInSwc);
					portInstanceInComposition.getOperation().add(operationInstanceInComposition);
				}
			}
		}
	}

	private void buildInstanceModelsInSystem() {
		for (SwComponentPrototype swComponentPrototype : this.rootSwCompositionPrototype.getSoftwareComposition().getComponent()) {
			SwComponentInstanceInSystem componentInstanceInSystem = InstanceFactory.eINSTANCE.createSwComponentInstanceInSystem();
			componentInstanceInSystem.setContextRootComposition(this.rootSwCompositionPrototype);
			componentInstanceInSystem.setPrototype(swComponentPrototype);
			this.instanceRoot.getSwComponentInstanceInSystem().add(componentInstanceInSystem);
		}
	}

	private void buildConnectionOfInstanceModels() {
		if (this.rootSwCompositionPrototype == null) {
			return;
		}

		for (SwConnector swConnector : this.rootSwCompositionPrototype.getSoftwareComposition().getConnector()) {
			if (swConnector instanceof AssemblySwConnector) {
				AssemblySwConnector assemblySwConnector = (AssemblySwConnector) swConnector;
				buildElementConnectionsOfAssemblyConnector(assemblySwConnector);
			} else if (swConnector instanceof DelegationSwConnector) { // COVERAGE 常にtrue(SwConnectorはAssemblySwConnectorとDelegationSwConnectorのいずれかであるため)
				DelegationSwConnector delegationSwConnector = (DelegationSwConnector) swConnector;
				buildElementConnectionsOfDelegationConnector(delegationSwConnector);
			}
		}
	}

	private void buildElementConnectionsOfDelegationConnector(DelegationSwConnector delegationSwConnector) {
		for (VariableDataInstanceInComposition innerDataElement : delegationSwConnector.getInnerPort().getDataElement()) {
			Optional<VariableDataInstanceInSwc> outerDataElement = this.query.tryFindSingle(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, delegationSwConnector.getOuterPort()).AND(
					hasOp(VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME, innerDataElement.getTargetShortName())));
			if (outerDataElement == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			DelegationDataInstanceConnector dataInstanceConnector = InstanceFactory.eINSTANCE.createDelegationDataInstanceConnector();
			dataInstanceConnector.setInner(innerDataElement);
			dataInstanceConnector.setOuter(outerDataElement.get());
			this.instanceRoot.getDelegationDataInstanceConnector().add(dataInstanceConnector);
		}
	}

	private void buildElementConnectionsOfAssemblyConnector(AssemblySwConnector assemblySwConnector) {
		for (VariableDataInstanceInComposition providerDataElement : assemblySwConnector.getProvider().getDataElement()) {
			Optional<VariableDataInstanceInComposition> requesterDataElement = this.query.trySelectSingle(assemblySwConnector.getRequester().getDataElement(),
					hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME, providerDataElement.getTargetShortName()));
			if (!requesterDataElement.isPresent()) {
				continue;
			}

			AssemblyDataInstanceConnector dataInstanceConnector = InstanceFactory.eINSTANCE.createAssemblyDataInstanceConnector();
			dataInstanceConnector.setProvider(providerDataElement);
			dataInstanceConnector.setRequester(requesterDataElement.get());
			this.instanceRoot.getAssemblyDataInstanceConnector().add(dataInstanceConnector);
		}

		for (OperationInstanceInComposition providerOperation : assemblySwConnector.getProvider().getOperation()) {
			Optional<OperationInstanceInComposition> requesterOperation = this.query.trySelectSingle(assemblySwConnector.getRequester().getOperation(),
					hasOp(OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME, providerOperation.getTargetShortName()));
			if (!requesterOperation.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			AssemblyOperationInstanceConnector operationInstanceConnector = InstanceFactory.eINSTANCE.createAssemblyOperationInstanceConnector();
			operationInstanceConnector.setProvider(providerOperation);
			operationInstanceConnector.setRequester(requesterOperation.get());
			this.instanceRoot.getAssemblyOperationInstanceConnector().add(operationInstanceConnector);
		}
	}

	private void resolveReference() throws InternalPersistException {
		TreeIterator<EObject> eAllContents = this.eResource.getAllContents();
		while (eAllContents.hasNext()) {
			EObject eObject = eAllContents.next();
			resolveReferenceOf(eObject);
		}
	}

	private <T extends IInstanceObject> Optional<T> resolveInstance(IInstanceRef instanceRef) {
		return this.query.tryFindSingle(hasAttr(IINSTANCE_OBJECT__INSTANCE_ID, instanceRef.getInstanceRef()));
	}

	private void resolveReferenceOf(EObject eObject) throws InternalPersistException {
		for (EReference eReference : eObject.eClass().getEAllReferences()) {
			if (eReference.isContainment()) {
				continue;
			}

			EStructuralFeature eIrefFeature = eObject.eClass().getEStructuralFeature(M2ModelUtils.getIrefRoleNameOfRoleFeature(eReference));
			if (eIrefFeature == null) {
				continue;
			}

			IInstanceRef instanceRef = (IInstanceRef) eObject.eGet(eIrefFeature);
			if (instanceRef == null) { // 0..1のirefで0の場合に真
				if (eIrefFeature.getLowerBound() > 0) { // 常に未達(不具合時のみ到達)
					throw new InternalPersistException("The parameter '" + eReference.getName() + "' of " + ModelLabels.getLabel(eObject) + "does not exist.");
				}
				continue;
			}
			Optional<IInstanceObject> referred = resolveInstance(instanceRef);
			if (!referred.isPresent()) {
				throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(instanceRef) + " does not exist for the parameter '" + eReference.getName() + "' of "
						+ ModelLabels.getLabel(eObject) + ".");
			}
			if (!eReference.getEType().isInstance(referred.get())) { // 常に未達（不具合時のみ到達）
				throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(instanceRef) + " is not typed with " + eReference.getEType().getName()
						+ " for the parameter '" + eReference.getName() + "' of " + ModelLabels.getLabel(eObject) + ".");
			}
			if (eReference.isMany()) { // COVERAGE 常にfalse(現状のツールワークフローではtrueを通らないが，コードレビュー済みであるため問題ない)
				@SuppressWarnings("unchecked")
				EList<EObject> list = (EList<EObject>) eObject.eGet(eReference);
				list.add(referred.get());
			} else {
				eObject.eSet(eReference, referred.get());
			}
		}
	}

	private void buildModelIds() {
		int idIndex = 1;
		for (InstanceReferrable instanceReferrable : this.query.<InstanceReferrable> findByKind(INSTANCE_REFERRABLE)) {
			instanceReferrable.setId(InstanceModelUtils.ID_PREFIX + instanceReferrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}

}
