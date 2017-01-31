package com.uncle.bae.blogger.blog.entity;

import com.uncle.bae.blogger.blog.type.ArticleStatusType;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Data
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( name = "title")
    private String title;

    @Column( name = "content")
    private String content;

    @Column( name = "readCount")
    private int readCount;

    @Column( name = "agreeCount")
    private int agreeCount;

    @Column( name = "disAgreeCount")
    private int disAgreeCount;

    @Column( name = "readGroup")
    private Long readGroup;

    @Column( name = "status")
    private ArticleStatusType status;

    @Column( name = "tags")
    private String tags;

    @Column( name = "createdAt")
    private LocalDateTime createdAt;

    @Column( name = "createdBy")
    private String createdBy;

    @Column( name = "modifiedAt")
    private LocalDateTime modifiedAt;

    @Column( name = "modifiedBy")
    private String modifiedBy;

    @Column( name = "categoryId")
    private Long categoryId;

}
