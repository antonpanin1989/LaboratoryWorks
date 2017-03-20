package com.company.Modul_2.Lab_9.TestTokennizer;

import java.util.StringTokenizer;

/**
 * Created by Антон on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created byStudent:Name of Student.";
        StringTokenizer s1Space = new StringTokenizer(myStr," ");
        while (s1Space.hasMoreElements()){
            System.out.println(s1Space.nextElement());
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("  ");
        StringTokenizer s2Coma = new StringTokenizer(myStr,",");
        while (s2Coma.hasMoreElements()){
            System.out.println(s2Coma.nextElement());
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("  ");
        StringTokenizer s3Dot = new StringTokenizer(myStr,".");
        while (s3Dot.hasMoreElements()){
            System.out.println(s3Dot.nextElement());
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("  ");
        StringTokenizer s4DD = new StringTokenizer(myStr,":");
        while (s4DD.hasMoreElements()){
            System.out.println(s4DD.nextElement());
        }
    }
}
