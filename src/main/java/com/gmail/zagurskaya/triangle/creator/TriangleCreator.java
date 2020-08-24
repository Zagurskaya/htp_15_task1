package com.gmail.zagurskaya.triangle.creator;

import com.gmail.zagurskaya.triangle.entity.Point;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.factory.TriangleFactory;
import com.gmail.zagurskaya.triangle.factory.impl.TriangleFactoryImpl;
import com.gmail.zagurskaya.triangle.parser.PointDataParser;
import com.gmail.zagurskaya.triangle.validation.DataValidation;

import java.util.ArrayList;
import java.util.List;

public class TriangleCreator {

    public Triangle createTriangle(String rowTriangle) {

        TriangleFactory triangleFactory = new TriangleFactoryImpl();
        PointDataParser pointDataParser = new PointDataParser();
        PointCreator pointCreator = new PointCreator();

        List<Point> points = new ArrayList<>();
        List<String> pointsStringList = pointDataParser.parseRowToStringPointsList(rowTriangle);
        pointsStringList.stream().
                forEach(s -> {
                            Point point = pointCreator.createPoint(s);
                            if (point != null) {
                                points.add(point);
                            }
                        }
                );
        return DataValidation.isPointsValid(points) ? triangleFactory.createTriangle(points.get(0), points.get(1), points.get(2)) : null;
    }

}
