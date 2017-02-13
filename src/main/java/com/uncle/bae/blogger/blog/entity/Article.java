package com.uncle.bae.blogger.blog.entity;

import com.google.common.collect.Lists;
import com.uncle.bae.blogger.blog.type.ArticleStatusType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Data
@ToString(exclude = "attachments")
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "articleId")
    private Long id;

    @Column( name = "title")
    private String title;

    @Column( name = "contents")
    private String contents;

    @Column( name = "readCount")
    private Integer readCount;

    @Column( name = "agreeCount")
    private Integer agreeCount;

    @Column( name = "disAgreeCount")
    private Integer disAgreeCount;

    @Column( name = "readGroup")

    private Long readGroup;

    @Column( name = "status")
    @Enumerated(EnumType.STRING)
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

//    @ManyToOne
//    @JoinColumn(name = "id", insertable = false, updatable = false)
//    private Category category;

    @OneToMany(mappedBy = "article", cascade = CascadeType.PERSIST)
    private List<Attachment> attachments = Lists.newArrayList();

    public void addAttachment(Attachment attachment) {
        if ( !attachments.contains(attachment) ) {
            attachments.add(attachment);
        }
    }

    @OneToMany(mappedBy = "article")
    private List<Comments> comments = Lists.newArrayList();
}
