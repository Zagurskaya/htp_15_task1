package com.gmail.zagurskaya.triangle.parser;

import com.gmail.zagurskaya.triangle.validation.DataValidation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointDataParser {

    public List<Double> parseRowPointToDoubleList(String row) {
        return Arrays.stream(row
                .split("\\,"))
                .filter(s -> s.length() != 0)
                .filter(s -> DataValidation.isNumberValid(s))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    public List<String> parseRowToStringPointsList(String rowList) {
        return Arrays.stream(rowList.split(" ")).collect(Collectors.toList());
    }
}
