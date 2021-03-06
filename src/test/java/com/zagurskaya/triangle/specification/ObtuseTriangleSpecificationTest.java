package com.zagurskaya.triangle.specification;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.generator.IdGenerator;
import com.zagurskaya.triangle.repository.TriangleRepository;
import com.zagurskaya.triangle.specification.impl.ObtuseTriangleSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class ObtuseTriangleSpecificationTest extends Assert {
    Triangle triangle1;
    Triangle triangle2;
    TriangleRepository repository;
    ObtuseTriangleSpecification specification;

    @BeforeTest
    public void setUp() {

        repository = TriangleRepository.getInstance();
        specification = new ObtuseTriangleSpecification();
    }

    @org.testng.annotations.Test
    public void specifyTest() {
        triangle1 = new Triangle(IdGenerator.nextId(), new Point(0.0, 0.0), new Point(1.0, 4.0), new Point(3.0, 0.0));
        triangle2 = new Triangle(IdGenerator.nextId(), new Point(1.0, 0.0), new Point(0.0, 4.0), new Point(3.0, 0.0));
        repository.add(triangle1);
        repository.add(triangle2);

        Triangle expected = triangle2;
        Triangle actual = repository.query(specification).get(0);
        assertEquals(actual, expected);
    }
}
