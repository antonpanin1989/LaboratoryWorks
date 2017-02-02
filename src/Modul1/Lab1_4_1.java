package Modul1;

/**
 * Created by Anton on 03.01.2017.
 */
public class Lab1_4_1 {
    public static void main(String[] args) {
        short a = 1;
        byte b = 2;
        int c = 3;
        long d = 4;
        float e = 31.1f;
        double f = 32.123;
        boolean g = true;
        System.out.println(a + "\n"
                + b + "\n"
                + c + "\n"
                + d + "\n"
                + e + "\n"
                + f + "\n"
                + g + "\n");

        byte rs = (byte) (a + b);
        short sr = (short) (a + b);
        double o = d / c;
        double oo = f / e;
        int y = (int) (d % 2);
        System.out.println(rs + "\n" + sr + "\n" + o + "\n" + oo + "\n" + y);

        if (a > 0 & b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a > 0 & b < 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a > 0 | b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a < 0 | b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        int i = 5;
        boolean ii = (!(i > 2));
        System.out.println(ii);

        if (a > 0 ^ b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a < 0 ^ b < 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a < 0 ^ b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        if (a < 0 ^ b > 0) {
            System.out.println("Верно");
        } else System.out.println("Не верно");

        int r = 7;
        int rr = (r++ + ++r) + r++;
        int t = 2;
        int rt = (t++ + ++t) + t--;
        System.out.println(rr);
        System.out.println(rt);

        int q = 10;
        int qq = q >> 1;
        int qqq = q << 1;
        System.out.println(qq);
        System.out.println(qqq);

        int Nnot = 10;
        int nnn = ~Nnot;
        System.out.println(nnn);


        int yyy = 10;
        int yy = yyy >= 10 ? 22 : 30;
        int yyyy = yyy < 10 ? 22 : 30;
        System.out.println(yy);
        System.out.println(yyyy);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(new Boolean(true));


    }
}
