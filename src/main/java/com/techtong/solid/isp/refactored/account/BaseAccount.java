package com.techtong.solid.isp.refactored.account;

public class BaseAccount {
    protected int accountId;
    protected String accountName;
    protected double balance;

    public BaseAccount(int accountId, String accountName, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
