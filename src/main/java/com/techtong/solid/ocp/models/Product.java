package com.techtong.solid.ocp.models;

public class Product {

    private double price;
    private String name;
    private ProductCategory productCategory;

    public Product(String name, double price, ProductCategory productCategory) {
        this.price = price;
        this.name = name;
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
