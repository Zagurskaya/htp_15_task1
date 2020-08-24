package com.gmail.zagurskaya.triangle.main;

public class RunnerOld {
    public static void main(String[] args) {

//        List<Triangle> triangles = new ArrayList<>();
//
//        PointFactory pointFactory = new PointFactoryImpl();
//        TriangleFactory triangleFactory = new TriangleFactoryImpl();
//
//        TriangleDataReader triangleDataReader = new TriangleDataReader();
//        PointDataParser pointDataParser = new PointDataParser();
//        PointCreator pointCreater = new PointCreator();
//
//        List<String> rowsTrianglesList = triangleDataReader.readTextToRowList();
//        rowsTrianglesList.stream().forEach(row -> {
//            List<Point> points = new ArrayList<>();
//            List<String> pointsStringList = pointDataParser.parseRowToStringPointsList(row);
//            pointsStringList.stream().forEach(s -> {
//                List<Double> pointCoordinates = pointDataParser.parseRowPointToDoubleList(s);
//                Point point = pointFactory.createPoint(pointCoordinates.get(0), pointCoordinates.get(1));
//            });
//            Triangle triangle = triangleFactory.createTriangle(points.get(0), points.get(1), points.get(2));
//            triangles.add(triangle);
//        });
//
//        Calculation calculation = new Calculation();
//        List<Double> areas = new ArrayList<>();
//        triangles.stream().forEach(triangle -> areas.add(calculation.getArea(triangle)));
//        List<Double> perimeter = new ArrayList<>();
//        triangles.stream().forEach(triangle -> perimeter.add(calculation.getPerimeter(triangle)));

        int i = 4;
    }
}
