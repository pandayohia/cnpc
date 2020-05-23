package com.cnpc.gundetails.service.gundetailservice.impl;


import com.cnpc.gundetails.dao.GunDetailsDao;
import com.cnpc.gundetails.dataobject.GunDetails;
import com.cnpc.gundetails.formdata.GunDetailsFormData;
import com.cnpc.gundetails.service.gundetailservice.GunDetailsService;
import com.cnpc.gundetails.utils.keyUtil.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GunDetailsServiceImpl implements GunDetailsService {
    @Autowired
    GunDetailsDao gunDetailsDao;

    /**
     * 根据id查询数据
     * @param gunId 主键
     * @return 明细
     */
    @Override
    public GunDetails getGunDetailById(String gunId) {
        return gunDetailsDao.gunDetailByIdDao(gunId);
    }

    /**
     * 插入数据到gun_detail表
     * @param gunDetailsFormData 表单数据
     */
    @Override
    public void saveGunDetails(GunDetailsFormData gunDetailsFormData) {
        GunDetails gunDetails = new GunDetails();
        BeanUtils.copyProperties(gunDetailsFormData,gunDetails);
        gunDetails.setGunWeightPerMeter(Double.parseDouble(gunDetailsFormData.getGunWeightPerMeter()));
        gunDetails.setGunOd(Double.parseDouble(gunDetailsFormData.getGunOd()));
        gunDetails.setGunId(KeyUtil.genUniqueKey());
        gunDetails.setGun3dPath("xxx.xxx..xx..");
        int a = gunDetailsDao.saveGunDetailsDao(gunDetails);
        System.out.println(a);
    }

    /**
     * 获取gun_details表中所有数据
     * @return list
     */
    @Override
    public List<GunDetails> getGunDetails(){
        return gunDetailsDao.getGunDetails();
    }
}
