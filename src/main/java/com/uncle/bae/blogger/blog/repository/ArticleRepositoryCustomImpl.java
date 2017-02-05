package com.uncle.bae.blogger.blog.repository;

import com.uncle.bae.blogger.blog.entity.Article;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public class ArticleRepositoryCustomImpl extends QueryDslRepositorySupport implements ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }


}
