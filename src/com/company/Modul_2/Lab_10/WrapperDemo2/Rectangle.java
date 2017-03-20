package com.company.Modul_2.Lab_10.WrapperDemo2;


import java.util.StringTokenizer;

public class Rectangle extends Shape {
    public String name;
    public String ShapeColor;
    private double width;
    private double height;

    public Rectangle(String name, String shapeColor, double width, double height) {
        this.name = name;
        ShapeColor = shapeColor;
        this.width = width;
        this.height = height;
    }
    public static Object parseRectangle(String shape) {
        StringTokenizer s1 = new StringTokenizer(shape, ":");
        String[] str = new String[10];
        int i = 0;
        while (s1.hasMoreElements()) {
            str[i] = String.valueOf(s1.nextElement());
            i++;
        }
        Rectangle rectangle = new Rectangle(str[0], str[1], Double.valueOf(str[2]), Double.valueOf(str[3]));
        return rectangle;
    }

    public double calcArea() {
        this.width = width;
        this.height = height;
        double area = width * height;
        return area;
    }
    @Override
    public String toString() {
        return "This is : " + name + "  " + "Color is : " + ShapeColor + "  " + "width = " + width +
                ", height = " + height + "The area is " + calcArea();
    }
}

