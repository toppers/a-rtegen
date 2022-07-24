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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSwc <em>Swc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartedBswm <em>Parted Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getIsBswPartition <em>Is Bsw Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getOsTrustedMacro <em>Os Trusted Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComReceiveBufferVariableSet <em>Com Receive Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComSignalApiWrapper <em>Com Signal Api Wrapper</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComSignalApiAlias <em>Com Signal Api Alias</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComMetaDataVariableSet <em>Com Meta Data Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComProxyFunction <em>Com Proxy Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComProxyFunctionTableIndexConstant <em>Com Proxy Function Table Index Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComProxyFunctionTableSizeConstant <em>Com Proxy Function Table Size Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComProxyFunctionTableVariable <em>Com Proxy Function Table Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getComProxyBufferVariableSet <em>Com Proxy Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrRteBufferInitValueConstant <em>Sr Rte Buffer Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrRteBufferVariableSet <em>Sr Rte Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrRteBufferQueuedVariable <em>Sr Rte Buffer Queued Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteBufferSendTrustedFunction <em>Rte Buffer Send Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrFilterConstant <em>Sr Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrFilterOldValueVariable <em>Sr Filter Old Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSrFilterOccurrenceVariable <em>Sr Filter Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getCsTfArgcConstant <em>Cs Tf Argc Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getCsTfOpidConstant <em>Cs Tf Opid Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getCsTrustedFunction <em>Cs Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getEntityStartVariable <em>Entity Start Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getEntityStartConstant <em>Entity Start Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getTaskBody <em>Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRestartPartitionApi <em>Restart Partition Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartitionTerminatedApi <em>Partition Terminated Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartitionRestartingApi <em>Partition Restarting Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionImpl extends LogicalCompartmentImpl implements Partition {
	/**
	 * The cached value of the '{@link #getSwc() <em>Swc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc()
	 * @generated
	 * @ordered
	 */
	protected EList<Swc> swc;

	/**
	 * The cached value of the '{@link #getPartedBswm() <em>Parted Bswm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartedBswm()
	 * @generated
	 * @ordered
	 */
	protected EList<PartedBswm> partedBswm;

	/**
	 * The default value of the '{@link #getIsBswPartition() <em>Is Bsw Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBswPartition()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BSW_PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBswPartition() <em>Is Bsw Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBswPartition()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBswPartition = IS_BSW_PARTITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsTrustedMacro() <em>Os Trusted Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTrustedMacro()
	 * @generated
	 * @ordered
	 */
	protected Macro osTrustedMacro;

	/**
	 * The cached value of the '{@link #getComReceiveBufferVariableSet() <em>Com Receive Buffer Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComReceiveBufferVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> comReceiveBufferVariableSet;

	/**
	 * The cached value of the '{@link #getComSignalApiWrapper() <em>Com Signal Api Wrapper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalApiWrapper()
	 * @generated
	 * @ordered
	 */
	protected EList<ComSignalApiWrapper> comSignalApiWrapper;

	/**
	 * The cached value of the '{@link #getComSignalApiAlias() <em>Com Signal Api Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalApiAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionMacro> comSignalApiAlias;

	/**
	 * The cached value of the '{@link #getComMetaDataVariableSet() <em>Com Meta Data Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComMetaDataVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariableSet> comMetaDataVariableSet;

	/**
	 * The cached value of the '{@link #getComProxyFunction() <em>Com Proxy Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<ComProxyFunction> comProxyFunction;

	/**
	 * The cached value of the '{@link #getComProxyFunctionTableIndexConstant() <em>Com Proxy Function Table Index Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunctionTableIndexConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> comProxyFunctionTableIndexConstant;

	/**
	 * The cached value of the '{@link #getComProxyFunctionTableSizeConstant() <em>Com Proxy Function Table Size Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunctionTableSizeConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant comProxyFunctionTableSizeConstant;

	/**
	 * The cached value of the '{@link #getComProxyFunctionTableVariable() <em>Com Proxy Function Table Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunctionTableVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable comProxyFunctionTableVariable;

	/**
	 * The cached value of the '{@link #getComProxyBufferVariableSet() <em>Com Proxy Buffer Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyBufferVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> comProxyBufferVariableSet;

	/**
	 * The cached value of the '{@link #getSrRteBufferInitValueConstant() <em>Sr Rte Buffer Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteBufferInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srRteBufferInitValueConstant;

	/**
	 * The cached value of the '{@link #getSrRteBufferVariableSet() <em>Sr Rte Buffer Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteBufferVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> srRteBufferVariableSet;

	/**
	 * The cached value of the '{@link #getSrRteBufferQueuedVariable() <em>Sr Rte Buffer Queued Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRteBufferQueuedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferQueuedVariable> srRteBufferQueuedVariable;

	/**
	 * The cached value of the '{@link #getRteBufferSendTrustedFunction() <em>Rte Buffer Send Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBufferSendTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustedFunction> rteBufferSendTrustedFunction;

	/**
	 * The cached value of the '{@link #getSrFilterConstant() <em>Sr Filter Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFilterConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> srFilterConstant;

	/**
	 * The cached value of the '{@link #getSrFilterOldValueVariable() <em>Sr Filter Old Value Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFilterOldValueVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> srFilterOldValueVariable;

	/**
	 * The cached value of the '{@link #getSrFilterOccurrenceVariable() <em>Sr Filter Occurrence Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFilterOccurrenceVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> srFilterOccurrenceVariable;

	/**
	 * The cached value of the '{@link #getCsTfArgcConstant() <em>Cs Tf Argc Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfArgcConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> csTfArgcConstant;

	/**
	 * The cached value of the '{@link #getCsTfOpidConstant() <em>Cs Tf Opid Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> csTfOpidConstant;

	/**
	 * The cached value of the '{@link #getCsTrustedFunction() <em>Cs Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CsTrustedFunction> csTrustedFunction;

	/**
	 * The cached value of the '{@link #getEntityStartVariable() <em>Entity Start Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityStartVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> entityStartVariable;

	/**
	 * The cached value of the '{@link #getEntityStartConstant() <em>Entity Start Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityStartConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> entityStartConstant;

	/**
	 * The cached value of the '{@link #getTaskBody() <em>Task Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBody()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskBody> taskBody;

	/**
	 * The cached value of the '{@link #getRestartPartitionApi() <em>Restart Partition Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPartitionApi()
	 * @generated
	 * @ordered
	 */
	protected RestartPartitionApi restartPartitionApi;

	/**
	 * The cached value of the '{@link #getPartitionTerminatedApi() <em>Partition Terminated Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionTerminatedApi()
	 * @generated
	 * @ordered
	 */
	protected PartitionTerminatedApi partitionTerminatedApi;

	/**
	 * The cached value of the '{@link #getPartitionRestartingApi() <em>Partition Restarting Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionRestartingApi()
	 * @generated
	 * @ordered
	 */
	protected PartitionRestartingApi partitionRestartingApi;

	/**
	 * The cached value of the '{@link #getTAckStatus() <em>TAck Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<TAckStatus> tAckStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBswPartition() {
		return isBswPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBswPartition(Boolean newIsBswPartition) {
		Boolean oldIsBswPartition = isBswPartition;
		isBswPartition = newIsBswPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__IS_BSW_PARTITION, oldIsBswPartition, isBswPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getParent() {
		if (eContainerFeatureID() != ModulePackage.PARTITION__PARENT) return null;
		return (Core)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Core newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.PARTITION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Core newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.PARTITION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.CORE__PARTITION, Core.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Swc> getSwc() {
		if (swc == null) {
			swc = new EObjectContainmentWithInverseEList<Swc>(Swc.class, this, ModulePackage.PARTITION__SWC, ModulePackage.SWC__PARENT);
		}
		return swc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartPartitionApi getRestartPartitionApi() {
		return restartPartitionApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestartPartitionApi(RestartPartitionApi newRestartPartitionApi, NotificationChain msgs) {
		RestartPartitionApi oldRestartPartitionApi = restartPartitionApi;
		restartPartitionApi = newRestartPartitionApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__RESTART_PARTITION_API, oldRestartPartitionApi, newRestartPartitionApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPartitionApi(RestartPartitionApi newRestartPartitionApi) {
		if (newRestartPartitionApi != restartPartitionApi) {
			NotificationChain msgs = null;
			if (restartPartitionApi != null)
				msgs = ((InternalEObject)restartPartitionApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__RESTART_PARTITION_API, null, msgs);
			if (newRestartPartitionApi != null)
				msgs = ((InternalEObject)newRestartPartitionApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__RESTART_PARTITION_API, null, msgs);
			msgs = basicSetRestartPartitionApi(newRestartPartitionApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__RESTART_PARTITION_API, newRestartPartitionApi, newRestartPartitionApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTerminatedApi getPartitionTerminatedApi() {
		return partitionTerminatedApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionTerminatedApi(PartitionTerminatedApi newPartitionTerminatedApi, NotificationChain msgs) {
		PartitionTerminatedApi oldPartitionTerminatedApi = partitionTerminatedApi;
		partitionTerminatedApi = newPartitionTerminatedApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_TERMINATED_API, oldPartitionTerminatedApi, newPartitionTerminatedApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionTerminatedApi(PartitionTerminatedApi newPartitionTerminatedApi) {
		if (newPartitionTerminatedApi != partitionTerminatedApi) {
			NotificationChain msgs = null;
			if (partitionTerminatedApi != null)
				msgs = ((InternalEObject)partitionTerminatedApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_TERMINATED_API, null, msgs);
			if (newPartitionTerminatedApi != null)
				msgs = ((InternalEObject)newPartitionTerminatedApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_TERMINATED_API, null, msgs);
			msgs = basicSetPartitionTerminatedApi(newPartitionTerminatedApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_TERMINATED_API, newPartitionTerminatedApi, newPartitionTerminatedApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionRestartingApi getPartitionRestartingApi() {
		return partitionRestartingApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionRestartingApi(PartitionRestartingApi newPartitionRestartingApi, NotificationChain msgs) {
		PartitionRestartingApi oldPartitionRestartingApi = partitionRestartingApi;
		partitionRestartingApi = newPartitionRestartingApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_RESTARTING_API, oldPartitionRestartingApi, newPartitionRestartingApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionRestartingApi(PartitionRestartingApi newPartitionRestartingApi) {
		if (newPartitionRestartingApi != partitionRestartingApi) {
			NotificationChain msgs = null;
			if (partitionRestartingApi != null)
				msgs = ((InternalEObject)partitionRestartingApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_RESTARTING_API, null, msgs);
			if (newPartitionRestartingApi != null)
				msgs = ((InternalEObject)newPartitionRestartingApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_RESTARTING_API, null, msgs);
			msgs = basicSetPartitionRestartingApi(newPartitionRestartingApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_RESTARTING_API, newPartitionRestartingApi, newPartitionRestartingApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAckStatus> getTAckStatus() {
		if (tAckStatus == null) {
			tAckStatus = new EObjectContainmentEList<TAckStatus>(TAckStatus.class, this, ModulePackage.PARTITION__TACK_STATUS);
		}
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskBody> getTaskBody() {
		if (taskBody == null) {
			taskBody = new EObjectContainmentEList<TaskBody>(TaskBody.class, this, ModulePackage.PARTITION__TASK_BODY);
		}
		return taskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getCsTfArgcConstant() {
		if (csTfArgcConstant == null) {
			csTfArgcConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT);
		}
		return csTfArgcConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getCsTfOpidConstant() {
		if (csTfOpidConstant == null) {
			csTfOpidConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__CS_TF_OPID_CONSTANT);
		}
		return csTfOpidConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CsTrustedFunction> getCsTrustedFunction() {
		if (csTrustedFunction == null) {
			csTrustedFunction = new EObjectContainmentEList<CsTrustedFunction>(CsTrustedFunction.class, this, ModulePackage.PARTITION__CS_TRUSTED_FUNCTION);
		}
		return csTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getEntityStartVariable() {
		if (entityStartVariable == null) {
			entityStartVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__ENTITY_START_VARIABLE);
		}
		return entityStartVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getEntityStartConstant() {
		if (entityStartConstant == null) {
			entityStartConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__ENTITY_START_CONSTANT);
		}
		return entityStartConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunction> getRteBufferSendTrustedFunction() {
		if (rteBufferSendTrustedFunction == null) {
			rteBufferSendTrustedFunction = new EObjectContainmentEList<TrustedFunction>(TrustedFunction.class, this, ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION);
		}
		return rteBufferSendTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrFilterConstant() {
		if (srFilterConstant == null) {
			srFilterConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__SR_FILTER_CONSTANT);
		}
		return srFilterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getSrFilterOldValueVariable() {
		if (srFilterOldValueVariable == null) {
			srFilterOldValueVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE);
		}
		return srFilterOldValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getSrFilterOccurrenceVariable() {
		if (srFilterOccurrenceVariable == null) {
			srFilterOccurrenceVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE);
		}
		return srFilterOccurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro getOsTrustedMacro() {
		return osTrustedMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsTrustedMacro(Macro newOsTrustedMacro, NotificationChain msgs) {
		Macro oldOsTrustedMacro = osTrustedMacro;
		osTrustedMacro = newOsTrustedMacro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__OS_TRUSTED_MACRO, oldOsTrustedMacro, newOsTrustedMacro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTrustedMacro(Macro newOsTrustedMacro) {
		if (newOsTrustedMacro != osTrustedMacro) {
			NotificationChain msgs = null;
			if (osTrustedMacro != null)
				msgs = ((InternalEObject)osTrustedMacro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__OS_TRUSTED_MACRO, null, msgs);
			if (newOsTrustedMacro != null)
				msgs = ((InternalEObject)newOsTrustedMacro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__OS_TRUSTED_MACRO, null, msgs);
			msgs = basicSetOsTrustedMacro(newOsTrustedMacro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__OS_TRUSTED_MACRO, newOsTrustedMacro, newOsTrustedMacro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getComReceiveBufferVariableSet() {
		if (comReceiveBufferVariableSet == null) {
			comReceiveBufferVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET);
		}
		return comReceiveBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComSignalApiWrapper> getComSignalApiWrapper() {
		if (comSignalApiWrapper == null) {
			comSignalApiWrapper = new EObjectContainmentWithInverseEList<ComSignalApiWrapper>(ComSignalApiWrapper.class, this, ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER, ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT);
		}
		return comSignalApiWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionMacro> getComSignalApiAlias() {
		if (comSignalApiAlias == null) {
			comSignalApiAlias = new EObjectContainmentEList<FunctionMacro>(FunctionMacro.class, this, ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS);
		}
		return comSignalApiAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableSet> getComMetaDataVariableSet() {
		if (comMetaDataVariableSet == null) {
			comMetaDataVariableSet = new EObjectContainmentEList<GlobalVariableSet>(GlobalVariableSet.class, this, ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET);
		}
		return comMetaDataVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartedBswm> getPartedBswm() {
		if (partedBswm == null) {
			partedBswm = new EObjectContainmentWithInverseEList<PartedBswm>(PartedBswm.class, this, ModulePackage.PARTITION__PARTED_BSWM, ModulePackage.PARTED_BSWM__PARENT);
		}
		return partedBswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getComProxyFunctionTableVariable() {
		return comProxyFunctionTableVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComProxyFunctionTableVariable(GlobalVariable newComProxyFunctionTableVariable, NotificationChain msgs) {
		GlobalVariable oldComProxyFunctionTableVariable = comProxyFunctionTableVariable;
		comProxyFunctionTableVariable = newComProxyFunctionTableVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE, oldComProxyFunctionTableVariable, newComProxyFunctionTableVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComProxyFunctionTableVariable(GlobalVariable newComProxyFunctionTableVariable) {
		if (newComProxyFunctionTableVariable != comProxyFunctionTableVariable) {
			NotificationChain msgs = null;
			if (comProxyFunctionTableVariable != null)
				msgs = ((InternalEObject)comProxyFunctionTableVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE, null, msgs);
			if (newComProxyFunctionTableVariable != null)
				msgs = ((InternalEObject)newComProxyFunctionTableVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE, null, msgs);
			msgs = basicSetComProxyFunctionTableVariable(newComProxyFunctionTableVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE, newComProxyFunctionTableVariable, newComProxyFunctionTableVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getComProxyBufferVariableSet() {
		if (comProxyBufferVariableSet == null) {
			comProxyBufferVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET);
		}
		return comProxyBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getSrRteBufferInitValueConstant() {
		if (srRteBufferInitValueConstant == null) {
			srRteBufferInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT);
		}
		return srRteBufferInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getSrRteBufferVariableSet() {
		if (srRteBufferVariableSet == null) {
			srRteBufferVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET);
		}
		return srRteBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferQueuedVariable> getSrRteBufferQueuedVariable() {
		if (srRteBufferQueuedVariable == null) {
			srRteBufferQueuedVariable = new EObjectContainmentEList<RteBufferQueuedVariable>(RteBufferQueuedVariable.class, this, ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE);
		}
		return srRteBufferQueuedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComProxyFunction> getComProxyFunction() {
		if (comProxyFunction == null) {
			comProxyFunction = new EObjectContainmentWithInverseEList<ComProxyFunction>(ComProxyFunction.class, this, ModulePackage.PARTITION__COM_PROXY_FUNCTION, ModulePackage.COM_PROXY_FUNCTION__PARENT);
		}
		return comProxyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getComProxyFunctionTableIndexConstant() {
		if (comProxyFunctionTableIndexConstant == null) {
			comProxyFunctionTableIndexConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT);
		}
		return comProxyFunctionTableIndexConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getComProxyFunctionTableSizeConstant() {
		return comProxyFunctionTableSizeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComProxyFunctionTableSizeConstant(Constant newComProxyFunctionTableSizeConstant, NotificationChain msgs) {
		Constant oldComProxyFunctionTableSizeConstant = comProxyFunctionTableSizeConstant;
		comProxyFunctionTableSizeConstant = newComProxyFunctionTableSizeConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT, oldComProxyFunctionTableSizeConstant, newComProxyFunctionTableSizeConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComProxyFunctionTableSizeConstant(Constant newComProxyFunctionTableSizeConstant) {
		if (newComProxyFunctionTableSizeConstant != comProxyFunctionTableSizeConstant) {
			NotificationChain msgs = null;
			if (comProxyFunctionTableSizeConstant != null)
				msgs = ((InternalEObject)comProxyFunctionTableSizeConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT, null, msgs);
			if (newComProxyFunctionTableSizeConstant != null)
				msgs = ((InternalEObject)newComProxyFunctionTableSizeConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT, null, msgs);
			msgs = basicSetComProxyFunctionTableSizeConstant(newComProxyFunctionTableSizeConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT, newComProxyFunctionTableSizeConstant, newComProxyFunctionTableSizeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Core)otherEnd, msgs);
			case ModulePackage.PARTITION__SWC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwc()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__PARTED_BSWM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartedBswm()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComSignalApiWrapper()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComProxyFunction()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION__PARENT:
				return basicSetParent(null, msgs);
			case ModulePackage.PARTITION__SWC:
				return ((InternalEList<?>)getSwc()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__PARTED_BSWM:
				return ((InternalEList<?>)getPartedBswm()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return basicSetOsTrustedMacro(null, msgs);
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
				return ((InternalEList<?>)getComReceiveBufferVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				return ((InternalEList<?>)getComSignalApiWrapper()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
				return ((InternalEList<?>)getComSignalApiAlias()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
				return ((InternalEList<?>)getComMetaDataVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				return ((InternalEList<?>)getComProxyFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
				return ((InternalEList<?>)getComProxyFunctionTableIndexConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
				return basicSetComProxyFunctionTableSizeConstant(null, msgs);
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
				return basicSetComProxyFunctionTableVariable(null, msgs);
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
				return ((InternalEList<?>)getComProxyBufferVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getSrRteBufferInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
				return ((InternalEList<?>)getSrRteBufferVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
				return ((InternalEList<?>)getSrRteBufferQueuedVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getRteBufferSendTrustedFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
				return ((InternalEList<?>)getSrFilterConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
				return ((InternalEList<?>)getSrFilterOldValueVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
				return ((InternalEList<?>)getSrFilterOccurrenceVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
				return ((InternalEList<?>)getCsTfArgcConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
				return ((InternalEList<?>)getCsTfOpidConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getCsTrustedFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return ((InternalEList<?>)getEntityStartVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return ((InternalEList<?>)getEntityStartConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__TASK_BODY:
				return ((InternalEList<?>)getTaskBody()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return basicSetRestartPartitionApi(null, msgs);
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return basicSetPartitionTerminatedApi(null, msgs);
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return basicSetPartitionRestartingApi(null, msgs);
			case ModulePackage.PARTITION__TACK_STATUS:
				return ((InternalEList<?>)getTAckStatus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.PARTITION__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.CORE__PARTITION, Core.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PARTITION__PARENT:
				return getParent();
			case ModulePackage.PARTITION__SWC:
				return getSwc();
			case ModulePackage.PARTITION__PARTED_BSWM:
				return getPartedBswm();
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				return getIsBswPartition();
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return getOsTrustedMacro();
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
				return getComReceiveBufferVariableSet();
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				return getComSignalApiWrapper();
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
				return getComSignalApiAlias();
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
				return getComMetaDataVariableSet();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				return getComProxyFunction();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
				return getComProxyFunctionTableIndexConstant();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
				return getComProxyFunctionTableSizeConstant();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
				return getComProxyFunctionTableVariable();
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
				return getComProxyBufferVariableSet();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
				return getSrRteBufferInitValueConstant();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
				return getSrRteBufferVariableSet();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
				return getSrRteBufferQueuedVariable();
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return getRteBufferSendTrustedFunction();
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
				return getSrFilterConstant();
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
				return getSrFilterOldValueVariable();
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
				return getSrFilterOccurrenceVariable();
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
				return getCsTfArgcConstant();
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
				return getCsTfOpidConstant();
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
				return getCsTrustedFunction();
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return getEntityStartVariable();
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return getEntityStartConstant();
			case ModulePackage.PARTITION__TASK_BODY:
				return getTaskBody();
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return getRestartPartitionApi();
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return getPartitionTerminatedApi();
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return getPartitionRestartingApi();
			case ModulePackage.PARTITION__TACK_STATUS:
				return getTAckStatus();
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
			case ModulePackage.PARTITION__PARENT:
				setParent((Core)newValue);
				return;
			case ModulePackage.PARTITION__SWC:
				getSwc().clear();
				getSwc().addAll((Collection<? extends Swc>)newValue);
				return;
			case ModulePackage.PARTITION__PARTED_BSWM:
				getPartedBswm().clear();
				getPartedBswm().addAll((Collection<? extends PartedBswm>)newValue);
				return;
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				setIsBswPartition((Boolean)newValue);
				return;
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				setOsTrustedMacro((Macro)newValue);
				return;
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
				getComReceiveBufferVariableSet().clear();
				getComReceiveBufferVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
				return;
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				getComSignalApiWrapper().clear();
				getComSignalApiWrapper().addAll((Collection<? extends ComSignalApiWrapper>)newValue);
				return;
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
				getComSignalApiAlias().clear();
				getComSignalApiAlias().addAll((Collection<? extends FunctionMacro>)newValue);
				return;
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
				getComMetaDataVariableSet().clear();
				getComMetaDataVariableSet().addAll((Collection<? extends GlobalVariableSet>)newValue);
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				getComProxyFunction().clear();
				getComProxyFunction().addAll((Collection<? extends ComProxyFunction>)newValue);
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
				getComProxyFunctionTableIndexConstant().clear();
				getComProxyFunctionTableIndexConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
				setComProxyFunctionTableSizeConstant((Constant)newValue);
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
				setComProxyFunctionTableVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
				getComProxyBufferVariableSet().clear();
				getComProxyBufferVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
				getSrRteBufferInitValueConstant().clear();
				getSrRteBufferInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
				getSrRteBufferVariableSet().clear();
				getSrRteBufferVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
				getSrRteBufferQueuedVariable().clear();
				getSrRteBufferQueuedVariable().addAll((Collection<? extends RteBufferQueuedVariable>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				getRteBufferSendTrustedFunction().clear();
				getRteBufferSendTrustedFunction().addAll((Collection<? extends TrustedFunction>)newValue);
				return;
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
				getSrFilterConstant().clear();
				getSrFilterConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
				getSrFilterOldValueVariable().clear();
				getSrFilterOldValueVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
				getSrFilterOccurrenceVariable().clear();
				getSrFilterOccurrenceVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
				getCsTfArgcConstant().clear();
				getCsTfArgcConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
				getCsTfOpidConstant().clear();
				getCsTfOpidConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
				getCsTrustedFunction().clear();
				getCsTrustedFunction().addAll((Collection<? extends CsTrustedFunction>)newValue);
				return;
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				getEntityStartVariable().clear();
				getEntityStartVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				getEntityStartConstant().clear();
				getEntityStartConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__TASK_BODY:
				getTaskBody().clear();
				getTaskBody().addAll((Collection<? extends TaskBody>)newValue);
				return;
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				setRestartPartitionApi((RestartPartitionApi)newValue);
				return;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				setPartitionTerminatedApi((PartitionTerminatedApi)newValue);
				return;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				setPartitionRestartingApi((PartitionRestartingApi)newValue);
				return;
			case ModulePackage.PARTITION__TACK_STATUS:
				getTAckStatus().clear();
				getTAckStatus().addAll((Collection<? extends TAckStatus>)newValue);
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
			case ModulePackage.PARTITION__PARENT:
				setParent((Core)null);
				return;
			case ModulePackage.PARTITION__SWC:
				getSwc().clear();
				return;
			case ModulePackage.PARTITION__PARTED_BSWM:
				getPartedBswm().clear();
				return;
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				setIsBswPartition(IS_BSW_PARTITION_EDEFAULT);
				return;
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				setOsTrustedMacro((Macro)null);
				return;
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
				getComReceiveBufferVariableSet().clear();
				return;
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				getComSignalApiWrapper().clear();
				return;
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
				getComSignalApiAlias().clear();
				return;
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
				getComMetaDataVariableSet().clear();
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				getComProxyFunction().clear();
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
				getComProxyFunctionTableIndexConstant().clear();
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
				setComProxyFunctionTableSizeConstant((Constant)null);
				return;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
				setComProxyFunctionTableVariable((GlobalVariable)null);
				return;
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
				getComProxyBufferVariableSet().clear();
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
				getSrRteBufferInitValueConstant().clear();
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
				getSrRteBufferVariableSet().clear();
				return;
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
				getSrRteBufferQueuedVariable().clear();
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				getRteBufferSendTrustedFunction().clear();
				return;
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
				getSrFilterConstant().clear();
				return;
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
				getSrFilterOldValueVariable().clear();
				return;
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
				getSrFilterOccurrenceVariable().clear();
				return;
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
				getCsTfArgcConstant().clear();
				return;
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
				getCsTfOpidConstant().clear();
				return;
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
				getCsTrustedFunction().clear();
				return;
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				getEntityStartVariable().clear();
				return;
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				getEntityStartConstant().clear();
				return;
			case ModulePackage.PARTITION__TASK_BODY:
				getTaskBody().clear();
				return;
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				setRestartPartitionApi((RestartPartitionApi)null);
				return;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				setPartitionTerminatedApi((PartitionTerminatedApi)null);
				return;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				setPartitionRestartingApi((PartitionRestartingApi)null);
				return;
			case ModulePackage.PARTITION__TACK_STATUS:
				getTAckStatus().clear();
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
			case ModulePackage.PARTITION__PARENT:
				return getParent() != null;
			case ModulePackage.PARTITION__SWC:
				return swc != null && !swc.isEmpty();
			case ModulePackage.PARTITION__PARTED_BSWM:
				return partedBswm != null && !partedBswm.isEmpty();
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				return IS_BSW_PARTITION_EDEFAULT == null ? isBswPartition != null : !IS_BSW_PARTITION_EDEFAULT.equals(isBswPartition);
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return osTrustedMacro != null;
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
				return comReceiveBufferVariableSet != null && !comReceiveBufferVariableSet.isEmpty();
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
				return comSignalApiWrapper != null && !comSignalApiWrapper.isEmpty();
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
				return comSignalApiAlias != null && !comSignalApiAlias.isEmpty();
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
				return comMetaDataVariableSet != null && !comMetaDataVariableSet.isEmpty();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
				return comProxyFunction != null && !comProxyFunction.isEmpty();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
				return comProxyFunctionTableIndexConstant != null && !comProxyFunctionTableIndexConstant.isEmpty();
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
				return comProxyFunctionTableSizeConstant != null;
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
				return comProxyFunctionTableVariable != null;
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
				return comProxyBufferVariableSet != null && !comProxyBufferVariableSet.isEmpty();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
				return srRteBufferInitValueConstant != null && !srRteBufferInitValueConstant.isEmpty();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
				return srRteBufferVariableSet != null && !srRteBufferVariableSet.isEmpty();
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
				return srRteBufferQueuedVariable != null && !srRteBufferQueuedVariable.isEmpty();
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return rteBufferSendTrustedFunction != null && !rteBufferSendTrustedFunction.isEmpty();
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
				return srFilterConstant != null && !srFilterConstant.isEmpty();
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
				return srFilterOldValueVariable != null && !srFilterOldValueVariable.isEmpty();
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
				return srFilterOccurrenceVariable != null && !srFilterOccurrenceVariable.isEmpty();
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
				return csTfArgcConstant != null && !csTfArgcConstant.isEmpty();
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
				return csTfOpidConstant != null && !csTfOpidConstant.isEmpty();
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
				return csTrustedFunction != null && !csTrustedFunction.isEmpty();
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return entityStartVariable != null && !entityStartVariable.isEmpty();
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return entityStartConstant != null && !entityStartConstant.isEmpty();
			case ModulePackage.PARTITION__TASK_BODY:
				return taskBody != null && !taskBody.isEmpty();
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return restartPartitionApi != null;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return partitionTerminatedApi != null;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return partitionRestartingApi != null;
			case ModulePackage.PARTITION__TACK_STATUS:
				return tAckStatus != null && !tAckStatus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isBswPartition: ");
		result.append(isBswPartition);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
