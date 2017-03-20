package com.company.Modul_2.Lab_8;


import java.util.Comparator;

public class Rectangle extends Shape implements Comparable<Rectangle>{
    private double width;
    private double height;


    public Rectangle(String shapeColor, String name, double width, double height) {
        super(shapeColor, name);
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("This is Rectangle");
    }

    @Override
    public double calcArea() {
        this.width = width;
        this.height = height;
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "This is : " + super.name + "  " + "Color is : " + super.ShapeColor + "  " + "width = " + width +
                ", height = " + height + " " + "The area of Rectangle = " + calcArea();
    }


    @Override
    public int compareTo(Rectangle o) {
        return (int) (this.calcArea()-o.calcArea());
    }

//    @Override
//    public int compareTo(Rectangle o) {
//        if (this.calcArea() > o.calcArea()) return 1;
//        if (this.calcArea() < o.calcArea()) return -1;
//        return 0;
//    }
}

