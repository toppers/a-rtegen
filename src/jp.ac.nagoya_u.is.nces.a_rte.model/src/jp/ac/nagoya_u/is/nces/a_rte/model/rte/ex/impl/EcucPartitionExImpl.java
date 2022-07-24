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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecuc Partition Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcucPartitionExImpl extends ExtendedEObjectImpl implements EcucPartitionEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucPartitionExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.ECUC_PARTITION_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #isInMasterCore(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Is In Master Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInMasterCore(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_IN_MASTER_CORE_ECUC_PARTITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInMasterCore(EcucPartition this_) {
		try {
			return (Boolean)IS_IN_MASTER_CORE_ECUC_PARTITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isMasterBswPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Is Master Bsw Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMasterBswPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MASTER_BSW_PARTITION_ECUC_PARTITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMasterBswPartition(EcucPartition this_) {
		try {
			return (Boolean)IS_MASTER_BSW_PARTITION_ECUC_PARTITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesRestartPartitionApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Provides Restart Partition Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesRestartPartitionApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_RESTART_PARTITION_API_ECUC_PARTITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean providesRestartPartitionApi(EcucPartition this_) {
		try {
			return (Boolean)PROVIDES_RESTART_PARTITION_API_ECUC_PARTITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesPartitionRestartingApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition) <em>Provides Partition Restarting Api</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesPartitionRestartingApi(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_PARTITION_RESTARTING_API_ECUC_PARTITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean providesPartitionRestartingApi(EcucPartition this_) {
		try {
			return (Boolean)PROVIDES_PARTITION_RESTARTING_API_ECUC_PARTITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION:
				return isInMasterCore((EcucPartition)arguments.get(0));
			case ExPackage.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION:
				return isMasterBswPartition((EcucPartition)arguments.get(0));
			case ExPackage.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION:
				return providesRestartPartitionApi((EcucPartition)arguments.get(0));
			case ExPackage.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION:
				return providesPartitionRestartingApi((EcucPartition)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EcucPartitionExImpl
