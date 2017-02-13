package com.uncle.bae.blogger.blog.service;

import com.uncle.bae.blogger.blog.dto.ArticleDTO;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public interface ArticleService {
    ArticleDTO postArticle(ArticleDTO article);

    ArticleDTO getArticleById(Long articleId);
}
