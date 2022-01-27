package com.classes;


import com.classes.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author eddy2
 */
public final class Session {

    private static Session session;
    private User userLogged;

    private Session() {
    }

    public static Session getCurrentInstance() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void setUserLogged(User userLogged) {
        this.userLogged = userLogged;
    }

    public User getUserLogged() {
        return this.userLogged;
    }

}
