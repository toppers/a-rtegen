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
 *  $Id: EngineController.c 651 2016-03-31 06:20:22Z mtakada $
 */

#include "Rte_EngineController.h"

/*
 * 単位：m/s
 */
#define VELOCITY_MAX	2147483647U
static sint32	CurrentVelocity = 0;

static sint32	DecFrictionVelocity = 0;
static sint32	DecBrakeVelocity = 0;
static sint32	IncAcceleratorVelocity = 0;
#define CALC_SCALE					10000
#define ACCELERATION_FACTOR			1
#define FRICTION_SLOWDOWN_FACTOR	10
#define BRAKE_SLOWDOWN_FACTOR		100

// m/s ==> Km/H / 10000
#define CONVERT_SPEED_UNIT(speed)	(speed * 36 / (CALC_SCALE / 10000))

static void
calcSlowDown(void)
{
	BrakeEvent IsBrakeEvent;
	Rte_Read_BrakeStateIn_BrakeEvent(&IsBrakeEvent);

	DecFrictionVelocity = FRICTION_SLOWDOWN_FACTOR;
	DecBrakeVelocity = IsBrakeEvent * BRAKE_SLOWDOWN_FACTOR;
	return;
}


static void
calcAcceleration(void)
{
	AccelLevel AcceleratorLevel;
	Rte_Read_LevelToECIn_LevelToEC(&AcceleratorLevel);

	IncAcceleratorVelocity = AcceleratorLevel * ACCELERATION_FACTOR;
	return;
}

void
calcSpeedo(void)
{
	calcSlowDown();
	calcAcceleration();

	CurrentVelocity = CurrentVelocity
					  + IncAcceleratorVelocity
					  - DecBrakeVelocity
					  - DecFrictionVelocity;
	if (CurrentVelocity < 0) {
		CurrentVelocity = 0;
	}
	else if (((uint32) CurrentVelocity) > VELOCITY_MAX) {
		CurrentVelocity = VELOCITY_MAX;
	}

	Rte_Write_SpeedoValueOut_SpeedoValue((Speedo) CurrentVelocity);
	return;
}
