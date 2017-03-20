package com.company.Modul_2.Lab_8;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created by Антон on 24.02.2017.
 */
public class CircleComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Circle circle = (Circle)o1;
        Circle circle1 = (Circle)o2;
        return (int) (((Circle) o1).calcArea() - circle1.calcArea());
    }
}
