package com.practicandoconspringboot.practicando.configuration;

import com.practicandoconspringboot.practicando.bean.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean myBeanOperation() {
        return new MyBeanImpl2();
    }

    @Bean
    public MyOperation Operation() {
        return new MyOperationImpl();
    }

    @Bean
    public MyBeanWithDependency dependency2(MyOperation myOperation) {
        return new MyBeanWithDependencyImpl(myOperation);
    }
}
