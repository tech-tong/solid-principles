package com.techtong.solid.lsp.violation.model;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculate_bonus(float salary) {
        return  salary * .1;
    }
}
