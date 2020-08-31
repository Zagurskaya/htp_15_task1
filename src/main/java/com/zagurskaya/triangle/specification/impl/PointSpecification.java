package com.zagurskaya.triangle.specification.impl;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.specification.Specification;

public class PointSpecification implements Specification {
    private Point point;

    public PointSpecification(Point point) {
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
