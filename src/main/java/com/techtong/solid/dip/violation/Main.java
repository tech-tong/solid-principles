package com.techtong.solid.dip.violation;

import com.techtong.solid.dip.violation.models.Customer;
import com.techtong.solid.dip.violation.models.ShoppingCart;
import com.techtong.solid.dip.violation.services.CheckoutService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sabbir Siddiqui", "01717111111");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

        CheckoutService checkoutService = new CheckoutService();

        checkoutService.checkout(shoppingCart);
    }
}
