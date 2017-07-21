package com.linchao.dao.imp;

import com.linchao.dao.UserDao;
import com.linchao.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@Repository
public class UserDaoImp implements UserDao,Serializable {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public User queryById(int id) {
        return (User) sqlSessionTemplate.selectOne("queryById",id);

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User u) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> queryAll() {
        return null;
    }
}
