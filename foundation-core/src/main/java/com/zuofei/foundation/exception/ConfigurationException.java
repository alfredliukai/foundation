package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:04
 */
public class ConfigurationException extends BasicException {

    private static final long serialVersionUID = 8189356894355384887L;

    public ConfigurationException() {
        this("", null, null);
    }

    public ConfigurationException(String message) {
        this(message, null);
    }

    public ConfigurationException(Throwable cause) {
        this(null, cause);
    }


    public ConfigurationException(String message, Throwable cause) {
        this(message, null, cause);
    }


    public ConfigurationException(String message, Object[] params, Throwable cause) {
        super(ErrorCode.CONFIGURATION_ERROR.getCode(), message, params, cause);
    }


}
