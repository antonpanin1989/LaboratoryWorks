package Modul1;

import java.util.Scanner;

/**
 * Created by Anton on 11.01.2017.
 */
public class Lab1_5_7 {
    public static void main(String[] args) {
        System.out.println("Введите любое число  ");
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        for (long i = 1; i < l; i++) {

            long sum = 0;
            for (long j = 1; j < i; j++) {
                if (i != 1) {
                    long r1 = i - 1;
                    long r = i % j;
                    if (r == 0) {
                        sum += j;
                    }
                    if (j == r1 & sum == i) {
                        System.out.println("Совершенное число - " + i);
                        for (long k = 1; k < i; k++) {
                            long rk2 = i - 1;
                            long rk = i % k;
                            if (k == 1) {
                                System.out.print("Делители Совершенного числа -   ");
                            }
                            if (rk == 0) {
                                System.out.print(k + "  ");
                            }
                            if (k == rk2) {
                                System.out.println(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
