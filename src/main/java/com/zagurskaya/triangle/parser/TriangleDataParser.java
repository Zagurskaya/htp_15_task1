package com.zagurskaya.triangle.parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleDataParser {
    private static final String TRIANGLE_SEPARATOR = "\n";

    public List<String> readRowTrianglePointsFromTxtToList(StringBuffer text) {

        List<String> pointsList = Arrays.stream(text.toString()
                .split(TRIANGLE_SEPARATOR))
                .filter(s -> s.length() != 0)
                .collect(Collectors.toList());
        return pointsList;
    }
}
