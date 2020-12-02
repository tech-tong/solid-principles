package com.techtong.solid.lsp.violation.model;

public class TemporaryEmployee extends Employee{

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double getMinimumSalary() {
        return 500;
    }

    @Override
    public double calculateBonus(float salary) {
        return  salary * .05;
    }
}
