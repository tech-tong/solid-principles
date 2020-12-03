package com.techtong.solid.lsp.violation.model;

public class ContractEmployee extends Employee{

    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }

    @Override
    public double calculateBonus(float salary) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
