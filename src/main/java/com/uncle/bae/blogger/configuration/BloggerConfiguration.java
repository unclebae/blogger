package com.uncle.bae.blogger.configuration;

import com.uncle.bae.blogger.converter.LocalDateConverterForMVC;
import com.uncle.bae.blogger.converter.LocalDateTimeConverterForMVC;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by KIDO on 2017. 2. 5..
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BloggerConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        super.addFormatters(registry);
        registry.addConverter(new LocalDateConverterForMVC("yyyy-MM-dd"));
        registry.addConverter(new LocalDateTimeConverterForMVC("yyyy-MM-dd'T'HH:mm:ss"));
    }
}
