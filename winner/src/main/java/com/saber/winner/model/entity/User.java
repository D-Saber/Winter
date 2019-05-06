package com.saber.winner.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: User
 * @Description: 用户实体类
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 3:14 PM
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2355290238411040214L;
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户账号
     */
    private String userAcount;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String icon;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAcount() {
        return userAcount;
    }

    public void setUserAcount(String userAcount) {
        this.userAcount = userAcount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}