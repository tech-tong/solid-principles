package com.techtong.solid.isp.refactored;


import com.techtong.solid.isp.refactored.account.RemittanceSavingsAccount;
import com.techtong.solid.isp.refactored.account.StudentAccount;

public class Main {

    public static void main(String[] args) {

        RemittanceSavingsAccount remittanceSavingsAccount = new RemittanceSavingsAccount(
                1,
                "Rahim",
                100,
                "Italy");

        remittanceSavingsAccount.creditLocalAmount(100);
        remittanceSavingsAccount.creditInternationalAmount(10);

        System.out.println(remittanceSavingsAccount.getBalance());


        StudentAccount studentAccount = new StudentAccount(
                1,
                "Karim",
                100,
                "BUET");

        studentAccount.creditLocalAmount(100);

        System.out.println(studentAccount.getBalance());

    }
}
