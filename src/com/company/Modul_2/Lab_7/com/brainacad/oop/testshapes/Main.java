package com.company.Modul_2.Lab_7.com.brainacad.oop.testshapes;

import java.util.Arrays;

/**
 * Created by Антон on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red", "Rectangle");
        System.out.println(shape);
        System.out.println(shape.calcArea());

        Circle circle = new Circle("Black", "Кружок", 10.0);
        System.out.println(circle);
        System.out.println(circle.calcArea());

        Rectangle rectangle = new Rectangle("Brouwn", "Rectangle", 585, 369.058);
        System.out.println(rectangle);
        System.out.println(rectangle.calcArea());

        Triangle triangle = new Triangle("Green", "Tringle", 5847.266, 95, 96.3548);
        System.out.println(triangle);
        System.out.println(triangle.calcArea());

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("     ");
        double totalArea = 0;
        Shape[] arrShape = {new Rectangle("Grey", "Rectangle 1 ", 55.245, 9.058),
                new Rectangle("Red", "Rectangle 2 ", 5.215, 69.058),
                new Rectangle("Brouwn", "Rectangle 3 ", 9, 69.058),
                new Rectangle("Yellow", "Rectangle 4 ", 98.789, 89.058),
                new Rectangle("Black", "Rectangle 5 ", 5, 3.8),
                new Circle("Black", "Кружок 1", 18.60),
                new Circle("Black", "Кружок 2", 9.5460),
                new Triangle("Green", "Tringle 1", 58.266, 95, 96.3548),
                new Triangle("Green", "Tringle 2", 79.266, 95.2155, 86.3548)};

        for (Shape shape1 : arrShape) {
            System.out.println(shape1);
            System.out.println(shape1.calcArea());
            totalArea += shape1.calcArea();
        }
        System.out.println("The total area of all Shaps = " + totalArea);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        double areaRectangle = 0;
        double areaCircle = 0;
        double areaTringle = 0;

        for (Shape shape1 : arrShape) {
            if (shape1 instanceof Rectangle) {
                areaRectangle += shape1.calcArea();
            } else if (shape1 instanceof Circle) {
                areaCircle += shape1.calcArea();
            } else if (shape1 instanceof Triangle) {
                areaTringle += shape1.calcArea();
            }
        }
        System.out.println("The total area of Rectangle  = " + areaRectangle);
        System.out.println("The total area of Circle  = " + areaCircle);
        System.out.println("The total area of Tringle  = " + areaTringle);
    }
}
