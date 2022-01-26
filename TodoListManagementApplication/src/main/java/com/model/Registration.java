package com.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "registration",schema = "registration")
public class Registration {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="username",unique=true)
    @NotNull(message = "Can not be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "only alphabets allowed")
    public String username;

    @Column(name="password")
    @NotNull(message = "Can not be empty")
    public String password;

    @Column(name="fullname")
    @NotNull(message = "Can not be empty")
    public String fullname;

    @Column(name="mobile")
    @NotNull(message = "Can not be empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Only right mobile number is allowed")
    public String mobile;

    @Column(name="dob")
    @NotNull(message = "Can not be empty")
    public String dob;

    @Column(name="email")
    @NotNull(message="Provide your email")
    @Email(message = "Should be in email format")
    public String email;

    public Registration() {
    }

    public Registration(int id, String username, String password, String fullname, String mobile, String dob, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.mobile = mobile;
        this.dob = dob;
        this.email = email;
    }

    public Registration(String username, String password, String fullname, String mobile, String dob, String email) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.mobile = mobile;
        this.dob = dob;
        this.email = email;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
