package com.zagurskaya.triangle.parser;

import com.zagurskaya.triangle.validation.DataValidation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointDataParser {
    private static final String COORDINATE_SEPARATOR = "\\,";
    private static final String POINTS_SEPARATOR = " ";

    public List<Double> parseRowPointToDoubleList(String row) {

        List<Double> coordinateList = Arrays.stream(row
                .split(COORDINATE_SEPARATOR))
                .filter(s -> s.length() != 0)
                .filter(s -> DataValidation.isNumberValid(s))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        return coordinateList;
    }

    public List<String> parseRowToStringPointsList(String rowList) {
        List<String> pointsList = Arrays.stream(rowList.split(POINTS_SEPARATOR)).collect(Collectors.toList());
        return pointsList;
    }
}
