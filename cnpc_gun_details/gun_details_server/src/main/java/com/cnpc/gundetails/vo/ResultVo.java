package com.cnpc.gundetails.vo;

import lombok.Data;

/**
 * 包装结果
 * @param <T>
 */
@Data
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;
}
