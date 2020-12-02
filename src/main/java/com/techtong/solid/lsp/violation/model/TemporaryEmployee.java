package com.techtong.solid.lsp.violation.model;

public class TemporaryEmployee extends Employee{

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }

    @Override
    public double calculateBonus(float salary) {
        return  salary * .05;
    }
}
