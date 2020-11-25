package com.techtong.solid.ocp;

import com.techtong.solid.ocp.models.Invoice;
import com.techtong.solid.ocp.models.Product;
import com.techtong.solid.ocp.models.ProductCategory;
import com.techtong.solid.ocp.refactored.DecentTaxCalculationService;
import com.techtong.solid.ocp.refactored.TaxCalculationUtil;
import com.techtong.solid.ocp.violation.BadTaxCalculationService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Headphones", 1000, ProductCategory.ELECTRONICS),
                new Product("Chanachur", 100, ProductCategory.FOOD)
//                new Product("Shampoo", 50, ProductCategory.HEALTH_LIFESTYLE),
//                new Product("Rolex", 10000, ProductCategory.LUXURY)
        );

//        TaxCalculationService badTaxCalculationService = new BadTaxCalculationService();
        TaxCalculationService decentTaxCalculationService = new DecentTaxCalculationService(new TaxCalculationUtil());

        Invoice invoice = new InvoiceService(decentTaxCalculationService).getInvoice(productList);

        System.out.println("Subtotal : " + invoice.getSubtotalAmount());
        System.out.println("Tax      : " + invoice.getTaxAmount());
        System.out.println("Total    : " + invoice.getTotalAmount());
    }
}
