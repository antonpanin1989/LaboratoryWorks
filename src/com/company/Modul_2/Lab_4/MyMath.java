package com.company.Modul_2.Lab_4;

/**
 * Created by Anton on 05.02.2017.
 */
public class MyMath {
    public final static double PI = Math.PI;
    public static String findMax(int... arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return "Максимальное значение = " + max;
    }

    public static String findMin(int... arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return "Минимальное значение = " + min;
    }
    public static String areaOfCircle(int i){
        double sCircle = PI * i;
        return "Площадь круга = " + sCircle;
    }
}

