/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Group Signal Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getComGroupSignalEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ComGroupSignalEx extends ExtendedEObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let systemSignal : ar4x::m2::SystemSignal = this_.comSystemTemplateSystemSignal.iSignal.systemSignal\n\t\t\t\tin if systemSignal.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderRecRecordElementMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.systemSignal = systemSignal)\n\t\t\t\t\t\t->collect(m | m.implementationRecordElement)\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<ImplementationDataTypeElement> getImplementationRecordElement(ComGroupSignal this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let systemSignal : ar4x::m2::SystemSignal = this_.comSystemTemplateSystemSignal.iSignal.systemSignal\n\t\t\t\tin if systemSignal.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderRecArrayElementMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.systemSignal = systemSignal)\n\t\t\t\t\t\t->collect(m | m.indexedArrayElement.implementationArrayElement)\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<ImplementationDataTypeElement> getImplementationArrayElement(ComGroupSignal this_);

} // ComGroupSignalEx
