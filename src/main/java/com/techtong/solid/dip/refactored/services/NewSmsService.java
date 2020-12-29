package com.techtong.solid.dip.refactored.services;

import com.techtong.solid.dip.refactored.services.sms.SmsProvider;

public class NewSmsService {
    private SmsProvider smsProvider;

    public NewSmsService(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    void sendSms(String text, String phoneNumber) {
        smsProvider.sendSms(phoneNumber, text);
    }
}
