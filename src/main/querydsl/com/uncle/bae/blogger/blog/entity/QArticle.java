package com.uncle.bae.blogger.blog.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArticle extends EntityPathBase<Article> {

    private static final long serialVersionUID = -1708669061L;

    public static final QArticle article = new QArticle("article");

    public final NumberPath<Integer> agreeCount = createNumber("agreeCount", Integer.class);

    public final ListPath<Attachment, QAttachment> attachments = this.<Attachment, QAttachment>createList("attachments", Attachment.class, QAttachment.class, PathInits.DIRECT2);

    public final ListPath<Comments, QComments> comments = this.<Comments, QComments>createList("comments", Comments.class, QComments.class, PathInits.DIRECT2);

    public final StringPath contents = createString("contents");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Integer> disAgreeCount = createNumber("disAgreeCount", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final NumberPath<Integer> readCount = createNumber("readCount", Integer.class);

    public final NumberPath<Long> readGroup = createNumber("readGroup", Long.class);

    public final EnumPath<com.uncle.bae.blogger.blog.type.ArticleStatusType> status = createEnum("status", com.uncle.bae.blogger.blog.type.ArticleStatusType.class);

    public final StringPath tags = createString("tags");

    public final StringPath title = createString("title");

    public QArticle(String variable) {
        super(Article.class, forVariable(variable));
    }

    public QArticle(Path<? extends Article> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticle(PathMetadata metadata) {
        super(Article.class, metadata);
    }

}

