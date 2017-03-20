package com.company.Modul_2.Lab_11.Demo4;

import java.util.StringTokenizer;

/**
 * Created by Антон on 18.02.2017.
 */
public class Shape {
    public static Object parseShape(String shape) throws Exception {
        if (shape.indexOf(":") == -1) {
            throw new InvalidShapeStringException();
        }
        Object sh = new Object();
        StringTokenizer s1 = new StringTokenizer(shape, ":");
        String[] str = new String[10];
        int i = 0;
        while (s1.hasMoreElements()) {
            str[i] = String.valueOf(s1.nextElement());
            i++;
        }
        switch (str[0]) {
            case ("Rectangle"):
                sh = Rectangle.parseRectangle(shape);
                break;
            case ("Triangle"):
                sh = Triangle.parseTringle(shape);
                break;
            case ("Circle"):
                sh = Circle.parseCircle(shape);
                break;
        }
        return sh;
    }
}


