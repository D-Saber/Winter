package com.saber.winner.service;

import com.saber.winner.model.entity.Article;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public interface ArticleService  {
    /**获取所有*/
    List<Article> findAll();
    /**删除*/
    int delete(Article article);
    /**新增*/
    int insert(Article id);
    /**修改*/
    int update(Article record);
}