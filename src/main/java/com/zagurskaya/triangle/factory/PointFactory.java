package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Point;

public interface PointFactory {

    Point create(Double x, Double y);
}
