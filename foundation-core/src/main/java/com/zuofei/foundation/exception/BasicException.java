package com.zuofei.foundation.exception;


/**
 * @author 刘凯
 * @date 2021-07-25 下午2:39
 */
public class BasicException extends RuntimeException {


    private static final long serialVersionUID = 4666831382665974226L;

    private String errorCode;

    private String message;

    private Object[] params;

    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Object[] getParams() {
        return params;
    }

    public String getMessageCode() {
        return getErrorCode() + ".error";
    }

    public String getSolutionCode() {
        return getErrorCode() + ".solution";
    }

    public BasicException() {
        super();
    }


    public BasicException(String message) {
        super(message);
        this.errorCode = ErrorCode.GENERAL.getCode();
    }


    public BasicException(Throwable cause) {
        super(cause);
        this.errorCode = ErrorCode.GENERAL.getCode();
    }

    public BasicException(String errorCode, String message, Throwable cause) {
        this(errorCode, message, null, cause);
    }

    public BasicException(String message, Throwable cause) {
        this(ErrorCode.GENERAL.getCode(), message, null, cause);
    }

    public BasicException(String errorCode, String message) {

        this(errorCode, message, null, null);
    }


    public BasicException(String message, Object[] params, Throwable cause) {
        this(ErrorCode.GENERAL.getCode(), message, params, cause);
    }

    /**
     * 异常构造方法.
     *
     * @param errorCode 错误码
     * @param message   异常消息
     * @param params    产生异常的参数
     * @param cause     异常原因
     */
    public BasicException(String errorCode, String message, Object[] params, Throwable cause) {
        super(message, cause);
        this.params = params;
        this.errorCode = errorCode;
        this.message = message;
    }

}
