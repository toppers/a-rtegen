#!/bin/sh
#
#  TOPPERS/A-RTEGEN
#      Automotive Runtime Environment Generator
#
#  Copyright (C) 2013-2017 by Center for Embedded Computing Systems
#              Graduate School of Information Science, Nagoya Univ., JAPAN
#  Copyright (C) 2014-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
#  Copyright (C) 2014-2016 by eSOL Co.,Ltd., JAPAN
#  Copyright (C) 2013-2017 by FUJI SOFT INCORPORATED, JAPAN
#  Copyright (C) 2014-2017 by NEC Communication Systems, Ltd., JAPAN
#  Copyright (C) 2013-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
#  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
#  Copyright (C) 2014-2017 by SCSK Corporation, JAPAN
#  Copyright (C) 2013-2016 by Sunny Giken Inc., JAPAN
#  Copyright (C) 2015-2017 by SUZUKI MOTOR CORPORATION
#  Copyright (C) 2013-2017 by TOSHIBA CORPORATION, JAPAN
#  Copyright (C) 2013-2017 by Witz Corporation
#
#  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
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
# $Id: configure.sh 822 2017-03-15 07:20:08Z mtakada $
#

#
# 各定義
#

# 環境変数が設定されていない場合は、A-RTEGENフォルダの相対パス
if [ -z "${TOPPERS_SRC+x}" ] ; then
	TOPPERS_SRC=../../../../..
fi

# OSソースコードまでのパス
OS_PATH=$TOPPERS_SRC/atk2-sc3

# A-RTEGENまでのパス
RTE_PATH=$TOPPERS_SRC/a-rtegen

# 共通ソースコードまでのパス
GENERAL_PATH=$RTE_PATH/sample/general

# A-COMSTACKまでの相対パス
COMSTACK_PATH=$TOPPERS_SRC/a-comstack

# ターゲット名
TARGET=nios2_dev_gcc

# アプリケーション名(OSコンフィギュレーションファイル名)
APPLICATION=HelloAutosarWithCom_ECU1

# ビルドモジュール名
MODULE="SWC1.o Rte_Partition_EcucPartition_Rte.o Rte_Partition_EcucPartition_SWC1.o"

# A-COMソースコードまでの相対パス
COM_PATH=$COMSTACK_PATH/com

# A-PDURソースコードまでの相対パス
PDUR_PATH=$COMSTACK_PATH/pdur

# A-CANIFソースコードまでの相対パス
CANIF_PATH=$COMSTACK_PATH/canif

# A-CANソースコードまでの相対パス
CAN_PATH=$COMSTACK_PATH/can

# その他必要なソースコードまでの相対パス
COM_STUB_PATH=$COMSTACK_PATH/stub
COM_GENERAL_PATH=$COMSTACK_PATH/general

# A-COMSTACKで必要なモジュール
MODULE="$MODULE Com.o Com_PBcfg.o CanIf.o CanIf_PBcfg.o CanIf_Lcfg.o Can.o Can_Irq.o Can_PBcfg.o"


#
# 性能評価用定義
#
CMP_OPT="-o -DTOPPERS_USE_COMSTACK"
if [ $1 ] && [ $1 == "perf" ]
then
	MODULE="$MODULE histogram.o measure_swc1.o trusted_functions.o"
	ADD_YAML="$GENERAL_PATH/HelloAutosar/performance/trusted_functions.yaml \
			  $GENERAL_PATH/HelloAutosar/performance/accessing_alarm1.yaml"
	INCLUDE="$GENERAL_PATH/HelloAutosar/performance $GENERAL_PATH/HelloAutosar/performance/$TARGET"
	CFG_OPT="-s"
	CMP_OPT="$CMP_OPT -DTOPPERS_PERFORMANCE -DMEASURE_100_NANO -DOTHER_PRC_SVC_TABLE=perf_add_syssrv.h -DUSE_KERNEL_LIBRARY_SYSLOG"
fi


#
# 生成コード一括削除処理
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* SchM* Com* PduR* CanIf* Can* Makefile* $APPLICATION.arxml
	exit
fi


#
# コード生成
#

# ABREXによるARXMLの作成
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml $ADD_YAML

# A-RTEGENによる必要なIOC生成
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance1.arxml $APPLICATION.arxml

# Rte_GeneratedEcuc.arxmlが生成される場合は，makefileとA-RTEに追加
if [ -e Rte_GeneratedEcuc.arxml ]
then
	RTE_GENERATED=Rte_GeneratedEcuc
	RTE_GENERATED_ARXML=Rte_GeneratedEcuc.arxml
else 
	RTE_GENERATED=
	RTE_GENERATED_ARXML=
fi

# configureスクリプトによるMakefile作成
perl $OS_PATH/configure -T $TARGET -A Rte $CFG_OPT \
	-a "$COM_PATH $PDUR_PATH $CANIF_PATH $CAN_PATH/target/$TARGET $CAN_PATH $COM_STUB_PATH $COM_GENERAL_PATH $GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar $INCLUDE" \
	-C "$APPLICATION $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance1 Rte_InternalDataTypes $RTE_GENERATED" \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o" "$CMP_OPT"

# A-RTEGENによるA-RTEモジュール作成
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance1.arxml $APPLICATION.arxml Rte_InternalDataTypes.arxml $RTE_GENERATED_ARXML

# A-COMジェネレータによるA-COMモジュール作成
echo "Generate Com"
$OS_PATH/cfg/cfg/cfg --omit-symbol --pass 2 --kernel atk2 --ini-file $COM_PATH/com.ini --api-table $COM_PATH/com.csv -T $COM_PATH/com.tf $APPLICATION.arxml

# A-PDURジェネレータによるA-PDURモジュール作成
echo "Generate PduR"
$OS_PATH/cfg/cfg/cfg --omit-symbol --pass 2 --kernel atk2 --ini-file $PDUR_PATH/pdur.ini --api-table $PDUR_PATH/pdur.csv -T $PDUR_PATH/pdur.tf $APPLICATION.arxml

# A-CANIFジェネレータによるA-CANIFモジュール作成
echo "Generate CanIf"
$OS_PATH/cfg/cfg/cfg --omit-symbol --pass 2 --kernel atk2 --ini-file $CANIF_PATH/canif.ini --api-table $CANIF_PATH/canif.csv -T $CANIF_PATH/canif.tf $APPLICATION.arxml

# A-CANジェネレータによるA-CANモジュール作成
echo "Generate Can"
$OS_PATH/cfg/cfg/cfg --omit-symbol --pass 2 --kernel atk2 --ini-file $CAN_PATH/can.ini --api-table $CAN_PATH/can.csv -I $CAN_PATH -T $CAN_PATH/target/$TARGET/Can_Target.tf $APPLICATION.arxml $OS_PATH/target/$TARGET/target_hw_counter.arxml
