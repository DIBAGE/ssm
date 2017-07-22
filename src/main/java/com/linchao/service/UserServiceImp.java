package com.linchao.service;

import com.linchao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : linchao
 * @date : 2017/7/22.
 * @description :
 */
@Service("userServiceImp")
public class UserServiceImp {

    UserDao userDao;

    public void get(){
        System.out.println(userDao.queryAll());
    }
}
