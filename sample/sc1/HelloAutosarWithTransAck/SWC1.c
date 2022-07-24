/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2015-2016 by Center for Embedded Computing Systems
 *              Graduate School of Information Science, Nagoya Univ., JAPAN
 *  Copyright (C) 2015-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
 *  Copyright (C) 2015-2016 by eSOL Co.,Ltd., JAPAN
 *  Copyright (C) 2015-2016 by FUJI SOFT INCORPORATED, JAPAN
 *  Copyright (C) 2015-2016 by NEC Communication Systems, Ltd., JAPAN
 *  Copyright (C) 2015-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
 *  Copyright (C) 2015-2016 by SCSK Corporation, JAPAN
 *  Copyright (C) 2015-2016 by Sunny Giken Inc., JAPAN
 *  Copyright (C) 2015-2016 by SUZUKI MOTOR CORPORATION
 *  Copyright (C) 2015-2016 by TOSHIBA CORPORATION, JAPAN
 *  Copyright (C) 2015-2016 by Witz Corporation
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
 *  $Id: SWC1.c 822 2017-03-15 07:20:08Z mtakada $
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_SWC1.h"
#include "t_syslog.h"

#define LED_G_BASE	0x08000420
#define KEY_BASE	0x08000400
#define KEY_0	0x01

/*
 *  一定周期で起動し，PPortを使ってSW-C2へtimeを送信する
 *  KEY0を押しているときは無効値を送信する
 */
void
RunnableEntity1(void)
{
	static IDT_TimeCount cnt = 0;
	uint32 key;

	cnt++;
	syslog(LOG_NOTICE, "Hello AUTOSAR [SW-C1] !! : %d", cnt);
	key = sil_rew_iop((void *) KEY_BASE);
	if ((key & KEY_0) == 0) { 						// KEY0 button on
		Rte_Invalidate_SWC1_PPort_time();
	}
	else {
		Rte_Write_SWC1_PPort_time(cnt);
	}

#ifdef TOPPERS_PERFORMANCE
	measure_swc1();
#endif /* TOPPERS_PERFORMANCE */
}

/*
 *  送信完了イベントで呼び出されるランナブル
 */
void
SWC1_RunnableDSC1(void)
{
	uint32	status;

	status = sil_rew_iop((void *) LED_G_BASE);
	sil_wrw_iop((void *) LED_G_BASE, status+1); 	// Geen LED count up
}
