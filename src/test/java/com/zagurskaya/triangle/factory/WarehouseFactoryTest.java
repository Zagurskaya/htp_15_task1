package com.zagurskaya.triangle.factory;

import com.zagurskaya.triangle.entity.Warehouse;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WarehouseFactoryTest extends Assert {
    WarehouseFactory warehouseFactory;

    @BeforeTest
    public void setUp() {
        warehouseFactory = new WarehouseFactoryImpl();
    }

    @Test
    public void createWarehouseTest() {
        Warehouse actual = warehouseFactory.createWarehouse();
        assertNotNull(actual);
    }
}
