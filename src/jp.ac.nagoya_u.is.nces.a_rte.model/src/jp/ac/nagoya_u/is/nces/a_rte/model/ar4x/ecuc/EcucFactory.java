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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage
 * @generated
 */
public interface EcucFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcucFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte</em>'.
	 * @generated
	 */
	Rte createRte();

	/**
	 * Returns a new object of class '<em>Rte Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Generation</em>'.
	 * @generated
	 */
	RteGeneration createRteGeneration();

	/**
	 * Returns a new object of class '<em>Rte Bsw General</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw General</em>'.
	 * @generated
	 */
	RteBswGeneral createRteBswGeneral();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	EcucRoot createEcucRoot();

	/**
	 * Returns a new object of class '<em>Rte Sw Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Sw Component Instance</em>'.
	 * @generated
	 */
	RteSwComponentInstance createRteSwComponentInstance();

	/**
	 * Returns a new object of class '<em>Rte Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Event To Task Mapping</em>'.
	 * @generated
	 */
	RteEventToTaskMapping createRteEventToTaskMapping();

	/**
	 * Returns a new object of class '<em>Os</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os</em>'.
	 * @generated
	 */
	Os createOs();

	/**
	 * Returns a new object of class '<em>Os Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task</em>'.
	 * @generated
	 */
	OsTask createOsTask();

	/**
	 * Returns a new object of class '<em>Rte Exclusive Area Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Exclusive Area Implementation</em>'.
	 * @generated
	 */
	RteExclusiveAreaImplementation createRteExclusiveAreaImplementation();

	/**
	 * Returns a new object of class '<em>Os Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event</em>'.
	 * @generated
	 */
	OsEvent createOsEvent();

	/**
	 * Returns a new object of class '<em>Com</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com</em>'.
	 * @generated
	 */
	Com createCom();

	/**
	 * Returns a new object of class '<em>Com Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Config</em>'.
	 * @generated
	 */
	ComConfig createComConfig();

	/**
	 * Returns a new object of class '<em>Com Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal</em>'.
	 * @generated
	 */
	ComSignal createComSignal();

	/**
	 * Returns a new object of class '<em>Com Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Group</em>'.
	 * @generated
	 */
	ComSignalGroup createComSignalGroup();

	/**
	 * Returns a new object of class '<em>Com Group Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Group Signal</em>'.
	 * @generated
	 */
	ComGroupSignal createComGroupSignal();

	/**
	 * Returns a new object of class '<em>Os Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Alarm</em>'.
	 * @generated
	 */
	OsAlarm createOsAlarm();

	/**
	 * Returns a new object of class '<em>Os Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Resource</em>'.
	 * @generated
	 */
	OsResource createOsResource();

	/**
	 * Returns a new object of class '<em>Os Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Application</em>'.
	 * @generated
	 */
	OsApplication createOsApplication();

	/**
	 * Returns a new object of class '<em>Ecu C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecu C</em>'.
	 * @generated
	 */
	EcuC createEcuC();

	/**
	 * Returns a new object of class '<em>Partition Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Collection</em>'.
	 * @generated
	 */
	EcucPartitionCollection createEcucPartitionCollection();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	EcucPartition createEcucPartition();

	/**
	 * Returns a new object of class '<em>Os Spinlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Spinlock</em>'.
	 * @generated
	 */
	OsSpinlock createOsSpinlock();

	/**
	 * Returns a new object of class '<em>Rte Os Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Os Interaction</em>'.
	 * @generated
	 */
	RteOsInteraction createRteOsInteraction();

	/**
	 * Returns a new object of class '<em>Rte Used Os Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Used Os Activation</em>'.
	 * @generated
	 */
	RteUsedOsActivation createRteUsedOsActivation();

	/**
	 * Returns a new object of class '<em>Rte Initialization Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Initialization Behavior</em>'.
	 * @generated
	 */
	RteInitializationBehavior createRteInitializationBehavior();

	/**
	 * Returns a new object of class '<em>Os Ioc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc</em>'.
	 * @generated
	 */
	OsIoc createOsIoc();

	/**
	 * Returns a new object of class '<em>Os Ioc Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Communication</em>'.
	 * @generated
	 */
	OsIocCommunication createOsIocCommunication();

	/**
	 * Returns a new object of class '<em>Os Ioc Sender Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Sender Properties</em>'.
	 * @generated
	 */
	OsIocSenderProperties createOsIocSenderProperties();

	/**
	 * Returns a new object of class '<em>Os Ioc Receiver Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Receiver Properties</em>'.
	 * @generated
	 */
	OsIocReceiverProperties createOsIocReceiverProperties();

	/**
	 * Returns a new object of class '<em>Os Ioc Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Data Properties</em>'.
	 * @generated
	 */
	OsIocDataProperties createOsIocDataProperties();

	/**
	 * Returns a new object of class '<em>Os Application Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Application Trusted Function</em>'.
	 * @generated
	 */
	OsApplicationTrustedFunction createOsApplicationTrustedFunction();

	/**
	 * Returns a new object of class '<em>Os OS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os OS</em>'.
	 * @generated
	 */
	OsOS createOsOS();

	/**
	 * Returns a new object of class '<em>Rte Bsw Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Event To Task Mapping</em>'.
	 * @generated
	 */
	RteBswEventToTaskMapping createRteBswEventToTaskMapping();

	/**
	 * Returns a new object of class '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Required Mode Group Connection</em>'.
	 * @generated
	 */
	RteBswRequiredModeGroupConnection createRteBswRequiredModeGroupConnection();

	/**
	 * Returns a new object of class '<em>Rte Bsw Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Module Instance</em>'.
	 * @generated
	 */
	RteBswModuleInstance createRteBswModuleInstance();

	/**
	 * Returns a new object of class '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * @generated
	 */
	RteBswExclusiveAreaImpl createRteBswExclusiveAreaImpl();

	/**
	 * Returns a new object of class '<em>Os System Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os System Cycle</em>'.
	 * @generated
	 */
	OsSystemCycle createOsSystemCycle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcucPackage getEcucPackage();

} //EcucFactory
