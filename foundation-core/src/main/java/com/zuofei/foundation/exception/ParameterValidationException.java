package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:22
 */
public class ParameterValidationException extends BasicException {
    private static final long serialVersionUID = -4276019661682960261L;

    public ParameterValidationException() {
        this("", null, null);
    }

    public ParameterValidationException(String message) {
        this(message, null);
    }

    public ParameterValidationException(Throwable cause) {
        this(null, cause);
    }


    public ParameterValidationException(String message, Throwable cause) {
        this(message, null, cause);
    }


    public ParameterValidationException(String message, Object[] params, Throwable cause) {
        super(ErrorCode.PARAM_VALIDATION.getCode(), message, params, cause);
    }


}
