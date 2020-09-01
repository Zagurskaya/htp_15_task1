package com.zagurskaya.triangle.repository;

import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.specification.TriangleSpecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleRepository {

    private static TriangleRepository instance;
    private static List<Triangle> repository = new ArrayList<>();

    private TriangleRepository() {

    }

    public List<Triangle> query(TriangleSpecification triangleSpecification) {
        List<Triangle> triangleList =
                repository.stream().filter(t -> triangleSpecification.specify(t)).collect(Collectors.toList());
        return triangleList;
    }

    public static TriangleRepository getInstance() {
        if (instance == null) {
            instance = new TriangleRepository();
            return instance;
        }
        return instance;
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

    public List<Triangle> getRepository() {

        return Collections.unmodifiableList(repository);
    }
}
