package com.company.Modul_2.Lab2_2;

import java.util.Arrays;

/**
 * Created by Anton on 30.01.2017.
 */
public class Main {
    public static int[][] multiplication(int[][] arr1, int[][] arr2) {
        int LengthArr1 = arr1.length;
        int LengthArr2 = arr2.length;
        int n = arr2[0].length;
        int[][] res = new int[LengthArr1][n];
        for (int i = 0; i < LengthArr1; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < LengthArr2; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] Array1 = {{1, 2, 3}, {3, 4, 5}, {3, 2, 1}};
        int[][] Array2 = {{3, 2, 1}, {1, 0, 1}, {2, 3, 1}};
        Matrix matrix = new Matrix();
        System.out.print(Arrays.deepToString(matrix.addition(Array1,Array2)));
        System.out.println(" ");
        System.out.println(Arrays.deepToString(multiplication(Array1,Array2)));
    }

}