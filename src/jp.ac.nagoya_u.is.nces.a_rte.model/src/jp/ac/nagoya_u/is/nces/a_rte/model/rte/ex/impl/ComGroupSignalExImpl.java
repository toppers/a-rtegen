/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComGroupSignalEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Group Signal Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComGroupSignalExImpl extends ExtendedEObjectImpl implements ComGroupSignalEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComGroupSignalExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.COM_GROUP_SIGNAL_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationRecordElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal) <em>Get Implementation Record Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationRecordElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_RECORD_ELEMENT_COM_GROUP_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_RECORD_ELEMENT__COMGROUPSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationDataTypeElement> getImplementationRecordElement(ComGroupSignal this_) {
		try {
			return (EList<ImplementationDataTypeElement>)GET_IMPLEMENTATION_RECORD_ELEMENT_COM_GROUP_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationArrayElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal) <em>Get Implementation Array Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationArrayElement(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_ARRAY_ELEMENT_COM_GROUP_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_ARRAY_ELEMENT__COMGROUPSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationDataTypeElement> getImplementationArrayElement(ComGroupSignal this_) {
		try {
			return (EList<ImplementationDataTypeElement>)GET_IMPLEMENTATION_ARRAY_ELEMENT_COM_GROUP_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
			case ExPackage.COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_RECORD_ELEMENT__COMGROUPSIGNAL:
				return getImplementationRecordElement((ComGroupSignal)arguments.get(0));
			case ExPackage.COM_GROUP_SIGNAL_EX___GET_IMPLEMENTATION_ARRAY_ELEMENT__COMGROUPSIGNAL:
				return getImplementationArrayElement((ComGroupSignal)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComGroupSignalExImpl
