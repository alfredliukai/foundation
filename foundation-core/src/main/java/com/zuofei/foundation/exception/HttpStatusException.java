package com.zuofei.foundation.exception;

/**
 * @author 刘凯
 * @date 2021-07-25 下午3:21
 */
public class HttpStatusException extends RuntimeException {
    public HttpStatusException(String message) {
        super(message);
    }
}
