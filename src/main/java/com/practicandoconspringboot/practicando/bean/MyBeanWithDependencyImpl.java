package com.practicandoconspringboot.practicando.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency{


    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImpl.class);
    private MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency () {

        LOGGER.info("Este es un error de la aplicacion");
        int number=1;

        LOGGER.debug("El numero enviado a la dependica es :" + number);
        System.out.println(myOperation.suma(number));
        System.out.println("Hola desde la dependencia 2 del bean 2");
    }

}
