package com.company.Modul_2.Lab_7.com.brainacad.oop.testshapes;

/**
 * Created by Антон on 18.02.2017.
 */
public class Circle extends Shape {
    private double radius;


    public Circle(String shapeColor, String name, double radius) {
        super(shapeColor, name);
        this.radius = radius;

    }


    public double calcArea() {
        this.radius = radius;
        double area = Math.PI * Math.pow(radius, 2);
        return area;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius = " + radius + " The area of Circle = " + calcArea();

    }
}
