package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.factory.impl.TriangleFactoryImpl;
import com.zagurskaya.triangle.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TriangleFactoryTest extends Assert {
    Triangle triangle;
    TriangleFactory triangleFactory;
    Point point1;
    Point point2;
    Point point3;

    @BeforeTest
    public void setUp() {
        triangleFactory = new TriangleFactoryImpl();
        point1 = new Point(0.0, 0.0);
        point2 = new Point(0.0, 4.0);
        point3 = new Point(3.0, 0.0);
    }

    @Test
    public void createTriangleTestReturnTriangle() {
        triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        Triangle expected = triangle;
        Triangle actual = triangleFactory.create(point1, point2, point3);
        assertEquals(actual, expected);
    }
}
