package com.saber.winner.service;

import com.saber.winner.model.entity.Article;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019  saber
 * @ClassName: UserService
 * @Description: 用户逻辑操作
 * @version: v1.0.0
 * @author: saber
 * @date 2019/5/6 4:37 PM
 */
public interface UserService {
    /**获取所有*/
    String singin();

    /**修改*/
    int update(Article record);
}