
	A-RTEGEN用サンプルアプリケーション

本ドキュメントは，A-RTEGEN用サンプルアプリケーションを使用するために必
要な事項を説明するものである．

----------------------------------------------------------------------
TOPPERS/A-RTEGEN
    Automotive Runtime Environment Generator

Copyright (C) 2013-2017 by Center for Embedded Computing Systems
            Graduate School of Information Science, Nagoya Univ., JAPAN
Copyright (C) 2014-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
Copyright (C) 2014-2016 by eSOL Co.,Ltd., JAPAN
Copyright (C) 2013-2017 by FUJI SOFT INCORPORATED, JAPAN
Copyright (C) 2014-2017 by NEC Communication Systems, Ltd., JAPAN
Copyright (C) 2013-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
Copyright (C) 2014-2017 by SCSK Corporation, JAPAN
Copyright (C) 2013-2016 by Sunny Giken Inc., JAPAN
Copyright (C) 2015-2017 by SUZUKI MOTOR CORPORATION
Copyright (C) 2013-2017 by TOSHIBA CORPORATION, JAPAN
Copyright (C) 2013-2017 by Witz Corporation

上記著作権者は，以下の (1)〜(3)の条件を満たす場合に限り，本ドキュメ
ント（本ドキュメントを改変したものを含む．以下同じ）を使用・複製・改
変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
(1) 本ドキュメントを利用する場合には，上記の著作権表示，この利用条件
    および下記の無保証規定が，そのままの形でドキュメント中に含まれて
    いること．
(2) 本ドキュメントを改変する場合には，ドキュメントを改変した旨の記述
    を，改変後のドキュメント中に含めること．ただし，改変後のドキュメ
    ントが，TOPPERSプロジェクト指定の開発成果物である場合には，この限
    りではない．
(3) 本ドキュメントの利用により直接的または間接的に生じるいかなる損害
    からも，上記著作権者およびTOPPERSプロジェクトを免責すること．また，
    本ドキュメントのユーザまたはエンドユーザからのいかなる理由に基づ
    く請求からも，上記著作権者およびTOPPERSプロジェクトを免責すること．

本ドキュメントは，AUTOSAR（AUTomotive Open System ARchitecture）仕様
に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するものではな
い．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利用する
者に対して，AUTOSARパートナーになることを求めている．

本ドキュメントは，無保証で提供されているものである．上記著作権者およ
びTOPPERSプロジェクトは，本ドキュメントに関して，特定の使用目的に対す
る適合性も含めて，いかなる保証も行わない．また，本ドキュメントの利用
により直接的または間接的に生じたいかなる損害に関しても，その責任を負
わない．

$Id: readme.txt 822 2017-03-15 07:20:08Z mtakada $
----------------------------------------------------------------------

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(1) 概要
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

A-RTEGENでは，A-RTEGENを使用して生成したコードを，TOPPERS/ATK2，
TOPPERS/A-COMSTACKと結合して使用する方法を確認するためのサンプルアプリ
ケーションを同梱する．また，サンプルアプリケーションをコード生成するた
めの手順も複雑であることから，実行するコマンドは，各サンプル毎にシェル
スクリプト(configure.sh)に記述している．各サンプルの説明は，
configure.sh内にコメントとして記述している．

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(2) 使い方
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
———————————————————————————————————
(2.1) 動作環境
———————————————————————————————————

TOPPERS/ATK2を入手し，付属のサンプルプログラムが動作する環境を構築する．
また，ATK2付属のXML生成ツール(ABREX)も使用するため，Rubyも必要となる．

※現時点での動作確認環境は以下
・TOPPERS/ATK2-SC1 (nios2_dev_gcc依存部)
・TOPPERS/ATK2-SC3 (nios2_dev_gcc依存部)
・TOPPERS/ATK2-SC1-MC (nios2_dev_gcc依存部)
・TOPPERS/ATK2-SC3-MC (nios2_dev_gcc依存部)

———————————————————————————————————
(2.2) フォルダ構成
———————————————————————————————————

TOPPERS/ATK2，TOPPERS/A-COMSTACKを入手し，以下のように同一フォルダ内に
配置する．複数ECUを使用したサンプルアプリケーションを使用しない場合は，
A-COMSTACKは不要である．

┣ a-comstack               ：A-COMSTACK (a-comstack-1.3.0.tar.gz)
┣ a-wdgstack               ：A-WDGSTACK (a-wdgstack-1.1.1.tar.gz)
┣ a-rtegen                 ：A-RTEGEN (a-rtegen-1.3.0.tar.gz)
┃ ┣ bin                    ：RTEジェネレータ
┃ ┗ sample                 ：サンプルアプリケーション
┃     ┣ general            ：共通コード
┃     ┃  ┣ EcuM            ：ECUステートマネージャコード
┃     ┃  ┗ HelloAutosar    ：HelloAutosar用共通ファイル
┃     ┃      ┗ performance ：性能評価用プログラム
┃     ┣ sc1                ：ATK2-SC1用サンプルアプリケーション
┃     ┣ sc1-mc             ：ATK2-SC1-MC用サンプルアプリケーション
┃     ┣ sc3                ：ATK2-SC3用サンプルアプリケーション
┃     ┗ sc3-mc             ：ATK2-SC3-MC用サンプルアプリケーション
┣ atk2-sc1                 ：ATK2-SC1 (atk2-sc1-1.4.0.tar.gz)
┣ atk2-sc1-mc              ：ATK2-SC1-MC (atk2-sc1-mc-1.4.0.tar.gz)
┣ atk2-sc3                 ：ATK2-SC3 (atk2-sc3-1.4.0.tar.gz)
┗ atk2-sc3-mc              ：ATK2-SC3-MC (atk2-sc3-mc-1.4.0.tar.gz)

各サンプルアプリケーションフォルダ内に，サンプル毎にフォルダがあり，そ
れぞれのフォルダにconfigure.shがあるので，サンプルの詳細は，
configure.shを参照すること．HelloAutosarおよびHelloAutosarWithComは，
すべてのSC，マルチコア構成において，共通事項が多いことから，本ファイル
にまとめて記述する．

———————————————————————————————————
(2.3) 実行方法
———————————————————————————————————
----------------------------------------------------------------------
(2.3.1) 環境変数
----------------------------------------------------------------------

リンボリックリンクを利用してフォルダ構成を設定した場合，A-RTEGENのサンプルにある、
configureを実行する際にBSWのパス情報が正しく取得できない場合がある。
その場合はsampleフォルダにあるsetvars.shを使って，A-RTEGENが置かれたフォルダの
フルパスを環境変数(TOPPERS_PATH)として設定する。

$ source setvars.sh

環境変数が設定されていない場合は、A-RTEGENからの相対パスでBSWを指定する。

----------------------------------------------------------------------
(2.3.2) コード生成
----------------------------------------------------------------------

configure.shを実行することにより，各コードを生成する．
※生成するコードはサンプルによって異なる．

$ sh configure.sh

生成したコードを一括削除する場合は，"del"を引数に与えて実行する．

$ sh configure.sh del

----------------------------------------------------------------------
(2.3.3) ビルド
----------------------------------------------------------------------

configure.shによって，ATK2用Makefileが生成されるので，makeによりビルド
を行う．

$ make depend
$ make

----------------------------------------------------------------------
(2.3.4) 実行
----------------------------------------------------------------------

ターゲットに応じた実行方法でビルドしたモジュールを実行する．
nios2_dev_gcc依存部の場合，makeのrunルールで実行可能である．

$ make run

複数のDE2-115を，1台のホストPCに接続して，複数ECUを使用するサンプルを実
行する場合，以下のルールでそれぞれ並行して実行可能である．

＜ECU1＞
$ make run1

＜ECU2＞
$ make run2

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(3) HelloAutosar
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

———————————————————————————————————
(3.1) サンプルアプリケーション概要
———————————————————————————————————

HelloAutosarは2つのSW-Cに1つずつ1秒毎に起動するランナブルが存在し，デー
タを送受信するだけの最もシンプルなサンプルである．起動状況を確認するた
めに，ATK2でサポートされているsyslogを使って，コンソールに実行ログを表
示する．したがって，syslogをサポートしているターゲットであれば，使用す
ことができる．実行方法は，他のサンプルと同じである．

＜シングルコア＞
・1コア上で500msの時間差を付けて，SW-C1とSW-C2を交互に起動する．

＜マルチコア＞
・2コア使用し，各コア上でSW-C1とSW-C2をそれぞれ起動する．

＜メモリ保護＞
・SW-C1，SW-C2ともに非信頼パーティションとする．
※YAMLファイルを修正することにより，信頼パーティションへ変更できる．

———————————————————————————————————
(3.2) SW-C構成
———————————————————————————————————

・SWC1
  - 1秒に1回，RunnableEntity1を起動する
  - SWC2に対して1回起動する度にインクリメントした値を送信する
  - 送信した値をsyslogで表示する

・SWC2
  - 1秒に1回，RunnableEntity2を起動する
  - SWC1からデータを受信する
  - 受信した値をsyslogで表示する

———————————————————————————————————
(3.3) ファイル構成
———————————————————————————————————

以下のファイルは，sample/general/HelloAutosarに格納している．

・SystemDesk.arxml
  - SystemDeskで作成したシステムディスクリプションファイル

・SWC1.c
  - SWC1実装コード

・SWC2.c
  - SWC2実装コード

・HA_TopLevel.png
  - SystemDeskによるSW-C構成図

以下のファイルは，SC，マルチコア構成によって内容が異なるため，それぞれ
のフォルダに格納している．

・HelloAutosar.yaml
  - OS，RTEのコンフィギュレーションファイル

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(4) HelloAutosarWithCom
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

———————————————————————————————————
(4.1) サンプルアプリケーション概要
———————————————————————————————————

HelloAutosarWithComは，1つのSW-C1に1秒毎に起動するランナブルが存在する
ECUが2つ存在し，ECU間でデータを送受信するサンプルである．ECU間通信を使
用するため，COMスタックを使用する．現状のA-COMSTACKでは，nios2_dev_gcc
依存部のみサポートしている．

＜シングルコア＞
・各ECU上でSW-C1とSW-C2をそれぞれ起動する．

＜マルチコア＞
・2コア使用し，各ECU上のスレーブコアでSW-C1とSW-C2をそれぞれ起動する．
※YAMLファイルを修正することにより，マスタコアでの起動へ変更できる．

＜メモリ保護＞
・SW-C1，SW-C2ともに非信頼パーティションとする．
※YAMLファイルを修正することにより，信頼パーティションへ変更できる．

———————————————————————————————————
(4.2) SW-C構成
———————————————————————————————————

HelloAutosarと同じSW-Cを使用する．

———————————————————————————————————
(4.3) ファイル構成
———————————————————————————————————

以下のファイルは，sample/general/HelloAutosarに格納している．

・SystemDesk_WithCom.arxml
  - SystemDeskで作成したシステムディスクリプションファイル

・SystemDesk_WithCom_EcuInstance1.arxml
  - EcuExtractorによって抽出したECU1(送信)用ディスクリプションファイル

・SystemDesk_WithCom_EcuInstance2.arxml
  - EcuExtractorによって抽出したECU2(受信)用ディスクリプションファイル

・SWC1.c
  - SWC1実装コード

・SWC2.c
  - SWC2実装コード

・HA_TopLevel.png
  - SystemDeskによるSW-C構成図

以下のファイルは，SC，マルチコア構成によって内容が異なるため，それぞれ
のフォルダに格納している．

・HelloAutosarWithCom_ECU1.yaml
  - OS，RTE，COMのECU1(送信)用コンフィギュレーションファイル

・HelloAutosarWithCom_ECU2.yaml
  - OS，RTE，COMのECU2(送信)用コンフィギュレーションファイル

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(5) PowerWindowController2WithWdg
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

———————————————————————————————————
(5.1) サンプルアプリケーション概要
———————————————————————————————————

PowerWindowController2WithWdgは，KEY操作による窓の開閉要求に基づいた窓
の開閉状態をLEDで模擬したサンプルである．
SW17～15の何れかをONにすることにより，ロック機能を模擬し，KEY操作によ
る窓の開閉要求を受け付けなくなる．各SWは以下のWatchdogの監視機能も付随
する．
SW17をONにすることによりアライブ監視異常を引き起こし，一定時間が経過し
た場合リセットが発生する．一定時間が経過するまでにOFFにすることで，故
障から復帰したと見なしてリセットが発生しない．
SW16をONにすることによりデッドライン監視が開始する．一定時間経過後にSW
をOFFにするとデッドライン監視異常と見なしリセットが発生する．一定時間
経過前にSWをOFFにするとデッドライン監視正常と見なしリセットが発生しな
い．
SW15をONにすることによりロジカル監視異常を引き起こし，リセットが発生す
る．SWをOFFにしてもロジカル監視異常から復帰することはなく必ずリセット
が発生する．

———————————————————————————————————
(5.2) SW-C構成
———————————————————————————————————

・CddButton
  - KEY0，KEY1の状態を取得する
・SensorButton
  - 運転席ロックスイッチがONの場合は，ロックライトを点灯し，開閉指示をしない
  - 運転席ロックスイッチがOFFの場合は，ロックライトを消灯し，
    KEY0，KEY1の状態からPowerWindowControllerへ開閉の要求を出す
・PowerWindowController
  - SensorButtonから要求を受け取り，CddWindowへ開閉の指示を出す
・CddWindow
  - PowerWindowControllerから情報を受け取り，GREEN LEDに開閉の様子を表現する
・CddLockLed
  - RED LED17にロック状態の様子を表現する
・CddLockSwitch
  - SW17～SW15の状態を取得する

———————————————————————————————————
(5.3) ファイル構成
———————————————————————————————————

・SystemDesk.arxml
  - SystemDeskで作成したシステムディスクリプションファイル
・CddButton.c
  - CddButton実装コード
・SensorButton.c
  - SensorButton実装コード
・PowerWindowController.c
  - PowerWindowController実装コード
・CddWindow.c
  - CddWindow実装コード
・CddLockLed.c
  - CddLockLed実装コード
・CddLockSwitch.c
  - CddLockSwitch実装コード
・PWCTopLevel.png
  - SystemDeskによるSW-C構成図
・PowerWindowController2.yaml
  - OS，RTEのコンフィギュレーションファイル
#

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(6) WatchdogDemo
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

———————————————————————————————————
(6.1) サンプルアプリケーション概要
———————————————————————————————————

WatchdogDemoはロジカル監視およびデッドライン監視動作のサンプルである．
・SWを操作してLEDを点灯させる
・SW操作順の表示前にスイッチ操作した場合，A-WDGSTACKによるリセットが発生
・SWが特定の順番，一定タイミング(前回のスイッチ操作から1秒以上5秒以内)で操作されなかった場合，
  A-WDGSTACKによるリセットが発生

＜操作方法＞
・KEY3：押している間，スイッチの操作順をLEDで表示
・SW0～9：LED表示操作スイッチ

———————————————————————————————————
(6.2) SW-C構成
———————————————————————————————————

・CddButton
  - KEY3の状態を取得する
・SensorButton
  - SW0～9の状態に応じてLEDR0～9を点灯する
  - KEY3が押されている間，LEDR0～9を順に点灯する
・CddLockLed
  - LEDRにSW状態を表現する
・CddLockSwitch
  - SWの状態を取得する

———————————————————————————————————
(6.3) ファイル構成
———————————————————————————————————

・SystemDesk.arxml
  - SystemDeskで作成したシステムディスクリプションファイル
・CddButton.c
  - CddButton実装コード
・SensorButton.c
  - SensorButton実装コード
・CddLockLed.c
  - CddLockLed実装コード
・CddLockSwitch.c
  - CddLockSwitch実装コード
・PWCTopLevel.png
  - SystemDeskによるSW-C構成図
・WatchdogDemo.yaml
  - OS，RTEのコンフィギュレーションファイル

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(7) 性能評価
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

構成によって，HelloAutosar，HelloAutosarWithComで生成されるRTE APIの実
行時間がどの程度変化するかを計測する性能評価プログラムを以下のフォルダ
に用意している．
sample/general/HelloAutosar/performance

時間計測には，ATK2に付属している実行時間分布集計モジュール(histogram.c)
を使用する．性能評価はキャッシュの取り扱い，メモリ配置など，ターゲット
に依存した要素が多いので，performanceの下にさらにターゲットに依存したソ
ースコードを配置する構成とする．
※現状，nios2_dev_gcc依存部にのみ対応している．

HelloAutosar，HelloAutosarWithComにおいては，configure.shにperfオプショ
ンを付与して実行することで，性能評価プログラムが使用された実行モジュー
ルが生成される．ビルドや実行方法は他のサンプルと同じである．

$ sh configure.sh perf

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(8) 注意事項
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
———————————————————————————————————
(8.1) xxx_MemMap.hに関して
———————————————————————————————————

AUTOSARでは，各SW-Cのメモリ配置指定のために，xxx_MemMap.hというヘッダフ
ァイルを，RTEモジュールからincludeするとAUTOSAR仕様で規定されている．
※xxxはSW-C名

しかし，ATK2においてはメモリ配置にxxx_MemMap.hを使用しないため，全サン
プルには，空のxxx_MemMap.hを用意している．
configure.shでは，xxx_MemMap.hについては説明しない．

———————————————————————————————————
(8.2) configure.sh実行時のエラー
———————————————————————————————————

コード生成に使用する各ツールの実行権限が無いと，configure.sh実行時に権
限エラーとなる．この場合，chmodコマンド等を使用して，実行権限を与えてか
らconfigure.shを実行する．



以上
