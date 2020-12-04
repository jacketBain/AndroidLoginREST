package com.example.webserverandroid.model;


import javax.persistence.*;

@SequenceGenerator(name = "SEQ_USER",sequenceName = "SEQ_USER")
@Entity
@Table(name = "USERANDROID")
public class User {

    @Id
    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
