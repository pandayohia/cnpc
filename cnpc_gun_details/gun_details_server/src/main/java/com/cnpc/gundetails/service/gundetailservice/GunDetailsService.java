package com.cnpc.gundetails.service.gundetailservice;


import com.cnpc.gundetails.dataobject.GunDetails;
import com.cnpc.gundetails.formdata.GunDetailsFormData;

import java.util.List;


public interface GunDetailsService {
    /**
     * 根据id查询数据
     * @param gunId 主键
     * @return 明细
     */
    GunDetails getGunDetailById(String gunId);

    /**
     * 插入数据到gun_detail表
     * @param gunDetailsFormData 表单数据
     */
    void saveGunDetails(GunDetailsFormData gunDetailsFormData);

    /**
     * 获取gun_details表中所有数据
     * @return list
     */
    List<GunDetails> getGunDetails();
}
