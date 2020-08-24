package com.gmail.zagurskaya.triangle.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Long, TriangleParameters> parametersMap = new HashMap<>();

    public void put(Long triangleId, TriangleParameters parameters) {
        parametersMap.put(triangleId, parameters);
    }

    public void update(Long triangleId, TriangleParameters parameters) {
        parametersMap.put(triangleId, parameters);
    }

    public void delete(Long triangleId) {
        parametersMap.remove(triangleId);
    }

    public TriangleParameters get(Long triangleId) {
        return parametersMap.get(triangleId);
    }

    public Map<Long, TriangleParameters> getParametersMap() {
        return new HashMap<>(parametersMap);
    }
}
