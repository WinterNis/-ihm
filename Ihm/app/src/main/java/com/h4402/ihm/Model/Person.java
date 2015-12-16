package com.h4402.ihm.Model;

/**
 * Created by thomas on 16/12/2015.
 */
public class Person {
    private String name;
    private String avatarSrc;

    public Person(String n, String av){
        name = n;
        avatarSrc = av;
    }

    public String getName(){
        return name;
    }

    public String getAvSrc(){
        return avatarSrc;
    }
}
