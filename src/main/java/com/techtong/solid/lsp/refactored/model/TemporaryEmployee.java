package com.techtong.solid.lsp.refactored.model;

public class TemporaryEmployee extends Employee implements EmployeeBonusEligible{

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return  salary * .05;
    }

    public boolean isEligibleForInsurance() {
        return false;
    }
}
