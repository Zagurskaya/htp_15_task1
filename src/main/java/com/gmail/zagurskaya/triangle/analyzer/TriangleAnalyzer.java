package com.gmail.zagurskaya.triangle.analyzer;

import com.gmail.zagurskaya.triangle.entity.Triangle;

public class TriangleAnalyzer {

    public static boolean isRectangularTriangle(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        Double side1 = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        Double side2 = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        Double side3 = Math.sqrt(square(x3 - x1) + square(y3 - y1));


        if (isFirstSideBiggerAsOtherSide(side1,side2,side3)&&
                Double.compare(square(side2) + square(side3), square(side1)) == 0) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side2,side1,side3)&&
                Double.compare(square(side1) + square(side3), square(side2)) == 0) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side3,side2,side1)&&
                Double.compare(square(side2) + square(side1), square(side3)) == 0) {
            return true;
        }
        return false;
    }

    public static boolean isIsoscelesTriangle(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        Double side1 = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        Double side2 = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        Double side3 = Math.sqrt(square(x3 - x1) + square(y3 - y1));


        if (Double.compare(side1, side2) == 0) {
            return true;
        }
        if (Double.compare(side2, side3) == 0) {
            return true;
        }
        if (Double.compare(side3, side1) == 0) {
            return true;
        }
        return false;
    }

    private static Double square(Double number) {
        return Math.pow(number, 2);
    }

    private static boolean isFirstSideBiggerAsOtherSide(Double side1, Double side2, Double side3) {
        return (side1< side2 +side3)&& ((side1> side2 - side3)||(side1> side3 - side2)) ;
    }

    public static boolean isEquilateralTriangle(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        Double side1 = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        Double side2 = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        Double side3 = Math.sqrt(square(x3 - x1) + square(y3 - y1));


        if (isFirstSideBiggerAsOtherSide(side1,side2,side3)&&
                Double.compare(square(side2) + square(side3), square(side1)) == 1) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side2,side1,side3)&&
                Double.compare(square(side1) + square(side3), square(side2)) == 1) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side3,side2,side1)&&
                Double.compare(square(side2) + square(side1), square(side3)) == 1) {
            return true;
        }
        return false;
    }

    public static boolean isObtuseTriangle(Triangle triangle) {
        Double x1 = triangle.getPoint1().getX();
        Double x2 = triangle.getPoint2().getX();
        Double x3 = triangle.getPoint3().getX();
        Double y1 = triangle.getPoint1().getY();
        Double y2 = triangle.getPoint2().getY();
        Double y3 = triangle.getPoint3().getY();

        Double side1 = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        Double side2 = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        Double side3 = Math.sqrt(square(x3 - x1) + square(y3 - y1));


        if (isFirstSideBiggerAsOtherSide(side1,side2,side3)&&
                Double.compare(square(side2) + square(side3), square(side1)) == -1) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side2,side1,side3)&&
                Double.compare(square(side1) + square(side3), square(side2)) == -1) {
            return true;
        }
        if (isFirstSideBiggerAsOtherSide(side3,side2,side1)&&
                Double.compare(square(side2) + square(side1), square(side3)) == -1) {
            return true;
        }
        return false;
    }
}
