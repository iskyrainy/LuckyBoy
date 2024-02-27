package com.luckyboy.service.impl;

import com.luckyboy.data.Record;
import com.luckyboy.dto.BigLotteryDTO;
import com.luckyboy.dto.DoubleColorBallLotteryDTO;
import com.luckyboy.dto.LotteryDTO;
import com.luckyboy.dto.WelfareLottery3DTO;
import com.luckyboy.repository.RecordRepository;
import com.luckyboy.service.LotteryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * className: LotteryServiceImpl
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@Service
public class LotteryServiceImpl implements LotteryService {

    @Resource
    RecordRepository recordRepository;

    @Override
    public LotteryDTO doubleColorBallLottery(LotteryDTO lotteryDTO) {
        Random random = new Random();
        int rb = lotteryDTO.getRedBound();
        int bb = lotteryDTO.getBlueBound();
        return new DoubleColorBallLotteryDTO()
                .setRed1(random.nextInt(rb))
                .setRed2(random.nextInt(rb))
                .setRed3(random.nextInt(rb))
                .setRed4(random.nextInt(rb))
                .setRed5(random.nextInt(rb))
                .setRed6(random.nextInt(rb))
                .setBlue1(random.nextInt(bb));
    }

    @Override
    public LotteryDTO bigLottery(LotteryDTO lotteryDTO) {
        Random random = new Random();
        int rb = lotteryDTO.getRedBound();
        int bb = lotteryDTO.getBlueBound();
        return new BigLotteryDTO()
                .setRed1(random.nextInt(rb))
                .setRed2(random.nextInt(rb))
                .setRed3(random.nextInt(rb))
                .setRed4(random.nextInt(rb))
                .setRed5(random.nextInt(rb))
                .setBlue1(random.nextInt(bb))
                .setBlue2(random.nextInt(bb));
    }

    @Override
    public LotteryDTO welfareLottery3(LotteryDTO lotteryDTO) {
        Random random = new Random();
        int bb = lotteryDTO.getBlueBound();
        return new WelfareLottery3DTO()
                .setBlue1(random.nextInt(bb))
                .setBlue2(random.nextInt(bb))
                .setBlue3(random.nextInt(bb));
    }

    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }
}
