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
package jp.ac.nagoya_u.is.nces.a_rte.model.util;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * EMFのオブジェクトの検索を行う．
 */
public class EmfQueryUtils { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクトのリスト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public static <T extends EObject> T findSingle(EObject eObject, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(findSingle(Collections.singletonList(eObject), eCondition)); // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eResource 検索対象のリソース
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public static <T extends EObject> T findSingle(Resource eResource, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(findSingle(eResource.getContents(), eCondition));
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 */
	public static <T extends EObject> Optional<T> tryFindSingle(EObject eObject, EObjectCondition eCondition) {
		return tryGetSingleObject(findSingle(Collections.singletonList(eObject), eCondition));
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる単一のオブジェクトを検索する．
	 * 複数のオブジェクトが見つかった場合，先頭のオブジェクトのみを返す．
	 * 
	 * @param eResource 検索対象のリソース
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクト．
	 */
	public static <T extends EObject> Optional<T> tryFindSingle(Resource eResource, EObjectCondition eCondition) {
		return tryGetSingleObject(findSingle(eResource.getContents(), eCondition));
	}

	/**
	 * 対象オブジェクト配下に存在する全オブジェクトから，検索条件の評価結果が真となる複数のオブジェクトを検索する．
	 * 
	 * @param eObject 検索対象のオブジェクト
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクトのリスト．
	 */
	public static <T extends EObject> List<T> find(EObject eObject, EObjectCondition eCondition) {
		return find(Collections.singletonList(eObject), eCondition);
	}

	/**
	 * リソース内に存在する全オブジェクトから，検索条件の評価結果が真となる複数のオブジェクトを検索する．
	 * 
	 * @param eResource 検索対象のリソース
	 * @param eCondition 検索条件
	 * @return 見つかったオブジェクトのリスト．
	 */
	public static <T extends EObject> List<T> find(Resource eResource, EObjectCondition eCondition) {
		return find(eResource.getContents(), eCondition);
	}

	private static <T extends EObject> List<T> find(List<EObject> eObjects, EObjectCondition eCondition) {
		IQueryResult result = new SELECT(new FROM(eObjects), new WHERE(eCondition)).execute();
		return convertToList(result);
	}

	private static <T extends EObject> List<T> findSingle(List<EObject> eObjects, EObjectCondition eCondition) {		
		IQueryResult result = new SELECT(1, new FROM(eObjects), new WHERE(eCondition)).execute();
		return convertToList(result);
	}

	/**
	 * 選択対象のオブジェクトのリストに，選択条件の評価結果が真となるオブジェクトが存在するかを判定する．
	 * 
	 * @param eObjects 判定対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return　選択条件の評価結果が真となるオブジェクトが存在する場合，true．それ以外の場合，false．
	 */
	public static boolean exists(List<? extends EObject> eObjects, EObjectCondition eCondition) {
		return !select(eObjects, eCondition).isEmpty();
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる単一のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクト．
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	public static <F extends EObject, T extends F> T selectSingle(Collection<F> eObjects, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(select(eObjects, eCondition));
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる単一のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクト．
	 */
	public static <F extends EObject, T extends F> Optional<T> trySelectSingle(Collection<F> eObjects, EObjectCondition eCondition) {
		return tryGetSingleObject(select(eObjects, eCondition));
	}

	/**
	 * 選択対象のオブジェクトのリストから，選択条件の評価結果が真となる複数のオブジェクトを選択する．
	 * 
	 * @param eObjects 選択対象のオブジェクトのリスト
	 * @param eCondition 選択条件
	 * @return 選択されたオブジェクトのリスト．
	 */
	public static <F extends EObject, T extends F> List<T> select(Collection<F> eObjects, final EObjectCondition eCondition) {
		Collection<F> result = Collections2.filter(eObjects, new Predicate<F>() {
			@Override
			public boolean apply(F input) {
				return eCondition.isSatisfied(input);
			}
		});
		return convertToList(result);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> List<T> convertToList(Collection<?> result) {
		return Lists.newArrayList((Collection<T>) result);
	}

	@SuppressWarnings("unchecked")
	private static <T> T getSingleObject(Collection<?> result) throws ModelException {
		if (result.isEmpty()) // COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			throw new ModelException("条件を満たすオブジェクトが見つかりませんでした"); // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)

		return (T) result.iterator().next();
	}

	@SuppressWarnings("unchecked")
	private static <T> Optional<T> tryGetSingleObject(Collection<?> result) {
		return result.isEmpty() ? Optional.<T> absent() : Optional.of((T) result.iterator().next());
	}

	/**
	 * リソース内に存在する全オブジェクトから、指定したIDを持つオブジェクトを検索する。
	 * @param eResource 検索対象の{@link Resource}
	 * @param id 検索対象のオブジェクトのID
	 * @return 指定したIDを持つオブジェクト
	 * @throws ModelException オブジェクトが見つからない場合
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T findByID(Resource eResource, String id) throws ModelException {
		EObject eObject = eResource.getEObject(id);
		if (eObject == null) { // COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			throw new ModelException("条件を満たすオブジェクトが見つかりませんでした");
		}
		return (T) eObject;
	}
}
