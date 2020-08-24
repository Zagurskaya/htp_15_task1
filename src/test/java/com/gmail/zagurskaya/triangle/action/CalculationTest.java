package com.gmail.zagurskaya.triangle.action;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculationTest extends Assert {
    Triangle triangle;
    Point point1;
    Point point2;
    Point point3;
    Calculation calculation;

    @BeforeTest
    public void setUp() {
        point1 = new Point(0.0, 0.0);
        point2 = new Point(0.0, 4.0);
        point3 = new Point(3.0, 0.0);
        triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);
        calculation = new Calculation();
    }

    @Test
    public void getAreaTest() {
        double expected = 6.0;
        double actual = calculation.getArea(triangle);
        assertEquals(actual, expected, 0.000001);

    }
    @Test
    public void getPerimeterTest() {
        double expected = 12.0;
        double actual = calculation.getPerimeter(triangle);
        assertEquals(actual, expected, 0.000001);

    }
}
