package com.gmail.zagurskaya.triangle.creator;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.factory.PointFactory;
import com.gmail.zagurskaya.triangle.factory.impl.PointFactoryImpl;
import com.gmail.zagurskaya.triangle.parser.PointDataParser;

import java.util.List;

public class PointCreator {

    public Point createPoint(String rowStringPoints) {
        PointFactory pointFactory = new PointFactoryImpl();
        PointDataParser pointDataParser = new PointDataParser();

        List<Double> pointCoordinates = pointDataParser.parseRowPointToDoubleList(rowStringPoints);
        return pointCoordinates.size() == 2 ? pointFactory.createPoint(pointCoordinates.get(0), pointCoordinates.get(1)) : null;
    }
}
