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
        //calling methods
        //close down the application context
        context.registerShutdownHook();

    }
}

//OUTPUT
//ul 12, 2019 11:50:47 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
//        INFO: Loading XML bean definitions from class path resource [beans.xml]
//        This is postProcessBeforeInitialization......
//        afterPropertiesSet()
//        Hey! I am initializing......
//        This is postProcessAfterInitialization.......
//        Jul 12, 2019 11:50:47 AM org.springframework.context.support.ClassPathXmlApplicationContext doClose
//        INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@64bf3bbf: startup date [Fri Jul 12 11:50:46 IST 2019]; root of context hierarchy
//        Destroy()
//        OKay! Bye...
