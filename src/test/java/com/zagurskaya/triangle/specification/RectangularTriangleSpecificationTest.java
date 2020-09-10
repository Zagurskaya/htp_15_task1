package com.zagurskaya.triangle.specification;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.generator.IdGenerator;
import com.zagurskaya.triangle.repository.TriangleRepository;
import com.zagurskaya.triangle.specification.impl.ObtuseTriangleSpecification;
import com.zagurskaya.triangle.specification.impl.RectangularTriangleSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class RectangularTriangleSpecificationTest extends Assert {
    Triangle triangle1;
    Triangle triangle2;
    TriangleRepository repository;
    RectangularTriangleSpecification specification;

    @BeforeTest
    public void setUp() {

        repository = TriangleRepository.getInstance();
        specification = new RectangularTriangleSpecification();
    }

    @org.testng.annotations.Test
    public void specifyTest() {
        triangle1 = new Triangle(IdGenerator.nextId(), new Point(0.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 0.0));
        triangle2 = new Triangle(IdGenerator.nextId(), new Point(1.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 0.0));
        repository.add(triangle1);
        repository.add(triangle2);

        List<Triangle> rectangularTriangle = repository.query(specification);

        System.out.println(rectangularTriangle);

        Triangle expected = triangle1;
        Triangle actual = repository.query(specification).get(0);
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(actual, expected);
    }
}
