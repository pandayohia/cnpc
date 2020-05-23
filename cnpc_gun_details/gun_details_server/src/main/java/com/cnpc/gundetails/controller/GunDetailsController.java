package com.cnpc.gundetails.controller;

import com.cnpc.gundetails.dataobject.GunDetails;
import com.cnpc.gundetails.formdata.GunDetailsFormData;
import com.cnpc.gundetails.service.gundetailservice.GunDetailsService;
import com.cnpc.gundetails.utils.result.ResultVoUtil;
import com.cnpc.gundetails.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gun_details")
public class GunDetailsController {
    @Autowired
    DataSource druidDataSource;

    @Autowired
    GunDetailsService gunDetailsService;

    /**
     * 列举当前Hive库中的所有数据表
     */
    @RequestMapping("/table/list")
    public List<String> listAllTables() throws SQLException {
        List<String> list = new ArrayList<String>();
        // Statement statement = jdbcDataSource.getConnection().createStatement();
        Connection connection = druidDataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "show tables";
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            list.add(res.getString(1));
        }
        connection.close();
        return list;
    }

    /**
     * 根据id查询器材明细
     * @param gunId 主键
     * @return result
     */
    @GetMapping("/gun_id/{id}")
    public ResultVo<GunDetails> getById(@PathVariable("id") String gunId){
        return ResultVoUtil.success(gunDetailsService.getGunDetailById(gunId));
    }

    /**
     * 向gun_details表插入一条数据
     * @param gunDetailsFormData 数据
     * @return result
     */
    @PostMapping("/save")
    public ResultVo<GunDetails> saveGunDetails(@RequestBody  @Validated GunDetailsFormData gunDetailsFormData){
        gunDetailsService.saveGunDetails(gunDetailsFormData);
        return ResultVoUtil.success();
    }
    @GetMapping("/all")
    public ResultVo<List<GunDetails>> getAll(){

        return ResultVoUtil.success(gunDetailsService.getGunDetails());
    }


}
