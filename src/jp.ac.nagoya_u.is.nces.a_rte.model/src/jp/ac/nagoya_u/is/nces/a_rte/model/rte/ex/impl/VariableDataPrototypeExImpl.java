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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Prototype Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableDataPrototypeExImpl extends ExtendedEObjectImpl implements VariableDataPrototypeEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataPrototypeExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_DECLARATION_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtDeclaration(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_DECLARATION_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_START_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtStart(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_START_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_PARTITION_RESTART_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtPartitionRestart(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_PARTITION_RESTART_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum getInitializationStrategy(VariableDataPrototype this_) {
		try {
			return (RteInitializationStrategyEnum)GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionInitializationPolicy(VariableDataPrototype this_) {
		try {
			return (String)GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_ADDR_METHOD_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod(VariableDataPrototype this_) {
		try {
			return (SwAddrMethod)GET_SW_ADDR_METHOD_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE:
				return initAtDeclaration((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE:
				return initAtStart((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE:
				return initAtPartitionRestart((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE:
				return getInitializationStrategy((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE:
				return getSectionInitializationPolicy((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE:
				return getSwAddrMethod((VariableDataPrototype)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataPrototypeExImpl
