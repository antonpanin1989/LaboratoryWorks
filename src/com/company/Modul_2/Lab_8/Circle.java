package com.company.Modul_2.Lab_8;


import java.util.Comparator;

public class Circle extends Shape {
    private double radius;
    private double area;

    public double getRadius() {
        return radius;
    }

    public Circle(String shapeColor, String name, double radius) {
        super(shapeColor, name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is Circle");
    }

    @Override
    public double calcArea() {
        this.radius = radius;
        double area = Math.PI * Math.pow(radius, 2);
        this.area = area;
        return area;
    }

    @Override
    public String toString() {
        return "This is : " + super.name + "  " + "Color is : " + super.ShapeColor + "  " +
                "radius = " + radius + " The area of Circle = " + calcArea();
    }
}



