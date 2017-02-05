package com.uncle.bae.blogger.blog.dto;

import com.uncle.bae.blogger.blog.type.ArticleStatusType;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Data
public class CategoryDTO {
    private Long id;

    private String categoryName;

    private String categoryDescription;

    private ArticleStatusType status;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;
}
