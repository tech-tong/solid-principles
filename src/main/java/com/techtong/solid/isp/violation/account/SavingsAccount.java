package com.techtong.solid.isp.violation.account;

public interface SavingsAccount {
    public double getBalance();

    public void creditLocalAmount(double amountInBDT);

    public void creditInternationalAmount(double amountInUSD);
}
