package com.techtong.solid.ocp.refactored.models;

public class FriedFood extends FoodItem {
    public FriedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("====> Frying " + this.getName());
    }
}
