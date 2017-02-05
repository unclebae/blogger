package com.uncle.bae.blogger.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public final class LocalDateTimeConverterForMVC implements Converter<String, LocalDateTime>{

    private final DateTimeFormatter formatter;

    public LocalDateTimeConverterForMVC(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public LocalDateTime convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        return LocalDateTime.parse(source, formatter);
    }
}
