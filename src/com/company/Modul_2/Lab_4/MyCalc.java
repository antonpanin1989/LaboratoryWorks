package com.company.Modul_2.Lab_4;

import java.util.Scanner;

/**
 * Created by Anton on 06.02.2017.
 */
public class MyCalc {
    public static String calcPi(int pi) {
        double res = pi - (pi / 3) + (pi / 5) - (pi / 7) + (pi / 9) - (pi / 11) + (pi / 13) - (pi / 15) + (pi / 17);
        return "Число Рі от заданого значения " + pi + " = " + res;
    }

    public static void main(String[] args) {
        System.out.println("Введите число для вычисления числа Pi  ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println(calcPi(p));
    }
}
