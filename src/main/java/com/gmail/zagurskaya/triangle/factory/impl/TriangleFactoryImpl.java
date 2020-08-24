package com.gmail.zagurskaya.triangle.factory.impl;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.entity.TriangleParameters;
import com.gmail.zagurskaya.triangle.entity.Warehouse;
import com.gmail.zagurskaya.triangle.factory.TriangleFactory;
import com.gmail.zagurskaya.triangle.factory.TriangleParametersFactory;
import com.gmail.zagurskaya.triangle.generator.IdGenerator;

public class TriangleFactoryImpl implements TriangleFactory {
    private final TriangleParametersFactory triangleParametersFactory = new TriangleParametersFactoryImpl();

    @Override
    public Triangle createTriangle(Point point1, Point point2, Point point3) {
        return new Triangle(IdGenerator.nextId(), point1, point2, point3);
    }

    @Override
    public void updateTriangle(Triangle triangle,Warehouse warehouse) {
        TriangleParameters triangleParameters = triangleParametersFactory.createTriangleParameters(triangle);
        warehouse.update(triangle.getTriangleId(), triangleParameters);
    }

}
