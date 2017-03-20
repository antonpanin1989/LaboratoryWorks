package com.company.Modul_2.Lab_11.ExceptionDemo;

/**
 * Created by Антон on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Misha");
        person.setLastName("fff");
        try {
            person.setAge(500);
        }catch (InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        System.out.println(person);
    }
}
