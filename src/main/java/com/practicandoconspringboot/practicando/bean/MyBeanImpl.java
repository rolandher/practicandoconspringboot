package com.practicandoconspringboot.practicando.bean;

public class MyBeanImpl implements MyBean {

    @Override
    public void print() {
        System.out.println("Hola desde mi primer bean");
    }
}
