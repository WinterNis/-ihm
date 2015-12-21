package com.h4402.ihm.Model;

/**
 * Created by thomas on 16/12/2015.
 * A user a a name and also an avatar.
 */
public class User {
    private String name;
    private int avatarSrc;

    /**
     * Constructor
     * @param n name of the user
     * @param av id of the avatar
     */
    public User(String n, int av){
        name = n;
        avatarSrc = av;
    }

    /**
     * Name getter
     * @return the name the user
     */
    public String getName(){
        return name;
    }

    /**
     * Avatar getter
     * @return the id of the user's avatar
     */
    public int getAvSrc(){
        return avatarSrc;
    }
}
