package com.gmail.zagurskaya.triangle.reader;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TriangleDataReaderTest extends Assert {
    TriangleDataReader triangleDataReader;
    String fileName;

    @BeforeTest
    public void setUp() {
        triangleDataReader = new TriangleDataReader();
    }

    @Test
    public void readTextToRowListTest() {
        fileName = "data.txt";

        List<String> expected = new ArrayList<>();
        expected.add("0.0,0.0 0.0,5.0 4.0,0.0");
        expected.add("0.0,0.0 0.0,4.0 3.0,0.0");
        expected.add("0a.0,0.0 0.0,-5.0 4.0,0.0");
        expected.add("1.0,0.0 1.0,4.0 1.0,5.0");
        expected.add("0.0,0.0 0.0,4.0");

        List<String> actual = triangleDataReader.readTextToRowList(fileName);
        assertEquals(actual, expected);
    }
}
