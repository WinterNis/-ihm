package com.h4402.ihm.Model;

import java.util.List;

/**
 * Created by thomas on 16/12/2015.
 */
public class Restaurant {
    private List<Group> groups;
    private String name;


    public Restaurant(String n){
        name = n;
    }

    public Restaurant(String n, List<Group> g){
        name = n;
        groups = g;
    }


    public List<Group> getGroups (){
        return groups;
    }

    public void addGroup( Group g){
        groups.add(g);
    }

    public void deleteGroup( Group g){
        groups.remove(g);
    }

    public String getName(){
        return name;
    }
}
