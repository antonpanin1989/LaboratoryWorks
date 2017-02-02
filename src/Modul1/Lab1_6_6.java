package Modul1;

import java.util.Arrays;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_6 {
    public static void main(String[] args) {
        int[] temp = {-12,-9,5,12,20,28,31,35,17,3,0,-30};
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("-----------------------------------------------");
        System.out.println(Arrays.toString(temp));
    }
}
