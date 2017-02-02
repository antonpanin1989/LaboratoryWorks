package Modul1;

import java.util.Scanner;

/**
 * Created by Anton on 08.01.2017.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        System.out.println("Задайте любое число");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int sum = 0;
        int e = 0;
        for (int i = 1; i <= q; i++) {
            sum += i;
            e += 1;
        }
        System.out.println("The Sum is   " + sum);
        int avg = sum / e;
        System.out.println("The Avg is   " + avg);
    }
}
