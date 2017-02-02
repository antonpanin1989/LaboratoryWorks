package Modul1;

import java.util.Arrays;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] i = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int j = 0; j < i.length; j++) {
            for (int k = 0; k < i[j].length; k++) {
                System.out.print(i[k][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
