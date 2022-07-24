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

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getRte <em>Rte</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getOs <em>Os</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getCom <em>Com</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getEcuC <em>Ecu C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucRootImpl extends ExtendedEObjectImpl implements EcucRoot {
	/**
	 * The cached value of the '{@link #getRte() <em>Rte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRte()
	 * @generated
	 * @ordered
	 */
	protected Rte rte;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected Os os;

	/**
	 * The cached value of the '{@link #getCom() <em>Com</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCom()
	 * @generated
	 * @ordered
	 */
	protected Com com;

	/**
	 * The cached value of the '{@link #getEcuC() <em>Ecu C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuC()
	 * @generated
	 * @ordered
	 */
	protected EcuC ecuC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.ECUC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rte getRte() {
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRte(Rte newRte, NotificationChain msgs) {
		Rte oldRte = rte;
		rte = newRte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__RTE, oldRte, newRte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRte(Rte newRte) {
		if (newRte != rte) {
			NotificationChain msgs = null;
			if (rte != null)
				msgs = ((InternalEObject)rte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__RTE, null, msgs);
			if (newRte != null)
				msgs = ((InternalEObject)newRte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__RTE, null, msgs);
			msgs = basicSetRte(newRte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__RTE, newRte, newRte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOs(Os newOs, NotificationChain msgs) {
		Os oldOs = os;
		os = newOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__OS, oldOs, newOs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(Os newOs) {
		if (newOs != os) {
			NotificationChain msgs = null;
			if (os != null)
				msgs = ((InternalEObject)os).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__OS, null, msgs);
			if (newOs != null)
				msgs = ((InternalEObject)newOs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__OS, null, msgs);
			msgs = basicSetOs(newOs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__OS, newOs, newOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Com getCom() {
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCom(Com newCom, NotificationChain msgs) {
		Com oldCom = com;
		com = newCom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__COM, oldCom, newCom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCom(Com newCom) {
		if (newCom != com) {
			NotificationChain msgs = null;
			if (com != null)
				msgs = ((InternalEObject)com).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__COM, null, msgs);
			if (newCom != null)
				msgs = ((InternalEObject)newCom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__COM, null, msgs);
			msgs = basicSetCom(newCom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__COM, newCom, newCom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuC getEcuC() {
		return ecuC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcuC(EcuC newEcuC, NotificationChain msgs) {
		EcuC oldEcuC = ecuC;
		ecuC = newEcuC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__ECU_C, oldEcuC, newEcuC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuC(EcuC newEcuC) {
		if (newEcuC != ecuC) {
			NotificationChain msgs = null;
			if (ecuC != null)
				msgs = ((InternalEObject)ecuC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__ECU_C, null, msgs);
			if (newEcuC != null)
				msgs = ((InternalEObject)newEcuC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__ECU_C, null, msgs);
			msgs = basicSetEcuC(newEcuC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__ECU_C, newEcuC, newEcuC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.ECUC_ROOT__RTE:
				return basicSetRte(null, msgs);
			case EcucPackage.ECUC_ROOT__OS:
				return basicSetOs(null, msgs);
			case EcucPackage.ECUC_ROOT__COM:
				return basicSetCom(null, msgs);
			case EcucPackage.ECUC_ROOT__ECU_C:
				return basicSetEcuC(null, msgs);
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
			case EcucPackage.ECUC_ROOT__RTE:
				return getRte();
			case EcucPackage.ECUC_ROOT__OS:
				return getOs();
			case EcucPackage.ECUC_ROOT__COM:
				return getCom();
			case EcucPackage.ECUC_ROOT__ECU_C:
				return getEcuC();
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
			case EcucPackage.ECUC_ROOT__RTE:
				setRte((Rte)newValue);
				return;
			case EcucPackage.ECUC_ROOT__OS:
				setOs((Os)newValue);
				return;
			case EcucPackage.ECUC_ROOT__COM:
				setCom((Com)newValue);
				return;
			case EcucPackage.ECUC_ROOT__ECU_C:
				setEcuC((EcuC)newValue);
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
			case EcucPackage.ECUC_ROOT__RTE:
				setRte((Rte)null);
				return;
			case EcucPackage.ECUC_ROOT__OS:
				setOs((Os)null);
				return;
			case EcucPackage.ECUC_ROOT__COM:
				setCom((Com)null);
				return;
			case EcucPackage.ECUC_ROOT__ECU_C:
				setEcuC((EcuC)null);
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
			case EcucPackage.ECUC_ROOT__RTE:
				return rte != null;
			case EcucPackage.ECUC_ROOT__OS:
				return os != null;
			case EcucPackage.ECUC_ROOT__COM:
				return com != null;
			case EcucPackage.ECUC_ROOT__ECU_C:
				return ecuC != null;
		}
		return super.eIsSet(featureID);
	}

} //EcucRootImpl
