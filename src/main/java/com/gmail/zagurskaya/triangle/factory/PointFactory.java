package com.gmail.zagurskaya.triangle.factory;

import com.gmail.zagurskaya.triangle.entity.Point;

public interface PointFactory {

    Point createPoint(Double x, Double y);
}
