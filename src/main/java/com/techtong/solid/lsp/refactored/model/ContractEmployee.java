package com.techtong.solid.lsp.refactored.model;

public class ContractEmployee extends Employee {

    public ContractEmployee(int id, String name) {
        super(id,name);
    }

    public boolean isEligibleForInsurance() {
        return false;
    }
}
