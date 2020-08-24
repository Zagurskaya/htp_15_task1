package com.gmail.zagurskaya.triangle.factory;

import com.gmail.zagurskaya.triangle.entity.Triangle;
import com.gmail.zagurskaya.triangle.entity.TriangleParameters;

public interface TriangleParametersFactory {

    TriangleParameters createTriangleParameters(Triangle triangle);
}
