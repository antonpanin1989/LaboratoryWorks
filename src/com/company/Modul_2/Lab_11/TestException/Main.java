package com.company.Modul_2.Lab_11.TestException;

/**
 * Created by Антон on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Exeption in Block");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Mission Complite");
        }
        System.out.println("-------------------------------------------------");
        MyException myException = new MyException("This is a new Exeption");
        try {
            myException.MyExceptionPrint();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------------------");
        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException e) {
            try {
                System.out.println(e.MyExceptionPrint());
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }

        System.out.println("-------------------------------");
        MyTest myTest1 = new MyTest();
        myTest1 = null;
        try {
            myTest1.test();
        } catch (NullPointerException n1) {
            try {
                System.out.println(new MyTest().test());
            } catch (MyException e) {
                try {
                    System.out.println(e.MyExceptionPrint());
                } catch (Exception e1) {
                    System.out.println(e1.getMessage() + "  " + " new Exaption with null");
                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
