package edu.rit.group7.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String fullName;
    private String phoneNumber;
    private int age;
    private String city;
    private String email;
    private List<RecyclingLog> logs = new ArrayList<>();  // One-to-many: user enrolls in logs

    // Default constructor
    public User() {}

    // Constructor without logs
    public User(String fullName, String phoneNumber, int age, String city, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    // Full constructor
    public User(String fullName, String phoneNumber, int age, String city, String email, List<RecyclingLog> logs) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.city = city;
        this.email = email;
        this.logs = logs != null ? logs : new ArrayList<>();
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RecyclingLog> getLogs() {
        return logs;
    }

    public void setLogs(List<RecyclingLog> logs) {
        this.logs = (logs != null) ? logs : new ArrayList<>();
    }
}
