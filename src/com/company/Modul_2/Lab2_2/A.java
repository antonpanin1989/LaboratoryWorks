package com.company.Modul_2.Lab2_2;

/**
 * Created by Anton on 04.02.2017.
 */
public class A {
    public String SquareOfRectangle(int a, int b) {
        int square = a * b;
        return "сторона а = " + a + "\n" +
                "сторона b = " + b + "\n" +
                "Площадь прямоугольника = " + square;
    }

    public String SquareOfSquare(int a, int b) {
        int square = a * b;
        return "сторона а = " + a + "\n" +
                "сторона b = " + b + "\n" +
                "Площадь квадрата = " + square;

    }

    public String SquareOfCircle(int a) {
        double square = Math.PI * Math.pow(a, 2);
        return "Радиус R = " + a + "\n" +
                "Площадь круга = " + square;
    }
}