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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationExImpl extends ExtendedEObjectImpl implements ValueSpecificationEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VALUE_SPECIFICATION_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get End Value Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_END_VALUE_SPEC_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getEndValueSpec(ValueSpecification this_) {
		try {
			return (ValueSpecification)GET_END_VALUE_SPEC_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get Value Spec As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_VALUE_SPEC_AS_TEXT_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSpecAsText(ValueSpecification this_) {
		try {
			return (String)GET_VALUE_SPEC_AS_TEXT_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For VALUE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_VALUE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForVALUE(ValueSpecification this_) {
		try {
			return (Boolean)IS_FOR_VALUE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For ARRAY</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_ARRAY_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForARRAY(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_ARRAY_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For STRUCTURE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_STRUCTURE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForSTRUCTURE(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_STRUCTURE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For UNION</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_UNION_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForUNION(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_UNION_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For DATA REFERENCE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_DATA_REFERENCE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForDATA_REFERENCE(ValueSpecification value) {
		try {
			return (Boolean)IS_FOR_DATA_REFERENCE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{value}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALID_VALUE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidValue(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_VALID_VALUE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUALS_INIT_VALUE_VALUE_SPECIFICATION_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalsInitValue(ValueSpecification v1, ValueSpecification v2) {
		try {
			return (Boolean)EQUALS_INIT_VALUE_VALUE_SPECIFICATION_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{v1, v2}));
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
			case ExPackage.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION:
				return getEndValueSpec((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION:
				return getValueSpecAsText((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION:
				return isForVALUE((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForARRAY((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForSTRUCTURE((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForUNION((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION:
				return isForDATA_REFERENCE((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isValidValue((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION:
				return equalsInitValue((ValueSpecification)arguments.get(0), (ValueSpecification)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValueSpecificationExImpl
