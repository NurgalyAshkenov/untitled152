package com.example.coffee.model;

public class Latte implements Coffee {
    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public double getPrice() {
        return 3.50;
    }

    @Override
    public void prepare() {
        System.out.println("Brewing a smooth latte with milk...");
    }
}
