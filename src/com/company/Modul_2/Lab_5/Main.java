package com.company.Modul_2.Lab_5;

import java.util.Arrays;

/**
 * Created by Anton on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyInitTest myInitTest = new MyInitTest();
        System.out.println(myInitTest);

        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();

        System.out.println(myInit1.printArray());
        System.out.println(myInit2.printArray());

        InitTes initTes1 = new InitTes();
        InitTes initTes2 = new InitTes();
        InitTes initTes3 = new InitTes();
        InitTes initTes4 = new InitTes();
        InitTes initTes5 = new InitTes();
        System.out.println(initTes1.getId());
        System.out.println(initTes2.getId());
        System.out.println(initTes3.getId());
        System.out.println(initTes4.getId());
        System.out.println(initTes5.getId());

    }
}
