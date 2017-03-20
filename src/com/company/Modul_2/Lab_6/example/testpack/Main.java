package com.company.Modul_2.Lab_6.example.testpack;
import com.company.Modul_2.Lab_6.applepack.Apple;
import com.company.Modul_2.Lab_6.com.brainacad.carpack.Car;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.setWeigth(52.69);
        Car car = new Car();
        car.setWeigth(1552.987);
        System.out.println(apple.getWeigth());
        System.out.println(car.getWeigth());

    }
}
