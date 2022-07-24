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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;

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
 * An implementation of the model object '<em><b>Os</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsTask <em>Os Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsEvent <em>Os Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsApplication <em>Os Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsAlarm <em>Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsResource <em>Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsSpinlock <em>Os Spinlock</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsIoc <em>Os Ioc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsImpl#getOsOS <em>Os OS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsImpl extends EcucModuleImpl implements Os {
	/**
	 * The cached value of the '{@link #getOsTask() <em>Os Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTask> osTask;

	/**
	 * The cached value of the '{@link #getOsEvent() <em>Os Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> osEvent;
	/**
	 * The cached value of the '{@link #getOsApplication() <em>Os Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> osApplication;
	/**
	 * The cached value of the '{@link #getOsAlarm() <em>Os Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<OsAlarm> osAlarm;
	/**
	 * The cached value of the '{@link #getOsResource() <em>Os Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsResource()
	 * @generated
	 * @ordered
	 */
	protected EList<OsResource> osResource;
	/**
	 * The cached value of the '{@link #getOsSpinlock() <em>Os Spinlock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected EList<OsSpinlock> osSpinlock;

	/**
	 * The cached value of the '{@link #getOsIoc() <em>Os Ioc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIoc()
	 * @generated
	 * @ordered
	 */
	protected OsIoc osIoc;

	/**
	 * The cached value of the '{@link #getOsOS() <em>Os OS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsOS()
	 * @generated
	 * @ordered
	 */
	protected OsOS osOS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTask> getOsTask() {
		if (osTask == null) {
			osTask = new EObjectContainmentEList<OsTask>(OsTask.class, this, EcucPackage.OS__OS_TASK);
		}
		return osTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getOsEvent() {
		if (osEvent == null) {
			osEvent = new EObjectContainmentEList<OsEvent>(OsEvent.class, this, EcucPackage.OS__OS_EVENT);
		}
		return osEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOsApplication() {
		if (osApplication == null) {
			osApplication = new EObjectContainmentEList<OsApplication>(OsApplication.class, this, EcucPackage.OS__OS_APPLICATION);
		}
		return osApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsAlarm> getOsAlarm() {
		if (osAlarm == null) {
			osAlarm = new EObjectContainmentEList<OsAlarm>(OsAlarm.class, this, EcucPackage.OS__OS_ALARM);
		}
		return osAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsResource> getOsResource() {
		if (osResource == null) {
			osResource = new EObjectContainmentEList<OsResource>(OsResource.class, this, EcucPackage.OS__OS_RESOURCE);
		}
		return osResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsSpinlock> getOsSpinlock() {
		if (osSpinlock == null) {
			osSpinlock = new EObjectContainmentEList<OsSpinlock>(OsSpinlock.class, this, EcucPackage.OS__OS_SPINLOCK);
		}
		return osSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIoc getOsIoc() {
		return osIoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsIoc(OsIoc newOsIoc, NotificationChain msgs) {
		OsIoc oldOsIoc = osIoc;
		osIoc = newOsIoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.OS__OS_IOC, oldOsIoc, newOsIoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIoc(OsIoc newOsIoc) {
		if (newOsIoc != osIoc) {
			NotificationChain msgs = null;
			if (osIoc != null)
				msgs = ((InternalEObject)osIoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS__OS_IOC, null, msgs);
			if (newOsIoc != null)
				msgs = ((InternalEObject)newOsIoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS__OS_IOC, null, msgs);
			msgs = basicSetOsIoc(newOsIoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS__OS_IOC, newOsIoc, newOsIoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsOS getOsOS() {
		return osOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsOS(OsOS newOsOS, NotificationChain msgs) {
		OsOS oldOsOS = osOS;
		osOS = newOsOS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.OS__OS_OS, oldOsOS, newOsOS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsOS(OsOS newOsOS) {
		if (newOsOS != osOS) {
			NotificationChain msgs = null;
			if (osOS != null)
				msgs = ((InternalEObject)osOS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS__OS_OS, null, msgs);
			if (newOsOS != null)
				msgs = ((InternalEObject)newOsOS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.OS__OS_OS, null, msgs);
			msgs = basicSetOsOS(newOsOS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS__OS_OS, newOsOS, newOsOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.OS__OS_TASK:
				return ((InternalEList<?>)getOsTask()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_EVENT:
				return ((InternalEList<?>)getOsEvent()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_APPLICATION:
				return ((InternalEList<?>)getOsApplication()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_ALARM:
				return ((InternalEList<?>)getOsAlarm()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_RESOURCE:
				return ((InternalEList<?>)getOsResource()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_SPINLOCK:
				return ((InternalEList<?>)getOsSpinlock()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS__OS_IOC:
				return basicSetOsIoc(null, msgs);
			case EcucPackage.OS__OS_OS:
				return basicSetOsOS(null, msgs);
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
			case EcucPackage.OS__OS_TASK:
				return getOsTask();
			case EcucPackage.OS__OS_EVENT:
				return getOsEvent();
			case EcucPackage.OS__OS_APPLICATION:
				return getOsApplication();
			case EcucPackage.OS__OS_ALARM:
				return getOsAlarm();
			case EcucPackage.OS__OS_RESOURCE:
				return getOsResource();
			case EcucPackage.OS__OS_SPINLOCK:
				return getOsSpinlock();
			case EcucPackage.OS__OS_IOC:
				return getOsIoc();
			case EcucPackage.OS__OS_OS:
				return getOsOS();
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
			case EcucPackage.OS__OS_TASK:
				getOsTask().clear();
				getOsTask().addAll((Collection<? extends OsTask>)newValue);
				return;
			case EcucPackage.OS__OS_EVENT:
				getOsEvent().clear();
				getOsEvent().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case EcucPackage.OS__OS_APPLICATION:
				getOsApplication().clear();
				getOsApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS__OS_ALARM:
				getOsAlarm().clear();
				getOsAlarm().addAll((Collection<? extends OsAlarm>)newValue);
				return;
			case EcucPackage.OS__OS_RESOURCE:
				getOsResource().clear();
				getOsResource().addAll((Collection<? extends OsResource>)newValue);
				return;
			case EcucPackage.OS__OS_SPINLOCK:
				getOsSpinlock().clear();
				getOsSpinlock().addAll((Collection<? extends OsSpinlock>)newValue);
				return;
			case EcucPackage.OS__OS_IOC:
				setOsIoc((OsIoc)newValue);
				return;
			case EcucPackage.OS__OS_OS:
				setOsOS((OsOS)newValue);
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
			case EcucPackage.OS__OS_TASK:
				getOsTask().clear();
				return;
			case EcucPackage.OS__OS_EVENT:
				getOsEvent().clear();
				return;
			case EcucPackage.OS__OS_APPLICATION:
				getOsApplication().clear();
				return;
			case EcucPackage.OS__OS_ALARM:
				getOsAlarm().clear();
				return;
			case EcucPackage.OS__OS_RESOURCE:
				getOsResource().clear();
				return;
			case EcucPackage.OS__OS_SPINLOCK:
				getOsSpinlock().clear();
				return;
			case EcucPackage.OS__OS_IOC:
				setOsIoc((OsIoc)null);
				return;
			case EcucPackage.OS__OS_OS:
				setOsOS((OsOS)null);
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
			case EcucPackage.OS__OS_TASK:
				return osTask != null && !osTask.isEmpty();
			case EcucPackage.OS__OS_EVENT:
				return osEvent != null && !osEvent.isEmpty();
			case EcucPackage.OS__OS_APPLICATION:
				return osApplication != null && !osApplication.isEmpty();
			case EcucPackage.OS__OS_ALARM:
				return osAlarm != null && !osAlarm.isEmpty();
			case EcucPackage.OS__OS_RESOURCE:
				return osResource != null && !osResource.isEmpty();
			case EcucPackage.OS__OS_SPINLOCK:
				return osSpinlock != null && !osSpinlock.isEmpty();
			case EcucPackage.OS__OS_IOC:
				return osIoc != null;
			case EcucPackage.OS__OS_OS:
				return osOS != null;
		}
		return super.eIsSet(featureID);
	}

} //OsImpl
