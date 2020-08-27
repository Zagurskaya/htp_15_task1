package com.zagurskaya.triangle.specification;

import com.zagurskaya.triangle.entity.Triangle;

public interface Specification {

    boolean specify(Triangle triangle);
}
