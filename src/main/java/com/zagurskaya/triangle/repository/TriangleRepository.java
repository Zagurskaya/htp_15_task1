package com.zagurskaya.triangle.repository;

import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleRepository {
    private static TriangleRepository instance;
    private static List<Triangle> repository =  new ArrayList<>();

    private TriangleRepository() {

    }

    public List<Triangle> query(Specification specification) {
        List<Triangle> triangleList =
                repository.stream().filter(t -> specification.specify(t)).collect(Collectors.toList());
        return triangleList;
    }

    public static List<Triangle> getInstance() {
        if (instance == null) {
            instance = new TriangleRepository();
            return repository;
        }
        return repository;
    }

    public boolean add(Triangle triangle) {
        return repository.add(triangle);
    }

    public boolean remove(Triangle triangle) {
        return repository.remove(triangle);
    }

    public Triangle get(int index) {
        return repository.get(index);
    }

    public void sort(Comparator<? super Triangle> comparator) {
        repository.sort(comparator);
    }
}
