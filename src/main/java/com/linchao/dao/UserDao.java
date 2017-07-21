package com.linchao.dao;

import com.linchao.po.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */

public interface UserDao {
    public User queryById(int id);

    public void save(User user);

    public void update(User u);

    public void delete(int id);

    public List<User> queryAll();

}
