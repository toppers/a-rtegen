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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Schedulable Entity Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl#getModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswSchedulableEntityExImpl extends ExtendedEObjectImpl implements BswSchedulableEntityEx {
	/**
	 * The cached value of the '{@link #getModeDeclarationGroupPrototypeEx() <em>Mode Declaration Group Prototype Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclarationGroupPrototypeEx()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroupPrototypeEx modeDeclarationGroupPrototypeEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswSchedulableEntityExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx getModeDeclarationGroupPrototypeEx() {
		if (modeDeclarationGroupPrototypeEx != null && ((EObject)modeDeclarationGroupPrototypeEx).eIsProxy()) {
			InternalEObject oldModeDeclarationGroupPrototypeEx = (InternalEObject)modeDeclarationGroupPrototypeEx;
			modeDeclarationGroupPrototypeEx = (ModeDeclarationGroupPrototypeEx)eResolveProxy(oldModeDeclarationGroupPrototypeEx);
			if (modeDeclarationGroupPrototypeEx != oldModeDeclarationGroupPrototypeEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX, oldModeDeclarationGroupPrototypeEx, modeDeclarationGroupPrototypeEx));
			}
		}
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx basicGetModeDeclarationGroupPrototypeEx() {
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx newModeDeclarationGroupPrototypeEx) {
		ModeDeclarationGroupPrototypeEx oldModeDeclarationGroupPrototypeEx = modeDeclarationGroupPrototypeEx;
		modeDeclarationGroupPrototypeEx = newModeDeclarationGroupPrototypeEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX, oldModeDeclarationGroupPrototypeEx, modeDeclarationGroupPrototypeEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Using Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_PARTITION_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EcucPartition> getUsingPartition(BswSchedulableEntity this_) {
		try {
			return (EList<EcucPartition>)GET_USING_PARTITION_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BswSchedulableEntity> getCallRootBswSchedulableEntities(BswSchedulableEntity this_) {
		EList<BswSchedulableEntity> callRootBswSchedulableEntities = new BasicEList<BswSchedulableEntity>();

		// コールツリーのルートのBSWスケジューラブルを探索
		Deque<BswSchedulableEntity> searchUndoneBswSchedulableEntities = new ArrayDeque<BswSchedulableEntity>();
		List<BswSchedulableEntity> searchDoneBswSchedulableEntities = new ArrayList<BswSchedulableEntity>();

		searchUndoneBswSchedulableEntities.add(this_);
		while (!searchUndoneBswSchedulableEntities.isEmpty()) {
			BswSchedulableEntity searchTargetBswSchedulableEntity = searchUndoneBswSchedulableEntities.pop();

			// コールルートかを判定
			EList<OsTask> mappedTasks = getMappedTasks(searchTargetBswSchedulableEntity);
			EList<BswSchedulableEntity> callerBswSchedulableEntities = getCallerBswSchedulableEntities(searchTargetBswSchedulableEntity);
			if (!mappedTasks.isEmpty()) {
				// コールルート(タスク割付あり)
				// タスク割付ありのため、末端と判定
				callRootBswSchedulableEntities.add(searchTargetBswSchedulableEntity);
			} else if (callerBswSchedulableEntities.isEmpty()) {
				// コールルート(タスク割付なし)
				// タスク割付なし、かつ呼び出し元のBSWスケジューラブルが存在しないため、末端と判定
				callRootBswSchedulableEntities.add(searchTargetBswSchedulableEntity);
			} else {
				// 非コールルート
				// 何もしない
			}

			// 探索済みであることをマーク
			searchDoneBswSchedulableEntities.add(searchTargetBswSchedulableEntity);

			// 呼び出し元のBSWスケジューラブルを次の探索対象に追加
			// NOTE BSWスケジューラブルにタスク割付がある場合でも、呼び出し元のBSWスケジューラブルが存在する場合があることに注意
			// (BSWスケジューラブルにBswEventが複数あり、タスク起動と直接開始が混在する場合等)
			for (BswSchedulableEntity callerBswSchedulableEntity : callerBswSchedulableEntities) {
				// 循環コールで探索が永久に終わらない可能性があるため、既に探索済みのものは探索から除外する
				if (!searchDoneBswSchedulableEntities.contains(callerBswSchedulableEntity)) {
					searchUndoneBswSchedulableEntities.push(callerBswSchedulableEntity);
				}
			}
		}

		return callRootBswSchedulableEntities;
	}

	/**
	 * The cached invocation delegate for the '{@link #getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Mapped Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MAPPED_TASKS_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OsTask> getMappedTasks(BswSchedulableEntity this_) {
		try {
			return (EList<OsTask>)GET_MAPPED_TASKS_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getCallerBswSchedulableEntities(BswSchedulableEntity this_) {
		try {
			return (EList<BswSchedulableEntity>)GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities By Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getCallerBswSchedulableEntitiesByMode(BswSchedulableEntity this_) {
		try {
			return (EList<BswSchedulableEntity>)GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				if (resolve) return getModeDeclarationGroupPrototypeEx();
				return basicGetModeDeclarationGroupPrototypeEx();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				setModeDeclarationGroupPrototypeEx((ModeDeclarationGroupPrototypeEx)newValue);
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
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				setModeDeclarationGroupPrototypeEx((ModeDeclarationGroupPrototypeEx)null);
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
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				return modeDeclarationGroupPrototypeEx != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY:
				return getUsingPartition((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALL_ROOT_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY:
				return getCallRootBswSchedulableEntities((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY:
				return getMappedTasks((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY:
				return getCallerBswSchedulableEntities((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY:
				return getCallerBswSchedulableEntitiesByMode((BswSchedulableEntity)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BswSchedulableEntityExImpl
