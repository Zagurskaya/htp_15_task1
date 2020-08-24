package com.gmail.zagurskaya.triangle.main;

import com.gmail.zagurskaya.triangle.action.Calculation;
import com.gmail.zagurskaya.triangle.creator.TriangleCreator;
import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.entity.TriangleParameters;
import com.gmail.zagurskaya.triangle.entity.Warehouse;
import com.gmail.zagurskaya.triangle.factory.TriangleFactory;
import com.gmail.zagurskaya.triangle.factory.TriangleParametersFactory;
import com.gmail.zagurskaya.triangle.factory.WarehouseFactory;
import com.gmail.zagurskaya.triangle.factory.impl.TriangleFactoryImpl;
import com.gmail.zagurskaya.triangle.factory.impl.TriangleParametersFactoryImpl;
import com.gmail.zagurskaya.triangle.factory.impl.WarehouseFactoryImpl;
import com.gmail.zagurskaya.triangle.reader.TriangleDataReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<Triangle> triangles = new ArrayList<>();
        TriangleDataReader triangleDataReader = new TriangleDataReader();
        TriangleCreator triangleCreator = new TriangleCreator();

        List<String> rowsTrianglesList = triangleDataReader.readTextToRowList("data.txt");
        rowsTrianglesList.stream().forEach(row -> {
            Triangle triangle = triangleCreator.createTriangle(row);
            if (triangle != null) {
                triangles.add(triangle);
            }
        });
//        int y = 1;
        Calculation calculation = new Calculation();
        List<Double> areas = new ArrayList<>();
        triangles.stream().forEach(triangle -> areas.add(calculation.getArea(triangle)));
        List<Double> perimeter = new ArrayList<>();
        triangles.stream().forEach(triangle -> perimeter.add(calculation.getPerimeter(triangle)));

//        int i = 2;

        TriangleParametersFactory triangleParametersFactory = new TriangleParametersFactoryImpl();
        List<TriangleParameters> triangleParametersList =
                triangles.stream().map(triangleParametersFactory::createTriangleParameters).collect(Collectors.toList());
        WarehouseFactory warehouseFactory = new WarehouseFactoryImpl();
        triangleParametersList.stream().forEach(triangleParameters -> warehouseFactory.add(triangleParameters));
        Map<Long, TriangleParameters> parametersMap1 = Warehouse.getParametersMap();
        Triangle updateTriagle = triangles.get(0);
        updateTriagle.getPoint1().setX(1.0);
        TriangleFactory triangleFactory = new TriangleFactoryImpl();
        triangleFactory.updateTriangle(updateTriagle);
        Map<Long, TriangleParameters> parametersMap2 = Warehouse.getParametersMap();
        int i = 3;

    }
}
