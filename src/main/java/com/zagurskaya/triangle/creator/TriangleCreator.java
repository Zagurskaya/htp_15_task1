package com.zagurskaya.triangle.creator;

import com.zagurskaya.triangle.entity.Point;
import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.factory.TriangleFactory;
import com.zagurskaya.triangle.factory.impl.TriangleFactoryImpl;
import com.zagurskaya.triangle.parser.PointDataParser;
import com.zagurskaya.triangle.validation.DataValidation;

import java.util.ArrayList;
import java.util.List;

public class TriangleCreator {

    public Triangle create(String rowTriangle) {

        TriangleFactory triangleFactory = new TriangleFactoryImpl();
        PointDataParser pointDataParser = new PointDataParser();
        PointCreator pointCreator = new PointCreator();

        List<Point> points = new ArrayList<>();
        List<String> rowTrianglePointsList = pointDataParser.parseRowToStringPointsList(rowTriangle);
        rowTrianglePointsList.stream().
                forEach(s -> {
                            Point point = pointCreator.create(s);
                            if (point != null) {
                                points.add(point);
                            }
                        }
                );
        return DataValidation.isTrianglePointsValid(points) ? triangleFactory.create(points.get(0), points.get(1), points.get(2)) : null;
    }

}
