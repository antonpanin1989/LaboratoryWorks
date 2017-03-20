package com.company.Modul_2.Lab2_2;

import java.util.Arrays;

/**
 * Created by Anton on 30.01.2017.
 */
public class Matrix {
    public int[][] addition(int[][] arr1, int[][] arr2) {
        int[][] Sumar = new int[arr1.length][arr2.length];
        for (int i1 = 0, i2 = 0; (i1 < arr1.length) & (i2 < arr2.length); i1++, i2++) {
            for (int j1 = 0, j2 = 0; (j1 < arr1[i1].length) & (j2 < arr2[i2].length); j1++, j2++) {
                int sum = arr1[i1][j1] + arr2[i2][j2];
                Sumar[i1][j1] = sum;
            }
        }
        return Sumar;
    }


}

