package com.saber.winner.dao;
import com.saber.winner.model.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019  Dylan
 * @ClassName: ArticleDAO
 * @Description: 文章操作
 * @version: v1.0.0
 * @author: Dylan
 * @date 2019/5/6 3:41 PM
 */
@Repository
public interface ArticleDAO {
    /**获取所有*/
    List<Article> findAll();
    /**删除*/
    int delete(Article article);
    /**新增*/
    int insert(Article id);
    /**修改*/
    int update(Article record);

}