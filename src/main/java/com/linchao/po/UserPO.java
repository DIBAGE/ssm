package com.linchao.po;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@Component()
public class UserPO implements Serializable {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}
