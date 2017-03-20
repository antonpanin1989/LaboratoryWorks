package com.company.Modul_2.Lab_7.com.brainacad.oop.testshapes;

/**
 * Created by Антон on 18.02.2017.
 */
public class Shape {
    private String ShapeColor;
    private String name;

    public Shape(String shapeColor, String name) {
        this.ShapeColor = shapeColor;
        this.name = name;
    }

    public void calledcalcArea() {
    }


    public double calcArea() {
        double o = 0.0;
        return o;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        if (!ShapeColor.equals(shape.ShapeColor)) return false;
        return name.equals(shape.name);
    }

    @Override
    public int hashCode() {
        int result = ShapeColor.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Shape -  " + name + " , " +
                "color is: '" + ShapeColor + "  ";
    }
}
