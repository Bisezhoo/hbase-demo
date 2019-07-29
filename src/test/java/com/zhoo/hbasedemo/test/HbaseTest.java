package com.zhoo.hbasedemo.test;

import com.zhoo.hbasedemo.HbaseDemoApplication;
import com.zhoo.hbasedemo.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Zhoo
 * @date ：Created in 2019/7/29 18:12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HbaseDemoApplication.class)
public class HbaseTest {

    @Autowired
    private CityService cityService;

    @Test
    public void query() {
        cityService.query("people_table");

    }

    @Test
    public void saveOrUpdate() {
        cityService.saveOrUpdate();
    }


}
