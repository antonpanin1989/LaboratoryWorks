package Modul1;

import java.util.Scanner;

/**
 * Created by Anton on 04.01.2017.
 */
public class Lab1_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2" + "1");
                    break;
                case 3:
                    System.out.println("3" + "2" + "1");
                    break;
                case 4:
                    System.out.println("4" + "3" + "2" + "1");
                    break;
                case 5:
                    System.out.println("5" + "4" + "3" + "2" + "1");
                    break;
                case 6:
                    System.out.println("6" + "5" + "4" + "3" + "2" + "1");
                    break;
                case 7:
                    System.out.println("7" + "6" + "5" + "4" + "3" + "2" + "1");
                    break;
                case 8:
                    System.out.println("8" + "7" + "6" + "5" + "4" + "3" + "2" + "1");
                    break;

            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x (от 1-9)");
        int x = scanner.nextInt();
        System.out.println("Введите значение x (от 1-9)");
        int y = scanner.nextInt();

        if (x > 9) {

            System.out.println("Other");
        }
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Fhor");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
        if (y > 9) {

            System.out.println("Other");
        }
        switch (y) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Fhor");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }
}
