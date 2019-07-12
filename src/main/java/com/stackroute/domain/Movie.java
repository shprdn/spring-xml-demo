package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //creating actor class objects
    private Actor actor;



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
}