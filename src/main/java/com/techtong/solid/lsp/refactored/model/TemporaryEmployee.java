package com.techtong.solid.lsp.refactored.model;

import com.techtong.solid.lsp.refactored.model.Employee;

public class TemporaryEmployee extends Employee {

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return  salary * .05;
    }

    @Override
    public double getMinimumSalary() {
        return 500;
    }
}
