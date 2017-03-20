package com.company.Modul_2.Lab_9.TestRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Антон on 02.03.2017.
 */
public class Main {
    static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pt = Pattern.compile("[A-Z]?[a-z]+$");
        Matcher m = pt.matcher(userNameString);
        boolean res = m.matches();
        return res;
    }

    public static void main(String[] args) {
        String[] str1 = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String s : str1) {

            System.out.println(" " + s + " " + checkPersonWithRegExp(s));
        }
    }
}
