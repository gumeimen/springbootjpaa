package com.gmm.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *用户实体类;
 * Created by john on 2017-10-01.
 */
        //使用@Entity注解来实现实体类的持久化操作;
        //当JPA检测到我们的实体类当中有@Entity注解的时候;
@Entity //会在数据库中生成对应的表结构信息。
public class User {

    //指定主键;
    @Id
    //指定主键的生成策略;MySQL默认为自增;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private Integer age;

    //此处省略 getter 和 setter 方法;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
