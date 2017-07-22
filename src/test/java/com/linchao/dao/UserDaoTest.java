package com.linchao.dao;

import com.linchao.service.UserServiceImp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */

public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void get(){
        userDao.queryById(11);
    }
}
