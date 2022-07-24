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

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteEvent <em>Rte Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteActivationOffset <em>Rte Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteMappedToTask <em>Rte Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRtePositionInTask <em>Rte Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsAlarm <em>Rte Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsEvent <em>Rte Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping()
 * @model
 * @generated
 */
public interface RteEventToTaskMapping extends EcucContainer {
	/**
	 * Returns the value of the '<em><b>Rte Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Event</em>' reference.
	 * @see #setRteEvent(RteEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RteEvent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent#getConfig
	 * @model opposite="config" required="true"
	 * @generated
	 */
	RteEvent getRteEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteEvent <em>Rte Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Event</em>' reference.
	 * @see #getRteEvent()
	 * @generated
	 */
	void setRteEvent(RteEvent value);

	/**
	 * Returns the value of the '<em><b>Rte Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Activation Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Activation Offset</em>' attribute.
	 * @see #setRteActivationOffset(BigDecimal)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RteActivationOffset()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimeValue"
	 * @generated
	 */
	BigDecimal getRteActivationOffset();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteActivationOffset <em>Rte Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Activation Offset</em>' attribute.
	 * @see #getRteActivationOffset()
	 * @generated
	 */
	void setRteActivationOffset(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rte Mapped To Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteEvent <em>Mapped Rte Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Mapped To Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Mapped To Task</em>' reference.
	 * @see #setRteMappedToTask(OsTask)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RteMappedToTask()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteEvent
	 * @model opposite="mappedRteEvent"
	 * @generated
	 */
	OsTask getRteMappedToTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteMappedToTask <em>Rte Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Mapped To Task</em>' reference.
	 * @see #getRteMappedToTask()
	 * @generated
	 */
	void setRteMappedToTask(OsTask value);

	/**
	 * Returns the value of the '<em><b>Rte Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Position In Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Position In Task</em>' attribute.
	 * @see #setRtePositionInTask(Integer)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RtePositionInTask()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Integer"
	 * @generated
	 */
	Integer getRtePositionInTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRtePositionInTask <em>Rte Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Position In Task</em>' attribute.
	 * @see #getRtePositionInTask()
	 * @generated
	 */
	void setRtePositionInTask(Integer value);

	/**
	 * Returns the value of the '<em><b>Rte Used Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Used Os Alarm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Used Os Alarm</em>' reference.
	 * @see #setRteUsedOsAlarm(OsAlarm)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RteUsedOsAlarm()
	 * @model
	 * @generated
	 */
	OsAlarm getRteUsedOsAlarm();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsAlarm <em>Rte Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Used Os Alarm</em>' reference.
	 * @see #getRteUsedOsAlarm()
	 * @generated
	 */
	void setRteUsedOsAlarm(OsAlarm value);

	/**
	 * Returns the value of the '<em><b>Rte Used Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Used Os Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Used Os Event</em>' reference.
	 * @see #setRteUsedOsEvent(OsEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteEventToTaskMapping_RteUsedOsEvent()
	 * @model
	 * @generated
	 */
	OsEvent getRteUsedOsEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping#getRteUsedOsEvent <em>Rte Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Used Os Event</em>' reference.
	 * @see #getRteUsedOsEvent()
	 * @generated
	 */
	void setRteUsedOsEvent(OsEvent value);

} // RteEventToTaskMapping
