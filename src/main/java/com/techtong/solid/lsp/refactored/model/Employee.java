package com.techtong.solid.lsp.refactored.model;

public abstract class Employee implements IEmployee {
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
    @Override
    public String toString() {
        return "Employee ID: " + this.getId() + " Employee Name : " + this.getName();
    }
}

