package com.techtong.solid.ocp.refactored;

import com.techtong.solid.ocp.refactored.models.FoodItem;

import java.util.List;

public class DecentKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        foodItems.forEach(FoodPreparer::prepare);
    }
}
