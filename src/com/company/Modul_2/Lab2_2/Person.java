package com.company.Modul_2.Lab2_2;

/**
 * Created by Anton on 04.02.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String OverloadingMetod(String firstName) {
        return " FirstName  - " + firstName;
    }

    public String OverloadingMetod(String firstName, String lastName) {
        return "LastName  - " + lastName;
    }

    public String OverloadingMetod(int age) {
        return "Age " + age;
    }

    public String OverloadingMetod(String firstName, String lastName, String gender) {
        return firstName + " " + " " + lastName + " " + gender;
    }

    public String OverloadingMetod(int phoneNumber, String lastName) {
        return phoneNumber + " " + lastName;
    }
}


