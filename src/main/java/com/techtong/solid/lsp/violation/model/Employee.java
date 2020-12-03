package com.techtong.solid.lsp.violation.model;

public abstract class Employee {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public abstract double calculateBonus(float salary);
    public abstract boolean isEligibleForInsurance();
}

