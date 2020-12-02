package com.techtong.solid.lsp.violation.model;

public class ContractEmployee extends Employee{

    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double getMinimumSalary() {
        return 200;
    }

    @Override
    public double calculateBonus(float salary) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
