package Modul1;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = 0;
        int min = 100;
        int sumaverage = 0;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {

            if (m[i] >= max) {
                max = m[i];
            }
            if (m[i] <= min) {
                min = m[i];
            }
            sum += m[i];
        }
        sumaverage = sum / m.length;

        System.out.println(max);
        System.out.println(min);
        System.out.println(sumaverage);
    }
}
