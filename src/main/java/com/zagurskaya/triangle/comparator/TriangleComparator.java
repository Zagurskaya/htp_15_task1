package com.zagurskaya.triangle.comparator;

import com.zagurskaya.triangle.entity.Triangle;

import java.util.Comparator;

public enum TriangleComparator implements Comparator<Triangle> {
    ID {
        @Override
        public int compare(Triangle o1, Triangle o2) {
            return Long.compare(o1.getTriangleId(),o2.getTriangleId());
        }
    },
    X {
        @Override
        public int compare(Triangle o1, Triangle o2) {
            return Double.compare(o1.getPoint1().getX(),o2.getPoint1().getX());
        }
    },
    Y {
        @Override
        public int compare(Triangle o1, Triangle o2) {
            return Double.compare(o1.getPoint1().getY(),o2.getPoint1().getY());
        }
    }

}
