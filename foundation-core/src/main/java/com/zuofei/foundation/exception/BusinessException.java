package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午2:57
 */
public class BusinessException extends BasicException {


    private static final long serialVersionUID = -8476397452394070753L;


    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String errorCode, String message) {
        super(errorCode, message);
    }

    public BusinessException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }


    public BusinessException(String message, Object[] params, Throwable cause) {
        super(message, params, cause);
    }

    public BusinessException(String errorCode, String message, Object[] params, Throwable cause) {
        super(errorCode, message, params, cause);
    }


}
