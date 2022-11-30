package com.practicandoconspringboot.practicando.configuration;


import com.practicandoconspringboot.practicando.bean.MyBeanWithProperties;
import com.practicandoconspringboot.practicando.bean.MyBeanWithPropertiesImpl;
import com.practicandoconspringboot.practicando.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

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

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();


    }
}
