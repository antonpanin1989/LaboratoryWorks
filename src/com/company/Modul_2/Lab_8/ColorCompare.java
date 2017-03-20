package com.company.Modul_2.Lab_8;

import java.util.Comparator;

/**
 * Created by Антон on 25.02.2017.
 */
public class ColorCompare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Circle circle1 = (Circle)o1;
        Circle circle2 = (Circle)o2;
        return ((Circle) o1).ShapeColor.compareTo(((Circle) o2).ShapeColor);
    }
}
