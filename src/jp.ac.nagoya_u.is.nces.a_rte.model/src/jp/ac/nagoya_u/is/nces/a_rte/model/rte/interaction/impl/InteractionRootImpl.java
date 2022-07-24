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
import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getInteractionEnd <em>Interaction End</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getGeneratedEcuConfiguration <em>Generated Ecu Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionRootImpl extends ExtendedEObjectImpl implements InteractionRoot {
	/**
	 * The cached value of the '{@link #getInteractionEnd() <em>Interaction End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionEnd> interactionEnd;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interaction;

	/**
	 * The cached value of the '{@link #getGeneratedEcuConfiguration() <em>Generated Ecu Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 * @ordered
	 */
	protected GeneratedEcuConfiguration generatedEcuConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionEnd> getInteractionEnd() {
		if (interactionEnd == null) {
			interactionEnd = new EObjectContainmentEList<InteractionEnd>(InteractionEnd.class, this, InteractionPackage.INTERACTION_ROOT__INTERACTION_END);
		}
		return interactionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<Interaction>(Interaction.class, this, InteractionPackage.INTERACTION_ROOT__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedEcuConfiguration getGeneratedEcuConfiguration() {
		return generatedEcuConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedEcuConfiguration(GeneratedEcuConfiguration newGeneratedEcuConfiguration, NotificationChain msgs) {
		GeneratedEcuConfiguration oldGeneratedEcuConfiguration = generatedEcuConfiguration;
		generatedEcuConfiguration = newGeneratedEcuConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, oldGeneratedEcuConfiguration, newGeneratedEcuConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedEcuConfiguration(GeneratedEcuConfiguration newGeneratedEcuConfiguration) {
		if (newGeneratedEcuConfiguration != generatedEcuConfiguration) {
			NotificationChain msgs = null;
			if (generatedEcuConfiguration != null)
				msgs = ((InternalEObject)generatedEcuConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, null, msgs);
			if (newGeneratedEcuConfiguration != null)
				msgs = ((InternalEObject)newGeneratedEcuConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, null, msgs);
			msgs = basicSetGeneratedEcuConfiguration(newGeneratedEcuConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, newGeneratedEcuConfiguration, newGeneratedEcuConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return ((InternalEList<?>)getInteractionEnd()).basicRemove(otherEnd, msgs);
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return basicSetGeneratedEcuConfiguration(null, msgs);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return getInteractionEnd();
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return getInteraction();
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return getGeneratedEcuConfiguration();
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				getInteractionEnd().clear();
				getInteractionEnd().addAll((Collection<? extends InteractionEnd>)newValue);
				return;
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends Interaction>)newValue);
				return;
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				setGeneratedEcuConfiguration((GeneratedEcuConfiguration)newValue);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				getInteractionEnd().clear();
				return;
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				getInteraction().clear();
				return;
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				setGeneratedEcuConfiguration((GeneratedEcuConfiguration)null);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return interactionEnd != null && !interactionEnd.isEmpty();
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return generatedEcuConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionRootImpl
