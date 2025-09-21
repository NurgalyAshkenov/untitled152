package com.example.coffee.model;

public class Espresso implements Coffee {
    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }

    @Override
    public void prepare() {
        System.out.println("Brewing a strong espresso...");
    }
}
