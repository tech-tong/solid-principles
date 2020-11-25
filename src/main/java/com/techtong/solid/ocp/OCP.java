package com.techtong.solid.ocp;

import com.techtong.solid.ocp.violation.models.FoodItem;
import com.techtong.solid.ocp.violation.models.FriedFood;
import com.techtong.solid.ocp.violation.models.GrilledFood;
import com.techtong.solid.ocp.violation.BadKitchenService;

import java.util.List;

public class OCP {
    public static void main(String[] args) {

        List<FoodItem> foodItems = List.of(
                new GrilledFood("steak"),
                new FriedFood("chicken")
        );

        BadKitchenService kitchenService = new BadKitchenService();

        System.out.println("Preparing Items:");
        kitchenService.prepareItems(foodItems);
    }
}
