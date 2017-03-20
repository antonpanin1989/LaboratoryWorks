package com.company.Modul_2.Lab_7.com.brainacad.oop.testshapes;

/**
 * Created by Антон on 18.02.2017.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;



    public double calcArea() {
        this.width = width;
        this.height = height;
        double area = width * height;
        return area;
    }

    public Rectangle(String shapeColor, String name, double width, double height) {
        super(shapeColor, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.width, width) != 0) return false;
        return Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width = " + width +
                ", height = " + height + " " + "The area of Rectangle = " + calcArea();

    }
}

