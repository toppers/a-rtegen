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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Module Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getInternalBehavior <em>Internal Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getProvidedEntry <em>Provided Entry</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getProvidedModeGroup <em>Provided Mode Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getRequiredModeGroup <em>Required Mode Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswModuleDescriptionImpl extends ArElementImpl implements BswModuleDescription {
	/**
	 * The cached value of the '{@link #getInternalBehavior() <em>Internal Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<BswInternalBehavior> internalBehavior;

	/**
	 * The cached value of the '{@link #getProvidedEntry() <em>Provided Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<BswModuleEntry> providedEntry;

	/**
	 * The cached value of the '{@link #getProvidedModeGroup() <em>Provided Mode Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> providedModeGroup;

	/**
	 * The cached value of the '{@link #getRequiredModeGroup() <em>Required Mode Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> requiredModeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswModuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_MODULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswInternalBehavior> getInternalBehavior() {
		if (internalBehavior == null) {
			internalBehavior = new EObjectContainmentWithInverseEList<BswInternalBehavior>(BswInternalBehavior.class, this, M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR, M2Package.BSW_INTERNAL_BEHAVIOR__PARENT);
		}
		return internalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswModuleEntry> getProvidedEntry() {
		if (providedEntry == null) {
			providedEntry = new EObjectResolvingEList<BswModuleEntry>(BswModuleEntry.class, this, M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY);
		}
		return providedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getProvidedModeGroup() {
		if (providedModeGroup == null) {
			providedModeGroup = new EObjectContainmentEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP);
		}
		return providedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getRequiredModeGroup() {
		if (requiredModeGroup == null) {
			requiredModeGroup = new EObjectContainmentEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP);
		}
		return requiredModeGroup;
	}

	/**
	 * The cached invocation delegate for the '{@link #getEnableInternalBehavior() <em>Get Enable Internal Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableInternalBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ENABLE_INTERNAL_BEHAVIOR__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getEnableInternalBehavior() {
		try {
			return (BswInternalBehavior)GET_ENABLE_INTERNAL_BEHAVIOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalBehavior()).basicAdd(otherEnd, msgs);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return ((InternalEList<?>)getInternalBehavior()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return ((InternalEList<?>)getProvidedModeGroup()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return ((InternalEList<?>)getRequiredModeGroup()).basicRemove(otherEnd, msgs);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return getInternalBehavior();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				return getProvidedEntry();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return getProvidedModeGroup();
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return getRequiredModeGroup();
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				getInternalBehavior().clear();
				getInternalBehavior().addAll((Collection<? extends BswInternalBehavior>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				getProvidedEntry().clear();
				getProvidedEntry().addAll((Collection<? extends BswModuleEntry>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				getProvidedModeGroup().clear();
				getProvidedModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				getRequiredModeGroup().clear();
				getRequiredModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				getInternalBehavior().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				getProvidedEntry().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				getProvidedModeGroup().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				getRequiredModeGroup().clear();
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return internalBehavior != null && !internalBehavior.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				return providedEntry != null && !providedEntry.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return providedModeGroup != null && !providedModeGroup.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return requiredModeGroup != null && !requiredModeGroup.isEmpty();
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
			case M2Package.BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR:
				return getEnableInternalBehavior();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BswModuleDescriptionImpl
