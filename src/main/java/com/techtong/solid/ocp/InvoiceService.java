package com.techtong.solid.ocp;

import com.techtong.solid.ocp.models.Invoice;
import com.techtong.solid.ocp.models.Product;

import java.util.List;

public class InvoiceService {

    private final TaxCalculationService taxCalculationService;

    public InvoiceService(TaxCalculationService taxCalculationService) {
        this.taxCalculationService = taxCalculationService;
    }

    public Invoice getInvoice(List<Product> productList) {
        final double subtotal = getSubtotal(productList);

        final double tax = taxCalculationService.calculateTax(productList);

        final double total = subtotal + tax;

        return new Invoice(subtotal, tax, total);
    }

    private double getSubtotal(List<Product> productList) {
        return productList
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
