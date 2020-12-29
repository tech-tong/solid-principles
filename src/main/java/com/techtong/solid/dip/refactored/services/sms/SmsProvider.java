package com.techtong.solid.dip.refactored.services.sms;

public interface SmsProvider {
    void sendSms(String phoneNumber, String text);
}
