package com.techtong.solid.dip.violation.services;

import com.techtong.solid.dip.violation.models.ShoppingCart;

public class CheckoutService {
    private final SmsService smsService;

    public CheckoutService() {
        this.smsService = new SmsService();
    }

    private void sendConfirmationSms(ShoppingCart shoppingCart) {
        final String message = "Thank you, " + shoppingCart.getCustomer().getFullName() + " for shopping at our store." +
                "\nYour order of total BDT " + shoppingCart.getTotalAmount() + " has been confirmed.";

        smsService.sendSms(message, shoppingCart.getCustomer().getPhoneNumber());
    }

    public void checkout(ShoppingCart shoppingCart) {
        // do some other stuff here
        System.out.println("Checking out " + shoppingCart.getCustomer().getFullName());
        // send sms
        sendConfirmationSms(shoppingCart);
    }
}
