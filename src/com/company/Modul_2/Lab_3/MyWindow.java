package com.company.Modul_2.Lab_3;

/**
 * Created by Anton on 05.02.2017.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this(2000,100000);
//        this(1000,5000,33);
        this.color = " all colors ";
        this.isOpen = true;

    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public String printFilds() {
        return "MyWindow{" +
                "width = " + width +
                ", height = " + height +
                ", numberOfGlass = " + numberOfGlass +
                ", color = '" + color + '\'' +
                ", isOpen = " + isOpen +
                '}';
    }
}
