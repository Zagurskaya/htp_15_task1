package com.zagurskaya.triangle.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class TriangleDataReader {
    static final Logger logger = LogManager.getLogger(TriangleDataReader.class);


    public List<String> readTextToRowList(String fileName) {
        File file;
        try {
            file = new File(getClass().getClassLoader().getResource(fileName).getFile());
        } catch (NullPointerException e) {
            logger.log(Level.FATAL, "Problems with the path to file", e);
            throw new RuntimeException("Problems with the path to file", e);
        }
        return readTextFromFileToRowTriangleList(file);

    }

    private List<String> readTextFromFileToRowTriangleList(File path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.lines().collect(Collectors.toList());

        } catch (FileNotFoundException e) {
            logger.log(Level.FATAL, "file not found", e);
            throw new RuntimeException("file not found", e);

        } catch (IOException e) {
            logger.log(Level.FATAL, "Problems with the path to file", e);
            throw new RuntimeException("Problems with the path to file", e);
        }
    }


}
