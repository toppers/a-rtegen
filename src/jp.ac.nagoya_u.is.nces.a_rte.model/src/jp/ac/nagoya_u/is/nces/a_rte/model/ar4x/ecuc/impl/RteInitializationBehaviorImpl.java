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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Initialization Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl#getRteInitializationStrategy <em>Rte Initialization Strategy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl#getRteSectionInitializationPolicy <em>Rte Section Initialization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteInitializationBehaviorImpl extends EcucContainerImpl implements RteInitializationBehavior {
	/**
	 * The default value of the '{@link #getRteInitializationStrategy() <em>Rte Initialization Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final RteInitializationStrategyEnum RTE_INITIALIZATION_STRATEGY_EDEFAULT = RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION;

	/**
	 * The cached value of the '{@link #getRteInitializationStrategy() <em>Rte Initialization Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationStrategy()
	 * @generated
	 * @ordered
	 */
	protected RteInitializationStrategyEnum rteInitializationStrategy = RTE_INITIALIZATION_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteSectionInitializationPolicy() <em>Rte Section Initialization Policy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rteSectionInitializationPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteInitializationBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_INITIALIZATION_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum getRteInitializationStrategy() {
		return rteInitializationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteInitializationStrategy(RteInitializationStrategyEnum newRteInitializationStrategy) {
		RteInitializationStrategyEnum oldRteInitializationStrategy = rteInitializationStrategy;
		rteInitializationStrategy = newRteInitializationStrategy == null ? RTE_INITIALIZATION_STRATEGY_EDEFAULT : newRteInitializationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY, oldRteInitializationStrategy, rteInitializationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRteSectionInitializationPolicy() {
		if (rteSectionInitializationPolicy == null) {
			rteSectionInitializationPolicy = new EDataTypeUniqueEList<String>(String.class, this, EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY);
		}
		return rteSectionInitializationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				return getRteInitializationStrategy();
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				return getRteSectionInitializationPolicy();
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				setRteInitializationStrategy((RteInitializationStrategyEnum)newValue);
				return;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				getRteSectionInitializationPolicy().clear();
				getRteSectionInitializationPolicy().addAll((Collection<? extends String>)newValue);
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				setRteInitializationStrategy(RTE_INITIALIZATION_STRATEGY_EDEFAULT);
				return;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				getRteSectionInitializationPolicy().clear();
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				return rteInitializationStrategy != RTE_INITIALIZATION_STRATEGY_EDEFAULT;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				return rteSectionInitializationPolicy != null && !rteSectionInitializationPolicy.isEmpty();
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
		result.append(" (rteInitializationStrategy: ");
		result.append(rteInitializationStrategy);
		result.append(", rteSectionInitializationPolicy: ");
		result.append(rteSectionInitializationPolicy);
		result.append(')');
		return result.toString();
	}

} //RteInitializationBehaviorImpl
