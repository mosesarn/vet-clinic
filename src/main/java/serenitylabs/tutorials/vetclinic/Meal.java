package serenitylabs.tutorials.vetclinic;

import serenitylabs.tutorials.vetclinic.collections.katas.PetFood;

public class Meal {
    private final double amountInGrams;
    private final PetFood foodBrand;

    public Meal(double amountInGrams, PetFood foodBrand) {
        this.amountInGrams = amountInGrams;
        this.foodBrand = foodBrand;
    }

    public double getAmountInGrams() {
        return amountInGrams;
    }

    public PetFood getFoodBrand() {
        return foodBrand;
    }
}
