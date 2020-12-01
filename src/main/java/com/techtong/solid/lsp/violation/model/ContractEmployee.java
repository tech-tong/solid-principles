package com.techtong.solid.lsp.violation.model;

public class ContractEmployee extends Employee{

    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculate_bonus(float salary) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
