package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDemo {
    public static void main(String[] args) {
        //setting the configuration location
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = context.getBean("movie", Movie.class);
        movie.getDetails();
        //Error creating bean with name 'movie1' defined in class path resource [beans.xml]
        //Unsatisfied dependency expressed through bean property 'actor': : No qualifying bean of type [com.stackroute.domain.Actor] is defined: expected single matching bean but found 2:
        // actor,actor2; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        //No qualifying bean of type
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.getDetails();


    }
}
