package com.company.Modul_2.Lab_5;

/**
 * Created by Anton on 06.02.2017.
 */
public class MyInitTest {
    {
        System.out.println("non static block 1");
    }

    {
        System.out.println("non static block 2");
    }
    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    public MyInitTest() {
        this(1);
        System.out.println("constructor 2");
    }

    public MyInitTest(int i) {
        System.out.println("constructor  " + i);
    }

}
