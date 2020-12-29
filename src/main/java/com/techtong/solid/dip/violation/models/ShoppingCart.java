package com.techtong.solid.dip.violation.models;

public class ShoppingCart {
    private double totalAmount;
    private Customer customer;

    public ShoppingCart(double totalAmount, Customer customer) {
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
