package org.learn.decorated;

public class Drived {
    public static void main(String[] args) {
        Burger burger = new VegBurger();
        System.out.println(burger.getDescription()+" "+burger.getRate());

        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription()+" "+burger.getRate());

        burger =new ExtraMayo(burger);
        System.out.println(burger.getDescription()+" "+burger.getRate());
    }
}
