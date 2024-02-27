package com.luckyboy.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * className: DoubleColorBallLotteryDTO
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class DoubleColorBallLotteryDTO extends LotteryDTO{
    private int red1;
    private int red2;
    private int red3;
    private int red4;
    private int red5;
    private int red6;
    private int blue1;

    @Override
    public String toString() {
        return "DoubleColorBallLotteryDTO{" +
                "red1=" + red1 +
                ", red2=" + red2 +
                ", red3=" + red3 +
                ", red4=" + red4 +
                ", red5=" + red5 +
                ", red6=" + red6 +
                ", blue1=" + blue1 +
                '}';
    }
}
