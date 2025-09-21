package com.example.coffee.abstractfactory;

import com.example.coffee.model.Coffee;
import com.example.coffee.model.Espresso;

public class HotCoffeeFactory implements CoffeeAbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
