package com.techtong.solid.ocp;

import com.techtong.solid.ocp.models.Product;

import java.util.List;

public interface TaxCalculationService {
    double calculateTax(List<Product> products);
}
