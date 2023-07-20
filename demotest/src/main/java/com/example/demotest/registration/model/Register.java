package com.example.demotest.registration.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Register {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username ;

    @Column(name = "userlogin")
    private String userlogin ;

    @Column(name = "userpassword")
    private String userpassword;

    public Register() {
    }

    public Register(String username, String userlogin) {
        this.username = username;
        this.userlogin = userlogin;
    }

    public String getUsername() {
        return username;
    }

    public String getUserlogin() {
        return userlogin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", userlogin='" + userlogin + '\'' +"," +
                " userpassword='" + userpassword + '\'' +
                '}';
    }
}

