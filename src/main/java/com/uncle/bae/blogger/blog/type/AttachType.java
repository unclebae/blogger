package com.uncle.bae.blogger.blog.type;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by KIDO on 2017. 2. 1..
 */
@Getter
public enum AttachType {
    FILE("FIEL", "파일"),
    IMAGE("IMAGE", "이미지"),
    MOVIE("MOVIE", "동영상")
    ;

    String code;
    String desc;

    AttachType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
