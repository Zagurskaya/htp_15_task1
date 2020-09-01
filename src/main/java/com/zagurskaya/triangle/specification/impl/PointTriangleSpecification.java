package com.zagurskaya.triangle.specification.impl;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.specification.TriangleSpecification;

public class PointTriangleSpecification implements TriangleSpecification {
    private Point point;

    public PointTriangleSpecification(Point point) {
        this.point = point;
    }

    @Override
    public boolean specify(Triangle triangle) {
        return (triangle.getPoint1().equals(point))
                || (triangle.getPoint2().equals(point))
                || (triangle.getPoint3().equals(point))
                ;
    }
}
