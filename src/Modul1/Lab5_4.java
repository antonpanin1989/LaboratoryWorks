package Modul1;

/**
 * Created by Anton on 08.01.2017.
 */
public class Lab5_4 {
    public static void main(String[] args) {
        int e10 = 0;

        for (int i = 1; i <= 300; i++) {
            int y3 = i % 3;
            int y4 = i % 4;
            if (y3 == 0 | y4 == 0) {
                e10 += 1;
                if (e10 <= 10) {
                    System.out.println(i);
                }
            }
        }
    }
}