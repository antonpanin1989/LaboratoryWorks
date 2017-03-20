package com.company.Modul_2.Lab_7.com.brainacad.oop.testshapes;

/**
 * Created by Антон on 19.02.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(String shapeColor, String name, double a, double b, double c) {
        super(shapeColor, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        this.a = a;
        this.b = b;
        this.c = c;
        double area = (a * b) / 2;
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.b, b) != 0) return false;
        return Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a = " + a +
                ", b = " + b +
                ", c = " + c + "The area of Tringle = " + calcArea();

    }
}

