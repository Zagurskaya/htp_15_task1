package com.zagurskaya.triangle.generator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IdGeneratorTest extends Assert {

    @Test
    public void nextIdNotNullTest() {
        Long actual = IdGenerator.nextId();
        assertNotNull(actual);
    }
}
