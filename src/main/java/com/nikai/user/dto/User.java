package com.nikai.user.dto;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -5418232711229527000L;

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 年龄
     */
    private Integer age;


}
