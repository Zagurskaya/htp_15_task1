package com.zagurskaya.triangle.creator;

import com.zagurskaya.triangle.entity.Point;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PointCreatorTest extends Assert {
    Point point;
    PointCreator pointCreator;
    String rowStringPoints;

    @BeforeTest
    public void setUp() {
        pointCreator = new PointCreator();
    }

    @Test
    public void createPointTestReturnPoint() {
        point = new Point(0.0, 0.0);
        rowStringPoints = "0.0,0.0";

        Point expected = point;
        Point actual = pointCreator.create(rowStringPoints);
        assertEquals(actual, expected);
    }

    @Test
    public void createPointTestReturnNull() {
        rowStringPoints = "0.0";
        Point actual = pointCreator.create(rowStringPoints);
        assertNull(actual);
    }

    @Test
    public void createPointTestReturnNullForNegativeValue() {
        rowStringPoints = "-3.0,0.0";
        Point actual = pointCreator.create(rowStringPoints);
        assertNull(actual);
    }

    @Test
    public void createPointTestReturnNullByIncorrectValue() {
        rowStringPoints = "3a.0,0.0";
        Point actual = pointCreator.create(rowStringPoints);
        assertNull(actual);
    }
}
