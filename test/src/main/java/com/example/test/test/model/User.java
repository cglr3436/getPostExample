package com.example.test.test.model;

public class User {

    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }

    private String username;
    private int age;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}