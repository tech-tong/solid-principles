package com.techtong.solid.ocp.refactored.models;

import com.techtong.solid.ocp.refactored.FoodPreparer;

public class BakedFood extends FoodItem implements FoodPreparer {
    public BakedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Baking " + this.getName()); // some grilling logic
    }
}
