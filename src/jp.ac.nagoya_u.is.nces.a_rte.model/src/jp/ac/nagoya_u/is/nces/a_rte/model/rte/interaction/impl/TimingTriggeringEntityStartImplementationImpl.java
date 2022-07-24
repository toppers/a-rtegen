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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import java.lang.reflect.InvocationTargetException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Triggering Entity Start Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl#getCyclePeriod <em>Cycle Period</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl#getStartOffset <em>Start Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingTriggeringEntityStartImplementationImpl extends EntityStartImplementationImpl implements TimingTriggeringEntityStartImplementation {
	/**
	 * The default value of the '{@link #getCyclePeriod() <em>Cycle Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CYCLE_PERIOD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCyclePeriod() <em>Cycle Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclePeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer cyclePeriod = CYCLE_PERIOD_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_OFFSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer startOffset = START_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingTriggeringEntityStartImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCyclePeriod() {
		return cyclePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclePeriod(Integer newCyclePeriod) {
		Integer oldCyclePeriod = cyclePeriod;
		cyclePeriod = newCyclePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD, oldCyclePeriod, cyclePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCycleOffset() {
		try {
			return (Integer)GET_CYCLE_OFFSET__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Integer getStartOffset() {
		return startOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffset(Integer newStartOffset) {
		Integer oldStartOffset = startOffset;
		startOffset = newStartOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET, oldStartOffset, startOffset));
	}

	/**
	 * The cached invocation delegate for the '{@link #getCycleOffset() <em>Get Cycle Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleOffset()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CYCLE_OFFSET__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET).getInvocationDelegate();
	/**
	 * The cached invocation delegate for the '{@link #requiresCycleAdjust() <em>Requires Cycle Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresCycleAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_CYCLE_ADJUST__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean requiresCycleAdjust() {
		try {
			return (Boolean)REQUIRES_CYCLE_ADJUST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #requiresStartOffsetAdjust() <em>Requires Start Offset Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresStartOffsetAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_START_OFFSET_ADJUST__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean requiresStartOffsetAdjust() {
		try {
			return (Boolean)REQUIRES_START_OFFSET_ADJUST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				return getCyclePeriod();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				return getStartOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				setCyclePeriod((Integer)newValue);
				return;
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				setStartOffset((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				setCyclePeriod(CYCLE_PERIOD_EDEFAULT);
				return;
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				setStartOffset(START_OFFSET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				return CYCLE_PERIOD_EDEFAULT == null ? cyclePeriod != null : !CYCLE_PERIOD_EDEFAULT.equals(cyclePeriod);
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				return START_OFFSET_EDEFAULT == null ? startOffset != null : !START_OFFSET_EDEFAULT.equals(startOffset);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET:
				return getCycleOffset();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST:
				return requiresCycleAdjust();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST:
				return requiresStartOffsetAdjust();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cyclePeriod: ");
		result.append(cyclePeriod);
		result.append(", startOffset: ");
		result.append(startOffset);
		result.append(')');
		return result.toString();
	}

} //TimingTriggeringEntityStartImplementationImpl
