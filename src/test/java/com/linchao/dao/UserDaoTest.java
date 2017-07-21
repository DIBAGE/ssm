package com.linchao.dao;

import com.linchao.dao.imp.UserDaoImp;
import com.linchao.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Autowired
    User user;

    @Test
    public void queryTest(){
        System.out.println(userDao);
        User u = userDao.queryById(100);
        System.out.println(u.getName());
    }
}
