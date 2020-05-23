package com.cnpc.gundetails.exception;


import com.cnpc.gundetails.enums.StateEnum;

public class BusinessException extends RuntimeException {
    protected String code;
    public BusinessException(StateEnum stateEnum){
        super(stateEnum.getMsg());
        this.code = stateEnum.getCode();
    }
    public String getCode() {
        return code;
    }
}
