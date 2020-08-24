package com.gmail.zagurskaya.triangle.validation;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.generator.IdGenerator;
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

        boolean actual = DataValidation.isPointsValid(list);
        assertTrue(actual);
    }

    @Test
    public void isPointsValidTestReturnFalse() {

        List<Point> list = new ArrayList<>();
        list.add(new Point(0.0, 0.0));
        list.add(new Point(0.0, 4.0));

        boolean actual = DataValidation.isPointsValid(list);
        assertFalse(actual);
    }

    @Test
    public void isPointsValid2TestReturnFalse() {

        List<Point> list = new ArrayList<>();
        list.add(new Point(0.0, 0.0));
        list.add(new Point(0.0, 4.0));
        list.add(new Point(0.0, 6.0));

        boolean actual = DataValidation.isPointsValid(list);
        assertFalse(actual);
    }

    @Test
    public void isRectangularTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(),point1,point2,point3);

        boolean actual = DataValidation.isRectangularTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isIsoscelesTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(4.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(),point1,point2,point3);

        boolean actual = DataValidation.isIsoscelesTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isEquilateralTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(1.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(),point1,point2,point3);

        boolean actual = DataValidation.isEquilateralTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isObtuseTriangleTest() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(),point1,point2,point3);

        boolean actual = DataValidation.isEquilateralTriangle(triangle);
        assertTrue(actual);
    }
}
