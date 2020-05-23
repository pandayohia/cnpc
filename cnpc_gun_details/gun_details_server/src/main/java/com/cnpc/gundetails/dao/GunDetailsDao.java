package com.cnpc.gundetails.dao;



import com.cnpc.gundetails.dataobject.GunDetails;
import com.cnpc.gundetails.mapper.GunDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GunDetailsDao {
    @Autowired
    GunDetailsMapper gunDetailsMapper;

    /**
     * 根据id查询器材详细
     * @param gunId 表主键
     * @return 明细
     */
    public GunDetails gunDetailByIdDao(String gunId){
        return gunDetailsMapper.getGunDetailById(gunId);
    }

    /**
     * 向gun_details表插入数据
     * @param gunDetails 数据
     * @return int
     */
    public int saveGunDetailsDao(GunDetails gunDetails){
        return gunDetailsMapper.saveGunDetails(gunDetails);
    }

    /**
     * 获取gun_details表中所有数据
     * @return list
     */
    public List<GunDetails> getGunDetails(){
        return gunDetailsMapper.getGunDetails();
    }
}
