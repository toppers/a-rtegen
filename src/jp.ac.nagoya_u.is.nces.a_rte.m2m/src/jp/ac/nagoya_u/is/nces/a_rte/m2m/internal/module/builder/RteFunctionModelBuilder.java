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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION__OS_APP_ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__OWNER_APPLICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_GENERAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODE_SWITCH_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_AND_TX_ERR_CALLBACK__EXTERNALECURECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_TOUT_CALLBACK__EXTERNALECURECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INV_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_TOUT_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXECUTION_CONTEXT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CALL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_START_OPERATION__START_EXECUTABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FEEDBACK_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INVALIDATE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__OS_TASK_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__OS_TASK_PRIORITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_MODE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_SWITCH_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC__DEPENDENT_RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TACK_STATUS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventPoolingImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InfiniteloopImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OneShootImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.*;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Ordering;

/**
 * RTEの関数のモデルを構築する。
 */
public class RteFunctionModelBuilder {

	final ModuleModelBuildContext context;

	private final MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;
	private final ExcludeOperationModelBuilder excludeOperationBuilder;
	private final EntityOperationModelBuilder entityOperationBuilder;
	private final SenderReceiverOperationModelBuilder srOperationBuilder;
	private final IrvOperationModelBuilder irvOperationBuilder;
	private final ComProxyOperationModelBuilder comProxyOperationModelBuilder;
	private final InitializeOperationModelBuilder initOperationBuilder;
	final ModuleRules moduleRules;

	public RteFunctionModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
		this.entityOperationBuilder = new EntityOperationModelBuilder(context);
		this.srOperationBuilder = new SenderReceiverOperationModelBuilder(context);
		this.irvOperationBuilder = new IrvOperationModelBuilder(context);
		this.comProxyOperationModelBuilder = new ComProxyOperationModelBuilder(context);
		this.initOperationBuilder = new InitializeOperationModelBuilder(context);
		this.moduleRules = new ModuleRules(context);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 関数のシンボルモデル(API)を構築する。
	 * NOTE ここでいうAPIはアプリケーション向けのもののみであり、ライフサイクルAPIは内部実装用の扱いであることに注意。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildApiFunctions() throws ModelException {
		buildDependentExecutableEntities();

		if (this.context.options.doesGenerateRte) {
			buildRteApis();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmApis();
		}
	}

	private void buildRteApis() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = swc.get();

			// 提供側APIの構築
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					
					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC)) {
						WriteApi destWriteApi = createWriteApi(sourceDataInstanceInSwc);
						// インライン化
						destWriteApi.setIsInline(this.moduleRules.usesInlineSrProvidedApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destWriteApi);
					}

					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC)) {
						InvalidateApi destInvalidateApi = createInvalidateApi(sourceDataInstanceInSwc);
						// インライン化
						destInvalidateApi.setIsInline(this.moduleRules.usesInlineSrProvidedApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destInvalidateApi);
					}
					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC)) {
						SendApi destSendApi = createSendApi(sourceDataInstanceInSwc);
						// Rte_Sendはインライン化しない
						destSendApi.setIsInline(false);
						targetSwc.getRteApi().add(destSendApi);
					}
					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_FEEDBACK_API__PVARIABLEDATAINSTANCEINSWC)) {
						FeedbackApi destFeedbackApi = createFeedbackApi(sourceDataInstanceInSwc);
						// インライン化
						destFeedbackApi.setIsInline(this.moduleRules.usesInlineFeedbackApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destFeedbackApi);
					}
				}
			}
			
			// 要求側APIの構築
			CsTrustedFunction destCsTrustedFunction = null;

			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC)) {
						ReadApi destReadApi = createReadApi(sourceDataInstanceInSwc);
						// インライン化
						destReadApi.setIsInline(this.moduleRules.usesInlineSrRequiredApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destReadApi);
					}
					if (this.context.query.get(sourceDataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC)) {
						ReceiveApi destReceiveApi = createReceiveApi(sourceDataInstanceInSwc);
						// Rte_Receiveはインライン化しない
						destReceiveApi.setIsInline(false);
						targetSwc.getRteApi().add(destReceiveApi);
					}
				}

				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Optional<AtomicSwComponentType> sourceServerSwComponentType = tryGetPAtomicSwComponent(sourceOperationInstanceInSwc);

						CallApi destCallApi = null;
						if (sourceServerSwComponentType.isPresent()) {
							Swc clientSwc = targetSwc;
							Swc serverSwc = this.context.builtQuery.findDest(SWC, sourceServerSwComponentType.get());

							EcucPartition sourceClientEcucPartition = (EcucPartition)clientSwc.getParent().getSingleSource();
							EcucPartition sourceServerEcucPartition = (EcucPartition)serverSwc.getParent().getSingleSource();

							 // COVERAGE (ecucPartitionがnullのときはpEcucPartitionもnullであるためカバレッジがパスしない．コードレビューで問題ないことを確認)
							if (sourceClientEcucPartition != null && sourceServerEcucPartition != null
									&& !sourceClientEcucPartition.isTrusted() && sourceServerEcucPartition.isTrusted()) {
								// 送信：非信頼、受信：信頼の場合、信頼関数使用
								// 信頼関数構築
								Partition targetPartition = serverSwc.getParent();
								EcucPartition sourcePartition = (EcucPartition) targetPartition.getSingleSource();

								if (destCsTrustedFunction == null) {
									destCsTrustedFunction = createCsTrustedFunction(sourceSwComponentType, sourcePartition);
									destCsTrustedFunction.setCallerOsApplicationName(sourceClientEcucPartition.getImplOsApplication().get(0).getShortName());
									targetPartition.getCsTrustedFunction().add(destCsTrustedFunction);

									buildInternalPartOfCsTrustedFunction(destCsTrustedFunction);
								}

								CsTfCalledRunnable destCsTfCalledRunnable = createCsTfCalledRunnable(sourceOperationInstanceInSwc);
								destCsTrustedFunction.getCsTfCalledRunnable().add(destCsTfCalledRunnable);

								// C/S信頼関数用引数数定数を構築
								Constant destArgcConstant = createCsTfArgcConstant(sourceOperationInstanceInSwc, destCsTfCalledRunnable.getStartOperation().getStartServerRunnable().getRoleParam().size());
								targetPartition.getCsTfArgcConstant().add(destArgcConstant);
								
								destCallApi = createTfCallApi(sourceOperationInstanceInSwc);
							} else {
								destCallApi = createCallApi(sourceOperationInstanceInSwc);
							}

							// インライン化
							destCallApi.setIsInline(this.moduleRules.usesInlineCsApi(sourceClientEcucPartition, sourceServerEcucPartition, sourceOperationInstanceInSwc));
						} else {
							// 未接続の場合
							destCallApi = createCallApi(sourceOperationInstanceInSwc);
							destCallApi.setIsInline(this.moduleRules.usesInlineCsApi(sourceOperationInstanceInSwc));
						}
						targetSwc.getRteApi().add(destCallApi);
					}
				}
			}

			// 排他エリアAPIの構築
			for (ExclusiveArea sourceExclusiveArea : sourceSwComponentType.getInternalBehavior().getExclusiveArea()) {
				if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA)) {
					RteEnterApi destRteEnterApi = createRteEnterApi(sourceExclusiveArea);
					destRteEnterApi.setIsInline(this.moduleRules.usesInlineExcludeApi());
					targetSwc.getRteApi().add(destRteEnterApi);

					RteExitApi destRteExitApi = createRteExitApi(sourceExclusiveArea);
					destRteExitApi.setIsInline(this.moduleRules.usesInlineExcludeApi());
					targetSwc.getRteApi().add(destRteExitApi);
				}
			}

			// IRV APIの構築
			for (RunnableEntity sourceRunnableEntity : sourceSwComponentType.getInternalBehavior().getRunnable()) {
				for (VariableDataPrototype sourceDataPrototype : getUniqueVariableDataPrototype(sourceRunnableEntity.getWrittenLocalVariable())) {
					IrvWriteApi destIrvWriteApi = createIrvWriteApi(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype);
					// インライン化
					destIrvWriteApi.setIsInline(this.moduleRules.usesInlineIrvApi());
					targetSwc.getRteApi().add(destIrvWriteApi);
				}
				for (VariableDataPrototype sourceDataPrototype : getUniqueVariableDataPrototype(sourceRunnableEntity.getReadLocalVariable())) {
					IrvReadApi destIrvReadApi = createIrvReadApi(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype);
					// インライン化
					destIrvReadApi.setIsInline(this.moduleRules.usesInlineIrvApi());
					targetSwc.getRteApi().add(destIrvReadApi);
				}
			}

			// メモリマッピングを構築
			for (RteApi targetApi : targetSwc.getRteApi()) {
				EcucPartition sourcePartition = (EcucPartition) targetSwc.getParent().getSingleSource();
				targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
			}
		}
	}

	private Set<VariableDataPrototype> getUniqueVariableDataPrototype(List<VariableAccess> accesses) {
		Set<VariableDataPrototype> prototypes = new HashSet<VariableDataPrototype>();
		for (VariableAccess variableAccess : accesses) {
			prototypes.add(variableAccess.getAccessedVariable().getLocalVariable());
		}
		return prototypes;
	}
	
	private Optional<AtomicSwComponentType> tryGetPAtomicSwComponent(ROperationInstanceInSwc operationInstanceInSwc) {
		Optional<POperationInstanceInSwc> providedOperationInstanceInSwc = tryGetConnectedPOperationInstanceInSwc(operationInstanceInSwc);
		if (!providedOperationInstanceInSwc.isPresent()) {
			return Optional.absent();
		}
		
		return Optional.of(providedOperationInstanceInSwc.get().getOwnerAtomicSwc());
	}

	private Optional<POperationInstanceInSwc> tryGetConnectedPOperationInstanceInSwc(ROperationInstanceInSwc operationInstanceInSwc) {
		if (operationInstanceInSwc.getInstance().isEmpty()) {
			return Optional.absent();
		}
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return Optional.absent();
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		return Optional.of((POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype());
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(S/R)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private WriteApi createWriteApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		WriteApi destApi = ModuleFactory.eINSTANCE.createWriteApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createWriteApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createWriteApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// パラメタの設定
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		Parameter destDataParam = this.localSymbolModelBuilder.createSrInDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}

	private InvalidateApi createInvalidateApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		InvalidateApi destApi = ModuleFactory.eINSTANCE.createInvalidateApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createInvalidateApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createInvalidateApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		return destApi;
	}

	private ReadApi createReadApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReadApi destApi = ModuleFactory.eINSTANCE.createReadApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createReadApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createReadApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		
		Parameter destDataParam = this.localSymbolModelBuilder.createSrOutDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}

	private SendApi createSendApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		SendApi destApi = ModuleFactory.eINSTANCE.createSendApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createSendApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createSendApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);
	
		// パラメタの設定
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		Parameter destDataParam = this.localSymbolModelBuilder.createSrInDataParam(paramType);
		destApi.getParam().add(destDataParam);
		destApi.setDataParam(destDataParam);
		
		return destApi;
	}

	private ReceiveApi createReceiveApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReceiveApi destApi = ModuleFactory.eINSTANCE.createReceiveApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createReceiveApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createReceiveApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		Parameter destDataParam = this.localSymbolModelBuilder.createSrOutDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}
	
	private FeedbackApi createFeedbackApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		FeedbackApi destApi = ModuleFactory.eINSTANCE.createFeedbackApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createFeedbackApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createFeedbackApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(C/S)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private CallApi createCallApi(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		CallApi destApi = ModuleFactory.eINSTANCE.createCallApi();
		destApi.setSingleSource(sourceOperationInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// パラメタの設定
		destApi.getOperationParam().addAll(this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc));
		destApi.getParam().addAll(destApi.getOperationParam());
		
		return destApi;
	}

	private TfCallApi createTfCallApi(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		TfCallApi destApi = ModuleFactory.eINSTANCE.createTfCallApi();
		destApi.setSingleSource(sourceOperationInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);
	
		destApi.getOperationParam().addAll(this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc));
		destApi.getParam().addAll(destApi.getOperationParam());
	
		// 内部構造の構築
		destApi.setCsTfParamTypeName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceOperationInstanceInSwc.getOwnerAtomicSwc()));
		destApi.setCsTfArgcConstantName(SymbolNames.createCsTfArgcConstantName(sourceOperationInstanceInSwc));
		destApi.setCsTfOpidConstantName(SymbolNames.createCsTfOpidConstantName(sourceOperationInstanceInSwc));
		destApi.setCsTfName(Identifiers.createCsCallTfName(sourceOperationInstanceInSwc.getOwnerAtomicSwc()));
		
		boolean needsCheckArg = false;
		for (Parameter param : destApi.getParam()) {
			Type type = param.getType();
			
			 // COVERAGE (8パターン中4パターンしか通りようがない．コードレビューで問題ないことを確認)
			if ((type instanceof ArrayType) || (type instanceof StructType) || (type instanceof UnionType) || (type instanceof PointerType)) {
				needsCheckArg = true;
				break;
			}
		}
		destApi.setNeedsCheckArg(needsCheckArg);
		
		return destApi;
	}

	private CsTrustedFunction createCsTrustedFunction(AtomicSwComponentType sourceSwComponentType, EcucPartition sourcePartition) {
		CsTrustedFunction destCsTrustedFunction = ModuleFactory.eINSTANCE.createCsTrustedFunction();
		buildTrustedFunctionSignature(destCsTrustedFunction);
		destCsTrustedFunction.setSymbolName(SymbolNames.createCsCallTfName(sourceSwComponentType));
		destCsTrustedFunction.setCsTfParamTypeName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceSwComponentType));
		destCsTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
		return destCsTrustedFunction;
	}

	private void buildInternalPartOfCsTrustedFunction(CsTrustedFunction targetCsTrustedFunction) {
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetCsTrustedFunction.getLocalVariable().add(returnValueVariable);
		targetCsTrustedFunction.setDataVariable(returnValueVariable);
	}

	private CsTfCalledRunnable createCsTfCalledRunnable(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition sourceRequiredOperationInstanceInComposition = sourceOperationInstanceInSwc.getInstance().get(0);
		OperationInstanceInComposition sourceProvidedOperationInstanceInComposition = sourceRequiredOperationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc sourceProvidedOperationInstanceInSwc = (POperationInstanceInSwc) sourceProvidedOperationInstanceInComposition.getPrototype();

		CsTfCalledRunnable destCsTfCalledRunnable = ModuleFactory.eINSTANCE.createCsTfCalledRunnable();
		destCsTfCalledRunnable.setCsTfOpidConstantName(SymbolNames.createCsTfOpidConstantName(sourceOperationInstanceInSwc));
		destCsTfCalledRunnable.setStartOperation(this.entityOperationBuilder.createServerRunnableStartOperation(sourceProvidedOperationInstanceInSwc));
		return destCsTfCalledRunnable;
	}

	private Constant createCsTfArgcConstant(ROperationInstanceInSwc sourceOperationInstanceInSwc, int runnableParamCount) {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSymbolName(SymbolNames.createCsTfArgcConstantName(sourceOperationInstanceInSwc));
		if (runnableParamCount > 0) {
			destConstant.setValue(String.valueOf(runnableParamCount) + "U");
		} else {
			// NOTE: 配列長が0になるのを避ける
			destConstant.setValue("1U");
		}
		return destConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(IRV)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private IrvWriteApi createIrvWriteApi(AtomicSwComponentType sourceSwComponentType, RunnableEntity sourceRunnableEntity, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvWriteApi destApi = ModuleFactory.eINSTANCE.createIrvWriteApi();
		destApi.setSingleSource(sourceDataPrototype);
		destApi.setSymbolName(SymbolNames.createRteIrvWriteApiImplName(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype));
		destApi.setApiMappingName(SymbolNames.createRteIrvWriteApiName(sourceRunnableEntity, sourceDataPrototype));

		Type paramType = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		Parameter dataParam = this.localSymbolModelBuilder.createIrvInDataParam(paramType);
		destApi.getParam().add(dataParam);
		destApi.setDataParam(dataParam);
		destApi.setReturnType(this.context.cache.voidType);
		return destApi;
	}

	private IrvReadApi createIrvReadApi(AtomicSwComponentType sourceSwComponentType, RunnableEntity sourceRunnableEntity, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvReadApi destApi = ModuleFactory.eINSTANCE.createIrvReadApi();
		destApi.setSingleSource(sourceDataPrototype);
		destApi.setSymbolName(SymbolNames.createRteIrvReadApiImplName(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype));
		destApi.setApiMappingName(SymbolNames.createRteIrvReadApiName(sourceRunnableEntity, sourceDataPrototype));

		Type paramType = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		if (paramType instanceof PrimitiveType) {
			destApi.setReturnType(paramType);
		} else {
			destApi.setReturnType(this.context.cache.voidType);

			Parameter dataParam = this.localSymbolModelBuilder.createIrvOutDataParam(paramType);
			destApi.getParam().add(dataParam);
			destApi.setDataParam(dataParam);
		}
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(排他制御)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private RteEnterApi createRteEnterApi(ExclusiveArea sourceExclusiveArea) {
		RteEnterApi destApi = ModuleFactory.eINSTANCE.createRteEnterApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createRteEnterApiImplName(sourceExclusiveArea));
		destApi.setApiMappingName(SymbolNames.createRteEnterApiName(sourceExclusiveArea));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsNoneExclude(false);
		return destApi;
	}

	private RteExitApi createRteExitApi(ExclusiveArea sourceExclusiveArea) {
		RteExitApi destApi = ModuleFactory.eINSTANCE.createRteExitApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createRteExitApiImplName(sourceExclusiveArea));
		destApi.setApiMappingName(SymbolNames.createRteExitApiName(sourceExclusiveArea));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsNoneExclude(false);
		return destApi;
	}

	private void buildSchmApis() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
	
			Bswm targetBswm = optionalTargetBswm.get();
	
			// 排他エリア関連のAPI構築(SchM_Enter/Exit)
			buildSchmApisForExclusiveArea(targetBswm, sourceBswModuleDescription);
	
			// モード関連のAPI構築(Schm_Switch/Mode/Init)
			buildSchmApisForMode(targetBswm, sourceBswModuleDescription);
	
			// メモリマッピングを構築
			for (PartedBswm targetPartedBswm : targetBswm.getPartedBswm()) {
				for (SchmApi targetApi : targetPartedBswm.getSchmApi()) {
					EcucPartition sourcePartition = (EcucPartition) targetPartedBswm.getParent().getSingleSource();
					targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				}
			}
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(排他制御)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmApisForExclusiveArea(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceEnableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (ExclusiveArea sourceExclusiveArea : sourceEnableInternalBehavior.getExclusiveArea()) {
			// Enter/Exit APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateExclusiveAreaSymbol(targetBswm, sourceExclusiveArea);

			// Enter/Exit APIを構築
			if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA)) {
				targetPartedBswm.getSchmApi().add(createSchmEnterApi(sourceBswModuleDescription, sourceExclusiveArea));
				targetPartedBswm.getSchmApi().add(createSchmExitApi(sourceBswModuleDescription, sourceExclusiveArea));
			}
		}
	}

	private PartedBswm getPartedBswmToLocateExclusiveAreaSymbol(Bswm bswm, ExclusiveArea exclusiveArea) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(exclusiveArea, EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition partition = this.context.builtQuery.findDestPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private SchmEnterApi createSchmEnterApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmEnterApi destApi = ModuleFactory.eINSTANCE.createSchmEnterApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createSchmEnterApiName(sourceExclusiveArea, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsInline(false);
		return destApi;
	}

	private SchmExitApi createSchmExitApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmExitApi destApi = ModuleFactory.eINSTANCE.createSchmExitApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createSchmExitApiName(sourceExclusiveArea, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsInline(false);
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(モード)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmApisForMode(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceEnableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		// 提供側
		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			// Switch/Mode APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceProvidedModeGroup);

			// Switch/Mode APIを構築
			if (providesSchmSwitchApi(sourceProvidedModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmSwitchApi(sourceBswModuleDescription, sourceProvidedModeGroup));
			}
			if (providesSchmModeApi(sourceProvidedModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceProvidedModeGroup));
			}
		}

		// 要求側
		for (ModeDeclarationGroupPrototype sourceRequiredModeGroup : sourceBswModuleDescription.getRequiredModeGroup()) {
			// Mode APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceRequiredModeGroup);

			if (providesSchmModeApi(sourceRequiredModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceRequiredModeGroup));
			}
		}
	}

	private PartedBswm getPartedBswmToLocateModeSymbol(Bswm bswm, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(modePrototype, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition partition = this.context.builtQuery.findDestPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private boolean providesSchmSwitchApi(ModeDeclarationGroupPrototype providedModeGroup, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity sourceEntity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (sourceEntity.getManagedModeGroup().contains(providedModeGroup)) {
				return true;
			}
		}
		return false;
	}

	private boolean providesSchmModeApi(ModeDeclarationGroupPrototype modePrototype, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity sourceEntity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (sourceEntity.getAccessedModeGroup().contains(modePrototype)) {
				return true;
			}
		}
		return false;
	}

	private SchmSwitchApi createSchmSwitchApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceProvidedModeGroup) throws ModelException {
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.findDest(MODE_DECLARATION_GROUP, sourceProvidedModeGroup.getType());

		SchmSwitchApi destApi = ModuleFactory.eINSTANCE.createSchmSwitchApi();
		destApi.setSingleSource(sourceProvidedModeGroup);
		destApi.setSymbolName(SymbolNames.createSchmSwitchApiName(sourceProvidedModeGroup, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.stdReturnType);
		destApi.getParam().add(this.localSymbolModelBuilder.createModeParam(sourceProvidedModeGroup, modeDeclarationGroup.getImplementationDataType()));
		destApi.setIsInline(false);
		return destApi;
	}

	private SchmModeApi createSchmModeApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeUserModePrototype) throws ModelException {
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.findDest(MODE_DECLARATION_GROUP, sourceModeUserModePrototype.getType());

		SchmModeApi destApi = ModuleFactory.eINSTANCE.createSchmModeApi();
		destApi.setSingleSource(sourceModeUserModePrototype);
		destApi.setSymbolName(SymbolNames.createSchmModeApiName(sourceModeUserModePrototype, sourceBswModuleDescription));
		destApi.setIsInline(false);
		destApi.setReturnType(modeDeclarationGroup.getImplementationDataType());
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(エンティティ動作)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildDependentExecutableEntities() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> foundSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!foundSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
	
			Swc targetSwc = foundSwc.get();
	
			for (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity : sourceSwComponentType.getInternalBehavior().getRunnable()) {
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity destRunnableEntity = createRunnableEntity(sourceRunnableEntity);
				destRunnableEntity.setMemoryMapping(this.memmapBuilder.buildRunnableEntityMemoryMapping(targetSwc, sourceRunnableEntity));
				targetSwc.getDependentRunnableEntity().add(destRunnableEntity);
			}
		}
	
		// NOTE BSWスケジューラブルはLogicalCompartmentModelBuilderで構築済みなので, メモリマップの割り当てと戻り値型の設定のみ行う.
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			for (jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity targetBswSchedulableEntity : targetPartedBswm.getDependentBswSchedulableEntity()) {
				targetBswSchedulableEntity.setReturnType(this.context.cache.voidType);
				targetBswSchedulableEntity.setMemoryMapping(this.memmapBuilder.buildBswSchedulableEntityMemoryMapping(targetPartedBswm, (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)targetBswSchedulableEntity.getSingleSource()));
			}
		}
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity createRunnableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity) throws ModelException {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity destEntity = ModuleFactory.eINSTANCE.createRunnableEntity();
		destEntity.setSingleSource(sourceRunnableEntity);

		RteEvent sourceRteEvent = sourceRunnableEntity.getEvent().isEmpty() ? null : sourceRunnableEntity.getEvent().get(0);
		destEntity.setSymbolName(sourceRunnableEntity.getSymbol());
		if (sourceRteEvent instanceof OperationInvokedEvent) {
			// オペレーション呼出イベントの場合
			OperationInvokedEvent sourceOperationInvokedEvent = (OperationInvokedEvent) sourceRteEvent;
			POperationInstanceInSwc sourceOperationInstanceInSwc = sourceOperationInvokedEvent.getOperation();

			// 戻り値型の構築
			boolean hasReturnValue = !sourceOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty();
			destEntity.setReturnType(hasReturnValue ? this.context.cache.stdReturnType : this.context.cache.voidType);
			destEntity.setHasReturnValue(hasReturnValue);

			// ロール引数の構築
			List<Parameter> portArgParams = this.localSymbolModelBuilder.createCsPortArgValueParams(sourceOperationInstanceInSwc);
			List<Parameter> operationParams = this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc);
			destEntity.getRoleParam().addAll(operationParams);
			destEntity.getParam().addAll(portArgParams);
			destEntity.getParam().addAll(operationParams);
		} else {
			// それ以外のRTEイベントの場合
			destEntity.setReturnType(this.context.cache.voidType);
		}

		return destEntity;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 関数のシンボルモデル(内部実装用)とシンボル内部構造モデル(内部実装用)を構築する。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildImplFunctionsAndInternals() throws ModelException {
		buildEntityStartImplFunctions();

		if (this.context.options.doesGenerateRte) {
			buildComAccessImplFunctionsAndInternals();
			buildSrImplFunctionsAndInternals();
			buildRteLifecycleImplFunctions();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmLifecycleImplFunctionsAndInternals();
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(S/R)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrImplFunctionsAndInternals() throws ModelException {
		buildSrRteSendTrustedFunctions();
	}

	// RTEバッファ送信用の信頼関数を構築
	private void buildSrRteSendTrustedFunctions() throws ModelException {
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			EcucPartition sourcePartition = sourceSendImplementation.getWriteOsTrustedFunction().getParent().getOsAppEcucPartition();
			InternalEcuSender sender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
			PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sender.getSource().getPrototype();
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);
	
			// Write/Send用信頼関数を構築
			TrustedFunction destWriteTrustedFunction = null;
			if (sourceDataInstanceInSwc.isEventSemantics()) {
				destWriteTrustedFunction = createRteBufferSendTrustedFunction(sourceSendImplementation);
			} else {
				destWriteTrustedFunction = createRteBufferWriteTrustedFunction(sourceSendImplementation);
			}
			destWriteTrustedFunction.setCallerOsApplicationName(sender.getOwnerPartition().getImplOsApplication().get(0).getShortName());
			destWriteTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
			targetPartition.getRteBufferSendTrustedFunction().add(destWriteTrustedFunction);
	
			// Invalidate用信頼巻数を構築
			if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
				RteBufferInvalidateTrustedFunction destInvalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sourceSendImplementation);
				destInvalidateTrustedFunction.setCallerOsApplicationName(sender.getOwnerPartition().getImplOsApplication().get(0).getShortName());
				destInvalidateTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
				targetPartition.getRteBufferSendTrustedFunction().add(destInvalidateTrustedFunction);
			}
		}
	}

	private RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
	
		// 信頼関数の構築
		RteBufferInvalidateTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createRteBufferInvalidateTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setSymbolName(sourceSendImplementation.getInvalidateOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getInvalidateOsTrustedFunction().getShortName());

		// 内部構造
		// ローカル変数の構築
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destTrustedFunction.getLocalVariable().add(destFilterResultVariable);
	
		// 送信処理の構築
		RteBufferNonqueuedSendOperation destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateTrustedFunction(sourceSendInteraction, destFilterResultVariable);
		destTrustedFunction.setOperation(destOperation);
	
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destTrustedFunction);
		return destTrustedFunction;
	}

	private RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourcePDataInstanceInSwc = sourceSender.getSource().getPrototype();
	
		// 信頼関数の構築
		RteBufferWriteTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createRteBufferWriteTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setSymbolName(sourceSendImplementation.getWriteOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getWriteOsTrustedFunction().getShortName());

		// 内部構造
		// ローカル変数の構築
		LocalVariable destDataVariable = this.localSymbolModelBuilder.createSrDataVariable(sourcePDataInstanceInSwc, SymbolNames.SR_DATA_VAR_NAME);
		destTrustedFunction.getLocalVariable().add(destDataVariable);
	
		destTrustedFunction.setDataVariable(destDataVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destTrustedFunction.getLocalVariable().add(destFilterResultVariable);
	
		// 送信処理の構築
		RteBufferNonqueuedSendOperation destSendOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, destDataVariable, destFilterResultVariable);
		destTrustedFunction.setOperation(destSendOperation);
	
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destTrustedFunction);
		return destTrustedFunction;
	}

	private RteBufferSendTrustedFunction createRteBufferSendTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourcePDataInstanceInSwc = sourceSender.getSource().getPrototype();
	
		// 信頼関数の構築
		RteBufferSendTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createRteBufferSendTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setSymbolName(sourceSendImplementation.getWriteOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getWriteOsTrustedFunction().getShortName());

		// 内部構造
		// ローカル変数の構築
		LocalVariable destDataVariable = this.localSymbolModelBuilder.createSrDataVariable(sourcePDataInstanceInSwc, SymbolNames.SR_DATA_VAR_NAME);
		destTrustedFunction.getLocalVariable().add(destDataVariable);
	
		destTrustedFunction.setDataVariable(destDataVariable);
	
		// 送信処理の構築
		RteBufferQueuedSendOperation destSendOperation = this.srOperationBuilder.createRteBufferQueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, destDataVariable);
		destTrustedFunction.setOperation(destSendOperation);
	
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destTrustedFunction);
		return destTrustedFunction;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(エンティティ動作)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildEntityStartImplFunctions() throws ModelException {
		buildExecutableTaskBodies();
	}

	private void buildExecutableTaskBodies() throws ModelException {
		for (ExecutionContext sourceAndTargetExecutionContext : this.context.query.<ExecutionContext> findByKind(EXECUTION_CONTEXT)) {
			OsTask sourceOsTask = sourceAndTargetExecutionContext.getSourceOsTask();
			List<EcucPartition> sourcePartitions = this.context.query.collect(sourceOsTask, OS_TASK__OWNER_APPLICATION, OS_APPLICATION__OS_APP_ECUC_PARTITION);
			EcucPartition sourcePartition = Iterables.getFirst(sourcePartitions, null);
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);


			if (sourceAndTargetExecutionContext.getExecutionContextImplementation() instanceof InfiniteloopImplementation) {
				// リアルバックグラウンドOSタスクで動作するタスクホディの構築
				OsBackgroundTaskActivationExecutableTaskBody destTaskBody = createOsBackgroundTaskActivationExecutableTaskBody(sourceOsTask);
				destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(destTaskBody);
			} else if (sourceAndTargetExecutionContext.getExecutionContextImplementation() instanceof OneShootImplementation) {
				// タスク起動契機で動作するタスクホディの構築
				OsTaskActivationExecutableTaskBody destTaskBody = createOsTaskActivationExecutableTaskBody(sourceOsTask);
				destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(destTaskBody);
			} else if (sourceAndTargetExecutionContext.getExecutionContextImplementation() instanceof EventPoolingImplementation) { // COVERAGE 常にtrue(現状，Infiniteloop/OneShoot/EventPooling以外のパターンが存在しないため)
				// OSイベント設定契機で動作するタスクボディの構築
				OsEventSetExecutableTaskBody destTaskBody = createOsEventSetExecutableTaskBody(sourceOsTask);
				destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(destTaskBody);
			}
		}
	}

	private OsBackgroundTaskActivationExecutableTaskBody createOsBackgroundTaskActivationExecutableTaskBody(OsTask sourceOsTask) throws ModelException {
		OsTaskActivateEntityStarter sourceOsTaskActivateEntityStarter = this.context.query.findSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

		// シンボル
		OsBackgroundTaskActivationExecutableTaskBody destTaskBody = ModuleFactory.eINSTANCE.createOsBackgroundTaskActivationExecutableTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		destTaskBody.setReturnType(this.context.cache.voidType);
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());

		// 内部構造
		// エンティティ起動処理を構築
		destTaskBody.setOperation(this.entityOperationBuilder.createOsTaskActivationOperation(sourceOsTaskActivateEntityStarter, sourceOsTask));
		return destTaskBody;
	}

	private OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody(OsTask sourceOsTask) throws ModelException {
		OsTaskActivateEntityStarter sourceOsTaskActivateEntityStarter = this.context.query.findSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

		// シンボル
		OsTaskActivationExecutableTaskBody destTaskBody = ModuleFactory.eINSTANCE.createOsTaskActivationExecutableTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		destTaskBody.setReturnType(this.context.cache.voidType);
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());

		// 内部構造
		// エンティティ起動処理を構築
		destTaskBody.setOperation(this.entityOperationBuilder.createOsTaskActivationOperation(sourceOsTaskActivateEntityStarter, sourceOsTask));
		return destTaskBody;
	}

	private OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody(OsTask sourceOsTask) throws ModelException {
		List<OsEventSetEntityStarter> sourceOsEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

		// シンボル
		OsEventSetExecutableTaskBody destTaskBody = ModuleFactory.eINSTANCE.createOsEventSetExecutableTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		destTaskBody.setReturnType(this.context.cache.voidType);
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());
		destTaskBody.getOsEventId().addAll(this.context.query.<String> collect(sourceOsEventSetEntityStarters, OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT, ECUC_REFERRABLE__SHORT_NAME));

		// 内部構造
		if (sourceOsEventSetEntityStarters.size() > 1) {
			// EntityStarterが複数ある場合は、識別が必要なため、そのための内部構造を構築
			destTaskBody.setChecksOsEventId(true);
	
			// OSイベントIDのチェック用変数を構築
			LocalVariable destEventVariable = this.localSymbolModelBuilder.createEntityEventVariable();
			destTaskBody.getLocalVariable().add(destEventVariable);
	
			destTaskBody.setEventVariable(destEventVariable);
		}
	
		destTaskBody.getOperation().addAll(this.entityOperationBuilder.createOsEventSetActivationOperations(sourceOsEventSetEntityStarters, sourceOsTask));
		return destTaskBody;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(COMアクセス)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildComAccessImplFunctionsAndInternals() throws ModelException {
		buildComAccessWrapperFunctions();
		buildComSendTrustedFunctions(this.context.cache.rte);
		buildComProxyFunctions();
		buildComSendProxyEntities(this.context.cache.rte);
		buildComCallbacks(this.context.cache.rte);
	}

	private void buildComAccessWrapperFunctions() throws ModelException {
		// COMアクセスラッパ関数の生成有無を判定
		// S/Rで使用されているCOMシグナルグループが存在すれば生成する
		boolean requiresSendFunction = false;
		boolean requiresReceiveFunction = false;

		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			ImplementationDataType sourceType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
			if (sourceType.isComplexType()) { // COVERAGE 常にtrue(現状，ComSingnalGroupでPrimitiveTypeとなるパターンが存在しないため)
				VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInCompositions.get(0).getPrototype();
				if (sourceDataInstanceInSwc instanceof PVariableDataInstanceInSwc) {
					requiresSendFunction = true;
				} else {
					requiresReceiveFunction = true;
				}
			}
		}

		// COMアクセスラッパ関数の構築
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;

		// COM送信ラッパ関数の構築
		if (requiresSendFunction) {
			ComSignalApiWrapper destSendFunction = createComSendSignalGroupWrapperFunction(sourcePartition);
			targetPartition.getComSignalApiWrapper().add(destSendFunction);
		}

		// COM受信ラッパ関数の構築
		if (requiresReceiveFunction) {
			ComSignalApiWrapper destReceiveFunction = createComReceiveSignalGroupWrapperFunction(sourcePartition);
			targetPartition.getComSignalApiWrapper().add(destReceiveFunction);
		}
	
		// メモリマッピングを構築
		for (ComSignalApiWrapper targetFunction : targetPartition.getComSignalApiWrapper()) {
			targetFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(sourcePartition));
		}
	}

	private ComSignalApiWrapper createComSendSignalGroupWrapperFunction(Optional<EcucPartition> sourcePartition) {
		// 関数シンボルの構築
		ComSendSignalApiWrapper destFunction = ModuleFactory.eINSTANCE.createComSendSignalApiWrapper();
	
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSymbolName(SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition));
		} else {
			destFunction.setSymbolName(SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
		}
		destFunction.setReturnType(this.context.cache.stdReturnType);
	
		// パラメタの構築
		Parameter destMetaParam = ModuleFactory.eINSTANCE.createParameter();
		destMetaParam.setSymbolName(SymbolNames.COM_META_COMPLEX_DATA_PARAM_NAME);
		destMetaParam.setType(this.context.cache.comMetaDataType);
		destMetaParam.setHasConst(true);
		destMetaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		destFunction.getParam().add(destMetaParam);
	
		Parameter destDataParam = ModuleFactory.eINSTANCE.createParameter();
		destDataParam.setSymbolName(SymbolNames.SR_DATA_PARAM_NAME);
		destDataParam.setType(this.context.cache.uint8Type);
		destDataParam.setHasConst(true);
		destFunction.getParam().add(destDataParam);

		// 内部構造の構築
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSignalSymbolName(SymbolNames.COM_UPDATE_SHADOW_SIGNAL_API_NAME);			
		} else {
			destFunction.setSignalSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
		}
		destFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_GROUP_API_NAME);

		return destFunction;
	}

	private ComSignalApiWrapper createComReceiveSignalGroupWrapperFunction(Optional<EcucPartition> sourcePartition) {
		// 関数シンボルの構築
		ComReceiveSignalApiWrapper destFunction = ModuleFactory.eINSTANCE.createComReceiveSignalApiWrapper();
	
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withShadowSignal(sourcePartition));
		} else {
			destFunction.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withoutShadowSignal(sourcePartition));
		}
		destFunction.setReturnType(this.context.cache.stdReturnType);
	
		// パラメタの構築
		Parameter destMetaParam = ModuleFactory.eINSTANCE.createParameter();
		destMetaParam.setSymbolName(SymbolNames.COM_META_COMPLEX_DATA_PARAM_NAME);
		destMetaParam.setType(this.context.cache.comMetaDataType);
		destMetaParam.setHasConst(true);
		destMetaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		destFunction.getParam().add(destMetaParam);
	
		Parameter destDataParam = ModuleFactory.eINSTANCE.createParameter();
		destDataParam.setSymbolName(SymbolNames.SR_DATA_PARAM_NAME);
		destDataParam.setType(this.context.cache.uint8Type);
		destFunction.getParam().add(destDataParam);

		// 内部構造の構築
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSignalSymbolName(SymbolNames.COM_RECEIVE_SHADOW_SIGNAL_API_NAME);			
		} else {
			destFunction.setSignalSymbolName(SymbolNames.CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME);
		}
		destFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_RECEIVE_SIGNAL_GROUP_API_NAME);

		return destFunction;
	}

	private boolean requiresToUseShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}

	// COM送信用の信頼関数を構築
	private void buildComSendTrustedFunctions(Rte targetRte) throws ModelException {
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignal = this.context.query.tryFindSingle(ref(COM_SEND_IMPLEMENTATION__COM_SIGNAL, sourceComSignal).AND(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION)));
			if (sourceComSendImplForComSignal.isPresent()) {
				buildComSendSignalTrustedFunction(targetRte, sourceComSendImplForComSignal.get());
			}
		}
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignalGroup = this.context.query.tryFindSingle(ref(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP, sourceComSignalGroup).AND(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION)));
			if (sourceComSendImplForComSignalGroup.isPresent()) {
				buildComSendSignalGroupTrustedFunction(targetRte, sourceComSendImplForComSignalGroup.get());
			}
		}
	}

	private void buildComSendSignalTrustedFunction(Rte targetRte, TrustedFunctionComSendImplementation sourceSendImplementation) throws ModelException {
		EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE 信頼関数を使用する場合には必ずマスタパーティションが存在するため、存在チェックは行わない
		EcucPartition sourceCallerPartition = sourceSendImplementation.getParent().getSender().get(0).getOwnerPartition();
		ComSendSignalTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation.getComSignal());
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setCallerOsApplicationName(sourceCallerPartition.getImplOsApplication().get(0).getShortName());
		destTrustedFunction.setSymbolName(sourceSendImplementation.getOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getOsTrustedFunction().getShortName());
		destTrustedFunction.setIsGroup(false);
		targetRte.getComSendSignalTrustedFunction().add(destTrustedFunction);
		destTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceMasterBswPartition)));
		
		// 内部構造の構築
		LocalVariable destTfParamVariable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
		destTrustedFunction.getLocalVariable().add(destTfParamVariable);
		
		// 送信処理の構築
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourcePDataInstanceInSwc = sourceSender.getSource().getPrototype();
		LocalVariable destDataVariable = this.localSymbolModelBuilder.createSrDataVariable(sourcePDataInstanceInSwc, SymbolNames.SR_DATA_VAR_NAME);
		destTrustedFunction.setSendValueType(destDataVariable.getType());
		DirectComSendOperation destSendOperation = this.srOperationBuilder.createDirectComSendOperationForComTrustedFunction(sourceSendImplementation);
		destTrustedFunction.setOperation(destSendOperation);
		destTrustedFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
	}

	private void buildComSendSignalGroupTrustedFunction(Rte targetRte, TrustedFunctionComSendImplementation sourceSendImplementation) throws ModelException {
		Optional<EcucPartition> optionalSourceMasterBswPartition = this.context.cache.sourceMasterBswPartition;
		EcucPartition sourceMasterBswPartition = optionalSourceMasterBswPartition.get(); // NOTE 信頼関数を使用する場合には必ずマスタパーティションが存在するため、存在チェックは行わない
		EcucPartition sourceCallerPartition = sourceSendImplementation.getParent().getSender().get(0).getOwnerPartition();

		ComSendSignalTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation.getComSignalGroup());
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setCallerOsApplicationName(sourceCallerPartition.getImplOsApplication().get(0).getShortName());
		destTrustedFunction.setSymbolName(sourceSendImplementation.getOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getOsTrustedFunction().getShortName());
		destTrustedFunction.setIsGroup(true);
		targetRte.getComSendSignalTrustedFunction().add(destTrustedFunction);
		
		destTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceMasterBswPartition)));

		// 内部構造の構築
		LocalVariable destTfParamVariable = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
		destTrustedFunction.getLocalVariable().add(destTfParamVariable);
		
		// 送信処理の構築
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourcePDataInstanceInSwc = sourceSender.getSource().getPrototype();
		LocalVariable destDataVariable = this.localSymbolModelBuilder.createSrDataVariable(sourcePDataInstanceInSwc, SymbolNames.SR_DATA_VAR_NAME);
		destTrustedFunction.setSendValueType(destDataVariable.getType());
		DirectComSendOperation destSendOperation = this.srOperationBuilder.createDirectComSendOperationForComTrustedFunction(sourceSendImplementation);
		destTrustedFunction.setOperation(destSendOperation);
		destTrustedFunction.setSignalGroupSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(optionalSourceMasterBswPartition));
	}

	private void buildComProxyFunctions() throws ModelException {
		// Rte_SrWriteProxy作成
		if (isPeriodicProxyComSendImplementationExists() || isImmediateProxyComSendImplementationExists()) {
			for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
				Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
				if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					continue;
				}

				// 送信側APIの構築
				for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
					for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
						Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
						buildComProxyFunctionsForComSignalGroup(sourceDataInstanceInSwc, type);
						buildComProxyFunctionsForComSignal(sourceDataInstanceInSwc, type);
					}
				}
			}
		}
	}

	private boolean isPeriodicProxyComSendImplementationExists() {
		Optional<PeriodicProxyComSendImplementation> impl = this.context.query.tryFindSingleByKind(PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);
		return impl.isPresent();
	}

	private boolean isImmediateProxyComSendImplementationExists() {
		Optional<ImmediateProxyComSendImplementation> impl = this.context.query.tryFindSingleByKind(IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);
		return impl.isPresent();
	}

	private void buildComProxyFunctionsForComSignalGroup(PVariableDataInstanceInSwc sourceDataInstanceInSwc, Type type) throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			for (VariableDataInstanceInComposition sourceDataInComposition : sourceDataInstanceInCompositions) {
				if (sourceDataInComposition.getPrototype() == sourceDataInstanceInSwc) {
					buildComProxyFunctionEach(sourceDataInstanceInSwc, sourceComSignalGroup, type, sourceComSignalGroup.transfersImmediately());
				}
			}
		}
	}

	private void buildComProxyFunctionsForComSignal(PVariableDataInstanceInSwc sourceDataInstanceInSwc, Type type) throws ModelException {
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			for (VariableDataInstanceInComposition sourceDataInComposition : sourceDataInstanceInCompositions) {
				if (sourceDataInComposition.getPrototype() == sourceDataInstanceInSwc) {
					buildComProxyFunctionEach(sourceDataInstanceInSwc, sourceComSignal, type, sourceComSignal.transfersImmediately());
				}
			}
		}
	}

	private void buildComProxyFunctionEach(PVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucContainer sourceComSignalOrComSignalGroup, Type type, boolean immediate) throws ModelException {
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;
	
		ComProxyFunction destProxyFunction = ModuleFactory.eINSTANCE.createComProxyFunction();
		destProxyFunction.setSymbolName(SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));

		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		destProxyFunction.getLocalVariable().add(destReturnValueVariable);
		
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
		
		// TAckStatusの設定
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			destProxyFunction.setTAckStatus(tAckStatus.get());
		}
		
		// ActivationOperationの設定
		EList<ActivationOperation> activationOperationOnSendCompleted = createActivationOperationsOnSendCompletedWithoutActivationFlag(sourceSender);
		destProxyFunction.getActivationOperation().addAll(activationOperationOnSendCompleted);
		
		// ActivationFlagの設定
		EList<LocalVariable> activationFlags = getActivationFlags(activationOperationOnSendCompleted);
		destProxyFunction.getLocalVariable().addAll(activationFlags);
		
		LocalVariable destProxyDataVariable = null;
		if (type instanceof PrimitiveType) {
			destProxyDataVariable = this.localSymbolModelBuilder.createComProxyDataVariable((PrimitiveType) type);
			destProxyFunction.getLocalVariable().add(destProxyDataVariable);
		}
		
		String proxyBufferVariableName = null;
		if (immediate) {
			destProxyFunction.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyImmediateApiName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
			proxyBufferVariableName = SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup);
		} else {
			destProxyFunction.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyPeriodicApiName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
			proxyBufferVariableName = SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup);
		}
		
		Optional<GlobalVariable> bufferVariable = this.context.query.tryFindSingle(isKindOf(GLOBAL_VARIABLE).AND(hasAttr(VARIABLE__SYMBOL_NAME, proxyBufferVariableName)));
		if (bufferVariable.isPresent()) {
			destProxyFunction.setBufferVariable(bufferVariable.get());
		} else {
			destProxyFunction.setBufferVariable(destProxyDataVariable);
		}
		
		if (sourceComSignalOrComSignalGroup instanceof ComSignalGroup) {
			ComSignalGroup sourceComSignalGroup = (ComSignalGroup) sourceComSignalOrComSignalGroup;
			destProxyFunction.setSendSignalFunctionSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(sourcePartition));
			destProxyFunction.setSignalInformationSymbolName(SymbolNames.createComMetaVariableName(sourceComSignalGroup));
			destProxyFunction.setIsGroup(true);
		} else {
			// Array(1signal) or Primitive
			destProxyFunction.setSendSignalFunctionSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			destProxyFunction.setSignalInformationSymbolName(SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignalOrComSignalGroup)));
			destProxyFunction.setIsGroup(false);
		}
	
		destProxyFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(sourcePartition));
		targetPartition.getComProxyFunction().add(destProxyFunction);
	}

	private void buildComSendProxyEntities(Rte targetRte) throws ModelException {
		Optional<PeriodicComSendProxy> sourcePeriodicComSendProxy = this.context.query.tryFindSingleByKind(PERIODIC_COM_SEND_PROXY);
		if (sourcePeriodicComSendProxy.isPresent()) {
			ComSendSignalPeriodicEntity destPeriodicEntity = createComSendSignalPeriodicEntity(sourcePeriodicComSendProxy.get());
			destPeriodicEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePeriodicComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalPeriodicEntity(destPeriodicEntity);
		}
	
		Optional<ImmediateComSendProxy> sourceImmediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (sourceImmediateComSendProxy.isPresent()) {
			OsTask sourceOsTask = this.context.query.findSingle(isKindOf(OS_TASK).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME)));
	
			ComSendSignalImmediateEntity destImmediateEntity = createComSendSignalImmediateEntity(sourceImmediateComSendProxy.get());
			destImmediateEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceImmediateComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalImmediateEntity(destImmediateEntity);
	
			ComSendSignalImmediateTaskBody destTaskBody = createComSendSignalImmediateTaskBody(sourceOsTask, destImmediateEntity);
			destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourceOsTask.getOwnerApplication().get(0).getOsAppEcucPartition())));
			targetRte.setComSendSignalImmediateTaskBody(destTaskBody);
		}
	}

	private ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity(PeriodicComSendProxy sourceComSendProxy) throws ModelException {
		// 関数シンボルの構築
		ComSendSignalPeriodicEntity destEntity = ModuleFactory.eINSTANCE.createComSendSignalPeriodicEntity();
		destEntity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_PERIODIC_ENTITY_NAME);
		destEntity.setReturnType(this.context.cache.voidType);

		// 内部構造の構築
		buildInternalPartOfComSendSignalProxyEntity(destEntity, sourceComSendProxy);
		return destEntity;
	}

	private ComSendSignalImmediateEntity createComSendSignalImmediateEntity(ImmediateComSendProxy sourceComSendProxy) throws ModelException {
		// 関数シンボルの構築
		ComSendSignalImmediateEntity destEntity = ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity();
		destEntity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME);
		destEntity.setReturnType(this.context.cache.voidType);

		// 内部構造の構築
		buildInternalPartOfComSendSignalProxyEntity(destEntity, sourceComSendProxy);
		return destEntity;
	}

	private void buildInternalPartOfComSendSignalProxyEntity(ComSendSignalProxyEntity targetEntity, ComSendProxy sourceComSendProxy) throws ModelException {
		// 内部構造を構築
		LocalVariable destReturnVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetEntity.getLocalVariable().add(destReturnVariable);

		// プロキシ処理を構築
		LocalVariable destIndexVariable = this.localSymbolModelBuilder.createComProxyFunctionTableIndexVariable();
		targetEntity.getLocalVariable().add(destIndexVariable);

		// プロキシ処理はパーティション毎で共通となるので、パーティション単位で生成する
		ListMultimap<EcucPartition, ComSendProxyInteraction> sourceProxyInteractionsGroupByRequesterPartition = this.context.query.groupByKey(sourceComSendProxy.getInteraction(),
				COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION);
		for (EcucPartition sourceRequesterPartition : sourceProxyInteractionsGroupByRequesterPartition.keySet()) {
			List<ComSendProxyInteraction> sourceProxyInteractionsOfRequesterPartition = sourceProxyInteractionsGroupByRequesterPartition.get(sourceRequesterPartition);
			targetEntity.getOperation().add(this.comProxyOperationModelBuilder.createComSendProxyOperation(sourceProxyInteractionsOfRequesterPartition, destIndexVariable));
		}
	}

	private ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody(OsTask sourceOsTask, ComSendSignalImmediateEntity immediateEntity) {
		ComSendSignalImmediateTaskBody destTaskBody = ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));

		// 内部構造の構築
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());
		destTaskBody.setOsEventId(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		destTaskBody.setStartEntity(immediateEntity);
		return destTaskBody;
	}

	private void buildComCallbacks(Rte targetRte) throws ModelException {
		for (ExternalEcuSender sourceExternalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComRxCallback(sourceExternalEcuSender));
			}
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INV_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComInvCallback(sourceExternalEcuSender));
			}
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RX_TOUT_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComReceiveTimeoutCallback(sourceExternalEcuSender));
			}
		}
		for (ExternalEcuReceiver sourceExternalEcuReciver : this.context.query.<ExternalEcuReceiver> findByKind(EXTERNAL_ECU_RECEIVER)) {
			if (this.context.query.get(sourceExternalEcuReciver, EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_AND_TX_ERR_CALLBACK__EXTERNALECURECEIVER)) {
				targetRte.getComCallback().add(createComTAckCallback(sourceExternalEcuReciver));
				targetRte.getComCallback().add(createComTErrCallback(sourceExternalEcuReciver));
			}
			if (this.context.query.get(sourceExternalEcuReciver, EXTERNAL_ECU_RECEIVER_EX___PROVIDES_COM_TX_TOUT_CALLBACK__EXTERNALECURECEIVER)) {
				targetRte.getComCallback().add(createComTxTOutCallback(sourceExternalEcuReciver));
			}
		}
		for (ComCallback targetComCallback : targetRte.getComCallback()) {
			targetComCallback.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.<EcucPartition> absent()));
		}
	}
	
	private ComCallback createComTAckCallback(ExternalEcuReceiver sourceExternalEcuReciver) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuReciver.getSourceSignal() != null ? sourceExternalEcuReciver.getSourceSignal() : sourceExternalEcuReciver.getSourceSignalGroup(); // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)

		// 関数シンボルの構築
		ComTAckCallback destCallback = ModuleFactory.eINSTANCE.createComTAckCallback();
		destCallback.setSymbolName(SymbolNames.createComTAckCallback(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);
		
		// TAckNotifyOperationの設定
		EList<TAckNotifyOperation> tAckNotifyOperations = createTAckNotifyOperationsForComTxCallback(sourceExternalEcuReciver.getInternalEcuSenders());
		destCallback.getTAckNotifyOperation().addAll(tAckNotifyOperations);

		return destCallback;
	}

	private ComCallback createComTErrCallback(ExternalEcuReceiver sourceExternalEcuReciver) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuReciver.getSourceSignal() != null ? sourceExternalEcuReciver.getSourceSignal() : sourceExternalEcuReciver.getSourceSignalGroup(); // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)

		// 関数シンボルの構築
		ComTErrCallback destCallback = ModuleFactory.eINSTANCE.createComTErrCallback();
		destCallback.setSymbolName(SymbolNames.createComTErrCallback(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);
		
		// TAckNotifyOperationの設定
		EList<TAckNotifyOperation> tAckNotifyOperations = createTAckNotifyOperationsForComTxCallback(sourceExternalEcuReciver.getInternalEcuSenders());
		destCallback.getTAckNotifyOperation().addAll(tAckNotifyOperations);

		return destCallback;
	}
	
	private ComCallback createComTxTOutCallback(ExternalEcuReceiver sourceExternalEcuReciver) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuReciver.getSourceSignal() != null ? sourceExternalEcuReciver.getSourceSignal() : sourceExternalEcuReciver.getSourceSignalGroup(); // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)

		// 関数シンボルの構築
		ComTxTOutCallback destCallback = ModuleFactory.eINSTANCE.createComTxTOutCallback();
		destCallback.setSymbolName(SymbolNames.createComTxTOutCallback(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);
		
		// TAckNotifyOperationの設定
		EList<TAckNotifyOperation> tAckNotifyOperations = createTAckNotifyOperationsForComTxCallback(sourceExternalEcuReciver.getInternalEcuSenders());
		destCallback.getTAckNotifyOperation().addAll(tAckNotifyOperations);

		return destCallback;
	}
	
	private EList<TAckNotifyOperation> createTAckNotifyOperationsForComTxCallback(EList<InternalEcuSender> internalEcuSenders) throws ModelException {
		EList<TAckNotifyOperation> tAckNotifyOperations = new BasicEList<TAckNotifyOperation>();
		for (InternalEcuSender sourceSender : internalEcuSenders) {
			TAckNotifyOperation tAckNotifyOperation = ModuleFactory.eINSTANCE.createTAckNotifyOperation();
			tAckNotifyOperations.add(tAckNotifyOperation);
			
			// ActivationOperationの設定
			EList<ActivationOperation> activationOperationOnSendCompleted = createActivationOperationsOnSendCompletedWithoutActivationFlag(sourceSender);
			tAckNotifyOperation.getActivationOperation().addAll(activationOperationOnSendCompleted);

			// TAckStatusの設定
			Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
			if (tAckStatus.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				tAckNotifyOperation.setTAckStatus(tAckStatus.get());
			}
		}
		return tAckNotifyOperations;
	}

	private ComRxCallback createComRxCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		InternalEcuReceiver sourceFirstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		// 関数シンボルの構築
		ComRxCallback destCallback = ModuleFactory.eINSTANCE.createComRxCallback();
		destCallback.setSymbolName(SymbolNames.createComRxCallbackName(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);

		if (sourceExternalEcuSender.hasSendImplementation()) {
			// 内部構造の構築
			// 処理中で使用するCOMアクセス関数の関連付
			ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceComSignalOrComSignalGroup);
			destCallback.setAccessApi(comReceiveSignalApi);

			// ローカル変数の構築
			Variable destDataVariable = findOrCreateComCallbackDataVariable(sourceFirstReceiver, sourceComSignalOrComSignalGroup);
			if (destDataVariable instanceof LocalVariable) {
				destCallback.getLocalVariable().add((LocalVariable) destDataVariable);
			}
			destCallback.setDataVariable(destDataVariable);

			LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
			destCallback.getLocalVariable().add(destFilterResultVariable);

			// 送信処理の構築
			for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
				SendOperation destOperation;
				
				// ActivationOperationの設定(DataReceived)
				EList<ActivationOperation> activationOperationOnReceived = createActivationOperationsOnReceivedForComReceiveCallback(sourceSendInteraction, sourceExternalEcuSender);
				destCallback.getActivationOperation().addAll(activationOperationOnReceived);
				
				// ActivationFlagの設定
				EList<LocalVariable> activationFlags = getActivationFlags(activationOperationOnReceived);
				destCallback.getLocalVariable().addAll(activationFlags);
				destCallback.getActivationFlag().addAll(activationFlags);
				
				if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
					if (sourceFirstReceiver.getSource().getPrototype().isEventSemantics()) {
						destOperation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sourceSendInteraction, destDataVariable);
					} else {
						destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveCallback(sourceSendInteraction, sourceExternalEcuSender, destDataVariable,
								destFilterResultVariable, activationOperationOnReceived);
					}

				} else {
					continue;
				}

				destCallback.getOperation().add(destOperation);
			}
		} else {
			for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
				// ActivationOperationの設定(DataReceived)
				EList<ActivationOperation> activationOperationOnReceived = createActivationOperationsOnReceivedForComReceiveCallback(sourceSendInteraction, sourceExternalEcuSender);
				destCallback.getActivationOperation().addAll(activationOperationOnReceived);
				
				// ActivationFlagの設定
				EList<LocalVariable> activationFlags = getActivationFlags(activationOperationOnReceived);
				destCallback.getLocalVariable().addAll(activationFlags);
				destCallback.getActivationFlag().addAll(activationFlags);
			}
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destCallback);

		return destCallback;
	}

	private ComInvCallback createComInvCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		// 関数シンボルの構築
		ComInvCallback destCallback = ModuleFactory.eINSTANCE.createComInvCallback();
		destCallback.setSymbolName(SymbolNames.createComInvCallbackName(sourceExternalEcuSender.getSourceSignal()));
		destCallback.setReturnType(this.context.cache.voidType);

		if (sourceExternalEcuSender.hasSendImplementation()) {
			// 内部構造の構築
			// ローカル変数の構築
			LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
			destCallback.getLocalVariable().add(destFilterResultVariable);

			// 送信処理の構築
			for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
				SendOperation destOperation;
				
				// ActivationOperationの設定(DataReceived or DataReceivedErr)
				EList<ActivationOperation> activationOperations = createActivationOperationsOnReceivedOrReceiveErrorForComInvCallback(sourceSendInteraction, sourceExternalEcuSender);
				destCallback.getActivationOperation().addAll(activationOperations);
				
				// ActivationFlagの設定
				EList<LocalVariable> activationFlags = getActivationFlags(activationOperations);
				destCallback.getLocalVariable().addAll(activationFlags);
				destCallback.getActivationFlag().addAll(activationFlags);
				
				
				if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
					destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComInvalidateCallback(sourceSendInteraction, sourceExternalEcuSender, destFilterResultVariable, activationOperations);

				} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					assert false; // ここには来ない
					continue;
				}
				destCallback.getOperation().add(destOperation);
			}
		} else {
			for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
				// ActivationOperationの設定(DataReceived or DataReceivedErr)
				EList<ActivationOperation> activationOperations = createActivationOperationsOnReceivedOrReceiveErrorForComInvCallback(sourceSendInteraction, sourceExternalEcuSender);
				destCallback.getActivationOperation().addAll(activationOperations);
				
				// ActivationFlagの設定
				EList<LocalVariable> activationFlags = getActivationFlags(activationOperations);
				destCallback.getLocalVariable().addAll(activationFlags);
				destCallback.getActivationFlag().addAll(activationFlags);
			}
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destCallback);
		
		return destCallback;
	}
	
	public EList<EntityStarter> collectRelatedEntityStarterForInvalidate(SendInteraction sourceSendInteraction) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		if (sourceReceiveInteraction.getInternalEcuReceivers().isEmpty()) {
			return new BasicEList<EntityStarter>(); // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		}
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		if (sourceRDataInstanceInSwc.isInvalidationKeep()) {
			return sourceReceiver.getActivatesOnReceiveError();
		}
		if (sourceRDataInstanceInSwc.isInvalidationReplace()) {
			return sourceReceiver.getActivatesOnReceived();
		}
		
		return new BasicEList<EntityStarter>();// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
	}

	private ComRxTOutCallback createComReceiveTimeoutCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		InternalEcuReceiver sourceFirstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		// 関数シンボルの構築
		ComRxTOutCallback destCallback = ModuleFactory.eINSTANCE.createComRxTOutCallback();
		destCallback.setSymbolName(SymbolNames.createComRxTOutCallback(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);

		if (sourceExternalEcuSender.hasSendImplementation()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			// 内部構造の構築
			// 処理中で使用するCOMアクセス関数の関連付
			ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceComSignalOrComSignalGroup);
			destCallback.setAccessApi(comReceiveSignalApi);

			// ローカル変数の構築
			Variable destDataVariable = findOrCreateComCallbackDataVariable(sourceFirstReceiver, sourceComSignalOrComSignalGroup);
			if (destDataVariable instanceof LocalVariable) {
				destCallback.getLocalVariable().add((LocalVariable) destDataVariable);
			}
			destCallback.setDataVariable(destDataVariable);

			// 送信処理の構築
			for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
				InternalEcuReceiver sourceSendInteractionReceiver = sourceSendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
				// ActivationOperationの設定(DataReceiveError)
				for (EntityStarter entityStarter : sourceSendInteractionReceiver.getActivatesOnReceiveError()) {
					destCallback.getActivationOperation().add(createActivationOperation(entityStarter));
				}

				if (!sourceSendInteractionReceiver.isAliveTimeoutEnabled()) {
					continue;
				}

				SendOperation destOperation;
				if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
					destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveTimeoutCallback(sourceSendInteraction, destDataVariable, this.context.cache.rteErrorMaxAgeExceededConstant);
				} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					assert false; // ここには来ない
					continue;
				}

				destCallback.getOperation().add(destOperation);
			}
		}
		
		return destCallback;
	}
	
	private EList<ActivationOperation> createActivationOperationsOnReceivedOrReceiveErrorForComInvCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		if (sourceReceiveInteraction.getInternalEcuReceivers().isEmpty()) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return new BasicEList<ActivationOperation>();
		}

		EList<ActivationOperation> activationOperations = new BasicEList<ActivationOperation>();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		for (EntityStarter entityStarter : collectRelatedEntityStarterForInvalidate(sourceSendInteraction)) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			if (sourceRDataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter() && sourceRDataInstanceInSwc.isInvalidationReplace()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				activationOperation.setActivationFlag(this.localSymbolModelBuilder.createActivationFlagVariable(activationOperation));
			}
			activationOperations.add(activationOperation);
		}
		return activationOperations;
	}

	private Variable findOrCreateComCallbackDataVariable(InternalEcuReceiver sourceFirstReceiver, EcucContainer sourceComSignalOrComSignalGroup) throws ModelException {
		Optional<RteBufferVariableSet> foundComReceiveBufferVariableSet = this.context.builtQuery.trySelectDest(this.context.cache.masterBswPartition.getComReceiveBufferVariableSet(),
				sourceComSignalOrComSignalGroup);
		if (foundComReceiveBufferVariableSet.isPresent()) {
			return foundComReceiveBufferVariableSet.get().getComplexVariable();
		} else {
			return this.localSymbolModelBuilder.createSrDataVariable(sourceFirstReceiver.getSource().getPrototype(), SymbolNames.SR_DATA_VAR_NAME);
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル(ライフサイクル)(内部実装用)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildRteLifecycleImplFunctions() throws ModelException {
		buildRteLifecycleApis();
	}

	private void buildRteLifecycleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;
	
		OsOS sourceOsOs = this.context.query.findSingleByKind(OS_OS);
	
		// RTEのライフサイクル管理用のAPIを構築
		if (sourceOsOs.isMulticoreOs()) {
			// マルチコア構成
	
			// コア毎のStart APIの実装を構築
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));
	
				RteCoreStartApiImpl destStartApiImpl = createRteCoreStartApiImpl(sourceCore);
				destStartApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(bswPartition)));
				sourceCore.setRteCoreStartApiImpl(destStartApiImpl);
			}
	
			// Start/Stop APIを構築
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			MulticoreRteStartApi destStartApi = createMulticoreRteStartApi(targetRte);
			destStartApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(destStartApi);
	
			RteStopApi destStopApi = createRteStopApi();
			destStopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(destStopApi);
	
		} else {
			// シングルコア構成
			Core sourceCore = targetRte.getCore().get(0);
	
			// Start/Stop APIを構築
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);
	
			SinglecoreRteStartApi destStartApi = createSinglecoreRteStartApi(sourceCore);
			destStartApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(destStartApi);
	
			RteStopApi destStopApi = createRteStopApi();
			destStopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(destStopApi);
		}
	
		// パーティションのライフサイクル管理用のAPIを構築
		for (EcucPartition sourcePartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);
			MemoryMapping partitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition));
	
			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION)) {
				RestartPartitionApi destRestartPartitionApi = createRestartPartitionApi(sourcePartition);
				destRestartPartitionApi.setMemoryMapping(partitionMemmap);
				targetPartition.setRestartPartitionApi(destRestartPartitionApi);
			}
			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION)) {
				PartitionRestartingApi destPartitionRestartingApi = createPartitionRestartingApi(sourcePartition);
				destPartitionRestartingApi.setMemoryMapping(partitionMemmap);
				targetPartition.setPartitionRestartingApi(destPartitionRestartingApi);
			}
	
			PartitionTerminatedApi destPartitionTerminatedApi = createPartitionTerminatedApi(sourcePartition);
			destPartitionTerminatedApi.setMemoryMapping(partitionMemmap);
			targetPartition.setPartitionTerminatedApi(destPartitionTerminatedApi);
		}
	}

	private SinglecoreRteStartApi createSinglecoreRteStartApi(Core sourceCore) throws ModelException {
		SinglecoreRteStartApi destStartApi = ModuleFactory.eINSTANCE.createSinglecoreRteStartApi();
		destStartApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// 内部構造
		destStartApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return destStartApi;
	}

	private MulticoreRteStartApi createMulticoreRteStartApi(Rte rte) {
		MulticoreRteStartApi destStartApi = ModuleFactory.eINSTANCE.createMulticoreRteStartApi();
		destStartApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// 内部構造
		destStartApi.getCoreStartApiImpl().addAll(this.context.query.<RteCoreStartApiImpl> findByKind(rte, RTE_CORE_START_API_IMPL));
		return destStartApi;
	}

	private RteCoreStartApiImpl createRteCoreStartApiImpl(Core sourceCore) throws ModelException {
		RteCoreStartApiImpl destStartApi = ModuleFactory.eINSTANCE.createRteCoreStartApiImpl();
		destStartApi.setSymbolName(SymbolNames.createRteCoreStartApiImplName(sourceCore));
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// 内部構造
		destStartApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return destStartApi;
	}

	private RteStopApi createRteStopApi() {
		RteStopApi destStopApi = ModuleFactory.eINSTANCE.createRteStopApi();
		destStopApi.setSymbolName(SymbolNames.RTE_STOP_API_NAME);
		destStopApi.setReturnType(this.context.cache.stdReturnType);
		return destStopApi;
	}

	private PartitionTerminatedApi createPartitionTerminatedApi(EcucPartition sourcePartition) throws ModelException {
		PartitionTerminatedApi destApi = ModuleFactory.eINSTANCE.createPartitionTerminatedApi();
		destApi.setSymbolName(SymbolNames.createPartitionTerminatedApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.voidType);

		// 内部構造
		destApi.setSrInterPartitionTimeoutOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return destApi;
	}

	private PartitionRestartingApi createPartitionRestartingApi(EcucPartition sourcePartition) throws ModelException {
		PartitionRestartingApi destApi = ModuleFactory.eINSTANCE.createPartitionRestartingApi();
		destApi.setSymbolName(SymbolNames.createPartitionRestartingApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.voidType);

		// 内部構造
		destApi.setSrInterPartitionTimeoutOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return destApi;
	}

	private RestartPartitionApi createRestartPartitionApi(EcucPartition sourcePartition) throws ModelException {
		RestartPartitionApi destApi = ModuleFactory.eINSTANCE.createRestartPartitionApi();
		destApi.setSymbolName(SymbolNames.createRestartPartitionApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// 内部構造
		destApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtPartitionRestart(sourcePartition));
		destApi.getOperation().add(this.initOperationBuilder.createIocInitializeOperationAtPartitionRestart(sourcePartition));
		return destApi;
	}

	private void buildSchmLifecycleImplFunctionsAndInternals() throws ModelException {
		buildSchmLifecycleApis();
	}

	private void buildSchmLifecycleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;

		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		// RTEのライフサイクル管理用のAPIを構築
		if (osOs.isMulticoreOs()) {
			// マルチコア構成

			// コア毎のStart APIの実装を構築
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition sourceBswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));

				SchmCoreInitApiImpl destInitApiImpl = createSchmCoreInitApiImpl(sourceCore);
				destInitApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourceBswPartition)));
				sourceCore.setSchmCoreInitApiImpl(destInitApiImpl);
			}

			// Init/Deinit APIを構築
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			MulticoreSchmInitApi destInitApi = createMulticoreSchmInitApi(targetRte);
			destInitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(destInitApi);

			SchmDeinitApi destDeinitApi = createSchmDeinitApi();
			destDeinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(destDeinitApi);

		} else {
			// シングルコア構成
			Core sourceCore = targetRte.getCore().get(0);

			// Init/Deinit APIを構築
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			SinglecoreSchmInitApi destInitApi = createSinglecoreSchmInitApi(sourceCore);
			destInitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(destInitApi);

			SchmDeinitApi destDeinitApi = createSchmDeinitApi();
			destDeinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(destDeinitApi);
		}
	}

	private SinglecoreSchmInitApi createSinglecoreSchmInitApi(Core sourceCore) throws ModelException {
		SinglecoreSchmInitApi destInitApi = ModuleFactory.eINSTANCE.createSinglecoreSchmInitApi();
		destInitApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		destInitApi.setReturnType(this.context.cache.voidType);

		// 内部構造
		destInitApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		buildModeSwitchEventPartOfSchmInitFunction(destInitApi, sourceCore);
		return destInitApi;
	}

	private MulticoreSchmInitApi createMulticoreSchmInitApi(Rte rte) {
		MulticoreSchmInitApi destInitApi = ModuleFactory.eINSTANCE.createMulticoreSchmInitApi();
		destInitApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		destInitApi.setReturnType(this.context.cache.voidType);

		// 内部構造
		destInitApi.getCoreInitApiImpl().addAll(this.context.query.<SchmCoreInitApiImpl> findByKind(rte, SCHM_CORE_INIT_API_IMPL));
		return destInitApi;
	}

	private boolean runsAtInit(BswModeSwitchEvent sourceBswModeSwitchEvent) {
	    ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);
		return sourceOnEntryModeIref.getTargetMode() == sourceOnEntryModeIref.getContextModeDeclarationGroup().getType().getInitialMode();
	}

	private SchmCoreInitApiImpl createSchmCoreInitApiImpl(Core sourceCore) throws ModelException {
		SchmCoreInitApiImpl destInitApi = ModuleFactory.eINSTANCE.createSchmCoreInitApiImpl();
		destInitApi.setSymbolName(SymbolNames.createSchmCoreStartApiImplName(sourceCore));
		destInitApi.setReturnType(this.context.cache.voidType);

		// 内部構造
		destInitApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		buildModeSwitchEventPartOfSchmInitFunction(destInitApi, sourceCore);
		return destInitApi;
	}

	private SchmDeinitApi createSchmDeinitApi() {
		SchmDeinitApi destDeinitApi = ModuleFactory.eINSTANCE.createSchmDeinitApi();
		destDeinitApi.setSymbolName(SymbolNames.SCHM_DEINIT_API_NAME);
		destDeinitApi.setReturnType(this.context.cache.voidType);
		return destDeinitApi;
	}

	private void buildModeSwitchEventPartOfSchmInitFunction(SchmInitApi targetInitApi, Core sourceCore) throws ModelException {
		for (Partition partition : sourceCore.getPartition()) {
			for (PartedBswm partedBswm : partition.getPartedBswm()) {
				for (ModeMachineInstance modeMachineInstance : partedBswm.getModeMachineInstance()) {
					ModeDeclarationGroupPrototype sourceModePrototype = (ModeDeclarationGroupPrototype) modeMachineInstance.getSingleSource();

					targetInitApi.getInitTargetModeMachineInstance().add(modeMachineInstance);
					buildModeSwitchEventPartOfSchmInitFunction(targetInitApi, sourceModePrototype);
				}
			}
		}
	}

	private void buildModeSwitchEventPartOfSchmInitFunction(SchmInitApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {

		for (RteBswRequiredModeGroupConnection sourceModeConnection : this.context.query.<RteBswRequiredModeGroupConnection> find(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, sourceProvidedModePrototype)))) {
			ModeDeclarationGroupPrototype sourceRequiredModeGroup = sourceModeConnection.getRteBswRequiredModeGroup();

			BswInternalBehavior sourceBswInternalBehavior = sourceModeConnection.getParent().getRteBswImplementation().getBehavior();
			for (BswModeSwitchEvent sourceBswModeSwitchEvent : getBswModeSwitchEventsTriggeredByRequiredModeGroup(sourceBswInternalBehavior, sourceRequiredModeGroup)) {
				if (!this.moduleRules.isEnabledBswEvent(sourceBswModeSwitchEvent)) {
					continue;
				}

				if (!runsAtInit(sourceBswModeSwitchEvent)) {
					continue;
				}

				RteBswEventToTaskMapping sourceBswEventToTaskMapping = sourceBswModeSwitchEvent.getConfig().get(0); // NOTE コンフィグが存在することはnrte_sws_0196で確認済み
				OsTask sourceOsTask = sourceBswEventToTaskMapping.getRteBswMappedToTask();
				if (sourceOsTask == null) {
					// 直接起動
					ModeSwitchTriggeringExecutableStartOperation destExcutableStartOperation = this.entityOperationBuilder.createModeSwitchTriggeringExecutableStartOperation(sourceBswInternalBehavior.getParent(), sourceBswModeSwitchEvent);
					targetApi.getInitialExecutableStartOperation().add(destExcutableStartOperation);

				} else {
					// OSタスク起動／OSイベント設定
					buildOsTaskEvent(targetApi.getInitialExecutableOsTaskEvent(), sourceBswEventToTaskMapping, sourceOsTask);
				}
			}
		}

		// 生成した内部構造をソート
		// エクスキュータブル開始処理
		Ordering<EObject> executableStartOperationOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(EXECUTABLE_START_OPERATION__START_EXECUTABLE, FUNCTION__SYMBOL_NAME))
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE, CONSTANT__SYMBOL_NAME)));
		ECollections.sort(targetApi.getInitialExecutableStartOperation(), executableStartOperationOrdering);

		// OsTaskEvent
		Ordering<EObject> taskEventOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_PRIORITY)).reverse()
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_ID)));
		ECollections.sort(targetApi.getInitialExecutableOsTaskEvent(), taskEventOrdering);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル共通のユーティリティ
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildTrustedFunctionSignature(TrustedFunction targetTrustedFunction) {
		targetTrustedFunction.setReturnType(this.context.cache.osStatusType);
	
		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionIndexParam());
		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionParamsParam());
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 関数のシンボル内部構造モデル(API)を構築する。
	 * NOTE ここでいうAPIはアプリケーション向けのもののみであり、ライフサイクルAPIは内部実装用の扱いであることに注意。
	 * 
	 * @throws ModelException モデル変換に必要となるモデルの取得に失敗した場合
	 */
	public void buildApiFunctionInternals() throws ModelException {
		if (this.context.options.doesGenerateRte) {
			buildRteApiInternals();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmApiInternals();
		}
	}

	private void buildRteApiInternals() throws ModelException {
		for (Swc targetSwc : this.context.query.<Swc> findByKind(SWC)) {
			for (WriteApi targetApi : this.context.query.<RteApi, WriteApi> selectByKind(targetSwc.getRteApi(), WRITE_API)) {
				buildWriteApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (InvalidateApi targetApi : this.context.query.<RteApi, InvalidateApi> selectByKind(targetSwc.getRteApi(), INVALIDATE_API)) {
				buildInvalidateApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (SendApi targetApi : this.context.query.<RteApi, SendApi> selectByKind(targetSwc.getRteApi(), SEND_API)) {
				buildSendApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (FeedbackApi targetApi : this.context.query.<RteApi, FeedbackApi> selectByKind(targetSwc.getRteApi(), FEEDBACK_API)) {
				buildFeedbackApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (ReadApi targetApi : this.context.query.<RteApi, ReadApi> selectByKind(targetSwc.getRteApi(), READ_API)) {
				buildReadApiInternal(targetApi, (RVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (ReceiveApi targetApi : this.context.query.<RteApi, ReceiveApi> selectByKind(targetSwc.getRteApi(), RECEIVE_API)) {
				buildReceiveApiInternal(targetApi, (RVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (CallApi targetApi : this.context.query.<RteApi, CallApi> selectByKind(targetSwc.getRteApi(), CALL_API)) {
				buildCallApiInternal(targetApi, (ROperationInstanceInSwc) targetApi.getSingleSource());
			}
			for (IrvWriteApi targetApi : this.context.query.<RteApi, IrvWriteApi> selectByKind(targetSwc.getRteApi(), IRV_WRITE_API)) {
				buildIrvWriteApiInternal(targetApi, (VariableDataPrototype) targetApi.getSingleSource());
			}
			for (IrvReadApi targetApi : this.context.query.<RteApi, IrvReadApi> selectByKind(targetSwc.getRteApi(), IRV_READ_API)) {
				buildIrvReadApiInternal(targetApi, (VariableDataPrototype) targetApi.getSingleSource());
			}
			for (RteEnterApi targetApi : this.context.query.<RteApi, RteEnterApi> selectByKind(targetSwc.getRteApi(), RTE_ENTER_API)) {
				buildRteEnterApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
			for (RteExitApi targetApi : this.context.query.<RteApi, RteExitApi> selectByKind(targetSwc.getRteApi(), RTE_EXIT_API)) {
				buildRteExitApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
		}
	}

	private void buildSchmApiInternals() throws ModelException {
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			BswModuleDescription sourceBswModuleDescription = (BswModuleDescription) targetPartedBswm.getBswm().getSingleSource();

			for (SchmModeApi targetApi : this.context.query.<SchmApi, SchmModeApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_MODE_API)) {
				buildSchmModeApiInternal(targetApi, (ModeDeclarationGroupPrototype) targetApi.getSingleSource(), sourceBswModuleDescription);
			}
			for (SchmSwitchApi targetApi : this.context.query.<SchmApi, SchmSwitchApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_SWITCH_API)) {
				buildSchmSwitchApiInternal(targetApi, (ModeDeclarationGroupPrototype) targetApi.getSingleSource());
			}
			for (SchmEnterApi targetApi : this.context.query.<SchmApi, SchmEnterApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_ENTER_API)) {
				buildSchmEnterApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
			for (SchmExitApi targetApi : this.context.query.<SchmApi, SchmExitApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_EXIT_API)) {
				buildSchmExitApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造(S/R)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildWriteApiInternal(WriteApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);

		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// 接続状態の設定
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// ローカル変数宣言の設定
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
		
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
		LocalVariable destTrustedReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariableForTrustedFunction();
		targetApi.getLocalVariable().add(destTrustedReturnValueVariable);
		
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);

		LocalVariable destTfParamVariableForRte = null;
		if (this.context.cache.rteNonqueuedSendTfParamType.isPresent()) {
			destTfParamVariableForRte = this.localSymbolModelBuilder.createRteNonqueuedSendTrustedFunctionParamVariable();
			targetApi.getLocalVariable().add(destTfParamVariableForRte);
		}

		// ActivationOperationの設定(DataSendCompleted)
		EList<ActivationOperation> activationOperationOnSendCompleted = createActivationOperationsOnSendCompleted(sourceSender);
		targetApi.getActivationOperation().addAll(activationOperationOnSendCompleted);
		
		// ActivationFlagの設定
		EList<LocalVariable> activationFlagsForSendCompleted = getActivationFlags(activationOperationOnSendCompleted);
		targetApi.getLocalVariable().addAll(activationFlagsForSendCompleted);
		targetApi.getActivationFlag().addAll(activationFlagsForSendCompleted);
		
		// TAckStatusの設定
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			targetApi.setTAckStatus(tAckStatus.get());
		}

		// 送信処理の構築
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;

			// ActivationOperationの設定(DataReceived)
			EList<ActivationOperation> activationOperationOnReceived = createActivationOperationsOnReceived(sourceSendInteraction);
			targetApi.getActivationOperation().addAll(activationOperationOnReceived);
			
			// ActivationFlagの設定
			EList<LocalVariable> activationFlagsForDataReceived = getActivationFlags(activationOperationOnReceived);
			targetApi.getLocalVariable().addAll(activationFlagsForDataReceived);
			targetApi.getActivationFlag().addAll(activationFlagsForDataReceived);
			
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteApi(targetApi, sourceSendInteraction, dataParam, destFilterResultVariable,
						activationOperationOnReceived);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
	
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createTrustedFunctionRteBufferWriteSendOperation(sourceTrustedFunctionRteSendImplementation, dataParam, destReturnValueVariable,
						destTrustedReturnValueVariable, destTfParamVariableForRte, type, activationOperationOnReceived);
			} else if (sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation sourceIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createIocNonqueuedSendOperation(sourceIocSendImplementation, dataParam, Optional.of(destReturnValueVariable), activationOperationOnReceived);

			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable,
						targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
	
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceDataInstanceInSwc.getImplementationDataType().isPrimitiveType()) {
					setInitReturnValueVariable(destReturnValueVariable);
				}
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) {
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable,
							destTfParamVariableForSignal, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				} else {
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable,
							destTfParamVariableForSignalGroup, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, dataParam, destReturnValueVariable,
						destTempReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) {
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable,
						type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else {
				continue;
			}

			destOperation.setIsWriteApi(true);
			targetApi.getOperation().add(destOperation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}

		// 引数のメモリチェックが必要かを設定
		targetApi.setNeedsCheckArg(needsCheckArg(targetApi.getOperation(), dataParam.getType(), sourceDataInstanceInSwc.isTAckEnabled()));
	}

	private EList<LocalVariable> getActivationFlags(EList<ActivationOperation> activationOperationOnSendCompleted) {
		EList<LocalVariable> activationFlags = new BasicEList<LocalVariable>();
		for (ActivationOperation activationOperation : activationOperationOnSendCompleted) {
			if (activationOperation.getActivationFlag() != null) {
				activationFlags.add(activationOperation.getActivationFlag());
			}
		}
		return activationFlags;
	}
	
	private EList<ActivationOperation> createActivationOperationsOnSendCompleted(InternalEcuSender sourceSender) throws ModelException {
		EList<ActivationOperation> activationOperationOnSendCompleted = new BasicEList<ActivationOperation>();
		for (EntityStarter entityStarter : sourceSender.getActivatesOnSendCompleted()) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			if (!sourceSender.getExternalEcuReceivers().isEmpty()) {
				activationOperation.setActivationFlag(this.localSymbolModelBuilder.createActivationFlagVariable(activationOperation));
			}
			activationOperationOnSendCompleted.add(activationOperation);
		}
		return activationOperationOnSendCompleted;
	}

	private EList<ActivationOperation> createActivationOperationsOnSendCompletedWithoutActivationFlag(InternalEcuSender sourceSender) throws ModelException {
		EList<ActivationOperation> activationOperationOnSendCompleted = new BasicEList<ActivationOperation>();
		for (EntityStarter entityStarter : sourceSender.getActivatesOnSendCompleted()) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			activationOperationOnSendCompleted.add(activationOperation);
		}
		return activationOperationOnSendCompleted;
	}

	private EList<ActivationOperation> createActivationOperationsOnReceived(SendInteraction sourceSendInteraction) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		if (sourceReceiveInteraction.getInternalEcuReceivers().isEmpty()) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return new BasicEList<ActivationOperation>();
		}

		EList<ActivationOperation> activationOperations = new BasicEList<ActivationOperation>();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		for (EntityStarter entityStarter : sourceReceiver.getActivatesOnReceived()) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			if (sourceReceiver.isFilterEnabled() || sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation
					|| sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				activationOperation.setActivationFlag(this.localSymbolModelBuilder.createActivationFlagVariable(activationOperation));
			}
			activationOperations.add(activationOperation);
		}
		return activationOperations;
	}

	private EList<ActivationOperation> createActivationOperationsOnReceivedForComReceiveCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		if (sourceReceiveInteraction.getInternalEcuReceivers().isEmpty()) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return new BasicEList<ActivationOperation>();
		}

		EList<ActivationOperation> activationOperations = new BasicEList<ActivationOperation>();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		for (EntityStarter entityStarter : sourceReceiver.getActivatesOnReceived()) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			if (sourceRDataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) {
				activationOperation.setActivationFlag(this.localSymbolModelBuilder.createActivationFlagVariable(activationOperation));
			}
			activationOperations.add(activationOperation);
		}
		return activationOperations;
	}

	private ActivationOperation createActivationOperation(EntityStarter entityStarter) throws ModelException {
		ActivationOperation activationOperation = ModuleFactory.eINSTANCE.createActivationOperation();
		activationOperation.setActivationApi((OsApi) this.context.builtQuery.findDest(OS_API, entityStarter));
		OsTask sourceTask = entityStarter.getExecutionContext().getSourceOsTask();
		activationOperation.setOsTaskPriority(sourceTask.getOsTaskPriority());
		return activationOperation;
	}

	private boolean needsCheckArg(EList<SendOperation> sendOperations, Type type, boolean hasTAckStatus) {
		if (type instanceof PrimitiveType) {
			return false;
		}

		for (SendOperation sendOperation : sendOperations) {
			if (sendOperation instanceof TrustedFunctionRteOperation) {
				// do nothing
			} else if (sendOperation instanceof TrustedFunctionComSendOperation) {
				// do nothing
			} else if (sendOperation instanceof IocSendOperation && (type instanceof PointerType || hasTAckStatus)) {
				return true;
			} else if (sendOperation instanceof ProxyComSendOperation && hasTAckStatus) {
				return true;
			}
		}
		return false;
	}
	
	private void setInitReturnValueVariable(LocalVariable targetReturnValueVariable) {
		targetReturnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
	}

	private void buildInvalidateApiInternal(InvalidateApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}
		
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		// 接続状態の設定
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// ローカル変数宣言の設定
		Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);
	
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		setInitReturnValueVariable(destReturnValueVariable);
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
		LocalVariable destTrustedReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariableForTrustedFunction();
		targetApi.getLocalVariable().add(destTrustedReturnValueVariable);
		
		LocalVariable destInvalidValueVariable = this.localSymbolModelBuilder.createSrInvalidValueVariable(sourceDataInstanceInSwc);
		destInvalidValueVariable.setInitValueConstant(invalidValueConstant);
		targetApi.getLocalVariable().add(destInvalidValueVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);

		LocalVariable destTfParamVariableForRte = null;
		if (this.context.cache.rteNonqueuedSendTfParamType.isPresent()) {
			destTfParamVariableForRte = this.localSymbolModelBuilder.createRteNonqueuedSendTrustedFunctionParamVariable();
			targetApi.getLocalVariable().add(destTfParamVariableForRte);
		}

		// ActivationOperationの設定(DataSendCompleted)
		EList<ActivationOperation> activationOperationOnSendCompleted = createActivationOperationsOnSendCompleted(sourceSender);
		targetApi.getActivationOperation().addAll(activationOperationOnSendCompleted);
		
		// ActivationFlagの設定
		EList<LocalVariable> activationFlagsOnSendCompleted = getActivationFlags(activationOperationOnSendCompleted);
		targetApi.getLocalVariable().addAll(activationFlagsOnSendCompleted);
		targetApi.getActivationFlag().addAll(activationFlagsOnSendCompleted);

		// TAckStatusの設定
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			targetApi.setTAckStatus(tAckStatus.get());
		}

		// 送信処理の構築
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;

			// ActivationOperationの設定(DataReceived or DataReceivedErr)
			EList<ActivationOperation> activationOperationsOnReceivedOrReceiveError = createActivationOperationsOnReceivedOrReceiveErrorForInvalidateApi(sourceSendInteraction);
			targetApi.getActivationOperation().addAll(activationOperationsOnReceivedOrReceiveError);
			
			// ActivationFlagの設定
			EList<LocalVariable> activationFlagsOnReceivedOrReceiveError = getActivationFlags(activationOperationsOnReceivedOrReceiveError);
			targetApi.getLocalVariable().addAll(activationFlagsOnReceivedOrReceiveError);
			targetApi.getActivationFlag().addAll(activationFlagsOnReceivedOrReceiveError);

			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateApi(targetApi, sourceSendInteraction, invalidValueConstant, destFilterResultVariable,
						activationOperationsOnReceivedOrReceiveError);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
				destOperation = this.srOperationBuilder.createTrustedFunctionRteBufferInvalidateSendOperation(sourceSendInteraction, sourceTrustedFunctionRteSendImplementation,
						destReturnValueVariable, destTrustedReturnValueVariable, destTfParamVariableForRte, activationOperationsOnReceivedOrReceiveError);

			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, destInvalidValueVariable, destReturnValueVariable, destTempReturnValueVariable,
						targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効化は複合データ型未サポート(nrte_sws_0291)
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, destInvalidValueVariable, destReturnValueVariable,
							destTfParamVariableForSignal, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				} else {
					// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効化は複合データ型未サポート(nrte_sws_0291)
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, destInvalidValueVariable, destReturnValueVariable,
							destTfParamVariableForSignalGroup, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, invalidValueConstant, destReturnValueVariable,
						destTempReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, invalidValueConstant, destReturnValueVariable,
						destTempReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				assert false; // ここには来ない
				continue;
			}
	
			targetApi.getOperation().add(destOperation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}
	
	private EList<ActivationOperation> createActivationOperationsOnReceivedOrReceiveErrorForInvalidateApi(SendInteraction sourceSendInteraction) throws ModelException {
		
		ReceiveInteraction sourceReceiveInteraction = sourceSendInteraction.getReceiveInteraction();
		if (!sourceSendInteraction.getExternalEcuSenders().isEmpty() || sourceReceiveInteraction.getInternalEcuReceivers().isEmpty()) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
			return new BasicEList<ActivationOperation>();
		}

		EList<ActivationOperation> activationOperations = new BasicEList<ActivationOperation>();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceRDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		for (EntityStarter entityStarter : collectRelatedEntityStarterForInvalidate(sourceSendInteraction)) {
			ActivationOperation activationOperation = createActivationOperation(entityStarter);
			if ((sourceRDataInstanceInSwc.isFilterEnabled() && sourceRDataInstanceInSwc.isInvalidationReplace()) ||
					(sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation || sourceSendInteraction.getImplementation() instanceof IocSendImplementation)) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
				activationOperation.setActivationFlag(this.localSymbolModelBuilder.createActivationFlagVariable(activationOperation));
			}
			activationOperations.add(activationOperation);
		}
		return activationOperations;
	}
	
	private void buildReadApiInternal(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			buildUnconnectedReadApiInternal(targetApi, sourceDataInstanceInSwc, dataParam);
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver sourceReceiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceDataInstanceInComposition));
	
		// 内部構造の構築
		if (sourceReceiver.getReceiveInteraction().isEmpty()) {
			buildUnconnectedReadApiInternal(targetApi, sourceDataInstanceInSwc, dataParam);
			return;
		}
	
		buildConnectedReadApi(targetApi, sourceDataInstanceInSwc, sourceReceiver);
	}

	private void buildConnectedReadApi(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, InternalEcuReceiver sourceReceiver) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
		ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
	
		// 接続状態の設定
		targetApi.setIsConnected(true);
	
		// 返り値用変数の構築
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
	
		// 読み込み処理の構築
		ReadOperation destOperation;
		if (sourceReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			destOperation = this.srOperationBuilder.createRteBufferNonqueuedReadOperation(targetApi, sourceReceiveInteraction, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) {
			IocValueBufferImplementation sourceIocValueBufferImplementation = (IocValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createIocNonqueuedReadOperation(sourceIocValueBufferImplementation, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			ComValueBufferImplementation sourceComValueBufferImplementation = (ComValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createComReadOperation(sourceComValueBufferImplementation, sourceDataInstanceInSwc, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
		} else {
			destOperation = this.srOperationBuilder.createNeverReadOperation(targetApi, sourceDataInstanceInSwc, dataParam);
		}
	
		// 無効化処理の設定
		HandleInvalidEnum sourceHandleInvalid = sourceDataInstanceInSwc.isInvalidationEnabled() ? sourceDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		if (HandleInvalidEnum.KEEP.equals(sourceHandleInvalid)) {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);
			destOperation.setInvalidValueConstant(invalidValueConstant);
			if (targetApi.getIsInline()) {
				if (! targetApi.getInlineConstant().contains(invalidValueConstant)) {	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効値マクロ名が重複することはない
					targetApi.getInlineConstant().add(invalidValueConstant);
				}
			}
		}
	
		targetApi.setOperation(destOperation);
	
		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildUnconnectedReadApiInternal(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam) throws ModelException {
		targetApi.setIsConnected(false);
		targetApi.setOperation(this.srOperationBuilder.createNeverReadOperation(targetApi, sourceDataInstanceInSwc, dataParam));
	}

	private void buildFeedbackApiInternal(FeedbackApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);

		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE// (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
		// 接続状態の設定
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());

		// TAckStatusの設定
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			targetApi.setTAckStatus(tAckStatus.get());
			if (targetApi.getIsInline()) {
				targetApi.getInlineGlobalVariable().add(tAckStatus.get().getStatusVariable());
			}
		}
	}
	
	private void buildSendApiInternal(SendApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// 接続状態の設定
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// ローカル変数宣言の設定
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
		LocalVariable destTrustedReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariableForTrustedFunction();
		targetApi.getLocalVariable().add(destTrustedReturnValueVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);
	
		LocalVariable destTfParamVariableForRte = null;
		if (this.context.cache.rteQueuedSendTfParamType.isPresent()) {
			destTfParamVariableForRte = this.localSymbolModelBuilder.createRteQueuedSendTrustedFunctionParamVariable();
			targetApi.getLocalVariable().add(destTfParamVariableForRte);
		}
		
		// ActivationOperationの設定(DataSendCompleted)
		EList<ActivationOperation> activationOperationOnSendCompleted = createActivationOperationsOnSendCompleted(sourceSender);
		targetApi.getActivationOperation().addAll(activationOperationOnSendCompleted);
		
		// ActivationFlagの設定
		EList<LocalVariable> activationFlagsOnSendCompleted = getActivationFlags(activationOperationOnSendCompleted);
		targetApi.getLocalVariable().addAll(activationFlagsOnSendCompleted);
		targetApi.getActivationFlag().addAll(activationFlagsOnSendCompleted);

		// TAckStatusの設定
		Optional<TAckStatus> tAckStatus = this.context.builtQuery.tryFindDest(TACK_STATUS, sourceSender.getTAckStatusVariableImplementation());
		if (tAckStatus.isPresent()) {
			targetApi.setTAckStatus(tAckStatus.get());
		}

		// 送信処理の構築
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;

			// ActivationOperationの設定(DataReceived)
			EList<ActivationOperation> activationOperationOnReceived = createActivationOperationsOnReceived(sourceSendInteraction);
			targetApi.getActivationOperation().addAll(activationOperationOnReceived);
			
			// ActivationFlagの設定
			EList<LocalVariable> activationFlagsOnReceived = getActivationFlags(activationOperationOnReceived);
			targetApi.getLocalVariable().addAll(activationFlagsOnReceived);
			targetApi.getActivationFlag().addAll(activationFlagsOnReceived);
			
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sourceSendInteraction, dataParam, Optional.of(destReturnValueVariable));
	
			} else if (sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation sourceIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation();
				
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createIocQueuedSendOperation(sourceIocSendImplementation, dataParam, Optional.of(destReturnValueVariable),
						Optional.of(destTempReturnValueVariable), activationOperationOnReceived);

			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
				
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable,
						targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createTrustedFunctionRteBufferSendSendOperation(sourceTrustedFunctionRteSendImplementation, dataParam, destReturnValueVariable,
						destTrustedReturnValueVariable, destTfParamVariableForRte, type, activationOperationOnReceived);

			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceDataInstanceInSwc.getImplementationDataType().isPrimitiveType()) {
					setInitReturnValueVariable(destReturnValueVariable);
				}
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) {
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable,
							destTfParamVariableForSignal, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				} else {
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable,
							destTfParamVariableForSignalGroup, destTrustedReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, dataParam, destReturnValueVariable,
						destTempReturnValueVariable, type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable,
						type, targetApi.getTAckStatus(), activationOperationOnSendCompleted);

			} else {
				continue;
			}
	
			targetApi.getOperation().add(destOperation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}

		// 引数のメモリチェックが必要かを設定
		targetApi.setNeedsCheckArg(needsCheckArg(targetApi.getOperation(), dataParam.getType(), sourceDataInstanceInSwc.isTAckEnabled()));
	}
	
	private void buildReceiveApiInternal(ReceiveApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver sourceReceiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// 内部構造の構築
		if (sourceReceiver.getReceiveInteraction().isEmpty()) {
			return;
		}
	
		ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
	
		// 接続状態の設定
		targetApi.setIsConnected(true);
	
		// 返り値用変数の構築
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		targetApi.setReturnValue(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
	
		// 読み込み処理の構築
		ReadOperation destOperation;
		if (sourceReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			destOperation = this.srOperationBuilder.createRteBufferQueuedReadOperation(sourceReceiveInteraction, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			IocValueBufferImplementation sourceIocValueBufferImplementation = (IocValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createIocQueuedReceiveOperation(sourceIocValueBufferImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
		} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ここには来ない
			assert false;
			return;
		}
	
		targetApi.setOperation(destOperation);
	
		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造(C/S)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCallApiInternal(CallApi targetApi, ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);

		// ポート定義引数の設定
		// 接続先のオペレーションが存在するかを確認
		if (sourceOperationInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		OperationInstanceInComposition sourceOperationInstanceInComposition = sourceOperationInstanceInSwc.getInstance().get(0);
		if (sourceOperationInstanceInComposition.getProviderConnection().isEmpty()) {
			return;
		}

		OperationInstanceInComposition sourceProvidedOperationInstanceInComposition = sourceOperationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc sourceProvidedOperationInstanceInSwc = (POperationInstanceInSwc) sourceProvidedOperationInstanceInComposition.getPrototype();
		OperationInvokedEvent sourceOperationInvokedEvent = sourceProvidedOperationInstanceInSwc.getOperationInvokedEvent().get(0);

		targetApi.setIsConnected(true);

		// ローカル変数を構築
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);

		// ランナブル開始オペレーションを構築
		targetApi.setOperation(this.entityOperationBuilder.createServerRunnableStartOperation(sourceProvidedOperationInstanceInSwc));

		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity startRunnable = this.context.builtQuery.findDest(RUNNABLE_ENTITY, sourceOperationInvokedEvent.getStartOnEvent());
		if (targetApi.getIsInline()) {
			addInlineRunnableEntity(targetApi, startRunnable);

			for (Value value : targetApi.getOperation().getPortArgValue()) {
				if (value instanceof Constant) {
					targetApi.getInlineConstant().add((Constant)value);
				} else if (value instanceof GlobalVariable) {	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					targetApi.getInlineGlobalVariable().add((GlobalVariable)value);
				}
			}
		} else {
			if (!(targetApi instanceof TfCallApi)) {
				if (! this.context.query.<RunnableEntity> collect(targetApi.getParent().getParent().getSwc(), SWC__DEPENDENT_RUNNABLE_ENTITY).contains(startRunnable)) {
					targetApi.getParent().getDependentExternalRunnableEntity().add(startRunnable);
				}
			}
		}
		if (!sourceProvidedOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty()) {
			targetApi.setReturnVariable(destReturnValueVariable);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void addInlineRunnableEntity(CallApi targetApi, jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity entity) {
		if (! targetApi.getInlineRunnableEntity().contains(entity)) { // COVERAGE (コードレビューで問題ないことを確認)
			targetApi.getInlineRunnableEntity().add(entity);
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造(IRV)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildIrvWriteApiInternal(IrvWriteApi targetApi, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvWriteOperation destOperation = this.irvOperationBuilder.createIrvWriteOperation(targetApi, sourceDataPrototype, targetApi.getDataParam());
		targetApi.setOperation(destOperation);
		targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
	}

	private void buildIrvReadApiInternal(IrvReadApi targetApi, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvReadOperation destOperation = this.irvOperationBuilder.createIrvReadOperation(targetApi, sourceDataPrototype, targetApi.getDataParam());
		targetApi.setOperation(destOperation);

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造(排他制御)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildRteEnterApiInternal(RteEnterApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildRteExitApiInternal(RteExitApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmEnterApiInternal(SchmEnterApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmExitApiInternal(SchmExitApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private boolean isNoneExcludeOperation(ExcludeOperation operation) {
		return operation instanceof NoneExcludeOperation;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// シンボル内部構造(モード)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmModeApiInternal(SchmModeApi targetApi, ModeDeclarationGroupPrototype sourceModeUserModePrototype, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		Optional<ModeDeclarationGroupPrototype> sourceModeManagerModePrototype = tryGetModeManagerModePrototype(sourceBswModuleDescription, sourceModeUserModePrototype);

		if (sourceModeManagerModePrototype.isPresent()) {
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceModeManagerModePrototype.get());
			if (modeInstance.isPresent()) {
				targetApi.setModeMachineInstance(modeInstance.get());
			}
		}

		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(targetApi.getParent().getBswm().getModeDeclarationGroup(), sourceModeUserModePrototype.getType());
		targetApi.setModeDeclarationGroup(modeDeclarationGroup);
	}

	private Optional<ModeDeclarationGroupPrototype> tryGetModeManagerModePrototype(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeUserModePrototype) {
		if (sourceBswModuleDescription.getProvidedModeGroup().contains(sourceModeUserModePrototype)) {
			// モードユーザが提供側の場合、モードユーザとモードマネージャが同一のため、モードユーザをそのまま返す
			return Optional.of(sourceModeUserModePrototype);
		} else {
			// モードユーザが要求側の場合、接続先のモードマネージャを取得
			// NOTE 接続は復数存在する可能性があるが、その場合でも提供側は必ず1つとなるため、代表となる接続から提供側を取得する
			Optional<RteBswRequiredModeGroupConnection> sourceConnection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(
					ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, sourceModeUserModePrototype)));
			if (sourceConnection.isPresent()) {
				// 接続あり
				return Optional.of(sourceConnection.get().getRteBswProvidedModeGroup());
			} else {
				// 接続なし
				return Optional.absent();
			}
		}
	}

	private void buildSchmSwitchApiInternal(SchmSwitchApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {
		Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceProvidedModePrototype);
		if (modeInstance.isPresent()) { // COVERAGE 常にtrue(APIの生成条件と、ModeMachineInstanceの生成条件が同じであるため)
			targetApi.setModeMachineInstance(modeInstance.get());
		}

		buildModeSwitchEventPartOfSchmSwitchApi(targetApi, sourceProvidedModePrototype);
	}

	private void buildModeSwitchEventPartOfSchmSwitchApi(SchmSwitchApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {

		for (RteBswRequiredModeGroupConnection sourceModeConnection : this.context.query.<RteBswRequiredModeGroupConnection> find(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, sourceProvidedModePrototype)))) {
			ModeDeclarationGroupPrototype sourceRequiredModeGroup = sourceModeConnection.getRteBswRequiredModeGroup();

			BswInternalBehavior sourceBswInternalBehavior = sourceModeConnection.getParent().getRteBswImplementation().getBehavior();
			for (BswModeSwitchEvent sourceBswModeSwitchEvent : getBswModeSwitchEventsTriggeredByRequiredModeGroup(sourceBswInternalBehavior, sourceRequiredModeGroup)) {
				if (!this.moduleRules.isEnabledBswEvent(sourceBswModeSwitchEvent)) {
					continue;
				}

				RteBswEventToTaskMapping sourceBswEventToTaskMapping = sourceBswModeSwitchEvent.getConfig().get(0); // NOTE コンフィグが存在することはnrte_sws_0196で確認済み
				OsTask sourceOsTask = sourceBswEventToTaskMapping.getRteBswMappedToTask();
				if (sourceOsTask == null) {
					// 直接起動
					ModeSwitchTriggeringExecutableStartOperation destExcutableStartOperation = this.entityOperationBuilder.createModeSwitchTriggeringExecutableStartOperation(sourceBswInternalBehavior.getParent(), sourceBswModeSwitchEvent);
					targetApi.getExecutableStartOperation().add(destExcutableStartOperation);

				} else {
					// OSタスク起動／OSイベント設定
					buildOsTaskEventByMode(targetApi.getOsTaskEventTriggeredByMode(), sourceBswModeSwitchEvent, sourceBswEventToTaskMapping, sourceOsTask);
				}
			}
		}

		// 生成した内部構造をソート
		// エクスキュータブル開始処理
		Ordering<EObject> executableStartOperationOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(EXECUTABLE_START_OPERATION__START_EXECUTABLE, FUNCTION__SYMBOL_NAME))
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE, CONSTANT__SYMBOL_NAME)));
		ECollections.sort(targetApi.getExecutableStartOperation(), executableStartOperationOrdering);

		// OsTaskEventTriggeredByMode
		Ordering<EObject> taskEventByModeOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, CONSTANT__SYMBOL_NAME));
		Ordering<EObject> taskEventOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_PRIORITY)).reverse()
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_ID)));

		ECollections.sort(targetApi.getOsTaskEventTriggeredByMode(), taskEventByModeOrdering);
		for (OsTaskEventsTriggeredByMode byMode : targetApi.getOsTaskEventTriggeredByMode()) {
			ECollections.sort(byMode.getOsTaskEvent(), taskEventOrdering);
		}
	}

	private List<BswModeSwitchEvent> getBswModeSwitchEventsTriggeredByRequiredModeGroup(BswInternalBehavior sourceBswInternalBehavior, ModeDeclarationGroupPrototype sourceRequiredModeGroup) {
		List<BswModeSwitchEvent> foundBswModeSwitchEvents = new ArrayList<BswModeSwitchEvent>();
		for (BswModeSwitchEvent sourceBswModeSwitchEvent : this.context.query.<BswEvent, BswModeSwitchEvent> selectByKind(sourceBswInternalBehavior.getEvent(), BSW_MODE_SWITCH_EVENT)) {
			ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);
			if (sourceOnEntryModeIref.getContextModeDeclarationGroup() == sourceRequiredModeGroup) {
				foundBswModeSwitchEvents.add(sourceBswModeSwitchEvent);
			}
		}
		return foundBswModeSwitchEvents;
	}

	private void buildOsTaskEventByMode(List<OsTaskEventsTriggeredByMode> targetTaskEventsByMode, BswModeSwitchEvent sourceSwitchEvent, RteBswEventToTaskMapping sourceTaskMapping, OsTask sourceOsTask)
			throws ModelException {
		Constant startModeConstant = getStartModeConstant(sourceSwitchEvent);

		OsTaskEventsTriggeredByMode destByMode = getOrBuildOsTaskEventsTriggeredByMode(targetTaskEventsByMode, startModeConstant);
		buildOsTaskEvent(destByMode.getOsTaskEvent(), sourceTaskMapping, sourceOsTask);
	}

	private OsTaskEventsTriggeredByMode getOrBuildOsTaskEventsTriggeredByMode(List<OsTaskEventsTriggeredByMode> targetTaskEventsByMode, Constant startModeConstant) {
		Optional<OsTaskEventsTriggeredByMode> foundTaskEventsByMode = this.context.query.trySelectSingle(targetTaskEventsByMode, ref(OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, startModeConstant));
		if (foundTaskEventsByMode.isPresent()) {
			return foundTaskEventsByMode.get();

		} else {
			OsTaskEventsTriggeredByMode destTaskEventsByMode = ModuleFactory.eINSTANCE.createOsTaskEventsTriggeredByMode();
			destTaskEventsByMode.setStartMode(startModeConstant);
			targetTaskEventsByMode.add(destTaskEventsByMode);
			return destTaskEventsByMode;
		}
	}

	private void buildOsTaskEvent(List<OsTaskEvent> targetTaskEvents, RteBswEventToTaskMapping sourceTaskMapping, OsTask sourceOsTask) {
		OsEvent sourceOsEvent = sourceTaskMapping.getRteBswUsedOsEvent();

		Optional<OsTaskEvent> foundOsTaskEvent = this.context.query.trySelectSingle(targetTaskEvents, hasAttr(OS_TASK_EVENT__OS_TASK_ID, sourceOsTask.getShortName()));
		if (foundOsTaskEvent.isPresent()) {
			// 生成済みのOsTaskEventが存在する場合
			foundOsTaskEvent.get().getOsEventId().add(sourceOsEvent.getShortName());
			ECollections.sort(foundOsTaskEvent.get().getOsEventId());

		} else {
			// 生成済みのOsTaskEventが存在しない場合
			OsTaskEvent destTaskEvent = ModuleFactory.eINSTANCE.createOsTaskEvent();
			destTaskEvent.setOsTaskId(sourceOsTask.getShortName());
			if (sourceOsEvent != null) {
				destTaskEvent.getOsEventId().add(sourceOsEvent.getShortName());
			}
			destTaskEvent.setOsTaskPriority(sourceOsTask.getOsTaskPriority());
			targetTaskEvents.add(destTaskEvent);
		}
	}

	private Constant getStartModeConstant(BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);

		Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswModeSwitchEvent.getParent().getParent());
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceOnEntryModeIref.getContextModeDeclarationGroup().getType());

		return this.context.builtQuery.selectDest(modeDeclarationGroup.getModeConstant(), sourceOnEntryModeIref.getTargetMode());
	}
}
