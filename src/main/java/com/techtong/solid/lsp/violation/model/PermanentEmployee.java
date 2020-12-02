package com.techtong.solid.lsp.violation.model;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double getMinimumSalary() {
        return 1000;
    }

    @Override
    public double calculateBonus(float salary) {
        return  salary * .1;
    }
}
