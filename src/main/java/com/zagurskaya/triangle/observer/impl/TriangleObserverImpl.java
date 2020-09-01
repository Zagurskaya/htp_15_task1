package com.zagurskaya.triangle.observer.impl;

import com.zagurskaya.triangle.action.Calculation;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;
import com.zagurskaya.triangle.entity.Warehouse;
import com.zagurskaya.triangle.observer.Observer;

public class TriangleObserverImpl implements Observer {

    @Override
    public void actionPerformed(Triangle triangle) {
        Warehouse warehouse = Warehouse.getInstance();

        Calculation calculation = new Calculation();
        Double area = calculation.getArea(triangle);
        Double perimeter = calculation.getPerimeter(triangle);
        TriangleParameters triangleParameters = new TriangleParameters(perimeter, area);

        warehouse.put(triangle.getTriangleId(), triangleParameters);
    }
}
