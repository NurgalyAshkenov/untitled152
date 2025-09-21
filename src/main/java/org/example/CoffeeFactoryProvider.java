package com.example.coffee.factory;

import com.example.coffee.abstractfactory.CoffeeAbstractFactory;
import com.example.coffee.model.Coffee;

public class CoffeeFactoryProvider {
    public static Coffee getCoffee(CoffeeAbstractFactory factory) {
        return factory.createCoffee();
    }
}
