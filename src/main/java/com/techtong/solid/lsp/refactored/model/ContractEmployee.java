package com.techtong.solid.lsp.refactored.model;

public class ContractEmployee implements IEmployee {
    private final int id;
    private final String name;

    public ContractEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMinimumSalary() {
        return 200;
    }

    @Override
    public String toString() {
        return "Employee ID: " + this.getId() + " Employee Name : " + this.getName();
    }
}
