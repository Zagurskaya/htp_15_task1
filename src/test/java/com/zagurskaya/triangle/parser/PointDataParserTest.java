package com.zagurskaya.triangle.parser;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PointDataParserTest extends Assert {
    PointDataParser pointDataParser;
    String row;

    @BeforeTest
    public void setUp() {
        pointDataParser = new PointDataParser();
    }

    @Test
    public void parseRowPointToListTest() {
        row = "0.0,0.0";

        List<Double> expected = new ArrayList<>();
        expected.add(Double.valueOf(0.0));
        expected.add(Double.valueOf(0.0));

        List<Double> actual = pointDataParser.parseRowPointsToDoubleList(row);
        assertEquals(actual, expected);
    }

    @Test
    public void parseRowToStringPointsListTest() {
        row = "0.0,0.0 0.0,5.0 4.0,0.0";

        List<String> expected = new ArrayList<>();
        expected.add("0.0,0.0");
        expected.add("0.0,5.0");
        expected.add("4.0,0.0");

        List<String> actual = pointDataParser.parseRowToStringPointsList(row);
        assertEquals(actual, expected);
    }
}
