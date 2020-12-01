package com.techtong.solid.lsp.refactored.model;

public abstract class Employee implements IEmployee, EmployeeBonus {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

