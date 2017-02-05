package com.uncle.bae.blogger.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@Slf4j
@Component
public class BeanCopy {
    public static <T> T copy(Object source, Class<T> clazz) {
        try {
            T instance = clazz.newInstance();
            BeanUtils.copyProperties(source, instance);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
