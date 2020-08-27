package com.zagurskaya.triangle.observer.Impl;

import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;
import com.zagurskaya.triangle.entity.Warehouse;
import com.zagurskaya.triangle.factory.TriangleParametersFactory;
import com.zagurskaya.triangle.factory.impl.TriangleParametersFactoryImpl;
import com.zagurskaya.triangle.observer.Observer;

public class TriangleObserverImpl implements Observer {
    private final Warehouse warehouse = Warehouse.getInstance();
    private final TriangleParametersFactory triangleParametersFactory = new TriangleParametersFactoryImpl();

    @Override
    public void actionPerformed(Triangle triangle) {
        TriangleParameters triangleParameters = triangleParametersFactory.create(triangle);
        warehouse.put(triangle.getTriangleId(),triangleParameters);
    }
}
