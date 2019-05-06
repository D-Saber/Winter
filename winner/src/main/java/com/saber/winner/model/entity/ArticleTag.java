package com.saber.winner.model.entity;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: ArticleTag
 * @Description: 文章标签
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 3:20 PM
 */
public class ArticleTag implements Serializable {
    private static final long serialVersionUID = 1766874310423965969L;
    /**
     * 标签ID
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String tagId;

    /**
     * 文章ID
     */
    private String articleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}