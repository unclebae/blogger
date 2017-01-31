package com.uncle.bae.blogger.blog.type;

import lombok.Getter;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Getter
public enum ArticleStatusType {
    TEMP("TEMP", "임시")
    , OPEN("POST", "게시")
    , HIDE("HIDE", "숨김")
    , DELETED("DELETED", "삭제")
    ;

    String code;
    String desc;

    ArticleStatusType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
