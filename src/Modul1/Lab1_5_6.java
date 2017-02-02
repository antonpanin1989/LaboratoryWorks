package Modul1;

import java.util.Scanner;

/**
 * Created by Anton on 09.01.2017.
 */
public class Lab1_5_6 {
    public static void main(String[] args) {
        System.out.println("Введите любое число от 1 - 1 000 000");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i < 10) {
            double y = Math.pow(i, 2);
            System.out.println(y);
        } else if (i >= 10 & i <= 99) {
            int r1 = i / 10;
            int r2 = i % 10;
            double sum = Math.pow(r1, 2) + Math.pow(r2, 2);
            System.out.println(sum);
        } else if (i >= 100 & i <= 999) {
            int r1 = i / 100;
            int r2 = (i / 10) % 10;
            int r3 = i % 10;
            double sum = Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2);
            System.out.println(sum);

        } else if (i >= 1000 & i <= 9999) {
            int r1 = i / 1000;
            int r2 = (i / 100) % 10;
            int r3 = (i % 100) / 10;
            int r4 = i % 10;
            double sum = Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2) + Math.pow(r4, 2);
            System.out.println(sum);
        } else if (i >= 10000 & i <= 99999) {
            int r1 = i / 10000;
            int r2 = (i / 1000) % 10;
            int r3 = (i / 100) % 10;
            int r4 = (i % 100) / 10;
            int r5 = i % 10;
            double sum = Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2) + Math.pow(r4, 2) + Math.pow(r5, 2);
            System.out.println(sum);
        } else if (i >= 100000 & i <= 999999) {
            int r1 = i / 100000;
            int r2 = (i / 10000) % 10;
            int r3 = (i / 1000) % 10;
            int r4 = (i % 1000) / 100;
            int r5 = (i % 100) / 10;
            int r6 = i % 10;
            double sum = Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2) + Math.pow(r4, 2) + Math.pow(r5, 2) + Math.pow(r6, 2);
            System.out.println(sum);
        }else if (i == 1000000){
            System.out.println("Введенное число 1 000 000 предел измерений, результат = 155");
        }

        else if (i > 1000000) {
            System.out.println("Введенное число больше 1 000 000");
        }
    }
}
