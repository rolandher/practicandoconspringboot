package com.practicandoconspringboot.practicando.bean;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency{

   private MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency () {
        int number=1;
        System.out.println(myOperation.suma(number));
        System.out.println("Hola desde la dependencia 2 del bean 2");
    }

}
