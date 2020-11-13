package com.techtong.solid.srp.refactored.pricecalculation;

import com.techtong.solid.srp.refactored.logger.Logger;

public class TaxCalculationService {

    public double calculateTax(double itemPrice, double tax) {
        if (itemPrice <= 100) {
            Logger.info("Item price is more than 100. 80 Percent of the actual tax applicable");
            tax = tax * .80;
        } else if (itemPrice >= 100 && itemPrice <= 150) {
            Logger.info("Item price is more than 100 but less than 150. 90 Percent of the actual tax applicable");
            tax = tax * .90;
        }
        return tax;
    }
}
