package Modul1;

import java.util.Scanner;

/**
 * Created by Anton on 08.01.2017.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1-9");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            int y = x * i;
            System.out.print(y + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("* | 0 1 2 3 4 5 6 7 8 9");
        System.out.println("------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j <= 9; j++) {
                int y = i * j;
                System.out.print(y + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" ");
        }
    }
}
