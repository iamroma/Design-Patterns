package com.roma.design.patterns.creational.builder.classes;

/**
 * Created by Roma on 5/3/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
