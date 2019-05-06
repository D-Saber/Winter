package com.saber.winner.controller;

import com.saber.winner.model.entity.Article;
import com.saber.winner.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: ArticleController
 * @Description: 文章控制器
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 16:15
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /**
     * 转换用户信息 （问题管理）
     * @return
     */
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Article> list(){
        return articleService.findAll();
    }

}
