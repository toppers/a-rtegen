
		TOPPERS/A-RTEGEN
		ユーザーズマニュアル

このドキュメントは，TOPPERS/A-RTEGENを使用するために必要な事項を説明
するものである．

----------------------------------------------------------------------
TOPPERS/A-RTEGEN
    Automotive Runtime Environment 

Copyright (C) 2013-2017 by Eiwa System Management, Inc., JAPAN

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

○目次

1. 概要
2．ディレクトリ構成・ファイル構成
	2.1 配布パッケージのディレクトリ構成
3．インストール手順
	3.1 開発環境の準備
	3.2 XMLスキーマの入手
4．A-RTEGENの使い方
5．A-RTEGENが使用するOSコンフィギュレーション
6. A-RTEGENが補完する入力情報

1．概要

AUTOSARにおけるSW-CおよびBSWMに提供されるランタイム環境として，以下の2つのモジュールがある．

・RTE(RunTime Environment)
・SCHM(Basic Software Scheduler)

A-RTEGENは，次世代車載システム向けにNCESで開発したA-RTEおよびA-SCHMを生成するツールである．

・A-RTE（Automotive RunTime Environment）
・A-SCHM（Automotive Basic Software Scheduler）

それぞれのモジュールに関する詳細は，「次世代車載システム向けRTE外部仕様書」を参照すること．

2．ディレクトリ構成・ファイル構成

2.1 配布パッケージのディレクトリ構成

	bin/
		bin/			A-RTEGENの実行プログラム(rtegen.sh)
		lib/			A-RTEGENの実行に必要となるライブラリ
		model/			A-RTEGENが内部的に使用するモデルファイル
		schema/			XMLスキーマファイル(「3.2 XMLスキーマの入手」の節参照)
	ecu_extractor/		EcuExtractor
						※詳細はecu_extractor/readme.txtを参照
	sample/				A-RTEGENを，TOPPERS/ATK2，TOPPERS/A-COMSTACKで
						使用するためのサンプルアプリケーション
						※詳細はsample/readme.txtを参照
	src/				A-RTEGENのソースプログラム
						※詳細はsrc/readme_dev.docを参照

3．インストール手順

ここでは，A-RTEGENを使用するまでの設定手順を示す．

3.1 開発環境の準備

A-RTEGENを用いたA-RTE/SCHMの生成には，以下のツールが必要である．

	ホストシステム用のツール
		Java Runtime Environment バージョン：1.7.0_45以降

3.2 XMLスキーマの入手

A-RTEGENを利用する場合は，AUTOSAR公開成果物より以下のXMLスキーマを入手し，
schemaディレクトリに配置する．
・AUTOSAR_4-0-3_STRICT.xsd
・xml.xsd
また他のディレクトリに上記ファイルがある場合は，schemaディレクトリに配置せず
次項のオプションパラメータ--schema-directoryを用いてXMLスキーマを指定することができる．

AUTOSAR_4-0-3_STRICT.xsdとxml.xsdは以下の手順で取得する．
  1) AUTOSAR公式Webサイトにアクセス(http://www.autosar.org/)
  2) Specificationsタブを選択
  3) 画面左部メニューよりRelease4.0を選択
  4) 画面左部メニューよりMethodology and Templatesを選択
  5) 画面左部メニューよりTemplatesを選択
  6) Standard Specificationsを選択
  7) AUTOSAR_MMOD_XMLSchema.zipをダウンロード

4．A-RTEGENの使い方

A-RTEGEN(rtegen.sh)の使い方は，以下の通りである．

rtegen.sh <file1> [<file2> [<file3>] ...] ... [--com-multicore] [--help] [--schema-directory <directory>] [--without-static-inline] [-o (--output-directory) <directory>] [-p (--generation-phase) <phase>] [-t (--output-timestamp)] [-v (--version)]

	 <file1> [<file2> [<file3>] ...]
		A-RTEGENの入力ファイル名(複数指定可)

	--com-multicore
		A-COMがマルチコア対応している場合に指定する〔nrte_sws_0334〕．

	--help
		オプションのリストと説明を表示する．

	--schema-directory <スキーマ配置ディレクトリパス名>
		スキーマファイルを配置するディレクトリのパス名を指定する．
		デフォルトは bin/schema/．

	--without-static-inline
		RTE APIをインライン展開しない場合に指定する〔nrte_sws_0273〕．

	-o［--output-directory］<出力ディレクトリパス名>
		生成したRTEを配置するディレクトリのパス名を指定する．
		デフォルトはカレントディレクトリ．

	-p［--generation-phase］<生成フェーズ種別>
		生成フェーズを指定する．GENERATE，もしくはCONTRACTのいずれか．
		デフォルトはGENERATE．

	-t [--output-timestamp]
		RTE/SCHMコードのヘッダコメントにコード生成日時を出力する場合に指定する．
		デフォルトはコード生成日時は出力されない．

	-v［--version］
		A-RTEGENのバージョンを表示する．


5．A-RTE/SCHMが内部的に使用するOSオブジェクト

A-RTE/SCHMの内部動作の実装のために，後述するのOSオブジェクトを使用する．
A-RTEGENに入力されたAUTOSAR XMLファイルにこれらのOSオブジェクトが含まれない場合，A-RTEGENはOSオブジェクトに対応するオブジェクトコンテナを含む以下のAUTOSAR XMLファイルを出力する．
・Rte_GeneratedEcuc.arxml (OSオブジェクトのオブジェクトコンテナを含む)
なお，データ型に関する下記のAUTOSAR XMLファイルは必ず出力する．
・Rte_InternalDataTypes.arxml (OSオブジェクトが使用するデータ型のコンテナを含む)

AUOTSAR XMLの出力仕様の詳細は，「次世代車載システム向けRTE外部仕様書」の「2.13	RTE/SCHMコード生成方針」の節を参照すること．


A-RTE/SCHMが内部的に使用するOSオブジェクトの一覧を以下に示す．


凡例: <OSオブジェクトのショートネーム>
		<A-RTE/SCHMによるOSオブジェクトの使用用途>

Rte_InternalSpinlock
	マルチコアシステムにおけるA-RTE内部の排他に使用するOSスピンロック．
	マルチコアシステムである場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComSendSignalProxyImmediateTask
	スレーブコアからのECU間連携の実現のために使用するOSタスク．
	スレーブコアからのECU間連携が行なわれ，COMシグナルが即時通信として設定されている場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComSendSignalProxyImmediateEvent
	スレーブコアからのECU間連携の実現のために使用するOSイベント．
	スレーブコアからのECU間連携が行なわれ，COMシグナルが即時通信として設定されている場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComSendSignalTf_<CS>
	(<CS> = COMシグナルのショートネーム)
	マスタコアの非信頼パーティションからのECU間連携の実現のために使用するOS信頼関数(プリミティブ実装データ型用)．
	マスタコアの非信頼パーティションからのECU関連携が行なわれる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComSendSignalGroupTf_<CS>
	(<CS> = COMシグナルグループのショートネーム)
	マスタコアの非信頼パーティションからのECU間連携の実現のために使用するOS信頼関数(複合データ型用)．
	マスタコアの非信頼パーティションからのECU関連携が行なわれる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．


Rte_SrWriteTf_<c1>_<p1>_<o1>_<c2>_<p2>_<o2>
	(<c1> = 送信側SW-Cのショートネーム，<p1> = 送信側ポートのショートネーム，<o1> = 送信側要素のショートネーム，
	 <c2> = 受信側SW-Cのショートネーム，<p2> = 受信側ポートのショートネーム，<o2> = 受信側要素のショートネーム)
	パーティション間のS/R連携のデータ送信の実現のために使用するOS信頼関数(データセマンティクス用)．
	パーティション間のS/R連携が行われる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_SrSendTf_<c1>_<p1>_<o1>_<c2>_<p2>_<o2>
	(<c1> = 送信側SW-Cのショートネーム，<p1> = 送信側ポートのショートネーム，<o1> = 送信側要素のショートネーム，
	 <c2> = 受信側SW-Cのショートネーム，<p2> = 受信側ポートのショートネーム，<o2> = 受信側要素のショートネーム)
	パーティション間のS/R連携のデータ送信の実現のために使用するOS信頼関数(イベントセマンティクス用)．
	パーティション間のS/R連携が行われる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_SrInvalidateTf_<c1>_<p1>_<o1>_<c2>_<p2>_<o2>
	(<c1> = 送信側SW-Cのショートネーム，<p1> = 送信側ポートのショートネーム，<o1> = 送信側要素のショートネーム，
	 <c2> = 受信側SW-Cのショートネーム，<p2> = 受信側ポートのショートネーム，<o2> = 受信側要素のショートネーム)
	パーティション間のS/R連携のデータ無効化の実現のために使用するOS信頼関数．
	パーティション間のS/R連携が行われ，かつ送信側データ要素のデータ無効化が有効である場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_CsCallTf_<c>
	(<c> = サーバー側SW-Cのショートネーム)
	パーティション間のC/S連携のサーバーランナブル呼び出しの実現のために使用するOS信頼関数．
	パーティション間のC/S連携が行われ，かつクライアント側のSW-Cの所属パーティションが非信頼パーティションである場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComProxy<PI>_<PID>
	(<PI>=即時送信ありの場合 Immediate．即時送信なしの場合 Periodic,
     <PID> = 送信側SW-Cの所属するパーティションのショートネーム)
	スレーブコアからのECU間連携の実現のために使用するIOC．
	スレーブコアからのECU間連携が行なわれる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_ComProxy<PID>_<c>_<p>_<o>_<CS>
	(<PID> = 送信側SW-Cの所属するパーティションのショートネーム，
	 <c> = 送信側SW-Cのショートネーム，<p> = 送信側ポートのショートネーム，<o> = 送信側要素のショートネーム，
     <CS> = COMシグナル使用時 COMシグナルのショートネーム，COMシグナルグループ使用時 COMシグナルグループのショートネーム)
	スレーブコアからのECU間連携の実現のために使用するIOC．
	スレーブコアからのECU間連携が行なわれる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．

Rte_Sr_<c>_<p>_<o>
	(<c> = 受信側SW-Cのショートネーム，<p> = 受信側ポートのショートネーム，<o> = 受信側要素のショートネーム)
	パーティション間のS/R連携の実現のために使用するIOC．
	パーティション間のS/R連携が行われる場合，本OSオブジェクトのためのオブジェクトコンテナが生成される．


6. A-RTEGENが補完する入力情報

A-RTE/SCHMのソースコード生成にあたり，下記の情報が不足している場合には，A-RTEGENは入力情報を補完する．
・QueuedReceiverComSpec
	QueuedReceiverComSpecが入力情報の必要箇所に定義されていない場合，キュー長(queueLength)を1として
	入力情報を補完する．

