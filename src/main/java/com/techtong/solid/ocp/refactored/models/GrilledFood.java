package com.techtong.solid.ocp.refactored.models;

public class GrilledFood extends FoodItem {
    public GrilledFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("====> Grilling " + this.getName());
    }
}
