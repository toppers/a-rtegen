#!ruby -Ku
#
#  ECU Extractor
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
# $Id: ecu_extractor.rb 822 2017-03-15 07:20:08Z mtakada $

require "pp"
require "rexml/document.rb"
include REXML

if (ARGV.size() == 0)
  abort("Argument error !!")
end

# 入力された全てのarxmlをマージする
sOutputFilePrefix = nil
cAllArxmlData = nil
ARGV.each{|sFileName|
  # ファイルが存在しない場合エラー
  if (!File.exist?(sFileName))
    abort("Argument error !! [#{sFileName}]")
  end

  # arxmlファイルでない場合エラー
  if (File.extname(sFileName) != ".arxml")
    abort("not ARXML file !! [#{sFileName}]")
  end

  # 出力ファイル名プレフィックス作成
  if (sOutputFilePrefix.nil?())
    sOutputFilePrefix = File.dirname(sFileName) + "/" + File.basename(sFileName, File.extname(sFileName)) + "_"
  end

  # XMLライブラリでの読み込み
  if (cAllArxmlData.nil?())
    cAllArxmlData = REXML::Document.new(open(sFileName))
  else
    # 複数のarxmlをマージしていく
    cTempXml = REXML::Document.new(open(sFileName))
    XPath.each(cTempXml, "//AUTOSAR/AR-PACKAGES/AR-PACKAGE"){|cElement|
      cAllArxmlData.elements["AUTOSAR/AR-PACKAGES"].add_element(cElement)
    }
  end
}


# ECUインスタンスを検索
aEcuInstances = []
XPath.each(cAllArxmlData, "//ECU-INSTANCE/SHORT-NAME"){|cElement|
  aEcuInstances.push(cElement.text())
}

# ECUインスタンスが存在しない場合エラー
if (aEcuInstances.size() == 0)
  abort("ECU Instance not found !!")
end

# ECUインスタンス毎のSW-C情報を格納するハッシュ
hSwcOfEcu = {}
aEcuInstances.each{|sEcu|
  hSwcOfEcu[sEcu] = []
}

# ECUインスタンス毎のルートコンポジション情報を格納するハッシュ
hCompositionOfEcu = {}
aEcuInstances.each{|sEcu|
  hCompositionOfEcu[sEcu] = nil
}

# 各ECUインスタンスに所属するSW-C、コンポジションを取得
XPath.each(cAllArxmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  sEcuName = File.basename(cElement.elements["ECU-INSTANCE-REF"].text())
  if (!hSwcOfEcu.has_key?(sEcuName))
    abort("Unknown ECU Instance !! [#{sEcuName}]")
  end

  hSwcOfEcu[sEcuName].push(File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text()))

  if (hCompositionOfEcu[sEcuName].nil?)
    hCompositionOfEcu[sEcuName] = File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPOSITION-REF"].text())
  else
    if (hCompositionOfEcu[sEcuName] != File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPOSITION-REF"].text()))
      abort("Different compositions exist on 1 ECU Instance !! [#{sEcuName}]")
    end
  end
}


# SWC-BSW-MAPPINGコンテナを削除
XPath.each(cAllArxmlData, "//ELEMENTS/SWC-BSW-MAPPING"){|cElement|
  cElement.parent().delete_element(cElement)
}

cAllArxmlData.freeze()

# ECU毎にARXMLを作成する
hSwcOfEcu.each{|sEcu, aSwc|
  cTempXml = cAllArxmlData.deep_clone()

  # 対象外のECU-INSTANCEコンテナを削除
  XPath.each(cTempXml, "//ELEMENTS/ECU-INSTANCE"){|cElement|
    if (!sEcu.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSWC-TO-ECU-MAPPINGコンテナを削除
  XPath.each(cTempXml, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
    if (!cElement.elements["ECU-INSTANCE-REF"].text().include?(sEcu))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のAPPLICATION-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/APPLICATION-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のCOMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSENSOR-ACTUATOR-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/SENSOR-ACTUATOR-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSENDER-RECEIVER-TO-SIGNAL-MAPPINGを削除
  XPath.each(cTempXml, "//MAPPINGS/SYSTEM-MAPPING/DATA-MAPPINGS/SENDER-RECEIVER-TO-SIGNAL-MAPPING"){|cElement|
    if (!aSwc.include?(File.basename(cElement.elements["DATA-ELEMENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text())))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPINGを削除
  XPath.each(cTempXml, "//MAPPINGS/SYSTEM-MAPPING/DATA-MAPPINGS/SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING"){|cElement|
    if (!aSwc.include?(File.basename(cElement.elements["DATA-ELEMENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text())))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSW-COMPONENT-PROTOTYPEを削除
  XPath.each(cTempXml, "//COMPOSITION-SW-COMPONENT-TYPE/COMPONENTS/SW-COMPONENT-PROTOTYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # SW-COMPONENT-PROTOTYPEが無くなり空になったCOMPOSITION-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/COMPOSITION-SW-COMPONENT-TYPE/"){|cElement|
    if (cElement.elements["COMPONENTS"].has_elements?() == false)
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のROOT-SW-COMPOSITION-PROTOTYPEを削除
  XPath.each(cTempXml, "//ROOT-SOFTWARE-COMPOSITIONS/ROOT-SW-COMPOSITION-PROTOTYPE"){|cElement|
    if (hCompositionOfEcu[sEcu] != cElement.elements["SHORT-NAME"].text())
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のASSEMBLY-SW-CONNECTORを削除
  XPath.each(cTempXml, "//COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS/ASSEMBLY-SW-CONNECTOR"){|cElement|
    sProvider =  File.basename(cElement.elements["PROVIDER-IREF"].elements["CONTEXT-COMPONENT-REF"].text())
    sRequester =  File.basename(cElement.elements["REQUESTER-IREF"].elements["CONTEXT-COMPONENT-REF"].text())
    if (!aSwc.include?(sProvider) || !aSwc.include?(sRequester))
      cElement.parent().delete_element(cElement)
    end
  }

  # ASSEMBLY-SW-CONNECTORが無くなり空になったCONNECTORSを削除
  XPath.each(cTempXml, "//ELEMENTS/COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS"){|cElement|
    if (cElement.has_elements?() == false)
      cElement.parent().delete_element(cElement)
    end
  }

  # 切り出したXML文字列作成
  sXmlCode = String.new()
  cTempXml.write(sXmlCode, 4, false)
  sXmlCode.gsub!("'", "\"")
  sXmlCode.gsub!(/>\n[\s]+([\w\.\[\]\(\)\+-\/\*~&;\s]*?)\n[\s]+</, ">\\1<")
  sXmlCode.gsub!("    ", "\t")

  # 出力ファイル名：<先頭のファイル名>_<ECUインスタンス名>.arxml
  sOutputName = sOutputFilePrefix + sEcu + ".arxml"
  File.open(sOutputName, "w") {|io|
    io.print(sXmlCode)
  }
  puts("Generated #{sOutputName}")
}
