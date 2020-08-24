package com.gmail.zagurskaya.triangle.entity;

public class TriangleParameters {
    private Long triangleId;
    private Double perimeter;
    private Double area;

    public TriangleParameters() {
    }

    public TriangleParameters(Long triangleId, Double perimeter, Double area) {
        this.triangleId = triangleId;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Long getTriangleId() {
        return triangleId;
    }

    public void setTriangleId(Long triangleId) {
        this.triangleId = triangleId;
    }

    public TriangleParameters(Double perimeter, Double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TriangleParameters{")
                .append("triangleId=")
                .append(triangleId)
                .append(", perimeter=")
                .append(perimeter)
                .append(", area=")
                .append(area)
                .append("}");
        return sb.toString();
    }
}
