package com.techtong.solid.dip.refactored.services;

import com.techtong.solid.dip.refactored.models.ShoppingCart;

public class NewCheckoutService {
    private final NewSmsService newSmsService;

    public NewCheckoutService(NewSmsService newSmsService) {
        this.newSmsService = newSmsService;
    }

    private void sendConfirmationSms(ShoppingCart shoppingCart) {
        final String message = "Thank you, " + shoppingCart.getCustomer().getFullName() + " for shopping at our store." +
                "\nYour order of total BDT " + shoppingCart.getTotalAmount() + " has been confirmed.";

        newSmsService.sendSms(message, shoppingCart.getCustomer().getPhoneNumber());
    }

    public void checkout(ShoppingCart shoppingCart) {
        // do some other stuff here
        System.out.println("Checking out " + shoppingCart.getCustomer().getFullName());
        // send sms
        sendConfirmationSms(shoppingCart);
    }
}
