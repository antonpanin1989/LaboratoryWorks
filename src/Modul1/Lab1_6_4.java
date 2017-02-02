package Modul1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] i = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(Arrays.toString(i));
        System.out.println("Введите порядковый номер элемента ");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        System.out.println(i[sc]);
        Arrays.sort(i);
        System.out.println("Введите число, для определения порядкового номера");
        int o = scanner.nextInt();
        System.out.println(Arrays.binarySearch(i,o));
    }
}



