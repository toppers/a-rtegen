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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__ROLE_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PRIMITIVE_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.MaxValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;

/**
 * モジュールモデル変換で生成したモデルを検索する。
 */
public class BuiltModuleModelQuery {

	private final ModelQuery query;
	private final ModuleModelBuildCache cache;

	public BuiltModuleModelQuery(ModelQuery query, ModuleModelBuildCache cache) {
		this.query = query;
		this.cache = cache;
	}

	public PrimitiveType getAppropriateUintTypeForRange(int maxValue) {
		if (maxValue <= MaxValues.UINT8_MAX) {
			return this.cache.uint8Type;
		} else if (maxValue <= MaxValues.UINT16_MAX) {
			return this.cache.uint16Type;
		} else {
			return this.cache.uint32Type;
		}
	}

	/**
	 * EcucPartitionに対応するPartitionを検索する。
	 * 引数にnull(検索元のパーティションなし)を指定した場合、デフォルトのパーティション(マスタコアのBSWM配置パーティション)を返す。
	 * @param sourcePartition 検索元のEcucPartition
	 * @return EcucPartitionに対応するPartition。引数にnullを指定した場合、デフォルト(マスタコアのBSWM配置パーティション)のPartition。
	 * @throws ModelException EcucPartitionに対応するPartitionが見つからない場合
	 */
	public Partition findDestPartition(EcucPartition sourcePartition) throws ModelException {
		return findDestPartition(Optional.fromNullable(sourcePartition));
	}

	/**
	 * EcucPartitionに対応するPartitionを検索する。
	 * 引数にOptional.absent()(検索元のパーティションなし)を指定した場合、デフォルトのパーティション(マスタコアのBSWM配置パーティション)を返す。
	 * @param sourcePartition 検索元のEcucPartition
	 * @return EcucPartitionに対応するPartition。引数にOptional.absent()を指定した場合、デフォルト(マスタコアのBSWM配置パーティション)のPartition。
	 * @throws ModelException EcucPartitionに対応するPartitionが見つからない場合
	 */
	public Partition findDestPartition(Optional<EcucPartition> sourcePartition) throws ModelException {
		return !sourcePartition.isPresent() ? this.cache.masterBswPartition : this.<Partition> findDest(PARTITION, sourcePartition.get());
	}

	/**
	 * EcucPartitionに対応するPartitionを検索する。
	 * 引数にnull(検索元のパーティションなし)を指定した場合、デフォルトのパーティション(マスタコアのBSWM配置パーティション)を返す。
	 * @param partition 検索元のEcucPartition
	 * @return EcucPartitionに対応するPartition。引数にnullを指定した場合、デフォルト(マスタコアのBSWM配置パーティション)のPartition。
	 */
	public Optional<Partition> tryFindDestPartition(EcucPartition partition) {
		// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		// 現在使用していないメソッド
		return partition == null ? Optional.of(this.cache.masterBswPartition) : this.<Partition> tryFindDest(PARTITION, partition);
	}

	public Type findDestType(ImplementationDataType sourceImplementationDataType) throws ModelException {
		return findDest(TYPE, sourceImplementationDataType);
	}

	public PrimitiveType findDestPrimitiveType(ImplementationDataType sourceImplementationDataType) throws ModelException {
		return findDest(PRIMITIVE_TYPE, sourceImplementationDataType);
	}

	public <T extends EObject> List<T> findDests(final EClass kind, EList<? extends EObject> sources) throws ModelException {
		final List<ModelException> caughtExceptions = Lists.newArrayList();

		List<T> collected = Lists.transform(sources, new Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				try {
					return findDest(kind, input);
				} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					caughtExceptions.add(e);
					return null;
				}
			}
		});

		if (!caughtExceptions.isEmpty()) {// COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			throw caughtExceptions.get(0);
		}

		return collected;
	}

	public <T extends EObject> T findDest(EClass kind, EObject source) throws ModelException {
		return this.query.findSingle(isKindOf(kind).AND(ref(MODULE_OBJECT__SOURCE, source)));
	}

	public <T extends EObject> T findDest(EClass kind, EObject source, String roleName) throws ModelException {
		return this.query.findSingle(isKindOf(kind).AND(ref(MODULE_OBJECT__SOURCE, source)).AND(hasAttr(MODULE_OBJECT__ROLE_NAME, roleName)));
	}

	public <T extends EObject> Optional<T> tryFindDest(EClass kind, EObject source) {
		return this.query.tryFindSingle(isKindOf(kind).AND(ref(MODULE_OBJECT__SOURCE, source)));
	}

	public <T extends EObject> T selectDest(Collection<T> dests, EObject source) throws ModelException {
		return this.query.selectSingle(dests, ref(MODULE_OBJECT__SOURCE, source));
	}

	public <T extends EObject> Optional<T> trySelectDest(Collection<T> dests, EObject source) {
		return this.query.trySelectSingle(dests, ref(MODULE_OBJECT__SOURCE, source));
	}

	public <T extends EObject> List<T> selectDests(Collection<T> dests, EObject source) {
		return this.query.select(dests, ref(MODULE_OBJECT__SOURCE, source));
	}
}
