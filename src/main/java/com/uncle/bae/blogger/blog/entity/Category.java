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
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "categoryDescription")
    private String categoryDescription;

    @Column(name = "status")
    private ArticleStatusType status;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;

    @Column(name = "modifiedBy")
    private String modifiedBy;

}
