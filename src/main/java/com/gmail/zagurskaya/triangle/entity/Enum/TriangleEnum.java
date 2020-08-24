package com.gmail.zagurskaya.triangle.entity.Enum;

public enum TriangleEnum {
    RECTANGULAR("rectangular "), //прямоугольный
    ISOSCELES("isosceles"),      // равнобедренный
    ACUTEANGLED("equilateral"),  // остроугольный
    OBTUSE("obtuse");            // тупоугольный

    private String value;

    TriangleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
