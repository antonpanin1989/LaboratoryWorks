package com.company.Modul_2.Lab_5;

import java.util.Arrays;

/**
 * Created by Anton on 06.02.2017.
 */
public class MyInit {
    private static int[] arr = new int[10];
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());

        }
    }
    public String printArray() {
       return " Array  = " + Arrays.toString(arr);
    }
}
