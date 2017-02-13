package com.uncle.bae.blogger.blog.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComments is a Querydsl query type for Comments
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComments extends EntityPathBase<Comments> {

    private static final long serialVersionUID = -802671601L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComments comments1 = new QComments("comments1");

    public final NumberPath<Integer> agreeCount = createNumber("agreeCount", Integer.class);

    public final QArticle article;

    public final StringPath comment = createString("comment");

    public final QComments comments;

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Integer> degreeLevel = createNumber("degreeLevel", Integer.class);

    public final NumberPath<Integer> disAgreeCount = createNumber("disAgreeCount", Integer.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final SetPath<Comments, QComments> subComments = this.<Comments, QComments>createSet("subComments", Comments.class, QComments.class, PathInits.DIRECT2);

    public QComments(String variable) {
        this(Comments.class, forVariable(variable), INITS);
    }

    public QComments(Path<? extends Comments> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComments(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComments(PathMetadata metadata, PathInits inits) {
        this(Comments.class, metadata, inits);
    }

    public QComments(Class<? extends Comments> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QArticle(forProperty("article")) : null;
        this.comments = inits.isInitialized("comments") ? new QComments(forProperty("comments"), inits.get("comments")) : null;
    }

}

