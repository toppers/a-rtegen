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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Data Def Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getInvalidValue <em>Invalid Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwImplPolicy <em>Sw Impl Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwAlignment <em>Sw Alignment</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getCompuMethod <em>Compu Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getDataConstr <em>Data Constr</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwPointerTargetProps <em>Sw Pointer Target Props</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwDataDefPropsImpl extends M2ObjectImpl implements SwDataDefProps {
	/**
	 * The cached value of the '{@link #getInvalidValue() <em>Invalid Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification invalidValue;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected SwBaseType baseType;
	/**
	 * The default value of the '{@link #getSwImplPolicy() <em>Sw Impl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SwImplPolicyEnum SW_IMPL_POLICY_EDEFAULT = SwImplPolicyEnum.UNSPECIFIED;
	/**
	 * The cached value of the '{@link #getSwImplPolicy() <em>Sw Impl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected SwImplPolicyEnum swImplPolicy = SW_IMPL_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected SwAddrMethod swAddrMethod;

	/**
	 * The default value of the '{@link #getSwAlignment() <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwAlignment() <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected String swAlignment = SW_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompuMethod() <em>Compu Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuMethod()
	 * @generated
	 * @ordered
	 */
	protected CompuMethod compuMethod;

	/**
	 * The cached value of the '{@link #getDataConstr() <em>Data Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConstr()
	 * @generated
	 * @ordered
	 */
	protected DataConstr dataConstr;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType implementationDataType;

	/**
	 * The cached value of the '{@link #getSwPointerTargetProps() <em>Sw Pointer Target Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwPointerTargetProps()
	 * @generated
	 * @ordered
	 */
	protected SwPointerTargetProps swPointerTargetProps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwDataDefPropsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_DATA_DEF_PROPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInvalidValue() {
		return invalidValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvalidValue(ValueSpecification newInvalidValue, NotificationChain msgs) {
		ValueSpecification oldInvalidValue = invalidValue;
		invalidValue = newInvalidValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, oldInvalidValue, newInvalidValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidValue(ValueSpecification newInvalidValue) {
		if (newInvalidValue != invalidValue) {
			NotificationChain msgs = null;
			if (invalidValue != null)
				msgs = ((InternalEObject)invalidValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, null, msgs);
			if (newInvalidValue != null)
				msgs = ((InternalEObject)newInvalidValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, null, msgs);
			msgs = basicSetInvalidValue(newInvalidValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, newInvalidValue, newInvalidValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType getBaseType() {
		if (baseType != null && ((EObject)baseType).eIsProxy()) {
			InternalEObject oldBaseType = (InternalEObject)baseType;
			baseType = (SwBaseType)eResolveProxy(oldBaseType);
			if (baseType != oldBaseType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__BASE_TYPE, oldBaseType, baseType));
			}
		}
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType basicGetBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(SwBaseType newBaseType) {
		SwBaseType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum getSwImplPolicy() {
		return swImplPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwImplPolicy(SwImplPolicyEnum newSwImplPolicy) {
		SwImplPolicyEnum oldSwImplPolicy = swImplPolicy;
		swImplPolicy = newSwImplPolicy == null ? SW_IMPL_POLICY_EDEFAULT : newSwImplPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY, oldSwImplPolicy, swImplPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		if (swAddrMethod != null && ((EObject)swAddrMethod).eIsProxy()) {
			InternalEObject oldSwAddrMethod = (InternalEObject)swAddrMethod;
			swAddrMethod = (SwAddrMethod)eResolveProxy(oldSwAddrMethod);
			if (swAddrMethod != oldSwAddrMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
			}
		}
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod basicGetSwAddrMethod() {
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAddrMethod(SwAddrMethod newSwAddrMethod) {
		SwAddrMethod oldSwAddrMethod = swAddrMethod;
		swAddrMethod = newSwAddrMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwAlignment() {
		return swAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAlignment(String newSwAlignment) {
		String oldSwAlignment = swAlignment;
		swAlignment = newSwAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT, oldSwAlignment, swAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod getCompuMethod() {
		if (compuMethod != null && ((EObject)compuMethod).eIsProxy()) {
			InternalEObject oldCompuMethod = (InternalEObject)compuMethod;
			compuMethod = (CompuMethod)eResolveProxy(oldCompuMethod);
			if (compuMethod != oldCompuMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD, oldCompuMethod, compuMethod));
			}
		}
		return compuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod basicGetCompuMethod() {
		return compuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompuMethod(CompuMethod newCompuMethod) {
		CompuMethod oldCompuMethod = compuMethod;
		compuMethod = newCompuMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD, oldCompuMethod, compuMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr getDataConstr() {
		if (dataConstr != null && ((EObject)dataConstr).eIsProxy()) {
			InternalEObject oldDataConstr = (InternalEObject)dataConstr;
			dataConstr = (DataConstr)eResolveProxy(oldDataConstr);
			if (dataConstr != oldDataConstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR, oldDataConstr, dataConstr));
			}
		}
		return dataConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr basicGetDataConstr() {
		return dataConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataConstr(DataConstr newDataConstr) {
		DataConstr oldDataConstr = dataConstr;
		dataConstr = newDataConstr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR, oldDataConstr, dataConstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType() {
		if (implementationDataType != null && ((EObject)implementationDataType).eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (ImplementationDataType)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(ImplementationDataType newImplementationDataType) {
		ImplementationDataType oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwPointerTargetProps getSwPointerTargetProps() {
		return swPointerTargetProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwPointerTargetProps(SwPointerTargetProps newSwPointerTargetProps, NotificationChain msgs) {
		SwPointerTargetProps oldSwPointerTargetProps = swPointerTargetProps;
		swPointerTargetProps = newSwPointerTargetProps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS, oldSwPointerTargetProps, newSwPointerTargetProps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwPointerTargetProps(SwPointerTargetProps newSwPointerTargetProps) {
		if (newSwPointerTargetProps != swPointerTargetProps) {
			NotificationChain msgs = null;
			if (swPointerTargetProps != null)
				msgs = ((InternalEObject)swPointerTargetProps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS, null, msgs);
			if (newSwPointerTargetProps != null)
				msgs = ((InternalEObject)newSwPointerTargetProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS, null, msgs);
			msgs = basicSetSwPointerTargetProps(newSwPointerTargetProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS, newSwPointerTargetProps, newSwPointerTargetProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return basicSetInvalidValue(null, msgs);
			case M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS:
				return basicSetSwPointerTargetProps(null, msgs);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return getInvalidValue();
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				if (resolve) return getBaseType();
				return basicGetBaseType();
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				return getSwImplPolicy();
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				if (resolve) return getSwAddrMethod();
				return basicGetSwAddrMethod();
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				return getSwAlignment();
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				if (resolve) return getCompuMethod();
				return basicGetCompuMethod();
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				if (resolve) return getDataConstr();
				return basicGetDataConstr();
			case M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
			case M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS:
				return getSwPointerTargetProps();
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				setInvalidValue((ValueSpecification)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				setBaseType((SwBaseType)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				setSwImplPolicy((SwImplPolicyEnum)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				setSwAlignment((String)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				setCompuMethod((CompuMethod)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				setDataConstr((DataConstr)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS:
				setSwPointerTargetProps((SwPointerTargetProps)newValue);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				setInvalidValue((ValueSpecification)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				setBaseType((SwBaseType)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				setSwImplPolicy(SW_IMPL_POLICY_EDEFAULT);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				setSwAlignment(SW_ALIGNMENT_EDEFAULT);
				return;
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				setCompuMethod((CompuMethod)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				setDataConstr((DataConstr)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS:
				setSwPointerTargetProps((SwPointerTargetProps)null);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return invalidValue != null;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				return baseType != null;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				return swImplPolicy != SW_IMPL_POLICY_EDEFAULT;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				return swAddrMethod != null;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				return SW_ALIGNMENT_EDEFAULT == null ? swAlignment != null : !SW_ALIGNMENT_EDEFAULT.equals(swAlignment);
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				return compuMethod != null;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				return dataConstr != null;
			case M2Package.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
			case M2Package.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS:
				return swPointerTargetProps != null;
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
		result.append(" (swImplPolicy: ");
		result.append(swImplPolicy);
		result.append(", swAlignment: ");
		result.append(swAlignment);
		result.append(')');
		return result.toString();
	}

} //SwDataDefPropsImpl
