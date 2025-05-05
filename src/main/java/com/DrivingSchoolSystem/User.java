package com.DrivingSchoolSystem;

public class User {
    private String fullName;
    private String email;
    private String password;


    public User(String email, String sampleUser) {}

    public User(String email, String password,String FullName) {
        this.email = email;
        this.password = password;
        this.fullName = FullName;
    }

    // Getters and setters (Encapsulation)
    public String getEmail() {
        return email; }

    public String getPassword() {
        return password; }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}

