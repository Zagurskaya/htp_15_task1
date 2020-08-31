package com.zagurskaya.triangle.validation;

import com.zagurskaya.triangle.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataValidationTest extends Assert {
    String value;

    @Test
    public void isNumberValidTestReturnTrue() {
        value = "0.0";
        boolean actual = DataValidation.isNumberValid(value);
        assertTrue(actual);
    }

    @Test
    public void isNumberValidTestReturnFalse() {
        value = "-3.0";
        boolean actual = DataValidation.isNumberValid(value);
        assertFalse(actual);
    }

    @Test
    public void isNumber2ValidTestReturnFalse() {
        value = "3s.0";
        boolean actual = DataValidation.isNumberValid(value);
        assertFalse(actual);
    }

    @Test
    public void isPointsValidTest() {

        List<Point> list = new ArrayList<>();
        list.add(new Point(0.0, 0.0));
        list.add(new Point(0.0, 4.0));
        list.add(new Point(3.0, 0.0));

        boolean actual = DataValidation.isTrianglePointsValid(list);
        assertTrue(actual);
    }

    @Test
    public void isPointsValidTestReturnFalse() {

        List<Point> list = new ArrayList<>();
        list.add(new Point(0.0, 0.0));
        list.add(new Point(0.0, 4.0));

        boolean actual = DataValidation.isTrianglePointsValid(list);
        assertFalse(actual);
    }

    @Test
    public void isPointsValid2TestReturnFalse() {

        List<Point> list = new ArrayList<>();
        list.add(new Point(0.0, 0.0));
        list.add(new Point(0.0, 4.0));
        list.add(new Point(0.0, 6.0));

        boolean actual = DataValidation.isTrianglePointsValid(list);
        assertFalse(actual);
    }
}
