package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.factory.impl.PointFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PointFactoryTest extends Assert {
    Point point;
    PointFactory pointFactory;
    Double x;
    Double y;

    @BeforeTest
    public void setUp() {

        pointFactory = new PointFactoryImpl();
    }

    @Test
    public void createPointTestReturnPoint() {
        point = new Point(0.0, 0.0);
        x = 0.0;
        y = 0.0;

        Point expected = point;
        Point actual = pointFactory.create(x, y);
        assertEquals(actual, expected);
    }
}
