package com.cnpc.gundetails.mapper;

import com.cnpc.gundetails.dataobject.GunDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GunDetailsMapper {
    /**
     * 通过id查询器材明细
     * @param gunId 表主键
     * @return Gundetails
     */
    @Select("select * from gun_details where gun_id =#{gunId} ")
    GunDetails getGunDetailById(String gunId);

    /**
     * 插入一条器材数据
     * @param gunDetails 待插入的数据
     * @return int
     */
    @Insert("insert into gun_details (gun_id,gun_type,gun_od,gun_pressure, " +
            "gun_thickness,gun_weight_per_meter,gun_thread,gun_pos,gun_den,gun_3d_path)" +
            " values(#{gunId},#{gunType},#{gunOd},#{gunPressure},#{gunThickness},#{gunWeightPerMeter}," +
            " #{gunThread},#{gunPos},#{gunDen},#{gun3dPath})" )
    int saveGunDetails(GunDetails gunDetails);

    /**
     * 获取gun_details表中所有数据
     * @return list
     */
    @Select("select * from gun_details")
    List<GunDetails> getGunDetails();

}
