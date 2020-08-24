package com.gmail.zagurskaya.triangle.parser;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TriangleDataParserTest extends Assert {
    TriangleDataParser triangleDataParser;
    StringBuffer text;

    @BeforeTest
    public void setUp() {
        triangleDataParser = new TriangleDataParser();
    }

    @Test
    public void parseRowPointToListTest() {
        text = new StringBuffer();
        text.append("0.0,0.0 0.0,5.0 4.0,0.0\n" +
                "0.0,0.0 0.0,4.0 3.0,0.0");

        List<String> expected = new ArrayList<>();
        expected.add("0.0,0.0 0.0,5.0 4.0,0.0");
        expected.add("0.0,0.0 0.0,4.0 3.0,0.0");

        List<String> actual = triangleDataParser.readRowTrianglePointsFromTxtToList(text);
        assertEquals(actual, expected);
    }
}
