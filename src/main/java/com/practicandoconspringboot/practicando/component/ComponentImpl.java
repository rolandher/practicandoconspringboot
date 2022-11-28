package com.practicandoconspringboot.practicando.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements ComponentDependency{
    @Override
    public void hello() {
        System.out.println("Hola mundo desde mi primer componente");
    }
}
