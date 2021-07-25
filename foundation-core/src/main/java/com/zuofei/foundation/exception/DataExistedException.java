package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:13
 */
public class DataExistedException extends BasicException {
    private static final long serialVersionUID = -6735786897407512638L;

    public DataExistedException() {
        this("", null, null);
    }

    public DataExistedException(String message) {
        this(message, null);
    }

    public DataExistedException(Throwable cause) {
        this(null, cause);
    }


    public DataExistedException(String message, Throwable cause) {
        this(message, null, cause);
    }


    public DataExistedException(String message, Object[] params, Throwable cause) {
        super(ErrorCode.DATA_EXISTED.getCode(), message, params, cause);
    }
}
