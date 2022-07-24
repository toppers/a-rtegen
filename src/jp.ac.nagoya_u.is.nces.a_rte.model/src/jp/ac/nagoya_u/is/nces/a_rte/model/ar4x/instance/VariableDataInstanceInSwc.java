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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort <em>Context Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc()
 * @model abstract="true"
 * @generated
 */
public interface VariableDataInstanceInSwc extends VariableDataInstance {
	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(VariableDataPrototype)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_Prototype()
	 * @model required="true"
	 * @generated
	 */
	VariableDataPrototype getPrototype();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(VariableDataPrototype value);

	/**
	 * Returns the value of the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Port</em>' reference.
	 * @see #setContextPort(PortPrototype)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_ContextPort()
	 * @model required="true"
	 * @generated
	 */
	PortPrototype getContextPort();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort <em>Context Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Port</em>' reference.
	 * @see #getContextPort()
	 * @generated
	 */
	void setContextPort(PortPrototype value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_Instance()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype
	 * @model opposite="prototype" derived="true"
	 * @generated
	 */
	EList<VariableDataInstanceInComposition> getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifier" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.prototype.shortName'"
	 * @generated
	 */
	String getTargetShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * イベントセマンティクスかどうか
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getSwImplPolicy() = m2::SwImplPolicyEnum::queued'"
	 * @generated
	 */
	boolean isEventSemantics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ソフトウェア実装方式の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.getSwImplPolicy().oclIsUndefined() and applType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen applType.getSwImplPolicy()\n\t\t\t\t\telse if not implType.getSwImplPolicy().oclIsUndefined() and implType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen implType.getSwImplPolicy()\n\t\t\t\t\telse self.prototype.getSwImplPolicy()\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	SwImplPolicyEnum getSwImplPolicy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ベース型の習得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not implType.baseType.oclIsUndefined()\n\t\t\t\t\t\tthen implType.baseType\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwBaseType getBaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 無効値の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen applType.invalidValue\n\t\t\t\t\telse if not implType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen implType.invalidValue\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	ValueSpecification getInvalidValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アドレッシング方式の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not self.prototype.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAddrMethod\n\t\t\t\t\telse if not implType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAddrMethod\n\t\t\t\t\telse if not implType.getLeafImplementationDataType().swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.getLeafImplementationDataType().swAddrMethod\n\t\t\t\t\telse if not applType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applType.swAddrMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif endif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アラインメントの取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AlignmentType" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not self.prototype.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAlignment\n\t\t\t\t\telse if not implType.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAlignment\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	String getSwAlignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アプリケーションデータ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.prototype.type.oclIsKindOf(m2::ApplicationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ApplicationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ApplicationDataType getApplicationDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 実装データ型の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.prototype.type.oclIsKindOf(m2::ImplementationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ImplementationDataType)\n\t\t\t\t\telse\n\t\t\t\t\t\tgetOwnerAtomicSwc().getImplementationDataType(self.prototype.type.oclAsType(m2::ApplicationPrimitiveDataType))\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アトミックSW-Cの取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.contextPort.parent.oclAsType(m2::AtomicSwComponentType)'"
	 * @generated
	 */
	AtomicSwComponentType getOwnerAtomicSwc();

} // VariableDataInstanceInSwc
