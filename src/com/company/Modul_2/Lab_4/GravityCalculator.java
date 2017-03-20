package com.company.Modul_2.Lab_4;

/**
 * Created by Anton on 06.02.2017.
 */
public class GravityCalculator {
    public static String calcDist(double time) {
        double Acceleration = -9.81;
        int vi = 0;
        int xi = 0;
        double x = 0.5 * Acceleration * Math.pow(time, 2) + vi * time + xi;
        return "Результат вычислений = " + x;
    }
    public static void main(String[] args) {
        System.out.println(calcDist(5));
    }
}
