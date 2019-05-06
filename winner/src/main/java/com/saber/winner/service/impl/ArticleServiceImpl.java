package com.saber.winner.service.impl;

import com.saber.winner.dao.ArticleDAO;
import com.saber.winner.model.entity.Article;
import com.saber.winner.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: ArticleServiceImpl
 * @Description: TODO
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 4:29 PM
 */
@Service
public class ArticleServiceImpl implements ArticleService
{

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public List<Article> findAll() {
        return articleDAO.findAll();
    }

    @Override
    public int delete(Article article) {
        return 0;
    }

    @Override
    public int insert(Article id) {
        return 0;
    }

    @Override
    public int update(Article record) {
        return 0;
    }
}
