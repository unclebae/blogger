package com.uncle.bae.blogger.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by KIDO on 2017. 2. 5..
 */
public final class LocalDateConverterForMVC implements Converter<String, LocalDate>{

    private final DateTimeFormatter formatter;

    public LocalDateConverterForMVC(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public LocalDate convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        return LocalDate.parse(source, formatter);
    }
}
