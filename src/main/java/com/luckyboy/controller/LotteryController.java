package com.luckyboy.controller;

import com.luckyboy.data.Record;
import com.luckyboy.dto.BigLotteryDTO;
import com.luckyboy.dto.DoubleColorBallLotteryDTO;
import com.luckyboy.dto.LotteryDTO;
import com.luckyboy.dto.WelfareLottery3DTO;
import com.luckyboy.service.LotteryService;
import com.luckyboy.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: LotteryController
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@RestController(value = "/random")
@CrossOrigin
public class LotteryController {

    @Resource
    LotteryService service;

    @PostMapping(value = "/dcbl")
    public ResultVO dcbLottery() {
        LotteryDTO lotteryDTO = new LotteryDTO();
        lotteryDTO.setRedBound(33);
        lotteryDTO.setBlueBound(15);
        DoubleColorBallLotteryDTO dcb = (DoubleColorBallLotteryDTO) service.doubleColorBallLottery(lotteryDTO);
        Record record = new Record();
        record.setLotteryString(dcb.toString());
        service.save(record);
        return ResultVO.success(dcb);
    }

    @PostMapping(value = "/bigl")
    public ResultVO bigLottery() {
        LotteryDTO lotteryDTO = new LotteryDTO();
        lotteryDTO.setRedBound(35);
        lotteryDTO.setBlueBound(12);
        BigLotteryDTO bl = (BigLotteryDTO) service.bigLottery(lotteryDTO);
        Record record = new Record();
        record.setLotteryString(bl.toString());
        service.save(record);
        return ResultVO.success(bl);
    }

    @PostMapping(value = "/wl3")
    public ResultVO wl3Lottery() {
        LotteryDTO lotteryDTO = new LotteryDTO();
        lotteryDTO.setBlueBound(10);
        WelfareLottery3DTO wl3 = (WelfareLottery3DTO) service.welfareLottery3(lotteryDTO);
        Record record = new Record();
        record.setLotteryString(wl3.toString());
        service.save(record);
        return ResultVO.success(wl3);
    }
}
