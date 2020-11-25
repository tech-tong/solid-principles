package com.techtong.solid.ocp.refactored.models;

import com.techtong.solid.ocp.refactored.FoodPreparer;

public abstract class FoodItem implements FoodPreparer {
    private String name;

    public FoodItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
