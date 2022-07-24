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
import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx;
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
 * An implementation of the model object '<em><b>Variable Data Instance In Swc Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInSwcExImpl#getAlignmentTypeEx <em>Alignment Type Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDataInstanceInSwcExImpl extends ExtendedEObjectImpl implements VariableDataInstanceInSwcEx {
	/**
	 * The cached value of the '{@link #getAlignmentTypeEx() <em>Alignment Type Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentTypeEx()
	 * @generated
	 * @ordered
	 */
	protected AlignmentTypeEx alignmentTypeEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInSwcExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentTypeEx getAlignmentTypeEx() {
		if (alignmentTypeEx != null && ((EObject)alignmentTypeEx).eIsProxy()) {
			InternalEObject oldAlignmentTypeEx = (InternalEObject)alignmentTypeEx;
			alignmentTypeEx = (AlignmentTypeEx)eResolveProxy(oldAlignmentTypeEx);
			if (alignmentTypeEx != oldAlignmentTypeEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX, oldAlignmentTypeEx, alignmentTypeEx));
			}
		}
		return alignmentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentTypeEx basicGetAlignmentTypeEx() {
		return alignmentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignmentTypeEx(AlignmentTypeEx newAlignmentTypeEx) {
		AlignmentTypeEx oldAlignmentTypeEx = alignmentTypeEx;
		alignmentTypeEx = newAlignmentTypeEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX, oldAlignmentTypeEx, alignmentTypeEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #providesInitValueConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Provides Init Value Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesInitValueConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_INIT_VALUE_CONSTANT_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean providesInitValueConstant(VariableDataInstanceInSwc this_) {
		try {
			return (Boolean)PROVIDES_INIT_VALUE_CONSTANT_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getMemoryMappingAlignment(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Memory Mapping Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMappingAlignment(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MEMORY_MAPPING_ALIGNMENT_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryMappingAlignment(VariableDataInstanceInSwc this_) {
		try {
			return (String)GET_MEMORY_MAPPING_ALIGNMENT_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX:
				if (resolve) return getAlignmentTypeEx();
				return basicGetAlignmentTypeEx();
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX:
				setAlignmentTypeEx((AlignmentTypeEx)newValue);
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX:
				setAlignmentTypeEx((AlignmentTypeEx)null);
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX__ALIGNMENT_TYPE_EX:
				return alignmentTypeEx != null;
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC:
				return providesInitValueConstant((VariableDataInstanceInSwc)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC:
				return getMemoryMappingAlignment((VariableDataInstanceInSwc)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataInstanceInSwcExImpl
