package com.gmail.zagurskaya.triangle.analyzer;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAnalyzerTest extends Assert {

    @Test
    public void isRectangularTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        boolean actual = TriangleAnalyzer.isRectangularTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isIsoscelesTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(4.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        boolean actual = TriangleAnalyzer.isIsoscelesTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isEquilateralTriangleTest() {
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(1.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        boolean actual = TriangleAnalyzer.isEquilateralTriangle(triangle);
        assertTrue(actual);
    }

    @Test
    public void isObtuseTriangleTest() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(0.0, 4.0);
        Point point3 = new Point(3.0, 0.0);
        Triangle triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        boolean actual = TriangleAnalyzer.isEquilateralTriangle(triangle);
        assertTrue(actual);
    }
}
