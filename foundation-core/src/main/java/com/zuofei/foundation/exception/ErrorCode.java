package com.zuofei.foundation.exception;

public enum ErrorCode {


    //成功
    SUCCESS("1000000"),

    //系统错误
    GENERAL("1000001"),

    //参数错误
    PARAM_VALIDATION("1000002"),

    //数据已存在
    DATA_EXISTED("1000003"),

    //数据不存在
    DATA_NOT_EXISTED("1000004"),

    //配置信息错误
    CONFIGURATION_ERROR("1000005"),

    //数据库失败
    DB_CONN_FAILED("1000006"),

    //参数转换异常
    PARAM_CONVERTION("1000007");

    ErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    private String code;


}
