package com.techtong.solid.ocp.models;

public class Invoice {
    private double subtotalAmount;
    private double taxAmount;
    private double totalAmount;

    public Invoice(double subtotalAmount, double taxAmount, double totalAmount) {
        this.subtotalAmount = subtotalAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
    }

    public double getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(double subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
