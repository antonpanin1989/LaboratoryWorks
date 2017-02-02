package Modul1;

import java.util.Arrays;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_7 {
    public static void main(String[] args) {
        int[][] val = {{1, 1, 1, 5, 5}, {2, 3, 1, 1, 2}, {8, 5, 7, 1, 1}, {1, 8, 1, 9, 8}};
        for (int i = 0; i < val.length; i++) {
            System.out.print("Линия №  " + (i + 1) + " -- " + "   ");
            for (int j = 0; j < val[i].length; j++) {
                if (val[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }

    }
}
