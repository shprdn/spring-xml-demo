package com.stackroute.domain;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDemo {
    public static void main(String[] args) {
        //setting the configuration location
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //creating actor class objects
        Actor actor1 = context.getBean("actor1",Actor.class);
        System.out.println(actor1);
        Actor actor2 = context.getBean("actor2",Actor.class);
        System.out.println(actor2);
        Actor actor3 = context.getBean("actor3",Actor.class);
        System.out.println(actor3);
       //creating movie class objects
        Movie movie1 = context.getBean("movie1", Movie.class);
        //movie1.getDetails();
        Movie movie2 = context.getBean("movie1",Movie.class);
       // movie2.getDetails();
        System.out.println(movie1==movie2);
        //for the beans with name not id
        Movie movieA = context.getBean("movieA",Movie.class);
        movieA.getDetails();
        Movie movieB = context.getBean("movieB", Movie.class);
        movieB.getDetails();


    }
}
