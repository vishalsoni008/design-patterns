package org.learn.decorated;

public class ExtraCheese extends Decorator{

    Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return "addeing extra chesse";
    }

    @Override
    public double getRate() {
        return burger.getRate()+30;
    }
}
