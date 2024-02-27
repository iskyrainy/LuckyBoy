package com.luckyboy.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * className: BigLotteryDTO
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BigLotteryDTO extends LotteryDTO{
    private int red1;
    private int red2;
    private int red3;
    private int red4;
    private int red5;
    private int blue1;
    private int blue2;

    @Override
    public String toString() {
        return "BigLotteryDTO{" +
                "red1=" + red1 +
                ", red2=" + red2 +
                ", red3=" + red3 +
                ", red4=" + red4 +
                ", red5=" + red5 +
                ", blue1=" + blue1 +
                ", blue2=" + blue2 +
                '}';
    }
}
