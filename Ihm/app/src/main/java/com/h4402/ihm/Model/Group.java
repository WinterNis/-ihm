package com.h4402.ihm.Model;

import java.util.List;

/**
 * Created by thomas on 16/12/2015.
 */
public class Group {

    private List<Person> people;
    private String name;


    public Group(String n){
        name = n;
    }

    public Group(String n, List<Person> g){
        name = n;
        people = g;
    }


    public List<Person> getGroups (){
        return people;
    }

    public void addPerson( Person p){
        people.add(p);
    }

    public void deletePerson( Person p){
        people.remove(p);
    }

    public String getName(){
        return name;
    }
}
