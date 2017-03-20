package com.company.Modul_2.Lab_3;

import com.company.Modul_2.Lab_3.MyWindow;

import java.util.Arrays;

/**
 * Created by Anton on 05.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(555.8, 980.0, 5, "green", true);
        MyWindow myWindow2 = new MyWindow(558.3, 80.0, 2, "red", false);
        MyWindow myWindow3 = new MyWindow(225.8, 159.0, 159, "black", true);
        MyWindow myWindow4 = new MyWindow(789.8, 10280.0, 120, "withe", true);
        MyWindow myWindow5 = new MyWindow(552220.8, 98799680.0, 1, "yellow", true);
        MyWindow myWindow6 = new MyWindow();
        System.out.println(myWindow1.printFilds());
        System.out.println(myWindow2.printFilds());
        System.out.println(myWindow3.printFilds());
        System.out.println(myWindow4.printFilds());
        System.out.println(myWindow5.printFilds());
        System.out.println(myWindow6.printFilds());
        System.out.println("--------------------------------------------------------------------------------------------------");
        MyWindow[] myWindowsArr = new MyWindow[4];
        for (int i = 0; i < myWindowsArr.length; i++) {
            if (i == 0) {
                myWindowsArr[i] = new MyWindow(552220.8, 98799.0, 1, "yellow", true);
            } else if (i == 1) {
                myWindowsArr[1] = new MyWindow();
            } else if (i == 2) {
                myWindowsArr[2] = new MyWindow(555, 444);
            } else if (i == 3) {
                myWindowsArr[3] = new MyWindow(55987, 3697, 0000);
            }
        }
        for (MyWindow myWi : myWindowsArr) {
            System.out.println(myWi.printFilds());
        }
    }
}
