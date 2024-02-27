package com.luckyboy.service;

import com.luckyboy.dto.LotteryDTO;
import org.springframework.stereotype.Service;

/**
 * className: LotteryService
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@Service
public interface LotteryService {
    LotteryDTO doubleColorBallLottery();
    LotteryDTO bigLottery();
    LotteryDTO welfareLottery3();
    boolean save();
}
