package com.techtong.solid.ocp.refactored;

import com.techtong.solid.ocp.models.Product;

public class TaxCalculationUtil {
    public double getTaxAmountForProduct(Product product) {
        switch (product.getProductCategory()) {
            case FOOD:
                return 0.05 * product.getPrice();
            case ELECTRONICS:
                return 0.15 * product.getPrice();
            default:
                return 0;
        }
    }
}
