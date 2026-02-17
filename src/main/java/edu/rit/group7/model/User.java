package edu.rit.group7.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String FullName;
    private String PhoneNumber;
    private int Age;
    private String City;
    private String Email;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
