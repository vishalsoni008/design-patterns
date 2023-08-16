package org.learn.decorated;

public class ExtraMayo extends Decorator{

    Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return "added extra myo";
    }

    @Override
    public double getRate() {
        return burger.getRate()+20;
    }
}
