package com.example.coffee.model;

public class Cappuccino implements Coffee {
    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }

    @Override
    public void prepare() {
        System.out.println("Brewing a foamy cappuccino...");
    }
}
