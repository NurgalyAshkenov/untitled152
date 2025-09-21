package com.example.coffee.abstractfactory;

import com.example.coffee.model.Coffee;
import com.example.coffee.model.Latte;

public class IcedCoffeeFactory implements CoffeeAbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
