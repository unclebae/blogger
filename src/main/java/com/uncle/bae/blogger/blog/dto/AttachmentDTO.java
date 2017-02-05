package com.uncle.bae.blogger.blog.dto;

import com.uncle.bae.blogger.blog.type.AttachType;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Data
public class AttachmentDTO {
    private Long id;

    private Long articleId;

    private int order;

    private AttachType attachType;

    private String attachmentUrl;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;

}
