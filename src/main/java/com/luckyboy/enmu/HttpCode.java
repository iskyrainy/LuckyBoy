package com.luckyboy.enmu;

import lombok.Getter;

/**
 * className: HttpCode
 * description:
 * author: wn
 * date: 2024/2/27
 **/
@Getter
public enum HttpCode {
    SUCCESS(0, "成功"),
    PARAM_ERROR(1, "参数错误");

    private final int value;
    private final String msg;

    HttpCode(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }
}
