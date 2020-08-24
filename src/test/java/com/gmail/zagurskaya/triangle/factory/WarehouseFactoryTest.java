package com.gmail.zagurskaya.triangle.factory;

import com.gmail.zagurskaya.triangle.entity.Warehouse;
import com.gmail.zagurskaya.triangle.factory.impl.WarehouseFactoryImpl;
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
