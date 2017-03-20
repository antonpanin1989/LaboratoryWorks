package com.company.Modul_2.Lab_11.WrapperDemo2;

/**
 * Created by Антон on 05.03.2017.
 */
public class Main {
    static Long compute(Byte x, Integer y) {
        Long res = Long.valueOf(x + y);
        assert res==0 : "Операнты должны быть больше 0";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compute((byte) 25, 25));

    }
}