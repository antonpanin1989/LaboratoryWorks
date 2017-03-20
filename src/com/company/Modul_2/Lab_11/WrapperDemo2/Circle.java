package com.company.Modul_2.Lab_11.WrapperDemo2;


import java.util.StringTokenizer;

public class Circle extends Shape {
    public String name;
    public String ShapeColor;
    private double radius;
    public double area;


    public Circle(String name,String shapeColor,double radius) {
        this.radius = radius;
        this.name = name;
        ShapeColor = shapeColor;
    }
    public static Object parseCircle(String shape) {
        StringTokenizer s1 = new StringTokenizer(shape, ":");
        String[] str = new String[10];
        int i = 0;
        while (s1.hasMoreElements()) {
            str[i] = String.valueOf(s1.nextElement());
            i++;
        }
        Circle circle = new Circle(str[0], str[1], Double.valueOf(str[2]));
        return circle;
    }

    public double calcArea() {
        this.radius = radius;
        double area = Math.PI * Math.pow(radius, 2);
        this.area = area;
        return area;
    }

    public String toString() {
        return "This is : " + name + "  " + "Color is : " + ShapeColor + "  " +
                "radius = " + radius + "The area is " + calcArea();
    }
}



