package com.h4402.ihm.Model;

import java.util.List;

/**
 * Created by thomas on 16/12/2015.
 *
 * A group is specific to a restaurant. His main characteristics are the people inside this group
 * and the hour they want to eat.
 */
public class Group {

    private List<User> users;
    private String name;
    private String hour;

    /**
     * Constructor
     * @param n Name of the group
     * @param g List of Users inside this group
     * @param h Hour they want to eat
     */
    public Group(String n, List<User> g, String h){
        name = n;
        users = g;
        hour = h;
    }

    /**
     * User getter
     * @return users inside the group
     */
    public List<User> getUsers (){
        return users;
    }

    /**
     * Add a user inside the group
     * @param u User to add
     */
    public void addUser( User u){
        users.add(u);
    }

    /**
     * Delete a user form the group
     * @param u User to remove
     */
    public void deleteUser( User u){
        users.remove(u);
    }

    /**
     * Name getter
     * @return name of the group
     */
    public String getName(){
        return name;
    }

    /**
     * Hour getter
     * @return hour of the meeting
     */
    public String getHour() { return hour; }
}
