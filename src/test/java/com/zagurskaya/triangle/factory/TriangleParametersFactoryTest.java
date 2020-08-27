package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.action.Calculation;
import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;
import com.zagurskaya.triangle.factory.impl.TriangleFactoryImpl;
import com.zagurskaya.triangle.factory.impl.TriangleParametersFactoryImpl;
import com.zagurskaya.triangle.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TriangleParametersFactoryTest extends Assert {
    Triangle triangle;
    TriangleParametersFactory triangleParametersFactory;
    TriangleFactory triangleFactory;
    Calculation calculation;
    Point point1;
    Point point2;
    Point point3;

    @BeforeTest
    public void setUp() {
        triangleFactory = new TriangleFactoryImpl();
        point1 = new Point(0.0, 0.0);
        point2 = new Point(0.0, 4.0);
        point3 = new Point(3.0, 0.0);
        triangle = triangleFactory.create(point1, point2, point3);
        triangleParametersFactory = new TriangleParametersFactoryImpl();
        calculation = new Calculation();

    }

    @Test
    public void createTriangleParametersTestReturnTriangleParameters() {
        Double perimeter = calculation.getPerimeter(triangle);
        Double area = calculation.getArea(triangle);
        TriangleParameters expected = new TriangleParameters(perimeter, area);

        triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);
        TriangleParameters actual = triangleParametersFactory.create(triangle);
        assertEquals(actual, expected);
    }

}
