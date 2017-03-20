package com.company.Modul_2.Lab_10.WrapperDemo;

/**
 * Created by Антон on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 700;
        Integer x2 = new Integer(700);
        Integer x3 = Integer.valueOf(700);
        Integer x4 = Integer.parseInt("700");
        System.out.println("Сравнение х1 ");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("с помощью == ");
        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println("с помощью equals ");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));

    }
}

