package com.techtong.solid.dip.refactored;

import com.techtong.solid.dip.refactored.models.Customer;
import com.techtong.solid.dip.refactored.models.ShoppingCart;
import com.techtong.solid.dip.refactored.services.NewCheckoutService;
import com.techtong.solid.dip.refactored.services.NewSmsService;
import com.techtong.solid.dip.refactored.services.sms.GpSmsProvider;
import com.techtong.solid.dip.refactored.services.sms.RobiSmsProvider;
import com.techtong.solid.dip.refactored.services.sms.SmsProvider;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sabbir Siddiqui", "01717111111");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

        SmsProvider smsProvider = new RobiSmsProvider();
//        SmsProvider smsProvider = new GpSmsProvider();
        NewSmsService smsService = new NewSmsService(smsProvider);
        NewCheckoutService checkoutService = new NewCheckoutService(smsService);

        checkoutService.checkout(shoppingCart);
    }
}
