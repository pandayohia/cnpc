package com.cnpc.gundetails.error;

import lombok.Getter;


@Getter
public class Error {
String code;
String msg;

    public Error(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
