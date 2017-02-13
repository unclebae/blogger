package com.uncle.bae.blogger.blog.entity;

import com.uncle.bae.blogger.blog.type.AttachType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Data
@ToString(exclude = "article")
@NoArgsConstructor
@Entity
@Table(name = "attachment")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attachmentId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

    private Integer ordering;

    @Enumerated(EnumType.STRING)
    private AttachType attachType;

    private String attachmentUrl;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;

}
