package com.zagurskaya.triangle.repository;

import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private static List<Triangle> repository;

    private Repository() {

    }

    public List<Triangle> query(Specification specification) {
        List<Triangle> triangleList =
                repository.stream().filter(triangle -> specification.specify(triangle)).collect(Collectors.toList());
        return triangleList;
    }

    public static List<Triangle> getInstance() {
        if (repository == null) {
            repository = new ArrayList<>();
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

    public void sort(Comparator<? super Triangle> c) {
        repository.sort(c);
    }
}
