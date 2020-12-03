package com.techtong.solid.lsp.violation;

import com.techtong.solid.lsp.violation.model.ContractEmployee;
import com.techtong.solid.lsp.violation.model.Employee;
import com.techtong.solid.lsp.violation.model.PermanentEmployee;
import com.techtong.solid.lsp.violation.model.TemporaryEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME) ;

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add( new PermanentEmployee(1, "Sabbir"));
        employees.add( new TemporaryEmployee(2, "Sazzad"));
        employees.add( new ContractEmployee(3, "Abc"));

        for( Employee employee : employees ) {

            System.out.println("Employee ID: " + employee.getId() + " Employee Name : " + employee.getName() + " - Employee is eligible for Insurance : "  + employee.isEligibleForInsurance());
        }

        System.out.println("--------------------");

        for( Employee employee : employees ){
            try {
                System.out.println("Employee ID: " + employee.getId() + " Employee Name : " + employee.getName() + " Employee Bonus : " + employee.calculateBonus(1000));
            }catch (UnsupportedOperationException exception) {
                LOGGER.log(Level.SEVERE, " This employee is not eligible for bonus");
            }
        }
    }
}
