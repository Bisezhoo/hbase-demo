package com.zhoo.hbasedemo.service;

import com.zhoo.hbasedemo.model.City;

import java.util.List;

/**
 * @author ：Zhoo
 * @date ：Created in 2019/7/29 17:58
 */
public interface CityService {

    List<City> query(String startRow, String stopRow);

    City query(String row);

    void saveOrUpdate();

}
