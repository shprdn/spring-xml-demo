package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    //creating actor class objects
    Actor actor1;

    //default constructor
    public Movie() {

    }
    //parameterized constructor for dependency injection
    public Movie(Actor actor1) {
        this.actor1 = actor1;
        
    }
    //method to get the details of actors
    public void getDetails() {
        System.out.println("Name is "+actor1.getName()+"\n"+"Gender is "+actor1.getGender()+"\n"+"Age is "+actor1.getAge());
       
    }
}
