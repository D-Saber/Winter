package com.saber.winner.result;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: ResultSupport
 * @Description:统一返回体
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 16:56
 */
public class Result<T> {
    private boolean success;
    private String resultMsg;
    private int errorCode;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public Result<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public Result<T> setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public Result<T> setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResultSupport{");
        sb.append("success=").append(success);
        sb.append(", resultMsg='").append(resultMsg).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}

