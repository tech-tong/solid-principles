package com.techtong.solid.lsp.violation.model;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean isEligibleForInsurance() {
        return true;
    }

    @Override
    public double calculateBonus(float salary) {
        return  salary * .1;
    }
}
