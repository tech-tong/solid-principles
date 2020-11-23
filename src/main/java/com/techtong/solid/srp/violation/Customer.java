package com.techtong.solid.srp.violation;

import java.util.List;

public class Customer {
    private final String name;
    private final int age;
    private final List<Item> items;
    private final int numberOfPlasticBags;
    private double plasticBagPrice = 2.00;

    public Customer(String name, int age, List<Item> items, int numberOfPlasticBags) {
        this.name = name;
        this.age = age;
        this.items = items;
        this.numberOfPlasticBags = numberOfPlasticBags;
    }

    public double calculatePrice(double tax) {
        int totalItems = items.size();
        double itemPrice = items
                .stream()
                .mapToDouble(Item::getPrice)
                .sum();

        if (totalItems > 2) {
            plasticBagPrice = plasticBagPrice * 0.5;
            logInformation("More than 2 items purchased. Reducing plastic bag price");
        }

        if (itemPrice <= 100) {
            logInformation("Item price is more than 100. 80 Percent of the actual tax applicable");
            tax = tax * .80;
        } else if (itemPrice >= 100 && itemPrice <= 150) {
            logInformation("Item price is more than 100 but less than 150. 90 Percent of the actual tax applicable");
            tax = tax * .90;
        }
        double totalPrice = itemPrice + tax + this.numberOfPlasticBags * plasticBagPrice;
        logInformation("Total Price of the items -> " + totalPrice);
        return totalPrice;
    }

    public void logInformation(String message) {
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        fileLogger.logInFile(message);
        consoleLogger.logInConsole(message);
    }

    public class FileLogger {
        public void logInFile(String message) {
            System.out.println("File Log: " + message);
        }
    }

    public class ConsoleLogger {
        public void logInConsole(String message) {
            System.out.println("Console Log : " + message);
        }
    }

}
