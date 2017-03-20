package com.company.Modul_2.Lab_11.WrapperDemo2;


import java.util.StringTokenizer;

public class Triangle extends Shape {
    public String name;
    public String ShapeColor;
    private double a;
    private double b;
    private double c;

    public static Object parseTringle(String shape) {
        StringTokenizer s1 = new StringTokenizer(shape, ":");
        String[] str = new String[10];
        int i = 0;
        while (s1.hasMoreElements()) {
            str[i] = String.valueOf(s1.nextElement());
            i++;
        }
        Triangle triangle = new Triangle(str[0], str[1], Double.valueOf(str[2]), Double.valueOf(str[3]), Double.valueOf(str[4]));
        return triangle;
    }



    public Triangle(String name, String shapeColor, double a, double b, double c) {
        this.name = name;
        ShapeColor = shapeColor;
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double calcArea() {
        this.a = a;
        this.b = b;
        this.c = c;
        double area = (a * b) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "This is : " + name + "  " + "Color is : " + ShapeColor + "  " +
                "a = " + a +
                ", b = " + b +
                ", c = " + c+ "The area is " + calcArea();
    }
}

