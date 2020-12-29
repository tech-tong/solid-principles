package com.techtong.solid.dip.violation.services;

public class SmsService {
    void sendSms(String text, String phoneNumber) {
        System.out.println("Sending SMS via GP:");
        System.out.println("----> Receiver: " + phoneNumber);
        System.out.println("----> Text:\n" + text);
    }
}
