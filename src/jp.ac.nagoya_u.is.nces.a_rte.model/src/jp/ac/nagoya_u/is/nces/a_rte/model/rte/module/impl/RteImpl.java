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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteNonqueuedSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteQueuedSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getCore <em>Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getBswm <em>Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getGenerationInfo <em>Generation Info</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentType <em>Dependent Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentConstant <em>Dependent Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentOsApi <em>Dependent Os Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentIocCommunication <em>Dependent Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentComApi <em>Dependent Com Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getIocInitValueConstant <em>Ioc Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getIocInitValueVariableSet <em>Ioc Init Value Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteMemoryMapping <em>Rte Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalTfParamType <em>Com Send Signal Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalGroupTfParamType <em>Com Send Signal Group Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getCsTfParamType <em>Cs Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSrRteNonqueuedSendTfParamType <em>Sr Rte Nonqueued Send Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSrRteQueuedSendTfParamType <em>Sr Rte Queued Send Tf Param Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSrRteBufferQueueMaxLengthConstant <em>Sr Rte Buffer Queue Max Length Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSrRteBufferQueueType <em>Sr Rte Buffer Queue Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getImmediateConstant <em>Immediate Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComCallback <em>Com Callback</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteStartApi <em>Rte Start Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteStopApi <em>Rte Stop Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSchmInitApi <em>Schm Init Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSchmDeinitApi <em>Schm Deinit Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteImpl extends LogicalCompartmentImpl implements Rte {
	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> core;

	/**
	 * The cached value of the '{@link #getBswm() <em>Bswm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswm()
	 * @generated
	 * @ordered
	 */
	protected EList<Bswm> bswm;

	/**
	 * The cached value of the '{@link #getGenerationInfo() <em>Generation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationInfo()
	 * @generated
	 * @ordered
	 */
	protected GenerationInfo generationInfo;

	/**
	 * The cached value of the '{@link #getDependentType() <em>Dependent Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> dependentType;

	/**
	 * The cached value of the '{@link #getDependentConstant() <em>Dependent Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> dependentConstant;

	/**
	 * The cached value of the '{@link #getDependentOsApi() <em>Dependent Os Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentOsApi()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApi> dependentOsApi;

	/**
	 * The cached value of the '{@link #getDependentIocCommunication() <em>Dependent Ioc Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<IocCommunication> dependentIocCommunication;

	/**
	 * The cached value of the '{@link #getDependentComApi() <em>Dependent Com Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentComApi()
	 * @generated
	 * @ordered
	 */
	protected EList<ComApi> dependentComApi;

	/**
	 * The cached value of the '{@link #getIocInitValueConstant() <em>Ioc Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> iocInitValueConstant;

	/**
	 * The cached value of the '{@link #getIocInitValueVariableSet() <em>Ioc Init Value Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocInitValueVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> iocInitValueVariableSet;

	/**
	 * The cached value of the '{@link #getRteMemoryMapping() <em>Rte Memory Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<BswMemoryMapping> rteMemoryMapping;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> implementationDataType;

	/**
	 * The cached value of the '{@link #getComSendSignalTfParamType() <em>Com Send Signal Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalTfParamType()
	 * @generated
	 * @ordered
	 */
	protected ComSendTrustedFunctionParamType comSendSignalTfParamType;

	/**
	 * The cached value of the '{@link #getComSendSignalGroupTfParamType() <em>Com Send Signal Group Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalGroupTfParamType()
	 * @generated
	 * @ordered
	 */
	protected ComSendTrustedFunctionParamType comSendSignalGroupTfParamType;

	/**
	 * The cached value of the '{@link #getCsTfParamType() <em>Cs Tf Param Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamType()
	 * @generated
	 * @ordered
	 */
	protected EList<CsTrustedFunctionParamType> csTfParamType;

	/**
	 * The cached value of the '{@link #getSrRteNonqueuedSendTfParamType() <em>Sr Rte Nonqueued Send Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteNonqueuedSendTfParamType()
	 * @generated
	 * @ordered
	 */
	protected RteNonqueuedSendTrustedFunctionParamType srRteNonqueuedSendTfParamType;

	/**
	 * The cached value of the '{@link #getSrRteQueuedSendTfParamType() <em>Sr Rte Queued Send Tf Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteQueuedSendTfParamType()
	 * @generated
	 * @ordered
	 */
	protected RteQueuedSendTrustedFunctionParamType srRteQueuedSendTfParamType;

	/**
	 * The cached value of the '{@link #getSrRteBufferQueueMaxLengthConstant() <em>Sr Rte Buffer Queue Max Length Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteBufferQueueMaxLengthConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srRteBufferQueueMaxLengthConstant;

	/**
	 * The cached value of the '{@link #getSrRteBufferQueueType() <em>Sr Rte Buffer Queue Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteBufferQueueType()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferQueueType> srRteBufferQueueType;

	/**
	 * The cached value of the '{@link #getImmediateConstant() <em>Immediate Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> immediateConstant;

	/**
	 * The cached value of the '{@link #getComSendSignalTrustedFunction() <em>Com Send Signal Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<ComSendSignalTrustedFunction> comSendSignalTrustedFunction;

	/**
	 * The cached value of the '{@link #getComSendSignalPeriodicEntity() <em>Com Send Signal Periodic Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalPeriodicEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalPeriodicEntity comSendSignalPeriodicEntity;

	/**
	 * The cached value of the '{@link #getComSendSignalImmediateEntity() <em>Com Send Signal Immediate Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalImmediateEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateEntity comSendSignalImmediateEntity;

	/**
	 * The cached value of the '{@link #getComSendSignalImmediateTaskBody() <em>Com Send Signal Immediate Task Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateTaskBody comSendSignalImmediateTaskBody;

	/**
	 * The cached value of the '{@link #getComCallback() <em>Com Callback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallback()
	 * @generated
	 * @ordered
	 */
	protected EList<ComCallback> comCallback;

	/**
	 * The cached value of the '{@link #getRteStartApi() <em>Rte Start Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteStartApi()
	 * @generated
	 * @ordered
	 */
	protected RteStartApi rteStartApi;

	/**
	 * The cached value of the '{@link #getRteStopApi() <em>Rte Stop Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteStopApi()
	 * @generated
	 * @ordered
	 */
	protected RteStopApi rteStopApi;

	/**
	 * The cached value of the '{@link #getSchmInitApi() <em>Schm Init Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmInitApi()
	 * @generated
	 * @ordered
	 */
	protected SchmInitApi schmInitApi;

	/**
	 * The cached value of the '{@link #getSchmDeinitApi() <em>Schm Deinit Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmDeinitApi()
	 * @generated
	 * @ordered
	 */
	protected SchmDeinitApi schmDeinitApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCore() {
		if (core == null) {
			core = new EObjectContainmentEList<Core>(Core.class, this, ModulePackage.RTE__CORE);
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComCallback> getComCallback() {
		if (comCallback == null) {
			comCallback = new EObjectContainmentEList<ComCallback>(ComCallback.class, this, ModulePackage.RTE__COM_CALLBACK);
		}
		return comCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalPeriodicEntity getComSendSignalPeriodicEntity() {
		return comSendSignalPeriodicEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity newComSendSignalPeriodicEntity, NotificationChain msgs) {
		ComSendSignalPeriodicEntity oldComSendSignalPeriodicEntity = comSendSignalPeriodicEntity;
		comSendSignalPeriodicEntity = newComSendSignalPeriodicEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, oldComSendSignalPeriodicEntity, newComSendSignalPeriodicEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity newComSendSignalPeriodicEntity) {
		if (newComSendSignalPeriodicEntity != comSendSignalPeriodicEntity) {
			NotificationChain msgs = null;
			if (comSendSignalPeriodicEntity != null)
				msgs = ((InternalEObject)comSendSignalPeriodicEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, null, msgs);
			if (newComSendSignalPeriodicEntity != null)
				msgs = ((InternalEObject)newComSendSignalPeriodicEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, null, msgs);
			msgs = basicSetComSendSignalPeriodicEntity(newComSendSignalPeriodicEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, newComSendSignalPeriodicEntity, newComSendSignalPeriodicEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity getComSendSignalImmediateEntity() {
		return comSendSignalImmediateEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalImmediateEntity(ComSendSignalImmediateEntity newComSendSignalImmediateEntity, NotificationChain msgs) {
		ComSendSignalImmediateEntity oldComSendSignalImmediateEntity = comSendSignalImmediateEntity;
		comSendSignalImmediateEntity = newComSendSignalImmediateEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, oldComSendSignalImmediateEntity, newComSendSignalImmediateEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalImmediateEntity(ComSendSignalImmediateEntity newComSendSignalImmediateEntity) {
		if (newComSendSignalImmediateEntity != comSendSignalImmediateEntity) {
			NotificationChain msgs = null;
			if (comSendSignalImmediateEntity != null)
				msgs = ((InternalEObject)comSendSignalImmediateEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, null, msgs);
			if (newComSendSignalImmediateEntity != null)
				msgs = ((InternalEObject)newComSendSignalImmediateEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, null, msgs);
			msgs = basicSetComSendSignalImmediateEntity(newComSendSignalImmediateEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, newComSendSignalImmediateEntity, newComSendSignalImmediateEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComSendSignalTrustedFunction> getComSendSignalTrustedFunction() {
		if (comSendSignalTrustedFunction == null) {
			comSendSignalTrustedFunction = new EObjectContainmentEList<ComSendSignalTrustedFunction>(ComSendSignalTrustedFunction.class, this, ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION);
		}
		return comSendSignalTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getDependentType() {
		if (dependentType == null) {
			dependentType = new EObjectContainmentEList<Type>(Type.class, this, ModulePackage.RTE__DEPENDENT_TYPE);
		}
		return dependentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getImmediateConstant() {
		if (immediateConstant == null) {
			immediateConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__IMMEDIATE_CONSTANT);
		}
		return immediateConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrRteBufferQueueMaxLengthConstant() {
		if (srRteBufferQueueMaxLengthConstant == null) {
			srRteBufferQueueMaxLengthConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT);
		}
		return srRteBufferQueueMaxLengthConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApi> getDependentOsApi() {
		if (dependentOsApi == null) {
			dependentOsApi = new EObjectContainmentEList<OsApi>(OsApi.class, this, ModulePackage.RTE__DEPENDENT_OS_API);
		}
		return dependentOsApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocCommunication> getDependentIocCommunication() {
		if (dependentIocCommunication == null) {
			dependentIocCommunication = new EObjectContainmentEList<IocCommunication>(IocCommunication.class, this, ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION);
		}
		return dependentIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComApi> getDependentComApi() {
		if (dependentComApi == null) {
			dependentComApi = new EObjectContainmentEList<ComApi>(ComApi.class, this, ModulePackage.RTE__DEPENDENT_COM_API);
		}
		return dependentComApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getIocInitValueConstant() {
		if (iocInitValueConstant == null) {
			iocInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT);
		}
		return iocInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getIocInitValueVariableSet() {
		if (iocInitValueVariableSet == null) {
			iocInitValueVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET);
		}
		return iocInitValueVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteStartApi getRteStartApi() {
		return rteStartApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteStartApi(RteStartApi newRteStartApi, NotificationChain msgs) {
		RteStartApi oldRteStartApi = rteStartApi;
		rteStartApi = newRteStartApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_START_API, oldRteStartApi, newRteStartApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteStartApi(RteStartApi newRteStartApi) {
		if (newRteStartApi != rteStartApi) {
			NotificationChain msgs = null;
			if (rteStartApi != null)
				msgs = ((InternalEObject)rteStartApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_START_API, null, msgs);
			if (newRteStartApi != null)
				msgs = ((InternalEObject)newRteStartApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_START_API, null, msgs);
			msgs = basicSetRteStartApi(newRteStartApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_START_API, newRteStartApi, newRteStartApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getDependentConstant() {
		if (dependentConstant == null) {
			dependentConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__DEPENDENT_CONSTANT);
		}
		return dependentConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateTaskBody getComSendSignalImmediateTaskBody() {
		return comSendSignalImmediateTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody newComSendSignalImmediateTaskBody, NotificationChain msgs) {
		ComSendSignalImmediateTaskBody oldComSendSignalImmediateTaskBody = comSendSignalImmediateTaskBody;
		comSendSignalImmediateTaskBody = newComSendSignalImmediateTaskBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, oldComSendSignalImmediateTaskBody, newComSendSignalImmediateTaskBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody newComSendSignalImmediateTaskBody) {
		if (newComSendSignalImmediateTaskBody != comSendSignalImmediateTaskBody) {
			NotificationChain msgs = null;
			if (comSendSignalImmediateTaskBody != null)
				msgs = ((InternalEObject)comSendSignalImmediateTaskBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, null, msgs);
			if (newComSendSignalImmediateTaskBody != null)
				msgs = ((InternalEObject)newComSendSignalImmediateTaskBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, null, msgs);
			msgs = basicSetComSendSignalImmediateTaskBody(newComSendSignalImmediateTaskBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, newComSendSignalImmediateTaskBody, newComSendSignalImmediateTaskBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteStopApi getRteStopApi() {
		return rteStopApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteStopApi(RteStopApi newRteStopApi, NotificationChain msgs) {
		RteStopApi oldRteStopApi = rteStopApi;
		rteStopApi = newRteStopApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_STOP_API, oldRteStopApi, newRteStopApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteStopApi(RteStopApi newRteStopApi) {
		if (newRteStopApi != rteStopApi) {
			NotificationChain msgs = null;
			if (rteStopApi != null)
				msgs = ((InternalEObject)rteStopApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_STOP_API, null, msgs);
			if (newRteStopApi != null)
				msgs = ((InternalEObject)newRteStopApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_STOP_API, null, msgs);
			msgs = basicSetRteStopApi(newRteStopApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_STOP_API, newRteStopApi, newRteStopApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getImplementationDataType() {
		if (implementationDataType == null) {
			implementationDataType = new EObjectContainmentEList<Type>(Type.class, this, ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE);
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendTrustedFunctionParamType getComSendSignalTfParamType() {
		return comSendSignalTfParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalTfParamType(ComSendTrustedFunctionParamType newComSendSignalTfParamType, NotificationChain msgs) {
		ComSendTrustedFunctionParamType oldComSendSignalTfParamType = comSendSignalTfParamType;
		comSendSignalTfParamType = newComSendSignalTfParamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE, oldComSendSignalTfParamType, newComSendSignalTfParamType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalTfParamType(ComSendTrustedFunctionParamType newComSendSignalTfParamType) {
		if (newComSendSignalTfParamType != comSendSignalTfParamType) {
			NotificationChain msgs = null;
			if (comSendSignalTfParamType != null)
				msgs = ((InternalEObject)comSendSignalTfParamType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE, null, msgs);
			if (newComSendSignalTfParamType != null)
				msgs = ((InternalEObject)newComSendSignalTfParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE, null, msgs);
			msgs = basicSetComSendSignalTfParamType(newComSendSignalTfParamType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE, newComSendSignalTfParamType, newComSendSignalTfParamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendTrustedFunctionParamType getComSendSignalGroupTfParamType() {
		return comSendSignalGroupTfParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalGroupTfParamType(ComSendTrustedFunctionParamType newComSendSignalGroupTfParamType, NotificationChain msgs) {
		ComSendTrustedFunctionParamType oldComSendSignalGroupTfParamType = comSendSignalGroupTfParamType;
		comSendSignalGroupTfParamType = newComSendSignalGroupTfParamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE, oldComSendSignalGroupTfParamType, newComSendSignalGroupTfParamType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalGroupTfParamType(ComSendTrustedFunctionParamType newComSendSignalGroupTfParamType) {
		if (newComSendSignalGroupTfParamType != comSendSignalGroupTfParamType) {
			NotificationChain msgs = null;
			if (comSendSignalGroupTfParamType != null)
				msgs = ((InternalEObject)comSendSignalGroupTfParamType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE, null, msgs);
			if (newComSendSignalGroupTfParamType != null)
				msgs = ((InternalEObject)newComSendSignalGroupTfParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE, null, msgs);
			msgs = basicSetComSendSignalGroupTfParamType(newComSendSignalGroupTfParamType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE, newComSendSignalGroupTfParamType, newComSendSignalGroupTfParamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CsTrustedFunctionParamType> getCsTfParamType() {
		if (csTfParamType == null) {
			csTfParamType = new EObjectContainmentEList<CsTrustedFunctionParamType>(CsTrustedFunctionParamType.class, this, ModulePackage.RTE__CS_TF_PARAM_TYPE);
		}
		return csTfParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteNonqueuedSendTrustedFunctionParamType getSrRteNonqueuedSendTfParamType() {
		return srRteNonqueuedSendTfParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrRteNonqueuedSendTfParamType(RteNonqueuedSendTrustedFunctionParamType newSrRteNonqueuedSendTfParamType, NotificationChain msgs) {
		RteNonqueuedSendTrustedFunctionParamType oldSrRteNonqueuedSendTfParamType = srRteNonqueuedSendTfParamType;
		srRteNonqueuedSendTfParamType = newSrRteNonqueuedSendTfParamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE, oldSrRteNonqueuedSendTfParamType, newSrRteNonqueuedSendTfParamType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrRteNonqueuedSendTfParamType(RteNonqueuedSendTrustedFunctionParamType newSrRteNonqueuedSendTfParamType) {
		if (newSrRteNonqueuedSendTfParamType != srRteNonqueuedSendTfParamType) {
			NotificationChain msgs = null;
			if (srRteNonqueuedSendTfParamType != null)
				msgs = ((InternalEObject)srRteNonqueuedSendTfParamType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE, null, msgs);
			if (newSrRteNonqueuedSendTfParamType != null)
				msgs = ((InternalEObject)newSrRteNonqueuedSendTfParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE, null, msgs);
			msgs = basicSetSrRteNonqueuedSendTfParamType(newSrRteNonqueuedSendTfParamType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE, newSrRteNonqueuedSendTfParamType, newSrRteNonqueuedSendTfParamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteQueuedSendTrustedFunctionParamType getSrRteQueuedSendTfParamType() {
		return srRteQueuedSendTfParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrRteQueuedSendTfParamType(RteQueuedSendTrustedFunctionParamType newSrRteQueuedSendTfParamType, NotificationChain msgs) {
		RteQueuedSendTrustedFunctionParamType oldSrRteQueuedSendTfParamType = srRteQueuedSendTfParamType;
		srRteQueuedSendTfParamType = newSrRteQueuedSendTfParamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE, oldSrRteQueuedSendTfParamType, newSrRteQueuedSendTfParamType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrRteQueuedSendTfParamType(RteQueuedSendTrustedFunctionParamType newSrRteQueuedSendTfParamType) {
		if (newSrRteQueuedSendTfParamType != srRteQueuedSendTfParamType) {
			NotificationChain msgs = null;
			if (srRteQueuedSendTfParamType != null)
				msgs = ((InternalEObject)srRteQueuedSendTfParamType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE, null, msgs);
			if (newSrRteQueuedSendTfParamType != null)
				msgs = ((InternalEObject)newSrRteQueuedSendTfParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE, null, msgs);
			msgs = basicSetSrRteQueuedSendTfParamType(newSrRteQueuedSendTfParamType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE, newSrRteQueuedSendTfParamType, newSrRteQueuedSendTfParamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferQueueType> getSrRteBufferQueueType() {
		if (srRteBufferQueueType == null) {
			srRteBufferQueueType = new EObjectContainmentEList<RteBufferQueueType>(RteBufferQueueType.class, this, ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE);
		}
		return srRteBufferQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswMemoryMapping> getRteMemoryMapping() {
		if (rteMemoryMapping == null) {
			rteMemoryMapping = new EObjectContainmentEList<BswMemoryMapping>(BswMemoryMapping.class, this, ModulePackage.RTE__RTE_MEMORY_MAPPING);
		}
		return rteMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationInfo getGenerationInfo() {
		return generationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationInfo(GenerationInfo newGenerationInfo, NotificationChain msgs) {
		GenerationInfo oldGenerationInfo = generationInfo;
		generationInfo = newGenerationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__GENERATION_INFO, oldGenerationInfo, newGenerationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationInfo(GenerationInfo newGenerationInfo) {
		if (newGenerationInfo != generationInfo) {
			NotificationChain msgs = null;
			if (generationInfo != null)
				msgs = ((InternalEObject)generationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__GENERATION_INFO, null, msgs);
			if (newGenerationInfo != null)
				msgs = ((InternalEObject)newGenerationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__GENERATION_INFO, null, msgs);
			msgs = basicSetGenerationInfo(newGenerationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__GENERATION_INFO, newGenerationInfo, newGenerationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bswm> getBswm() {
		if (bswm == null) {
			bswm = new EObjectContainmentEList<Bswm>(Bswm.class, this, ModulePackage.RTE__BSWM);
		}
		return bswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmInitApi getSchmInitApi() {
		return schmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmInitApi(SchmInitApi newSchmInitApi, NotificationChain msgs) {
		SchmInitApi oldSchmInitApi = schmInitApi;
		schmInitApi = newSchmInitApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_INIT_API, oldSchmInitApi, newSchmInitApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmInitApi(SchmInitApi newSchmInitApi) {
		if (newSchmInitApi != schmInitApi) {
			NotificationChain msgs = null;
			if (schmInitApi != null)
				msgs = ((InternalEObject)schmInitApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_INIT_API, null, msgs);
			if (newSchmInitApi != null)
				msgs = ((InternalEObject)newSchmInitApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_INIT_API, null, msgs);
			msgs = basicSetSchmInitApi(newSchmInitApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_INIT_API, newSchmInitApi, newSchmInitApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmDeinitApi getSchmDeinitApi() {
		return schmDeinitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmDeinitApi(SchmDeinitApi newSchmDeinitApi, NotificationChain msgs) {
		SchmDeinitApi oldSchmDeinitApi = schmDeinitApi;
		schmDeinitApi = newSchmDeinitApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_DEINIT_API, oldSchmDeinitApi, newSchmDeinitApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmDeinitApi(SchmDeinitApi newSchmDeinitApi) {
		if (newSchmDeinitApi != schmDeinitApi) {
			NotificationChain msgs = null;
			if (schmDeinitApi != null)
				msgs = ((InternalEObject)schmDeinitApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_DEINIT_API, null, msgs);
			if (newSchmDeinitApi != null)
				msgs = ((InternalEObject)newSchmDeinitApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_DEINIT_API, null, msgs);
			msgs = basicSetSchmDeinitApi(newSchmDeinitApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_DEINIT_API, newSchmDeinitApi, newSchmDeinitApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				return ((InternalEList<?>)getCore()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__BSWM:
				return ((InternalEList<?>)getBswm()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__GENERATION_INFO:
				return basicSetGenerationInfo(null, msgs);
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return ((InternalEList<?>)getDependentType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return ((InternalEList<?>)getDependentConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return ((InternalEList<?>)getDependentOsApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return ((InternalEList<?>)getDependentIocCommunication()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return ((InternalEList<?>)getDependentComApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getIocInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
				return ((InternalEList<?>)getIocInitValueVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return ((InternalEList<?>)getRteMemoryMapping()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
				return ((InternalEList<?>)getImplementationDataType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
				return basicSetComSendSignalTfParamType(null, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
				return basicSetComSendSignalGroupTfParamType(null, msgs);
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
				return ((InternalEList<?>)getCsTfParamType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE:
				return basicSetSrRteNonqueuedSendTfParamType(null, msgs);
			case ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE:
				return basicSetSrRteQueuedSendTfParamType(null, msgs);
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
				return ((InternalEList<?>)getSrRteBufferQueueMaxLengthConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
				return ((InternalEList<?>)getSrRteBufferQueueType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
				return ((InternalEList<?>)getImmediateConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getComSendSignalTrustedFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return basicSetComSendSignalPeriodicEntity(null, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return basicSetComSendSignalImmediateEntity(null, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return basicSetComSendSignalImmediateTaskBody(null, msgs);
			case ModulePackage.RTE__COM_CALLBACK:
				return ((InternalEList<?>)getComCallback()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__RTE_START_API:
				return basicSetRteStartApi(null, msgs);
			case ModulePackage.RTE__RTE_STOP_API:
				return basicSetRteStopApi(null, msgs);
			case ModulePackage.RTE__SCHM_INIT_API:
				return basicSetSchmInitApi(null, msgs);
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return basicSetSchmDeinitApi(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				return getCore();
			case ModulePackage.RTE__BSWM:
				return getBswm();
			case ModulePackage.RTE__GENERATION_INFO:
				return getGenerationInfo();
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return getDependentType();
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return getDependentConstant();
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return getDependentOsApi();
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return getDependentIocCommunication();
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return getDependentComApi();
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return getIocInitValueConstant();
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
				return getIocInitValueVariableSet();
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return getRteMemoryMapping();
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
				return getImplementationDataType();
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
				return getComSendSignalTfParamType();
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
				return getComSendSignalGroupTfParamType();
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
				return getCsTfParamType();
			case ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE:
				return getSrRteNonqueuedSendTfParamType();
			case ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE:
				return getSrRteQueuedSendTfParamType();
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
				return getSrRteBufferQueueMaxLengthConstant();
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
				return getSrRteBufferQueueType();
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
				return getImmediateConstant();
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return getComSendSignalTrustedFunction();
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return getComSendSignalPeriodicEntity();
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return getComSendSignalImmediateEntity();
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return getComSendSignalImmediateTaskBody();
			case ModulePackage.RTE__COM_CALLBACK:
				return getComCallback();
			case ModulePackage.RTE__RTE_START_API:
				return getRteStartApi();
			case ModulePackage.RTE__RTE_STOP_API:
				return getRteStopApi();
			case ModulePackage.RTE__SCHM_INIT_API:
				return getSchmInitApi();
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return getSchmDeinitApi();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				getCore().clear();
				getCore().addAll((Collection<? extends Core>)newValue);
				return;
			case ModulePackage.RTE__BSWM:
				getBswm().clear();
				getBswm().addAll((Collection<? extends Bswm>)newValue);
				return;
			case ModulePackage.RTE__GENERATION_INFO:
				setGenerationInfo((GenerationInfo)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_TYPE:
				getDependentType().clear();
				getDependentType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				getDependentConstant().clear();
				getDependentConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_OS_API:
				getDependentOsApi().clear();
				getDependentOsApi().addAll((Collection<? extends OsApi>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				getDependentIocCommunication().clear();
				getDependentIocCommunication().addAll((Collection<? extends IocCommunication>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_COM_API:
				getDependentComApi().clear();
				getDependentComApi().addAll((Collection<? extends ComApi>)newValue);
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				getIocInitValueConstant().clear();
				getIocInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
				getIocInitValueVariableSet().clear();
				getIocInitValueVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
				return;
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				getRteMemoryMapping().clear();
				getRteMemoryMapping().addAll((Collection<? extends BswMemoryMapping>)newValue);
				return;
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
				getImplementationDataType().clear();
				getImplementationDataType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
				setComSendSignalTfParamType((ComSendTrustedFunctionParamType)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
				setComSendSignalGroupTfParamType((ComSendTrustedFunctionParamType)newValue);
				return;
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
				getCsTfParamType().clear();
				getCsTfParamType().addAll((Collection<? extends CsTrustedFunctionParamType>)newValue);
				return;
			case ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE:
				setSrRteNonqueuedSendTfParamType((RteNonqueuedSendTrustedFunctionParamType)newValue);
				return;
			case ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE:
				setSrRteQueuedSendTfParamType((RteQueuedSendTrustedFunctionParamType)newValue);
				return;
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
				getSrRteBufferQueueMaxLengthConstant().clear();
				getSrRteBufferQueueMaxLengthConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
				getSrRteBufferQueueType().clear();
				getSrRteBufferQueueType().addAll((Collection<? extends RteBufferQueueType>)newValue);
				return;
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
				getImmediateConstant().clear();
				getImmediateConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				getComSendSignalTrustedFunction().clear();
				getComSendSignalTrustedFunction().addAll((Collection<? extends ComSendSignalTrustedFunction>)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				setComSendSignalPeriodicEntity((ComSendSignalPeriodicEntity)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				setComSendSignalImmediateEntity((ComSendSignalImmediateEntity)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				setComSendSignalImmediateTaskBody((ComSendSignalImmediateTaskBody)newValue);
				return;
			case ModulePackage.RTE__COM_CALLBACK:
				getComCallback().clear();
				getComCallback().addAll((Collection<? extends ComCallback>)newValue);
				return;
			case ModulePackage.RTE__RTE_START_API:
				setRteStartApi((RteStartApi)newValue);
				return;
			case ModulePackage.RTE__RTE_STOP_API:
				setRteStopApi((RteStopApi)newValue);
				return;
			case ModulePackage.RTE__SCHM_INIT_API:
				setSchmInitApi((SchmInitApi)newValue);
				return;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				setSchmDeinitApi((SchmDeinitApi)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				getCore().clear();
				return;
			case ModulePackage.RTE__BSWM:
				getBswm().clear();
				return;
			case ModulePackage.RTE__GENERATION_INFO:
				setGenerationInfo((GenerationInfo)null);
				return;
			case ModulePackage.RTE__DEPENDENT_TYPE:
				getDependentType().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				getDependentConstant().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_OS_API:
				getDependentOsApi().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				getDependentIocCommunication().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_COM_API:
				getDependentComApi().clear();
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				getIocInitValueConstant().clear();
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
				getIocInitValueVariableSet().clear();
				return;
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				getRteMemoryMapping().clear();
				return;
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
				getImplementationDataType().clear();
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
				setComSendSignalTfParamType((ComSendTrustedFunctionParamType)null);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
				setComSendSignalGroupTfParamType((ComSendTrustedFunctionParamType)null);
				return;
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
				getCsTfParamType().clear();
				return;
			case ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE:
				setSrRteNonqueuedSendTfParamType((RteNonqueuedSendTrustedFunctionParamType)null);
				return;
			case ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE:
				setSrRteQueuedSendTfParamType((RteQueuedSendTrustedFunctionParamType)null);
				return;
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
				getSrRteBufferQueueMaxLengthConstant().clear();
				return;
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
				getSrRteBufferQueueType().clear();
				return;
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
				getImmediateConstant().clear();
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				getComSendSignalTrustedFunction().clear();
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				setComSendSignalPeriodicEntity((ComSendSignalPeriodicEntity)null);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				setComSendSignalImmediateEntity((ComSendSignalImmediateEntity)null);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				setComSendSignalImmediateTaskBody((ComSendSignalImmediateTaskBody)null);
				return;
			case ModulePackage.RTE__COM_CALLBACK:
				getComCallback().clear();
				return;
			case ModulePackage.RTE__RTE_START_API:
				setRteStartApi((RteStartApi)null);
				return;
			case ModulePackage.RTE__RTE_STOP_API:
				setRteStopApi((RteStopApi)null);
				return;
			case ModulePackage.RTE__SCHM_INIT_API:
				setSchmInitApi((SchmInitApi)null);
				return;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				setSchmDeinitApi((SchmDeinitApi)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				return core != null && !core.isEmpty();
			case ModulePackage.RTE__BSWM:
				return bswm != null && !bswm.isEmpty();
			case ModulePackage.RTE__GENERATION_INFO:
				return generationInfo != null;
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return dependentType != null && !dependentType.isEmpty();
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return dependentConstant != null && !dependentConstant.isEmpty();
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return dependentOsApi != null && !dependentOsApi.isEmpty();
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return dependentIocCommunication != null && !dependentIocCommunication.isEmpty();
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return dependentComApi != null && !dependentComApi.isEmpty();
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return iocInitValueConstant != null && !iocInitValueConstant.isEmpty();
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
				return iocInitValueVariableSet != null && !iocInitValueVariableSet.isEmpty();
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return rteMemoryMapping != null && !rteMemoryMapping.isEmpty();
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null && !implementationDataType.isEmpty();
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
				return comSendSignalTfParamType != null;
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
				return comSendSignalGroupTfParamType != null;
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
				return csTfParamType != null && !csTfParamType.isEmpty();
			case ModulePackage.RTE__SR_RTE_NONQUEUED_SEND_TF_PARAM_TYPE:
				return srRteNonqueuedSendTfParamType != null;
			case ModulePackage.RTE__SR_RTE_QUEUED_SEND_TF_PARAM_TYPE:
				return srRteQueuedSendTfParamType != null;
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
				return srRteBufferQueueMaxLengthConstant != null && !srRteBufferQueueMaxLengthConstant.isEmpty();
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
				return srRteBufferQueueType != null && !srRteBufferQueueType.isEmpty();
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
				return immediateConstant != null && !immediateConstant.isEmpty();
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return comSendSignalTrustedFunction != null && !comSendSignalTrustedFunction.isEmpty();
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return comSendSignalPeriodicEntity != null;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return comSendSignalImmediateEntity != null;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return comSendSignalImmediateTaskBody != null;
			case ModulePackage.RTE__COM_CALLBACK:
				return comCallback != null && !comCallback.isEmpty();
			case ModulePackage.RTE__RTE_START_API:
				return rteStartApi != null;
			case ModulePackage.RTE__RTE_STOP_API:
				return rteStopApi != null;
			case ModulePackage.RTE__SCHM_INIT_API:
				return schmInitApi != null;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return schmDeinitApi != null;
		}
		return super.eIsSet(featureID);
	}

} //RteImpl
