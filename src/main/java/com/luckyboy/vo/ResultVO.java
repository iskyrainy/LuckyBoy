package com.luckyboy.vo;

import com.luckyboy.enmu.HttpCode;
import lombok.Data;

/**
 * className: ResultVO
 * description:
 * author: wn
 * date: 2024/2/27
 **/
@Data
public class ResultVO {
    private HttpCode httpCode;
    private Object data;

    public ResultVO(HttpCode httpCode, Object data) {
        this.httpCode = httpCode;
        this.data = data;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO success(Object data) {
        return new ResultVO(HttpCode.SUCCESS, data);
    }

    public static ResultVO error(HttpCode code) {
        return error(code, null);
    }

    public static ResultVO error(HttpCode code, Object data) {
        return new ResultVO(code, data);
    }
}
