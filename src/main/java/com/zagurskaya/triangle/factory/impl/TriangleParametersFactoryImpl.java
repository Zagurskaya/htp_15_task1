package com.zagurskaya.triangle.factory.impl;

import com.zagurskaya.triangle.action.Calculation;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;
import com.zagurskaya.triangle.factory.TriangleParametersFactory;

public class TriangleParametersFactoryImpl implements TriangleParametersFactory {

    @Override
    public TriangleParameters create(Triangle triangle) {
        Calculation calculation = new Calculation();
        Double perimeter = calculation.getPerimeter(triangle);
        Double area = calculation.getArea(triangle);
        return new TriangleParameters(perimeter,area);
    }
}
