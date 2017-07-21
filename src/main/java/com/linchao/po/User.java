package com.linchao.po;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@Component()
public class User implements Serializable{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
