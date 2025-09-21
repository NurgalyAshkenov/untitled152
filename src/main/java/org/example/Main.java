package com.example.coffee;

import com.example.coffee.factory.CoffeeFactory;
import com.example.coffee.factory.CoffeeFactoryProvider;
import com.example.coffee.abstractfactory.HotCoffeeFactory;
import com.example.coffee.abstractfactory.IcedCoffeeFactory;
import com.example.coffee.model.Coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeFactory simpleFactory = new CoffeeFactory();

        System.out.println("Welcome to Coffee Shop!");
        System.out.println("Available options: espresso, latte, cappuccino");
        System.out.println("Type 'exit' to stop.");

        while (true) {
            System.out.print("\nChoose coffee type: ");
            String coffeeType = scanner.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                Coffee chosenCoffee = simpleFactory.createCoffee(coffeeType);
                chosenCoffee.prepare();
                System.out.println("You ordered: " + chosenCoffee.getName() + " | Price: $" + chosenCoffee.getPrice());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Abstract Factory Demo ---");
        Coffee hotCoffee = CoffeeFactoryProvider.getCoffee(new HotCoffeeFactory());
        hotCoffee.prepare();
        System.out.println("Hot coffee ready: " + hotCoffee.getName() + " | Price: $" + hotCoffee.getPrice());

        Coffee icedCoffee = CoffeeFactoryProvider.getCoffee(new IcedCoffeeFactory());
        icedCoffee.prepare();
        System.out.println("Iced coffee ready: " + icedCoffee.getName() + " | Price: $" + icedCoffee.getPrice());

        System.out.println("\nThank you for visiting!");
    }
}
