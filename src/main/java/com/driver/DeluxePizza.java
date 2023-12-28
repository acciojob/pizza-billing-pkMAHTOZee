package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese();  // Deluxe Pizza comes with extra cheese by default
        addExtraToppings();  // Deluxe Pizza comes with extra toppings by default
    }
}
