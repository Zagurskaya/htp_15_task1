package com.zagurskaya.triangle.factory.impl;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.factory.PointFactory;

public class PointFactoryImpl implements PointFactory {

    @Override
    public Point create(Double x, Double y) {
        return new Point(x,y);
    }
}
