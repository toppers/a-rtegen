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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Bsw Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent <em>Rte Bsw Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping()
 * @model
 * @generated
 */
public interface RteBswEventToTaskMapping extends EcucContainer {
	/**
	 * Returns the value of the '<em><b>Rte Bsw Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Activation Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Activation Offset</em>' attribute.
	 * @see #setRteBswActivationOffset(BigDecimal)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswActivationOffset()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimeValue"
	 * @generated
	 */
	BigDecimal getRteBswActivationOffset();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Activation Offset</em>' attribute.
	 * @see #getRteBswActivationOffset()
	 * @generated
	 */
	void setRteBswActivationOffset(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Event</em>' reference.
	 * @see #setRteBswEvent(BswEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswEvent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig
	 * @model opposite="config" required="true"
	 * @generated
	 */
	BswEvent getRteBswEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent <em>Rte Bsw Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Event</em>' reference.
	 * @see #getRteBswEvent()
	 * @generated
	 */
	void setRteBswEvent(BswEvent value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Position In Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Position In Task</em>' attribute.
	 * @see #setRteBswPositionInTask(Integer)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswPositionInTask()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Integer"
	 * @generated
	 */
	Integer getRteBswPositionInTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Position In Task</em>' attribute.
	 * @see #getRteBswPositionInTask()
	 * @generated
	 */
	void setRteBswPositionInTask(Integer value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Mapped To Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent <em>Mapped Rte Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Mapped To Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Mapped To Task</em>' reference.
	 * @see #setRteBswMappedToTask(OsTask)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswMappedToTask()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent
	 * @model opposite="mappedRteBswEvent"
	 * @generated
	 */
	OsTask getRteBswMappedToTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Mapped To Task</em>' reference.
	 * @see #getRteBswMappedToTask()
	 * @generated
	 */
	void setRteBswMappedToTask(OsTask value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Used Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Used Os Alarm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Used Os Alarm</em>' reference.
	 * @see #setRteBswUsedOsAlarm(OsAlarm)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswUsedOsAlarm()
	 * @model
	 * @generated
	 */
	OsAlarm getRteBswUsedOsAlarm();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Used Os Alarm</em>' reference.
	 * @see #getRteBswUsedOsAlarm()
	 * @generated
	 */
	void setRteBswUsedOsAlarm(OsAlarm value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Used Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Used Os Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Used Os Event</em>' reference.
	 * @see #setRteBswUsedOsEvent(OsEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswUsedOsEvent()
	 * @model
	 * @generated
	 */
	OsEvent getRteBswUsedOsEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Used Os Event</em>' reference.
	 * @see #getRteBswUsedOsEvent()
	 * @generated
	 */
	void setRteBswUsedOsEvent(OsEvent value);

} // RteBswEventToTaskMapping
