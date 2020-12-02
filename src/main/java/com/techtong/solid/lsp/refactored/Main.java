package com.techtong.solid.lsp.refactored;


import com.techtong.solid.lsp.refactored.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME) ;

    public static void main(String[] args){
        List<EmployeeBonusEligible> employees = new ArrayList<>();
        employees.add( new PermanentEmployee(1, "Sabbir"));
        employees.add( new TemporaryEmployee(2, "Sazzad"));

        for( EmployeeBonusEligible employee : employees ){
            try {
                System.out.println(employee.toString() + " Employee Bonus : " + employee.calculateBonus(1000));
            }catch (UnsupportedOperationException exception) {
             LOGGER.log(Level.SEVERE, " This employee is not eligible for bonus");
            }
        }

        System.out.println();
        List<IEmployee> employeesOnly = new ArrayList<>();

        employeesOnly.add( new PermanentEmployee(1, "Sabbir"));
        employeesOnly.add( new TemporaryEmployee(2, "Sazzad"));
        employeesOnly.add( new ContractEmployee(3, "Abcdef"));

        for( IEmployee employee : employeesOnly ){
            try {
                System.out.println(employee.toString() + " Employee is eligible for Insurance : " + employee.isEligibleForInsurance());
            }catch (UnsupportedOperationException exception) {
                LOGGER.log(Level.SEVERE, " This employee is not eligible for bonus");
            }
        }


    }
}
