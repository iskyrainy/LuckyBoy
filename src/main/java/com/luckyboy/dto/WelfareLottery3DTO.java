package com.luckyboy.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * className: WelfareLottery3DTO
 * description:
 * author: wn
 * date: 2024/2/26
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class WelfareLottery3DTO extends LotteryDTO{
    private int blue1;
    private int blue2;
    private int blue3;

    @Override
    public String toString() {
        return "WelfareLottery3DTO{" +
                "blue1=" + blue1 +
                ", blue2=" + blue2 +
                ", blue3=" + blue3 +
                '}';
    }
}
