package com.techtong.solid.ocp.refactored;

import com.techtong.solid.ocp.ITaxCalculationService;
import com.techtong.solid.ocp.models.Product;

import java.util.List;

public class DecentTaxCalculationService implements ITaxCalculationService {
    private final TaxCalculationUtil taxCalculationUtil;

    public DecentTaxCalculationService(TaxCalculationUtil taxCalculationUtil) {
        this.taxCalculationUtil = taxCalculationUtil;
    }

    @Override
    public double calculateTax(List<Product> products) {
        return products.stream().mapToDouble(taxCalculationUtil::getTaxAmountForProduct).sum();
    }
}
