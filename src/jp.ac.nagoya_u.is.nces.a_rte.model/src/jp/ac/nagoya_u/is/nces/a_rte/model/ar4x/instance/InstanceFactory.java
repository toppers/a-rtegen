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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Port Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance In Composition</em>'.
	 * @generated
	 */
	PortInstanceInComposition createPortInstanceInComposition();

	/**
	 * Returns a new object of class '<em>Variable Data Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Instance In Composition</em>'.
	 * @generated
	 */
	VariableDataInstanceInComposition createVariableDataInstanceInComposition();

	/**
	 * Returns a new object of class '<em>PVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVariable Data Instance In Swc</em>'.
	 * @generated
	 */
	PVariableDataInstanceInSwc createPVariableDataInstanceInSwc();

	/**
	 * Returns a new object of class '<em>RVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RVariable Data Instance In Swc</em>'.
	 * @generated
	 */
	RVariableDataInstanceInSwc createRVariableDataInstanceInSwc();

	/**
	 * Returns a new object of class '<em>Assembly Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Data Instance Connector</em>'.
	 * @generated
	 */
	AssemblyDataInstanceConnector createAssemblyDataInstanceConnector();

	/**
	 * Returns a new object of class '<em>Delegation Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Data Instance Connector</em>'.
	 * @generated
	 */
	DelegationDataInstanceConnector createDelegationDataInstanceConnector();

	/**
	 * Returns a new object of class '<em>ROperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROperation Instance In Swc</em>'.
	 * @generated
	 */
	ROperationInstanceInSwc createROperationInstanceInSwc();

	/**
	 * Returns a new object of class '<em>POperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POperation Instance In Swc</em>'.
	 * @generated
	 */
	POperationInstanceInSwc createPOperationInstanceInSwc();

	/**
	 * Returns a new object of class '<em>Operation Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Instance In Composition</em>'.
	 * @generated
	 */
	OperationInstanceInComposition createOperationInstanceInComposition();

	/**
	 * Returns a new object of class '<em>Assembly Operation Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Operation Instance Connector</em>'.
	 * @generated
	 */
	AssemblyOperationInstanceConnector createAssemblyOperationInstanceConnector();

	/**
	 * Returns a new object of class '<em>Sw Component Instance In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Component Instance In System</em>'.
	 * @generated
	 */
	SwComponentInstanceInSystem createSwComponentInstanceInSystem();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	InstanceRoot createInstanceRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancePackage getInstancePackage();

} //InstanceFactory
