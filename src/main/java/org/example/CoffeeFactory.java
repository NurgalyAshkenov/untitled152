package com.example.coffee.factory;

import com.example.coffee.model.*;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "latte" -> new Latte();
            case "cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}
