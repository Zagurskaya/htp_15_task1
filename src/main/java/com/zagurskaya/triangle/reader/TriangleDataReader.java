package com.zagurskaya.triangle.reader;

import com.zagurskaya.triangle.exception.TriangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class TriangleDataReader {
    private static final Logger logger = LogManager.getLogger(TriangleDataReader.class);


    public List<String> readTextToRowList(String fileName) {
        String filePath = getPath(TriangleDataReader.class, fileName);
        return readTextFromFileToRowList(filePath);

    }

    private String getPath(Class<?> clazz, String filename) {
        String path = clazz.getResource("").toString()
                .replace("/com/gmail/zagurskaya/triangle/reader/", "")
                .replace("test-classes", "classes")
                .replace("file:/", "") + "/data/";

        return path + filename;
    }

    private List<String> readTextFromFileToRowList(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.lines().collect(Collectors.toList());

        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "file not found", e);
            throw new TriangleException("file not found", e);

        } catch (IOException e) {
            logger.log(Level.ERROR, "Problems with the path to file", e);
            throw new TriangleException("Problems with the path to file", e);
        }
    }


}
