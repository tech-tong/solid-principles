package com.techtong.solid.lsp.refactored;


import com.techtong.solid.lsp.refactored.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME) ;

    public static void main(String[] args){
        List<EmployeeBonusEligible> employees = List.of(
                new PermanentEmployee(1, "Sabbir"),
                new TemporaryEmployee(2, "Sazzad"));

        for( EmployeeBonusEligible employee : employees ){
            System.out.println(employee.toString() + " Employee Bonus : " + employee.calculateBonus(1000));
        }

        System.out.println("----------");
        List<IEmployee> employeesOnly = List.of(
                new PermanentEmployee(1, "Sabbir"),
                new TemporaryEmployee(2, "Sazzad"),
                new ContractEmployee(3, "Abcdef")
        );

        for( IEmployee employee : employeesOnly ){
            System.out.println(employee.toString() + " Employee is eligible for Insurance : " + employee.isEligibleForInsurance());
        }
    }
}
