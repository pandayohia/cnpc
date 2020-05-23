package com.cnpc.gundetails.dataobject;

import lombok.Data;

@Data
public class GunDetails {
    //射孔枪类型编号
    private String gunId;
    //射孔枪类型
    private String gunType;
    //射孔枪外径
    private Double gunOd;
    //耐压等级
    private String gunPressure;
    //壁厚
    private String gunThickness;
    //每米重量
    private Double gunWeightPerMeter;
    //扣型
    private String gunThread;
    //相位
    private String gunPos;
    //孔密
    private String gunDen;
    //3D模型路径
    private String gun3dPath;

}
