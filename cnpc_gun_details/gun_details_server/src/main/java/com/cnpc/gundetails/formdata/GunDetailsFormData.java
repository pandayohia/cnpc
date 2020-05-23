package com.cnpc.gundetails.formdata;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GunDetailsFormData {
    //射孔枪类型
    @NotBlank(message = "gunType不能为空")
    private String gunType;
    //射孔枪外径
    @NotBlank(message = "gunOd不能为空")
    private String gunOd;
    //耐压等级
    @NotBlank(message = "gunPressure能为空")
    private String gunPressure;
    //壁厚
    @NotBlank(message = "gunThickness不能为空")
    private String gunThickness;
    //每米重量
    @NotBlank(message = "gunWeightPerMeter不能为空")
    private String gunWeightPerMeter;
    //扣型
    @NotBlank(message = "gunThread不能为空")
    private String gunThread;
    //相位
    @NotBlank(message = "gunPos不能为空")
    private String gunPos;
    //孔密
    @NotBlank(message = "gunDen不能为空")
    private String gunDen;

}
