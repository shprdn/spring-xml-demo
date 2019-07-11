package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    private Actor actor;

    public Movie(){

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void getDetails()
    {
        actor.display();
    }
}
