package Modul1;

import java.util.Arrays;

/**
 * Created by Anton on 08.01.2017.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] i = new int[15];
        for (int y = 0; y <i.length; y++) {
            i[y] = (y + 1) * 2;
        }
        for(int r : i){
            System.out.println(r);
        }
        System.out.println(Arrays.toString(i));
    }
}
