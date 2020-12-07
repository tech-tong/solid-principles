package com.techtong.solid.isp.refactored.account;

public class StudentAccount extends BaseAccount implements SavingsAccount {
    private String institutionName;

    public StudentAccount(int accountId,
                          String accountName,
                          double balance,
                          String institutionName) {
        super(accountId, accountName, balance);
        this.institutionName = institutionName;
    }

    @Override
    public void creditLocalAmount(double amountInBDT) {
        this.balance += amountInBDT;
    }

}
