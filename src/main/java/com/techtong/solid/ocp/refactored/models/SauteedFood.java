package com.techtong.solid.ocp.refactored.models;

import com.techtong.solid.ocp.refactored.FoodPreparer;
import com.techtong.solid.ocp.violation.models.FoodItem;

public class SauteedFood extends FoodItem implements FoodPreparer {
    public SauteedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Sauteeing " + this.getName()); // some grilling logic
    }
}