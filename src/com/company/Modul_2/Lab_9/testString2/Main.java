package com.company.Modul_2.Lab_9.testString2;


public class Main {
    public static void main(String[] args) {
        String MyStr1 = "cartoon";
        String MyStr2 = "tomcat";
        char[] str1 = MyStr1.toCharArray();
        char[] str2 = MyStr2.toCharArray();
        int res1;
        int res2;
        int leng1 = MyStr2.length();
        int leng2 = MyStr1.length();
        System.out.println("Буквы первого слова, которых нет во втором  : ");
        for (char c : str1) {
            int index = -1;
            m:
            stop:
            do {
                res1 = leng1 - 1;
                index = MyStr2.indexOf(c, index + 1);
                if (index >= 0) {
                    leng1 = res1;
                    break m;
                } else System.out.println(c);
                break stop;
            } while (res1 > 0);
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Буквы второго слова которых нет в первом слове :  ");
        for (char c : str2) {
            int index = -1;
            m:
            stop:
            do {
                res2 = leng2 - 1;
                index = MyStr1.indexOf(c, index + 1);
                if (index >= 0) {
                    leng2 = res2;
                    break m;
                } else System.out.println(c);
                break stop;
            } while (res2 > 0);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Способо через charAt ");
        for (int i = 0; i < str1.length; i++) {
            m:
            for (int j = 0; j < str2.length; j++) {
                char s1 = MyStr1.charAt(i);
                char s2 = MyStr2.charAt(j);
                if (s1 == s2) {
                    break m;
                } else if (str2.length - 1 <= j) {
                    System.out.println(s1);
                }
            }

        }
    }
}

