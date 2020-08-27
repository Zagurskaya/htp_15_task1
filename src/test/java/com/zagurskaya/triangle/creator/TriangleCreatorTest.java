package com.zagurskaya.triangle.creator;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TriangleCreatorTest extends Assert {
    Triangle triangle;
    TriangleCreator triangleCreator;
    String rowTriangle;

    @BeforeTest
    public void setUp() {
        triangleCreator = new TriangleCreator();
    }

    @Test
    public void createTriangleTestReturnTriangle() {
        triangle = new Triangle(IdGenerator.nextId(), new Point(0.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 0.0));
        rowTriangle = "0.0,0.0 0.0,4.0 3.0,0.0";

        Triangle expected = triangle;
        Triangle actual = triangleCreator.createTriangle(rowTriangle);
        assertEquals(actual, expected);
    }

    @Test
    public void createPointTestReturnNull() {
        rowTriangle = "0.0,0.0 0.0,4.0";
        Triangle actual = triangleCreator.createTriangle(rowTriangle);
        assertNull(actual);
    }

    @Test
    public void createTriangleTestReturnNullForNegativeValue() {
        rowTriangle = "0.0,0.0 0.0,4.0 -3.0,0.0";
        Triangle actual = triangleCreator.createTriangle(rowTriangle);
        assertNull(actual);
    }

    @Test
    public void createTriangleTestReturnNullByIncorrectValue() {
        rowTriangle = "0.x0,0.0 0.0,4.0 3.0,0.0";
        ;
        Triangle actual = triangleCreator.createTriangle(rowTriangle);
        assertNull(actual);
    }
}
