package com.uncle.bae.blogger.blog.controller;

import com.uncle.bae.blogger.blog.dto.ArticleDTO;
import com.uncle.bae.blogger.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@RequestMapping("/v1/article")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity<ArticleDTO> postArticle(@RequestBody ArticleDTO article) {
        ArticleDTO articleDTO = articleService.postArticle(article);

        ResponseEntity<ArticleDTO> response = new ResponseEntity<ArticleDTO>(articleDTO, HttpStatus.OK);
        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArticleDTO articleById(@PathVariable("id") Long id) {
        return articleService.getArticleById(id);
    }
}
