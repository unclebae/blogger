package com.uncle.bae.blogger.blog.dto;

import com.google.common.collect.Lists;
import com.uncle.bae.blogger.blog.type.ArticleStatusType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Data
public class ArticleDTO {
    private Long id;

    private String title;

    private String contents;

    private int readCount;

    private int agreeCount;

    private int disAgreeCount;

    private Long readGroup;

    private ArticleStatusType status;

    private String tags;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;

    private Long categoryId;

    private List<AttachmentDTO> attachments = Lists.newArrayList();
}
