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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_GROUP_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_RESOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SPINLOCK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_INTERLINK_HEADER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PRIMITIVE_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_APPLICATION_HEADER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_MODULE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.FileNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.util.TestFileNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class RteTestFileModelBuilder {

	private final TestModuleModelBuildContext context;

	public RteTestFileModelBuilder(TestModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		this.context.cache.rteModule = this.context.query.findSingleByKind(RTE_MODULE);
		this.context.cache.osApplicationType = findBuiltinType(SymbolNames.OS_APPLICATION_TYPE_NAME);
		this.context.cache.osTrustedFunctionIndexType = findBuiltinType(SymbolNames.OS_TRUSTED_FUNCTION_INDEX_TYPE_NAME);
		this.context.cache.osTaskType = findBuiltinType(SymbolNames.OS_TASK_TYPE_NAME);
		this.context.cache.osEventMaskType = findBuiltinType(SymbolNames.OS_EVENT_MASK_TYPE_NAME);
		this.context.cache.osResourceType = findBuiltinType(SymbolNames.OS_RESOURCE_TYPE_NAME);
		this.context.cache.osSpinlockIdType = findBuiltinType(SymbolNames.OS_SPINLOCK_ID_TYPE_NAME);
		this.context.cache.comSignalIdType = findBuiltinType(SymbolNames.COM_SIGNAL_ID_TYPE_NAME);

		this.context.cache.rteTest = RteTestFactory.eINSTANCE.createRteTest();
		this.context.cache.rteTestRoot.setRteTest(this.context.cache.rteTest);
		this.context.cache.rteTestModule = RteTestFactory.eINSTANCE.createRteTestModule();
		this.context.cache.rteTestRoot.setRteTestModule(this.context.cache.rteTestModule);

		buildOsStubConstants(this.context.cache.rteTest);
		buildOsStubHeader(this.context.cache.rteTestModule, this.context.cache.rteTest.getOsStubConstant());

		buildComStubConstants(this.context.cache.rteTest);
		buildComStubHeader(this.context.cache.rteTestModule, this.context.cache.rteTest.getComStubConstant());

		buildIocMock(this.context.cache.rteTestModule);

		buildSwcMocks(this.context.cache.rteTestModule);
		buildBswmMocks(this.context.cache.rteTestModule);
	}

	private PrimitiveType findBuiltinType(String symbolName) throws ModelException {
		return this.context.query.findSingle(isKindOf(PRIMITIVE_TYPE).AND(hasAttr(TYPE__SYMBOL_NAME, symbolName)));
	}

	private void buildOsStubConstants(RteTest targetRteTest) {
		buildOsApplicationStubConstants(targetRteTest);
		buildOsTrustedFunctionIndexStubConstants(targetRteTest);
		buildOsTaskStubConstants(targetRteTest);
		buildOsEventStubConstants(targetRteTest);
		buildOsResourceStubConstants(targetRteTest);
		buildOsSpinlockStubConstants(targetRteTest);
	}

	private void buildOsApplicationStubConstants(RteTest targetRteTest) {
		int appIndex = 1;
		for (OsApplication sourceOsApplication : this.context.query.<OsApplication> findByKind(OS_APPLICATION)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsApplication.getShortName());
			constant.setType(this.context.cache.osApplicationType);
			constant.setValue(String.valueOf(appIndex));
			targetRteTest.getOsStubConstant().add(constant);

			appIndex++;
		}
	}

	private void buildOsTrustedFunctionIndexStubConstants(RteTest targetRteTest) {
		int tfIndex = 1;
		for (OsApplicationTrustedFunction sourceOsTrustedFunction : this.context.query.<OsApplicationTrustedFunction> findByKind(OS_APPLICATION_TRUSTED_FUNCTION)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsTrustedFunction.getShortName());
			constant.setType(this.context.cache.osTrustedFunctionIndexType);
			constant.setValue(String.valueOf(tfIndex));
			targetRteTest.getOsStubConstant().add(constant);

			tfIndex++;
		}
	}

	private void buildOsTaskStubConstants(RteTest targetRteTest) {
		int taskIndex = 1;
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsTask.getShortName());
			constant.setType(this.context.cache.osTaskType);
			constant.setValue(String.valueOf(taskIndex));
			targetRteTest.getOsStubConstant().add(constant);

			taskIndex++;
		}
	}

	private void buildOsEventStubConstants(RteTest targetRteTest) {
		int eventMask = 1;
		for (OsEvent sourceOsEvent : this.context.query.<OsEvent> findByKind(OS_EVENT)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsEvent.getShortName());
			constant.setType(this.context.cache.osEventMaskType);
			constant.setValue(String.valueOf(eventMask));
			targetRteTest.getOsStubConstant().add(constant);

			eventMask <<= 1;
		}
	}

	private void buildOsResourceStubConstants(RteTest targetRteTest) {
		int resourceIndex = 1;
		for (OsResource sourceOsResource : this.context.query.<OsResource> findByKind(OS_RESOURCE)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsResource.getShortName());
			constant.setType(this.context.cache.osResourceType);
			constant.setValue(String.valueOf(resourceIndex));
			targetRteTest.getOsStubConstant().add(constant);

			resourceIndex++;
		}
	}

	private void buildOsSpinlockStubConstants(RteTest targetRteTest) {
		int spinlockIndex = 1;
		for (OsSpinlock sourceOsSpinlock : this.context.query.<OsSpinlock> findByKind(OS_SPINLOCK)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsSpinlock.getShortName());
			constant.setType(this.context.cache.osSpinlockIdType);
			constant.setValue(String.valueOf(spinlockIndex));
			targetRteTest.getOsStubConstant().add(constant);

			spinlockIndex++;
		}
	}

	private void buildOsStubHeader(RteTestModule targetTestModule, List<Constant> osStubConstants) {
		targetTestModule.setOsStubHeader(createOsStubHeader(osStubConstants));
	}

	private OsStubHeader createOsStubHeader(List<Constant> osStubConstants) {
		OsStubHeader osStubHeader = RteTestFactory.eINSTANCE.createOsStubHeader();
		osStubHeader.setFileName(TestFileNames.OS_STUB_HEADER_NAME);
		osStubHeader.setGuardName(TestFileNames.OS_STUB_HEADER_GUARD_NAME);
		osStubHeader.getConstant().addAll(osStubConstants);
		return osStubHeader;
	}

	private void buildComStubConstants(RteTest targetRteTest) {
		int comSignalIndex = 1;
		int comSignalGroupIndex = 1;
		int comGroupSignalIndex = 1;
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignal)));
			constant.setType(this.context.cache.comSignalIdType);
			constant.setValue(String.valueOf(comSignalIndex));
			targetRteTest.getComStubConstant().add(constant);

			comSignalIndex++;
		}
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(SymbolNames.createComSignalGroupSymbolicName(sourceComSignalGroup));
			constant.setType(this.context.cache.comSignalIdType);
			constant.setValue(String.valueOf(comSignalGroupIndex));
			targetRteTest.getComStubConstant().add(constant);

			comSignalGroupIndex++;
		}
		for (ComGroupSignal sourceComGroupSignal : this.context.query.<ComGroupSignal> findByKind(COM_GROUP_SIGNAL)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(SymbolNames.createComGroupSignalSymbolicName(sourceComGroupSignal));
			constant.setType(this.context.cache.comSignalIdType);
			constant.setValue(String.valueOf(comGroupSignalIndex));
			targetRteTest.getComStubConstant().add(constant);

			comGroupSignalIndex++;
		}
	}

	private void buildComStubHeader(RteTestModule targetTestModule, List<Constant> comStubConstants) {
		targetTestModule.setComStubHeader(createComStubHeader(comStubConstants));
	}

	private ComStubHeader createComStubHeader(List<Constant> comStubConstants) {
		ComStubHeader comStubHeader = RteTestFactory.eINSTANCE.createComStubHeader();
		comStubHeader.setFileName(TestFileNames.COM_STUB_HEADER_NAME);
		comStubHeader.setGuardName(TestFileNames.COM_STUB_HEADER_GUARD_NAME);
		comStubHeader.getConstant().addAll(comStubConstants);
		return comStubHeader;
	}

	private void buildIocMock(RteTestModule targetTestModule) {
		IocMockHeader mockHeader = createIocMockHeader();
		targetTestModule.setIocMockHeader(mockHeader);
		targetTestModule.setIocMockSource(createIocMockSource(mockHeader));
	}

	private IocMockSource createIocMockSource(IocMockHeader mockHeader) {
		IocMockSource mockSource = RteTestFactory.eINSTANCE.createIocMockSource();
		mockSource.setFileName(TestFileNames.IOC_MOCK_SOURCE_NAME);
		mockSource.getIncludeHeader().add(mockHeader);
		mockSource.getIocApi().addAll(getUniqueIocApis());
		return mockSource;
	}

	private IocMockHeader createIocMockHeader() {
		IocMockHeader mockHeader = RteTestFactory.eINSTANCE.createIocMockHeader();
		mockHeader.setFileName(TestFileNames.IOC_MOCK_HEADER_NAME);
		mockHeader.setGuardName(TestFileNames.IOC_MOCK_HEADER_GUARD_NAME);
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());
		mockHeader.getIocApi().addAll(getUniqueIocApis());
		return mockHeader;
	}

	private List<IocApi> getUniqueIocApis() {
		List<IocApi> apis = Lists.newArrayList();
		for (IocApi iocApi : this.context.query.<IocApi> findByKind(IOC_API)) {
			if (!hasSameSymbolIocApi(apis, iocApi)) { // COVERAGE (コードレビューで問題ないことを確認)
				apis.add(iocApi);
			}
		}
		return apis;
	}
	
	private boolean hasSameSymbolIocApi(List<IocApi> apis, IocApi api) {
		for (IocApi iocApi : apis) {
			if (iocApi.getSymbolName().equals(api.getSymbolName())) { // COVERAGE (コードレビューで問題ないことを確認)
				return true;
			}
		}
		return false;
	}
	
	private void buildSwcMocks(RteTestModule targetTestModule) throws ModelException {
		for (Swc sourceSwc : this.context.query.<Swc> findByKind(SWC)) {
			SwcMockHeader mockHeader = createSwcMockHeader(sourceSwc);
			targetTestModule.getSwcMockHeader().add(mockHeader);
			targetTestModule.getSwcMockSource().add(createSwcMockSource(sourceSwc, mockHeader));
		}
	}

	private SwcMockSource createSwcMockSource(Swc sourceSwc, SwcMockHeader mockHeader) throws ModelException {
		RteApplicationHeader applicationHeader = this.context.builtQuery.findDest(RTE_APPLICATION_HEADER, sourceSwc);

		SwcMockSource mockSource = RteTestFactory.eINSTANCE.createSwcMockSource();
		mockSource.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + TestFileNames.CC_POSTFIX);
		mockSource.getIncludeHeader().add(applicationHeader);
		mockSource.getIncludeHeader().add(mockHeader);
		mockSource.setSwcName(sourceSwc.getCompartmentName());
		for (ExecutableEntity executableEntity : sourceSwc.getDependentRunnableEntity()) {
			if (executableEntity.getIsNoMock() == null || !executableEntity.getIsNoMock()) { // COVERAGE (コードレビューで問題ないことを確認)
				mockSource.getExecutableEntity().add(executableEntity);
			}
		}
		return mockSource;
	}

	private SwcMockHeader createSwcMockHeader(Swc sourceSwc) {
		SwcMockHeader mockHeader = RteTestFactory.eINSTANCE.createSwcMockHeader();
		mockHeader.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + FileNames.HEADER_FILE_NAME_POSTFIX);
		mockHeader.setGuardName(TestFileNames.MOCK_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + TestFileNames.HEADER_GUARD_NAME_POSTFIX);
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());
		mockHeader.setSwcName(sourceSwc.getCompartmentName());
		for (ExecutableEntity executableEntity : sourceSwc.getDependentRunnableEntity()) {
			if (executableEntity.getIsNoMock() == null || !executableEntity.getIsNoMock()) { // COVERAGE (コードレビューで問題ないことを確認)
				mockHeader.getExecutableEntity().add(executableEntity);
			}
		}
		return mockHeader;
	}
	private void buildBswmMocks(RteTestModule targetTestModule) throws ModelException {
		for (Bswm sourceBswm : this.context.query.<Bswm> findByKind(BSWM)) {
			BswmMockHeader mockHeader = createBswmMockHeader(sourceBswm);
			targetTestModule.getBswmMockHeader().add(mockHeader);
			targetTestModule.getBswmMockSource().add(createBswmMockSource(sourceBswm, mockHeader));
		}
	}

	private BswmMockSource createBswmMockSource(Bswm sourceBswm, BswmMockHeader mockHeader) throws ModelException {
		ModuleInterlinkHeader moduleInterlinkHeader = this.context.builtQuery.findDest(MODULE_INTERLINK_HEADER, sourceBswm);

		BswmMockSource mockSource = RteTestFactory.eINSTANCE.createBswmMockSource();
		mockSource.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + TestFileNames.CC_POSTFIX);
		mockSource.getIncludeHeader().add(moduleInterlinkHeader);
		mockSource.getIncludeHeader().add(mockHeader);
		mockSource.setBswmName(sourceBswm.getCompartmentName());
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			mockSource.getExecutableEntity().addAll(partedBswm.getDependentBswSchedulableEntity());
		}
		return mockSource;
	}

	private BswmMockHeader createBswmMockHeader(Bswm sourceBswm) {
		BswmMockHeader mockHeader = RteTestFactory.eINSTANCE.createBswmMockHeader();
		mockHeader.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + FileNames.HEADER_FILE_NAME_POSTFIX);
		mockHeader.setGuardName(TestFileNames.MOCK_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + TestFileNames.HEADER_GUARD_NAME_POSTFIX);
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());
		mockHeader.setBswmName(sourceBswm.getCompartmentName());
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			mockHeader.getExecutableEntity().addAll(partedBswm.getDependentBswSchedulableEntity());
		}
		return mockHeader;
	}

}
