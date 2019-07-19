package com.stackroute.domain;

public class Actor {
    //data variables
    private String name;
    private String gender;
    private int age;
    //default constructor
    public Actor(){};
   //setters and getters
    public String getName() {
        return name;
    } 

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //toString method
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public void print()
    {
        System.out.println("Name="+name);
    }




}
