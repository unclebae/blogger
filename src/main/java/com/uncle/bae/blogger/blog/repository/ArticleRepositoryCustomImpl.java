package com.uncle.bae.blogger.blog.repository;

import com.uncle.bae.blogger.blog.entity.Article;
import com.uncle.bae.blogger.blog.entity.QArticle;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public class ArticleRepositoryCustomImpl extends QueryDslRepositorySupport implements ArticleRepositoryCustom {

    QArticle qArticle = QArticle.article;

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

    @Override
    public Article getArticleById(Long id) {
        return from(qArticle).where(qArticle.id.eq(id)).fetchOne();
    }

}
