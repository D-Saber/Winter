package com.saber.winner.dao;
import java.util.List;
import com.saber.winner.model.entity.Article;
import com.saber.winner.model.entity.Tag;
import org.springframework.stereotype.Repository;
/**
 * Copyright: Copyright (c) 2019  Dylan
 * @ClassName: UserDAO
 * @Description: 用户
 * @version: v1.0.0
 * @author: Dylan
 * @date 2019/5/6 3:43 PM
 */
@Repository
public interface UserDAO {
    /**获取所有*/
    List<Article> findAll();
    /**删除*/
    int delete(int TagId);
    /**新增*/
    int insert(Tag tag);
    /**修改*/
    int update(Tag tag);
}