package com.company.Modul_2.Lab2_2;

import java.util.Scanner;

/**
 * Created by Anton on 04.02.2017.
 */
public class ResultA {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Введите значение стороны четырехугольника  a ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println("Введите значение стороны четырехугольника b ");
        int b1 = sc.nextInt();
        System.out.println("Введите значение стороны квадрата а ");
        int a2 = sc.nextInt();
        System.out.println("Введите значение стороны квадрата b ");
        int b2 = sc.nextInt();
        System.out.println("Введите радиус круга R ");
        int r = sc.nextInt();
        System.out.println(a.SquareOfRectangle(a1,b1));
        System.out.println(a.SquareOfSquare(a2,b2));
        System.out.println(a.SquareOfCircle(r));
    }
}
