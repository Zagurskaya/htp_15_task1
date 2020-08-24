package com.gmail.zagurskaya.triangle.factory.impl;

import com.gmail.zagurskaya.triangle.entity.Warehouse;
import com.gmail.zagurskaya.triangle.factory.WarehouseFactory;

public class WarehouseFactoryImpl implements WarehouseFactory {

    @Override
    public Warehouse createWarehouse() {
        return new Warehouse();
    }
}
