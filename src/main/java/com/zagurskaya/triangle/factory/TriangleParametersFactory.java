package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Triangle;
import com.zagurskaya.triangle.entity.TriangleParameters;

public interface TriangleParametersFactory {

    TriangleParameters create(Triangle triangle);
}
