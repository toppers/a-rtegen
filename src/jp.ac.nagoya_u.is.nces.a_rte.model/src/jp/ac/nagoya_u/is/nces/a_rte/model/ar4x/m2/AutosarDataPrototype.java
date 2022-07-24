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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autosar Data Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getAutosarDataPrototype()
 * @model abstract="true"
 * @generated
 */
public interface AutosarDataPrototype extends DataPrototype {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * アドレッシング方式の取得
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not self.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen self.swAddrMethod\n\t\t\t\t\telse if not implType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAddrMethod\n\t\t\t\t\telse if not applType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applType.swAddrMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not self.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen self.swAlignment\n\t\t\t\t\telse if not implType.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAlignment\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.type.oclIsKindOf(m2::ApplicationDataType)\n\t\t\t\t\tthen self.type.oclAsType(m2::ApplicationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.type.oclIsKindOf(m2::ImplementationDataType)\n\t\t\t\t\tthen self.type.oclAsType(m2::ImplementationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType();

} // AutosarDataPrototype
