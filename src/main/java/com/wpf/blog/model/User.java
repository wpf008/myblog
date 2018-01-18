package com.wpf.blog.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * @Author:wpf
 * @Description
 * @Date:Cteated in 4:46 PM 1/18/2018
 * @Modified by
 */
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name = "id", insertable = false, updatable = false)
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "name")
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
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
