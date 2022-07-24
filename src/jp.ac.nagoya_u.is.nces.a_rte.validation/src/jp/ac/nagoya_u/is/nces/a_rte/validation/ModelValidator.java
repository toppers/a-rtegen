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
package jp.ac.nagoya_u.is.nces.a_rte.validation;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.validation.internal.EmfModelValidator;
import jp.ac.nagoya_u.is.nces.a_rte.validation.internal.IModelValidator;
import jp.ac.nagoya_u.is.nces.a_rte.validation.internal.OclModelValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.io.Resources;

public class ModelValidator {

	private static final Function<String, URL> string2Resource = new Function<String, URL>() {
		@Override
		public URL apply(String input) {
			return Resources.getResource(ModelValidator.class, input);
		}
	};

	private static final List<String> RTE_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/rte/validation_common_m2.ocl", "/rte/validation_generatePhase_m2.ocl");
	private static final List<String> RTE_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/rte/validation_common_m2.ocl", "/rte/validation_contractPhase_m2.ocl");
	private static final List<String> RTE_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/rte/validation_common_instance.ocl", "/rte/validation_generatePhase_instance.ocl");
	private static final List<String> RTE_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/rte/validation_common_instance.ocl", "/rte/validation_contractPhase_instance.ocl");
	private static final List<String> BSWM_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/bswm/validation_common_m2.ocl", "/bswm/validation_generatePhase_m2.ocl");
	private static final List<String> BSWM_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/bswm/validation_common_m2.ocl", "/bswm/validation_contractPhase_m2.ocl");
	private static final List<String> BSWM_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/bswm/validation_common_instance.ocl", "/bswm/validation_generatePhase_instance.ocl");
	private static final List<String> BSWM_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/bswm/validation_common_instance.ocl", "/bswm/validation_contractPhase_instance.ocl");
	private static final List<String> COMMON_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/common/validation_common_m2.ocl", "/common/validation_generatePhase_m2.ocl");
	private static final List<String> COMMON_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/common/validation_common_m2.ocl", "/common/validation_contractPhase_m2.ocl");
	private static final List<String> COMMON_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/common/validation_common_instance.ocl", "/common/validation_generatePhase_instance.ocl");
	private static final List<String> COMMON_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/common/validation_common_instance.ocl", "/common/validation_contractPhase_instance.ocl");

	public static final String EMF_VALIDATION_MESSAGES_PROPERTIES = "/emfValidationMessages.properties";
	private static final List<String> MESSAGE_FILES = Lists.newArrayList("/validationMessages.properties");

	private final List<IModelValidator> validators;

	public static ModelValidator forRteGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forRteContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}
	public static ModelValidator forRteGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forRteContractPhaseInstance() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmContractPhaseInstance() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(COMMON_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(COMMON_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(COMMON_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonContractPhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(COMMON_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}
	private ModelValidator(IModelValidator... validators) {
		this.validators = Arrays.asList(validators);
	}

	public boolean validate(Resource eResource, DiagnosticChain diagnostics) {
		boolean isValid = true;
		for (IModelValidator validator : validators) {
			if (!validator.validate(eResource, diagnostics)) {
				isValid = false;
			}
		}
		return isValid;
	}
}
