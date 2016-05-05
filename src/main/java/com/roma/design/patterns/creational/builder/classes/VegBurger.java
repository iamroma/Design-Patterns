package com.roma.design.patterns.creational.builder.classes;

/**
 * Created by Roma on 5/3/16.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
