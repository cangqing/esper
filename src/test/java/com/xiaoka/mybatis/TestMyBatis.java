package com.xiaoka.mybatis;

import org.apache.ibatis.annotations.Select;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    @Resource
    private IUserService userService = null;


    @Test
    public void test1() {
//        CarUser user = userService.getUserById(2);
//        System.out.println(user.getCreateTime());
        List<CarUser> users = userService.getUsers();
        System.out.println(users);
    }
}
