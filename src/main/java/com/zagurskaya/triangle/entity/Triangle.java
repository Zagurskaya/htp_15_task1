package com.zagurskaya.triangle.entity;

import com.zagurskaya.triangle.observer.Observable;
import com.zagurskaya.triangle.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Observable {
    private Long triangleId;
    private Point point1;
    private Point point2;
    private Point point3;
    private List<Observer> observers = new ArrayList<>();

    public Triangle() {
    }

    public Triangle(Long triangleId, Point point1, Point point2, Point point3) {
        this.triangleId = triangleId;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Long getTriangleId() {
        return triangleId;
    }

    public void setTriangleId(Long triangleId) {
        this.triangleId = triangleId;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
        notifyObservers();
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
        notifyObservers();
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
        notifyObservers();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangle{")
                .append(point1.toString().replace("Point", ""))
                .append(", ")
                .append(point2.toString().replace("Point", ""))
                .append(", ")
                .append(point3.toString().replace("Point", ""))
                .append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!point1.equals(triangle.point1)) return false;
        if (!point2.equals(triangle.point2)) return false;
        return point3.equals(triangle.point3);

    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        result = 31 * result + point3.hashCode();
        return result;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(o -> o.actionPerformed(this));
    }
}
