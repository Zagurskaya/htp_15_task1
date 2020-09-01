package com.zagurskaya.triangle.factory.impl;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.factory.TriangleFactory;
import com.zagurskaya.triangle.generator.IdGenerator;

public class TriangleFactoryImpl implements TriangleFactory {

    @Override
    public Triangle create(Point point1, Point point2, Point point3) {
        return new Triangle(IdGenerator.nextId(), point1, point2, point3);
    }
}
