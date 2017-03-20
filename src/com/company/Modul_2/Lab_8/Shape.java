package com.company.Modul_2.Lab_8;

/**
 * Created by Антон on 18.02.2017.
 */
public abstract class Shape implements Drawable {
    public String ShapeColor;
    public String name;

    public Shape(String shapeColor, String name) {
        ShapeColor = shapeColor;
        this.name = name;
    }

    public abstract double calcArea();

    public abstract String toString();
}