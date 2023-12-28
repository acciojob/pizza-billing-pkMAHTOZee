package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;

        // Set base price based on whether it's veg or non-veg
        this.price = isVeg ? 300 : 400;

        // Initialize the bill
        this.bill = "";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            this.price += (isVeg ? 70 : 120);
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            takeawayAdded = true;
            this.price += 20;
            this.bill += "Takeaway Added: 20\n";
        }
    }

    public String getBill() {
        this.bill += "Base Price Of The Pizza: " + getPrice() + "\n";
        this.bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}

