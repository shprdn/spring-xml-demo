package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDemo {
    public static void main(String[] args) {
        //setting the configuration location
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //creating BeanLifeCycleDemoBean object
        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean("bean",BeanLifeCycleDemoBean.class);
        //close down the application context
        context.registerShutdownHook();

    }
}
