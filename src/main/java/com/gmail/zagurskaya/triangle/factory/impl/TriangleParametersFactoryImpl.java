package com.gmail.zagurskaya.triangle.factory.impl;

import com.gmail.zagurskaya.triangle.action.Calculation;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.entity.TriangleParameters;
import com.gmail.zagurskaya.triangle.factory.TriangleParametersFactory;

public class TriangleParametersFactoryImpl implements TriangleParametersFactory {

    @Override
    public TriangleParameters createTriangleParameters(Triangle triangle) {
        Calculation calculation = new Calculation();
        Double perimeter = calculation.getPerimeter(triangle);
        Double area = calculation.getArea(triangle);
        return new TriangleParameters(perimeter,area);
    }
}
