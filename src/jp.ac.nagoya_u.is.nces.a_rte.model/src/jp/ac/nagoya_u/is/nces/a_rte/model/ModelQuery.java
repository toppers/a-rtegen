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
package jp.ac.nagoya_u.is.nces.a_rte.model;

import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfQueryUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;

/**
 *　モデルオブジェクトを検索する。
 */
public class ModelQuery {

	private final Resource eResource;

	/**
	 * @param eResource 検索対象のリソース
	 */
	public ModelQuery(Resource eResource) {
		this.eResource = eResource;
	}

	/**
	 * EObjectに対し，拡張オペレーションを実行し，結果を取得する．
	 * 
	 * @param eObject 拡張オペレーションの実行対象のオブジェクト
	 * @param eOperation 拡張オペレーション
	 * @return 拡張オペレーションの実行結果の返り値.
	 * @throws ModelException 拡張オペレーションの実行に失敗した場合
	 */
	public <T> T get(EObject eObject, EOperation eOperation) throws ModelException {
		return EmfUtils.exInvoke(eObject, eOperation);
	}

	/**
	 * EObjectに対し，拡張オペレーションを実行し，結果を取得する．
	 * 
	 * @param eObject 拡張オペレーションの実行対象のオブジェクト
	 * @param eOperation 拡張オペレーション
	 * @param arguments 拡張オペレーションに渡す引数の配列
	 * @return 拡張オペレーションの実行結果の返り値.
	 * @throws ModelException 拡張オペレーションの実行に失敗した場合
	 */
	public <T> T get(EObject eObject, EOperation eOperation, Object... arguments) throws ModelException {
		return EmfUtils.exInvoke(eObject, eOperation, arguments);
	}

	/**
	 * リソース内に存在する全オブジェクトから，型の一致する単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eClass 検索対象の型
	 * @return 見つかったオブジェクト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public <T extends EObject> T findSingleByKind(EClass eClass) throws ModelException {
		return EmfQueryUtils.findSingle(this.eResource, isKindOf(eClass));
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public <T extends EObject> T findSingle(EObject eObject, EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.findSingle(eObject, eCondition); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public <T extends EObject> T findSingle(EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.findSingle(this.eResource, eCondition);
	}

	/**
	 * リソース内に存在する全オブジェクトから，型の一致する単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eClass 検索対象の型
	 * @return 見つかったオブジェクト．
	 */
	public <T extends EObject> Optional<T> tryFindSingleByKind(EClass eClass) {
		return EmfQueryUtils.tryFindSingle(this.eResource, isKindOf(eClass));
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 */
	public <T extends EObject> Optional<T> tryFindSingle(EObjectCondition eCondition) {
		return EmfQueryUtils.tryFindSingle(this.eResource, eCondition);
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 */
	public <T extends EObject> Optional<T> tryFindSingle(EObject eObject, EObjectCondition eCondition) {
		return EmfQueryUtils.tryFindSingle(eObject, eCondition);
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，型の一致する複数のオブジェクトを検索する．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eClass 検索対象の型
	 * @return 見つかったオブジェクトのリスト．
	 */
	public <T extends EObject> List<T> findByKind(EObject eObject, EClass eClass) {
		return EmfQueryUtils.find(eObject, isKindOf(eClass));
	}

	/**
	 * リソース内に存在する全オブジェクトから，型の一致する複数のオブジェクトを検索する．
	 * 
	 * @param eClass 検索対象の型
	 * @return 見つかったオブジェクトのリスト．
	 */
	public <T extends EObject> List<T> findByKind(EClass eClass) {
		return EmfQueryUtils.find(this.eResource, isKindOf(eClass));
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる複数のオブジェクトを検索する．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクトのリスト．
	 */
	public <T extends EObject> List<T> find(EObject eObject, EObjectCondition eCondition) {
		return EmfQueryUtils.find(eObject, eCondition);
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる複数のオブジェクトを検索する．
	 * 
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクトのリスト．
	 */
	public <T extends EObject> List<T> find(EObjectCondition eCondition) {
		return EmfQueryUtils.find(this.eResource, eCondition);
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる単一のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public <F extends EObject, T extends F> T selectSingle(Collection<F> eObjects, EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.selectSingle(eObjects, eCondition);
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる単一のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクト．
	 */
	public <F extends EObject, T extends F> Optional<T> trySelectSingle(Collection<F> eObjects, EObjectCondition eCondition) {
		return EmfQueryUtils.trySelectSingle(eObjects, eCondition);
	}

	/**
	 * 選択対象のオブジェクトのリストから，型の一致する複数のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eClass 検索対象の型
	 * @return 選択されたオブジェクトのリスト．
	 */
	public <F extends EObject, T extends F> List<T> selectByKind(Collection<F> eObjects, EClass eClass) {
		return this.select(eObjects, isKindOf(eClass));
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる複数のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクトのリスト．
	 */
	public <F extends EObject, T extends F> List<T> select(Collection<F> eObjects, EObjectCondition eCondition) {
		return EmfQueryUtils.select(eObjects, eCondition);
	}

	/**
	 * 選択対象のオブジェクトのリストに，選択条件の評価結果が真となるオブジェクトが存在するかを判定する．
	 * 
	 * @param eObjects 判定対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return　選択条件の評価結果が真となるオブジェクトが存在する場合，true．それ以外の場合，false．
	 */
	public boolean exists(List<? extends EObject> eObjects, EObjectCondition eObjectCondition) {
		return EmfQueryUtils.exists(eObjects, eObjectCondition);
	}

	/**
	 * 変換対象のオブジェクトから，各オブジェクトの属性の値のリストを取得する．
	 * 属性が複数回指定された場合，ある属性の値のリストに対して，次の属性の値のリストが取得される．
	 * 
	 * @param eObjects 変換対象のオブジェクト
	 * @param eStructuralFeatures 取得するフィーチャのリスト
	 * @return オブジェクトの属性の値のリスト．
	 */
	public <T> List<T> collect(EObject eObject, final EStructuralFeature... eStructuralFeatures) {
		return collect(Collections.singletonList(eObject), eStructuralFeatures);
	}

	/**
	 * 変換対象のオブジェクトのリストから，各オブジェクトの属性の値のリストを取得する．
	 * 属性が複数回指定された場合，ある属性の値のリストに対して，次の属性の値のリストが取得される．
	 * 
	 * @param eObjects 変換対象のオブジェクトのリスト
	 * @param eStructuralFeatures 取得するフィーチャのリスト
	 * @return オブジェクトの属性の値のリスト．
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> collect(List<? extends EObject> eObjects, final EStructuralFeature... eStructuralFeatures) {
		List<?> collected = eObjects;
		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			collected = collect((List<? extends EObject>) collected, eStructuralFeature);
		}
		return (List<T>) collected;
	}

	/**
	 * 変換対象のオブジェクトのリストから，各オブジェクトの属性の値のリストを取得する．
	 * 
	 * @param eObjects 変換対象のオブジェクトのリスト
	 * @param eStructuralFeature 取得するフィーチャ
	 * @return オブジェクトの属性の値のリスト．
	 */
	private <T> List<T> collect(List<? extends EObject> eObjects, final EStructuralFeature eStructuralFeature) {
		Iterable<?> originalCollection = Iterables.transform(eObjects, new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				return input.eGet(eStructuralFeature);
			}
		});

		return flattenResult(Iterables.filter(originalCollection, Predicates.notNull()), eStructuralFeature);
	}

	/**
	 * 変換対象のオブジェクトから，各オブジェクトの属性の値のリストを取得する．
	 * 
	 * @param eObject 変換対象のオブジェクト
	 * @param eOperation 実行するオペレーション
	 * @param arguments オペレーションに適用する引数の配列
	 * @return オペレーションの実行結果の値のリスト．
	 * @throws ModelException オペレーションの実行中に例外が発生した
	 */
	public <T> List<T> collect(EObject eObject, final EOperation eOperation, final Object... arguments) throws ModelException {
		return collect(Collections.singletonList(eObject), eOperation, arguments);
	}

	/**
	 * 変換対象のオブジェクトのリストから，各オブジェクトのオペレーションの実行結果の値のリストを取得する．
	 * 
	 * @param eObjects 変換対象のオブジェクトのリスト
	 * @param eOperation 実行するオペレーション
	 * @param arguments オペレーションに適用する引数の配列
	 * @return オペレーションの実行結果の値のリスト．
	 * @throws ModelException オペレーションの実行中に例外が発生した
	 */
	public <T> List<T> collect(List<? extends EObject> eObjects, final EOperation eOperation, final Object... arguments) throws ModelException {
		final List<ModelException> caughtExceptions = Lists.newArrayList();

		Iterable<?> originalCollection = Iterables.transform(eObjects, new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				try {
					return EmfUtils.exInvoke(input, eOperation, arguments);
				} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					caughtExceptions.add(e);
					return null;
				}
			}
		});

		if (!caughtExceptions.isEmpty()) {// COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			throw caughtExceptions.get(0);
		}

		return flattenResult(Iterables.filter(originalCollection, Predicates.notNull()), eOperation);
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> flattenResult(Iterable<?> originalCollection, final ETypedElement eTypedElement) {
		if (eTypedElement.isMany()) {
			return Lists.newArrayList(Iterables.concat((Iterable<Iterable<T>>) originalCollection));
		} else {
			return Lists.newArrayList((Iterable<T>) originalCollection);
		}
	}

	/**
	 * 与えられたリストから、指定された{@link EStructuralFeature}の値が一意になるような部分リストを取得する。
	 * @param eObjects 元のリスト
	 * @param keyFeatures キーとなる{@link EStructuralFeature}のリスト
	 * @return 指定された{@link EStructuralFeature}の値が一意になるような部分集合
	 */
	public <T extends EObject> List<T> uniqueByKeys(Collection<T> eObjects, final EStructuralFeature... keyFeatures) {
		// COVERAGE 常に未達(未使用だが，ユーティリティであるため問題ない)
		ListMultimap<List<Object>, T> keys2Objects = groupByKeys(eObjects, keyFeatures);

		List<T> uniqueObjects = Lists.newArrayList();
		for (List<Object> key : keys2Objects.keys()) {
			List<T> values = keys2Objects.get(key);
			uniqueObjects.add(values.get(0));
		}
		return uniqueObjects;
	}

	/**
	 * 与えられたリストを、指定された{@link EStructuralFeature}の値によりグルーピングする。
	 * @param eObjects 元のリスト
	 * @param keyFeature キーとなる{@link EStructuralFeature}のリスト
	 * @return 指定された{@link EStructuralFeature}の値をキーとし、グルーピングされたオブジェクトを値とする{@link ListMultimap}
	 */
	@SuppressWarnings("unchecked")
	public <K, V extends EObject> ListMultimap<K, V> groupByKey(Collection<V> eObjects, final EStructuralFeature keyFeature) {
		return Multimaps.index(eObjects, new Function<V, K>() {
			@Override
			public K apply(V input) {
				return (K) input.eGet(keyFeature);
			}
		});
	}

	private <T extends EObject> ListMultimap<List<Object>, T> groupByKeys(Collection<T> eObjects, final EStructuralFeature... keyFeatures) {
		// COVERAGE 常に未達(未使用だが，ユーティリティであるため問題ない)
		return Multimaps.index(eObjects, new Function<T, List<Object>>() {
			@Override
			public List<Object> apply(T input) {
				List<Object> keys = Lists.newArrayList();
				for (EStructuralFeature eStructuralFeature : keyFeatures) {
					keys.add(input.eGet(eStructuralFeature));
				}
				return keys;
			}
		});
	}

	/**
	 * リソース内に存在する全オブジェクトから，指定されたIDを持つ単一のオブジェクトを検索する．
	 * 
	 * @param id 検索対象のオブジェクトのID
	 * @return 見つかったオブジェクト
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public <T extends EObject> T findByID(String id) throws ModelException {
		return EmfQueryUtils.findByID(this.eResource, id);
	}

	/**
	 * {@link EOperation}を、オブジェクトからオペレーションの実行結果を取得する{@link Function}に変換する。
	 * @param eOperation 変換対象の{@link EOperation}
	 * @return 変換結果の{@link Function}
	 */
	public <T> com.google.common.base.Function<EObject, T> operation2Function(final EOperation eOperation) {
		return new com.google.common.base.Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				List<T> collected;
				try {
					collected = collect(input, eOperation);
					return Iterables.getFirst(collected, null);
				} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					return null;
				}
			}
		};
	}

	/**
	 * {@link EStructuralFeature}のリストを、オブジェクトから属性の値を取得する{@link Function}に変換する。
	 * @param eStructuralFeatures 変換対象の{@link EStructuralFeature}のリスト
	 * @return 変換結果の{@link Function}
	 */
	public <T> com.google.common.base.Function<EObject, T> features2Function(final EStructuralFeature... eStructuralFeatures) {
		return new com.google.common.base.Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				List<T> collected = collect(input, eStructuralFeatures);
				return Iterables.getFirst(collected, null);
			}
		};
	}

	/**
	 * {@link EStructuralFeature}を、オブジェクトから属性の値を取得する{@link Function}に変換する。
	 * @param eStructuralFeature 変換対象の{@link EStructuralFeature}
	 * @return 変換結果の{@link Function}
	 */
	public <T> com.google.common.base.Function<EObject, T> feature2Function(final EStructuralFeature eStructuralFeature) {
		return features2Function(eStructuralFeature);
	}
}
