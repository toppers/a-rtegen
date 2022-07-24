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
 *  $Id: CddLockLed.c 651 2016-03-31 06:20:22Z mtakada $
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_CddLockLed.h"
#include "Rte_CddLockLed_Stub.h"

#define LED_R_BASE	0x08000430
#define LED_R_0		0x00000001
#define LED_R_1		0x00000002
#define LED_R_2		0x00000004
#define LED_R_3		0x00000008
#define LED_R_0_3	0x0000000F
#define LED_R_17	0x00020000
#define LED_R_16	0x00010000
#define LED_R_15	0x00008000
#define LED_R_1_3	0x0000000E

void
SetLedState(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_17 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_17 & tmp));
	}
}

void
SetLedState2(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_16 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_16 & tmp));
	}
}

void
SetLedState3(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_15 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_15 & tmp));
	}
}

void
SetLedStateWdgOK()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
		
	sil_wrw_iop((void *) LED_R_BASE, ((LED_R_0 | tmp) & ~LED_R_1_3));
}

void
SetLedStateWdgFAILED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
		
	sil_wrw_iop((void *) LED_R_BASE, (LED_R_1 | tmp));
}

void
SetLedStateWdgEXPIRED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (LED_R_2 | tmp));
}

void
SetLedStateWdgSTOPPED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (LED_R_3 | tmp));
}

void
SetLedStateWdgCLEAR()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (~LED_R_0_3 | tmp));
}
