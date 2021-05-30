package com.redscarf.smart.common.exception;

import com.redscarf.smart.common.constants.Code;

/**
 * @description: 自定义业务异常
 * @author: LeeJohn
 * @date: 2018/12/29 10:18
 */
public class ServiceException extends RuntimeException {

    private Code code;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Code msgCode) {
        super(msgCode.getMsg());
        this.code = msgCode;
    }

    public Code getCode() {
        return code;
    }
}
