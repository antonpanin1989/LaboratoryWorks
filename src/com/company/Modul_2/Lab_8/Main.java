package com.company.Modul_2.Lab_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = {new Rectangle("Grey", "Rectangle 1 ", 55.245, 9.058),
                new Rectangle("Red", "Rectangle 2 ", 5.215, 69.058),
                new Rectangle("Brouwn", "Rectangle 3 ", 9, 69.058),
                new Rectangle("Yellow", "Rectangle 4 ", 98.789, 89.058),
                new Rectangle("Black", "Rectangle 5 ", 5, 3.8),
                new Circle("Black", "Кружок 1", 18.60),
                new Circle("Black", "Кружок 2", 9.5460),
                new Triangle("Green", "Tringle 1", 58.266, 95, 96.3548),
                new Triangle("Green", "Tringle 2", 79.266, 95.2155, 86.3548)};

        for (Shape shape1 : shape) {
            System.out.println(shape1);
            System.out.println(shape1.calcArea());
            shape1.draw();
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Shape[] shapes2 = {new Rectangle("Red", "Rectangle 1 ", 55.215, 55.058), new Rectangle("Grey", "Rectangle 2 ", 5.245, 9.058),
                new Rectangle("Grey", "Rectangle 3 ", 28, 958.8),
                new Rectangle("Grey", "Rectangle 4 ", 2, 9.8)};
        Arrays.sort(shapes2);
        for (Shape shape1 : shapes2) {
            System.out.println(shape1);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        Shape[] shapes3 = { new Circle("Red", "Кружок 1", 1.60),
                        new Circle("Yellow", "Кружок 2", 91.5460),
                        new Circle("A", "Кружок 3", 128.60),
                        new Circle("Black", "Кружок 4", 9.5460) };

        Arrays.sort(shapes3,
                new CircleComparator());
        for (Shape shape1 : shapes3) {
            System.out.println(shape1);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Arrays.sort(shapes3,new ColorCompare());
        for (Shape shape1 : shapes3) {
            System.out.println(shape1);
        }

    }
}
