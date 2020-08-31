package com.zagurskaya.triangle.creator;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.factory.PointFactory;
import com.zagurskaya.triangle.factory.impl.PointFactoryImpl;
import com.zagurskaya.triangle.parser.PointDataParser;
import com.zagurskaya.triangle.validation.DataValidation;

import java.util.List;

public class PointCreator {

    public Point create(String rowStringCoordinate) {
        PointFactory pointFactory = new PointFactoryImpl();
        PointDataParser pointDataParser = new PointDataParser();

        List<String> pointsString = pointDataParser.parseRowPointsToStringList(rowStringCoordinate);
        List<Double> pointCoordinates = null;
        if (DataValidation.isPointsValid(pointsString)) {
            pointCoordinates = pointDataParser.parseRowPointsToDoubleList(rowStringCoordinate);
        }
        return pointCoordinates != null ? pointFactory.create(pointCoordinates.get(0), pointCoordinates.get(1)) : null;
    }
}
