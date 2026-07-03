package com.dubboai.ai.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/3
 *@description
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -8780880627029425781L;

    private String code;
    private long timestamp = System.currentTimeMillis();
    private String message;
    private T data;

    public Result() {
    }

    private Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> succeed() {
        return new Result<T>("0", "", null);
    }

    public static <T> Result<T> succeed(T data) {
        return new Result<T>("0", "", data);
    }

    public static <T> Result<T> panic() {
        return new Result<T>("000000", "系统运行发生异常，请联系IT处理", null);
    }

    public static <T> Result<T> illegalArgument(String message) {
        return new Result<T>("000001", message, null);
    }

    public static <T> Result<T> fail(String code, String message) {
        return new Result<T>(code, message, null);
    }

    public static <T> Result<T> fail(String code, String message, T data) {
        return new Result<T>(code, message, data);
    }

    public boolean success() {
        return this.code.equals("0");
    }

    public boolean failure() {
        return !this.success();
    }

    public String toString() {
        StringBuilder JSON = new StringBuilder("{\"Result\":{");
        JSON.append("\"code\":\"").append(this.code).append('"');
        JSON.append(",\"message\":\"").append(this.message).append('"');
        JSON.append(",\"data\":").append(this.data);
        JSON.append('}');
        JSON.append('}');
        return JSON.toString();
    }
}
