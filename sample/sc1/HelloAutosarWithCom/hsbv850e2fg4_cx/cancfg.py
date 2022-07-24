#!python
# -*- coding: euc-jp -*-
#
#  TOPPERS ATK2
#      Toyohashi Open Platform for Embedded Real-Time Systems
#      Automotive Kernel Version 2
#
#  Copyright (C) 2013-2016 by Center for Embedded Computing Systems
#              Graduate School of Information Science, Nagoya Univ., JAPAN
#  Copyright (C) 2014-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
#  Copyright (C) 2013-2016 by FUJI SOFT INCORPORATED, JAPAN
#  Copyright (C) 2014-2016 by NEC Communication Systems, Ltd., JAPAN
#  Copyright (C) 2013-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
#  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
#  Copyright (C) 2014-2016 by SCSK Corporation, JAPAN
#  Copyright (C) 2013-2016 by Sunny Giken Inc., JAPAN
#  Copyright (C) 2013-2016 by TOSHIBA CORPORATION, JAPAN
#  Copyright (C) 2013-2016 by Witz Corporation
#
#  上記著作権者は，以下の(1)～(4)の条件を満たす場合に限り，本ソフトウェ
#  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
#  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
#  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
#      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
#      スコード中に含まれていること．
#  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
#      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
#      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
#      の無保証規定を掲載すること．
#  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
#      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
#      と．
#    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
#        作権表示，この利用条件および下記の無保証規定を掲載すること．
#    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
#        報告すること．
#  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
#      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
#      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
#      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
#      免責すること．
#
#  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
#  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
#  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
#  用する者に対して，AUTOSARパートナーになることを求めている．
#
#  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
#  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
#  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
#  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
#  の責任を負わない．
#
# $Id: cancfg.py 620 2016-03-14 15:51:56Z mtakada $
#

import os.path
import os
import subprocess
import sys
import time

os.chdir(os.path.dirname(project.Path))

common.Source("./def.py")

src_abs_path = os.path.abspath(SRCDIR)
wd_abs_path = os.path.abspath('.')
proj_rel_dir = ""

common.Source(src_abs_path + "/arch/cx/common.py")

project.Create(wd_abs_path + "\\cancfg\\cfg",
				MicomType.V850, 
				TARGET_MCU, 
				ProjectKind.Application,
				Compiler.CX,
				False)

str = src_abs_path + '\\' + statup_file
project.File.Add(str, u"スタートアップ")

project.File.Add("cfg1_out.c", u"configuration")

project.Close(True)

inputstr = ReadFile('./cancfg/cfg.mtpj')

inputstr = NewSetCxIncludes(inputstr, cfg_rel_includes, INCLUDES, "../" + SRCDIR)
inputstr = NewSetCxIncludes(inputstr, cfg_rel_includes, ['.', 'arch/fcn', 'target/hsbv850e2fg4_cx'], '../../../../../../a-comstack/can/')
inputstr = ChangeItemXml(inputstr, 'OutputMessageFormat-0', '%Program% %Options%')
inputstr = ChangeItemXml(inputstr, 'UseProEpiRuntimeLibrary-0', 'False')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileFormat-0','MotrolaSType32Bit')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileName-0', 'cfg1_out.srec')
inputstr = ChangeItemXml(inputstr, 'OutputLinkMapFile-0', 'True')
inputstr = ChangeItemXml(inputstr, 'OutputSymbolInformationToLinkMapFile-0', 'True')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileOutputFolder-0', '.')
inputstr = NewSetDefine(inputstr, USER_MACRO)

WriteFile('./cancfg/cfg.mtpj', inputstr)

project.Open('./cancfg/cfg.mtpj')

cfg_command = cfg + " --pass 1 " + "--kernel " + CFG_KERNEL 
cfg_command += " --api-table " + cfg_api_table
cfg_command += " " + cfg_cfg1_def_tables + " --cfg1-def-table ../../../../../../a-comstack/can/arch/fcn/prc_def.csv " + cfg_includes 
cfg_command += " --ini-file " + cfg_ini_file
cfg_command += " " + cfg_input_str

print cfg_command

try:
	output = subprocess.check_output(cfg_command, stderr=subprocess.STDOUT)
except subprocess.CalledProcessError, e:
	print "ERROR!! : ", e.output

print output

if build.All():

	inputfile = open("./cancfg/DefaultBuild/cfg.map")
	outputfile = open("./cfg1_out.syms", 'w')

	r = re.compile("^\s+\d+\s+(0x[0-9a-f]+)\s+0x[0-9a-f]+\s+\w+\s+\w+\s+(\w+)")
	line = inputfile.readline() 
	while line:
		line = line.replace('\r\n','')   #delete newline
		m = r.search(line)
		if m:
			outputfile.write(m.group(1) + " T " + m.group(2) + "\n")
		line = inputfile.readline()

	inputfile.close()
	outputfile.close()

project.Close(True)
CubeSuiteExit()
time.sleep(1)
