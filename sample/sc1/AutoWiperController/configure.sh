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
# ＜サンプルアプリケーション概要＞
# ・ATK2のnios2_dev_gcc依存部でサポートされるDE2-115ボードでのみ動作する
# ・DE2-115ボード上のLED，スイッチなどを使用してレインセンサによるオート
#   ワイパーを模擬する
#
# ＜操作方法＞
# ・KEY0：降雨量を減らす
# ・KEY1：降雨量を増やす
# ・SW13：オートモード
# ・SW14：マニュアルモード/速度4
# ・SW15：マニュアルモード/速度3
# ・SW16：マニュアルモード/速度2
# ・SW17：マニュアルモード/速度1
# ・7SEG LED：雨が振る様子を表現
# ・RED LED：ワイパーの動きを表現
# ・GREEN LED：現在の降雨量を表示(降雨量は4段階)
#
# ＜SW-C構成＞
# ・CddWiperSwitch
#   - SW13〜SW17の状態を取得する
# ・CddRainSensor
#   - KEY0，KEY1の状態から降雨量を変化させる
#   - 現在の降雨量をGREEN LEDに表示する
# ・AutoWiperController
#   - CddWiperSwitch，CddRainSensorから情報を受け取り，ワイパーを制御する
# ・CddDisplayRain
#   - CddRainSensorから情報を受け取り，7SEG LEDに現在の雨が振る様子を表現する
# ・CddWiperActuator
#   - AutoWiperControllerからの支持により，RED LEDにワイパーの動きを表現する
#
# ＜ファイル構成＞
# ・SystemDesk.arxml
#   - SystemDeskで作成したシステムディスクリプションファイル
# ・AutoWiperController.c
#   - AutoWiperController実装コード
# ・CddDisplayRain.c
#   - CddDisplayRain実装コード
# ・CddRainSensor.c
#   - CddRainSensor実装コード
# ・CddWiperActuator.c
#   - CddWiperActuator実装コード
# ・CddWiperSwitch.c
#   - CddWiperSwitch実装コード
# ・AWCTopLevel.png
#   - SystemDeskによるSW-C構成図
# ・AutoWiperController.yaml
#   - OS，RTEのコンフィギュレーションファイル
#


#
# 各定義
#

# 環境変数が設定されていない場合は、A-RTEGENフォルダの相対パス
if [ -z "${TOPPERS_SRC+x}" ] ; then
	TOPPERS_SRC=../../../..
fi

# OSソースコードまでのパス
OS_PATH=$TOPPERS_SRC/atk2-sc1

# A-RTEGENまでのパス
RTE_PATH=$TOPPERS_SRC/a-rtegen

# 共通ソースコードまでのパス
GENERAL_PATH=$RTE_PATH/sample/general

# ターゲット名
TARGET=nios2_dev_gcc

# アプリケーション名(OSコンフィギュレーションファイル名)
APPLICATION=AutoWiperController

# ビルドモジュール名
MODULE="AutoWiperController.o CddDisplayRain.o CddRainSensor.o CddWiperActuator.o CddWiperSwitch.o"


#
# 生成コード一括削除処理
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* Makefile* $APPLICATION.arxml
	exit
fi


#
# コード生成
#

# configureスクリプトによるMakefile作成
perl $OS_PATH/configure -T $TARGET -A Rte \
	-a "$GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar" \
	-C $APPLICATION \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o"

# ABREXによるARXMLの作成
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml

# A-RTEGENによるA-RTEモジュール作成
../../../bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml ./SystemDesk.arxml $APPLICATION.arxml
