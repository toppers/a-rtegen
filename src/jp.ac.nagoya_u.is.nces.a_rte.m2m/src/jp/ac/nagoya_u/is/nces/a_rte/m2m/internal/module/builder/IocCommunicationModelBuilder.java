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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import com.google.common.base.Optional;

/**
 * RTEが依存するIOC通信のモデルを構築する。
 */
public class IocCommunicationModelBuilder {

	final ModuleModelBuildContext context;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;
	private final MemoryMappingModelBuilder memmapBuilder;

	public IocCommunicationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
		this.memmapBuilder = new MemoryMappingModelBuilder(this.context);
	}

	public void build() throws ModelException {
		buildSrInterPartitionIocCommunications(this.context.cache.rte);
		buildComProxyIocCommunications(this.context.cache.rte);
	}

	private void buildSrInterPartitionIocCommunications(Rte targetRte) throws ModelException {
		for (IocValueBufferImplementation sourceIocValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			InternalEcuReceiver sourceReceiver = sourceIocValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);

			if (sourceReceiver.getSource().getPrototype().isEventSemantics()) {
				buildSrInterPartitionIocQueuedCommunication(targetRte, sourceIocValueBufferImplementation);
			} else {
				buildSrInterPartitionIocNonqueuedCommunication(targetRte, sourceIocValueBufferImplementation);
			}
		}
	}

	private void buildSrInterPartitionIocQueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		targetRte.getDependentIocCommunication().add(createSrInterPartitionIocQueuedCommunication(sourceValueBufferImplementation));
	}

	private IocQueuedCommunication createSrInterPartitionIocQueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		IocQueuedCommunication destIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();

		IocReceiveApi destIocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		destIocReceiveApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(destIocReceiveApi, sourceValueBufferImplementation.getOsIocCommunication());
		destIocCommunication.setReceiveApi(destIocReceiveApi);

		IocEmptyQueueApi destIocEmptyQueueApi = ModuleFactory.eINSTANCE.createIocEmptyQueueApi();
		destIocEmptyQueueApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocEmptyQueueApi.setSymbolName(SymbolNames.createIocEmptyQueueApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocEmptyQueueApi.setMappingName(SymbolNames.createIocEmptyQueueApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocEmptyQueueApi.setReturnType(this.context.cache.osStatusType);
		destIocCommunication.setIocEmptyQueueApi(destIocEmptyQueueApi);

		for (OsIocSenderProperties sourceOsIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocSendApi destIocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
			destIocSendApi.setSingleSource(sourceOsIocSenderProperties);
			destIocSendApi.setSymbolName(SymbolNames.createIocSendApiName(sourceOsIocSenderProperties));
			destIocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(sourceOsIocSenderProperties));
			buildSenderIocApiSignature(destIocSendApi, sourceValueBufferImplementation.getOsIocCommunication());
			destIocCommunication.getSendApi().add(destIocSendApi);
		}
		return destIocCommunication;
	}

	private void buildSrInterPartitionIocNonqueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		OsIocDataProperties sourceOsIocDataProperties = sourceValueBufferImplementation.getOsIocCommunication().getOsIocDataProperties().get(0);

		Type type = this.context.builtQuery.findDest(TYPE, sourceOsIocDataProperties.getOsIocDataType());

		// IOC初期値定数の構築
		Constant destInitValueConstant = createSrInterPartitionIocInitValueConstant(sourceValueBufferImplementation, sourceOsIocDataProperties, type);
		targetRte.getIocInitValueConstant().add(destInitValueConstant);

		// IOC連携の構築
		IocNonqueuedCommunication destIocCommunication = createSrInterPartitionIocNonqueuedCommunication(sourceValueBufferImplementation, destInitValueConstant);
		targetRte.getDependentIocCommunication().add(destIocCommunication);
	}

	private IocNonqueuedCommunication createSrInterPartitionIocNonqueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation, Constant initValueConstant) throws ModelException {
		IocNonqueuedCommunication destIocCommunication = ModuleFactory.eINSTANCE.createIocNonqueuedCommunication();

		IocReadApi destIocReadApi = ModuleFactory.eINSTANCE.createIocReadApi();
		destIocReadApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocReadApi.setSymbolName(SymbolNames.createIocReadApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocReadApi.setMappingName(SymbolNames.createIocReadApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(destIocReadApi, sourceValueBufferImplementation.getOsIocCommunication());
		destIocCommunication.setReadApi(destIocReadApi);

		for (OsIocSenderProperties sourceOsIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocWriteApi destIocWriteApi = ModuleFactory.eINSTANCE.createIocWriteApi();
			destIocWriteApi.setSingleSource(sourceOsIocSenderProperties);
			destIocWriteApi.setSymbolName(SymbolNames.createIocWriteApiName(sourceOsIocSenderProperties));
			destIocWriteApi.setMappingName(SymbolNames.createIocWriteApiMappingName(sourceOsIocSenderProperties));
			buildSenderIocApiSignature(destIocWriteApi, sourceValueBufferImplementation.getOsIocCommunication());
			destIocCommunication.getWriteApi().add(destIocWriteApi);
		}

		destIocCommunication.setInitValue(initValueConstant);

		// 複合データ型向けの初期値定数を構築
		if (!initValueConstant.getMember().isEmpty()) {
			Optional<EcucPartition> sourcePartition = Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition());
			InternalEcuReceiver sourceReceiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceReceiver.getSource();

			Rte targetRte = this.context.cache.rte;

			GlobalVariable destInitValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
			destInitValueVariable.setSymbolName(SymbolNames.createSrRteBufferInitValueVariableName(sourceDataInstanceInComposition));
			destInitValueVariable.setHasConst(false);
			destInitValueVariable.setHasStatic(false);
			destInitValueVariable.setType(initValueConstant.getType());
			destInitValueVariable.setInitValueConstant(initValueConstant);
			destInitValueVariable.setInitAtDefinition(true);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataInstanceInComposition));

			RteBufferVariableSet destInitValueVariableSet = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
			destInitValueVariableSet.setInitValueVariable(destInitValueVariable);
			targetRte.getIocInitValueVariableSet().add(destInitValueVariableSet);

			// IOC通信・初期値定数のConstantと関連付
			destIocCommunication.setInitValueVariable(destInitValueVariable);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
		}

		return destIocCommunication;
	}

	private Constant createSrInterPartitionIocInitValueConstant(IocValueBufferImplementation sourceValueBufferImplementation, OsIocDataProperties sourceOsIocDataProperties, Type type) throws ModelException {
		ValueSpecification sourceInitValue = parseAsValueSpecification(type, sourceOsIocDataProperties.getOsIocInitValue());

		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSymbolName(SymbolNames.createIocInitValueConstantName(sourceValueBufferImplementation.getOsIocCommunication()));
		destInitValueConstant.setType(type);
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private ValueSpecification parseAsValueSpecification(Type type, String osIocInitValue) throws ModelException {
		if (type instanceof ArrayType) {
			ArrayValueSpecification value = M2Factory.eINSTANCE.createArrayValueSpecification();
			value.getElement().addAll(parseAsPrimitiveValueSpecifications(osIocInitValue));
			return value;
		} else if (type instanceof StructType || type instanceof UnionType) {
			RecordValueSpecification value = M2Factory.eINSTANCE.createRecordValueSpecification();
			value.getField().addAll(parseAsPrimitiveValueSpecifications(osIocInitValue));
			return value;
		} else {
			return parseAsPrimitiveValueSpecification(osIocInitValue);
		}
	}

	private List<ValueSpecification> parseAsPrimitiveValueSpecifications(String osIocInitValue) throws ModelException {
		List<ValueSpecification> values = new ArrayList<ValueSpecification>();

		int from = osIocInitValue.indexOf("{", 0);
		int to = osIocInitValue.lastIndexOf("}", osIocInitValue.length() - 1);
		if (from == -1 || to <= from) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new ModelException("Error occurred while parsing OsIocInitValue.");
		}
		String trimmedOsIocInitValue = osIocInitValue.substring(from + 1, to);

		String[] valueStrings = trimmedOsIocInitValue.split(",");
		for (String valueString : valueStrings) {
			values.add(parseAsPrimitiveValueSpecification(valueString));
		}
		return values;
	}

	private ValueSpecification parseAsPrimitiveValueSpecification(String valueString) {
		try {
			BigDecimal numerical = M2ModelUtils.parseNumerical(valueString);
			NumericalValueSpecification value = M2Factory.eINSTANCE.createNumericalValueSpecification();
			value.setValue(numerical);
			return value;
		} catch (Exception e) {
			// BigDecimalに変換不能なら、TextValueSpecificationを作成する
			TextValueSpecification value = M2Factory.eINSTANCE.createTextValueSpecification();
			value.setValue(valueString);
			return value;
		}
	}

	private void buildComProxyIocCommunications(Rte targetRte) throws ModelException {
		for (ComSendProxyInteraction sourceProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			buildComProxyIocCommunicationForComplexType(targetRte, sourceProxyInteraction);
		}
	}

	private void buildComProxyIocCommunicationForComplexType(Rte targetRte, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		// COMプロキシ送信要求用
		OsIocCommunication sourceRequestOsIocCommunication = sourceProxyInteraction.getRequestOsIocCommunication();

		IocQueuedCommunication destRequestIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		destRequestIocCommunication.setReceiveApi(createIocReceiveApi(sourceRequestOsIocCommunication));
		destRequestIocCommunication.getSendApi().add(createIocSendApi(sourceRequestOsIocCommunication));
		targetRte.getDependentIocCommunication().add(destRequestIocCommunication);

		// 値やり取り用
		OsIocCommunication sourceValueOsIocCommunication = sourceProxyInteraction.getValueOsIocCommunication();

		IocQueuedCommunication destValueIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		destValueIocCommunication.setReceiveApi(createIocReceiveApi(sourceValueOsIocCommunication));
		destValueIocCommunication.getSendApi().add(createIocSendApi(sourceValueOsIocCommunication));
		targetRte.getDependentIocCommunication().add(destValueIocCommunication);
	}

	private IocReceiveApi createIocReceiveApi(OsIocCommunication sourceOsIocCommunication) throws ModelException {
		IocReceiveApi destIocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		destIocReceiveApi.setSingleSource(sourceOsIocCommunication);
		destIocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceOsIocCommunication));
		destIocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(sourceOsIocCommunication));
		buildReceiverIocApiSignature(destIocReceiveApi, sourceOsIocCommunication);
		return destIocReceiveApi;
	}

	private IocSendApi createIocSendApi(OsIocCommunication sourceOsIocCommunication) throws ModelException {
		// 送信プロパティは必ず1つ
		OsIocSenderProperties sourceOsIocSenderProperties = sourceOsIocCommunication.getOsIocSenderProperties().get(0);

		IocSendApi destIocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
		destIocSendApi.setSingleSource(sourceOsIocSenderProperties);
		destIocSendApi.setSymbolName(SymbolNames.createIocSendApiName(sourceOsIocSenderProperties));
		destIocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(sourceOsIocSenderProperties));
		buildSenderIocApiSignature(destIocSendApi, sourceOsIocCommunication);
		return destIocSendApi;
	}

	private void buildReceiverIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties sourceOsIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(this.localSymbolModelBuilder.createIocOutDataParam(sourceOsIocDataProperties));
		}
	}

	private void buildSenderIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties sourceOsIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(this.localSymbolModelBuilder.createIocInDataParam(sourceOsIocDataProperties));
		}
	}
}
