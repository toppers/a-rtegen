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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionBswModuleExecution <em>Ecuc Partition Bsw Module Execution</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getPartitionCanBeRestarted <em>Partition Can Be Restarted</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionSoftwareComponent <em>Ecuc Partition Software Component</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getImplOsApplication <em>Impl Os Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getEcucPartition()
 * @model
 * @generated
 */
public interface EcucPartition extends EcucContainer {
	/**
	 * Returns the value of the '<em><b>Ecuc Partition Bsw Module Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecuc Partition Bsw Module Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecuc Partition Bsw Module Execution</em>' attribute.
	 * @see #setEcucPartitionBswModuleExecution(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getEcucPartition_EcucPartitionBswModuleExecution()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 * @generated
	 */
	Boolean getEcucPartitionBswModuleExecution();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getEcucPartitionBswModuleExecution <em>Ecuc Partition Bsw Module Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecuc Partition Bsw Module Execution</em>' attribute.
	 * @see #getEcucPartitionBswModuleExecution()
	 * @generated
	 */
	void setEcucPartitionBswModuleExecution(Boolean value);

	/**
	 * Returns the value of the '<em><b>Partition Can Be Restarted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Can Be Restarted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Can Be Restarted</em>' attribute.
	 * @see #setPartitionCanBeRestarted(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getEcucPartition_PartitionCanBeRestarted()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 * @generated
	 */
	Boolean getPartitionCanBeRestarted();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition#getPartitionCanBeRestarted <em>Partition Can Be Restarted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Can Be Restarted</em>' attribute.
	 * @see #getPartitionCanBeRestarted()
	 * @generated
	 */
	void setPartitionCanBeRestarted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ecuc Partition Software Component</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getOwnerPartition <em>Owner Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecuc Partition Software Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecuc Partition Software Component</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getEcucPartition_EcucPartitionSoftwareComponent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getOwnerPartition
	 * @model opposite="ownerPartition"
	 * @generated
	 */
	EList<SwComponentInstanceInSystem> getEcucPartitionSoftwareComponent();

	/**
	 * Returns the value of the '<em><b>Impl Os Application</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppEcucPartition <em>Os App Ecuc Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Os Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Os Application</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getEcucPartition_ImplOsApplication()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication#getOsAppEcucPartition
	 * @model opposite="osAppEcucPartition" derived="true"
	 * @generated
	 */
	EList<OsApplication> getImplOsApplication();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trusted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let osApp : OsApplication = self.implOsApplication->any(true)\n\t\t\t\t\t\t\tin if osApp.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\t\telse osApp.osTrusted\n\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean isTrusted();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Core</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let osApp : OsApplication = self.implOsApplication->any(true)\n\t\t\t\t\t\t\tin if osApp.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\t\telse osApp.osApplicationCoreAssignment\n\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	Integer getOwnerCore();

} // EcucPartition
