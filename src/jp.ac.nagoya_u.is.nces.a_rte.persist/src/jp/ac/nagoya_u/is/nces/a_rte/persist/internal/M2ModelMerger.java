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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceState;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class M2ModelMerger {
	/**
	 * 左右のオブジェクトが常に一致しないものとしてマッチングを行うEObjectMatcher
	 */
	private static class NeverMatchEObjectMatcher implements IEObjectMatcher {
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.emf.compare.match.eobject.IEObjectMatcher#createMatches
		 * (org.eclipse.emf.compare.Comparison, java.util.Iterator,
		 * java.util.Iterator, java.util.Iterator,
		 * org.eclipse.emf.common.util.Monitor)
		 */
		@Override
		public void createMatches(Comparison comparison, Iterator<? extends EObject> leftEObjects, Iterator<? extends EObject> rightEObjects, Iterator<? extends EObject> originEObjects,
				Monitor monitor) {

			// 左辺のオブジェクトのマッチを構築
			for (EObject eObject : Lists.newArrayList(leftEObjects)) {
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setLeft(eObject);
				parentMatch.getSubmatches().add(match);
			}

			// 右辺のオブジェクトのマッチを構築
			for (EObject eObject : Lists.newArrayList(rightEObjects)) {
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setRight(eObject);
				parentMatch.getSubmatches().add(match);
			}

			// オリジナルのオブジェクトのマッチを構築
			for (EObject eObject : Lists.newArrayList(originEObjects)) { // COVERAGE 常に未達(現状のツールワークフローでは使用されないが，コードレビュー済みであるため問題ない)
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) {
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setOrigin(eObject);
				parentMatch.getSubmatches().add(match);
			}
		}
	}

	private final static Logger LOGGER = Logger.getLogger(M2ModelMerger.class.getName());

	private final EMFCompare comparator;

	public M2ModelMerger() {
		IEObjectMatcher matcher = new IdentifierEObjectMatcher(new NeverMatchEObjectMatcher());
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		this.comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
	}

	public void merge(Autosar mergeTargetAutosar, Autosar appendAutosar) {
		Comparison comparison = compareModels(mergeTargetAutosar, appendAutosar);
		mergeToTargetModel(comparison);
	}

	private Comparison compareModels(Autosar mergeTargetAutosar, Autosar appendAutosar) {
		DefaultComparisonScope scope = new DefaultComparisonScope(appendAutosar, mergeTargetAutosar, null);
		return this.comparator.compare(scope);
	}

	private void mergeToTargetModel(Comparison comparison) {
		for (Diff diff : comparison.getDifferences()) {
			switch (diff.getKind()) {
			case ADD:
			case MOVE:
				if (diff instanceof ReferenceChange) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					ReferenceChange referenceChange = (ReferenceChange) diff;
					if (!referenceChange.getReference().isContainment()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
						LOGGER.finest("discarding a diff. it is not a containment reference diff. " + diff);
						diff.discard();

					} else if (referenceChange.getMatch().getLeft() == null || referenceChange.getMatch().getRight() == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
						LOGGER.finest("discarding a diff. it is of a submatch. " + diff);
						diff.discard();

					} else if (referenceChange.getValue().eContainer() == referenceChange.getMatch().getRight()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
						LOGGER.finest("discarding a diff. it is of the merge target. " + diff);
						diff.discard();

					} else if (isRightAlreadyContainsValue(referenceChange)) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
						LOGGER.finest("discarding a diff. the value of it already exists in the merge target. " + diff);
						diff.discard();
					}
				} else { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					LOGGER.finest("discarding a diff. it is not a reference diff. " + diff);
					diff.discard();
				}
				break;
			case CHANGE:
			case DELETE:
			default:
				LOGGER.finest("discarding a diff. it is change or delete diff. " + diff);
				diff.discard();
				break;
			}
		}

		// マージ
		for (Diff diff : comparison.getDifferences()) {
			mergeDiff(diff);
		}
	}

	private boolean isRightAlreadyContainsValue(ReferenceChange referenceChange) {
		final String diffObjectId = EcoreUtil.getID(referenceChange.getValue());
		if (diffObjectId == null) {
			// IDを持たない場合，含まれていないものと判断する．
			return false;
		}

		List<EObject> eObjects = EmfUtils.getFeatureValues(referenceChange.getMatch().getRight(), referenceChange.getReference());
		return Iterables.any(eObjects, new Predicate<EObject>() {
			@Override
			public boolean apply(EObject input) {
				return Objects.equal(EcoreUtil.getID(input), diffObjectId);
			}
		});
	}

	private void mergeDiff(Diff diff) {
		if (diff.getState() != DifferenceState.UNRESOLVED) {
			return;
		}

		// 先に依存先の比較結果のマージを実施
		for (Diff requiresDiff : diff.getRequires()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			mergeDiff(requiresDiff);
		}

		// マージ
		if (diff instanceof ReferenceChange) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない) 
			ReferenceChange referenceChange = (ReferenceChange) diff;
			LOGGER.finest("merging " + referenceChange);

			if (referenceChange.getReference().isMany()) {
				@SuppressWarnings("unchecked")
				List<EObject> list = (List<EObject>) referenceChange.getMatch().getRight().eGet(referenceChange.getReference());
				list.add(referenceChange.getValue());
			} else {
				diff.getMatch().getRight().eSet(referenceChange.getReference(), referenceChange.getValue());
			}
			referenceChange.setState(DifferenceState.MERGED);
		}
	}
}
