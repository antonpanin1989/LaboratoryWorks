package com.company.Modul_2.Lab2_2;

/**
 * Created by Anton on 04.02.2017.
 */
public class Employee {


    public String calcSalary(String name, double... totalSalary) {
        double summa = 0;
        for (double d : totalSalary) {
            summa += d;
        }
        return "Имя - " + name + " ; " + "Общий зарабаток " + summa;
    }
}

