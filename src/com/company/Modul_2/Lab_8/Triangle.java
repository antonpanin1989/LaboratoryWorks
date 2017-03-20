package com.company.Modul_2.Lab_8;


public class Triangle extends Shape implements Comparable<Triangle>{
    private double a;
    private double b;
    private double c;
    private double area;

    public Triangle(String shapeColor, String name, double a, double b, double c) {
        super(shapeColor, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("This is Tringle");
    }

    @Override
    public double calcArea() {
        this.a = a;
        this.b = b;
        this.c = c;
        double area = (a * b) / 2;
        this.area=area;
        return area;
    }

    @Override
    public String toString() {
        return "This is : " + super.name + "  " + "Color is : " + super.ShapeColor +"  " +
                "a = " + a +
                ", b = " + b +
                ", c = " + c + "  " +  "The area of Tringle = " + calcArea();
    }


    @Override
    public int compareTo(Triangle o) {
        if (this.area>o.area)return 1;
        if (this.area<o.area)return -1;
        return 0;
    }
}



