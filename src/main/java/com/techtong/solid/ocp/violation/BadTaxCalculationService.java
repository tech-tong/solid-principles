package com.techtong.solid.ocp.violation;

import com.techtong.solid.ocp.TaxCalculationService;
import com.techtong.solid.ocp.models.Product;

import java.util.List;

public class BadTaxCalculationService implements TaxCalculationService {
    @Override
    public double calculateTax(List<Product> products) {
        double tax = 0;

        for (final Product product : products) {
            switch (product.getProductCategory()) {
                case FOOD:
                    tax += 0.05 * product.getPrice();
                    break;
                case ELECTRONICS:
                    tax += 0.15 * product.getPrice();
                    break;

            }
        }
        return tax;
    }
}
