package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:20
 */
public class DataNotExistedException extends BasicException {


    private static final long serialVersionUID = 779654369988355472L;

    public DataNotExistedException() {
        this("", null, null);
    }

    public DataNotExistedException(String message) {
        this(message, null);
    }

    public DataNotExistedException(Throwable cause) {
        this(null, cause);
    }


    public DataNotExistedException(String message, Throwable cause) {
        this(message, null, cause);
    }


    public DataNotExistedException(String message, Object[] params, Throwable cause) {
        super(ErrorCode.DATA_NOT_EXISTED.getCode(), message, params, cause);
    }
}
