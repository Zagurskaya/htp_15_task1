package com.gmail.zagurskaya.triangle.factory;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;

public interface TriangleFactory {

    Triangle createTriangle(Point point1, Point point2, Point point3);
    void updateTriangle(Triangle triangle);
}
