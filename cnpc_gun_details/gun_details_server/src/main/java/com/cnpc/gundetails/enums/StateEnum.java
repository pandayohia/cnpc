package com.cnpc.gundetails.enums;

import lombok.Getter;

/**
 * Created by Panda on 2019/4/8.
 */
@Getter
public enum StateEnum {
    SYSTEM_ERROR("500", "服务器内部错误"),
    JSON_PARAM_NULL("001","请求参数缺失，请检查请求参数");
    private String code;
    private String msg;

    StateEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
