package com.company.Modul_2.Lab_10.WrapperDemo2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Антон on 05.03.2017.
 */
public class Main {
    static Long compute(Byte x, Integer y) {
        Long res = Long.valueOf(x + y);
        return res;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.parseShape("Rectangle:RED:10:100"));
        System.out.println(shape.parseShape("Circle:Grey:1258"));
        System.out.println(shape.parseShape("Triangle:Black:10:126:147"));
        System.out.println("Введите длину масива ");
        Scanner sc = new Scanner(System.in);
        String Length = sc.next();
        String ss1 = sc.next();
        String ss2 = sc.next();
        String ss3 = sc.next();
        int i = Integer.parseInt(Length);
        Shape[] shape1 = new Shape[i];
        for (int j = 0; j < shape1.length; j++) {
            if (j == 0) {
                shape1[j] = (Shape) shape.parseShape(ss1);
                System.out.println(shape1[j]);
            } else if (j ==1) {
                shape1[j] = (Shape) shape.parseShape(ss2);
                System.out.println(shape1[j]);
            } else if (j==2) {
                shape1[j] = (Shape) shape.parseShape(ss3);
                System.out.println(shape1[j]);
            }
        }
        sc.close();
    }
}