package com.practicandoconspringboot.practicando.bean;

public class MyOperationImpl implements MyOperation{

    @Override
    public int suma(int number) {
        return number+1;
    }
}
