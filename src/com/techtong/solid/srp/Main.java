package com.techtong.solid.srp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item cleanCodeBook = new Item("Clean Code", 100.0);
        Item mask = new Item("Mask", 10.0);
        Item tShirt = new Item("Mask", 20.0);

        int plasticBagTaken = 2;

        var itemsPurchased = List.of(cleanCodeBook, mask, tShirt);

        Customer uncleBob = new Customer("Robert C Martin",
                68,
                itemsPurchased,
                plasticBagTaken);

        double totalPriceOfItems = uncleBob.calculatePrice(10.00);

        System.out.println("Total Prices of items purchased : " + totalPriceOfItems);

    }
}
