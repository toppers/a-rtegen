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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Starter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getExpectedConfig <em>Expected Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getStartInteraction <em>Start Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getStartOffsetCounterImplementation <em>Start Offset Counter Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getCycleCounterImplementation <em>Cycle Counter Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityStarterImpl extends InteractionEndImpl implements EntityStarter {
	/**
	 * The cached value of the '{@link #getExecutionContext() <em>Execution Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected ExecutionContext executionContext;

	/**
	 * The cached value of the '{@link #getExpectedConfig() <em>Expected Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedConfig()
	 * @generated
	 * @ordered
	 */
	protected RteUsedOsActivation expectedConfig;

	/**
	 * The cached value of the '{@link #getStartInteraction() <em>Start Interaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityStartInteraction> startInteraction;

	/**
	 * The cached value of the '{@link #getStartOffsetCounterImplementation() <em>Start Offset Counter Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffsetCounterImplementation()
	 * @generated
	 * @ordered
	 */
	protected StartOffsetCounterImplementation startOffsetCounterImplementation;

	/**
	 * The cached value of the '{@link #getCycleCounterImplementation() <em>Cycle Counter Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCounterImplementation()
	 * @generated
	 * @ordered
	 */
	protected CycleCounterImplementation cycleCounterImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityStarterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ENTITY_STARTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext getExecutionContext() {
		if (executionContext != null && ((EObject)executionContext).eIsProxy()) {
			InternalEObject oldExecutionContext = (InternalEObject)executionContext;
			executionContext = (ExecutionContext)eResolveProxy(oldExecutionContext);
			if (executionContext != oldExecutionContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT, oldExecutionContext, executionContext));
			}
		}
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext basicGetExecutionContext() {
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionContext(ExecutionContext newExecutionContext, NotificationChain msgs) {
		ExecutionContext oldExecutionContext = executionContext;
		executionContext = newExecutionContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT, oldExecutionContext, newExecutionContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(ExecutionContext newExecutionContext) {
		if (newExecutionContext != executionContext) {
			NotificationChain msgs = null;
			if (executionContext != null)
				msgs = ((InternalEObject)executionContext).eInverseRemove(this, InteractionPackage.EXECUTION_CONTEXT__ENTITY_STARTER, ExecutionContext.class, msgs);
			if (newExecutionContext != null)
				msgs = ((InternalEObject)newExecutionContext).eInverseAdd(this, InteractionPackage.EXECUTION_CONTEXT__ENTITY_STARTER, ExecutionContext.class, msgs);
			msgs = basicSetExecutionContext(newExecutionContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT, newExecutionContext, newExecutionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation getExpectedConfig() {
		if (expectedConfig != null && ((EObject)expectedConfig).eIsProxy()) {
			InternalEObject oldExpectedConfig = (InternalEObject)expectedConfig;
			expectedConfig = (RteUsedOsActivation)eResolveProxy(oldExpectedConfig);
			if (expectedConfig != oldExpectedConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG, oldExpectedConfig, expectedConfig));
			}
		}
		return expectedConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation basicGetExpectedConfig() {
		return expectedConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedConfig(RteUsedOsActivation newExpectedConfig) {
		RteUsedOsActivation oldExpectedConfig = expectedConfig;
		expectedConfig = newExpectedConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG, oldExpectedConfig, expectedConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityStartInteraction> getStartInteraction() {
		if (startInteraction == null) {
			startInteraction = new EObjectWithInverseResolvingEList<EntityStartInteraction>(EntityStartInteraction.class, this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, InteractionPackage.ENTITY_START_INTERACTION__STARTER);
		}
		return startInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCounterImplementation getStartOffsetCounterImplementation() {
		return startOffsetCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOffsetCounterImplementation(StartOffsetCounterImplementation newStartOffsetCounterImplementation, NotificationChain msgs) {
		StartOffsetCounterImplementation oldStartOffsetCounterImplementation = startOffsetCounterImplementation;
		startOffsetCounterImplementation = newStartOffsetCounterImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, oldStartOffsetCounterImplementation, newStartOffsetCounterImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffsetCounterImplementation(StartOffsetCounterImplementation newStartOffsetCounterImplementation) {
		if (newStartOffsetCounterImplementation != startOffsetCounterImplementation) {
			NotificationChain msgs = null;
			if (startOffsetCounterImplementation != null)
				msgs = ((InternalEObject)startOffsetCounterImplementation).eInverseRemove(this, InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION__PARENT, StartOffsetCounterImplementation.class, msgs);
			if (newStartOffsetCounterImplementation != null)
				msgs = ((InternalEObject)newStartOffsetCounterImplementation).eInverseAdd(this, InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION__PARENT, StartOffsetCounterImplementation.class, msgs);
			msgs = basicSetStartOffsetCounterImplementation(newStartOffsetCounterImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, newStartOffsetCounterImplementation, newStartOffsetCounterImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCounterImplementation getCycleCounterImplementation() {
		return cycleCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycleCounterImplementation(CycleCounterImplementation newCycleCounterImplementation, NotificationChain msgs) {
		CycleCounterImplementation oldCycleCounterImplementation = cycleCounterImplementation;
		cycleCounterImplementation = newCycleCounterImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, oldCycleCounterImplementation, newCycleCounterImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCounterImplementation(CycleCounterImplementation newCycleCounterImplementation) {
		if (newCycleCounterImplementation != cycleCounterImplementation) {
			NotificationChain msgs = null;
			if (cycleCounterImplementation != null)
				msgs = ((InternalEObject)cycleCounterImplementation).eInverseRemove(this, InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION__PARENT, CycleCounterImplementation.class, msgs);
			if (newCycleCounterImplementation != null)
				msgs = ((InternalEObject)newCycleCounterImplementation).eInverseAdd(this, InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION__PARENT, CycleCounterImplementation.class, msgs);
			msgs = basicSetCycleCounterImplementation(newCycleCounterImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, newCycleCounterImplementation, newCycleCounterImplementation));
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				if (executionContext != null)
					msgs = ((InternalEObject)executionContext).eInverseRemove(this, InteractionPackage.EXECUTION_CONTEXT__ENTITY_STARTER, ExecutionContext.class, msgs);
				return basicSetExecutionContext((ExecutionContext)otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartInteraction()).basicAdd(otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				if (startOffsetCounterImplementation != null)
					msgs = ((InternalEObject)startOffsetCounterImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, null, msgs);
				return basicSetStartOffsetCounterImplementation((StartOffsetCounterImplementation)otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				if (cycleCounterImplementation != null)
					msgs = ((InternalEObject)cycleCounterImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, null, msgs);
				return basicSetCycleCounterImplementation((CycleCounterImplementation)otherEnd, msgs);
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				return basicSetExecutionContext(null, msgs);
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return ((InternalEList<?>)getStartInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return basicSetStartOffsetCounterImplementation(null, msgs);
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return basicSetCycleCounterImplementation(null, msgs);
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				if (resolve) return getExecutionContext();
				return basicGetExecutionContext();
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				if (resolve) return getExpectedConfig();
				return basicGetExpectedConfig();
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return getStartInteraction();
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return getStartOffsetCounterImplementation();
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return getCycleCounterImplementation();
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				setExecutionContext((ExecutionContext)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				setExpectedConfig((RteUsedOsActivation)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				getStartInteraction().clear();
				getStartInteraction().addAll((Collection<? extends EntityStartInteraction>)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				setStartOffsetCounterImplementation((StartOffsetCounterImplementation)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				setCycleCounterImplementation((CycleCounterImplementation)newValue);
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				setExecutionContext((ExecutionContext)null);
				return;
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				setExpectedConfig((RteUsedOsActivation)null);
				return;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				getStartInteraction().clear();
				return;
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				setStartOffsetCounterImplementation((StartOffsetCounterImplementation)null);
				return;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				setCycleCounterImplementation((CycleCounterImplementation)null);
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
			case InteractionPackage.ENTITY_STARTER__EXECUTION_CONTEXT:
				return executionContext != null;
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				return expectedConfig != null;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return startInteraction != null && !startInteraction.isEmpty();
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return startOffsetCounterImplementation != null;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return cycleCounterImplementation != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityStarterImpl
