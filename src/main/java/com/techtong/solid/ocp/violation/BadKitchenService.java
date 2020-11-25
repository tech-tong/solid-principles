package com.techtong.solid.ocp.violation;

import com.techtong.solid.ocp.violation.models.FoodItem;
import com.techtong.solid.ocp.violation.models.FriedFood;
import com.techtong.solid.ocp.violation.models.GrilledFood;

import java.util.List;

public class BadKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        for (final FoodItem foodItem : foodItems) {
            if (foodItem instanceof GrilledFood) {
                System.out.println("---> Grilling " + foodItem.getName());
            }

            if (foodItem instanceof FriedFood) {
                System.out.println("---> Frying " + foodItem.getName());
            }
        }
    }
}
