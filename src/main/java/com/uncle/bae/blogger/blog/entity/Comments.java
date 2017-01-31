package com.uncle.bae.blogger.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Data
@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "articleId")
    private Article article;

    @Column(name = "comment")
    private String comment;

    @Column(name = "agreeCount")
    private Integer agreeCount;

    @Column(name = "disAgreeCount")
    private Integer disAgreeCount;

    @Column(name = "degreeLevel")
    private Integer degreeLevel;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parentCommentsId")
    private Comments comments;

    @OneToMany(mappedBy = "comments")
    private Set<Comments> subComments = new HashSet<>();

}
