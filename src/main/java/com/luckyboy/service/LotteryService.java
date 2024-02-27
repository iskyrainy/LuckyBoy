package com.luckyboy.service;

import com.luckyboy.data.Record;
import com.luckyboy.dto.LotteryDTO;

/**
 * className: LotteryService
 * description:
 * author: wn
 * date: 2024/2/26
 **/
public interface LotteryService {
    LotteryDTO doubleColorBallLottery(LotteryDTO lotteryDTO);
    LotteryDTO bigLottery(LotteryDTO lotteryDTO);
    LotteryDTO welfareLottery3(LotteryDTO lotteryDTO);
    void save(Record record);
}
