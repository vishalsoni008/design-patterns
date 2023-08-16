package org.learn.decorated;

public class VegBurger extends Burger{
    @Override
    public String getDescription() {
        return "this is a veg burger";
    }

    @Override
    public double getRate() {
        return 130;
    }
}
