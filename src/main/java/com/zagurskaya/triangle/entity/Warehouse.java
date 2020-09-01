package com.zagurskaya.triangle.entity;


import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Map<Long, TriangleParameters> parametersMap = new HashMap<>();
    private static Warehouse instance = new Warehouse();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public void put(Long triangleId, TriangleParameters parameters) {
        parametersMap.put(triangleId, parameters);
    }

    public void remove(Long triangleId) {
        parametersMap.remove(triangleId);
    }

    public TriangleParameters get(Long triangleId) {
        return parametersMap.get(triangleId);
    }

    public Map<Long, TriangleParameters> getParametersMap() {

        Map<Long, TriangleParameters> parametersMapCopy = new HashMap<>();
        parametersMapCopy.putAll(parametersMap);
        return parametersMapCopy;
    }
}
