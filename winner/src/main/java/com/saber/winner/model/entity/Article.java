package com.saber.winner.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: Article
 * @Description: 文章表实体类
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 3:09 PM
 */
public class Article implements Serializable {
    private static final long serialVersionUID = 3886159611865935832L;
    /**
     * 文章ID
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 点赞总数
     */
    private Integer like;

    /**
     * 浏览总数
     */
    private String pv;

    /**
     * 是否可见
     */
    private Boolean visible;

    /**
     * 封面地址
     */
    private String coverImg;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
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