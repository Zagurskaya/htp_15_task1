package com.zagurskaya.triangle.validation;

import com.zagurskaya.triangle.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DataValidation {
    private static final Logger logger = LogManager.getLogger(DataValidation.class);
    public static final String NUMBER_WITH_DELIMITER_POINT_VALIDATE_PATTERN = "\\d{0,2}+(\\.\\d{1})?";


    public static boolean isNumberValid(String value) {

        if (value.matches(NUMBER_WITH_DELIMITER_POINT_VALIDATE_PATTERN)) {
            return true;
        } else {
            logger.log(Level.INFO, " incorrect value at point" + " : " + value);
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
                logger.log(Level.INFO, " incorrect count of triangle points"
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
                logger.log(Level.INFO, " points lie on a straight line."
                        + " : {(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")}");
                return true;
            }
        }
        return false;
    }
}
