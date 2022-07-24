
	ECU Extractor

本ドキュメントは，ECU Extractorを使用するために必要な事項を説明するもの
である．

----------------------------------------------------------------------
ECU Extractor

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
(1) ECU Extractor概要
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

ECU Extractorは，複数のECUを有するシステムコンフィギュレーションファイ
ル(XML)から，ECU毎のコンフィギュレーションファイルであるEcuExtractを，
ECU毎に切り出して生成する．

なお，本ツールで生成したEcuExtractは，A-RTEGEN及びECUコンフィギュレーション
自動生成ツールへの入力とすることを想定している。
A-RTEGENではECU-INSTANCEを必要としないが，ECUコンフィギュレーションツールでは
該当ECUの情報が必要となるため，対象ECU以外のECU-INSTANCEの定義は本ツールによって削除する．

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
(2) 使い方
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
———————————————————————————————————
(2.1) 動作環境
———————————————————————————————————

ECU ExtractorはRubyによって記述されているため，Rubyの実行環境が必要であ
る．RubyInstaller for Windows から配布されている以下のバージョンで動作確認済みである．

ruby 2.0.0p645 (2015-04-13) [i386-mingw32]

———————————————————————————————————
(2.2) EcuExtract作成
———————————————————————————————————

SystemDesk等で作成したシステムコンフィギュレーションファイルを引数とし
て与え，実行する．

$ ruby ecu_extractor.rb SystemDesign.arxml

各ECUインスタンスに設定されたショートネームを付与した名前で，指定したフ
ァイルと同じフォルダに，ECU毎にEcuExtractを作成する．
複数のarxmlを引数に指定した場合，AR-PACKAGEレベルでのマージを行った上で，
EcuExtractを作成する．この場合，出力するファイル名は，先頭の引数で与え
たファイル名を採用する．

———————————————————————————————————
(2.3) 注意事項
———————————————————————————————————

ECU Extractorは，コンポジションが1つしか存在しないシステムを想定して開
発した．また，複雑なシステム設計には対応できない可能性があるので注意す
る．



以上
