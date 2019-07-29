package com.zhoo.hbasedemo.mapper;

import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import com.zhoo.hbasedemo.model.City;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * @author ：Zhoo
 * @date ：Created in 2019/7/29 17:57
 */
public class CityRowMapper implements RowMapper<City> {

    private static byte[] COLUMN_FAMILY = "f".getBytes();
    private static byte[] NAME = "name".getBytes();
    private static byte[] AGE = "age".getBytes();

    @Override
    public City mapRow(Result result, int rowNum) throws Exception {
        String name = Bytes.toString(result.getValue(COLUMN_FAMILY, NAME));
        int age = Bytes.toInt(result.getValue(COLUMN_FAMILY, AGE));

        City dto = new City();
        dto.setCityName(name);
        dto.setAge(age);
        return dto;
    }
}