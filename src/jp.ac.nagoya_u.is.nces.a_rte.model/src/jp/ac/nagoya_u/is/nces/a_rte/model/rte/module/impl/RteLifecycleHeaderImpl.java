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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Lifecycle Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteLifecycleHeaderImpl extends HeaderFileImpl implements RteLifecycleHeader {
	/**
	 * The cached value of the '{@link #getRteLifecycleApiGroup() <em>Rte Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteLifecycleApiFileContentsGroup> rteLifecycleApiGroup;
	/**
	 * The cached value of the '{@link #getSchmLifecycleApiGroup() <em>Schm Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmLifecycleApiFileContentsGroup> schmLifecycleApiGroup;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteLifecycleHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_LIFECYCLE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteLifecycleApiFileContentsGroup> getRteLifecycleApiGroup() {
		if (rteLifecycleApiGroup == null) {
			rteLifecycleApiGroup = new EObjectContainmentEList<RteLifecycleApiFileContentsGroup>(RteLifecycleApiFileContentsGroup.class, this, ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP);
		}
		return rteLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmLifecycleApiFileContentsGroup> getSchmLifecycleApiGroup() {
		if (schmLifecycleApiGroup == null) {
			schmLifecycleApiGroup = new EObjectContainmentEList<SchmLifecycleApiFileContentsGroup>(SchmLifecycleApiFileContentsGroup.class, this, ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP);
		}
		return schmLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getRteLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getSchmLifecycleApiGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return getRteLifecycleApiGroup();
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return getSchmLifecycleApiGroup();
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				getRteLifecycleApiGroup().addAll((Collection<? extends RteLifecycleApiFileContentsGroup>)newValue);
				return;
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				getSchmLifecycleApiGroup().addAll((Collection<? extends SchmLifecycleApiFileContentsGroup>)newValue);
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return rteLifecycleApiGroup != null && !rteLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return schmLifecycleApiGroup != null && !schmLifecycleApiGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteLifecycleHeaderImpl
