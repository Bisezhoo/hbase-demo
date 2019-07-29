package com.zhoo.hbasedemo.service.impl;

import com.spring4all.spring.boot.starter.hbase.api.HbaseTemplate;
import com.zhoo.hbasedemo.mapper.CityRowMapper;
import com.zhoo.hbasedemo.model.City;
import com.zhoo.hbasedemo.service.CityService;
import org.apache.hadoop.hbase.client.Mutation;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Zhoo
 * @date ：Created in 2019/7/29 17:59
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private HbaseTemplate hbaseTemplate;

    @Override
    public List<City> query(String startRow, String stopRow) {
        Scan scan = new Scan(Bytes.toBytes(startRow), Bytes.toBytes(stopRow));
        scan.setCaching(5000);
        List<City> dtos = this.hbaseTemplate.find("people_table", scan, new CityRowMapper());
        return dtos;
    }
    @Override
    public City query(String row) {
        City dto = this.hbaseTemplate.get("people_table", row, new CityRowMapper());
        return dto;
    }
    @Override
    public void saveOrUpdate() {
        List<Mutation> saveOrUpdates = new ArrayList<Mutation>();
        Put put  = new Put(Bytes.toBytes("135xxxxxx"));
        put.addColumn(Bytes.toBytes("people"), Bytes.toBytes("name"), Bytes.toBytes("test"));
        saveOrUpdates.add(put);

        this.hbaseTemplate.saveOrUpdates("people_table", saveOrUpdates);
    }

}
