package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //creating actor class objects
    private Actor actor;
    private ApplicationContext context=null;
    private BeanFactoryAware bean;


    //default constructor
    public Movie() {

    }
    //parameterized constructor for dependency injection
    public Movie(Actor actor) {
        this.actor = actor;
    }


    //method to get the details of actors
    public void getDetails() {
        System.out.println("Name is "+actor.getName()+"\n"+"Gender is "+actor.getGender()+"\n"+"Age is "+actor.getAge());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=context;
        System.out.println("ApplicationContext implemented");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.bean=bean;
        System.out.println("BeanFactory implemented");
    }
}