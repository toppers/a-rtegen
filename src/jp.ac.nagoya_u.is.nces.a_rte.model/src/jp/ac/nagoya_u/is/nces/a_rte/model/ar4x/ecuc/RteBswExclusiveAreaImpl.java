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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Bsw Exclusive Area Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveArea <em>Rte Bsw Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsResource <em>Rte Bsw Exclusive Area Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsSpinlock <em>Rte Bsw Exclusive Area Os Spinlock</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswExclusiveAreaImpl()
 * @model
 * @generated
 */
public interface RteBswExclusiveAreaImpl extends EcucContainer {
	/**
	 * Returns the value of the '<em><b>Rte Bsw Exclusive Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getBswConfig <em>Bsw Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Exclusive Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Exclusive Area</em>' reference.
	 * @see #setRteBswExclusiveArea(ExclusiveArea)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswExclusiveAreaImpl_RteBswExclusiveArea()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getBswConfig
	 * @model opposite="bswConfig" required="true"
	 * @generated
	 */
	ExclusiveArea getRteBswExclusiveArea();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveArea <em>Rte Bsw Exclusive Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Exclusive Area</em>' reference.
	 * @see #getRteBswExclusiveArea()
	 * @generated
	 */
	void setRteBswExclusiveArea(ExclusiveArea value);

	/**
	 * Returns the value of the '<em><b>Rte Exclusive Area Impl Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Exclusive Area Impl Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Exclusive Area Impl Mechanism</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum
	 * @see #setRteExclusiveAreaImplMechanism(RteExclusiveAreaImplMechanismEnum)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswExclusiveAreaImpl_RteExclusiveAreaImplMechanism()
	 * @model
	 * @generated
	 */
	RteExclusiveAreaImplMechanismEnum getRteExclusiveAreaImplMechanism();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Exclusive Area Impl Mechanism</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum
	 * @see #getRteExclusiveAreaImplMechanism()
	 * @generated
	 */
	void setRteExclusiveAreaImplMechanism(RteExclusiveAreaImplMechanismEnum value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Exclusive Area Os Spinlock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Exclusive Area Os Spinlock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Exclusive Area Os Spinlock</em>' reference.
	 * @see #setRteBswExclusiveAreaOsSpinlock(OsSpinlock)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsSpinlock()
	 * @model
	 * @generated
	 */
	OsSpinlock getRteBswExclusiveAreaOsSpinlock();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsSpinlock <em>Rte Bsw Exclusive Area Os Spinlock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Exclusive Area Os Spinlock</em>' reference.
	 * @see #getRteBswExclusiveAreaOsSpinlock()
	 * @generated
	 */
	void setRteBswExclusiveAreaOsSpinlock(OsSpinlock value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Exclusive Area Os Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Exclusive Area Os Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Exclusive Area Os Resource</em>' reference.
	 * @see #setRteBswExclusiveAreaOsResource(OsResource)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswExclusiveAreaImpl_RteBswExclusiveAreaOsResource()
	 * @model
	 * @generated
	 */
	OsResource getRteBswExclusiveAreaOsResource();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl#getRteBswExclusiveAreaOsResource <em>Rte Bsw Exclusive Area Os Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Exclusive Area Os Resource</em>' reference.
	 * @see #getRteBswExclusiveAreaOsResource()
	 * @generated
	 */
	void setRteBswExclusiveAreaOsResource(OsResource value);

} // RteBswExclusiveAreaImpl
