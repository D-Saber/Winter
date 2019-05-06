package com.saber.winner.service.impl;

import com.saber.winner.dao.ArticleDAO;
import com.saber.winner.dao.UserDAO;
import com.saber.winner.model.entity.Article;
import com.saber.winner.service.ArticleService;
import com.saber.winner.service.UserService;
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
public class UserServiceImpl implements UserService

{
    @Autowired
    private UserDAO userDAO;

    @Override
    public String singin() {

        return null;
    }

    @Override
    public int update(Article record) {
        return 0;
    }
}
