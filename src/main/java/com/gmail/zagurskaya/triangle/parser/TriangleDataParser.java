package com.gmail.zagurskaya.triangle.parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleDataParser {

    public List<String> readRowTrianglePointsFromTxtToList(StringBuffer text) {

        List<String> pointsList = Arrays.stream(text.toString()
                .split("\n"))
                .filter(s -> s.length() != 0)
                .collect(Collectors.toList());
        return pointsList;
    }
}
