package com.uncle.bae.blogger.blog.repository;

import com.uncle.bae.blogger.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
