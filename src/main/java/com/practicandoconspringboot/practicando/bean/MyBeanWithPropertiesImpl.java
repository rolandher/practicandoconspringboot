package com.practicandoconspringboot.practicando.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithPropertiesImpl implements MyBeanWithProperties{

    Log LOGGER = LogFactory.getLog(MyBeanWithPropertiesImpl.class);
    private String name;
    private String surname;

    public MyBeanWithPropertiesImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;

        LOGGER.info("este mensaje es informativo desde properties");
    }

    @Override
    public String Function() {
        return name + "-" + surname;
    }

}
