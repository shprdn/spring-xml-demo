package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    //creating actor class objects
    Actor actor1;
    Actor actor2;
    Actor actor3;

    //default constructor
    public Movie() {

    }
    //parameterized constructor for dependency injection
    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }
    //method to get the details of actors
    public void getDetails() {
        System.out.println("Name is "+actor1.getName()+"\n"+"Gender is "+actor1.getGender()+"\n"+"Age is "+actor1.getAge());
        System.out.println("Name is "+actor2.getName()+"\n"+"Gender is "+actor2.getGender()+"\n"+"Age is "+actor2.getAge());
        System.out.println("Name is "+actor3.getName()+"\n"+"Gender is "+actor3.getGender()+"\n"+"Age is "+actor3.getAge());
    }
}