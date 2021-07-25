package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:21
 */
public class DbException extends BasicException {

    private static final long serialVersionUID = 42045768106692650L;

    public DbException() {
        this("", null, null);
    }

    public DbException(String message) {
        this(message, null);
    }

    public DbException(Throwable cause) {
        this(null, cause);
    }


    public DbException(String message, Throwable cause) {
        this(message, null, cause);
    }


    public DbException(String message, Object[] params, Throwable cause) {
        super(ErrorCode.DB_CONN_FAILED.getCode(), message, params, cause);
    }
}
