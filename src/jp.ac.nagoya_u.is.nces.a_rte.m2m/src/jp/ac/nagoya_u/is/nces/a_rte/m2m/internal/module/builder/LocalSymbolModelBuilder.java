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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantValueTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsActivateTaskApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import com.google.common.collect.Lists;

public class LocalSymbolModelBuilder {

	private final ModuleModelBuildContext context;

	public LocalSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public Parameter createIocInDataParam(OsIocDataProperties sourceOsIocDataProperties) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceOsIocDataProperties.getOsIocDataType());

		return createInParam(sourceOsIocDataProperties.getShortName(), type);
	}

	public Parameter createIocOutDataParam(OsIocDataProperties sourceOsIocDataProperties) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceOsIocDataProperties.getOsIocDataType());

		return createOutParam(sourceOsIocDataProperties.getShortName(), type);
	}

	public Parameter createSrInDataParam(Type type) {
		return createInParam(getSymbolNameOfSrDataParam(getInParameterPassType(type)), type);
	}

	public Parameter createSrOutDataParam(Type type) {
		return createOutParam(getSymbolNameOfSrDataParam(ParameterPassTypeEnum.REFERENCE), type);
	}

	private String getSymbolNameOfSrDataParam(ParameterPassTypeEnum passType) {
		switch (passType) {
		case REFERENCE:
			return SymbolNames.SR_DATA_REFERENCE_PARAM_NAME;
		case VALUE:
		default:
			return SymbolNames.SR_DATA_PARAM_NAME;
		}
	}

	public List<Parameter> createCsPortArgValueParams(POperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		List<Parameter> destPortArgValueParams = Lists.newArrayList();
		if (!sourceOperationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			PortApiOption sourcePortApiOption = sourceOperationInstanceInSwc.getContextPort().getPortApiOption().get(0);

			int i = 0;
			for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : sourcePortApiOption.getPortArgValue()) {
				if (sourcePortDefinedArgumentValue.getValueType().getLeafImplementationDataType().isPrimitiveType()) {
					destPortArgValueParams.add(createCsPortArgValueParam(sourcePortDefinedArgumentValue, i));
					i++;
				}
			}
		}
		return destPortArgValueParams;
	}

	private Parameter createCsPortArgValueParam(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, sourcePortDefinedArgumentValue.getValueType());

		return createInParam(SymbolNames.createCsPortArgValueParamName(sourcePortDefinedArgumentValue, index), type);
	}

	public List<Parameter> createCsOperationParams(OperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		AtomicSwComponentType sourceSwComponentType = (AtomicSwComponentType) sourceOperationInstanceInSwc.getContextPort().getParent();

		List<Parameter> destOperationParams = Lists.newArrayList();
		for (ArgumentDataPrototype sourceArgumentDataPrototype : sourceOperationInstanceInSwc.getPrototype().getArgument()) {
			ImplementationDataType sourceImplementationDataType = sourceSwComponentType.getImplementationDataType(sourceArgumentDataPrototype.getType());
			destOperationParams.add(createCsOperationParam(sourceArgumentDataPrototype, sourceImplementationDataType));
		}
		return destOperationParams;
	}

	private Parameter createCsOperationParam(ArgumentDataPrototype sourceArgumentDataPrototype, ImplementationDataType sourceImplementationDataType) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, sourceImplementationDataType);

		switch (sourceArgumentDataPrototype.getDirection()) {
		case IN:
			return createInParam(sourceArgumentDataPrototype.getShortName(), type);
		case OUT:
			return createOutParam(sourceArgumentDataPrototype.getShortName(), type);
		case INOUT:
		default:
			return createInOutParam(sourceArgumentDataPrototype.getShortName(), type);
		}
	}

	public Parameter createModeParam(ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, Type type) {
		Parameter destParam = ModuleFactory.eINSTANCE.createParameter();
		destParam.setSymbolName(SymbolNames.MODE_VAR_NAME);
		destParam.setType(type);
		return destParam;
	}

	public Parameter createIrvInDataParam(Type type) {
		return createInParam(getSymbolNameOfIrvDataParam(getInParameterPassType(type)), type);
	}

	public Parameter createIrvOutDataParam(Type type) {
		return createOutParam(getSymbolNameOfIrvDataParam(ParameterPassTypeEnum.REFERENCE), type);
	}

	private String getSymbolNameOfIrvDataParam(ParameterPassTypeEnum passType) {
		switch (passType) {
		case REFERENCE:
			return SymbolNames.IRV_DATA_REFERENCE_PARAM_NAME;
		case VALUE:
		default:
			return SymbolNames.IRV_DATA_PARAM_NAME;
		}
	}

	public Parameter createTrustedFunctionIndexParam() {
		Parameter destFunctionIndexParam = ModuleFactory.eINSTANCE.createParameter();
		destFunctionIndexParam.setType(this.context.cache.osTfIndexType);
		destFunctionIndexParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_INDEX_PARAM_NAME);
		destFunctionIndexParam.setDirection(ParameterDirectionEnum.IN);
		destFunctionIndexParam.setPassType(ParameterPassTypeEnum.VALUE);
		destFunctionIndexParam.setHasConst(false);
		return destFunctionIndexParam;
	}

	public Parameter createTrustedFunctionParamsParam() {
		Parameter destFunctionParamsParam = ModuleFactory.eINSTANCE.createParameter();
		destFunctionParamsParam.setType(this.context.cache.osTfParamRefType);
		destFunctionParamsParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_PARAMS_PARAM_NAME);
		destFunctionParamsParam.setDirection(ParameterDirectionEnum.IN); // NOTE 本来はINOUTだが、コード生成の都合上現在の設定としている
		destFunctionParamsParam.setPassType(ParameterPassTypeEnum.VALUE); // NOTE 本来はREFERENCEだが、コード生成の都合上現在の設定としている
		destFunctionParamsParam.setHasConst(false);
		return destFunctionParamsParam;
	}

	private Parameter createInParam(String symbolName, Type type) {
		ParameterPassTypeEnum passType = getInParameterPassType(type);
		boolean hasConst = (passType == ParameterPassTypeEnum.REFERENCE);

		return createParam(symbolName, type, ParameterDirectionEnum.IN, passType, hasConst);
	}

	private Parameter createOutParam(String symbolName, Type type) {
		return createParam(symbolName, type, ParameterDirectionEnum.OUT, ParameterPassTypeEnum.REFERENCE, false);
	}

	private Parameter createInOutParam(String symbolName, Type type) {
		return createParam(symbolName, type, ParameterDirectionEnum.INOUT, ParameterPassTypeEnum.REFERENCE, false);
	}

	private Parameter createParam(String symbolName, Type type, ParameterDirectionEnum direction, ParameterPassTypeEnum passType, boolean hasConst) {
		Parameter destParam = ModuleFactory.eINSTANCE.createParameter();
		destParam.setSymbolName(symbolName);
		destParam.setType(type);
		destParam.setDirection(direction);
		destParam.setPassType(passType);
		destParam.setHasConst(hasConst);
		return destParam;
	}

	public ParameterPassTypeEnum getInParameterPassType(Type type) {
		if (type instanceof PrimitiveType || type instanceof PointerType) {
			return ParameterPassTypeEnum.VALUE;
		} else {
			return ParameterPassTypeEnum.REFERENCE;
		}
	}

	public LocalVariable createReturnValueVariable() {
		LocalVariable destStatusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setSymbolName(SymbolNames.RETURN_VALUE_LOCAL_VAR_NAME);
		return destStatusVariable;
	}

	public LocalVariable createTempReturnValueVariable() {
		LocalVariable destStatusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setSymbolName(SymbolNames.TEMP_RETURN_VALUE_LOCAL_VAR_NAME);
		return destStatusVariable;
	}

	public LocalVariable createTempReturnValueVariableForTrustedFunction() {
		LocalVariable destStatusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destStatusVariable.setType(this.context.cache.osStatusType);
		destStatusVariable.setSymbolName(SymbolNames.TEMP_RETURN_VALUE_LOCAL_VAR_NAME_FOR_TRUSTED);
		return destStatusVariable;
	}

	public LocalVariable createSrDataVariable(VariableDataInstanceInSwc sourceDataInstanceInSwc, String symbolName) throws ModelException {
		LocalVariable destDataVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destDataVariable.setType(this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType()));
		destDataVariable.setSymbolName(symbolName);
		return destDataVariable;
	}

	public LocalVariable createSrInvalidValueVariable(VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		LocalVariable destInvalidValueVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destInvalidValueVariable.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destInvalidValueVariable.setSymbolName(SymbolNames.SR_INVALID_VALUE_VAR_NAME);
		return destInvalidValueVariable;
	}

	public LocalVariable createSrFilterResultVariable() {
		LocalVariable destFilterResultVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destFilterResultVariable.setType(this.context.cache.booleanType);
		destFilterResultVariable.setSymbolName(SymbolNames.SR_FILTER_RESULT_VAR_NAME);
		return destFilterResultVariable;
	}

	public LocalVariable createRteQueuedSendTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.rteQueuedSendTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.RTE_QUEUED_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createRteNonqueuedSendTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.rteNonqueuedSendTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.RTE_NONQUEUED_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComSendSignalTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.comSendSignalTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.COM_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComSendSignalGroupTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.comSendSignalGroupTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.COM_GROUP_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComProxyFunctionTableIndexVariable() {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(this.context.cache.comProxyFunctionTableIndexType);
		destVariable.setSymbolName(SymbolNames.COM_PROXY_FUNCTION_TABLE_INDEX_VAR_NAME);
		return destVariable;
	}
	
	public LocalVariable createEntityEventVariable() {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(this.context.cache.osEventMaskType);
		destVariable.setSymbolName(SymbolNames.ENTITY_EVENT_VAR_NAME);
		return destVariable;
	}

	public LocalVariable createComProxyDataVariable(PrimitiveType proxyDataType) {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(proxyDataType);
		destVariable.setSymbolName(SymbolNames.COM_PROXY_DATA_VAR_NAME);
		return destVariable;
	}
	
	public LocalVariable createActivationFlagVariable(ActivationOperation activationOperation) {
		LocalVariable activationFlag = ModuleFactory.eINSTANCE.createLocalVariable();
		if (activationOperation.getActivationApi() instanceof OsActivateTaskApi) {
			OsActivateTaskApi activatteTaskApi = (OsActivateTaskApi)activationOperation.getActivationApi();
			activationFlag.setSymbolName(SymbolNames.createActivationFlagName(activatteTaskApi));
		}
		else if (activationOperation.getActivationApi() instanceof OsSetEventApi) { // COVERAGE 常にtrue(現状，OsActivateTaskApi/OsSetEventApi以外のパターンが存在しないため，未カバレッジで問題ない)
			OsSetEventApi setEventApi = (OsSetEventApi)activationOperation.getActivationApi();
			activationFlag.setSymbolName(SymbolNames.createActivationFlagName(setEventApi));
		}
		activationFlag.setType(this.context.cache.booleanType);
		activationFlag.setInitValueConstant(this.context.cache.booleanFalse);
		return activationFlag;
	}

	public void removeUnusedLocalVariables(Function targetFunction) {
		for (LocalVariable targetLocalVariable : Lists.newArrayList(targetFunction.getLocalVariable())) {
			if (isUnusedLocalVariable(targetLocalVariable, targetFunction)) {
				targetFunction.getLocalVariable().remove(targetLocalVariable);
			}
		}
	}

	private boolean isUnusedLocalVariable(LocalVariable localVariable, Function function) {
		return this.context.query.find(function, ref(localVariable)).isEmpty();
	}

	private ValueSpecification getLeafValueSpecification(ValueSpecification sourceValue) {
		// OCLと実装が被るが、登録していないValueSpecificationを処理したいので、Javaで実装する
		if (sourceValue instanceof ConstantReference) {
			return getLeafValueSpecification(((ConstantReference)sourceValue).getEndValueSpec());
		}
		return sourceValue;
	}

	public void buildConstantValue(Constant targetConstant, ValueSpecification sourceValue, Type type) throws ModelException {
		if (sourceValue == null) {
			targetConstant.setValue(String.valueOf(ConfigValues.DEFAULT_DATA_ELEMENT_INIT_VALUE));

		} else {
			ValueSpecification sourceLeafValue = getLeafValueSpecification(sourceValue);
			Type leafType;
			if (type instanceof RedefinitionType) {
				leafType = ((RedefinitionType) type).getLeafType();
			} else {
				leafType = type;
			}

			if (leafType instanceof ArrayType) {
				buildConstantMembersForArray(targetConstant, (ArrayValueSpecification) sourceLeafValue, leafType);

			} else if (leafType instanceof StructType) {
				buildConstantMembersForRecord(targetConstant, (RecordValueSpecification) sourceLeafValue, (StructType) leafType);

			} else if (leafType instanceof UnionType) {
				buildConstantMembersForUnion(targetConstant, (RecordValueSpecification) sourceLeafValue, (UnionType) leafType);

			} else {
				targetConstant.setValue(getValueString(sourceLeafValue));
			}
			buildConstantValueType(targetConstant, sourceLeafValue);
		}
	}

	private void buildConstantMembersForArray(Constant targetConstant, ArrayValueSpecification sourceValue, Type type) throws ModelException {
		Type memberType = getConstantMemberType(type.getOriginalTypeSymbolName());

		for (ValueSpecification sourceElementValue : sourceValue.getElement()) {
			targetConstant.getMember().add(createConstantForArrayElement(sourceElementValue, memberType));
		}
	}

	private ConstantMember createConstantForArrayElement(ValueSpecification sourceElementValue, Type type) {
		// arrayの多次元には未対応
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(type);
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private void buildConstantMembersForRecord(Constant targetConstant, RecordValueSpecification sourceValue, StructType type) {
		int index = 0;
		for (StructMember member : type.getMember()) {
			// NOTE validationで保障されるため、indexは取得可能と決め打ち
			targetConstant.getMember().add(createConstantForRecordElement(sourceValue.getField().get(index++), member));
		}
	}

	private ConstantMember createConstantForRecordElement(ValueSpecification sourceElementValue, StructMember structMember) {
		// arrayの多次元には未対応
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(structMember.getType());
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private void buildConstantMembersForUnion(Constant targetConstant, RecordValueSpecification sourceValue, UnionType type) {
		// 1番目のメンバーのみ追加
		targetConstant.getMember().add(createConstantForUnionElement(sourceValue.getField().get(0), type.getMember().get(0)));
	}

	private ConstantMember createConstantForUnionElement(ValueSpecification sourceElementValue, UnionMember unionMember) {
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(unionMember.getType());
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private Type getConstantMemberType(String typeName) throws ModelException {
		try {
			return this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, typeName));
		} catch (ModelException e) {
			return this.context.query.selectSingle(this.context.cache.rte.getImplementationDataType(), hasAttr(TYPE__SYMBOL_NAME, typeName));
		}
	}

	private String getValueString(ValueSpecification sourceValue) {
		// OCLと実装が被るが、登録していないValueSpecificationを処理したいので、Javaで実装する
		ValueSpecification sourceLeafValue = getLeafValueSpecification(sourceValue);
		if (sourceValue instanceof NumericalValueSpecification) {
			return ((NumericalValueSpecification) sourceLeafValue).getValue().toString();

		} else if (sourceValue instanceof TextValueSpecification) {
			return ((TextValueSpecification) sourceLeafValue).getValue();
		}

		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// 配列型/構造体型/共用体型のメンバは必ずプリミティブ型であることをモデル制約で保証している.
		return null;
	}

	public void buildConstantValueType(Constant targetConstant, ValueSpecification sourceValue) {
		ValueSpecification sourceLeafValue;
		if (sourceValue instanceof ConstantReference) {
			sourceLeafValue = getLeafValueSpecification(sourceValue);
		} else {
			sourceLeafValue = sourceValue;
		}

		if (sourceLeafValue instanceof NumericalValueSpecification) {
			targetConstant.setConstantValueType(ConstantValueTypeEnum.NUMERICAL_VALUE);

		} else if (sourceLeafValue instanceof TextValueSpecification) {
			targetConstant.setConstantValueType(ConstantValueTypeEnum.TEXT_VALUE);			

		} else { // COVERAGE (numerical, text以外を設定することはないため未到達)
			targetConstant.setConstantValueType(ConstantValueTypeEnum.UNKNOWN_VALUE);
		}
	}
}
