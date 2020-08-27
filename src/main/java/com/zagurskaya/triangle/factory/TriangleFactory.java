package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;

public interface TriangleFactory {

    Triangle create(Point point1, Point point2, Point point3);

}
