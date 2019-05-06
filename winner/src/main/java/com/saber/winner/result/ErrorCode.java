package com.saber.winner.result;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: ErrorCode
 * @Description: 通用返回常量类
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 16:55
 */
public enum  ErrorCode {
    SUCCESS(200,"success"),
    SYSTEM_ERROR(-1,"error"),
    PARAM_ERROR(-1,"Parameter verification failed!");
    private Integer code;

     private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
