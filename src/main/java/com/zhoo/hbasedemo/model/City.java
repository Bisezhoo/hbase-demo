package com.zhoo.hbasedemo.model;

/**
 * @author ：Zhoo

 * @date ：Created in 2019/7/29 17:57
 */
public class City {

    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份年龄
     */
    private Integer age;

    /**
     * 城市名称
     */
    private String cityName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}