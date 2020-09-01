package com.zagurskaya.triangle.observer;

import com.zagurskaya.triangle.action.Calculation;
import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;
import com.zagurskaya.triangle.entity.Warehouse;
import com.zagurskaya.triangle.generator.IdGenerator;
import com.zagurskaya.triangle.observer.impl.TriangleObserverImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class TriangleObserverImplTest extends Assert {
    Warehouse warehouse;
    Calculation calculation;
    TriangleObserverImpl triangleObserver;
    Triangle triangle;
    Point point1;
    Point point2;
    Point point3;

    @BeforeTest
    public void setUp() {
        triangleObserver = new TriangleObserverImpl();
        warehouse = Warehouse.getInstance();
        calculation = new Calculation();
        point1 = new Point(0.0, 0.0);
        point2 = new Point(0.0, 4.0);
        point3 = new Point(3.0, 0.0);
    }

    @Test
    public void actionPerformedTest() {
        triangle = new Triangle(IdGenerator.nextId(), point1, point2, point3);

        Double area = calculation.getArea(triangle);
        Double perimeter = calculation.getPerimeter(triangle);
        TriangleParameters expected = new TriangleParameters(perimeter, area);
        triangleObserver.actionPerformed(triangle);

        Map<Long, TriangleParameters> parametersMap = warehouse.getParametersMap();
        TriangleParameters actual = parametersMap.get(triangle.getTriangleId());
        assertEquals(actual, expected);
    }
}
