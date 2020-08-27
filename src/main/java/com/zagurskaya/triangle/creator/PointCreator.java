package com.zagurskaya.triangle.creator;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.factory.PointFactory;
import com.zagurskaya.triangle.factory.impl.PointFactoryImpl;
import com.zagurskaya.triangle.parser.PointDataParser;

import java.util.List;

public class PointCreator {

    public Point createPoint(String rowStringPoints) {
        PointFactory pointFactory = new PointFactoryImpl();
        PointDataParser pointDataParser = new PointDataParser();

        List<Double> pointCoordinates = pointDataParser.parseRowPointToDoubleList(rowStringPoints);
        return pointCoordinates.size() == 2 ? pointFactory.create(pointCoordinates.get(0), pointCoordinates.get(1)) : null;
    }
}
