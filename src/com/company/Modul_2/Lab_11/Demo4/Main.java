package com.company.Modul_2.Lab_11.Demo4;


public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        try {
            System.out.println(shape1.parseShape("Rectangle:RED:10:100"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------");
        Shape shape2 = new Shape();
        try {
            System.out.println(shape2.parseShape("RectangleRED10100"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

