package com.techtong.solid.isp.violation;

import com.techtong.solid.isp.violation.account.RemittanceSavingsAccount;
import com.techtong.solid.isp.violation.account.StudentAccount;

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
        studentAccount.creditInternationalAmount(10);

        System.out.println(studentAccount.getBalance());

    }
}
