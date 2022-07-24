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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getSwcConfig <em>Swc Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getBswConfig <em>Bsw Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getEnterExecutableEntity <em>Enter Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusiveAreaImpl extends IdentifiableImpl implements ExclusiveArea {
	/**
	 * The cached value of the '{@link #getSwcConfig() <em>Swc Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteExclusiveAreaImplementation> swcConfig;
	/**
	 * The cached value of the '{@link #getBswConfig() <em>Bsw Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswExclusiveAreaImpl> bswConfig;
	/**
	 * The cached value of the '{@link #getEnterExecutableEntity() <em>Enter Executable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntity> enterExecutableEntity;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.EXCLUSIVE_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.EXCLUSIVE_AREA__PARENT) return null;
		return (InternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(InternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.EXCLUSIVE_AREA__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(InternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.EXCLUSIVE_AREA__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, InternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.EXCLUSIVE_AREA__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getEnterExecutableEntity() {
		if (enterExecutableEntity == null) {
			enterExecutableEntity = new EObjectWithInverseResolvingEList.ManyInverse<ExecutableEntity>(ExecutableEntity.class, this, M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY, M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA);
		}
		return enterExecutableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteExclusiveAreaImplementation> getSwcConfig() {
		if (swcConfig == null) {
			swcConfig = new EObjectWithInverseResolvingEList<RteExclusiveAreaImplementation>(RteExclusiveAreaImplementation.class, this, M2Package.EXCLUSIVE_AREA__SWC_CONFIG, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA);
		}
		return swcConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswExclusiveAreaImpl> getBswConfig() {
		if (bswConfig == null) {
			bswConfig = new EObjectWithInverseResolvingEList<RteBswExclusiveAreaImpl>(RteBswExclusiveAreaImpl.class, this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA);
		}
		return bswConfig;
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwcConfig()).basicAdd(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBswConfig()).basicAdd(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((InternalBehavior)otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnterExecutableEntity()).basicAdd(otherEnd, msgs);
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return ((InternalEList<?>)getSwcConfig()).basicRemove(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return ((InternalEList<?>)getBswConfig()).basicRemove(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return ((InternalEList<?>)getEnterExecutableEntity()).basicRemove(otherEnd, msgs);
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
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, InternalBehavior.class, msgs);
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return getSwcConfig();
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return getBswConfig();
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return getParent();
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return getEnterExecutableEntity();
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				getSwcConfig().clear();
				getSwcConfig().addAll((Collection<? extends RteExclusiveAreaImplementation>)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				getBswConfig().clear();
				getBswConfig().addAll((Collection<? extends RteBswExclusiveAreaImpl>)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__PARENT:
				setParent((InternalBehavior)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				getEnterExecutableEntity().clear();
				getEnterExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				getSwcConfig().clear();
				return;
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				getBswConfig().clear();
				return;
			case M2Package.EXCLUSIVE_AREA__PARENT:
				setParent((InternalBehavior)null);
				return;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				getEnterExecutableEntity().clear();
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return swcConfig != null && !swcConfig.isEmpty();
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return bswConfig != null && !bswConfig.isEmpty();
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return getParent() != null;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return enterExecutableEntity != null && !enterExecutableEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusiveAreaImpl
