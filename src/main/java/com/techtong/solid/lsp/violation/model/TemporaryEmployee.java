package com.techtong.solid.lsp.violation.model;

public class TemporaryEmployee extends Employee{

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculate_bonus(float salary) {
        return  salary * .05;
    }
}
