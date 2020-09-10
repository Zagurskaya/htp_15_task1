package com.zagurskaya.triangle.specification;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.generator.IdGenerator;
import com.zagurskaya.triangle.repository.TriangleRepository;
import com.zagurskaya.triangle.specification.impl.EquilateralTriangleSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class EquilateralTriangleSpecificationTest extends Assert {
    Triangle triangle1;
    Triangle triangle2;
    TriangleRepository repository;
    EquilateralTriangleSpecification specification;

    @BeforeTest
    public void setUp() {

        repository = TriangleRepository.getInstance();
        specification = new EquilateralTriangleSpecification();
    }

    @org.testng.annotations.Test
    public void specifyTest() {
        triangle1 = new Triangle(IdGenerator.nextId(), new Point(0.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 0.0));
        triangle2 = new Triangle(IdGenerator.nextId(), new Point(0.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 1.0));
        repository.add(triangle1);
        repository.add(triangle2);

        Triangle expected = triangle1;
        Triangle actual = repository.query(specification).get(0);
        assertEquals(actual, expected);
    }
}
