package com.techtong.solid.srp.refactored;

import com.techtong.solid.srp.refactored.pricecalculation.ItemPriceCalculationService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item cleanCodeBook = new Item("Clean Code", 100.0);
        Item mask = new Item("Mask", 10.0);
        Item tShirt = new Item("Mask", 20.0);

        int plasticBagTaken = 2;
        int tax = 10;

        List<Item> itemsPurchased = List.of(cleanCodeBook, mask, tShirt);

        ItemPriceCalculationService itemPriceCalculation = new ItemPriceCalculationService();

        double totalPriceOfItems = itemPriceCalculation.calculateItemPrice(itemsPurchased,
                plasticBagTaken,
                tax);

        System.out.println("Total Prices of items purchased : " + totalPriceOfItems);

    }
}
