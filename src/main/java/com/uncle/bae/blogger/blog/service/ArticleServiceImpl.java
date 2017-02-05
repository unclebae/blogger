package com.uncle.bae.blogger.blog.service;

import com.uncle.bae.blogger.blog.dto.ArticleDTO;
import com.uncle.bae.blogger.blog.entity.Article;
import com.uncle.bae.blogger.blog.repository.ArticleRepository;
import com.uncle.bae.blogger.blog.service.entityMapper.ArticleDTOEntityMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDTOEntityMapperService mapperService;

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public ArticleDTO postArticle(ArticleDTO articleDTO) {

        Article article = mapperService.convertToArticleEntity(articleDTO);
        Article savedArticle = articleRepository.saveAndFlush(article);

        return mapperService.convertAllToArticleDTO(savedArticle);
    }
}
