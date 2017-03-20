package com.company.Modul_2.Lab2_2;

/**
 * Created by Anton on 04.02.2017.
 */
public class UserPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.OverloadingMetod("Anton"));
        System.out.println(person.OverloadingMetod("Anton","Panin"));
        System.out.println(person.OverloadingMetod(555));
        System.out.println(person.OverloadingMetod("Anton","Panin","Man"));
        System.out.println(person.OverloadingMetod(55598946,"Panin"));

    }
}
