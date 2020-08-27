package com.zagurskaya.triangle.action;

import com.zagurskaya.triangle.entity.Triangle;

public class Calculation {

    public Double getArea(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        return round(0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
    }

    public Double getPerimeter(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        Double vectorBySide1 = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        Double vectorBySide2 = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        Double vectorBySide3 = Math.sqrt(square(x3 - x1) + square(y3 - y1));

        return round(vectorBySide1 + vectorBySide2 + vectorBySide3);
    }

    private Double square(Double number) {
        return Math.pow(number, 2);
    }

    private Double round(Double value) {
        Double scale = Math.pow(10, 2);
        return Math.ceil(value * scale) / scale;
    }
}
