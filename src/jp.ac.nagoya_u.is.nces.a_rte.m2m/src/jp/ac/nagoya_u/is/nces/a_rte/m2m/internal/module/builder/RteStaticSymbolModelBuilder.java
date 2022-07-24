/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2017 by Eiwa System Management, Inc., JAPAN
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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_GENERAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IMPLEMENTATION_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TACK_STATUS_VARIABLE_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TAckStatusVariableImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteNonqueuedSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteQueuedSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * RTEの静的シンボル(型、定数、グローバル変数)のモデルを構築する。
 */
public class RteStaticSymbolModelBuilder {

	private final ModuleModelBuildContext context;
	private final MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;

	public RteStaticSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 静的シンボルのシンボルモデル(API)を構築する。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildApiSymbols() throws ModelException {
		buildDataTypeApiSymbols();
		buildSrApiSymbols();
		buildCsApiSymbols();
		buildModeApiSymbols();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(データ型)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildDataTypeApiSymbols() throws ModelException {
		// 実装データ型の構築
		List<ImplementationDataType> sourceDataTypes = this.context.query.<ImplementationDataType> findByKind(IMPLEMENTATION_DATA_TYPE);
		sortImplementationDataTypes(sourceDataTypes);
		for (ImplementationDataType sourceDataType : sourceDataTypes) {
			// 実装型の生成。実体よりも参照が先に来る可能性がある(再定義やComposite)ため、取得時に存在しないなら作成する実装にしている。
			getOrBuildImplementationDataType(sourceDataType);
		}

		// 上限値・下限値・列挙値定数の構築
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
	
			// 上限値，および下限値定数の構築
			for (ApplicationDataType sourceApplicationDataType : this.context.query.select(sourceSwComponentType.getUsingApplicationDataTypes(),
					hasOp(APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE, true))) {
				buildUpperLowerLimitConstant(targetSwc, sourceApplicationDataType, sourceSwComponentType);
			}
	
			// 列挙値定数の構築
			for (AutosarDataType sourceDataType : sourceSwComponentType.getUsingDataTypes()) {
				ApplicationDataType sourceApplicationDataType;
				ImplementationDataType sourceImplementationDataType;
				if (sourceDataType instanceof ApplicationDataType) {
					sourceApplicationDataType = (ApplicationDataType) sourceDataType;
					sourceImplementationDataType = sourceSwComponentType.getImplementationDataType(sourceApplicationDataType);
				} else {
					sourceApplicationDataType = null;
					sourceImplementationDataType = (ImplementationDataType) sourceDataType;
				}
	
				if (this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE, sourceApplicationDataType)) {
					CompuMethod sourceCompuMethod = this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE,
							sourceApplicationDataType);
					buildEnumConstant(targetSwc, sourceSwComponentType, sourceImplementationDataType, sourceCompuMethod);
				}
			}
	
		}
	}

	private void sortImplementationDataTypes(List<? extends ImplementationDataType> targetTypes) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(REFERRABLE__SHORT_NAME));
		Collections.sort(targetTypes, ordering);
	}

	private Type getOrBuildImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		// 作成済みなら利用する
		try {
			return this.context.builtQuery.findDestType(sourceDataType);
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}

		// 同一シンボルなら利用する
		try {
			Type destType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, sourceDataType.getShortName()));
			destType.getSource().add(sourceDataType);
			return destType;
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}

		try {
			Type destType = this.context.query.selectSingle(this.context.cache.rte.getImplementationDataType(), hasAttr(TYPE__SYMBOL_NAME, sourceDataType.getShortName()));
			destType.getSource().add(sourceDataType);
			return destType;
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}
		
		// 未生成なので生成する
		Type destType;
		if (sourceDataType.isRedefinitionType()) {
			destType = createRedefinitionImplementationDataType(sourceDataType);
		} else {
			if (sourceDataType.isArrayType()) {
				destType = createArrayImplementationDataType(sourceDataType);
			} else if (sourceDataType.isStructType()) {
				destType = createStructImplementationDataType(sourceDataType);
			} else if (sourceDataType.isUnionType()) {
				destType = createUnionImplementationDataType(sourceDataType);
			} else if (sourceDataType.isPointerType()) {
				destType = createPointerImplementationDataType(sourceDataType);
			} else {
				destType = createPrimitiveImplementationDataType(sourceDataType);
			}
		}
		// 実装型を生成するかの判別．生成しない場合，依存型として定義
		if (this.context.query.get(sourceDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE)) {
			this.context.cache.rte.getImplementationDataType().add(destType);
		} else {
			this.context.cache.rte.getDependentType().add(destType);
		}
		return destType;
	}

	private Type getOrBuildBuiltinDataType(SwBaseType sourceBaseType) {
		// 作成済みなら利用する
		try {
			return this.context.builtQuery.findDest(TYPE, sourceBaseType);
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}

		// 同一シンボルなら利用する
		try {
			Type destType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, sourceBaseType.getNativeDeclaration()));
			destType.getSource().add(sourceBaseType);
			return destType;
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}

		// 未生成なので生成する
		PrimitiveType destType = ModuleFactory.eINSTANCE.createPrimitiveType();
		destType.setSingleSource(sourceBaseType);
		destType.setSymbolName(sourceBaseType.getNativeDeclaration());
		destType.setSignedness(Types.getSignedness(sourceBaseType));

		// 実装型を生成するかの判別．生成しない場合，依存型として定義
		this.context.cache.rte.getDependentType().add(destType);
		return destType;
	}

	private PrimitiveType createPrimitiveImplementationDataType(ImplementationDataType sourceDataType) {
		PrimitiveType destType = ModuleFactory.eINSTANCE.createPrimitiveType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		destType.setOriginalTypeSymbolName(sourceDataType.getBaseType().getNativeDeclaration());
		destType.setSize(sourceDataType.getBaseType().getBaseTypeSize());
		destType.setSignedness(Types.getSignedness(sourceDataType));
		return destType;
	}

	private Type createRedefinitionImplementationDataType(ImplementationDataType sourceImplType) throws ModelException {
		ImplementationDataType sourceSourceImplType = sourceImplType.getSwDataDefProps().getImplementationDataType();
		Type destSourceType = getOrBuildImplementationDataType(sourceSourceImplType);

		RedefinitionType destType = null;
		if (sourceSourceImplType.isPrimitiveType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType();
		} else if (sourceSourceImplType.isArrayType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionArrayType();
		} else if (sourceSourceImplType.isStructType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionStructType();
		} else if (sourceSourceImplType.isUnionType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionUnionType();
		} else if (sourceSourceImplType.isPointerType()) { // COVERAGE (現状，いずれにも該当しないパターンは存在しないため，コードレビューで問題ないことを確認)
			destType = ModuleFactory.eINSTANCE.createRedefinitionPointerType();
		}
		
		destType.setSymbolName(sourceImplType.getShortName());
		destType.setOriginalTypeSymbolName(destSourceType.getOriginalTypeSymbolName()); // 大元のsymbolNameと同じにする
		destType.setSingleSource(sourceImplType);
		destType.setSourceType(destSourceType);
		destType.setSize(destSourceType.getSize());
		destType.setSignedness(destSourceType.getSignedness());
		return destType;
	}

	private PointerType createPointerImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		PointerType destType = ModuleFactory.eINSTANCE.createPointerType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		
		// NOTE 未サポート
//		destType.setIsConstPointer(sourceDataType.getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
//		destType.setIsConstTarget(sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
		
		SwBaseType sourceRefBaseType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getBaseType();
		if (sourceRefBaseType != null) {
			Type destRefType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, sourceRefBaseType.getNativeDeclaration()));
			destType.setType(destRefType);
		} else {
			ImplementationDataType sourceRefImplType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getImplementationDataType();
			destType.setType(getOrBuildImplementationDataType(sourceRefImplType));
		}
		return destType;
	}

	private ArrayType createArrayImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		ImplementationDataTypeElement sourceImplementationDataTypeElement = sourceDataType.getSubElement().get(0);

		ArrayType destType = ModuleFactory.eINSTANCE.createArrayType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		if (sourceImplementationDataTypeElement.isRedefinitionType()) {
			// CategoryがTYPE_REFERENCEの場合、signとoriginal type symbolnameの定義方法を変更
			ImplementationDataType sourceElementDataType = sourceImplementationDataTypeElement.getSwDataDefProps().getImplementationDataType();
			getOrBuildImplementationDataType(sourceElementDataType); // 依存先の型を先に作成・登録する(コンパイル時に問題が出るため)
			destType.setSignedness(Types.getSignedness(sourceElementDataType));
			destType.setOriginalTypeSymbolName(sourceElementDataType.getShortName());
		} else {
			getOrBuildBuiltinDataType(sourceImplementationDataTypeElement.getSwDataDefProps().getBaseType());
			destType.setSignedness(Types.getSignedness(sourceImplementationDataTypeElement));
			destType.setOriginalTypeSymbolName(sourceImplementationDataTypeElement.getSwDataDefProps().getBaseType().getNativeDeclaration());
		}
		destType.setArraySize(sourceImplementationDataTypeElement.getArraySize());
		return destType;
	}

	private StructType createStructImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		StructType destType = ModuleFactory.eINSTANCE.createStructType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			StructMember destMember = ModuleFactory.eINSTANCE.createStructMember();
			destMember.setMemberName(sourceElement.getShortName());
			
			Type destMemberType;
			if (sourceElement.isRedefinitionType()) {
				// CategoryがTYPE_REFERENCEの場合、再帰的に処理を行う
				destMemberType = getOrBuildImplementationDataType(sourceElement.getSwDataDefProps().getImplementationDataType());
				destMember.setType(destMemberType);
			} else {
				destMemberType = getOrBuildBuiltinDataType(sourceElement.getSwDataDefProps().getBaseType());
			}
			destMember.setType(destMemberType);
			destType.getMember().add(destMember);
		}
		return destType;
	}
	
	private UnionType createUnionImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		UnionType destType = ModuleFactory.eINSTANCE.createUnionType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			UnionMember destMember = ModuleFactory.eINSTANCE.createUnionMember();
			destMember.setMemberName(sourceElement.getShortName());

			Type destMemberType;
			if (sourceElement.isRedefinitionType()) {
				// CategoryがTYPE_REFERENCEの場合、再帰的に処理を行う
				destMemberType = getOrBuildImplementationDataType(sourceElement.getSwDataDefProps().getImplementationDataType());
			} else {
				destMemberType = getOrBuildBuiltinDataType(sourceElement.getSwDataDefProps().getBaseType());
			}
			destMember.setType(destMemberType);
			destType.getMember().add(destMember);
		}
		return destType;
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, ApplicationDataType sourceApplicationDataType, AtomicSwComponentType sourceSwComponentType) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, sourceSwComponentType.getImplementationDataType(sourceApplicationDataType));
		List<IncludedDataTypeSet> sourceIncludedDataTypeSets = sourceSwComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceApplicationDataType);
		Set<String> sourceLiteralPrefixes = ImmutableSet.copyOf(this.context.query.<String> collect(sourceIncludedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));
	
		// 上限値，下限値の生成
		if (sourceLiteralPrefixes.isEmpty()) {
			buildUpperLowerLimitConstant(targetSwc, Optional.<String> absent(), sourceApplicationDataType, type);
		} else {
			for (String sourceLiteralPrefix : sourceLiteralPrefixes) {
				buildUpperLowerLimitConstant(targetSwc, Optional.of(sourceLiteralPrefix), sourceApplicationDataType, type);
			}
		}
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		targetSwc.getApiUpperLowerLimitConstant().add(createUpperLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
		targetSwc.getApiUpperLowerLimitConstant().add(createLowerLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
	}

	private Constant createLowerLimitConstant(Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant destLowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		destLowerLimitConstant.setSymbolName(SymbolNames.createLowerLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		destLowerLimitConstant.setType(type);
		destLowerLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getLowerLimitValue());
		return destLowerLimitConstant;
	}

	private Constant createUpperLimitConstant(Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant destUpperLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		destUpperLimitConstant.setSymbolName(SymbolNames.createUpperLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		destUpperLimitConstant.setType(type);
		destUpperLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getUpperLimitValue());
		return destUpperLimitConstant;
	}

	private void buildEnumConstant(Swc targetSwc, AtomicSwComponentType sourceSwComponentType, ImplementationDataType sourceImplementationDataType, CompuMethod sourceCompuMethod)
			throws ModelException {
		// 上限値，下限値の生成
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, sourceImplementationDataType);
		List<IncludedDataTypeSet> sourceIncludedDataTypeSets = sourceSwComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceImplementationDataType);
		Set<String> sourceLiteralPrefixes = ImmutableSet.copyOf(this.context.query.<String> collect(sourceIncludedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));
	
		if (sourceLiteralPrefixes.isEmpty()) {
			for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
				if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
					targetSwc.getApiEnumConstant().add(createEnumConstant(Optional.<String> absent(), sourceCompuScale, type));
				}
			}
		} else {
			for (String sourceLiteralPrefix : sourceLiteralPrefixes) {
				for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
					if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
						targetSwc.getApiEnumConstant().add(createEnumConstant(Optional.of(sourceLiteralPrefix), sourceCompuScale, type));
					}
				}
			}
		}
	}

	private Constant createEnumConstant(Optional<String> sourceLiteralPrefix, CompuScale sourceCompuScale, PrimitiveType type) throws ModelException {
		String enumLiteral = this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE);
	
		Constant destEnumConstant = ModuleFactory.eINSTANCE.createConstant();
		destEnumConstant.setSymbolName(SymbolNames.createEnumConstantName(sourceLiteralPrefix, enumLiteral));
		destEnumConstant.setType(type);
		destEnumConstant.setValue(sourceCompuScale.getLowerLimit().getValue());
		return destEnumConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(S/R)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrApiSymbols() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// 初期値定数の構築
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						ImplementationDataType sourceImplType = sourceDataInstanceInSwc.getImplementationDataType();
						if (sourceImplType.isPrimitiveType() || sourceImplType.isPointerType()) {
							targetSwc.getSrApiInitValueConstant().add(createSrApiInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
						}
					}
				}
			}
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						ImplementationDataType sourceImplType = sourceDataInstanceInSwc.getImplementationDataType();
						if (sourceImplType.isPrimitiveType() || sourceImplType.isPointerType()) {
							targetSwc.getSrApiInitValueConstant().add(createSrApiInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
						}
					}
				}
			}
		}
	}

	private Constant createSrApiInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createSrInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createSrApiInitValueConstantName(sourceDataInstanceInSwc), RoleNames.SR_API_INIT_VALUE_ROLE_NAME);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(C/S)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCsApiSymbols() {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// アプリケーションエラー定数の構築
			targetSwc.getCsApiApplicationErrorConstant().addAll(createCsApplicationErrorConstants(sourceSwComponentType));
		}
	}

	private List<Constant> createCsApplicationErrorConstants(AtomicSwComponentType sourceSwComponentType) {
		// アプリケーションエラー定数の構築
		List<Constant> destApplicationErrorConstants = Lists.newArrayList();
		for (ClientServerInterface sourceClientServerInterface : sourceSwComponentType.getUsingClientServerInterfaces()) {
			for (ApplicationError sourceApplicationError : sourceClientServerInterface.getPossibleError()) {
				// アプリケーションエラー定数の生成
				destApplicationErrorConstants.add(createCsApplicationErrorConstant(sourceApplicationError));
			}
		}

		// アプリケーションエラーの正規化（シンボル名の重複する定数を除外する）
		List<Constant> normalizedApplicationErrorConstants = Lists.newArrayList();

		ListMultimap<String, Constant> symbolName2ConstantMap = this.context.query.groupByKey(destApplicationErrorConstants, CONSTANT__SYMBOL_NAME);
		for (String keySymbolName : symbolName2ConstantMap.keys()) {
			List<Constant> constants = symbolName2ConstantMap.get(keySymbolName);

			Constant firstConstant = constants.get(0);
			for (Constant anotherConstant : constants.subList(1, constants.size())) {
				firstConstant.getSource().addAll(anotherConstant.getSource());
			}
			normalizedApplicationErrorConstants.add(firstConstant);
		}
		return normalizedApplicationErrorConstants;
	}

	private Constant createCsApplicationErrorConstant(ApplicationError sourceApplicationError) {
		Constant destApplicationErrorConstant = ModuleFactory.eINSTANCE.createConstant();
		destApplicationErrorConstant.setSymbolName(SymbolNames.createCsApplicationErrorConstantName(sourceApplicationError));
		destApplicationErrorConstant.setType(this.context.cache.stdReturnType);
		destApplicationErrorConstant.setValue(String.valueOf(sourceApplicationError.getErrorCode()));
		return destApplicationErrorConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(モード)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildModeApiSymbols() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();
			buildModeDeclarationGroups(targetBswm, sourceBswModuleDescription);
		}
	}

	private void buildModeDeclarationGroups(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (DataTypeMappingSet sourceMappingSet : sourceBehavior.getDataTypeMapping()) {
			for (ModeRequestTypeMap sourceModeRequestTypeMap : sourceMappingSet.getModeRequestTypeMap()) {
				targetBswm.getModeDeclarationGroup().add(createModeDeclarationGroup(sourceBswModuleDescription, sourceModeRequestTypeMap.getModeGroup(), sourceModeRequestTypeMap));
			}
		}
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup createModeDeclarationGroup(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroup sourceModeDeclarationGroup, ModeRequestTypeMap sourceModeRequestTypeMap) throws ModelException {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup destModeDeclarationGroup = ModuleFactory.eINSTANCE.createModeDeclarationGroup();
		destModeDeclarationGroup.setSingleSource(sourceModeDeclarationGroup);

		// モード型の構築
		ModeType destModeType = createModeType(sourceModeRequestTypeMap.getModeGroup(), sourceModeRequestTypeMap);
		destModeDeclarationGroup.setModeType(destModeType);

		// モードの実装型の構築
		destModeDeclarationGroup.setImplementationDataType(destModeType.getImplementationDataType());
		
		// モード遷移定数の構築
		Constant destModeTransitionStatusConstant = ModuleFactory.eINSTANCE.createConstant();
		destModeTransitionStatusConstant.setExternalSymbolName(SymbolNames.createExternalModeTransitionConstantName(sourceModeDeclarationGroup));
		destModeTransitionStatusConstant.setSymbolName(SymbolNames.createModeTransitionConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup));
		destModeTransitionStatusConstant.setType(destModeType.getImplementationDataType());
		destModeTransitionStatusConstant.setValue(String.valueOf(sourceModeDeclarationGroup.getModeDeclaration().size()));
		destModeDeclarationGroup.setModeTransitionStatusConstant(destModeTransitionStatusConstant);

		int idx = 0;
		for (ModeDeclaration sourceModeDeclaration : sourceModeDeclarationGroup.getModeDeclaration()) {
			// モード定数の構築
			Constant destModeConstant = ModuleFactory.eINSTANCE.createConstant();
			destModeConstant.setSingleSource(sourceModeDeclaration);
			destModeConstant.setExternalSymbolName(SymbolNames.createExternalModeConstantName(sourceModeDeclarationGroup, sourceModeDeclaration));
			destModeConstant.setSymbolName(SymbolNames.createModeConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup, sourceModeDeclaration));
			destModeConstant.setType(destModeType.getImplementationDataType());
			destModeConstant.setValue(String.valueOf(idx));
			destModeDeclarationGroup.getModeConstant().add(destModeConstant);

			// 初期モード定数の構築
			if (sourceModeDeclaration == sourceModeDeclarationGroup.getInitialMode()) {
				Constant destInitModeConstant = ModuleFactory.eINSTANCE.createConstant();
				destInitModeConstant.setSymbolName(SymbolNames.createModeInitModeConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup));
				destInitModeConstant.setType(destModeType.getImplementationDataType());
				destInitModeConstant.setValue(String.valueOf(idx));
				destModeDeclarationGroup.setInitModeConstant(destInitModeConstant);
			}
			idx++;
		}

		return destModeDeclarationGroup;
	}

	private ModeType createModeType(ModeDeclarationGroup sourceModeDeclarationGroup, ModeRequestTypeMap sourceModeRequestTypeMap) throws ModelException {
		ModeType destType = ModuleFactory.eINSTANCE.createModeType();
		destType.setSymbolName(SymbolNames.createModeTypeName(sourceModeDeclarationGroup));
		destType.setImplementationDataType(getOrBuildImplementationDataType(sourceModeRequestTypeMap.getImplementationDataType()));
		destType.setGuardName(SymbolNames.createModeTypeGuardName(sourceModeDeclarationGroup));
		return destType;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 静的シンボルのシンボルモデル(内部実装用)を構築する。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildImplSymbols() throws ModelException {
		buildOsAccessImplSymbols();
		buildComAccessImplSymbols();
		buildEntityStartImplSymbols();
		buildSrImplSymbols();
		buildCsImplSymbols();
		buildModeImplSymbols();
		buildIrvImplSymbols();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(OSアクセス)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildOsAccessImplSymbols() throws ModelException {
		buildOsTrustedMacros();
	}

	private void buildOsTrustedMacros() throws ModelException {
		for (EcucPartition sourceEcucPartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceEcucPartition);
	
			targetPartition.setOsTrustedMacro(createOsTrustedMacro(sourceEcucPartition));
		}
	}

	private Macro createOsTrustedMacro(EcucPartition sourceEcucPartition) {
		Macro destMacro = ModuleFactory.eINSTANCE.createMacro();
		destMacro.setSingleSource(sourceEcucPartition);
		destMacro.setSymbolName(sourceEcucPartition.isTrusted() ? SymbolNames.OS_TRUSTED_MACRO : SymbolNames.OS_NON_TRUSTED_MACRO);
		return destMacro;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(COMアクセス)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildComAccessImplSymbols() throws ModelException {
		buildComMetaDataSymbols();
		buildComAccessFunctionAliasMacros();
		buildComReceiveBuffers();
		buildComTrustedFunctionParamTypes();
		buildComProxyFunctionTable();
	}

	// COMメタ情報の構築
	private void buildComMetaDataSymbols() throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}
			buildComMetaDataSymbols(sourceComSignalGroup, sourceDataInstanceInCompositions.get(0).getPrototype());
		}
	}

	private void buildComMetaDataSymbols(ComSignalGroup sourceComSignalGroup, VariableDataInstanceInSwc sourceDataInstanceInSwc)
			throws ModelException {

		SenderReceiverToSignalGroupMapping sourceSignalMapping = getSenderReceiverToSignalGroupMapping(sourceComSignalGroup);
		SenderRecCompositeTypeMapping sourceCompositeTypeMapping = sourceSignalMapping.getTypeMapping();
	
		// Rte_BufferTypeComSignal初期値定数の構築
		Constant destComGroupSignalMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destComGroupSignalMetaDataInitValueConstant);
	
		// Rte_BufferTypeOffset初期値定数の構築
		Constant destTypeMemberOffsetMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destTypeMemberOffsetMetaDataInitValueConstant);
	
		// Rte_BufferTypeComSignalとRte_BufferTypeOffsetのメンバを構築
		ImplementationDataType sourceDataType = ((ImplementationDataType) sourceDataInstanceInSwc.getPrototype().getType()).getLeafImplementationDataType();
		Type destDataType = this.context.builtQuery.findDestType(sourceDataType);
		
		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			if (destDataType instanceof ArrayType) {
				EList<SenderRecArrayElementMapping> sourceElementMapping = ((SenderRecArrayTypeMapping) sourceCompositeTypeMapping).getArrayElementMapping();
				for (int idx = 0; idx < sourceElementMapping.size(); idx++) {
					for (SenderRecArrayElementMapping senderRecArrayElementMapping : sourceElementMapping) {
						if(senderRecArrayElementMapping.getIndexedArrayElement().getIndex() == idx) {
							ComGroupSignal sourceGroupSignal = getComGroupSignal(sourceComSignalGroup, senderRecArrayElementMapping.getSystemSignal());
							addConstantMember(destComGroupSignalMetaDataInitValueConstant, SymbolNames.createComGroupSignalSymbolicName(sourceGroupSignal));
							addConstantMember(destTypeMemberOffsetMetaDataInitValueConstant, "(" + String.valueOf(idx) + "U * sizeof(" + destDataType.getOriginalTypeSymbolName() + "))");
						}
					}
				}
			} else if (destDataType instanceof StructType || destDataType instanceof UnionType) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
				for (SenderRecRecordElementMapping sourceElementMapping : ((SenderRecRecordTypeMapping) sourceCompositeTypeMapping).getRecordElementMapping()) {
					if (sourceElement == sourceElementMapping.getImplementationRecordElement()) {
						ComGroupSignal sourceGroupSignal = getComGroupSignal(sourceComSignalGroup, sourceElementMapping.getSystemSignal());
						addConstantMember(destComGroupSignalMetaDataInitValueConstant, SymbolNames.createComGroupSignalSymbolicName(sourceGroupSignal));
						addConstantMember(destTypeMemberOffsetMetaDataInitValueConstant, "Rte_offsetof(" + destDataType.getSymbolName() + ", " + sourceElement.getShortName() + ")");
						break;
					}
				}
			}
		}
	
		// COMメタ情報のシンボルのセットを構築
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;

		GlobalVariableSet destComMetaDataVariableSet = ModuleFactory.eINSTANCE.createGlobalVariableSet();
		destComMetaDataVariableSet.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(sourcePartition));
		destComMetaDataVariableSet.setSymbolName(SymbolNames.createGlobalSetName(sourceComSignalGroup));
		destComMetaDataVariableSet.setHasStatic(false);
		destComMetaDataVariableSet.setHasConst(false);
		destComMetaDataVariableSet.setInitWithConstantValue(false);
	
		// Rte_BufferTypeComSignalの構築
		GlobalVariable destComGroupSignalMetaDataVariable = createGlobalVariable(
				SymbolNames.createComMetaComGroupSignalVariableName(sourceComSignalGroup) + "[" + String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "]", this.context.cache.comSignalIdType,
				destComGroupSignalMetaDataInitValueConstant, true);
		destComGroupSignalMetaDataVariable.setHasStatic(true);
		destComGroupSignalMetaDataVariable.setHasConst(true);
		destComGroupSignalMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(0, destComGroupSignalMetaDataVariable);
	
		// Rte_BufferTypeOffsetの構築
		GlobalVariable destTypeMemberOffsetMetaDataVariable = createGlobalVariable(
				SymbolNames.createComMetaTypeMemberOffsetVariableName(sourceComSignalGroup) + "[" + String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "]",
				this.context.cache.comMetaDataTypeMemberOffsetType, destTypeMemberOffsetMetaDataInitValueConstant, true);
		destTypeMemberOffsetMetaDataVariable.setHasStatic(true);
		destTypeMemberOffsetMetaDataVariable.setHasConst(true);
		destTypeMemberOffsetMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(1, destTypeMemberOffsetMetaDataVariable);
	
		// Rte_BufferComMetaComplexDataの構築
		Constant destComMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		addConstantMember(destComMetaDataInitValueConstant, SymbolNames.createComSignalGroupSymbolicName(sourceComSignalGroup));
		addConstantMember(destComMetaDataInitValueConstant, String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "U");
		addConstantMember(destComMetaDataInitValueConstant, "&" + SymbolNames.createComMetaComGroupSignalVariableName(sourceComSignalGroup) + "[0]");
		addConstantMember(destComMetaDataInitValueConstant, "&" + SymbolNames.createComMetaTypeMemberOffsetVariableName(sourceComSignalGroup) + "[0]");
		this.context.cache.rte.getImmediateConstant().add(destComMetaDataInitValueConstant);
	
		GlobalVariable destComMetaDataVariable = createGlobalVariable(SymbolNames.createComMetaVariableName(sourceComSignalGroup), this.context.cache.comMetaDataType, destComMetaDataInitValueConstant, true);
		destComMetaDataVariable.setHasStatic(false);
		destComMetaDataVariable.setHasConst(false);
		destComMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(2, destComMetaDataVariable);
	
		// 論理区画に登録
		targetPartition.getComMetaDataVariableSet().add(destComMetaDataVariableSet);
	}

	private SenderReceiverToSignalGroupMapping getSenderReceiverToSignalGroupMapping(ComSignalGroup comSigGroup) throws ModelException {
		SystemSignalGroup sysSigGroup = comSigGroup.getComSystemTemplateSignalGroup().getISignalGroup().getSystemSignalGroup();
		SenderReceiverToSignalGroupMapping mapping = this.context.query.findSingle(ref(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, sysSigGroup));
		return mapping;
	}

	private ComGroupSignal getComGroupSignal(ComSignalGroup comSignalGroup, SystemSignal sysSig) {
		for (ComGroupSignal cgSignal : comSignalGroup.getComGroupSignal()) {
			if (cgSignal.getComSystemTemplateSystemSignal().getISignal().getSystemSignal() == sysSig) {
				return cgSignal;
			}
		}
		// COVERAGE 常に未達(常用ケースではないため，コードレビューで問題ないことを確認)
		return null;
	}

	// COMアクセス関数エイリアスマクロの構築
	private void buildComAccessFunctionAliasMacros() throws ModelException {
		// COMアクセス関数へのエイリアスマクロの生成有無を判定
		// S/Rで使用されているCOMシグナルグループが存在すれば生成する
		boolean requiresSendFunctionAlias = false;
		boolean requiresReceiveFunctionAlias = false;
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
			if (sourceImplType.isComplexType()) { // COVERAGE 常にtrue(現状，ComSignalGroupでPrimitiveTypeとなるパターンが存在しないため)
				VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInCompositions.get(0).getPrototype();
				if (sourceDataInstanceInSwc instanceof PVariableDataInstanceInSwc) {
					// 送信側マクロの構築
					requiresSendFunctionAlias = true;
				} else {
					// 受信側マクロの構築
					requiresReceiveFunctionAlias = true;
				}
			}
		}
	
		// COMアクセス関数へのエイリアスマクロの構築
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;
	
		// COM送信関数へのエイリアスマクロの構築
		if (requiresSendFunctionAlias) {
			targetPartition.getComSignalApiAlias().add(createComSendSignalGroupFunctionAliasMacro(sourcePartition));
		}
	
		// COM受信関数へのエイリアスマクロの構築
		if (requiresReceiveFunctionAlias) {
			targetPartition.getComSignalApiAlias().add(createComReceiveSignalGroupFunctionAliasMacro(sourcePartition));
		}
	}

	private FunctionMacro createComSendSignalGroupFunctionAliasMacro(Optional<EcucPartition> sourcePartition) {
		FunctionMacro destFunctionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		destFunctionMacro.setSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(sourcePartition));
		destFunctionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition)
				: SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
		return destFunctionMacro;
	}

	private FunctionMacro createComReceiveSignalGroupFunctionAliasMacro(Optional<EcucPartition> sourcePartition) {
		FunctionMacro destFunctionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		destFunctionMacro.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionAliasName(sourcePartition));
		destFunctionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withShadowSignal(sourcePartition)
				: SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withoutShadowSignal(sourcePartition));
		return destFunctionMacro;
	}

	private boolean isShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}

	// 複合データ型用COM受信バッファの構築
	private void buildComReceiveBuffers() throws ModelException {
        Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
        Partition targetPartition = this.context.cache.masterBswPartition;

        for (ExternalEcuSender sourceExternalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
            if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER)) {
                Optional<RteBufferVariableSet> destComReceiveBuffer = checkAndCreateComReceiveBuffer(sourceExternalEcuSender, sourcePartition);
                if (destComReceiveBuffer.isPresent()) {
                    targetPartition.getComReceiveBufferVariableSet().add(destComReceiveBuffer.get());
                }
            }
        }
	}

    private Optional<RteBufferVariableSet> checkAndCreateComReceiveBuffer(ExternalEcuSender sourceExternalEcuSender, Optional<EcucPartition> sourcePartition) throws ModelException {
        if (sourceExternalEcuSender.getSourceSignalGroup() != null) {
            ComSignalGroup sourceComSignalGroup = sourceExternalEcuSender.getSourceSignalGroup();
            List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
            if (sourceDataInstanceInCompositions.isEmpty()) { // COVERAGE 常にfalse(sourceDataInstanceInCompositionsが存在する対象しかExternalEcuSenderとならないため)
                return Optional.absent();
            }

            ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
            if (sourceImplType.isComplexType()) { // COVERAGE 常にtrue(現状，ComSingnalGroupでPrimitiveTypeとなるパターンが存在しないため)
            	Type type = this.context.builtQuery.findDestType(sourceImplType);
                return Optional.of(createComReceiveBuffer(sourceComSignalGroup, sourceDataInstanceInCompositions.get(0), type, sourcePartition));
            }
        } else if (sourceExternalEcuSender.getSourceSignal() != null) {
            ComSignal sourceComSignal = sourceExternalEcuSender.getSourceSignal();
            List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
            if (sourceDataInstanceInCompositions.isEmpty()) { // COVERAGE 常にfalse(sourceDataInstanceInCompositionsが存在する対象しかExternalEcuSenderとならないため)
                return Optional.absent();
            }

            ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
            if (sourceImplType.isComplexType()) {
            	Type type = this.context.builtQuery.findDestType(sourceImplType);
                return Optional.of(createComReceiveBuffer(sourceComSignal, sourceDataInstanceInCompositions.get(0), type, sourcePartition));
            }
        }
        return Optional.absent();
    }

	private RteBufferVariableSet createComReceiveBuffer(EcucContainer sourceComSignalOrComSignalGroup, VariableDataInstanceInComposition sourceDataInstanceInComposition, Type type, Optional<EcucPartition> sourcePartition) throws ModelException {
		GlobalVariable destValueVariable = createComReceiveBufferValueVariable(sourceComSignalOrComSignalGroup, type);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataInstanceInComposition));

		RteBufferVariableSet destComReceiveBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destComReceiveBuffer.setSingleSource(sourceComSignalOrComSignalGroup);
		destComReceiveBuffer.setComplexVariable(destValueVariable);
		return destComReceiveBuffer;
	}

	private GlobalVariable createComReceiveBufferValueVariable(EcucContainer sourceComSignalOrComSignalGroup, Type type) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createComReceiveBufferVariableName(sourceComSignalOrComSignalGroup));
		destValueVariable.setType(type);
		destValueVariable.setHasStatic(false);
		destValueVariable.setHasConst(false);
		return destValueVariable;
	}

	// 信頼関数経由COM送信用引数型の構築
	private void buildComTrustedFunctionParamTypes() {
		Rte targetRte = this.context.cache.rte;

		this.context.cache.comSendSignalTfParamType = Optional.absent();
		this.context.cache.comSendSignalGroupTfParamType = Optional.absent();
		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignal = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (sourceComSendImplForComSignal.isPresent()) {
			buildComSendSignalTrustedFunctionParamType(targetRte);
		}

		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignalGroup = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (sourceComSendImplForComSignalGroup.isPresent()) {
			buildComSendSignalGroupTrustedFunctionParamType(targetRte);
		}
	}

	private void buildComSendSignalTrustedFunctionParamType(Rte targetRte) {
		ComSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		destType.setSymbolName(SymbolNames.COM_SEND_SIGNAL_TF_PARAM_TYPE_NAME);
		destType.setIsGroup(false);
		this.context.cache.comSendSignalTfParamType = Optional.of(destType);
		targetRte.setComSendSignalTfParamType(destType);
	}

	private void buildComSendSignalGroupTrustedFunctionParamType(Rte targetRte) {
		ComSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		destType.setSymbolName(SymbolNames.COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE_NAME);
		destType.setIsGroup(true);
		this.context.cache.comSendSignalGroupTfParamType = Optional.of(destType);
		targetRte.setComSendSignalGroupTfParamType(destType);
	}

	// プロキシ経由COM送信のハンドラ関数テーブルの構築
	private void buildComProxyFunctionTable() throws ModelException {
		Partition targetPartition = this.context.cache.masterBswPartition;
		if (this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION).isEmpty()) {
			return;
		}

		// COMプロキシのハンドラ関数テーブルを構築
		Constant destFunctionTableInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destFunctionTableInitValueConstant);

		GlobalVariable destFunctionTableVariable = ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable();
		destFunctionTableVariable.setSymbolName(SymbolNames.createComProxyFunctionTableVariableName());
		destFunctionTableVariable.setType(this.context.cache.voidType);
		destFunctionTableVariable.setInitValueConstant(destFunctionTableInitValueConstant);
		destFunctionTableVariable.setInitAtDefinition(true);

		destFunctionTableVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) targetPartition.getSingleSource())));
		destFunctionTableVariable.setHasStatic(true);
		destFunctionTableVariable.setHasConst(false);
		destFunctionTableVariable.setInitWithConstantValue(true);
		targetPartition.setComProxyFunctionTableVariable(destFunctionTableVariable);

		List<Constant> destFunctionTableIndexConstants = new ArrayList<Constant>();

		for (ComSendProxy sourceComSendProxy : this.context.query.<ComSendProxy> findByKind(COM_SEND_PROXY)) {
			for (ComSendProxyInteraction sourceComSendProxyInteraction : sourceComSendProxy.getInteraction()) {
				ProxyComSendImplementation sourceSendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceComSendProxyInteraction));
				InternalEcuSender sourceSender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
				PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sourceSender.getSource().getPrototype();
				Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceDataInstanceInSwc.getOwnerAtomicSwc());
				if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					continue;
				}

				// COMシグナル向けのCOMプロキシバッファを構築
				if (sourceSendImplementation.getComSignal() != null) {
					destFunctionTableIndexConstants.add(createComProxyFunctionIndexConstant(sourceDataInstanceInSwc,
							SymbolNames.createComProxyFunctionTableIndexConstantName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal())));
					addConstantMember(destFunctionTableInitValueConstant, "&" + SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
					if (sourceComSendProxyInteraction.getSignalDataType().isComplexType()) {
						if (sourceComSendProxy instanceof PeriodicComSendProxy) {
							buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
						} else {
							buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
						}
					}
				}

				// COMシグナルグループ向けのCOMプロキシバッファを構築
				if (sourceSendImplementation.getComSignalGroup() != null) {
					destFunctionTableIndexConstants.add(createComProxyFunctionIndexConstant(sourceDataInstanceInSwc,
							SymbolNames.createComProxyFunctionTableIndexConstantName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup())));
					addConstantMember(destFunctionTableInitValueConstant, "&" + SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					if (sourceComSendProxy instanceof PeriodicComSendProxy) {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					} else {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					}
				}
			}
		}

		// COMプロキシのハンドラ関数テーブルのメンバと各メンバのID定数をソート
		Ordering<EObject> orderingBySymbolName = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__SYMBOL_NAME));
		Collections.sort(destFunctionTableIndexConstants, orderingBySymbolName);

		Ordering<EObject> orderingByConstantValue = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__VALUE));
		ECollections.sort(destFunctionTableInitValueConstant.getMember(), orderingByConstantValue);

		// ID定数にIDを割当
		int index = 0;
		for (Constant targetConstant : destFunctionTableIndexConstants) {
			targetConstant.setValue(String.valueOf(index));
			index++;
		}

		// 生成したID定数を論理区画に登録
		targetPartition.getComProxyFunctionTableIndexConstant().addAll(destFunctionTableIndexConstants);

		// テーブルサイズ定数を構築
		targetPartition.setComProxyFunctionTableSizeConstant(createComProxyFunctionTableSizeConstant(index));
	}

	private Constant createComProxyFunctionIndexConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, String symbolName) {
		Constant destIndexConstant = ModuleFactory.eINSTANCE.createConstant();
		destIndexConstant.setSingleSource(sourceDataInstanceInSwc);
		destIndexConstant.setSymbolName(symbolName);
		return destIndexConstant;
	}

	private void buildComProxyBuffer(Partition targetPartition, PVariableDataInstanceInSwc sourceDataInstanceInSwc, String symbol) throws ModelException {
		GlobalVariable destComProxyBufferVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destComProxyBufferVariable.setSymbolName(symbol);
		destComProxyBufferVariable.setType(this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType()));
		destComProxyBufferVariable.setHasStatic(false);
		destComProxyBufferVariable.setHasConst(false);
		destComProxyBufferVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) targetPartition.getSingleSource())));

		RteBufferVariableSet destComProxyBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destComProxyBuffer.setComplexVariable(destComProxyBufferVariable);
		targetPartition.getComProxyBufferVariableSet().add(destComProxyBuffer);
	}

	private Constant createComProxyFunctionTableSizeConstant(int tableSize) {
		Constant destFunctionTableSizeConstant = ModuleFactory.eINSTANCE.createConstant();
		destFunctionTableSizeConstant.setSymbolName(SymbolNames.COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT_NAME);
		destFunctionTableSizeConstant.setValue(String.valueOf(tableSize));
		return destFunctionTableSizeConstant;
	}

	private void addConstantMember(Constant targetConstant, String symbol) {
		ConstantMember member = ModuleFactory.eINSTANCE.createConstantMember();
		member.setValue(symbol);
		targetConstant.getMember().add(member);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(S/R)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrImplSymbols() throws ModelException {
		buildSrRteQueuedSendTrustedFunctionParamTypes();
		buildSrRteNonqueuedSendTrustedFunctionParamTypes();
		buildSrDataTypeImplConstants();
		buildSrRteBufferSymbols();
		buildSrFilterSymbols();
		buildSrTAckStatusVariableSymbols();
	}

	private void buildSrRteQueuedSendTrustedFunctionParamTypes() {
		Rte targetRte = this.context.cache.rte;

		Optional<TrustedFunctionRteSendImplementation> sourceImplementation = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION).AND(hasOp(SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS, true)));
		if (sourceImplementation.isPresent()) {
			RteQueuedSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createRteQueuedSendTrustedFunctionParamType();
			destType.setSymbolName(SymbolNames.RTE_QUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			targetRte.setSrRteQueuedSendTfParamType(destType);
			this.context.cache.rteQueuedSendTfParamType = Optional.of(destType);
		} else {
			this.context.cache.rteQueuedSendTfParamType = Optional.absent();
		}
	}

	private void buildSrRteNonqueuedSendTrustedFunctionParamTypes() {
		Rte targetRte = this.context.cache.rte;

		Optional<TrustedFunctionRteSendImplementation> sourceImplementation = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION).AND(hasOp(SEND_IMPLEMENTATION___IS_EVENT_SEMANTICS, false)));
		if (sourceImplementation.isPresent()) {
			RteNonqueuedSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createRteNonqueuedSendTrustedFunctionParamType();
			destType.setSymbolName(SymbolNames.RTE_NONQUEUED_SEND_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			targetRte.setSrRteNonqueuedSendTfParamType(destType);
			this.context.cache.rteNonqueuedSendTfParamType = Optional.of(destType);
		} else {
			this.context.cache.rteNonqueuedSendTfParamType = Optional.absent();
		}
	}

	private void buildSrDataTypeImplConstants() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					// 無効値定数の構築
					if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
						buildSrImplInvalidValueConstant(targetSwc, sourceDataInstanceInSwc);
					}

					// RTE実装向け初期値定数の構築
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getSrImplInitValueConstant().add(createSrImplInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
					}
				}
			}

			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					// 無効値定数の構築
					if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
						buildSrImplInvalidValueConstant(targetSwc, sourceDataInstanceInSwc);
					}

					// RTE実装向け初期値定数の構築
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getSrImplInitValueConstant().add(createSrImplInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
					}
				}
			}
		}
	}

	private Constant createSrImplInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createSrInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createSrImplInitValueConstantName(sourceDataInstanceInSwc), RoleNames.SR_IMPL_INIT_VALUE_ROLE_NAME);
	}

	private void buildSrImplInvalidValueConstant(Swc targetSwc, VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		ValueSpecification sourceInvalidValue = sourceDataInstanceInSwc.getInvalidValue();

		// 無効値定数の生成
		Constant destInvalidValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInvalidValueConstant.setSingleSource(sourceDataInstanceInSwc);
		destInvalidValueConstant.setRoleName(RoleNames.SR_INVALID_VALUE_ROLE_NAME);
		destInvalidValueConstant.setSymbolName(SymbolNames.createSrInvalidValueConstantName(sourceDataInstanceInSwc));
		destInvalidValueConstant.setType(type);
		destInvalidValueConstant.setValue(this.context.query.<String> get(sourceInvalidValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));

		this.localSymbolModelBuilder.buildConstantValueType(destInvalidValueConstant, sourceInvalidValue);
		targetSwc.getSrImplInvalidValueConstant().add(destInvalidValueConstant);
	}

	private void buildSrRteBufferSymbols() throws ModelException {
		for (RteValueBufferImplementation sourceValueBufferImplementation : this.context.query.<RteValueBufferImplementation> findByKind(RTE_VALUE_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceValueBufferImplementation.getOwnerPartition());

			InternalEcuReceiver receiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			if (receiver.getSource().getPrototype().isEventSemantics()) {
				Constant destMaxLengthConstant = createSrRteBufferQueueMaxLengthConstant(sourceValueBufferImplementation, receiver);
				this.context.cache.rte.getSrRteBufferQueueMaxLengthConstant().add(destMaxLengthConstant);

				RteBufferQueueType destQueueType = createSrRteBufferQueueType(sourceValueBufferImplementation, receiver, destMaxLengthConstant);
				this.context.cache.rte.getSrRteBufferQueueType().add(destQueueType);

				RteBufferQueuedVariable destQueuedVariable = createSrRteBufferQueuedVariable(sourceValueBufferImplementation, receiver, destQueueType);
				destQueuedVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
				targetPartition.getSrRteBufferQueuedVariable().add(destQueuedVariable);

			} else {
				buildSrRteBufferVariableSet(targetPartition, sourceValueBufferImplementation, receiver);
			}
		}

		// NOTE: 現状、型は個別箇所でソートをかける方針としているため、RteBufferQueueTypeはソート
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(TYPE__SYMBOL_NAME));
		ECollections.sort(this.context.cache.rte.getSrRteBufferQueueType(), ordering);
	}

	private void buildSrRteBufferVariableSet(Partition targetPartition, RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceReceiver.getSource().getPrototype().getImplementationDataType());

		// RTEバッファの初期値定数の構築
		Constant destInitValueConstant = createSrRteBufferInitValueConstant(sourceValueBufferImplementation, sourceReceiver, type);
		targetPartition.getSrRteBufferInitValueConstant().add(destInitValueConstant);

		// RTEバッファの構築
		targetPartition.getSrRteBufferVariableSet().add(createSrRteBufferVariableSet(sourceValueBufferImplementation, sourceReceiver, type, destInitValueConstant));
	}

	private RteBufferVariableSet createSrRteBufferVariableSet(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant)
			throws ModelException {
		boolean initAtDefinition = this.context.query.<Boolean> get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION);
	
		RteBufferVariableSet destRteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destRteBuffer.setSingleSource(sourceValueBufferImplementation);
		destRteBuffer.setSymbolName(SymbolNames.createSrRteBufferVariableName(sourceReceiver.getSource())); // NOTE C言語上には現れない仮想シンボルだが，ソートの都合上シンボル名を設定しておく
	
		GlobalVariable destValueVariable = createSrRteBufferValueVariable(sourceValueBufferImplementation, sourceReceiver, type, initValueConstant, initAtDefinition);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), sourceReceiver.getSource()));
		destRteBuffer.setValueVariable(destValueVariable);
		
		if (sourceValueBufferImplementation.getHasStatus()) {
			GlobalVariable destStatusVariable = createSrRteBufferStatusVariable(sourceValueBufferImplementation, sourceReceiver, initAtDefinition);
			destStatusVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition())));
			destRteBuffer.setStatusVariable(destStatusVariable);
		}
		
		if (!initValueConstant.getMember().isEmpty()) {
			GlobalVariable destInitValueVariable = createSrRteBufferInitValueVariable(sourceValueBufferImplementation, sourceReceiver, type, initValueConstant);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), sourceReceiver.getSource()));
			destInitValueVariable.setHasConst(true);
			destInitValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
			destRteBuffer.setInitValueVariable(destInitValueVariable);
		}
	
		return destRteBuffer;
	}

	private Constant createSrRteBufferInitValueConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type) throws ModelException {
		ValueSpecification sourceInitValue = this.context.query.get(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
	
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceValueBufferImplementation);
		destInitValueConstant.setSymbolName(SymbolNames.createSrRteBufferInitValueConstantName(receiver.getSource()));
		destInitValueConstant.setType(type);
	
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private GlobalVariable createSrRteBufferValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant,
			boolean initAtDefinition) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createSrRteBufferValueVariableName(sourceReceiver.getSource()));
		destValueVariable.setHasConst(false);
		destValueVariable.setHasStatic(false);
		destValueVariable.setType(type);
		destValueVariable.setInitValueConstant(initValueConstant);
		destValueVariable.setInitAtDefinition(initAtDefinition);
		return destValueVariable;
	}

	private GlobalVariable createSrRteBufferInitValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createSrRteBufferInitValueVariableName(sourceReceiver.getSource()));
		destValueVariable.setHasConst(false);
		destValueVariable.setHasStatic(false);
		destValueVariable.setType(type);
		destValueVariable.setInitValueConstant(initValueConstant);
		destValueVariable.setInitAtDefinition(true);
		return destValueVariable;
	}

	private GlobalVariable createSrRteBufferStatusVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, boolean initAtDefinition) {
		GlobalVariable destStatusVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destStatusVariable.setSymbolName(SymbolNames.createSrRteBufferStatusVariableName(sourceReceiver.getSource()));
		destStatusVariable.setHasConst(false);
		destStatusVariable.setHasStatic(false);
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		destStatusVariable.setInitAtDefinition(initAtDefinition);
		return destStatusVariable;
	}

	private RteBufferQueueType createSrRteBufferQueueType(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Constant maxLengthConstant)
			throws ModelException {
		RteBufferQueueType destQueueType = ModuleFactory.eINSTANCE.createRteBufferQueueType();
		destQueueType.setSingleSource(sourceValueBufferImplementation);
		destQueueType.setSymbolName(SymbolNames.createSrRteBufferQueueTypeName(sourceReceiver.getSource()));
		destQueueType.setElementType(this.context.builtQuery.findDestType(sourceReceiver.getSource().getPrototype().getImplementationDataType()));			
		destQueueType.setMaxLengthConstant(maxLengthConstant);
		return destQueueType;
	}

	private RteBufferQueuedVariable createSrRteBufferQueuedVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, RteBufferQueueType queueType)
			throws ModelException {
		RteBufferQueuedVariable destQueuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueuedVariable();
		destQueuedVariable.setSingleSource(sourceValueBufferImplementation);
		destQueuedVariable.setSymbolName(SymbolNames.createSrRteBufferQueuedVariableName(sourceReceiver.getSource()));
		destQueuedVariable.setType(queueType);
		destQueuedVariable.setHasConst(false);
		destQueuedVariable.setHasStatic(false);
	
		destQueuedVariable.setInitAtDefinition(this.context.query.<Boolean> get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION));
		return destQueuedVariable;
	}

	private Constant createSrRteBufferQueueMaxLengthConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) {
		RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		Constant destMaxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		destMaxLengthConstant.setSymbolName(SymbolNames.createSrRteBufferQueueMaxLengthConstantName(receiver.getSource()));
		destMaxLengthConstant.setType(this.context.cache.uint32Type);
		destMaxLengthConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getQueueLength()));
		destMaxLengthConstant.setSingleSource(sourceValueBufferImplementation);
		return destMaxLengthConstant;
	}

	private void buildSrFilterSymbols() throws ModelException {
		// フィルタ定数の構築
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
		
			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (sourceDataInstanceInSwc.isFilterEnabled()) {
						buildSrFilterConstant(targetSwc, sourceDataInstanceInSwc);
					}
				}
			}
		}
	
		// フィルタ変数の構築
		for (FilterBufferImplementation sourceFilterBufferImplementation : this.context.query.<FilterBufferImplementation> findByKind(FILTER_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceFilterBufferImplementation.getOwnerPartition());
			buildSrFilterVariable(targetPartition, sourceFilterBufferImplementation);
		}
	}
	
	private void buildSrTAckStatusVariableSymbols() throws ModelException {
		for (TAckStatusVariableImplementation sourceImplementation : this.context.query.<TAckStatusVariableImplementation> findByKind(TACK_STATUS_VARIABLE_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceImplementation.getOwnerPartition());

			TAckStatus tAckStatus = createSrTAckStatus(sourceImplementation);
			GlobalVariable statusVariable = createStatusVariable(sourceImplementation);

			targetPartition.getTAckStatus().add(tAckStatus);
			tAckStatus.setStatusVariable(statusVariable);
		}
	}

	private void buildSrFilterConstant(Swc targetSwc, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		switch (sourceDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			targetSwc.getSrFilterConstant().add(createSrFilterMaskConstant(sourceDataInstanceInSwc));
			break;
		}
		case MASKED_NEW_DIFFERS_X:
		case MASKED_NEW_EQUALS_X: {
			targetSwc.getSrFilterConstant().add(createSrFilterMaskConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterXConstant(sourceDataInstanceInSwc));
			break;
		}
		case NEW_IS_OUTSIDE:
		case NEW_IS_WITHIN: {
			targetSwc.getSrFilterConstant().add(createSrFilterMinConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterMaxConstant(sourceDataInstanceInSwc));
			break;
		}
		case ONE_EVERY_N: {
			targetSwc.getSrFilterConstant().add(createSrFilterPeriodConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterOffsetConstant(sourceDataInstanceInSwc));
			break;
		}
		case ALWAYS:
		case NEVER:
		default:
			break;
		}
	}

	private Constant createSrFilterMaskConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MASK_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMaskConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMask()));
		return destConstant;
	}

	private Constant createSrFilterXConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_X_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterXConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getX()));
		return destConstant;
	}

	private Constant createSrFilterMinConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MIN_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMinConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMin()));
		return destConstant;
	}

	private Constant createSrFilterMaxConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MAX_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMaxConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMax()));
		return destConstant;
	}

	private Constant createSrFilterPeriodConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstanceInSwc.getFilter().getPeriod());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_PERIOD_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterPeriodConstantName(sourceDataInstanceInSwc));
		destConstant.setType(type);
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getPeriod()));
		return destConstant;
	}

	private Constant createSrFilterOffsetConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstanceInSwc.getFilter().getPeriod());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_OFFSET_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterOffsetConstantName(sourceDataInstanceInSwc));
		destConstant.setType(type);
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getOffset()));
		return destConstant;
	}

	private void buildSrFilterVariable(Partition targetPartition, FilterBufferImplementation sourceFilterBufferImplementation) throws ModelException {
		InternalEcuReceiver sourceReceiver = sourceFilterBufferImplementation.getParent().getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
	
		// フィルタバッファの生成
		if (this.context.query.get(sourceDataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC)) {
			// フィルタ過去値バッファの生成
			PrimitiveType type = this.context.builtQuery.findDestPrimitiveType(sourceDataInstance.getImplementationDataType());
	
			GlobalVariable destFilterVariable = createSrFilterOldValueVariable(sourceFilterBufferImplementation, sourceReceiver, type);
			targetPartition.getSrFilterOldValueVariable().add(destFilterVariable);
		} else {
			// フィルタ回数バッファの生成
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstance.getFilter().getPeriod());
	
			Constant destFilterOccurrenceInitValue = createSrFilterOccurrenceInitValueConstant(sourceFilterBufferImplementation, sourceReceiver, sourceDataInstance, type);
			targetPartition.getSrFilterConstant().add(destFilterOccurrenceInitValue);
	
			GlobalVariable destFilterVariable = createSrFilterOccurrenceVariable(sourceFilterBufferImplementation, sourceReceiver, type, destFilterOccurrenceInitValue);
			targetPartition.getSrFilterOccurrenceVariable().add(destFilterVariable);
		}
	}

	private Constant createSrFilterOccurrenceInitValueConstant(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver,
			RVariableDataInstanceInSwc sourceDataInstanceInSwc, PrimitiveType type) {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceFilterBufferImplementation);
		destConstant.setSymbolName(SymbolNames.createSrFilterOccurrenceInitValueConstantName(sourceReceiver.getSource()));
		destConstant.setType(type);
		destConstant.setValue("0");
		return destConstant;
	}

	private GlobalVariable createSrFilterOccurrenceVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver, PrimitiveType type,
			Constant filterOccurrenceInitValue) {
		GlobalVariable destFilterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destFilterVariable.setSingleSource(sourceFilterBufferImplementation);
		destFilterVariable.setSymbolName(SymbolNames.createSrFilterOccurrenceVariableName(sourceReceiver.getSource()));
		destFilterVariable.setType(type);
		destFilterVariable.setInitValueConstant(filterOccurrenceInitValue);
		destFilterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		destFilterVariable.setHasStatic(false);
		destFilterVariable.setHasConst(false);
		return destFilterVariable;
	}

	private GlobalVariable createSrFilterOldValueVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver, PrimitiveType type) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceFilterBufferImplementation.getParent().getValueBufferImplementation());
	
		GlobalVariable destFilterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destFilterVariable.setSymbolName(SymbolNames.createSrFilterOldValueVariableName(sourceReceiver.getSource()));
		destFilterVariable.setType(type);
		destFilterVariable.setSingleSource(sourceFilterBufferImplementation);
		destFilterVariable.setInitValueConstant(initValueConstant);
		destFilterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		destFilterVariable.setHasStatic(false);
		destFilterVariable.setHasConst(false);
		return destFilterVariable;
	}

	private TAckStatus createSrTAckStatus(TAckStatusVariableImplementation sourceImplementation) throws ModelException {
		TAckStatus tAckStatus = ModuleFactory.eINSTANCE.createTAckStatus();
		tAckStatus.setSingleSource(sourceImplementation);
		return tAckStatus;
	}

	private GlobalVariable createStatusVariable(TAckStatusVariableImplementation sourceImplementation) {
		GlobalVariable destVariable = createGlobalVariable(SymbolNames.RTE_E_TRANSMIT_ACK_CONSTANT_NAME, this.context.cache.stdReturnType, this.context.cache.rteTransimitAckConstant, false);
		destVariable.setSingleSource(sourceImplementation);
		destVariable.setSymbolName(SymbolNames.createTAckStatusVariableName(sourceImplementation.getParent().getSource().getPrototype()));
		destVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceImplementation.getOwnerPartition())));
		return destVariable;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(C/S)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCsImplSymbols() throws ModelException {
		// ポート定義引数定数の構築
		buildCsPortDefinedValueConstants();

		// 信頼関数経由コールに使用するシンボルの構築
		buildCsSymbolsForCsTrustedFunction();
	}

	private void buildCsPortDefinedValueConstants() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
		
			Swc targetSwc = optionalSwc.get();
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				if (!sourcePortPrototype.getPortApiOption().isEmpty()) {
					PortApiOption sourcePortApiOption = sourcePortPrototype.getPortApiOption().get(0);
					buildCsPortArgValueConstants(targetSwc, sourcePortApiOption);
				}
			}
		}
	}
	
	private void buildCsPortArgValueConstants(Swc targetSwc, PortApiOption sourcePortApiOption) throws ModelException {
		int i = 0;
		for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : sourcePortApiOption.getPortArgValue()) {
			Constant destPortArgValueConstant = createCsPortArgValueConstant(sourcePortDefinedArgumentValue, i);
			if (destPortArgValueConstant.getMember().isEmpty()) { // COVERAGE 常にtrue(モデル違反で事前チェックしているため，未カバレッジで問題ない)
				targetSwc.getCsPortArgValueConstant().add(destPortArgValueConstant);
			}
			i++;
		}
	}

	private Constant createCsPortArgValueConstant(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourcePortDefinedArgumentValue.getValueType());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourcePortDefinedArgumentValue);
		destConstant.setSymbolName(SymbolNames.createCsPortArgValueConstantName(sourcePortDefinedArgumentValue, index));
		destConstant.setType(type);
		this.localSymbolModelBuilder.buildConstantValue(destConstant, sourcePortDefinedArgumentValue.getValue(), type);
		return destConstant;
	}

	private void buildCsSymbolsForCsTrustedFunction() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
			Partition targetPartition = targetSwc.getParent();
			
			boolean isCsTfParamTypeCreated = false;
			int idx = 0;
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Swc clientSwc = targetSwc;
						Swc serverSwc = getPSwc(sourceOperationInstanceInSwc);
						if (serverSwc == null)
							continue;

						EcucPartition sourceClientEcucPartition = (EcucPartition)clientSwc.getParent().getSingleSource();
						EcucPartition sourceServerEcucPartition = (EcucPartition)serverSwc.getParent().getSingleSource();
						 // COVERAGE (ecucPartitionがnullのときはpEcucPartitionもnullであるためカバレッジがパスしない．コードレビューで問題ないことを確認)
						if (sourceClientEcucPartition == null || sourceServerEcucPartition == null) 
							continue;

						if (!sourceClientEcucPartition.isTrusted() && sourceServerEcucPartition.isTrusted()) {
							// 送信：非信頼、受信：信頼の場合、信頼関数使用
							// C/Sコール用信頼関数引数型を構築
							if (!isCsTfParamTypeCreated) {
								CsTrustedFunctionParamType destCsTrustedFunctionParamType = createCsTrustedFunctionParamType(sourceSwComponentType);
								this.context.cache.rte.getCsTfParamType().add(destCsTrustedFunctionParamType);
								isCsTfParamTypeCreated = true;
							}
							
							// C/Sコール用信頼関数で使用するオペレーションの識別IDを構築
							Constant destOpidConstant = createCsTfOpidConstant(sourceOperationInstanceInSwc, idx);
							targetPartition.getCsTfOpidConstant().add(destOpidConstant);
						}
					}
					idx++;
				}
			}
		}

		// NOTE: 現状、型は個別箇所でソートをかける方針としているため、CsTrustedFunctionParamTypeはソート
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(TYPE__SYMBOL_NAME));
		ECollections.sort(this.context.cache.rte.getCsTfParamType(), ordering);
	}

	private Constant createCsTfOpidConstant(ROperationInstanceInSwc soureOperationInstanceInSwc, int opid) {
		Constant destOpidConstant = ModuleFactory.eINSTANCE.createConstant();
		destOpidConstant.setSymbolName(SymbolNames.createCsTfOpidConstantName(soureOperationInstanceInSwc));
		destOpidConstant.setValue(String.valueOf(opid) + "U");
		return destOpidConstant;
	}

	private CsTrustedFunctionParamType createCsTrustedFunctionParamType(AtomicSwComponentType sourceSwComponentType) {
		CsTrustedFunctionParamType destParamType = ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType();
		destParamType.setSymbolName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceSwComponentType));
		return destParamType;
	}

	private Swc getPSwc(ROperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return null;
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		SwComponentType swType = providedOperationInstanceInSwc.getOwnerAtomicSwc();
		return this.context.builtQuery.findDest(SWC, swType);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(モード)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildModeImplSymbols() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();
			buildModeMachineInstances(targetBswm, sourceBswModuleDescription);
		}
	}

	private void buildModeMachineInstances(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			BswModeSenderPolicy sourceBswModeSenderPolicy = findBswModeSenderPolicyByModePrototype(sourceBehavior, sourceProvidedModeGroup);

			// モードマシンインスタンスの配置先を決定
			// NOTE パーティション内連携のみをサポートするため、配置先パーティションは1つに決まる
			Collection<EcucPartition> sourceUsingEcucPartitions = this.context.query.get(sourceProvidedModeGroup, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE);
			EcucPartition sourceUsingEcucPartition = Iterables.getFirst(sourceUsingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceUsingEcucPartition);
			PartedBswm targetPartedBswm = targetBswm.getSinglePartedBswm(targetPartition);

			// モードマシンインスタンスの必要性を判定
			if (!isUsedPrototype(sourceProvidedModeGroup, targetPartedBswm)) {
				continue;
			}
			if (sourceBswModeSenderPolicy == null) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// BswModeSenderPolicyがあることはvalidationで保証
				continue;
			}
			
			// モードマシンインスタンスを構築
			buildModeMachineInstance(targetPartedBswm, sourceBswModuleDescription, sourceProvidedModeGroup, sourceBswModeSenderPolicy, Optional.fromNullable(sourceUsingEcucPartition));
		}
	}

	private boolean isUsedPrototype(ModeDeclarationGroupPrototype prototype, PartedBswm partedBswm) {
		for (BswSchedulableEntity bswSchedulableEntity : partedBswm.getDependentBswSchedulableEntity()) {
			jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity sourceEntity = (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) bswSchedulableEntity.getSingleSource();
			if (sourceEntity.getManagedModeGroup().contains(prototype)) {
				return true;
			}
		}
		return false;
	}

	private BswModeSenderPolicy findBswModeSenderPolicyByModePrototype(BswInternalBehavior behavior, ModeDeclarationGroupPrototype modePrototype) {
		for (BswModeSenderPolicy bswModeSenderPolicy : behavior.getModeSenderPolicy()) {
			if (bswModeSenderPolicy.getProvidedModeGroup() == modePrototype) {
				return bswModeSenderPolicy;
			}
		}
	
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// BswModeSenderPolicyがあることはvalidationで保証
		return null;
	}

	private void buildModeMachineInstance(PartedBswm targetPartedBswm, BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModePrototype,
			BswModeSenderPolicy sourceSenderPolicy, Optional<EcucPartition> sourcePartition) throws ModelException {
		Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswModuleDescription);
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceModePrototype.getType());

		ModeMachineInstance destModeMachineInstance = ModuleFactory.eINSTANCE.createModeMachineInstance();
		destModeMachineInstance.setSingleSource(sourceModePrototype);

		// モード切替要求キューの構築
		ModeQueueType destModeQueueType = createModeQueueType(sourceBswModuleDescription, sourceModePrototype, sourceSenderPolicy, modeDeclarationGroup.getImplementationDataType());
		destModeMachineInstance.setRequestModeQueueType(destModeQueueType);

		ModeQueuedVariable destModeQueuedVariable = createModeQueueVariable(sourceBswModuleDescription, sourceModePrototype, destModeQueueType);
		destModeQueuedVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setRequestModeQueue(destModeQueuedVariable);

		// 現在モード変数の構築
		GlobalVariable destCurrentModeVariable = createCurrentModeVariable(sourceBswModuleDescription, sourceModePrototype, modeDeclarationGroup.getImplementationDataType());
		destCurrentModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setCurrentModeVariable(destCurrentModeVariable);
		
		// 次モード変数の構築
		GlobalVariable destNextModeVariable = createNextModeVariable(sourceBswModuleDescription, sourceModePrototype, modeDeclarationGroup.getImplementationDataType());
		destNextModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setNextModeVariable(destNextModeVariable);
	
		// 初期モードへの参照を追加
		destModeMachineInstance.setInitModeConstant(modeDeclarationGroup.getInitModeConstant());

		// 論理区画に登録
		targetPartedBswm.getModeMachineInstance().add(destModeMachineInstance);
	}

	private ModeQueueType createModeQueueType(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, BswModeSenderPolicy sourceSenderPolicy, Type type) {
		Constant destMaxLengthConstant = createModeQueueMaxLengthConstant(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype, sourceSenderPolicy);

		ModeQueueType destModeQueueType = ModuleFactory.eINSTANCE.createModeQueueType();
		destModeQueueType.setSymbolName(SymbolNames.createModeQueueTypeName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		destModeQueueType.setElementType(type);
		destModeQueueType.setMaxLengthConstant(destMaxLengthConstant);
		return destModeQueueType;
	}

	private Constant createModeQueueMaxLengthConstant(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype,
			BswModeSenderPolicy sourceBswModeSenderPolicy) {
		Constant destMaxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		destMaxLengthConstant.setSymbolName(SymbolNames.createModeMaxLengthConstantName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		destMaxLengthConstant.setType(this.context.cache.uint32Type);
		destMaxLengthConstant.setValue(sourceBswModeSenderPolicy.getQueueLength().toString());
		return destMaxLengthConstant;
	}

	private ModeQueuedVariable createModeQueueVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, ModeQueueType modeQueueType) {
		ModeQueuedVariable destModeQueuedVariable = ModuleFactory.eINSTANCE.createModeQueuedVariable();
		destModeQueuedVariable.setType(modeQueueType);
		destModeQueuedVariable.setHasStatic(false);
		destModeQueuedVariable.setSymbolName(SymbolNames.createSchmModeQueueVariableName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		return destModeQueuedVariable;
	}

	private GlobalVariable createCurrentModeVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype soureModePrototype, Type type) {
		GlobalVariable destCurrentVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destCurrentVariable.setType(type);
		destCurrentVariable.setHasStatic(false);
		destCurrentVariable.setSymbolName(SymbolNames.createSchmCurrentModeName(sourceBswModuleDescription, soureModePrototype));
		return destCurrentVariable;
	}

	private GlobalVariable createNextModeVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModePrototype, Type type) {
		GlobalVariable destNextVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destNextVariable.setType(type);
		destNextVariable.setHasStatic(false);
		destNextVariable.setSymbolName(SymbolNames.createSchmNextModeName(sourceBswModuleDescription, sourceModePrototype));
		return destNextVariable;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(IRV)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildIrvImplSymbols() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
			Partition targetPartition = targetSwc.getParent();
			Optional<EcucPartition> sourcePartition = Optional.fromNullable((EcucPartition) targetPartition.getSingleSource());

			// IRVの初期値
			for (VariableDataPrototype sourceDataPrototype : sourceSwComponentType.getInternalBehavior().getExplicitInterRunnableVariable()) {
				Constant destInitValueConstant = createIrvBufferInitValueConstant(sourceSwComponentType, sourceDataPrototype);
				targetSwc.getIrvBufferInitValueConstant().add(destInitValueConstant);
				targetSwc.getIrvBufferVariableSet().add(createIrvBuffer(sourceSwComponentType, sourceDataPrototype, destInitValueConstant, sourcePartition));
			}
		}
	}

	private Constant createIrvBufferInitValueConstant(AtomicSwComponentType sourceSwComponentType, VariableDataPrototype sourceDataPrototype) throws ModelException {
		Type type = this.context.builtQuery.findDestType((ImplementationDataType)sourceDataPrototype.getType());
		ValueSpecification sourceInitValue = sourceDataPrototype.getInitValue();
	
		// 初期値定数の生成
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceDataPrototype);
		destInitValueConstant.setSymbolName(SymbolNames.createRteIrvBufferInitValueConstantName(sourceSwComponentType, sourceDataPrototype));
		destInitValueConstant.setType(type);
	
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private RteBufferVariableSet createIrvBuffer(AtomicSwComponentType sourceSwComponentType, VariableDataPrototype sourceDataPrototype, Constant initValueConstant,
			Optional<EcucPartition> sourcePartition) throws ModelException {
		boolean initAtDefinition = this.context.query.<Boolean> get(sourceDataPrototype, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE);

		RteBufferVariableSet destIrvBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destIrvBuffer.setSingleSource(sourceDataPrototype);
		destIrvBuffer.setSymbolName(SymbolNames.createRteIrvBufferVariableName(sourceSwComponentType, sourceDataPrototype)); // NOTE C言語上には現れない仮想シンボルだが，ソートの都合上シンボル名を設定しておく
	
		Type type = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		GlobalVariable destValueVariable = createGlobalVariable(SymbolNames.createRteIrvBufferValueVariableName(sourceSwComponentType, sourceDataPrototype), type, initValueConstant, initAtDefinition);
		destValueVariable.setSingleSource(sourceDataPrototype);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataPrototype));
		destIrvBuffer.setValueVariable(destValueVariable);
		
		if (!initValueConstant.getMember().isEmpty()) {
			GlobalVariable destInitValueVariable = createGlobalVariable(SymbolNames.createRteIrvBufferInitValueVariableName(sourceSwComponentType, sourceDataPrototype), type, initValueConstant, true);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataPrototype));
			destInitValueVariable.setHasConst(true);
			destInitValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
			destIrvBuffer.setInitValueVariable(destInitValueVariable);
		}
	
		return destIrvBuffer;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(エンティティ動作)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildEntityStartImplSymbols() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			EcucPartition sourceEcucPartition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceEcucPartition);
	
			Optional<OsTaskActivateEntityStarter> sourceOsTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> sourceOsEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
	
			if (sourceOsTaskActivateEntityStarter.isPresent()) {
				// ランナブル起動についてのグローバル変数，および定数を生成
				buildEntityStartImplSymbols(targetPartition, sourceOsTaskActivateEntityStarter.get(), sourceOsTask, Optional.<OsEvent> absent());
	
			} else if (!sourceOsEventSetEntityStarters.isEmpty()) {
				// ランナブル起動についてのグローバル変数，および定数を生成
				for (OsEventSetEntityStarter sourceEntityStarter : sourceOsEventSetEntityStarters) {
					buildEntityStartImplSymbols(targetPartition, sourceEntityStarter, sourceOsTask, Optional.fromNullable(sourceEntityStarter.getSourceOsEvent()));
				}
			}
		}
	}

	private void buildEntityStartImplSymbols(Partition targetPartition, EntityStarter sourceEntityStarter, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent) {
		// 周期調整カウンタ変数の構築
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());
	
			targetPartition.getEntityStartConstant().add(createEntityCycleMaxConstant(sourceEntityStarter.getCycleCounterImplementation(), sourceOsTask, sourceOsEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityCycleCounterVariable(sourceEntityStarter.getCycleCounterImplementation(), sourceOsTask, sourceOsEvent, type));
		}

		// 開始オフセット調整カウンタ変数の構築
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());
	
			targetPartition.getEntityStartConstant().add(createEntityStartOffsetMaxConstant(sourceEntityStarter.getStartOffsetCounterImplementation(), sourceOsTask, sourceOsEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityStartOffsetCounterVariable(sourceEntityStarter.getStartOffsetCounterImplementation(), sourceOsTask, sourceOsEvent, type));
		}

		// 周期調整・開始オフセット調整用の定数の構築
		for (EntityStartInteraction sourceStartInteraction : sourceEntityStarter.getStartInteraction()) {
			if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE 常にtrue(現状，EntityStartImplementationはTimingTriggeringEntityStartImplementationのみのため)
				TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
	
				if (timingTriggeringEntityStartImplementation.requiresCycleAdjust()) {
					PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());
	
					targetPartition.getEntityStartConstant().add(
							createEntityCyclePeriodConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
					targetPartition.getEntityStartConstant().add(
							createEntityCycleOffsetConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
				}
	
				if (timingTriggeringEntityStartImplementation.requiresStartOffsetAdjust()) {
					PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());
	
					targetPartition.getEntityStartConstant().add(
							createEntityStartOffsetConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
				}
			}
		}
	}

	private Constant createEntityStartOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destStartOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		destStartOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		destStartOffsetConstant.setRoleName(RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME);
		destStartOffsetConstant.setSymbolName(SymbolNames.createEntityStartOffsetConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getStartOnEvent()));
		destStartOffsetConstant.setType(type);
		destStartOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getStartOffset()));
		return destStartOffsetConstant;
	}

	private Constant createEntityCycleOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destCycleOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		destCycleOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		destCycleOffsetConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME);
		destCycleOffsetConstant.setSymbolName(SymbolNames.createEntityCycleOffsetConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getStartOnEvent()));
		destCycleOffsetConstant.setType(type);
		destCycleOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCycleOffset()));
		return destCycleOffsetConstant;
	}

	private Constant createEntityCyclePeriodConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destCyclePeriodConstant = ModuleFactory.eINSTANCE.createConstant();
		destCyclePeriodConstant.setSingleSource(sourceEntityStartImplementation);
		destCyclePeriodConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME);
		destCyclePeriodConstant.setSymbolName(SymbolNames.createEntityCyclePeriodConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getStartOnEvent()));
		destCyclePeriodConstant.setType(type);
		destCyclePeriodConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCyclePeriod()));
		return destCyclePeriodConstant;
	}

	private GlobalVariable createEntityStartOffsetCounterVariable(StartOffsetCounterImplementation sourceCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		GlobalVariable destStartOffsetCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destStartOffsetCounterVariable.setSingleSource(sourceCounterImplementation);
		destStartOffsetCounterVariable.setSymbolName(SymbolNames.createEntityStartOffsetCounterName(sourceOsTask, sourceOsEvent));
		destStartOffsetCounterVariable.setType(type);
		destStartOffsetCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		destStartOffsetCounterVariable.setHasStatic(false);
		destStartOffsetCounterVariable.setHasConst(false);
		return destStartOffsetCounterVariable;
	}

	private Constant createEntityStartOffsetMaxConstant(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		Constant destStartOffsetMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		destStartOffsetMaxConstant.setSingleSource(sourceStartOffsetCounterImplementation);
		destStartOffsetMaxConstant.setSymbolName(SymbolNames.createEntityMaxStartOffsetConstantName(sourceOsTask, sourceOsEvent));
		destStartOffsetMaxConstant.setType(type);
		destStartOffsetMaxConstant.setValue(String.valueOf(sourceStartOffsetCounterImplementation.getMaxCount()));
		return destStartOffsetMaxConstant;
	}

	private GlobalVariable createEntityCycleCounterVariable(CycleCounterImplementation sourceCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		GlobalVariable destCycleCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destCycleCounterVariable.setSingleSource(sourceCounterImplementation);
		destCycleCounterVariable.setSymbolName(SymbolNames.createEntityCycleCounterName(sourceOsTask, sourceOsEvent));
		destCycleCounterVariable.setType(type);
		destCycleCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		destCycleCounterVariable.setHasStatic(false);
		destCycleCounterVariable.setHasConst(false);
		return destCycleCounterVariable;
	}

	private Constant createEntityCycleMaxConstant(CycleCounterImplementation sourceCycleCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		Constant destCycleMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		destCycleMaxConstant.setSingleSource(sourceCycleCounterImplementation);
		destCycleMaxConstant.setSymbolName(SymbolNames.createEntityMaxCycleConstantName(sourceOsTask, sourceOsEvent));
		destCycleMaxConstant.setType(type);
		destCycleMaxConstant.setValue(String.valueOf(sourceCycleCounterImplementation.getMaxCount()));
		return destCycleMaxConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(S/R)用のユーティリティ
	//-------------------------------------------------------------------------------------------------------------------------------------
	private Constant createSrInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc, String symbolName, String roleName) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		ValueSpecification sourceInitValue;
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) {
			sourceInitValue = sourceInitValueInSwc;
		} else {
			sourceInitValue = this.context.query.get(sourceDataInstanceInSwc.getInstance().get(0), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		}

		// 初期値定数の生成
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceDataInstanceInSwc);
		destInitValueConstant.setRoleName(roleName);
		destInitValueConstant.setSymbolName(symbolName);
		destInitValueConstant.setType(type);

		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル全般用のユーティリティ
	//-------------------------------------------------------------------------------------------------------------------------------------
	private GlobalVariable createGlobalVariable(String symbol, Type type, Constant initValueConstant, boolean initAtDefinition) {
		GlobalVariable destVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destVariable.setSymbolName(symbol);
		destVariable.setType(type);
		destVariable.setInitValueConstant(initValueConstant);
		destVariable.setInitAtDefinition(initAtDefinition);
		destVariable.setHasStatic(false);
		destVariable.setHasConst(false);
		return destVariable;
	}
}
