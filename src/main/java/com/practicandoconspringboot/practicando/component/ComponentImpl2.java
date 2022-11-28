package com.practicandoconspringboot.practicando.component;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ComponentImpl2 implements ComponentDependency{
    @Override
    public void hello() {
        System.out.println("Hola desde el segundo componente");
    }
}
