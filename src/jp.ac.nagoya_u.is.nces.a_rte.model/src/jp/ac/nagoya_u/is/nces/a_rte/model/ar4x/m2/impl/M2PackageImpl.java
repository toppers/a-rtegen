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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.*;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl.RtePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M2PackageImpl extends EPackageImpl implements M2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2RootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autosarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2ObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rPortPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPortPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcInternalBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autosarVariableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableInAtomicSwcTypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSendCompletedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReceivedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReceiveErrorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rVariableInAtomicSwcInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucModuleConfigurationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucContainerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucNumericalParamValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucTextualParamValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucAbstractReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucInstanceReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rPortComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPortComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionAcknowledgementRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonqueuedSenderComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuedSenderComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonqueuedReceiverComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblySwConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationSwConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rPortPrototypeInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPortPrototypeInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swComponentPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autosarDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swDataDefPropsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeMappingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeDeclarationGroupPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeRequestTypeMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeDeclarationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationPrimitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autosarDataPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInvokedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pOperationInAtomicSwcInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentDataPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuedReceiverComSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portApiOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDefinedArgumentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedDataTypeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootSwCompositionPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSignalIPduEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSignalToIPduMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverToSignalMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverToSignalGroupMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataPrototypeInSystemInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecucValueCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverCallPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousServerCallPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOperationInAtomicSwcInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPrototypeInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swAddrMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstrRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConstrsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuAbstractionSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nvBlockSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorActuatorSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexDeviceDriverSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProxySwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSwComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPortInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rPortInCompositionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcBswRunnableMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcBswMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswInternalBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswModeSenderPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswModuleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswModuleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswModuleEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswSchedulableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswModeSwitchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeInBswModuleDescriptionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswTimingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswBackgroundEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswCalledEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswInterruptEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationDataTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSignalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSignalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRecCompositeTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRecRecordTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRecRecordElementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRecArrayTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexedArrayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRecArrayElementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swPointerTargetPropsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum argumentDirectionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataFilterTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handleInvalidEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum swImplPolicyEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryAllocationKeywordPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ecucConfigurationVariantEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeActivationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bswCallTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bswExecutionContextEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arraySizeSemanticsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numericalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verbatimStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nativeDeclarationStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sectionInitializationPolicyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType categoryStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseTypeEncodingStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType revisionLabelStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M2PackageImpl() {
		super(eNS_URI, M2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link M2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M2Package init() {
		if (isInited) return (M2Package)EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI);

		// Obtain or create and register package
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new M2PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theM2Package.createPackageContents();
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theEcucPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theM2Package.initializePackageContents();
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theEcucPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M2Package.eNS_URI, theM2Package);
		return theM2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2Root() {
		return m2RootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM2Root_Autosar() {
		return (EReference)m2RootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutosar() {
		return autosarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutosar_Id() {
		return (EAttribute)autosarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosar_ArPackage() {
		return (EReference)autosarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArPackage() {
		return arPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArPackage_Element() {
		return (EReference)arPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArPackage_ArPackage() {
		return (EReference)arPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArElement() {
		return arElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Category() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2Object() {
		return m2ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwBaseType() {
		return swBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwBaseType_BaseTypeEncoding() {
		return (EAttribute)swBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwBaseType_BaseTypeSize() {
		return (EAttribute)swBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwBaseType_NativeDeclaration() {
		return (EAttribute)swBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwBaseType__GetUpperLimitForUnsignedInteger() {
		return swBaseTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverInterface() {
		return senderReceiverInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverInterface_DataElement() {
		return (EReference)senderReceiverInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverInterface_InvalidationPolicy() {
		return (EReference)senderReceiverInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataPrototype() {
		return variableDataPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataPrototype_InitValue() {
		return (EReference)variableDataPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferrable() {
		return referrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferrable_Id() {
		return (EAttribute)referrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferrable_ShortName() {
		return (EAttribute)referrableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferrable_Reference() {
		return (EAttribute)referrableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwComponentType() {
		return swComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentType_Port() {
		return (EReference)swComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPrototype() {
		return portPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPrototype_Parent() {
		return (EReference)portPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPrototype_PortApiOption() {
		return (EReference)portPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicSwComponentType() {
		return atomicSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicSwComponentType_InternalBehavior() {
		return (EReference)atomicSwComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetUsingApplicationDataTypes() {
		return atomicSwComponentTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetUsingImplementationDataTypes() {
		return atomicSwComponentTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetUsingDataTypes() {
		return atomicSwComponentTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetImplementationDataType__AutosarDataType() {
		return atomicSwComponentTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetImplementationDataTypes__ApplicationDataType() {
		return atomicSwComponentTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetUsingClientServerInterfaces() {
		return atomicSwComponentTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetRPorts() {
		return atomicSwComponentTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicSwComponentType__GetPPorts() {
		return atomicSwComponentTypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSwComponentType() {
		return applicationSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPortPrototype() {
		return rPortPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPortPrototype_RequiredInterface() {
		return (EReference)rPortPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPortPrototype_RequiredComSpec() {
		return (EReference)rPortPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRPortPrototype__GetUsingDataTypes() {
		return rPortPrototypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPortPrototype() {
		return pPortPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPortPrototype_ProvidedInterface() {
		return (EReference)pPortPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPortPrototype_ProvidedComSpec() {
		return (EReference)pPortPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPPortPrototype__GetUsingDataTypes() {
		return pPortPrototypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcInternalBehavior() {
		return swcInternalBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_Runnable() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_Event() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_PortApiOption() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_IncludedDataTypeSet() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_Parent() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcInternalBehavior_ExplicitInterRunnableVariable() {
		return (EReference)swcInternalBehaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ApplicationDataType() {
		return swcInternalBehaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ImplementationDataType() {
		return swcInternalBehaviorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetUsingDataTypes() {
		return swcInternalBehaviorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetImplementationDataType__AutosarDataType() {
		return swcInternalBehaviorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetImplementationDataType__ApplicationDataType() {
		return swcInternalBehaviorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwcInternalBehavior__GetImplementationDataTypes__ApplicationDataType() {
		return swcInternalBehaviorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableEntity() {
		return executableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableEntity_CanEnterExclusiveArea() {
		return (EReference)executableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableEntity_RunsInsideExclusiveArea() {
		return (EReference)executableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableEntity_SwAddrMethod() {
		return (EReference)executableEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableEntity() {
		return runnableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_DataSendPoint() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_DataReceivePointByArgument() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableEntity_Symbol() {
		return (EAttribute)runnableEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_WrittenLocalVariable() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_ReadLocalVariable() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_ServerCallPoint() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_Event() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntity_Parent() {
		return (EReference)runnableEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAccess() {
		return variableAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAccess_AccessedVariable() {
		return (EReference)variableAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutosarVariableRef() {
		return autosarVariableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarVariableRef_AutosarVariableIref() {
		return (EReference)autosarVariableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarVariableRef_AutosarVariable() {
		return (EReference)autosarVariableRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarVariableRef_LocalVariable() {
		return (EReference)autosarVariableRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableInAtomicSwcTypeInstanceRef() {
		return variableInAtomicSwcTypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableInAtomicSwcTypeInstanceRef_PortPrototype() {
		return (EReference)variableInAtomicSwcTypeInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableInAtomicSwcTypeInstanceRef_TargetDataPrototype() {
		return (EReference)variableInAtomicSwcTypeInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteEvent() {
		return rteEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEvent_StartOnEvent() {
		return (EReference)rteEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEvent_Config() {
		return (EReference)rteEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingEvent() {
		return timingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingEvent_Period() {
		return (EAttribute)timingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundEvent() {
		return backgroundEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSendCompletedEvent() {
		return dataSendCompletedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSendCompletedEvent_EventSource() {
		return (EReference)dataSendCompletedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSendCompletedEvent_EventSourceData() {
		return (EReference)dataSendCompletedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReceivedEvent() {
		return dataReceivedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReceivedEvent_DataIref() {
		return (EReference)dataReceivedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReceivedEvent_Data() {
		return (EReference)dataReceivedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReceiveErrorEvent() {
		return dataReceiveErrorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReceiveErrorEvent_DataIref() {
		return (EReference)dataReceiveErrorEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReceiveErrorEvent_Data() {
		return (EReference)dataReceiveErrorEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRVariableInAtomicSwcInstanceRef() {
		return rVariableInAtomicSwcInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRVariableInAtomicSwcInstanceRef_ContextRPort() {
		return (EReference)rVariableInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRVariableInAtomicSwcInstanceRef_TargetDataElement() {
		return (EReference)rVariableInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucModuleConfigurationValues() {
		return ecucModuleConfigurationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucModuleConfigurationValues_Container() {
		return (EReference)ecucModuleConfigurationValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucModuleConfigurationValues_EcucDefEdition() {
		return (EAttribute)ecucModuleConfigurationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucModuleConfigurationValues_ImplementationConfigVariant() {
		return (EAttribute)ecucModuleConfigurationValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucModuleConfigurationValues_DefinitionRef() {
		return (EAttribute)ecucModuleConfigurationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucContainerValue() {
		return ecucContainerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucContainerValue_SubContainer() {
		return (EReference)ecucContainerValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucContainerValue_ParameterValue() {
		return (EReference)ecucContainerValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucContainerValue_DefinitionRef() {
		return (EAttribute)ecucContainerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucContainerValue_ReferenceValue() {
		return (EReference)ecucContainerValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucParameterValue() {
		return ecucParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucParameterValue_DefinitionRef() {
		return (EAttribute)ecucParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucNumericalParamValue() {
		return ecucNumericalParamValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucNumericalParamValue_Value() {
		return (EAttribute)ecucNumericalParamValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucTextualParamValue() {
		return ecucTextualParamValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucTextualParamValue_Value() {
		return (EAttribute)ecucTextualParamValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucAbstractReferenceValue() {
		return ecucAbstractReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcucAbstractReferenceValue_DefinitionRef() {
		return (EAttribute)ecucAbstractReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucReferenceValue() {
		return ecucReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucReferenceValue_Value() {
		return (EReference)ecucReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucInstanceReferenceValue() {
		return ecucInstanceReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucInstanceReferenceValue_ValueIref() {
		return (EReference)ecucInstanceReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucInstanceReferenceValue_Value() {
		return (EReference)ecucInstanceReferenceValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPortComSpec() {
		return rPortComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPortComSpec() {
		return pPortComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiverComSpec() {
		return receiverComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiverComSpec_DataElement() {
		return (EReference)receiverComSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderComSpec() {
		return senderComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderComSpec_DataElement() {
		return (EReference)senderComSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderComSpec_TransmissionAcknowledge() {
		return (EReference)senderComSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionAcknowledgementRequest() {
		return transmissionAcknowledgementRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionAcknowledgementRequest_Timeout() {
		return (EAttribute)transmissionAcknowledgementRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonqueuedSenderComSpec() {
		return nonqueuedSenderComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonqueuedSenderComSpec_InitValue() {
		return (EReference)nonqueuedSenderComSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueuedSenderComSpec() {
		return queuedSenderComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonqueuedReceiverComSpec() {
		return nonqueuedReceiverComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonqueuedReceiverComSpec_AliveTimeout() {
		return (EAttribute)nonqueuedReceiverComSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonqueuedReceiverComSpec_InitValue() {
		return (EReference)nonqueuedReceiverComSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonqueuedReceiverComSpec_Filter() {
		return (EReference)nonqueuedReceiverComSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInterface() {
		return portInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionSwComponentType() {
		return compositionSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSwComponentType_Component() {
		return (EReference)compositionSwComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSwComponentType_Connector() {
		return (EReference)compositionSwComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwConnector() {
		return swConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblySwConnector() {
		return assemblySwConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblySwConnector_Requester() {
		return (EReference)assemblySwConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblySwConnector_Provider() {
		return (EReference)assemblySwConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblySwConnector_ProviderIref() {
		return (EReference)assemblySwConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblySwConnector_RequesterIref() {
		return (EReference)assemblySwConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationSwConnector() {
		return delegationSwConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationSwConnector_OuterPort() {
		return (EReference)delegationSwConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationSwConnector_InnerPortIref() {
		return (EReference)delegationSwConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationSwConnector_InnerPort() {
		return (EReference)delegationSwConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPortPrototypeInCompositionInstanceRef() {
		return rPortPrototypeInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPortPrototypeInCompositionInstanceRef_TargetRPort() {
		return (EReference)rPortPrototypeInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPortPrototypeInCompositionInstanceRef() {
		return pPortPrototypeInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPortPrototypeInCompositionInstanceRef_TargetPPort() {
		return (EReference)pPortPrototypeInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwComponentPrototype() {
		return swComponentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentPrototype_Type() {
		return (EReference)swComponentPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwComponentPrototype_Instance() {
		return (EReference)swComponentPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutosarDataType() {
		return autosarDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarDataType_SwDataDefProps() {
		return (EReference)autosarDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarDataType_InvalidValue() {
		return (EReference)autosarDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarDataType_CompuMethod() {
		return (EReference)autosarDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarDataType_DataConstr() {
		return (EReference)autosarDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutosarDataType_SwAddrMethod() {
		return (EReference)autosarDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutosarDataType__GetSwImplPolicy() {
		return autosarDataTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDataType() {
		return applicationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationDataType() {
		return implementationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataType_BaseType() {
		return (EReference)implementationDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_SwAlignment() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataType_SubElement() {
		return (EReference)implementationDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__GetLeafImplementationDataType() {
		return implementationDataTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsPrimitiveType() {
		return implementationDataTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsPointerType() {
		return implementationDataTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsArrayType() {
		return implementationDataTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsStructType() {
		return implementationDataTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsUnionType() {
		return implementationDataTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsRedefinitionType() {
		return implementationDataTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataType__IsComplexType() {
		return implementationDataTypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwDataDefProps() {
		return swDataDefPropsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_InvalidValue() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_BaseType() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwDataDefProps_SwImplPolicy() {
		return (EAttribute)swDataDefPropsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_SwAddrMethod() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwDataDefProps_SwAlignment() {
		return (EAttribute)swDataDefPropsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_CompuMethod() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_DataConstr() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_ImplementationDataType() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwDataDefProps_SwPointerTargetProps() {
		return (EReference)swDataDefPropsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeMap() {
		return dataTypeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeMap_ImplementationDataType() {
		return (EReference)dataTypeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeMap_ApplicationDataType() {
		return (EReference)dataTypeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeMappingSet() {
		return dataTypeMappingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeMappingSet_DataTypeMap() {
		return (EReference)dataTypeMappingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeMappingSet_ModeRequestTypeMap() {
		return (EReference)dataTypeMappingSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeDeclarationGroupPrototype() {
		return modeDeclarationGroupPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroupPrototype_Type() {
		return (EReference)modeDeclarationGroupPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeRequestTypeMap() {
		return modeRequestTypeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeRequestTypeMap_ImplementationDataType() {
		return (EReference)modeRequestTypeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeRequestTypeMap_ModeGroup() {
		return (EReference)modeRequestTypeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeDeclaration() {
		return modeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeDeclarationGroup() {
		return modeDeclarationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_InitialMode() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_ModeDeclaration() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationPrimitiveDataType() {
		return applicationPrimitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutosarDataPrototype() {
		return autosarDataPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutosarDataPrototype__GetSwAddrMethod() {
		return autosarDataPrototypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutosarDataPrototype__GetSwAlignment() {
		return autosarDataPrototypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutosarDataPrototype__GetApplicationDataType() {
		return autosarDataPrototypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutosarDataPrototype__GetImplementationDataType() {
		return autosarDataPrototypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPrototype() {
		return dataPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrototype_SwDataDefProps() {
		return (EReference)dataPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrototype_SwAddrMethod() {
		return (EReference)dataPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPrototype_SwAlignment() {
		return (EAttribute)dataPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrototype_Type() {
		return (EReference)dataPrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataPrototype__GetSwImplPolicy() {
		return dataPrototypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveArea() {
		return exclusiveAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveArea_Parent() {
		return (EReference)exclusiveAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveArea_EnterExecutableEntity() {
		return (EReference)exclusiveAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveArea_SwcConfig() {
		return (EReference)exclusiveAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveArea_BswConfig() {
		return (EReference)exclusiveAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalValueSpecification() {
		return numericalValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalValueSpecification_Value() {
		return (EAttribute)numericalValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextValueSpecification() {
		return textValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValueSpecification_Value() {
		return (EAttribute)textValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantReference() {
		return constantReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantReference_Constant() {
		return (EReference)constantReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstantReference__GetEndValueSpec() {
		return constantReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceValueSpecification() {
		return referenceValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValueSpecification() {
		return arrayValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValueSpecification_Element() {
		return (EReference)arrayValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordValueSpecification() {
		return recordValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordValueSpecification_Field() {
		return (EReference)recordValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationValueSpecification() {
		return applicationValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantSpecification() {
		return constantSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantSpecification_ValueSpec() {
		return (EReference)constantSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationInvokedEvent() {
		return operationInvokedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInvokedEvent_OperationIref() {
		return (EReference)operationInvokedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInvokedEvent_Operation() {
		return (EReference)operationInvokedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOperationInAtomicSwcInstanceRef() {
		return pOperationInAtomicSwcInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOperationInAtomicSwcInstanceRef_ContextPPort() {
		return (EReference)pOperationInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOperationInAtomicSwcInstanceRef_TargetProvidedOperation() {
		return (EReference)pOperationInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientServerInterface() {
		return clientServerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerInterface_Operation() {
		return (EReference)clientServerInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerInterface_PossibleError() {
		return (EReference)clientServerInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientServerOperation() {
		return clientServerOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerOperation_PossibleError() {
		return (EReference)clientServerOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerOperation_Argument() {
		return (EReference)clientServerOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationError() {
		return applicationErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationError_ErrorCode() {
		return (EAttribute)applicationErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationError_Parent() {
		return (EReference)applicationErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentDataPrototype() {
		return argumentDataPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDataPrototype_Direction() {
		return (EAttribute)argumentDataPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFilter() {
		return dataFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_DataFilterType() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_Mask() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_Max() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_Min() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_Offset() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_Period() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFilter_X() {
		return (EAttribute)dataFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFilter__IsFilterEnabled() {
		return dataFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFilter__IsCompatibleWith__DataFilter() {
		return dataFilterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueuedReceiverComSpec() {
		return queuedReceiverComSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueuedReceiverComSpec_QueueLength() {
		return (EAttribute)queuedReceiverComSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidationPolicy() {
		return invalidationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidationPolicy_DataElement() {
		return (EReference)invalidationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidationPolicy_HandleInvalid() {
		return (EAttribute)invalidationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvalidationPolicy__IsInvalidationEnabled() {
		return invalidationPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvalidationPolicy__IsInvalidationKeep() {
		return invalidationPolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvalidationPolicy__IsInvalidationReplace() {
		return invalidationPolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortApiOption() {
		return portApiOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortApiOption_PortArgValue() {
		return (EReference)portApiOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortApiOption_Port() {
		return (EReference)portApiOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortApiOption_EnableTakeAddress() {
		return (EAttribute)portApiOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDefinedArgumentValue() {
		return portDefinedArgumentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDefinedArgumentValue_Value() {
		return (EReference)portDefinedArgumentValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDefinedArgumentValue_ValueType() {
		return (EReference)portDefinedArgumentValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDefinedArgumentValue_Parent() {
		return (EReference)portDefinedArgumentValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedDataTypeSet() {
		return includedDataTypeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedDataTypeSet_LiteralPrefix() {
		return (EAttribute)includedDataTypeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedDataTypeSet_DataType() {
		return (EReference)includedDataTypeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RootSoftwareComposition() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Mapping() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootSwCompositionPrototype() {
		return rootSwCompositionPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSwCompositionPrototype_SoftwareComposition() {
		return (EReference)rootSwCompositionPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemMapping() {
		return systemMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemMapping_DataMapping() {
		return (EReference)systemMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMapping() {
		return dataMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSignal() {
		return systemSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISignal() {
		return iSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignal_SystemSignal() {
		return (EReference)iSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISignalIPdu() {
		return iSignalIPduEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignalIPdu_ISignalToPduMapping() {
		return (EReference)iSignalIPduEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISignalToIPduMapping() {
		return iSignalToIPduMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignalToIPduMapping_ISignal() {
		return (EReference)iSignalToIPduMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignalToIPduMapping_ISignalGroup() {
		return (EReference)iSignalToIPduMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverToSignalMapping() {
		return senderReceiverToSignalMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalMapping_SystemSignal() {
		return (EReference)senderReceiverToSignalMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalMapping_DataElementIref() {
		return (EReference)senderReceiverToSignalMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalMapping_DataElement() {
		return (EReference)senderReceiverToSignalMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverToSignalGroupMapping() {
		return senderReceiverToSignalGroupMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalGroupMapping_SignalGroup() {
		return (EReference)senderReceiverToSignalGroupMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalGroupMapping_DataElementIref() {
		return (EReference)senderReceiverToSignalGroupMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalGroupMapping_DataElement() {
		return (EReference)senderReceiverToSignalGroupMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverToSignalGroupMapping_TypeMapping() {
		return (EReference)senderReceiverToSignalGroupMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataPrototypeInSystemInstanceRef() {
		return variableDataPrototypeInSystemInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataPrototypeInSystemInstanceRef_ContextComponent() {
		return (EReference)variableDataPrototypeInSystemInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataPrototypeInSystemInstanceRef_ContextPort() {
		return (EReference)variableDataPrototypeInSystemInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataPrototypeInSystemInstanceRef_TargetDataPrototype() {
		return (EReference)variableDataPrototypeInSystemInstanceRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcucValueCollection() {
		return ecucValueCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucValueCollection_EcucValue() {
		return (EReference)ecucValueCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcucValueCollection_EcuExtract() {
		return (EReference)ecucValueCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerCallPoint() {
		return serverCallPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerCallPoint_OperationIref() {
		return (EReference)serverCallPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerCallPoint_Operation() {
		return (EReference)serverCallPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousServerCallPoint() {
		return synchronousServerCallPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInstanceRef() {
		return iInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIInstanceRef_InstanceRef() {
		return (EAttribute)iInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROperationInAtomicSwcInstanceRef() {
		return rOperationInAtomicSwcInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROperationInAtomicSwcInstanceRef_ContextRPort() {
		return (EReference)rOperationInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROperationInAtomicSwcInstanceRef_TargetRequiredOperation() {
		return (EReference)rOperationInAtomicSwcInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPrototypeInCompositionInstanceRef() {
		return portPrototypeInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPrototypeInCompositionInstanceRef_ContextComponent() {
		return (EReference)portPrototypeInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwAddrMethod() {
		return swAddrMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwAddrMethod_MemoryAllocationKeywordPolicy() {
		return (EAttribute)swAddrMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwAddrMethod_SectionInitializationPolicy() {
		return (EAttribute)swAddrMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuMethod() {
		return compuMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompuMethod_CompuInternalToPhys() {
		return (EReference)compuMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstr() {
		return dataConstrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstr_DataConstrRule() {
		return (EReference)dataConstrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataConstr__GetLowerLimitValue() {
		return dataConstrEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataConstr__GetUpperLimitValue() {
		return dataConstrEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstrRule() {
		return dataConstrRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstrRule_InternalConstrs() {
		return (EReference)dataConstrRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalConstrs() {
		return internalConstrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalConstrs_LowerLimit() {
		return (EReference)internalConstrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalConstrs_UpperLimit() {
		return (EReference)internalConstrsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompu() {
		return compuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompu_CompuScale() {
		return (EReference)compuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimit() {
		return limitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Value() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuScale() {
		return compuScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompuScale_Symbol() {
		return (EAttribute)compuScaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompuScale_LowerLimit() {
		return (EReference)compuScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompuScale_ShortLabel() {
		return (EAttribute)compuScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompuScale_UpperLimit() {
		return (EReference)compuScaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompuScale_CompuConst() {
		return (EReference)compuScaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuConst() {
		return compuConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompuConst_Vt() {
		return (EAttribute)compuConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyInstanceRef() {
		return anyInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyInstanceRef_ContextElement() {
		return (EReference)anyInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyInstanceRef_Target() {
		return (EReference)anyInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcuAbstractionSwComponentType() {
		return ecuAbstractionSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNvBlockSwComponentType() {
		return nvBlockSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorActuatorSwComponentType() {
		return sensorActuatorSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexDeviceDriverSwComponentType() {
		return complexDeviceDriverSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProxySwComponentType() {
		return serviceProxySwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSwComponentType() {
		return serviceSwComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInCompositionInstanceRef() {
		return portInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInCompositionInstanceRef_ContextComponent() {
		return (EReference)portInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPortInCompositionInstanceRef() {
		return pPortInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPortInCompositionInstanceRef_TargetPPort() {
		return (EReference)pPortInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPortInCompositionInstanceRef() {
		return rPortInCompositionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPortInCompositionInstanceRef_TargetRPort() {
		return (EReference)rPortInCompositionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalBehavior() {
		return internalBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalBehavior_DataTypeMapping() {
		return (EReference)internalBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalBehavior_ExclusiveArea() {
		return (EReference)internalBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalBehavior__GetParent() {
		return internalBehaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcBswRunnableMapping() {
		return swcBswRunnableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcBswRunnableMapping_SwcRunnable() {
		return (EReference)swcBswRunnableMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcBswRunnableMapping_BswEntity() {
		return (EReference)swcBswRunnableMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcBswMapping() {
		return swcBswMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcBswMapping_RunnableMapping() {
		return (EReference)swcBswMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcBswMapping_SwcBehavior() {
		return (EReference)swcBswMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcBswMapping_BswBehavior() {
		return (EReference)swcBswMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswInternalBehavior() {
		return bswInternalBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_Parent() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_Entity() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_Event() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_Implementation() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_ModeSenderPolicy() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswInternalBehavior_BswSchedulableEntity() {
		return (EReference)bswInternalBehaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswModeSenderPolicy() {
		return bswModeSenderPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModeSenderPolicy_ProvidedModeGroup() {
		return (EReference)bswModeSenderPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswModeSenderPolicy_QueueLength() {
		return (EAttribute)bswModeSenderPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_SwcBswMapping() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswImplementation() {
		return bswImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswImplementation_Behavior() {
		return (EReference)bswImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswModuleDescription() {
		return bswModuleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleDescription_InternalBehavior() {
		return (EReference)bswModuleDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleDescription_ProvidedEntry() {
		return (EReference)bswModuleDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleDescription_ProvidedModeGroup() {
		return (EReference)bswModuleDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleDescription_RequiredModeGroup() {
		return (EReference)bswModuleDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswModuleDescription__GetEnableInternalBehavior() {
		return bswModuleDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswModuleEntry() {
		return bswModuleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswModuleEntry_ServiceId() {
		return (EAttribute)bswModuleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswModuleEntry_CallType() {
		return (EAttribute)bswModuleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswModuleEntry_ExecutionContext() {
		return (EAttribute)bswModuleEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswModuleEntity() {
		return bswModuleEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleEntity_ImplementedEntry() {
		return (EReference)bswModuleEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleEntity_Parent() {
		return (EReference)bswModuleEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleEntity_AccessedModeGroup() {
		return (EReference)bswModuleEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModuleEntity_ManagedModeGroup() {
		return (EReference)bswModuleEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswSchedulableEntity() {
		return bswSchedulableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswSchedulableEntity_Event() {
		return (EReference)bswSchedulableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswEvent() {
		return bswEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswEvent_StartsOnEvent() {
		return (EReference)bswEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswEvent_Config() {
		return (EReference)bswEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswEvent_Parent() {
		return (EReference)bswEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswEvent_DisabledInMode() {
		return (EReference)bswEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswModeSwitchEvent() {
		return bswModeSwitchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswModeSwitchEvent_Activation() {
		return (EAttribute)bswModeSwitchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswModeSwitchEvent_ModeIref() {
		return (EReference)bswModeSwitchEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeInBswModuleDescriptionInstanceRef() {
		return modeInBswModuleDescriptionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeInBswModuleDescriptionInstanceRef_ContextModeDeclarationGroup() {
		return (EReference)modeInBswModuleDescriptionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeInBswModuleDescriptionInstanceRef_TargetMode() {
		return (EReference)modeInBswModuleDescriptionInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeActivationKind() {
		return modeActivationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswTimingEvent() {
		return bswTimingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswTimingEvent_Period() {
		return (EAttribute)bswTimingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswBackgroundEvent() {
		return bswBackgroundEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswCalledEntity() {
		return bswCalledEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswInterruptEntity() {
		return bswInterruptEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBswInterruptEntity_InterruptSource() {
		return (EAttribute)bswInterruptEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationDataTypeElement() {
		return implementationDataTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataTypeElement_ArraySize() {
		return (EAttribute)implementationDataTypeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataTypeElement_ArraySizeSemantics() {
		return (EAttribute)implementationDataTypeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataTypeElement_SubElement() {
		return (EReference)implementationDataTypeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataTypeElement_SwDataDefProps() {
		return (EReference)implementationDataTypeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementationDataTypeElement__IsRedefinitionType() {
		return implementationDataTypeElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSignalGroup() {
		return systemSignalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSignalGroup_SystemSignal() {
		return (EReference)systemSignalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISignalGroup() {
		return iSignalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignalGroup_SystemSignalGroup() {
		return (EReference)iSignalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISignalGroup_ISignal() {
		return (EReference)iSignalGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderRecCompositeTypeMapping() {
		return senderRecCompositeTypeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderRecRecordTypeMapping() {
		return senderRecRecordTypeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecRecordTypeMapping_RecordElementMapping() {
		return (EReference)senderRecRecordTypeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderRecRecordElementMapping() {
		return senderRecRecordElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecRecordElementMapping_ImplementationRecordElement() {
		return (EReference)senderRecRecordElementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecRecordElementMapping_ComplexTypeMapping() {
		return (EReference)senderRecRecordElementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecRecordElementMapping_SystemSignal() {
		return (EReference)senderRecRecordElementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderRecArrayTypeMapping() {
		return senderRecArrayTypeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecArrayTypeMapping_ArrayElementMapping() {
		return (EReference)senderRecArrayTypeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexedArrayElement() {
		return indexedArrayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexedArrayElement_ImplementationArrayElement() {
		return (EReference)indexedArrayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexedArrayElement_Index() {
		return (EAttribute)indexedArrayElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderRecArrayElementMapping() {
		return senderRecArrayElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecArrayElementMapping_IndexedArrayElement() {
		return (EReference)senderRecArrayElementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecArrayElementMapping_ComplexTypeMapping() {
		return (EReference)senderRecArrayElementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderRecArrayElementMapping_SystemSignal() {
		return (EReference)senderRecArrayElementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwPointerTargetProps() {
		return swPointerTargetPropsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwPointerTargetProps_TargetCategory() {
		return (EAttribute)swPointerTargetPropsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwPointerTargetProps_SwDataDefProps() {
		return (EReference)swPointerTargetPropsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArgumentDirectionEnum() {
		return argumentDirectionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataFilterTypeEnum() {
		return dataFilterTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHandleInvalidEnum() {
		return handleInvalidEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwImplPolicyEnum() {
		return swImplPolicyEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryAllocationKeywordPolicyType() {
		return memoryAllocationKeywordPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEcucConfigurationVariantEnum() {
		return ecucConfigurationVariantEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBswCallTypeEnum() {
		return bswCallTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBswExecutionContextEnum() {
		return bswExecutionContextEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArraySizeSemanticsEnum() {
		return arraySizeSemanticsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumerical() {
		return numericalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedInteger() {
		return unlimitedIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInteger() {
		return positiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeValue() {
		return timeValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRef() {
		return refEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCIdentifier() {
		return cIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerbatimString() {
		return verbatimStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNativeDeclarationString() {
		return nativeDeclarationStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSectionInitializationPolicyType() {
		return sectionInitializationPolicyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCategoryString() {
		return categoryStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBaseTypeEncodingString() {
		return baseTypeEncodingStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRevisionLabelString() {
		return revisionLabelStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignmentType() {
		return alignmentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Factory getM2Factory() {
		return (M2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		m2RootEClass = createEClass(M2_ROOT);
		createEReference(m2RootEClass, M2_ROOT__AUTOSAR);

		autosarEClass = createEClass(AUTOSAR);
		createEAttribute(autosarEClass, AUTOSAR__ID);
		createEReference(autosarEClass, AUTOSAR__AR_PACKAGE);

		arPackageEClass = createEClass(AR_PACKAGE);
		createEReference(arPackageEClass, AR_PACKAGE__ELEMENT);
		createEReference(arPackageEClass, AR_PACKAGE__AR_PACKAGE);

		arElementEClass = createEClass(AR_ELEMENT);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__CATEGORY);

		m2ObjectEClass = createEClass(M2_OBJECT);

		swBaseTypeEClass = createEClass(SW_BASE_TYPE);
		createEAttribute(swBaseTypeEClass, SW_BASE_TYPE__BASE_TYPE_ENCODING);
		createEAttribute(swBaseTypeEClass, SW_BASE_TYPE__BASE_TYPE_SIZE);
		createEAttribute(swBaseTypeEClass, SW_BASE_TYPE__NATIVE_DECLARATION);
		createEOperation(swBaseTypeEClass, SW_BASE_TYPE___GET_UPPER_LIMIT_FOR_UNSIGNED_INTEGER);

		senderReceiverInterfaceEClass = createEClass(SENDER_RECEIVER_INTERFACE);
		createEReference(senderReceiverInterfaceEClass, SENDER_RECEIVER_INTERFACE__DATA_ELEMENT);
		createEReference(senderReceiverInterfaceEClass, SENDER_RECEIVER_INTERFACE__INVALIDATION_POLICY);

		variableDataPrototypeEClass = createEClass(VARIABLE_DATA_PROTOTYPE);
		createEReference(variableDataPrototypeEClass, VARIABLE_DATA_PROTOTYPE__INIT_VALUE);

		referrableEClass = createEClass(REFERRABLE);
		createEAttribute(referrableEClass, REFERRABLE__ID);
		createEAttribute(referrableEClass, REFERRABLE__SHORT_NAME);
		createEAttribute(referrableEClass, REFERRABLE__REFERENCE);

		swComponentTypeEClass = createEClass(SW_COMPONENT_TYPE);
		createEReference(swComponentTypeEClass, SW_COMPONENT_TYPE__PORT);

		portPrototypeEClass = createEClass(PORT_PROTOTYPE);
		createEReference(portPrototypeEClass, PORT_PROTOTYPE__PARENT);
		createEReference(portPrototypeEClass, PORT_PROTOTYPE__PORT_API_OPTION);

		atomicSwComponentTypeEClass = createEClass(ATOMIC_SW_COMPONENT_TYPE);
		createEReference(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS);
		createEOperation(atomicSwComponentTypeEClass, ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS);

		applicationSwComponentTypeEClass = createEClass(APPLICATION_SW_COMPONENT_TYPE);

		rPortPrototypeEClass = createEClass(RPORT_PROTOTYPE);
		createEReference(rPortPrototypeEClass, RPORT_PROTOTYPE__REQUIRED_INTERFACE);
		createEReference(rPortPrototypeEClass, RPORT_PROTOTYPE__REQUIRED_COM_SPEC);
		createEOperation(rPortPrototypeEClass, RPORT_PROTOTYPE___GET_USING_DATA_TYPES);

		pPortPrototypeEClass = createEClass(PPORT_PROTOTYPE);
		createEReference(pPortPrototypeEClass, PPORT_PROTOTYPE__PROVIDED_INTERFACE);
		createEReference(pPortPrototypeEClass, PPORT_PROTOTYPE__PROVIDED_COM_SPEC);
		createEOperation(pPortPrototypeEClass, PPORT_PROTOTYPE___GET_USING_DATA_TYPES);

		swcInternalBehaviorEClass = createEClass(SWC_INTERNAL_BEHAVIOR);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__RUNNABLE);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__EVENT);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__PARENT);
		createEReference(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__APPLICATIONDATATYPE);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_REFERENCER_INCLUDED_DATA_TYPE_SETS__IMPLEMENTATIONDATATYPE);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_USING_DATA_TYPES);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPE__APPLICATIONDATATYPE);
		createEOperation(swcInternalBehaviorEClass, SWC_INTERNAL_BEHAVIOR___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE);

		executableEntityEClass = createEClass(EXECUTABLE_ENTITY);
		createEReference(executableEntityEClass, EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA);
		createEReference(executableEntityEClass, EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA);
		createEReference(executableEntityEClass, EXECUTABLE_ENTITY__SW_ADDR_METHOD);

		runnableEntityEClass = createEClass(RUNNABLE_ENTITY);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__DATA_SEND_POINT);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__SERVER_CALL_POINT);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__EVENT);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__PARENT);
		createEAttribute(runnableEntityEClass, RUNNABLE_ENTITY__SYMBOL);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE);
		createEReference(runnableEntityEClass, RUNNABLE_ENTITY__READ_LOCAL_VARIABLE);

		variableAccessEClass = createEClass(VARIABLE_ACCESS);
		createEReference(variableAccessEClass, VARIABLE_ACCESS__ACCESSED_VARIABLE);

		autosarVariableRefEClass = createEClass(AUTOSAR_VARIABLE_REF);
		createEReference(autosarVariableRefEClass, AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF);
		createEReference(autosarVariableRefEClass, AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE);
		createEReference(autosarVariableRefEClass, AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE);

		variableInAtomicSwcTypeInstanceRefEClass = createEClass(VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF);
		createEReference(variableInAtomicSwcTypeInstanceRefEClass, VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__PORT_PROTOTYPE);
		createEReference(variableInAtomicSwcTypeInstanceRefEClass, VARIABLE_IN_ATOMIC_SWC_TYPE_INSTANCE_REF__TARGET_DATA_PROTOTYPE);

		rteEventEClass = createEClass(RTE_EVENT);
		createEReference(rteEventEClass, RTE_EVENT__START_ON_EVENT);
		createEReference(rteEventEClass, RTE_EVENT__CONFIG);

		timingEventEClass = createEClass(TIMING_EVENT);
		createEAttribute(timingEventEClass, TIMING_EVENT__PERIOD);

		backgroundEventEClass = createEClass(BACKGROUND_EVENT);

		dataSendCompletedEventEClass = createEClass(DATA_SEND_COMPLETED_EVENT);
		createEReference(dataSendCompletedEventEClass, DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE);
		createEReference(dataSendCompletedEventEClass, DATA_SEND_COMPLETED_EVENT__EVENT_SOURCE_DATA);

		dataReceivedEventEClass = createEClass(DATA_RECEIVED_EVENT);
		createEReference(dataReceivedEventEClass, DATA_RECEIVED_EVENT__DATA_IREF);
		createEReference(dataReceivedEventEClass, DATA_RECEIVED_EVENT__DATA);

		dataReceiveErrorEventEClass = createEClass(DATA_RECEIVE_ERROR_EVENT);
		createEReference(dataReceiveErrorEventEClass, DATA_RECEIVE_ERROR_EVENT__DATA_IREF);
		createEReference(dataReceiveErrorEventEClass, DATA_RECEIVE_ERROR_EVENT__DATA);

		rVariableInAtomicSwcInstanceRefEClass = createEClass(RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF);
		createEReference(rVariableInAtomicSwcInstanceRefEClass, RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT);
		createEReference(rVariableInAtomicSwcInstanceRefEClass, RVARIABLE_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_DATA_ELEMENT);

		ecucModuleConfigurationValuesEClass = createEClass(ECUC_MODULE_CONFIGURATION_VALUES);
		createEAttribute(ecucModuleConfigurationValuesEClass, ECUC_MODULE_CONFIGURATION_VALUES__DEFINITION_REF);
		createEAttribute(ecucModuleConfigurationValuesEClass, ECUC_MODULE_CONFIGURATION_VALUES__ECUC_DEF_EDITION);
		createEAttribute(ecucModuleConfigurationValuesEClass, ECUC_MODULE_CONFIGURATION_VALUES__IMPLEMENTATION_CONFIG_VARIANT);
		createEReference(ecucModuleConfigurationValuesEClass, ECUC_MODULE_CONFIGURATION_VALUES__CONTAINER);

		ecucContainerValueEClass = createEClass(ECUC_CONTAINER_VALUE);
		createEAttribute(ecucContainerValueEClass, ECUC_CONTAINER_VALUE__DEFINITION_REF);
		createEReference(ecucContainerValueEClass, ECUC_CONTAINER_VALUE__PARAMETER_VALUE);
		createEReference(ecucContainerValueEClass, ECUC_CONTAINER_VALUE__REFERENCE_VALUE);
		createEReference(ecucContainerValueEClass, ECUC_CONTAINER_VALUE__SUB_CONTAINER);

		ecucParameterValueEClass = createEClass(ECUC_PARAMETER_VALUE);
		createEAttribute(ecucParameterValueEClass, ECUC_PARAMETER_VALUE__DEFINITION_REF);

		ecucNumericalParamValueEClass = createEClass(ECUC_NUMERICAL_PARAM_VALUE);
		createEAttribute(ecucNumericalParamValueEClass, ECUC_NUMERICAL_PARAM_VALUE__VALUE);

		ecucTextualParamValueEClass = createEClass(ECUC_TEXTUAL_PARAM_VALUE);
		createEAttribute(ecucTextualParamValueEClass, ECUC_TEXTUAL_PARAM_VALUE__VALUE);

		ecucAbstractReferenceValueEClass = createEClass(ECUC_ABSTRACT_REFERENCE_VALUE);
		createEAttribute(ecucAbstractReferenceValueEClass, ECUC_ABSTRACT_REFERENCE_VALUE__DEFINITION_REF);

		ecucReferenceValueEClass = createEClass(ECUC_REFERENCE_VALUE);
		createEReference(ecucReferenceValueEClass, ECUC_REFERENCE_VALUE__VALUE);

		ecucInstanceReferenceValueEClass = createEClass(ECUC_INSTANCE_REFERENCE_VALUE);
		createEReference(ecucInstanceReferenceValueEClass, ECUC_INSTANCE_REFERENCE_VALUE__VALUE_IREF);
		createEReference(ecucInstanceReferenceValueEClass, ECUC_INSTANCE_REFERENCE_VALUE__VALUE);

		rPortComSpecEClass = createEClass(RPORT_COM_SPEC);

		pPortComSpecEClass = createEClass(PPORT_COM_SPEC);

		receiverComSpecEClass = createEClass(RECEIVER_COM_SPEC);
		createEReference(receiverComSpecEClass, RECEIVER_COM_SPEC__DATA_ELEMENT);

		senderComSpecEClass = createEClass(SENDER_COM_SPEC);
		createEReference(senderComSpecEClass, SENDER_COM_SPEC__DATA_ELEMENT);
		createEReference(senderComSpecEClass, SENDER_COM_SPEC__TRANSMISSION_ACKNOWLEDGE);

		transmissionAcknowledgementRequestEClass = createEClass(TRANSMISSION_ACKNOWLEDGEMENT_REQUEST);
		createEAttribute(transmissionAcknowledgementRequestEClass, TRANSMISSION_ACKNOWLEDGEMENT_REQUEST__TIMEOUT);

		nonqueuedSenderComSpecEClass = createEClass(NONQUEUED_SENDER_COM_SPEC);
		createEReference(nonqueuedSenderComSpecEClass, NONQUEUED_SENDER_COM_SPEC__INIT_VALUE);

		queuedSenderComSpecEClass = createEClass(QUEUED_SENDER_COM_SPEC);

		nonqueuedReceiverComSpecEClass = createEClass(NONQUEUED_RECEIVER_COM_SPEC);
		createEAttribute(nonqueuedReceiverComSpecEClass, NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT);
		createEReference(nonqueuedReceiverComSpecEClass, NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE);
		createEReference(nonqueuedReceiverComSpecEClass, NONQUEUED_RECEIVER_COM_SPEC__FILTER);

		portInterfaceEClass = createEClass(PORT_INTERFACE);

		compositionSwComponentTypeEClass = createEClass(COMPOSITION_SW_COMPONENT_TYPE);
		createEReference(compositionSwComponentTypeEClass, COMPOSITION_SW_COMPONENT_TYPE__COMPONENT);
		createEReference(compositionSwComponentTypeEClass, COMPOSITION_SW_COMPONENT_TYPE__CONNECTOR);

		swConnectorEClass = createEClass(SW_CONNECTOR);

		assemblySwConnectorEClass = createEClass(ASSEMBLY_SW_CONNECTOR);
		createEReference(assemblySwConnectorEClass, ASSEMBLY_SW_CONNECTOR__REQUESTER);
		createEReference(assemblySwConnectorEClass, ASSEMBLY_SW_CONNECTOR__PROVIDER);
		createEReference(assemblySwConnectorEClass, ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF);
		createEReference(assemblySwConnectorEClass, ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF);

		delegationSwConnectorEClass = createEClass(DELEGATION_SW_CONNECTOR);
		createEReference(delegationSwConnectorEClass, DELEGATION_SW_CONNECTOR__INNER_PORT);
		createEReference(delegationSwConnectorEClass, DELEGATION_SW_CONNECTOR__OUTER_PORT);
		createEReference(delegationSwConnectorEClass, DELEGATION_SW_CONNECTOR__INNER_PORT_IREF);

		portPrototypeInCompositionInstanceRefEClass = createEClass(PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF);
		createEReference(portPrototypeInCompositionInstanceRefEClass, PORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT);

		rPortPrototypeInCompositionInstanceRefEClass = createEClass(RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF);
		createEReference(rPortPrototypeInCompositionInstanceRefEClass, RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT);

		pPortPrototypeInCompositionInstanceRefEClass = createEClass(PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF);
		createEReference(pPortPrototypeInCompositionInstanceRefEClass, PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT);

		swComponentPrototypeEClass = createEClass(SW_COMPONENT_PROTOTYPE);
		createEReference(swComponentPrototypeEClass, SW_COMPONENT_PROTOTYPE__TYPE);
		createEReference(swComponentPrototypeEClass, SW_COMPONENT_PROTOTYPE__INSTANCE);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		autosarDataTypeEClass = createEClass(AUTOSAR_DATA_TYPE);
		createEReference(autosarDataTypeEClass, AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS);
		createEReference(autosarDataTypeEClass, AUTOSAR_DATA_TYPE__INVALID_VALUE);
		createEReference(autosarDataTypeEClass, AUTOSAR_DATA_TYPE__COMPU_METHOD);
		createEReference(autosarDataTypeEClass, AUTOSAR_DATA_TYPE__DATA_CONSTR);
		createEReference(autosarDataTypeEClass, AUTOSAR_DATA_TYPE__SW_ADDR_METHOD);
		createEOperation(autosarDataTypeEClass, AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY);

		applicationDataTypeEClass = createEClass(APPLICATION_DATA_TYPE);

		implementationDataTypeEClass = createEClass(IMPLEMENTATION_DATA_TYPE);
		createEReference(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__SUB_ELEMENT);
		createEReference(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__BASE_TYPE);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__SW_ALIGNMENT);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___GET_LEAF_IMPLEMENTATION_DATA_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_PRIMITIVE_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_POINTER_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_ARRAY_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_STRUCT_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_UNION_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_REDEFINITION_TYPE);
		createEOperation(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE___IS_COMPLEX_TYPE);

		implementationDataTypeElementEClass = createEClass(IMPLEMENTATION_DATA_TYPE_ELEMENT);
		createEAttribute(implementationDataTypeElementEClass, IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE);
		createEAttribute(implementationDataTypeElementEClass, IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE_SEMANTICS);
		createEReference(implementationDataTypeElementEClass, IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT);
		createEReference(implementationDataTypeElementEClass, IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS);
		createEOperation(implementationDataTypeElementEClass, IMPLEMENTATION_DATA_TYPE_ELEMENT___IS_REDEFINITION_TYPE);

		swDataDefPropsEClass = createEClass(SW_DATA_DEF_PROPS);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__INVALID_VALUE);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__BASE_TYPE);
		createEAttribute(swDataDefPropsEClass, SW_DATA_DEF_PROPS__SW_IMPL_POLICY);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__SW_ADDR_METHOD);
		createEAttribute(swDataDefPropsEClass, SW_DATA_DEF_PROPS__SW_ALIGNMENT);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__COMPU_METHOD);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__DATA_CONSTR);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE);
		createEReference(swDataDefPropsEClass, SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS);

		dataTypeMapEClass = createEClass(DATA_TYPE_MAP);
		createEReference(dataTypeMapEClass, DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE);
		createEReference(dataTypeMapEClass, DATA_TYPE_MAP__APPLICATION_DATA_TYPE);

		dataTypeMappingSetEClass = createEClass(DATA_TYPE_MAPPING_SET);
		createEReference(dataTypeMappingSetEClass, DATA_TYPE_MAPPING_SET__DATA_TYPE_MAP);
		createEReference(dataTypeMappingSetEClass, DATA_TYPE_MAPPING_SET__MODE_REQUEST_TYPE_MAP);

		modeDeclarationGroupPrototypeEClass = createEClass(MODE_DECLARATION_GROUP_PROTOTYPE);
		createEReference(modeDeclarationGroupPrototypeEClass, MODE_DECLARATION_GROUP_PROTOTYPE__TYPE);

		modeRequestTypeMapEClass = createEClass(MODE_REQUEST_TYPE_MAP);
		createEReference(modeRequestTypeMapEClass, MODE_REQUEST_TYPE_MAP__IMPLEMENTATION_DATA_TYPE);
		createEReference(modeRequestTypeMapEClass, MODE_REQUEST_TYPE_MAP__MODE_GROUP);

		modeDeclarationEClass = createEClass(MODE_DECLARATION);

		modeDeclarationGroupEClass = createEClass(MODE_DECLARATION_GROUP);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__INITIAL_MODE);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__MODE_DECLARATION);

		applicationPrimitiveDataTypeEClass = createEClass(APPLICATION_PRIMITIVE_DATA_TYPE);

		autosarDataPrototypeEClass = createEClass(AUTOSAR_DATA_PROTOTYPE);
		createEOperation(autosarDataPrototypeEClass, AUTOSAR_DATA_PROTOTYPE___GET_SW_ADDR_METHOD);
		createEOperation(autosarDataPrototypeEClass, AUTOSAR_DATA_PROTOTYPE___GET_SW_ALIGNMENT);
		createEOperation(autosarDataPrototypeEClass, AUTOSAR_DATA_PROTOTYPE___GET_APPLICATION_DATA_TYPE);
		createEOperation(autosarDataPrototypeEClass, AUTOSAR_DATA_PROTOTYPE___GET_IMPLEMENTATION_DATA_TYPE);

		dataPrototypeEClass = createEClass(DATA_PROTOTYPE);
		createEReference(dataPrototypeEClass, DATA_PROTOTYPE__SW_DATA_DEF_PROPS);
		createEReference(dataPrototypeEClass, DATA_PROTOTYPE__SW_ADDR_METHOD);
		createEAttribute(dataPrototypeEClass, DATA_PROTOTYPE__SW_ALIGNMENT);
		createEReference(dataPrototypeEClass, DATA_PROTOTYPE__TYPE);
		createEOperation(dataPrototypeEClass, DATA_PROTOTYPE___GET_SW_IMPL_POLICY);

		exclusiveAreaEClass = createEClass(EXCLUSIVE_AREA);
		createEReference(exclusiveAreaEClass, EXCLUSIVE_AREA__SWC_CONFIG);
		createEReference(exclusiveAreaEClass, EXCLUSIVE_AREA__BSW_CONFIG);
		createEReference(exclusiveAreaEClass, EXCLUSIVE_AREA__PARENT);
		createEReference(exclusiveAreaEClass, EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY);

		numericalValueSpecificationEClass = createEClass(NUMERICAL_VALUE_SPECIFICATION);
		createEAttribute(numericalValueSpecificationEClass, NUMERICAL_VALUE_SPECIFICATION__VALUE);

		textValueSpecificationEClass = createEClass(TEXT_VALUE_SPECIFICATION);
		createEAttribute(textValueSpecificationEClass, TEXT_VALUE_SPECIFICATION__VALUE);

		constantReferenceEClass = createEClass(CONSTANT_REFERENCE);
		createEReference(constantReferenceEClass, CONSTANT_REFERENCE__CONSTANT);
		createEOperation(constantReferenceEClass, CONSTANT_REFERENCE___GET_END_VALUE_SPEC);

		referenceValueSpecificationEClass = createEClass(REFERENCE_VALUE_SPECIFICATION);

		arrayValueSpecificationEClass = createEClass(ARRAY_VALUE_SPECIFICATION);
		createEReference(arrayValueSpecificationEClass, ARRAY_VALUE_SPECIFICATION__ELEMENT);

		recordValueSpecificationEClass = createEClass(RECORD_VALUE_SPECIFICATION);
		createEReference(recordValueSpecificationEClass, RECORD_VALUE_SPECIFICATION__FIELD);

		applicationValueSpecificationEClass = createEClass(APPLICATION_VALUE_SPECIFICATION);

		constantSpecificationEClass = createEClass(CONSTANT_SPECIFICATION);
		createEReference(constantSpecificationEClass, CONSTANT_SPECIFICATION__VALUE_SPEC);

		operationInvokedEventEClass = createEClass(OPERATION_INVOKED_EVENT);
		createEReference(operationInvokedEventEClass, OPERATION_INVOKED_EVENT__OPERATION_IREF);
		createEReference(operationInvokedEventEClass, OPERATION_INVOKED_EVENT__OPERATION);

		pOperationInAtomicSwcInstanceRefEClass = createEClass(POPERATION_IN_ATOMIC_SWC_INSTANCE_REF);
		createEReference(pOperationInAtomicSwcInstanceRefEClass, POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT);
		createEReference(pOperationInAtomicSwcInstanceRefEClass, POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION);

		clientServerInterfaceEClass = createEClass(CLIENT_SERVER_INTERFACE);
		createEReference(clientServerInterfaceEClass, CLIENT_SERVER_INTERFACE__OPERATION);
		createEReference(clientServerInterfaceEClass, CLIENT_SERVER_INTERFACE__POSSIBLE_ERROR);

		clientServerOperationEClass = createEClass(CLIENT_SERVER_OPERATION);
		createEReference(clientServerOperationEClass, CLIENT_SERVER_OPERATION__POSSIBLE_ERROR);
		createEReference(clientServerOperationEClass, CLIENT_SERVER_OPERATION__ARGUMENT);

		applicationErrorEClass = createEClass(APPLICATION_ERROR);
		createEAttribute(applicationErrorEClass, APPLICATION_ERROR__ERROR_CODE);
		createEReference(applicationErrorEClass, APPLICATION_ERROR__PARENT);

		argumentDataPrototypeEClass = createEClass(ARGUMENT_DATA_PROTOTYPE);
		createEAttribute(argumentDataPrototypeEClass, ARGUMENT_DATA_PROTOTYPE__DIRECTION);

		dataFilterEClass = createEClass(DATA_FILTER);
		createEAttribute(dataFilterEClass, DATA_FILTER__DATA_FILTER_TYPE);
		createEAttribute(dataFilterEClass, DATA_FILTER__MASK);
		createEAttribute(dataFilterEClass, DATA_FILTER__MAX);
		createEAttribute(dataFilterEClass, DATA_FILTER__MIN);
		createEAttribute(dataFilterEClass, DATA_FILTER__OFFSET);
		createEAttribute(dataFilterEClass, DATA_FILTER__PERIOD);
		createEAttribute(dataFilterEClass, DATA_FILTER__X);
		createEOperation(dataFilterEClass, DATA_FILTER___IS_FILTER_ENABLED);
		createEOperation(dataFilterEClass, DATA_FILTER___IS_COMPATIBLE_WITH__DATAFILTER);

		queuedReceiverComSpecEClass = createEClass(QUEUED_RECEIVER_COM_SPEC);
		createEAttribute(queuedReceiverComSpecEClass, QUEUED_RECEIVER_COM_SPEC__QUEUE_LENGTH);

		invalidationPolicyEClass = createEClass(INVALIDATION_POLICY);
		createEReference(invalidationPolicyEClass, INVALIDATION_POLICY__DATA_ELEMENT);
		createEAttribute(invalidationPolicyEClass, INVALIDATION_POLICY__HANDLE_INVALID);
		createEOperation(invalidationPolicyEClass, INVALIDATION_POLICY___IS_INVALIDATION_ENABLED);
		createEOperation(invalidationPolicyEClass, INVALIDATION_POLICY___IS_INVALIDATION_KEEP);
		createEOperation(invalidationPolicyEClass, INVALIDATION_POLICY___IS_INVALIDATION_REPLACE);

		portApiOptionEClass = createEClass(PORT_API_OPTION);
		createEReference(portApiOptionEClass, PORT_API_OPTION__PORT_ARG_VALUE);
		createEReference(portApiOptionEClass, PORT_API_OPTION__PORT);
		createEAttribute(portApiOptionEClass, PORT_API_OPTION__ENABLE_TAKE_ADDRESS);

		portDefinedArgumentValueEClass = createEClass(PORT_DEFINED_ARGUMENT_VALUE);
		createEReference(portDefinedArgumentValueEClass, PORT_DEFINED_ARGUMENT_VALUE__VALUE);
		createEReference(portDefinedArgumentValueEClass, PORT_DEFINED_ARGUMENT_VALUE__VALUE_TYPE);
		createEReference(portDefinedArgumentValueEClass, PORT_DEFINED_ARGUMENT_VALUE__PARENT);

		includedDataTypeSetEClass = createEClass(INCLUDED_DATA_TYPE_SET);
		createEAttribute(includedDataTypeSetEClass, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX);
		createEReference(includedDataTypeSetEClass, INCLUDED_DATA_TYPE_SET__DATA_TYPE);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ROOT_SOFTWARE_COMPOSITION);
		createEReference(systemEClass, SYSTEM__MAPPING);

		rootSwCompositionPrototypeEClass = createEClass(ROOT_SW_COMPOSITION_PROTOTYPE);
		createEReference(rootSwCompositionPrototypeEClass, ROOT_SW_COMPOSITION_PROTOTYPE__SOFTWARE_COMPOSITION);

		systemMappingEClass = createEClass(SYSTEM_MAPPING);
		createEReference(systemMappingEClass, SYSTEM_MAPPING__DATA_MAPPING);

		dataMappingEClass = createEClass(DATA_MAPPING);

		systemSignalEClass = createEClass(SYSTEM_SIGNAL);

		iSignalEClass = createEClass(ISIGNAL);
		createEReference(iSignalEClass, ISIGNAL__SYSTEM_SIGNAL);

		iSignalIPduEClass = createEClass(ISIGNAL_IPDU);
		createEReference(iSignalIPduEClass, ISIGNAL_IPDU__ISIGNAL_TO_PDU_MAPPING);

		iSignalToIPduMappingEClass = createEClass(ISIGNAL_TO_IPDU_MAPPING);
		createEReference(iSignalToIPduMappingEClass, ISIGNAL_TO_IPDU_MAPPING__ISIGNAL);
		createEReference(iSignalToIPduMappingEClass, ISIGNAL_TO_IPDU_MAPPING__ISIGNAL_GROUP);

		senderReceiverToSignalMappingEClass = createEClass(SENDER_RECEIVER_TO_SIGNAL_MAPPING);
		createEReference(senderReceiverToSignalMappingEClass, SENDER_RECEIVER_TO_SIGNAL_MAPPING__SYSTEM_SIGNAL);
		createEReference(senderReceiverToSignalMappingEClass, SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT_IREF);
		createEReference(senderReceiverToSignalMappingEClass, SENDER_RECEIVER_TO_SIGNAL_MAPPING__DATA_ELEMENT);

		senderReceiverToSignalGroupMappingEClass = createEClass(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING);
		createEReference(senderReceiverToSignalGroupMappingEClass, SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP);
		createEReference(senderReceiverToSignalGroupMappingEClass, SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF);
		createEReference(senderReceiverToSignalGroupMappingEClass, SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT);
		createEReference(senderReceiverToSignalGroupMappingEClass, SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING);

		variableDataPrototypeInSystemInstanceRefEClass = createEClass(VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF);
		createEReference(variableDataPrototypeInSystemInstanceRefEClass, VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT);
		createEReference(variableDataPrototypeInSystemInstanceRefEClass, VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT);
		createEReference(variableDataPrototypeInSystemInstanceRefEClass, VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE);

		ecucValueCollectionEClass = createEClass(ECUC_VALUE_COLLECTION);
		createEReference(ecucValueCollectionEClass, ECUC_VALUE_COLLECTION__ECUC_VALUE);
		createEReference(ecucValueCollectionEClass, ECUC_VALUE_COLLECTION__ECU_EXTRACT);

		serverCallPointEClass = createEClass(SERVER_CALL_POINT);
		createEReference(serverCallPointEClass, SERVER_CALL_POINT__OPERATION_IREF);
		createEReference(serverCallPointEClass, SERVER_CALL_POINT__OPERATION);

		synchronousServerCallPointEClass = createEClass(SYNCHRONOUS_SERVER_CALL_POINT);

		iInstanceRefEClass = createEClass(IINSTANCE_REF);
		createEAttribute(iInstanceRefEClass, IINSTANCE_REF__INSTANCE_REF);

		rOperationInAtomicSwcInstanceRefEClass = createEClass(ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF);
		createEReference(rOperationInAtomicSwcInstanceRefEClass, ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT);
		createEReference(rOperationInAtomicSwcInstanceRefEClass, ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION);

		swAddrMethodEClass = createEClass(SW_ADDR_METHOD);
		createEAttribute(swAddrMethodEClass, SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY);
		createEAttribute(swAddrMethodEClass, SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY);

		compuMethodEClass = createEClass(COMPU_METHOD);
		createEReference(compuMethodEClass, COMPU_METHOD__COMPU_INTERNAL_TO_PHYS);

		dataConstrEClass = createEClass(DATA_CONSTR);
		createEReference(dataConstrEClass, DATA_CONSTR__DATA_CONSTR_RULE);
		createEOperation(dataConstrEClass, DATA_CONSTR___GET_LOWER_LIMIT_VALUE);
		createEOperation(dataConstrEClass, DATA_CONSTR___GET_UPPER_LIMIT_VALUE);

		dataConstrRuleEClass = createEClass(DATA_CONSTR_RULE);
		createEReference(dataConstrRuleEClass, DATA_CONSTR_RULE__INTERNAL_CONSTRS);

		internalConstrsEClass = createEClass(INTERNAL_CONSTRS);
		createEReference(internalConstrsEClass, INTERNAL_CONSTRS__LOWER_LIMIT);
		createEReference(internalConstrsEClass, INTERNAL_CONSTRS__UPPER_LIMIT);

		compuEClass = createEClass(COMPU);
		createEReference(compuEClass, COMPU__COMPU_SCALE);

		limitEClass = createEClass(LIMIT);
		createEAttribute(limitEClass, LIMIT__VALUE);

		compuScaleEClass = createEClass(COMPU_SCALE);
		createEReference(compuScaleEClass, COMPU_SCALE__LOWER_LIMIT);
		createEAttribute(compuScaleEClass, COMPU_SCALE__SHORT_LABEL);
		createEAttribute(compuScaleEClass, COMPU_SCALE__SYMBOL);
		createEReference(compuScaleEClass, COMPU_SCALE__UPPER_LIMIT);
		createEReference(compuScaleEClass, COMPU_SCALE__COMPU_CONST);

		compuConstEClass = createEClass(COMPU_CONST);
		createEAttribute(compuConstEClass, COMPU_CONST__VT);

		anyInstanceRefEClass = createEClass(ANY_INSTANCE_REF);
		createEReference(anyInstanceRefEClass, ANY_INSTANCE_REF__CONTEXT_ELEMENT);
		createEReference(anyInstanceRefEClass, ANY_INSTANCE_REF__TARGET);

		ecuAbstractionSwComponentTypeEClass = createEClass(ECU_ABSTRACTION_SW_COMPONENT_TYPE);

		nvBlockSwComponentTypeEClass = createEClass(NV_BLOCK_SW_COMPONENT_TYPE);

		sensorActuatorSwComponentTypeEClass = createEClass(SENSOR_ACTUATOR_SW_COMPONENT_TYPE);

		complexDeviceDriverSwComponentTypeEClass = createEClass(COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE);

		serviceProxySwComponentTypeEClass = createEClass(SERVICE_PROXY_SW_COMPONENT_TYPE);

		serviceSwComponentTypeEClass = createEClass(SERVICE_SW_COMPONENT_TYPE);

		portInCompositionInstanceRefEClass = createEClass(PORT_IN_COMPOSITION_INSTANCE_REF);
		createEReference(portInCompositionInstanceRefEClass, PORT_IN_COMPOSITION_INSTANCE_REF__CONTEXT_COMPONENT);

		pPortInCompositionInstanceRefEClass = createEClass(PPORT_IN_COMPOSITION_INSTANCE_REF);
		createEReference(pPortInCompositionInstanceRefEClass, PPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_PPORT);

		rPortInCompositionInstanceRefEClass = createEClass(RPORT_IN_COMPOSITION_INSTANCE_REF);
		createEReference(rPortInCompositionInstanceRefEClass, RPORT_IN_COMPOSITION_INSTANCE_REF__TARGET_RPORT);

		internalBehaviorEClass = createEClass(INTERNAL_BEHAVIOR);
		createEReference(internalBehaviorEClass, INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING);
		createEReference(internalBehaviorEClass, INTERNAL_BEHAVIOR__EXCLUSIVE_AREA);
		createEOperation(internalBehaviorEClass, INTERNAL_BEHAVIOR___GET_PARENT);

		swcBswRunnableMappingEClass = createEClass(SWC_BSW_RUNNABLE_MAPPING);
		createEReference(swcBswRunnableMappingEClass, SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE);
		createEReference(swcBswRunnableMappingEClass, SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY);

		swcBswMappingEClass = createEClass(SWC_BSW_MAPPING);
		createEReference(swcBswMappingEClass, SWC_BSW_MAPPING__RUNNABLE_MAPPING);
		createEReference(swcBswMappingEClass, SWC_BSW_MAPPING__SWC_BEHAVIOR);
		createEReference(swcBswMappingEClass, SWC_BSW_MAPPING__BSW_BEHAVIOR);

		bswInternalBehaviorEClass = createEClass(BSW_INTERNAL_BEHAVIOR);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__PARENT);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__ENTITY);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__EVENT);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY);
		createEReference(bswInternalBehaviorEClass, BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY);

		bswModeSenderPolicyEClass = createEClass(BSW_MODE_SENDER_POLICY);
		createEReference(bswModeSenderPolicyEClass, BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP);
		createEAttribute(bswModeSenderPolicyEClass, BSW_MODE_SENDER_POLICY__QUEUE_LENGTH);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__SWC_BSW_MAPPING);

		bswImplementationEClass = createEClass(BSW_IMPLEMENTATION);
		createEReference(bswImplementationEClass, BSW_IMPLEMENTATION__BEHAVIOR);

		bswModuleDescriptionEClass = createEClass(BSW_MODULE_DESCRIPTION);
		createEReference(bswModuleDescriptionEClass, BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR);
		createEReference(bswModuleDescriptionEClass, BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY);
		createEReference(bswModuleDescriptionEClass, BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP);
		createEReference(bswModuleDescriptionEClass, BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP);
		createEOperation(bswModuleDescriptionEClass, BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR);

		bswModuleEntryEClass = createEClass(BSW_MODULE_ENTRY);
		createEAttribute(bswModuleEntryEClass, BSW_MODULE_ENTRY__SERVICE_ID);
		createEAttribute(bswModuleEntryEClass, BSW_MODULE_ENTRY__CALL_TYPE);
		createEAttribute(bswModuleEntryEClass, BSW_MODULE_ENTRY__EXECUTION_CONTEXT);

		bswModuleEntityEClass = createEClass(BSW_MODULE_ENTITY);
		createEReference(bswModuleEntityEClass, BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY);
		createEReference(bswModuleEntityEClass, BSW_MODULE_ENTITY__PARENT);
		createEReference(bswModuleEntityEClass, BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP);
		createEReference(bswModuleEntityEClass, BSW_MODULE_ENTITY__MANAGED_MODE_GROUP);

		bswSchedulableEntityEClass = createEClass(BSW_SCHEDULABLE_ENTITY);
		createEReference(bswSchedulableEntityEClass, BSW_SCHEDULABLE_ENTITY__EVENT);

		bswEventEClass = createEClass(BSW_EVENT);
		createEReference(bswEventEClass, BSW_EVENT__STARTS_ON_EVENT);
		createEReference(bswEventEClass, BSW_EVENT__CONFIG);
		createEReference(bswEventEClass, BSW_EVENT__PARENT);
		createEReference(bswEventEClass, BSW_EVENT__DISABLED_IN_MODE);

		bswModeSwitchEventEClass = createEClass(BSW_MODE_SWITCH_EVENT);
		createEAttribute(bswModeSwitchEventEClass, BSW_MODE_SWITCH_EVENT__ACTIVATION);
		createEReference(bswModeSwitchEventEClass, BSW_MODE_SWITCH_EVENT__MODE_IREF);

		modeInBswModuleDescriptionInstanceRefEClass = createEClass(MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF);
		createEReference(modeInBswModuleDescriptionInstanceRefEClass, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP);
		createEReference(modeInBswModuleDescriptionInstanceRefEClass, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE);

		bswTimingEventEClass = createEClass(BSW_TIMING_EVENT);
		createEAttribute(bswTimingEventEClass, BSW_TIMING_EVENT__PERIOD);

		bswBackgroundEventEClass = createEClass(BSW_BACKGROUND_EVENT);

		bswCalledEntityEClass = createEClass(BSW_CALLED_ENTITY);

		bswInterruptEntityEClass = createEClass(BSW_INTERRUPT_ENTITY);
		createEAttribute(bswInterruptEntityEClass, BSW_INTERRUPT_ENTITY__INTERRUPT_SOURCE);

		systemSignalGroupEClass = createEClass(SYSTEM_SIGNAL_GROUP);
		createEReference(systemSignalGroupEClass, SYSTEM_SIGNAL_GROUP__SYSTEM_SIGNAL);

		iSignalGroupEClass = createEClass(ISIGNAL_GROUP);
		createEReference(iSignalGroupEClass, ISIGNAL_GROUP__SYSTEM_SIGNAL_GROUP);
		createEReference(iSignalGroupEClass, ISIGNAL_GROUP__ISIGNAL);

		senderRecCompositeTypeMappingEClass = createEClass(SENDER_REC_COMPOSITE_TYPE_MAPPING);

		senderRecRecordTypeMappingEClass = createEClass(SENDER_REC_RECORD_TYPE_MAPPING);
		createEReference(senderRecRecordTypeMappingEClass, SENDER_REC_RECORD_TYPE_MAPPING__RECORD_ELEMENT_MAPPING);

		senderRecRecordElementMappingEClass = createEClass(SENDER_REC_RECORD_ELEMENT_MAPPING);
		createEReference(senderRecRecordElementMappingEClass, SENDER_REC_RECORD_ELEMENT_MAPPING__IMPLEMENTATION_RECORD_ELEMENT);
		createEReference(senderRecRecordElementMappingEClass, SENDER_REC_RECORD_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING);
		createEReference(senderRecRecordElementMappingEClass, SENDER_REC_RECORD_ELEMENT_MAPPING__SYSTEM_SIGNAL);

		senderRecArrayTypeMappingEClass = createEClass(SENDER_REC_ARRAY_TYPE_MAPPING);
		createEReference(senderRecArrayTypeMappingEClass, SENDER_REC_ARRAY_TYPE_MAPPING__ARRAY_ELEMENT_MAPPING);

		indexedArrayElementEClass = createEClass(INDEXED_ARRAY_ELEMENT);
		createEReference(indexedArrayElementEClass, INDEXED_ARRAY_ELEMENT__IMPLEMENTATION_ARRAY_ELEMENT);
		createEAttribute(indexedArrayElementEClass, INDEXED_ARRAY_ELEMENT__INDEX);

		senderRecArrayElementMappingEClass = createEClass(SENDER_REC_ARRAY_ELEMENT_MAPPING);
		createEReference(senderRecArrayElementMappingEClass, SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT);
		createEReference(senderRecArrayElementMappingEClass, SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING);
		createEReference(senderRecArrayElementMappingEClass, SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL);

		swPointerTargetPropsEClass = createEClass(SW_POINTER_TARGET_PROPS);
		createEAttribute(swPointerTargetPropsEClass, SW_POINTER_TARGET_PROPS__TARGET_CATEGORY);
		createEReference(swPointerTargetPropsEClass, SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS);

		// Create enums
		arraySizeSemanticsEnumEEnum = createEEnum(ARRAY_SIZE_SEMANTICS_ENUM);
		argumentDirectionEnumEEnum = createEEnum(ARGUMENT_DIRECTION_ENUM);
		dataFilterTypeEnumEEnum = createEEnum(DATA_FILTER_TYPE_ENUM);
		handleInvalidEnumEEnum = createEEnum(HANDLE_INVALID_ENUM);
		swImplPolicyEnumEEnum = createEEnum(SW_IMPL_POLICY_ENUM);
		memoryAllocationKeywordPolicyTypeEEnum = createEEnum(MEMORY_ALLOCATION_KEYWORD_POLICY_TYPE);
		ecucConfigurationVariantEnumEEnum = createEEnum(ECUC_CONFIGURATION_VARIANT_ENUM);
		modeActivationKindEEnum = createEEnum(MODE_ACTIVATION_KIND);
		bswCallTypeEnumEEnum = createEEnum(BSW_CALL_TYPE_ENUM);
		bswExecutionContextEnumEEnum = createEEnum(BSW_EXECUTION_CONTEXT_ENUM);

		// Create data types
		numericalEDataType = createEDataType(NUMERICAL);
		integerEDataType = createEDataType(INTEGER);
		unlimitedIntegerEDataType = createEDataType(UNLIMITED_INTEGER);
		positiveIntegerEDataType = createEDataType(POSITIVE_INTEGER);
		timeValueEDataType = createEDataType(TIME_VALUE);
		refEDataType = createEDataType(REF);
		cIdentifierEDataType = createEDataType(CIDENTIFIER);
		identifierEDataType = createEDataType(IDENTIFIER);
		verbatimStringEDataType = createEDataType(VERBATIM_STRING);
		floatEDataType = createEDataType(FLOAT);
		nativeDeclarationStringEDataType = createEDataType(NATIVE_DECLARATION_STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		sectionInitializationPolicyTypeEDataType = createEDataType(SECTION_INITIALIZATION_POLICY_TYPE);
		categoryStringEDataType = createEDataType(CATEGORY_STRING);
		stringEDataType = createEDataType(STRING);
		baseTypeEncodingStringEDataType = createEDataType(BASE_TYPE_ENCODING_STRING);
		revisionLabelStringEDataType = createEDataType(REVISION_LABEL_STRING);
		alignmentTypeEDataType = createEDataType(ALIGNMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		EcucPackage theEcucPackage = (EcucPackage)EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		autosarEClass.getESuperTypes().add(this.getM2Object());
		arPackageEClass.getESuperTypes().add(this.getIdentifiable());
		arElementEClass.getESuperTypes().add(this.getIdentifiable());
		identifiableEClass.getESuperTypes().add(this.getReferrable());
		swBaseTypeEClass.getESuperTypes().add(this.getArElement());
		senderReceiverInterfaceEClass.getESuperTypes().add(this.getPortInterface());
		variableDataPrototypeEClass.getESuperTypes().add(this.getAutosarDataPrototype());
		referrableEClass.getESuperTypes().add(this.getM2Object());
		swComponentTypeEClass.getESuperTypes().add(this.getArElement());
		portPrototypeEClass.getESuperTypes().add(this.getIdentifiable());
		atomicSwComponentTypeEClass.getESuperTypes().add(this.getSwComponentType());
		applicationSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		rPortPrototypeEClass.getESuperTypes().add(this.getPortPrototype());
		pPortPrototypeEClass.getESuperTypes().add(this.getPortPrototype());
		swcInternalBehaviorEClass.getESuperTypes().add(this.getIdentifiable());
		swcInternalBehaviorEClass.getESuperTypes().add(this.getInternalBehavior());
		executableEntityEClass.getESuperTypes().add(this.getIdentifiable());
		runnableEntityEClass.getESuperTypes().add(this.getExecutableEntity());
		variableAccessEClass.getESuperTypes().add(this.getIdentifiable());
		autosarVariableRefEClass.getESuperTypes().add(this.getM2Object());
		variableInAtomicSwcTypeInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		variableInAtomicSwcTypeInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		rteEventEClass.getESuperTypes().add(this.getIdentifiable());
		timingEventEClass.getESuperTypes().add(this.getRteEvent());
		backgroundEventEClass.getESuperTypes().add(this.getRteEvent());
		dataSendCompletedEventEClass.getESuperTypes().add(this.getRteEvent());
		dataReceivedEventEClass.getESuperTypes().add(this.getRteEvent());
		dataReceiveErrorEventEClass.getESuperTypes().add(this.getRteEvent());
		rVariableInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		rVariableInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		ecucModuleConfigurationValuesEClass.getESuperTypes().add(this.getArElement());
		ecucContainerValueEClass.getESuperTypes().add(this.getIdentifiable());
		ecucParameterValueEClass.getESuperTypes().add(this.getM2Object());
		ecucNumericalParamValueEClass.getESuperTypes().add(this.getEcucParameterValue());
		ecucTextualParamValueEClass.getESuperTypes().add(this.getEcucParameterValue());
		ecucAbstractReferenceValueEClass.getESuperTypes().add(this.getM2Object());
		ecucReferenceValueEClass.getESuperTypes().add(this.getEcucAbstractReferenceValue());
		ecucInstanceReferenceValueEClass.getESuperTypes().add(this.getEcucAbstractReferenceValue());
		rPortComSpecEClass.getESuperTypes().add(this.getM2Object());
		pPortComSpecEClass.getESuperTypes().add(this.getM2Object());
		receiverComSpecEClass.getESuperTypes().add(this.getRPortComSpec());
		senderComSpecEClass.getESuperTypes().add(this.getPPortComSpec());
		transmissionAcknowledgementRequestEClass.getESuperTypes().add(this.getM2Object());
		nonqueuedSenderComSpecEClass.getESuperTypes().add(this.getSenderComSpec());
		queuedSenderComSpecEClass.getESuperTypes().add(this.getSenderComSpec());
		nonqueuedReceiverComSpecEClass.getESuperTypes().add(this.getReceiverComSpec());
		portInterfaceEClass.getESuperTypes().add(this.getArElement());
		compositionSwComponentTypeEClass.getESuperTypes().add(this.getSwComponentType());
		swConnectorEClass.getESuperTypes().add(this.getIdentifiable());
		assemblySwConnectorEClass.getESuperTypes().add(this.getSwConnector());
		delegationSwConnectorEClass.getESuperTypes().add(this.getSwConnector());
		portPrototypeInCompositionInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		portPrototypeInCompositionInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		rPortPrototypeInCompositionInstanceRefEClass.getESuperTypes().add(this.getPortPrototypeInCompositionInstanceRef());
		pPortPrototypeInCompositionInstanceRefEClass.getESuperTypes().add(this.getPortPrototypeInCompositionInstanceRef());
		swComponentPrototypeEClass.getESuperTypes().add(this.getIdentifiable());
		valueSpecificationEClass.getESuperTypes().add(this.getM2Object());
		autosarDataTypeEClass.getESuperTypes().add(this.getArElement());
		applicationDataTypeEClass.getESuperTypes().add(this.getAutosarDataType());
		implementationDataTypeEClass.getESuperTypes().add(this.getAutosarDataType());
		implementationDataTypeElementEClass.getESuperTypes().add(this.getIdentifiable());
		swDataDefPropsEClass.getESuperTypes().add(this.getM2Object());
		dataTypeMapEClass.getESuperTypes().add(this.getM2Object());
		dataTypeMappingSetEClass.getESuperTypes().add(this.getArElement());
		modeDeclarationGroupPrototypeEClass.getESuperTypes().add(this.getArElement());
		modeRequestTypeMapEClass.getESuperTypes().add(this.getM2Object());
		modeDeclarationEClass.getESuperTypes().add(this.getArElement());
		modeDeclarationGroupEClass.getESuperTypes().add(this.getArElement());
		applicationPrimitiveDataTypeEClass.getESuperTypes().add(this.getApplicationDataType());
		autosarDataPrototypeEClass.getESuperTypes().add(this.getDataPrototype());
		dataPrototypeEClass.getESuperTypes().add(this.getIdentifiable());
		exclusiveAreaEClass.getESuperTypes().add(this.getIdentifiable());
		numericalValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		textValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		constantReferenceEClass.getESuperTypes().add(this.getValueSpecification());
		referenceValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		arrayValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		recordValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		applicationValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		constantSpecificationEClass.getESuperTypes().add(this.getArElement());
		operationInvokedEventEClass.getESuperTypes().add(this.getRteEvent());
		pOperationInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		pOperationInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		clientServerInterfaceEClass.getESuperTypes().add(this.getPortInterface());
		clientServerOperationEClass.getESuperTypes().add(this.getIdentifiable());
		applicationErrorEClass.getESuperTypes().add(this.getIdentifiable());
		argumentDataPrototypeEClass.getESuperTypes().add(this.getAutosarDataPrototype());
		dataFilterEClass.getESuperTypes().add(this.getM2Object());
		queuedReceiverComSpecEClass.getESuperTypes().add(this.getReceiverComSpec());
		invalidationPolicyEClass.getESuperTypes().add(this.getM2Object());
		portApiOptionEClass.getESuperTypes().add(this.getM2Object());
		portDefinedArgumentValueEClass.getESuperTypes().add(this.getM2Object());
		includedDataTypeSetEClass.getESuperTypes().add(this.getM2Object());
		systemEClass.getESuperTypes().add(this.getArElement());
		rootSwCompositionPrototypeEClass.getESuperTypes().add(this.getIdentifiable());
		systemMappingEClass.getESuperTypes().add(this.getIdentifiable());
		dataMappingEClass.getESuperTypes().add(this.getM2Object());
		systemSignalEClass.getESuperTypes().add(this.getArElement());
		iSignalEClass.getESuperTypes().add(this.getArElement());
		iSignalIPduEClass.getESuperTypes().add(this.getArElement());
		iSignalToIPduMappingEClass.getESuperTypes().add(this.getIdentifiable());
		senderReceiverToSignalMappingEClass.getESuperTypes().add(this.getDataMapping());
		senderReceiverToSignalGroupMappingEClass.getESuperTypes().add(this.getDataMapping());
		variableDataPrototypeInSystemInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		variableDataPrototypeInSystemInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		ecucValueCollectionEClass.getESuperTypes().add(this.getArElement());
		serverCallPointEClass.getESuperTypes().add(this.getIdentifiable());
		synchronousServerCallPointEClass.getESuperTypes().add(this.getServerCallPoint());
		rOperationInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		rOperationInAtomicSwcInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		swAddrMethodEClass.getESuperTypes().add(this.getArElement());
		compuMethodEClass.getESuperTypes().add(this.getArElement());
		dataConstrEClass.getESuperTypes().add(this.getArElement());
		dataConstrRuleEClass.getESuperTypes().add(this.getM2Object());
		internalConstrsEClass.getESuperTypes().add(this.getM2Object());
		compuEClass.getESuperTypes().add(this.getM2Object());
		limitEClass.getESuperTypes().add(this.getM2Object());
		compuScaleEClass.getESuperTypes().add(this.getM2Object());
		compuConstEClass.getESuperTypes().add(this.getM2Object());
		anyInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		anyInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		ecuAbstractionSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		nvBlockSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		sensorActuatorSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		complexDeviceDriverSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		serviceProxySwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		serviceSwComponentTypeEClass.getESuperTypes().add(this.getAtomicSwComponentType());
		portInCompositionInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		portInCompositionInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		pPortInCompositionInstanceRefEClass.getESuperTypes().add(this.getPortInCompositionInstanceRef());
		rPortInCompositionInstanceRefEClass.getESuperTypes().add(this.getPortInCompositionInstanceRef());
		internalBehaviorEClass.getESuperTypes().add(this.getIdentifiable());
		swcBswRunnableMappingEClass.getESuperTypes().add(this.getM2Object());
		swcBswMappingEClass.getESuperTypes().add(this.getArElement());
		bswInternalBehaviorEClass.getESuperTypes().add(this.getInternalBehavior());
		bswModeSenderPolicyEClass.getESuperTypes().add(this.getM2Object());
		implementationEClass.getESuperTypes().add(this.getArElement());
		bswImplementationEClass.getESuperTypes().add(this.getImplementation());
		bswModuleDescriptionEClass.getESuperTypes().add(this.getArElement());
		bswModuleEntryEClass.getESuperTypes().add(this.getArElement());
		bswModuleEntityEClass.getESuperTypes().add(this.getExecutableEntity());
		bswSchedulableEntityEClass.getESuperTypes().add(this.getBswModuleEntity());
		bswEventEClass.getESuperTypes().add(this.getIdentifiable());
		bswModeSwitchEventEClass.getESuperTypes().add(this.getBswEvent());
		modeInBswModuleDescriptionInstanceRefEClass.getESuperTypes().add(this.getM2Object());
		modeInBswModuleDescriptionInstanceRefEClass.getESuperTypes().add(this.getIInstanceRef());
		bswTimingEventEClass.getESuperTypes().add(this.getBswEvent());
		bswBackgroundEventEClass.getESuperTypes().add(this.getBswEvent());
		bswCalledEntityEClass.getESuperTypes().add(this.getBswModuleEntity());
		bswInterruptEntityEClass.getESuperTypes().add(this.getBswModuleEntity());
		systemSignalGroupEClass.getESuperTypes().add(this.getArElement());
		iSignalGroupEClass.getESuperTypes().add(this.getArElement());
		senderRecRecordTypeMappingEClass.getESuperTypes().add(this.getSenderRecCompositeTypeMapping());
		senderRecRecordElementMappingEClass.getESuperTypes().add(this.getM2Object());
		senderRecArrayTypeMappingEClass.getESuperTypes().add(this.getSenderRecCompositeTypeMapping());
		indexedArrayElementEClass.getESuperTypes().add(this.getM2Object());
		senderRecArrayElementMappingEClass.getESuperTypes().add(this.getM2Object());
		swPointerTargetPropsEClass.getESuperTypes().add(this.getM2Object());

		// Initialize classes, features, and operations; add parameters
		initEClass(m2RootEClass, M2Root.class, "M2Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM2Root_Autosar(), this.getAutosar(), null, "autosar", null, 1, 1, M2Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autosarEClass, Autosar.class, "Autosar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutosar_Id(), this.getString(), "id", null, 1, 1, Autosar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutosar_ArPackage(), this.getArPackage(), null, "arPackage", null, 0, -1, Autosar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arPackageEClass, ArPackage.class, "ArPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArPackage_Element(), this.getArElement(), null, "element", null, 0, -1, ArPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArPackage_ArPackage(), this.getArPackage(), null, "arPackage", null, 0, -1, ArPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arElementEClass, ArElement.class, "ArElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Category(), this.getCategoryString(), "category", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2ObjectEClass, M2Object.class, "M2Object", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swBaseTypeEClass, SwBaseType.class, "SwBaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwBaseType_BaseTypeEncoding(), this.getBaseTypeEncodingString(), "baseTypeEncoding", null, 1, 1, SwBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwBaseType_BaseTypeSize(), this.getInteger(), "baseTypeSize", null, 0, 1, SwBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwBaseType_NativeDeclaration(), this.getNativeDeclarationString(), "nativeDeclaration", null, 0, 1, SwBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSwBaseType__GetUpperLimitForUnsignedInteger(), this.getInteger(), "getUpperLimitForUnsignedInteger", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(senderReceiverInterfaceEClass, SenderReceiverInterface.class, "SenderReceiverInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderReceiverInterface_DataElement(), this.getVariableDataPrototype(), null, "dataElement", null, 0, -1, SenderReceiverInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverInterface_InvalidationPolicy(), this.getInvalidationPolicy(), null, "invalidationPolicy", null, 0, -1, SenderReceiverInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDataPrototypeEClass, VariableDataPrototype.class, "VariableDataPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataPrototype_InitValue(), this.getValueSpecification(), null, "initValue", null, 0, 1, VariableDataPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referrableEClass, Referrable.class, "Referrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferrable_Id(), this.getString(), "id", null, 1, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferrable_ShortName(), this.getIdentifier(), "shortName", null, 1, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferrable_Reference(), this.getRef(), "reference", null, 1, 1, Referrable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(swComponentTypeEClass, SwComponentType.class, "SwComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwComponentType_Port(), this.getPortPrototype(), this.getPortPrototype_Parent(), "port", null, 0, -1, SwComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPrototypeEClass, PortPrototype.class, "PortPrototype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPrototype_Parent(), this.getSwComponentType(), this.getSwComponentType_Port(), "parent", null, 0, 1, PortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortPrototype_PortApiOption(), this.getPortApiOption(), this.getPortApiOption_Port(), "portApiOption", null, 0, -1, PortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicSwComponentTypeEClass, AtomicSwComponentType.class, "AtomicSwComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicSwComponentType_InternalBehavior(), this.getSwcInternalBehavior(), this.getSwcInternalBehavior_Parent(), "internalBehavior", null, 0, 1, AtomicSwComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetUsingApplicationDataTypes(), this.getApplicationDataType(), "getUsingApplicationDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetUsingImplementationDataTypes(), this.getImplementationDataType(), "getUsingImplementationDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetUsingDataTypes(), this.getAutosarDataType(), "getUsingDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getAtomicSwComponentType__GetImplementationDataType__AutosarDataType(), this.getImplementationDataType(), "getImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAutosarDataType(), "dataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtomicSwComponentType__GetImplementationDataTypes__ApplicationDataType(), this.getImplementationDataType(), "getImplementationDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplicationDataType(), "applicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetUsingClientServerInterfaces(), this.getClientServerInterface(), "getUsingClientServerInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetRPorts(), this.getRPortPrototype(), "getRPorts", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtomicSwComponentType__GetPPorts(), this.getPPortPrototype(), "getPPorts", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(applicationSwComponentTypeEClass, ApplicationSwComponentType.class, "ApplicationSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rPortPrototypeEClass, RPortPrototype.class, "RPortPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPortPrototype_RequiredInterface(), this.getPortInterface(), null, "requiredInterface", null, 1, 1, RPortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPortPrototype_RequiredComSpec(), this.getRPortComSpec(), null, "requiredComSpec", null, 0, -1, RPortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRPortPrototype__GetUsingDataTypes(), this.getAutosarDataType(), "getUsingDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pPortPrototypeEClass, PPortPrototype.class, "PPortPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPortPrototype_ProvidedInterface(), this.getPortInterface(), null, "providedInterface", null, 1, 1, PPortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPPortPrototype_ProvidedComSpec(), this.getPPortComSpec(), null, "providedComSpec", null, 0, -1, PPortPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPPortPrototype__GetUsingDataTypes(), this.getAutosarDataType(), "getUsingDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(swcInternalBehaviorEClass, SwcInternalBehavior.class, "SwcInternalBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwcInternalBehavior_Runnable(), this.getRunnableEntity(), this.getRunnableEntity_Parent(), "runnable", null, 1, -1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcInternalBehavior_Event(), this.getRteEvent(), null, "event", null, 0, -1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcInternalBehavior_PortApiOption(), this.getPortApiOption(), null, "portApiOption", null, 0, -1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcInternalBehavior_IncludedDataTypeSet(), this.getIncludedDataTypeSet(), null, "includedDataTypeSet", null, 0, -1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcInternalBehavior_Parent(), this.getAtomicSwComponentType(), this.getAtomicSwComponentType_InternalBehavior(), "parent", null, 1, 1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSwcInternalBehavior_ExplicitInterRunnableVariable(), this.getVariableDataPrototype(), null, "explicitInterRunnableVariable", null, 0, -1, SwcInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ApplicationDataType(), this.getIncludedDataTypeSet(), "getReferencerIncludedDataTypeSets", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplicationDataType(), "dataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ImplementationDataType(), this.getIncludedDataTypeSet(), "getReferencerIncludedDataTypeSets", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getImplementationDataType(), "dataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSwcInternalBehavior__GetUsingDataTypes(), this.getAutosarDataType(), "getUsingDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSwcInternalBehavior__GetImplementationDataType__AutosarDataType(), this.getImplementationDataType(), "getImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAutosarDataType(), "dataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSwcInternalBehavior__GetImplementationDataType__ApplicationDataType(), this.getImplementationDataType(), "getImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApplicationDataType(), "applicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSwcInternalBehavior__GetImplementationDataTypes__ApplicationDataType(), this.getImplementationDataType(), "getImplementationDataTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplicationDataType(), "applicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executableEntityEClass, ExecutableEntity.class, "ExecutableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableEntity_CanEnterExclusiveArea(), this.getExclusiveArea(), this.getExclusiveArea_EnterExecutableEntity(), "canEnterExclusiveArea", null, 0, -1, ExecutableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableEntity_RunsInsideExclusiveArea(), this.getExclusiveArea(), null, "runsInsideExclusiveArea", null, 0, -1, ExecutableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableEntity_SwAddrMethod(), this.getSwAddrMethod(), null, "swAddrMethod", null, 0, 1, ExecutableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEntityEClass, RunnableEntity.class, "RunnableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableEntity_DataSendPoint(), this.getVariableAccess(), null, "dataSendPoint", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_DataReceivePointByArgument(), this.getVariableAccess(), null, "dataReceivePointByArgument", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_ServerCallPoint(), this.getServerCallPoint(), null, "serverCallPoint", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_Event(), this.getRteEvent(), this.getRteEvent_StartOnEvent(), "event", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_Parent(), this.getSwcInternalBehavior(), this.getSwcInternalBehavior_Runnable(), "parent", null, 1, 1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnableEntity_Symbol(), this.getCIdentifier(), "symbol", null, 0, 1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_WrittenLocalVariable(), this.getVariableAccess(), null, "writtenLocalVariable", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEntity_ReadLocalVariable(), this.getVariableAccess(), null, "readLocalVariable", null, 0, -1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAccessEClass, VariableAccess.class, "VariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAccess_AccessedVariable(), this.getAutosarVariableRef(), null, "accessedVariable", null, 1, 1, VariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autosarVariableRefEClass, AutosarVariableRef.class, "AutosarVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutosarVariableRef_AutosarVariableIref(), this.getVariableInAtomicSwcTypeInstanceRef(), null, "autosarVariableIref", null, 0, 1, AutosarVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarVariableRef_AutosarVariable(), theInstancePackage.getVariableDataInstanceInSwc(), null, "autosarVariable", null, 0, 1, AutosarVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarVariableRef_LocalVariable(), this.getVariableDataPrototype(), null, "localVariable", null, 0, 1, AutosarVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableInAtomicSwcTypeInstanceRefEClass, VariableInAtomicSwcTypeInstanceRef.class, "VariableInAtomicSwcTypeInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableInAtomicSwcTypeInstanceRef_PortPrototype(), this.getPortPrototype(), null, "portPrototype", null, 1, 1, VariableInAtomicSwcTypeInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableInAtomicSwcTypeInstanceRef_TargetDataPrototype(), this.getVariableDataPrototype(), null, "targetDataPrototype", null, 1, 1, VariableInAtomicSwcTypeInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteEventEClass, RteEvent.class, "RteEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRteEvent_StartOnEvent(), this.getRunnableEntity(), this.getRunnableEntity_Event(), "startOnEvent", null, 0, 1, RteEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteEvent_Config(), theEcucPackage.getRteEventToTaskMapping(), theEcucPackage.getRteEventToTaskMapping_RteEvent(), "config", null, 0, -1, RteEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(timingEventEClass, TimingEvent.class, "TimingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingEvent_Period(), this.getTimeValue(), "period", null, 0, 1, TimingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundEventEClass, BackgroundEvent.class, "BackgroundEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSendCompletedEventEClass, DataSendCompletedEvent.class, "DataSendCompletedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSendCompletedEvent_EventSource(), this.getVariableAccess(), null, "eventSource", null, 1, 1, DataSendCompletedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSendCompletedEvent_EventSourceData(), theInstancePackage.getVariableDataInstanceInSwc(), null, "eventSourceData", null, 1, 1, DataSendCompletedEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dataReceivedEventEClass, DataReceivedEvent.class, "DataReceivedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataReceivedEvent_DataIref(), this.getRVariableInAtomicSwcInstanceRef(), null, "dataIref", null, 1, 1, DataReceivedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataReceivedEvent_Data(), theInstancePackage.getVariableDataInstanceInSwc(), null, "data", null, 1, 1, DataReceivedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReceiveErrorEventEClass, DataReceiveErrorEvent.class, "DataReceiveErrorEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataReceiveErrorEvent_DataIref(), this.getRVariableInAtomicSwcInstanceRef(), null, "dataIref", null, 1, 1, DataReceiveErrorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataReceiveErrorEvent_Data(), theInstancePackage.getVariableDataInstanceInSwc(), null, "data", null, 1, 1, DataReceiveErrorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rVariableInAtomicSwcInstanceRefEClass, RVariableInAtomicSwcInstanceRef.class, "RVariableInAtomicSwcInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRVariableInAtomicSwcInstanceRef_ContextRPort(), this.getPortPrototype(), null, "contextRPort", null, 1, 1, RVariableInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRVariableInAtomicSwcInstanceRef_TargetDataElement(), this.getVariableDataPrototype(), null, "targetDataElement", null, 1, 1, RVariableInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucModuleConfigurationValuesEClass, EcucModuleConfigurationValues.class, "EcucModuleConfigurationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucModuleConfigurationValues_DefinitionRef(), this.getRef(), "definitionRef", null, 1, 1, EcucModuleConfigurationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcucModuleConfigurationValues_EcucDefEdition(), this.getRevisionLabelString(), "ecucDefEdition", null, 1, 1, EcucModuleConfigurationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcucModuleConfigurationValues_ImplementationConfigVariant(), this.getEcucConfigurationVariantEnum(), "implementationConfigVariant", null, 1, 1, EcucModuleConfigurationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucModuleConfigurationValues_Container(), this.getEcucContainerValue(), null, "container", null, 1, -1, EcucModuleConfigurationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucContainerValueEClass, EcucContainerValue.class, "EcucContainerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucContainerValue_DefinitionRef(), this.getRef(), "definitionRef", null, 1, 1, EcucContainerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucContainerValue_ParameterValue(), this.getEcucParameterValue(), null, "parameterValue", null, 0, -1, EcucContainerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucContainerValue_ReferenceValue(), this.getEcucAbstractReferenceValue(), null, "referenceValue", null, 0, -1, EcucContainerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucContainerValue_SubContainer(), this.getEcucContainerValue(), null, "subContainer", null, 0, -1, EcucContainerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucParameterValueEClass, EcucParameterValue.class, "EcucParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucParameterValue_DefinitionRef(), this.getRef(), "definitionRef", null, 1, 1, EcucParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucNumericalParamValueEClass, EcucNumericalParamValue.class, "EcucNumericalParamValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucNumericalParamValue_Value(), this.getNumerical(), "value", null, 1, 1, EcucNumericalParamValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucTextualParamValueEClass, EcucTextualParamValue.class, "EcucTextualParamValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucTextualParamValue_Value(), this.getVerbatimString(), "value", null, 1, 1, EcucTextualParamValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucAbstractReferenceValueEClass, EcucAbstractReferenceValue.class, "EcucAbstractReferenceValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcucAbstractReferenceValue_DefinitionRef(), this.getRef(), "definitionRef", null, 1, 1, EcucAbstractReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucReferenceValueEClass, EcucReferenceValue.class, "EcucReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcucReferenceValue_Value(), this.getIdentifiable(), null, "value", null, 1, 1, EcucReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucInstanceReferenceValueEClass, EcucInstanceReferenceValue.class, "EcucInstanceReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcucInstanceReferenceValue_ValueIref(), this.getAnyInstanceRef(), null, "valueIref", null, 1, 1, EcucInstanceReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucInstanceReferenceValue_Value(), theInstancePackage.getIInstanceObject(), null, "value", null, 1, 1, EcucInstanceReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rPortComSpecEClass, RPortComSpec.class, "RPortComSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pPortComSpecEClass, PPortComSpec.class, "PPortComSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiverComSpecEClass, ReceiverComSpec.class, "ReceiverComSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiverComSpec_DataElement(), this.getVariableDataPrototype(), null, "dataElement", null, 1, 1, ReceiverComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderComSpecEClass, SenderComSpec.class, "SenderComSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderComSpec_DataElement(), this.getVariableDataPrototype(), null, "dataElement", null, 1, 1, SenderComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderComSpec_TransmissionAcknowledge(), this.getTransmissionAcknowledgementRequest(), null, "transmissionAcknowledge", null, 0, 1, SenderComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transmissionAcknowledgementRequestEClass, TransmissionAcknowledgementRequest.class, "TransmissionAcknowledgementRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransmissionAcknowledgementRequest_Timeout(), this.getTimeValue(), "timeout", null, 1, 1, TransmissionAcknowledgementRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonqueuedSenderComSpecEClass, NonqueuedSenderComSpec.class, "NonqueuedSenderComSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonqueuedSenderComSpec_InitValue(), this.getValueSpecification(), null, "initValue", null, 1, 1, NonqueuedSenderComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queuedSenderComSpecEClass, QueuedSenderComSpec.class, "QueuedSenderComSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonqueuedReceiverComSpecEClass, NonqueuedReceiverComSpec.class, "NonqueuedReceiverComSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonqueuedReceiverComSpec_AliveTimeout(), this.getTimeValue(), "aliveTimeout", null, 1, 1, NonqueuedReceiverComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonqueuedReceiverComSpec_InitValue(), this.getValueSpecification(), null, "initValue", null, 1, 1, NonqueuedReceiverComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonqueuedReceiverComSpec_Filter(), this.getDataFilter(), null, "filter", null, 0, 1, NonqueuedReceiverComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInterfaceEClass, PortInterface.class, "PortInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionSwComponentTypeEClass, CompositionSwComponentType.class, "CompositionSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionSwComponentType_Component(), this.getSwComponentPrototype(), null, "component", null, 0, -1, CompositionSwComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionSwComponentType_Connector(), this.getSwConnector(), null, "connector", null, 0, -1, CompositionSwComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swConnectorEClass, SwConnector.class, "SwConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblySwConnectorEClass, AssemblySwConnector.class, "AssemblySwConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblySwConnector_Requester(), theInstancePackage.getPortInstanceInComposition(), null, "requester", null, 1, 1, AssemblySwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblySwConnector_Provider(), theInstancePackage.getPortInstanceInComposition(), null, "provider", null, 1, 1, AssemblySwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblySwConnector_ProviderIref(), this.getPPortPrototypeInCompositionInstanceRef(), null, "providerIref", null, 1, 1, AssemblySwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblySwConnector_RequesterIref(), this.getRPortPrototypeInCompositionInstanceRef(), null, "requesterIref", null, 1, 1, AssemblySwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationSwConnectorEClass, DelegationSwConnector.class, "DelegationSwConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationSwConnector_InnerPort(), theInstancePackage.getPortInstanceInComposition(), null, "innerPort", null, 1, 1, DelegationSwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationSwConnector_OuterPort(), this.getPortPrototype(), null, "outerPort", null, 1, 1, DelegationSwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationSwConnector_InnerPortIref(), this.getPortInCompositionInstanceRef(), null, "innerPortIref", null, 1, 1, DelegationSwConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPrototypeInCompositionInstanceRefEClass, PortPrototypeInCompositionInstanceRef.class, "PortPrototypeInCompositionInstanceRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPrototypeInCompositionInstanceRef_ContextComponent(), this.getSwComponentPrototype(), null, "contextComponent", null, 1, 1, PortPrototypeInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rPortPrototypeInCompositionInstanceRefEClass, RPortPrototypeInCompositionInstanceRef.class, "RPortPrototypeInCompositionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPortPrototypeInCompositionInstanceRef_TargetRPort(), this.getRPortPrototype(), null, "targetRPort", null, 1, 1, RPortPrototypeInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pPortPrototypeInCompositionInstanceRefEClass, PPortPrototypeInCompositionInstanceRef.class, "PPortPrototypeInCompositionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPortPrototypeInCompositionInstanceRef_TargetPPort(), this.getPPortPrototype(), null, "targetPPort", null, 1, 1, PPortPrototypeInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swComponentPrototypeEClass, SwComponentPrototype.class, "SwComponentPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwComponentPrototype_Type(), this.getSwComponentType(), null, "type", null, 1, 1, SwComponentPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwComponentPrototype_Instance(), theInstancePackage.getSwComponentInstanceInSystem(), theInstancePackage.getSwComponentInstanceInSystem_Prototype(), "instance", null, 0, -1, SwComponentPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autosarDataTypeEClass, AutosarDataType.class, "AutosarDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutosarDataType_SwDataDefProps(), this.getSwDataDefProps(), null, "swDataDefProps", null, 0, 1, AutosarDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarDataType_InvalidValue(), this.getValueSpecification(), null, "invalidValue", null, 0, 1, AutosarDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarDataType_CompuMethod(), this.getCompuMethod(), null, "compuMethod", null, 0, 1, AutosarDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarDataType_DataConstr(), this.getDataConstr(), null, "dataConstr", null, 0, 1, AutosarDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutosarDataType_SwAddrMethod(), this.getSwAddrMethod(), null, "swAddrMethod", null, 0, 1, AutosarDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAutosarDataType__GetSwImplPolicy(), this.getSwImplPolicyEnum(), "getSwImplPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationDataTypeEClass, ApplicationDataType.class, "ApplicationDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationDataTypeEClass, ImplementationDataType.class, "ImplementationDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationDataType_SubElement(), this.getImplementationDataTypeElement(), null, "subElement", null, 0, -1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationDataType_BaseType(), this.getSwBaseType(), null, "baseType", null, 0, 1, ImplementationDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataType_SwAlignment(), this.getAlignmentType(), "swAlignment", null, 0, 1, ImplementationDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getImplementationDataType__GetLeafImplementationDataType(), this.getImplementationDataType(), "getLeafImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsPrimitiveType(), ecorePackage.getEBoolean(), "isPrimitiveType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsPointerType(), ecorePackage.getEBoolean(), "isPointerType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsArrayType(), ecorePackage.getEBoolean(), "isArrayType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsStructType(), ecorePackage.getEBoolean(), "isStructType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsUnionType(), ecorePackage.getEBoolean(), "isUnionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsRedefinitionType(), ecorePackage.getEBoolean(), "isRedefinitionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImplementationDataType__IsComplexType(), ecorePackage.getEBoolean(), "isComplexType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementationDataTypeElementEClass, ImplementationDataTypeElement.class, "ImplementationDataTypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationDataTypeElement_ArraySize(), this.getPositiveInteger(), "arraySize", null, 0, 1, ImplementationDataTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataTypeElement_ArraySizeSemantics(), this.getArraySizeSemanticsEnum(), "arraySizeSemantics", null, 0, 1, ImplementationDataTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationDataTypeElement_SubElement(), this.getImplementationDataTypeElement(), null, "subElement", null, 0, -1, ImplementationDataTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationDataTypeElement_SwDataDefProps(), this.getSwDataDefProps(), null, "swDataDefProps", null, 0, 1, ImplementationDataTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImplementationDataTypeElement__IsRedefinitionType(), ecorePackage.getEBoolean(), "isRedefinitionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(swDataDefPropsEClass, SwDataDefProps.class, "SwDataDefProps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwDataDefProps_InvalidValue(), this.getValueSpecification(), null, "invalidValue", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_BaseType(), this.getSwBaseType(), null, "baseType", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwDataDefProps_SwImplPolicy(), this.getSwImplPolicyEnum(), "swImplPolicy", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_SwAddrMethod(), this.getSwAddrMethod(), null, "swAddrMethod", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwDataDefProps_SwAlignment(), this.getAlignmentType(), "swAlignment", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_CompuMethod(), this.getCompuMethod(), null, "compuMethod", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_DataConstr(), this.getDataConstr(), null, "dataConstr", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_ImplementationDataType(), this.getImplementationDataType(), null, "implementationDataType", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwDataDefProps_SwPointerTargetProps(), this.getSwPointerTargetProps(), null, "swPointerTargetProps", null, 0, 1, SwDataDefProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeMapEClass, DataTypeMap.class, "DataTypeMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeMap_ImplementationDataType(), this.getImplementationDataType(), null, "implementationDataType", null, 1, 1, DataTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeMap_ApplicationDataType(), this.getApplicationDataType(), null, "applicationDataType", null, 1, 1, DataTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeMappingSetEClass, DataTypeMappingSet.class, "DataTypeMappingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeMappingSet_DataTypeMap(), this.getDataTypeMap(), null, "dataTypeMap", null, 0, -1, DataTypeMappingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeMappingSet_ModeRequestTypeMap(), this.getModeRequestTypeMap(), null, "modeRequestTypeMap", null, 0, -1, DataTypeMappingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeDeclarationGroupPrototypeEClass, ModeDeclarationGroupPrototype.class, "ModeDeclarationGroupPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeDeclarationGroupPrototype_Type(), this.getModeDeclarationGroup(), null, "type", null, 1, 1, ModeDeclarationGroupPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeRequestTypeMapEClass, ModeRequestTypeMap.class, "ModeRequestTypeMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeRequestTypeMap_ImplementationDataType(), this.getImplementationDataType(), null, "implementationDataType", null, 1, 1, ModeRequestTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeRequestTypeMap_ModeGroup(), this.getModeDeclarationGroup(), null, "modeGroup", null, 1, 1, ModeRequestTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeDeclarationEClass, ModeDeclaration.class, "ModeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeDeclarationGroupEClass, ModeDeclarationGroup.class, "ModeDeclarationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeDeclarationGroup_InitialMode(), this.getModeDeclaration(), null, "initialMode", null, 1, 1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeDeclarationGroup_ModeDeclaration(), this.getModeDeclaration(), null, "modeDeclaration", null, 1, -1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationPrimitiveDataTypeEClass, ApplicationPrimitiveDataType.class, "ApplicationPrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autosarDataPrototypeEClass, AutosarDataPrototype.class, "AutosarDataPrototype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAutosarDataPrototype__GetSwAddrMethod(), this.getSwAddrMethod(), "getSwAddrMethod", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutosarDataPrototype__GetSwAlignment(), this.getAlignmentType(), "getSwAlignment", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutosarDataPrototype__GetApplicationDataType(), this.getApplicationDataType(), "getApplicationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutosarDataPrototype__GetImplementationDataType(), this.getImplementationDataType(), "getImplementationDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPrototypeEClass, DataPrototype.class, "DataPrototype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPrototype_SwDataDefProps(), this.getSwDataDefProps(), null, "swDataDefProps", null, 0, 1, DataPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrototype_SwAddrMethod(), this.getSwAddrMethod(), null, "swAddrMethod", null, 0, 1, DataPrototype.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPrototype_SwAlignment(), this.getAlignmentType(), "swAlignment", null, 0, 1, DataPrototype.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrototype_Type(), this.getAutosarDataType(), null, "type", null, 1, 1, DataPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataPrototype__GetSwImplPolicy(), this.getSwImplPolicyEnum(), "getSwImplPolicy", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exclusiveAreaEClass, ExclusiveArea.class, "ExclusiveArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusiveArea_SwcConfig(), theEcucPackage.getRteExclusiveAreaImplementation(), theEcucPackage.getRteExclusiveAreaImplementation_RteExclusiveArea(), "swcConfig", null, 0, -1, ExclusiveArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExclusiveArea_BswConfig(), theEcucPackage.getRteBswExclusiveAreaImpl(), theEcucPackage.getRteBswExclusiveAreaImpl_RteBswExclusiveArea(), "bswConfig", null, 0, -1, ExclusiveArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExclusiveArea_Parent(), this.getInternalBehavior(), this.getInternalBehavior_ExclusiveArea(), "parent", null, 1, 1, ExclusiveArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExclusiveArea_EnterExecutableEntity(), this.getExecutableEntity(), this.getExecutableEntity_CanEnterExclusiveArea(), "enterExecutableEntity", null, 0, -1, ExclusiveArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalValueSpecificationEClass, NumericalValueSpecification.class, "NumericalValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalValueSpecification_Value(), this.getNumerical(), "value", null, 1, 1, NumericalValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textValueSpecificationEClass, TextValueSpecification.class, "TextValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextValueSpecification_Value(), this.getVerbatimString(), "value", null, 1, 1, TextValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantReferenceEClass, ConstantReference.class, "ConstantReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantReference_Constant(), this.getConstantSpecification(), null, "constant", null, 1, 1, ConstantReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConstantReference__GetEndValueSpec(), this.getValueSpecification(), "getEndValueSpec", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referenceValueSpecificationEClass, ReferenceValueSpecification.class, "ReferenceValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayValueSpecificationEClass, ArrayValueSpecification.class, "ArrayValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValueSpecification_Element(), this.getValueSpecification(), null, "element", null, 1, -1, ArrayValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordValueSpecificationEClass, RecordValueSpecification.class, "RecordValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordValueSpecification_Field(), this.getValueSpecification(), null, "field", null, 1, -1, RecordValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationValueSpecificationEClass, ApplicationValueSpecification.class, "ApplicationValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantSpecificationEClass, ConstantSpecification.class, "ConstantSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantSpecification_ValueSpec(), this.getValueSpecification(), null, "valueSpec", null, 1, 1, ConstantSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationInvokedEventEClass, OperationInvokedEvent.class, "OperationInvokedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInvokedEvent_OperationIref(), this.getPOperationInAtomicSwcInstanceRef(), null, "operationIref", null, 1, 1, OperationInvokedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInvokedEvent_Operation(), theInstancePackage.getPOperationInstanceInSwc(), theInstancePackage.getPOperationInstanceInSwc_OperationInvokedEvent(), "operation", null, 1, 1, OperationInvokedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pOperationInAtomicSwcInstanceRefEClass, POperationInAtomicSwcInstanceRef.class, "POperationInAtomicSwcInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPOperationInAtomicSwcInstanceRef_ContextPPort(), this.getPPortPrototype(), null, "contextPPort", null, 1, 1, POperationInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOperationInAtomicSwcInstanceRef_TargetProvidedOperation(), this.getClientServerOperation(), null, "targetProvidedOperation", null, 1, 1, POperationInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientServerInterfaceEClass, ClientServerInterface.class, "ClientServerInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientServerInterface_Operation(), this.getClientServerOperation(), null, "operation", null, 1, -1, ClientServerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientServerInterface_PossibleError(), this.getApplicationError(), this.getApplicationError_Parent(), "possibleError", null, 0, -1, ClientServerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientServerOperationEClass, ClientServerOperation.class, "ClientServerOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientServerOperation_PossibleError(), this.getApplicationError(), null, "possibleError", null, 0, -1, ClientServerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientServerOperation_Argument(), this.getArgumentDataPrototype(), null, "argument", null, 0, -1, ClientServerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationErrorEClass, ApplicationError.class, "ApplicationError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationError_ErrorCode(), this.getInteger(), "errorCode", null, 1, 1, ApplicationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationError_Parent(), this.getClientServerInterface(), this.getClientServerInterface_PossibleError(), "parent", null, 1, 1, ApplicationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(argumentDataPrototypeEClass, ArgumentDataPrototype.class, "ArgumentDataPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentDataPrototype_Direction(), this.getArgumentDirectionEnum(), "direction", null, 1, 1, ArgumentDataPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFilterEClass, DataFilter.class, "DataFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFilter_DataFilterType(), this.getDataFilterTypeEnum(), "dataFilterType", null, 1, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_Mask(), this.getUnlimitedInteger(), "mask", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_Max(), this.getUnlimitedInteger(), "max", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_Min(), this.getUnlimitedInteger(), "min", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_Offset(), this.getPositiveInteger(), "offset", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_Period(), this.getPositiveInteger(), "period", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFilter_X(), this.getUnlimitedInteger(), "x", null, 0, 1, DataFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataFilter__IsFilterEnabled(), ecorePackage.getEBoolean(), "isFilterEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFilter__IsCompatibleWith__DataFilter(), ecorePackage.getEBoolean(), "isCompatibleWith", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFilter(), "another", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queuedReceiverComSpecEClass, QueuedReceiverComSpec.class, "QueuedReceiverComSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueuedReceiverComSpec_QueueLength(), this.getPositiveInteger(), "queueLength", null, 1, 1, QueuedReceiverComSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidationPolicyEClass, InvalidationPolicy.class, "InvalidationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvalidationPolicy_DataElement(), this.getVariableDataPrototype(), null, "dataElement", null, 1, 1, InvalidationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidationPolicy_HandleInvalid(), this.getHandleInvalidEnum(), "handleInvalid", null, 0, 1, InvalidationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInvalidationPolicy__IsInvalidationEnabled(), ecorePackage.getEBoolean(), "isInvalidationEnabled", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInvalidationPolicy__IsInvalidationKeep(), ecorePackage.getEBoolean(), "isInvalidationKeep", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInvalidationPolicy__IsInvalidationReplace(), ecorePackage.getEBoolean(), "isInvalidationReplace", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portApiOptionEClass, PortApiOption.class, "PortApiOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortApiOption_PortArgValue(), this.getPortDefinedArgumentValue(), this.getPortDefinedArgumentValue_Parent(), "portArgValue", null, 0, -1, PortApiOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortApiOption_Port(), this.getPortPrototype(), this.getPortPrototype_PortApiOption(), "port", null, 1, 1, PortApiOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortApiOption_EnableTakeAddress(), this.getBoolean(), "enableTakeAddress", null, 1, 1, PortApiOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portDefinedArgumentValueEClass, PortDefinedArgumentValue.class, "PortDefinedArgumentValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDefinedArgumentValue_Value(), this.getValueSpecification(), null, "value", null, 1, 1, PortDefinedArgumentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortDefinedArgumentValue_ValueType(), this.getImplementationDataType(), null, "valueType", null, 1, 1, PortDefinedArgumentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortDefinedArgumentValue_Parent(), this.getPortApiOption(), this.getPortApiOption_PortArgValue(), "parent", null, 1, 1, PortDefinedArgumentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(includedDataTypeSetEClass, IncludedDataTypeSet.class, "IncludedDataTypeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludedDataTypeSet_LiteralPrefix(), this.getIdentifier(), "literalPrefix", null, 0, 1, IncludedDataTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludedDataTypeSet_DataType(), this.getAutosarDataType(), null, "dataType", null, 1, -1, IncludedDataTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_RootSoftwareComposition(), this.getRootSwCompositionPrototype(), null, "rootSoftwareComposition", null, 0, 1, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Mapping(), this.getSystemMapping(), null, "mapping", null, 0, -1, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootSwCompositionPrototypeEClass, RootSwCompositionPrototype.class, "RootSwCompositionPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootSwCompositionPrototype_SoftwareComposition(), this.getCompositionSwComponentType(), null, "softwareComposition", null, 1, 1, RootSwCompositionPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemMappingEClass, SystemMapping.class, "SystemMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemMapping_DataMapping(), this.getDataMapping(), null, "dataMapping", null, 0, -1, SystemMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMappingEClass, DataMapping.class, "DataMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemSignalEClass, SystemSignal.class, "SystemSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSignalEClass, ISignal.class, "ISignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISignal_SystemSignal(), this.getSystemSignal(), null, "systemSignal", null, 1, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSignalIPduEClass, ISignalIPdu.class, "ISignalIPdu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISignalIPdu_ISignalToPduMapping(), this.getISignalToIPduMapping(), null, "iSignalToPduMapping", null, 0, -1, ISignalIPdu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSignalToIPduMappingEClass, ISignalToIPduMapping.class, "ISignalToIPduMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISignalToIPduMapping_ISignal(), this.getISignal(), null, "iSignal", null, 0, 1, ISignalToIPduMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISignalToIPduMapping_ISignalGroup(), this.getISignalGroup(), null, "iSignalGroup", null, 0, 1, ISignalToIPduMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderReceiverToSignalMappingEClass, SenderReceiverToSignalMapping.class, "SenderReceiverToSignalMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderReceiverToSignalMapping_SystemSignal(), this.getSystemSignal(), null, "systemSignal", null, 1, 1, SenderReceiverToSignalMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverToSignalMapping_DataElementIref(), this.getVariableDataPrototypeInSystemInstanceRef(), null, "dataElementIref", null, 1, 1, SenderReceiverToSignalMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverToSignalMapping_DataElement(), theInstancePackage.getVariableDataInstance(), null, "dataElement", null, 1, 1, SenderReceiverToSignalMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderReceiverToSignalGroupMappingEClass, SenderReceiverToSignalGroupMapping.class, "SenderReceiverToSignalGroupMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderReceiverToSignalGroupMapping_SignalGroup(), this.getSystemSignalGroup(), null, "signalGroup", null, 1, 1, SenderReceiverToSignalGroupMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverToSignalGroupMapping_DataElementIref(), this.getVariableDataPrototypeInSystemInstanceRef(), null, "dataElementIref", null, 1, 1, SenderReceiverToSignalGroupMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverToSignalGroupMapping_DataElement(), theInstancePackage.getVariableDataInstance(), null, "dataElement", null, 1, 1, SenderReceiverToSignalGroupMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverToSignalGroupMapping_TypeMapping(), this.getSenderRecCompositeTypeMapping(), null, "typeMapping", null, 1, 1, SenderReceiverToSignalGroupMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDataPrototypeInSystemInstanceRefEClass, VariableDataPrototypeInSystemInstanceRef.class, "VariableDataPrototypeInSystemInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDataPrototypeInSystemInstanceRef_ContextComponent(), this.getSwComponentPrototype(), null, "contextComponent", null, 0, 1, VariableDataPrototypeInSystemInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataPrototypeInSystemInstanceRef_ContextPort(), this.getPortPrototype(), null, "contextPort", null, 1, 1, VariableDataPrototypeInSystemInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataPrototypeInSystemInstanceRef_TargetDataPrototype(), this.getVariableDataPrototype(), null, "targetDataPrototype", null, 1, 1, VariableDataPrototypeInSystemInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecucValueCollectionEClass, EcucValueCollection.class, "EcucValueCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcucValueCollection_EcucValue(), this.getEcucModuleConfigurationValues(), null, "ecucValue", null, 1, -1, EcucValueCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcucValueCollection_EcuExtract(), this.getSystem(), null, "ecuExtract", null, 1, 1, EcucValueCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverCallPointEClass, ServerCallPoint.class, "ServerCallPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerCallPoint_OperationIref(), this.getROperationInAtomicSwcInstanceRef(), null, "operationIref", null, 1, 1, ServerCallPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerCallPoint_Operation(), theInstancePackage.getOperationInstanceInSwc(), null, "operation", null, 1, 1, ServerCallPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousServerCallPointEClass, SynchronousServerCallPoint.class, "SynchronousServerCallPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iInstanceRefEClass, IInstanceRef.class, "IInstanceRef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIInstanceRef_InstanceRef(), this.getIdentifier(), "instanceRef", null, 1, -1, IInstanceRef.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rOperationInAtomicSwcInstanceRefEClass, ROperationInAtomicSwcInstanceRef.class, "ROperationInAtomicSwcInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROperationInAtomicSwcInstanceRef_ContextRPort(), this.getRPortPrototype(), null, "contextRPort", null, 1, 1, ROperationInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROperationInAtomicSwcInstanceRef_TargetRequiredOperation(), this.getClientServerOperation(), null, "targetRequiredOperation", null, 1, 1, ROperationInAtomicSwcInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swAddrMethodEClass, SwAddrMethod.class, "SwAddrMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwAddrMethod_MemoryAllocationKeywordPolicy(), this.getMemoryAllocationKeywordPolicyType(), "memoryAllocationKeywordPolicy", null, 0, 1, SwAddrMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwAddrMethod_SectionInitializationPolicy(), this.getSectionInitializationPolicyType(), "sectionInitializationPolicy", null, 0, 1, SwAddrMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compuMethodEClass, CompuMethod.class, "CompuMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompuMethod_CompuInternalToPhys(), this.getCompu(), null, "compuInternalToPhys", null, 0, 1, CompuMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConstrEClass, DataConstr.class, "DataConstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataConstr_DataConstrRule(), this.getDataConstrRule(), null, "dataConstrRule", null, 0, -1, DataConstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataConstr__GetLowerLimitValue(), this.getVerbatimString(), "getLowerLimitValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataConstr__GetUpperLimitValue(), this.getVerbatimString(), "getUpperLimitValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataConstrRuleEClass, DataConstrRule.class, "DataConstrRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataConstrRule_InternalConstrs(), this.getInternalConstrs(), null, "internalConstrs", null, 0, 1, DataConstrRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalConstrsEClass, InternalConstrs.class, "InternalConstrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalConstrs_LowerLimit(), this.getLimit(), null, "lowerLimit", null, 0, 1, InternalConstrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalConstrs_UpperLimit(), this.getLimit(), null, "upperLimit", null, 0, 1, InternalConstrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compuEClass, Compu.class, "Compu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompu_CompuScale(), this.getCompuScale(), null, "compuScale", null, 0, -1, Compu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimit_Value(), this.getVerbatimString(), "value", null, 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compuScaleEClass, CompuScale.class, "CompuScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompuScale_LowerLimit(), this.getLimit(), null, "lowerLimit", null, 0, 1, CompuScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompuScale_ShortLabel(), this.getIdentifier(), "shortLabel", null, 0, 1, CompuScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompuScale_Symbol(), this.getCIdentifier(), "symbol", null, 0, 1, CompuScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompuScale_UpperLimit(), this.getLimit(), null, "upperLimit", null, 0, 1, CompuScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompuScale_CompuConst(), this.getCompuConst(), null, "compuConst", null, 0, 1, CompuScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compuConstEClass, CompuConst.class, "CompuConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompuConst_Vt(), this.getVerbatimString(), "vt", null, 0, 1, CompuConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyInstanceRefEClass, AnyInstanceRef.class, "AnyInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyInstanceRef_ContextElement(), this.getIdentifiable(), null, "contextElement", null, 0, -1, AnyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyInstanceRef_Target(), this.getIdentifiable(), null, "target", null, 1, 1, AnyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecuAbstractionSwComponentTypeEClass, EcuAbstractionSwComponentType.class, "EcuAbstractionSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nvBlockSwComponentTypeEClass, NvBlockSwComponentType.class, "NvBlockSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorActuatorSwComponentTypeEClass, SensorActuatorSwComponentType.class, "SensorActuatorSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexDeviceDriverSwComponentTypeEClass, ComplexDeviceDriverSwComponentType.class, "ComplexDeviceDriverSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceProxySwComponentTypeEClass, ServiceProxySwComponentType.class, "ServiceProxySwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceSwComponentTypeEClass, ServiceSwComponentType.class, "ServiceSwComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portInCompositionInstanceRefEClass, PortInCompositionInstanceRef.class, "PortInCompositionInstanceRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInCompositionInstanceRef_ContextComponent(), this.getSwComponentPrototype(), null, "contextComponent", null, 1, 1, PortInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pPortInCompositionInstanceRefEClass, PPortInCompositionInstanceRef.class, "PPortInCompositionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPortInCompositionInstanceRef_TargetPPort(), this.getPPortPrototype(), null, "targetPPort", null, 1, 1, PPortInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rPortInCompositionInstanceRefEClass, RPortInCompositionInstanceRef.class, "RPortInCompositionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPortInCompositionInstanceRef_TargetRPort(), this.getRPortPrototype(), null, "targetRPort", null, 1, 1, RPortInCompositionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalBehaviorEClass, InternalBehavior.class, "InternalBehavior", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalBehavior_DataTypeMapping(), this.getDataTypeMappingSet(), null, "dataTypeMapping", null, 0, -1, InternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalBehavior_ExclusiveArea(), this.getExclusiveArea(), this.getExclusiveArea_Parent(), "exclusiveArea", null, 0, -1, InternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInternalBehavior__GetParent(), this.getReferrable(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(swcBswRunnableMappingEClass, SwcBswRunnableMapping.class, "SwcBswRunnableMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwcBswRunnableMapping_SwcRunnable(), this.getRunnableEntity(), null, "swcRunnable", null, 1, 1, SwcBswRunnableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcBswRunnableMapping_BswEntity(), this.getBswModuleEntity(), null, "bswEntity", null, 1, 1, SwcBswRunnableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swcBswMappingEClass, SwcBswMapping.class, "SwcBswMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwcBswMapping_RunnableMapping(), this.getSwcBswRunnableMapping(), null, "runnableMapping", null, 0, -1, SwcBswMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcBswMapping_SwcBehavior(), this.getSwcInternalBehavior(), null, "swcBehavior", null, 1, 1, SwcBswMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwcBswMapping_BswBehavior(), this.getBswInternalBehavior(), null, "bswBehavior", null, 1, 1, SwcBswMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswInternalBehaviorEClass, BswInternalBehavior.class, "BswInternalBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswInternalBehavior_Parent(), this.getBswModuleDescription(), this.getBswModuleDescription_InternalBehavior(), "parent", null, 1, 1, BswInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswInternalBehavior_Entity(), this.getBswModuleEntity(), this.getBswModuleEntity_Parent(), "entity", null, 1, -1, BswInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswInternalBehavior_Event(), this.getBswEvent(), this.getBswEvent_Parent(), "event", null, 0, -1, BswInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswInternalBehavior_Implementation(), this.getBswImplementation(), this.getBswImplementation_Behavior(), "implementation", null, 0, -1, BswInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswInternalBehavior_ModeSenderPolicy(), this.getBswModeSenderPolicy(), null, "modeSenderPolicy", null, 0, -1, BswInternalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswInternalBehavior_BswSchedulableEntity(), this.getBswSchedulableEntity(), null, "bswSchedulableEntity", null, 0, -1, BswInternalBehavior.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bswModeSenderPolicyEClass, BswModeSenderPolicy.class, "BswModeSenderPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswModeSenderPolicy_ProvidedModeGroup(), this.getModeDeclarationGroupPrototype(), null, "providedModeGroup", null, 1, 1, BswModeSenderPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBswModeSenderPolicy_QueueLength(), this.getPositiveInteger(), "queueLength", null, 1, 1, BswModeSenderPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_SwcBswMapping(), this.getSwcBswMapping(), null, "swcBswMapping", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswImplementationEClass, BswImplementation.class, "BswImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswImplementation_Behavior(), this.getBswInternalBehavior(), this.getBswInternalBehavior_Implementation(), "behavior", null, 1, 1, BswImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswModuleDescriptionEClass, BswModuleDescription.class, "BswModuleDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswModuleDescription_InternalBehavior(), this.getBswInternalBehavior(), this.getBswInternalBehavior_Parent(), "internalBehavior", null, 0, -1, BswModuleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModuleDescription_ProvidedEntry(), this.getBswModuleEntry(), null, "providedEntry", null, 0, -1, BswModuleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModuleDescription_ProvidedModeGroup(), this.getModeDeclarationGroupPrototype(), null, "providedModeGroup", null, 0, -1, BswModuleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBswModuleDescription_RequiredModeGroup(), this.getModeDeclarationGroupPrototype(), null, "requiredModeGroup", null, 0, -1, BswModuleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBswModuleDescription__GetEnableInternalBehavior(), this.getBswInternalBehavior(), "getEnableInternalBehavior", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bswModuleEntryEClass, BswModuleEntry.class, "BswModuleEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBswModuleEntry_ServiceId(), this.getPositiveInteger(), "serviceId", null, 0, 1, BswModuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBswModuleEntry_CallType(), this.getBswCallTypeEnum(), "callType", null, 1, 1, BswModuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBswModuleEntry_ExecutionContext(), this.getBswExecutionContextEnum(), "executionContext", null, 1, 1, BswModuleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswModuleEntityEClass, BswModuleEntity.class, "BswModuleEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswModuleEntity_ImplementedEntry(), this.getBswModuleEntry(), null, "implementedEntry", null, 1, 1, BswModuleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModuleEntity_Parent(), this.getBswInternalBehavior(), this.getBswInternalBehavior_Entity(), "parent", null, 1, 1, BswModuleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModuleEntity_AccessedModeGroup(), this.getModeDeclarationGroupPrototype(), null, "accessedModeGroup", null, 0, -1, BswModuleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModuleEntity_ManagedModeGroup(), this.getModeDeclarationGroupPrototype(), null, "managedModeGroup", null, 0, -1, BswModuleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswSchedulableEntityEClass, BswSchedulableEntity.class, "BswSchedulableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswSchedulableEntity_Event(), this.getBswEvent(), this.getBswEvent_StartsOnEvent(), "event", null, 0, -1, BswSchedulableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswEventEClass, BswEvent.class, "BswEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBswEvent_StartsOnEvent(), this.getBswSchedulableEntity(), this.getBswSchedulableEntity_Event(), "startsOnEvent", null, 0, 1, BswEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswEvent_Config(), theEcucPackage.getRteBswEventToTaskMapping(), theEcucPackage.getRteBswEventToTaskMapping_RteBswEvent(), "config", null, 0, -1, BswEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswEvent_Parent(), this.getBswInternalBehavior(), this.getBswInternalBehavior_Event(), "parent", null, 1, 1, BswEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswEvent_DisabledInMode(), this.getModeInBswModuleDescriptionInstanceRef(), null, "disabledInMode", null, 0, -1, BswEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswModeSwitchEventEClass, BswModeSwitchEvent.class, "BswModeSwitchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBswModeSwitchEvent_Activation(), this.getModeActivationKind(), "activation", null, 1, 1, BswModeSwitchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBswModeSwitchEvent_ModeIref(), this.getModeInBswModuleDescriptionInstanceRef(), null, "modeIref", null, 1, 2, BswModeSwitchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeInBswModuleDescriptionInstanceRefEClass, ModeInBswModuleDescriptionInstanceRef.class, "ModeInBswModuleDescriptionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeInBswModuleDescriptionInstanceRef_ContextModeDeclarationGroup(), this.getModeDeclarationGroupPrototype(), null, "contextModeDeclarationGroup", null, 1, 1, ModeInBswModuleDescriptionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeInBswModuleDescriptionInstanceRef_TargetMode(), this.getModeDeclaration(), null, "targetMode", null, 1, 1, ModeInBswModuleDescriptionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswTimingEventEClass, BswTimingEvent.class, "BswTimingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBswTimingEvent_Period(), this.getTimeValue(), "period", null, 0, 1, BswTimingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bswBackgroundEventEClass, BswBackgroundEvent.class, "BswBackgroundEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bswCalledEntityEClass, BswCalledEntity.class, "BswCalledEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bswInterruptEntityEClass, BswInterruptEntity.class, "BswInterruptEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBswInterruptEntity_InterruptSource(), this.getString(), "interruptSource", null, 1, 1, BswInterruptEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemSignalGroupEClass, SystemSignalGroup.class, "SystemSignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSignalGroup_SystemSignal(), this.getSystemSignal(), null, "systemSignal", null, 0, -1, SystemSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSignalGroupEClass, ISignalGroup.class, "ISignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISignalGroup_SystemSignalGroup(), this.getSystemSignalGroup(), null, "systemSignalGroup", null, 1, 1, ISignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISignalGroup_ISignal(), this.getISignal(), null, "iSignal", null, 0, -1, ISignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderRecCompositeTypeMappingEClass, SenderRecCompositeTypeMapping.class, "SenderRecCompositeTypeMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderRecRecordTypeMappingEClass, SenderRecRecordTypeMapping.class, "SenderRecRecordTypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderRecRecordTypeMapping_RecordElementMapping(), this.getSenderRecRecordElementMapping(), null, "recordElementMapping", null, 0, -1, SenderRecRecordTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(senderRecRecordElementMappingEClass, SenderRecRecordElementMapping.class, "SenderRecRecordElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderRecRecordElementMapping_ImplementationRecordElement(), this.getImplementationDataTypeElement(), null, "implementationRecordElement", null, 0, 1, SenderRecRecordElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderRecRecordElementMapping_ComplexTypeMapping(), this.getSenderRecCompositeTypeMapping(), null, "complexTypeMapping", null, 0, 1, SenderRecRecordElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderRecRecordElementMapping_SystemSignal(), this.getSystemSignal(), null, "systemSignal", null, 0, 1, SenderRecRecordElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderRecArrayTypeMappingEClass, SenderRecArrayTypeMapping.class, "SenderRecArrayTypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderRecArrayTypeMapping_ArrayElementMapping(), this.getSenderRecArrayElementMapping(), null, "arrayElementMapping", null, 0, -1, SenderRecArrayTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexedArrayElementEClass, IndexedArrayElement.class, "IndexedArrayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexedArrayElement_ImplementationArrayElement(), this.getImplementationDataTypeElement(), null, "implementationArrayElement", null, 0, 1, IndexedArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexedArrayElement_Index(), this.getInteger(), "index", null, 1, 1, IndexedArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderRecArrayElementMappingEClass, SenderRecArrayElementMapping.class, "SenderRecArrayElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderRecArrayElementMapping_IndexedArrayElement(), this.getIndexedArrayElement(), null, "indexedArrayElement", null, 1, 1, SenderRecArrayElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderRecArrayElementMapping_ComplexTypeMapping(), this.getSenderRecCompositeTypeMapping(), null, "complexTypeMapping", null, 0, 1, SenderRecArrayElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderRecArrayElementMapping_SystemSignal(), this.getSystemSignal(), null, "systemSignal", null, 0, 1, SenderRecArrayElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swPointerTargetPropsEClass, SwPointerTargetProps.class, "SwPointerTargetProps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwPointerTargetProps_TargetCategory(), this.getIdentifier(), "targetCategory", null, 0, 1, SwPointerTargetProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwPointerTargetProps_SwDataDefProps(), this.getSwDataDefProps(), null, "swDataDefProps", null, 0, 1, SwPointerTargetProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arraySizeSemanticsEnumEEnum, ArraySizeSemanticsEnum.class, "ArraySizeSemanticsEnum");
		addEEnumLiteral(arraySizeSemanticsEnumEEnum, ArraySizeSemanticsEnum.FIXED_SIZE);
		addEEnumLiteral(arraySizeSemanticsEnumEEnum, ArraySizeSemanticsEnum.VARIABLE_SIZE);

		initEEnum(argumentDirectionEnumEEnum, ArgumentDirectionEnum.class, "ArgumentDirectionEnum");
		addEEnumLiteral(argumentDirectionEnumEEnum, ArgumentDirectionEnum.IN);
		addEEnumLiteral(argumentDirectionEnumEEnum, ArgumentDirectionEnum.OUT);
		addEEnumLiteral(argumentDirectionEnumEEnum, ArgumentDirectionEnum.INOUT);

		initEEnum(dataFilterTypeEnumEEnum, DataFilterTypeEnum.class, "DataFilterTypeEnum");
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.ALWAYS);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.MASKED_NEW_EQUALS_X);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.MASKED_NEW_DIFFERS_MASKED_OLD);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.MASKED_NEW_DIFFERS_X);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.NEVER);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.NEW_IS_WITHIN);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.NEW_IS_OUTSIDE);
		addEEnumLiteral(dataFilterTypeEnumEEnum, DataFilterTypeEnum.ONE_EVERY_N);

		initEEnum(handleInvalidEnumEEnum, HandleInvalidEnum.class, "HandleInvalidEnum");
		addEEnumLiteral(handleInvalidEnumEEnum, HandleInvalidEnum.DONT_INVALIDATE);
		addEEnumLiteral(handleInvalidEnumEEnum, HandleInvalidEnum.KEEP);
		addEEnumLiteral(handleInvalidEnumEEnum, HandleInvalidEnum.REPLACE);

		initEEnum(swImplPolicyEnumEEnum, SwImplPolicyEnum.class, "SwImplPolicyEnum");
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.UNSPECIFIED);
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.STANDARD);
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.CONST);
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.FIXED);
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.MEASUREMENT_POINT);
		addEEnumLiteral(swImplPolicyEnumEEnum, SwImplPolicyEnum.QUEUED);

		initEEnum(memoryAllocationKeywordPolicyTypeEEnum, MemoryAllocationKeywordPolicyType.class, "MemoryAllocationKeywordPolicyType");
		addEEnumLiteral(memoryAllocationKeywordPolicyTypeEEnum, MemoryAllocationKeywordPolicyType.ADDR_METHOD_SHORT_NAME);
		addEEnumLiteral(memoryAllocationKeywordPolicyTypeEEnum, MemoryAllocationKeywordPolicyType.ADDR_METHOD_SHORT_NAME_AND_ALIGNMENT);

		initEEnum(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.class, "EcucConfigurationVariantEnum");
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.VARIANT_POST_BUILD_SELECTABLE);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.VARIANT_PRE_COMPILE);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.PRECONFIGURED_CONFIGURATION);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.VARIANT_POST_BUILD_LOADABLE);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.VARIANT_POST_BUILD);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.VARIANT_LINK_TIME);
		addEEnumLiteral(ecucConfigurationVariantEnumEEnum, EcucConfigurationVariantEnum.RECOMMENDED_CONFIGURATION);

		initEEnum(modeActivationKindEEnum, ModeActivationKind.class, "ModeActivationKind");
		addEEnumLiteral(modeActivationKindEEnum, ModeActivationKind.ON_ENTRY);
		addEEnumLiteral(modeActivationKindEEnum, ModeActivationKind.ON_EXIT);
		addEEnumLiteral(modeActivationKindEEnum, ModeActivationKind.ON_TRANSITION);

		initEEnum(bswCallTypeEnumEEnum, BswCallTypeEnum.class, "BswCallTypeEnum");
		addEEnumLiteral(bswCallTypeEnumEEnum, BswCallTypeEnum.REGULAR);
		addEEnumLiteral(bswCallTypeEnumEEnum, BswCallTypeEnum.CALLBACK);
		addEEnumLiteral(bswCallTypeEnumEEnum, BswCallTypeEnum.INTERRUPT);
		addEEnumLiteral(bswCallTypeEnumEEnum, BswCallTypeEnum.SCHEDULED);

		initEEnum(bswExecutionContextEnumEEnum, BswExecutionContextEnum.class, "BswExecutionContextEnum");
		addEEnumLiteral(bswExecutionContextEnumEEnum, BswExecutionContextEnum.TASK);
		addEEnumLiteral(bswExecutionContextEnumEEnum, BswExecutionContextEnum.INTERRUPT_CAT1);
		addEEnumLiteral(bswExecutionContextEnumEEnum, BswExecutionContextEnum.INTERRUPT_CAT2);
		addEEnumLiteral(bswExecutionContextEnumEEnum, BswExecutionContextEnum.HOOK);
		addEEnumLiteral(bswExecutionContextEnumEEnum, BswExecutionContextEnum.UNSPECIFIED);

		// Initialize data types
		initEDataType(numericalEDataType, BigDecimal.class, "Numerical", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedIntegerEDataType, BigInteger.class, "UnlimitedInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntegerEDataType, Integer.class, "PositiveInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeValueEDataType, BigDecimal.class, "TimeValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(refEDataType, String.class, "Ref", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cIdentifierEDataType, String.class, "CIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verbatimStringEDataType, String.class, "VerbatimString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, BigDecimal.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nativeDeclarationStringEDataType, String.class, "NativeDeclarationString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sectionInitializationPolicyTypeEDataType, String.class, "SectionInitializationPolicyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(categoryStringEDataType, String.class, "CategoryString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseTypeEncodingStringEDataType, String.class, "BaseTypeEncodingString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(revisionLabelStringEDataType, String.class, "RevisionLabelString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alignmentTypeEDataType, String.class, "AlignmentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// tags
		createTagsAnnotations();
		// stereotypes
		createStereotypesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });																																																																																									
	}

	/**
	 * Initializes the annotations for <b>stereotypes</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStereotypesAnnotations() {
		String source = "stereotypes";																					
		addAnnotation
		  (getRPortPrototype_RequiredInterface(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });				
		addAnnotation
		  (getPPortPrototype_ProvidedInterface(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });													
		addAnnotation
		  (getSwComponentPrototype_Type(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });																			
		addAnnotation
		  (getModeDeclarationGroupPrototype_Type(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });													
		addAnnotation
		  (getDataPrototype_Type(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });													
		addAnnotation
		  (getPortDefinedArgumentValue_ValueType(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });			
		addAnnotation
		  (getRootSwCompositionPrototype_SoftwareComposition(), 
		   source, 
		   new String[] {
			 "isOfType", "true"
		   });					
		addAnnotation
		  (limitEClass, 
		   source, 
		   new String[] {
			 "atpMixedString", "true"
		   });							
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";							
		addAnnotation
		  (getAtomicSwComponentType__GetUsingApplicationDataTypes(), 
		   source, 
		   new String[] {
			 "body", "getUsingDataTypes()\n\t\t\t\t\t->select(oclIsKindOf(ApplicationDataType)).oclAsType(ApplicationDataType)\n\t\t\t\t\t->asOrderedSet()"
		   });			
		addAnnotation
		  (getAtomicSwComponentType__GetUsingImplementationDataTypes(), 
		   source, 
		   new String[] {
			 "body", "getUsingDataTypes()\n\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t->asOrderedSet()"
		   });			
		addAnnotation
		  (getAtomicSwComponentType__GetUsingDataTypes(), 
		   source, 
		   new String[] {
			 "body", "let internalUsingDataTypes : Set(AutosarDataType) = if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getUsingDataTypes()\n\t\t\t\t\tendif\n\t\t\t\tin getRPorts().getUsingDataTypes()\n\t\t\t\t\t->union(getPPorts().getUsingDataTypes())\n\t\t\t\t\t->union(internalUsingDataTypes)\n\t\t\t\t\t->asOrderedSet()"
		   });			
		addAnnotation
		  (getAtomicSwComponentType__GetImplementationDataType__AutosarDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse self.internalBehavior.getImplementationDataType(dataType)\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAtomicSwComponentType__GetImplementationDataTypes__ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getImplementationDataTypes(applicationDataType)\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAtomicSwComponentType__GetUsingClientServerInterfaces(), 
		   source, 
		   new String[] {
			 "body", "getRPorts().requiredInterface\n\t\t\t\t\t->union(getPPorts().providedInterface)\n\t\t\t\t\t->select(oclIsKindOf(ClientServerInterface)).oclAsType(ClientServerInterface)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getAtomicSwComponentType__GetRPorts(), 
		   source, 
		   new String[] {
			 "body", "self.port\n\t\t\t\t\t->select(oclIsKindOf(RPortPrototype)).oclAsType(RPortPrototype)\n\t\t\t\t\t->asOrderedSet()"
		   });		
		addAnnotation
		  (getAtomicSwComponentType__GetPPorts(), 
		   source, 
		   new String[] {
			 "body", "self.port\n\t\t\t\t\t->select(oclIsKindOf(PPortPrototype)).oclAsType(PPortPrototype)\n\t\t\t\t\t->asOrderedSet()"
		   });				
		addAnnotation
		  (getRPortPrototype__GetUsingDataTypes(), 
		   source, 
		   new String[] {
			 "body", "if self.requiredInterface.oclIsKindOf(SenderReceiverInterface)\n\t\t\t\t\tthen self.requiredInterface.oclAsType(SenderReceiverInterface).dataElement.type\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\telse if self.requiredInterface.oclIsKindOf(ClientServerInterface)\n\t\t\t\t\t\tthen self.requiredInterface.oclAsType(ClientServerInterface).operation.argument.type\n\t\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\t\telse OrderedSet(AutosarDataType){}\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getPPortPrototype__GetUsingDataTypes(), 
		   source, 
		   new String[] {
			 "body", "if self.providedInterface.oclIsKindOf(SenderReceiverInterface)\n\t\t\t\t\tthen self.providedInterface.oclAsType(SenderReceiverInterface).dataElement.type\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\telse if self.providedInterface.oclIsKindOf(ClientServerInterface)\n\t\t\t\t\t\tthen self.providedInterface.oclAsType(ClientServerInterface).operation.argument.type\n\t\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\t\telse OrderedSet(AutosarDataType){}\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType->includes(dataType))"
		   });			
		addAnnotation
		  (getSwcInternalBehavior__GetReferencerIncludedDataTypeSets__ImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType\n\t\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t\t->includes(dataType))"
		   });			
		addAnnotation
		  (getSwcInternalBehavior__GetUsingDataTypes(), 
		   source, 
		   new String[] {
			 "body", "self.includedDataTypeSet.dataType->asOrderedSet()"
		   });			
		addAnnotation
		  (getSwcInternalBehavior__GetImplementationDataType__AutosarDataType(), 
		   source, 
		   new String[] {
			 "body", "if dataType.oclIsKindOf(ImplementationDataType)\n\t\t\t\t\tthen dataType.oclAsType(ImplementationDataType)\n\t\t\t\t\telse self.getImplementationDataType(dataType.oclAsType(ApplicationDataType))\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getSwcInternalBehavior__GetImplementationDataType__ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "let implDataType : ImplementationDataType = getImplementationDataTypes(applicationDataType)->any(true)\n\t\t\t\tin if implDataType.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse implDataType\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getSwcInternalBehavior__GetImplementationDataTypes__ApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "self.dataTypeMapping.dataTypeMap->select(m | m.applicationDataType = applicationDataType).implementationDataType->asOrderedSet()"
		   });		
		addAnnotation
		  (getDataSendCompletedEvent_EventSourceData(), 
		   source, 
		   new String[] {
			 "derivation", "eventSource.accessedVariable.autosarVariable"
		   });			
		addAnnotation
		  (getAutosarDataType__GetSwImplPolicy(), 
		   source, 
		   new String[] {
			 "body", "if swDataDefProps.swImplPolicy.oclIsUndefined()\n\t\t\t\t\tthen SwImplPolicyEnum::unspecified\n\t\t\t\t\telse swDataDefProps.swImplPolicy\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAutosarDataType_InvalidValue(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.invalidValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.invalidValue\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAutosarDataType_CompuMethod(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.compuMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.compuMethod\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAutosarDataType_DataConstr(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.dataConstr.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.dataConstr\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getAutosarDataType_SwAddrMethod(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.swAddrMethod\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getImplementationDataType__GetLeafImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "if swDataDefProps.implementationDataType.oclIsUndefined()\n\t\t\t\tthen self\n\t\t\t\telse swDataDefProps.implementationDataType.getLeafImplementationDataType()\n\t\t\t\tendif"
		   });		
		addAnnotation
		  (getImplementationDataType__IsPrimitiveType(), 
		   source, 
		   new String[] {
			 "body", "getLeafImplementationDataType().category = \'VALUE\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsPointerType(), 
		   source, 
		   new String[] {
			 "body", "getLeafImplementationDataType().category = \'DATA_REFERENCE\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsArrayType(), 
		   source, 
		   new String[] {
			 "body", "getLeafImplementationDataType().category = \'ARRAY\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsStructType(), 
		   source, 
		   new String[] {
			 "body", "getLeafImplementationDataType().category = \'STRUCTURE\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsUnionType(), 
		   source, 
		   new String[] {
			 "body", "getLeafImplementationDataType().category = \'UNION\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsRedefinitionType(), 
		   source, 
		   new String[] {
			 "body", "category = \'TYPE_REFERENCE\'"
		   });		
		addAnnotation
		  (getImplementationDataType__IsComplexType(), 
		   source, 
		   new String[] {
			 "body", "not isPrimitiveType()"
		   });		
		addAnnotation
		  (getImplementationDataType_BaseType(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.baseType.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.baseType\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getImplementationDataType_SwAlignment(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.swAlignment.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.swAlignment\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getImplementationDataTypeElement__IsRedefinitionType(), 
		   source, 
		   new String[] {
			 "body", "category = \'TYPE_REFERENCE\'"
		   });				
		addAnnotation
		  (getAutosarDataPrototype__GetSwAddrMethod(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not self.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen self.swAddrMethod\n\t\t\t\t\telse if not implType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAddrMethod\n\t\t\t\t\telse if not applType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applType.swAddrMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif"
		   });			
		addAnnotation
		  (getAutosarDataPrototype__GetSwAlignment(), 
		   source, 
		   new String[] {
			 "body", "let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not self.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen self.swAlignment\n\t\t\t\t\telse if not implType.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAlignment\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif"
		   });			
		addAnnotation
		  (getAutosarDataPrototype__GetApplicationDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.type.oclIsKindOf(m2::ApplicationDataType)\n\t\t\t\t\tthen self.type.oclAsType(m2::ApplicationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif"
		   });			
		addAnnotation
		  (getAutosarDataPrototype__GetImplementationDataType(), 
		   source, 
		   new String[] {
			 "body", "if self.type.oclIsKindOf(m2::ImplementationDataType)\n\t\t\t\t\tthen self.type.oclAsType(m2::ImplementationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getDataPrototype__GetSwImplPolicy(), 
		   source, 
		   new String[] {
			 "body", "if swDataDefProps.swImplPolicy.oclIsUndefined()\n\t\t\t\t\tthen SwImplPolicyEnum::unspecified\n\t\t\t\t\telse swDataDefProps.swImplPolicy\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getDataPrototype_SwAddrMethod(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.swAddrMethod\n\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getDataPrototype_SwAlignment(), 
		   source, 
		   new String[] {
			 "derivation", "if swDataDefProps.swAlignment.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swDataDefProps.swAlignment\n\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getConstantReference__GetEndValueSpec(), 
		   source, 
		   new String[] {
			 "body", "if constant.valueSpec.oclIsKindOf(ConstantReference)\n\t\t\t\t\tthen constant.valueSpec.oclAsType(ConstantReference).getEndValueSpec()\n\t\t\t\t\telse constant.valueSpec\n\t\t\t\t\tendif"
		   });					
		addAnnotation
		  (getDataFilter__IsFilterEnabled(), 
		   source, 
		   new String[] {
			 "body", "dataFilterType <> DataFilterTypeEnum::always"
		   });		
		addAnnotation
		  (getDataFilter__IsCompatibleWith__DataFilter(), 
		   source, 
		   new String[] {
			 "body", "self.dataFilterType = another.dataFilterType and self.mask = another.mask and self.max = another.max and\n\t\t\t\t\tself.min = another.min and self.offset = another.offset and self.period = another.period and self.x = another.x"
		   });			
		addAnnotation
		  (getInvalidationPolicy__IsInvalidationEnabled(), 
		   source, 
		   new String[] {
			 "body", "not handleInvalid.oclIsUndefined() and (handleInvalid = m2::HandleInvalidEnum::keep or handleInvalid =\n\t\t\t\t\tm2::HandleInvalidEnum::replace)"
		   });		
		addAnnotation
		  (getInvalidationPolicy__IsInvalidationKeep(), 
		   source, 
		   new String[] {
			 "body", "not handleInvalid.oclIsUndefined() and handleInvalid = m2::HandleInvalidEnum::keep"
		   });		
		addAnnotation
		  (getInvalidationPolicy__IsInvalidationReplace(), 
		   source, 
		   new String[] {
			 "body", "not handleInvalid.oclIsUndefined() and handleInvalid = m2::HandleInvalidEnum::replace"
		   });						
		addAnnotation
		  (getDataConstr__GetLowerLimitValue(), 
		   source, 
		   new String[] {
			 "body", "let lowerLimit : Limit = self.dataConstrRule.internalConstrs.lowerLimit->any(true)\n\t\t\t\t\t\t\tin if lowerLimit.oclIsUndefined()\n\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\telse lowerLimit.value\n\t\t\t\t\t\t\tendif"
		   });		
		addAnnotation
		  (getDataConstr__GetUpperLimitValue(), 
		   source, 
		   new String[] {
			 "body", "let upperLimit : Limit = self.dataConstrRule.internalConstrs.upperLimit->any(true)\n\t\t\t\t\t\t\tin if upperLimit.oclIsUndefined()\n\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\telse upperLimit.value\n\t\t\t\t\t\t\tendif"
		   });				
		addAnnotation
		  (getBswInternalBehavior_BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "derivation", "entity->select(oclIsKindOf(BswSchedulableEntity)).oclAsType(BswSchedulableEntity)->asOrderedSet()"
		   });			
		addAnnotation
		  (getBswModuleDescription__GetEnableInternalBehavior(), 
		   source, 
		   new String[] {
			 "body", "let behavior : Set(BswInternalBehavior) = self.internalBehavior->select(implementation->size() > 0)\n\t\t\t\t\t\t\tin if behavior->isEmpty() then\n\t\t\t\t\t\t\t\tnull\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tbehavior->any(true)\n\t\t\t\t\t\t\tendif"
		   });			
	}

	/**
	 * Initializes the annotations for <b>tags</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTagsAnnotations() {
		String source = "tags";																		
		addAnnotation
		  (getAtomicSwComponentType_InternalBehavior(), 
		   source, 
		   new String[] {
			 "xml.roleWrapperElement", "true"
		   });																																																														
		addAnnotation
		  (getSystem_RootSoftwareComposition(), 
		   source, 
		   new String[] {
			 "xml.roleWrapperElement", "true"
		   });			
		addAnnotation
		  (getEcucValueCollection_EcucValue(), 
		   source, 
		   new String[] {
			 "xml.name", "ECUC-MODULE-CONFIGURATION-VALUES-REF",
			 "xml.namePlural", "ECUC-VALUES"
		   });					
		addAnnotation
		  (getAnyInstanceRef_ContextElement(), 
		   source, 
		   new String[] {
			 "xml.roleWrapperElement", "false"
		   });					
		addAnnotation
		  (getBswModuleEntity_AccessedModeGroup(), 
		   source, 
		   new String[] {
			 "xml.namePlural", "ACCESSED-MODE-GROUPS",
			 "xml.name", "MODE-DECLARATION-GROUP-PROTOTYPE-REF"
		   });		
		addAnnotation
		  (getBswModuleEntity_ManagedModeGroup(), 
		   source, 
		   new String[] {
			 "xml.namePlural", "MANAGED-MODE-GROUPS",
			 "xml.name", "MODE-DECLARATION-GROUP-PROTOTYPE-REF"
		   });		
		addAnnotation
		  (getBswEvent_DisabledInMode(), 
		   source, 
		   new String[] {
			 "xml.namePlural", "DISABLED-IN-MODE-IREFS",
			 "xml.name", "DISABLED-IN-MODE-IREF"
		   });
	}

} //M2PackageImpl
