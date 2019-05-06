package com.saber.winner.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: Tag
 * @Description: 标签实体类
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 3:14 PM
 */
public class Tag implements Serializable {
    /**
     * 标签ID
     */
    private String id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 是否可见 （true:可见, false:不可见）
     */
    private Boolean visible;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
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