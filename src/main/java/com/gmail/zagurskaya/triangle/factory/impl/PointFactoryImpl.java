package com.gmail.zagurskaya.triangle.factory.impl;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.factory.PointFactory;

public class PointFactoryImpl implements PointFactory {

    @Override
    public Point createPoint(Double x, Double y) {
        return new Point(x,y);
    }
}
