package com.techtong.solid.dip.refactored.services.sms;

public class GpSmsProvider implements SmsProvider {
    @Override
    public void sendSms(String phoneNumber, String text) {
        System.out.println("Sending SMS via GP:");
        System.out.println("----> Receiver: " + phoneNumber);
        System.out.println("----> Text:\n" + text);
    }
}
