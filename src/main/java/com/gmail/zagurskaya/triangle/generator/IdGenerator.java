package com.gmail.zagurskaya.triangle.generator;

public class IdGenerator {
    private static long counter = 0;

    private IdGenerator() {
    }

    public static synchronized long nextId() {
        return ++counter;
    }
}
