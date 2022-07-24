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
# $Id: def.py 620 2016-03-14 15:51:56Z mtakada $
#

# Root Dir
ROOTDIR = "../../../../../.."

# Source Dir
SRCDIR = ROOTDIR + "/atk2-sc1/"

# Configfile name
CFGNAME = ['HelloAutosarWithCom_ECU2','target_hw_counter','target_serial','uart']

# Target board
TARGET = "hsbv850e2fg4_cx"

# Target mcu
#TARGET_MCU = 'uPD70F3580'
TARGET_MCU = 'uPD70F4002'

# Application files
app_app_files = ['Rte.c',
                 ROOTDIR + '/a-rtegen/sample/general/HelloAutosar/SWC2.c',
                 ROOTDIR + '/a-rtegen/sample/general/EcuM/C_Init_Code.c',
                 ROOTDIR + '/a-rtegen/sample/general/EcuM/EcuM.c',
                 ROOTDIR + '/a-rtegen/sample/general/EcuM/EcuM_StartupTask.c',
                 ROOTDIR + '/a-rtegen/sample/general/EcuM/Os_Hook.c',
                 ROOTDIR + '/a-comstack/com/Com.c',
                 ROOTDIR + '/a-comstack/canif/CanIf.c',
                 ROOTDIR + '/a-comstack/can/Can.c',
                 ROOTDIR + '/a-comstack/can/target/hsbv850e2fg4_cx/Can_Irq.c',
                 'Com_PBcfg.c',
                 'CanIf_PBcfg.c',
                 'CanIf_Lcfg.c',
                 'Can_PBcfg.c']

# Addition Dir list (relative path from srcdir)
USER_INCLUDE = ['../a-rtegen/sample/general/HelloAutosar',
                '../a-rtegen/sample/general/EcuM',
                '../a-comstack/com',
                '../a-comstack/pdur',
                '../a-comstack/canif',
                '../a-comstack/can',
                '../a-comstack/can/arch/fcn',
                '../a-comstack/can/arch/cx',
                '../a-comstack/can/target/hsbv850e2fg4_cx',
                '../a-comstack/stub',
                '../a-comstack/general']

# Addition Macro Definitions
USER_MACRO = ['TOPPERS_USE_COMSTACK']

# Copy sample1
COPY_SAMPLE1 = False
