package com.uncle.bae.blogger.blog.dto;

import com.google.common.collect.Lists;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Data
public class CommentsDTO {
    private String id;

    private Long articleId;

    private String comment;

    private Integer agreeCount;

    private Integer disAgreeCount;

    private Integer degreeLevel;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;

    private List<CommentsDTO> subComments = Lists.newArrayList();

}
