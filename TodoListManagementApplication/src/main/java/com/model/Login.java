package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "login",schema = "login")
public class Login {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="username")
    @NotNull(message = "Can not be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "only alphabets allowed")
    public String username;

    @Column(name="password")
    @NotNull(message = "Can not be empty")
    public String password;

//    private String userEmail;
//
//    public String getUserEmail(){
//        return userEmail;
//    }
//    public void setUserEmail(String userEmail){
//        this.userEmail=userEmail;
//    }
//


    public Login() {
    }

    public Login(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
