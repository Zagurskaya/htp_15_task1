package com.zagurskaya.triangle.parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointDataParser {
    private static final String COORDINATE_SEPARATOR = "\\,";
    private static final String POINTS_SEPARATOR = "\\s";

    public List<String> parseRowToStringPointsList(String rowTriangle) {

        List<String> pointsStringList = Arrays.stream(rowTriangle.split(POINTS_SEPARATOR)).collect(Collectors.toList());
        return pointsStringList;
    }
    public List<String> parseRowPointsToStringList(String rowPoints) {

        List<String> coordinateList = Arrays.stream(rowPoints
                .split(COORDINATE_SEPARATOR))
                .collect(Collectors.toList());
        return coordinateList;
    }
    public List<Double> parseRowPointsToDoubleList(String rowPoints) {

        List<Double> coordinateList = Arrays.stream(rowPoints
                .split(COORDINATE_SEPARATOR))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        return coordinateList;
    }


}
