package com.techtong.solid.lsp.refactored.model;


public class PermanentEmployee extends Employee implements EmployeeBonusEligible {

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return  salary * .1;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return true;
    }
}
