package com.gmail.zagurskaya.triangle.validation;

import com.gmail.zagurskaya.triangle.constant.ErrorMessageConstants;
import com.gmail.zagurskaya.triangle.constant.PatternConstant;
import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.reader.TriangleDataReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DataValidation {
    private static final Logger logger = LogManager.getLogger(TriangleDataReader.class);

    public static boolean isNumberValid(String value) {

        if (value.matches(PatternConstant.NUMBER_WITH_DELIMITER_POINT_VALIDATE_PATTERN)) {
            return true;
        } else {
            logger.log(Level.INFO, ErrorMessageConstants.INCORRECT_VALUE_IN_POINT + " : " + value);
            return false;
        }
    }

    public static boolean isPointsValid(List<Point> points) {
        return !isPointsTriangleOnLine(points) && isSizeTrianglePointsValid(points);
    }

    private static boolean isSizeTrianglePointsValid(List<Point> points) {
        if (points.size() == 3) {
            return true;
        } else {
            if (!points.isEmpty()) {
                logger.log(Level.INFO, ErrorMessageConstants.INCORRECT_SIZE_TRIANGLE_POINTS
                        + points.toString() + "to create this point");
            }
            return false;
        }
    }

    private static boolean isPointsTriangleOnLine(List<Point> points) {
        if (points.size() == 3) {
            Double x1 = points.get(0).getX();
            Double x2 = points.get(1).getX();
            Double x3 = points.get(2).getX();
            Double y1 = points.get(0).getY();
            Double y2 = points.get(1).getY();
            Double y3 = points.get(2).getY();

            if ((Double.compare(x1, x2) == 0
                    && Double.compare(x2, x3) == 0
                    && Double.compare(x3, x1) == 0)
                    || (Double.compare(y1, y2) == 0
                    && Double.compare(y2, y3) == 0
                    && Double.compare(y3, y1) == 0)) {
                logger.log(Level.INFO, ErrorMessageConstants.POINTS_ON_LINE
                        + " : {(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")}");
                return true;
            }
        }
        return false;
    }

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
