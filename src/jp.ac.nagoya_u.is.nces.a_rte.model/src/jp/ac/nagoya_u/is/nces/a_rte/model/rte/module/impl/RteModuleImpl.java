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
import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader;
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
 * An implementation of the model object '<em><b>Rte Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getDependentHeader <em>Dependent Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getBswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getSwcMemoryMappingHeader <em>Swc Memory Mapping Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteHeader <em>Rte Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteTypeHeader <em>Rte Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteApplicationTypeHeader <em>Rte Application Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteApplicationHeader <em>Rte Application Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getModuleInterlinkTypeHeader <em>Module Interlink Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getModuleInterlinkHeader <em>Module Interlink Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteLifecycleHeader <em>Rte Lifecycle Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteConfigurationHeader <em>Rte Configuration Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteVfbTraceHeader <em>Rte Vfb Trace Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteCallbackHeader <em>Rte Callback Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteUtilityHeader <em>Rte Utility Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteBswApiHeader <em>Rte Bsw Api Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteCommonHeader <em>Rte Common Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRtePartitionHeader <em>Rte Partition Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRteCommonSource <em>Rte Common Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl#getRtePartitionSource <em>Rte Partition Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteModuleImpl extends ExtendedEObjectImpl implements RteModule {
	/**
	 * The cached value of the '{@link #getDependentHeader() <em>Dependent Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderFile> dependentHeader;

	/**
	 * The cached value of the '{@link #getBswMemoryMappingHeader() <em>Bsw Memory Mapping Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswMemoryMappingHeader()
	 * @generated
	 * @ordered
	 */
	protected BswMemoryMappingHeader bswMemoryMappingHeader;

	/**
	 * The cached value of the '{@link #getSwcMemoryMappingHeader() <em>Swc Memory Mapping Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcMemoryMappingHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMemoryMappingHeader> swcMemoryMappingHeader;

	/**
	 * The cached value of the '{@link #getRteHeader() <em>Rte Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteHeader()
	 * @generated
	 * @ordered
	 */
	protected RteHeader rteHeader;

	/**
	 * The cached value of the '{@link #getRteTypeHeader() <em>Rte Type Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected RteTypeHeader rteTypeHeader;

	/**
	 * The cached value of the '{@link #getRteApplicationTypeHeader() <em>Rte Application Type Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApplicationTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApplicationTypeHeader> rteApplicationTypeHeader;

	/**
	 * The cached value of the '{@link #getRteApplicationHeader() <em>Rte Application Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApplicationHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApplicationHeader> rteApplicationHeader;

	/**
	 * The cached value of the '{@link #getModuleInterlinkTypeHeader() <em>Module Interlink Type Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInterlinkTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInterlinkTypeHeader> moduleInterlinkTypeHeader;

	/**
	 * The cached value of the '{@link #getModuleInterlinkHeader() <em>Module Interlink Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInterlinkHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInterlinkHeader> moduleInterlinkHeader;

	/**
	 * The cached value of the '{@link #getRteLifecycleHeader() <em>Rte Lifecycle Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteLifecycleHeader()
	 * @generated
	 * @ordered
	 */
	protected RteLifecycleHeader rteLifecycleHeader;

	/**
	 * The cached value of the '{@link #getRteConfigurationHeader() <em>Rte Configuration Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteConfigurationHeader()
	 * @generated
	 * @ordered
	 */
	protected RteConfigurationHeader rteConfigurationHeader;

	/**
	 * The cached value of the '{@link #getRteVfbTraceHeader() <em>Rte Vfb Trace Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteVfbTraceHeader()
	 * @generated
	 * @ordered
	 */
	protected RteVfbTraceHeader rteVfbTraceHeader;

	/**
	 * The cached value of the '{@link #getRteCallbackHeader() <em>Rte Callback Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCallbackHeader()
	 * @generated
	 * @ordered
	 */
	protected RteCallbackHeader rteCallbackHeader;

	/**
	 * The cached value of the '{@link #getRteUtilityHeader() <em>Rte Utility Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteUtilityHeader()
	 * @generated
	 * @ordered
	 */
	protected RteUtilityHeader rteUtilityHeader;

	/**
	 * The cached value of the '{@link #getRteBswApiHeader() <em>Rte Bsw Api Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswApiHeader()
	 * @generated
	 * @ordered
	 */
	protected RteBswApiHeader rteBswApiHeader;

	/**
	 * The cached value of the '{@link #getRteCommonHeader() <em>Rte Common Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCommonHeader()
	 * @generated
	 * @ordered
	 */
	protected RteInternalHeader rteCommonHeader;

	/**
	 * The cached value of the '{@link #getRtePartitionHeader() <em>Rte Partition Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePartitionHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<RteInternalHeader> rtePartitionHeader;

	/**
	 * The cached value of the '{@link #getRteCommonSource() <em>Rte Common Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCommonSource()
	 * @generated
	 * @ordered
	 */
	protected RteSource rteCommonSource;

	/**
	 * The cached value of the '{@link #getRtePartitionSource() <em>Rte Partition Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePartitionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<RteSource> rtePartitionSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSource getRteCommonSource() {
		return rteCommonSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteCommonSource(RteSource newRteCommonSource, NotificationChain msgs) {
		RteSource oldRteCommonSource = rteCommonSource;
		rteCommonSource = newRteCommonSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE, oldRteCommonSource, newRteCommonSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCommonSource(RteSource newRteCommonSource) {
		if (newRteCommonSource != rteCommonSource) {
			NotificationChain msgs = null;
			if (rteCommonSource != null)
				msgs = ((InternalEObject)rteCommonSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE, null, msgs);
			if (newRteCommonSource != null)
				msgs = ((InternalEObject)newRteCommonSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE, null, msgs);
			msgs = basicSetRteCommonSource(newRteCommonSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE, newRteCommonSource, newRteCommonSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteSource> getRtePartitionSource() {
		if (rtePartitionSource == null) {
			rtePartitionSource = new EObjectContainmentEList<RteSource>(RteSource.class, this, ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE);
		}
		return rtePartitionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApplicationHeader> getRteApplicationHeader() {
		if (rteApplicationHeader == null) {
			rteApplicationHeader = new EObjectContainmentEList<RteApplicationHeader>(RteApplicationHeader.class, this, ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER);
		}
		return rteApplicationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApplicationTypeHeader> getRteApplicationTypeHeader() {
		if (rteApplicationTypeHeader == null) {
			rteApplicationTypeHeader = new EObjectContainmentEList<RteApplicationTypeHeader>(RteApplicationTypeHeader.class, this, ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER);
		}
		return rteApplicationTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteLifecycleHeader getRteLifecycleHeader() {
		return rteLifecycleHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteLifecycleHeader(RteLifecycleHeader newRteLifecycleHeader, NotificationChain msgs) {
		RteLifecycleHeader oldRteLifecycleHeader = rteLifecycleHeader;
		rteLifecycleHeader = newRteLifecycleHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER, oldRteLifecycleHeader, newRteLifecycleHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteLifecycleHeader(RteLifecycleHeader newRteLifecycleHeader) {
		if (newRteLifecycleHeader != rteLifecycleHeader) {
			NotificationChain msgs = null;
			if (rteLifecycleHeader != null)
				msgs = ((InternalEObject)rteLifecycleHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER, null, msgs);
			if (newRteLifecycleHeader != null)
				msgs = ((InternalEObject)newRteLifecycleHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER, null, msgs);
			msgs = basicSetRteLifecycleHeader(newRteLifecycleHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER, newRteLifecycleHeader, newRteLifecycleHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCallbackHeader getRteCallbackHeader() {
		return rteCallbackHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteCallbackHeader(RteCallbackHeader newRteCallbackHeader, NotificationChain msgs) {
		RteCallbackHeader oldRteCallbackHeader = rteCallbackHeader;
		rteCallbackHeader = newRteCallbackHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER, oldRteCallbackHeader, newRteCallbackHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCallbackHeader(RteCallbackHeader newRteCallbackHeader) {
		if (newRteCallbackHeader != rteCallbackHeader) {
			NotificationChain msgs = null;
			if (rteCallbackHeader != null)
				msgs = ((InternalEObject)rteCallbackHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER, null, msgs);
			if (newRteCallbackHeader != null)
				msgs = ((InternalEObject)newRteCallbackHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER, null, msgs);
			msgs = basicSetRteCallbackHeader(newRteCallbackHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER, newRteCallbackHeader, newRteCallbackHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteConfigurationHeader getRteConfigurationHeader() {
		return rteConfigurationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteConfigurationHeader(RteConfigurationHeader newRteConfigurationHeader, NotificationChain msgs) {
		RteConfigurationHeader oldRteConfigurationHeader = rteConfigurationHeader;
		rteConfigurationHeader = newRteConfigurationHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER, oldRteConfigurationHeader, newRteConfigurationHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteConfigurationHeader(RteConfigurationHeader newRteConfigurationHeader) {
		if (newRteConfigurationHeader != rteConfigurationHeader) {
			NotificationChain msgs = null;
			if (rteConfigurationHeader != null)
				msgs = ((InternalEObject)rteConfigurationHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER, null, msgs);
			if (newRteConfigurationHeader != null)
				msgs = ((InternalEObject)newRteConfigurationHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER, null, msgs);
			msgs = basicSetRteConfigurationHeader(newRteConfigurationHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER, newRteConfigurationHeader, newRteConfigurationHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteVfbTraceHeader getRteVfbTraceHeader() {
		return rteVfbTraceHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteVfbTraceHeader(RteVfbTraceHeader newRteVfbTraceHeader, NotificationChain msgs) {
		RteVfbTraceHeader oldRteVfbTraceHeader = rteVfbTraceHeader;
		rteVfbTraceHeader = newRteVfbTraceHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER, oldRteVfbTraceHeader, newRteVfbTraceHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteVfbTraceHeader(RteVfbTraceHeader newRteVfbTraceHeader) {
		if (newRteVfbTraceHeader != rteVfbTraceHeader) {
			NotificationChain msgs = null;
			if (rteVfbTraceHeader != null)
				msgs = ((InternalEObject)rteVfbTraceHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER, null, msgs);
			if (newRteVfbTraceHeader != null)
				msgs = ((InternalEObject)newRteVfbTraceHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER, null, msgs);
			msgs = basicSetRteVfbTraceHeader(newRteVfbTraceHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER, newRteVfbTraceHeader, newRteVfbTraceHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTypeHeader getRteTypeHeader() {
		return rteTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteTypeHeader(RteTypeHeader newRteTypeHeader, NotificationChain msgs) {
		RteTypeHeader oldRteTypeHeader = rteTypeHeader;
		rteTypeHeader = newRteTypeHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_TYPE_HEADER, oldRteTypeHeader, newRteTypeHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteTypeHeader(RteTypeHeader newRteTypeHeader) {
		if (newRteTypeHeader != rteTypeHeader) {
			NotificationChain msgs = null;
			if (rteTypeHeader != null)
				msgs = ((InternalEObject)rteTypeHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_TYPE_HEADER, null, msgs);
			if (newRteTypeHeader != null)
				msgs = ((InternalEObject)newRteTypeHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_TYPE_HEADER, null, msgs);
			msgs = basicSetRteTypeHeader(newRteTypeHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_TYPE_HEADER, newRteTypeHeader, newRteTypeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteHeader getRteHeader() {
		return rteHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteHeader(RteHeader newRteHeader, NotificationChain msgs) {
		RteHeader oldRteHeader = rteHeader;
		rteHeader = newRteHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_HEADER, oldRteHeader, newRteHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteHeader(RteHeader newRteHeader) {
		if (newRteHeader != rteHeader) {
			NotificationChain msgs = null;
			if (rteHeader != null)
				msgs = ((InternalEObject)rteHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_HEADER, null, msgs);
			if (newRteHeader != null)
				msgs = ((InternalEObject)newRteHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_HEADER, null, msgs);
			msgs = basicSetRteHeader(newRteHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_HEADER, newRteHeader, newRteHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInternalHeader getRteCommonHeader() {
		return rteCommonHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteCommonHeader(RteInternalHeader newRteCommonHeader, NotificationChain msgs) {
		RteInternalHeader oldRteCommonHeader = rteCommonHeader;
		rteCommonHeader = newRteCommonHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_COMMON_HEADER, oldRteCommonHeader, newRteCommonHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCommonHeader(RteInternalHeader newRteCommonHeader) {
		if (newRteCommonHeader != rteCommonHeader) {
			NotificationChain msgs = null;
			if (rteCommonHeader != null)
				msgs = ((InternalEObject)rteCommonHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_COMMON_HEADER, null, msgs);
			if (newRteCommonHeader != null)
				msgs = ((InternalEObject)newRteCommonHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_COMMON_HEADER, null, msgs);
			msgs = basicSetRteCommonHeader(newRteCommonHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_COMMON_HEADER, newRteCommonHeader, newRteCommonHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteInternalHeader> getRtePartitionHeader() {
		if (rtePartitionHeader == null) {
			rtePartitionHeader = new EObjectContainmentEList<RteInternalHeader>(RteInternalHeader.class, this, ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER);
		}
		return rtePartitionHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUtilityHeader getRteUtilityHeader() {
		return rteUtilityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteUtilityHeader(RteUtilityHeader newRteUtilityHeader, NotificationChain msgs) {
		RteUtilityHeader oldRteUtilityHeader = rteUtilityHeader;
		rteUtilityHeader = newRteUtilityHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER, oldRteUtilityHeader, newRteUtilityHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteUtilityHeader(RteUtilityHeader newRteUtilityHeader) {
		if (newRteUtilityHeader != rteUtilityHeader) {
			NotificationChain msgs = null;
			if (rteUtilityHeader != null)
				msgs = ((InternalEObject)rteUtilityHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER, null, msgs);
			if (newRteUtilityHeader != null)
				msgs = ((InternalEObject)newRteUtilityHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER, null, msgs);
			msgs = basicSetRteUtilityHeader(newRteUtilityHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER, newRteUtilityHeader, newRteUtilityHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderFile> getDependentHeader() {
		if (dependentHeader == null) {
			dependentHeader = new EObjectContainmentEList<HeaderFile>(HeaderFile.class, this, ModulePackage.RTE_MODULE__DEPENDENT_HEADER);
		}
		return dependentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswMemoryMappingHeader getBswMemoryMappingHeader() {
		return bswMemoryMappingHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBswMemoryMappingHeader(BswMemoryMappingHeader newBswMemoryMappingHeader, NotificationChain msgs) {
		BswMemoryMappingHeader oldBswMemoryMappingHeader = bswMemoryMappingHeader;
		bswMemoryMappingHeader = newBswMemoryMappingHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER, oldBswMemoryMappingHeader, newBswMemoryMappingHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswMemoryMappingHeader(BswMemoryMappingHeader newBswMemoryMappingHeader) {
		if (newBswMemoryMappingHeader != bswMemoryMappingHeader) {
			NotificationChain msgs = null;
			if (bswMemoryMappingHeader != null)
				msgs = ((InternalEObject)bswMemoryMappingHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER, null, msgs);
			if (newBswMemoryMappingHeader != null)
				msgs = ((InternalEObject)newBswMemoryMappingHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER, null, msgs);
			msgs = basicSetBswMemoryMappingHeader(newBswMemoryMappingHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER, newBswMemoryMappingHeader, newBswMemoryMappingHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMemoryMappingHeader> getSwcMemoryMappingHeader() {
		if (swcMemoryMappingHeader == null) {
			swcMemoryMappingHeader = new EObjectContainmentEList<SwcMemoryMappingHeader>(SwcMemoryMappingHeader.class, this, ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER);
		}
		return swcMemoryMappingHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleInterlinkHeader> getModuleInterlinkHeader() {
		if (moduleInterlinkHeader == null) {
			moduleInterlinkHeader = new EObjectContainmentEList<ModuleInterlinkHeader>(ModuleInterlinkHeader.class, this, ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER);
		}
		return moduleInterlinkHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleInterlinkTypeHeader> getModuleInterlinkTypeHeader() {
		if (moduleInterlinkTypeHeader == null) {
			moduleInterlinkTypeHeader = new EObjectContainmentEList<ModuleInterlinkTypeHeader>(ModuleInterlinkTypeHeader.class, this, ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER);
		}
		return moduleInterlinkTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswApiHeader getRteBswApiHeader() {
		return rteBswApiHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswApiHeader(RteBswApiHeader newRteBswApiHeader, NotificationChain msgs) {
		RteBswApiHeader oldRteBswApiHeader = rteBswApiHeader;
		rteBswApiHeader = newRteBswApiHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER, oldRteBswApiHeader, newRteBswApiHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswApiHeader(RteBswApiHeader newRteBswApiHeader) {
		if (newRteBswApiHeader != rteBswApiHeader) {
			NotificationChain msgs = null;
			if (rteBswApiHeader != null)
				msgs = ((InternalEObject)rteBswApiHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER, null, msgs);
			if (newRteBswApiHeader != null)
				msgs = ((InternalEObject)newRteBswApiHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER, null, msgs);
			msgs = basicSetRteBswApiHeader(newRteBswApiHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER, newRteBswApiHeader, newRteBswApiHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
				return ((InternalEList<?>)getDependentHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
				return basicSetBswMemoryMappingHeader(null, msgs);
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
				return ((InternalEList<?>)getSwcMemoryMappingHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__RTE_HEADER:
				return basicSetRteHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
				return basicSetRteTypeHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
				return ((InternalEList<?>)getRteApplicationTypeHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
				return ((InternalEList<?>)getRteApplicationHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
				return ((InternalEList<?>)getModuleInterlinkTypeHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
				return ((InternalEList<?>)getModuleInterlinkHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
				return basicSetRteLifecycleHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
				return basicSetRteConfigurationHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
				return basicSetRteVfbTraceHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
				return basicSetRteCallbackHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
				return basicSetRteUtilityHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
				return basicSetRteBswApiHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
				return basicSetRteCommonHeader(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
				return ((InternalEList<?>)getRtePartitionHeader()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
				return basicSetRteCommonSource(null, msgs);
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
				return ((InternalEList<?>)getRtePartitionSource()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
				return getDependentHeader();
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
				return getBswMemoryMappingHeader();
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
				return getSwcMemoryMappingHeader();
			case ModulePackage.RTE_MODULE__RTE_HEADER:
				return getRteHeader();
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
				return getRteTypeHeader();
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
				return getRteApplicationTypeHeader();
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
				return getRteApplicationHeader();
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
				return getModuleInterlinkTypeHeader();
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
				return getModuleInterlinkHeader();
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
				return getRteLifecycleHeader();
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
				return getRteConfigurationHeader();
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
				return getRteVfbTraceHeader();
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
				return getRteCallbackHeader();
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
				return getRteUtilityHeader();
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
				return getRteBswApiHeader();
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
				return getRteCommonHeader();
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
				return getRtePartitionHeader();
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
				return getRteCommonSource();
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
				return getRtePartitionSource();
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
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
				getDependentHeader().clear();
				getDependentHeader().addAll((Collection<? extends HeaderFile>)newValue);
				return;
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
				setBswMemoryMappingHeader((BswMemoryMappingHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
				getSwcMemoryMappingHeader().clear();
				getSwcMemoryMappingHeader().addAll((Collection<? extends SwcMemoryMappingHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_HEADER:
				setRteHeader((RteHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
				setRteTypeHeader((RteTypeHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
				getRteApplicationTypeHeader().clear();
				getRteApplicationTypeHeader().addAll((Collection<? extends RteApplicationTypeHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
				getRteApplicationHeader().clear();
				getRteApplicationHeader().addAll((Collection<? extends RteApplicationHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
				getModuleInterlinkTypeHeader().clear();
				getModuleInterlinkTypeHeader().addAll((Collection<? extends ModuleInterlinkTypeHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
				getModuleInterlinkHeader().clear();
				getModuleInterlinkHeader().addAll((Collection<? extends ModuleInterlinkHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
				setRteLifecycleHeader((RteLifecycleHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
				setRteConfigurationHeader((RteConfigurationHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
				setRteVfbTraceHeader((RteVfbTraceHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
				setRteCallbackHeader((RteCallbackHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
				setRteUtilityHeader((RteUtilityHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
				setRteBswApiHeader((RteBswApiHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
				setRteCommonHeader((RteInternalHeader)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
				getRtePartitionHeader().clear();
				getRtePartitionHeader().addAll((Collection<? extends RteInternalHeader>)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
				setRteCommonSource((RteSource)newValue);
				return;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
				getRtePartitionSource().clear();
				getRtePartitionSource().addAll((Collection<? extends RteSource>)newValue);
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
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
				getDependentHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
				setBswMemoryMappingHeader((BswMemoryMappingHeader)null);
				return;
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
				getSwcMemoryMappingHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__RTE_HEADER:
				setRteHeader((RteHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
				setRteTypeHeader((RteTypeHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
				getRteApplicationTypeHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
				getRteApplicationHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
				getModuleInterlinkTypeHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
				getModuleInterlinkHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
				setRteLifecycleHeader((RteLifecycleHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
				setRteConfigurationHeader((RteConfigurationHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
				setRteVfbTraceHeader((RteVfbTraceHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
				setRteCallbackHeader((RteCallbackHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
				setRteUtilityHeader((RteUtilityHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
				setRteBswApiHeader((RteBswApiHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
				setRteCommonHeader((RteInternalHeader)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
				getRtePartitionHeader().clear();
				return;
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
				setRteCommonSource((RteSource)null);
				return;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
				getRtePartitionSource().clear();
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
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
				return dependentHeader != null && !dependentHeader.isEmpty();
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
				return bswMemoryMappingHeader != null;
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
				return swcMemoryMappingHeader != null && !swcMemoryMappingHeader.isEmpty();
			case ModulePackage.RTE_MODULE__RTE_HEADER:
				return rteHeader != null;
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
				return rteTypeHeader != null;
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
				return rteApplicationTypeHeader != null && !rteApplicationTypeHeader.isEmpty();
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
				return rteApplicationHeader != null && !rteApplicationHeader.isEmpty();
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
				return moduleInterlinkTypeHeader != null && !moduleInterlinkTypeHeader.isEmpty();
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
				return moduleInterlinkHeader != null && !moduleInterlinkHeader.isEmpty();
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
				return rteLifecycleHeader != null;
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
				return rteConfigurationHeader != null;
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
				return rteVfbTraceHeader != null;
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
				return rteCallbackHeader != null;
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
				return rteUtilityHeader != null;
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
				return rteBswApiHeader != null;
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
				return rteCommonHeader != null;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
				return rtePartitionHeader != null && !rtePartitionHeader.isEmpty();
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
				return rteCommonSource != null;
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
				return rtePartitionSource != null && !rtePartitionSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteModuleImpl
