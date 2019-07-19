package com.stackroute.domain;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDemo {
    public static void main(String[] args) {
        //setting the configuration location
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //creating movie class objects
        Movie movie1 = context.getBean("movie", Movie.class);
        movie1.getDetails();
        
        //using XmlBeanFactory
        Resource resource = new ClassPathResource("beans.xml");
        //creating movie class objects
        BeanFactory beanfactory = new XmlBeanFactory(resource);
        Movie movie2 = beanfactory.getBean("movie", Movie.class);
        movie2.getDetails();
        
        //using BeanDefinitionReader and BeanDefinitionRegistry
        BeanDefinitionRegistry bandefinitionregistry = new DefaultListableBeanFactory("beans.xml");
        BeanDefinitionReader beandefinitionreader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beandefinitionreader.loadBeanDefinitionReader(new ClassPathResource("beans.xml"));
        //creating movie class objects
        Movie movie3 = (Movie) ((DefaultListableBeanFactory) beandefinitionregistry).getBean("movie");
        movie3.getDetails();
        


    }
}
