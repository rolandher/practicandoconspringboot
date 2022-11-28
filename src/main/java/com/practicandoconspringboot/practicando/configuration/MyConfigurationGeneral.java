package com.practicandoconspringboot.practicando.configuration;


import com.practicandoconspringboot.practicando.bean.MyBeanWithProperties;
import com.practicandoconspringboot.practicando.bean.MyBeanWithPropertiesImpl;
import com.practicandoconspringboot.practicando.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class MyConfigurationGeneral {

    @Value("${value.name}")
    private String name;

    @Value("${value.surname}")
    private String surname;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImpl(name, surname);
    }
}
