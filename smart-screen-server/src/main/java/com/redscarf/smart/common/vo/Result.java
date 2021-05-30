package com.redscarf.smart.common.vo;

import com.redscarf.smart.common.constants.Code;
import com.redscarf.smart.common.constants.CommonCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用web层数据返回格式
 *
 * @author LeeJohn
 * @Date 2018-12-28
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 返回编码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public Result() {

    }

    private Result(Integer code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }


    /**
     * 正常返回（无业务数据返回）
     *
     * @return
     */
    public static <T> Result<T> ok() {
        return new Result(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg(), null);
    }

    /**
     * 正常返回（有业务数据返回）
     *
     * @return
     */
    public static <T> Result<T> ok(T data) {
        return new Result(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg(), data);
    }

    /**
     * 正常返回（自定义返回码，并返回业务数据）
     *
     * @param code
     * @param data 无需业务数据返回时请填写null
     * @return
     */
    public static <T> Result<T> ok(Code code, T data) {
        return new Result(code.getCode(), code.getMsg(), data);
    }


    /**
     * 正常返回（自定义返回信息，并返回业务数据）
     *
     * @param msg
     * @param data 无需业务数据返回时请填写null
     * @return
     */
    public static <T> Result<T> ok(String msg, T data) {
        return new Result(CommonCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 默认通用的错误返回
     *
     * @return
     */
    public static <T> Result<T> fail() {
        return fail(CommonCode.FAIL);
    }

    /**
     * 默认通用的错误返回（返回编码使用默认编码，错误信息重写）
     *
     * @return
     */
    public static <T> Result<T> fail(String error) {
        return new Result(CommonCode.FAIL.getCode(), error, null);
    }

    /**
     * 错误返回,包装第三方错误信息在data
     *
     * @return
     */
    public static <T> Result<T> fail(T data) {
        return fail(data, null);
    }

    /**
     * 错误返回,包装第三方错误信息在data
     *
     * @return
     */
    public static <T> Result<T> fail(T data, String msg) {
        return new Result(CommonCode.FAIL.getCode(), msg, data);
    }

    /**
     * 指定code和异常信息
     *
     * @param code
     * @param error
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(int code, String error) {
        return new Result(code, error, null);
    }

    /**
     * 错误返回（自定义）
     *
     * @return
     */
    public static <T> Result<T> fail(Code code) {
        return new Result(code.getCode(), code.getMsg(), null);
    }

    /**
     * 错误返回（自定义）
     *
     * @return
     */
    public static <T> Result<T> fail(Code code, String error) {
        return new Result(code.getCode(), error, null);
    }


}

