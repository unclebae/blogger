package com.uncle.bae.blogger.blog.entity;

import com.uncle.bae.blogger.blog.type.AttachType;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Data
@Entity
@Table(name = "attachment")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "articleId")
    private Article article;

    @Column(name = "articleId")
    private int order;

    @Column(name = "articleId")
    private AttachType attachType;

    @Column(name = "articleId")
    private String attachmentUrl;

    @Column(name = "articleId")
    private LocalDateTime createdAt;

    @Column(name = "articleId")
    private String createdBy;

    @Column(name = "articleId")
    private LocalDateTime modifiedAt;

    @Column(name = "articleId")
    private String modifiedBy;

}
