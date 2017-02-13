package com.uncle.bae.blogger.blog.repository;

import com.uncle.bae.blogger.blog.entity.Article;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public interface ArticleRepositoryCustom {
    Article getArticleById(Long id);
}
