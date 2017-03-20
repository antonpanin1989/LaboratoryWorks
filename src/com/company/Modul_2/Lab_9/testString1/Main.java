package com.company.Modul_2.Lab_9.testString1;

import java.util.Arrays;

/**
 * Created by Антон on 25.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        String myStr = "abracadabra";
        int i = myStr.indexOf("ra");
        System.out.println(i);
        int last = myStr.lastIndexOf("ra");
        System.out.println(last);
        String substring1 = myStr.substring(3, 7);
        System.out.println(substring1);
        System.out.println(reversString("notna"));
        System.out.println(reversString(myStr));
    }

    public static String reversString(String s) {
        String str = s;
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = b.length - 1, y = 0; i <= a.length; i--, y++) {
            if (i != -1) {
                b[y] = a[i];
            } else break;
        }
        String res = new String(b);
        return res;
    }
}

