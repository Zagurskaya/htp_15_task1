package com.gmail.zagurskaya.triangle.entity;

public class TriangleParameters {
    private Double perimeter;
    private Double area;

    public TriangleParameters() {
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
                .append(", perimeter=")
                .append(perimeter)
                .append(", area=")
                .append(area)
                .append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TriangleParameters that = (TriangleParameters) o;

        if (perimeter != null ? !perimeter.equals(that.perimeter) : that.perimeter != null) return false;
        return area != null ? area.equals(that.area) : that.area == null;

    }

    @Override
    public int hashCode() {
        int result = perimeter != null ? perimeter.hashCode() : 0;
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
