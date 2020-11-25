package com.techtong.solid.ocp.violation;

import com.techtong.solid.ocp.violation.models.FoodItem;
import com.techtong.solid.ocp.violation.models.FriedFood;
import com.techtong.solid.ocp.violation.models.GrilledFood;

import java.util.List;

public class BadKitchenService implements KitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        for (final FoodItem foodItem : foodItems) {
            if (foodItem instanceof GrilledFood) {
                System.out.println("grilling " + foodItem.getName());
            }

            if (foodItem instanceof FriedFood) {
                System.out.println("frying " + foodItem.getName());
            }
        }
    }
}
