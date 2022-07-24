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

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.IteratorKind;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.google.common.base.Optional;

/**
 * EMFに関するユーティリティ機能を提供する。
 */
public class EmfUtils { // COVERAGE 常に未達(インスタンス生成が行なわれていないが，ユーティリティであるため問題ない)
	private static final char ID_PREFIX_SEPARATOR = '.';

	// アノテーションが有効であることを示す値
	private static final String ANNOTATION_ENABLED_VALUE = "true";

	// モデルのステレオタイプに関するアノテーション
	private static final String STEREOTYPES_ANNOTATION = "stereotypes";
	private static final String EX_PACKAGE_STEREOTYPE = "extension";

	// タグ情報のアノテーション
	private static final String TAGS_ANNOTATION = "tags";

	/**
	 * EObjectに対し，拡張オペレーションを実行する．
	 * @param eObject 拡張オペレーションの実行対象のオブジェクト
	 * @param eOperation 拡張オペレーション
	 * @return 拡張オペレーションの実行結果の返り値.
	 * @throws ModelException 拡張オペレーションの実行に失敗した場合
	 */
	public static <T> T exInvoke(EObject eObject, EOperation eOperation) throws ModelException {
		return exInvoke(eObject, eOperation, new Object[0]);
	}

	/**
	 * EObjectに対し，拡張オペレーションを実行する．
	 * @param eObject 拡張オペレーションの実行対象のオブジェクト
	 * @param eOperation 拡張オペレーション
	 * @param arguments 拡張オペレーションに渡す引数の配列
	 * @return 拡張オペレーションの実行結果の返り値.
	 * @throws ModelException 拡張オペレーションの実行に失敗した場合
	 */
	@SuppressWarnings("unchecked")
	public static <T> T exInvoke(EObject eObject, EOperation eOperation, Object... arguments) throws ModelException {
		try {
			if (!isExtensionOperation(eOperation)) {
				return (T) eObject.eInvoke(eOperation, new BasicEList<Object>(Arrays.asList(arguments)));
			} else {
				Resource eResource = eObject.eResource();
				EObject extensionObject = findExtensionObject(eResource, eOperation.getEContainingClass());

				BasicEList<Object> exArguments = new BasicEList<Object>();
				exArguments.add(eObject);
				Collections.addAll(exArguments, arguments);

				return (T) extensionObject.eInvoke(eOperation, exArguments);
			}
		} catch (InvocationTargetException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new ModelException("Internal error occurred while accessing a model.", e);
		}
	}

	private static EObject findExtensionObject(Resource eResource, EClass extensionClass) throws ModelException {
		Optional<EObject> foundObject = tryFindExtensionObject(eResource, extensionClass);
		if (!foundObject.isPresent())// COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			throw new ModelException("An extension object of " + extensionClass.getName() + " does not exist in a resource.");

		return foundObject.get();
	}

	/**
	 * リソース内に存在する、指定された型の拡張オブジェクトを検索する。
	 * 拡張オブジェクトが見つからない場合は、拡張オブジェクトを構築し、リソースに追加する。
	 * @param eResource 検索対象の{@link Resource}
	 * @param extensionClass 拡張オブジェクトの型
	 * @return リソース内に存在する拡張オブジェクト
	 */
	public static EObject findOrBuildExtensionObject(Resource eResource, EClass extensionClass) {
		Optional<EObject> foundExtensionObject = tryFindExtensionObject(eResource, extensionClass);
		if (!foundExtensionObject.isPresent()) {
			// 拡張オペレーションを保持するオブジェクトが存在しない場合，生成する．
			EObject extensionObject = extensionClass.getEPackage().getEFactoryInstance().create(extensionClass);
			eResource.getContents().add(extensionObject);

			for (EReference eReference : extensionObject.eClass().getEAllReferences()) {
				EClass eReferenceeClass = (EClass) eReference.getEType();
				if (isExtensionClass(eReferenceeClass)) { // COVERAGE 常にtrue(現状のツールワークフローではfalseを通らないが，コードレビュー済みであるため問題ない)
					extensionObject.eSet(eReference, findOrBuildExtensionObject(eResource, eReferenceeClass));
				}
			}
			return extensionObject;
		} else {
			return foundExtensionObject.get();
		}
	}

	private static Optional<EObject> tryFindExtensionObject(Resource eResource, EClass extensionClass) {
		IQueryResult result = new SELECT(new FROM(eResource.getContents(), IteratorKind.FLAT_LITERAL), new WHERE(new EObjectTypeRelationCondition(extensionClass))).execute();
		return result.isEmpty() ? Optional.<EObject> absent() : Optional.of(result.iterator().next());
	}

	/**
	 * <p>オブジェクトに対し、指定した{@link EOperation}が適用できるかを判定する。</p>
	 * @param eObject 判定対象の{@link EObject}
	 * @param eOperation 判定対象の{@link EOperation}
	 * @return オブジェクトに対し、指定した{@link EOperation}が適用できる場合、true。それ以外の場合、false。
	 */
	public static boolean isOperationApplicable(EObject eObject, EOperation eOperation) {
		if (isExtensionOperation(eOperation)) {
			// 拡張オペレーション
			if (eOperation.getEParameters().isEmpty()) {// COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				return false;
			} else {
				return eOperation.getEParameters().get(0).getEType().isInstance(eObject);
			}
		} else {
			// 標準オペレーション
			return eOperation.getEContainingClass().isInstance(eObject);
		}
	}

	private static boolean isExtensionOperation(EOperation eOperation) {
		return isExtensionPackage(eOperation.getEContainingClass().getEPackage());
	}

	private static boolean isExtensionClass(EClass eClass) {
		return isExtensionPackage(eClass.getEPackage());
	}

	private static boolean isExtensionPackage(EPackage ePackage) {
		return ANNOTATION_ENABLED_VALUE.equals(EcoreUtil.getAnnotation(ePackage, STEREOTYPES_ANNOTATION, EX_PACKAGE_STEREOTYPE));
	}

	/**
	 * モデルツリー上の上位オブジェクトのうち、指定された型であり、かつ直近のオブジェクトを検索する。
	 * @param eObject 検索の起点となるオブジェクト
	 * @param eClass 検索対象の上位オブジェクトの型
	 * @return モデルツリー上の上位オブジェクトのうち、指定された型であり、かつ直近のオブジェクト
	 */
	@SuppressWarnings("unchecked")
	public static <T> Optional<T> tryFindNearestAncestorOfType(EObject eObject, EClass eClass) {
		EObject parent = eObject.eContainer();
		while (parent != null) {
			if (eClass.isInstance(parent)) {
				return Optional.of((T) parent);
			}
			parent = parent.eContainer();
		}
		return Optional.absent();
	}

	/**
	 * <p>指定されたオブジェクトとその配下のオブジェクトのコピーを作成する。</p>
	 * <p>NOTE 配下のオブジェクトについても同様にコピーされることに注意。</p>
	 * @param eObject コピー元のオブジェクト
	 * @return コピー結果のオブジェクト
	 */
	public static <T extends EObject> T copy(T eObject) {
		return EcoreUtil.copy(eObject);
	}

	/**
	 * <p>指定されたオブジェクトのコピーを作成する。</p>
	 * <p>NOTE 配下のオブジェクトはコピーしないことに注意。</p>
	 * @param eObject コピー元のオブジェクト
	 * @return コピー結果のオブジェクト
	 */
	public static <T extends EObject> T copyItself(T eObject) {
		Copier copier = new ItselfCopier();
		EObject result = copier.copy(eObject);
		copier.copyReferences();

		@SuppressWarnings("unchecked")
		T t = (T) result;
		return t;
	}

	private static class ItselfCopier extends Copier {
		private static final long serialVersionUID = 1L;

		@Override
		protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
			// nop
		}
	}

	/**
	 * オブジェクトから{@link EStructuralFeature}の値のリストを取得する。
	 * @param eObject 取得対象の{@link EObject}
	 * @param eReference 取得対象の{@link EStructuralFeature}
	 * @return オブジェクトから取得した{@link EStructuralFeature}の値のリスト
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> getFeatureValues(EObject eObject, EStructuralFeature eReference) {
		if (eReference.isMany()) {
			return (List<T>) eObject.eGet(eReference);
		} else {
			T value = (T) eObject.eGet(eReference);
			return value == null ? Collections.<T> emptyList() : Collections.singletonList(value);
		}
	}

	/**
	 * <p>オブジェクトのIDをリファレンスに変換する。</p>
	 * <p>NOTE リファレンスはあるモデル内でオブジェクトを一意に識別・参照する文字列(IDからID接頭辞を除いたもの)である。</p>
	 * @param id 変換対象のオブジェクトID
	 * @return 変換結果のリファレンス
	 */
	public static String idToReference(String id) {
		int idPrefixEnd = id.indexOf(ID_PREFIX_SEPARATOR);
		if (idPrefixEnd == -1) {// COVERAGE 常にfalse(trueとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			return id;
		}

		return id.substring(idPrefixEnd + 1);
	}

	/**
	 * {@link EStructuralFeature}に設定されたタグ情報(tagsアノテーション)の文字列を取得する。
	 * @param eStructuralFeature 取得対象の{@link EStructuralFeature}
	 * @param tag タグ情報名
	 * @return {@link EStructuralFeature}に設定されたタグ情報(tags)
	 */
	public static Optional<String> tryGetTag(EStructuralFeature eStructuralFeature, String tag) {
		String tagValue = EcoreUtil.getAnnotation(eStructuralFeature, TAGS_ANNOTATION, tag);
		return Optional.fromNullable(tagValue);
	}

	/**
	 * {@link EModelElement}が指定されたステレオタイプを持つかを判定する。
	 * @param eModelElement 判定対象の{@link EModelElement}
	 * @param stereotype 判定対象のステレオタイプ
	 * @return {@link EModelElement}が指定されたステレオタイプを持つ場合、true。それ以外の場合、false。
	 */
	public static boolean hasStereotype(EModelElement eModelElement, String stereotype) {
		return ANNOTATION_ENABLED_VALUE.equals(EcoreUtil.getAnnotation(eModelElement, STEREOTYPES_ANNOTATION, stereotype));
	}

	/**
	 * {@link EStructuralFeature}に設定されたタグ情報(tagsアノテーション)の真偽値を取得する。
	 * タグ情報が設定されていない場合、デフォルト値を返す。
	 * @param eStructuralFeature 取得対象の{@link EStructuralFeature}
	 * @param tag タグ情報名
	 * @param defaultValue デフォルト値
	 * @return タグ情報が設定されている場合、{@link EStructuralFeature}に設定されたタグ情報(tagsアノテーション)の真偽値。それ以外の場合、デフォルト値。
	 */
	public static boolean getBooleanTagValue(EStructuralFeature eStructuralFeature, String tag, boolean defaultValue) {
		Optional<String> tagValue = tryGetTag(eStructuralFeature, tag);
		return tagValue.isPresent() ? ANNOTATION_ENABLED_VALUE.equals(tagValue.get()) : defaultValue;
	}
}
