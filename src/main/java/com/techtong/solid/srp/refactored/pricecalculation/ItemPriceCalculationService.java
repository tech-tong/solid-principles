package com.techtong.solid.srp.refactored.pricecalculation;

import com.techtong.solid.srp.refactored.Item;
import com.techtong.solid.srp.refactored.logger.Logger;

import java.util.List;

public class ItemPriceCalculationService {
    private double plasticBagPrice = 2.0;
    private final TaxCalculationService taxCalculationService = new TaxCalculationService();

    public double calculateItemPrice(List<Item> items,
                                     int numberOfPlasticBags,
                                     int tax) {
        double itemPrices = getTotalItemPrices(items);
        calculatePlasticBagPrice(items.size());

        double totalTax = taxCalculationService.calculateTax(itemPrices, tax);

        double totalPrice = itemPrices + totalTax + numberOfPlasticBags * plasticBagPrice;
        Logger.info("Total Price of the items -> " + totalPrice);
        return totalPrice;
    }

    public double getTotalItemPrices(List<Item> items) {
        return items
                .stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void calculatePlasticBagPrice(int totalItems) {
        if (totalItems > 2) {
            plasticBagPrice = plasticBagPrice * 0.5;
            Logger.info("More than 2 items purchased. Reducing plastic bag price");
        }
    }
}
