package com.uncle.bae.blogger.blog.service.entityMapper;

import com.uncle.bae.blogger.blog.entity.Category;
import com.uncle.bae.blogger.converter.BeanCopy;
import com.uncle.bae.blogger.blog.dto.ArticleDTO;
import com.uncle.bae.blogger.blog.dto.AttachmentDTO;
import com.uncle.bae.blogger.blog.entity.Article;
import com.uncle.bae.blogger.blog.entity.Attachment;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Data
@Service
public class ArticleDTOEntityMapperService {

    public Article convertToArticleEntity(ArticleDTO articleDTO) {
        Article copyedArticle = BeanCopy.copy(articleDTO, Article.class);
        if (CollectionUtils.isEmpty(articleDTO.getAttachments())) {
            return copyedArticle;
        }

        List<Attachment> attachments = articleDTO.getAttachments().stream()
                .map((item) -> BeanCopy.copy(item, Attachment.class))
                .collect(Collectors.toList());

        copyedArticle.setAttachments(attachments);
//        Category category = new Category();
//        category.setId(articleDTO.getCategoryId());
//        copyedArticle.setCategory(category);

        return copyedArticle;
    }

    public ArticleDTO convertAllToArticleDTO(Article article) {
        ArticleDTO copyedArticleDTO = BeanCopy.copy(article, ArticleDTO.class);

        if (CollectionUtils.isNotEmpty(article.getAttachments())) {
            List<AttachmentDTO> attachmentDTOS = article.getAttachments().stream()
                    .map((item) -> BeanCopy.copy(item, AttachmentDTO.class))
                    .collect(Collectors.toList());

            copyedArticleDTO.setAttachments(attachmentDTOS);
        }

        return copyedArticleDTO;
    }
}
