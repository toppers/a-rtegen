/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Center for Embedded Computing Systems
 *              Graduate School of Information Science, Nagoya Univ., JAPAN
 *  Copyright (C) 2014-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
 *  Copyright (C) 2014-2016 by eSOL Co.,Ltd., JAPAN
 *  Copyright (C) 2013-2016 by FUJI SOFT INCORPORATED, JAPAN
 *  Copyright (C) 2014-2016 by NEC Communication Systems, Ltd., JAPAN
 *  Copyright (C) 2013-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
 *  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
 *  Copyright (C) 2014-2016 by SCSK Corporation, JAPAN
 *  Copyright (C) 2013-2016 by Sunny Giken Inc., JAPAN
 *  Copyright (C) 2015-2016 by SUZUKI MOTOR CORPORATION
 *  Copyright (C) 2013-2016 by TOSHIBA CORPORATION, JAPAN
 *  Copyright (C) 2013-2016 by Witz Corporation
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
 *  $Id: CddDisplayRain.c 651 2016-03-31 06:20:22Z mtakada $
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_CddDisplayRain.h"

/* 降雨量表示に必要なHWはLED-Gと7SEG */
#define SEG7_BASE	0x08000500
#define LED_G_BASE	0x08000420

#define SEG7_SET(index, value)	sil_wrw_iop((void *) (SEG7_BASE + (index * 4)), value);
#define SEG7_NUM	8U

void
SEG7_Clear(void)
{
	uint8 i;
	for (i = 0U; i < SEG7_NUM; i++) {
		SEG7_SET(i, 0U);
	}
}

void
DisplayRain(void)
{
	Rainfall		cur_rainfall;
	uint32			red = 0U;
	uint8			i;
	static uint8	line_pos[SEG7_NUM] = {
		0x00, 0x01, 0x40, 0x08, 0x01, 0x40, 0x00, 0x40
	};
	static Rainfall before_rainfall = 0U;
	static uint8	drop_cnt = 0U;

	/* 現在の降雨量取得 */
	Rte_Call_RainfallInDR_GetRainfall(&cur_rainfall);

	/* 7SEG表示 */
	if (before_rainfall != cur_rainfall) {
		before_rainfall = cur_rainfall;
		drop_cnt = 0;
	}

	if (cur_rainfall == 0) {
		SEG7_Clear();
	}
	else {
		drop_cnt++;
		if (drop_cnt > (4U - before_rainfall)) {
			for (i = 0; i < SEG7_NUM; i++) {
				switch (line_pos[i]) {
				// 1段目
				case 0x01:
					line_pos[i] = 0x40;
					break;
				// 2段目
				case 0x40:
					line_pos[i] = 0x08;
					break;
				// 3段目
				case 0x08:
					line_pos[i] = 0x00;
					break;
				// 初期値
				default:
					line_pos[i] = 0x01;
					break;
				}
				SEG7_SET(i, line_pos[i]);
				drop_cnt = 0;
			}
		}
	}

	/* LED表示 */
	while (cur_rainfall > 0) {
		red += 1 << (cur_rainfall - 1);
		cur_rainfall--;
	}
	sil_wrw_iop((void *) LED_G_BASE, red);
}
