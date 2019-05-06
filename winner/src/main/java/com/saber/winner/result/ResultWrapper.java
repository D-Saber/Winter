package com.saber.winner.result;

import org.springframework.http.HttpStatus;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: ResultWrapper
 * @Description: 返回结果包装类
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 17:00
 */
public class ResultWrapper extends  Result {

    /**无参数 成功*/
    public static <T> Result<T> success() {
       return new Result<T>().setData(null).setErrorCode(ErrorCode.SUCCESS.getCode()).setResultMsg(ErrorCode.SUCCESS.getMsg())
               .setSuccess(true);
    }
    /**有参数 成功*/
    public static <T> Result<T> success(T data) {
     return new Result<T>().setData(data)
             .setErrorCode(ErrorCode.SUCCESS.getCode()).setResultMsg(ErrorCode.SUCCESS.getMsg())
             .setSuccess(true);
    }


    /**系统异常*/
    public  static <T> Result<T> systemError() {
        return new Result<T>().setData(null)
                .setErrorCode(ErrorCode.SYSTEM_ERROR.getCode()).setResultMsg(ErrorCode.SYSTEM_ERROR.getMsg())
                .setSuccess(false);
    }

    /**系统异常*/
    public  static <T> Result<T> statusError(HttpStatus httpStatus) {
        return new Result<T>().setData(null)
                .setErrorCode(httpStatus.value()).setResultMsg(httpStatus.getReasonPhrase())
                .setSuccess(false);
    }
}
