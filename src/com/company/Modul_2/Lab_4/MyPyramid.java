package com.company.Modul_2.Lab_4;

/**
 * Created by Anton on 06.02.2017.
 */
public class MyPyramid {
    public static void printPyramid(int h) {
        switch (h) {
            case 1:
                System.out.println("  1  ");
                break;
            case 2:
                System.out.println("  1  ");
                System.out.println(" 121  ");
                break;
            case 3:
                System.out.println("   1  ");
                System.out.println("  121  ");
                System.out.println(" 12321  ");
                break;
            case 4:
                System.out.println("    1  ");
                System.out.println("   121  ");
                System.out.println("  12321  ");
                System.out.println(" 1234321  ");
                break;
            case 5:
                System.out.println("       1     ");
                System.out.println("      121     ");
                System.out.println("     12321     ");
                System.out.println("    1234321     ");
                System.out.println("   123454321     ");
                break;
            case 6:
                System.out.println("       1     ");
                System.out.println("      121     ");
                System.out.println("     12321     ");
                System.out.println("    1234321     ");
                System.out.println("   123454321     ");
                System.out.println("  12345654321     ");
                break;
            case 7:
                System.out.println("          1     ");
                System.out.println("         121     ");
                System.out.println("        12321     ");
                System.out.println("       1234321     ");
                System.out.println("      123454321     ");
                System.out.println("     12345654321     ");
                System.out.println("    1234567654321     ");
                break;
            case 8:
                System.out.println("          1     ");
                System.out.println("         121     ");
                System.out.println("        12321     ");
                System.out.println("       1234321     ");
                System.out.println("      123454321     ");
                System.out.println("     12345654321     ");
                System.out.println("    1234567654321     ");
                System.out.println("   123456787654321     ");
                break;
            case 9:
                System.out.println("          1     ");
                System.out.println("         121     ");
                System.out.println("        12321     ");
                System.out.println("       1234321     ");
                System.out.println("      123454321     ");
                System.out.println("     12345654321     ");
                System.out.println("    1234567654321     ");
                System.out.println("   123456787654321     ");
                System.out.println("  12345678987654321     ");
                break;
        }
    }

    public static void main(String[] args) {
        printPyramid(7);
    }
}



